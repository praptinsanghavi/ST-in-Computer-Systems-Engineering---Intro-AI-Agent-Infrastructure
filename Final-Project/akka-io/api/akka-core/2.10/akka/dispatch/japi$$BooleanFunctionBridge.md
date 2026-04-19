---
description: Akka 2.10.17 - akka.dispatch.japi.BooleanFunctionBridge
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/japi$$BooleanFunctionBridge.html
title: Akka 2.10.17 - akka.dispatch.japi.BooleanFunctionBridge
---

# Akka 2.10.17 - akka.dispatch.japi.BooleanFunctionBridge

> **Summary:** Akka 2.10.17 - akka.dispatch.japi.BooleanFunctionBridge

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/japi$.html "Permalink")  object [japi](japi$.html "This class contains bridge classes between Scala and Java.")This class contains bridge classes between Scala and Java.

This class contains bridge classes between Scala and Java.
Internal use only.

Definition Classes[dispatch](index.html)
- BooleanFunctionBridge
- [CallbackBridge](japi$$CallbackBridge.html)
- [RecoverBridge](japi$$RecoverBridge.html)
- [UnitFunctionBridge](japi$$UnitFunctionBridge.html)
c[akka](../index.html).[dispatch](index.html).[japi](japi$.html)

# BooleanFunctionBridge[**](../../akka/dispatch/japi$$BooleanFunctionBridge.html "Permalink")

### 

#### class BooleanFunctionBridge\[\-T] extends (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)

Annotations@deprecated Deprecated*(Since version 2\.0\)* Do not use this directly, use subclasses of this

Source[Future.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/Future.scala#L207)Linear Supertypes(T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BooleanFunctionBridge
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

1. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#<init>():akka.dispatch.japi.BooleanFunctionBridge[T] "Permalink")  new BooleanFunctionBridge()
### Value Members

1. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BooleanFunctionBridge\[T] toany2stringadd\[BooleanFunctionBridge\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BooleanFunctionBridge\[T], B)ImplicitThis member is added by an implicit conversion from BooleanFunctionBridge\[T] toArrowAssoc\[BooleanFunctionBridge\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#andThen[A](g:R=>A):T1=>A "Permalink")  def andThen\[A](g: ([Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) \=\> A): (T) \=\> ADefinition ClassesFunction1Annotations@unspecialized()
7. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#apply(t:T):Boolean "Permalink") final  def apply(t: T): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBooleanFunctionBridge → Function1
8. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> T): (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesFunction1Annotations@unspecialized()
11. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BooleanFunctionBridge\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BooleanFunctionBridge\[T]ImplicitThis member is added by an implicit conversion from BooleanFunctionBridge\[T] toEnsuring\[BooleanFunctionBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BooleanFunctionBridge\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BooleanFunctionBridge\[T]ImplicitThis member is added by an implicit conversion from BooleanFunctionBridge\[T] toEnsuring\[BooleanFunctionBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BooleanFunctionBridge\[T]ImplicitThis member is added by an implicit conversion from BooleanFunctionBridge\[T] toEnsuring\[BooleanFunctionBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BooleanFunctionBridge\[T]ImplicitThis member is added by an implicit conversion from BooleanFunctionBridge\[T] toEnsuring\[BooleanFunctionBridge\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#internal(result:T):Boolean "Permalink")  def internal(result: T): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected
20. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
26. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BooleanFunctionBridge\[T] toStringFormat\[BooleanFunctionBridge\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/japi$$BooleanFunctionBridge.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BooleanFunctionBridge\[T], B)ImplicitThis member is added by an implicit conversion from BooleanFunctionBridge\[T] toArrowAssoc\[BooleanFunctionBridge\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBooleanFunctionBridge\[T] to any2stringadd\[BooleanFunctionBridge\[T]]

### Inherited by implicit conversion StringFormat fromBooleanFunctionBridge\[T] to StringFormat\[BooleanFunctionBridge\[T]]

### Inherited by implicit conversion Ensuring fromBooleanFunctionBridge\[T] to Ensuring\[BooleanFunctionBridge\[T]]

### Inherited by implicit conversion ArrowAssoc fromBooleanFunctionBridge\[T] to ArrowAssoc\[BooleanFunctionBridge\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$BooleanFunctionBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$CallbackBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$RecoverBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$UnitFunctionBridge.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$BooleanFunctionBridge.html](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/japi$$BooleanFunctionBridge.html)*