---
description: Akka 2.10.17 - akka.cluster.sharding.internal.EmptyClusterShardingInstrumentation
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html
title: Akka 2.10.17 - akka.cluster.sharding.internal.EmptyClusterShardingInstrumentation
---

# Akka 2.10.17 - akka.cluster.sharding.internal.EmptyClusterShardingInstrumentation

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.internal.EmptyClusterShardingInstrumentation

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
- EmptyClusterShardingInstrumentation
- [ShardingFlightRecorder](ShardingFlightRecorder$.html "INTERNAL API")
[c](EmptyClusterShardingInstrumentation$.html "See companion object")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[internal](index.html)

# [EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation$.html "See companion object")[**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html "Permalink")

### Companion [object EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation$.html "See companion object")

#### class EmptyClusterShardingInstrumentation extends [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)() Source[ClusterShardingInstrumentation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/internal/ClusterShardingInstrumentation.scala#L119)Linear Supertypes[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EmptyClusterShardingInstrumentation
2. ClusterShardingInstrumentation
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#<init>():akka.cluster.sharding.internal.EmptyClusterShardingInstrumentation "Permalink")  new EmptyClusterShardingInstrumentation()
### Value Members

1. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EmptyClusterShardingInstrumentation toany2stringadd\[EmptyClusterShardingInstrumentation] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EmptyClusterShardingInstrumentation, B)ImplicitThis member is added by an implicit conversion from EmptyClusterShardingInstrumentation toArrowAssoc\[EmptyClusterShardingInstrumentation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#dependencies:Seq[String] "Permalink")  def dependencies: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]Optional dependencies for this instrumentation.

Optional dependencies for this instrumentation.

Dependency instrumentations will always be ordered before this instrumentation.

returnslist of class names for optional instrumentation dependencies

Definition ClassesEmptyClusterShardingInstrumentation → [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)
9. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EmptyClusterShardingInstrumentation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EmptyClusterShardingInstrumentationImplicitThis member is added by an implicit conversion from EmptyClusterShardingInstrumentation toEnsuring\[EmptyClusterShardingInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EmptyClusterShardingInstrumentation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EmptyClusterShardingInstrumentationImplicitThis member is added by an implicit conversion from EmptyClusterShardingInstrumentation toEnsuring\[EmptyClusterShardingInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EmptyClusterShardingInstrumentationImplicitThis member is added by an implicit conversion from EmptyClusterShardingInstrumentation toEnsuring\[EmptyClusterShardingInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EmptyClusterShardingInstrumentationImplicitThis member is added by an implicit conversion from EmptyClusterShardingInstrumentation toEnsuring\[EmptyClusterShardingInstrumentation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#messageDropped(typeName:String):Unit "Permalink")  def messageDropped(typeName: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesEmptyClusterShardingInstrumentation → [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)
19. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#receivedShardHome(typeName:String,shardId:String):Unit "Permalink")  def receivedShardHome(typeName: String, shardId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesEmptyClusterShardingInstrumentation → [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)
23. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#regionRequestedShardHome(typeName:String,shardId:String):Unit "Permalink")  def regionRequestedShardHome(typeName: String, shardId: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesEmptyClusterShardingInstrumentation → [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)
24. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#shardHandoffFinished(typeName:String,shard:String,ok:Boolean):Unit "Permalink")  def shardHandoffFinished(typeName: String, shard: String, ok: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesEmptyClusterShardingInstrumentation → [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)
25. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#shardHandoffStarted(typeName:String,shard:String):Unit "Permalink")  def shardHandoffStarted(typeName: String, shard: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesEmptyClusterShardingInstrumentation → [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)
26. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#shardRegionBufferSize(typeName:String,size:Int):Unit "Permalink")  def shardRegionBufferSize(typeName: String, size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesEmptyClusterShardingInstrumentation → [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)
27. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#shardRegionBufferSizeIncremented(typeName:String):Unit "Permalink")  def shardRegionBufferSizeIncremented(typeName: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesEmptyClusterShardingInstrumentation → [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)
28. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EmptyClusterShardingInstrumentation toStringFormat\[EmptyClusterShardingInstrumentation] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EmptyClusterShardingInstrumentation, B)ImplicitThis member is added by an implicit conversion from EmptyClusterShardingInstrumentation toArrowAssoc\[EmptyClusterShardingInstrumentation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEmptyClusterShardingInstrumentation to any2stringadd\[EmptyClusterShardingInstrumentation]

### Inherited by implicit conversion StringFormat fromEmptyClusterShardingInstrumentation to StringFormat\[EmptyClusterShardingInstrumentation]

### Inherited by implicit conversion Ensuring fromEmptyClusterShardingInstrumentation to Ensuring\[EmptyClusterShardingInstrumentation]

### Inherited by implicit conversion ArrowAssoc fromEmptyClusterShardingInstrumentation to ArrowAssoc\[EmptyClusterShardingInstrumentation]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/InternalStableApi.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html)*