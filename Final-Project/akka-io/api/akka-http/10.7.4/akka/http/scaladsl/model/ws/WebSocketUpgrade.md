---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.WebSocketUpgrade
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:10:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgrade.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.WebSocketUpgrade
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.WebSocketUpgrade

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.WebSocketUpgrade

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
- [TextMessage](TextMessage.html "Represents a WebSocket text message.")
- [UpgradeToWebSocket](UpgradeToWebSocket.html "A custom header that will be added to an WebSocket upgrade HttpRequest that enables a request handler to upgrade this connection to a WebSocket connection and registers a WebSocket handler.")
- [ValidUpgrade](ValidUpgrade.html)
- [WebSocketRequest](WebSocketRequest.html "Represents a WebSocket request.")
- WebSocketUpgrade
- [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "Represents the response to a websocket upgrade request.")
t[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[ws](index.html)

# WebSocketUpgrade[**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html "Permalink")

### 

#### trait WebSocketUpgrade extends [javadsl.model.ws.WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html)

An attribute that will be added to an WebSocket upgrade HttpRequest that
enables a request handler to upgrade this connection to a WebSocket connection and
registers a WebSocket handler.

This is a low\-level API. You might want to use `handleWebSocketMessages` instead as documented
at https://doc.akka.io/libraries/akka\-http/current/server\-side/websocket\-support.html\#routing\-support

Source[WebSocketUpgrade.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/ws/WebSocketUpgrade.scala#L23)Linear Supertypes[javadsl.model.ws.WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[UpgradeToWebSocket](UpgradeToWebSocket.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WebSocketUpgrade
2. WebSocketUpgrade
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
### Abstract Value Members

1. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#handleMessages(handlerFlow:akka.stream.Graph[akka.stream.FlowShape[akka.http.scaladsl.model.ws.Message,akka.http.scaladsl.model.ws.Message],Any],subprotocol:Option[String]):akka.http.scaladsl.model.HttpResponse "Permalink") abstract  def handleMessages(handlerFlow: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[FlowShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html#akka.stream.FlowShape)\[[Message](Message.html), [Message](Message.html)], [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], subprotocol: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None): [HttpResponse](../HttpResponse.html)The high\-level interface to create a WebSocket server based on "messages".

The high\-level interface to create a WebSocket server based on "messages".

Returns a response to return in a request handler that will signal the
low\-level HTTP implementation to upgrade the connection to WebSocket and
use the supplied handler to handle incoming WebSocket messages.

Optionally, a subprotocol out of the ones requested by the client can be chosen.
2. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#requestedProtocols:Seq[String] "Permalink") abstract  def requestedProtocols: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]A sequence of protocols the client accepts.

A sequence of protocols the client accepts.

See http://tools.ietf.org/html/rfc6455\#section\-1\.9
### Concrete Value Members

1. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WebSocketUpgrade toany2stringadd\[WebSocketUpgrade] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WebSocketUpgrade, B)ImplicitThis member is added by an implicit conversion from WebSocketUpgrade toArrowAssoc\[WebSocketUpgrade] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WebSocketUpgrade) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WebSocketUpgradeImplicitThis member is added by an implicit conversion from WebSocketUpgrade toEnsuring\[WebSocketUpgrade] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WebSocketUpgrade) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WebSocketUpgradeImplicitThis member is added by an implicit conversion from WebSocketUpgrade toEnsuring\[WebSocketUpgrade] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WebSocketUpgradeImplicitThis member is added by an implicit conversion from WebSocketUpgrade toEnsuring\[WebSocketUpgrade] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WebSocketUpgradeImplicitThis member is added by an implicit conversion from WebSocketUpgrade toEnsuring\[WebSocketUpgrade] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#getRequestedProtocols():Iterable[String] "Permalink")  def getRequestedProtocols(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String]Java API

Java API

