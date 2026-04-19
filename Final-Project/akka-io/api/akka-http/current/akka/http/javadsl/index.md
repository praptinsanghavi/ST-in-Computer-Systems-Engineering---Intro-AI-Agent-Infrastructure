---
description: Akka HTTP 10.7.4 - akka.http.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
title: Akka HTTP 10.7.4 - akka.http.javadsl
---

# Akka HTTP 10.7.4 - akka.http.javadsl

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/http/index.html "Permalink")  package [http](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/http/caching/index.html "Permalink")  package [caching](../caching/index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/ccompat/index.html "Permalink")  package [ccompat](../ccompat/index.html "INTERNAL API")INTERNAL API

INTERNAL API

Definition Classes[http](../index.html)
- [**](../../../akka/http/impl/index.html "Permalink")  package [impl](../impl/index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/javadsl/index.html "Permalink")  package javadslDefinition Classes[http](../index.html)
- [**](../../../akka/http/javadsl/coding/index.html "Permalink")  package [coding](coding/index.html)
- [**](../../../akka/http/javadsl/common/index.html "Permalink")  package [common](common/index.html)
- [**](../../../akka/http/javadsl/marshallers/index.html "Permalink")  package [marshallers](marshallers/index.html)
- [**](../../../akka/http/javadsl/marshalling/index.html "Permalink")  package [marshalling](marshalling/index.html)
- [**](../../../akka/http/javadsl/model/index.html "Permalink")  package [model](model/index.html)
- [**](../../../akka/http/javadsl/server/index.html "Permalink")  package [server](server/index.html)
- [**](../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](settings/index.html)
- [**](../../../akka/http/javadsl/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
- [**](../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](unmarshalling/index.html)
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
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
- [**](../../../akka/http/jwt/index.html "Permalink")  package [jwt](../jwt/index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/shaded/index.html "Permalink")  package [shaded](../shaded/index.html)Definition Classes[http](../index.html)
p[akka](../../index.html).[http](../index.html)

# javadsl[**](../../../akka/http/javadsl/index.html "Permalink")

#### package javadsl

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/http/javadsl/coding/index.html "Permalink")  package [coding](coding/index.html)
2. [**](../../../akka/http/javadsl/common/index.html "Permalink")  package [common](common/index.html)
3. [**](../../../akka/http/javadsl/marshallers/index.html "Permalink")  package [marshallers](marshallers/index.html)
4. [**](../../../akka/http/javadsl/marshalling/index.html "Permalink")  package [marshalling](marshalling/index.html)
5. [**](../../../akka/http/javadsl/model/index.html "Permalink")  package [model](model/index.html)
6. [**](../../../akka/http/javadsl/server/index.html "Permalink")  package [server](server/index.html)
7. [**](../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](settings/index.html)
8. [**](../../../akka/http/javadsl/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
9. [**](../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](unmarshalling/index.html)
### Type Members

1. [**](../../../akka/http/javadsl/ClientTransport.html "Permalink") abstract  class [ClientTransport](ClientTransport.html "SPI for implementors of custom client transports.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)SPI for implementors of custom client transports.
2. [**](../../../akka/http/javadsl/ConnectHttp.html "Permalink") abstract  class [ConnectHttp](ConnectHttp.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@DoNotInherit()
3. [**](../../../akka/http/javadsl/ConnectHttpImpl.html "Permalink") final  class [ConnectHttpImpl](ConnectHttpImpl.html "INTERNAL API") extends [ConnectHttp](ConnectHttp.html)INTERNAL API

INTERNAL API

Annotations@InternalApi()
4. [**](../../../akka/http/javadsl/ConnectHttpsImpl.html "Permalink") final  class [ConnectHttpsImpl](ConnectHttpsImpl.html "INTERNAL API") extends [ConnectWithHttps](ConnectWithHttps.html)INTERNAL API

INTERNAL API

Annotations@InternalApi()
5. [**](../../../akka/http/javadsl/ConnectWithHttps.html "Permalink") abstract  class [ConnectWithHttps](ConnectWithHttps.html) extends [ConnectHttp](ConnectHttp.html)Annotations@DoNotInherit()
6. [**](../../../akka/http/javadsl/ConnectionContext.html "Permalink") abstract  class [ConnectionContext](ConnectionContext.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@DoNotInherit()
7. [**](../../../akka/http/javadsl/HandlerProvider.html "Permalink")  trait [HandlerProvider](HandlerProvider.html "A HandlerProvider can provide an asynchronous request handler given an ClassicActorSystemProvider.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A HandlerProvider can provide an asynchronous request handler given an ClassicActorSystemProvider.

A HandlerProvider can provide an asynchronous request handler given an ClassicActorSystemProvider.

The main use case for this class is to enable passing a Route to ServerBuilder.bind().
8. [**](../../../akka/http/javadsl/HostConnectionPool.html "Permalink") abstract  class [HostConnectionPool](HostConnectionPool.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@DoNotInherit()
9. [**](../../../akka/http/javadsl/Http.html "Permalink")  class [Http](Http.html) extends [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)
10. [**](../../../akka/http/javadsl/HttpConnectionContext.html "Permalink") abstract  class [HttpConnectionContext](HttpConnectionContext.html) extends [ConnectionContext](ConnectionContext.html)Annotations@DoNotInherit()
11. [**](../../../akka/http/javadsl/HttpTerminated.html "Permalink") abstract  class [HttpTerminated](HttpTerminated.html "Type used to carry meaningful information when server termination has completed successfully.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Type used to carry meaningful information when server termination has completed successfully.

Type used to carry meaningful information when server termination has completed successfully.

Annotations@DoNotInherit()
12. [**](../../../akka/http/javadsl/HttpsConnectionContext.html "Permalink") abstract  class [HttpsConnectionContext](HttpsConnectionContext.html) extends [ConnectionContext](ConnectionContext.html)Annotations@DoNotInherit()
13. [**](../../../akka/http/javadsl/IncomingConnection.html "Permalink")  class [IncomingConnection](IncomingConnection.html "Represents one accepted incoming HTTP connection.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents one accepted incoming HTTP connection.
14. [**](../../../akka/http/javadsl/OutgoingConnection.html "Permalink")  class [OutgoingConnection](OutgoingConnection.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
15. [**](../../../akka/http/javadsl/OutgoingConnectionBuilder.html "Permalink")  trait [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Builder for setting up a flow that will create one single connection per materialization to the specified host.

Builder for setting up a flow that will create one single connection per materialization to the specified host.
When customization is done, the flow is created using \#http(), \#https(), \#http2() or \#http2WithPriorKnowledge().

Not for user extension

Annotations@DoNotInherit()
16. [**](../../../akka/http/javadsl/ServerBinding.html "Permalink")  class [ServerBinding](ServerBinding.html "Represents a prospective HTTP server binding.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents a prospective HTTP server binding.
17. [**](../../../akka/http/javadsl/ServerBuilder.html "Permalink")  trait [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Builder API to create server bindings.

Builder API to create server bindings.

Use Http.newServerAt() to create a builder, use methods to customize settings,
and then call one of the bind\* methods to bind a server.
18. [**](../../../akka/http/javadsl/TimeoutAccess.html "Permalink")  trait [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Enables programmatic access to the server\-side request timeout logic.

Enables programmatic access to the server\-side request timeout logic.

Not for user extension.

Annotations@DoNotInherit()
### Value Members

1. [**](../../../akka/http/javadsl/ClientTransport$.html "Permalink")  object [ClientTransport](ClientTransport$.html "Entry point to create or access predefined client transports.")Entry point to create or access predefined client transports.
2. [**](../../../akka/http/javadsl/ConnectHttp$.html "Permalink")  object [ConnectHttp](ConnectHttp$.html)
3. [**](../../../akka/http/javadsl/ConnectionContext$.html "Permalink")  object [ConnectionContext](ConnectionContext$.html)
4. [**](../../../akka/http/javadsl/Http$.html "Permalink")  object [Http](Http$.html) extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[Http](Http.html)] with [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)
5. [**](../../../akka/http/javadsl/ServerBuilder$.html "Permalink")  object [ServerBuilder](ServerBuilder$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-http/current/akka/http/caching/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/ccompat/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/impl/index.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/jwt/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/shaded/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html)*