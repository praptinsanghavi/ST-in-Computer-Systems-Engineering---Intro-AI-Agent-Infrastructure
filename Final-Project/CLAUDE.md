# CLAUDE.md — Agentic Supply Chain Disruption System
> **Operational Guide for AI Agents and Developers**
> This file contains all build, run, test, and development workflow commands.
> Read `PROJECT_STATE.md` first for architectural context.

---

## Project Overview (For AI Agents)

This is a **Scala 2.13 / Akka Typed 2.6** backend system using **Maven** as the build tool.
The `mvn` executable is **vendored** inside the project at `./apache-maven-3.9.6/bin/mvn`.
Do not assume a globally installed `mvn` — always use the relative path below.

- **Language:** Scala 2.13.12
- **Build Tool:** Maven 3.9.6 (vendored at `supply-chain-system/apache-maven-3.9.6/`)
- **JVM Target:** Java 11
- **Main Class:** `com.supplychain.Main`
- **Working Dir for all commands:** `supply-chain-system/`

---

## Build Commands

All commands must be run from the `supply-chain-system/` directory.

### Compile
```powershell
# Windows — using vendored Maven
.\apache-maven-3.9.6\bin\mvn compile
```

```bash
# macOS / Linux — using vendored Maven
./apache-maven-3.9.6/bin/mvn compile
```

### Run Tests
```powershell
.\apache-maven-3.9.6\bin\mvn test
```

### Package (Fat JAR for deployment)
```powershell
.\apache-maven-3.9.6\bin\mvn package -DskipTests
# Output: target/supply-chain-system-1.0.0.jar
```

### Clean
```powershell
.\apache-maven-3.9.6\bin\mvn clean
```

### Full Clean + Compile (recommended after dependency changes)
```powershell
.\apache-maven-3.9.6\bin\mvn clean compile
```

---

## Running the System

### Step 1 — Start PostgreSQL via Docker
```powershell
# From supply-chain-system/ directory
docker-compose up -d
```

This starts PostgreSQL 15 on `localhost:5432` with:
- Database: `supplychain`
- User: `sc_user`
- Password: `sc_pass`

Wait ~5 seconds for Postgres to be ready before starting the app.

### Step 2 — Run in Mock LLM Mode (No AWS credentials needed)
```powershell
# Windows PowerShell
$env:LLM_MODE="mock"; .\apache-maven-3.9.6\bin\mvn exec:java
```

```bash
# macOS / Linux
LLM_MODE=mock ./apache-maven-3.9.6/bin/mvn exec:java
```

The system starts on `http://localhost:8080`.

### Step 3 — Run in Bedrock (Real LLM) Mode
```powershell
# Windows PowerShell — set ALL of these before running
$env:LLM_MODE="bedrock"
$env:AWS_REGION="us-east-1"
$env:AWS_ACCESS_KEY_ID="<your-key>"
$env:AWS_SECRET_ACCESS_KEY="<your-secret>"
$env:BEDROCK_MODEL_ID="anthropic.claude-3-haiku-20240307-v1:0"

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

### Step 4 — Run the Frontend Dashboard

```powershell
# From the frontend/ directory
cd ..\frontend
npm install     # only needed once
npm run dev     # starts on http://localhost:5173
```

---

## Testing the API

### Health Check
```bash
curl http://localhost:8080/health
```

### Submit a Disruption Report (Mock Mode)
```bash
curl -X POST http://localhost:8080/disruption \
  -H "Content-Type: application/json" \
  -d '{"reportText": "Warehouse W1 has been flooded due to hurricane. All stock is damaged."}'
```

### Submit a Disruption Report (Bedrock Mode — Real NLP)
```bash
curl -X POST http://localhost:8080/disruption \
  -H "Content-Type: application/json" \
  -d '{"reportText": "Supplier S1 delayed all shipments by 5 days due to port congestion in Houston."}'
