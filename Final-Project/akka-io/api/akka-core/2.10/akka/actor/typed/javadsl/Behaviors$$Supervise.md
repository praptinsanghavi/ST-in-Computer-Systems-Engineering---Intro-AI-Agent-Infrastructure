---
description: Akka 2.10.17 - akka.actor.typed.javadsl.Behaviors.Supervise
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:32:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/Behaviors$$Supervise.html
title: Akka 2.10.17 - akka.actor.typed.javadsl.Behaviors.Supervise
---

# Akka 2.10.17 - akka.actor.typed.javadsl.Behaviors.Supervise

> **Summary:** Akka 2.10.17 - akka.actor.typed.javadsl.Behaviors.Supervise

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/javadsl/Behaviors$.html "Permalink")  object [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")Factories for [akka.actor.typed.Behavior](../Behavior.html).

Factories for [akka.actor.typed.Behavior](../Behavior.html).

Definition Classes[javadsl](index.html)
- Supervise
c[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[javadsl](index.html).[Behaviors](Behaviors$.html)

# Supervise[**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html "Permalink")

### 

#### final  class Supervise\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[Behaviors.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/javadsl/Behaviors.scala#L256)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Supervise
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
### Value Members

1. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Supervise\[T] toany2stringadd\[Supervise\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Supervise\[T], B)ImplicitThis member is added by an implicit conversion from Supervise\[T] toArrowAssoc\[Supervise\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Supervise\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Supervise\[T]ImplicitThis member is added by an implicit conversion from Supervise\[T] toEnsuring\[Supervise\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Supervise\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Supervise\[T]ImplicitThis member is added by an implicit conversion from Supervise\[T] toEnsuring\[Supervise\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Supervise\[T]ImplicitThis member is added by an implicit conversion from Supervise\[T] toEnsuring\[Supervise\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Supervise\[T]ImplicitThis member is added by an implicit conversion from Supervise\[T] toEnsuring\[Supervise\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#onFailure(strategy:akka.actor.typed.SupervisorStrategy):akka.actor.typed.Behavior[T] "Permalink")  def onFailure(strategy: [SupervisorStrategy](../SupervisorStrategy.html)): [Behavior](../Behavior.html)\[T]Specify the [SupervisorStrategy](../SupervisorStrategy.html) to be invoked when the wrapped behavior throws.

Specify the [SupervisorStrategy](../SupervisorStrategy.html) to be invoked when the wrapped behavior throws.

All non\-fatal (see [scala.util.control.NonFatal](https://www.scala-lang.org/api/2.13.17/scala/util/control/NonFatal$.html)) exceptions types will be handled using the given strategy.
21. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#onFailure[Thr<:Throwable](clazz:Class[Thr],strategy:akka.actor.typed.SupervisorStrategy):akka.actor.typed.Behavior[T] "Permalink")  def onFailure\[Thr \<: Throwable](clazz: Class\[Thr], strategy: [SupervisorStrategy](../SupervisorStrategy.html)): [Behavior](../Behavior.html)\[T]Specify the [SupervisorStrategy](../SupervisorStrategy.html) to be invoked when the wrapped behavior throws.

Specify the [SupervisorStrategy](../SupervisorStrategy.html) to be invoked when the wrapped behavior throws.

Only exceptions of the given type (and their subclasses) will be handled by this supervision behavior.
22. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Supervise\[T] toStringFormat\[Supervise\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/javadsl/Behaviors$$Supervise.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Supervise\[T], B)ImplicitThis member is added by an implicit conversion from Supervise\[T] toArrowAssoc\[Supervise\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

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
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/Behaviors$$Supervise.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/Behaviors$$Supervise.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/javadsl/Behaviors$$Supervise.html)*