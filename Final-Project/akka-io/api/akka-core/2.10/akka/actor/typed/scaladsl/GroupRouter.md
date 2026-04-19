---
description: Akka 2.10.17 - akka.actor.typed.scaladsl.GroupRouter
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:33:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/GroupRouter.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl.GroupRouter
---

# Akka 2.10.17 - akka.actor.typed.scaladsl.GroupRouter

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl.GroupRouter

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/scaladsl/adapter/index.html "Permalink")  package [adapter](adapter/index.html "Adapters between typed and classic actors and actor systems.")Adapters between typed and classic actors and actor systems.

Adapters between typed and classic actors and actor systems.
The underlying `ActorSystem` is the classic [akka.actor.ActorSystem](../../ActorSystem.html)
which runs Akka Typed [akka.actor.typed.Behavior](../Behavior.html) on an emulation layer. In this
system typed and classic actors can coexist.

Use these adapters with `import akka.actor.typed.scaladsl.adapter._`.

Implicit extension methods are added to classic and typed `ActorSystem`,
`ActorContext`. Such methods make it possible to create typed child actor
from classic parent actor, and the opposite classic child from typed parent.
`watch` is also supported in both directions.

There is an implicit conversion from classic [akka.actor.ActorRef](../../ActorRef.html) to
typed [akka.actor.typed.ActorRef](../ActorRef.html).

There are also converters (`toTyped`, `toClassic`) from typed
[akka.actor.typed.ActorRef](../ActorRef.html) to classic [akka.actor.ActorRef](../../ActorRef.html), and between classic
[akka.actor.ActorSystem](../../ActorSystem.html) and typed [akka.actor.typed.ActorSystem](../ActorSystem.html).

