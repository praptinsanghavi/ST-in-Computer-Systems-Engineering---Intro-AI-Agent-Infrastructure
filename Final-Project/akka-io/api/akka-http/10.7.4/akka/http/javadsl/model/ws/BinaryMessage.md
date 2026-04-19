---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.ws.BinaryMessage
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.ws.BinaryMessage
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.ws.BinaryMessage

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.ws.BinaryMessage

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[javadsl](../../index.html)
- [**](../../../../../akka/http/javadsl/model/ws/index.html "Permalink")  package [ws](index.html)Definition Classes[model](../index.html)
- BinaryMessage
- [Message](Message.html "Represents a WebSocket message.")
- [PeerClosedConnectionException](PeerClosedConnectionException.html "A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.")
- [TextMessage](TextMessage.html "Represents a WebSocket text message.")
- [UpgradeToWebSocket](UpgradeToWebSocket.html "A virtual header that WebSocket requests will contain.")
- [WebSocket](WebSocket$.html)
- [WebSocketRequest](WebSocketRequest.html "Represents a WebSocket request.")
- [WebSocketUpgrade](WebSocketUpgrade.html "An attribute that WebSocket requests will contain.")
- [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "Represents an upgrade response for a WebSocket upgrade request.")
[c](BinaryMessage$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[javadsl](../../index.html).[model](../index.html).[ws](index.html)

# [BinaryMessage](BinaryMessage$.html "See companion object")[**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html "Permalink")

### Companion [object BinaryMessage](BinaryMessage$.html "See companion object")

#### abstract  class BinaryMessage extends [Message](Message.html)

Represents a WebSocket binary message. A binary message can either be strict in which case
the complete data is already available or it can be streamed in which case [getStreamedData](#getStreamedData:akka.stream.javadsl.Source[akka.util.ByteString,_])
will return a Source streaming the data as it comes in.

Source[Message.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/model/ws/Message.scala#L121)Linear Supertypes[Message](Message.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[BinaryMessage](../../../scaladsl/model/ws/BinaryMessage.html), [Streamed](../../../scaladsl/model/ws/BinaryMessage$$Streamed.html), [Strict](../../../scaladsl/model/ws/BinaryMessage$$Strict.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BinaryMessage
2. Message
3. AnyRef
4. Any
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

1. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#<init>():akka.http.javadsl.model.ws.BinaryMessage "Permalink")  new BinaryMessage()
### Abstract Value Members

1. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#asScala:akka.http.scaladsl.model.ws.BinaryMessage "Permalink") abstract  def asScala: [scaladsl.model.ws.BinaryMessage](../../../scaladsl/model/ws/BinaryMessage.html)Definition ClassesBinaryMessage → [Message](Message.html)
2. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#getStreamedData:akka.stream.javadsl.Source[akka.util.ByteString,_] "Permalink") abstract  def getStreamedData: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), \_]Returns a source of the binary message data.
3. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#getStrictData:akka.util.ByteString "Permalink") abstract  def getStrictData: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)Returns the strict message data if this message is strict, throws otherwise.
4. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#isStrict:Boolean "Permalink") abstract  def isStrict: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this message a strict one?

Is this message a strict one?

Definition Classes[Message](Message.html)
5. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.scaladsl.model.ws.BinaryMessage.Strict] "Permalink") abstract  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Strict](../../../scaladsl/model/ws/BinaryMessage$$Strict.html)]
### Concrete Value Members

1. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BinaryMessage toany2stringadd\[BinaryMessage] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BinaryMessage, B)ImplicitThis member is added by an implicit conversion from BinaryMessage toArrowAssoc\[BinaryMessage] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#asBinaryMessage:akka.http.javadsl.model.ws.BinaryMessage "Permalink")  def asBinaryMessage: BinaryMessageReturns this BinaryMessage if it is a binary message, throws otherwise.

Returns this BinaryMessage if it is a binary message, throws otherwise.

Definition ClassesBinaryMessage → [Message](Message.html)
7. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#asTextMessage:akka.http.javadsl.model.ws.TextMessage "Permalink")  def asTextMessage: [TextMessage](TextMessage.html)Returns this TextMessage if it is a text message, throws otherwise.

Returns this TextMessage if it is a text message, throws otherwise.

Definition ClassesBinaryMessage → [Message](Message.html)
9. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BinaryMessage) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BinaryMessageImplicitThis member is added by an implicit conversion from BinaryMessage toEnsuring\[BinaryMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BinaryMessage) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BinaryMessageImplicitThis member is added by an implicit conversion from BinaryMessage toEnsuring\[BinaryMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BinaryMessageImplicitThis member is added by an implicit conversion from BinaryMessage toEnsuring\[BinaryMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BinaryMessageImplicitThis member is added by an implicit conversion from BinaryMessage toEnsuring\[BinaryMessage] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#isText:Boolean "Permalink")  def isText: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this message a text message? If true, [asTextMessage](#asTextMessage:akka.http.javadsl.model.ws.TextMessage) will return this
text message, if false, [asBinaryMessage](#asBinaryMessage:akka.http.javadsl.model.ws.BinaryMessage) will return this binary message.

Is this message a text message? If true, [asTextMessage](#asTextMessage:akka.http.javadsl.model.ws.TextMessage) will return this
text message, if false, [asBinaryMessage](#asBinaryMessage:akka.http.javadsl.model.ws.BinaryMessage) will return this binary message.

Definition ClassesBinaryMessage → [Message](Message.html)
20. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BinaryMessage toStringFormat\[BinaryMessage] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BinaryMessage, B)ImplicitThis member is added by an implicit conversion from BinaryMessage toArrowAssoc\[BinaryMessage] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Message](Message.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBinaryMessage to any2stringadd\[BinaryMessage]

### Inherited by implicit conversion StringFormat fromBinaryMessage to StringFormat\[BinaryMessage]

### Inherited by implicit conversion Ensuring fromBinaryMessage to Ensuring\[BinaryMessage]

### Inherited by implicit conversion ArrowAssoc fromBinaryMessage to ArrowAssoc\[BinaryMessage]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/Message$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/PeerClosedConnectionException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocket$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketRequest$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgradeResponse$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgradeResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage$$Streamed.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html)*