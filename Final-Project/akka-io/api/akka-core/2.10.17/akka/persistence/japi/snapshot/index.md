---
description: Akka 2.10.17 - akka.persistence.japi.snapshot
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:45:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/japi/snapshot/index.html
title: Akka 2.10.17 - akka.persistence.japi.snapshot
---

# Akka 2.10.17 - akka.persistence.japi.snapshot

> **Summary:** Akka 2.10.17 - akka.persistence.japi.snapshot

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/japi/index.html "Permalink")  package [japi](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/japi/journal/index.html "Permalink")  package [journal](../journal/index.html)Definition Classes[japi](../index.html)
- [**](../../../../akka/persistence/japi/snapshot/index.html "Permalink")  package snapshotDefinition Classes[japi](../index.html)
- [JavaSnapshotStoreSpec](JavaSnapshotStoreSpec.html "JAVA API")
p[akka](../../../index.html).[persistence](../../index.html).[japi](../index.html)

# snapshot[**](../../../../akka/persistence/japi/snapshot/index.html "Permalink")

#### package snapshot

### Type Members

1. [**](../../../../akka/persistence/japi/snapshot/JavaSnapshotStoreSpec.html "Permalink")  class [JavaSnapshotStoreSpec](JavaSnapshotStoreSpec.html "JAVA API") extends [SnapshotStoreSpec](../../snapshot/SnapshotStoreSpec.html)JAVA API

JAVA API

This spec aims to verify custom akka\-persistence [akka.persistence.snapshot.SnapshotStore](../../snapshot/SnapshotStore.html) implementations.
Plugin authors are highly encouraged to include it in their plugin's test suites.

In case your snapshot\-store plugin needs some kind of setup or teardown, override the `beforeAll` or `afterAll`
methods (don't forget to call `super` in your overridden methods).

See also[akka.persistence.snapshot.SnapshotStoreSpec](../../snapshot/SnapshotStoreSpec.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/japi/journal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/japi/snapshot/JavaSnapshotStoreSpec.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/japi/snapshot/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/SnapshotStore.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/snapshot/SnapshotStoreSpec.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/japi/snapshot/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/japi/snapshot/index.html)*