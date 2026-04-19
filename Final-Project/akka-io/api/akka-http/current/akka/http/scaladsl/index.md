---
description: Akka HTTP 10.7.4 - akka.http.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl
---

# Akka HTTP 10.7.4 - akka.http.scaladsl

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl

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
- [**](../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/jwt/index.html "Permalink")  package [jwt](../jwt/index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[http](../index.html)
- [**](../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](client/index.html)
- [**](../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](coding/index.html)
- [**](../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](common/index.html)
- [**](../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](marshallers/index.html)
- [**](../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](marshalling/index.html)
- [**](../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](model/index.html)
- [**](../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](server/index.html)
- [**](../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](settings/index.html)
- [**](../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
- [**](../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](unmarshalling/index.html)
- [**](../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](util/index.html)
- [ClientTransport](ClientTransport.html "Abstraction to allow the creation of alternative transports to run HTTP on.")
- [ConnectionContext](ConnectionContext.html)
- [Http](Http$.html)
- [HttpConnectionContext](HttpConnectionContext.html)
- [HttpExt](HttpExt.html "Akka extension for HTTP which serves as the main entry point into akka-http.")
- [HttpsConnectionContext](HttpsConnectionContext.html "Context with all information needed to set up a HTTPS connection")
- [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.")
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
- [**](../../../akka/http/shaded/index.html "Permalink")  package [shaded](../shaded/index.html)Definition Classes[http](../index.html)
p[akka](../../index.html).[http](../index.html)

# scaladsl[**](../../../akka/http/scaladsl/index.html "Permalink")

#### package scaladsl

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](client/index.html)
2. [**](../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](coding/index.html)
3. [**](../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](common/index.html)
4. [**](../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](marshallers/index.html)
5. [**](../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](marshalling/index.html)
6. [**](../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](model/index.html)
7. [**](../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](server/index.html)
8. [**](../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](settings/index.html)
9. [**](../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
10. [**](../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](unmarshalling/index.html)
11. [**](../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](util/index.html)
### Type Members

1. [**](../../../akka/http/scaladsl/ClientTransport.html "Permalink")  trait [ClientTransport](ClientTransport.html "Abstraction to allow the creation of alternative transports to run HTTP on.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Abstraction to allow the creation of alternative transports to run HTTP on.

Abstraction to allow the creation of alternative transports to run HTTP on.

SPI for implementors of custom client transports.
2. [**](../../../akka/http/scaladsl/ConnectionContext.html "Permalink")  trait [ConnectionContext](ConnectionContext.html) extends [javadsl.ConnectionContext](../javadsl/ConnectionContext.html)
3. [**](../../../akka/http/scaladsl/HttpConnectionContext.html "Permalink") sealed  class [HttpConnectionContext](HttpConnectionContext.html) extends [javadsl.HttpConnectionContext](../javadsl/HttpConnectionContext.html) with [ConnectionContext](ConnectionContext.html)
4. [**](../../../akka/http/scaladsl/HttpExt.html "Permalink")  class [HttpExt](HttpExt.html "Akka extension for HTTP which serves as the main entry point into akka-http.") extends [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)Akka extension for HTTP which serves as the main entry point into akka\-http.

Akka extension for HTTP which serves as the main entry point into akka\-http.

Use as `Http().bindAndHandle` etc. with an implicit ActorSystem in scope.

Annotations@DoNotInherit()
5. [**](../../../akka/http/scaladsl/HttpsConnectionContext.html "Permalink") final  class [HttpsConnectionContext](HttpsConnectionContext.html "Context with all information needed to set up a HTTPS connection") extends [javadsl.HttpsConnectionContext](../javadsl/HttpsConnectionContext.html) with [ConnectionContext](ConnectionContext.html) Context with all information needed to set up a HTTPS connection

 Context with all information needed to set up a HTTPS connection

This constructor is INTERNAL API, use ConnectionContext.httpsClient instead

Annotations@InternalApi()
6. [**](../../../akka/http/scaladsl/OutgoingConnectionBuilder.html "Permalink")  trait [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Builder for setting up a flow that will create one single connection per materialization to the specified host.

Builder for setting up a flow that will create one single connection per materialization to the specified host.
When customization is done, the flow is created using \#http(), \#https(), \#http2() or \#http2WithPriorKnowledge().

Not for user extension

Annotations@DoNotInherit()
7. [**](../../../akka/http/scaladsl/ServerBuilder.html "Permalink")  trait [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Builder API to create server bindings.

Builder API to create server bindings.

Use HttpExt.newServerAt() to create a builder, use methods to customize settings,
and then call one of the bind\* methods to bind a server.
8. [**](../../../akka/http/scaladsl/TimeoutAccess.html "Permalink")  trait [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.") extends [javadsl.TimeoutAccess](../javadsl/TimeoutAccess.html)Enables programmatic access to the server\-side request timeout logic.

Enables programmatic access to the server\-side request timeout logic.

Not for user extension.

Annotations@DoNotInherit()
### Value Members

1. [**](../../../akka/http/scaladsl/ClientTransport$.html "Permalink")  object [ClientTransport](ClientTransport$.html "Entry point to create or access predefined client transports.")Entry point to create or access predefined client transports.
2. [**](../../../akka/http/scaladsl/ConnectionContext$.html "Permalink")  object [ConnectionContext](ConnectionContext$.html)
3. [**](../../../akka/http/scaladsl/Http$.html "Permalink")  object [Http](Http$.html) extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[HttpExt](HttpExt.html)] with [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)
4. [**](../../../akka/http/scaladsl/HttpConnectionContext$.html "Permalink")  object [HttpConnectionContext](HttpConnectionContext$.html) extends [HttpConnectionContext](HttpConnectionContext.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-http/current/akka/http/caching/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/ccompat/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/impl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HttpConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/TimeoutAccess.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/jwt/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ConnectionContext$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpConnectionContext$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ServerBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/TimeoutAccess.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/shaded/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html)*