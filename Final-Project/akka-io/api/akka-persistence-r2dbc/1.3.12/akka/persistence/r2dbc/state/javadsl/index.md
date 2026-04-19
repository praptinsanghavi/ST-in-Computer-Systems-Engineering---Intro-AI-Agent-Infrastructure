---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:09:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/index.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/index.html "Permalink")  package [state](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/javadsl/index.html "Permalink")  package javadslDefinition Classes[state](../index.html)
- [AdditionalColumn](AdditionalColumn.html)
- [ChangeHandler](ChangeHandler.html)
- [R2dbcDurableStateStore](R2dbcDurableStateStore.html)
- [**](../../../../../akka/persistence/r2dbc/state/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[state](../index.html)
p[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[state](../index.html)

# javadsl[**](../../../../../akka/persistence/r2dbc/state/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn.html "Permalink") abstract  class [AdditionalColumn](AdditionalColumn.html)\[A, B] extends AnyRefA
 The type of the durable state

B
 The type of the field stored in the additional column.

Annotations@ApiMayChange()
2. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html "Permalink")  trait [ChangeHandler](ChangeHandler.html)\[A] extends AnyRefAnnotations@ApiMayChange()
3. [**](../../../../../akka/persistence/r2dbc/state/javadsl/R2dbcDurableStateStore.html "Permalink")  class [R2dbcDurableStateStore](R2dbcDurableStateStore.html)\[A] extends DurableStateUpdateWithChangeEventStore\[A] with DurableStateStoreBySliceQuery\[A] with DurableStateStorePagedPersistenceIdsQuery\[A]
### Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html "Permalink")  object [AdditionalColumn](AdditionalColumn$.html)Annotations@ApiMayChange()
2. [**](../../../../../akka/persistence/r2dbc/state/javadsl/R2dbcDurableStateStore$.html "Permalink")  object [R2dbcDurableStateStore](R2dbcDurableStateStore$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/ChangeHandler.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/R2dbcDurableStateStore$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/R2dbcDurableStateStore.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/index.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/index.html)*