---
description: Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.EntityRef
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:53:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/javadsl/EntityRef.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.EntityRef
---

# Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.EntityRef

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.EntityRef

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [ClusterSharding](ClusterSharding.html "This extension provides sharding functionality of actors in a cluster.")
- [Entity](Entity.html "Defines how the entity should be created.")
- [EntityContext](EntityContext.html "Parameter to createBehavior function in Entity.of.")
- [EntityFactory](EntityFactory.html)
- EntityRef
- [EntityTypeKey](EntityTypeKey.html "The key of an entity type, the name must be unique.")
- [ShardedDaemonProcess](ShardedDaemonProcess.html "This extension runs a pre set number of actors in a cluster.")
- [StartEntity](StartEntity$.html)
c[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[javadsl](index.html)

# EntityRef[**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html "Permalink")

### 

#### abstract  class EntityRef\[\-M] extends [RecipientRef](../../../../actor/typed/RecipientRef.html)\[M]

A reference to an sharded Entity, which allows `ActorRef`\-like usage.

An EntityRef is NOT an ActorRef–by design–in order to be explicit about the fact that the life\-cycle
of a sharded Entity is very different than a plain Actor. Most notably, this is shown by features of Entities
such as re\-balancing (an active Entity to a different node) or passivation. Both of which are aimed to be completely
transparent to users of such Entity. In other words, if this were to be a plain ActorRef, it would be possible to
apply DeathWatch to it, which in turn would then trigger when the sharded Actor stopped, breaking the illusion that
Entity refs are "always there". Please note that while not encouraged, it is possible to expose an Actor's `self`
ActorRef and watch it in case such notification is desired.

Not for user extension.

Self TypeEntityRef\[M] with [scaladsl.EntityRef](../scaladsl/EntityRef.html)\[M] with InternalRecipientRef\[M]Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[ClusterSharding.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/javadsl/ClusterSharding.scala#L453)Linear Supertypes[RecipientRef](../../../../actor/typed/RecipientRef.html)\[M], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
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
### Instance Constructors

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#<init>():akka.cluster.sharding.typed.javadsl.EntityRef[M] "Permalink")  new EntityRef()
### Abstract Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#ask[Res](message:akka.japi.function.Function[akka.actor.typed.ActorRef[Res],M],timeout:java.time.Duration):java.util.concurrent.CompletionStage[Res] "Permalink") abstract  def ask\[Res](message: [Function](../../../../japi/function/Function.html)\[[ActorRef](../../../../actor/typed/ActorRef.html)\[Res], M], timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Res]Allows to "ask" the EntityRef for a reply.

Allows to "ask" the EntityRef for a reply.
See [akka.actor.typed.javadsl.AskPattern](../../../../actor/typed/javadsl/AskPattern$.html) for a complete write\-up of this pattern

Note that if you are inside of an actor you should prefer [akka.actor.typed.javadsl.ActorContext.ask](../../../../actor/typed/javadsl/ActorContext.html#ask[Req,Res](resClass:Class[Res],target:akka.actor.typed.RecipientRef[Req],responseTimeout:java.time.Duration,createRequest:akka.japi.function.Function[akka.actor.typed.ActorRef[Res],Req],applyToResponse:akka.japi.function.Function2[Res,Throwable,T]):Unit)
as that provides better safety.

ResThe response protocol, what the other actor sends back
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#askWithStatus[Res](f:akka.actor.typed.ActorRef[akka.pattern.StatusReply[Res]]=>M,timeout:java.time.Duration):java.util.concurrent.CompletionStage[Res] "Permalink") abstract  def askWithStatus\[Res](f: ([ActorRef](../../../../actor/typed/ActorRef.html)\[[StatusReply](../../../../pattern/StatusReply.html)\[Res]]) \=\> M, timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Res]The same as [ask](#ask[Res](message:akka.japi.function.Function[akka.actor.typed.ActorRef[Res],M],timeout:java.time.Duration):java.util.concurrent.CompletionStage[Res]) but only for requests that result in a response of type [akka.pattern.StatusReply](../../../../pattern/StatusReply.html).

The same as [ask](#ask[Res](message:akka.japi.function.Function[akka.actor.typed.ActorRef[Res],M],timeout:java.time.Duration):java.util.concurrent.CompletionStage[Res]) but only for requests that result in a response of type [akka.pattern.StatusReply](../../../../pattern/StatusReply.html).
If the response is a [akka.pattern.StatusReply\#success](../../../../pattern/StatusReply$.html#success[T](value:T):akka.pattern.StatusReply[T]) the returned future is completed successfully with the wrapped response.
If the status response is a [akka.pattern.StatusReply\#error](../../../../pattern/StatusReply$.html#error[T](exception:Throwable):akka.pattern.StatusReply[T]) the returned future will be failed with the
exception in the error (normally a [akka.pattern.StatusReply.ErrorMessage](../../../../pattern/StatusReply$$ErrorMessage.html)).
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#tell(msg:M):Unit "Permalink") abstract  def tell(msg: M): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*
messaging semantics.

Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*
messaging semantics.

Definition ClassesEntityRef → [RecipientRef](../../../../actor/typed/RecipientRef.html)
### Concrete Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#!(msg:T):Unit "Permalink")  def !(msg: M): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
messaging semantics.

ImplicitThis member is added by an implicit conversion from EntityRef\[M] to[RecipientRefOps](../../../../actor/typed/RecipientRef$$RecipientRefOps.html)\[M] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](../../../../actor/typed/RecipientRef$.html).Definition Classes[RecipientRefOps](../../../../actor/typed/RecipientRef$$RecipientRefOps.html)
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EntityRef\[M] toany2stringadd\[EntityRef\[M]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
5. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EntityRef\[M], B)ImplicitThis member is added by an implicit conversion from EntityRef\[M] toArrowAssoc\[EntityRef\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EntityRef\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EntityRef\[M]ImplicitThis member is added by an implicit conversion from EntityRef\[M] toEnsuring\[EntityRef\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EntityRef\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EntityRef\[M]ImplicitThis member is added by an implicit conversion from EntityRef\[M] toEnsuring\[EntityRef\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EntityRef\[M]ImplicitThis member is added by an implicit conversion from EntityRef\[M] toEnsuring\[EntityRef\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EntityRef\[M]ImplicitThis member is added by an implicit conversion from EntityRef\[M] toEnsuring\[EntityRef\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#getEntityId:String "Permalink")  def getEntityId: StringThe identifier for the particular entity referenced by this EntityRef.
17. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#getTypeKey:akka.cluster.sharding.typed.javadsl.EntityTypeKey[M] "Permalink")  def getTypeKey: [EntityTypeKey](EntityTypeKey.html)\[M]The name of the EntityTypeKey associated with this EntityRef
18. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#ref:akka.actor.typed.RecipientRef[T] "Permalink")  val ref: [RecipientRef](../../../../actor/typed/RecipientRef.html)\[M]ImplicitThis member is added by an implicit conversion from EntityRef\[M] to[RecipientRefOps](../../../../actor/typed/RecipientRef$$RecipientRefOps.html)\[M] performed by method RecipientRefOps in [akka.actor.typed.RecipientRef](../../../../actor/typed/RecipientRef$.html).Definition Classes[RecipientRefOps](../../../../actor/typed/RecipientRef$$RecipientRefOps.html)
24. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EntityRef\[M] toStringFormat\[EntityRef\[M]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#getDataCenter:java.util.Optional[String] "Permalink")  def getDataCenter: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String]The specified datacenter of the incarnation of the particular entity referenced by this EntityRef,
if a datacenter was specified.

The specified datacenter of the incarnation of the particular entity referenced by this EntityRef,
if a datacenter was specified.

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
4. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EntityRef\[M], B)ImplicitThis member is added by an implicit conversion from EntityRef\[M] toArrowAssoc\[EntityRef\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
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

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/RecipientRef$$RecipientRefOps.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/RecipientRef$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/AskPattern$.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/ClusterSharding$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/ClusterSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/Entity$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/Entity.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityContext.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityFactory.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityRef.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityTypeKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/StartEntity$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/api/akka/current/akka/pattern/StatusReply$$ErrorMessage.html
- https://doc.akka.io/api/akka/current/akka/pattern/StatusReply$.html
- https://doc.akka.io/api/akka/current/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityRef.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/EntityRef.html)*