```

### Check Case Status
```bash
curl http://localhost:8080/disruption/<caseId>
```

### List All Completed Cases
```bash
curl http://localhost:8080/disruption
```

### Cluster Status (Multi-Node Mode)
```bash
curl http://localhost:8080/cluster/status
```

---

## Running a Second Cluster Node (Local Simulation)

To simulate a 2-node Akka Cluster on one machine:

```powershell
# Terminal 1 — Node 1 (port 2551, http 8080)
$env:AKKA_PORT="2551"; $env:HTTP_PORT="8080"; $env:LLM_MODE="mock"
.\apache-maven-3.9.6\bin\mvn exec:java

# Terminal 2 — Node 2 (port 2552, http 8081)
$env:AKKA_PORT="2552"; $env:HTTP_PORT="8081"; $env:LLM_MODE="mock"
.\apache-maven-3.9.6\bin\mvn exec:java
```

The cluster seed nodes are pre-configured in `application.conf` for `127.0.0.1:2551` and `127.0.0.1:2552`.

---

## Code Style & Conventions

### Scala Style (Akka Typed)
1. **All actor messages must be sealed traits or final case classes.** Never use `Any` or untyped messages.
2. **State in actors is always immutable.** Use `state.copy(...)` — never mutate a `var` inside a `Behaviors.receive`.
3. **Never block inside an actor.** All `Future[T]` calls (DB, LLM, network) must use `ctx.pipeToSelf(myFuture)(transformResult)`.
4. **All network-crossing messages implement `CborSerializable`.** This is enforced by the Akka serialization binding in `application.conf`.
5. **Supervision policies must be explicit.** Never rely on the default stop strategy. Use `Behaviors.supervise(...).onFailure[ExceptionType](strategy)`.

### Adding a New Domain Actor Type
1. Define commands/events/state in `domain/model/`
2. Implement `XxxActor.scala` in `actors/domain/`
3. Register `EntityTypeKey[XxxCommand]("Xxx")` in `GuardianActor`
4. Add sharding init (`sharding.init(Entity(xxxTypeKey) { ... })`) in `GuardianActor`
5. Add `getXxx(id: XxxId): EntityRef[XxxCommand]` to `DomainShardedRefs`
6. Update `SupplyChainGraph.buildFromConfig` with the new entity's topology edges
7. Update `application.conf` simulation block with the new entity IDs

### Adding a New HTTP Endpoint
1. Add the route to `http/Routes.scala` using Akka HTTP DSL
2. Add JSON format to `HttpJsonProtocol` (spray-json) in `Routes.scala`
3. Keep the route a pure boundary — no business logic in routes, always delegate to actors via `simulationManager.ask(...)`

### Adding a New Event Type
1. Add event type label to `EventType` sealed trait in `domain/model/`
2. Add handling in `DisruptionCaseActor.triggerImpactAnalysis` (the `eventType match` block)
3. Add handling in `PromptBuilder.buildExtractionPrompt` (the prompt enum list)
4. Add handling in `MockLlmClient` for test coverage

---

## Project Structure Reference

```
supply-chain-system/src/main/scala/com/supplychain/
├── Main.scala                          # ENTRY POINT — 8-step bootstrap
├── actors/
│   ├── GuardianActor.scala             # Root actor: Cluster Sharding init
│   ├── SimulationManagerActor.scala    # Case factory + lifecycle registry
│   └── domain/
│       ├── SupplierActor.scala
│       ├── WarehouseActor.scala
│       ├── TruckActor.scala
│       └── StoreActor.scala
│   └── workflow/
│       ├── DisruptionCaseActor.scala   # KEY: FSM + EventSourcedBehavior
│       └── ImpactAnalysisActor.scala   # Aggregator with timeout
├── config/
│   └── AppConfig.scala                 # Immutable HOCON config model
├── domain/
│   └── model/                          # All ADTs, sealed traits, type aliases
├── graph/
│   └── SupplyChainGraph.scala          # Dijkstra blast-radius traversal
├── http/
│   ├── HttpServer.scala
│   └── Routes.scala                    # REST endpoints (thin boundary)
├── llm/
│   ├── LlmClient.scala                 # Trait / interface
│   ├── BedrockLlmClient.scala          # AWS Bedrock Converse API impl
│   ├── MockLlmClient.scala             # Deterministic test double
│   ├── RealLlmClient.scala             # OpenAI impl
│   ├── PromptBuilder.scala             # Prompt engineering / RAG grounding
│   └── JsonValidator.scala             # Schema validation for LLM output
└── persistence/
    └── PersistenceRepository.scala     # CQRS read-side JDBC projection
