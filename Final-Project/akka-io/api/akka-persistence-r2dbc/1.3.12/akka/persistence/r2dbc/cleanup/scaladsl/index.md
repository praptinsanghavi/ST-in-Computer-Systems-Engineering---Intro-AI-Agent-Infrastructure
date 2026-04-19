---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/index.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.scaladsl
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.scaladsl

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.scaladsl

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/cleanup/index.html "Permalink")  package [cleanup](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[cleanup](../index.html)
- [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[cleanup](../index.html)
- [DurableStateCleanup](DurableStateCleanup.html "Scala API: Tool for deleting durable state for a given list of persistenceIds without using DurableStateBehavior actors.")
- [EventSourcedCleanup](EventSourcedCleanup.html "Scala API: Tool for deleting events and/or snapshots for a given list of persistenceIds without using persistent actors.")
p[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[cleanup](../index.html)

# scaladsl[**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/index.html "Permalink")

#### package scaladsl

### Type Members

1. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html "Permalink") final  class [DurableStateCleanup](DurableStateCleanup.html "Scala API: Tool for deleting durable state for a given list of persistenceIds without using DurableStateBehavior actors.") extends AnyRefScala API: Tool for deleting durable state for a given list of `persistenceIds` without using `DurableStateBehavior`
actors.

Scala API: Tool for deleting durable state for a given list of `persistenceIds` without using `DurableStateBehavior`
actors. It's important that the actors with corresponding persistenceId are not running at the same time as using the
tool.

If `resetRevisionNumber` is `true` then the creating entity with the same `persistenceId` will start from 0\.
Otherwise it will continue from the latest highest used revision number.

WARNING: reusing the same `persistenceId` after resetting the revision number should be avoided, since it might be
confusing to reuse the same revision numbers for new state changes.

When a list of `persistenceIds` are given they are deleted sequentially in the order of the list. It's possible to
parallelize the deletes by running several cleanup operations at the same time operating on different sets of
`persistenceIds`.

Annotations@ApiMayChange()
2. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/EventSourcedCleanup.html "Permalink") final  class [EventSourcedCleanup](EventSourcedCleanup.html "Scala API: Tool for deleting events and/or snapshots for a given list of persistenceIds without using persistent actors.") extends AnyRefScala API: Tool for deleting events and/or snapshots for a given list of `persistenceIds` without using persistent
actors.

Scala API: Tool for deleting events and/or snapshots for a given list of `persistenceIds` without using persistent
actors.

When running an operation with `EventSourcedCleanup` that deletes all events for a persistence id, the actor with
that persistence id must not be running! If the actor is restarted it would in that case be recovered to the wrong
state since the stored events have been deleted. Delete events before snapshot can still be used while the actor is
running.

If `resetSequenceNumber` is `true` then the creating entity with the same `persistenceId` will start from 0\.
Otherwise it will continue from the latest highest used sequence number.

WARNING: reusing the same `persistenceId` after resetting the sequence number should be avoided, since it might be
confusing to reuse the same sequence number for new events.

When a list of `persistenceIds` are given they are deleted sequentially in the order of the list. It's possible to
parallelize the deletes by running several cleanup operations at the same time operating on different sets of
`persistenceIds`.

Annotations@ApiMayChange()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/EventSourcedCleanup.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/index.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/index.html)*