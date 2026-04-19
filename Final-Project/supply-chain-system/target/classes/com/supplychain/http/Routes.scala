package com.supplychain.http

import akka.actor.typed.{ActorRef, ActorSystem}
import akka.actor.typed.scaladsl.AskPattern._
import akka.http.scaladsl.model.headers.{`Access-Control-Allow-Headers`, `Access-Control-Allow-Methods`, `Access-Control-Allow-Origin`}
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.{Directive0, Route}
import akka.stream.scaladsl.Source
import akka.util.{ByteString, Timeout}
import com.supplychain.config.AppConfig
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._
import com.supplychain.persistence.PersistenceRepository
import spray.json._
import DefaultJsonProtocol._

import java.time.Instant
import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

// ============================================================
// JSON serialisation for HTTP responses (spray-json)
// ============================================================

object HttpJsonProtocol extends DefaultJsonProtocol {

  implicit object InstantFormat extends JsonFormat[Instant] {
    def write(i: Instant): JsValue = JsString(i.toString)
    def read(v: JsValue): Instant  = Instant.parse(v.convertTo[String])
  }

  implicit val entityImpactFmt: RootJsonFormat[EntityImpact] = jsonFormat3(EntityImpact)

  implicit val impactSummaryFmt: RootJsonFormat[ImpactSummaryData] = new RootJsonFormat[ImpactSummaryData] {
    def write(s: ImpactSummaryData): JsValue = JsObject(
      "caseId"           -> JsString(s.caseId),
      "affectedEntities" -> s.affectedEntities.toJson,
      "overallSeverity"  -> JsString(s.overallSeverity.toString),
      "isPartial"        -> JsBoolean(s.isPartial)
    )
    def read(v: JsValue): ImpactSummaryData = deserializationError("ImpactSummaryData read not supported")
  }

  implicit val mitigationActionFmt: RootJsonFormat[MitigationAction] = new RootJsonFormat[MitigationAction] {
    def write(a: MitigationAction): JsValue = JsObject(
      "actionType"   -> JsString(a.actionType.label),
      "targetEntity" -> JsString(a.targetEntity),
      "priority"     -> JsNumber(a.priority),
      "description"  -> JsString(a.description)
    )
    def read(v: JsValue): MitigationAction = deserializationError("MitigationAction read not supported")
  }

  implicit val disruptionEventFmt: RootJsonFormat[DisruptionEvent] = new RootJsonFormat[DisruptionEvent] {
    def write(e: DisruptionEvent): JsValue = JsObject(
      "eventType"     -> JsString(e.eventType.label),
      "entityId"      -> JsString(e.entityId),
      "severity"      -> JsString(e.severity.toString),
      "durationHours" -> JsNumber(e.durationHours),
      "confidence"    -> JsNumber(e.confidence),
      "reasoning"     -> JsString(e.reasoning)
    )
    def read(v: JsValue): DisruptionEvent = deserializationError("DisruptionEvent read not supported")
  }

  implicit val auditEntryFmt: RootJsonFormat[AuditEntry] = new RootJsonFormat[AuditEntry] {
    def write(e: AuditEntry): JsValue = JsObject(
      "stage"     -> JsString(e.stage),
      "timestamp" -> JsString(e.timestamp.toString),
      "detail"    -> JsString(e.detail)
    )
    def read(v: JsValue): AuditEntry = deserializationError("AuditEntry read not supported")
  }

  implicit val disruptionReportFmt: RootJsonFormat[DisruptionReport] = new RootJsonFormat[DisruptionReport] {
    def write(r: DisruptionReport): JsValue = JsObject(
      "caseId"         -> JsString(r.caseId),
      "rawInput"       -> JsString(r.rawInput),
      "extractedEvent" -> r.extractedEvent.map(_.toJson).getOrElse(JsNull),
      "impactSummary"  -> r.impactSummary.toJson,
      "mitigations"    -> r.mitigations.toJson,
      "auditTrail"     -> r.auditTrail.toJson,
      "createdAt"      -> r.createdAt.toJson,
      "completedAt"    -> r.completedAt.toJson
    )
    def read(v: JsValue): DisruptionReport = deserializationError("DisruptionReport read not supported")
  }
}

// ============================================================
// HTTP Routes — thin boundary layer
// ============================================================

