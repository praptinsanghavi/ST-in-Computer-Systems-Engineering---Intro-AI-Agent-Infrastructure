---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.ServerBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ServerBuilder.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.ServerBuilder
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.ServerBuilder

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.ServerBuilder

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/http/index.html "Permalink")  package [http](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](client/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](coding/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](common/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](marshallers/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](marshalling/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](model/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](server/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](settings/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](unmarshalling/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](util/index.html)Definition Classes[scaladsl](index.html)
- [ClientTransport](ClientTransport.html "Abstraction to allow the creation of alternative transports to run HTTP on.")
- [ConnectionContext](ConnectionContext.html)
- [Http](Http$.html)
- [HttpConnectionContext](HttpConnectionContext.html)
- [HttpExt](HttpExt.html "Akka extension for HTTP which serves as the main entry point into akka-http.")
- [HttpsConnectionContext](HttpsConnectionContext.html "Context with all information needed to set up a HTTPS connection")
- [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.")
- ServerBuilder
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
t[akka](../../index.html).[http](../index.html).[scaladsl](index.html)

# ServerBuilder[**](../../../akka/http/scaladsl/ServerBuilder.html "Permalink")

### 

#### trait ServerBuilder extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Builder API to create server bindings.

Use HttpExt.newServerAt() to create a builder, use methods to customize settings,
and then call one of the bind\* methods to bind a server.

Source[ServerBuilder.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/ServerBuilder.scala#L26)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
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

1. [**](../../../akka/http/scaladsl/ServerBuilder.html#adaptSettings(f:akka.http.scaladsl.settings.ServerSettings=>akka.http.scaladsl.settings.ServerSettings):akka.http.scaladsl.ServerBuilder "Permalink") abstract  def adaptSettings(f: ([ServerSettings](settings/ServerSettings.html)) \=\> [ServerSettings](settings/ServerSettings.html)): ServerBuilderAdapt the current configured settings with a function.
2. [**](../../../akka/http/scaladsl/ServerBuilder.html#bind(f:akka.http.scaladsl.model.HttpRequest=>scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]):scala.concurrent.Future[akka.http.scaladsl.Http.ServerBinding] "Permalink") abstract  def bind(f: ([HttpRequest](model/HttpRequest.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](model/HttpResponse.html)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Http$$ServerBinding.html)]Bind a new HTTP server at the given endpoint and use the given asynchronous `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

Bind a new HTTP server at the given endpoint and use the given asynchronous `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

Supports HTTP/2 on the same port if http2 support is enabled.
3. [**](../../../akka/http/scaladsl/ServerBuilder.html#bindFlow(handlerFlow:akka.stream.scaladsl.Flow[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse,_]):scala.concurrent.Future[akka.http.scaladsl.Http.ServerBinding] "Permalink") abstract  def bindFlow(handlerFlow: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), \_]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Http$$ServerBinding.html)]Binds a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

Binds a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.
4. [**](../../../akka/http/scaladsl/ServerBuilder.html#bindSync(f:akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpResponse):scala.concurrent.Future[akka.http.scaladsl.Http.ServerBinding] "Permalink") abstract  def bindSync(f: ([HttpRequest](model/HttpRequest.html)) \=\> [HttpResponse](model/HttpResponse.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Http$$ServerBinding.html)]Bind a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

Bind a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

Supports HTTP/2 on the same port if http2 support is enabled.
5. [**](../../../akka/http/scaladsl/ServerBuilder.html#connectionSource():akka.stream.scaladsl.Source[akka.http.scaladsl.Http.IncomingConnection,scala.concurrent.Future[akka.http.scaladsl.Http.ServerBinding]] "Permalink") abstract  def connectionSource(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[IncomingConnection](Http$$IncomingConnection.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Http$$ServerBinding.html)]]Creates a [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of [akka.http.scaladsl.Http.IncomingConnection](Http$$IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

Creates a [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of [akka.http.scaladsl.Http.IncomingConnection](Http$$IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

Note that each materialization will create a new binding, so

 \* if the configured port is 0 the resulting source can be materialized several times. Each materialization will
then be assigned a new local port by the operating system, which can then be retrieved by the materialized
[akka.http.scaladsl.Http.ServerBinding](Http$$ServerBinding.html).

 \* if the configured port is non\-zero subsequent materialization attempts of the produced source will immediately
fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
[akka.http.scaladsl.Http.ServerBinding](Http$$ServerBinding.html).
6. [**](../../../akka/http/scaladsl/ServerBuilder.html#enableHttps(context:akka.http.scaladsl.HttpsConnectionContext):akka.http.scaladsl.ServerBuilder "Permalink") abstract  def enableHttps(context: [HttpsConnectionContext](HttpsConnectionContext.html)): ServerBuilderEnable HTTPS for this binding with the given context.
7. [**](../../../akka/http/scaladsl/ServerBuilder.html#logTo(log:akka.event.LoggingAdapter):akka.http.scaladsl.ServerBuilder "Permalink") abstract  def logTo(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): ServerBuilderUse a custom logger
8. [**](../../../akka/http/scaladsl/ServerBuilder.html#onInterface(interface:String):akka.http.scaladsl.ServerBuilder "Permalink") abstract  def onInterface(interface: String): ServerBuilderChange interface to bind to
9. [**](../../../akka/http/scaladsl/ServerBuilder.html#onPort(port:Int):akka.http.scaladsl.ServerBuilder "Permalink") abstract  def onPort(port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ServerBuilderChange port to bind to
10. [**](../../../akka/http/scaladsl/ServerBuilder.html#withMaterializer(materializer:akka.stream.Materializer):akka.http.scaladsl.ServerBuilder "Permalink") abstract  def withMaterializer(materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): ServerBuilderUse custom Materializer for the binding
11. [**](../../../akka/http/scaladsl/ServerBuilder.html#withSettings(settings:akka.http.scaladsl.settings.ServerSettings):akka.http.scaladsl.ServerBuilder "Permalink") abstract  def withSettings(settings: [ServerSettings](settings/ServerSettings.html)): ServerBuilderUse custom ServerSettings for the binding.
### Concrete Value Members

1. [**](../../../akka/http/scaladsl/ServerBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/scaladsl/ServerBuilder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/scaladsl/ServerBuilder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ServerBuilder toany2stringadd\[ServerBuilder] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/http/scaladsl/ServerBuilder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ServerBuilder, B)ImplicitThis member is added by an implicit conversion from ServerBuilder toArrowAssoc\[ServerBuilder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/http/scaladsl/ServerBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/http/scaladsl/ServerBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/http/scaladsl/ServerBuilder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/http/scaladsl/ServerBuilder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ServerBuilder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerBuilderImplicitThis member is added by an implicit conversion from ServerBuilder toEnsuring\[ServerBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/http/scaladsl/ServerBuilder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ServerBuilder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerBuilderImplicitThis member is added by an implicit conversion from ServerBuilder toEnsuring\[ServerBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/http/scaladsl/ServerBuilder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServerBuilderImplicitThis member is added by an implicit conversion from ServerBuilder toEnsuring\[ServerBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/http/scaladsl/ServerBuilder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServerBuilderImplicitThis member is added by an implicit conversion from ServerBuilder toEnsuring\[ServerBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/http/scaladsl/ServerBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/http/scaladsl/ServerBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/http/scaladsl/ServerBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/http/scaladsl/ServerBuilder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/http/scaladsl/ServerBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/http/scaladsl/ServerBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/http/scaladsl/ServerBuilder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/http/scaladsl/ServerBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/http/scaladsl/ServerBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/http/scaladsl/ServerBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/http/scaladsl/ServerBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/http/scaladsl/ServerBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/http/scaladsl/ServerBuilder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/http/scaladsl/ServerBuilder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/http/scaladsl/ServerBuilder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ServerBuilder toStringFormat\[ServerBuilder] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/http/scaladsl/ServerBuilder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ServerBuilder, B)ImplicitThis member is added by an implicit conversion from ServerBuilder toArrowAssoc\[ServerBuilder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromServerBuilder to any2stringadd\[ServerBuilder]

### Inherited by implicit conversion StringFormat fromServerBuilder to StringFormat\[ServerBuilder]

### Inherited by implicit conversion Ensuring fromServerBuilder to Ensuring\[ServerBuilder]

### Inherited by implicit conversion ArrowAssoc fromServerBuilder to ArrowAssoc\[ServerBuilder]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ConnectionContext$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$IncomingConnection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$ServerBinding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpConnectionContext$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ServerBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/TimeoutAccess.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ServerBuilder.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ServerBuilder.html)*