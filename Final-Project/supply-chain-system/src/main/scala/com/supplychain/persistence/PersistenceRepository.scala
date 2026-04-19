package com.supplychain.persistence

import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._
import org.slf4j.LoggerFactory
import spray.json._
import DefaultJsonProtocol._

import java.sql.{Connection, DriverManager, Timestamp}
import java.time.Instant
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success, Using}

/**
 * Non-blocking repository for read-side projection writes.
 *
 * RULE: ALL calls to this repository from actor code MUST be wrapped in
 *       context.pipeToSelf — never called directly on the actor thread.
 *
 * The Akka Persistence journal is the source-of-truth event store.
 * This repository writes to the disruption_reports table for queryable
 * read-side projections and quick operational lookups.
 *
 * Uses a simple JDBC + dedicated thread pool (not Slick) to avoid
 * adding Slick as a mandatory runtime dependency for tests.
 */
class PersistenceRepository(
  jdbcUrl:  String,
  user:     String,
  password: String
)(implicit ec: ExecutionContext) {

  private val log = LoggerFactory.getLogger(getClass)

  // Dedicated thread pool for all blocking JDBC calls
  private val jdbcEc: ExecutionContext = ExecutionContext.fromExecutorService(
    java.util.concurrent.Executors.newFixedThreadPool(4, (r: Runnable) => {
      val t = new Thread(r, "jdbc-pool")
      t.setDaemon(true)
      t
    })
  )

  /** Pull a JDBC connection. Not pooled for simplicity — use HikariCP in production. */
  private def connection(): Connection =
    DriverManager.getConnection(jdbcUrl, user, password)

  // ─────────────────────────────────────────────────────────────────────────
  // Write operations
  // ─────────────────────────────────────────────────────────────────────────

  /**
   * Initialises a report row with PENDING status when a case starts.
   * Returns Future[Unit] — caller pipes this back as a typed message.
   */
  def createReport(caseId: CaseId, rawInput: String): Future[Unit] =
    Future {
      log.debug(s"[DB] createReport caseId=$caseId")
      Using(connection()) { conn =>
        val stmt = conn.prepareStatement(
          "INSERT INTO disruption_reports (case_id, raw_input, status, created_at) VALUES (?, ?, 'PENDING', ?)"
        )
        stmt.setString(1, caseId)
        stmt.setString(2, rawInput)
        stmt.setTimestamp(3, Timestamp.from(Instant.now()))
        stmt.executeUpdate()
        ()
      }.get
    }(jdbcEc)

  /**
   * Saves the fully assembled DisruptionReport to the read-side projection table.
   * Called by ReportActor via pipeToSelf.
   */
  def saveReport(report: DisruptionReport): Future[Unit] =
    Future {
      log.info(s"[DB] saveReport caseId=${report.caseId}")

      val impactJson      = serializeImpact(report.impactSummary)
      val mitigationsJson = serializeMitigations(report.mitigations)
      val eventOpt        = report.extractedEvent

      Using(connection()) { conn =>
        val stmt = conn.prepareStatement(
          """UPDATE disruption_reports SET
            |  event_type     = ?,
            |  entity_id      = ?,
            |  severity       = ?,
            |  duration_hours = ?,
            |  confidence     = ?,
            |  impact_summary = ?::jsonb,
            |  mitigations    = ?::jsonb,
            |  status         = 'COMPLETED',
            |  completed_at   = ?
            |WHERE case_id = ?""".stripMargin
        )
        stmt.setString(1, eventOpt.map(_.eventType.label).orNull)
        stmt.setString(2, eventOpt.map(_.entityId).orNull)
        stmt.setString(3, eventOpt.map(e => severityLabel(e.severity)).orNull)
        stmt.setObject(4, eventOpt.map(_.durationHours.asInstanceOf[java.lang.Integer]).orNull)
        stmt.setObject(5, eventOpt.map(_.confidence.asInstanceOf[java.lang.Double]).orNull)
        stmt.setString(6, impactJson)
        stmt.setString(7, mitigationsJson)
        stmt.setTimestamp(8, Timestamp.from(report.completedAt))
        stmt.setString(9, report.caseId)
        stmt.executeUpdate()
        ()
      }.get
    }(jdbcEc)

  /**
   * Marks a report as FAILED when DisruptionCaseActor encounters an unrecoverable error.
   */
  def markFailed(caseId: CaseId, reason: String): Future[Unit] =
    Future {
      log.warn(s"[DB] markFailed caseId=$caseId reason=$reason")
      Using(connection()) { conn =>
        val stmt = conn.prepareStatement(
          "UPDATE disruption_reports SET status='FAILED', completed_at=? WHERE case_id=?"
        )
        stmt.setTimestamp(1, Timestamp.from(Instant.now()))
        stmt.setString(2, caseId)
        stmt.executeUpdate()
        ()
      }.get
    }(jdbcEc)

  // ─────────────────────────────────────────────────────────────────────────
  // Read operations
  // ─────────────────────────────────────────────────────────────────────────

  /** Fetches the latest reports for the frontend dashboard. */
  def listReports(limit: Int = 20): Future[List[DisruptionReport]] =
    Future {
      Using(connection()) { conn =>
        val stmt = conn.prepareStatement(
          "SELECT * FROM disruption_reports WHERE status = 'COMPLETED' ORDER BY created_at DESC LIMIT ?"
        )
        stmt.setInt(1, limit)
        val rs = stmt.executeQuery()
        var results = List.empty[DisruptionReport]
        while (rs.next()) {
          results = results :+ mapRowToReport(rs)
        }
        results
      }.get
    }(jdbcEc)

  /** Fetches case status for the GET /disruption/{caseId} endpoint. */
  def getStatus(caseId: CaseId): Future[Option[String]] =
    Future {
      Using(connection()) { conn =>
        val stmt = conn.prepareStatement(
          "SELECT status FROM disruption_reports WHERE case_id = ?"
        )
        stmt.setString(1, caseId)
        val rs = stmt.executeQuery()
        if (rs.next()) Some(rs.getString("status")) else None
      }.get
    }(jdbcEc)

  private def mapRowToReport(rs: java.sql.ResultSet): DisruptionReport = {
    val caseId = rs.getString("case_id")
    val rawInput = rs.getString("raw_input")
    val eventTypeStr = rs.getString("event_type")
    val entityId = rs.getString("entity_id")
    val severityStr = rs.getString("severity")
    val duration = rs.getInt("duration_hours")
    val confidence = rs.getDouble("confidence")
    val impactJson = rs.getString("impact_summary")
    val mitigationsJson = rs.getString("mitigations")
    val createdAt = rs.getTimestamp("created_at").toInstant
    val completedAt = rs.getTimestamp("completed_at").toInstant

    val event = if (eventTypeStr != null) Some(DisruptionEvent(
      EventType.fromLabel(eventTypeStr),
      entityId,
      Severity.fromString(severityStr),
      duration,
      confidence
    )) else None

    val impact = parseImpact(impactJson, caseId)
    val mitigations = parseMitigations(mitigationsJson)

    DisruptionReport(caseId, rawInput, event, impact, mitigations, Nil, createdAt, completedAt)
  }

  private def parseImpact(json: String, caseId: String): ImpactSummaryData = {
    if (json == null) ImpactSummaryData.empty(caseId)
    else {
      val obj = json.parseJson.asJsObject
      val entities = obj.fields("entities").asInstanceOf[JsArray].elements.map { e =>
        val eObj = e.asJsObject
        EntityImpact(
          eObj.fields("entityId").convertTo[String],
          eObj.fields("entityType").convertTo[String],
          eObj.fields("impact").convertTo[String]
        )
      }.toList
      ImpactSummaryData(
        caseId,
        entities,
        Severity.fromString(obj.fields("severity").convertTo[String]),
        obj.fields("partial").convertTo[Boolean]
      )
    }
  }

  private def parseMitigations(json: String): List[MitigationAction] = {
    if (json == null) Nil
    else {
      json.parseJson.asInstanceOf[JsArray].elements.map { e =>
        val obj = e.asJsObject
        MitigationAction(
          MitigationActionType.fromLabel(obj.fields("actionType").convertTo[String]),
          obj.fields("targetEntity").convertTo[String],
          obj.fields("priority").convertTo[Int],
          obj.fields("description").convertTo[String]
        )
      }.toList
    }
  }

  // ─────────────────────────────────────────────────────────────────────────
  // JSON serialisation helpers (spray-json)
  // ─────────────────────────────────────────────────────────────────────────

  private def severityLabel(s: Severity): String = s match {
    case Severity.LOW      => "LOW"
    case Severity.MEDIUM   => "MEDIUM"
    case Severity.HIGH     => "HIGH"
    case Severity.CRITICAL => "CRITICAL"
  }

  private def serializeImpact(impact: ImpactSummaryData): String = {
    val entities = impact.affectedEntities.map { e =>
      JsObject(
        "entityId"    -> JsString(e.entityId),
        "entityType"  -> JsString(e.entityType),
        "impact"      -> JsString(e.impactDescription)
      )
    }
    JsObject(
      "severity"  -> JsString(severityLabel(impact.overallSeverity)),
      "partial"   -> JsBoolean(impact.isPartial),
      "entities"  -> JsArray(entities.toVector)
    ).compactPrint
  }

  private def serializeMitigations(actions: List[MitigationAction]): String = {
    val items = actions.map { a =>
      JsObject(
        "actionType"   -> JsString(a.actionType.label),
        "targetEntity" -> JsString(a.targetEntity),
        "priority"     -> JsNumber(a.priority),
        "description"  -> JsString(a.description)
      )
    }
    JsArray(items.toVector).compactPrint
  }
}

// ============================================================
// No-op repository for unit tests
// ============================================================

/** Stub that does nothing — used in unit and BehaviorTestKit tests. */
class NoOpPersistenceRepository(implicit ec: ExecutionContext) extends PersistenceRepository(
  jdbcUrl  = "jdbc:postgresql://localhost/test",
  user     = "test",
  password = "test"
) {
  override def createReport(caseId: CaseId, rawInput: String): Future[Unit] = Future.successful(())
  override def saveReport(report: DisruptionReport): Future[Unit]            = Future.successful(())
  override def markFailed(caseId: CaseId, reason: String): Future[Unit]     = Future.successful(())
  override def getStatus(caseId: CaseId): Future[Option[String]]            = Future.successful(Some("COMPLETED"))
}
