---
description: Akka 2.10.17 - akka.OnlyCauseStackTrace
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:50:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/OnlyCauseStackTrace.html
title: Akka 2.10.17 - akka.OnlyCauseStackTrace
---

# Akka 2.10.17 - akka.OnlyCauseStackTrace

> **Summary:** Akka 2.10.17 - akka.OnlyCauseStackTrace

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../index.html "Permalink")  package [root](../index.html)Definition Classes[root](../index.html)
- [**](../akka/index.html "Permalink")  package [akka](index.html)Definition Classes[root](../index.html)
- [**](../akka/actor/index.html "Permalink")  package [actor](actor/index.html)Definition Classes[akka](index.html)
- [**](../akka/annotation/index.html "Permalink")  package [annotation](annotation/index.html)Definition Classes[akka](index.html)
- [**](../akka/cluster/index.html "Permalink")  package [cluster](cluster/index.html)Definition Classes[akka](index.html)
- [**](../akka/coordination/index.html "Permalink")  package [coordination](coordination/index.html)Definition Classes[akka](index.html)
- [**](../akka/discovery/index.html "Permalink")  package [discovery](discovery/index.html)Definition Classes[akka](index.html)
- [**](../akka/dispatch/index.html "Permalink")  package [dispatch](dispatch/index.html)Definition Classes[akka](index.html)
- [**](../akka/event/index.html "Permalink")  package [event](event/index.html)Definition Classes[akka](index.html)
- [**](../akka/io/index.html "Permalink")  package [io](io/index.html)Definition Classes[akka](index.html)
- [**](../akka/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[akka](index.html)
- [**](../akka/pattern/index.html "Permalink")  package [pattern](pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](index.html)
- [**](../akka/persistence/index.html "Permalink")  package [persistence](persistence/index.html)Definition Classes[akka](index.html)
- [**](../akka/pki/index.html "Permalink")  package [pki](pki/index.html)Definition Classes[akka](index.html)
- [**](../akka/remote/index.html "Permalink")  package [remote](remote/index.html)Definition Classes[akka](index.html)
- [**](../akka/routing/index.html "Permalink")  package [routing](routing/index.html)Definition Classes[akka](index.html)
- [**](../akka/serialization/index.html "Permalink")  package [serialization](serialization/index.html)Definition Classes[akka](index.html)
- [**](../akka/stream/index.html "Permalink")  package [stream](stream/index.html)Definition Classes[akka](index.html)
- [**](../akka/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[akka](index.html)
- [**](../akka/util/index.html "Permalink")  package [util](util/index.html)Definition Classes[akka](index.html)
- [AkkaException](AkkaException.html "Akka base Exception.")
- [AkkaVersion](AkkaVersion$.html)
- [ConfigurationException](ConfigurationException.html "This exception is thrown when Akka detects a problem with the provided configuration")
- [Done](Done.html "Typically used together with Future to signal completion but there is no actual value completed.")
- [NotUsed](NotUsed.html "This type is used in generic type signatures wherever the actual value is of no importance.")
- OnlyCauseStackTrace
- [UnsupportedAkkaVersion](UnsupportedAkkaVersion.html)
- [Version](Version$.html)
t[akka](index.html)

# OnlyCauseStackTrace[**](../akka/OnlyCauseStackTrace.html "Permalink")

### 

#### trait OnlyCauseStackTrace extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Mix in this trait to suppress the StackTrace for the instance of the exception but not the cause,
scala.util.control.NoStackTrace suppresses all the StackTraces.

Self TypeOnlyCauseStackTrace with ThrowableSource[AkkaException.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/AkkaException.scala#L19)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. OnlyCauseStackTrace
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
### Value Members

1. [**](../akka/OnlyCauseStackTrace.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../akka/OnlyCauseStackTrace.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../akka/OnlyCauseStackTrace.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from OnlyCauseStackTrace toany2stringadd\[OnlyCauseStackTrace] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../akka/OnlyCauseStackTrace.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (OnlyCauseStackTrace, B)ImplicitThis member is added by an implicit conversion from OnlyCauseStackTrace toArrowAssoc\[OnlyCauseStackTrace] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../akka/OnlyCauseStackTrace.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../akka/OnlyCauseStackTrace.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../akka/OnlyCauseStackTrace.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../akka/OnlyCauseStackTrace.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (OnlyCauseStackTrace) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OnlyCauseStackTraceImplicitThis member is added by an implicit conversion from OnlyCauseStackTrace toEnsuring\[OnlyCauseStackTrace] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../akka/OnlyCauseStackTrace.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (OnlyCauseStackTrace) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OnlyCauseStackTraceImplicitThis member is added by an implicit conversion from OnlyCauseStackTrace toEnsuring\[OnlyCauseStackTrace] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../akka/OnlyCauseStackTrace.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OnlyCauseStackTraceImplicitThis member is added by an implicit conversion from OnlyCauseStackTrace toEnsuring\[OnlyCauseStackTrace] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../akka/OnlyCauseStackTrace.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OnlyCauseStackTraceImplicitThis member is added by an implicit conversion from OnlyCauseStackTrace toEnsuring\[OnlyCauseStackTrace] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../akka/OnlyCauseStackTrace.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../akka/OnlyCauseStackTrace.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../akka/OnlyCauseStackTrace.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): Throwable
15. [**](../akka/OnlyCauseStackTrace.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../akka/OnlyCauseStackTrace.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../akka/OnlyCauseStackTrace.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../akka/OnlyCauseStackTrace.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../akka/OnlyCauseStackTrace.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../akka/OnlyCauseStackTrace.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../akka/OnlyCauseStackTrace.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../akka/OnlyCauseStackTrace.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../akka/OnlyCauseStackTrace.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../akka/OnlyCauseStackTrace.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../akka/OnlyCauseStackTrace.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../akka/OnlyCauseStackTrace.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../akka/OnlyCauseStackTrace.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from OnlyCauseStackTrace toStringFormat\[OnlyCauseStackTrace] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../akka/OnlyCauseStackTrace.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (OnlyCauseStackTrace, B)ImplicitThis member is added by an implicit conversion from OnlyCauseStackTrace toArrowAssoc\[OnlyCauseStackTrace] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromOnlyCauseStackTrace to any2stringadd\[OnlyCauseStackTrace]

### Inherited by implicit conversion StringFormat fromOnlyCauseStackTrace to StringFormat\[OnlyCauseStackTrace]

### Inherited by implicit conversion Ensuring fromOnlyCauseStackTrace to Ensuring\[OnlyCauseStackTrace]

### Inherited by implicit conversion ArrowAssoc fromOnlyCauseStackTrace to ArrowAssoc\[OnlyCauseStackTrace]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/AkkaException.html
- https://doc.akka.io/api/akka/2.10/akka/AkkaVersion$.html
- https://doc.akka.io/api/akka/2.10/akka/ConfigurationException.html
- https://doc.akka.io/api/akka/2.10/akka/Done$.html
- https://doc.akka.io/api/akka/2.10/akka/Done.html
- https://doc.akka.io/api/akka/2.10/akka/NotUsed$.html
- https://doc.akka.io/api/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka/2.10/akka/OnlyCauseStackTrace.html
- https://doc.akka.io/api/akka/2.10/akka/UnsupportedAkkaVersion.html
- https://doc.akka.io/api/akka/2.10/akka/Version$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka/2.10/akka/coordination/index.html
- https://doc.akka.io/api/akka/2.10/akka/discovery/index.html
- https://doc.akka.io/api/akka/2.10/akka/dispatch/index.html
- https://doc.akka.io/api/akka/2.10/akka/event/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/io/index.html
- https://doc.akka.io/api/akka/2.10/akka/japi/index.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.10/akka/pki/index.html
- https://doc.akka.io/api/akka/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka/2.10/akka/routing/index.html
- https://doc.akka.io/api/akka/2.10/akka/serialization/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/akka/testkit/index.html
- https://doc.akka.io/api/akka/2.10/akka/util/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/OnlyCauseStackTrace.html](https://doc.akka.io/api/akka/2.10/akka/OnlyCauseStackTrace.html)*