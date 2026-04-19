---
description: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityTypeKey
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityTypeKey
---

# Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityTypeKey

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityTypeKey

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [ClusterSharding](ClusterSharding.html "This extension provides sharding functionality of actors in a cluster.")
- [ClusterShardingSetup](ClusterShardingSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the ClusterSharding extension.")
- [Entity](Entity.html "Defines how the entity should be created.")
- [EntityContext](EntityContext.html "Parameter to createBehavior function in Entity.apply.")
- [EntityRef](EntityRef.html "A reference to an sharded Entity, which allows ActorRef-like usage.")
- EntityTypeKey
- [ShardedDaemonProcess](ShardedDaemonProcess.html "This extension runs a pre set number of actors in a cluster.")
- [StartEntity](StartEntity$.html "Allows starting a specific Sharded Entity by its entity identifier")
[t](EntityTypeKey$.html "See companion object")[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [EntityTypeKey](EntityTypeKey$.html "See companion object")[**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html "Permalink")

### Companion [object EntityTypeKey](EntityTypeKey$.html "See companion object")

#### trait EntityTypeKey\[\-T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

The key of an entity type, the `name` must be unique.

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[ClusterSharding.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/scaladsl/ClusterSharding.scala#L398)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EntityTypeKey
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

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#name:String "Permalink") abstract  def name: StringName of the entity type.
### Concrete Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EntityTypeKey\[T] toany2stringadd\[EntityTypeKey\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EntityTypeKey\[T], B)ImplicitThis member is added by an implicit conversion from EntityTypeKey\[T] toArrowAssoc\[EntityTypeKey\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EntityTypeKey\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EntityTypeKey\[T]ImplicitThis member is added by an implicit conversion from EntityTypeKey\[T] toEnsuring\[EntityTypeKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EntityTypeKey\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EntityTypeKey\[T]ImplicitThis member is added by an implicit conversion from EntityTypeKey\[T] toEnsuring\[EntityTypeKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EntityTypeKey\[T]ImplicitThis member is added by an implicit conversion from EntityTypeKey\[T] toEnsuring\[EntityTypeKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EntityTypeKey\[T]ImplicitThis member is added by an implicit conversion from EntityTypeKey\[T] toEnsuring\[EntityTypeKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EntityTypeKey\[T] toStringFormat\[EntityTypeKey\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EntityTypeKey\[T], B)ImplicitThis member is added by an implicit conversion from EntityTypeKey\[T] toArrowAssoc\[EntityTypeKey\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEntityTypeKey\[T] to any2stringadd\[EntityTypeKey\[T]]

### Inherited by implicit conversion StringFormat fromEntityTypeKey\[T] to StringFormat\[EntityTypeKey\[T]]

### Inherited by implicit conversion Ensuring fromEntityTypeKey\[T] to Ensuring\[EntityTypeKey\[T]]

### Inherited by implicit conversion ArrowAssoc fromEntityTypeKey\[T] to ArrowAssoc\[EntityTypeKey\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/Entity$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/StartEntity$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html)*