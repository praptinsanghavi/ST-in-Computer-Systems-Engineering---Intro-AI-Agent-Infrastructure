---
description: Akka 2.10.11 - akka.japi.JavaPartialFunction
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:58:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/JavaPartialFunction.html
title: Akka 2.10.11 - akka.japi.JavaPartialFunction
---

# Akka 2.10.11 - akka.japi.JavaPartialFunction

> **Summary:** Akka 2.10.11 - akka.japi.JavaPartialFunction

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
- [JAPI](JAPI.html)
- JavaPartialFunction
- [Option](Option.html "This class represents optional values.")
- [Pair](Pair.html "Java API Represents a pair (tuple) of two elements.")
- [Predicate](Predicate.html "Java API: Defines a criteria and determines whether the parameter meets this criteria.")
- [Procedure](Procedure.html "A Procedure is like a Function, but it doesn't produce a return value.")
- [Throwables](Throwables$.html "Helper class for determining whether a Throwable is fatal or not.")
- [Util](Util$.html "This class hold common utilities for Java")
[c](JavaPartialFunction$.html "See companion object")[akka](../index.html).[japi](index.html)

# [JavaPartialFunction](JavaPartialFunction$.html "See companion object")[**](../../akka/japi/JavaPartialFunction.html "Permalink")

### Companion [object JavaPartialFunction](JavaPartialFunction$.html "See companion object")

#### abstract  class JavaPartialFunction\[A, B] extends [AbstractPartialFunction](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractPartialFunction.html#scala.runtime.AbstractPartialFunction)\[A, B]

Helper for implementing a \*pure\* partial function: it will possibly be
invoked multiple times for a single “application”, because its only abstract
method is used for both isDefinedAt() and apply(); the former is mapped to
`isCheck == true` and the latter to `isCheck == false` for those cases where
this is important to know.

Failure to match is signaled by throwing `noMatch()`, i.e. not returning
normally (the exception used in this case is pre\-allocated, hence not
*that* expensive).

```
new JavaPartialFunction<Object, String>() {
  public String apply(Object in, boolean isCheck) {
    if (in instanceof TheThing) {
      if (isCheck) return null; // to spare the expensive or side-effecting code
      return doSomethingWithTheThing((TheThing) in);
    } else {
      throw noMatch();
    }
  }
}
```
The typical use of partial functions from Akka looks like the following:

```
if (pf.isDefinedAt(x)) {
  pf.apply(x);
}
```
i.e. it will first call `JavaPartialFunction.apply(x, true)` and if that
does not throw `noMatch()` it will continue with calling
`JavaPartialFunction.apply(x, false)`.

