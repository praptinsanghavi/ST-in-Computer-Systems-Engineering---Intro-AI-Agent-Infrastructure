---
description: Akka 2.10.17 - akka.actor.typed.scaladsl.adapter
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:52:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/adapter/index.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl.adapter
---

# Akka 2.10.17 - akka.actor.typed.scaladsl.adapter

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl.adapter

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/actor/typed/scaladsl/adapter/index.html "Permalink")  package adapterAdapters between typed and classic actors and actor systems.

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
- [PropsAdapter](PropsAdapter$.html "Wrap akka.actor.typed.Behavior in a classic akka.actor.Props, i.e.")
- [TypedActorContextOps](package$$TypedActorContextOps.html "Extension methods added to akka.actor.typed.scaladsl.ActorContext.")
- [TypedActorRefOps](package$$TypedActorRefOps.html "Extension methods added to akka.actor.typed.ActorRef.")
- [TypedActorSystemOps](package$$TypedActorSystemOps.html "Extension methods added to akka.actor.typed.ActorSystem.")
- [TypedSchedulerOps](package$$TypedSchedulerOps.html "Extension methods added to akka.actor.typed.Scheduler.")
p[akka](../../../../index.html).[actor](../../../index.html).[typed](../../index.html).[scaladsl](../index.html)

# adapter[**](../../../../../akka/actor/typed/scaladsl/adapter/index.html "Permalink")

#### package adapter

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

Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/adapter/package.scala#L32)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. adapter
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html "Permalink") implicit final  class [ClassicActorContextOps](package$$ClassicActorContextOps.html "Extension methods added to akka.actor.ActorContext.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Extension methods added to [akka.actor.ActorContext](../../../ActorContext.html).
2. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorRefOps.html "Permalink") implicit final  class [ClassicActorRefOps](package$$ClassicActorRefOps.html "Extension methods added to akka.actor.ActorRef.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Extension methods added to [akka.actor.ActorRef](../../../ActorRef.html).
3. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorSystemOps.html "Permalink") implicit final  class [ClassicActorSystemOps](package$$ClassicActorSystemOps.html "Extension methods added to akka.actor.ActorSystem.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Extension methods added to [akka.actor.ActorSystem](../../../ActorSystem.html).
4. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicSchedulerOps.html "Permalink") implicit final  class [ClassicSchedulerOps](package$$ClassicSchedulerOps.html "Extension methods added to akka.actor.Scheduler.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Extension methods added to [akka.actor.Scheduler](../../../Scheduler.html).
5. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$TypedActorContextOps.html "Permalink") implicit final  class [TypedActorContextOps](package$$TypedActorContextOps.html "Extension methods added to akka.actor.typed.scaladsl.ActorContext.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Extension methods added to [akka.actor.typed.scaladsl.ActorContext](../ActorContext.html).
6. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$TypedActorRefOps.html "Permalink") implicit final  class [TypedActorRefOps](package$$TypedActorRefOps.html "Extension methods added to akka.actor.typed.ActorRef.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Extension methods added to [akka.actor.typed.ActorRef](../../ActorRef.html).
7. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$TypedActorSystemOps.html "Permalink") implicit final  class [TypedActorSystemOps](package$$TypedActorSystemOps.html "Extension methods added to akka.actor.typed.ActorSystem.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Extension methods added to [akka.actor.typed.ActorSystem](../../ActorSystem.html).
8. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$TypedSchedulerOps.html "Permalink") implicit final  class [TypedSchedulerOps](package$$TypedSchedulerOps.html "Extension methods added to akka.actor.typed.Scheduler.") extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Extension methods added to [akka.actor.typed.Scheduler](../../Scheduler.html).
### Value Members

1. [**](../../../../../akka/actor/typed/scaladsl/adapter/index.html#actorRefAdapter[T](ref:akka.actor.ActorRef):akka.actor.typed.ActorRef[T] "Permalink") implicit  def actorRefAdapter\[T](ref: [actor.ActorRef](../../../ActorRef.html)): [ActorRef](../../ActorRef.html)\[T]Implicit conversion from classic [akka.actor.ActorRef](../../../ActorRef.html) to [akka.actor.typed.ActorRef](../../ActorRef.html).
2. [**](../../../../../akka/actor/typed/scaladsl/adapter/PropsAdapter$.html "Permalink")  object [PropsAdapter](PropsAdapter$.html "Wrap akka.actor.typed.Behavior in a classic akka.actor.Props, i.e.")Wrap [akka.actor.typed.Behavior](../../Behavior.html) in a classic [akka.actor.Props](../../../Props.html), i.e.

Wrap [akka.actor.typed.Behavior](../../Behavior.html) in a classic [akka.actor.Props](../../../Props.html), i.e. when
spawning a typed child actor from a classic parent actor.
This is normally not needed because you can use the extension methods
`spawn` and `spawnAnonymous` on a classic `ActorContext`, but it's needed
when using typed actors with an existing library/tool that provides an API that
takes a classic [akka.actor.Props](../../../Props.html) parameter. Cluster Sharding is an
example of that.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Props.html
- https://doc.akka.io/api/akka/current/akka/actor/Scheduler.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/ActorContext.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/index.html](https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/adapter/index.html)*