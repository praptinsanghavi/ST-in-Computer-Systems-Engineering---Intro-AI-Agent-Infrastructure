---
description: Akka 2.10.17 - akka.dispatch.japi.UnitFunctionBridge
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:22:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/japi$$UnitFunctionBridge.html
title: Akka 2.10.17 - akka.dispatch.japi.UnitFunctionBridge
---

# Akka 2.10.17 - akka.dispatch.japi.UnitFunctionBridge

> **Summary:** Akka 2.10.17 - akka.dispatch.japi.UnitFunctionBridge

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
- [RecoverBridge](japi$$RecoverBridge.html)
- UnitFunctionBridge
c[akka](../index.html).[dispatch](index.html).[japi](japi$.html)

# UnitFunctionBridge[**](../../akka/dispatch/japi$$UnitFunctionBridge.html "Permalink")

### 

#### class UnitFunctionBridge\[\-T] extends (T) \=\> [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)

Annotations@deprecated Deprecated*(Since version 2\.0\)* Do not use this directly, use subclasses of this

Source[Future.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Future.scala#L213)Linear Supertypes(T) \=\> [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Foreach](Foreach.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UnitFunctionBridge
2. Function1
3. AnyRef
4. Any
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

1. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#<init>():akka.dispatch.japi.UnitFunctionBridge[T] "Permalink")  new UnitFunctionBridge()
### Value Members

1. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from UnitFunctionBridge\[T] toany2stringadd\[UnitFunctionBridge\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (UnitFunctionBridge\[T], B)ImplicitThis member is added by an implicit conversion from UnitFunctionBridge\[T] toArrowAssoc\[UnitFunctionBridge\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#andThen[A](g:R=>A):T1=>A "Permalink")  def andThen\[A](g: ([BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)) \=\> A): (T) \=\> ADefinition ClassesFunction1Annotations@unspecialized()
7. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#apply(t:T):scala.runtime.BoxedUnit "Permalink") final  def apply(t: T): [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)Definition ClassesUnitFunctionBridge → Function1
8. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#apply$mcLD$sp(d:Double):scala.runtime.BoxedUnit "Permalink") final  def apply$mcLD$sp(d: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)
9. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#apply$mcLF$sp(f:Float):scala.runtime.BoxedUnit "Permalink") final  def apply$mcLF$sp(f: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)): [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)
10. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#apply$mcLI$sp(i:Int):scala.runtime.BoxedUnit "Permalink") final  def apply$mcLI$sp(i: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)
11. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#apply$mcLJ$sp(l:Long):scala.runtime.BoxedUnit "Permalink") final  def apply$mcLJ$sp(l: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)
12. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> T): (A) \=\> [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)Definition ClassesFunction1Annotations@unspecialized()
15. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (UnitFunctionBridge\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnitFunctionBridge\[T]ImplicitThis member is added by an implicit conversion from UnitFunctionBridge\[T] toEnsuring\[UnitFunctionBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (UnitFunctionBridge\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnitFunctionBridge\[T]ImplicitThis member is added by an implicit conversion from UnitFunctionBridge\[T] toEnsuring\[UnitFunctionBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnitFunctionBridge\[T]ImplicitThis member is added by an implicit conversion from UnitFunctionBridge\[T] toEnsuring\[UnitFunctionBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnitFunctionBridge\[T]ImplicitThis member is added by an implicit conversion from UnitFunctionBridge\[T] toEnsuring\[UnitFunctionBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#internal(result:T):Unit "Permalink")  def internal(result: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected
24. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
30. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from UnitFunctionBridge\[T] toStringFormat\[UnitFunctionBridge\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/japi$$UnitFunctionBridge.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (UnitFunctionBridge\[T], B)ImplicitThis member is added by an implicit conversion from UnitFunctionBridge\[T] toArrowAssoc\[UnitFunctionBridge\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from (T) \=\> [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUnitFunctionBridge\[T] to any2stringadd\[UnitFunctionBridge\[T]]

### Inherited by implicit conversion StringFormat fromUnitFunctionBridge\[T] to StringFormat\[UnitFunctionBridge\[T]]

### Inherited by implicit conversion Ensuring fromUnitFunctionBridge\[T] to Ensuring\[UnitFunctionBridge\[T]]

### Inherited by implicit conversion ArrowAssoc fromUnitFunctionBridge\[T] to ArrowAssoc\[UnitFunctionBridge\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/Foreach.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$BooleanFunctionBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$CallbackBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$RecoverBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$UnitFunctionBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$UnitFunctionBridge.html](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$UnitFunctionBridge.html)*