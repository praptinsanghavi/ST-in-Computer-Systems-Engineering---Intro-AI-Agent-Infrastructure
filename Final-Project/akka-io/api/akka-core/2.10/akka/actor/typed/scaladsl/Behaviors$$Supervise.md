---
description: Akka 2.10.17 - akka.actor.typed.scaladsl.Behaviors.Supervise
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:34:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/Behaviors$$Supervise.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl.Behaviors.Supervise
---

# Akka 2.10.17 - akka.actor.typed.scaladsl.Behaviors.Supervise

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl.Behaviors.Supervise

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/scaladsl/Behaviors$.html "Permalink")  object [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")Factories for [akka.actor.typed.Behavior](../Behavior.html).

Factories for [akka.actor.typed.Behavior](../Behavior.html).

Definition Classes[scaladsl](index.html)
- [Receive](Behaviors$$Receive.html "Behavior that exposes additional fluent DSL methods to further change the message or signal reception behavior.")
- Supervise
c[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[scaladsl](index.html).[Behaviors](Behaviors$.html)

# Supervise[**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html "Permalink")

### 

#### final  class Supervise\[T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Source[Behaviors.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/Behaviors.scala#L222)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Supervise
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
### Value Members

1. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Supervise\[T] toany2stringadd\[Supervise\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Supervise\[T], B)ImplicitThis member is added by an implicit conversion from Supervise\[T] toArrowAssoc\[Supervise\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Supervise\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Supervise\[T]ImplicitThis member is added by an implicit conversion from Supervise\[T] toEnsuring\[Supervise\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
8. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Supervise\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Supervise\[T]ImplicitThis member is added by an implicit conversion from Supervise\[T] toEnsuring\[Supervise\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Supervise\[T]ImplicitThis member is added by an implicit conversion from Supervise\[T] toEnsuring\[Supervise\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Supervise\[T]ImplicitThis member is added by an implicit conversion from Supervise\[T] toEnsuring\[Supervise\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
12. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#onFailure[Thr<:Throwable](strategy:akka.actor.typed.SupervisorStrategy)(implicittag:scala.reflect.ClassTag[Thr]):akka.actor.typed.Behavior[T] "Permalink")  def onFailure\[Thr \<: Throwable](strategy: [SupervisorStrategy](../SupervisorStrategy.html))(implicit tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[Thr] \= ThrowableClassTag): [Behavior](../Behavior.html)\[T]Specify the [SupervisorStrategy](../SupervisorStrategy.html) to be invoked when the wrapped behavior throws.
14. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
15. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#wrapped:akka.actor.typed.Behavior[T] "Permalink")  val wrapped: [Behavior](../Behavior.html)\[T]
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Supervise\[T] toStringFormat\[Supervise\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../../akka/actor/typed/scaladsl/Behaviors$$Supervise.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Supervise\[T], B)ImplicitThis member is added by an implicit conversion from Supervise\[T] toArrowAssoc\[Supervise\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSupervise\[T] to any2stringadd\[Supervise\[T]]

### Inherited by implicit conversion StringFormat fromSupervise\[T] to StringFormat\[Supervise\[T]]

### Inherited by implicit conversion Ensuring fromSupervise\[T] to Ensuring\[Supervise\[T]]

### Inherited by implicit conversion ArrowAssoc fromSupervise\[T] to ArrowAssoc\[Supervise\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$$Receive.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$$Supervise.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$$Supervise.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$$Supervise.html)*