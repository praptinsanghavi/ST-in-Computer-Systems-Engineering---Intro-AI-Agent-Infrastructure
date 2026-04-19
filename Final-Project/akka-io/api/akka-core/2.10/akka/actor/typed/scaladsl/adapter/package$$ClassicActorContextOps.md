---
description: Akka 2.10.17 - akka.actor.typed.scaladsl.adapter.ClassicActorContextOps
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl.adapter.ClassicActorContextOps
---

# Akka 2.10.17 - akka.actor.typed.scaladsl.adapter.ClassicActorContextOps

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl.adapter.ClassicActorContextOps

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
- ClassicActorContextOps
- [ClassicActorRefOps](package$$ClassicActorRefOps.html "Extension methods added to akka.actor.ActorRef.")
- [ClassicActorSystemOps](package$$ClassicActorSystemOps.html "Extension methods added to akka.actor.ActorSystem.")
- [ClassicSchedulerOps](package$$ClassicSchedulerOps.html "Extension methods added to akka.actor.Scheduler.")
- [PropsAdapter](PropsAdapter$.html "Wrap akka.actor.typed.Behavior in a classic akka.actor.Props, i.e.")
- [TypedActorContextOps](package$$TypedActorContextOps.html "Extension methods added to akka.actor.typed.scaladsl.ActorContext.")
- [TypedActorRefOps](package$$TypedActorRefOps.html "Extension methods added to akka.actor.typed.ActorRef.")
- [TypedActorSystemOps](package$$TypedActorSystemOps.html "Extension methods added to akka.actor.typed.ActorSystem.")
- [TypedSchedulerOps](package$$TypedSchedulerOps.html "Extension methods added to akka.actor.typed.Scheduler.")
c[akka](../../../../index.html).[actor](../../../index.html).[typed](../../index.html).[scaladsl](../index.html).[adapter](index.html)

# ClassicActorContextOps[**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html "Permalink")

### 

#### implicit final  class ClassicActorContextOps extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Extension methods added to [akka.actor.ActorContext](../../../ActorContext.html).

Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/adapter/package.scala#L93)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClassicActorContextOps
2. AnyVal
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

1. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#<init>(ctx:akka.actor.ActorContext):akka.actor.typed.scaladsl.adapter.package.ClassicActorContextOps "Permalink")  new ClassicActorContextOps(ctx: [actor.ActorContext](../../../ActorContext.html))
### Value Members

1. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClassicActorContextOps toany2stringadd\[ClassicActorContextOps] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClassicActorContextOps, B)ImplicitThis member is added by an implicit conversion from ClassicActorContextOps toArrowAssoc\[ClassicActorContextOps] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#ctx:akka.actor.ActorContext "Permalink")  val ctx: [actor.ActorContext](../../../ActorContext.html)
8. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClassicActorContextOps) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClassicActorContextOpsImplicitThis member is added by an implicit conversion from ClassicActorContextOps toEnsuring\[ClassicActorContextOps] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClassicActorContextOps) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClassicActorContextOpsImplicitThis member is added by an implicit conversion from ClassicActorContextOps toEnsuring\[ClassicActorContextOps] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClassicActorContextOpsImplicitThis member is added by an implicit conversion from ClassicActorContextOps toEnsuring\[ClassicActorContextOps] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClassicActorContextOpsImplicitThis member is added by an implicit conversion from ClassicActorContextOps toEnsuring\[ClassicActorContextOps] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
13. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#spawn[T](behavior:akka.actor.typed.Behavior[T],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawn\[T](behavior: [Behavior](../../Behavior.html)\[T], name: String, props: [Props](../../Props.html) \= [Props.empty](../../Props$.html)): [ActorRef](../../ActorRef.html)\[T] Spawn the given behavior as a child of the user actor in a classic ActorContext.

 Spawn the given behavior as a child of the user actor in a classic ActorContext.

 Typed actors default supervision strategy is to stop. Can be overridden with
 `Behaviors.supervise`.
15. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#spawnAnonymous[T](behavior:akka.actor.typed.Behavior[T],props:akka.actor.typed.Props):akka.actor.typed.ActorRef[T] "Permalink")  def spawnAnonymous\[T](behavior: [Behavior](../../Behavior.html)\[T], props: [Props](../../Props.html) \= [Props.empty](../../Props$.html)): [ActorRef](../../ActorRef.html)\[T] Spawn the given behavior as a child of the user actor in a classic ActorContext.

 Spawn the given behavior as a child of the user actor in a classic ActorContext.

 Typed actors default supervision strategy is to stop. Can be overridden with
 `Behaviors.supervise`.
16. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#stop(child:akka.actor.typed.ActorRef[_]):Unit "Permalink")  def stop(child: [ActorRef](../../ActorRef.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
17. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
18. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#unwatch[U](other:akka.actor.typed.ActorRef[U]):Unit "Permalink")  def unwatch\[U](other: [ActorRef](../../ActorRef.html)\[U]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
19. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#watch[U](other:akka.actor.typed.ActorRef[U]):Unit "Permalink")  def watch\[U](other: [ActorRef](../../ActorRef.html)\[U]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
### Deprecated Value Members

1. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClassicActorContextOps toStringFormat\[ClassicActorContextOps] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../../../akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClassicActorContextOps, B)ImplicitThis member is added by an implicit conversion from ClassicActorContextOps toArrowAssoc\[ClassicActorContextOps] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClassicActorContextOps to any2stringadd\[ClassicActorContextOps]

### Inherited by implicit conversion StringFormat fromClassicActorContextOps to StringFormat\[ClassicActorContextOps]

### Inherited by implicit conversion Ensuring fromClassicActorContextOps to Ensuring\[ClassicActorContextOps]

### Inherited by implicit conversion ArrowAssoc fromClassicActorContextOps to ArrowAssoc\[ClassicActorContextOps]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Props$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/PropsAdapter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$ClassicActorRefOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$ClassicActorSystemOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$ClassicSchedulerOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$TypedActorContextOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$TypedActorRefOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$TypedActorSystemOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$TypedSchedulerOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/package$$ClassicActorContextOps.html)*