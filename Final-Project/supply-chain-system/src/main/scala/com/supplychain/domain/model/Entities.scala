package com.supplychain.domain.model

/**
 * Marker trait for messages that should be serialized using Jackson CBOR.
 * Required for distributed message passing in Akka Cluster.
 */
trait CborSerializable

import java.time.Instant

// ============================================================
// Shared primitive types
// ============================================================

/** Stable identifier type aliases — avoids String confusion across APIs. */
object Ids {
  type SupplierId  = String
  type WarehouseId = String
  type TruckId     = String
  type StoreId     = String
  type CaseId      = String
  type EntityId    = String  // union of all entity IDs
}

import Ids._

// ============================================================
// Supplier
// ============================================================

/** Possible statuses for a supplier's delivery capability. */
sealed trait SupplierStatus
object SupplierStatus {
  case object NORMAL  extends SupplierStatus
  case object DELAYED extends SupplierStatus
  case object HALTED  extends SupplierStatus
}

/**
 * Immutable state owned exclusively by [[com.supplychain.actors.domain.SupplierActor]].
 * No other actor may read or mutate this directly.
 *
 * @param dependentWarehouses list of warehouse IDs that receive from this supplier;
 *                            used to propagate InventoryReduced events downstream.
 */
case class SupplierState(
  id:                   SupplierId,
  name:                 String,
  inventory:            Int,
  status:               SupplierStatus,
  delayDays:            Int,
  activeOrders:         List[String],
  dependentWarehouses:  List[WarehouseId]
) {
  def withDelay(days: Int): SupplierState =
    copy(status = SupplierStatus.DELAYED, delayDays = days)

  def reduceInventory(amount: Int): SupplierState =
    copy(inventory = math.max(0, inventory - amount))

  def recover(): SupplierState =
    copy(status = SupplierStatus.NORMAL, delayDays = 0)
}

object SupplierState {
  def initial(id: SupplierId, name: String, warehouses: List[WarehouseId]): SupplierState =
    SupplierState(
      id                  = id,
      name                = name,
      inventory           = 1000,
      status              = SupplierStatus.NORMAL,
      delayDays           = 0,
      activeOrders        = List.empty,
      dependentWarehouses = warehouses
    )
}

// ============================================================
// Warehouse
// ============================================================

/**
 * Immutable state owned exclusively by [[com.supplychain.actors.domain.WarehouseActor]].
 *
 * @param stockLevels       SKU → quantity  (simplified to a single Int for simulation)
 * @param dependentStores   store IDs that receive outbound shipments from here
 * @param inboundSupplierId which supplier feeds this warehouse
 */
case class WarehouseState(
  id:                 WarehouseId,
  name:               String,
  stockLevels:        Int,
  inboundSupplierId:  SupplierId,
  outboundOrders:     List[String],
  dependentStores:    List[StoreId],
  shortfallActive:    Boolean
) {
  def receiveInventory(amount: Int): WarehouseState =
    copy(stockLevels = stockLevels + amount)

  def reduceStock(amount: Int): WarehouseState = {
    val newStock = math.max(0, stockLevels - amount)
    copy(stockLevels = newStock, shortfallActive = newStock < 100)
  }

  def clearShortfall(): WarehouseState = copy(shortfallActive = false)
}

object WarehouseState {
  def initial(
    id:       WarehouseId,
    name:     String,
    supplier: SupplierId,
    stores:   List[StoreId]
  ): WarehouseState =
    WarehouseState(
      id                = id,
      name              = name,
      stockLevels       = 500,
      inboundSupplierId = supplier,
      outboundOrders    = List.empty,
      dependentStores   = stores,
      shortfallActive   = false
    )
}

// ============================================================
// Truck
// ============================================================

/** Explicit truck status state machine: ACTIVE → DISABLED → RECOVERING → ACTIVE */
sealed trait TruckStatus
object TruckStatus {
  case object ACTIVE     extends TruckStatus  // normal operation
  case object DISABLED   extends TruckStatus  // breakdown or accident
  case object RECOVERING extends TruckStatus  // repair in progress
}

/**
 * Immutable state owned exclusively by [[com.supplychain.actors.domain.TruckActor]].
 *
 * @param assignedWarehouse the warehouse this truck services
 * @param eta               estimated time of arrival at destination (None if disabled)
 */
case class TruckState(
  id:                TruckId,
  status:            TruckStatus,
  cargoDescription:  String,
  assignedWarehouse: WarehouseId,
  assignedRoute:     String,
  eta:               Option[Instant]
) {
  def breakdown(): TruckState = copy(status = TruckStatus.DISABLED, eta = None)
  def startRecovery(): TruckState = copy(status = TruckStatus.RECOVERING)
  def recover(newEta: Instant): TruckState =
    copy(status = TruckStatus.ACTIVE, eta = Some(newEta))
}

object TruckState {
  def initial(id: TruckId, warehouse: WarehouseId, route: String): TruckState =
    TruckState(
      id                = id,
      status            = TruckStatus.ACTIVE,
      cargoDescription  = "Mixed goods",
      assignedWarehouse = warehouse,
      assignedRoute     = route,
      eta               = Some(Instant.now().plusSeconds(3600 * 4))
    )
}

// ============================================================
// Store (Kirana node)
// ============================================================

/**
 * Immutable state owned exclusively by [[com.supplychain.actors.domain.StoreActor]].
 *
 * @param demandMultiplier  1.0 = normal; >1.0 = demand spike (e.g. festival)
 * @param supplyingWarehouse warehouse that services this store
 */
case class StoreState(
  id:                 StoreId,
  name:               String,
  currentStock:       Int,
  pendingOrders:      List[String],
  demandLevel:        Int,
  demandMultiplier:   Double,
  supplyingWarehouse: WarehouseId
) {
  def receiveDemandSpike(multiplier: Double): StoreState =
    copy(demandMultiplier = multiplier, demandLevel = (demandLevel * multiplier).toInt)

  def receiveShortfall(reduction: Int): StoreState =
    copy(currentStock = math.max(0, currentStock - reduction))

  def restock(amount: Int): StoreState =
    copy(currentStock = currentStock + amount, pendingOrders = List.empty)
}

object StoreState {
  def initial(id: StoreId, name: String, warehouse: WarehouseId): StoreState =
    StoreState(
      id                 = id,
      name               = name,
      currentStock       = 200,
      pendingOrders      = List.empty,
      demandLevel        = 100,
      demandMultiplier   = 1.0,
      supplyingWarehouse = warehouse
    )
}

// ============================================================
// Simulation topology — wired at startup in Main.scala
// ============================================================

/**
 * Complete simulation topology injected at actor creation time.
 * Immutable; shared via constructor injection (not global state).
 */
case class SimulationTopology(
  suppliers:  Map[Ids.SupplierId,  SupplierState],
  warehouses: Map[Ids.WarehouseId, WarehouseState],
  trucks:     Map[Ids.TruckId,     TruckState],
  stores:     Map[Ids.StoreId,     StoreState]
)
