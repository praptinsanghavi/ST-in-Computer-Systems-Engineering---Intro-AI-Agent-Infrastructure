---
description: Akka 2.10.17 - akka.dispatch.japi.RecoverBridge
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:07:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/japi$$RecoverBridge.html
title: Akka 2.10.17 - akka.dispatch.japi.RecoverBridge
---

# Akka 2.10.17 - akka.dispatch.japi.RecoverBridge

> **Summary:** Akka 2.10.17 - akka.dispatch.japi.RecoverBridge

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/japi$.html "Permalink")  object [japi](japi$.html "This class contains bridge classes between Scala and Java.")This class contains bridge classes between Scala and Java.

This class contains bridge classes between Scala and Java.
Internal use only.

Definition Classes[dispatch](index.html)
- [BooleanFunctionBridge](japi$$BooleanFunctionBridge.html)
- [CallbackBridge](japi$$CallbackBridge.html)
- RecoverBridge
- [UnitFunctionBridge](japi$$UnitFunctionBridge.html)
c[akka](../index.html).[dispatch](index.html).[japi](japi$.html)

# RecoverBridge[**](../../akka/dispatch/japi$$RecoverBridge.html "Permalink")

### 

#### class RecoverBridge\[\+T] extends [AbstractPartialFunction](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractPartialFunction.html#scala.runtime.AbstractPartialFunction)\[Throwable, T]

Annotations@deprecated Deprecated*(Since version 2\.0\)* Do not use this directly, use 'Recover'

