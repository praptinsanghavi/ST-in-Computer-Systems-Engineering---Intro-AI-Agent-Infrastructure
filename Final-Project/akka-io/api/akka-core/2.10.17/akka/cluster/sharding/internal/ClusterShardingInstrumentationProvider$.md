---
description: Akka 2.10.17 - akka.cluster.sharding.internal.ClusterShardingInstrumentationProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html
title: Akka 2.10.17 - akka.cluster.sharding.internal.ClusterShardingInstrumentationProvider
---

# Akka 2.10.17 - akka.cluster.sharding.internal.ClusterShardingInstrumentationProvider

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.internal.ClusterShardingInstrumentationProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/internal/jfr/index.html "Permalink")  package [jfr](jfr/index.html)Definition Classes[internal](index.html)
- [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "INTERNAL API: Instrumentation SPI for Akka Cluster.")
- [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "INTERNAL API")
- [ClusterShardingTelemetryEnsemble](ClusterShardingTelemetryEnsemble.html "INTERNAL API")
- [EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation.html "INTERNAL API")
- [ShardingFlightRecorder](ShardingFlightRecorder$.html "INTERNAL API")
[o](ClusterShardingInstrumentationProvider.html "See companion class")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[internal](index.html)

# [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "See companion class")[**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html "Permalink")

### Companion [class ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "See companion class")

#### object ClusterShardingInstrumentationProvider extends [ExtensionId](../../../actor/ExtensionId.html)\[[ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html)] with [ExtensionIdProvider](../../../actor/ExtensionIdProvider.html)

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)() Source[ClusterShardingInstrumentation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/internal/ClusterShardingInstrumentation.scala#L24)Linear Supertypes[ExtensionIdProvider](../../../actor/ExtensionIdProvider.html), [ExtensionId](../../../actor/ExtensionId.html)\[[ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterShardingInstrumentationProvider
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html)): [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../../actor/ExtensionId.html)
5. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../../../actor/ActorSystem.html)): [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../../actor/ExtensionId.html)
6. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.cluster.sharding.internal.ClusterShardingInstrumentationProvider "Permalink")  def createExtension(system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html)): [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesClusterShardingInstrumentationProvider → [ExtensionId](../../../actor/ExtensionId.html)
9. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../../actor/ExtensionId.html) → AnyRef → Any
11. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.cluster.sharding.internal.ClusterShardingInstrumentationProvider "Permalink")  def get(system: [ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html)): [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesClusterShardingInstrumentationProvider → [ExtensionId](../../../actor/ExtensionId.html)
12. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#get(system:akka.actor.ActorSystem):akka.cluster.sharding.internal.ClusterShardingInstrumentationProvider "Permalink")  def get(system: [ActorSystem](../../../actor/ActorSystem.html)): [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ActorSystem): TheExtension = super.get(system)
```
Definition ClassesClusterShardingInstrumentationProvider → [ExtensionId](../../../actor/ExtensionId.html)
13. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../../actor/ExtensionId.html) → AnyRef → Any
15. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#lookup:akka.cluster.sharding.internal.ClusterShardingInstrumentationProvider.type "Permalink")  def lookup: ClusterShardingInstrumentationProviderReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesClusterShardingInstrumentationProvider → [ExtensionIdProvider](../../../actor/ExtensionIdProvider.html)
17. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../../../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../../../actor/ExtensionId.html)\[[ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardingTelemetryEnsemble.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/ShardingFlightRecorder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/jfr/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html)*