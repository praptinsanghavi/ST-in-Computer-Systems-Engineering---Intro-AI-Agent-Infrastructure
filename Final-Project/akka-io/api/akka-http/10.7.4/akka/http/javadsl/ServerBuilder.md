---
description: Akka HTTP 10.7.4 - akka.http.javadsl.ServerBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:04:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ServerBuilder.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.ServerBuilder
---

# Akka HTTP 10.7.4 - akka.http.javadsl.ServerBuilder

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.ServerBuilder

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
- [ServerBinding](ServerBinding.html "Represents a prospective HTTP server binding.")
- ServerBuilder
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
[t](ServerBuilder$.html "See companion object")[akka](../../index.html).[http](../index.html).[javadsl](index.html)

# [ServerBuilder](ServerBuilder$.html "See companion object")[**](../../../akka/http/javadsl/ServerBuilder.html "Permalink")

### Companion [object ServerBuilder](ServerBuilder$.html "See companion object")

#### trait ServerBuilder extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Builder API to create server bindings.

Use Http.newServerAt() to create a builder, use methods to customize settings,
and then call one of the bind\* methods to bind a server.

Source[ServerBuilder.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/ServerBuilder.scala#L30)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServerBuilder
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

1. [**](../../../akka/http/javadsl/ServerBuilder.html#adaptSettings(f:akka.japi.function.Function[akka.http.javadsl.settings.ServerSettings,akka.http.javadsl.settings.ServerSettings]):akka.http.javadsl.ServerBuilder "Permalink") abstract  def adaptSettings(f: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html#akka.japi.function.Function)\[[ServerSettings](settings/ServerSettings.html), [ServerSettings](settings/ServerSettings.html)]): ServerBuilderAdapt the current configured settings with a function.
2. [**](../../../akka/http/javadsl/ServerBuilder.html#bind(handlerProvider:akka.http.javadsl.HandlerProvider):java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding] "Permalink") abstract  def bind(handlerProvider: [HandlerProvider](HandlerProvider.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]Bind a new HTTP server and use the given handler provider to create an asynchronous `handler`
[akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) for processing all incoming connections.

Bind a new HTTP server and use the given handler provider to create an asynchronous `handler`
[akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) for processing all incoming connections.

Most importantly, you can pass a Route to this method because Route implements HandlerProvider.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

Supports HTTP/2 on the same port if http2 support is enabled.
3. [**](../../../akka/http/javadsl/ServerBuilder.html#bind(f:akka.japi.function.Function[akka.http.javadsl.model.HttpRequest,java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]]):java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding] "Permalink") abstract  def bind(f: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html#akka.japi.function.Function)\[[HttpRequest](model/HttpRequest.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](model/HttpResponse.html)]]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]Bind a new HTTP server and use the given asynchronous `handler`
[akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) for processing all incoming connections.

Bind a new HTTP server and use the given asynchronous `handler`
[akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

Supports HTTP/2 on the same port if http2 support is enabled.
4. [**](../../../akka/http/javadsl/ServerBuilder.html#bindFlow(handlerFlow:akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,_]):java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding] "Permalink") abstract  def bindFlow(handlerFlow: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), \_]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]Binds a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

Binds a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.
5. [**](../../../akka/http/javadsl/ServerBuilder.html#bindSync(f:akka.japi.function.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse]):java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding] "Permalink") abstract  def bindSync(f: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html#akka.japi.function.Function)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html)]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]Bind a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) for processing all incoming connections.

Bind a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

Supports HTTP/2 on the same port if http2 support is enabled.
6. [**](../../../akka/http/javadsl/ServerBuilder.html#connectionSource():akka.stream.javadsl.Source[akka.http.javadsl.IncomingConnection,java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding]] "Permalink") abstract  def connectionSource(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[IncomingConnection](IncomingConnection.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]]Creates a [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) of [akka.http.javadsl.IncomingConnection](IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

Creates a [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) of [akka.http.javadsl.IncomingConnection](IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

Note that each materialization will create a new binding, so

 \* if the configured port is 0 the resulting source can be materialized several times. Each materialization will
then be assigned a new local port by the operating system, which can then be retrieved by the materialized
[akka.http.javadsl.ServerBinding](ServerBinding.html).

 \* if the configured port is non\-zero subsequent materialization attempts of the produced source will immediately
fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
[akka.http.javadsl.ServerBinding](ServerBinding.html).
7. [**](../../../akka/http/javadsl/ServerBuilder.html#enableHttps(context:akka.http.javadsl.HttpsConnectionContext):akka.http.javadsl.ServerBuilder "Permalink") abstract  def enableHttps(context: [HttpsConnectionContext](HttpsConnectionContext.html)): ServerBuilderEnable HTTPS for this binding with the given context.
8. [**](../../../akka/http/javadsl/ServerBuilder.html#logTo(log:akka.event.LoggingAdapter):akka.http.javadsl.ServerBuilder "Permalink") abstract  def logTo(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): ServerBuilderUse a custom logger
9. [**](../../../akka/http/javadsl/ServerBuilder.html#onInterface(interface:String):akka.http.javadsl.ServerBuilder "Permalink") abstract  def onInterface(interface: String): ServerBuilderChange interface to bind to
10. [**](../../../akka/http/javadsl/ServerBuilder.html#onPort(port:Int):akka.http.javadsl.ServerBuilder "Permalink") abstract  def onPort(port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ServerBuilderChange port to bind to
11. [**](../../../akka/http/javadsl/ServerBuilder.html#withMaterializer(materializer:akka.stream.Materializer):akka.http.javadsl.ServerBuilder "Permalink") abstract  def withMaterializer(materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): ServerBuilderUse custom Materializer for the binding
12. [**](../../../akka/http/javadsl/ServerBuilder.html#withSettings(settings:akka.http.javadsl.settings.ServerSettings):akka.http.javadsl.ServerBuilder "Permalink") abstract  def withSettings(settings: [ServerSettings](settings/ServerSettings.html)): ServerBuilderUse custom ServerSettings for the binding.
### Concrete Value Members

1. [**](../../../akka/http/javadsl/ServerBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/javadsl/ServerBuilder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/javadsl/ServerBuilder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ServerBuilder toany2stringadd\[ServerBuilder] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/http/javadsl/ServerBuilder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ServerBuilder, B)ImplicitThis member is added by an implicit conversion from ServerBuilder toArrowAssoc\[ServerBuilder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/http/javadsl/ServerBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/http/javadsl/ServerBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/http/javadsl/ServerBuilder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/http/javadsl/ServerBuilder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ServerBuilder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerBuilderImplicitThis member is added by an implicit conversion from ServerBuilder toEnsuring\[ServerBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/http/javadsl/ServerBuilder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ServerBuilder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerBuilderImplicitThis member is added by an implicit conversion from ServerBuilder toEnsuring\[ServerBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/http/javadsl/ServerBuilder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerBuilderImplicitThis member is added by an implicit conversion from ServerBuilder toEnsuring\[ServerBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/http/javadsl/ServerBuilder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerBuilderImplicitThis member is added by an implicit conversion from ServerBuilder toEnsuring\[ServerBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/http/javadsl/ServerBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/http/javadsl/ServerBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/http/javadsl/ServerBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/http/javadsl/ServerBuilder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/http/javadsl/ServerBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/http/javadsl/ServerBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/http/javadsl/ServerBuilder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/http/javadsl/ServerBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/http/javadsl/ServerBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/http/javadsl/ServerBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/http/javadsl/ServerBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/http/javadsl/ServerBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/http/javadsl/ServerBuilder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/http/javadsl/ServerBuilder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/http/javadsl/ServerBuilder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ServerBuilder toStringFormat\[ServerBuilder] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/http/javadsl/ServerBuilder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ServerBuilder, B)ImplicitThis member is added by an implicit conversion from ServerBuilder toArrowAssoc\[ServerBuilder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromServerBuilder to any2stringadd\[ServerBuilder]

### Inherited by implicit conversion StringFormat fromServerBuilder to StringFormat\[ServerBuilder]

### Inherited by implicit conversion Ensuring fromServerBuilder to Ensuring\[ServerBuilder]

### Inherited by implicit conversion ArrowAssoc fromServerBuilder to ArrowAssoc\[ServerBuilder]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectHttp$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectHttp.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectHttpImpl.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectHttpsImpl.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectWithHttps.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectionContext$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HandlerProvider.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HostConnectionPool.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/Http$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/Http.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HttpConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HttpTerminated.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/IncomingConnection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/OutgoingConnection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ServerBinding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ServerBuilder$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ServerBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/TimeoutAccess.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/coding/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ServerBuilder.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ServerBuilder.html)*