---
description: Akka 2.10.17 - akka.japi.function.Function13
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:14:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/function/Function13.html
title: Akka 2.10.17 - akka.japi.function.Function13
---

# Akka 2.10.17 - akka.japi.function.Function13

> **Summary:** Akka 2.10.17 - akka.japi.function.Function13

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/japi/index.html "Permalink")  package [japi](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/japi/function/index.html "Permalink")  package [function](index.html)Definition Classes[japi](../index.html)
- [Creator](Creator.html "A constructor/factory, takes no parameters but creates a new value of type T every call.")
- [Effect](Effect.html "An executable piece of code that takes no parameters and doesn't return any value.")
- [Function](Function.html "A Function interface.")
- [Function10](Function10.html "A Function interface.")
- [Function11](Function11.html "A Function interface.")
- [Function12](Function12.html "A Function interface.")
- Function13
- [Function14](Function14.html "A Function interface.")
- [Function15](Function15.html "A Function interface.")
- [Function16](Function16.html "A Function interface.")
- [Function17](Function17.html "A Function interface.")
- [Function18](Function18.html "A Function interface.")
- [Function19](Function19.html "A Function interface.")
- [Function2](Function2.html "A Function interface.")
- [Function20](Function20.html "A Function interface.")
- [Function21](Function21.html "A Function interface.")
- [Function22](Function22.html "A Function interface.")
- [Function3](Function3.html "A Function interface.")
- [Function4](Function4.html "A Function interface.")
- [Function5](Function5.html "A Function interface.")
- [Function6](Function6.html "A Function interface.")
- [Function7](Function7.html "A Function interface.")
- [Function8](Function8.html "A Function interface.")
- [Function9](Function9.html "A Function interface.")
- [Predicate](Predicate.html "Java API: Defines a criteria and determines whether the parameter meets this criteria.")
- [Procedure](Procedure.html "A Procedure is like a Function, but it doesn't produce a return value.")
- [Procedure10](Procedure10.html "A Consumer interface.")
- [Procedure11](Procedure11.html "A Consumer interface.")
- [Procedure12](Procedure12.html "A Consumer interface.")
- [Procedure13](Procedure13.html "A Consumer interface.")
- [Procedure14](Procedure14.html "A Consumer interface.")
- [Procedure15](Procedure15.html "A Consumer interface.")
- [Procedure16](Procedure16.html "A Consumer interface.")
- [Procedure17](Procedure17.html "A Consumer interface.")
- [Procedure18](Procedure18.html "A Consumer interface.")
- [Procedure19](Procedure19.html "A Consumer interface.")
- [Procedure2](Procedure2.html "A Consumer interface.")
- [Procedure20](Procedure20.html "A Consumer interface.")
- [Procedure21](Procedure21.html "A Consumer interface.")
- [Procedure22](Procedure22.html "A Consumer interface.")
- [Procedure3](Procedure3.html "A Consumer interface.")
- [Procedure4](Procedure4.html "A Consumer interface.")
- [Procedure5](Procedure5.html "A Consumer interface.")
- [Procedure6](Procedure6.html "A Consumer interface.")
- [Procedure7](Procedure7.html "A Consumer interface.")
- [Procedure8](Procedure8.html "A Consumer interface.")
- [Procedure9](Procedure9.html "A Consumer interface.")
t[akka](../../index.html).[japi](../index.html).[function](index.html)

# Function13[**](../../../akka/japi/function/Function13.html "Permalink")

### 

#### trait Function13\[\-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \+R] extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

A Function interface. Used to create 13\-arg first\-class\-functions is Java.
`Serializable` is needed to be able to grab line number for Java 8 lambdas.

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface() Source[Functions.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/target/scala-2.13/src_managed/main/akka/japi/function/Functions.scala#L137)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Function13
2. Serializable
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
### Abstract Value Members

1. [**](../../../akka/japi/function/Function13.html#apply(arg1:T1,arg2:T2,arg3:T3,arg4:T4,arg5:T5,arg6:T6,arg7:T7,arg8:T8,arg9:T9,arg10:T10,arg11:T11,arg12:T12,arg13:T13):R "Permalink") abstract  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, arg7: T7, arg8: T8, arg9: T9, arg10: T10, arg11: T11, arg12: T12, arg13: T13): RAnnotations@throws(classOf\[Exception])
### Concrete Value Members

1. [**](../../../akka/japi/function/Function13.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/japi/function/Function13.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/japi/function/Function13.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] toany2stringadd\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/japi/function/Function13.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R], B)ImplicitThis member is added by an implicit conversion from Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] toArrowAssoc\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/japi/function/Function13.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/japi/function/Function13.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/japi/function/Function13.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/japi/function/Function13.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]ImplicitThis member is added by an implicit conversion from Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] toEnsuring\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/japi/function/Function13.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]ImplicitThis member is added by an implicit conversion from Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] toEnsuring\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/japi/function/Function13.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]ImplicitThis member is added by an implicit conversion from Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] toEnsuring\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/japi/function/Function13.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]ImplicitThis member is added by an implicit conversion from Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] toEnsuring\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/japi/function/Function13.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/japi/function/Function13.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/japi/function/Function13.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/japi/function/Function13.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/japi/function/Function13.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/japi/function/Function13.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/japi/function/Function13.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/japi/function/Function13.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/japi/function/Function13.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/japi/function/Function13.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/japi/function/Function13.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/japi/function/Function13.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/japi/function/Function13.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/japi/function/Function13.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/japi/function/Function13.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] toStringFormat\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/japi/function/Function13.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R], B)ImplicitThis member is added by an implicit conversion from Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] toArrowAssoc\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFunction13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] to any2stringadd\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]]

### Inherited by implicit conversion StringFormat fromFunction13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] to StringFormat\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]]

### Inherited by implicit conversion Ensuring fromFunction13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] to Ensuring\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]]

### Inherited by implicit conversion ArrowAssoc fromFunction13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R] to ArrowAssoc\[Function13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Creator.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function10.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function11.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function12.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function13.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function14.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function15.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function16.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function17.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function18.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function19.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function20.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function21.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function22.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function3.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function4.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function5.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function6.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function7.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function8.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function9.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Predicate.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure10.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure11.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure12.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure13.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure14.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure15.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure16.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure17.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure18.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure19.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure2.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure20.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure21.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure22.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure3.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure4.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure5.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure6.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure7.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure8.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure9.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function13.html](https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function13.html)*