package com.supplychain.actors.workflow

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.AskPattern._
import akka.actor.typed.{ActorRef, Behavior, SupervisorStrategy}
import akka.persistence.typed.PersistenceId
import akka.persistence.typed.scaladsl.{Effect, EventSourcedBehavior, RetentionCriteria}
import akka.util.Timeout
import com.supplychain.actors.DomainShardedRefs
import com.supplychain.config.AppConfig
import com.supplychain.domain.model._
import com.supplychain.domain.model.Ids._
import com.supplychain.http.DisruptionStreamRegistry
import com.supplychain.llm.{JsonValidator, LlmClient}
import com.supplychain.persistence.PersistenceRepository

import java.time.Instant
import scala.concurrent.duration._
import scala.util.{Failure, Success}

/**
 * DISRUPTION CASE ACTOR (Orchestration Engine)
 * ============================================================================
 * DESIGN PATTERN: State Machine + Event Sourcing
 *
 * ── Event Tagging (CQRS Read Side) ────────────────────────────────────────
 * withTagger annotates journal events with topic tags.
 * Any actor or stream with access to the read journal can subscribe to
 * eventsByTag("disruption-completed") to receive a live feed of all finished
 * cases — without coupling to the write-side actor.
 * This is the Akka CQRS pattern: write-side persists events; read-side queries
 * the journal independently via PersistenceQuery.
 *
 * ── ReportActor delegation ────────────────────────────────────────────────
 * Final report assembly is delegated to a dedicated ReportActor (single
 * responsibility). The result arrives back as ReportResultReceived via
 * pipeToSelf — keeping the EventSourcedBehavior free of nested Future chains.
 *
 * ── SSE Push ──────────────────────────────────────────────────────────────
 * Completed reports are published to DisruptionStreamRegistry, which feeds
 * the BroadcastHub behind GET /disruption/stream (SSE).
 * ============================================================================
 */
object DisruptionCaseActor {

  sealed trait CasePhase
  object CasePhase {
    case object Initial              extends CasePhase
    case object WaitingForLlm        extends CasePhase
    case object WaitingForImpact     extends CasePhase
    case object WaitingForMitigation extends CasePhase
    case object WaitingForReport     extends CasePhase
    case object WaitingForDb         extends CasePhase
    case object Completed            extends CasePhase
  }

  case class CaseState(
    caseId:         CaseId                    = "",
    rawText:        String                    = "",
    phase:          CasePhase                 = CasePhase.Initial,
    extractedEvent: Option[DisruptionEvent]   = None,
    impactSummary:  Option[ImpactSummaryData] = None,
    mitigations:    List[MitigationAction]    = List.empty,
    auditTrail:     List[AuditEntry]          = List.empty
  )

