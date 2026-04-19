---
description: Akka 2.10.17 - akka.persistence.japi.journal
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:53:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/japi/journal/index.html
title: Akka 2.10.17 - akka.persistence.japi.journal
---

# Akka 2.10.17 - akka.persistence.japi.journal

> **Summary:** Akka 2.10.17 - akka.persistence.japi.journal

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/japi/index.html "Permalink")  package [japi](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/japi/journal/index.html "Permalink")  package journalDefinition Classes[japi](../index.html)
- [JavaJournalPerfSpec](JavaJournalPerfSpec.html "JAVA API")
- [JavaJournalSpec](JavaJournalSpec.html "JAVA API")
- [**](../../../../akka/persistence/japi/snapshot/index.html "Permalink")  package [snapshot](../snapshot/index.html)Definition Classes[japi](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[japi](../index.html)

# journal[**](../../../../akka/persistence/japi/journal/index.html "Permalink")

#### package journal

### Type Members

1. [**](../../../../akka/persistence/japi/journal/JavaJournalPerfSpec.html "Permalink")  class [JavaJournalPerfSpec](JavaJournalPerfSpec.html "JAVA API") extends [JournalPerfSpec](../../journal/JournalPerfSpec.html)JAVA API

JAVA API

Java / JUnit consumable equivalent of [akka.persistence.journal.JournalPerfSpec](../../journal/JournalPerfSpec.html) and [akka.persistence.journal.JournalSpec](../../journal/JournalSpec.html).

This spec measures execution times of the basic operations that an [akka.persistence.PersistentActor](../../PersistentActor.html) provides,
using the provided Journal (plugin).

It is \*NOT\* meant to be a comprehensive benchmark, but rather aims to help plugin developers to easily determine
if their plugin's performance is roughly as expected. It also validates the plugin still works under "more messages" scenarios.

The measurements are by default printed to `System.out`, if you want to customize this please override the [\#info](JavaJournalPerfSpec.html#info:org.scalatest.Informer) method.

The benchmark iteration and message counts are easily customisable by overriding these methods:

```
@Override
public long awaitDurationMillis() { return 10000; }

@Override
public int eventsCount() { return 10 * 1000; }

@Override
public int measurementIterations { return 10; }
```
In case your journal plugin needs some kind of setup or teardown, override the `beforeAll` or `afterAll`
methods (don't forget to call `super` in your overridden methods).

See also[akka.persistence.journal.JournalSpec](../../journal/JournalSpec.html)

[akka.persistence.journal.JournalPerfSpec](../../journal/JournalPerfSpec.html)
2. [**](../../../../akka/persistence/japi/journal/JavaJournalSpec.html "Permalink")  class [JavaJournalSpec](JavaJournalSpec.html "JAVA API") extends [JournalSpec](../../journal/JournalSpec.html)JAVA API

JAVA API

Java / JUnit API for [akka.persistence.journal.JournalSpec](../../journal/JournalSpec.html).

In case your journal plugin needs some kind of setup or teardown, override the `beforeAll` or `afterAll`
methods (don't forget to call `super` in your overridden methods).

See also[akka.persistence.journal.JournalSpec](../../journal/JournalSpec.html)

[akka.persistence.journal.JournalPerfSpec](../../journal/JournalPerfSpec.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/japi/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/japi/journal/JavaJournalPerfSpec.html
- https://doc.akka.io/api/akka/current/akka/persistence/japi/journal/JavaJournalSpec.html
- https://doc.akka.io/api/akka/current/akka/persistence/japi/journal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/japi/snapshot/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/japi/journal/index.html](https://doc.akka.io/api/akka/current/akka/persistence/japi/journal/index.html)*