---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.sse.ServerSentEvent
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:43:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.sse.ServerSentEvent
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.sse.ServerSentEvent

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.sse.ServerSentEvent

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/sse/index.html "Permalink")  package [sse](index.html)Definition Classes[model](../index.html)
- ServerSentEvent
[c](ServerSentEvent$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[sse](index.html)

# [ServerSentEvent](ServerSentEvent$.html "See companion object")[**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html "Permalink")

### Companion [object ServerSentEvent](ServerSentEvent$.html "See companion object")

#### final  case class ServerSentEvent(data: String, eventType: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None, id: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None, retry: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)] \= None) extends [javadsl.model.sse.ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Representation of a server\-sent event. By default akka\-http uses events with an empty data field as a heartbeat that is
ignored on reception. Set `akka.http.sse.emit-empty-events` can be used to change that default behavior.

datadata, may span multiple lines

eventTypeoptional type, must not contain \\n or \\r

idoptional id, must not contain \\n or \\r

retryoptional reconnection delay in milliseconds

Source[ServerSentEvent.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/sse/ServerSentEvent.scala#L78)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [javadsl.model.sse.ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServerSentEvent
2. Serializable
3. Product
4. Equals
5. ServerSentEvent
6. AnyRef
7. Any
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

1. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#<init>(data:String,eventType:Option[String],id:Option[String],retry:Option[Int]):akka.http.scaladsl.model.sse.ServerSentEvent "Permalink")  new ServerSentEvent(data: String, eventType: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None, id: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None, retry: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)] \= None)datadata, may span multiple lines

eventTypeoptional type, must not contain \\n or \\r

idoptional id, must not contain \\n or \\r

retryoptional reconnection delay in milliseconds
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ServerSentEvent toany2stringadd\[ServerSentEvent] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ServerSentEvent, B)ImplicitThis member is added by an implicit conversion from ServerSentEvent toArrowAssoc\[ServerSentEvent] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#data:String "Permalink")  val data: String
9. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#encode():akka.util.ByteString "Permalink")  def encode(): [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)Encode the event to bytes for use in a response

Encode the event to bytes for use in a response

Definition ClassesServerSentEvent → [ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html)
10. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ServerSentEvent) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerSentEventImplicitThis member is added by an implicit conversion from ServerSentEvent toEnsuring\[ServerSentEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ServerSentEvent) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerSentEventImplicitThis member is added by an implicit conversion from ServerSentEvent toEnsuring\[ServerSentEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerSentEventImplicitThis member is added by an implicit conversion from ServerSentEvent toEnsuring\[ServerSentEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerSentEventImplicitThis member is added by an implicit conversion from ServerSentEvent toEnsuring\[ServerSentEvent] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#eventType:Option[String] "Permalink")  val eventType: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
16. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#getData():String "Permalink")  def getData(): StringData, may span multiple lines.

Data, may span multiple lines.

Definition ClassesServerSentEvent → [ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html)
18. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#getEventType():java.util.Optional[String] "Permalink")  def getEventType(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String]Optional type, must not contain \\n or \\r.

Optional type, must not contain \\n or \\r.

Definition ClassesServerSentEvent → [ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html)
19. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#getId():java.util.Optional[String] "Permalink")  def getId(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String]Optional id, must not contain \\n or \\r.

Optional id, must not contain \\n or \\r.

Definition ClassesServerSentEvent → [ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html)
20. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#getRetry():java.util.OptionalInt "Permalink")  def getRetry(): [OptionalInt](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/OptionalInt.html#java.util.OptionalInt)Optional reconnection delay in milliseconds.

Optional reconnection delay in milliseconds.

Definition ClassesServerSentEvent → [ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html)
21. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#id:Option[String] "Permalink")  val id: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
22. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
27. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#retry:Option[Int] "Permalink")  val retry: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
28. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ServerSentEvent toStringFormat\[ServerSentEvent] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ServerSentEvent, B)ImplicitThis member is added by an implicit conversion from ServerSentEvent toArrowAssoc\[ServerSentEvent] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [javadsl.model.sse.ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromServerSentEvent to any2stringadd\[ServerSentEvent]

### Inherited by implicit conversion StringFormat fromServerSentEvent to StringFormat\[ServerSentEvent]

### Inherited by implicit conversion Ensuring fromServerSentEvent to Ensuring\[ServerSentEvent]

### Inherited by implicit conversion ArrowAssoc fromServerSentEvent to ArrowAssoc\[ServerSentEvent]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/sse/ServerSentEvent$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/sse/ServerSentEvent.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/sse/ServerSentEvent.html)*