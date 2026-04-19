---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.Http.ServerBinding
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:12:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$ServerBinding.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.Http.ServerBinding
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.Http.ServerBinding

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.Http.ServerBinding

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/http/index.html "Permalink")  package [http](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/scaladsl/Http$.html "Permalink")  object [Http](Http$.html) extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[HttpExt](HttpExt.html)] with [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)Definition Classes[scaladsl](index.html)
- [HostConnectionPool](Http$$HostConnectionPool.html "Represents a connection pool to a specific target host and pool configuration.")
- [HttpConnectionTerminated](Http$$HttpConnectionTerminated.html)
- [HttpServerTerminated](Http$$HttpServerTerminated.html)
- [HttpTerminated](Http$$HttpTerminated.html "Type used to carry meaningful information when server termination has completed successfully.")
- [IncomingConnection](Http$$IncomingConnection.html "Represents one accepted incoming HTTP connection.")
- [OutgoingConnection](Http$$OutgoingConnection.html "Represents a prospective outgoing HTTP connection.")
- ServerBinding
c[akka](../../index.html).[http](../index.html).[scaladsl](index.html).[Http](Http$.html)

# ServerBinding[**](../../../akka/http/scaladsl/Http$$ServerBinding.html "Permalink")

### 

#### final  case class ServerBinding(localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress))(unbindAction: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)], terminateAction: ([FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpTerminated](Http$$HttpTerminated.html)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Represents a prospective HTTP server binding.

localAddressThe local address of the endpoint bound by the materialization of the `connections` [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html)

Source[Http.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/Http.scala#L884)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServerBinding
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

1. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#<init>(localAddress:java.net.InetSocketAddress)(unbindAction:()=>scala.concurrent.Future[Unit],terminateAction:scala.concurrent.duration.FiniteDuration=>scala.concurrent.Future[akka.http.scaladsl.Http.HttpTerminated]):akka.http.scaladsl.Http.ServerBinding "Permalink")  new ServerBinding(localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress))(unbindAction: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)], terminateAction: ([FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpTerminated](Http$$HttpTerminated.html)])localAddressThe local address of the endpoint bound by the materialization of the `connections` [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html)
### Value Members

1. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ServerBinding toany2stringadd\[ServerBinding] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ServerBinding, B)ImplicitThis member is added by an implicit conversion from ServerBinding toArrowAssoc\[ServerBinding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#addToCoordinatedShutdown(hardTerminationDeadline:scala.concurrent.duration.FiniteDuration)(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.Http.ServerBinding "Permalink")  def addToCoordinatedShutdown(hardTerminationDeadline: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): ServerBindingAdds this `ServerBinding` to the actor system's coordinated shutdown, so that [unbind](#unbind():scala.concurrent.Future[akka.Done]) and [terminate](#terminate(hardDeadline:scala.concurrent.duration.FiniteDuration):scala.concurrent.Future[akka.http.scaladsl.Http.HttpTerminated]) get
called appropriately before the system is shut down.

Adds this `ServerBinding` to the actor system's coordinated shutdown, so that [unbind](#unbind():scala.concurrent.Future[akka.Done]) and [terminate](#terminate(hardDeadline:scala.concurrent.duration.FiniteDuration):scala.concurrent.Future[akka.http.scaladsl.Http.HttpTerminated]) get
called appropriately before the system is shut down.

hardTerminationDeadlinetimeout after which all requests and connections shall be forcefully terminated
7. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ServerBinding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerBindingImplicitThis member is added by an implicit conversion from ServerBinding toEnsuring\[ServerBinding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ServerBinding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerBindingImplicitThis member is added by an implicit conversion from ServerBinding toEnsuring\[ServerBinding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerBindingImplicitThis member is added by an implicit conversion from ServerBinding toEnsuring\[ServerBinding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerBindingImplicitThis member is added by an implicit conversion from ServerBinding toEnsuring\[ServerBinding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#localAddress:java.net.InetSocketAddress "Permalink")  val localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)
17. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#terminate(hardDeadline:scala.concurrent.duration.FiniteDuration):scala.concurrent.Future[akka.http.scaladsl.Http.HttpTerminated] "Permalink")  def terminate(hardDeadline: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpTerminated](Http$$HttpTerminated.html)]Triggers "graceful" termination request being handled on this connection.

Triggers "graceful" termination request being handled on this connection.

Termination works as follows:

1\) Unbind:
\- the server port is unbound; no new connections will be accepted.

1\.5\) Immediately the ServerBinding `whenTerminationSignalIssued` future is completed.
This can be used to signal parts of the application that the http server is shutting down and they should clean up as well.
Note also that for more advanced shut down scenarios you may want to use the Coordinated Shutdown capabilities of Akka.

2\) if a connection has no "in\-flight" request, it is terminated immediately

3\) Handle in\-flight request:
\- if a request is "in\-flight" (being handled by user code), it is given `hardDeadline` time to complete,

	- if user code emits a response within the timeout, then this response is sent to the client with a `Connection: close` header and the connection is closed.
		- however if it is a streaming response, it is also mandated that it shall complete within the deadline, and if it does not
		 the connection will be terminated regardless of status of the streaming response (this is because such response could be infinite,
		 which could trap the server in a situation where it could not terminate if it were to wait for a response to "finish")
		- existing streaming responses must complete before the deadline as well.
		 When the deadline is reached the connection will be terminated regardless of status of the streaming responses.
	- if user code does not reply with a response within the deadline we produce a special [akka.http.javadsl.settings.ServerSettings.getTerminationDeadlineExceededResponse](../javadsl/settings/ServerSettings.html#getTerminationDeadlineExceededResponse:akka.http.javadsl.model.HttpResponse)
	 HTTP response (e.g. 503 Service Unavailable)4\) Keep draining incoming requests on existing connection:
\- The existing connection will remain alive for until the `hardDeadline` is exceeded,
 yet no new requests will be delivered to the user handler. All such drained responses will be replied to with an
 termination response (as explained in phase 3\).

5\) Close still existing connections
\- Connections are terminated forcefully once the `hardDeadline` is exceeded.
 The `whenTerminated` future is completed as well, so the graceful termination (of the `ActorSystem` or entire JVM
 itself can be safely performed, as by then it is known that no connections remain alive to this server).

