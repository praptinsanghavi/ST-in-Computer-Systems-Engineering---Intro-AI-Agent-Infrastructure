package com.supplychain.graph

import com.supplychain.domain.model.Ids._
import org.slf4j.LoggerFactory
import scala.collection.mutable

/**
 * SUPPLY CHAIN GRAPH: The Topological Digital Twin
 * ============================================================================
 * DESIGN PATTERN: GraphRAG / Dijkstra Traversal
 * 
 * ROLE:
 *   Models the physical relationships between sharded entities (Suppliers,
 *   Warehouses, Trucks, Stores). This graph is used as a Knowledge Base
 *   to determine how a disruption at Node A "ripples" through the network.
 * 
 * ALGORITHM: Dijkstra's Shortest Path
 *   We use Dijkstra with a `maxDistance` (impact decay) to find all downstream
 *   entities that depend on a distressed node. 
 * ============================================================================
 */
class SupplyChainGraph {

  private val log = LoggerFactory.getLogger(getClass)
  private val adj = mutable.Map[String, mutable.Set[(String, Double)]]()

  def addEdge(from: String, to: String, weight: Double = 1.0): Unit = {
    adj.getOrElseUpdate(from, mutable.Set()) += ((to, weight))
  }

  /** Exports all edges as "from->to" → weight map for distributed replication. */
  def edges: Map[String, Double] =
    adj.flatMap { case (from, neighbors) =>
      neighbors.map { case (to, weight) => SupplyChainGraph.edgeKey(from, to) -> weight }
    }.toMap

  /**
   * Finds all nodes affected by a disruption at 'startNode'.
   * Uses a distance-limited search (BFS/Dijkstra) to simulate impact decay.
   *
   * @param startNode the entity where the disruption occurred
   * @param maxDistance max distance to traverse (impact scope)
   * @return Map of affected NodeIds to their impact distance
   */
  def findAffectedNodes(startNode: String, maxDistance: Double = 3.0): Map[String, Double] = {
    val distances = mutable.Map[String, Double]().withDefaultValue(Double.PositiveInfinity)
    val priorityQueue = mutable.PriorityQueue[(String, Double)]()(Ordering.by[(String, Double), Double](_._2).reverse)

    distances(startNode) = 0
    priorityQueue.enqueue((startNode, 0))

    while (priorityQueue.nonEmpty) {
      val (u, d) = priorityQueue.dequeue()

      if (d <= distances(u)) {
        adj.get(u).foreach { neighbors =>
          neighbors.foreach { case (v, weight) =>
            val newDist = d + weight
            if (newDist < distances(v) && newDist <= maxDistance) {
              distances(v) = newDist
              priorityQueue.enqueue((v, newDist))
            }
          }
        }
      }
    }
    
    val results = distances.toMap.filter { case (id, _) => id != startNode }

    if (results.isEmpty)
      log.warn(s"[SupplyChainGraph] No affected nodes for startNode=$startNode — check topology")
    else
      log.info(s"[SupplyChainGraph] $startNode affects ${results.size} nodes: ${results.keys.mkString(", ")}")

    results
  }
}

object SupplyChainGraph {

  val EdgeSeparator = "->"

  def edgeKey(from: String, to: String): String = s"$from$EdgeSeparator$to"

  /** Reconstructs a graph from an edge map (used by GraphReplicatorActor). */
  def fromEdges(edges: Map[String, Double]): SupplyChainGraph = {
    val g = new SupplyChainGraph()
    edges.foreach { case (key, weight) =>
      key.split(EdgeSeparator) match {
        case Array(from, to) => g.addEdge(from, to, weight)
        case _               => // skip malformed keys
      }
    }
    g
  }

  /** Helper to build the graph from the configured topology. */
  def buildFromConfig(
    suppliers:  List[SupplierId],
    warehouses: List[WarehouseId],
    trucks:     List[TruckId],
    stores:     List[StoreId]
  ): SupplyChainGraph = {
    val g = new SupplyChainGraph()

    // ── Predefined Edges based on domain knowledge ────────────────────────
    
    // Suppliers -> Warehouses (W1:S1, W2:S2, Both:S3)
    g.addEdge("S1", "W1")
    g.addEdge("S2", "W2")
    g.addEdge("S3", "W1")
    g.addEdge("S3", "W2")

    // Trucks -> Warehouses (T1,T2:W1; T3,T4:W2)
    g.addEdge("T1", "W1")
    g.addEdge("T2", "W1")
    g.addEdge("T3", "W2")
    g.addEdge("T4", "W2")

    // Warehouses -> Stores
    g.addEdge("W1", "ST1")
    g.addEdge("W1", "ST2")
    g.addEdge("W1", "ST3")
    g.addEdge("W2", "ST4")
    g.addEdge("W2", "ST5")
    g.addEdge("W2", "ST6")

    g
  }
}