Source[Future.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Future.scala#L200)Linear Supertypes[AbstractPartialFunction](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractPartialFunction.html#scala.runtime.AbstractPartialFunction)\[Throwable, T], [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, T], (Throwable) \=\> T, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Recover](Recover.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RecoverBridge
2. AbstractPartialFunction
3. PartialFunction
4. Function1
5. AnyRef
6. Any
Implicitly  
1. by UnliftOps
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/dispatch/japi$$RecoverBridge.html#<init>():akka.dispatch.japi.RecoverBridge[T] "Permalink")  new RecoverBridge()
### Value Members

1. [**](../../akka/dispatch/japi$$RecoverBridge.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/japi$$RecoverBridge.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/japi$$RecoverBridge.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RecoverBridge\[T] toany2stringadd\[RecoverBridge\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/japi$$RecoverBridge.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RecoverBridge\[T], B)ImplicitThis member is added by an implicit conversion from RecoverBridge\[T] toArrowAssoc\[RecoverBridge\[T]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if T is a subclass of Option\[Nothing] (T \<: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]).Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/japi$$RecoverBridge.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/japi$$RecoverBridge.html#andThen[C](k:PartialFunction[B,C]):PartialFunction[A,C] "Permalink")  def andThen\[C](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[T, C]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, C]Definition ClassesPartialFunction
7. [**](../../akka/dispatch/japi$$RecoverBridge.html#andThen[C](k:B=>C):PartialFunction[A,C] "Permalink")  def andThen\[C](k: (T) \=\> C): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, C]Definition ClassesPartialFunction → Function1
8. [**](../../akka/dispatch/japi$$RecoverBridge.html#apply(t:Throwable):T "Permalink") final  def apply(t: Throwable): TDefinition ClassesRecoverBridge → AbstractPartialFunction → Function1
9. [**](../../akka/dispatch/japi$$RecoverBridge.html#applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1 "Permalink")  def applyOrElse\[A1 \<: Throwable, B1 \>: T](x: A1, default: (A1) \=\> B1): B1Definition ClassesPartialFunction
10. [**](../../akka/dispatch/japi$$RecoverBridge.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../akka/dispatch/japi$$RecoverBridge.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/dispatch/japi$$RecoverBridge.html#compose[R](k:PartialFunction[R,A]):PartialFunction[R,B] "Permalink")  def compose\[R](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, Throwable]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, T]Definition ClassesPartialFunction
13. [**](../../akka/dispatch/japi$$RecoverBridge.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> Throwable): (A) \=\> TDefinition ClassesFunction1Annotations@unspecialized()
14. [**](../../akka/dispatch/japi$$RecoverBridge.html#elementWise:PartialFunction.ElementWiseExtractor[A,B] "Permalink")  def elementWise: ElementWiseExtractor\[Throwable, T]Definition ClassesPartialFunction
15. [**](../../akka/dispatch/japi$$RecoverBridge.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RecoverBridge\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RecoverBridge\[T]ImplicitThis member is added by an implicit conversion from RecoverBridge\[T] toEnsuring\[RecoverBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/dispatch/japi$$RecoverBridge.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RecoverBridge\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RecoverBridge\[T]ImplicitThis member is added by an implicit conversion from RecoverBridge\[T] toEnsuring\[RecoverBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/dispatch/japi$$RecoverBridge.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RecoverBridge\[T]ImplicitThis member is added by an implicit conversion from RecoverBridge\[T] toEnsuring\[RecoverBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/dispatch/japi$$RecoverBridge.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RecoverBridge\[T]ImplicitThis member is added by an implicit conversion from RecoverBridge\[T] toEnsuring\[RecoverBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/dispatch/japi$$RecoverBridge.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/dispatch/japi$$RecoverBridge.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../akka/dispatch/japi$$RecoverBridge.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/dispatch/japi$$RecoverBridge.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/dispatch/japi$$RecoverBridge.html#internal(result:Throwable):T "Permalink")  def internal(result: Throwable): TAttributesprotected
24. [**](../../akka/dispatch/japi$$RecoverBridge.html#isDefinedAt(t:Throwable):Boolean "Permalink") final  def isDefinedAt(t: Throwable): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesRecoverBridge → PartialFunction
25. [**](../../akka/dispatch/japi$$RecoverBridge.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../akka/dispatch/japi$$RecoverBridge.html#lift:A=>Option[B] "Permalink")  def lift: (Throwable) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]Definition ClassesPartialFunction
27. [**](../../akka/dispatch/japi$$RecoverBridge.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../akka/dispatch/japi$$RecoverBridge.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../akka/dispatch/japi$$RecoverBridge.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../akka/dispatch/japi$$RecoverBridge.html#orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1] "Permalink")  def orElse\[A1 \<: Throwable, B1 \>: T](that: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]Definition ClassesPartialFunction
31. [**](../../akka/dispatch/japi$$RecoverBridge.html#runWith[U](action:B=>U):A=>Boolean "Permalink")  def runWith\[U](action: (T) \=\> U): (Throwable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPartialFunction
32. [**](../../akka/dispatch/japi$$RecoverBridge.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../akka/dispatch/japi$$RecoverBridge.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
34. [**](../../akka/dispatch/japi$$RecoverBridge.html#unapply(a:A):Option[B] "Permalink")  def unapply(a: Throwable): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]Definition ClassesPartialFunction
35. [**](../../akka/dispatch/japi$$RecoverBridge.html#unlift:PartialFunction[A,B] "Permalink")  def unlift: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, B]ImplicitThis member is added by an implicit conversion from RecoverBridge\[T] toUnliftOps\[Throwable, B] performed by method UnliftOps in scala.Function1\.This conversion will take place only if T is a subclass of Option\[B] (T \<: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]).Definition ClassesUnliftOps
36. [**](../../akka/dispatch/japi$$RecoverBridge.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../akka/dispatch/japi$$RecoverBridge.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
38. [**](../../akka/dispatch/japi$$RecoverBridge.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/japi$$RecoverBridge.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/japi$$RecoverBridge.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RecoverBridge\[T] toStringFormat\[RecoverBridge\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/japi$$RecoverBridge.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RecoverBridge\[T], B)ImplicitThis member is added by an implicit conversion from RecoverBridge\[T] toArrowAssoc\[RecoverBridge\[T]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if T is a subclass of Option\[Nothing] (T \<: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]).Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AbstractPartialFunction](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractPartialFunction.html#scala.runtime.AbstractPartialFunction)\[Throwable, T]

### Inherited from [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, T]

### Inherited from (Throwable) \=\> T

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion UnliftOps fromRecoverBridge\[T] to UnliftOps\[Throwable, B]

### Inherited by implicit conversion any2stringadd fromRecoverBridge\[T] to any2stringadd\[RecoverBridge\[T]]

### Inherited by implicit conversion StringFormat fromRecoverBridge\[T] to StringFormat\[RecoverBridge\[T]]

### Inherited by implicit conversion Ensuring fromRecoverBridge\[T] to Ensuring\[RecoverBridge\[T]]

### Inherited by implicit conversion ArrowAssoc fromRecoverBridge\[T] to ArrowAssoc\[RecoverBridge\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/Recover.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/japi$$BooleanFunctionBridge.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/japi$$CallbackBridge.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/japi$$RecoverBridge.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/japi$$UnitFunctionBridge.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/japi$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/japi$$RecoverBridge.html](https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/japi$$RecoverBridge.html)*