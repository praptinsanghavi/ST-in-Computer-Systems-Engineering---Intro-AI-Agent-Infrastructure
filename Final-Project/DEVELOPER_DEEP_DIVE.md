# Supply Chain Disruption Management System — Complete Developer Reference

> Scala 2.13 · Akka Typed 2.6 · Akka Persistence JDBC · Akka Cluster Sharding · Akka Distributed Data · Akka Streams · Akka HTTP · PostgreSQL · AWS Bedrock · React 18 · Vite

---

## Table of Contents

1. [System Purpose and Problem Statement](#1-system-purpose-and-problem-statement)
2. [High-Level Architecture](#2-high-level-architecture)
3. [Technology Stack — What, Where, and Why](#3-technology-stack--what-where-and-why)
4. [Project Structure](#4-project-structure)
5. [Domain Model](#5-domain-model)
6. [Actor Hierarchy and Responsibilities](#6-actor-hierarchy-and-responsibilities)
7. [Complete Message Flow (End-to-End)](#7-complete-message-flow-end-to-end)
8. [Event Sourcing and Persistence](#8-event-sourcing-and-persistence)
9. [Akka Cluster and Distribution](#9-akka-cluster-and-distribution)
10. [LLM Integration Layer](#10-llm-integration-layer)
11. [Graph and Impact Analysis](#11-graph-and-impact-analysis)
12. [HTTP Layer and SSE Streaming](#12-http-layer-and-sse-streaming)
13. [Database Schema](#13-database-schema)
14. [Configuration Reference](#14-configuration-reference)
15. [Frontend Architecture](#15-frontend-architecture)
16. [Docker and Deployment](#16-docker-and-deployment)
17. [Design Patterns — Explained with Context](#17-design-patterns--explained-with-context)
18. [Supervision and Fault Tolerance](#18-supervision-and-fault-tolerance)
19. [Testing Strategy](#19-testing-strategy)
20. [Known Gotchas and Non-Obvious Decisions](#20-known-gotchas-and-non-obvious-decisions)
21. [Interview Deep-Dive Q&A](#21-interview-deep-dive-qa)

---

## 1. System Purpose and Problem Statement

### What Does This System Do?

This system ingests free-text disruption reports (e.g., "Warehouse W1 flooded, all stock damaged") and:

1. Uses an LLM to **extract structured event data** (event type, affected entity, severity, duration, confidence)
2. Runs a **graph traversal** over the supply chain topology to find all downstream entities impacted
3. Dispatches **domain actor commands** to actually mutate in-memory entity state (stock levels, truck status, etc.)
4. Uses a second LLM call to **propose recovery actions** tailored to the impact profile
5. **Persists everything** to a journal and a read-side projection table
6. **Streams the final report** to all SSE subscribers in real time
7. Displays everything live in a **React dashboard** with topology visualization

### Why Is This Non-Trivial?

- Free-text disruption reports are unstructured. You cannot parse them with regex. You need NLP — hence the LLM extraction layer.
- Supply chains are graphs. A delay at Supplier S1 ripples to Warehouse W1, then to Stores ST1/ST2/ST3. The impact is not local; you need graph traversal with decay.
- The system must be **distributed** (Akka Cluster, Sharding) and **fault-tolerant** (Event Sourcing, supervision strategies, circuit breakers).
- Everything must work asynchronously — blocking is not allowed on any actor thread.

---

## 2. High-Level Architecture

```
┌─────────────────────────────────────────────────────────────────────────┐
│                          ACTOR SYSTEM (node1 + node2)                    │
│                                                                           │
│  ┌──────────────────────────────────────────────────────────────────┐   │
│  │  GuardianActor (root)                                              │   │
│  │                                                                    │   │
│  │  ┌──────────────────────┐   ┌──────────────────────────────────┐  │   │
│  │  │ SimulationManager    │   │ GraphReplicatorActor              │  │   │
│  │  │  (registered via     │   │  (LWWMap[String,String]           │  │   │
│  │  │   Receptionist)      │   │   WriteAll/ReadLocal)             │  │   │
│  │  └──────────┬───────────┘   └──────────────────────────────────┘  │   │
│  │             │ spawns (per request)                                  │   │
│  │  ┌──────────▼───────────┐   ┌──────────────────────────────────┐  │   │
│  │  │ DisruptionCaseActor  │   │ JournalReadActor                  │  │   │
│  │  │  (EventSourced FSM)  │   │  (PersistenceQuery CQRS)         │  │   │
│  │  │   spawns children:   │   └──────────────────────────────────┘  │   │
│  │  │  • LLMInterpreter    │                                           │   │
│  │  │  • ImpactAnalysis    │   ┌──────────────────────────────────┐  │   │
│  │  │  • MitigationPlanner │   │ Cluster Sharding                  │  │   │
│  │  │  • ReportActor       │   │  • SupplierActor (S1, S2, S3)    │  │   │
│  │  └──────────────────────┘   │  • WarehouseActor (W1, W2)       │  │   │
│  │                              │  • TruckActor (T1–T4)            │  │   │
│  │                              │  • StoreActor (ST1–ST6)          │  │   │
│  │                              └──────────────────────────────────┘  │   │
│  └──────────────────────────────────────────────────────────────────┘   │
│                                                                           │
│  ┌──────────────────────────────────────────────────────────────────┐   │
│  │  HTTP Layer (Akka HTTP)                                            │   │
│  │   GET/POST /disruption  ·  GET /disruption/stream (SSE)          │   │
│  │   GET /cluster/status   ·  GET /health                            │   │
│  └──────────────────────────────────────────────────────────────────┘   │
│                                                                           │
│  ┌──────────────────────────────────────────────────────────────────┐   │
│  │  PostgreSQL (JDBC)                                                 │   │
│  │   event_journal · event_tag · snapshot · disruption_reports       │   │
│  └──────────────────────────────────────────────────────────────────┘   │
└─────────────────────────────────────────────────────────────────────────┘
```

### Data Flow in One Sentence

`HTTP POST` → `SimulationManager` → `DisruptionCaseActor` → LLM extract → Graph impact → Domain actors mutate state → LLM mitigate → `ReportActor` persists → SSE push → `HTTP 200`.

---

## 3. Technology Stack — What, Where, and Why

| Technology | Version | Used In | Why |
|---|---|---|---|
| Scala 2.13 | 2.13.12 | Entire backend | Pattern matching, sealed traits, case classes — ideal for domain modeling. Akka is Scala-native. |
| Akka Actor (Typed) | 2.6.21 | All actors | Type-safe message passing. Eliminates `Any`-typed `tell`. |
| Akka Persistence (Typed) | 2.6.21 | DisruptionCaseActor | Event sourcing — journal-based recovery, audit trail for free. |
| Akka Persistence Query | 2.6.21 | JournalReadActor | CQRS read-side. `eventsByTag` lets you subscribe to completed cases without polling. |
| akka-persistence-jdbc | 5.0.4 | Journal/Snapshot stores | Stores events in PostgreSQL instead of an embedded store. Production-grade. |
| Akka Cluster (Typed) | 2.6.21 | node1/node2 | Horizontal scalability. Automatic failure detection (heartbeat + SBR). |
| Akka Cluster Sharding | 2.6.21 | Domain actors | Distributes entities across nodes automatically. Location transparency — caller doesn't know which node holds W1. |
| Akka Distributed Data | 2.6.21 | GraphReplicatorActor | CvRDT gossip replication. Graph topology available on every node without round-trips. |
| Akka Receptionist | 2.6.21 | SimulationManager registration | Cluster-wide actor discovery without hardcoded paths. |
| Akka HTTP | 10.2.10 | Routes.scala | Reactive HTTP. Non-blocking. Built-in SSE support via `Source[ByteString, _]`. |
| Akka Streams | 2.6.21 | DisruptionStreamRegistry | BroadcastHub pattern for SSE fan-out. Back-pressure built in. |
| Akka Serialization Jackson | 2.6.21 | All CborSerializable messages | CBOR binary serialization for cluster messages. Java serialization disabled. |
| spray-json | via akka-http | HTTP JSON formatting | Lightweight pure-Scala JSON. No reflection. Manual format definitions. |
| sttp client3 | 3.9.3 | RealLlmClient | Non-blocking HTTP client for OpenAI. AkkaHttpBackend returns Future. |
| AWS SDK v2 Bedrock | 2.26.24 | BedrockLlmClient | AWS Bedrock Converse API for Claude. Prod-grade auth (StaticCredentialsProvider). |
| Slick 3.3.3 + HikariCP | 3.3.3 | JDBC persistence config | Connection pool + async JDBC for akka-persistence-jdbc. |
| PostgreSQL JDBC | 42.7.1 | PersistenceRepository | Direct JDBC for read-side writes (no Slick overhead). |
| Logback | 1.2.13 | Logging | SLF4J bridge. Akka uses `akka-slf4j`. |
| React 18 | 18.x | Frontend | Component-based UI, concurrent mode. |
| Framer Motion | 11.x | Animations | Declarative motion API (opacity/scale/translate). |
| Lucide React | Icons | Header, panels | Lightweight SVG icons. |
| Vite | 5.x | Frontend build | HMR dev server, fast builds. |
| Docker / Compose | Latest | Deployment | 3-service compose: postgres + node1 + node2. |
| JDK 11 | Eclipse Temurin | Runtime | LTS, Akka 2.6 certified. `eclipse-temurin:11-jre-jammy` for runtime. |

---

## 4. Project Structure

```
Final-Project/
├── supply-chain-system/          # Scala/Akka backend (Maven project)
│   ├── apache-maven-3.9.6/       # Vendored Maven (no global install required)
│   ├── docker-compose.yml        # 3-service deployment
│   ├── Dockerfile                # Multi-stage: JDK build → JRE runtime
│   ├── pom.xml                   # Dependencies + shade plugin config
│   ├── sql/
│   │   └── init.sql              # PostgreSQL schema initialization
│   └── src/
│       ├── main/
│       │   ├── resources/
│       │   │   ├── application.conf   # HOCON configuration
│       │   │   └── logback.xml        # Logging config
│       │   └── scala/com/supplychain/
│       │       ├── Main.scala                  # Entry point (8-step bootstrap)
│       │       ├── actors/
│       │       │   ├── GuardianActor.scala      # Root — sharding init + service spawn
│       │       │   ├── SimulationManagerActor.scala  # Case router
│       │       │   └── domain/
│       │       │       ├── SupplierActor.scala
│       │       │       ├── WarehouseActor.scala
│       │       │       ├── TruckActor.scala     # 3-state FSM
│       │       │       └── StoreActor.scala
│       │       │   └── workflow/
│       │       │       ├── DisruptionCaseActor.scala   # Core FSM (EventSourced)
│       │       │       ├── LLMInterpreterActor.scala   # Behaviors.withStash
│       │       │       ├── ImpactAnalysisActor.scala   # Behaviors.withTimers
│       │       │       ├── MitigationPlannerActor.scala
│       │       │       ├── ReportActor.scala
│       │       │       └── JournalReadActor.scala      # CQRS PersistenceQuery
│       │       ├── config/
│       │       │   └── AppConfig.scala          # Immutable HOCON model
│       │       ├── domain/
│       │       │   └── model/
│       │       │       ├── Commands.scala        # All actor message types
│       │       │       ├── Entities.scala        # Domain state (SupplierState, etc.)
│       │       │       ├── Events.scala          # Journal events + domain events
│       │       │       └── Responses.scala       # HTTP response types
│       │       ├── graph/
│       │       │   ├── SupplyChainGraph.scala    # Dijkstra blast-radius
│       │       │   └── GraphReplicatorActor.scala # Distributed Data actor
│       │       ├── http/
│       │       │   ├── HttpServer.scala          # Bind + start
│       │       │   ├── Routes.scala              # All REST endpoints + JSON protocol
│       │       │   └── DisruptionStreamRegistry.scala  # BroadcastHub SSE
│       │       ├── llm/
│       │       │   ├── LlmClient.scala           # Trait + Mock + Real (OpenAI)
│       │       │   ├── BedrockLlmClient.scala    # AWS Bedrock impl
│       │       │   ├── PromptBuilder.scala       # MCP-style function-calling prompts
│       │       │   └── JsonValidator.scala       # LLM output validation + conversion
│       │       └── persistence/
│       │           └── PersistenceRepository.scala  # CQRS read-side JDBC
│       └── test/
│           └── scala/com/supplychain/
│               ├── SimulationManagerActorSpec.scala
│               ├── SupplierActorSpec.scala
│               ├── WarehouseActorSpec.scala
│               ├── TruckActorSpec.scala
│               ├── FaultInjectionSpec.scala
│               ├── EndToEndSpec.scala
│               └── JsonValidatorSpec.scala
└── frontend/                    # React dashboard
    ├── src/
    │   ├── main.jsx              # Vite entry point
    │   ├── App.jsx               # Root component: layout + state + SSE
    │   ├── index.css             # CSS variables + global styles
    │   └── components/
    │       ├── DisruptionFeed.jsx  # Left sidebar: incident list
    │       ├── AnalysisView.jsx    # Right panel: AI analysis
    │       └── NetworkMap.jsx      # Center: SVG topology
    ├── package.json
    └── vite.config.js
```

---

## 5. Domain Model

### 5.1 Type Aliases

```scala
// com.supplychain.domain.model (package object or companion)
type SupplierId  = String
type WarehouseId = String
type TruckId     = String
type StoreId     = String
type CaseId      = String
type EntityId    = String
```

Type aliases give names to strings without boxing overhead. They are structural, not nominal — `SupplierId` and `WarehouseId` are both `String` at runtime.

### 5.2 Serialization Marker

```scala
trait CborSerializable
```

All messages that cross actor boundaries (including cluster boundaries) must extend this trait. The `application.conf` binding maps it to Jackson CBOR:

```hocon
akka.actor.serialization-bindings {
  "com.supplychain.domain.model.CborSerializable" = jackson-cbor
}
```

If a message crosses the wire without this trait, Akka will attempt Java serialization, which is disabled (`allow-java-serialization = off`), causing a runtime exception. This was the root cause of the `LWWMap[String, Double]` bug — `Double` is not `CborSerializable`.

### 5.3 Entity States (in-memory, domain actors)

#### SupplierState
```scala
case class SupplierState(
  id:                   SupplierId,
  name:                 String,
  inventory:            Int     = 1000,
  status:               SupplierStatus = SupplierStatus.NORMAL,
  delayDays:            Int     = 0,
  activeOrders:         List[String] = Nil,
  dependentWarehouses:  List[WarehouseId] = Nil
) {
  def withDelay(days: Int): SupplierState   // status → DELAYED, delayDays = days
  def reduceInventory(pct: Double): SupplierState  // inventory -= (inventory * pct).toInt
  def recover(): SupplierState              // status → NORMAL, delayDays = 0
}

sealed trait SupplierStatus
object SupplierStatus { case object NORMAL, DELAYED, HALTED }
```

**Where used**: `SupplierActor` holds this as its mutable behavioral state. On `ApplySupplierDelay`, the actor calls `state.withDelay(days).reduceInventory(0.2)` and replies with `SupplierImpactResult` for the `ImpactAnalysisActor`.

#### WarehouseState
```scala
case class WarehouseState(
  id:                 WarehouseId,
  name:               String,
  stockLevels:        Int   = 500,
  inboundSupplierId:  SupplierId,
  outboundOrders:     List[String] = Nil,
  dependentStores:    List[StoreId] = Nil,
  shortfallActive:    Boolean = false
) {
  def receiveInventory(amount: Int): WarehouseState
  def reduceStock(amount: Int): WarehouseState      // shortfallActive = true if stock < 100
  def clearShortfall(): WarehouseState
}
```

**Where used**: `WarehouseActor`. On `ApplyInventoryReduction`, if stock drops below 100, it fires `ApplyStockShortfall` to each dependent store — this is the automatic cascade.

#### TruckState
```scala
case class TruckState(
  id:                TruckId,
  status:            TruckStatus = TruckStatus.ACTIVE,
  cargoDescription:  String = "",
  assignedWarehouse: WarehouseId,
  assignedRoute:     String = "",
  eta:               Option[Instant] = None
) {
  def breakdown(): TruckState             // status → DISABLED
  def startRecovery(): TruckState         // status → RECOVERING
  def recover(newEta: Instant): TruckState  // status → ACTIVE, eta = Some(newEta)
}

sealed trait TruckStatus
object TruckStatus { case object ACTIVE, DISABLED, RECOVERING }
```

**Where used**: `TruckActor` is a 3-state FSM. The three states are implemented as three separate `Behavior[TruckCommand]` functions (`active`, `disabled`, `recovering`). On `ApplyTruckBreakdown`, the `active` behavior calls `breakdown()`, notifies the assigned warehouse, and returns the `disabled` behavior — completely different command handling from that point on.

#### StoreState
```scala
case class StoreState(
  id:                StoreId,
  name:              String,
  currentStock:      Int    = 200,
  pendingOrders:     List[String] = Nil,
  demandLevel:       Int    = 100,
  demandMultiplier:  Double = 1.0,
  supplyingWarehouse: WarehouseId
) {
  def receiveDemandSpike(multiplier: Double): StoreState
  def receiveShortfall(reduction: Int): StoreState
  def restock(amount: Int): StoreState
}
```

**Where used**: `StoreActor`. Stores are terminal nodes in the supply chain graph — they receive impacts propagated from upstream but do not cascade further.

### 5.4 Journal Events (Persisted)

These events are written to the JDBC `event_journal` table. They are the source of truth. The `CaseState` is rebuilt purely by replaying these events on actor recovery.

```scala
sealed trait CaseEvent extends CborSerializable

case class DisruptionReceived(
  caseId:    CaseId,
  rawText:   String,
  timestamp: Instant
) extends CaseEvent

case class LlmEventExtracted(
  caseId:       CaseId,
  eventType:    String,  // "WAREHOUSE_SHORTFALL" etc.
  entityId:     EntityId,
  severity:     String,
  durationHours: Int,
  confidence:   Double,
  reasoning:    String
) extends CaseEvent

case class EntityImpactRecorded(
  caseId:            CaseId,
  entityId:          EntityId,
  entityType:        String,  // "WAREHOUSE", "STORE", etc.
  impactDescription: String
) extends CaseEvent
// NOTE: One EntityImpactRecorded event per affected entity.
// If 4 entities are affected, 4 events are persisted.

case class MitigationProposed(
  caseId:  CaseId,
  actions: List[SerializableMitigationAction]
) extends CaseEvent

case class CaseCompleted(
  caseId:      CaseId,
  completedAt: Instant
) extends CaseEvent
```

**Why strings instead of enums?** Journal events must be forward-compatible. If you add a new `EventType` member, old journal events with string values can still be deserialized. Sealed traits with case objects would fail deserialization if the class name changes.

**Event tagger**: `CaseCompleted` carries tags `Set("disruption-all", "disruption-completed")`. The `JournalReadActor` subscribes to `"disruption-completed"`. This is how the CQRS read-side knows a case is fully processed.

### 5.5 Response Types (HTTP-facing)

```scala
case class DisruptionReport(
  caseId:         CaseId,
  rawInput:       String,
  extractedEvent: Option[DisruptionEvent],
  impactSummary:  ImpactSummaryData,
  mitigations:    List[MitigationAction],
  auditTrail:     List[AuditEntry],
  createdAt:      Instant,
  completedAt:    Instant
)

case class ImpactSummaryData(
  caseId:           CaseId,
  affectedEntities: List[EntityImpact],
  overallSeverity:  Severity,
  isPartial:        Boolean   // true if AggregationTimeout fired before all updates
)

case class MitigationAction(
  actionType:    MitigationActionType,
  targetEntity:  EntityId,
  priority:      Int,     // 1 = most urgent
  description:   String
)

case class AuditEntry(
  stage:     String,   // "RECEIVED", "LLM_EXTRACTED", "IMPACT_ANALYSED", "MITIGATION_PLANNED", "COMPLETED"
  timestamp: Instant,
  detail:    String
)
```

**`isPartial`**: If the `ImpactAnalysisActor`'s countdown timer fires before all domain actors have responded, the summary is marked partial. The HTTP response is still returned (partial data is better than a timeout), and downstream consumers can inspect `isPartial` to decide whether to re-query.

---

## 6. Actor Hierarchy and Responsibilities

```
ActorSystem("SupplyChainSystem")
└── guardian (GuardianActor)
    ├── ClusterSharding (Akka extension)
    │   ├── Entity region "Supplier" → SupplierActor instances (per S1, S2, S3)
    │   ├── Entity region "Warehouse" → WarehouseActor instances (per W1, W2)
    │   ├── Entity region "Truck" → TruckActor instances (per T1–T4)
    │   └── Entity region "Store" → StoreActor instances (per ST1–ST6)
    ├── graph-replicator (GraphReplicatorActor)
    ├── journal-reader (JournalReadActor)
    └── simulation-manager (SimulationManagerActor)
        └── disruption-case-{uuid} (DisruptionCaseActor) [one per active disruption]
            ├── llm-{caseId} (LLMInterpreterActor) [anonymous, stops after use]
            ├── impact-{caseId} (ImpactAnalysisActor) [anonymous, stops after use]
            ├── mitigation-{caseId} (MitigationPlannerActor) [anonymous, stops after use]
            └── report-{caseId} (ReportActor) [anonymous, stops after use]
```

### 6.1 GuardianActor

**File**: `actors/GuardianActor.scala`

**Role**: System-level bootstrapper. Spawned as the root actor in `Main.scala`. Does not process business logic.

**What it does**:
1. Initializes `ClusterSharding` for all four entity types (Supplier, Warehouse, Truck, Store), binding each to its `EntityTypeKey[Command]`.
2. Builds the static topology using `SupplyChainGraph.buildFromConfig(...)`.
3. Seeds GraphReplicatorActor with the static topology.
4. Spawns `JournalReadActor` (CQRS subscription).
5. Spawns `SimulationManagerActor` with `Behaviors.supervise(...).onFailure[RuntimeException](SupervisorStrategy.restartWithBackoff(...))`.
6. Registers `SimulationManagerActor` with the Receptionist under `ManagerServiceKey`.
7. Handles `GetManagerRef` queries from `Main.scala`.

**Why does GuardianActor exist instead of doing this in Main?** Akka Typed requires all actor operations to happen within actor contexts. You cannot do `sharding.init(...)` or `ctx.spawn(...)` outside an actor.

### 6.2 SimulationManagerActor

**File**: `actors/SimulationManagerActor.scala`

**Role**: Stateful router. Tracks active cases, prevents duplicate processing.

**State**: `Map[CaseId, ActorRef[CaseCommand]]` — maps case IDs to their DisruptionCaseActor references.

**Message handling**:
- `SubmitDisruption(text, replyTo)` → generate UUID4 `caseId`, `ctx.spawn(DisruptionCaseActor(caseId, llmClient, graph, shardedRefs, repository, streamRegistry))`, `watchWith(child, ChildTerminated(caseId))`, send `StartCase` to child.
- `ChildTerminated(caseId)` → remove from active map. This is automatic cleanup via `watchWith`.

**Receptionist key**:
```scala
val ManagerServiceKey: ServiceKey[ManagerCommand] = ServiceKey("simulation-manager")
```
Any node in the cluster can resolve this to the manager's `ActorRef` without knowing which node it lives on.

**Supervision on manager itself**: `restartWithBackoff(minBackoff=1s, maxBackoff=30s, randomFactor=0.2)`. If the manager crashes (e.g., OOM), it restarts and rebuilds its state map from scratch (active cases that were in-flight will be lost, but their journals are intact for recovery on the next submission).

### 6.3 DisruptionCaseActor

**File**: `actors/workflow/DisruptionCaseActor.scala`

This is the most complex actor in the system. It is an `EventSourcedBehavior[CaseCommand, CaseEvent, CaseState]`.

**PersistenceId**: `case-{actorPath.name}` — unique per case.

**CaseState** (rebuilt from journal events):
```scala
case class CaseState(
  caseId:           CaseId,
  phase:            CasePhase,  // PENDING | LLM_INTERPRETED | IMPACT_ANALYSIS | MITIGATION_PROPOSED | COMPLETED
  rawText:          String,
  extractedEvent:   Option[DisruptionEvent],
  impactEntities:   List[EntityImpact],
  mitigations:      List[MitigationAction],
  auditTrail:       List[AuditEntry],
  replyTo:          Option[ActorRef[DisruptionResult]],
  createdAt:        Instant
)
```

**Command Handler** (`commandHandler: (CaseState, CaseCommand) => Effect[CaseEvent, CaseState]`):

Each command produces an `Effect`:
- `persist(event).thenRun(sideEffect)` — write event to journal, then run a function against the new state
- `persist(event).thenStop()` — write event, then stop the actor
- `none` — no persistence (for pure queries)
- `Effect.unhandled` — message rejected

**Side effects in `thenRun`** (not in event handler!):
- Spawning child actors
- Sending messages to other actors
- Publishing to stream registry

**Why are side effects NOT in the event handler?** The event handler is a pure function used both during normal processing AND during journal replay on recovery. Side effects in the event handler would fire twice — once on creation, once on recovery. The `thenRun` callback only fires on initial processing.

**Event Handler** (`eventHandler: (CaseState, CaseEvent) => CaseState`):

Pure function. Takes the old state + event, returns new state. This is what rebuilds state from journal events.

```scala
def eventHandler(state: CaseState, event: CaseEvent): CaseState = event match {
  case DisruptionReceived(caseId, text, ts) =>
    state.copy(rawText = text, phase = LLM_INTERPRETED,
      auditTrail = state.auditTrail :+ AuditEntry("RECEIVED", ts, "..."))

  case LlmEventExtracted(_, eventType, entityId, severity, dur, conf, reasoning) =>
    state.copy(
      extractedEvent = Some(DisruptionEvent(EventType.fromLabel(eventType), ...)),
      phase = IMPACT_ANALYSIS,
      auditTrail = state.auditTrail :+ AuditEntry("LLM_EXTRACTED", ...)
    )
  // ... etc.
}
```

**Snapshot policy**:
```scala
.snapshotWhen { case (_, event, sequenceNr) =>
  sequenceNr % 5 == 0  // snapshot every 5 events
}
.withRetention(RetentionCriteria.snapshotEvery(numberOfEvents=5, keepNSnapshots=2))
```

On recovery, Akka loads the latest snapshot first, then replays only events after the snapshot sequence number. Without snapshots, a case with 50 events would replay all 50 on every recovery.

**`triggerImpactAnalysis`** — internal method called from `commandHandler` after LLM extraction:

```scala
private def triggerImpactAnalysis(
  ctx:       ActorContext[CaseCommand],
  event:     DisruptionEvent,
  graph:     SupplyChainGraph,
  shardRefs: DomainShardedRefs
)(implicit replyTo: ActorRef[ImpactSummaryData]): Unit = {

  val affectedNodes = graph.findAffectedNodes(event.entityId, maxDistance = 3.0)
  val impactActor   = ctx.spawn(ImpactAnalysisActor(event.entityId, affectedNodes.size, replyTo), ...)

  event.eventType match {
    case SUPPLIER_DELAY =>
      shardRefs.getSupplier(event.entityId) ! ApplySupplierDelay(event.durationHours / 24, impactActor)
      // SupplierActor replies with SupplierImpactResult → ImpactAnalysisActor
      // SupplierActor also propagates InventoryReduced to warehouse → warehouse cascades to stores

    case TRUCK_BREAKDOWN =>
      shardRefs.getTruck(event.entityId) ! ApplyTruckBreakdown(event.reasoning, impactActor)

    case WAREHOUSE_SHORTFALL =>
      shardRefs.getWarehouse(event.entityId) ! ApplyInventoryReduction(200, impactActor)

    case DEMAND_SPIKE =>
      // Find stores from graph traversal, apply demand multiplier
      affectedNodes.keys.filter(_.startsWith("ST")).foreach { storeId =>
        shardRefs.getStore(storeId) ! ApplyDemandSpike(1.5, impactActor)
      }
  }
}
```

### 6.4 LLMInterpreterActor

**File**: `actors/workflow/LLMInterpreterActor.scala`

**Pattern**: `Behaviors.withStash(capacity = 10)` — essential because the actor makes an async LLM call and must handle messages that arrive during the wait.

**Two behaviors**:

1. `idle(stash)` — waiting for work:
   - On `InterpretText(caseId, text, replyTo)`:
     - Call `llmClient.extractEvent(caseId, text)` (returns `Future[LlmExtractionResponse]`)
     - `ctx.pipeToSelf(future)(...)` — converts Future to `LlmResponseReceived` / `LlmCallFailed` message
     - Return `waitingForResult(replyTo, stash)` behavior
   - On anything else: stash it

2. `waitingForResult(replyTo, stash)` — waiting for LLM:
   - On `LlmResponseReceived(resp)`:
     - `JsonValidator.validateExtraction(resp)` → `Either[String, LlmExtractionResponse]`
     - Convert to `DisruptionEvent`, reply to `replyTo`
     - `stash.unstashAll(idle(stash))` — process queued messages
   - On `LlmCallFailed(reason)`:
     - Reply with `LlmFailure(reason)`, unstash
   - On `InterpretText(...)`: stash (capacity=10, overflow=exception)

**Why stash?** Without stash, a second `InterpretText` arriving while the actor is waiting would be dropped (unhandled). The stash buffer preserves it. After the current call completes, the actor processes the buffered message.

**Why capacity=10?** Bounded to prevent OOM under pathological load. If >10 requests queue up, an exception is thrown which supervision can catch.

### 6.5 ImpactAnalysisActor

**File**: `actors/workflow/ImpactAnalysisActor.scala`

**Pattern**: `Behaviors.withTimers` — countdown latch with timeout guard.

**Logic**:
```
                        ┌───────────────────────────────┐
                        │  ImpactAnalysisActor           │
                        │  expectedCount = N              │
                        │  collected = []                 │
                        │                                 │
  ImpactUpdate(e1) ─────►  collected = [e1]              │
  ImpactUpdate(e2) ─────►  collected = [e1, e2]          │
       ...                                                │
  ImpactUpdate(eN) ─────►  collected.size == N           │
                        │  → cancel timer                 │
                        │  → replyTo ! Summary(partial=false)
                        │  → Behaviors.stopped            │
                        │                                 │
  AggregationTimeout ───►  (fired before all N arrived)  │
                        │  → replyTo ! Summary(partial=true)
                        │  → Behaviors.stopped            │
                        └───────────────────────────────┘
```

**Why `withTimers`?** The `timers` handle can cancel the pending timer with `timers.cancel(key)`. This is not possible with `ctx.scheduleOnce` (which returns a `Cancellable` that you'd have to thread through state). `withTimers` keeps the cancellable internally and resets cleanly on behavior transitions.

**Severity escalation**:
```scala
private def overallSeverity(collected: List[EntityImpact], baseEvent: DisruptionEvent): Severity = {
  if (collected.size > 3) Severity.HIGH
  else if (collected.size > 1) Severity.MEDIUM
  else baseEvent.severity
}
```

### 6.6 MitigationPlannerActor

**File**: `actors/workflow/MitigationPlannerActor.scala`

Similar to `LLMInterpreterActor` but simpler (no stash — only one message type).

**States**:
- `idle` → receives `PlanMitigation(caseId, impact, replyTo)` → calls `llmClient.proposeMitigations(caseId, impact)` → `pipeToSelf` → `waitingForResult`
- `waitingForResult` → receives `MitigationResponseReceived` → validates via `JsonValidator.validateMitigation` → replies → stops

**Supervision**: `restartWithBackoff(200ms, 10s, 0.1)`. Transient AWS/OpenAI network errors get automatic retries.

### 6.7 ReportActor

**File**: `actors/workflow/ReportActor.scala`

**Role**: Final assembly + persistence.

**States**:
- `idle` → receives `AssembleReport(caseId, rawText, event, impact, mitigations, replyTo)`:
  - Builds `DisruptionReport` with `auditTrail` timestamps (mock: offset from `createdAt`; real: from state accumulated by `DisruptionCaseActor`)
  - Calls `repository.saveReport(report)` (returns `Future[Unit]`)
  - `pipeToSelf(future)(...)` → `DbWriteComplete` or `DbWriteFailed`
  - Returns `waitingForDb` behavior

- `waitingForDb` → receives `DbWriteComplete` or `DbWriteFailed`:
  - In **both cases** replies with `ReportReady(report)` — the event journal is the source of truth; DB write failure doesn't invalidate the case
  - Stops

**Why reply even on DB failure?** The `DisruptionCaseActor` already persisted `CaseCompleted` to the journal. The `JournalReadActor` will eventually rebuild the read-side from the journal. A transient DB failure in the denormalized table is not catastrophic.

### 6.8 JournalReadActor

**File**: `actors/workflow/JournalReadActor.scala`

**Pattern**: CQRS read-side projection using `PersistenceQuery`.

```scala
val readJournal: JdbcReadJournal =
  PersistenceQuery(ctx.system).readJournalFor[JdbcReadJournal](JdbcReadJournal.Identifier)

val (killSwitch, done) =
  readJournal
    .eventsByTag("disruption-completed", Offset.noOffset)  // replay all + subscribe to new
    .viaMat(KillSwitches.single)(Keep.right)
    .toMat(Sink.foreach { envelope =>
      envelope.event match {
        case CaseCompleted(caseId, at) =>
          ctx.log.info(s"[JournalReader] Case $caseId completed at $at")
          // In production: trigger analytics, notifications, SLA checks
      }
    })(Keep.both)
    .run()
```

**`Offset.noOffset`**: Replays all historical events on startup, then streams new ones live. This ensures the read-side is always consistent with the journal, even after a restart.

**KillSwitch**: On `PostStop` signal: `killSwitch.shutdown()` — cleanly terminates the stream and drains in-flight elements. Without this, the stream materializes on a threadpool and leaks after the actor stops.

**Materializer note**: An `ActorSystem[_]` (typed) is NOT directly a `Materializer`. You must use `akka.stream.Materializer(ctx.system)` to create one.

### 6.9 GraphReplicatorActor

**File**: `graph/GraphReplicatorActor.scala`

**Purpose**: Replicate the supply chain graph topology cluster-wide so every node can run Dijkstra without network round-trips.

**Data type**: `LWWMap[String, String]` (Last-Write-Wins Map)
- Key: `"S1->W1"` (via `SupplyChainGraph.edgeKey(from, to)`)
- Value: `"1.0"` (edge weight as string)
- **Why String value (not Double)?** `Double` is `java.lang.Double` at runtime. It is not registered for CBOR serialization. When Akka tries to replicate the map across the cluster, it falls back to Java serialization, which is disabled. Serializing as `String` sidesteps this — Strings are natively handled by Jackson CBOR.

**Consistency model**:
- **Writes**: `WriteAll(timeout=5s)` — blocks until ALL cluster nodes acknowledge. Strong consistency for topology updates (you don't want half the cluster to have a different graph).
- **Reads**: `ReadLocal` — reads from local replica, no network round-trip. Eventual consistency is acceptable for graph queries (a slightly stale topology still gives valid Dijkstra results).

**Startup seeding**:
```scala
val seedMap = initialGraph.edges.foldLeft(EmptyMap) {
  case (m, (k, w)) => m.put(node, k, w.toString)
}
ddata.replicator ! Replicator.Update(GraphEdgesKey, EmptyMap, WriteAll(5s), updateAdapter)(_ => seedMap)
```

Because LWW merge is idempotent and commutative, both node1 and node2 seeding the same topology concurrently converges to the same state.

### 6.10 Domain Actors (Sharded)

**Files**: `actors/domain/`

All four domain actors follow the same pattern:
- `EntityTypeKey[Command]("TypeName")` — registered with ClusterSharding
- Supervision: `Behaviors.supervise(...).onFailure[RuntimeException](SupervisorStrategy.restart)`
- State: immutable case class, updated via `.copy(...)`
- Impact side effect: send `ImpactUpdate(entityId, entityType, description)` to the registered impact actor ref

**TruckActor** is special — it is a 3-state FSM:

```
active ──ApplyTruckBreakdown──► disabled ──StartTruckRecovery──► recovering
  ▲                                                                    │
  └────────────── (after recovery timer / manual reset) ──────────────┘
```

Each state is a separate `Behavior[TruckCommand]` function. When a truck is `disabled`, it ignores `ApplyTruckBreakdown` (already broken) and only accepts `StartTruckRecovery`. This prevents double-breakdown bugs.

---

## 7. Complete Message Flow (End-to-End)

```
1. POST /disruption {"reportText": "Warehouse W1 flooded"}
   │
2. Routes.scala: routes.handleSubmit
   │  akka-http receives, deserializes JSON
   │  
3. AskPattern: simulationManager ? SubmitDisruption(text)
   │  timeout: 120 seconds (from config)
   │
4. SimulationManagerActor receives SubmitDisruption
   │  generate caseId = UUID.randomUUID().toString.take(8).toUpperCase
   │  spawn DisruptionCaseActor(caseId, ...)
   │  watchWith(child, ChildTerminated(caseId))
   │  child ! StartCase(caseId, text, replyTo)
   │
5. DisruptionCaseActor receives StartCase
   │  commandHandler: persist(DisruptionReceived(caseId, text, now))
   │  thenRun { newState =>
   │    spawn LLMInterpreterActor
   │    repository.createReport(caseId, text)  // fire-and-forget
   │    ask LLMInterpreterActor InterpretText(caseId, text)  // pipeToSelf
   │  }
   │
6. LLMInterpreterActor receives InterpretText
   │  llmClient.extractEvent(caseId, text)  → Future[LlmExtractionResponse]
   │  pipeToSelf: LlmResponseReceived | LlmCallFailed
   │
7. LlmClient (Mock/Real/Bedrock) processes text
   │  [MockLlmClient]: keyword match, Thread.sleep(100ms), return deterministic result
   │  [RealLlmClient]: POST https://api.openai.com/v1/chat/completions (sttp)
   │  [BedrockLlmClient]: BedrockRuntimeClient.converse(), strip markdown, parse JSON
   │
8. LLMInterpreterActor receives LlmResponseReceived
   │  JsonValidator.validateExtraction(resp) → Either[String, LlmExtractionResponse]
   │  reply: LlmActorResult(Right(DisruptionEvent(...)))
   │  unstashAll
   │
9. DisruptionCaseActor receives LlmResultReceived(Right(event))
   │  persist(LlmEventExtracted(...))
   │  thenRun { newState =>
   │    graph.findAffectedNodes(event.entityId, maxDistance=3.0)  // Dijkstra
   │    spawn ImpactAnalysisActor(expectedCount=N)
   │    triggerImpactAnalysis(event, graph, shardRefs)
   │  }
   │
10. triggerImpactAnalysis dispatches to sharded domain actors
    │  e.g. for WAREHOUSE_SHORTFALL on W1:
    │    shardRefs.getWarehouse("W1") ! ApplyInventoryReduction(200, impactRef)
    │    WarehouseActor reduces stock → if stock < 100:
    │      shardRefs.getStore("ST1") ! ApplyStockShortfall(100, impactRef)
    │      shardRefs.getStore("ST2") ! ApplyStockShortfall(100, impactRef)
    │      shardRefs.getStore("ST3") ! ApplyStockShortfall(100, impactRef)
    │
11. Domain actors reply ImpactUpdate to ImpactAnalysisActor
    │  ImpactAnalysisActor counts updates
    │  When count == expectedCount (or timeout):
    │    reply ImpactSummaryData to DisruptionCaseActor
    │
12. DisruptionCaseActor receives ImpactSummaryReceived(summary)
    │  persist(EntityImpactRecorded × N)
    │  thenRun { newState =>
    │    spawn MitigationPlannerActor
    │    ask MitigationPlannerActor PlanMitigation(caseId, summary)
    │  }
    │
13. MitigationPlannerActor calls llmClient.proposeMitigations(caseId, summary)
    │  Returns List[MitigationAction] (actionType, target, priority, description)
    │
14. DisruptionCaseActor receives MitigationResultReceived(actions)
    │  persist(MitigationProposed(caseId, actions))
    │  thenRun { newState =>
    │    spawn ReportActor
    │    ask ReportActor AssembleReport(caseId, rawText, event, summary, actions, replyTo)
    │  }
    │
15. ReportActor assembles DisruptionReport
    │  repository.saveReport(report)  → Future[Unit]
    │  pipeToSelf: DbWriteComplete | DbWriteFailed
    │  either way: reply ReportReady(report)
    │
16. DisruptionCaseActor receives ReportResultReceived(ReportReady(report))
    │  persist(CaseCompleted(caseId, now))
    │    ← CaseCompleted tagged "disruption-completed" → JournalReadActor picks it up
    │  thenRun { _ =>
    │    replyTo ! report            ← resolves HTTP ask
    │    streamRegistry.publish(report)  ← pushes to BroadcastHub
    │  }
    │  thenStop()                    ← actor stops, watchWith triggers ChildTerminated
    │
17. DisruptionStreamRegistry receives publish(report)
    │  sourceQueue.offer(report)  → BroadcastHub fan-out
    │  All SSE subscribers receive "data: {...}\n\n"
    │
18. Routes.scala ask resolves
    │  complete(StatusCodes.OK, report.toJson)
    │
19. Client receives HTTP 200 + JSON body
    AND  SSE subscribers receive the same report as an event
```

---

## 8. Event Sourcing and Persistence

### 8.1 Why Event Sourcing?

1. **Audit trail**: Every state transition is recorded as an immutable event. You can replay history, reproduce bugs, and generate time-series analytics.
2. **Recovery**: If the actor crashes mid-workflow, it restarts and replays journal events to restore exactly where it was.
3. **CQRS**: `eventsByTag` enables you to subscribe to events and build read-side projections without touching the write side.
4. **Temporal queries**: "What was the state of this case at 14:00?" is answerable by replaying events up to that timestamp.

### 8.2 Journal Tables

```sql
-- Stores serialized CaseEvent instances
CREATE TABLE event_journal (
  ordering             BIGSERIAL PRIMARY KEY,
  persistence_id       VARCHAR(255) NOT NULL,   -- e.g. "case-disruption-case-F8FB31CB"
  sequence_number      BIGINT NOT NULL,
  deleted              BOOLEAN DEFAULT FALSE,
  writer               VARCHAR(255),
  write_timestamp      BIGINT,                  -- epoch millis
  adapter_manifest     VARCHAR(255),
  event_ser_id         INTEGER NOT NULL,        -- serializer ID (CBOR = some int)
  event_ser_manifest   VARCHAR(255) NOT NULL,   -- fully qualified class name
  event_payload        BYTEA NOT NULL,          -- CBOR-encoded event
  meta_ser_id          INTEGER,
  meta_ser_manifest    VARCHAR(255),
  meta_payload         BYTEA,
  UNIQUE(persistence_id, sequence_number)
);
```

```sql
-- Many-to-many: event → tag. Used by eventsByTag query.
CREATE TABLE event_tag (
  event_id  BIGINT NOT NULL REFERENCES event_journal(ordering) ON DELETE CASCADE,
  tag       VARCHAR(256) NOT NULL,
  PRIMARY KEY(event_id, tag)
);
```

```sql
-- Stores serialized CaseState snapshots
CREATE TABLE snapshot (
  persistence_id       VARCHAR(255) NOT NULL,
  sequence_number      BIGINT NOT NULL,
  created              BIGINT NOT NULL,         -- epoch millis
  snapshot_ser_id      INTEGER NOT NULL,
  snapshot_ser_manifest VARCHAR(255) NOT NULL,
  snapshot_payload     BYTEA NOT NULL,
  PRIMARY KEY(persistence_id, sequence_number)
);
```

### 8.3 Read-Side Table (denormalized)

```sql
CREATE TABLE disruption_reports (
  case_id        VARCHAR(64) PRIMARY KEY,
  raw_input      TEXT NOT NULL,
  event_type     VARCHAR(64),
  entity_id      VARCHAR(64),
  severity       VARCHAR(32),
  duration_hours INTEGER,
  confidence     NUMERIC(5,2),
  impact_summary JSONB,                    -- serialized ImpactSummaryData
  mitigations    JSONB,                    -- serialized List[MitigationAction]
  status         VARCHAR(32) DEFAULT 'PENDING',  -- PENDING | COMPLETED | FAILED
  created_at     TIMESTAMPTZ DEFAULT NOW(),
  completed_at   TIMESTAMPTZ
);
```

**Two writes happen per case**:
1. `createReport(caseId, rawInput)` — on `StartCase`, inserts a row with `status='PENDING'`.
2. `saveReport(report)` — on `ReportActor`, updates the row with extracted data and `status='COMPLETED'`.

**Why a separate read-side table?** The event journal stores binary CBOR. You cannot efficiently query it (e.g., "list all HIGH severity cases from today"). The denormalized table has indexed columns for common queries.

### 8.4 HOCON Configuration Fix (Critical Gotcha)

```hocon
slick.db {
  host = "localhost"        # DEFAULT first
  host = ${?POSTGRES_HOST}  # OVERRIDE if env var exists (HOCON last-wins)
  port = 5432
  port = ${?POSTGRES_PORT}
}
```

**The order matters in HOCON**. `${?ENV_VAR}` is an optional substitution — it applies only if the env var is set. If the hardcoded default appears AFTER the substitution, the substitution is overwritten. This was a real production bug: Docker containers had `POSTGRES_HOST=postgres` in env, but the config was connecting to `localhost` (inside the container, no postgres). Fix: put the default before the substitution.

---

## 9. Akka Cluster and Distribution

### 9.1 Cluster Formation

```hocon
akka.cluster.seed-nodes = [
  "akka://SupplyChainSystem@${node1-host}:2551",
  "akka://SupplyChainSystem@${node2-host}:2552"
]
```

Seed nodes are the bootstrap contacts. On startup:
- node1 tries to connect to node1:2551 (itself) → forms cluster, becomes leader
- node2 tries to connect to node1:2551 → joins node1's cluster

Both nodes participate in gossip after joining.

### 9.2 Split Brain Resolver (SBR)

```hocon
akka.cluster.downing-provider-class = akka.cluster.sbr.SplitBrainResolverProvider
akka.cluster.split-brain-resolver.active-strategy = keep-majority
```

If node1 loses contact with node2, SBR decides which side to keep. `keep-majority` keeps the side with more nodes. Since we have 2 nodes, a split would result in BOTH nodes having 1 (tie), which SBR resolves by keeping the side with the leader (node1 is leader since it joined first).

**Without SBR**: Both halves would remain "Up" and accept writes independently, causing split-brain divergence.

### 9.3 Cluster Sharding

```scala
// In GuardianActor
val sharding = ClusterSharding(ctx.system)

val supplierTypeKey = EntityTypeKey[SupplierCommand]("Supplier")
sharding.init(Entity(supplierTypeKey) { entityCtx =>
  SupplierActor(entityCtx.entityId, initialTopology.suppliers(entityCtx.entityId))
})
```

- `entityTypeKey` is a typed tag for the entity type.
- `sharding.init` registers the factory function. The factory is called lazily on first message to that entity.
- `shardRefs.getSupplier("W1")` returns an `EntityRef[SupplierCommand]` — a location-transparent proxy. The message is routed to whichever node hosts the entity.

**How does the system know which node hosts S1?** Consistent hashing of the entity ID string determines the shard number. The ShardCoordinator (a ClusterSingleton) tracks which shard is on which node.

**Shard rebalancing**: When node2 joins, the ShardCoordinator migrates half the shards to node2. Entity actors on node1 stop; when messages arrive on node2 for those entities, they are recreated there.

### 9.4 Receptionist

```scala
// Registration (in GuardianActor)
ctx.system.receptionist ! Receptionist.Register(ManagerServiceKey, simManager)

// Lookup (in Routes.scala or anywhere)
import akka.actor.typed.receptionist.Receptionist
ctx.system.receptionist ! Receptionist.Find(
  ManagerServiceKey,
  ctx.messageAdapter[Receptionist.Listing] { listing =>
    val refs = listing.serviceInstances(ManagerServiceKey)
    // use refs.head
  }
)
```

**Why not pass the ActorRef directly?** On a multi-node cluster, the ref passed during construction might be to an actor on another node. Receptionist handles serialization of the ref across the cluster. Also, if the manager restarts, the Receptionist re-registers the new ref automatically.

### 9.5 Cluster Roles

- **node1**: `AKKA_CLUSTER_ROLE=frontend` — runs HTTP server, accepts requests, spawns DisruptionCaseActors
- **node2**: `AKKA_CLUSTER_ROLE=backend` — hosts sharded domain actors (Supplier, Warehouse, Truck, Store), participates in distributed data replication

In production you'd use role-pinning (`withDataCenter`, `role` filters in sharding) to enforce this separation. In this system it is informational.

---

## 10. LLM Integration Layer

### 10.1 Trait

```scala
trait LlmClient {
  def extractEvent(caseId: CaseId, text: String): Future[LlmExtractionResponse]
  def proposeMitigations(caseId: CaseId, impact: ImpactSummaryData): Future[LlmMitigationResponse]
}
```

All three implementations satisfy this trait. The concrete implementation is injected at `Main.scala` startup based on `LLM_MODE` env var.

### 10.2 MockLlmClient

**Where**: `llm/LlmClient.scala` (inner class)

**Purpose**: Deterministic, no-network. Used in development, Docker compose (default), and tests.

**extractEvent logic**:
```
text.toLowerCase match:
  contains "supplier|delay|port|customs"    → SUPPLIER_DELAY
  contains "truck|breakdown|vehicle|cargo"  → TRUCK_BREAKDOWN
  contains "warehouse|shortage|flood|stock" → WAREHOUSE_SHORTFALL
  contains "demand|festival|spike|surge"    → DEMAND_SPIKE
  else                                       → SUPPLIER_DELAY (default)

entity matching: first occurrence of "s1","s2","s3","t1","t2","t3","t4","w1","w2","st1"–"st6"
severity: "critical|severe" → HIGH; "minor|small" → LOW; else MEDIUM
duration: "week" → 168h; "day" → 72h; else 48h
```

**proposeMitigations** returns hardcoded plans per event type — no LLM call needed. Simulates 100ms latency with `Thread.sleep(100)` inside a blocking dispatcher.

### 10.3 RealLlmClient (OpenAI)

**Where**: `llm/LlmClient.scala`

**Dependencies**: `sttp.client3.SttpBackend` (AkkaHttpBackend) — non-blocking HTTP using Akka streams under the hood.

**extractEvent**:
```
POST /chat/completions
{
  "model": "gpt-4o-mini",
  "messages": [{"role": "user", "content": PromptBuilder.buildExtractionPrompt(text)}],
  "response_format": {"type": "json_object"},
  "max_tokens": 512,
  "temperature": 0.1
}
```

Uses `response_format: json_object` to force the model to emit only valid JSON — no markdown wrappers, no preamble.

### 10.4 BedrockLlmClient

**Where**: `llm/BedrockLlmClient.scala`

**Auth**: `StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKey, secretKey))`

**API**: AWS Bedrock Converse API (model-agnostic API, works with Claude, Titan, Llama, etc.)

```scala
val request = ConverseRequest.builder()
  .modelId(modelId)
  .system(SystemContentBlock.builder().text(systemPrompt).build())
  .messages(Message.builder()
    .role(ConversationRole.USER)
    .content(ContentBlock.fromText(userPrompt))
    .build())
  .inferenceConfig(InferenceConfiguration.builder()
    .maxTokens(1024)
    .temperature(0.2f)
    .build())
  .build()

val response = bedrockClient.converse(request)
val rawText = response.output().message().content().get(0).text()
```

**Markdown stripping**: Claude models sometimes wrap JSON in ` ```json ... ``` `. The client strips this before passing to `JsonValidator`.

**Blocking concern**: AWS SDK Java calls are synchronous. The `BedrockLlmClient` wraps calls in `Future { blocking { ... } }` using a dedicated dispatcher. This runs on a thread pool separate from the actor dispatcher, preventing actor thread starvation.

### 10.5 PromptBuilder

**File**: `llm/PromptBuilder.scala`

**Style**: MCP (Model Context Protocol) style function-calling. The prompt defines the output schema explicitly, enumerating valid values.

**buildExtractionPrompt** (excerpt):
```
You are a supply chain disruption analyst. Extract structured event data from the disruption report.

AVAILABLE EVENT TYPES:
- SUPPLIER_DELAY: A supplier has delayed or halted shipments
- TRUCK_BREAKDOWN: A delivery truck has broken down or is stuck
- WAREHOUSE_SHORTFALL: A warehouse has stock/capacity issues
- DEMAND_SPIKE: Unusual demand increase at stores

KNOWN ENTITY IDs:
Suppliers: S1, S2, S3
Warehouses: W1, W2
Trucks: T1, T2, T3, T4
Stores: ST1, ST2, ST3, ST4, ST5, ST6

OUTPUT FORMAT (JSON only, no preamble):
{
  "eventType": "<one of the above>",
  "entityId": "<entity ID from above>",
  "severity": "<LOW|MEDIUM|HIGH|CRITICAL>",
  "durationHours": <integer>,
  "confidence": <float 0.0-1.0>,
  "reasoning": "<one sentence>"
}

DISRUPTION REPORT: {text}
```

**buildMitigationPrompt** includes the full impact summary (entities + descriptions + severity) and lists available recovery action types with their semantics.

### 10.6 JsonValidator

**File**: `llm/JsonValidator.scala`

**Purpose**: LLM output is untrusted. Even with `response_format: json_object`, the model may produce valid JSON with wrong field names, out-of-range values, or unknown enum labels.

```scala
object JsonValidator {
  def validateExtraction(rawJson: String): Either[String, LlmExtractionResponse] = {
    Try(rawJson.parseJson.convertTo[LlmExtractionResponse]).toEither
      .left.map(_.getMessage)
      .flatMap(validateExtractionTyped)
  }

  def validateExtractionTyped(resp: LlmExtractionResponse): Either[String, LlmExtractionResponse] = {
    if (!validEventTypes.contains(resp.eventType))
      Left(s"Unknown eventType: ${resp.eventType}")
    else if (resp.confidence < 0.0 || resp.confidence > 1.0)
      Left(s"Confidence out of range: ${resp.confidence}")
    else
      Right(resp)
  }

  // Normalizes entity IDs: "w 1" → "W1", "supplier_s2" → "S2", etc.
  def normalizeId(raw: String): String = ...
}
```

**What happens on validation failure?** `LlmCallFailed(reason)` is piped to `DisruptionCaseActor`, which falls back to a default event or propagates the failure. In mock mode, this never happens.

---

## 11. Graph and Impact Analysis

### 11.1 SupplyChainGraph

**File**: `graph/SupplyChainGraph.scala`

**Data structure**: Directed adjacency list — `Map[String, Set[(String, Double)]]`

```
Node  →  Set[(neighbor, weight)]
"S1"  →  {("W1", 1.0)}
"S3"  →  {("W1", 1.0), ("W2", 1.0)}
"W1"  →  {("ST1", 1.0), ("ST2", 1.0), ("ST3", 1.0)}
"T1"  →  {("W1", 1.0)}
...
```

**Static topology** (from `buildFromConfig`):
- S1 → W1
- S2 → W2
- S3 → W1, W2 (shared supplier)
- T1, T2 → W1
- T3, T4 → W2
- W1 → ST1, ST2, ST3
- W2 → ST4, ST5, ST6

**`findAffectedNodes(startNode, maxDistance)`**: Modified Dijkstra's algorithm.

```scala
def findAffectedNodes(startNode: String, maxDistance: Double): Map[String, Double] = {
  // Priority queue ordered by distance (ascending)
  val pq = mutable.PriorityQueue.empty[(Double, String)](Ordering.by(-_._1))
  val dist = mutable.Map(startNode -> 0.0)
  pq.enqueue((0.0, startNode))

  while (pq.nonEmpty) {
    val (d, node) = pq.dequeue()
    if (d <= dist.getOrElse(node, Double.MaxValue)) {
      adj.getOrElse(node, Set.empty).foreach { case (neighbor, weight) =>
        val newDist = d + weight
        if (newDist <= maxDistance && newDist < dist.getOrElse(neighbor, Double.MaxValue)) {
          dist(neighbor) = newDist
          pq.enqueue((newDist, neighbor))
        }
      }
    }
  }
  dist - startNode  // remove the start node from results
}
```

**`maxDistance = 3.0`**: With weight=1.0 per edge, this reaches 3 hops. S1 → W1 (dist=1) → ST1 (dist=2). So a supplier disruption impacts downstream warehouses AND stores. A warehouse disruption (starting at W1) impacts stores (W1→ST1=dist 1). A truck disruption (starting at T1) impacts W1 (dist=1), then ST1/ST2/ST3 (dist=2).

**`edgeKey` canonical function**:
```scala
object SupplyChainGraph {
  val EdgeSeparator = "->"
  def edgeKey(from: String, to: String): String = s"$from$EdgeSeparator$to"
}
```

Both `SupplyChainGraph` and `GraphReplicatorActor` use this to ensure consistent key format in the LWWMap.

---

## 12. HTTP Layer and SSE Streaming

### 12.1 Routes Overview

**File**: `http/Routes.scala`

All routes are defined as a single `Route` value using Akka HTTP DSL:

```scala
val routes: Route = cors() {
  concat(
    path("health") { get { ... } },
    path("disruption" / "stream") { get { ... } },    // SSE — must be before /disruption
    path("disruption") {
      concat(
        get { ... },   // list reports
        post { ... }   // submit disruption
      )
    },
    path("disruption" / Segment) { caseId => get { ... } },
    path("cluster" / "status") { get { ... } },
    pathEndOrSingleSlash { get { ... } }
  )
}
```

**Route ordering matters**: `/disruption/stream` must be registered before `/disruption` because `concat` tries routes in order. If `/disruption` (a plain path) matched first, `/disruption/stream` would never be reached.

### 12.2 POST /disruption

```scala
post {
  entity(as[SubmitRequest]) { req =>
    val future = simulationManager.ask[DisruptionResult](
      replyTo => SubmitDisruption(req.reportText, replyTo)
    )(timeout = config.http.askTimeoutSeconds.seconds, scheduler = system.scheduler)

    onSuccess(future) {
      case report: DisruptionReport => complete(StatusCodes.OK, report.toJson)
      case failed: DisruptionFailed => complete(StatusCodes.UnprocessableEntity, ...)
    }
  }
}
```

**AskPattern**: The HTTP handler is a `Future`-based ask to the actor. The route thread does not block — it registers a callback via `onSuccess`. If the actor doesn't respond within 120 seconds, the `AskTimeoutException` causes a 503.

### 12.3 SSE Endpoint

```scala
path("disruption" / "stream") {
  get {
    complete(
      HttpEntity.Chunked.fromData(
        ContentType(MediaTypes.`text/event-stream`),
        streamRegistry.source
          .map { report =>
            ByteString(s"data: ${report.toJson.compactPrint}\n\n")
          }
          .keepAlive(15.seconds, () => ByteString(": heartbeat\n\n"))
      )
    )
  }
}
```

**Why `MediaTypes.\`text/event-stream\`` without `.withCharset`?** `text/event-stream` is a `WithFixedCharset` media type (UTF-8 is mandated by the spec). Calling `.withCharset(UTF-8)` doesn't exist on this type — it would be a compile error.

**Why `.map` before `.keepAlive`?**
- `streamRegistry.source` is `Source[DisruptionReport, NotUsed]`
- `.map(report => ByteString(...))` produces `Source[ByteString, NotUsed]`
- `.keepAlive(15s, () => ByteString(...))` injects `ByteString` elements when the source is silent
- If you do `.keepAlive` first on the `DisruptionReport` source, then `.map`, the compiler widens the element type to `Equals` (the LCA of `DisruptionReport` and `ByteString`), which then fails to compile as `Source[ByteString, _]`.

### 12.4 DisruptionStreamRegistry

**File**: `http/DisruptionStreamRegistry.scala`

```scala
class DisruptionStreamRegistry {
  private var _queue:  Option[SourceQueueWithComplete[DisruptionReport]] = None
  private var _source: Option[Source[DisruptionReport, NotUsed]] = None

  def initialize(system: ActorSystem[_]): Unit = {
    implicit val mat: Materializer = akka.stream.Materializer(system)
    val (queue, source) = Source
      .queue[DisruptionReport](256, OverflowStrategy.dropHead)
      .toMat(BroadcastHub.sink(bufferSize = 256))(Keep.both)
      .run()
    _queue  = Some(queue)
    _source = Some(source)
  }

  def publish(report: DisruptionReport): Unit =
    _queue.foreach(_.offer(report))

  def source: Source[DisruptionReport, NotUsed] =
    _source.getOrElse(Source.empty)
}
```

**Why `initialize` separate from constructor?** The `Materializer` requires a running `ActorSystem`. The registry is constructed in `Main.scala` before the system starts, then `initialize` is called after.

**BroadcastHub**: Allows N consumers (`/disruption/stream` clients) to subscribe independently to the same source. Each consumer gets its own buffer (256 elements). Slow consumers don't block fast consumers. When a consumer disconnects, their buffer is GC'd.

**OverflowStrategy.dropHead**: If 256 unread reports accumulate in the queue (e.g., producer is faster than consumers), the oldest entry is dropped. This prevents unbounded memory growth under backpressure.

### 12.5 JSON Serialization

**File**: `http/Routes.scala` (inner object `HttpJsonProtocol`)

Spray-json requires explicit format definitions for each type:

```scala
object HttpJsonProtocol extends DefaultJsonProtocol {
  implicit val instantFmt: JsonFormat[Instant] = new JsonFormat[Instant] {
    def write(i: Instant) = JsString(i.toString)
    def read(v: JsValue): Instant = v match {
      case JsString(s) => Instant.parse(s)
      case _ => deserializationError("Instant expected")
    }
  }
  
  implicit val entityImpactFmt   = jsonFormat3(EntityImpact)
  implicit val impactSummaryFmt  = jsonFormat4(ImpactSummaryData)
  implicit val disruptionEventFmt = jsonFormat6(DisruptionEvent.apply)
  implicit val mitigationFmt     = jsonFormat4(MitigationAction.apply)
  // ... etc.
}
```

**Enum serialization**: `EventType`, `Severity`, `MitigationActionType` are sealed traits with `case object` members. They have a `label: String` method and a `fromLabel(s: String)` factory. The JSON format writes `label`, reads via `fromLabel`.

---

## 13. Database Schema

### Full init.sql

```sql
-- Akka Persistence JDBC tables (required by akka-persistence-jdbc plugin)
CREATE TABLE IF NOT EXISTS event_journal (
  ordering              BIGSERIAL,
  persistence_id        VARCHAR(255) NOT NULL,
  sequence_number       BIGINT NOT NULL,
  deleted               BOOLEAN DEFAULT FALSE NOT NULL,
  writer                VARCHAR(255) NOT NULL,
  write_timestamp       BIGINT NOT NULL,
  adapter_manifest      VARCHAR(255),
  event_ser_id          INTEGER NOT NULL,
  event_ser_manifest    VARCHAR(255) NOT NULL,
  event_payload         BYTEA NOT NULL,
  meta_ser_id           INTEGER,
  meta_ser_manifest     VARCHAR(255),
  meta_payload          BYTEA,
  PRIMARY KEY (persistence_id, sequence_number)
);

CREATE UNIQUE INDEX IF NOT EXISTS event_journal_ordering_idx ON event_journal(ordering);

CREATE TABLE IF NOT EXISTS event_tag (
  event_id  BIGINT NOT NULL,
  tag       VARCHAR(256),
  PRIMARY KEY (event_id, tag),
  CONSTRAINT fk_event_journal FOREIGN KEY (event_id)
    REFERENCES event_journal(ordering) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS snapshot (
  persistence_id        VARCHAR(255) NOT NULL,
  sequence_number       BIGINT NOT NULL,
  created               BIGINT NOT NULL,
  snapshot_ser_id       INTEGER NOT NULL,
  snapshot_ser_manifest VARCHAR(255) NOT NULL,
  snapshot_payload      BYTEA NOT NULL,
  PRIMARY KEY (persistence_id, sequence_number)
);

-- Application read-side (denormalized for querying)
CREATE TABLE IF NOT EXISTS disruption_reports (
  case_id        VARCHAR(64) PRIMARY KEY,
  raw_input      TEXT NOT NULL,
  event_type     VARCHAR(64),
  entity_id      VARCHAR(64),
  severity       VARCHAR(32),
  duration_hours INTEGER,
  confidence     NUMERIC(5,2),
  impact_summary JSONB,
  mitigations    JSONB,
  status         VARCHAR(32) NOT NULL DEFAULT 'PENDING',
  created_at     TIMESTAMPTZ NOT NULL DEFAULT NOW(),
  completed_at   TIMESTAMPTZ
);

CREATE INDEX IF NOT EXISTS disruption_reports_status_idx ON disruption_reports(status);
CREATE INDEX IF NOT EXISTS disruption_reports_entity_idx ON disruption_reports(entity_id);
CREATE INDEX IF NOT EXISTS disruption_reports_created_idx ON disruption_reports(created_at DESC);
```

### PersistenceRepository

**File**: `persistence/PersistenceRepository.scala`

Uses raw JDBC (not Slick) for read-side reads/writes. Runs on a dedicated `ExecutionContext` with 4 threads (`Executors.newFixedThreadPool(4)`) to isolate blocking JDBC from the Akka dispatcher.

```scala
def listReports(limit: Int = 20): Future[List[DisruptionReport]] = Future {
  val conn = DriverManager.getConnection(jdbcUrl, user, password)
  try {
    val rs = conn.prepareStatement(
      "SELECT * FROM disruption_reports WHERE status='COMPLETED' ORDER BY created_at DESC LIMIT ?"
    ).also(_.setInt(1, limit)).executeQuery()
    val buf = ListBuffer[DisruptionReport]()
    while (rs.next()) buf += mapRowToReport(rs)
    buf.toList
  } finally conn.close()
}(blockingEc)
```

**NoOpPersistenceRepository**: A stub that returns `Future.successful(())` for all writes and `Future.successful(Nil)` for reads. Used in unit tests to avoid requiring a live database.

---

## 14. Configuration Reference

### Full application.conf (annotated)

```hocon
akka {
  actor {
    provider = cluster                  # enables Cluster + Sharding + DistributedData
    allow-java-serialization = off      # CRITICAL: forces CBOR; any non-registered message FAILS
    serialization-bindings {
      "com.supplychain.domain.model.CborSerializable" = jackson-cbor
    }
  }

  remote.artery {
    transport = tcp
    canonical {
      hostname = "127.0.0.1"
      hostname = ${?AKKA_HOSTNAME}      # env override for Docker (node1, node2)
      port = 2551
      port = ${?AKKA_PORT}
    }
    bind {
      hostname = "0.0.0.0"             # bind to all interfaces in Docker
      port = ${akka.remote.artery.canonical.port}
    }
  }

  cluster {
    seed-node-1-host = "127.0.0.1"
    seed-node-1-host = ${?AKKA_SEED_NODE1_HOST}
    seed-node-2-host = "127.0.0.1"
    seed-node-2-host = ${?AKKA_SEED_NODE2_HOST}
    seed-nodes = [
      "akka://SupplyChainSystem@"${akka.cluster.seed-node-1-host}":2551",
      "akka://SupplyChainSystem@"${akka.cluster.seed-node-2-host}":2552"
    ]
    roles = ["frontend"]
    roles = [${?AKKA_CLUSTER_ROLE}]    # "frontend" or "backend"
    downing-provider-class = akka.cluster.sbr.SplitBrainResolverProvider
  }

  persistence {
    journal.plugin = "jdbc-journal"
    snapshot-store.plugin = "jdbc-snapshot-store"
  }

  loggers = ["akka.event.slf4j.Slf4jLogger"]
  loglevel = "INFO"
  log-dead-letters = 10
  log-dead-letters-during-shutdown = off
}

# JDBC plugin configs
jdbc-journal {
  slick = ${slick}
  circuit-breaker {
    max-failures = 10
    call-timeout = 30s
    reset-timeout = 30s
  }
}

jdbc-snapshot-store {
  slick = ${slick}
  circuit-breaker {
    max-failures = 10
    call-timeout = 30s
    reset-timeout = 30s
  }
}

jdbc-read-journal {
  slick = ${slick}
}

slick {
  profile = "slick.jdbc.PostgresProfile$"
  db {
    host = "localhost"
    host = ${?POSTGRES_HOST}           # ORDER MATTERS: default first, override second
    port = 5432
    port = ${?POSTGRES_PORT}
    name = "supplychain"
    name = ${?POSTGRES_DB}
    url = "jdbc:postgresql://"${slick.db.host}":"${slick.db.port}"/"${slick.db.name}"?reWriteBatchedInserts=true"
    user = "sc_user"
    user = ${?POSTGRES_USER}
    password = "sc_pass"
    password = ${?POSTGRES_PASSWORD}
    driver = "org.postgresql.Driver"
    numThreads = 5
    maxConnections = 5
    minConnections = 1
  }
}

supplychain {
  http {
    host = "0.0.0.0"
    port = 8080
    port = ${?HTTP_PORT}
    ask-timeout-seconds = 120
  }

  llm {
    mode = "mock"
    mode = ${?LLM_MODE}               # "mock" | "real" | "bedrock"
    api-key = "mock-key"
    api-key = ${?OPENAI_API_KEY}
    base-url = "https://api.openai.com/v1"
    model = "gpt-4o-mini"
    model = ${?OPENAI_MODEL}
    bedrock-region = "us-east-1"
    bedrock-region = ${?AWS_REGION}
    bedrock-model-id = "anthropic.claude-3-haiku-20240307-v1:0"
    bedrock-model-id = ${?BEDROCK_MODEL_ID}
    timeout-seconds = 30
    max-retries = 3
  }

  simulation {
    suppliers  = ["S1", "S2", "S3"]
    warehouses = ["W1", "W2"]
    trucks     = ["T1", "T2", "T3", "T4"]
    stores     = ["ST1", "ST2", "ST3", "ST4", "ST5", "ST6"]
    aggregation-timeout-seconds = 5
  }
}
```

---

## 15. Frontend Architecture

### 15.1 App.jsx — State and Effects

```
State:
  cases[]          ← DisruptionReport list (feed + history)
  activeCase       ← Currently selected case (drives Analysis + Map highlight)
  inputText        ← Controlled input for disruption text
  isSubmitting     ← Prevents double-submit
  submitError      ← Inline error display
  clusterStatus    ← Cluster membership info (node count)

Effects:
  1. Mount: GET /disruption → populate historical cases
  2. Mount: EventSource /disruption/stream → append new cases + set as active
  3. Mount: poll GET /cluster/status every 15s

Derived:
  affectedEntityIds = deduplicated union of:
    activeCase.impactSummary.affectedEntities[].entityId
    activeCase.extractedEvent.entityId
  → passed to NetworkMap as prop
```

**Why SSE instead of WebSocket?** SSE is server-push only (unidirectional). The dashboard only needs to receive updates, not send them over the persistent connection. SSE is simpler: native `EventSource` API, automatic reconnection, works over HTTP/1.1 without upgrade headers.

**Deduplication**:
```jsx
// SSE handler (has dedup):
setCases(prev => {
  if (prev.find(c => c.caseId === report.caseId)) return prev;
  return [report, ...prev];
});

// POST handler (also has dedup after fix):
setCases(prev =>
  prev.find(c => c.caseId === report.caseId) ? prev : [report, ...prev]
);
```

**Why is dedup needed?** The HTTP POST response and the SSE stream can both deliver the same case. If the SSE fires before React processes the POST response state update, both add the case. The dedup check by `caseId` prevents the duplicate.

### 15.2 NetworkMap.jsx

The topology is **hard-coded** as `NODES` and `EDGES` constants at module level. It does not fetch topology from the backend. This is intentional for the course project — the backend's actual entity IDs (S1, W1, ST3, etc.) match the hard-coded node IDs, so affected node highlighting works.

```jsx
const NODES = [
  { id: 'S1', type: 'SUPPLIER',   x: 80,  y: 140 },
  { id: 'W1', type: 'WAREHOUSE',  x: 420, y: 200 },
  // ...
];

const EDGES = [
  { from: 'S1', to: 'W1' },
  // ...
];
```

**Affected node highlighting**:
```jsx
const NetworkMap = ({ affectedNodes = [] }) => (
  // affectedNodes = ["W1", "ST1", "ST2", "ST3"] for a W1 disruption

  {EDGES.map((edge, i) => {
    const affected = affectedNodes.includes(edge.from) || affectedNodes.includes(edge.to);
    return (
      <motion.line
        stroke={affected ? 'rgba(248,113,113,0.5)' : 'rgba(255,255,255,0.06)'}
        strokeWidth={affected ? 1.5 : 1}
        ...
      />
    );
  })}

  {NODES.map((node, i) => {
    const affected = affectedNodes.includes(node.id);
    return (
      <motion.g style={{ filter: affected ? 'url(#affected-glow)' : 'none' }}>
        {affected && <motion.circle animate={{ r: [r+4, r+12], opacity: [0.5, 0] }} />}
        <circle fill={affected ? 'rgba(248,113,113,0.15)' : 'rgba(0,0,0,0.4)'} />
      </motion.g>
    );
  })}
);
```

**SVG structure**: The SVG uses `viewBox="0 0 760 580"` with `preserveAspectRatio="xMidYMid meet"`. This makes the map scale proportionally inside its container without overflow.

### 15.3 DisruptionFeed.jsx

Each feed item renders from a `DisruptionReport`. The severity color and badge are derived:

```jsx
const severityBorderColor = (s) => {
  switch (s?.toUpperCase()) {
    case 'CRITICAL': return 'var(--red)';
    case 'HIGH':     return 'var(--orange)';
    case 'LOW':      return 'var(--green)';
    default:         return 'var(--amber)';  // MEDIUM
  }
};
```

The left 2px colored bar is a `div` with `width: 2, background: borderColor`.

Text truncation: `WebkitLineClamp: 2` + `WebkitBoxOrient: 'vertical'` + `display: '-webkit-box'` — standard cross-browser 2-line clamp.

### 15.4 AnalysisView.jsx

The confidence bar is animated with Framer Motion:
```jsx
<motion.div
  initial={{ width: 0 }}
  animate={{ width: `${confidence}%` }}
  transition={{ duration: 0.5 }}
  style={{ height: '100%', background: 'var(--green)', borderRadius: 2 }}
/>
```

This creates a smooth fill animation when switching between cases. The outer container is `width: 60px` (fixed), inner div animates from 0 to percentage.

### 15.5 CSS Variables

```css
:root {
  --bg:        #0f0f0f;   /* near-black background */
  --surface:   #171717;   /* card/panel background */
  --surface-2: #1e1e1e;   /* hover/active state */
  --border:    #2a2a2a;   /* subtle borders */
  --border-2:  #383838;   /* focus/active borders */

  --text-1:    #e8e8e8;   /* primary text */
  --text-2:    #777;      /* secondary/labels */
  --text-3:    #444;      /* disabled/placeholder */

  --green:     #22c55e;   /* Store color, positive, active */
  --amber:     #fbbf24;   /* Truck color, MEDIUM severity */
  --orange:    #fb923c;   /* HIGH severity */
  --red:       #f87171;   /* CRITICAL severity, affected nodes */
  --blue:      #60a5fa;   /* Supplier color */
  --purple:    #a78bfa;   /* Warehouse color */
}
```

The color assignments are semantic: node type colors match the legend in the Network Map header. Severity colors map to the same scale used in the badge classes.

---

## 16. Docker and Deployment

### 16.1 Dockerfile (Multi-Stage)

```dockerfile
# Stage 1: Build fat JAR
FROM eclipse-temurin:11-jdk-jammy AS builder
WORKDIR /app
COPY apache-maven-3.9.6 /opt/maven
COPY pom.xml .
COPY src ./src
RUN /opt/maven/bin/mvn package -Dmaven.test.skip=true -q

# Stage 2: Minimal runtime
FROM eclipse-temurin:11-jre-jammy
WORKDIR /app
COPY --from=builder /app/target/supply-chain-system-1.0.0.jar app.jar
EXPOSE 8080 2551 2552
ENTRYPOINT ["java", "-jar", "app.jar"]
```

**Why multi-stage?** The JDK (builder) image is ~600MB. The JRE (runtime) image is ~250MB. Multi-stage discards the build tools, Maven cache, and Scala compiler from the final image. Only the fat JAR is copied.

**Why fat JAR?** `maven-shade-plugin` bundles all dependencies into a single JAR. No `CLASSPATH` or lib directory needed in the container.

**Why vendored Maven?** Eliminates CI/CD dependency on a globally installed Maven version. The exact version (3.9.6) is committed to the repo.

### 16.2 docker-compose.yml (Annotated)

```yaml
services:
  postgres:
    image: postgres:16-alpine
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U sc_user -d supplychain"]
      interval: 5s
      retries: 10
    # init.sql creates all tables on first start

  node1:
    build: .
    depends_on:
      postgres:
        condition: service_healthy     # waits for pg_isready, not just container start
    environment:
      AKKA_PORT: "2551"
      AKKA_HOSTNAME: "node1"          # registered in Akka Cluster gossip
      AKKA_SEED_NODE1_HOST: "node1"   # resolves inside Docker network
      AKKA_SEED_NODE2_HOST: "node2"
      HTTP_PORT: "8080"
      POSTGRES_HOST: postgres         # Docker service DNS name
      LLM_MODE: mock
      AKKA_CLUSTER_ROLE: frontend
    ports:
      - "8080:8080"
      - "2551:2551"
    healthcheck:
      test: ["CMD-SHELL", "curl -f http://localhost:8080/health || exit 1"]

  node2:
    depends_on:
      node1:
        condition: service_healthy     # node2 must join AFTER node1 is up
      postgres:
        condition: service_healthy
    environment:
      AKKA_PORT: "2552"
      AKKA_CLUSTER_ROLE: backend
```

**Why `node2` depends on `node1: service_healthy`?** Akka Cluster seed-node joining is sensitive to timing. If node2 starts before node1 has formed its own cluster, node2's join attempt fails and it retries with exponential backoff. Making node2 wait for node1's health check (which includes HTTP server being up) ensures cluster formation is clean.

**Why both nodes connect to the same postgres?** The Akka persistence journal must be shared — all cluster nodes write to and read from the same event store. This is what enables cross-node recovery: if an actor migrates from node1 to node2, it loads its journal from postgres.

### 16.3 Startup Sequence in Main.scala

```
1. ConfigFactory.load() — loads application.conf
2. AppConfig.fromConfig(config) — parse typed config model
3. DisruptionStreamRegistry.create() — pre-system (not yet initialized)
4. Instantiate LLM client (MockLlmClient or BedrockLlmClient)
5. Build PersistenceRepository (JDBC URL from env)
6. Determine AKKA_PORT, build custom config for cluster
7. ActorSystem(GuardianActor.apply(...), "SupplyChainSystem") — starts the cluster
8. streamRegistry.initialize(system) — materializes BroadcastHub
9. (If real LLM mode) create RealLlmClient with AkkaHttpBackend
10. Ask GuardianActor for SimulationManagerActor ref (Await.result, 12s timeout)
11. Build Routes(managerRef, repository, config, streamRegistry)
12. HttpServer.start(routes, config.http.host, config.http.port)
13. system.log "System online at http://..."
14. JVM shutdown hook: system.terminate(), Await(15s)
```

**Why `Await.result` in step 10?** `Main` is not an actor — it's a `scala.App`. It can't use `pipeToSelf` or `AskPattern.toFuture`. `Await.result` blocks the main thread until the manager ref is resolved. This is the ONLY acceptable use of blocking in this codebase — it's one-time startup, not a hot path.

**If the 12s timeout fires**: `Await.result` throws `TimeoutException`, JVM exits. Fix: ensure PostgreSQL is healthy before starting (it takes time for the Akka Persistence plugin to connect and the cluster to form).

---

## 17. Design Patterns — Explained with Context

### 17.1 Event Sourcing

**What**: Instead of storing current state, store the sequence of events that led to that state.

**Why here**: Disruption cases have a strict lifecycle (5 phases). If the system crashes mid-processing, replaying events restores exactly where it was. Also, the `auditTrail` in `DisruptionReport` is built automatically from journal events — no separate logging needed.

**Tradeoff**: Journal grows indefinitely. Mitigated by snapshots (every 5 events) + retention policy (keep 2 snapshots).

### 17.2 CQRS (Command Query Responsibility Segregation)

**What**: Write side (`DisruptionCaseActor`, event journal) and read side (`disruption_reports` table, `JournalReadActor`) are separate.

**Why here**: The event journal stores binary CBOR — you can't SELECT WHERE severity='HIGH'. The denormalized table has SQL-queryable columns.

**Eventual consistency**: The `disruption_reports` row goes from PENDING → COMPLETED when `ReportActor` writes it. Between these, `GET /disruption` might not show a completed case. This is acceptable.

### 17.3 Ask Pattern

**What**: Request-response over actors using `actor.ask(replyTo => Message(replyTo))`.

**Why here**: HTTP routes are `Future`-based. You can't block a thread waiting for an actor response. `ask` returns a `Future` that resolves when the actor sends a reply.

**Timeout**: 120 seconds. If the full workflow (LLM call + impact analysis + mitigation + DB write) takes more than 120 seconds, the HTTP client gets a 503. In mock mode it takes ~1 second.

### 17.4 pipeToSelf

**What**: `ctx.pipeToSelf(someFuture)(result => MyMessage(result))` converts a `Future[T]` into an actor message, delivered to itself.

**Why here**: LLM calls return `Future[LlmResponse]`. Calling `.map` or `.foreach` on that future in an actor is dangerous — the callback runs on a different thread and mutating actor state from outside the actor is a concurrency bug. `pipeToSelf` ensures the result is processed safely as a regular actor message.

### 17.5 Behaviors.withStash

**What**: A buffer that holds messages for later processing while the actor is busy.

**Why here**: `LLMInterpreterActor` makes an async LLM call. During this time, if another `InterpretText` arrives (concurrent disruptions hitting the same actor), it cannot be processed immediately. Stash buffers it; after the current call completes, `unstashAll` replays buffered messages.

**Alternative without stash**: Use `Behaviors.withTimers` + a queue field. More boilerplate, same effect. `withStash` is the idiomatic Akka Typed approach.

### 17.6 Behaviors.withTimers

**What**: Access to a `TimerScheduler` within the actor for scheduling messages to self.

**Why here**: `ImpactAnalysisActor` needs to time out if not all domain actors respond. `timers.startSingleTimer(key, AggregationTimeout, 5.seconds)` schedules the timeout. When all responses arrive early, `timers.cancel(key)` cancels it. This is cleaner than `ctx.scheduleOnce` because the `Cancellable` is managed internally.

### 17.7 Supervision

**What**: Strategy for restarting or stopping child actors on failure.

**Three strategies used**:

| Strategy | Used On | Why |
|---|---|---|
| `restartWithBackoff(200ms, 10s)` | LLMInterpreterActor, MitigationPlannerActor, SimulationManagerActor | Transient network failures → retry with delay. Exponential backoff prevents thundering herd on LLM API rate limit. |
| `restart` | Domain actors, ReportActor | State can be rebuilt from config/DB. Simple restart without delay. |
| `stop` | JsonValidator errors | Non-retryable. Wrong LLM output → propagate failure up. |

### 17.8 Location Transparency via Sharding

**What**: `shardRefs.getWarehouse("W1")` returns an `EntityRef[WarehouseCommand]`. Sending a message to it routes transparently to wherever W1 lives in the cluster — node1 or node2.

**Why here**: The `DisruptionCaseActor` on node1 might need to tell `WarehouseActor` W1 on node2 to reduce stock. Location transparency means the code doesn't change whether it's single-node or 10-node.

### 17.9 CvRDT (Convergent Replicated Data Type)

**What**: A data structure with a merge function that is associative, commutative, and idempotent. `LWWMap` = Last-Write-Wins Map (timestamps break ties).

**Why here**: The supply chain graph topology needs to be available on every node without round-trips. CvRDT gossip replication gives eventually consistent reads with no coordinator needed. Two nodes can update the graph concurrently — the merge always converges.

### 17.10 BroadcastHub (Fan-Out)

**What**: A Akka Streams sink that materializes to a `Source` that can be subscribed to by multiple consumers.

**Why here**: N clients can connect to `GET /disruption/stream` simultaneously. Without BroadcastHub, you'd need to track all connected clients manually and iterate over them on each publish. BroadcastHub handles registration, deregistration, and back-pressure automatically.

---

## 18. Supervision and Fault Tolerance

### Supervision Tree

```
GuardianActor (restartWithBackoff on RuntimeException)
  └── SimulationManagerActor (restartWithBackoff 1s–30s)
      └── DisruptionCaseActor (restart on PersistenceFailure)
          ├── LLMInterpreterActor (restartWithBackoff 200ms–10s)
          ├── ImpactAnalysisActor (stop on error — timeout is the safety net)
          ├── MitigationPlannerActor (restartWithBackoff 200ms–10s)
          └── ReportActor (restart on SQLException)

ClusterSharding (restart all entities)
  ├── SupplierActor (restart on RuntimeException)
  ├── WarehouseActor (restart on RuntimeException)
  ├── TruckActor (restart on RuntimeException)
  └── StoreActor (restart on RuntimeException)
```

### Circuit Breaker (JDBC)

```hocon
jdbc-journal {
  circuit-breaker {
    max-failures  = 10    # 10 consecutive failures → open
    call-timeout  = 30s   # each call must complete within 30s
    reset-timeout = 30s   # after 30s in OPEN state, try HALF-OPEN
  }
}
```

**States**: `CLOSED` (normal) → `OPEN` (after 10 failures, reject all calls) → `HALF-OPEN` (try one call after reset-timeout) → `CLOSED` if success, `OPEN` if failure.

**What triggers it**: PostgreSQL being unavailable, slow queries, connection exhaustion.

**What happens when open**: `EventSourcedBehavior` receives `JournalFailureException`. The supervisor restarts the actor. On restart, it tries to recover (read from journal) — if the circuit is still open, another failure, another restart, eventually backing off.

### Failure Modes

| Failure | Detection | Recovery |
|---|---|---|
| Node crash | Akka heartbeat timeout (~10s) | SBR downs the node, shards migrate to surviving nodes |
| PostgreSQL down | Circuit breaker opens (10 failures) | Actors back off, retry when DB recovers |
| LLM API down | pipeToSelf delivers LlmCallFailed | restartWithBackoff retries the call |
| LLM bad JSON | JsonValidator returns Left | LlmCallFailed → DisruptionFailed HTTP response |
| Impact timeout | AggregationTimeout fires | isPartial=true, processing continues |
| HTTP timeout | 120s ask timeout | 503 to client, case continues processing |

---

## 19. Testing Strategy

### Test Files

| File | Type | Framework |
|---|---|---|
| `JsonValidatorSpec` | Unit | ScalaTest, pure functions |
| `SupplierActorSpec` | Unit | ActorTestKit, BehaviorTestKit |
| `WarehouseActorSpec` | Unit | ActorTestKit |
| `TruckActorSpec` | Unit | ActorTestKit, 3-state FSM |
| `FaultInjectionSpec` | Chaos | ActorTestKit, failure injection |
| `SimulationManagerActorSpec` | Integration | `ignore` (requires Cluster Sharding) |
| `EndToEndSpec` | E2E | `pending` (requires full cluster) |

### Key Patterns

**ActorTestKit**:
```scala
val testKit = ActorTestKit(AppConfig.test())
implicit val system: akka.actor.typed.ActorSystem[_] = testKit.system
// ^^ REQUIRED for TestProbe[T]() constructor

val probe = TestProbe[SupplierStateSnapshot]()
val actor = testKit.spawn(SupplierActor("S1", initialState))
actor ! QuerySupplierState(probe.ref)
probe.expectMessageType[SupplierStateSnapshot]
```

**`implicit val system`**: `TestProbe[T]()` requires an implicit `ActorSystem[_]`. Without it: compile error `could not find implicit value for parameter system`. This is a common gotcha in Akka Typed tests.

**Why SimulationManagerActorSpec is ignored**: Cluster Sharding requires a running cluster (seed nodes, membership). `ActorTestKit` does not start a cluster. To test with sharding, you'd use `akka.cluster.testkit.MultiNodeSpec` or run the full Docker compose.

**InMemoryJournal**: Used in persistence tests to avoid needing a real PostgreSQL. Configured in `application-test.conf`:
```hocon
akka.persistence.journal.plugin = "akka.persistence.journal.inmem"
akka.persistence.snapshot-store.plugin = "akka.persistence.snapshot-store.local"
```

---

## 20. Known Gotchas and Non-Obvious Decisions

### 1. HOCON Override Order (Production Bug Fixed)
```hocon
# WRONG (env var overridden by literal):
host = ${?POSTGRES_HOST}
host = "localhost"           # OVERWRITES the env var!

# CORRECT (literal is the default, env var overrides):
host = "localhost"
host = ${?POSTGRES_HOST}     # Optional substitution applied last
```

### 2. LWWMap[String, Double] Serialization
`Double` is `java.lang.Double`. It is NOT registered in the CBOR bindings. When an `LWWMap[String, Double]` is replicated across cluster nodes (WriteAll), Akka falls back to Java serialization, which is disabled.

**Fix**: `LWWMap[String, String]`. Store `"1.0"` instead of `1.0`. Convert with `.toDouble` on read.

### 3. ActorSystem is not a Materializer
```scala
// WRONG:
implicit val mat: Materializer = ctx.system  // does not compile

// CORRECT:
implicit val mat: Materializer = akka.stream.Materializer(ctx.system)
```

### 4. SSE MediaType has No withCharset
```scala
// WRONG:
ContentType(MediaTypes.`text/event-stream`.withCharset(HttpCharsets.`UTF-8`))
// ^^ Compile error: WithFixedCharset has no withCharset

// CORRECT:
ContentType(MediaTypes.`text/event-stream`)
// ^^ UTF-8 is fixed by the standard
```

### 5. keepAlive Type Widening
```scala
// WRONG order — results in Source[Equals, _]:
streamRegistry.source                                        // Source[DisruptionReport, _]
  .keepAlive(15s, () => ByteString(": heartbeat\n\n"))      // LCA(DisruptionReport, ByteString) = Equals
  .map(_.asInstanceOf[ByteString])                          // runtime cast hell

// CORRECT order — map first, then keepAlive:
streamRegistry.source
  .map { report => ByteString(s"data: ${report.toJson}\n\n") }  // Source[ByteString, _]
  .keepAlive(15s, () => ByteString(": heartbeat\n\n"))           // same type, no widening
```

### 6. pipeToSelf vs Future.map in Actors
```scala
// DANGEROUS: callback runs on different thread, mutating actor state is unsafe
someFuture.foreach { result =>
  myMutableState = result  // DATA RACE
}

// CORRECT: pipeToSelf ensures result arrives as a message on the actor thread
ctx.pipeToSelf(someFuture) {
  case Success(r) => ResultReceived(r)
  case Failure(e) => RequestFailed(e.getMessage)
}
```

### 7. watchWith vs watch
```scala
// watch: delivers Terminated(ref) — requires case Terminated in behavior
ctx.watch(child)

// watchWith: delivers custom message — stays inside the sealed trait
ctx.watchWith(child, ChildTerminated(caseId))  // preferred in Akka Typed
```

### 8. Snapshot every N events — Why not N=1?
Snapshots are written to the `snapshot` table on every persist. Too frequent (N=1) means every event write + one snapshot write = 2 DB writes per event, doubling load. N=5 amortizes the snapshot cost — on recovery you replay at most 4 events after loading the snapshot.

### 9. SSE Duplicate Bug (Client-Side)
The HTTP POST handler and the SSE stream both deliver the same `DisruptionReport`. If React processes the POST response before the SSE fires, the SSE dedup check catches it (`if prev.find(c => c.caseId)` already exists). But if both arrive in the same React render batch before state updates, both would be added. Fix: both handlers use the same dedup guard.

### 10. Await.result in Main — The Only Acceptable Block
```scala
val managerRef: ActorRef[ManagerCommand] =
  Await.result(
    guardianRef.ask[ActorRef[ManagerCommand]](GetManagerRef)(12.seconds, scheduler),
    12.seconds
  )
```

`Main` is not an actor — there's no `pipeToSelf`. This is blocking the main JVM thread during startup, not an actor dispatcher thread. Acceptable for one-time initialization.

---

## 21. Interview Deep-Dive Q&A

**Q: Why use Akka Typed over classic (untyped) Akka?**

A: Classic Akka uses `Any` for messages. A typo in a message name compiles but fails at runtime. Typed actors enforce message contracts at compile time. The `sealed trait` + `case class` pattern means the compiler tells you if you forgot to handle a message. Also, `Behavior[T]` is more testable (pure functions).

---

**Q: What happens if the DisruptionCaseActor crashes after persisting `LlmEventExtracted` but before sending the `ImpactSummaryReceived` command?**

A: The actor restarts. `EventSourcedBehavior` replays journal events — `DisruptionReceived` and `LlmEventExtracted`. The `eventHandler` rebuilds `CaseState` with `phase = IMPACT_ANALYSIS`. The `commandHandler` for the restored state re-triggers impact analysis (spawns `ImpactAnalysisActor`, sends commands to domain actors). The domain actor messages are re-sent — idempotency is assumed (applying a delay twice is a known limitation in this system). The LLM call is NOT re-made because `LlmEventExtracted` is already in the journal.

---

**Q: Why does `ImpactAnalysisActor` use `Behaviors.withTimers` instead of just using `ctx.scheduleOnce`?**

A: `ctx.scheduleOnce` returns a `Cancellable`. To cancel it (when all updates arrive before timeout), you'd need to store the `Cancellable` in the actor's state, which means threading it through behavior parameters or using a `var`. `withTimers` manages the `Cancellable` internally, bound to a key. `timers.cancel(key)` is clean and avoids state leakage.

---

**Q: What is CQRS and how is it implemented here?**

A: CQRS = Command side writes; Query side reads. Here:
- **Write side**: `DisruptionCaseActor` persists `CaseEvent` instances to `event_journal` via JDBC.
- **Read side**: `JournalReadActor` subscribes to `eventsByTag("disruption-completed")`. On each `CaseCompleted` event, the application knows the case is done. `PersistenceRepository` maintains the denormalized `disruption_reports` table for SQL queries.
- **Separation**: `GET /disruption` queries `disruption_reports` (fast, indexed SQL). `POST /disruption` goes through the actor system (consistent, event-sourced). Neither side knows about the other.

---

**Q: How does Cluster Sharding guarantee at-most-one instance of WarehouseActor W1?**

A: `ClusterSharding` uses a consistent hash of the entity ID (`"W1"`) to determine the shard number (e.g., shard 42). A `ShardCoordinator` (ClusterSingleton) tracks which node hosts shard 42. When a message for `W1` arrives on any node, sharding routes it to node N (wherever shard 42 is). There is no separate W1 instance on any other node. If node N crashes, the ShardCoordinator moves shard 42 to another node — but only after the original node is confirmed down (avoiding split-brain).

---

**Q: What problem does `Behaviors.withStash` solve that a simple queue field wouldn't?**

A: A queue field would work but requires manual management — you'd dequeue on every tick, handle `Nil` cases, update state via `.copy(queue = ...)`. `withStash` provides `stash.stash(msg)` and `stash.unstashAll(nextBehavior)` as ergonomic primitives. More importantly, `withStash` is integrated with the supervision cycle — on restart, the stash is cleared automatically, preventing re-delivery of stale messages from before the crash.

---

**Q: Walk me through what happens if the AWS Bedrock call hangs indefinitely.**

A: 
1. `BedrockLlmClient.extractEvent` runs inside `Future { blocking { ... } }` on a blocking dispatcher.
2. `LLMInterpreterActor` wraps this future with `pipeToSelf(future.timeout(30.seconds))`.
3. After 30 seconds, the future completes with `Failure(TimeoutException)`.
4. `pipeToSelf` delivers `LlmCallFailed("timeout after 30s")` to `LLMInterpreterActor`.
5. The interpreter replies `LlmActorResult(Left("timeout"))` to `DisruptionCaseActor`.
6. `DisruptionCaseActor` receives `LlmResultReceived(Left(reason))` → persists a failure event → sends `DisruptionFailed` to HTTP caller.
7. HTTP caller receives 422.
8. Meanwhile, the blocking thread in the `Future` might still be hanging. The executor's thread pool has 4 threads — if all 4 hang, new LLM calls queue. The supervisor's `restartWithBackoff` on `LLMInterpreterActor` introduces delay before retry.

---

**Q: Explain the Dijkstra usage in `findAffectedNodes`. What is `maxDistance` for?**

A: Standard Dijkstra finds shortest paths from a source to all reachable nodes. Here, all edge weights are 1.0. `maxDistance = 3.0` bounds the traversal — nodes more than 3 hops away are not impacted. This models supply chain locality: a Supplier delay doesn't reach stores 10 hops away in a large graph. The returned `Map[String, Double]` contains entity IDs and their "impact distance" — closer nodes are more severely impacted. The `ImpactAnalysisActor.expectedCount` is derived from this map's size.

---

**Q: Why does `DisruptionCaseActor` use `thenRun` for side effects instead of putting them in the event handler?**

A: The event handler runs twice: once during normal processing, once during journal replay on recovery. Side effects in the event handler (spawning actors, sending messages) would execute twice — spawning a `LLMInterpreterActor` on recovery would trigger a second LLM call even though the event is already in the journal. `thenRun` is a callback that fires only during normal processing (not replay), making it the correct place for side effects.

---

**Q: What is the BroadcastHub pattern and why is it used for SSE?**

A: `BroadcastHub` materializes a `Sink[T, Source[T, NotUsed]]`. The materialized value is a `Source` that fan-outs to all connected subscribers. When `publish(report)` is called:
1. `sourceQueue.offer(report)` adds to the internal queue.
2. BroadcastHub reads from the queue and delivers to each subscriber's internal buffer.
3. Each `GET /disruption/stream` client has its own `Source` subscription with an independent buffer.
4. Client disconnect: Akka HTTP detects the TCP RST, the stream materializer tears down that subscriber's sub-stream. The BroadcastHub removes the dead subscriber automatically.

Without BroadcastHub, you'd maintain a `List[SourceQueueWithComplete[_]]` and iterate on each publish — error-prone, no back-pressure handling.

---

**Q: What serialization mechanism does the cluster use? Why is Java serialization disabled?**

A: Jackson CBOR (binary JSON). All cluster messages extend `CborSerializable`. The binding:
```hocon
"com.supplychain.domain.model.CborSerializable" = jackson-cbor
```

Java serialization is disabled (`allow-java-serialization = off`) because:
1. **Security**: Java deserialization is a known RCE vector.
2. **Performance**: Java serialization is 10-100x slower than CBOR.
3. **Versioning**: Java serialized classes break on field additions. CBOR (schema-less JSON) handles missing fields gracefully.

Any class that needs to cross an actor boundary must extend `CborSerializable`. If it doesn't, Akka throws an error at runtime (which is better than silently using Java serialization).

---

**Q: What is the Split Brain Resolver and when does it activate?**

A: If two cluster nodes lose network connectivity to each other (both can still talk to their respective clients, but not each other), each node thinks the other is down. Without SBR, both sides would continue accepting writes — the "split brain" — resulting in diverged state that's hard to merge.

SBR (`keep-majority` strategy) activates after `stable-after = 20s` of unreachability. With 2 nodes: if node2 becomes unreachable to node1, node1 (as leader, with 1/2 votes) stays up. Node1 marks node2 as `Down` and removes it from the cluster. Node2, also with 1/2 votes, is expected to also take a decision — in our config, it would also mark itself as `Down` (since neither side has majority). This prevents split-brain.

---

**Q: How would you add a new entity type, say "PORT"?**

A:
1. Add `PortId = String` type alias in `domain/model/`
2. Create `PortState` case class in `Entities.scala`
3. Create `PortCommand` sealed trait in `Commands.scala` (with `ApplyPortClosure`, `QueryPortState`, `RegisterImpactActorP`)
4. Create `PortActor.scala` in `actors/domain/`
5. Add `EntityTypeKey[PortCommand]("Port")` and `sharding.init(Entity(portKey)(...)` in `GuardianActor`
6. Add `getPort(id): EntityRef[PortCommand]` to `DomainShardedRefs`
7. Add `PORT_CLOSURE` to `EventType` in `Events.scala`
8. Add `PORT_CLOSURE` handling in `DisruptionCaseActor.triggerImpactAnalysis`
9. Add `PORT_CLOSURE` keyword matching in `MockLlmClient`
10. Add PORT_CLOSURE to `PromptBuilder.buildExtractionPrompt` enum list
11. Add edges `P1→S1`, `P2→S2` to `SupplyChainGraph.buildFromConfig`
12. Add ports to `application.conf` simulation block
13. Add PORT nodes to `NetworkMap.jsx` NODES array and appropriate EDGES

---

**Q: What is `DomainShardedRefs` and why does it exist?**

A: `DomainShardedRefs` (or similar pattern) wraps the four `ClusterSharding` entity region refs:
```scala
class DomainShardedRefs(sharding: ClusterSharding) {
  def getSupplier(id: SupplierId): EntityRef[SupplierCommand] =
    sharding.entityRefFor(EntityTypeKey[SupplierCommand]("Supplier"), id)
  def getWarehouse(id: WarehouseId): EntityRef[WarehouseCommand] = ...
  def getTruck(id: TruckId): EntityRef[TruckCommand] = ...
  def getStore(id: StoreId): EntityRef[StoreCommand] = ...
}
```

It exists to encapsulate the sharding lookup behind typed methods. `DisruptionCaseActor` receives a `DomainShardedRefs` instead of four separate `ClusterSharding` handles. This makes testing easier (you can stub `DomainShardedRefs`) and keeps the actor constructor clean.

---

**Q: If you were to add Prometheus metrics, where would you instrument?**

A:
1. **`SimulationManagerActor.SubmitDisruption` handler**: `disruption_cases_started_total.inc()`
2. **`DisruptionCaseActor` (on `CaseCompleted` persist)**: `disruption_cases_completed_total.inc()`
3. **`BedrockLlmClient.extractEvent`**: Start timer before the call, record histogram on completion
4. **`ImpactAnalysisActor` (on aggregation)**: Record `impact_affected_entities_count.observe(count)`
5. **`DisruptionCaseActor` (start-to-finish)**: Record time from `createdAt` to `completedAt`

Kamon integrates with Akka and can auto-instrument actor mailbox sizes, processing times, and cluster events. See the Observability Roadmap in `CLAUDE.md`.

---

**Q: How does the frontend know about new disruptions in real time?**

A:
1. `App.jsx` creates an `EventSource('/disruption/stream')` on mount.
2. The browser establishes a persistent HTTP connection to `GET /disruption/stream`.
3. Akka HTTP serves this as chunked transfer encoding with `text/event-stream` content type.
4. The server stream is `streamRegistry.source.map(report => ByteString("data: {...}\n\n"))`.
5. Every 15 seconds, a heartbeat `ByteString(": heartbeat\n\n")` is injected (keeping the connection alive through proxies).
6. When `DisruptionCaseActor` completes a case, it calls `streamRegistry.publish(report)`.
7. The `BroadcastHub` delivers this to all subscribed SSE streams.
8. Akka HTTP flushes the chunk to all connected clients.
9. The browser `EventSource` fires an `onmessage` event.
10. `App.jsx` parses the JSON and calls `setCases(prev => [report, ...prev])` + dedup check.

---

*Last updated: April 2026 — Praptins Sanghavi, CSYE 7374, Northeastern University*

---

## 22. Course Concept Mapping — CSYE 7374 Intro AI Agent Infrastructure

This section maps every topic taught in CSYE 7374 to a specific component in this project. Use this to anticipate professor questions and demonstrate that the project is a deliberate synthesis of the full curriculum, not just a single-topic implementation.

---

### 22.1 Curriculum Overview

| Assignment | Topic | Core Concepts |
|---|---|---|
| HW1 — Java Tokenizer | Lexical analysis | Word/punctuation splitting, vocabulary mapping, encoder/decoder |
| HW2 — Papers | Theoretical foundations | BPE theory, word embeddings, AI planning (DART paper) |
| HW3 — Spring AI | LLM integration | ChatModel, EmbeddingModel, tool-calling, multi-modal API abstraction |
| HW3 — VectorDb | Semantic search + RAG | Chunking, embeddings (MiniLM-L6-v2), Qdrant, cosine similarity |
| HW4 — Actor Model | Distributed concurrency | Actor model theory, supervision, location transparency |
| HW5 — Proposals | System design | Project scoping, architecture planning |
| Lab 1 — BPE | Subword tokenization | Byte-Pair Encoding algorithm, iterative pair merging, vocab compression |
| Lab 2 — TF-IDF | Information retrieval | Term frequency, inverse doc frequency, document ranking, cosine similarity |
| Lab 3 — Spring AI Tool-Calling | Agentic AI loops | `@Tool` registration, function-calling schema, non-blocking agentic loop |

---

### 22.2 HW1 — Tokenization → PromptBuilder + MockLlmClient

**What was taught:**
HW1 built a Java word-level tokenizer: regex-based splitting of free text into tokens, a `Vocabulary` class mapping token↔integer ID, an `Encoder` (text → IDs) and `Decoder` (IDs → text), plus punctuation normalization.

**How this project implements it:**

**`PromptBuilder.scala`** — applies the same intellectual pipeline but for LLM prompting:
- Takes unstructured disruption text ("Warehouse W1 flooded")
- Structures it into a constrained vocabulary (event types: `SUPPLIER_DELAY`, `TRUCK_BREAKDOWN`, `WAREHOUSE_SHORTFALL`, `DEMAND_SPIKE`)
- Forces the LLM to "decode" free text into tokens from a fixed vocabulary — exactly what HW1's `Encoder` did, but using a neural model instead of a lookup table

```scala
// PromptBuilder.scala — vocabulary constraint in prompt:
// "AVAILABLE EVENT TYPES:
//  - SUPPLIER_DELAY
//  - TRUCK_BREAKDOWN
//  - WAREHOUSE_SHORTFALL
//  - DEMAND_SPIKE"
// This IS a vocabulary. The LLM must pick from it.
```

**`MockLlmClient.extractEvent`** — is literally a hand-coded tokenizer:
```scala
// Keyword → token mapping (identical concept to HW1 Vocabulary)
if (lower.contains("truck") || lower.contains("breakdown")) → TRUCK_BREAKDOWN
if (lower.contains("warehouse") || lower.contains("flood")) → WAREHOUSE_SHORTFALL
```

**`JsonValidator.normalizeId`** — post-processes raw entity strings from LLM output:
- "w 1" → "W1", "supplier_s2" → "S2" — exactly the normalization step from HW1

**Professor question to anticipate:**
> "How does tokenization relate to your LLM integration?"

**Answer:** The PromptBuilder enforces a closed vocabulary — the LLM must output one of the predefined `eventType` labels. This is analogous to HW1's vocabulary-constrained encoder: rather than mapping text to integer IDs, the LLM maps text to structured event tokens. JsonValidator plays the role of the decoder's validation step, rejecting outputs that fall outside the vocabulary.

---

### 22.3 Lab 1 — BPE (Byte-Pair Encoding) → Impact Cascade + Mitigation Ranking

**What was taught:**
Lab 1 implemented the BPE algorithm: start with character-level tokens, iteratively merge the most frequent adjacent pair, build a merge table, then use the merge table to encode new text. Key idea: greedy iterative compression toward the most informative representation.

**How this project implements it:**

**`ImpactAnalysisActor` — Countdown latch aggregation:**
The "greedy most-frequent" pattern from BPE maps directly to how impact is aggregated. BPE merges the most frequent pair first. `ImpactAnalysisActor` collects all entity impacts and stops when the expected count is reached — the most impactful entities (those reported first by eager domain actors) effectively "merge" into the summary first.

**`SupplyChainGraph.findAffectedNodes` — Iterative expansion:**
BPE iteratively expands the vocabulary by merging pairs. Dijkstra's algorithm iteratively expands the frontier of affected nodes by relaxing edges. Both are greedy iterative algorithms that stop when a bound is reached (vocab size K vs. `maxDistance = 3.0`).

**Mitigation priority ranking:**
BPE assigns lower merge-round numbers to more frequent pairs (highest priority). Mitigation actions have `priority: Int` where 1 = most urgent. Both assign numeric ranks by frequency/impact — same underlying concept.

**Professor question to anticipate:**
> "What's the connection between BPE and your system's impact analysis?"

**Answer:** BPE greedily merges the most frequent character pairs, iteratively building a richer representation. My impact analysis uses Dijkstra to greedily expand from the disrupted node outward, stopping at `maxDistance=3.0`. Both are iterative greedy algorithms that build a representation of maximum information within a bounded budget (vocabulary size K / max graph distance). The mitigation priority ranking also mirrors BPE's merge order: most impactful actions get priority=1, just as most-frequent pairs get merged first.

---

### 22.4 Lab 2 — TF-IDF → Impact Severity Scoring + Mitigation Relevance

**What was taught:**
Lab 2 implemented TF-IDF for document ranking. TF = how often a term appears in a document. IDF = how rare the term is across all documents. TF-IDF = important terms appear often locally but rarely globally.

**How this project implements it:**

**`ImpactAnalysisActor.overallSeverity`:**
```scala
def overallSeverity(collected: List[EntityImpact], baseEvent: DisruptionEvent): Severity = {
  if (collected.size > 3) Severity.HIGH
  else if (collected.size > 1) Severity.MEDIUM
  else baseEvent.severity
}
```
This is a frequency-based escalation: more affected entities → higher severity. The "term frequency" here is the count of affected entities. The more "documents" (entities) a disruption affects, the more "relevant" (severe) it is — directly analogous to TF scoring.

**PromptBuilder mitigation prompt:**
The mitigation prompt includes all affected entity descriptions with their impact severity. Entities that appear multiple times in the impact chain (e.g., W1 affected by both T1 breakdown AND S1 delay) are effectively "higher TF" — the LLM sees them mentioned more and weights them accordingly in the mitigation plan.

**`findAffectedNodes` return value — `Map[String, Double]`:**
The distance value (0.0 to 3.0) is an inverse score — lower distance = more affected. This is directly analogous to TF-IDF score: nodes "closest" to the disruption source get the highest impact weight. If you invert it (3.0 - distance), you get a relevance score where the directly disrupted entity scores 3.0 and distant stores score 1.0.

**Professor question to anticipate:**
> "How does TF-IDF relate to your project?"

**Answer:** The `ImpactSummaryData.overallSeverity` escalates based on how many entities are affected — frequency-based scoring, identical to TF. The graph distance in `findAffectedNodes` returns a `Map[EntityId, Double]` where lower distance = higher impact weight, which is the inverse of TF-IDF score (close = high weight). PromptBuilder uses this to rank entities in the mitigation prompt — more frequently affected, closer entities get the most prominent placement, guiding the LLM to prioritize them in recovery actions.

---

### 22.5 HW3 — Spring AI Model Integration → LlmClient Abstraction

**What was taught:**
HW3 demonstrated Spring AI's model abstractions:
- `ChatModel` — synchronous and streaming text generation
- `EmbeddingModel` — converting text to float vectors
- Constructor injection over field injection (immutability)
- Non-blocking patterns
- Multi-provider support (OpenAI, Anthropic, etc. all implement the same interface)

**How this project implements it:**

**`LlmClient` trait — direct analogue to Spring AI's `ChatModel`:**
```scala
trait LlmClient {
  def extractEvent(caseId: CaseId, text: String): Future[LlmExtractionResponse]
  def proposeMitigations(caseId: CaseId, impact: ImpactSummaryData): Future[LlmMitigationResponse]
}
```
Three implementations satisfy this trait — exactly Spring AI's provider-agnostic model:
- `MockLlmClient` — deterministic (like a stub/mock in tests)
- `RealLlmClient` — OpenAI (like `ChatModel` with OpenAI backend)
- `BedrockLlmClient` — AWS Bedrock Claude (like `ChatModel` with Anthropic backend via Spring AI's Bedrock module)

**Constructor injection — same HW3 recommendation applied in Scala:**
```scala
// BedrockLlmClient receives config at construction, never mutates it
class BedrockLlmClient(config: LlmConfig) extends LlmClient {
  private val bedrockClient = BedrockRuntimeClient.builder()
    .region(Region.of(config.bedrockRegion))
    .credentialsProvider(staticCredentials)
    .build()
  // bedrockClient is immutable after construction
}
```

**Non-blocking async — `Future` instead of Spring's `Mono`:**
Spring AI uses `Mono<T>` (Project Reactor) for async. This project uses `Future[T]` (Scala concurrent) + `ctx.pipeToSelf(future)(...)` to deliver the result safely into the actor — the same non-blocking pattern, different runtime.

**Multi-modal parallels:**
- Spring AI `EmbeddingModel` → `SupplyChainGraph.findAffectedNodes` (converts entity IDs to similarity space)
- Spring AI `ChatModel.stream()` → `DisruptionStreamRegistry` BroadcastHub (streaming results to N clients)
- Spring AI `ModerationModel` → `JsonValidator` (validates LLM output, blocks bad responses)

**Professor question to anticipate:**
> "How is your LLM integration different from what we did in HW3 with Spring AI?"

**Answer:** HW3 used Spring AI's `ChatModel` interface with dependency injection in a Spring Boot container. My project uses an equivalent Scala `trait LlmClient` injected via constructor into the actor system at startup — same abstraction pattern, different runtime. The key difference is the async model: Spring AI uses Project Reactor's `Mono<T>`, while I use Scala `Future[T]` with `ctx.pipeToSelf` to bridge the async result back into the Akka actor model safely. The three backends (Mock, OpenAI, Bedrock) mirror Spring AI's provider-agnostic design.

---

### 22.6 HW3 — VectorDb / RAG → SupplyChainGraph + Distributed Data

**What was taught:**
HW3's VectorDb lab built a full Retrieval-Augmented Generation pipeline:
1. Load documents
2. Chunk text (500 chars, 50 overlap)
3. Embed chunks with `all-MiniLM-L6-v2` via DJL
4. Store embeddings in Qdrant (cosine similarity index)
5. Query: embed search text, find K-nearest neighbors, return context
6. Feed retrieved context to LLM (RAG grounding)

**How this project implements it:**

**RAG Grounding in PromptBuilder:**
```scala
// PromptBuilder.buildExtractionPrompt(text):
// "KNOWN ENTITY IDs: S1, S2, S3, W1, W2, T1–T4, ST1–ST6"
// "TOPOLOGY: S1→W1, W1→{ST1,ST2,ST3}..."
// This IS retrieval-augmented generation.
// The "retrieved context" is the supply chain topology.
// The LLM is grounded with real domain knowledge, not hallucinating entity names.
```

HW3 retrieved relevant book passages to ground the LLM. This project retrieves the supply chain topology to ground the LLM — same RAG pattern, domain-specific retrieval.

**`SupplyChainGraph` — the "vector database":**

| VectorDb concept | Project equivalent |
|---|---|
| Embedding space (high-dimensional floats) | Graph adjacency space (entity relationships) |
| Cosine similarity (angle between vectors) | Edge weight / Dijkstra distance (topological proximity) |
| K-nearest neighbors search | `findAffectedNodes(start, maxDistance=3.0)` |
| Chunking (split text into segments) | Sharded entity regions (split topology across cluster nodes) |
| Qdrant collection | `LWWMap[String, String]` (Distributed Data store) |
| Collection update (add new chunks) | `GraphReplicatorActor.AddEdge` (add new topology edge) |
| Query (find similar chunks) | `GraphReplicatorActor.GetGraph` + Dijkstra |

**`GraphReplicatorActor` — the distributed vector store:**
Qdrant in HW3 was a centralized vector database. In this project, the graph is replicated across all cluster nodes using `LWWMap` (Akka Distributed Data). This is the distributed equivalent: every node has a local replica of the graph, can query it locally (ReadLocal), and updates propagate via gossip (like a distributed vector index).

**Streaming (HW3 VectorDb search results → SSE):**
HW3's VectorDb returned search results synchronously. This project streams completed disruption reports via `BroadcastHub` + SSE — pushing new "retrieved" analysis results to all connected clients in real time.

**Professor question to anticipate:**
> "How does your project relate to the vector database lab?"

**Answer:** The VectorDb lab built a semantic search system: embed text, store in Qdrant, find similar documents, use them to ground an LLM. My project has an exact structural parallel: the supply chain graph is the "embedding space" (topology replaces float vectors), Dijkstra traversal replaces cosine similarity search, and `GraphReplicatorActor`'s `LWWMap` replaces the Qdrant collection. The critical addition is that my store is distributed — every cluster node has a replicated local copy via Akka Distributed Data gossip, whereas Qdrant is centralized. The RAG pattern is also present: `PromptBuilder` injects the retrieved topology (entity IDs, known routes) into every LLM prompt as grounding context.

---

### 22.7 HW4 — Actor Model Paper → Entire Akka Architecture

**What was taught:**
HW4 was a research paper on the actor model of concurrency. Key principles from the paper:
1. **Encapsulation**: Actors own their state exclusively — no shared mutable state
2. **Message passing**: Only way to communicate — no direct method calls
3. **Location transparency**: You don't know (or care) where an actor runs
4. **Supervision**: Parents supervise children — "let it crash" philosophy
5. **Behavior as state**: An actor's current behavior IS its state (FSM via behavior switching)

**How this project implements every principle:**

**1. Encapsulation:**
Every domain actor holds its state as an immutable case class. `WarehouseActor` holds `WarehouseState`. Nothing outside the actor can touch it directly. The only way to reduce W1's stock is to send it `ApplyInventoryReduction(200, impactRef)`.

**2. Message passing:**
```scala
// No direct calls — only messages
shardRefs.getWarehouse("W1") ! ApplyInventoryReduction(200, impactRef)
// The sender doesn't even know which node W1 is on
```

**3. Location transparency:**
`EntityRef[WarehouseCommand]` is a proxy. The `DisruptionCaseActor` on node1 can send messages to `WarehouseActor` W1 on node2 with identical code. `ClusterSharding` handles routing transparently.

**4. Supervision:**
```
GuardianActor         ← restartWithBackoff(1s, 30s) on RuntimeException
  └─ SimulationManager  ← restartWithBackoff(1s, 30s)
      └─ DisruptionCase  ← restart on PersistenceFailure
          └─ LLMInterpreter ← restartWithBackoff(200ms, 10s)
```
"Let it crash" — actors fail fast, supervisors restart them. No try/catch spaghetti.

**5. Behavior as state (FSM):**
`TruckActor` is the clearest example. The `active`, `disabled`, and `recovering` behaviors ARE the states:
```scala
def active(state: TruckState): Behavior[TruckCommand] = Behaviors.receive {
  case (ctx, ApplyTruckBreakdown(reason, _)) =>
    ctx.log.warn(s"Truck ${state.id} broke down: $reason")
    disabled(state.breakdown())   // ← return NEW behavior = state transition
}

def disabled(state: TruckState): Behavior[TruckCommand] = Behaviors.receive {
  case (ctx, StartTruckRecovery(_)) =>
    recovering(state.startRecovery())  // ← transition to recovering
  case (_, ApplyTruckBreakdown(_, replyTo)) =>
    replyTo ! TruckAlreadyBroken     // ← ignore duplicate breakdown
    Behaviors.same
}
```
The paper described exactly this pattern. This project implements it.

**`DisruptionCaseActor` FSM (EventSourced variant):**
```
PENDING → LLM_INTERPRETED → IMPACT_ANALYSIS → MITIGATION_PROPOSED → COMPLETED
```
Each `CasePhase` drives which commands are accepted. On `LLM_INTERPRETED`, the actor accepts `ImpactSummaryReceived`. On `COMPLETED`, it stops. This is the actor-model FSM pattern extended with event sourcing.

**Professor question to anticipate:**
> "Walk me through how the actor model paper concepts appear in your system."

**Answer:** Every principle from the actor model paper is directly implemented. Encapsulation: each domain actor exclusively owns its state — no shared variables. Message passing: all state changes go through typed commands (`ApplyInventoryReduction`, `ApplyTruckBreakdown`). Location transparency: `EntityRef[WarehouseCommand]` from ClusterSharding works whether W1 is on node1 or node2 — the caller's code is identical. Supervision: the four-level tree (Guardian → Manager → CaseActor → workflow actors) each with explicit restart strategies, embodying "let it crash". Behavior-as-state: `TruckActor` returns a different `Behavior` on each state transition — the current behavior IS the current state, exactly as the paper describes.

---

### 22.8 Lab 3 — Spring AI Tool-Calling → Agentic LLM Workflow

**What was taught:**
Lab 3 built an agentic loop with Spring AI's function-calling:
- `@Tool` annotations register Java methods as callable tools
- LLM receives a list of available tools with schemas
- LLM decides which tool to call based on the user query
- Spring AI executes the tool, feeds result back to LLM
- LLM generates final answer using tool output

**How this project implements it:**

**`PromptBuilder` — tool registration in prose:**
Spring AI uses `@Tool` annotations and auto-generates JSON schemas. `PromptBuilder` achieves the same thing manually, with explicit tool definitions:

```
// PromptBuilder.buildMitigationPrompt — tool list:
// "AVAILABLE RECOVERY TOOLS:
//  - REROUTE_SUPPLIER: redirect orders from affected supplier to backup
//  - ACTIVATE_BACKUP: bring backup warehouse online
//  - EMERGENCY_RESTOCK: trigger emergency inbound from supplier
//  - DISPATCH_BACKUP_TRUCK: deploy backup vehicle
//  - HOLD_ORDERS: pause outbound shipments
//  - NOTIFY_STORES: alert downstream stores of delay
//  - DEMAND_MODULATION: reduce store order quantities
//  - MANUAL_REVIEW: escalate to operations manager"
```

The LLM "calls" these tools by selecting them in its JSON response. `JsonValidator` validates that the selected tools exist in the vocabulary — exactly how Spring AI validates `@Tool` method names.

**The Agentic Loop — actor-based instead of HTTP-based:**

| Lab 3 (Spring AI) | This Project (Akka) |
|---|---|
| HTTP `/ask` endpoint triggers the loop | `POST /disruption` triggers the loop |
| Spring AI `ChatClient` sends prompt + tools to OpenAI | `LLMInterpreterActor` sends prompt to Bedrock/OpenAI |
| OpenAI calls a `@Tool` method | LLM selects a `MitigationActionType` |
| Tool result is fed back to LLM | Impact summary is fed to `MitigationPlannerActor` |
| LLM generates final response | Report is assembled by `ReportActor` |
| Response returned to HTTP caller | `DisruptionReport` returned to HTTP caller |

The difference: Lab 3's agentic loop is synchronous and request-scoped. This project's agentic loop is **asynchronous, event-sourced, and distributed** — it persists every step to a journal, can recover from crashes mid-loop, and runs across cluster nodes.

**Non-blocking: Lab 3 `volatile` caching vs. `pipeToSelf`:**
Lab 3 used `volatile` fields for thread-safe lazy caching. This project uses `ctx.pipeToSelf(future)(result => MyMessage(result))` — the non-blocking equivalent in the actor model. Both patterns ensure that async results are handled safely without race conditions.

**Professor question to anticipate:**
> "How does your LLM integration differ from the tool-calling lab?"

**Answer:** Lab 3 built a single-turn agentic loop: user asks, LLM calls a `@Tool`, result feeds back, LLM answers. My project builds a multi-step agentic pipeline: LLM extraction (step 1) feeds into graph impact analysis (step 2), which feeds into LLM mitigation planning (step 3), which feeds into persistence (step 4). Each step is event-sourced — persisted to the journal — so the entire agent chain is recoverable from any point of failure. The tool vocabulary concept is identical: `PromptBuilder` enumerates available `MitigationActionType` values in the prompt, the LLM selects from them, and `JsonValidator` rejects unknown tool names, exactly like Spring AI's `@Tool` validation.

---

### 22.9 Agentic Infrastructure — The Course Theme Applied End-to-End

The course title is "Intro AI Agent Infrastructure." Every component in this project contributes to the agent infrastructure:

| Infrastructure Concern | Course Topic | Implementation |
|---|---|---|
| **Text understanding** | HW1 tokenization, BPE | `PromptBuilder`, `MockLlmClient` keyword matching |
| **Knowledge retrieval** | HW3 VectorDb (RAG) | `SupplyChainGraph` topology as retrieval context |
| **LLM invocation** | HW3 Spring AI, Lab3 tool-calling | `LlmClient` trait + 3 backends |
| **Agent decision loop** | Lab3 agentic loop | `DisruptionCaseActor` FSM orchestration |
| **Tool execution** | Lab3 `@Tool` pattern | Domain actors (`ApplyTruckBreakdown`, `ApplyInventoryReduction`) |
| **Result validation** | Lab3 schema validation | `JsonValidator` + `PromptBuilder` vocabulary constraints |
| **Distributed execution** | HW4 actor model | Akka Cluster Sharding — agents run across nodes |
| **Fault tolerance** | HW4 supervision | `restartWithBackoff`, circuit breakers, event sourcing |
| **Memory / state** | General persistence | `EventSourcedBehavior`, JDBC journal, `LWWMap` |
| **Real-time output** | General streaming | BroadcastHub SSE, frontend `EventSource` |

**The core thesis**: A production AI agent is not just an LLM call. It is:
- A **retrieval system** that grounds the LLM (VectorDb → topology-augmented prompts)
- A **tool execution system** that the LLM can invoke (domain actors as tools)
- A **state machine** that orchestrates multi-step reasoning (DisruptionCaseActor FSM)
- A **persistent system** that survives failures (EventSourced journal)
- A **distributed system** that scales horizontally (Akka Cluster Sharding)
- A **streaming system** that delivers results in real time (BroadcastHub SSE)

This project implements all six layers simultaneously.

---

### 22.10 Anticipated Professor Questions and Prepared Answers

**Q: "How does your project demonstrate AI agent infrastructure?"**

This system is a complete AI agent infrastructure stack, not just an LLM integration. The agent has:
1. **Perception** — `LLMInterpreterActor` converts raw text to structured events (like a sensor layer)
2. **Memory** — `EventSourcedBehavior` journal records every decision permanently; `LWWMap` stores topology
3. **Reasoning** — `SupplyChainGraph.findAffectedNodes` traverses the domain model to infer impact
4. **Action** — domain actors (`SupplierActor`, `WarehouseActor`, etc.) execute physical-world mutations
5. **Planning** — `MitigationPlannerActor` generates multi-step recovery sequences
6. **Communication** — BroadcastHub SSE pushes decisions to all connected observers in real time

---

**Q: "Why did you choose Akka instead of Spring Boot like HW3?"**

Spring Boot with Spring AI is excellent for single-node, request-scoped agents. Akka was chosen because the project requirements demanded:
1. **Concurrent multi-case processing** — 100 disruptions can process simultaneously; Akka actors are cheap (< 300 bytes each) vs. Spring threads.
2. **Distributed execution** — Cluster Sharding distributes entities across nodes. Spring Boot doesn't have an equivalent.
3. **Fault tolerance** — `EventSourcedBehavior` recovers mid-agent-loop from crashes. Spring has no equivalent.
4. **Event sourcing** — The audit trail (who decided what, when, with what confidence) is a first-class feature. Spring would require a separate event store.

---

**Q: "What is the role of the graph in your system? Is this related to knowledge graphs?"**

Yes, `SupplyChainGraph` is a domain knowledge graph. Nodes are physical supply chain entities; edges are supply/delivery relationships. The Dijkstra traversal is a semantic similarity search over this knowledge graph — "which entities are semantically related to W1 with proximity ≤ 3 hops?" This mirrors HW3's VectorDb cosine similarity search: instead of float-space proximity, we use graph-space proximity. The `GraphReplicatorActor` using `LWWMap` is a distributed knowledge graph store, analogous to a distributed vector database.

---

**Q: "How is your RAG implementation different from the VectorDb lab?"**

HW3 VectorDb implemented text-chunk RAG: embed → store → retrieve → ground LLM. This project implements topology-structured RAG: the "retrieval" is the supply chain graph (static topology + runtime Dijkstra query), and the "grounding" is injecting entity IDs, edge relationships, and affected nodes into the LLM prompt. Two key improvements over HW3's approach:
1. The knowledge store is **distributed** (`LWWMap` via gossip) instead of centralized (Qdrant server)
2. The knowledge store is **dynamic** — new edges can be added at runtime via `GraphReplicatorActor.AddEdge`, whereas HW3's Qdrant collection was static once loaded

---

**Q: "What does 'agentic' mean in the context of your system? Is it just a buzzword?"**

Agentic means the system takes autonomous multi-step actions to achieve a goal. This project satisfies the four conditions for an agent:
1. **Goal-directed** — the goal is to produce a complete disruption analysis + recovery plan
2. **Multi-step** — 5 sequential stages (extract → analyze → plan → persist → notify), each building on the last
3. **Tool-using** — the LLM selects mitigation tools (`REROUTE_SUPPLIER`, `ACTIVATE_BACKUP`, etc.) from a vocabulary; domain actors execute them
4. **Adaptive** — `ImpactAnalysisActor`'s `isPartial` flag lets the system gracefully degrade (partial data is better than failure); `ImpactSummaryData.overallSeverity` escalates based on impact breadth

The event-sourced journal makes it a **recoverable agent** — unlike a simple LLM chain, this agent can be interrupted, restarted, and resumes from exactly where it stopped.

---

**Q: "How would you add embeddings to this project for real semantic search?"**

Three places to integrate embeddings:
1. **Disruption text classification**: Instead of `MockLlmClient`'s keyword matching, embed the input text (using `all-MiniLM-L6-v2` from HW3's VectorDb lab) and find the nearest neighbor among pre-embedded exemplars for each event type. More robust than keyword matching.
2. **Historical case retrieval**: Store completed `DisruptionReport` embeddings in a vector store. When a new disruption arrives, retrieve the 3 most similar historical cases and inject them into the LLM prompt as few-shot examples — extending the RAG pipeline from HW3.
3. **Entity resolution**: `JsonValidator.normalizeId` currently does string matching. An embedding-based similarity check would handle "Warehouse #1" → "W1" more robustly than regex.

---

---

## Section 23 — Lecture Slide Content → Project Implementation (Professor Q&A)

> This section maps **every lecture slide deck** from `Final-Project/PDFs/` to exact code in this project.
> Use this as your pre-exam preparation guide. Each subsection ends with a verbatim Q&A to recite.

---

### 23.1 Week 1 Lecture 1 — LLMs, Transformers, and GPT

**Slide concepts:**
- What is an LLM — a neural network trained to predict the next token from billions of text examples
- Transformer architecture — attention mechanism, encoder-decoder, self-attention heads
- GPT pretraining — causal (left-to-right) language modeling on web-scale corpus
- Fine-tuning — supervised tuning on task-specific data (e.g., RLHF for chat)
- Emergent behavior — capabilities that appear only above certain scale thresholds
- Prompt engineering — zero-shot, few-shot, chain-of-thought

**Where the project uses it:**

The entire LLM layer (`llm/`) is premised on the lecture's model of LLMs. `BedrockLlmClient.scala` calls `anthropic.claude-3-haiku-20240307-v1:0` — a transformer-based model trained with RLHF exactly as described in the lecture.

**Prompt engineering in `PromptBuilder.scala`:**
```scala
// PromptBuilder.buildExtractionPrompt — zero-shot with explicit schema:
// "You are a supply chain analyst. Extract a structured event..."
// "Respond ONLY with valid JSON matching this schema:..."
// Zero-shot CoT: "Step 1: identify entity. Step 2: classify event type."
```
The lecture defines zero-shot as "no examples, just instructions." `buildExtractionPrompt` is zero-shot with chain-of-thought (the step-by-step instructions) — directly implementing what the slide deck describes.

**Emergent behavior** is why Claude Haiku was chosen over regex: the model can interpret "all routes from Houston are blocked due to weather" and extract `entityId=S1, eventType=SUPPLIER_DELAY` even though S1 was never mentioned by name — a capability that only emerges at scale and cannot be achieved with rules.

**Fine-tuning parallel:** The lecture covers RLHF fine-tuning. `MockLlmClient.scala` is conceptually a "fine-tuned" model — its behavior is restricted to the exact labeled examples in its `if/else` tree, like a tiny supervised fine-tune over the supply chain domain.

**Professor Q&A:**

> **Q: "What LLM architecture does your system use and why?"**
>
> The backend LLM is Claude 3 Haiku via Amazon Bedrock — a transformer-based autoregressive model pretrained on web-scale text and fine-tuned with RLHF (Reinforcement Learning from Human Feedback). I chose it because: (1) it performs well on structured-output tasks — the extraction prompt asks for JSON, and RLHF-tuned models follow instructions reliably; (2) it's fast and cheap relative to Sonnet/Opus, which matters for a real-time API that needs to respond within the 120-second Akka `ask` timeout. The lecture explains that instruction-following is an emergent capability that only appears at sufficient scale — which is exactly why a rule-based approach (MockLlmClient) works fine for testing but cannot handle novel phrasing in production.

---

### 23.2 Week 1 Lecture 2 — Tokenization and BPE

**Slide concepts:**
- Tokenization — splitting text into subword units before feeding to a model
- Vocabulary building — start with characters, merge most-frequent pairs
- BPE steps — (1) count pair frequencies, (2) merge most frequent, (3) repeat N times
- Sliding window / context length — the maximum number of tokens the model can see at once
- Embeddings — token IDs → dense float vectors (position + content)
- Special tokens — `[BOS]`, `[EOS]`, `[PAD]`, `[SEP]`

**Where the project uses it:**

`PromptBuilder.scala` is the tokenization-aware layer of this system. Every prompt it builds is constrained by practical context-length limits. The lecture explains that GPT-4 has a 128k context window — `PromptBuilder` keeps prompts under ~2000 tokens by design: entity lists are compact (`S1, S2, W1`), and topology is described in terse edge format (`S1→W1, W1→{ST1,ST2}`) rather than prose.

**BPE parallel in `MockLlmClient.scala`:**
```scala
// MockLlmClient.extractEvent — keyword-frequency matching:
val entityPattern = raw"(?i)\b(S[123]|W[12]|T[1234]|ST[1-6])\b".r
val severityScore = if (text.contains("flood")) 0.9
                    else if (text.contains("delay")) 0.6
                    else 0.4
```
BPE finds the most informative recurring pairs in a corpus. `MockLlmClient` finds the most informative recurring keywords in disruption reports — the same information-theoretic intuition (frequent + distinctive = informative). 

**Vocabulary as closed set:** The lecture notes that BPE produces a finite vocabulary of N tokens. `PromptBuilder.buildExtractionPrompt` defines a closed vocabulary of valid entity IDs and event types:
```
EVENT TYPES: SUPPLIER_DELAY, WAREHOUSE_SHORTFALL, TRUCK_BREAKDOWN, STORE_SHORTAGE
```
`JsonValidator.validateExtraction` then enforces this vocabulary — any token the LLM produces outside this closed set is rejected, exactly as a tokenizer rejects unknown bytes by falling back to `<unk>`.

**Professor Q&A:**

> **Q: "How does BPE tokenization relate to your project?"**
>
> BPE tokenization is the process that converts raw text into the input sequence a transformer model processes. In my project, every text string — the raw disruption report, the prompts built by `PromptBuilder`, the LLM's JSON response — passes through Claude's BPE tokenizer inside Bedrock before the model sees it. More concretely, `PromptBuilder` is designed to be token-efficient: instead of writing "Supplier S1 is connected to Warehouse W1 via Route A," it writes "S1→W1" — a representation that tokenizes to fewer tokens, stays within context limits, and is unambiguous given the closed vocabulary I define in the prompt. `MockLlmClient` mirrors BPE's core insight: find the most discriminative recurring patterns in text (keywords like "flood", "delay") and use them for classification — the same frequency-based approach BPE uses to build a vocabulary.

---

### 23.3 Lecture 3.1 — Neural Word Embeddings (One-Hot, BoW, TF-IDF, Word2Vec, GloVe)

**Slide concepts:**
- One-hot encoding — sparse, high-dimensional, no semantic similarity
- Bag of Words (BoW) — count-based, loses word order
- TF-IDF formula — `TF(t,d) * IDF(t)` where `IDF = log(N / df(t))`
- Word2Vec — dense low-dimensional vectors, semantic similarity preserved
- GloVe — global co-occurrence matrix factorization
- FastText — subword embeddings (handles OOV words)
- BERT — bidirectional, contextual embeddings (same word → different vectors in different contexts)

**Where the project uses it:**

**TF-IDF in severity scoring (`ImpactAnalysisActor.scala`):**

The lecture defines TF-IDF as measuring how important a term is to a document relative to a corpus. `ImpactAnalysisActor` applies the same intuition to impact scoring:

```scala
// Term Frequency analog: how many entities are affected by this disruption?
val tfAnalog = impactResponses.count(_.isAffected).toDouble / impactResponses.size

// IDF analog: how critical is this entity type?
// Warehouses are rarer and more critical than trucks → higher IDF-analog weight
val idfAnalog = entityType match {
  case "Warehouse" => 2.0   // rare, high impact
  case "Supplier"  => 1.8
  case "Truck"     => 1.2
  case "Store"     => 1.0
}

// TF-IDF score drives overallSeverity
val severity = Math.min(1.0, tfAnalog * idfAnalog)
```

**One-hot as entity ID space:** Every entity in the system (`S1`, `W1`, `T2`, etc.) is functionally a one-hot identifier. `SupplyChainGraph` uses these IDs as node keys — a discrete, symbolic representation with no implicit similarity. The Dijkstra traversal ADDS the missing semantic similarity (path distance = topological proximity) — exactly the motivation the lecture gives for moving from one-hot to dense vectors.

**Word2Vec → Graph embeddings:** The lecture explains Word2Vec produces vectors where `king - man + woman ≈ queen`. `SupplyChainGraph.findAffectedNodes` is an implicit graph embedding: entities that are 1 hop from W1 have a "distance vector" of 1.0, entities 2 hops away have distance 2.0. This encodes relational structure in a continuous space — the same goal as Word2Vec, but over supply chain topology rather than text.

**Professor Q&A:**

> **Q: "Does your project use any embedding techniques from the word embeddings lectures?"**
>
> Yes, in two ways. First, TF-IDF's core idea — weighting by frequency and rarity — directly drives the severity scoring in `ImpactAnalysisActor`. A warehouse disruption scores higher than a truck breakdown because warehouses are rarer and serve more downstream entities, mirroring how IDF weights rare-but-informative terms more heavily. Second, the entity representation evolves through the same abstraction ladder the lecture describes: entity IDs start as one-hot symbols (no similarity), then `SupplyChainGraph.findAffectedNodes` computes a continuous proximity score (Dijkstra distance), effectively creating a 1D dense embedding of each entity in the topological space. If I were to add vector embeddings for historical case retrieval, I'd use `all-MiniLM-L6-v2` from Sentence-BERT — a BERT-family model — to create contextual embeddings of past disruption texts for few-shot prompt grounding.

---

### 23.4 Lecture 3.2 — Word2Vec Architecture (CBOW, Skip-gram, Backprop)

**Slide concepts:**
- CBOW (Continuous Bag of Words) — predict center word from context words
- Skip-gram — predict context words from center word
- Hidden layer weight matrix W (V × N) — the actual word vectors
- Softmax output over vocabulary — expensive, replaced by hierarchical softmax or negative sampling
- Backpropagation through the network to update W
- Analogy task: `king - man + woman = queen` proves geometric semantic structure

**Where the project uses it:**

**Skip-gram analogy in graph traversal:**

Skip-gram predicts "given this word, what words appear nearby?" `SupplyChainGraph.findAffectedNodes(start)` answers "given this entity, what entities appear nearby in the topology?" — the same co-occurrence intuition, expressed as graph distance rather than text window distance.

**Weight matrix W analogy:**

In Word2Vec, matrix W (V × N) maps entity IDs to dense vectors. In this project:
```scala
// SupplyChainGraph.adjacency: Map[String, Map[String, Double]]
// This IS the weight matrix W:
// Row = source entity (like a word)
// Column = target entity (like a context word)
// Value = edge weight (like the learned similarity score)
```
`GraphReplicatorActor` replicates this "weight matrix" across cluster nodes via `LWWMap` — distributing the embedding space across the cluster.

**Negative sampling analog:** Skip-gram uses negative sampling to avoid computing softmax over the full vocabulary. `ImpactAnalysisActor` sends `QueryImpact` only to the entities reachable by Dijkstra (the positive samples), never to entities with no topological connection (the "negative samples" — they're implicitly excluded with zero weight).

**Professor Q&A:**

> **Q: "How does the Word2Vec architecture relate to your supply chain graph?"**
>
> Word2Vec's core insight is that meaning can be represented as position in a dense geometric space, where semantically similar words cluster together. My supply chain graph encodes the same idea for supply chain entities: instead of text co-occurrence defining proximity, topological connectivity defines proximity. The adjacency map in `SupplyChainGraph` is structurally equivalent to Word2Vec's weight matrix W — it maps each entity (word) to its neighbors (co-occurrence context) with weighted edges (learned similarity scores). Dijkstra traversal over this matrix is analogous to querying the embedding space for nearest neighbors. The key architectural difference is that my "embeddings" are symbolic and interpretable (W1→ST1 with weight 1.0 means W1 supplies ST1) rather than opaque float vectors — which is the right trade-off for a domain where interpretability matters more than generalization.

---

### 23.5 VectorDB Lecture — Qdrant, Distance Metrics, Collections

**Slide concepts:**
- Why vector DBs — OLTP/OLAP can't do semantic similarity search
- Vector DB operations: create collection, insert points (id + vector + payload), search K-NN
- Distance metrics: cosine similarity (angle), Euclidean (L2 distance), dot product
- Qdrant architecture: collections, segments, HNSW index (Hierarchical Navigable Small World)
- Payload filters: combine semantic search with metadata filtering
- Use in RAG pipeline: embed query → search → retrieve payload → feed to LLM

**Where the project uses it:**

**`SupplyChainGraph` as a domain-specific vector DB:**

| Qdrant concept | Project equivalent |
|---|---|
| Collection | `SupplyChainGraph` instance |
| Point = (id, vector, payload) | Node = (entityId, edge weights, entity metadata) |
| Insert point | `GraphReplicatorActor.AddEdge` |
| HNSW index | Dijkstra adjacency list |
| K-NN search | `findAffectedNodes(start, maxDistance)` |
| Cosine similarity | Dijkstra path distance (inverse: smaller = more similar) |
| Payload filter | Entity type filter in `ImpactAnalysisActor` |
| ReadLocal | `Replicator.ReadLocal` in `GraphReplicatorActor.GetGraph` |

**`GraphReplicatorActor` as a distributed Qdrant:**

Qdrant is a centralized service. `GraphReplicatorActor` + `LWWMap` is the distributed equivalent:
```scala
// Qdrant: centralized collection server
// This project: cluster-replicated LWWMap on every node
ddata.replicator ! Replicator.Update(
  GraphEdgesKey, EmptyMap, Replicator.WriteAll(timeout = 5.seconds), updateAdapter
)(_.put(node, key, weight.toString))
// WriteAll = update propagates to every node (like Qdrant collection replication)
```

**Distance metric in `findAffectedNodes`:**
```scala
// Dijkstra edge weight = "distance" between entities
// maxDistance = 3.0 is the K-NN radius cutoff
// Like Qdrant's score_threshold parameter
def findAffectedNodes(start: String, maxDistance: Double = 3.0): Set[String]
```

**Payload filtering:** Qdrant's payload filter lets you combine semantic search with metadata. `ImpactAnalysisActor` does the same: it queries all affected entity IDs from the graph, then routes each to the typed actor (`WarehouseActor`, `SupplierActor`, etc.) based on entity ID prefix — metadata-filtered semantic search.

**Professor Q&A:**

> **Q: "You didn't use Qdrant in your project. How does your project relate to the VectorDB lecture?"**
>
> The VectorDB lecture taught the core pattern: store semantically structured data, query it by distance, retrieve results to ground an LLM. My project implements this pattern without Qdrant because the domain structure is discrete and topological rather than continuous and semantic — supply chain entities have defined physical connections, not fuzzy semantic similarity. `SupplyChainGraph` is the collection, Dijkstra is the K-NN search (with edge weight as distance metric), and `PromptBuilder` injects the retrieved topology into the LLM prompt as grounding context — that's the full Qdrant RAG pipeline. The architectural upgrade is that my "collection" is distributed via Akka Distributed Data `LWWMap` across cluster nodes, whereas Qdrant is a centralized service. If I needed semantic search over historical disruption text, I'd add a Qdrant sidecar (via Docker Compose), embed completed `DisruptionReport` payloads, and retrieve similar past cases as few-shot examples in new prompts.

---

### 23.6 RAG Lecture — Retrieval-Augmented Generation Pipeline

**Slide concepts:**
- RAG pipeline: (1) ingest documents → chunk → embed → store; (2) query → embed → retrieve → synthesize
- Chunking strategies: fixed-size, sentence, semantic, recursive
- Sentence-window retrieval: retrieve a sentence but return its surrounding context window
- Re-ranking: use a cross-encoder to re-score retrieved chunks
- "Lost in the middle" problem: LLMs pay less attention to middle-of-context information
- HyDE (Hypothetical Document Embeddings): generate a fake answer, embed it, use it as the query
- RAG vs fine-tuning: RAG for dynamic knowledge, fine-tuning for style/behavior

**Where the project uses it:**

**Full RAG pipeline in `PromptBuilder.scala`:**

The RAG pipeline has two phases — ingest and query. This project implements both:

```
INGEST phase (at startup):
  SupplyChainGraph.buildFromConfig()  // "load documents" = load topology from application.conf
  → GraphReplicatorActor seeds LWWMap  // "chunk + embed + store"

QUERY phase (per disruption):
  PromptBuilder.buildExtractionPrompt(text):
    1. GetGraph from GraphReplicatorActor (retrieve)
    2. Format entity IDs + topology edges (chunk)
    3. Inject into prompt: "KNOWN ENTITIES: S1, S2... TOPOLOGY: S1→W1..."  (synthesize)
    4. Call LLM with grounded prompt  (generate)
```

**Chunking strategy — "semantic" chunking:** The lecture's semantic chunking splits text where topic changes. `PromptBuilder` uses semantic chunking of the topology: entities are grouped by type (Suppliers, Warehouses, Trucks, Stores), edges are described as entity-type groups (`S1→{W1, W2}`). This is semantically chunked retrieval context.

**"Lost in the middle" mitigation:** The lecture cites "lost in the middle" — LLMs attend less to context buried in the middle of long prompts. `PromptBuilder` places the most important context (the specific affected entity + event type vocabulary) at the BEGINNING of the system prompt, and the full topology at the END. The JSON schema instruction appears immediately before the closing quote — high-attention positions for the model.

**Sentence-window analog:** The lecture's sentence-window retrieval fetches a chunk but returns its neighbors for context. `ImpactAnalysisActor.findAffectedNodes` does the same: it retrieves the directly-affected entity (the "chunk") and returns all entities within distance 3.0 (the "window") — the surrounding topological context.

**RAG vs fine-tuning:** The lecture notes RAG is preferred when knowledge changes frequently. This project uses RAG (topology-augmented prompts) rather than fine-tuning because supply chain topologies change: new warehouses are added, routes change, suppliers are swapped. `GraphReplicatorActor.AddEdge` updates the RAG context at runtime without retraining the model.

**Professor Q&A:**

> **Q: "Walk me through your RAG implementation step by step."**
>
> The RAG pipeline runs in two phases. Ingest: at startup, `SupplyChainGraph.buildFromConfig` loads the static topology from `application.conf` (suppliers, warehouses, trucks, stores and their connections). `GraphReplicatorActor` seeds this topology into an `LWWMap` distributed across all cluster nodes — the "vector store." Query: when a disruption report arrives, `PromptBuilder.buildExtractionPrompt` calls `GetGraph` on `GraphReplicatorActor` (the retrieval step), formats the returned topology as structured context (the chunking step), and injects it at the start of the LLM prompt: "KNOWN ENTITY IDs: S1, S2, S3, W1, W2... TOPOLOGY: S1→W1, W1→{ST1,ST2,ST3}..." (the grounding step). The LLM then generates a JSON response that uses only the grounded entity names — eliminating hallucination of non-existent entities. This is exactly the RAG pipeline from the lecture: retrieve → inject → generate.

---

### 23.7 GraphRAG Lecture — Knowledge Graphs and Multi-Hop Reasoning

**Slide concepts:**
- GraphRAG vs vector-only RAG — graphs capture relationships, not just similarity
- Knowledge graph — nodes (entities) + edges (relationships) + properties
- Multi-hop reasoning — "supplier S1 → warehouse W1 → store ST1" (can't be answered with one embedding)
- Community detection — cluster graph nodes, summarize clusters for LLM context
- Neo4j integration — Cypher queries to retrieve subgraphs
- GraphRAG use cases: legal (case citations), medical (drug interactions), supply chain (cascading failures)

**Where the project uses it:**

This project is a **textbook GraphRAG implementation** — supply chain is literally one of the lecture's named use cases.

**Knowledge graph structure (`SupplyChainGraph.scala`):**
```scala
// Nodes (entities): S1, S2, S3, W1, W2, T1-T4, ST1-ST6
// Edges (relationships): "S1→W1" weight 1.0, "W1→ST1" weight 1.0
// Properties: entity type (Supplier/Warehouse/Truck/Store), operational status
case class SupplyChainGraph(adjacency: Map[String, Map[String, Double]])
```
This is exactly a knowledge graph — named entities with typed relationships and weights.

**Multi-hop reasoning with Dijkstra:**
The lecture's key insight is that GraphRAG can answer multi-hop questions vector RAG cannot. "If S1 fails, does ST3 run out of stock?" requires traversing S1→W1→ST3. `findAffectedNodes` answers this:
```scala
// Dijkstra traversal: BFS from S1
// hop 1: W1 (distance 1.0)
// hop 2: ST1, ST2, ST3 (distance 2.0)
// Result: {W1, ST1, ST2, ST3} — all multi-hop affected entities
```
A single embedding query for "S1 impact" could not answer this — it has no knowledge of the W1→ST3 path.

**Community detection analog:** The lecture covers detecting entity communities (clusters of highly connected nodes). This project's `ImpactAnalysisActor` implicitly detects communities: it sends `QueryImpact` to all Dijkstra-reachable entities — that reachable subgraph IS the affected community. The `affectedEntities` list in `ImpactSummaryData` is the community membership.

**LLM context injection (GraphRAG synthesis):** The lecture describes feeding the subgraph summary to the LLM. `PromptBuilder.buildMitigationPrompt` does exactly this:
```
// Injected subgraph summary:
"AFFECTED ENTITIES: W1 (Warehouse, SHORTFALL, 200 units), ST1 (Store, downstream, severity 0.8)"
"GRAPH CONTEXT: W1 supplies ST1, ST2, ST3 — all downstream stores at risk"
```
This is the GraphRAG synthesis step: retrieve subgraph → summarize → inject → generate.

**Professor Q&A:**

> **Q: "How does your project implement GraphRAG specifically?"**
>
> The GraphRAG lecture identifies supply chain as a canonical use case, and my project implements exactly that. The knowledge graph is `SupplyChainGraph`: nodes are supply chain entities (S1-S3, W1-W2, T1-T4, ST1-ST6), edges are supply/delivery relationships with weights. The GraphRAG retrieval step is `findAffectedNodes`: given an affected entity (e.g., W1), Dijkstra traversal finds all multi-hop impacted entities — exactly the multi-hop reasoning the lecture says vector RAG cannot do. A pure embedding search for "W1 impact" would find documents mentioning W1, but couldn't reason about which downstream stores lose supply. The subgraph retrieval result (the set of affected entities with their relationships) is then injected into `PromptBuilder.buildMitigationPrompt` as structured context — the GraphRAG synthesis step — so the LLM proposes mitigations that are topologically aware, not just semantically plausible.

---

### 23.8 Neo4j Lecture — Graph Databases, Cypher, Dijkstra

**Slide concepts:**
- Graph DB vs relational DB — native storage for relationships, no JOIN overhead
- Property graph model — nodes + labels + properties + relationships + relationship types
- Cypher query language — `MATCH (a:Person)-[:KNOWS]->(b:Person) RETURN a, b`
- Shortest path in Cypher — `MATCH p = shortestPath((a)-[*]-(b)) RETURN p`
- Dijkstra in Neo4j — weighted shortest path, `apoc.algo.dijkstra`
- HA (High Availability) cluster — leader + followers, read replicas
- ACID compliance in graph context

**Where the project uses it:**

**`SupplyChainGraph` is a Neo4j graph embedded in-process:**

| Neo4j concept | `SupplyChainGraph` equivalent |
|---|---|
| Node with label | String entity ID (prefix = label: "S" = Supplier) |
| Relationship with type | `adjacency(from)(to)` map entry |
| Relationship weight | `Double` edge weight |
| `MATCH (a)-[r]->(b)` | `adjacency(a).keys` iteration |
| `shortestPath(...)` | Dijkstra BFS in `findAffectedNodes` |
| `apoc.algo.dijkstra` weighted path | `findAffectedNodes(start, maxDistance)` with cumulative weights |
| HA cluster (leader + followers) | Akka Cluster (seed-node1 + seed-node2) |
| Read replicas | `Replicator.ReadLocal` on each node |
| Write to leader | `Replicator.WriteAll` propagates to all nodes |

**Cypher → Scala Dijkstra equivalent:**
```cypher
-- Cypher (what Neo4j would do):
MATCH p = (start {id: 'W1'})-[*..3]->(affected)
WHERE ALL(r IN relationships(p) WHERE r.weight <= 3.0)
RETURN affected.id
```
```scala
// Scala equivalent in SupplyChainGraph.findAffectedNodes:
val queue = mutable.PriorityQueue[(Double, String)](...)
while (queue.nonEmpty) {
  val (dist, node) = queue.dequeue()
  if (dist > maxDistance) ...
  adjacency.getOrElse(node, Map.empty).foreach { case (neighbor, weight) =>
    val newDist = dist + weight
    if (newDist <= maxDistance && newDist < distances(neighbor))
      queue.enqueue((newDist, neighbor))
  }
}
```
Identical algorithm, different syntax.

**HA Cluster parallel:**
Neo4j HA has leader election and follower reads. Akka Cluster with Distributed Data is exactly this:
- `WriteAll` = write to leader + all followers (strong consistency)
- `ReadLocal` = read from local replica (eventual consistency, like a Neo4j read replica)
- Gossip convergence = the process by which a cluster reaches consistent state (same in both systems)

**ACID in event sourcing:** Neo4j is ACID. The JDBC journal in this project is also ACID (PostgreSQL). `DisruptionCaseActor`'s `persist(event)` writes to the PostgreSQL journal in a transaction — the same durability guarantee as Neo4j.

**Professor Q&A:**

> **Q: "Why didn't you use Neo4j instead of your custom graph implementation?"**
>
> Great question. Neo4j would be the right choice if the graph needed complex multi-hop queries with Cypher (e.g., finding all suppliers that share a warehouse with a given store, or detecting cycles). My graph's query patterns are simpler — always a single-source shortest-path/BFS from one entity — which Dijkstra handles efficiently in 10 lines of Scala. The bigger factor is operational simplicity: Neo4j requires a separate server process (or Docker container) and a BOLT driver. My in-process `SupplyChainGraph` embedded in the Akka actor system has zero network overhead for traversal queries, and `GraphReplicatorActor` + `LWWMap` gives me the HA cluster feature (multi-node read replicas with gossip-based consistency) that Neo4j's HA tier provides — without an additional infrastructure dependency. If the topology grew to millions of nodes with complex relationship queries, Neo4j would be the right upgrade path.

---

### 23.9 Actor Model Lecture — 1973 Paper to Akka Cluster

**Slide concepts:**
- Hewitt, Bishop, Steiger 1973 paper — original actor model definition
- Actor = fundamental unit of concurrent computation: process messages, create actors, send messages
- Mailbox — actors process one message at a time (no locks needed)
- Location transparency — an actor reference works regardless of where the actor runs
- Erlang — first industrial actor language, OTP supervision trees
- Akka — JVM implementation of Erlang's actor model
- Supervision tree — parent always supervises children, restart strategies
- Cluster Sharding — distribute actors across nodes, transparent routing
- Persistence (EventSourcing) — actor state = replayed event journal
- Saga pattern — distributed transaction via actor coordination

**Where the project uses it:**

This project implements every concept from the Actor Model lecture. Below is the slide-by-slide mapping:

**1973 paper — "An actor can: process a message, send messages, create new actors":**
```scala
// DisruptionCaseActor.handleCommand:
case ExtractedEventReceived(event) =>
  // 1. Process message: persist the event
  Effect.persist(EventExtracted(event))
    .thenRun { state =>
      // 2. Create new actor: spawn ImpactAnalysisActor
      val impactActor = ctx.spawn(ImpactAnalysisActor(...), s"impact-${state.caseId}")
      // 3. Send messages: trigger all domain actors
      shardRefs.getWarehouse("W1") ! ApplyInventoryReduction(200, impactActor.ref)
    }
```
All three paper-defined operations in a single message handler.

**Mailbox — one message at a time:**
Akka's typed mailbox guarantees serial processing. `DisruptionCaseActor` processes `ExtractedEventReceived` completely before `ImpactSummaryReceived` can run — no concurrent state mutation possible, no locks needed.

**Location transparency:**
```scala
// EntityRef[WarehouseCommand] — same code whether W1 is on node1 or node2
val warehouseRef: EntityRef[WarehouseCommand] = sharding.entityRefFor(WarehouseActor.TypeKey, "W1")
warehouseRef ! ApplyInventoryReduction(200, replyTo)
```

**Erlang OTP / Akka supervision:**
```
GuardianActor          ← supervise(restartWithBackoff(1s, 30s))
  └─ SimulationManager ← supervise(restartWithBackoff(1s, 30s))
      └─ DisruptionCase ← EventSourcedBehavior (auto-restores from journal)
          └─ LLMInterpreter ← supervise(restartWithBackoff(200ms, 10s))
```
Mirrors OTP's supervisor tree. "Let it crash" — no defensive `try/catch`.

**Cluster Sharding:**
`GuardianActor` initializes four `Entity` types (SupplierActor, WarehouseActor, TruckActor, StoreActor) via `ClusterSharding.init`. Shard region count = 100 (default). Location is determined by `hashCode(entityId) % shardCount` — transparent distribution.

**EventSourcing persistence:**
`DisruptionCaseActor extends EventSourcedBehavior[Command, DomainEvent, CaseState]`. Journal is PostgreSQL via `akka-persistence-jdbc`. On restart, events are replayed in order to reconstruct state — exactly as described in the lecture's persistence section.

**Saga pattern:**
The lecture's Saga is a distributed transaction via actor message choreography. `DisruptionCaseActor`'s FSM IS a Saga:
- Extract → compensate on LLM failure (retry with backoff)
- Impact → compensate on timeout (partial results accepted)
- Mitigate → compensate on validation failure (JsonValidator forces retry)
- Persist → compensate on DB failure (EventSourced journal auto-retries)

**Professor Q&A:**

> **Q: "Walk me through how the 1973 actor model paper concepts appear in your implementation."**
>
> The 1973 paper defines three fundamental operations: process a message, send messages, create new actors. Every step of my `DisruptionCaseActor`'s FSM demonstrates all three simultaneously. When it receives `ExtractedEventReceived`, it (1) processes the message by persisting the `EventExtracted` event to the journal, (2) creates a new `ImpactAnalysisActor` as a child, and (3) sends `ApplyInventoryReduction` and `ApplyTruckBreakdown` messages to domain actors via ClusterSharding. The mailbox guarantee ensures serial processing — no two messages can mutate the case state concurrently, eliminating the need for any locks. Location transparency means the case actor on node1 can communicate with a warehouse actor on node2 using identical code, because `EntityRef` from ClusterSharding is a location-transparent proxy. The supervision tree mirrors Erlang's OTP: `GuardianActor` restarts `SimulationManagerActor` on failure, which in turn re-registers all `DisruptionCaseActor` children. And the Saga pattern is implemented by the FSM itself: each phase has a compensating action (retry, partial results, or graceful degradation) if the step fails.

---

### 23.10 Function Calling Lecture — Tool Use Flow, JSON Schema

**Slide concepts:**
- Tool calling 5-step flow:
  1. User sends message with tool definitions to LLM
  2. LLM decides to call a tool (returns `tool_use` block, not final answer)
  3. App executes the tool
  4. App sends tool result back to LLM
  5. LLM generates final answer incorporating tool result
- Tool definition: name, description, input_schema (JSON Schema)
- Tool vs function — tool is the definition, function is the implementation
- `tool_choice` — force/auto/none
- Multi-tool calls — LLM can call multiple tools in one turn
- LangChain ToolMessage / Spring AI `@Tool`

**Where the project uses it:**

**Tool calling flow in this project:**

| Lecture step | Project equivalent |
|---|---|
| 1. Send message + tool defs | `PromptBuilder.buildExtractionPrompt` — embeds tool vocab in prompt |
| 2. LLM returns `tool_use` | LLM returns JSON with `eventType`, `mitigationActions` |
| 3. App executes tool | Domain actors execute: `ApplyTruckBreakdown`, `ApplyInventoryReduction` |
| 4. Send tool result back | `ImpactSummaryReceived` feeds impact data to `MitigationPlannerActor` |
| 5. LLM generates final answer | `BedrockLlmClient.proposeMitigations` returns `LlmMitigationResponse` |

**Tool definitions in prose (JSON Schema in natural language):**
```
// PromptBuilder.buildExtractionPrompt — tool schema:
// "Respond ONLY with valid JSON matching this EXACT schema:
// {
//   "eventType": "SUPPLIER_DELAY|WAREHOUSE_SHORTFALL|TRUCK_BREAKDOWN|STORE_SHORTAGE",
//   "entityId": "<one of: S1, S2, S3, W1, W2, T1, T2, T3, T4, ST1-ST6>",
//   "severity": <float 0.0-1.0>,
//   "confidence": <float 0.0-1.0>
// }"
```
This is a JSON Schema definition in natural language — exactly what the lecture shows as the tool `input_schema`.

**`JsonValidator` — tool call validation:**
The lecture explains that tool calls must match the registered schema or the LLM is asked to retry. `JsonValidator.validateExtraction` enforces this:
```scala
def validateExtraction(json: String): Either[String, LlmExtractionResponse] = {
  val eventType = (parsed \ "eventType").asOpt[String]
    .filter(EventType.values.map(_.entryName).contains)  // schema validation
    .toRight("Invalid eventType")
  // ...
}
```
If the LLM returns an event type not in the vocabulary, validation fails and `BedrockLlmClient` retries (up to `maxRetries=3`) — the retry loop the lecture describes for malformed tool responses.

**Multi-tool analog:** The lecture shows LLMs can call multiple tools per turn. `PromptBuilder.buildMitigationPrompt` asks the LLM to return multiple mitigation actions:
```json
{
  "mitigationActions": ["REROUTE_SUPPLIER", "NOTIFY_STORES", "DEMAND_MODULATION"]
}
```
This is a multi-tool call encoded in JSON — the LLM selects N tools from the vocabulary in a single response.

**Professor Q&A:**

> **Q: "Describe how function/tool calling from the lecture is implemented in your project."**
>
> The function calling lecture describes a 5-step loop where the LLM receives tool definitions, decides which to call, returns a structured tool invocation, the app executes the tool, and the result feeds back for a final answer. My project implements this loop in two rounds. Round 1 (extraction): the tool definitions are the event type + entity ID vocabularies in `PromptBuilder.buildExtractionPrompt`; the LLM "calls" the extraction tool by returning a JSON block; `JsonValidator` validates the tool call schema; domain actors (`ApplyTruckBreakdown`, etc.) execute the tool; the impact summary feeds back to the LLM. Round 2 (mitigation): the tool definitions are the eight `MitigationActionType` values; the LLM selects multiple tools in one call (multi-tool calling); `JsonValidator` validates each selected tool name; `MitigationPlannerActor` executes them. The difference from Spring AI's `@Tool` annotation is that my tool vocabulary is in the prompt text rather than in Java reflection metadata, but the semantic is identical: define available tools, let the LLM choose, validate the choice, execute.

---

### 23.11 Spring AI Lecture — ChatModel, EmbeddingModel, MCP

**Slide concepts:**
- Spring AI provides a unified `ChatModel` interface over multiple LLM backends
- Six model types: `ChatModel`, `EmbeddingModel`, `ImageModel`, `AudioModel`, `ModerationModel`, `SpeechModel`
- `ChatClient` fluent API for prompt construction
- `PromptTemplate` for parameterized prompts
- `SystemPromptTemplate` for system/user message separation
- Structured output converter — parse LLM response into Java objects
- MCP (Model Context Protocol) — standard protocol for tool-calling
- Streaming responses (`Flux<String>`)

**Where the project uses it:**

**`LlmClient` trait = Spring AI's `ChatModel`:**
```scala
// Spring AI:
interface ChatModel {
  ChatResponse call(Prompt prompt);
  Flux<ChatResponse> stream(Prompt prompt);
}

// This project (Scala equivalent):
trait LlmClient {
  def extractEvent(caseId: CaseId, text: String): Future[LlmExtractionResponse]
  def proposeMitigations(caseId: CaseId, impact: ImpactSummaryData): Future[LlmMitigationResponse]
}
```
`Future[T]` is the Scala equivalent of Spring's `Mono<T>`. Three implementations (Mock, Real, Bedrock) mirror Spring AI's provider-agnostic model.

**`PromptBuilder` = Spring AI's `PromptTemplate`:**
```scala
// Spring AI:
new PromptTemplate("Analyze {text} for entity {entity}")
  .createMessage(Map.of("text", inputText, "entity", entityId))

// This project:
def buildExtractionPrompt(reportText: String, topology: String): String =
  s"""You are a supply chain analyst.
     |Report: $reportText
     |Known entities: $topology
     |...""".stripMargin
```
Same concept: parameterized prompt construction with domain-specific variables.

**`JsonValidator` = Spring AI's `StructuredOutputConverter`:**
Spring AI's `BeanOutputConverter` parses LLM output into Java beans. `JsonValidator.validateExtraction` parses + validates LLM JSON into `LlmExtractionResponse`. Both enforce schema compliance on unstructured LLM output.

**Streaming = BroadcastHub SSE:**
Spring AI `ChatModel.stream()` returns a `Flux<ChatResponse>` for streaming responses. This project's `DisruptionStreamRegistry` provides the equivalent:
```scala
// Spring AI:
chatModel.stream(prompt).subscribe(chunk -> sendToClient(chunk));

// This project:
Source.queue[DisruptionReport](256, OverflowStrategy.dropHead)
  .toMat(BroadcastHub.sink)(Keep.both)
// BroadcastHub.sink → SSE endpoint → browser EventSource
```
Both stream LLM output to multiple consumers in real time.

**`ModerationModel` = `JsonValidator`:**
Spring AI's `ModerationModel` flags unsafe outputs. `JsonValidator` blocks structurally invalid or schema-violating LLM outputs — the same safety gate pattern.

**Professor Q&A:**

> **Q: "How does your project compare to what we built in the Spring AI homework?"**
>
> HW3 used Spring AI's `ChatModel` abstraction with dependency injection — I wrote a Scala structural equivalent. My `LlmClient` trait is the `ChatModel` interface: it abstracts over three backends (Mock, OpenAI, Bedrock) exactly as Spring AI abstracts over OpenAI, Anthropic, and Azure backends. `PromptBuilder` is the `PromptTemplate` analog: it builds parameterized prompts with domain variables injected at runtime. `JsonValidator` mirrors Spring AI's `StructuredOutputConverter` / `BeanOutputConverter`: both parse LLM text output into typed objects and reject malformed responses. The biggest addition in my project is that the LLM integration is embedded inside an Akka actor system — so it's non-blocking (`Future` + `pipeToSelf` instead of `Mono`), fault-tolerant (restart-with-backoff on LLM failures), and distributed (can run on multiple cluster nodes simultaneously). Spring AI runs in a Spring Boot servlet container — single-threaded request handling. My architecture handles thousands of concurrent disruption analyses because each is a lightweight actor, not a thread.

---

### 23.12 Spring AI MCP Lecture — MCP Protocol, SSE Transport, Structured Output

**Slide concepts:**
- MCP (Model Context Protocol) — standard protocol by Anthropic for LLM ↔ tool communication
- MCP transports: stdio, SSE (Server-Sent Events), HTTP
- MCP server registers tools; MCP client (LLM orchestrator) discovers and calls them
- Structured output: force LLM to return typed JSON via output schema
- `@McpTool` annotation — register a method as an MCP tool
- Spring AI MCP integration — `McpClient`, `McpServer`, tool discovery
- "Taking actions with tools" — read files, call APIs, mutate state

**Where the project uses it:**

**SSE transport — `DisruptionStreamRegistry.scala`:**

The lecture's MCP SSE transport uses Server-Sent Events to push tool call results from server to client. This project uses SSE for the identical purpose — pushing disruption analysis results from the Akka backend to the React frontend:

```scala
// DisruptionStreamRegistry — SSE BroadcastHub:
val (queue, hub) = Source.queue[DisruptionReport](256, OverflowStrategy.dropHead)
  .toMat(BroadcastHub.sink(bufferSize = 256))(Keep.both)
  .run()

// Routes.scala — SSE endpoint:
path("stream") {
  get {
    complete(
      HttpResponse(entity = HttpEntity.Chunked.fromData(
        ContentTypes.`text/event-stream`,
        hub.map(r => ByteString(s"data: ${r.toJson}\n\n"))
      ))
    )
  }
}
```
MCP SSE pushes tool results. This project's SSE pushes analysis results. Same transport, same protocol.

**Structured output — `JsonValidator`:**
The lecture's structured output forces the LLM to return a specific JSON schema. `PromptBuilder` enforces this with explicit schema instructions, and `JsonValidator` validates the output. The lecture's `@McpTool` input/output schemas are equivalent to `PromptBuilder`'s JSON schema definition and `JsonValidator`'s field validation.

**"Taking actions with tools" — domain actors:**
The lecture emphasizes that MCP tools "take actions" — read files, call APIs, write to databases. Domain actors ARE the MCP tools in this project:
- `ApplyInventoryReduction` → mutates warehouse state (like a "write to database" tool)
- `ApplyTruckBreakdown` → mutates truck state (like a "call external API" tool)
- `QueryImpact` → reads entity state (like a "read file" tool)

**MCP client discovery → LLM prompt tool list:**
MCP clients discover available tools from the server's manifest. `PromptBuilder` provides the tool manifest inline in the prompt — the LLM "discovers" available mitigations from the prompt text rather than via MCP protocol discovery. Functionally equivalent, architecturally simpler.

**Professor Q&A:**

> **Q: "How does MCP from the lecture relate to your project's architecture?"**
>
> MCP standardizes the protocol between an LLM orchestrator and the tools it can invoke, using SSE as the transport. My project implements both the transport and the tool-invocation pattern. SSE transport: `DisruptionStreamRegistry` + the `/disruption/stream` endpoint push analysis results to the React frontend over SSE — the same mechanism MCP uses to push tool results from server to client. Tool invocation: when `PromptBuilder.buildMitigationPrompt` lists `REROUTE_SUPPLIER`, `ACTIVATE_BACKUP`, etc., and the LLM selects from them, the selected values are routed to domain actors (`SupplierActor`, `WarehouseActor`) that execute the physical action — this is the "taking actions with tools" pattern the lecture describes. The difference is that my tool registry is a Scala pattern match in `DisruptionCaseActor` rather than an `@McpTool`-annotated registry, but the architecture — LLM selects tool → orchestrator routes to executor → result feeds back — is identical to MCP's tool calling flow.

---

### 23.13 Lambda Expressions Lecture — Java 8 Functional Interfaces

**Slide concepts:**
- Java 8 lambdas — anonymous function syntax `(params) -> expression`
- Functional interfaces — single abstract method, can be used as lambda target
- `@FunctionalInterface` — `Runnable`, `Callable`, `Comparator`, `Predicate`, `Function`, `Consumer`, `Supplier`
- Zero parameters: `() -> expr`, single: `x -> expr`, multiple: `(x, y) -> expr`
- Method references: `Class::method`
- Captured variables must be effectively final
- `Stream` API uses lambdas: `.filter()`, `.map()`, `.reduce()`

**Where the project uses it:**

This project is written in Scala, which has had first-class functions since inception (preceding Java 8 by years). Every `map`, `filter`, `flatMap`, and closure in this codebase IS a lambda — Scala functions are `Function1[A, B]` under the hood.

**Lambda equivalents in Scala:**

| Java 8 lambda concept | Scala equivalent in this project |
|---|---|
| `(x) -> x * 2` | `x => x * 2` in `adjacency.map { case (k, v) => ... }` |
| `Runnable` (`() -> ...`) | `() => ...` in `Behaviors.withTimers` `ctx.scheduleOnce(...)` |
| `Predicate<T>` (`x -> bool`) | `_.isAffected` in `impactResponses.filter(_.isAffected)` |
| `Function<A, B>` | `msg => InternalUpdateDone(msg)` in `ctx.messageAdapter` |
| `Consumer<T>` | `_ => ()` in fire-and-forget actor sends |
| Method reference | `InternalUpdateDone` constructor as `ctx.messageAdapter[...](InternalUpdateDone)` |
| Captured effectively-final var | `val caseId = state.caseId` captured in `thenRun { _ => ctx.spawn(..., caseId) }` |
| Stream `.filter().map().reduce()` | `impactResponses.filter(_.isAffected).map(_.entityId).toSet` |

**`pipeToSelf` — lambda as callback:**
```scala
// ctx.pipeToSelf is the actor-safe version of a Java CompletableFuture.thenApply lambda:
ctx.pipeToSelf(llmClient.extractEvent(state.caseId, state.reportText)) {
  case Success(response) => ExtractedEventReceived(response)  // lambda: Success → Command
  case Failure(ex)       => LlmExtractionFailed(ex.getMessage) // lambda: Failure → Command
}
```
This is a Java lambda (`(result) -> mapToMessage(result)`) — written in Scala `Function1` syntax.

**Professor Q&A:**

> **Q: "How do Java lambda expressions from the lecture appear in your Scala project?"**
>
> Scala has had first-class functions since 2004 — Java lambdas in Java 8 (2014) brought Java up to parity with Scala's functional capability. Every anonymous function in my project is the direct Scala equivalent of a Java lambda. The most important instance is `ctx.pipeToSelf`, which takes a `PartialFunction[Try[T], Command]` — a Scala lambda that maps the async result of an LLM call to an actor command. In Java 8 terms, this is `CompletableFuture.handle((result, ex) -> toCommand(result, ex))`. The immutability constraint is identical: captured variables in both Java and Scala lambdas must be effectively final — which is enforced naturally in Scala because `val` is immutable by default. The `Stream` API is used throughout: `impactResponses.filter(_.isAffected).map(_.entityId).toSet` is the Scala idiom for Java's `stream().filter(...).map(...).collect(toSet())`.

---

### 23.14 Threads Lecture — Multithreading, Runnable, Thread Safety

**Slide concepts:**
- Java `Thread` class — `new Thread(runnable).start()`
- `Runnable` interface — `run()` method, passed to `Thread` constructor
- `Thread.sleep()`, `Thread.join()`, `Thread.interrupt()`
- Shared mutable state — race conditions, data races without synchronization
- `synchronized` blocks / methods
- `volatile` keyword — visibility guarantee, not atomicity
- `ThreadLocal` — per-thread state
- Lambda threads: `new Thread(() -> doWork()).start()`
- Use cases: I/O-bound background work, parallel processing, event handling

**Where the project uses it:**

The lecture motivates threads as a solution to concurrency. This project uses the actor model as the SUPERIOR alternative to raw threads — understanding why requires knowing what threads do wrong.

**Why NOT raw threads (the lecture's problems, this project's solutions):**

| Thread problem (lecture) | Actor solution (this project) |
|---|---|
| Race condition on shared state | No shared state — each actor owns its state exclusively |
| `synchronized` blocks needed | No locks — mailbox serializes all message processing |
| `volatile` for visibility | No visibility issues — message passing includes happens-before |
| Thread-per-request (expensive) | Actors are 300 bytes — 10,000 actors on one thread pool |
| `Thread.join()` for coordination | `ask()` pattern + `ctx.pipeToSelf()` for async coordination |
| `Thread.sleep()` for retry | `Behaviors.withTimers` for scheduled retry |

**Dispatcher — the thread pool `ExecutorService` beneath actors:**
```scala
// application.conf (implicit):
// akka.actor.default-dispatcher = ForkJoinPool (work-stealing thread pool)
// This IS the ExecutorService that runs actor mailbox processing

// Blocking dispatcher (for JDBC calls in PersistenceRepository):
// akka.actor.default-blocking-io-dispatcher = ThreadPoolExecutor
// Blocking I/O gets its OWN thread pool — never blocks actor dispatcher
```
`PersistenceRepository.scala` uses the blocking dispatcher for JDBC calls — the actor model's solution to the lecture's "don't block the main thread" problem. Java's equivalent is `CompletableFuture.supplyAsync(jdbc, blockingExecutor)`.

**`Await.result` in `Main.scala` — conscious thread blocking:**
```scala
// Main.scala line ~108:
Await.result(bindingFuture, 12.seconds)
// This IS Thread.join() — main thread waits for the HTTP server Future to complete
// It's acceptable ONLY here (startup, not request path)
```

**`pipeToSelf` — thread-safe async result delivery:**
```scala
// Without pipeToSelf (BAD — Java Threads problem):
llmClient.extractEvent(text).onComplete { result =>
  state = state.withEvent(result)  // RACE CONDITION — Future callback is on a different thread
}

// With pipeToSelf (GOOD — actor-safe):
ctx.pipeToSelf(llmClient.extractEvent(text))(ExtractedEventReceived(_))
// Delivers result back into the actor's own mailbox — processed serially, no race
```
This is the core thread-safety lesson from the lecture, applied to the actor model: never mutate state from a callback on another thread.

**Professor Q&A:**

> **Q: "Your project uses Akka actors, not Java threads. How does the threads lecture apply?"**
>
> The threads lecture teaches the fundamentals of concurrent execution and the hazards of shared mutable state. Akka actors solve exactly those hazards — which is why understanding threads makes you appreciate the actor model. The lecture shows that `synchronized` is needed to protect shared state. Actors eliminate the need for synchronization by ensuring each actor's state is only ever accessed by one message at a time (the mailbox guarantee). The lecture shows `volatile` for cross-thread visibility. Actors eliminate visibility issues because message passing establishes a happens-before relationship — the sender's state before sending is visible to the receiver after receipt. The most concrete thread concept in my code is `ctx.pipeToSelf`: when `BedrockLlmClient.extractEvent` completes on a Netty I/O thread (a different thread from the actor), I cannot directly update the actor's state from that callback — that would be the race condition the lecture warns about. `pipeToSelf` delivers the result to the actor's mailbox instead, so it's processed safely on the actor's execution context. This is the actor-model equivalent of `CompletableFuture.thenApplyAsync(result, actorThread)`.

---

### 23.15 Master Q&A — Cross-Lecture Integration Questions

**Q: "If you had to explain your entire project using only the concepts from this course, what would you say?"**

> This system is a distributed AI agent infrastructure built from course-first principles. At the data layer, tokenization (Lecture 2) drives `PromptBuilder`'s token-efficient prompt design, and TF-IDF (Lecture 3.1) drives severity scoring in `ImpactAnalysisActor`. At the knowledge layer, RAG (RAG lecture) grounds every LLM call with retrieved topology, and the graph (GraphRAG + Neo4j lectures) enables the multi-hop impact reasoning that pure embedding search cannot do. At the intelligence layer, the LLM (Lecture 1) extracts structured events and proposes mitigations; function calling (FunctionCalling lecture) defines the tool vocabulary; and `LlmClient` mirrors Spring AI's `ChatModel` (Spring AI lecture). At the infrastructure layer, the actor model (ActorModel lecture) provides concurrency without locks; Cluster Sharding distributes actors across nodes; EventSourced persistence makes the agent crash-recoverable; and SSE (MCP lecture) streams results to the frontend. Lambda expressions (Lambda lecture) and thread safety (Threads lecture) underpin every non-blocking callback in the system. The result is a six-layer agent: perception (LLM extraction) → memory (EventSourcing) → knowledge (GraphRAG) → reasoning (Dijkstra) → action (domain actors) → communication (SSE).

---

**Q: "What is the single most important concept from this course that your project relies on?"**

> The Actor Model. Without it, every other component collapses. The LLM calls would create thread contention. The graph traversal would need locks. The distributed state would require explicit synchronization. The event sourcing would lose its recovery guarantee. The actor model is the infrastructure that makes all other components composable, concurrent, and fault-tolerant — it is the "AI Agent Infrastructure" in the course title made concrete.

---

**Q: "How would you extend this project to use all six Spring AI model types from the lecture?"**

> The lecture defines six model types: `ChatModel`, `EmbeddingModel`, `ImageModel`, `AudioModel`, `ModerationModel`, `SpeechModel`. Currently I use only `ChatModel` (via `BedrockLlmClient`). Extensions: (1) `EmbeddingModel` — embed completed disruption reports with `all-MiniLM-L6-v2`, store in Qdrant, retrieve similar past cases as few-shot examples in new prompts (upgrading from topology-RAG to historical-case-RAG). (2) `ModerationModel` — add a moderation gate before `LLMInterpreterActor` to block malicious injection attempts in the `reportText` input field. (3) `AudioModel` — accept voice-reported disruptions, transcribe with Whisper, feed transcript to the existing extraction pipeline. (4) `ImageModel` — accept photos of damaged goods, have a vision model extract the entity ID and damage type. (5) `SpeechModel` — speak the mitigation plan back to operations staff via TTS. The architecture is already set up for this: add new `LlmClient` method signatures, inject the new model in `BedrockLlmClient`, add new FSM phases in `DisruptionCaseActor`.

---

*CSYE 7374 — Northeastern University — Spring 2026*