```

---

## Known Issues & Gotchas

1. **Cluster formation on startup:** The app requires PostgreSQL to be running before it starts. If the DB is not yet ready, the Akka Persistence plugin will fail on first journal write. **Fix:** Run `docker-compose up -d` and wait 5+ seconds before starting the app.

2. **`Await.result` in Main.scala (12s timeout):** If the cluster takes longer than 12 seconds to form (e.g., on a slow machine), the JVM will exit. **Workaround:** Increase the timeout on line 108 of `Main.scala` or ensure Docker is healthy first.

3. **Vendored Maven on Windows:** Use `.\ ` (backslash) prefix: `.\apache-maven-3.9.6\bin\mvn`. On PowerShell, tab-completion works. If you see `mvn is not recognized`, you are using the global Maven — switch to the vendored one.

4. **LLM JSON stripping:** The Bedrock client in `BedrockLlmClient.scala` strips ` ```json ... ``` ` markdown wrappers. Some model versions (e.g., Claude Sonnet) may add extra preamble text. If you see JSON parse errors in `bedrock` mode, check the raw response logged at INFO level and adjust `PromptBuilder` to be more explicit.

5. **Cluster Sharding + single node:** Running without seed node `2552` is fine — Akka will wait for the cluster to form with just node `2551`. The first node will become both seed and member within ~10 seconds.

---

## Observability Roadmap (Future Work)

To add Prometheus + Grafana metrics:

### 1. Add Kamon dependencies to `pom.xml`
```xml
<dependency>
  <groupId>io.kamon</groupId>
  <artifactId>kamon-bundle_2.13</artifactId>
  <version>2.7.0</version>
</dependency>
<dependency>
  <groupId>io.kamon</groupId>
  <artifactId>kamon-prometheus_2.13</artifactId>
  <version>2.7.0</version>
</dependency>
```

### 2. Initialize Kamon in `Main.scala`
```scala
import kamon.Kamon
Kamon.init()  // call BEFORE ActorSystem creation
```

### 3. Key Metrics to Instrument

| Metric Name | Type | Where to Add |
|---|---|---|
| `disruption_cases_started_total` | Counter | `SimulationManagerActor.SubmitDisruption` |
| `disruption_cases_completed_total` | Counter | `DisruptionCaseActor.FinalizeCase` |
| `llm_extraction_duration_ms` | Histogram | `BedrockLlmClient.extractEvent` |
| `llm_mitigation_duration_ms` | Histogram | `BedrockLlmClient.proposeMitigations` |
| `impact_affected_entities_count` | Histogram | `ImpactAnalysisActor` on aggregation |
| `case_e2e_duration_ms` | Histogram | From `StartCase` to `FinalizeCase` |

### 4. Expose Metrics Endpoint
Kamon-Prometheus automatically exposes `/metrics` on a configurable port (default: 9095).

### 5. Docker Compose for full observability stack
```yaml
# Add to docker-compose.yml:
prometheus:
  image: prom/prometheus:latest
  volumes:
    - ./prometheus.yml:/etc/prometheus/prometheus.yml
  ports:
    - "9090:9090"

grafana:
  image: grafana/grafana:latest
  ports:
    - "3000:3000"
  environment:
    - GF_SECURITY_ADMIN_PASSWORD=admin
```

```yaml
# prometheus.yml
scrape_configs:
  - job_name: 'supply-chain'
    static_configs:
      - targets: ['host.docker.internal:9095']
```

---

*CLAUDE.md maintained by Antigravity AI | Supply Chain System v1.0.0 | April 2026*
