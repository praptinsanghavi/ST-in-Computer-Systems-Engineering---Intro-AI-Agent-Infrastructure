package com.supplychain.http

import akka.NotUsed
import akka.actor.typed.ActorSystem
import akka.stream.OverflowStrategy
import akka.stream.scaladsl.{BroadcastHub, Keep, Source}
import akka.stream.scaladsl.SourceQueueWithComplete
import com.supplychain.domain.model.DisruptionReport
import org.slf4j.LoggerFactory

/**
 * AKKA STREAMS: SSE BroadcastHub Registry
 * ============================================================================
 * DESIGN PATTERN: Producer / BroadcastHub (fan-out)
 *
 * Wraps an Akka Streams Source.queue → BroadcastHub pipeline so that
 * multiple concurrent SSE subscribers all receive the same events.
 *
 * ── Why BroadcastHub? ──────────────────────────────────────────────────────
 * A plain Source.queue has exactly one consumer. For SSE, we need N consumers
 * (one per connected browser tab). BroadcastHub materialises a single upstream
 * queue into a Source that can be consumed by any number of downstream sinks
 * independently, with each subscriber getting its own internal buffer.
 *
 * ── Lifecycle ──────────────────────────────────────────────────────────────
 * 1. DisruptionStreamRegistry.create() — allocates the wrapper (no streams yet)
 * 2. registry.initialize(system)       — materialises the pipeline; called
 *    in Main.scala immediately after the ActorSystem boots
 * 3. DisruptionCaseActor.publish(report) — pushes completed reports
 * 4. Routes GET /disruption/stream     — each subscriber attaches to source
 *
 * ── OverflowStrategy.dropHead ──────────────────────────────────────────────
 * If the queue fills (no active SSE consumers), the oldest event is dropped.
 * This prevents unbounded memory growth under backpressure.
 * ============================================================================
 */
class DisruptionStreamRegistry {

  private val log = LoggerFactory.getLogger(getClass)

  @volatile private var _queue:  Option[SourceQueueWithComplete[DisruptionReport]]  = None
  @volatile private var _source: Option[Source[DisruptionReport, NotUsed]]          = None

  /**
   * Materialises the BroadcastHub pipeline.
   * Must be called exactly once, after the ActorSystem is available.
   */
  def initialize(implicit system: ActorSystem[_]): Unit = {
    implicit val mat: akka.stream.Materializer = akka.stream.Materializer(system)
    val (q, src) =
      Source.queue[DisruptionReport](bufferSize = 256, overflowStrategy = OverflowStrategy.dropHead)
        .toMat(BroadcastHub.sink[DisruptionReport](bufferSize = 256))(Keep.both)
        .run()
    _queue  = Some(q)
    _source = Some(src)
    log.info("[StreamRegistry] Akka Streams BroadcastHub initialised — SSE endpoint ready")
  }

  /**
   * Publish a completed DisruptionReport to all active SSE subscribers.
   * Non-blocking: offer() enqueues without back-pressure on the caller.
   * Safe to call before initialize() — becomes a no-op.
   */
  def publish(report: DisruptionReport): Unit =
    _queue.foreach { q =>
      q.offer(report)
      log.debug(s"[StreamRegistry] Published caseId=${report.caseId} to SSE stream")
    }

  /**
   * Source for the SSE HTTP endpoint.
   * Each new subscriber attaches to the BroadcastHub and receives its own
   * independent sub-stream — no head-of-line blocking between clients.
   */
  def source: Source[DisruptionReport, NotUsed] =
    _source.getOrElse(Source.never[DisruptionReport])
}

object DisruptionStreamRegistry {
  def create(): DisruptionStreamRegistry = new DisruptionStreamRegistry()
}