class Routes(
  simulationManager: ActorRef[ManagerCommand],
  repository:        PersistenceRepository,
  config:            AppConfig,
  streamRegistry:    DisruptionStreamRegistry
)(implicit system: ActorSystem[_], ec: ExecutionContext) {

  import HttpJsonProtocol._

  implicit val timeout: Timeout = Timeout(config.http.askTimeoutSeconds.seconds)

  // text/event-stream is WithFixedCharset — charset is already UTF-8, no .withCharset needed
  private val sseContentType: ContentType = MediaTypes.`text/event-stream`

  private def cors: Directive0 = respondWithHeaders(
    `Access-Control-Allow-Origin`.*,
    `Access-Control-Allow-Methods`(GET, POST, OPTIONS, DELETE),
    `Access-Control-Allow-Headers`("*")
  )

  val routes: Route = cors {
    concat(

      // ── Health ─────────────────────────────────────────────────────────────
      path("health") {
        get {
          complete(StatusCodes.OK, JsObject(
            "status"  -> JsString("UP"),
            "service" -> JsString("supply-chain-disruption-system"),
            "mode"    -> JsString(config.llm.mode)
          ).prettyPrint)
        }
      },

      // ── SSE stream: GET /disruption/stream ─────────────────────────────────
      // AKKA STREAMS: subscribes to the BroadcastHub; each connected client
      // receives its own independent sub-stream of completed DisruptionReports.
      // The keepAlive heartbeat prevents proxy/browser timeouts on idle streams.
      path("disruption" / "stream") {
        get {
          val sseSource: Source[ByteString, _] =
            streamRegistry.source
              .map { report =>
                ByteString(s"data: ${report.toJson.compactPrint}\n\n")
              }
              .keepAlive(15.seconds, () => ByteString(": heartbeat\n\n"))
          complete(HttpResponse(entity = HttpEntity(sseContentType, sseSource)))
        }
      },

      // ── Submit or list disruption reports ─────────────────────────────────
      path("disruption") {
        concat(
          get {
            onComplete(repository.listReports()) {
              case Success(reports) =>
                complete(StatusCodes.OK, reports.toJson.prettyPrint)
              case Failure(ex) =>
                complete(StatusCodes.InternalServerError,
                  JsObject("error" -> JsString(ex.getMessage)).prettyPrint)
            }
          },
          post {
            entity(as[String]) { body =>
              val reportText = try {
                body.parseJson.asJsObject.fields("reportText").convertTo[String]
              } catch {
                case _: Exception => body.trim
              }

              if (reportText.trim.length < 10) {
                complete(StatusCodes.BadRequest, JsObject(
                  "error" -> JsString("reportText must be at least 10 characters")
                ).prettyPrint)
              } else {
                val result: Future[DisruptionResult] =
                  simulationManager.ask(replyTo => SubmitDisruption(reportText, replyTo))

                onComplete(result) {
                  case Success(report: DisruptionReport) =>
                    complete(StatusCodes.OK, report.toJson.prettyPrint)

                  case Success(DisruptionFailed(caseId, reason, _)) =>
                    complete(StatusCodes.UnprocessableEntity, JsObject(
                      "error"  -> JsString(reason),
                      "caseId" -> JsString(caseId)
                    ).prettyPrint)

                  case Failure(ex) =>
                    system.log.error(s"AskPattern timeout or failure: ${ex.getMessage}")
                    complete(StatusCodes.ServiceUnavailable, JsObject(
                      "error"  -> JsString("Disruption processing timed out or failed"),
                      "detail" -> JsString(ex.getMessage)
                    ).prettyPrint)
                }
              }
            }
          }
        )
      },

      // ── Case status ────────────────────────────────────────────────────────
      pathPrefix("disruption") {
        path(Segment) { caseId =>
          get {
            onComplete(repository.getStatus(caseId)) {
              case Success(Some(status)) =>
                complete(StatusCodes.OK, JsObject(
                  "caseId" -> JsString(caseId),
                  "status" -> JsString(status)
                ).prettyPrint)

              case Success(None) =>
                complete(StatusCodes.NotFound, JsObject(
                  "error"  -> JsString(s"Case $caseId not found"),
                  "caseId" -> JsString(caseId)
                ).prettyPrint)

              case Failure(ex) =>
                complete(StatusCodes.InternalServerError,
                  JsObject("error" -> JsString(ex.getMessage)).prettyPrint)
            }
          }
        }
      },

      // ── Cluster status ─────────────────────────────────────────────────────
      path("cluster" / "status") {
        get {
          val cluster = akka.cluster.Cluster(system.classicSystem)
          val members = cluster.state.members.toList
          complete(StatusCodes.OK, JsObject(
            "selfAddress" -> JsString(cluster.selfAddress.toString),
            "nodeCount"   -> JsNumber(members.size),
            "members"     -> JsArray(members.map { m =>
              JsObject(
                "address" -> JsString(m.address.toString),
                "status"  -> JsString(m.status.toString),
                "roles"   -> JsArray(m.roles.map(JsString(_)).toVector)
              )
            }.toVector),
            "leader" -> (cluster.state.leader match {
              case Some(l) => JsString(l.toString)
              case None    => JsString("none")
            })
          ).prettyPrint)
        }
      },

      // ── API index ──────────────────────────────────────────────────────────
      path("") {
        get {
          complete(StatusCodes.OK, JsObject(
            "service"   -> JsString("LLM-Enhanced Supply Chain Disruption Management System"),
            "version"   -> JsString("2.0.0"),
            "endpoints" -> JsArray(
              JsObject("method" -> JsString("GET"),  "path" -> JsString("/health"),               "desc" -> JsString("Health check")),
              JsObject("method" -> JsString("POST"), "path" -> JsString("/disruption"),           "desc" -> JsString("Submit disruption report")),
              JsObject("method" -> JsString("GET"),  "path" -> JsString("/disruption/{id}"),      "desc" -> JsString("Get case status")),
              JsObject("method" -> JsString("GET"),  "path" -> JsString("/disruption/stream"),    "desc" -> JsString("SSE stream of completed cases (Akka Streams BroadcastHub)")),
              JsObject("method" -> JsString("GET"),  "path" -> JsString("/cluster/status"),       "desc" -> JsString("Akka cluster membership + roles"))
            )
          ).prettyPrint)
        }
      }
    )
  }
}
