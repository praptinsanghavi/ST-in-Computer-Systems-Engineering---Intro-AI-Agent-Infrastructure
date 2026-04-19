# LLM-Enhanced Supply Chain Disruption Management System

**CSYE 7374 — Intro AI Agent Infrastructure · Northeastern University · Individual Project**

A distributed, event-driven supply chain simulation where **Akka Typed actors** model operational entities — suppliers, warehouses, trucks, and retail stores — and a **Large Language Model** interprets unstructured disruption reports, infers downstream impact, and assists recovery decisions.

---

## Architecture

```
HTTP (AskPattern)
      │
      ▼
SimulationManagerActor   ← Tier 2: coordinator, lifecycle registry
      │ spawns per-request
      ▼
DisruptionCaseActor      ← Tier 3: EventSourcedBehavior orchestrator
  ├── LLMInterpreterActor     (pipeToSelf, LLM extraction)
  ├── ImpactAnalysisActor     (countdown latch + timeout guard)
  ├── MitigationPlannerActor  (pipeToSelf, LLM mitigation)
  └── ReportActor             (pipeToSelf, DB write)
         │
         ▼  (domain events propagate downstream)
SupplierActor → WarehouseActor → StoreActor
TruckActor    → WarehouseActor

PostgreSQL (Akka Persistence JDBC journal + read-side projection)
```

## Four Critical Implementation Patterns

| Pattern | Where | Why |
|---------|-------|-----|
| **Ask Pattern** | `Routes.scala` → `SimulationManagerActor` | HTTP→Actor request-response via `simulationManager.ask(SubmitDisruption(..., replyTo))` |
| **pipeToSelf** | `DisruptionCaseActor`, `LLMInterpreterActor`, `MitigationPlannerActor`, `ReportActor` | All LLM and DB `Future`s re-ingested as typed messages — zero threading violations |
| **Explicit Supervision** | All workflow actors | Per-failure-class strategies: `restartWithBackoff` for HTTP errors, `stop` for JSON schema failures |
| **Clean Lifecycle** | `SimulationManagerActor` + `DisruptionCaseActor` | `watchWith` + `ChildTerminated` cleanup → zero actor leaks |

## Technology Stack

| Component | Technology | Version |
|-----------|-----------|---------|
| Actor system | Akka Typed | 2.6.21 (Apache 2.0) |
| State durability | Akka Persistence JDBC | 5.0.4 |
| HTTP boundary | Akka HTTP | 10.2.10 |
| LLM integration | OpenAI API (JSON mode) | via sttp 3.9.3 |
| Database | PostgreSQL 16 | via Docker |
| Build | sbt | 1.9.7 |
| Language | Scala | 2.13.12 |

## Project Structure

