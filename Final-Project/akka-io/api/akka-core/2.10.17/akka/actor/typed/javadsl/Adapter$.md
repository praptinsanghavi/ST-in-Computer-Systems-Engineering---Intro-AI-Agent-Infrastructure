---
description: Akka 2.10.17 - akka.actor.typed.javadsl.Adapter
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:51:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/Adapter$.html
title: Akka 2.10.17 - akka.actor.typed.javadsl.Adapter
---

# Akka 2.10.17 - akka.actor.typed.javadsl.Adapter

> **Summary:** Akka 2.10.17 - akka.actor.typed.javadsl.Adapter

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#createReceive.")
- [AbstractOnMessageBehavior](AbstractOnMessageBehavior.html "An actor Behavior can be implemented by extending this class and implementing the abstract method AbstractOnMessageBehavior#onMessage.")
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- Adapter
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [BehaviorBuilder](BehaviorBuilder.html "Immutable builder used for creating a Behavior by 'chaining' message and signal handlers.")
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Receive](Receive.html "A specialized \"receive\" behavior that is implemented using message matching builders, such as ReceiveBuilder, from AbstractBehavior.")
- [ReceiveBuilder](ReceiveBuilder.html "Mutable builder used when implementing AbstractBehavior.")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[javadsl](index.html)

# Adapter[**](../../../../akka/actor/typed/javadsl/Adapter$.html "Permalink")

### 

#### object Adapter

Adapters between typed and classic actors and actor systems.
The underlying `ActorSystem` is the classic [akka.actor.ActorSystem](../../ActorSystem.html)
which runs Akka [akka.actor.typed.Behavior](../Behavior.html) on an emulation layer. In this
system typed and classic actors can coexist.

These methods make it possible to create a child actor from classic
parent actor, and the opposite classic child from typed parent.
`watch` is also supported in both directions.

There are also converters (`toTyped`, `toClassic`) between classic
[akka.actor.ActorRef](../../ActorRef.html) and [akka.actor.typed.ActorRef](../ActorRef.html), and between classic
[akka.actor.ActorSystem](../../ActorSystem.html) and [akka.actor.typed.ActorSystem](../ActorSystem.html).

