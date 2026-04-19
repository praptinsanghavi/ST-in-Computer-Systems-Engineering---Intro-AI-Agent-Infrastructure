# Supply Chain Disruption Management System

**CSYE 7374 — Intro to AI Agent Infrastructure · Northeastern University · Spring 2026**

A distributed, event-sourced AI agent that ingests free-text supply chain disruption reports, extracts structured events via LLM, propagates impact across a graph topology, proposes recovery actions, and streams live results to a React dashboard — all running on an Akka Typed cluster backed by PostgreSQL.

---

## Architecture Overview

```
┌─────────────────────────────────────────────────────────────────┐
│  React Dashboard (Vite · port 5173)                              │
│  Network Map · Incident Feed · Analysis Panel · SSE stream       │
└───────────────────────┬─────────────────────────────────────────┘
                        │ HTTP / SSE
┌───────────────────────▼─────────────────────────────────────────┐
│  Akka HTTP  (port 8080)                                          │
│  POST /disruption · GET /disruption · GET /disruption/stream     │
│  GET /cluster/status · GET /health                               │
└───────────────────────┬─────────────────────────────────────────┘
                        │ actor messages
┌───────────────────────▼─────────────────────────────────────────┐
│  Akka Typed Cluster (node1 :2551/:8080  +  node2 :2552/:8081)   │
│                                                                   │
│  GuardianActor                                                    │
│  ├── SimulationManagerActor      (Receptionist-registered)       │
│  │    └── DisruptionCaseActor    (EventSourcedBehavior FSM)      │
│  │         ├── LLMInterpreterActor   → BedrockLlmClient          │
│  │         ├── ImpactAnalysisActor   → domain actors via shards  │
│  │         ├── MitigationPlannerActor → BedrockLlmClient         │
│  │         └── ReportActor           → PersistenceRepository     │
│  ├── GraphReplicatorActor        (LWWMap Distributed Data)       │
│  └── Cluster Sharding                                            │
│       ├── SupplierActor   S1 S2 S3                               │
│       ├── WarehouseActor  W1 W2                                  │
│       ├── TruckActor      T1 T2 T3 T4                            │
│       └── StoreActor      ST1 ST2 ST3 ST4 ST5 ST6               │
└───────────────────────┬─────────────────────────────────────────┘
                        │ JDBC (akka-persistence-jdbc)
┌───────────────────────▼─────────────────────────────────────────┐
│  PostgreSQL 15   (Docker · port 5432)                            │
│  event_journal · event_tag · snapshot · disruption_reports       │
└─────────────────────────────────────────────────────────────────┘
```

**End-to-end flow in one line:**
`POST /disruption` → `SimulationManager` → `DisruptionCaseActor` FSM → LLM extract → Dijkstra impact → domain actor mutations → LLM mitigate → persist → SSE push → `HTTP 200`

---

## Features

| Feature | Implementation |
|---|---|
| Free-text disruption ingestion | `POST /disruption` with `{ "reportText": "..." }` |
| LLM event extraction | `LLMInterpreterActor` + `BedrockLlmClient` (Claude 3 Haiku) |
| Graph impact propagation | `SupplyChainGraph.findAffectedNodes` — Dijkstra traversal |
| Domain state mutation | `SupplierActor`, `WarehouseActor`, `TruckActor`, `StoreActor` via Cluster Sharding |
| LLM mitigation planning | `MitigationPlannerActor` — 8 recovery action types |
| Event-sourced audit trail | `DisruptionCaseActor` as `EventSourcedBehavior` on PostgreSQL journal |
| CQRS read-side projection | `JournalReadActor` + `PersistenceRepository` → `disruption_reports` table |
| Live SSE streaming | `DisruptionStreamRegistry` BroadcastHub → `GET /disruption/stream` |
| Distributed graph store | `GraphReplicatorActor` — Akka Distributed Data `LWWMap` |
| Multi-node cluster | Akka Cluster Sharding — two seed nodes, location-transparent entity refs |
| Mock LLM mode | `MockLlmClient` — deterministic keyword matching, no credentials required |
| React live dashboard | Network topology map, incident feed, analysis panel |

---

## Prerequisites

