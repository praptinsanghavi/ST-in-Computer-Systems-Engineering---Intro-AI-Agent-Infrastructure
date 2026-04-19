---
description: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityRef
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:52:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/scaladsl/EntityRef.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityRef
---

# Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityRef

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.EntityRef

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
- EntityRef
- [EntityTypeKey](EntityTypeKey.html "The key of an entity type, the name must be unique.")
- [ShardedDaemonProcess](ShardedDaemonProcess.html "This extension runs a pre set number of actors in a cluster.")
- [StartEntity](StartEntity$.html "Allows starting a specific Sharded Entity by its entity identifier")
t[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[scaladsl](index.html)

# EntityRef[**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html "Permalink")

### 

#### trait EntityRef\[\-M] extends [RecipientRef](../../../../actor/typed/RecipientRef.html)\[M]

A reference to an sharded Entity, which allows `ActorRef`\-like usage.

An EntityRef is NOT an ActorRef–by design–in order to be explicit about the fact that the life\-cycle
of a sharded Entity is very different than a plain Actors. Most notably, this is shown by features of Entities
such as re\-balancing (an active Entity to a different node) or passivation. Both of which are aimed to be completely
transparent to users of such Entity. In other words, if this were to be a plain ActorRef, it would be possible to
apply DeathWatch to it, which in turn would then trigger when the sharded Actor stopped, breaking the illusion that
Entity refs are "always there". Please note that while not encouraged, it is possible to expose an Actor's `self`
ActorRef and watch it in case such notification is desired.
Not for user extension.

Self TypeEntityRef\[M] with InternalRecipientRef\[M]Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[ClusterSharding.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/scaladsl/ClusterSharding.scala#L430)Linear Supertypes[RecipientRef](../../../../actor/typed/RecipientRef.html)\[M], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EntityRef
2. RecipientRef
3. AnyRef
4. Any
Implicitly  
1. by RecipientRefOps
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#ask[Res](f:akka.actor.typed.ActorRef[Res]=>M)(implicittimeout:akka.util.Timeout):scala.concurrent.Future[Res] "Permalink") abstract  def ask\[Res](f: ([ActorRef](../../../../actor/typed/ActorRef.html)\[Res]) \=\> M)(implicit timeout: [Timeout](../../../../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Res]Allows to "ask" the EntityRef for a reply.

Allows to "ask" the EntityRef for a reply.
See [akka.actor.typed.scaladsl.AskPattern](../../../../actor/typed/scaladsl/AskPattern$.html) for a complete write\-up of this pattern

Note that if you are inside of an actor you should prefer [akka.actor.typed.scaladsl.ActorContext.ask](../../../../actor/typed/scaladsl/ActorContext.html#ask[Req,Res](target:akka.actor.typed.RecipientRef[Req],createRequest:akka.actor.typed.ActorRef[Res]=>Req)(mapResponse:scala.util.Try[Res]=>T)(implicitresponseTimeout:akka.util.Timeout,implicitclassTag:scala.reflect.ClassTag[Res]):Unit)
as that provides better safety.

Example usage:

```
case class Request(msg: String, replyTo: ActorRef[Reply])
case class Reply(msg: String)

implicit val timeout = Timeout(3.seconds)
val target: EntityRef[Request] = ...
val f: Future[Reply] = target.ask(Request("hello", _))
```
Please note that an implicit [akka.util.Timeout](../../../../util/Timeout.html) must be available to use this pattern.

ResThe response protocol, what the other actor sends back
2. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#askWithStatus[Res](f:akka.actor.typed.ActorRef[akka.pattern.StatusReply[Res]]=>M)(implicittimeout:akka.util.Timeout):scala.concurrent.Future[Res] "Permalink") abstract  def askWithStatus\[Res](f: ([ActorRef](../../../../actor/typed/ActorRef.html)\[[StatusReply](../../../../pattern/StatusReply.html)\[Res]]) \=\> M)(implicit timeout: [Timeout](../../../../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Res]The same as [ask](#ask[Res](f:akka.actor.typed.ActorRef[Res]=>M)(implicittimeout:akka.util.Timeout):scala.concurrent.Future[Res]) but only for requests that result in a response of type [akka.pattern.StatusReply](../../../../pattern/StatusReply.html).

The same as [ask](#ask[Res](f:akka.actor.typed.ActorRef[Res]=>M)(implicittimeout:akka.util.Timeout):scala.concurrent.Future[Res]) but only for requests that result in a response of type [akka.pattern.StatusReply](../../../../pattern/StatusReply.html).
If the response is a [akka.pattern.StatusReply.Success](../../../../pattern/StatusReply$$Success$.html) the returned future is completed successfully with the wrapped response.
If the status response is a [akka.pattern.StatusReply.Error](../../../../pattern/StatusReply$$Error$.html) the returned future will be failed with the
exception in the error (normally a [akka.pattern.StatusReply.ErrorMessage](../../../../pattern/StatusReply$$ErrorMessage.html)).
3. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#entityId:String "Permalink") abstract  def entityId: StringThe identifier for the particular entity referenced by this EntityRef.

The identifier for the particular entity referenced by this EntityRef.

```
// given sharding, typeKey
sharding.entityRefFor(typeKey, "someId").entityId == "someId"  // always true
```
4. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#tell(msg:M):Unit "Permalink") abstract  def tell(msg: M): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*
messaging semantics.

Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*
messaging semantics.

Example usage:

```
val target: EntityRef[String] = ...
target.tell("Hello")
```
Definition ClassesEntityRef → [RecipientRef](../../../../actor/typed/RecipientRef.html)
5. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#typeKey:akka.cluster.sharding.typed.scaladsl.EntityTypeKey[M] "Permalink") abstract  def typeKey: [EntityTypeKey](EntityTypeKey.html)\[M]The EntityTypeKey associated with this EntityRef.
6. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#dataCenter:Option[String] "Permalink") abstract  def dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]The specified datacenter of the incarnation of the particular entity referenced by this EntityRef,
if a datacenter was specified.

The specified datacenter of the incarnation of the particular entity referenced by this EntityRef,
if a datacenter was specified.

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
### Concrete Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#!(msg:M):Unit "Permalink")  def !(msg: M): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*
messaging semantics.

Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*
messaging semantics.

Example usage:

```
val target: EntityRef[String] = ...
target ! "Hello"
```
2. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EntityRef\[M] toany2stringadd\[EntityRef\[M]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
5. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EntityRef\[M], B)ImplicitThis member is added by an implicit conversion from EntityRef\[M] toArrowAssoc\[EntityRef\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#?[Res](message:akka.actor.typed.ActorRef[Res]=>M)(implicittimeout:akka.util.Timeout):scala.concurrent.Future[Res] "Permalink")  def ?\[Res](message: ([ActorRef](../../../../actor/typed/ActorRef.html)\[Res]) \=\> M)(implicit timeout: [Timeout](../../../../util/Timeout.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Res]Allows to "ask" the EntityRef for a reply.

Allows to "ask" the EntityRef for a reply.
See [akka.actor.typed.scaladsl.AskPattern](../../../../actor/typed/scaladsl/AskPattern$.html) for a complete write\-up of this pattern

Note that if you are inside of an actor you should prefer [akka.actor.typed.scaladsl.ActorContext.ask](../../../../actor/typed/scaladsl/ActorContext.html#ask[Req,Res](target:akka.actor.typed.RecipientRef[Req],createRequest:akka.actor.typed.ActorRef[Res]=>Req)(mapResponse:scala.util.Try[Res]=>T)(implicitresponseTimeout:akka.util.Timeout,implicitclassTag:scala.reflect.ClassTag[Res]):Unit)
as that provides better safety.

Example usage:

```
case class Request(msg: String, replyTo: ActorRef[Reply])
case class Reply(msg: String)

implicit val timeout = Timeout(3.seconds)
val target: EntityRef[Request] = ...
val f: Future[Reply] = target ? (replyTo => Request("hello", replyTo))
```
Please note that an implicit [akka.util.Timeout](../../../../util/Timeout.html) must be available to use this pattern.

Note: it is preferable to use the non\-symbolic ask method as it easier allows for wildcards for
the `replyTo: ActorRef`.

ResThe response protocol, what the other actor sends back
8. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EntityRef\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EntityRef\[M]ImplicitThis member is added by an implicit conversion from EntityRef\[M] toEnsuring\[EntityRef\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EntityRef\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EntityRef\[M]ImplicitThis member is added by an implicit conversion from EntityRef\[M] toEnsuring\[EntityRef\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EntityRef\[M]ImplicitThis member is added by an implicit conversion from EntityRef\[M] toEnsuring\[EntityRef\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EntityRef\[M]ImplicitThis member is added by an implicit conversion from EntityRef\[M] toEnsuring\[EntityRef\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#ref:akka.actor.typed.RecipientRef[T] "Permalink")  val ref: [RecipientRef](../../../../actor/typed/RecipientRef.html)\[M]ImplicitThis member is added by an implicit conversion from EntityRef\[M] to[RecipientRefOps](../../../../actor/typed/RecipientRef$$RecipientRefOps.html)\[M] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](../../../../actor/typed/RecipientRef$.html).Definition Classes[RecipientRefOps](../../../../actor/typed/RecipientRef$$RecipientRefOps.html)
23. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#!(msg:T):Unit "Permalink")  def !(msg: M): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

ImplicitThis member is added by an implicit conversion from EntityRef\[M] to[RecipientRefOps](../../../../actor/typed/RecipientRef$$RecipientRefOps.html)\[M] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](../../../../actor/typed/RecipientRef$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(entityRef: RecipientRefOps[M]).!(msg)
```
Definition Classes[RecipientRefOps](../../../../actor/typed/RecipientRef$$RecipientRefOps.html)
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EntityRef\[M] toStringFormat\[EntityRef\[M]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/sharding/typed/scaladsl/EntityRef.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EntityRef\[M], B)ImplicitThis member is added by an implicit conversion from EntityRef\[M] toArrowAssoc\[EntityRef\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RecipientRef](../../../../actor/typed/RecipientRef.html)\[M]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion RecipientRefOps fromEntityRef\[M] to [RecipientRefOps](../../../../actor/typed/RecipientRef$$RecipientRefOps.html)\[M]

### Inherited by implicit conversion any2stringadd fromEntityRef\[M] to any2stringadd\[EntityRef\[M]]

### Inherited by implicit conversion StringFormat fromEntityRef\[M] to StringFormat\[EntityRef\[M]]

### Inherited by implicit conversion Ensuring fromEntityRef\[M] to Ensuring\[EntityRef\[M]]

### Inherited by implicit conversion ArrowAssoc fromEntityRef\[M] to ArrowAssoc\[EntityRef\[M]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef$$RecipientRefOps.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/Entity$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/EntityTypeKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/StartEntity$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply$$Error$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply$$ErrorMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply$$Success$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/EntityRef.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/EntityRef.html)*