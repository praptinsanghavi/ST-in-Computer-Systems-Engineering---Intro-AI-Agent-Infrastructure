---
description: Akka 2.10.17 - akka.pattern.BackoffSupervisor.RestartCount
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:36:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/BackoffSupervisor$$RestartCount.html
title: Akka 2.10.17 - akka.pattern.BackoffSupervisor.RestartCount
---

# Akka 2.10.17 - akka.pattern.BackoffSupervisor.RestartCount

> **Summary:** Akka 2.10.17 - akka.pattern.BackoffSupervisor.RestartCount

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/pattern/BackoffSupervisor$.html "Permalink")  object [BackoffSupervisor](BackoffSupervisor$.html)Definition Classes[pattern](index.html)
- [CurrentChild](BackoffSupervisor$$CurrentChild.html "Send this message to the BackoffSupervisor and it will reply with BackoffSupervisor.CurrentChild containing the ActorRef of the current child, if any.")
- [GetCurrentChild](BackoffSupervisor$$GetCurrentChild$.html "Send this message to the BackoffSupervisor and it will reply with BackoffSupervisor.CurrentChild containing the ActorRef of the current child, if any.")
- [GetRestartCount](BackoffSupervisor$$GetRestartCount$.html "Send this message to the BackoffSupervisor and it will reply with BackoffSupervisor.RestartCount containing the current restart count.")
- [Reset](BackoffSupervisor$$Reset$.html "Send this message to the BackoffSupervisor and it will reset the back-off.")
- RestartCount
c[akka](../index.html).[pattern](index.html).[BackoffSupervisor](BackoffSupervisor$.html)

# RestartCount[**](../../akka/pattern/BackoffSupervisor$$RestartCount.html "Permalink")

### 

#### final  case class RestartCount(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[BackoffSupervisor.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/pattern/BackoffSupervisor.scala#L79)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RestartCount
2. Serializable
3. Product
4. Equals
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

1. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#<init>(count:Int):akka.pattern.BackoffSupervisor.RestartCount "Permalink")  new RestartCount(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
### Value Members

1. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RestartCount toany2stringadd\[RestartCount] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RestartCount, B)ImplicitThis member is added by an implicit conversion from RestartCount toArrowAssoc\[RestartCount] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#count:Int "Permalink")  val count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
9. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RestartCount) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RestartCountImplicitThis member is added by an implicit conversion from RestartCount toEnsuring\[RestartCount] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RestartCount) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RestartCountImplicitThis member is added by an implicit conversion from RestartCount toEnsuring\[RestartCount] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RestartCountImplicitThis member is added by an implicit conversion from RestartCount toEnsuring\[RestartCount] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RestartCountImplicitThis member is added by an implicit conversion from RestartCount toEnsuring\[RestartCount] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RestartCount toStringFormat\[RestartCount] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/pattern/BackoffSupervisor$$RestartCount.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RestartCount, B)ImplicitThis member is added by an implicit conversion from RestartCount toArrowAssoc\[RestartCount] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRestartCount to any2stringadd\[RestartCount]

### Inherited by implicit conversion StringFormat fromRestartCount to StringFormat\[RestartCount]

### Inherited by implicit conversion Ensuring fromRestartCount to Ensuring\[RestartCount]

### Inherited by implicit conversion ArrowAssoc fromRestartCount to ArrowAssoc\[RestartCount]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/pattern/BackoffSupervisor$$CurrentChild.html
- https://doc.akka.io/api/akka/current/akka/pattern/BackoffSupervisor$$GetCurrentChild$.html
- https://doc.akka.io/api/akka/current/akka/pattern/BackoffSupervisor$$GetRestartCount$.html
- https://doc.akka.io/api/akka/current/akka/pattern/BackoffSupervisor$$Reset$.html
- https://doc.akka.io/api/akka/current/akka/pattern/BackoffSupervisor$$RestartCount.html
- https://doc.akka.io/api/akka/current/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/api/akka/current/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/current/akka/pattern/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/pattern/BackoffSupervisor$$RestartCount.html](https://doc.akka.io/api/akka/current/akka/pattern/BackoffSupervisor$$RestartCount.html)*