| Requirement | Version | Notes |
|---|---|---|
| Java (JDK) | 11+ | `java -version` must show 11 or higher |
| Docker Desktop | any | Must be running before `docker-compose up` |
| Node.js | 18+ | For the React frontend only |
| AWS account | — | **Only** needed for `LLM_MODE=bedrock`. Mock mode needs no credentials. |

Maven is **vendored** inside `supply-chain-system/apache-maven-3.9.6/`. Do not rely on a globally installed `mvn`.

---

## Quick Start — Mock Mode (no AWS credentials)

```bash
# 1. Start PostgreSQL
cd supply-chain-system
docker-compose up -d
# Wait ~5 seconds for Postgres to be ready

# 2. Start backend (Windows PowerShell)
$env:LLM_MODE="mock"
.\apache-maven-3.9.6\bin\mvn exec:java

# 2. Start backend (macOS / Linux)
LLM_MODE=mock ./apache-maven-3.9.6/bin/mvn exec:java

# 3. Start frontend (new terminal, from Final-Project root)
cd frontend
npm install        # first time only
npm run dev        # http://localhost:5173
```

Backend runs on `http://localhost:8080`. Test it:
```bash
curl http://localhost:8080/health

curl -X POST http://localhost:8080/disruption \
  -H "Content-Type: application/json" \
  -d '{"reportText": "Warehouse W1 has been flooded. All inventory is damaged."}'
```

---

## Quick Start — Bedrock Mode (real Claude LLM)

```bash
# Windows PowerShell
$env:LLM_MODE="bedrock"
$env:AWS_REGION="us-east-1"
$env:AWS_ACCESS_KEY_ID="<your-key>"
$env:AWS_SECRET_ACCESS_KEY="<your-secret>"
$env:BEDROCK_MODEL_ID="anthropic.claude-3-haiku-20240307-v1:0"

cd supply-chain-system
.\apache-maven-3.9.6\bin\mvn exec:java
```

```bash
# macOS / Linux
export LLM_MODE=bedrock
export AWS_REGION=us-east-1
export AWS_ACCESS_KEY_ID=<your-key>
export AWS_SECRET_ACCESS_KEY=<your-secret>
export BEDROCK_MODEL_ID=anthropic.claude-3-haiku-20240307-v1:0

./apache-maven-3.9.6/bin/mvn exec:java
```

Supported Bedrock model IDs:
- `anthropic.claude-3-haiku-20240307-v1:0` — fastest, cheapest
- `anthropic.claude-3-sonnet-20240229-v1:0` — balanced
- `anthropic.claude-3-5-sonnet-20241022-v2:0` — most capable

---

## Two-Node Cluster (local simulation)

Run in two separate terminals from `supply-chain-system/`:

```powershell
# Terminal 1 — seed node (port 2551, HTTP 8080)
$env:AKKA_PORT="2551"; $env:HTTP_PORT="8080"; $env:LLM_MODE="mock"
.\apache-maven-3.9.6\bin\mvn exec:java

# Terminal 2 — second node (port 2552, HTTP 8081)
$env:AKKA_PORT="2552"; $env:HTTP_PORT="8081"; $env:LLM_MODE="mock"
.\apache-maven-3.9.6\bin\mvn exec:java
```

After both nodes form a cluster, the frontend node pill shows **2 nodes**. Domain entities (`W1`, `T2`, etc.) distribute across both nodes transparently.

---

## Project Structure

