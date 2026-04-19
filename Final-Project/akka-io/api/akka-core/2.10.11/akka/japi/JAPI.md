---
description: Akka 2.10.11 - akka.japi.JAPI
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:58:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/JAPI.html
title: Akka 2.10.11 - akka.japi.JAPI
---

# Akka 2.10.11 - akka.japi.JAPI

> **Summary:** Akka 2.10.11 - akka.japi.JAPI

## Content

Akka2\.10\.11 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/function/index.html "Permalink")  package [function](function/index.html)Definition Classes[japi](index.html)
- [**](../../akka/japi/pf/index.html "Permalink")  package [pf](pf/index.html)Definition Classes[japi](index.html)
- [**](../../akka/japi/tuple/index.html "Permalink")  package [tuple](tuple/index.html)Definition Classes[japi](index.html)
- [Creator](Creator.html "A constructor/factory, takes no parameters but creates a new value of type T every call.")
- [Effect](Effect.html "An executable piece of code that takes no parameters and doesn't return any value.")
- [Function](Function.html "A Function interface.")
- [Function2](Function2.html "A Function interface.")
- JAPI
- [JavaPartialFunction](JavaPartialFunction.html "Helper for implementing a *pure* partial function: it will possibly be invoked multiple times for a single “application”, because its only abstract method is used for both isDefinedAt() and apply(); the former is mapped to isCheck == true and the latter to isCheck == false for those cases where this is important to know.")
- [Option](Option.html "This class represents optional values.")
- [Pair](Pair.html "Java API Represents a pair (tuple) of two elements.")
- [Predicate](Predicate.html "Java API: Defines a criteria and determines whether the parameter meets this criteria.")
- [Procedure](Procedure.html "A Procedure is like a Function, but it doesn't produce a return value.")
- [Throwables](Throwables$.html "Helper class for determining whether a Throwable is fatal or not.")
- [Util](Util$.html "This class hold common utilities for Java")
c[akka](../index.html).[japi](index.html)

# JAPI[**](../../akka/japi/JAPI.html "Permalink")

### 

#### class JAPI extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[JAPI.java](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/java/akka/japi/JAPI.java#L9)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JAPI
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
### Instance Constructors

1. [**](../../akka/japi/JAPI.html#<init>():akka.japi.JAPI "Permalink")  new JAPI()
### Value Members

1. [**](../../akka/japi/JAPI.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/japi/JAPI.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/japi/JAPI.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from JAPI toany2stringadd\[JAPI] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/japi/JAPI.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (JAPI, B)ImplicitThis member is added by an implicit conversion from JAPI toArrowAssoc\[JAPI] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/japi/JAPI.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/japi/JAPI.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/japi/JAPI.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/japi/JAPI.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (JAPI) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JAPIImplicitThis member is added by an implicit conversion from JAPI toEnsuring\[JAPI] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/japi/JAPI.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (JAPI) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JAPIImplicitThis member is added by an implicit conversion from JAPI toEnsuring\[JAPI] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/japi/JAPI.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JAPIImplicitThis member is added by an implicit conversion from JAPI toEnsuring\[JAPI] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/japi/JAPI.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JAPIImplicitThis member is added by an implicit conversion from JAPI toEnsuring\[JAPI] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/japi/JAPI.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/japi/JAPI.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/japi/JAPI.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/japi/JAPI.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/japi/JAPI.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/japi/JAPI.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/japi/JAPI.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/japi/JAPI.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/japi/JAPI.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/japi/JAPI.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/japi/JAPI.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/japi/JAPI.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/japi/JAPI.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/japi/JAPI.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/japi/JAPI.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from JAPI toStringFormat\[JAPI] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/japi/JAPI.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (JAPI, B)ImplicitThis member is added by an implicit conversion from JAPI toArrowAssoc\[JAPI] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromJAPI to any2stringadd\[JAPI]

### Inherited by implicit conversion StringFormat fromJAPI to StringFormat\[JAPI]

### Inherited by implicit conversion Ensuring fromJAPI to Ensuring\[JAPI]

### Inherited by implicit conversion ArrowAssoc fromJAPI to ArrowAssoc\[JAPI]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Creator.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Effect.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function2.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/JAPI.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/JavaPartialFunction$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/JavaPartialFunction.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Option$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Option.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Predicate.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Procedure.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Throwables$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Util$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/pf/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/tuple/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/japi/JAPI.html](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/JAPI.html)*