---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.ws.UpgradeToWebSocket
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/UpgradeToWebSocket.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.ws.UpgradeToWebSocket
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.ws.UpgradeToWebSocket

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.ws.UpgradeToWebSocket

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[javadsl](../../index.html)
- [**](../../../../../akka/http/javadsl/model/ws/index.html "Permalink")  package [ws](index.html)Definition Classes[model](../index.html)
- [BinaryMessage](BinaryMessage.html "Represents a WebSocket binary message.")
- [Message](Message.html "Represents a WebSocket message.")
- [PeerClosedConnectionException](PeerClosedConnectionException.html "A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.")
- [TextMessage](TextMessage.html "Represents a WebSocket text message.")
- UpgradeToWebSocket
- [WebSocket](WebSocket$.html)
- [WebSocketRequest](WebSocketRequest.html "Represents a WebSocket request.")
- [WebSocketUpgrade](WebSocketUpgrade.html "An attribute that WebSocket requests will contain.")
- [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "Represents an upgrade response for a WebSocket upgrade request.")
t[akka](../../../../index.html).[http](../../../index.html).[javadsl](../../index.html).[model](../index.html).[ws](index.html)

# UpgradeToWebSocket[**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html "Permalink")

### 

#### trait UpgradeToWebSocket extends [scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html) with [WebSocketUpgrade](WebSocketUpgrade.html)

