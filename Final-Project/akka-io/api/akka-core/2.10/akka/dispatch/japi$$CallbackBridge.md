---
description: Akka 2.10.17 - akka.dispatch.japi.CallbackBridge
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:22:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/japi$$CallbackBridge.html
title: Akka 2.10.17 - akka.dispatch.japi.CallbackBridge
---

# Akka 2.10.17 - akka.dispatch.japi.CallbackBridge

> **Summary:** Akka 2.10.17 - akka.dispatch.japi.CallbackBridge

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
- CallbackBridge
- [RecoverBridge](japi$$RecoverBridge.html)
- [UnitFunctionBridge](japi$$UnitFunctionBridge.html)
c[akka](../index.html).[dispatch](index.html).[japi](japi$.html)

# CallbackBridge[**](../../akka/dispatch/japi$$CallbackBridge.html "Permalink")

### 

#### class CallbackBridge\[\-T] extends [AbstractPartialFunction](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractPartialFunction.html#scala.runtime.AbstractPartialFunction)\[T, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]

Annotations@deprecated Deprecated*(Since version 2\.0\)* Do not use this directly, use subclasses of this

Source[Future.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Future.scala#L190)Linear Supertypes[AbstractPartialFunction](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractPartialFunction.html#scala.runtime.AbstractPartialFunction)\[T, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)], [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[T, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)], (T) \=\> [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[OnComplete](OnComplete.html), [OnFailure](OnFailure.html), [OnSuccess](OnSuccess.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CallbackBridge
2. AbstractPartialFunction
3. PartialFunction
4. Function1
5. AnyRef
6. Any
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

1. [**](../../akka/dispatch/japi$$CallbackBridge.html#<init>():akka.dispatch.japi.CallbackBridge[T] "Permalink")  new CallbackBridge()
### Value Members

1. [**](../../akka/dispatch/japi$$CallbackBridge.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/japi$$CallbackBridge.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/japi$$CallbackBridge.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CallbackBridge\[T] toany2stringadd\[CallbackBridge\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/japi$$CallbackBridge.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CallbackBridge\[T], B)ImplicitThis member is added by an implicit conversion from CallbackBridge\[T] toArrowAssoc\[CallbackBridge\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/japi$$CallbackBridge.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/japi$$CallbackBridge.html#andThen[C](k:PartialFunction[B,C]):PartialFunction[A,C] "Permalink")  def andThen\[C](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit), C]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[T, C]Definition ClassesPartialFunction
7. [**](../../akka/dispatch/japi$$CallbackBridge.html#andThen[C](k:B=>C):PartialFunction[A,C] "Permalink")  def andThen\[C](k: ([BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)) \=\> C): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[T, C]Definition ClassesPartialFunction → Function1
8. [**](../../akka/dispatch/japi$$CallbackBridge.html#apply(t:T):scala.runtime.BoxedUnit "Permalink") final  def apply(t: T): [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)Definition ClassesCallbackBridge → AbstractPartialFunction → Function1
9. [**](../../akka/dispatch/japi$$CallbackBridge.html#applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1 "Permalink")  def applyOrElse\[A1 \<: T, B1 \>: [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)](x: A1, default: (A1) \=\> B1): B1Definition ClassesPartialFunction
10. [**](../../akka/dispatch/japi$$CallbackBridge.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../akka/dispatch/japi$$CallbackBridge.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/dispatch/japi$$CallbackBridge.html#compose[R](k:PartialFunction[R,A]):PartialFunction[R,B] "Permalink")  def compose\[R](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, T]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]Definition ClassesPartialFunction
13. [**](../../akka/dispatch/japi$$CallbackBridge.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> T): (A) \=\> [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)Definition ClassesFunction1Annotations@unspecialized()
14. [**](../../akka/dispatch/japi$$CallbackBridge.html#elementWise:PartialFunction.ElementWiseExtractor[A,B] "Permalink")  def elementWise: ElementWiseExtractor\[T, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]Definition ClassesPartialFunction
15. [**](../../akka/dispatch/japi$$CallbackBridge.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CallbackBridge\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CallbackBridge\[T]ImplicitThis member is added by an implicit conversion from CallbackBridge\[T] toEnsuring\[CallbackBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/dispatch/japi$$CallbackBridge.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CallbackBridge\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CallbackBridge\[T]ImplicitThis member is added by an implicit conversion from CallbackBridge\[T] toEnsuring\[CallbackBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/dispatch/japi$$CallbackBridge.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CallbackBridge\[T]ImplicitThis member is added by an implicit conversion from CallbackBridge\[T] toEnsuring\[CallbackBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/dispatch/japi$$CallbackBridge.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CallbackBridge\[T]ImplicitThis member is added by an implicit conversion from CallbackBridge\[T] toEnsuring\[CallbackBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/dispatch/japi$$CallbackBridge.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/dispatch/japi$$CallbackBridge.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../akka/dispatch/japi$$CallbackBridge.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/dispatch/japi$$CallbackBridge.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/dispatch/japi$$CallbackBridge.html#internal(result:T):Unit "Permalink")  def internal(result: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected
24. [**](../../akka/dispatch/japi$$CallbackBridge.html#isDefinedAt(t:T):Boolean "Permalink") final  def isDefinedAt(t: T): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesCallbackBridge → PartialFunction
25. [**](../../akka/dispatch/japi$$CallbackBridge.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../akka/dispatch/japi$$CallbackBridge.html#lift:A=>Option[B] "Permalink")  def lift: (T) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]Definition ClassesPartialFunction
27. [**](../../akka/dispatch/japi$$CallbackBridge.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../akka/dispatch/japi$$CallbackBridge.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../akka/dispatch/japi$$CallbackBridge.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../akka/dispatch/japi$$CallbackBridge.html#orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1] "Permalink")  def orElse\[A1 \<: T, B1 \>: [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)](that: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]Definition ClassesPartialFunction
31. [**](../../akka/dispatch/japi$$CallbackBridge.html#runWith[U](action:B=>U):A=>Boolean "Permalink")  def runWith\[U](action: ([BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)) \=\> U): (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPartialFunction
32. [**](../../akka/dispatch/japi$$CallbackBridge.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../akka/dispatch/japi$$CallbackBridge.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
34. [**](../../akka/dispatch/japi$$CallbackBridge.html#unapply(a:A):Option[B] "Permalink")  def unapply(a: T): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]Definition ClassesPartialFunction
35. [**](../../akka/dispatch/japi$$CallbackBridge.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../akka/dispatch/japi$$CallbackBridge.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../akka/dispatch/japi$$CallbackBridge.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/japi$$CallbackBridge.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/japi$$CallbackBridge.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CallbackBridge\[T] toStringFormat\[CallbackBridge\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/japi$$CallbackBridge.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CallbackBridge\[T], B)ImplicitThis member is added by an implicit conversion from CallbackBridge\[T] toArrowAssoc\[CallbackBridge\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AbstractPartialFunction](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractPartialFunction.html#scala.runtime.AbstractPartialFunction)\[T, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]

### Inherited from [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[T, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]

### Inherited from (T) \=\> [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCallbackBridge\[T] to any2stringadd\[CallbackBridge\[T]]

### Inherited by implicit conversion StringFormat fromCallbackBridge\[T] to StringFormat\[CallbackBridge\[T]]

### Inherited by implicit conversion Ensuring fromCallbackBridge\[T] to Ensuring\[CallbackBridge\[T]]

### Inherited by implicit conversion ArrowAssoc fromCallbackBridge\[T] to ArrowAssoc\[CallbackBridge\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/OnComplete.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/OnFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/OnSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$BooleanFunctionBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$CallbackBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$RecoverBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$UnitFunctionBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$CallbackBridge.html](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$CallbackBridge.html)*