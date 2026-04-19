---
description: Akka 2.10.17 - akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor
---

# Akka 2.10.17 - akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$.html "Permalink")  object [SliceRangeShardAllocationStrategy](SliceRangeShardAllocationStrategy$.html)Definition Classes[typed](index.html)
- ShardBySliceMessageExtractor
c[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html).[SliceRangeShardAllocationStrategy](SliceRangeShardAllocationStrategy$.html)

# ShardBySliceMessageExtractor[**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html "Permalink")

### 

#### final  class ShardBySliceMessageExtractor\[M] extends [ShardingMessageExtractor](ShardingMessageExtractor.html)\[[ShardingEnvelope](ShardingEnvelope.html)\[M], M]

To be used together with [SliceRangeShardAllocationStrategy](SliceRangeShardAllocationStrategy.html). The slice of the entity
is used as shardId.

Source[SliceRangeShardAllocationStrategy.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.scala#L30)Linear Supertypes[ShardingMessageExtractor](ShardingMessageExtractor.html)\[[ShardingEnvelope](ShardingEnvelope.html)\[M], M], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardBySliceMessageExtractor
2. ShardingMessageExtractor
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

1. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#<init>(entityType:String,persistence:akka.persistence.Persistence):akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor[M] "Permalink")  new ShardBySliceMessageExtractor(entityType: String, persistence: [Persistence](../../../persistence/Persistence.html))
### Value Members

1. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ShardBySliceMessageExtractor\[M] toany2stringadd\[ShardBySliceMessageExtractor\[M]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ShardBySliceMessageExtractor\[M], B)ImplicitThis member is added by an implicit conversion from ShardBySliceMessageExtractor\[M] toArrowAssoc\[ShardBySliceMessageExtractor\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ShardBySliceMessageExtractor\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardBySliceMessageExtractor\[M]ImplicitThis member is added by an implicit conversion from ShardBySliceMessageExtractor\[M] toEnsuring\[ShardBySliceMessageExtractor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ShardBySliceMessageExtractor\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardBySliceMessageExtractor\[M]ImplicitThis member is added by an implicit conversion from ShardBySliceMessageExtractor\[M] toEnsuring\[ShardBySliceMessageExtractor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardBySliceMessageExtractor\[M]ImplicitThis member is added by an implicit conversion from ShardBySliceMessageExtractor\[M] toEnsuring\[ShardBySliceMessageExtractor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardBySliceMessageExtractor\[M]ImplicitThis member is added by an implicit conversion from ShardBySliceMessageExtractor\[M] toEnsuring\[ShardBySliceMessageExtractor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#entityId(envelope:akka.cluster.sharding.typed.ShardingEnvelope[M]):String "Permalink")  def entityId(envelope: [ShardingEnvelope](ShardingEnvelope.html)\[M]): StringExtract the entity id from an incoming `message`.

Extract the entity id from an incoming `message`. If `null` is returned
the message will be `unhandled`, i.e. posted as `Unhandled` messages on the event stream

Definition ClassesShardBySliceMessageExtractor → [ShardingMessageExtractor](ShardingMessageExtractor.html)
13. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#shardId(entityId:String):String "Permalink")  def shardId(entityId: String): StringThe shard identifier for a given entity id.

The shard identifier for a given entity id. Only messages that passed the [ShardingMessageExtractor\#entityId](ShardingMessageExtractor.html#entityId(message:E):String)
function will be used as input to this function.

Definition ClassesShardBySliceMessageExtractor → [ShardingMessageExtractor](ShardingMessageExtractor.html)
22. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#unwrapMessage(envelope:akka.cluster.sharding.typed.ShardingEnvelope[M]):M "Permalink")  def unwrapMessage(envelope: [ShardingEnvelope](ShardingEnvelope.html)\[M]): MExtract the message to send to the entity from an incoming `message`.

Extract the message to send to the entity from an incoming `message`.
Note that the extracted message does not have to be the same as the incoming
message to support wrapping in message envelope that is unwrapped before
sending to the entity actor.

Definition ClassesShardBySliceMessageExtractor → [ShardingMessageExtractor](ShardingMessageExtractor.html)
25. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ShardBySliceMessageExtractor\[M] toStringFormat\[ShardBySliceMessageExtractor\[M]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ShardBySliceMessageExtractor\[M], B)ImplicitThis member is added by an implicit conversion from ShardBySliceMessageExtractor\[M] toArrowAssoc\[ShardBySliceMessageExtractor\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ShardingMessageExtractor](ShardingMessageExtractor.html)\[[ShardingEnvelope](ShardingEnvelope.html)\[M], M]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromShardBySliceMessageExtractor\[M] to any2stringadd\[ShardBySliceMessageExtractor\[M]]

### Inherited by implicit conversion StringFormat fromShardBySliceMessageExtractor\[M] to StringFormat\[ShardBySliceMessageExtractor\[M]]

### Inherited by implicit conversion Ensuring fromShardBySliceMessageExtractor\[M] to Ensuring\[ShardBySliceMessageExtractor\[M]]

### Inherited by implicit conversion ArrowAssoc fromShardBySliceMessageExtractor\[M] to ArrowAssoc\[ShardBySliceMessageExtractor\[M]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/Persistence.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html)*