```
Final-Project/
├── supply-chain-system/          # Scala/Akka backend
│   ├── src/main/scala/com/supplychain/
│   │   ├── Main.scala                      # 8-step bootstrap
│   │   ├── actors/
│   │   │   ├── GuardianActor.scala         # Root actor, Cluster Sharding init
│   │   │   ├── SimulationManagerActor.scala# Case factory, Receptionist
│   │   │   └── domain/
│   │   │       ├── SupplierActor.scala
│   │   │       ├── WarehouseActor.scala
│   │   │       ├── TruckActor.scala
│   │   │       └── StoreActor.scala
│   │   │   └── workflow/
│   │   │       ├── DisruptionCaseActor.scala   # FSM + EventSourced
│   │   │       ├── ImpactAnalysisActor.scala   # Fan-out aggregator
│   │   │       ├── LLMInterpreterActor.scala   # LLM extraction step
│   │   │       ├── MitigationPlannerActor.scala# LLM mitigation step
│   │   │       ├── ReportActor.scala           # Persist + SSE publish
│   │   │       └── JournalReadActor.scala      # CQRS read projection
│   │   ├── config/AppConfig.scala
│   │   ├── domain/model/                   # ADTs: Commands, Events, Entities
│   │   ├── graph/
│   │   │   ├── SupplyChainGraph.scala      # Dijkstra traversal
│   │   │   └── GraphReplicatorActor.scala  # LWWMap distributed store
│   │   ├── http/
│   │   │   ├── Routes.scala               # REST + SSE endpoints
│   │   │   ├── HttpServer.scala
│   │   │   └── DisruptionStreamRegistry.scala  # BroadcastHub SSE fan-out
│   │   ├── llm/
│   │   │   ├── LlmClient.scala            # Trait (interface)
│   │   │   ├── BedrockLlmClient.scala     # AWS Bedrock implementation
│   │   │   ├── MockLlmClient.scala        # Deterministic test double
│   │   │   ├── RealLlmClient.scala        # OpenAI implementation
│   │   │   ├── PromptBuilder.scala        # RAG-grounded prompt construction
│   │   │   └── JsonValidator.scala        # LLM output schema validation
│   │   └── persistence/
│   │       └── PersistenceRepository.scala # CQRS read-side JDBC writer
│   ├── src/main/resources/
│   │   ├── application.conf               # Akka + JDBC + LLM config
│   │   └── sql/create_tables.sql          # PostgreSQL schema
│   ├── src/test/scala/                    # Akka TestKit specs
│   ├── docker-compose.yml                 # PostgreSQL service
│   └── apache-maven-3.9.6/               # Vendored Maven (use this, not global)
│
├── frontend/                     # React 18 + Vite dashboard
│   └── src/
│       ├── App.jsx                        # Layout, SSE client, state
│       └── components/
│           ├── NetworkMap.jsx             # D3-style SVG topology
│           ├── DisruptionFeed.jsx         # Incident list sidebar
│           └── AnalysisView.jsx           # Per-case detail panel
│
├── DEVELOPER_DEEP_DIVE.md        # Complete technical reference (23 sections)
├── CLAUDE.md                     # AI agent operational guide
└── README.md                     # This file
```

---

## Technology Stack

| Technology | Version | Role |
|---|---|---|
| Scala | 2.13.12 | Backend language |
| Akka Typed (Actor, Persistence, Cluster, Streams, HTTP) | 2.6.21 | Entire backend runtime |
| akka-persistence-jdbc | 5.0.4 | PostgreSQL event journal |
| Akka Distributed Data | 2.6.21 | Cluster-replicated graph store (`LWWMap`) |
| spray-json | — | HTTP JSON serialization |
| AWS Bedrock SDK (Java v2) | 2.x | Claude 3 Haiku LLM calls |
| PostgreSQL | 15 | Event journal + read-side projection |
| Maven | 3.9.6 | Build tool (vendored) |
| React | 18 | Frontend UI |
| Vite | latest | Frontend dev server + bundler |
| Lucide React | — | Icons |
| Docker Compose | — | PostgreSQL container |

---

## API Reference

| Method | Path | Description |
|---|---|---|
| `GET` | `/health` | Liveness check — returns `{ "status": "ok" }` |
| `POST` | `/disruption` | Submit a disruption report. Body: `{ "reportText": "..." }`. Returns `DisruptionReport` JSON. |
| `GET` | `/disruption` | List all completed disruption reports (from `disruption_reports` table). |
| `GET` | `/disruption/:caseId` | Get a single report by case ID. |
| `GET` | `/disruption/stream` | SSE stream — each `data:` event is a `DisruptionReport` JSON object. |
| `GET` | `/cluster/status` | Returns `{ "nodeCount": N, "members": [...] }` for the Akka cluster. |

### Example disruption reports to test

