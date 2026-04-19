package com.supplychain.graph

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior}
import akka.cluster.ddata.typed.scaladsl.{DistributedData, Replicator}
import akka.cluster.ddata.{LWWMap, LWWMapKey, SelfUniqueAddress}
import com.supplychain.domain.model.CborSerializable

import scala.concurrent.duration._

/**
 * AKKA DISTRIBUTED DATA: Cluster-Replicated Supply Chain Graph
 * ============================================================================
 * DESIGN PATTERN: CvRDT (Convergent Replicated Data Type) via LWWMap
 *
 * ── Problem Without This ──────────────────────────────────────────────────
 * SupplyChainGraph is built from static config and lives only in memory on
 * each node. If you add a new supplier or remove a route at runtime, you must
 * restart every node to propagate the change.
 *
 * ── Solution: Distributed Data (LWWMap) ──────────────────────────────────
 * Akka Distributed Data replicates a Last-Write-Wins Map across all cluster
 * members using gossip. Any node can call AddEdge; the Replicator propagates
 * the update cluster-wide with CvRDT merge semantics — no coordination needed,
 * no single point of failure.
 *
 * Edge format: "S1->W1" → 1.0 (weight)
 *
 * ── Consistency Settings ─────────────────────────────────────────────────
 * - Writes: WriteAll (block until all nodes acknowledge — strong consistency)
 * - Reads:  ReadLocal (read from local replica — eventual consistency)
 *   For topology queries, ReadLocal is correct: a slightly stale graph
 *   still returns valid Dijkstra results; we don't need linearisability here.
 *
 * ── Startup Seeding ──────────────────────────────────────────────────────
 * On startup, each node seeds the LWWMap with the local static topology.
 * Because LWW merge is idempotent, concurrent seeding from multiple nodes
 * converges to the same state.
 * ============================================================================
 */
object GraphReplicatorActor {

  private val GraphEdgesKey: LWWMapKey[String, String] =
    LWWMapKey[String, String]("supply-chain-graph-edges")

  private val EmptyMap: LWWMap[String, String] = LWWMap.empty[String, String]

  sealed trait Command extends CborSerializable
  case class AddEdge(from: String, to: String, weight: Double = 1.0) extends Command
  case class RemoveEdge(from: String, to: String)                    extends Command
  case class GetGraph(replyTo: ActorRef[SupplyChainGraph])           extends Command

  private case class InternalUpdateDone(
    rsp: Replicator.UpdateResponse[LWWMap[String, String]]
  ) extends Command

  private case class InternalGetResponse(
    rsp:     Replicator.GetResponse[LWWMap[String, String]],
    replyTo: ActorRef[SupplyChainGraph]
  ) extends Command

  def apply(initialGraph: SupplyChainGraph): Behavior[Command] =
    Behaviors.setup { ctx =>

      val ddata                            = DistributedData(ctx.system)
      implicit val node: SelfUniqueAddress = ddata.selfUniqueAddress
      val updateAdapter                    =
        ctx.messageAdapter[Replicator.UpdateResponse[LWWMap[String, String]]](InternalUpdateDone)

      // ── Seed initial static topology into the distributed map ────────────
      // edges() returns keys already in "from->to" format (via SupplyChainGraph.edgeKey)
      val seedMap = initialGraph.edges.foldLeft(EmptyMap) { case (m, (k, w)) => m.put(node, k, w.toString) }
      ddata.replicator ! Replicator.Update(
        GraphEdgesKey, EmptyMap, Replicator.WriteAll(timeout = 5.seconds), updateAdapter
      )(_ => seedMap)

      ctx.log.info(
        s"[GraphReplicator] Started — seeded ${initialGraph.edges.size} edges into " +
        s"DistributedData LWWMap '${GraphEdgesKey.id}'"
      )

      active(ddata, node, updateAdapter)
    }

  private def active(
    ddata:         DistributedData,
    node:          SelfUniqueAddress,
    updateAdapter: akka.actor.typed.ActorRef[Replicator.UpdateResponse[LWWMap[String, String]]]
  ): Behavior[Command] =
    Behaviors.receive { (ctx, msg) =>
      implicit val self: SelfUniqueAddress = node

      msg match {

        // ── Runtime edge addition (cluster-wide) ─────────────────────────
        case AddEdge(from, to, weight) =>
          val key = SupplyChainGraph.edgeKey(from, to)
          ddata.replicator ! Replicator.Update(
            GraphEdgesKey, EmptyMap, Replicator.WriteAll(timeout = 5.seconds), updateAdapter
          )(_.put(node, key, weight.toString))
          ctx.log.info(s"[GraphReplicator] AddEdge $from→$to (weight=$weight) — replicating cluster-wide")
          Behaviors.same

        // ── Runtime edge removal (cluster-wide) ──────────────────────────
        case RemoveEdge(from, to) =>
          val key = SupplyChainGraph.edgeKey(from, to)
          ddata.replicator ! Replicator.Update(
            GraphEdgesKey, EmptyMap, Replicator.WriteAll(timeout = 5.seconds), updateAdapter
          )(_.remove(node, key))
          ctx.log.info(s"[GraphReplicator] RemoveEdge $from→$to — replicating cluster-wide")
          Behaviors.same

        // ── Query local replica of the graph ─────────────────────────────
        case GetGraph(replyTo) =>
          val getAdapter = ctx.messageAdapter[Replicator.GetResponse[LWWMap[String, String]]] {
            rsp => InternalGetResponse(rsp, replyTo)
          }
          // ReadLocal = eventually consistent, no round-trip to other nodes
          ddata.replicator ! Replicator.Get(GraphEdgesKey, Replicator.ReadLocal, getAdapter)
          Behaviors.same

        // ── Read journal response: reconstruct SupplyChainGraph ───────────
        case InternalGetResponse(g: Replicator.GetSuccess[LWWMap[String, String] @unchecked], replyTo) =>
          val edgeMap: Map[String, Double] = g.dataValue.entries.view.mapValues(_.toDouble).toMap
          ctx.log.debug(s"[GraphReplicator] GetGraph: reconstructing ${edgeMap.size} edges")
          replyTo ! SupplyChainGraph.fromEdges(edgeMap)
          Behaviors.same

        case InternalGetResponse(_, replyTo) =>
          ctx.log.warn("[GraphReplicator] GetGraph failed — returning empty graph")
          replyTo ! new SupplyChainGraph()
          Behaviors.same

        // ── Update acknowledgements (log only) ───────────────────────────
        case InternalUpdateDone(_: Replicator.UpdateSuccess[_]) =>
          Behaviors.same

        case InternalUpdateDone(failure) =>
          ctx.log.warn(s"[GraphReplicator] Distributed Data update failed: $failure")
          Behaviors.same
      }
    }
}
