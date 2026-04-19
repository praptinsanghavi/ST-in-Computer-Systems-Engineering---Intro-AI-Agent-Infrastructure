---
description: Akka HTTP 10.7.4 - akka.http.javadsl.testkit
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:43:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/index.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.testkit
---

# Akka HTTP 10.7.4 - akka.http.javadsl.testkit

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.testkit

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/coding/index.html "Permalink")  package [coding](../coding/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/common/index.html "Permalink")  package [common](../common/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/testkit/index.html "Permalink")  package testkitDefinition Classes[javadsl](../index.html)
- [ActorSystemResource](ActorSystemResource.html)
- [DefaultHostInfo](DefaultHostInfo.html)
- [JUnitRouteTest](JUnitRouteTest.html)
- [JUnitRouteTestBase](JUnitRouteTestBase.html "A RouteTest that uses JUnit assertions.")
- [RouteTest](RouteTest.html "A base class to create route tests for testing libraries.")
- [TestRoute](TestRoute.html "A wrapped route that has a run method to run a request through the underlying route to create a TestResponse.")
- [TestRouteResult](TestRouteResult.html "A wrapper for route results.")
- [WSProbe](WSProbe.html "A WSProbe is a probe that implements a Flow[Message, Message, Unit] for testing websocket code.")
- [WSTestRequestBuilding](WSTestRequestBuilding.html)
- [**](../../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[javadsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html)

# testkit[**](../../../../akka/http/javadsl/testkit/index.html "Permalink")

#### package testkit

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/javadsl/testkit/ActorSystemResource.html "Permalink")  class [ActorSystemResource](ActorSystemResource.html) extends [ExternalResource](https://javadoc.io/page/junit/junit/4.13.2/org/junit/rules/ExternalResource.html#org.junit.rules.ExternalResource)
2. [**](../../../../akka/http/javadsl/testkit/DefaultHostInfo.html "Permalink") final  case class [DefaultHostInfo](DefaultHostInfo.html)(host: [Host](../model/headers/Host.html), securedConnection: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../../../akka/http/javadsl/testkit/JUnitRouteTest.html "Permalink") abstract  class [JUnitRouteTest](JUnitRouteTest.html) extends [JUnitRouteTestBase](JUnitRouteTestBase.html)
4. [**](../../../../akka/http/javadsl/testkit/JUnitRouteTestBase.html "Permalink") abstract  class [JUnitRouteTestBase](JUnitRouteTestBase.html "A RouteTest that uses JUnit assertions.") extends [RouteTest](RouteTest.html)A RouteTest that uses JUnit assertions.

A RouteTest that uses JUnit assertions. ActorSystem and Materializer are provided as an [org.junit.rules.ExternalResource](https://javadoc.io/page/junit/junit/4.13.2/org/junit/rules/ExternalResource.html)
and their lifetime is automatically managed.
5. [**](../../../../akka/http/javadsl/testkit/RouteTest.html "Permalink") abstract  class [RouteTest](RouteTest.html "A base class to create route tests for testing libraries.") extends [AllDirectives](../server/AllDirectives.html) with [WSTestRequestBuilding](WSTestRequestBuilding.html)A base class to create route tests for testing libraries.

A base class to create route tests for testing libraries. An implementation needs to provide
code to provide and shutdown an [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html), [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html), and [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html).

See `JUnitRouteTest` for an example of a concrete implementation.
6. [**](../../../../akka/http/javadsl/testkit/TestRoute.html "Permalink")  trait [TestRoute](TestRoute.html "A wrapped route that has a run method to run a request through the underlying route to create a TestResponse.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A wrapped route that has a `run` method to run a request through the underlying route to create
a TestResponse.

A wrapped route that has a `run` method to run a request through the underlying route to create
a TestResponse.

A TestRoute is created by deriving a test class from the concrete RouteTest implementation for your
testing framework (like [JUnitRouteTest](JUnitRouteTest.html) for JUnit) and then using its `testRoute` method to wrap
a route with testing support.
7. [**](../../../../akka/http/javadsl/testkit/TestRouteResult.html "Permalink") abstract  class [TestRouteResult](TestRouteResult.html "A wrapper for route results.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A wrapper for route results.

A wrapper for route results.

To support the testkit API, a third\-party testing library needs to implement this class and provide
implementations for the abstract assertion methods.
8. [**](../../../../akka/http/javadsl/testkit/WSProbe.html "Permalink")  class [WSProbe](WSProbe.html "A WSProbe is a probe that implements a Flow[Message, Message, Unit] for testing websocket code.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A WSProbe is a probe that implements a `Flow[Message, Message, Unit]` for testing
websocket code.

A WSProbe is a probe that implements a `Flow[Message, Message, Unit]` for testing
websocket code.

Requesting elements is handled automatically.
9. [**](../../../../akka/http/javadsl/testkit/WSTestRequestBuilding.html "Permalink")  trait [WSTestRequestBuilding](WSTestRequestBuilding.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/http/javadsl/testkit/WSProbe$.html "Permalink")  object [WSProbe](WSProbe$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Host.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/AllDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/ActorSystemResource.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/DefaultHostInfo.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/JUnitRouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/JUnitRouteTestBase.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/RouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/TestRoute.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/TestRouteResult.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/WSProbe$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/WSProbe.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/WSTestRequestBuilding.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/index.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/index.html)*