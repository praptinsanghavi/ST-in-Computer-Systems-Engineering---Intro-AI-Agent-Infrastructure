---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.testkit

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.testkit

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](../client/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](../coding/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](../common/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package testkitDefinition Classes[scaladsl](../index.html)
- [MarshallingTestUtils](MarshallingTestUtils.html)
- [RouteTest](RouteTest.html)
- [RouteTestResultComponent](RouteTestResultComponent.html)
- [RouteTestTimeout](RouteTestTimeout.html)
- [ScalatestRouteTest](ScalatestRouteTest.html)
- [ScalatestUtils](ScalatestUtils.html)
- [Specs2FrameworkInterface](Specs2FrameworkInterface$.html)
- [Specs2RouteTest](Specs2RouteTest.html)
- [Specs2Utils](Specs2Utils.html)
- [TestFrameworkInterface](TestFrameworkInterface.html)
- [WSProbe](WSProbe.html "A WSProbe is a probe that implements a Flow[Message, Message, Unit] for testing websocket code.")
- [WSTestRequestBuilding](WSTestRequestBuilding.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[scaladsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html)

# testkit[**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")

#### package testkit

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/testkit/MarshallingTestUtils.html "Permalink")  trait [MarshallingTestUtils](MarshallingTestUtils.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../akka/http/scaladsl/testkit/RouteTest.html "Permalink")  trait [RouteTest](RouteTest.html) extends [RequestBuilding](../client/RequestBuilding.html) with [WSTestRequestBuilding](WSTestRequestBuilding.html) with [RouteTestResultComponent](RouteTestResultComponent.html) with [MarshallingTestUtils](MarshallingTestUtils.html)
3. [**](../../../../akka/http/scaladsl/testkit/RouteTestResultComponent.html "Permalink")  trait [RouteTestResultComponent](RouteTestResultComponent.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout.html "Permalink")  case class [RouteTestTimeout](RouteTestTimeout.html)(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
5. [**](../../../../akka/http/scaladsl/testkit/ScalatestRouteTest.html "Permalink")  trait [ScalatestRouteTest](ScalatestRouteTest.html) extends [RouteTest](RouteTest.html) with [Scalatest](TestFrameworkInterface$$Scalatest.html) with [ScalatestUtils](ScalatestUtils.html)
6. [**](../../../../akka/http/scaladsl/testkit/ScalatestUtils.html "Permalink")  trait [ScalatestUtils](ScalatestUtils.html) extends [MarshallingTestUtils](MarshallingTestUtils.html)
7. [**](../../../../akka/http/scaladsl/testkit/Specs2RouteTest.html "Permalink")  trait [Specs2RouteTest](Specs2RouteTest.html) extends [RouteTest](RouteTest.html) with [Specs2](Specs2FrameworkInterface$$Specs2.html) with [Specs2Utils](Specs2Utils.html)
8. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html "Permalink")  trait [Specs2Utils](Specs2Utils.html) extends [MarshallingTestUtils](MarshallingTestUtils.html)
9. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface.html "Permalink")  trait [TestFrameworkInterface](TestFrameworkInterface.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
10. [**](../../../../akka/http/scaladsl/testkit/WSProbe.html "Permalink")  trait [WSProbe](WSProbe.html "A WSProbe is a probe that implements a Flow[Message, Message, Unit] for testing websocket code.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A WSProbe is a probe that implements a `Flow[Message, Message, Unit]` for testing
websocket code.

A WSProbe is a probe that implements a `Flow[Message, Message, Unit]` for testing
websocket code.

Requesting elements is handled automatically.
11. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html "Permalink")  trait [WSTestRequestBuilding](WSTestRequestBuilding.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/http/scaladsl/testkit/RouteTest$.html "Permalink")  object [RouteTest](RouteTest$.html)
2. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html "Permalink")  object [RouteTestTimeout](RouteTestTimeout$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
3. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$.html "Permalink")  object [Specs2FrameworkInterface](Specs2FrameworkInterface$.html)
4. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$.html "Permalink")  object [TestFrameworkInterface](TestFrameworkInterface$.html)
5. [**](../../../../akka/http/scaladsl/testkit/WSProbe$.html "Permalink")  object [WSProbe](WSProbe$.html)
6. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding$.html "Permalink")  object [WSTestRequestBuilding](WSTestRequestBuilding$.html) extends [WSTestRequestBuilding](WSTestRequestBuilding.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/MarshallingTestUtils.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTest$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTestResultComponent.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTestTimeout$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTestTimeout.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/ScalatestUtils.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2FrameworkInterface$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2RouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2Utils.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSProbe$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSProbe.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html)*