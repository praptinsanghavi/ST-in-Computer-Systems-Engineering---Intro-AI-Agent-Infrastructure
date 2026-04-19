---
description: Akka 2.10.17 - akka.cluster.sharding.internal.ShardingFlightRecorder
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/internal/ShardingFlightRecorder$.html
title: Akka 2.10.17 - akka.cluster.sharding.internal.ShardingFlightRecorder
---

# Akka 2.10.17 - akka.cluster.sharding.internal.ShardingFlightRecorder

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.internal.ShardingFlightRecorder

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
- ShardingFlightRecorder
o[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[internal](index.html)

# ShardingFlightRecorder[**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html "Permalink")

### 

#### object ShardingFlightRecorder

INTERNAL API

Annotations@[InternalApi](../../../annotation/InternalApi.html)() Source[ShardingFlightRecorder.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/internal/ShardingFlightRecorder.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardingFlightRecorder
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#entityPassivate(entityId:String):Unit "Permalink")  def entityPassivate(entityId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
7. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#entityPassivateRestart(entityId:String):Unit "Permalink")  def entityPassivateRestart(entityId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
8. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#rememberEntityAdd(entityId:String):Unit "Permalink")  def rememberEntityAdd(entityId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
17. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#rememberEntityOperation(duration:Long):Unit "Permalink")  def rememberEntityOperation(duration: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
18. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#rememberEntityRemove(entityId:String):Unit "Permalink")  def rememberEntityRemove(entityId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
19. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ClusterShardingTelemetryEnsemble.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ShardingFlightRecorder$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/jfr/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ShardingFlightRecorder$.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ShardingFlightRecorder$.html)*