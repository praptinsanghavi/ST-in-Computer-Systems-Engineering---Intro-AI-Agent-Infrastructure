---
description: Akka 2.10.17 - akka.japi.Option
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:04:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/Option.html
title: Akka 2.10.17 - akka.japi.Option
---

# Akka 2.10.17 - akka.japi.Option

> **Summary:** Akka 2.10.17 - akka.japi.Option

## Content

Akka2\.10\.17 \< Back****# Packages

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
- [JavaPartialFunction](JavaPartialFunction.html "Helper for implementing a *pure* partial function: it will possibly be invoked multiple times for a single “application”, because its only abstract method is used for both isDefinedAt() and apply(); the former is mapped to isCheck == true and the latter to isCheck == false for those cases where this is important to know.")
- Option
- [Pair](Pair.html "Java API Represents a pair (tuple) of two elements.")
- [Predicate](Predicate.html "Java API: Defines a criteria and determines whether the parameter meets this criteria.")
- [Procedure](Procedure.html "A Procedure is like a Function, but it doesn't produce a return value.")
- [Throwables](Throwables$.html "Helper class for determining whether a Throwable is fatal or not.")
- [Util](Util$.html "This class hold common utilities for Java")
[c](Option$.html "See companion object")[akka](../index.html).[japi](index.html)

# [Option](Option$.html "See companion object")[**](../../akka/japi/Option.html "Permalink")

### Companion [object Option](Option$.html "See companion object")

#### sealed abstract  class Option\[A] extends [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[A]

This class represents optional values. Instances of `Option`
are either instances of case class `Some` or it is case
object `None`.

