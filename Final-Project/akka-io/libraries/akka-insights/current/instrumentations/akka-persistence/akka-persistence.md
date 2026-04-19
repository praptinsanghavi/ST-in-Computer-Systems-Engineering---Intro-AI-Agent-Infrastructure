---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:20Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/instrumentations/akka-persistence/akka-persistence.html
title: Akka Persistence • Akka Insights
---

# Akka Persistence • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka Persistence

Availability
Available since Cinnamon **2\.12\.0**

Akka Insights is capable of capturing data for the following [Akka Persistence](https://doc.akka.io/libraries/akka-core/current/persistence.html) related features.

## Cinnamon Akka Persistence module dependency

After adding the Cinnamon Agent as described in the [setup](../../setup/setup.html), make sure that you add the Cinnamon Akka Persistence module dependency to your build file:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonAkkaPersistence
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-persistence_2.13</artifactId>
  <version>2.22.2</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-persistence_2.13', version: '2.22.2'
}
```

## Persistence metrics

The following Persistence metrics are recorded, type of metric in parenthesis.

### Persistent entity metrics:

- **Active entities** (gauge) — number of active entities (in\-memory, excludes passivated entities).
- **Received commands** (gauge)\* — number of received commands.
- **Command in\-stash time** (recorder)\* — time that commands spend in the stash. See [Akka Persistence internal stash](https://doc.akka.io/libraries/akka-core/current/persistence.html#internal-stash) for the details.
- **Command processing time** (recorder)\* — time for processing the command excluding time spent in the mailbox or stash.
- **Persisted events** (gauge)\* — number of persisted events acknowledged by the journal.
- **Event persistence time** (recorder)\* — time from the moment the persist/persistAll method was called to the moment when it was acknowledged by the journal.
- **Recovery time** (recorder) — total time for recovery of a persistent entity (includes waiting for a recovery permit, and fetching and replaying events and snapshots from the journal).
- **Recovery failure time** (recorder) — failure recovery time for a persistent entity (in case of failure).

The metrics marked with `*` support automatic command type or event type dimension. It’s disabled by default, see [enabling command and event dimensions](persistent-actors-configuration.html#dimensions) for details.

### Recovery permit metrics:

When starting many persistent entites at the same time the journal data store is protected from being overloaded by limiting number of recoveries that can be in progress at the same time. The limit is controlled via configuration `akka.persistence.max-concurrent-recoveries`. See [Akka Persistence recovery](https://doc.akka.io/libraries/akka-core/current/persistence.html#recovery) for the details.

- **Used permits** (recorder) — number of used permits.
- **Pending permits** (recorder) — number of entities waiting for a permit to start recovery.
- **Max permits** (gauge) — max number of permits (set via Akka configuration).

## Persistence events

The following Persistence events are generated:

- **Recovery failure** — Event created whenever a message replay fails. Event information: `actor-ref` — the actor trying to recover `failure` — the exception that occurred `event` — the event that failed if available `recovery-failure-time` — the time in nanoseconds
- **Persist failure** — Event created whenever a message persist fails. Event information: `actor-ref` — the actor failing to persist an event `failure` — the exception that occurred `event` — the event that failed if available `sequence-number` — the event sequence number
- **Persist rejection** — Event created whenever a message persist is rejected. Event information: `actor-ref` — the actor failing to persist an event `failure` — the exception that occurred `event` — the event that failed if available `sequence-number` — the event sequence number

## Detailed information

For specific information of how to configure persistent actors see:

## Code Examples

### Example 1: Cinnamon Akka Persistence module dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonAkkaPersistence
```

### Example 2: Cinnamon Akka Persistence module dependency

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-persistence_2.13</artifactId>
  <version>2.22.2</version>
</dependency>
```

### Example 3: Cinnamon Akka Persistence module dependency

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-persistence_2.13', version: '2.22.2'
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/persistence.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-cluster-sharding/akka-cluster-sharding.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-persistence/persistent-actors-configuration.html
- https://doc.akka.io/libraries/akka-insights/current/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-persistence/akka-persistence.html](https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-persistence/akka-persistence.html)*