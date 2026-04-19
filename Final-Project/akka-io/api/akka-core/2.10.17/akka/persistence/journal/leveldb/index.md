---
description: Akka 2.10.17 - akka.persistence.journal.leveldb
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:45:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/leveldb/index.html
title: Akka 2.10.17 - akka.persistence.journal.leveldb
---

# Akka 2.10.17 - akka.persistence.journal.leveldb

> **Summary:** Akka 2.10.17 - akka.persistence.journal.leveldb

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/journal/index.html "Permalink")  package [journal](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/journal/inmem/index.html "Permalink")  package [inmem](../inmem/index.html)Definition Classes[journal](../index.html)
- [**](../../../../akka/persistence/journal/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[journal](../index.html)
- [**](../../../../akka/persistence/journal/leveldb/index.html "Permalink")  package leveldbDefinition Classes[journal](../index.html)
- [SharedLeveldbJournal](SharedLeveldbJournal$.html "For testing only.")
- [SharedLeveldbStore](SharedLeveldbStore.html "A LevelDB store that can be shared by multiple actor systems.")
p[akka](../../../index.html).[persistence](../../index.html).[journal](../index.html)

# leveldb[**](../../../../akka/persistence/journal/leveldb/index.html "Permalink")

#### package leveldb

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Deprecated Type Members

1. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbStore.html "Permalink")  class [SharedLeveldbStore](SharedLeveldbStore.html "A LevelDB store that can be shared by multiple actor systems.") extends LeveldbStoreA LevelDB store that can be shared by multiple actor systems.

A LevelDB store that can be shared by multiple actor systems. The shared store must be
set for each actor system that uses the store via `SharedLeveldbJournal.setStore`. The
shared LevelDB store is for testing only.

Annotations@deprecated Deprecated*(Since version 2\.6\.15\)* Use another journal implementation or the in\-mem journal in combination with the journal\-proxy
### Value Members

1. [**](../../../../akka/persistence/journal/leveldb/SharedLeveldbJournal$.html "Permalink")  object [SharedLeveldbJournal](SharedLeveldbJournal$.html "For testing only.")For testing only.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/inmem/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/leveldb/SharedLeveldbJournal$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/leveldb/SharedLeveldbStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/leveldb/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/leveldb/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/leveldb/index.html)*