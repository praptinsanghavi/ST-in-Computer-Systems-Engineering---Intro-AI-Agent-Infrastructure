---
description: Akka 2.10.17 - akka.actor.typed.Behavior.BehaviorDecorators
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:36:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/Behavior$$BehaviorDecorators.html
title: Akka 2.10.17 - akka.actor.typed.Behavior.BehaviorDecorators
---

# Akka 2.10.17 - akka.actor.typed.Behavior.BehaviorDecorators

> **Summary:** Akka 2.10.17 - akka.actor.typed.Behavior.BehaviorDecorators

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/typed/Behavior$.html "Permalink")  object [Behavior](Behavior$.html)Definition Classes[typed](index.html)
- BehaviorDecorators
c[akka](../../index.html).[actor](../index.html).[typed](index.html).[Behavior](Behavior$.html)

# BehaviorDecorators[**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html "Permalink")

### 

#### implicit final  class BehaviorDecorators\[Inner] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Source[Behavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/Behavior.scala#L118)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BehaviorDecorators
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

1. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#<init>(behavior:akka.actor.typed.Behavior[Inner]):akka.actor.typed.Behavior.BehaviorDecorators[Inner] "Permalink")  new BehaviorDecorators(behavior: [Behavior](Behavior.html)\[Inner])
### Value Members

1. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BehaviorDecorators\[Inner] toany2stringadd\[BehaviorDecorators\[Inner]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BehaviorDecorators\[Inner], B)ImplicitThis member is added by an implicit conversion from BehaviorDecorators\[Inner] toArrowAssoc\[BehaviorDecorators\[Inner]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#behavior:akka.actor.typed.Behavior[Inner] "Permalink")  val behavior: [Behavior](Behavior.html)\[Inner]
8. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BehaviorDecorators\[Inner]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BehaviorDecorators\[Inner]ImplicitThis member is added by an implicit conversion from BehaviorDecorators\[Inner] toEnsuring\[BehaviorDecorators\[Inner]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BehaviorDecorators\[Inner]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BehaviorDecorators\[Inner]ImplicitThis member is added by an implicit conversion from BehaviorDecorators\[Inner] toEnsuring\[BehaviorDecorators\[Inner]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BehaviorDecorators\[Inner]ImplicitThis member is added by an implicit conversion from BehaviorDecorators\[Inner] toEnsuring\[BehaviorDecorators\[Inner]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BehaviorDecorators\[Inner]ImplicitThis member is added by an implicit conversion from BehaviorDecorators\[Inner] toEnsuring\[BehaviorDecorators\[Inner]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
13. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
15. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#transformMessages[Outer](matcher:PartialFunction[Outer,Inner])(implicitevidence$1:scala.reflect.ClassTag[Outer]):akka.actor.typed.Behavior[Outer] "Permalink")  def transformMessages\[Outer](matcher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Outer, Inner])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[Outer]): [Behavior](Behavior.html)\[Outer]Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
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
### Deprecated Value Members

1. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BehaviorDecorators\[Inner] toStringFormat\[BehaviorDecorators\[Inner]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../akka/actor/typed/Behavior$$BehaviorDecorators.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BehaviorDecorators\[Inner], B)ImplicitThis member is added by an implicit conversion from BehaviorDecorators\[Inner] toArrowAssoc\[BehaviorDecorators\[Inner]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBehaviorDecorators\[Inner] to any2stringadd\[BehaviorDecorators\[Inner]]

### Inherited by implicit conversion StringFormat fromBehaviorDecorators\[Inner] to StringFormat\[BehaviorDecorators\[Inner]]

### Inherited by implicit conversion Ensuring fromBehaviorDecorators\[Inner] to Ensuring\[BehaviorDecorators\[Inner]]

### Inherited by implicit conversion ArrowAssoc fromBehaviorDecorators\[Inner] to ArrowAssoc\[BehaviorDecorators\[Inner]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior$$BehaviorDecorators.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior$$BehaviorDecorators.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior$$BehaviorDecorators.html)*