  def apply(
    config:         AppConfig,
    llmClient:      LlmClient,
    repository:     PersistenceRepository,
    domainRefs:     DomainShardedRefs,
    graph:          com.supplychain.graph.SupplyChainGraph,
    streamRegistry: DisruptionStreamRegistry
  ): Behavior[CaseCommand] =
    Behaviors.setup { ctx =>

      var replyTo: Option[ActorRef[DisruptionResult]] = None

      EventSourcedBehavior[CaseCommand, CaseEvent, CaseState](
        persistenceId  = PersistenceId.ofUniqueId(s"case-${ctx.self.path.name}"),
        emptyState     = CaseState(),
        commandHandler = commandHandler(ctx, config, llmClient, repository, domainRefs, graph,
                                        streamRegistry, () => replyTo, r => { replyTo = Some(r) }),
        eventHandler   = eventHandler
      )
      .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 5, keepNSnapshots = 2))
      .onPersistFailure(SupervisorStrategy.restartWithBackoff(1.second, 30.seconds, 0.1))
      // ── CQRS: tag events so the read-journal can subscribe ──────────────
      // JournalReadActor and the SSE projection subscribe to these tags via
      // PersistenceQuery(system).readJournalFor[JdbcReadJournal].eventsByTag(...)
      .withTagger {
        case _: CaseCompleted => Set("disruption-all", "disruption-completed")
        case _                => Set("disruption-all")
      }
    }

  // ── Command Handler ───────────────────────────────────────────────────────

  private def commandHandler(
    ctx:            akka.actor.typed.scaladsl.ActorContext[CaseCommand],
    config:         AppConfig,
    llmClient:      LlmClient,
    repository:     PersistenceRepository,
    domainRefs:     DomainShardedRefs,
    graph:          com.supplychain.graph.SupplyChainGraph,
    streamRegistry: DisruptionStreamRegistry,
    getReplyTo:     () => Option[ActorRef[DisruptionResult]],
    setReplyTo:     ActorRef[DisruptionResult] => Unit
  ): (CaseState, CaseCommand) => Effect[CaseEvent, CaseState] = {

    (state, cmd) => cmd match {

      // ── Step 1: StartCase ─────────────────────────────────────────────────
      case StartCase(caseId, reportText, replyTo) =>
        ctx.log.info(s"[Case $caseId] StartCase")
        setReplyTo(replyTo)

        Effect
          .persist(DisruptionReceived(caseId, reportText, Instant.now()))
          .thenRun { _ =>
            implicit val ec = ctx.executionContext

            ctx.pipeToSelf(repository.createReport(caseId, reportText)) {
              case _ => CaseTimeout
            }

            val interpreterRef = ctx.spawnAnonymous(LLMInterpreterActor(llmClient))
            val llmTimeout     = Timeout(config.llm.timeoutSeconds.seconds)
            ctx.pipeToSelf(
              interpreterRef.ask[LlmActorResult](
                replyTo => InterpretText(caseId, reportText, replyTo)
              )(llmTimeout, ctx.system.scheduler)
            ) {
              case Success(LlmSuccess(event))  => LlmResultReceived(Right(event))
              case Success(LlmFailure(reason)) => LlmResultReceived(Left(reason))
              case Failure(ex)                 => LlmResultReceived(Left(s"LLM interpreter failed: ${ex.getMessage}"))
            }
          }

      // ── Step 2: LLM extraction result ─────────────────────────────────────
      case LlmResultReceived(Right(event)) =>
        ctx.log.info(s"[Case ${state.caseId}] LLM OK: ${event.eventType.label} on ${event.entityId} " +
          s"(severity=${event.severity}, confidence=${event.confidence})")

        Effect
          .persist(LlmEventExtracted(state.caseId, event.eventType.label, event.entityId,
            event.severity.toString, event.durationHours, event.confidence, event.reasoning))
          .thenRun { _ =>
            triggerImpactAnalysis(ctx, config, event, state.caseId, domainRefs, graph)
          }

      case LlmResultReceived(Left(reason)) =>
        ctx.log.error(s"[Case ${state.caseId}] LLM FAILED: $reason")
        Effect
          .none[CaseEvent, CaseState]
          .thenRun { _ =>
            getReplyTo().foreach(_ ! DisruptionFailed(state.caseId, s"LLM extraction failed: $reason"))
          }
          .thenStop()

      // ── Step 3: Impact aggregation complete ───────────────────────────────
      case ImpactSummaryReceived(summary) =>
        ctx.log.info(s"[Case ${state.caseId}] Impact received: ${summary.affectedEntities.size} entities")

        val impactEvents = summary.affectedEntities.map { ei =>
          EntityImpactRecorded(state.caseId, ei.entityId, ei.entityType, ei.impactDescription)
        }
        val eventsToStore = if (impactEvents.isEmpty)
          List(EntityImpactRecorded(state.caseId, "NONE", "NONE", "No entities directly impacted"))
        else impactEvents

        Effect
          .persist(eventsToStore)
          .thenRun { _ =>
            implicit val ec = ctx.executionContext
            val mitigRef   = ctx.spawnAnonymous(MitigationPlannerActor(llmClient))
            val llmTimeout = Timeout(config.llm.timeoutSeconds.seconds)
            ctx.pipeToSelf(
              mitigRef.ask[MitigationPlanResult](
                replyTo => PlanMitigation(state.caseId, summary, replyTo)
              )(llmTimeout, ctx.system.scheduler)
            ) {
              case Success(MitigationSuccess(actions))  => MitigationResultReceived(actions)
              case Success(MitigationFailure(reason))   =>
                MitigationResultReceived(List(MitigationAction(
                  MitigationActionType.MANUAL_REVIEW, "ALL", 1,
                  s"Mitigation planning failed ($reason) — escalating to manual review"
                )))
              case Failure(_) =>
                MitigationResultReceived(List(MitigationAction(
                  MitigationActionType.MANUAL_REVIEW, "ALL", 1,
                  "Mitigation planner timed out — manual review required"
                )))
            }
          }

      // ── Step 4: Mitigation planning complete ──────────────────────────────
      case MitigationResultReceived(actions) =>
        ctx.log.info(s"[Case ${state.caseId}] Mitigations received: ${actions.size} actions")

        val serializable = actions.map(a =>
          SerializableMitigationAction(a.actionType.label, a.targetEntity, a.priority, a.description)
        )

        Effect
          .persist(MitigationProposed(state.caseId, serializable))
          .thenRun { updatedState =>
            implicit val ec = ctx.executionContext
            val event  = updatedState.extractedEvent.getOrElse(
              DisruptionEvent(EventType.Unknown, "UNKNOWN", Severity.LOW, 0, 0.0)
            )
            val impact = updatedState.impactSummary.getOrElse(ImpactSummaryData.empty(state.caseId))

            // ── Delegate to ReportActor (single-responsibility) ────────────
            // Instead of assembling the report inline, we spawn a dedicated
            // ReportActor and ask it — clean separation of concerns.
            val reportRef     = ctx.spawnAnonymous(ReportActor(repository))
            val reportTimeout = Timeout(30.seconds)
            ctx.pipeToSelf(
              reportRef.ask[ReportResult](
                replyTo => AssembleReport(
                  updatedState.caseId, updatedState.rawText, event, impact, actions, replyTo
                )
              )(reportTimeout, ctx.system.scheduler)
            ) {
              case Success(result) => ReportResultReceived(result)
              case Failure(ex)     => ReportResultReceived(ReportFailed(ex.getMessage))
            }
          }

      // ── Step 5: ReportActor delivered the assembled report ────────────────
      case ReportResultReceived(ReportReady(report)) =>
        ctx.log.info(s"[Case ${state.caseId}] Report assembled — delivering to HTTP caller and SSE stream")

        // Deliver to the HTTP AskPattern caller
        getReplyTo().foreach(_ ! report)

        // ── AKKA STREAMS PUSH: broadcast to all active SSE subscribers ─────
        streamRegistry.publish(report)

        // Persist terminal event → stop
        Effect
          .persist(CaseCompleted(state.caseId, Instant.now()))
          .thenStop()

      case ReportResultReceived(ReportFailed(reason)) =>
        ctx.log.error(s"[Case ${state.caseId}] Report assembly failed: $reason")
        getReplyTo().foreach(_ ! DisruptionFailed(state.caseId, s"Report assembly failed: $reason"))
        Effect
          .persist(CaseCompleted(state.caseId, Instant.now()))
          .thenStop()

      // ── Finalize (legacy path, kept for backwards-compat) ─────────────────
      case FinalizeCase(_) =>
        ctx.log.info(s"[Case ${state.caseId}] Finalizing")
        Effect
          .persist(CaseCompleted(state.caseId, Instant.now()))
          .thenStop()

      case CaseTimeout =>
        Effect.none[CaseEvent, CaseState]

      case _ =>
        Effect.none[CaseEvent, CaseState]
    }
  }

  // ── Event Handler (pure — rebuilds state from journal) ───────────────────

  private val eventHandler: (CaseState, CaseEvent) => CaseState = {
    (state, event) => event match {

      case DisruptionReceived(caseId, rawText, ts) =>
        state.copy(
          caseId     = caseId,
          rawText    = rawText,
          phase      = CasePhase.WaitingForLlm,
          auditTrail = state.auditTrail :+ AuditEntry("RECEIVED", ts, s"Case $caseId started")
        )

      case LlmEventExtracted(_, eventType, entityId, severity, durationHours, confidence, reasoning) =>
        val extracted = DisruptionEvent(
          eventType     = EventType.fromLabel(eventType),
          entityId      = entityId,
          severity      = Severity.fromString(severity),
          durationHours = durationHours,
          confidence    = confidence,
          reasoning     = reasoning
        )
        state.copy(
          extractedEvent = Some(extracted),
          phase          = CasePhase.WaitingForImpact,
          auditTrail     = state.auditTrail :+ AuditEntry(
            "LLM_EXTRACTED", Instant.now(),
            s"Event: $eventType on $entityId (confidence=$confidence)"
          )
        )

      case EntityImpactRecorded(caseId, entityId, entityType, description) =>
        val newImpact    = EntityImpact(entityId, entityType, description)
        val existing     = state.impactSummary.map(_.affectedEntities).getOrElse(List.empty)
        val realEntities = (existing :+ newImpact).filterNot(_.entityType == "NONE")
        val updated = ImpactSummaryData(
          caseId           = caseId,
          affectedEntities = realEntities,
          overallSeverity  = state.extractedEvent.map(_.severity).getOrElse(Severity.MEDIUM),
          isPartial        = false
        )
        state.copy(
          impactSummary = Some(updated),
          phase         = CasePhase.WaitingForMitigation
        )

      case MitigationProposed(_, actions) =>
        val domainActions = actions.map(a =>
          MitigationAction(MitigationActionType.fromLabel(a.actionType), a.targetEntity, a.priority, a.description)
        )
        state.copy(
          mitigations = domainActions,
          phase       = CasePhase.WaitingForReport,
          auditTrail  = state.auditTrail :+ AuditEntry(
            "MITIGATION_PLANNED", Instant.now(), s"${actions.size} actions proposed"
          )
        )

      case CaseCompleted(_, completedAt) =>
        state.copy(
          phase      = CasePhase.Completed,
          auditTrail = state.auditTrail :+ AuditEntry("COMPLETED", completedAt, "Case completed")
        )
    }
  }

  // ── Impact analysis trigger ───────────────────────────────────────────────

  private def triggerImpactAnalysis(
    ctx:        akka.actor.typed.scaladsl.ActorContext[CaseCommand],
    config:     AppConfig,
    event:      DisruptionEvent,
    caseId:     CaseId,
    domainRefs: DomainShardedRefs,
    graph:      com.supplychain.graph.SupplyChainGraph
  ): Unit = {

    val affectedNodes = graph.findAffectedNodes(event.entityId, maxDistance = 3.0)
    val targets       = affectedNodes + (event.entityId -> 0.0)

    ctx.log.info(s"[Case $caseId] Graph: ${targets.size} affected entities: ${targets.keys.mkString(", ")}")

    val impactRef = ctx.spawn(
      ImpactAnalysisActor(
        caseId         = caseId,
        event          = event,
        replyTo        = ctx.messageAdapter[ImpactSummaryData](ImpactSummaryReceived),
        expectedCount  = targets.size,
        timeoutSeconds = config.simulation.aggregationTimeoutSeconds
      ),
      s"impact-$caseId"
    )

    targets.foreach { case (id, _) =>
      event.eventType match {
        case EventType.SupplierDelay =>
          if (id.startsWith("S")) {
            val ref = domainRefs.getSupplier(id)
            ref ! RegisterImpactActor(impactRef)
            ref ! ApplySupplierDelay(math.max(1, event.durationHours / 24), ctx.system.ignoreRef)
          } else if (id.startsWith("W")) {
            val ref = domainRefs.getWarehouse(id)
            ref ! RegisterImpactActorW(impactRef)
            ref ! ApplyInventoryReduction(100, ctx.system.ignoreRef)
          } else if (id.startsWith("ST")) {
            val ref = domainRefs.getStore(id)
            ref ! RegisterImpactActorS(impactRef)
            ref ! ApplyStockShortfall(50, ctx.system.ignoreRef)
          }

        case EventType.TruckBreakdown =>
          if (id.startsWith("T")) {
            val ref = domainRefs.getTruck(id)
            ref ! RegisterImpactActorT(impactRef)
            ref ! ApplyTruckBreakdown(s"Disruption case $caseId", ctx.system.ignoreRef)
          } else if (id.startsWith("W")) {
            val ref = domainRefs.getWarehouse(id)
            ref ! RegisterImpactActorW(impactRef)
            ref ! ApplyTruckDelay(event.entityId, 12, ctx.system.ignoreRef)
          }

        case EventType.WarehouseShortfall =>
          if (id.startsWith("W")) {
            val ref = domainRefs.getWarehouse(id)
            ref ! RegisterImpactActorW(impactRef)
            ref ! ApplyInventoryReduction(200, ctx.system.ignoreRef)
          } else if (id.startsWith("ST")) {
            val ref = domainRefs.getStore(id)
            ref ! RegisterImpactActorS(impactRef)
            ref ! ApplyStockShortfall(100, ctx.system.ignoreRef)
          }

        case EventType.DemandSpike =>
          if (id.startsWith("ST")) {
            val ref = domainRefs.getStore(id)
            ref ! RegisterImpactActorS(impactRef)
            ref ! ApplyDemandSpike(1.5, ctx.system.ignoreRef)
          }

        case _ =>
      }
    }
  }
}