```
supply-chain-system/
├── build.sbt                          # Akka 2.6.21 (Apache 2.0 license)
├── docker-compose.yml                 # PostgreSQL for Akka Persistence journal
├── sql/init.sql                       # Journal + snapshot + read-side tables
├── .env.example                       # Environment variables template
└── src/
    ├── main/scala/com/supplychain/
    │   ├── Main.scala                 # Entry point — single-boot pattern
    │   ├── config/AppConfig.scala     # Immutable config (constructor-injected)
    │   ├── domain/model/              # Phase 1: ALL types defined before actors
    │   │   ├── Entities.scala         # SupplierState, WarehouseState, TruckState, StoreState
    │   │   ├── Events.scala           # CaseEvent journal + domain push events
    │   │   ├── Commands.scala         # Typed protocols (every command has replyTo)
    │   │   └── Responses.scala        # DisruptionReport, MitigationAction, etc.
    │   ├── actors/
    │   │   ├── GuardianActor.scala    # Tier 1: root, topology bootstrap
    │   │   ├── SimulationManagerActor.scala  # Tier 2: coordinator + lifecycle
    │   │   ├── workflow/              # Tier 3: per-request orchestration
    │   │   │   ├── DisruptionCaseActor.scala  # EventSourcedBehavior (13-step workflow)
    │   │   │   ├── LLMInterpreterActor.scala  # pipeToSelf + supervision
    │   │   │   ├── ImpactAnalysisActor.scala  # countdown latch + timeout guard
    │   │   │   ├── MitigationPlannerActor.scala
    │   │   │   └── ReportActor.scala
    │   │   └── domain/                # Tier 4: entity state owners
    │   │       ├── SupplierActor.scala
    │   │       ├── WarehouseActor.scala
    │   │       ├── TruckActor.scala   # 3-state machine: ACTIVE/DISABLED/RECOVERING
    │   │       └── StoreActor.scala
    │   ├── llm/
    │   │   ├── LlmClient.scala        # MockLlmClient + RealLlmClient (factory pattern)
    │   │   ├── PromptBuilder.scala    # Structured JSON prompts
    │   │   └── JsonValidator.scala    # Schema validation before actor delivery
    │   ├── http/
    │   │   ├── Routes.scala           # AskPattern only — zero business logic
    │   │   └── HttpServer.scala
    │   └── persistence/
    │       └── PersistenceRepository.scala  # pipeToSelf-safe JDBC repository
    └── test/scala/com/supplychain/
        ├── llm/JsonValidatorSpec.scala
        ├── domain/SupplierActorSpec.scala
        ├── domain/WarehouseActorSpec.scala
        ├── domain/TruckActorSpec.scala
        ├── actors/SimulationManagerActorSpec.scala
        ├── integration/EndToEndSpec.scala
        └── fault/FaultInjectionSpec.scala
```

## Quick Start

### Prerequisites
- Java 11 or 17
- sbt 1.9.x
- Docker Desktop

### 1. Start PostgreSQL
```bash
docker-compose up -d
```

### 2. Run the system (Mock LLM — no API key needed)
```bash
cd supply-chain-system
sbt run
```

### 3. Submit a disruption report
```bash
curl -X POST http://localhost:8080/disruption \
  -H "Content-Type: application/json" \
  -d '{"reportText": "Supplier S1 delayed by 3 days due to port strike in Mumbai. All inbound shipments to W1 affected."}'
```

### 4. Check case status
```bash
curl http://localhost:8080/disruption/{caseId}
curl http://localhost:8080/health
```

### 5. Run all tests (unit + actor + integration + fault injection)
```bash
sbt test
```

## Using Real OpenAI (optional)

```bash
# Set env vars
export OPENAI_API_KEY=sk-your-key-here
export LLM_MODE=real

sbt run
```

## Simulation Topology

```
Supplier S1 ──► Warehouse W1 ──► Store ST1, ST2, ST3
Supplier S2 ──► Warehouse W2 ──► Store ST4, ST5, ST6
Supplier S3 ──► Warehouse W1 + W2  (backup supplier)
Truck T1, T2 ── services W1
Truck T3, T4 ── services W2
```

## Event Journal (Akka Persistence)

Every state transition is a persisted, replayable event. The audit trail **IS** the event journal:

```
DisruptionReceived    → case created, raw text stored
LlmEventExtracted     → structured event type + entity + severity
EntityImpactRecorded  → one record per affected domain entity
MitigationProposed    → recovery actions from second LLM call
CaseCompleted         → terminal event; actor stops
```

## Supervision Strategy Table

| Failure | Exception | Strategy |
|---------|-----------|----------|
| LLM HTTP 429 / timeout | `RuntimeException` | `restartWithBackoff(200ms, 10s)` max 3 retries |
| Malformed LLM JSON | `JsonParseException` | `stop` immediately |
| DB write failure | `SQLException` | `restart` once, then `stop` |
| Domain actor non-response | Internal timeout | `scheduleOnce(5s, AggregationTimeout)` → partial data |
| Config failure | Fatal | Escalate to Guardian → JVM |

---

*CSYE 7374 — Northeastern University · Spring 2026*
