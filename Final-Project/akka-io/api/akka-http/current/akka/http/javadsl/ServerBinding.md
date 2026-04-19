---
description: Akka HTTP 10.7.4 - akka.http.javadsl.ServerBinding
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:44:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ServerBinding.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.ServerBinding
---

# Akka HTTP 10.7.4 - akka.http.javadsl.ServerBinding

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.ServerBinding

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/http/index.html "Permalink")  package [http](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/javadsl/coding/index.html "Permalink")  package [coding](coding/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/common/index.html "Permalink")  package [common](common/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/marshallers/index.html "Permalink")  package [marshallers](marshallers/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/marshalling/index.html "Permalink")  package [marshalling](marshalling/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/model/index.html "Permalink")  package [model](model/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/server/index.html "Permalink")  package [server](server/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](settings/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](unmarshalling/index.html)Definition Classes[javadsl](index.html)
- [ClientTransport](ClientTransport.html "SPI for implementors of custom client transports.")
- [ConnectHttp](ConnectHttp.html)
- [ConnectHttpImpl](ConnectHttpImpl.html "INTERNAL API")
- [ConnectHttpsImpl](ConnectHttpsImpl.html "INTERNAL API")
- [ConnectWithHttps](ConnectWithHttps.html)
- [ConnectionContext](ConnectionContext.html)
- [HandlerProvider](HandlerProvider.html "A HandlerProvider can provide an asynchronous request handler given an ClassicActorSystemProvider.")
- [HostConnectionPool](HostConnectionPool.html)
- [Http](Http.html)
- [HttpConnectionContext](HttpConnectionContext.html)
- [HttpTerminated](HttpTerminated.html "Type used to carry meaningful information when server termination has completed successfully.")
- [HttpsConnectionContext](HttpsConnectionContext.html)
- [IncomingConnection](IncomingConnection.html "Represents one accepted incoming HTTP connection.")
- [OutgoingConnection](OutgoingConnection.html)
- [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.")
- ServerBinding
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
c[akka](../../index.html).[http](../index.html).[javadsl](index.html)

# ServerBinding[**](../../../akka/http/javadsl/ServerBinding.html "Permalink")

### 

#### class ServerBinding extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Represents a prospective HTTP server binding.

Source[ServerBinding.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/ServerBinding.scala#L22)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServerBinding
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

1. [**](../../../akka/http/javadsl/ServerBinding.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/javadsl/ServerBinding.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/javadsl/ServerBinding.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ServerBinding toany2stringadd\[ServerBinding] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/http/javadsl/ServerBinding.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ServerBinding, B)ImplicitThis member is added by an implicit conversion from ServerBinding toArrowAssoc\[ServerBinding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/http/javadsl/ServerBinding.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/http/javadsl/ServerBinding.html#addToCoordinatedShutdown(hardTerminationDeadline:java.time.Duration,system:akka.actor.ClassicActorSystemProvider):akka.http.javadsl.ServerBinding "Permalink")  def addToCoordinatedShutdown(hardTerminationDeadline: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): ServerBindingAdds this `ServerBinding` to the actor system's coordinated shutdown, so that [unbind](#unbind():java.util.concurrent.CompletionStage[akka.Done]) and [terminate](#terminate(hardDeadline:java.time.Duration):java.util.concurrent.CompletionStage[akka.http.javadsl.HttpTerminated]) get
called appropriately before the system is shut down.

Adds this `ServerBinding` to the actor system's coordinated shutdown, so that [unbind](#unbind():java.util.concurrent.CompletionStage[akka.Done]) and [terminate](#terminate(hardDeadline:java.time.Duration):java.util.concurrent.CompletionStage[akka.http.javadsl.HttpTerminated]) get
called appropriately before the system is shut down.

hardTerminationDeadlinetimeout after which all requests and connections shall be forcefully terminated
7. [**](../../../akka/http/javadsl/ServerBinding.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/http/javadsl/ServerBinding.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/http/javadsl/ServerBinding.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ServerBinding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerBindingImplicitThis member is added by an implicit conversion from ServerBinding toEnsuring\[ServerBinding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/http/javadsl/ServerBinding.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ServerBinding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerBindingImplicitThis member is added by an implicit conversion from ServerBinding toEnsuring\[ServerBinding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/http/javadsl/ServerBinding.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerBindingImplicitThis member is added by an implicit conversion from ServerBinding toEnsuring\[ServerBinding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/http/javadsl/ServerBinding.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerBindingImplicitThis member is added by an implicit conversion from ServerBinding toEnsuring\[ServerBinding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/http/javadsl/ServerBinding.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/http/javadsl/ServerBinding.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/http/javadsl/ServerBinding.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/http/javadsl/ServerBinding.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/http/javadsl/ServerBinding.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/http/javadsl/ServerBinding.html#localAddress:java.net.InetSocketAddress "Permalink")  def localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)The local address of the endpoint bound by the materialization of the `connections` [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html).
19. [**](../../../akka/http/javadsl/ServerBinding.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/http/javadsl/ServerBinding.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/http/javadsl/ServerBinding.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/http/javadsl/ServerBinding.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/http/javadsl/ServerBinding.html#terminate(hardDeadline:java.time.Duration):java.util.concurrent.CompletionStage[akka.http.javadsl.HttpTerminated] "Permalink")  def terminate(hardDeadline: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpTerminated](HttpTerminated.html)]Triggers "graceful" termination request being handled on this connection.

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
	- if user code does not reply with a response within the deadline we produce a special [akka.http.javadsl.settings.ServerSettings.getTerminationDeadlineExceededResponse](settings/ServerSettings.html#getTerminationDeadlineExceededResponse:akka.http.javadsl.model.HttpResponse)
	 HTTP response (e.g. 503 Service Unavailable)4\) Keep draining incoming requests on existing connection:
\- The existing connection will remain alive for until the `hardDeadline` is exceeded,
 yet no new requests will be delivered to the user handler. All such drained responses will be replied to with an
 termination response (as explained in phase 3\).

5\) Close still existing connections
\- Connections are terminated forcefully once the `hardDeadline` is exceeded.
 The `whenTerminated` future is completed as well, so the graceful termination (of the `ActorSystem` or entire JVM
 itself can be safely performed, as by then it is known that no connections remain alive to this server).

Note that the termination response is configurable in [akka.http.javadsl.settings.ServerSettings](settings/ServerSettings.html), and by default is an `503 Service Unavailable`,
with an empty response entity.

hardDeadlinetimeout after which all requests and connections shall be forcefully terminated

returnscompletion stage which completes successfully with a marker object once all connections have been terminated
24. [**](../../../akka/http/javadsl/ServerBinding.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../akka/http/javadsl/ServerBinding.html#unbind():java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def unbind(): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Asynchronously triggers the unbinding of the port that was bound by the materialization of the `connections`
[akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html)

Asynchronously triggers the unbinding of the port that was bound by the materialization of the `connections`
[akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html)

The produced [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) is fulfilled when the unbinding has been completed.
26. [**](../../../akka/http/javadsl/ServerBinding.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/http/javadsl/ServerBinding.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/http/javadsl/ServerBinding.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/http/javadsl/ServerBinding.html#whenTerminated:java.util.concurrent.CompletionStage[akka.http.javadsl.HttpTerminated] "Permalink")  def whenTerminated: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpTerminated](HttpTerminated.html)]This completion stage completes when the termination process, as initiated by an [terminate](#terminate(hardDeadline:java.time.Duration):java.util.concurrent.CompletionStage[akka.http.javadsl.HttpTerminated]) call has completed.

This completion stage completes when the termination process, as initiated by an [terminate](#terminate(hardDeadline:java.time.Duration):java.util.concurrent.CompletionStage[akka.http.javadsl.HttpTerminated]) call has completed.
This means that the server is by then: unbound, and has closed all existing connections.

This signal can for example be used to safely terminate the underlying ActorSystem.

Note: This mechanism is currently NOT hooked into the Coordinated Shutdown mechanisms of Akka.
 TODO: This feature request is tracked by: https://github.com/akka/akka\-http/issues/1210

Note that this signal may be used for Coordinated Shutdown to proceed to next steps in the shutdown.
You may also explicitly depend on this completion stage to perform your next shutting down steps.
30. [**](../../../akka/http/javadsl/ServerBinding.html#whenTerminationSignalIssued:java.util.concurrent.CompletionStage[java.time.Duration] "Permalink")  def whenTerminationSignalIssued: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)]Completes when the [terminate](#terminate(hardDeadline:java.time.Duration):java.util.concurrent.CompletionStage[akka.http.javadsl.HttpTerminated]) is called and server termination is in progress.

Completes when the [terminate](#terminate(hardDeadline:java.time.Duration):java.util.concurrent.CompletionStage[akka.http.javadsl.HttpTerminated]) is called and server termination is in progress.
Can be useful to make parts of your application aware that termination has been issued,
and they have [java.time.Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html) time remaining to clean\-up before the server will forcefully close
existing connections.

Note that while termination is in progress, no new connections will be accepted (i.e. termination implies prior [unbind](#unbind():java.util.concurrent.CompletionStage[akka.Done])).
### Deprecated Value Members

1. [**](../../../akka/http/javadsl/ServerBinding.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/http/javadsl/ServerBinding.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ServerBinding toStringFormat\[ServerBinding] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/http/javadsl/ServerBinding.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ServerBinding, B)ImplicitThis member is added by an implicit conversion from ServerBinding toArrowAssoc\[ServerBinding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
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
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectHttp$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectHttp.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectHttpImpl.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectHttpsImpl.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectWithHttps.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectionContext$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HandlerProvider.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HostConnectionPool.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/Http$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/Http.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HttpConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HttpTerminated.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/IncomingConnection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/OutgoingConnection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ServerBinding.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ServerBuilder$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ServerBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/TimeoutAccess.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ServerBinding.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ServerBinding.html)*