Definition Classes[scaladsl](index.html)
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#onMessage and optionally override AbstractBehavior#onSignal.")
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- GroupRouter
- [LoggerOps](package$$LoggerOps.html "Extension methods to org.slf4j.Logger that are useful because the Scala compiler can't select the right overloaded methods for some cases when using 2 template arguments and varargs (>= 3 arguments) with primitive types.")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
t[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[scaladsl](index.html)

# GroupRouter[**](../../../../akka/actor/typed/scaladsl/GroupRouter.html "Permalink")

### 

#### trait GroupRouter\[T] extends [Behavior](../Behavior.html)\[T]

Provides builder style configuration options for group routers

Not for user extension. Use [Routers\#group](Routers$.html#group[T](key:akka.actor.typed.receptionist.ServiceKey[T]):akka.actor.typed.scaladsl.GroupRouter[T]) to create

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[Routers.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/Routers.scala#L47)Linear Supertypes[Behavior](../Behavior.html)\[T], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GroupRouter
2. Behavior
3. AnyRef
4. Any
Implicitly  
1. by BehaviorDecorators
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#withConsistentHashingRouting(virtualNodesFactor:Int,mapping:T=>String):akka.actor.typed.scaladsl.GroupRouter[T] "Permalink") abstract  def withConsistentHashingRouting(virtualNodesFactor: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), mapping: (T) \=\> String): GroupRouter\[T]Route messages by using consistent hashing.

Route messages by using consistent hashing.

From wikipedia: Consistent hashing is based on mapping each object to a point on a circle
(or equivalently, mapping each object to a real angle). The system maps each available machine
(or other storage bucket) to many pseudo\-randomly distributed points on the same circle.

virtualNodesFactorThis factor has to be greater or equal to 1\. Assuming that the reader
 knows what consistent hashing is
 (if not, please refer: https://www.tom\-e\-white.com/2007/11/consistent\-hashing.html or wiki).
 This number is responsible for creating additional,
 virtual addresses for a provided set of routees,
 so that in the total number of points on hashing ring
 will be equal to numberOfRoutees \* virtualNodesFactor
 (if virtualNodesFactor is equal to 1, then no additional points will be created).
 Those virtual nodes are being created by additionally rehashing routees
 to evenly distribute them across hashing ring.
 Consider increasing this number when you have a small number of routees.
 For bigger loads one can aim in having around 100\-200 total addresses.
 Please also note that setting this number to a too big value will cause
 reasonable overhead when new routees will be added or old one removed.

mappingHash key extractor. This function will be used in consistent hashing process.
 Result of this operation should possibly uniquely distinguish messages.
2. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#withRandomRouting(preferLocalRoutees:Boolean):akka.actor.typed.scaladsl.GroupRouter[T] "Permalink") abstract  def withRandomRouting(preferLocalRoutees: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GroupRouter\[T]Route messages by randomly selecting the routee from the available routees.

Route messages by randomly selecting the routee from the available routees. This is the default for group routers.

preferLocalRouteesif the value is false, all reachable routees will be used;
 if the value is true and there are local routees, only local routees will be used.
 if the value is true and there is no local routees, remote routees will be used.
3. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#withRandomRouting():akka.actor.typed.scaladsl.GroupRouter[T] "Permalink") abstract  def withRandomRouting(): GroupRouter\[T]Route messages by randomly selecting the routee from the available routees.

Route messages by randomly selecting the routee from the available routees. This is the default for group routers.
4. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#withRoundRobinRouting(preferLocalRoutees:Boolean):akka.actor.typed.scaladsl.GroupRouter[T] "Permalink") abstract  def withRoundRobinRouting(preferLocalRoutees: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GroupRouter\[T]Route messages by using round robin.

Route messages by using round robin.

Round robin gives fair routing where every available routee gets the same amount of messages as long as the set
of routees stays relatively stable, but may be unfair if the set of routees changes a lot.

preferLocalRouteesif the value is false, all reachable routees will be used;
 if the value is true and there are local routees, only local routees will be used.
 if the value true and there is no local routees, remote routees will be used.
5. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#withRoundRobinRouting():akka.actor.typed.scaladsl.GroupRouter[T] "Permalink") abstract  def withRoundRobinRouting(): GroupRouter\[T]Route messages by using round robin.

Route messages by using round robin.

Round robin gives fair routing where every available routee gets the same amount of messages as long as the set
of routees stays relatively stable, but may be unfair if the set of routees changes a lot.
### Concrete Value Members

1. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from GroupRouter\[T] toany2stringadd\[GroupRouter\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (GroupRouter\[T], B)ImplicitThis member is added by an implicit conversion from GroupRouter\[T] toArrowAssoc\[GroupRouter\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#behavior:akka.actor.typed.Behavior[Inner] "Permalink")  val behavior: [Behavior](../Behavior.html)\[T]ImplicitThis member is added by an implicit conversion from GroupRouter\[T] to[BehaviorDecorators](../Behavior$$BehaviorDecorators.html)\[T] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../Behavior$.html).Definition Classes[BehaviorDecorators](../Behavior$$BehaviorDecorators.html)
8. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (GroupRouter\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GroupRouter\[T]ImplicitThis member is added by an implicit conversion from GroupRouter\[T] toEnsuring\[GroupRouter\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (GroupRouter\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GroupRouter\[T]ImplicitThis member is added by an implicit conversion from GroupRouter\[T] toEnsuring\[GroupRouter\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GroupRouter\[T]ImplicitThis member is added by an implicit conversion from GroupRouter\[T] toEnsuring\[GroupRouter\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GroupRouter\[T]ImplicitThis member is added by an implicit conversion from GroupRouter\[T] toEnsuring\[GroupRouter\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#narrow[U<:T]:akka.actor.typed.Behavior[U] "Permalink") final  def narrow\[U \<: T]: [Behavior](../Behavior.html)\[U]Narrow the type of this Behavior, which is always a safe operation.

Narrow the type of this Behavior, which is always a safe operation. This
method is necessary to implement the contravariant nature of Behavior
(which cannot be expressed directly due to type inference problems).

Definition Classes[Behavior](../Behavior.html)
19. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#transformMessages[Outer](matcher:PartialFunction[Outer,Inner])(implicitevidence$1:scala.reflect.ClassTag[Outer]):akka.actor.typed.Behavior[Outer] "Permalink")  def transformMessages\[Outer](matcher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Outer, T])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[Outer]): [Behavior](../Behavior.html)\[Outer]Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
PartialFunction decides which message to pull in (those that it is defined
at) and may transform the incoming message to place them into the wrapped
Behavior’s type hierarchy.

Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
PartialFunction decides which message to pull in (those that it is defined
at) and may transform the incoming message to place them into the wrapped
Behavior’s type hierarchy. Signals are not transformed.

Example:

```
val b: Behavior[Number] =
  Behaviors
    .receive[String] { (ctx, msg) =>
      println(msg)
      Behaviors.same
    }
    .transformMessages[Number] {
      case b: BigDecimal => s"BigDecimal(&dollar;b)"
      case i: BigInt     => s"BigInteger(&dollar;i)"
      // all other kinds of Number will be `unhandled`
    }
```
The `ClassTag` for `Outer` ensures that only messages of this class or a subclass thereof will be
intercepted. Other message types (e.g. a private protocol) will bypass
the interceptor and be continue to the inner behavior untouched.

ImplicitThis member is added by an implicit conversion from GroupRouter\[T] to[BehaviorDecorators](../Behavior$$BehaviorDecorators.html)\[T] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../Behavior$.html).Definition Classes[BehaviorDecorators](../Behavior$$BehaviorDecorators.html)
25. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from GroupRouter\[T] toStringFormat\[GroupRouter\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/scaladsl/GroupRouter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (GroupRouter\[T], B)ImplicitThis member is added by an implicit conversion from GroupRouter\[T] toArrowAssoc\[GroupRouter\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Behavior](../Behavior.html)\[T]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion BehaviorDecorators fromGroupRouter\[T] to [BehaviorDecorators](../Behavior$$BehaviorDecorators.html)\[T]

### Inherited by implicit conversion any2stringadd fromGroupRouter\[T] to any2stringadd\[GroupRouter\[T]]

### Inherited by implicit conversion StringFormat fromGroupRouter\[T] to StringFormat\[GroupRouter\[T]]

### Inherited by implicit conversion Ensuring fromGroupRouter\[T] to Ensuring\[GroupRouter\[T]]

### Inherited by implicit conversion ArrowAssoc fromGroupRouter\[T] to ArrowAssoc\[GroupRouter\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior$$BehaviorDecorators.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/GroupRouter.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/PoolRouter.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Routers$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/adapter/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/package$$LoggerOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/GroupRouter.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/GroupRouter.html)*