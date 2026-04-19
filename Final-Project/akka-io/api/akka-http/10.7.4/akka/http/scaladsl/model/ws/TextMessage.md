---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.TextMessage
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/TextMessage.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.TextMessage
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.TextMessage

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.TextMessage

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/ws/index.html "Permalink")  package [ws](index.html)Definition Classes[model](../index.html)
- [BinaryMessage](BinaryMessage.html "Represents a WebSocket binary message.")
- [InvalidUpgradeResponse](InvalidUpgradeResponse.html)
- [Message](Message.html "The ADT for WebSocket messages.")
- [PeerClosedConnectionException](PeerClosedConnectionException.html "A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.")
- TextMessage
- [UpgradeToWebSocket](UpgradeToWebSocket.html "A custom header that will be added to an WebSocket upgrade HttpRequest that enables a request handler to upgrade this connection to a WebSocket connection and registers a WebSocket handler.")
- [ValidUpgrade](ValidUpgrade.html)
- [WebSocketRequest](WebSocketRequest.html "Represents a WebSocket request.")
- [WebSocketUpgrade](WebSocketUpgrade.html "An attribute that will be added to an WebSocket upgrade HttpRequest that enables a request handler to upgrade this connection to a WebSocket connection and registers a WebSocket handler.")
- [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "Represents the response to a websocket upgrade request.")
[t](TextMessage$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[ws](index.html)

# [TextMessage](TextMessage$.html "See companion object")[**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html "Permalink")

### Companion [object TextMessage](TextMessage$.html "See companion object")

#### sealed  trait TextMessage extends [javadsl.model.ws.TextMessage](../../../javadsl/model/ws/TextMessage.html) with [Message](Message.html)

Represents a WebSocket text message. A text message can either be a [TextMessage.Strict](TextMessage$$Strict.html) in which case
the complete data is already available or it can be [TextMessage.Streamed](TextMessage$$Streamed.html) in which case `textStream`
will return a Source streaming the data as it comes in.

Source[Message.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/ws/Message.scala#L28)Linear Supertypes[Message](Message.html), [javadsl.model.ws.TextMessage](../../../javadsl/model/ws/TextMessage.html), [javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Streamed](TextMessage$$Streamed.html), [Strict](TextMessage$$Strict.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TextMessage
2. Message
3. TextMessage
4. Message
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
### Abstract Value Members

1. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#getStrictText:String "Permalink") abstract  def getStrictText: StringReturns the strict message text if this message is strict, throws otherwise.

Returns the strict message text if this message is strict, throws otherwise.

Definition Classes[TextMessage](../../../javadsl/model/ws/TextMessage.html)
2. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#isStrict:Boolean "Permalink") abstract  def isStrict: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this message a strict one?

Is this message a strict one?

Definition Classes[Message](../../../javadsl/model/ws/Message.html)
3. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#textStream:akka.stream.scaladsl.Source[String,_] "Permalink") abstract  def textStream: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[String, \_]The contents of this message as a stream.
### Concrete Value Members

1. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TextMessage toany2stringadd\[TextMessage] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TextMessage, B)ImplicitThis member is added by an implicit conversion from TextMessage toArrowAssoc\[TextMessage] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#asBinaryMessage:akka.http.javadsl.model.ws.BinaryMessage "Permalink")  def asBinaryMessage: [javadsl.model.ws.BinaryMessage](../../../javadsl/model/ws/BinaryMessage.html)Returns this BinaryMessage if it is a binary message, throws otherwise.

Returns this BinaryMessage if it is a binary message, throws otherwise.

Definition Classes[TextMessage](../../../javadsl/model/ws/TextMessage.html) → [Message](../../../javadsl/model/ws/Message.html)
7. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#asScala:akka.http.scaladsl.model.ws.TextMessage "Permalink")  def asScala: TextMessageDefinition ClassesTextMessage → [TextMessage](../../../javadsl/model/ws/TextMessage.html) → [Message](../../../javadsl/model/ws/Message.html)
9. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#asTextMessage:akka.http.javadsl.model.ws.TextMessage "Permalink")  def asTextMessage: [javadsl.model.ws.TextMessage](../../../javadsl/model/ws/TextMessage.html)Returns this TextMessage if it is a text message, throws otherwise.

Returns this TextMessage if it is a text message, throws otherwise.

Definition Classes[TextMessage](../../../javadsl/model/ws/TextMessage.html) → [Message](../../../javadsl/model/ws/Message.html)
10. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TextMessage) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TextMessageImplicitThis member is added by an implicit conversion from TextMessage toEnsuring\[TextMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TextMessage) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TextMessageImplicitThis member is added by an implicit conversion from TextMessage toEnsuring\[TextMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TextMessageImplicitThis member is added by an implicit conversion from TextMessage toEnsuring\[TextMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TextMessageImplicitThis member is added by an implicit conversion from TextMessage toEnsuring\[TextMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#getStreamedText:akka.stream.javadsl.Source[String,_] "Permalink")  def getStreamedText: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[String, \_]Java API

Java API

Definition ClassesTextMessage → [TextMessage](../../../javadsl/model/ws/TextMessage.html)
19. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#isText:Boolean "Permalink")  def isText: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this message a text message? If true, [asTextMessage](#asTextMessage:akka.http.javadsl.model.ws.TextMessage) will return this
text message, if false, [asBinaryMessage](#asBinaryMessage:akka.http.javadsl.model.ws.BinaryMessage) will return this binary message.

Is this message a text message? If true, [asTextMessage](#asTextMessage:akka.http.javadsl.model.ws.TextMessage) will return this
text message, if false, [asBinaryMessage](#asBinaryMessage:akka.http.javadsl.model.ws.BinaryMessage) will return this binary message.

Definition Classes[TextMessage](../../../javadsl/model/ws/TextMessage.html) → [Message](../../../javadsl/model/ws/Message.html)
22. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.scaladsl.model.ws.TextMessage.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Strict](TextMessage$$Strict.html)]Definition ClassesTextMessage → [TextMessage](../../../javadsl/model/ws/TextMessage.html)
27. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.ws.TextMessage.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Strict](TextMessage$$Strict.html)]Collects all possible parts and returns a potentially future Strict Message for easier processing.

Collects all possible parts and returns a potentially future Strict Message for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout.
28. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TextMessage toStringFormat\[TextMessage] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TextMessage, B)ImplicitThis member is added by an implicit conversion from TextMessage toArrowAssoc\[TextMessage] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Message](Message.html)

### Inherited from [javadsl.model.ws.TextMessage](../../../javadsl/model/ws/TextMessage.html)

### Inherited from [javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTextMessage to any2stringadd\[TextMessage]

### Inherited by implicit conversion StringFormat fromTextMessage to StringFormat\[TextMessage]

### Inherited by implicit conversion Ensuring fromTextMessage to Ensuring\[TextMessage]

### Inherited by implicit conversion ArrowAssoc fromTextMessage to ArrowAssoc\[TextMessage]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/InvalidUpgradeResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/PeerClosedConnectionException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage$$Streamed.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/ValidUpgrade.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketRequest$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage.html)*