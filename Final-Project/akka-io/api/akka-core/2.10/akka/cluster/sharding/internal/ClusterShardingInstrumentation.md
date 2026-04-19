---
description: Akka 2.10.17 - akka.cluster.sharding.internal.ClusterShardingInstrumentation
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html
title: Akka 2.10.17 - akka.cluster.sharding.internal.ClusterShardingInstrumentation
---

# Akka 2.10.17 - akka.cluster.sharding.internal.ClusterShardingInstrumentation

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.internal.ClusterShardingInstrumentation

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/internal/jfr/index.html "Permalink")  package [jfr](jfr/index.html)Definition Classes[internal](index.html)
- ClusterShardingInstrumentation
- [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "INTERNAL API")
- [ClusterShardingTelemetryEnsemble](ClusterShardingTelemetryEnsemble.html "INTERNAL API")
- [EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation.html "INTERNAL API")
- [ShardingFlightRecorder](ShardingFlightRecorder$.html "INTERNAL API")
t[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[internal](index.html)

# ClusterShardingInstrumentation[**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html "Permalink")

### 

#### trait ClusterShardingInstrumentation extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

INTERNAL API: Instrumentation SPI for Akka Cluster.

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)() Source[ClusterShardingInstrumentation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/internal/ClusterShardingInstrumentation.scala#L142)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ClusterShardingTelemetryEnsemble](ClusterShardingTelemetryEnsemble.html), [EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation.html), [EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterShardingInstrumentation
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#dependencies:Seq[String] "Permalink") abstract  def dependencies: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]Optional dependencies for this instrumentation.

Optional dependencies for this instrumentation.

Dependency instrumentations will always be ordered before this instrumentation.

returnslist of class names for optional instrumentation dependencies
2. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#messageDropped(typeName:String):Unit "Permalink") abstract  def messageDropped(typeName: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
3. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#receivedShardHome(typeName:String,shardId:String):Unit "Permalink") abstract  def receivedShardHome(typeName: String, shardId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
4. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#regionRequestedShardHome(typeName:String,shardId:String):Unit "Permalink") abstract  def regionRequestedShardHome(typeName: String, shardId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
5. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#shardHandoffFinished(typeName:String,shard:String,ok:Boolean):Unit "Permalink") abstract  def shardHandoffFinished(typeName: String, shard: String, ok: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
6. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#shardHandoffStarted(typeName:String,shard:String):Unit "Permalink") abstract  def shardHandoffStarted(typeName: String, shard: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
7. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#shardRegionBufferSize(typeName:String,size:Int):Unit "Permalink") abstract  def shardRegionBufferSize(typeName: String, size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
8. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#shardRegionBufferSizeIncremented(typeName:String):Unit "Permalink") abstract  def shardRegionBufferSizeIncremented(typeName: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
### Concrete Value Members

1. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterShardingInstrumentation toany2stringadd\[ClusterShardingInstrumentation] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterShardingInstrumentation, B)ImplicitThis member is added by an implicit conversion from ClusterShardingInstrumentation toArrowAssoc\[ClusterShardingInstrumentation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterShardingInstrumentation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingInstrumentationImplicitThis member is added by an implicit conversion from ClusterShardingInstrumentation toEnsuring\[ClusterShardingInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterShardingInstrumentation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingInstrumentationImplicitThis member is added by an implicit conversion from ClusterShardingInstrumentation toEnsuring\[ClusterShardingInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingInstrumentationImplicitThis member is added by an implicit conversion from ClusterShardingInstrumentation toEnsuring\[ClusterShardingInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingInstrumentationImplicitThis member is added by an implicit conversion from ClusterShardingInstrumentation toEnsuring\[ClusterShardingInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterShardingInstrumentation toStringFormat\[ClusterShardingInstrumentation] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterShardingInstrumentation, B)ImplicitThis member is added by an implicit conversion from ClusterShardingInstrumentation toArrowAssoc\[ClusterShardingInstrumentation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterShardingInstrumentation to any2stringadd\[ClusterShardingInstrumentation]

### Inherited by implicit conversion StringFormat fromClusterShardingInstrumentation to StringFormat\[ClusterShardingInstrumentation]

### Inherited by implicit conversion Ensuring fromClusterShardingInstrumentation to Ensuring\[ClusterShardingInstrumentation]

### Inherited by implicit conversion ArrowAssoc fromClusterShardingInstrumentation to ArrowAssoc\[ClusterShardingInstrumentation]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/ClusterShardingTelemetryEnsemble.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/ShardingFlightRecorder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/jfr/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html)*