Source[JavaAPI.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/japi/JavaAPI.scala#L145)Linear Supertypes[AbstractPartialFunction](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractPartialFunction.html#scala.runtime.AbstractPartialFunction)\[A, B], [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A, B], (A) \=\> B, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JavaPartialFunction
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

1. [**](../../akka/japi/JavaPartialFunction.html#<init>():akka.japi.JavaPartialFunction[A,B] "Permalink")  new JavaPartialFunction()
### Abstract Value Members

1. [**](../../akka/japi/JavaPartialFunction.html#apply(x:A,isCheck:Boolean):B "Permalink") abstract  def apply(x: A, isCheck: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BAnnotations@throws(classOf\[Exception])
### Concrete Value Members

1. [**](../../akka/japi/JavaPartialFunction.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/japi/JavaPartialFunction.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/japi/JavaPartialFunction.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from JavaPartialFunction\[A, B] toany2stringadd\[JavaPartialFunction\[A, B]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/japi/JavaPartialFunction.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (JavaPartialFunction\[A, B], B)ImplicitThis member is added by an implicit conversion from JavaPartialFunction\[A, B] toArrowAssoc\[JavaPartialFunction\[A, B]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if B is a subclass of scala.Option\[Nothing] (B \<: [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]).Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/japi/JavaPartialFunction.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/japi/JavaPartialFunction.html#andThen[C](k:PartialFunction[B,C]):PartialFunction[A,C] "Permalink")  def andThen\[C](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[B, C]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A, C]Definition ClassesPartialFunction
7. [**](../../akka/japi/JavaPartialFunction.html#andThen[C](k:B=>C):PartialFunction[A,C] "Permalink")  def andThen\[C](k: (B) \=\> C): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A, C]Definition ClassesPartialFunction → Function1
8. [**](../../akka/japi/JavaPartialFunction.html#apply(x:A):B "Permalink") final  def apply(x: A): BDefinition ClassesJavaPartialFunction → AbstractPartialFunction → Function1
9. [**](../../akka/japi/JavaPartialFunction.html#applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1 "Permalink") final  def applyOrElse\[A1 \<: A, B1 \>: B](x: A1, default: (A1) \=\> B1): B1Definition ClassesJavaPartialFunction → PartialFunction
10. [**](../../akka/japi/JavaPartialFunction.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../akka/japi/JavaPartialFunction.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/japi/JavaPartialFunction.html#compose[R](k:PartialFunction[R,A]):PartialFunction[R,B] "Permalink")  def compose\[R](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, A]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, B]Definition ClassesPartialFunction
13. [**](../../akka/japi/JavaPartialFunction.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> A): (A) \=\> BDefinition ClassesFunction1Annotations@unspecialized()
14. [**](../../akka/japi/JavaPartialFunction.html#elementWise:PartialFunction.ElementWiseExtractor[A,B] "Permalink")  def elementWise: ElementWiseExtractor\[A, B]Definition ClassesPartialFunction
15. [**](../../akka/japi/JavaPartialFunction.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (JavaPartialFunction\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JavaPartialFunction\[A, B]ImplicitThis member is added by an implicit conversion from JavaPartialFunction\[A, B] toEnsuring\[JavaPartialFunction\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/japi/JavaPartialFunction.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (JavaPartialFunction\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JavaPartialFunction\[A, B]ImplicitThis member is added by an implicit conversion from JavaPartialFunction\[A, B] toEnsuring\[JavaPartialFunction\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/japi/JavaPartialFunction.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JavaPartialFunction\[A, B]ImplicitThis member is added by an implicit conversion from JavaPartialFunction\[A, B] toEnsuring\[JavaPartialFunction\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/japi/JavaPartialFunction.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JavaPartialFunction\[A, B]ImplicitThis member is added by an implicit conversion from JavaPartialFunction\[A, B] toEnsuring\[JavaPartialFunction\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/japi/JavaPartialFunction.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/japi/JavaPartialFunction.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../akka/japi/JavaPartialFunction.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/japi/JavaPartialFunction.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/japi/JavaPartialFunction.html#isDefinedAt(x:A):Boolean "Permalink") final  def isDefinedAt(x: A): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesJavaPartialFunction → PartialFunction
24. [**](../../akka/japi/JavaPartialFunction.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/japi/JavaPartialFunction.html#lift:A=>Option[B] "Permalink")  def lift: (A) \=\> [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesPartialFunction
26. [**](../../akka/japi/JavaPartialFunction.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../akka/japi/JavaPartialFunction.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/japi/JavaPartialFunction.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../akka/japi/JavaPartialFunction.html#orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1] "Permalink")  def orElse\[A1 \<: A, B1 \>: B](that: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]Definition ClassesPartialFunction
30. [**](../../akka/japi/JavaPartialFunction.html#runWith[U](action:B=>U):A=>Boolean "Permalink")  def runWith\[U](action: (B) \=\> U): (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPartialFunction
31. [**](../../akka/japi/JavaPartialFunction.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../akka/japi/JavaPartialFunction.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
33. [**](../../akka/japi/JavaPartialFunction.html#unapply(a:A):Option[B] "Permalink")  def unapply(a: A): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesPartialFunction
34. [**](../../akka/japi/JavaPartialFunction.html#unlift:PartialFunction[A,B] "Permalink")  def unlift: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A, B]ImplicitThis member is added by an implicit conversion from JavaPartialFunction\[A, B] toUnliftOps\[A, B] performed by method UnliftOps in scala.Function1\.This conversion will take place only if B is a subclass of scala.Option\[B] (B \<: [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]).Definition ClassesUnliftOps
35. [**](../../akka/japi/JavaPartialFunction.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../akka/japi/JavaPartialFunction.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../akka/japi/JavaPartialFunction.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/japi/JavaPartialFunction.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/japi/JavaPartialFunction.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from JavaPartialFunction\[A, B] toStringFormat\[JavaPartialFunction\[A, B]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/japi/JavaPartialFunction.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (JavaPartialFunction\[A, B], B)ImplicitThis member is added by an implicit conversion from JavaPartialFunction\[A, B] toArrowAssoc\[JavaPartialFunction\[A, B]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if B is a subclass of scala.Option\[Nothing] (B \<: [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]).Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AbstractPartialFunction](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractPartialFunction.html#scala.runtime.AbstractPartialFunction)\[A, B]

### Inherited from [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A, B]

### Inherited from (A) \=\> B

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion UnliftOps fromJavaPartialFunction\[A, B] to UnliftOps\[A, B]

### Inherited by implicit conversion any2stringadd fromJavaPartialFunction\[A, B] to any2stringadd\[JavaPartialFunction\[A, B]]

### Inherited by implicit conversion StringFormat fromJavaPartialFunction\[A, B] to StringFormat\[JavaPartialFunction\[A, B]]

### Inherited by implicit conversion Ensuring fromJavaPartialFunction\[A, B] to Ensuring\[JavaPartialFunction\[A, B]]

### Inherited by implicit conversion ArrowAssoc fromJavaPartialFunction\[A, B] to ArrowAssoc\[JavaPartialFunction\[A, B]]

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
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/japi/JavaPartialFunction.html](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/JavaPartialFunction.html)*