Definition ClassesWebSocketUpgrade → [WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html)
16. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(inSink:akka.stream.Graph[akka.stream.SinkShape[akka.http.javadsl.model.ws.Message],_],outSource:akka.stream.Graph[akka.stream.SourceShape[akka.http.javadsl.model.ws.Message],_],subprotocol:String):akka.http.scaladsl.model.HttpResponse "Permalink")  def handleMessagesWith(inSink: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[SinkShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SinkShape.html#akka.stream.SinkShape)\[[javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html)], \_], outSource: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[SourceShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SourceShape.html#akka.stream.SourceShape)\[[javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html)], \_], subprotocol: String): [HttpResponse](../HttpResponse.html)Java API

Java API

Definition ClassesWebSocketUpgrade → [WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html)
17. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(inSink:akka.stream.Graph[akka.stream.SinkShape[akka.http.javadsl.model.ws.Message],_],outSource:akka.stream.Graph[akka.stream.SourceShape[akka.http.javadsl.model.ws.Message],_]):akka.http.scaladsl.model.HttpResponse "Permalink")  def handleMessagesWith(inSink: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[SinkShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SinkShape.html#akka.stream.SinkShape)\[[javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html)], \_], outSource: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[SourceShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SourceShape.html#akka.stream.SourceShape)\[[javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html)], \_]): [HttpResponse](../HttpResponse.html)Java API

Java API

Definition ClassesWebSocketUpgrade → [WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html)
18. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(handlerFlow:akka.stream.Graph[akka.stream.FlowShape[akka.http.javadsl.model.ws.Message,akka.http.javadsl.model.ws.Message],_],subprotocol:String):akka.http.scaladsl.model.HttpResponse "Permalink")  def handleMessagesWith(handlerFlow: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[FlowShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html#akka.stream.FlowShape)\[[javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html), [javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html)], \_], subprotocol: String): [HttpResponse](../HttpResponse.html)Java API

Java API

Definition ClassesWebSocketUpgrade → [WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html)
19. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(handlerFlow:akka.stream.Graph[akka.stream.FlowShape[akka.http.javadsl.model.ws.Message,akka.http.javadsl.model.ws.Message],_]):akka.http.scaladsl.model.HttpResponse "Permalink")  def handleMessagesWith(handlerFlow: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[FlowShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html#akka.stream.FlowShape)\[[javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html), [javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html)], \_]): [HttpResponse](../HttpResponse.html)Java API

Java API

Definition ClassesWebSocketUpgrade → [WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html)
20. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#handleMessagesWithSinkSource(inSink:akka.stream.Graph[akka.stream.SinkShape[akka.http.scaladsl.model.ws.Message],Any],outSource:akka.stream.Graph[akka.stream.SourceShape[akka.http.scaladsl.model.ws.Message],Any],subprotocol:Option[String]):akka.http.scaladsl.model.HttpResponse "Permalink")  def handleMessagesWithSinkSource(inSink: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[SinkShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SinkShape.html#akka.stream.SinkShape)\[[Message](Message.html)], [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], outSource: [Graph](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html#akka.stream.Graph)\[[SourceShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SourceShape.html#akka.stream.SourceShape)\[[Message](Message.html)], [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], subprotocol: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None): [HttpResponse](../HttpResponse.html)The high\-level interface to create a WebSocket server based on "messages".

The high\-level interface to create a WebSocket server based on "messages".

Returns a response to return in a request handler that will signal the
low\-level HTTP implementation to upgrade the connection to WebSocket and
use the supplied inSink to consume messages received from the client and
the supplied outSource to produce message to sent to the client.

Optionally, a subprotocol out of the ones requested by the client can be chosen.
21. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WebSocketUpgrade toStringFormat\[WebSocketUpgrade] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WebSocketUpgrade, B)ImplicitThis member is added by an implicit conversion from WebSocketUpgrade toArrowAssoc\[WebSocketUpgrade] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.model.ws.WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromWebSocketUpgrade to any2stringadd\[WebSocketUpgrade]

### Inherited by implicit conversion StringFormat fromWebSocketUpgrade to StringFormat\[WebSocketUpgrade]

### Inherited by implicit conversion Ensuring fromWebSocketUpgrade to Ensuring\[WebSocketUpgrade]

### Inherited by implicit conversion ArrowAssoc fromWebSocketUpgrade to ArrowAssoc\[WebSocketUpgrade]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/InvalidUpgradeResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/PeerClosedConnectionException.html
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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html)*