Note that the termination response is configurable in [akka.http.javadsl.settings.ServerSettings](../javadsl/settings/ServerSettings.html), and by default is an `503 Service Unavailable`,
with an empty response entity.

Note: rather than terminating explicitly you can also use [addToCoordinatedShutdown](#addToCoordinatedShutdown(hardTerminationDeadline:scala.concurrent.duration.FiniteDuration)(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.Http.ServerBinding) to add this task to Akka's coordinated shutdown.

hardDeadlinetimeout after which all requests and connections shall be forcefully terminated

returnsfuture which completes successfully with a marker object once all connections have been terminated
23. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#unbind():scala.concurrent.Future[akka.Done] "Permalink")  def unbind(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Asynchronously triggers the unbinding of the port that was bound by the materialization of the `connections`
[akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html)

Asynchronously triggers the unbinding of the port that was bound by the materialization of the `connections`
[akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html)

Note that unbinding does NOT terminate existing connections.
Unbinding only means that the server will not accept new connections,
and existing connections are allowed to still perform request/response cycles.
This can be useful when one wants to let clients finish whichever work they have remaining,
while signalling them using some other way that the server will be terminating soon \-\- e.g.
by sending such information in the still being sent out responses, such that the client can
switch to a new server when it is ready.

Alternatively you may want to use the [terminate](#terminate(hardDeadline:scala.concurrent.duration.FiniteDuration):scala.concurrent.Future[akka.http.scaladsl.Http.HttpTerminated]) method which unbinds and performs
some level of gracefully replying with

The produced [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) is fulfilled when the unbinding has been completed.

Note: rather than unbinding explicitly you can also use [addToCoordinatedShutdown](#addToCoordinatedShutdown(hardTerminationDeadline:scala.concurrent.duration.FiniteDuration)(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.Http.ServerBinding) to add this task to Akka's coordinated shutdown.
24. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#whenTerminated:scala.concurrent.Future[akka.http.scaladsl.Http.HttpTerminated] "Permalink")  def whenTerminated: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpTerminated](Http$$HttpTerminated.html)]This future completes when the termination process, as initiated by an [terminate](#terminate(hardDeadline:scala.concurrent.duration.FiniteDuration):scala.concurrent.Future[akka.http.scaladsl.Http.HttpTerminated]) call has completed.

This future completes when the termination process, as initiated by an [terminate](#terminate(hardDeadline:scala.concurrent.duration.FiniteDuration):scala.concurrent.Future[akka.http.scaladsl.Http.HttpTerminated]) call has completed.
This means that the server is by then: unbound, and has closed all existing connections.

This signal can for example be used to safely terminate the underlying ActorSystem.

Note that this signal may be used for Coordinated Shutdown to proceed to next steps in the shutdown.
You may also explicitly depend on this future to perform your next shutting down steps.
28. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#whenTerminationSignalIssued:scala.concurrent.Future[scala.concurrent.duration.Deadline] "Permalink")  def whenTerminationSignalIssued: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Deadline](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Deadline.html#scala.concurrent.duration.Deadline)]Completes when the [terminate](#terminate(hardDeadline:scala.concurrent.duration.FiniteDuration):scala.concurrent.Future[akka.http.scaladsl.Http.HttpTerminated]) is called and server termination is in progress.

Completes when the [terminate](#terminate(hardDeadline:scala.concurrent.duration.FiniteDuration):scala.concurrent.Future[akka.http.scaladsl.Http.HttpTerminated]) is called and server termination is in progress.
Can be useful to make parts of your application aware that termination has been issued,
and they have Deadline time remaining to clean\-up before the server will forcefully close
existing connections.

Note that while termination is in progress, no new connections will be accepted (i.e. termination implies prior [unbind](#unbind():scala.concurrent.Future[akka.Done])).
### Deprecated Value Members

1. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ServerBinding toStringFormat\[ServerBinding] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ServerBinding, B)ImplicitThis member is added by an implicit conversion from ServerBinding toArrowAssoc\[ServerBinding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromServerBinding to any2stringadd\[ServerBinding]

### Inherited by implicit conversion StringFormat fromServerBinding to StringFormat\[ServerBinding]

### Inherited by implicit conversion Ensuring fromServerBinding to Ensuring\[ServerBinding]

### Inherited by implicit conversion ArrowAssoc fromServerBinding to ArrowAssoc\[ServerBinding]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HostConnectionPool.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpConnectionTerminated$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpConnectionTerminated.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpServerTerminated$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpServerTerminated.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$HttpTerminated.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$IncomingConnection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$OutgoingConnection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$ServerBinding.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$ServerBinding.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$$ServerBinding.html)*