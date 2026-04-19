---
description: Akka 2.10.17 - akka.japi.Option.Some
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:16:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/Option$$Some.html
title: Akka 2.10.17 - akka.japi.Option.Some
---

# Akka 2.10.17 - akka.japi.Option.Some

> **Summary:** Akka 2.10.17 - akka.japi.Option.Some

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/Option$.html "Permalink")  object [Option](Option$.html)Definition Classes[japi](index.html)
- Some
c[akka](../index.html).[japi](index.html).[Option](Option$.html)

# Some[**](../../akka/japi/Option$$Some.html "Permalink")

### 

#### final  case class Some\[A](v: A) extends [Option](Option.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Class `Some[A]` represents existing values of type
`A`.

Source[JavaAPI.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/japi/JavaAPI.scala#L212)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Option](Option.html)\[A], [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[A], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Some
2. Serializable
3. Product
4. Equals
5. Option
6. Iterable
7. AnyRef
8. Any
Implicitly  
1. by java2ScalaOption
2. by java2ScalaOption
3. by any2stringadd
4. by StringFormat
5. by Ensuring
6. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/japi/Option$$Some.html#<init>(v:A):akka.japi.Option.Some[A] "Permalink")  new Some(v: A)
### Value Members

1. [**](../../akka/japi/Option$$Some.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/japi/Option$$Some.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/japi/Option$$Some.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Some\[A] toany2stringadd\[Some\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/japi/Option$$Some.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Some\[A], B)ImplicitThis member is added by an implicit conversion from Some\[A] toArrowAssoc\[Some\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/japi/Option$$Some.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/japi/Option$$Some.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/japi/Option$$Some.html#asScala:Some[A] "Permalink")  def asScala: [scala.Some](https://www.scala-lang.org/api/2.13.17/scala/Some.html#scala.Some)\[A]Definition ClassesSome → [Option](Option.html)
8. [**](../../akka/japi/Option$$Some.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/japi/Option$$Some.html#contains[A1>:A](elem:A1):Boolean "Permalink") final  def contains\[A1 \>: A](elem: A1): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption
10. [**](../../akka/japi/Option$$Some.html#contains[A1>:A](elem:A1):Boolean "Permalink") final  def contains\[A1 \>: A](elem: A1): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption
11. [**](../../akka/japi/Option$$Some.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Some\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Some\[A]ImplicitThis member is added by an implicit conversion from Some\[A] toEnsuring\[Some\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/japi/Option$$Some.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Some\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Some\[A]ImplicitThis member is added by an implicit conversion from Some\[A] toEnsuring\[Some\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/japi/Option$$Some.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Some\[A]ImplicitThis member is added by an implicit conversion from Some\[A] toEnsuring\[Some\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/japi/Option$$Some.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Some\[A]ImplicitThis member is added by an implicit conversion from Some\[A] toEnsuring\[Some\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/japi/Option$$Some.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/japi/Option$$Some.html#forEach(x$1:java.util.function.Consumer[_>:T]):Unit "Permalink")  def forEach(arg0: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[\_ \>: A \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesIterable
17. [**](../../akka/japi/Option$$Some.html#get:A "Permalink")  def get: ADefinition ClassesSome → [Option](Option.html)
18. [**](../../akka/japi/Option$$Some.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/japi/Option$$Some.html#getOrElse[B>:A](defaultValue:B):B "Permalink")  def getOrElse\[B \>: A](defaultValue: B): BReturns `a` if this is `some(a)` or `defaultValue` if
this is `none`.

Returns `a` if this is `some(a)` or `defaultValue` if
this is `none`.

Definition ClassesSome → [Option](Option.html)
20. [**](../../akka/japi/Option$$Some.html#isDefined:Boolean "Permalink")  def isDefined: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Option](Option.html)
21. [**](../../akka/japi/Option$$Some.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSome → [Option](Option.html)
22. [**](../../akka/japi/Option$$Some.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../akka/japi/Option$$Some.html#iterator():java.util.Iterator[A] "Permalink")  def iterator(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[A]Definition Classes[Option](Option.html) → Iterable
24. [**](../../akka/japi/Option$$Some.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../akka/japi/Option$$Some.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/japi/Option$$Some.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/japi/Option$$Some.html#orElse[B>:A](alternative:=>Option[B]):Option[B] "Permalink") final  def orElse\[B \>: A](alternative: \=\> [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
28. [**](../../akka/japi/Option$$Some.html#orElse[B>:A](alternative:=>Option[B]):Option[B] "Permalink") final  def orElse\[B \>: A](alternative: \=\> [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
29. [**](../../akka/japi/Option$$Some.html#orNull[A1>:A](implicitev:Null<:<A1):A1 "Permalink") final  def orNull\[A1 \>: A](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[Null, A1]): A1ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
30. [**](../../akka/japi/Option$$Some.html#orNull[A1>:A](implicitev:Null<:<A1):A1 "Permalink") final  def orNull\[A1 \>: A](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[Null, A1]): A1ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOptionAnnotations@inline()
31. [**](../../akka/japi/Option$$Some.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
32. [**](../../akka/japi/Option$$Some.html#spliterator():java.util.Spliterator[T] "Permalink")  def spliterator(): [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[A]Definition ClassesIterable
33. [**](../../akka/japi/Option$$Some.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../akka/japi/Option$$Some.html#v:A "Permalink")  val v: A
35. [**](../../akka/japi/Option$$Some.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../akka/japi/Option$$Some.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../akka/japi/Option$$Some.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../akka/japi/Option$$Some.html#zip[A1>:A,B](that:Option[B]):Option[(A1,B)] "Permalink") final  def zip\[A1 \>: A, B](that: [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(A1, B)]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption
39. [**](../../akka/japi/Option$$Some.html#zip[A1>:A,B](that:Option[B]):Option[(A1,B)] "Permalink") final  def zip\[A1 \>: A, B](that: [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(A1, B)]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).Definition ClassesOption
### Shadowed Implicit Value Members

1. [**](../../akka/japi/Option$$Some.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).canEqual(that)
```
Definition ClassesEquals
2. [**](../../akka/japi/Option$$Some.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).canEqual(that)
```
Definition ClassesEquals
3. [**](../../akka/japi/Option$$Some.html#collect[B](pf:PartialFunction[A,B]):Option[B] "Permalink") final  def collect\[B](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A, B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).collect(pf)
```
Definition ClassesOptionAnnotations@inline()
4. [**](../../akka/japi/Option$$Some.html#collect[B](pf:PartialFunction[A,B]):Option[B] "Permalink") final  def collect\[B](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A, B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).collect(pf)
```
Definition ClassesOptionAnnotations@inline()
5. [**](../../akka/japi/Option$$Some.html#exists(p:A=>Boolean):Boolean "Permalink") final  def exists(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).exists(p)
```
Definition ClassesOptionAnnotations@inline()
6. [**](../../akka/japi/Option$$Some.html#exists(p:A=>Boolean):Boolean "Permalink") final  def exists(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).exists(p)
```
Definition ClassesOptionAnnotations@inline()
7. [**](../../akka/japi/Option$$Some.html#filter(p:A=>Boolean):Option[A] "Permalink") final  def filter(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).filter(p)
```
Definition ClassesOptionAnnotations@inline()
8. [**](../../akka/japi/Option$$Some.html#filter(p:A=>Boolean):Option[A] "Permalink") final  def filter(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).filter(p)
```
Definition ClassesOptionAnnotations@inline()
9. [**](../../akka/japi/Option$$Some.html#filterNot(p:A=>Boolean):Option[A] "Permalink") final  def filterNot(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).filterNot(p)
```
Definition ClassesOptionAnnotations@inline()
10. [**](../../akka/japi/Option$$Some.html#filterNot(p:A=>Boolean):Option[A] "Permalink") final  def filterNot(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).filterNot(p)
```
Definition ClassesOptionAnnotations@inline()
11. [**](../../akka/japi/Option$$Some.html#flatMap[B](f:A=>Option[B]):Option[B] "Permalink") final  def flatMap\[B](f: (A) \=\> [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).flatMap(f)
```
Definition ClassesOptionAnnotations@inline()
12. [**](../../akka/japi/Option$$Some.html#flatMap[B](f:A=>Option[B]):Option[B] "Permalink") final  def flatMap\[B](f: (A) \=\> [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).flatMap(f)
```
Definition ClassesOptionAnnotations@inline()
13. [**](../../akka/japi/Option$$Some.html#flatten[B](implicitev:A<:<Option[B]):Option[B] "Permalink")  def flatten\[B](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[A, [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).flatten(ev)
```
Definition ClassesOption
14. [**](../../akka/japi/Option$$Some.html#flatten[B](implicitev:A<:<Option[B]):Option[B] "Permalink")  def flatten\[B](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[A, [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).flatten(ev)
```
Definition ClassesOption
15. [**](../../akka/japi/Option$$Some.html#fold[B](ifEmpty:=>B)(f:A=>B):B "Permalink") final  def fold\[B](ifEmpty: \=\> B)(f: (A) \=\> B): BImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).fold(ifEmpty)(f)
```
Definition ClassesOptionAnnotations@inline()
16. [**](../../akka/japi/Option$$Some.html#fold[B](ifEmpty:=>B)(f:A=>B):B "Permalink") final  def fold\[B](ifEmpty: \=\> B)(f: (A) \=\> B): BImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).fold(ifEmpty)(f)
```
Definition ClassesOptionAnnotations@inline()
17. [**](../../akka/japi/Option$$Some.html#forall(p:A=>Boolean):Boolean "Permalink") final  def forall(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).forall(p)
```
Definition ClassesOptionAnnotations@inline()
18. [**](../../akka/japi/Option$$Some.html#forall(p:A=>Boolean):Boolean "Permalink") final  def forall(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).forall(p)
```
Definition ClassesOptionAnnotations@inline()
19. [**](../../akka/japi/Option$$Some.html#foreach[U](f:A=>U):Unit "Permalink") final  def foreach\[U](f: (A) \=\> U): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).foreach(f)
```
Definition ClassesOptionAnnotations@inline()
20. [**](../../akka/japi/Option$$Some.html#foreach[U](f:A=>U):Unit "Permalink") final  def foreach\[U](f: (A) \=\> U): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).foreach(f)
```
Definition ClassesOptionAnnotations@inline()
21. [**](../../akka/japi/Option$$Some.html#get:A "Permalink")  def get: AImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).get
```
Definition ClassesOption
22. [**](../../akka/japi/Option$$Some.html#get:A "Permalink")  def get: AImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).get
```
Definition ClassesOption
23. [**](../../akka/japi/Option$$Some.html#getOrElse[B>:A](default:=>B):B "Permalink") final  def getOrElse\[B \>: A](default: \=\> B): BImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).getOrElse(default)
```
Definition ClassesOptionAnnotations@inline()
24. [**](../../akka/japi/Option$$Some.html#getOrElse[B>:A](default:=>B):B "Permalink") final  def getOrElse\[B \>: A](default: \=\> B): BImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).getOrElse(default)
```
Definition ClassesOptionAnnotations@inline()
25. [**](../../akka/japi/Option$$Some.html#isDefined:Boolean "Permalink") final  def isDefined: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).isDefined
```
Definition ClassesOption
26. [**](../../akka/japi/Option$$Some.html#isDefined:Boolean "Permalink") final  def isDefined: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).isDefined
```
Definition ClassesOption
27. [**](../../akka/japi/Option$$Some.html#isEmpty:Boolean "Permalink") final  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).isEmpty
```
Definition ClassesOption
28. [**](../../akka/japi/Option$$Some.html#isEmpty:Boolean "Permalink") final  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).isEmpty
```
Definition ClassesOption
29. [**](../../akka/japi/Option$$Some.html#iterator:Iterator[A] "Permalink")  def iterator: Iterator\[A]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).iterator
```
Definition ClassesOption → IterableOnce
30. [**](../../akka/japi/Option$$Some.html#iterator:Iterator[A] "Permalink")  def iterator: Iterator\[A]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).iterator
```
Definition ClassesOption → IterableOnce
31. [**](../../akka/japi/Option$$Some.html#knownSize:Int "Permalink") final  def knownSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).knownSize
```
Definition ClassesOption → IterableOnce
32. [**](../../akka/japi/Option$$Some.html#knownSize:Int "Permalink") final  def knownSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).knownSize
```
Definition ClassesOption → IterableOnce
33. [**](../../akka/japi/Option$$Some.html#map[B](f:A=>B):Option[B] "Permalink") final  def map\[B](f: (A) \=\> B): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).map(f)
```
Definition ClassesOptionAnnotations@inline()
34. [**](../../akka/japi/Option$$Some.html#map[B](f:A=>B):Option[B] "Permalink") final  def map\[B](f: (A) \=\> B): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).map(f)
```
Definition ClassesOptionAnnotations@inline()
35. [**](../../akka/japi/Option$$Some.html#nonEmpty:Boolean "Permalink") final  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).nonEmpty
```
Definition ClassesOption
36. [**](../../akka/japi/Option$$Some.html#nonEmpty:Boolean "Permalink") final  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).nonEmpty
```
Definition ClassesOption
37. [**](../../akka/japi/Option$$Some.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productArity
```
Definition ClassesProduct
38. [**](../../akka/japi/Option$$Some.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productArity
```
Definition ClassesProduct
39. [**](../../akka/japi/Option$$Some.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productElement(n)
```
Definition ClassesProduct
40. [**](../../akka/japi/Option$$Some.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productElement(n)
```
Definition ClassesProduct
41. [**](../../akka/japi/Option$$Some.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productElementName(n)
```
Definition ClassesProduct
42. [**](../../akka/japi/Option$$Some.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productElementName(n)
```
Definition ClassesProduct
43. [**](../../akka/japi/Option$$Some.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productElementNames
```
Definition ClassesProduct
44. [**](../../akka/japi/Option$$Some.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productElementNames
```
Definition ClassesProduct
45. [**](../../akka/japi/Option$$Some.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productIterator
```
Definition ClassesProduct
46. [**](../../akka/japi/Option$$Some.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productIterator
```
Definition ClassesProduct
47. [**](../../akka/japi/Option$$Some.html#productPrefix:String "Permalink")  def productPrefix: StringImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productPrefix
```
Definition ClassesProduct
48. [**](../../akka/japi/Option$$Some.html#productPrefix:String "Permalink")  def productPrefix: StringImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).productPrefix
```
Definition ClassesProduct
49. [**](../../akka/japi/Option$$Some.html#stepper[S<:scala.collection.Stepper[_]](implicitshape:scala.collection.StepperShape[A,S]):S "Permalink")  def stepper\[S \<: [Stepper](https://www.scala-lang.org/api/2.13.17/scala/collection/Stepper.html#scala.collection.Stepper)\[\_]](implicit shape: StepperShape\[A, S]): SImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).stepper(shape)
```
Definition ClassesIterableOnce
50. [**](../../akka/japi/Option$$Some.html#stepper[S<:scala.collection.Stepper[_]](implicitshape:scala.collection.StepperShape[A,S]):S "Permalink")  def stepper\[S \<: [Stepper](https://www.scala-lang.org/api/2.13.17/scala/collection/Stepper.html#scala.collection.Stepper)\[\_]](implicit shape: StepperShape\[A, S]): SImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).stepper(shape)
```
Definition ClassesIterableOnce
51. [**](../../akka/japi/Option$$Some.html#toLeft[X](right:=>X):Either[A,X] "Permalink") final  def toLeft\[X](right: \=\> X): Either\[A, X]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).toLeft(right)
```
Definition ClassesOptionAnnotations@inline()
52. [**](../../akka/japi/Option$$Some.html#toLeft[X](right:=>X):Either[A,X] "Permalink") final  def toLeft\[X](right: \=\> X): Either\[A, X]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).toLeft(right)
```
Definition ClassesOptionAnnotations@inline()
53. [**](../../akka/japi/Option$$Some.html#toList:List[A] "Permalink")  def toList: List\[A]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).toList
```
Definition ClassesOption
54. [**](../../akka/japi/Option$$Some.html#toList:List[A] "Permalink")  def toList: List\[A]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).toList
```
Definition ClassesOption
55. [**](../../akka/japi/Option$$Some.html#toRight[X](left:=>X):Either[X,A] "Permalink") final  def toRight\[X](left: \=\> X): Either\[X, A]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).toRight(left)
```
Definition ClassesOptionAnnotations@inline()
56. [**](../../akka/japi/Option$$Some.html#toRight[X](left:=>X):Either[X,A] "Permalink") final  def toRight\[X](left: \=\> X): Either\[X, A]ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).toRight(left)
```
Definition ClassesOptionAnnotations@inline()
57. [**](../../akka/japi/Option$$Some.html#unzip[A1,A2](implicitasPair:A<:<(A1,A2)):(Option[A1],Option[A2]) "Permalink") final  def unzip\[A1, A2](implicit asPair: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[A, (A1, A2)]): ([scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A1], [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A2])ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).unzip(asPair)
```
Definition ClassesOption
58. [**](../../akka/japi/Option$$Some.html#unzip[A1,A2](implicitasPair:A<:<(A1,A2)):(Option[A1],Option[A2]) "Permalink") final  def unzip\[A1, A2](implicit asPair: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[A, (A1, A2)]): ([scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A1], [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A2])ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).unzip(asPair)
```
Definition ClassesOption
59. [**](../../akka/japi/Option$$Some.html#unzip3[A1,A2,A3](implicitasTriple:A<:<(A1,A2,A3)):(Option[A1],Option[A2],Option[A3]) "Permalink") final  def unzip3\[A1, A2, A3](implicit asTriple: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[A, (A1, A2, A3)]): ([scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A1], [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A2], [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A3])ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).unzip3(asTriple)
```
Definition ClassesOption
60. [**](../../akka/japi/Option$$Some.html#unzip3[A1,A2,A3](implicitasTriple:A<:<(A1,A2,A3)):(Option[A1],Option[A2],Option[A3]) "Permalink") final  def unzip3\[A1, A2, A3](implicit asTriple: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[A, (A1, A2, A3)]): ([scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A1], [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A2], [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A3])ImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).unzip3(asTriple)
```
Definition ClassesOption
61. [**](../../akka/japi/Option$$Some.html#withFilter(p:A=>Boolean):Option.this.WithFilter "Permalink") final  def withFilter(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WithFilterImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).withFilter(p)
```
Definition ClassesOptionAnnotations@inline()
62. [**](../../akka/japi/Option$$Some.html#withFilter(p:A=>Boolean):Option.this.WithFilter "Permalink") final  def withFilter(p: (A) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WithFilterImplicitThis member is added by an implicit conversion from Some\[A] to[scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A] performed by method java2ScalaOption in [akka.japi.Option](Option$.html).ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(some: scala.Option[A]).withFilter(p)
```
Definition ClassesOptionAnnotations@inline()
### Deprecated Value Members

1. [**](../../akka/japi/Option$$Some.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/japi/Option$$Some.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Some\[A] toStringFormat\[Some\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/japi/Option$$Some.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Some\[A], B)ImplicitThis member is added by an implicit conversion from Some\[A] toArrowAssoc\[Some\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Option](Option.html)\[A]

### Inherited from [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[A]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion java2ScalaOption fromSome\[A] to [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]

### Inherited by implicit conversion java2ScalaOption fromSome\[A] to [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]

### Inherited by implicit conversion any2stringadd fromSome\[A] to any2stringadd\[Some\[A]]

### Inherited by implicit conversion StringFormat fromSome\[A] to StringFormat\[Some\[A]]

### Inherited by implicit conversion Ensuring fromSome\[A] to Ensuring\[Some\[A]]

### Inherited by implicit conversion ArrowAssoc fromSome\[A] to ArrowAssoc\[Some\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Option$$Some.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Option$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Option.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/japi/Option$$Some.html](https://doc.akka.io/api/akka-core/2.10/akka/japi/Option$$Some.html)*