Source[JavaAPI.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/japi/JavaAPI.scala#L168)Linear Supertypes[Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[A], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Some](Option$$Some.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Option
2. Iterable
3. AnyRef
4. Any
Implicitly  
1. by java2ScalaOption
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../akka/japi/Option.html#asScala:Option[A] "Permalink") abstract  def asScala: [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]
2. [**](../../akka/japi/Option.html#get:A "Permalink") abstract  def get: A
3. [**](../../akka/japi/Option.html#getOrElse[B>:A](defaultValue:B):B "Permalink") abstract  def getOrElse\[B \>: A](defaultValue: B): BReturns `a` if this is `some(a)` or `defaultValue` if
this is `none`.
4. [**](../../akka/japi/Option.html#isEmpty:Boolean "Permalink") abstract  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
### Concrete Value Members

1. [**](../../akka/japi/Option.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/japi/Option.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/japi/Option.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Option\[A] toany2stringadd\[Option\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/japi/Option.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Option\[A], B)ImplicitThis member is added by an implicit conversion from Option\[A] toArrowAssoc\[Option\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/japi/Option.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/japi/Option.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/japi/Option.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesEquals
8. [**](../../akka/japi/Option.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/japi/Option.html#collect[B](pf:PartialFunction[A,B]):Option[B] "Permalink") final  def collect\[B](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A, B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
10. [**](../../akka/japi/Option.html#contains[A1>:A](elem:A1):Boolean "Permalink") final  def contains\[A1 \>: A](elem: A1): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption
11. [**](../../akka/japi/Option.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Option\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Option\[A]ImplicitThis member is added by an implicit conversion from Option\[A] toEnsuring\[Option\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/japi/Option.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Option\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Option\[A]ImplicitThis member is added by an implicit conversion from Option\[A] toEnsuring\[Option\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/japi/Option.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Option\[A]ImplicitThis member is added by an implicit conversion from Option\[A] toEnsuring\[Option\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/japi/Option.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Option\[A]ImplicitThis member is added by an implicit conversion from Option\[A] toEnsuring\[Option\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/japi/Option.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/japi/Option.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../akka/japi/Option.html#exists(p:A=>Boolean):Boolean "Permalink") final  def exists(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
18. [**](../../akka/japi/Option.html#filter(p:A=>Boolean):Option[A] "Permalink") final  def filter(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
19. [**](../../akka/japi/Option.html#filterNot(p:A=>Boolean):Option[A] "Permalink") final  def filterNot(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
20. [**](../../akka/japi/Option.html#flatMap[B](f:A=>Option[B]):Option[B] "Permalink") final  def flatMap\[B](f: (A) \=\> [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
21. [**](../../akka/japi/Option.html#flatten[B](implicitev:A<:<Option[B]):Option[B] "Permalink")  def flatten\[B](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[A, [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption
22. [**](../../akka/japi/Option.html#fold[B](ifEmpty:=>B)(f:A=>B):B "Permalink") final  def fold\[B](ifEmpty: \=\> B)(f: (A) \=\> B): BImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
23. [**](../../akka/japi/Option.html#forEach(x$1:java.util.function.Consumer[_>:T]):Unit "Permalink")  def forEach(arg0: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[\_ \>: A \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesIterable
24. [**](../../akka/japi/Option.html#forall(p:A=>Boolean):Boolean "Permalink") final  def forall(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
25. [**](../../akka/japi/Option.html#foreach[U](f:A=>U):Unit "Permalink") final  def foreach\[U](f: (A) \=\> U): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
26. [**](../../akka/japi/Option.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/japi/Option.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/japi/Option.html#isDefined:Boolean "Permalink")  def isDefined: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
29. [**](../../akka/japi/Option.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
30. [**](../../akka/japi/Option.html#iterator():java.util.Iterator[A] "Permalink")  def iterator(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[A]Definition ClassesOption → Iterable
31. [**](../../akka/japi/Option.html#knownSize:Int "Permalink") final  def knownSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption → IterableOnce
32. [**](../../akka/japi/Option.html#map[B](f:A=>B):Option[B] "Permalink") final  def map\[B](f: (A) \=\> B): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
33. [**](../../akka/japi/Option.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
34. [**](../../akka/japi/Option.html#nonEmpty:Boolean "Permalink") final  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption
35. [**](../../akka/japi/Option.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../akka/japi/Option.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../akka/japi/Option.html#orElse[B>:A](alternative:=>Option[B]):Option[B] "Permalink") final  def orElse\[B \>: A](alternative: \=\> [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
38. [**](../../akka/japi/Option.html#orNull[A1>:A](implicitev:Null<:<A1):A1 "Permalink") final  def orNull\[A1 \>: A](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[Null, A1]): A1ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
39. [**](../../akka/japi/Option.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesProduct
40. [**](../../akka/japi/Option.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesProduct
41. [**](../../akka/japi/Option.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesProduct
42. [**](../../akka/japi/Option.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesProduct
43. [**](../../akka/japi/Option.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesProduct
44. [**](../../akka/japi/Option.html#productPrefix:String "Permalink")  def productPrefix: StringImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesProduct
45. [**](../../akka/japi/Option.html#spliterator():java.util.Spliterator[T] "Permalink")  def spliterator(): [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[A]Definition ClassesIterable
46. [**](../../akka/japi/Option.html#stepper[S<:scala.collection.Stepper[_]](implicitshape:scala.collection.StepperShape[A,S]):S "Permalink")  def stepper\[S \<: [Stepper](https://www.scala-lang.org/api/2.13.17/scala/collection/Stepper.html#scala.collection.Stepper)\[\_]](implicit shape: StepperShape\[A, S]): SImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesIterableOnce
47. [**](../../akka/japi/Option.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
48. [**](../../akka/japi/Option.html#toLeft[X](right:=>X):Either[A,X] "Permalink") final  def toLeft\[X](right: \=\> X): Either\[A, X]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
49. [**](../../akka/japi/Option.html#toList:List[A] "Permalink")  def toList: List\[A]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption
50. [**](../../akka/japi/Option.html#toRight[X](left:=>X):Either[X,A] "Permalink") final  def toRight\[X](left: \=\> X): Either\[X, A]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
51. [**](../../akka/japi/Option.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
52. [**](../../akka/japi/Option.html#unzip[A1,A2](implicitasPair:A<:<(A1,A2)):(Option[A1],Option[A2]) "Permalink") final  def unzip\[A1, A2](implicit asPair: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[A, (A1, A2)]): ([scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A1], [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A2])ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption
53. [**](../../akka/japi/Option.html#unzip3[A1,A2,A3](implicitasTriple:A<:<(A1,A2,A3)):(Option[A1],Option[A2],Option[A3]) "Permalink") final  def unzip3\[A1, A2, A3](implicit asTriple: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[A, (A1, A2, A3)]): ([scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A1], [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A2], [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A3])ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption
54. [**](../../akka/japi/Option.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
55. [**](../../akka/japi/Option.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
56. [**](../../akka/japi/Option.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
57. [**](../../akka/japi/Option.html#withFilter(p:A=>Boolean):Option.this.WithFilter "Permalink") final  def withFilter(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WithFilterImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
58. [**](../../akka/japi/Option.html#zip[A1>:A,B](that:Option[B]):Option[(A1,B)] "Permalink") final  def zip\[A1 \>: A, B](that: [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(A1, B)]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption
### Shadowed Implicit Value Members

1. [**](../../akka/japi/Option.html#get:A "Permalink")  def get: AImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(option: scala.Option[A]).get
```
Definition ClassesOption
2. [**](../../akka/japi/Option.html#getOrElse[B>:A](default:=>B):B "Permalink") final  def getOrElse\[B \>: A](default: \=\> B): BImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(option: scala.Option[A]).getOrElse(default)
```
Definition ClassesOptionAnnotations@inline()
3. [**](../../akka/japi/Option.html#isDefined:Boolean "Permalink") final  def isDefined: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(option: scala.Option[A]).isDefined
```
Definition ClassesOption
4. [**](../../akka/japi/Option.html#isEmpty:Boolean "Permalink") final  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(option: scala.Option[A]).isEmpty
```
Definition ClassesOption
5. [**](../../akka/japi/Option.html#iterator:Iterator[A] "Permalink")  def iterator: Iterator\[A]ImplicitThis member is added by an implicit conversion from Option\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(option: scala.Option[A]).iterator
```
Definition ClassesOption → IterableOnce
### Deprecated Value Members

1. [**](../../akka/japi/Option.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/japi/Option.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Option\[A] toStringFormat\[Option\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/japi/Option.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Option\[A], B)ImplicitThis member is added by an implicit conversion from Option\[A] toArrowAssoc\[Option\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[A]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion java2ScalaOption fromOption\[A] to [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]

### Inherited by implicit conversion any2stringadd fromOption\[A] to any2stringadd\[Option\[A]]

### Inherited by implicit conversion StringFormat fromOption\[A] to StringFormat\[Option\[A]]

### Inherited by implicit conversion Ensuring fromOption\[A] to Ensuring\[Option\[A]]

### Inherited by implicit conversion ArrowAssoc fromOption\[A] to ArrowAssoc\[Option\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Creator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Effect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Function.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Function2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/JAPI.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/JavaPartialFunction$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/JavaPartialFunction.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Option$$Some.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Option$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Option.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Pair$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Pair.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Predicate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Procedure.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Throwables$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Util$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/tuple/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Option.html](https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Option.html)*