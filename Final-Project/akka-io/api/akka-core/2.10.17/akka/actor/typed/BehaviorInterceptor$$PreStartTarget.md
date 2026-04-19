---
description: Akka 2.10.17 - akka.actor.typed.BehaviorInterceptor.PreStartTarget
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:51:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html
title: Akka 2.10.17 - akka.actor.typed.BehaviorInterceptor.PreStartTarget
---

# Akka 2.10.17 - akka.actor.typed.BehaviorInterceptor.PreStartTarget

> **Summary:** Akka 2.10.17 - akka.actor.typed.BehaviorInterceptor.PreStartTarget

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/typed/BehaviorInterceptor$.html "Permalink")  object [BehaviorInterceptor](BehaviorInterceptor$.html)Definition Classes[typed](index.html)
- PreStartTarget
- [ReceiveTarget](BehaviorInterceptor$$ReceiveTarget.html "Abstraction of passing the message on further in the behavior stack in BehaviorInterceptor#aroundReceive.")
- [SignalTarget](BehaviorInterceptor$$SignalTarget.html "Abstraction of passing the signal on further in the behavior stack in BehaviorInterceptor#aroundReceive.")
t[akka](../../index.html).[actor](../index.html).[typed](index.html).[BehaviorInterceptor](BehaviorInterceptor$.html)

# PreStartTarget[**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html "Permalink")

### 

#### trait PreStartTarget\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Abstraction of passing the on further in the behavior stack in [BehaviorInterceptor\#aroundStart](BehaviorInterceptor.html#aroundStart(ctx:akka.actor.typed.TypedActorContext[Outer],target:akka.actor.typed.BehaviorInterceptor.PreStartTarget[Inner]):akka.actor.typed.Behavior[Inner]).

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[BehaviorInterceptor.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/BehaviorInterceptor.scala#L94)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PreStartTarget
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
### Abstract Value Members

1. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#start(ctx:akka.actor.typed.TypedActorContext[_]):akka.actor.typed.Behavior[T] "Permalink") abstract  def start(ctx: [TypedActorContext](TypedActorContext.html)\[\_]): [Behavior](Behavior.html)\[T]
### Concrete Value Members

1. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PreStartTarget\[T] toany2stringadd\[PreStartTarget\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PreStartTarget\[T], B)ImplicitThis member is added by an implicit conversion from PreStartTarget\[T] toArrowAssoc\[PreStartTarget\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PreStartTarget\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PreStartTarget\[T]ImplicitThis member is added by an implicit conversion from PreStartTarget\[T] toEnsuring\[PreStartTarget\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PreStartTarget\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PreStartTarget\[T]ImplicitThis member is added by an implicit conversion from PreStartTarget\[T] toEnsuring\[PreStartTarget\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PreStartTarget\[T]ImplicitThis member is added by an implicit conversion from PreStartTarget\[T] toEnsuring\[PreStartTarget\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PreStartTarget\[T]ImplicitThis member is added by an implicit conversion from PreStartTarget\[T] toEnsuring\[PreStartTarget\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PreStartTarget\[T] toStringFormat\[PreStartTarget\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PreStartTarget\[T], B)ImplicitThis member is added by an implicit conversion from PreStartTarget\[T] toArrowAssoc\[PreStartTarget\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPreStartTarget\[T] to any2stringadd\[PreStartTarget\[T]]

### Inherited by implicit conversion StringFormat fromPreStartTarget\[T] to StringFormat\[PreStartTarget\[T]]

### Inherited by implicit conversion Ensuring fromPreStartTarget\[T] to Ensuring\[PreStartTarget\[T]]

### Inherited by implicit conversion ArrowAssoc fromPreStartTarget\[T] to ArrowAssoc\[PreStartTarget\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BehaviorInterceptor$$ReceiveTarget.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BehaviorInterceptor$$SignalTarget.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BehaviorInterceptor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BehaviorInterceptor$$PreStartTarget.html)*