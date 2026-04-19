---
description: Akka 2.10.17 - akka.actor.typed.scaladsl.adapter.PropsAdapter
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:47:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/adapter/PropsAdapter$.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl.adapter.PropsAdapter
---

# Akka 2.10.17 - akka.actor.typed.scaladsl.adapter.PropsAdapter

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl.adapter.PropsAdapter

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/actor/typed/scaladsl/adapter/index.html "Permalink")  package [adapter](index.html "Adapters between typed and classic actors and actor systems.")Adapters between typed and classic actors and actor systems.

Adapters between typed and classic actors and actor systems.
The underlying `ActorSystem` is the classic [akka.actor.ActorSystem](../../../ActorSystem.html)
which runs Akka Typed [akka.actor.typed.Behavior](../../Behavior.html) on an emulation layer. In this
system typed and classic actors can coexist.

Use these adapters with `import akka.actor.typed.scaladsl.adapter._`.

Implicit extension methods are added to classic and typed `ActorSystem`,
`ActorContext`. Such methods make it possible to create typed child actor
from classic parent actor, and the opposite classic child from typed parent.
`watch` is also supported in both directions.

There is an implicit conversion from classic [akka.actor.ActorRef](../../../ActorRef.html) to
typed [akka.actor.typed.ActorRef](../../ActorRef.html).

There are also converters (`toTyped`, `toClassic`) from typed
[akka.actor.typed.ActorRef](../../ActorRef.html) to classic [akka.actor.ActorRef](../../../ActorRef.html), and between classic
[akka.actor.ActorSystem](../../../ActorSystem.html) and typed [akka.actor.typed.ActorSystem](../../ActorSystem.html).

Definition Classes[scaladsl](../index.html)
- [ClassicActorContextOps](package$$ClassicActorContextOps.html "Extension methods added to akka.actor.ActorContext.")
- [ClassicActorRefOps](package$$ClassicActorRefOps.html "Extension methods added to akka.actor.ActorRef.")
- [ClassicActorSystemOps](package$$ClassicActorSystemOps.html "Extension methods added to akka.actor.ActorSystem.")
- [ClassicSchedulerOps](package$$ClassicSchedulerOps.html "Extension methods added to akka.actor.Scheduler.")
- PropsAdapter
- [TypedActorContextOps](package$$TypedActorContextOps.html "Extension methods added to akka.actor.typed.scaladsl.ActorContext.")
- [TypedActorRefOps](package$$TypedActorRefOps.html "Extension methods added to akka.actor.typed.ActorRef.")
- [TypedActorSystemOps](package$$TypedActorSystemOps.html "Extension methods added to akka.actor.typed.ActorSystem.")
- [TypedSchedulerOps](package$$TypedSchedulerOps.html "Extension methods added to akka.actor.typed.Scheduler.")
o[akka](../../../../index.html).[actor](../../../index.html).[typed](../../index.html).[scaladsl](../index.html).[adapter](index.html)

# PropsAdapter[**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html "Permalink")

### 

#### object PropsAdapter

Wrap [akka.actor.typed.Behavior](../../Behavior.html) in a classic [akka.actor.Props](../../../Props.html), i.e. when
spawning a typed child actor from a classic parent actor.
This is normally not needed because you can use the extension methods
`spawn` and `spawnAnonymous` on a classic `ActorContext`, but it's needed
when using typed actors with an existing library/tool that provides an API that
takes a classic [akka.actor.Props](../../../Props.html) parameter. Cluster Sharding is an
example of that.

Source[PropsAdapter.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/adapter/PropsAdapter.scala#L21)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PropsAdapter
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#apply[T](behavior:=>akka.actor.typed.Behavior[T],deploy:akka.actor.typed.Props):akka.actor.Props "Permalink")  def apply\[T](behavior: \=\> [Behavior](../../Behavior.html)\[T], deploy: [Props](../../Props.html) \= [Props.empty](../../../../index.html)): [actor.Props](../../../Props.html)
5. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Props.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/PropsAdapter$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/package$$ClassicActorRefOps.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/package$$ClassicActorSystemOps.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/package$$ClassicSchedulerOps.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/package$$TypedActorContextOps.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/package$$TypedActorRefOps.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/package$$TypedActorSystemOps.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/package$$TypedSchedulerOps.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/PropsAdapter$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/PropsAdapter$.html)*