A virtual header that WebSocket requests will contain. Use [UpgradeToWebSocket.handleMessagesWith](#handleMessagesWith(inSink:akka.stream.Graph[akka.stream.SinkShape[akka.http.javadsl.model.ws.Message],_],outSource:akka.stream.Graph[akka.stream.SourceShape[akka.http.javadsl.model.ws.Message],_],subprotocol:String):akka.http.javadsl.model.HttpResponse) to
create a WebSocket handshake response and handle the WebSocket message stream with the given handler.

This low\-level API is expected to be replaced by an Attribute in the future.

In any case, you might want to use `handleWebSocketMessages` instead as documented
at https://doc.akka.io/libraries/akka\-http/current/server\-side/websocket\-support.html\#routing\-support

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* use the WebSocketUpgrade attribute instead

Source[UpgradeToWebSocket.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/model/ws/UpgradeToWebSocket.scala#L26)Linear Supertypes[WebSocketUpgrade](WebSocketUpgrade.html), [scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html), ToStringRenderable, Renderable, [HttpHeader](../HttpHeader.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[UpgradeToWebSocket](../../../scaladsl/model/ws/UpgradeToWebSocket.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UpgradeToWebSocket
2. WebSocketUpgrade
3. HttpHeader
4. ToStringRenderable
5. Renderable
6. HttpHeader
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
### Abstract Value Members

1. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#getRequestedProtocols():Iterable[String] "Permalink") abstract  def getRequestedProtocols(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String]Returns the sequence of protocols the client accepts.

Returns the sequence of protocols the client accepts.

See http://tools.ietf.org/html/rfc6455\#section\-1\.9

Definition ClassesUpgradeToWebSocket → [WebSocketUpgrade](WebSocketUpgrade.html)
2. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(inSink:akka.stream.Graph[akka.stream.SinkShape[akka.http.javadsl.model.ws.Message],_],outSource:akka.stream.Graph[akka.stream.SourceShape[akka.http.javadsl.model.ws.Message],_],subprotocol:String):akka.http.javadsl.model.HttpResponse "Permalink") abstract  def handleMessagesWith(inSink: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[SinkShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SinkShape.html#akka.stream.SinkShape)\[[Message](Message.html)], \_], outSource: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[SourceShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SourceShape.html#akka.stream.SourceShape)\[[Message](Message.html)], \_], subprotocol: String): [HttpResponse](../HttpResponse.html)Returns a response that can be used to answer a WebSocket handshake request.

Returns a response that can be used to answer a WebSocket handshake request. The connection will afterwards
use the given inSink to handle WebSocket messages from the client and the given outSource to send messages to the client.

The given subprotocol must be one of the ones offered by the client.

Definition ClassesUpgradeToWebSocket → [WebSocketUpgrade](WebSocketUpgrade.html)
3. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(inSink:akka.stream.Graph[akka.stream.SinkShape[akka.http.javadsl.model.ws.Message],_],outSource:akka.stream.Graph[akka.stream.SourceShape[akka.http.javadsl.model.ws.Message],_]):akka.http.javadsl.model.HttpResponse "Permalink") abstract  def handleMessagesWith(inSink: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[SinkShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SinkShape.html#akka.stream.SinkShape)\[[Message](Message.html)], \_], outSource: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[SourceShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SourceShape.html#akka.stream.SourceShape)\[[Message](Message.html)], \_]): [HttpResponse](../HttpResponse.html)Returns a response that can be used to answer a WebSocket handshake request.

Returns a response that can be used to answer a WebSocket handshake request. The connection will afterwards
use the given inSink to handle WebSocket messages from the client and the given outSource to send messages to the client.

Definition ClassesUpgradeToWebSocket → [WebSocketUpgrade](WebSocketUpgrade.html)
4. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(handlerFlow:akka.stream.Graph[akka.stream.FlowShape[akka.http.javadsl.model.ws.Message,akka.http.javadsl.model.ws.Message],_],subprotocol:String):akka.http.javadsl.model.HttpResponse "Permalink") abstract  def handleMessagesWith(handlerFlow: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[FlowShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html#akka.stream.FlowShape)\[[Message](Message.html), [Message](Message.html)], \_], subprotocol: String): [HttpResponse](../HttpResponse.html)Returns a response that can be used to answer a WebSocket handshake request.

Returns a response that can be used to answer a WebSocket handshake request. The connection will afterwards
use the given handlerFlow to handle WebSocket messages from the client. The given subprotocol must be one
of the ones offered by the client.

Definition ClassesUpgradeToWebSocket → [WebSocketUpgrade](WebSocketUpgrade.html)
5. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(handlerFlow:akka.stream.Graph[akka.stream.FlowShape[akka.http.javadsl.model.ws.Message,akka.http.javadsl.model.ws.Message],_]):akka.http.javadsl.model.HttpResponse "Permalink") abstract  def handleMessagesWith(handlerFlow: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[FlowShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html#akka.stream.FlowShape)\[[Message](Message.html), [Message](Message.html)], \_]): [HttpResponse](../HttpResponse.html)Returns a response that can be used to answer a WebSocket handshake request.

Returns a response that can be used to answer a WebSocket handshake request. The connection will afterwards
use the given handlerFlow to handle WebSocket messages from the client.

Definition ClassesUpgradeToWebSocket → [WebSocketUpgrade](WebSocketUpgrade.html)
6. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#lowercaseName():String "Permalink") abstract  def lowercaseName(): StringReturns the lower\-cased name of the header.

Returns the lower\-cased name of the header.

Definition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html) → [HttpHeader](../HttpHeader.html)
7. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#name():String "Permalink") abstract  def name(): StringReturns the name of the header.

Returns the name of the header.

Definition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html) → [HttpHeader](../HttpHeader.html)
8. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#renderInRequests():Boolean "Permalink") abstract  def renderInRequests(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if the header is to be rendered in requests.

Returns true if and only if the header is to be rendered in requests.

Definition Classes[HttpHeader](../HttpHeader.html)
9. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#renderInResponses():Boolean "Permalink") abstract  def renderInResponses(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if the header is to be rendered in responses.

Returns true if and only if the header is to be rendered in responses.

Definition Classes[HttpHeader](../HttpHeader.html)
10. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#value():String "Permalink") abstract  def value(): StringReturns the String representation of the value of the header.

Returns the String representation of the value of the header.

Definition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html) → [HttpHeader](../HttpHeader.html)
### Concrete Value Members

1. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from UpgradeToWebSocket toany2stringadd\[UpgradeToWebSocket] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (UpgradeToWebSocket, B)ImplicitThis member is added by an implicit conversion from UpgradeToWebSocket toArrowAssoc\[UpgradeToWebSocket] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (UpgradeToWebSocket) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UpgradeToWebSocketImplicitThis member is added by an implicit conversion from UpgradeToWebSocket toEnsuring\[UpgradeToWebSocket] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (UpgradeToWebSocket) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UpgradeToWebSocketImplicitThis member is added by an implicit conversion from UpgradeToWebSocket toEnsuring\[UpgradeToWebSocket] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UpgradeToWebSocketImplicitThis member is added by an implicit conversion from UpgradeToWebSocket toEnsuring\[UpgradeToWebSocket] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UpgradeToWebSocketImplicitThis member is added by an implicit conversion from UpgradeToWebSocket toEnsuring\[UpgradeToWebSocket] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#is(nameInLowerCase:String):Boolean "Permalink")  def is(nameInLowerCase: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if nameInLowerCase.equals(lowercaseName()).

Returns true if and only if nameInLowerCase.equals(lowercaseName()).

Definition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html) → [HttpHeader](../HttpHeader.html)
17. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#isNot(nameInLowerCase:String):Boolean "Permalink")  def isNot(nameInLowerCase: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns !is(nameInLowerCase).

Returns !is(nameInLowerCase).

Definition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html) → [HttpHeader](../HttpHeader.html)
19. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
24. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#unsafeToString:String "Permalink")  def unsafeToString: StringDefinition Classes[HttpHeader](../../../scaladsl/model/HttpHeader.html)
25. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from UpgradeToWebSocket toStringFormat\[UpgradeToWebSocket] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (UpgradeToWebSocket, B)ImplicitThis member is added by an implicit conversion from UpgradeToWebSocket toArrowAssoc\[UpgradeToWebSocket] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [WebSocketUpgrade](WebSocketUpgrade.html)

### Inherited from [scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html)

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [HttpHeader](../HttpHeader.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUpgradeToWebSocket to any2stringadd\[UpgradeToWebSocket]

### Inherited by implicit conversion StringFormat fromUpgradeToWebSocket to StringFormat\[UpgradeToWebSocket]

### Inherited by implicit conversion Ensuring fromUpgradeToWebSocket to Ensuring\[UpgradeToWebSocket]

### Inherited by implicit conversion ArrowAssoc fromUpgradeToWebSocket to ArrowAssoc\[UpgradeToWebSocket]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/UpgradeToWebSocket.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/UpgradeToWebSocket.html)*