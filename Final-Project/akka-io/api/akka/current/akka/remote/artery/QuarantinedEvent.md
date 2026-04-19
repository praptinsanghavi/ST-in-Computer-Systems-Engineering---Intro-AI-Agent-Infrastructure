---
description: Akka 2.10.17 - akka.remote.artery.QuarantinedEvent
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/artery/QuarantinedEvent.html
title: Akka 2.10.17 - akka.remote.artery.QuarantinedEvent
---

# Akka 2.10.17 - akka.remote.artery.QuarantinedEvent

> **Summary:** Akka 2.10.17 - akka.remote.artery.QuarantinedEvent

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/artery/index.html "Permalink")  package [artery](index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/artery/aeron/index.html "Permalink")  package [aeron](aeron/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/compress/index.html "Permalink")  package [compress](compress/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/jfr/index.html "Permalink")  package [jfr](jfr/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/tcp/index.html "Permalink")  package [tcp](tcp/index.html)Definition Classes[artery](index.html)
- [GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html)
- QuarantinedEvent
- [RemoteInstrument](RemoteInstrument.html "INTERNAL API")
- [RemotingFlightRecorder](RemotingFlightRecorder$.html "INTERNAL API")
- [TestManagementCommands](TestManagementCommands$.html)
- [ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html)
c[akka](../../index.html).[remote](../index.html).[artery](index.html)

# QuarantinedEvent[**](../../../akka/remote/artery/QuarantinedEvent.html "Permalink")

### 

#### final  case class QuarantinedEvent(uniqueAddress: [UniqueAddress](../UniqueAddress.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[QuarantinedEvent.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/artery/QuarantinedEvent.scala#L9)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. QuarantinedEvent
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

1. [**](../../../akka/remote/artery/QuarantinedEvent.html#<init>(uniqueAddress:akka.remote.UniqueAddress):akka.remote.artery.QuarantinedEvent "Permalink")  new QuarantinedEvent(uniqueAddress: [UniqueAddress](../UniqueAddress.html))
### Value Members

1. [**](../../../akka/remote/artery/QuarantinedEvent.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/artery/QuarantinedEvent.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/artery/QuarantinedEvent.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from QuarantinedEvent toany2stringadd\[QuarantinedEvent] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/artery/QuarantinedEvent.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (QuarantinedEvent, B)ImplicitThis member is added by an implicit conversion from QuarantinedEvent toArrowAssoc\[QuarantinedEvent] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/artery/QuarantinedEvent.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/artery/QuarantinedEvent.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/remote/artery/QuarantinedEvent.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/remote/artery/QuarantinedEvent.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (QuarantinedEvent) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): QuarantinedEventImplicitThis member is added by an implicit conversion from QuarantinedEvent toEnsuring\[QuarantinedEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/remote/artery/QuarantinedEvent.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (QuarantinedEvent) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QuarantinedEventImplicitThis member is added by an implicit conversion from QuarantinedEvent toEnsuring\[QuarantinedEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/remote/artery/QuarantinedEvent.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): QuarantinedEventImplicitThis member is added by an implicit conversion from QuarantinedEvent toEnsuring\[QuarantinedEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/remote/artery/QuarantinedEvent.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): QuarantinedEventImplicitThis member is added by an implicit conversion from QuarantinedEvent toEnsuring\[QuarantinedEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/remote/artery/QuarantinedEvent.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/remote/artery/QuarantinedEvent.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/remote/artery/QuarantinedEvent.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/remote/artery/QuarantinedEvent.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/remote/artery/QuarantinedEvent.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/remote/artery/QuarantinedEvent.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/remote/artery/QuarantinedEvent.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
19. [**](../../../akka/remote/artery/QuarantinedEvent.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../akka/remote/artery/QuarantinedEvent.html#toString:String "Permalink")  val toString: StringDefinition ClassesQuarantinedEvent → AnyRef → Any
21. [**](../../../akka/remote/artery/QuarantinedEvent.html#uniqueAddress:akka.remote.UniqueAddress "Permalink")  val uniqueAddress: [UniqueAddress](../UniqueAddress.html)
22. [**](../../../akka/remote/artery/QuarantinedEvent.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/remote/artery/QuarantinedEvent.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/remote/artery/QuarantinedEvent.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/artery/QuarantinedEvent.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/artery/QuarantinedEvent.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from QuarantinedEvent toStringFormat\[QuarantinedEvent] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/artery/QuarantinedEvent.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (QuarantinedEvent, B)ImplicitThis member is added by an implicit conversion from QuarantinedEvent toArrowAssoc\[QuarantinedEvent] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromQuarantinedEvent to any2stringadd\[QuarantinedEvent]

### Inherited by implicit conversion StringFormat fromQuarantinedEvent to StringFormat\[QuarantinedEvent]

### Inherited by implicit conversion Ensuring fromQuarantinedEvent to Ensuring\[QuarantinedEvent]

### Inherited by implicit conversion ArrowAssoc fromQuarantinedEvent to ArrowAssoc\[QuarantinedEvent]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/GracefulShutdownQuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/QuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/RemoteInstrument.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/RemotingFlightRecorder$.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/TestManagementCommands$.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/ThisActorSystemQuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/aeron/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/compress/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/jfr/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/artery/QuarantinedEvent.html](https://doc.akka.io/api/akka/current/akka/remote/artery/QuarantinedEvent.html)*