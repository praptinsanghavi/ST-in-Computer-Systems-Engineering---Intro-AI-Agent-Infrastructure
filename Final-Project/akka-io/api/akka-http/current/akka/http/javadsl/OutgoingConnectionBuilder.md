---
description: Akka HTTP 10.7.4 - akka.http.javadsl.OutgoingConnectionBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:44:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/OutgoingConnectionBuilder.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.OutgoingConnectionBuilder
---

# Akka HTTP 10.7.4 - akka.http.javadsl.OutgoingConnectionBuilder

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.OutgoingConnectionBuilder

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
- OutgoingConnectionBuilder
- [ServerBinding](ServerBinding.html "Represents a prospective HTTP server binding.")
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
t[akka](../../index.html).[http](../index.html).[javadsl](index.html)

# OutgoingConnectionBuilder[**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html "Permalink")

### 

#### trait OutgoingConnectionBuilder extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Builder for setting up a flow that will create one single connection per materialization to the specified host.
When customization is done, the flow is created using \#http(), \#https(), \#http2() or \#http2WithPriorKnowledge().

Not for user extension

Annotations@DoNotInherit() Source[OutgoingConnectionBuilder.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/OutgoingConnectionBuilder.scala#L25)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. OutgoingConnectionBuilder
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
### Abstract Value Members

1. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#http():akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,java.util.concurrent.CompletionStage[akka.http.javadsl.OutgoingConnection]] "Permalink") abstract  def http(): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](OutgoingConnection.html)]]Create a flow that when materialized creates a single HTTP/1\.1 plaintext connection with a default port 80 to the server.
2. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#http2():akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,java.util.concurrent.CompletionStage[akka.http.javadsl.OutgoingConnection]] "Permalink") abstract  def http2(): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](OutgoingConnection.html)]]Create a flow that when materialized creates a single HTTP/2 TLS connection with a default port 443

Create a flow that when materialized creates a single HTTP/2 TLS connection with a default port 443

Note that the responses are not guaranteed to arrive in the same order as the requests go out (In the case of a HTTP/2 connection)
so therefore requests needs to have a [akka.http.scaladsl.model.RequestResponseAssociation](../scaladsl/model/RequestResponseAssociation.html)
which Akka HTTP will carry over to the corresponding response for a request.
3. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#http2WithPriorKnowledge():akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,java.util.concurrent.CompletionStage[akka.http.javadsl.OutgoingConnection]] "Permalink") abstract  def http2WithPriorKnowledge(): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](OutgoingConnection.html)]]Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80

Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80

Note that the responses are not guaranteed to arrive in the same order as the requests go out (In the case of a HTTP/2 connection)
so therefore requests needs to have a [akka.http.scaladsl.model.RequestResponseAssociation](../scaladsl/model/RequestResponseAssociation.html)
which Akka HTTP will carry over to the corresponding response for a request.
4. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#https():akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,java.util.concurrent.CompletionStage[akka.http.javadsl.OutgoingConnection]] "Permalink") abstract  def https(): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](OutgoingConnection.html)]]Create a flow that when materialized creates a single HTTP/1\.1 TLS connection with a default port 443
5. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#logTo(logger:akka.event.LoggingAdapter):akka.http.javadsl.OutgoingConnectionBuilder "Permalink") abstract  def logTo(logger: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): OutgoingConnectionBuilderUse a custom logger
6. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#managedPersistentHttp2():akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,akka.NotUsed] "Permalink") abstract  def managedPersistentHttp2(): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Create a flow that when materialized creates a managed HTTP/2 TLS connection with a default port 443\.

Create a flow that when materialized creates a managed HTTP/2 TLS connection with a default port 443\.

The connection will be re\-established as needed.

Note that the responses are not guaranteed to arrive in the same order as the requests go out
so therefore requests needs to have a [akka.http.scaladsl.model.RequestResponseAssociation](../scaladsl/model/RequestResponseAssociation.html)
which Akka HTTP will carry over to the corresponding response for a request.

Annotations@ApiMayChange()
7. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#managedPersistentHttp2WithPriorKnowledge():akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,akka.NotUsed] "Permalink") abstract  def managedPersistentHttp2WithPriorKnowledge(): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80

Create a flow that when materialized creates a single HTTP/2 with 'prior knowledge' plaintext connection with a default port 80

The connection will be re\-established as needed.

Note that the responses are not guaranteed to arrive in the same order as the requests go out (In the case of a HTTP/2 connection)
so therefore requests needs to have a [akka.http.scaladsl.model.RequestResponseAssociation](../scaladsl/model/RequestResponseAssociation.html)
which Akka HTTP will carry over to the corresponding response for a request.

Annotations@ApiMayChange()
8. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#toHost(host:String):akka.http.javadsl.OutgoingConnectionBuilder "Permalink") abstract  def toHost(host: String): OutgoingConnectionBuilderChange which host flows built with this builder connects to
9. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#toPort(port:Int):akka.http.javadsl.OutgoingConnectionBuilder "Permalink") abstract  def toPort(port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): OutgoingConnectionBuilderChange with port flows built with this builder connects to, if not set
the protocol default is used.
10. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#withClientConnectionSettings(settings:akka.http.javadsl.settings.ClientConnectionSettings):akka.http.javadsl.OutgoingConnectionBuilder "Permalink") abstract  def withClientConnectionSettings(settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html)): OutgoingConnectionBuilderUse custom ClientConnectionSettings for the connection.
11. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#withCustomHttpsConnectionContext(httpsConnectionContext:akka.http.javadsl.HttpsConnectionContext):akka.http.javadsl.OutgoingConnectionBuilder "Permalink") abstract  def withCustomHttpsConnectionContext(httpsConnectionContext: [HttpsConnectionContext](HttpsConnectionContext.html)): OutgoingConnectionBuilderUse a custom [HttpsConnectionContext](HttpsConnectionContext.html) for the connection.

Use a custom [HttpsConnectionContext](HttpsConnectionContext.html) for the connection.
Only applicable for `https()` and `http2()`, overrides `defaultHttpsContext`
### Concrete Value Members

1. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from OutgoingConnectionBuilder toany2stringadd\[OutgoingConnectionBuilder] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (OutgoingConnectionBuilder, B)ImplicitThis member is added by an implicit conversion from OutgoingConnectionBuilder toArrowAssoc\[OutgoingConnectionBuilder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (OutgoingConnectionBuilder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OutgoingConnectionBuilderImplicitThis member is added by an implicit conversion from OutgoingConnectionBuilder toEnsuring\[OutgoingConnectionBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (OutgoingConnectionBuilder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OutgoingConnectionBuilderImplicitThis member is added by an implicit conversion from OutgoingConnectionBuilder toEnsuring\[OutgoingConnectionBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OutgoingConnectionBuilderImplicitThis member is added by an implicit conversion from OutgoingConnectionBuilder toEnsuring\[OutgoingConnectionBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OutgoingConnectionBuilderImplicitThis member is added by an implicit conversion from OutgoingConnectionBuilder toEnsuring\[OutgoingConnectionBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from OutgoingConnectionBuilder toStringFormat\[OutgoingConnectionBuilder] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (OutgoingConnectionBuilder, B)ImplicitThis member is added by an implicit conversion from OutgoingConnectionBuilder toArrowAssoc\[OutgoingConnectionBuilder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromOutgoingConnectionBuilder to any2stringadd\[OutgoingConnectionBuilder]

### Inherited by implicit conversion StringFormat fromOutgoingConnectionBuilder to StringFormat\[OutgoingConnectionBuilder]

### Inherited by implicit conversion Ensuring fromOutgoingConnectionBuilder to Ensuring\[OutgoingConnectionBuilder]

### Inherited by implicit conversion ArrowAssoc fromOutgoingConnectionBuilder to ArrowAssoc\[OutgoingConnectionBuilder]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/RequestResponseAssociation.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/OutgoingConnectionBuilder.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/OutgoingConnectionBuilder.html)*