Source[Adapter.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/javadsl/Adapter.scala#L32)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Adapter
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/javadsl/Adapter$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#actorOf(ctx:akka.actor.typed.javadsl.ActorContext[_],props:akka.actor.Props,name:String):akka.actor.ActorRef "Permalink")  def actorOf(ctx: [ActorContext](ActorContext.html)\[\_], props: [actor.Props](../../Props.html), name: String): [actor.ActorRef](../../ActorRef.html)
5. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#actorOf(ctx:akka.actor.typed.javadsl.ActorContext[_],props:akka.actor.Props):akka.actor.ActorRef "Permalink")  def actorOf(ctx: [ActorContext](ActorContext.html)\[\_], props: [actor.Props](../../Props.html)): [actor.ActorRef](../../ActorRef.html)
6. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#props[T](behavior:akka.japi.Creator[akka.actor.typed.Behavior[T]]):akka.actor.Props "Permalink")  def props\[T](behavior: [Creator](../../../japi/Creator.html)\[[Behavior](../Behavior.html)\[T]]): [actor.Props](../../Props.html)Wrap [akka.actor.typed.Behavior](../Behavior.html) in a classic [akka.actor.Props](../../Props.html), i.e.

Wrap [akka.actor.typed.Behavior](../Behavior.html) in a classic [akka.actor.Props](../../Props.html), i.e. when
spawning a typed child actor from a classic parent actor.
This is normally not needed because you can use the extension methods
`spawn` and `spawnAnonymous` with a classic `ActorContext`, but it's needed
when using typed actors with an existing library/tool that provides an API that
takes a classic [akka.actor.Props](../../Props.html) parameter. Cluster Sharding is an
example of that.
17. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#props[T](behavior:akka.japi.Creator[akka.actor.typed.Behavior[T]],deploy:akka.actor.typed.Props):akka.actor.Props "Permalink")  def props\[T](behavior: [Creator](../../../japi/Creator.html)\[[Behavior](../Behavior.html)\[T]], deploy: [Props](../Props.html)): [actor.Props](../../Props.html)Wrap [akka.actor.typed.Behavior](../Behavior.html) in a classic [akka.actor.Props](../../Props.html), i.e.

Wrap [akka.actor.typed.Behavior](../Behavior.html) in a classic [akka.actor.Props](../../Props.html), i.e. when
spawning a typed child actor from a classic parent actor.
This is normally not needed because you can use the extension methods
`spawn` and `spawnAnonymous` with a classic `ActorContext`, but it's needed
when using typed actors with an existing library/tool that provides an API that
takes a classic [akka.actor.Props](../../Props.html) parameter. Cluster Sharding is an
example of that.
18. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#spawn[T](ctx:akka.actor.ActorContext,behavior:akka.actor.typed.Behavior[T],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](ctx: [actor.ActorContext](../../ActorContext.html), behavior: [Behavior](../Behavior.html)\[T], name: String, props: [Props](../Props.html)): [ActorRef](../ActorRef.html)\[T] Spawn the given behavior as a child of the user actor in a classic ActorContext.

 Spawn the given behavior as a child of the user actor in a classic ActorContext.
 Actor default supervision strategy is to stop. Can be overridden with
 `Behaviors.supervise`.
19. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#spawn[T](ctx:akka.actor.ActorContext,behavior:akka.actor.typed.Behavior[T],name:String):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](ctx: [actor.ActorContext](../../ActorContext.html), behavior: [Behavior](../Behavior.html)\[T], name: String): [ActorRef](../ActorRef.html)\[T] Spawn the given behavior as a child of the user actor in a classic ActorContext.

 Spawn the given behavior as a child of the user actor in a classic ActorContext.
 Actor default supervision strategy is to stop. Can be overridden with
 `Behaviors.supervise`.
20. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#spawn[T](sys:akka.actor.ActorSystem,behavior:akka.actor.typed.Behavior[T],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](sys: [actor.ActorSystem](../../ActorSystem.html), behavior: [Behavior](../Behavior.html)\[T], name: String, props: [Props](../Props.html)): [ActorRef](../ActorRef.html)\[T] Spawn the given behavior as a child of the user actor in a classic ActorSystem.

 Spawn the given behavior as a child of the user actor in a classic ActorSystem.
 Actor default supervision strategy is to stop. Can be overridden with
 `Behaviors.supervise`.
21. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#spawn[T](sys:akka.actor.ActorSystem,behavior:akka.actor.typed.Behavior[T],name:String):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](sys: [actor.ActorSystem](../../ActorSystem.html), behavior: [Behavior](../Behavior.html)\[T], name: String): [ActorRef](../ActorRef.html)\[T] Spawn the given behavior as a child of the user actor in a classic ActorSystem.

 Spawn the given behavior as a child of the user actor in a classic ActorSystem.
 Actor default supervision strategy is to stop. Can be overridden with
 `Behaviors.supervise`.
22. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#spawnAnonymous[T](ctx:akka.actor.ActorContext,behavior:akka.actor.typed.Behavior[T],props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawnAnonymous\[T](ctx: [actor.ActorContext](../../ActorContext.html), behavior: [Behavior](../Behavior.html)\[T], props: [Props](../Props.html)): [ActorRef](../ActorRef.html)\[T] Spawn the given behavior as a child of the user actor in a classic ActorContext.

 Spawn the given behavior as a child of the user actor in a classic ActorContext.
 Actor default supervision strategy is to stop. Can be overridden with
 `Behaviors.supervise`.
23. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#spawnAnonymous[T](ctx:akka.actor.ActorContext,behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.ActorRef[T] "Permalink")  def spawnAnonymous\[T](ctx: [actor.ActorContext](../../ActorContext.html), behavior: [Behavior](../Behavior.html)\[T]): [ActorRef](../ActorRef.html)\[T] Spawn the given behavior as a child of the user actor in a classic ActorContext.

 Spawn the given behavior as a child of the user actor in a classic ActorContext.
 Actor default supervision strategy is to stop. Can be overridden with
 `Behaviors.supervise`.
24. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#spawnAnonymous[T](sys:akka.actor.ActorSystem,behavior:akka.actor.typed.Behavior[T],props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawnAnonymous\[T](sys: [actor.ActorSystem](../../ActorSystem.html), behavior: [Behavior](../Behavior.html)\[T], props: [Props](../Props.html)): [ActorRef](../ActorRef.html)\[T] Spawn the given behavior as a child of the user actor in a classic ActorSystem.

 Spawn the given behavior as a child of the user actor in a classic ActorSystem.
 Actor default supervision strategy is to stop. Can be overridden with
 `Behaviors.supervise`.
25. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#spawnAnonymous[T](sys:akka.actor.ActorSystem,behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.ActorRef[T] "Permalink")  def spawnAnonymous\[T](sys: [actor.ActorSystem](../../ActorSystem.html), behavior: [Behavior](../Behavior.html)\[T]): [ActorRef](../ActorRef.html)\[T] Spawn the given behavior as a child of the user actor in a classic ActorSystem.

 Spawn the given behavior as a child of the user actor in a classic ActorSystem.
 Actor default supervision strategy is to stop. Can be overridden with
 `Behaviors.supervise`.
26. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#stop(ctx:akka.actor.typed.javadsl.ActorContext[_],child:akka.actor.ActorRef):Unit "Permalink")  def stop(ctx: [ActorContext](ActorContext.html)\[\_], child: [actor.ActorRef](../../ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
27. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#stop(ctx:akka.actor.ActorContext,child:akka.actor.typed.ActorRef[_]):Unit "Permalink")  def stop(ctx: [actor.ActorContext](../../ActorContext.html), child: [ActorRef](../ActorRef.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
28. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#toClassic(scheduler:akka.actor.typed.Scheduler):akka.actor.Scheduler "Permalink")  def toClassic(scheduler: [Scheduler](../Scheduler.html)): [actor.Scheduler](../../Scheduler.html)
30. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#toClassic(ref:akka.actor.typed.ActorRef[_]):akka.actor.ActorRef "Permalink")  def toClassic(ref: [ActorRef](../ActorRef.html)\[\_]): [actor.ActorRef](../../ActorRef.html)
31. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#toClassic(ctx:akka.actor.typed.javadsl.ActorContext[_]):akka.actor.ActorContext "Permalink")  def toClassic(ctx: [ActorContext](ActorContext.html)\[\_]): [actor.ActorContext](../../ActorContext.html)
32. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#toClassic(sys:akka.actor.typed.ActorSystem[_]):akka.actor.ActorSystem "Permalink")  def toClassic(sys: [ActorSystem](../ActorSystem.html)\[\_]): [actor.ActorSystem](../../ActorSystem.html)
33. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
34. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#toTyped[T](scheduler:akka.actor.Scheduler):akka.actor.typed.Scheduler "Permalink")  def toTyped\[T](scheduler: [actor.Scheduler](../../Scheduler.html)): [Scheduler](../Scheduler.html)
35. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#toTyped[T](ref:akka.actor.ActorRef):akka.actor.typed.ActorRef[T] "Permalink")  def toTyped\[T](ref: [actor.ActorRef](../../ActorRef.html)): [ActorRef](../ActorRef.html)\[T]
36. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#toTyped(sys:akka.actor.ActorSystem):akka.actor.typed.ActorSystem[Void] "Permalink")  def toTyped(sys: [actor.ActorSystem](../../ActorSystem.html)): [ActorSystem](../ActorSystem.html)\[[Void](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Void.html#java.lang.Void)]
37. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#unwatch[U](ctx:akka.actor.typed.javadsl.ActorContext[_],other:akka.actor.ActorRef):Unit "Permalink")  def unwatch\[U](ctx: [ActorContext](ActorContext.html)\[\_], other: [actor.ActorRef](../../ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
38. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#unwatch[U](ctx:akka.actor.ActorContext,other:akka.actor.typed.ActorRef[U]):Unit "Permalink")  def unwatch\[U](ctx: [actor.ActorContext](../../ActorContext.html), other: [ActorRef](../ActorRef.html)\[U]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
39. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
41. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#watch[U](ctx:akka.actor.typed.javadsl.ActorContext[_],other:akka.actor.ActorRef):Unit "Permalink")  def watch\[U](ctx: [ActorContext](ActorContext.html)\[\_], other: [actor.ActorRef](../../ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
43. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#watch[U](ctx:akka.actor.ActorContext,other:akka.actor.typed.ActorRef[U]):Unit "Permalink")  def watch\[U](ctx: [actor.ActorContext](../../ActorContext.html), other: [ActorRef](../ActorRef.html)\[U]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/javadsl/Adapter$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/Adapter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/AskPattern$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/BehaviorBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/BehaviorBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/GroupRouter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/PoolRouter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/ReceiveBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/ReceiveBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/Routers$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/StashBuffer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/StashOverflowException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/TimerScheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Creator.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/Adapter$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/Adapter$.html)*