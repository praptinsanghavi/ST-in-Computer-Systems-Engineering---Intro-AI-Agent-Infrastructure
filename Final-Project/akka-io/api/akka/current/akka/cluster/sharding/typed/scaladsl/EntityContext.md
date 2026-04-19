---
description: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityContext
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:47:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/scaladsl/EntityContext.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityContext
---

# Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityContext

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityContext

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
- EntityContext
- [EntityRef](EntityRef.html "A reference to an sharded Entity, which allows ActorRef-like usage.")
- [EntityTypeKey](EntityTypeKey.html "The key of an entity type, the name must be unique.")
- [ShardedDaemonProcess](ShardedDaemonProcess.html "This extension runs a pre set number of actors in a cluster.")
- [StartEntity](StartEntity$.html "Allows starting a specific Sharded Entity by its entity identifier")
c[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[scaladsl](index.html)

# EntityContext[**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html "Permalink")

### 

#### final  class EntityContext\[M] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Parameter to `createBehavior` function in [Entity.apply](Entity$.html#apply[M](typeKey:akka.cluster.sharding.typed.scaladsl.EntityTypeKey[M])(createBehavior:akka.cluster.sharding.typed.scaladsl.EntityContext[M]=>akka.actor.typed.Behavior[M]):akka.cluster.sharding.typed.scaladsl.Entity[M,akka.cluster.sharding.typed.ShardingEnvelope[M]]).

Cluster Sharding is often used together with [akka.persistence.typed.scaladsl.EventSourcedBehavior](../../../../persistence/typed/scaladsl/EventSourcedBehavior.html)
for the entities. See more considerations in [akka.persistence.typed.PersistenceId](../../../../persistence/typed/PersistenceId.html).
The `PersistenceId` of the `EventSourcedBehavior` can typically be constructed with:

```
PersistenceId(entityContext.entityTypeKey.name, entityContext.entityId)
```
Source[ClusterSharding.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/scaladsl/ClusterSharding.scala#L364)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EntityContext
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
### Instance Constructors

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#<init>(entityTypeKey:akka.cluster.sharding.typed.scaladsl.EntityTypeKey[M],entityId:String,shard:akka.actor.typed.ActorRef[akka.cluster.sharding.typed.scaladsl.ClusterSharding.ShardCommand]):akka.cluster.sharding.typed.scaladsl.EntityContext[M] "Permalink")  new EntityContext(entityTypeKey: [EntityTypeKey](EntityTypeKey.html)\[M], entityId: String, shard: [ActorRef](../../../../actor/typed/ActorRef.html)\[[ShardCommand](ClusterSharding$$ShardCommand.html)])entityTypeKeythe key of the entity type

entityIdthe business domain identifier of the entity
### Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EntityContext\[M] toany2stringadd\[EntityContext\[M]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EntityContext\[M], B)ImplicitThis member is added by an implicit conversion from EntityContext\[M] toArrowAssoc\[EntityContext\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EntityContext\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EntityContext\[M]ImplicitThis member is added by an implicit conversion from EntityContext\[M] toEnsuring\[EntityContext\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EntityContext\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EntityContext\[M]ImplicitThis member is added by an implicit conversion from EntityContext\[M] toEnsuring\[EntityContext\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EntityContext\[M]ImplicitThis member is added by an implicit conversion from EntityContext\[M] toEnsuring\[EntityContext\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EntityContext\[M]ImplicitThis member is added by an implicit conversion from EntityContext\[M] toEnsuring\[EntityContext\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#entityId:String "Permalink")  val entityId: String
13. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#entityTypeKey:akka.cluster.sharding.typed.scaladsl.EntityTypeKey[M] "Permalink")  val entityTypeKey: [EntityTypeKey](EntityTypeKey.html)\[M]
14. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#shard:akka.actor.typed.ActorRef[akka.cluster.sharding.typed.scaladsl.ClusterSharding.ShardCommand] "Permalink")  val shard: [ActorRef](../../../../actor/typed/ActorRef.html)\[[ShardCommand](ClusterSharding$$ShardCommand.html)]
23. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EntityContext\[M] toStringFormat\[EntityContext\[M]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityContext.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EntityContext\[M], B)ImplicitThis member is added by an implicit conversion from EntityContext\[M] toArrowAssoc\[EntityContext\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEntityContext\[M] to any2stringadd\[EntityContext\[M]]

### Inherited by implicit conversion StringFormat fromEntityContext\[M] to StringFormat\[EntityContext\[M]]

### Inherited by implicit conversion Ensuring fromEntityContext\[M] to Ensuring\[EntityContext\[M]]

### Inherited by implicit conversion ArrowAssoc fromEntityContext\[M] to ArrowAssoc\[EntityContext\[M]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding$$ShardCommand.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/Entity$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/StartEntity$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityContext.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityContext.html)*