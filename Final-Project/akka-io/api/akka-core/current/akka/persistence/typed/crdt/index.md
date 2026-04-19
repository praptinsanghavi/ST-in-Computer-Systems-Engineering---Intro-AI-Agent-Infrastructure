---
description: Akka 2.10.17 - akka.persistence.typed.crdt
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:57:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/index.html
title: Akka 2.10.17 - akka.persistence.typed.crdt
---

# Akka 2.10.17 - akka.persistence.typed.crdt

> **Summary:** Akka 2.10.17 - akka.persistence.typed.crdt

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/crdt/index.html "Permalink")  package crdtDefinition Classes[typed](../index.html)
- [Counter](Counter.html)
- [LwwTime](LwwTime.html "Utility class for comparing timestamp replica identifier when implementing last-writer wins.")
- [ORSet](ORSet.html "Implements a 'Observed Remove Set' operation based CRDT, also called a 'OR-Set'.")
- [OpCrdt](OpCrdt.html)
- [**](../../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](../delivery/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[typed](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html)

# crdt[**](../../../../akka/persistence/typed/crdt/index.html "Permalink")

#### package crdt

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/typed/crdt/Counter.html "Permalink") final  case class [Counter](Counter.html)(value: BigInt) extends [OpCrdt](OpCrdt.html)\[[Updated](Counter$$Updated.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../../akka/persistence/typed/crdt/LwwTime.html "Permalink") final  case class [LwwTime](LwwTime.html "Utility class for comparing timestamp replica identifier when implementing last-writer wins.")(timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), originReplica: [ReplicaId](../ReplicaId.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableUtility class for comparing timestamp replica
identifier when implementing last\-writer wins.
3. [**](../../../../akka/persistence/typed/crdt/ORSet.html "Permalink") final  class [ORSet](ORSet.html "Implements a 'Observed Remove Set' operation based CRDT, also called a 'OR-Set'.")\[A] extends [OpCrdt](OpCrdt.html)\[[DeltaOp](ORSet$$DeltaOp.html)]Implements a 'Observed Remove Set' operation based CRDT, also called a 'OR\-Set'.

Implements a 'Observed Remove Set' operation based CRDT, also called a 'OR\-Set'.
Elements can be added and removed any number of times. Concurrent add wins
over remove.

It is not implemented as in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).
This is more space efficient and doesn't accumulate garbage for removed elements.
It is described in the paper
[An optimized conflict\-free replicated set](https://hal.inria.fr/file/index/docid/738680/filename/RR-8083.pdf)
The implementation is inspired by the Riak DT [riak\_dt\_orswot](https://github.com/basho/riak_dt/blob/develop/src/riak_dt_orswot.erl).

The ORSet has a version vector that is incremented when an element is added to
the set. The `DC -> count` pair for that increment is stored against the
element as its "birth dot". Every time the element is re\-added to the set,
its "birth dot" is updated to that of the `DC -> count` version vector entry
resulting from the add. When an element is removed, we simply drop it, no tombstones.

When an element exists in replica A and not replica B, is it because A added
it and B has not yet seen that, or that B removed it and A has not yet seen that?
In this implementation we compare the `dot` of the present element to the version vector
in the Set it is absent from. If the element dot is not "seen" by the Set version vector,
that means the other set has yet to see this add, and the item is in the merged
Set. If the Set version vector dominates the dot, that means the other Set has removed this
element already, and the item is not in the merged Set.

This class is immutable, i.e. "modifying" methods return a new instance.
4. [**](../../../../akka/persistence/typed/crdt/OpCrdt.html "Permalink")  trait [OpCrdt](OpCrdt.html)\[Operation] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../akka/persistence/typed/crdt/Counter$.html "Permalink")  object [Counter](Counter$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
2. [**](../../../../akka/persistence/typed/crdt/ORSet$.html "Permalink")  object [ORSet](ORSet$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/Counter$$Updated.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/Counter$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/Counter.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/LwwTime.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/ORSet$$DeltaOp.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/ORSet$.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/ORSet.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/OpCrdt.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/serialization/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka-core/current/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/index.html](https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/index.html)*