```bash
# Warehouse flood (mock mode: triggers WAREHOUSE_SHORTFALL on W1)
curl -X POST http://localhost:8080/disruption \
  -H "Content-Type: application/json" \
  -d '{"reportText": "Warehouse W1 has been flooded. All stock is damaged."}'

# Truck breakdown (mock mode: triggers TRUCK_BREAKDOWN on T2)
curl -X POST http://localhost:8080/disruption \
  -H "Content-Type: application/json" \
  -d '{"reportText": "Truck T2 broke down on I-95 with a flat tire."}'

# Supplier delay (mock mode: triggers SUPPLIER_DELAY on S1)
curl -X POST http://localhost:8080/disruption \
  -H "Content-Type: application/json" \
  -d '{"reportText": "Supplier S1 delayed all shipments by 5 days due to port congestion."}'

# Store shortage (mock mode: triggers STORE_SHORTAGE on ST3)
curl -X POST http://localhost:8080/disruption \
  -H "Content-Type: application/json" \
  -d '{"reportText": "Store ST3 is running critically low on inventory."}'
```

---

## Configuration

All configuration lives in `supply-chain-system/src/main/resources/application.conf`. Key settings override via environment variables:

| Env Var | Default | Description |
|---|---|---|
| `LLM_MODE` | `mock` | `mock` / `real` / `bedrock` |
| `OPENAI_API_KEY` | — | Required if `LLM_MODE=real` |
| `OPENAI_MODEL` | `gpt-4o-mini` | OpenAI model name |
| `AWS_ACCESS_KEY_ID` | — | Required if `LLM_MODE=bedrock` |
| `AWS_SECRET_ACCESS_KEY` | — | Required if `LLM_MODE=bedrock` |
| `AWS_REGION` | `us-east-1` | Bedrock region |
| `BEDROCK_MODEL_ID` | `anthropic.claude-3-haiku-20240307-v1:0` | Bedrock model |
| `POSTGRES_HOST` | `localhost` | PostgreSQL host |
| `POSTGRES_PORT` | `5432` | PostgreSQL port |
| `POSTGRES_DB` | `supplychain` | Database name |
| `POSTGRES_USER` | `sc_user` | DB user |
| `POSTGRES_PASSWORD` | `sc_pass` | DB password |
| `HTTP_PORT` | `8080` | HTTP server port |
| `AKKA_PORT` | `2551` | Akka remote port |
| `AKKA_HOSTNAME` | `127.0.0.1` | Akka advertised hostname |

---

## Build Commands

All commands run from `supply-chain-system/`.

```bash
# Compile
./apache-maven-3.9.6/bin/mvn compile           # macOS/Linux
.\apache-maven-3.9.6\bin\mvn compile           # Windows

# Run tests
./apache-maven-3.9.6/bin/mvn test

# Package fat JAR (for deployment)
./apache-maven-3.9.6/bin/mvn package -DskipTests
# Output: target/supply-chain-system-1.0.0.jar

# Clean
./apache-maven-3.9.6/bin/mvn clean
```

---

## Troubleshooting

| Symptom | Cause | Fix |
|---|---|---|
| `Recovery timed out` on startup | PostgreSQL not ready | Run `docker-compose up -d` and wait 5 seconds before starting the app |
| `503 Service Unavailable` on POST | Cluster not yet formed | Wait ~10 seconds after startup for the cluster to stabilize |
| `mvn is not recognized` | Using global Maven, not vendored | Use `.\apache-maven-3.9.6\bin\mvn` (the path in this repo) |
| AWS auth errors in bedrock mode | Expired or missing credentials | Verify `AWS_ACCESS_KEY_ID`, `AWS_SECRET_ACCESS_KEY`, `AWS_REGION` are set |
| Duplicate incidents in frontend | SSE + POST race condition | Already fixed — both handlers deduplicate by `caseId` |
| Cluster forms with only 1 node | Second seed node not running | Single-node is fine — cluster stabilizes with just node `2551` |
| Java serialization error | Old `LWWMap[String,Double]` type | Already fixed to `LWWMap[String,String]` in `GraphReplicatorActor` |

---

## Documentation Index

| File | Contents |
|---|---|
| `README.md` | This file — quick start, API reference, architecture overview |
| `DEVELOPER_DEEP_DIVE.md` | 23-section technical deep-dive: actor hierarchy, message flows, design patterns, course concept mapping, professor Q&A |
| `CLAUDE.md` | Build commands, code style conventions, known gotchas — authoritative operational guide |

---

*CSYE 7374 · Northeastern University · Spring 2026*
