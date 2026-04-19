---
description: Akka 2.10.17 - akka.testkit.TestEvent.Mute
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:24:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestEvent$$Mute.html
title: Akka 2.10.17 - akka.testkit.TestEvent.Mute
---

# Akka 2.10.17 - akka.testkit.TestEvent.Mute

> **Summary:** Akka 2.10.17 - akka.testkit.TestEvent.Mute

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/TestEvent$.html "Permalink")  object [TestEvent](TestEvent$.html "Implementation helpers of the EventFilter facilities: send Mute to the TestEventFilter to install a filter, and UnMute to uninstall it.")Implementation helpers of the EventFilter facilities: send `Mute`
to the TestEventFilter to install a filter, and `UnMute` to
uninstall it.

Implementation helpers of the EventFilter facilities: send `Mute`
to the TestEventFilter to install a filter, and `UnMute` to
uninstall it.

You should always prefer the filter methods in the package object
(see `akka.testkit` `filterEvents` and `filterException`) or on the
EventFilter implementations.

Definition Classes[testkit](index.html)
- Mute
- [UnMute](TestEvent$$UnMute.html)
[c](TestEvent$$Mute$.html "See companion object")[akka](../index.html).[testkit](index.html).[TestEvent](TestEvent$.html)

# [Mute](TestEvent$$Mute$.html "See companion object")[**](../../akka/testkit/TestEvent$$Mute.html "Permalink")

### Companion [object Mute](TestEvent$$Mute$.html "See companion object")

#### final  case class Mute(filters: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[EventFilter](EventFilter.html)]) extends [TestEvent](TestEvent.html) with [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[TestEventListener.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestEventListener.scala#L47)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html), [TestEvent](TestEvent.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Mute
2. Serializable
3. Product
4. Equals
5. NoSerializationVerificationNeeded
6. TestEvent
7. AnyRef
8. Any
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

1. [**](../../akka/testkit/TestEvent$$Mute.html#<init>(filters:Iterable[akka.testkit.EventFilter]):akka.testkit.TestEvent.Mute "Permalink")  new Mute(filters: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[EventFilter](EventFilter.html)])Java API: create a Mute command from a list of filters
2. [**](../../akka/testkit/TestEvent$$Mute.html#<init>(filters:Seq[akka.testkit.EventFilter]):akka.testkit.TestEvent.Mute "Permalink")  new Mute(filters: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[EventFilter](EventFilter.html)])
### Value Members

1. [**](../../akka/testkit/TestEvent$$Mute.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestEvent$$Mute.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestEvent$$Mute.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Mute toany2stringadd\[Mute] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/TestEvent$$Mute.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Mute, B)ImplicitThis member is added by an implicit conversion from Mute toArrowAssoc\[Mute] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/TestEvent$$Mute.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/TestEvent$$Mute.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/testkit/TestEvent$$Mute.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/testkit/TestEvent$$Mute.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Mute) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MuteImplicitThis member is added by an implicit conversion from Mute toEnsuring\[Mute] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/testkit/TestEvent$$Mute.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Mute) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MuteImplicitThis member is added by an implicit conversion from Mute toEnsuring\[Mute] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/testkit/TestEvent$$Mute.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MuteImplicitThis member is added by an implicit conversion from Mute toEnsuring\[Mute] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/testkit/TestEvent$$Mute.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MuteImplicitThis member is added by an implicit conversion from Mute toEnsuring\[Mute] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/testkit/TestEvent$$Mute.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/testkit/TestEvent$$Mute.html#filters:Seq[akka.testkit.EventFilter] "Permalink")  val filters: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[EventFilter](EventFilter.html)]
14. [**](../../akka/testkit/TestEvent$$Mute.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/testkit/TestEvent$$Mute.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/testkit/TestEvent$$Mute.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/testkit/TestEvent$$Mute.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/testkit/TestEvent$$Mute.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/testkit/TestEvent$$Mute.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../akka/testkit/TestEvent$$Mute.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/testkit/TestEvent$$Mute.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/testkit/TestEvent$$Mute.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/testkit/TestEvent$$Mute.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/TestEvent$$Mute.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/TestEvent$$Mute.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Mute toStringFormat\[Mute] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/TestEvent$$Mute.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Mute, B)ImplicitThis member is added by an implicit conversion from Mute toArrowAssoc\[Mute] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

### Inherited from [TestEvent](TestEvent.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMute to any2stringadd\[Mute]

### Inherited by implicit conversion StringFormat fromMute to StringFormat\[Mute]

### Inherited by implicit conversion Ensuring fromMute to Ensuring\[Mute]

### Inherited by implicit conversion ArrowAssoc fromMute to ArrowAssoc\[Mute]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/EventFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEvent$$Mute$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEvent$$Mute.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEvent$$UnMute$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEvent$$UnMute.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEvent$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestEvent.html
- https://doc.akka.io/api/akka/current/akka/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/TestEvent$$Mute.html](https://doc.akka.io/api/akka/current/akka/testkit/TestEvent$$Mute.html)*