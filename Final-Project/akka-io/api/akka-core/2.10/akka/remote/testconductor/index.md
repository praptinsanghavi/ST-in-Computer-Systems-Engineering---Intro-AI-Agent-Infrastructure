---
description: Akka 2.10.17 - akka.remote.testconductor
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testconductor/index.html
title: Akka 2.10.17 - akka.remote.testconductor
---

# Akka 2.10.17 - akka.remote.testconductor

> **Summary:** Akka 2.10.17 - akka.remote.testconductor

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/artery/index.html "Permalink")  package [artery](../artery/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/testconductor/index.html "Permalink")  package testconductorDefinition Classes[remote](../index.html)
- [Conductor](Conductor.html "The conductor is the one orchestrating the test: it governs the akka.remote.testconductor.Controller’s port to which all akka.remote.testconductor.Players connect, it issues commands to their akka.remote.testconductor.NetworkFailureInjector and provides support for barriers using the akka.remote.testconductor.BarrierCoordinator.")
- [Player](Player.html "The Player is the client component of the akka.remote.testconductor.TestConductorExt extension.")
- [RoleName](RoleName.html)
- [TestConductor](TestConductor$.html "Access to the akka.remote.testconductor.TestConductorExt extension:")
- [TestConductorExt](TestConductorExt.html "This binds together the akka.remote.testconductor.Conductor and akka.remote.testconductor.Player roles inside an Akka akka.actor.Extension.")
- [TestConductorProtocol](TestConductorProtocol.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[remote](../index.html)
p[akka](../../index.html).[remote](../index.html)

# testconductor[**](../../../akka/remote/testconductor/index.html "Permalink")

#### package testconductor

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/remote/testconductor/Conductor.html "Permalink")  trait [Conductor](Conductor.html "The conductor is the one orchestrating the test: it governs the akka.remote.testconductor.Controller’s port to which all akka.remote.testconductor.Players connect, it issues commands to their akka.remote.testconductor.NetworkFailureInjector and provides support for barriers using the akka.remote.testconductor.BarrierCoordinator.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The conductor is the one orchestrating the test: it governs the
akka.remote.testconductor.Controller’s port to which all
[akka.remote.testconductor.Player](Player.html)s connect, it issues commands to their
`akka.remote.testconductor.NetworkFailureInjector` and provides support
for barriers using the akka.remote.testconductor.BarrierCoordinator.

The conductor is the one orchestrating the test: it governs the
akka.remote.testconductor.Controller’s port to which all
[akka.remote.testconductor.Player](Player.html)s connect, it issues commands to their
`akka.remote.testconductor.NetworkFailureInjector` and provides support
for barriers using the akka.remote.testconductor.BarrierCoordinator.
All of this is bundled inside the [akka.remote.testconductor.TestConductorExt](TestConductorExt.html)
extension.
2. [**](../../../akka/remote/testconductor/Player.html "Permalink")  trait [Player](Player.html "The Player is the client component of the akka.remote.testconductor.TestConductorExt extension.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The Player is the client component of the
[akka.remote.testconductor.TestConductorExt](TestConductorExt.html) extension.

The Player is the client component of the
[akka.remote.testconductor.TestConductorExt](TestConductorExt.html) extension. It registers with
the [akka.remote.testconductor.Conductor](Conductor.html)’s akka.remote.testconductor.Controller
in order to participate in barriers and enable network failure injection.
3. [**](../../../akka/remote/testconductor/RoleName.html "Permalink") final  case class [RoleName](RoleName.html)(name: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../../akka/remote/testconductor/TestConductorExt.html "Permalink")  class [TestConductorExt](TestConductorExt.html "This binds together the akka.remote.testconductor.Conductor and akka.remote.testconductor.Player roles inside an Akka akka.actor.Extension.") extends [Extension](../../actor/Extension.html) with [Conductor](Conductor.html) with [Player](Player.html)This binds together the [akka.remote.testconductor.Conductor](Conductor.html) and
[akka.remote.testconductor.Player](Player.html) roles inside an Akka
[akka.actor.Extension](../../actor/Extension.html).

This binds together the [akka.remote.testconductor.Conductor](Conductor.html) and
[akka.remote.testconductor.Player](Player.html) roles inside an Akka
[akka.actor.Extension](../../actor/Extension.html). Please follow the aforementioned links for
more information.

###### Note

This extension requires the `akka.actor.provider`
to be a akka.remote.RemoteActorRefProvider.

To use `blackhole`, `passThrough`, and `throttle` you must activate the
failure injector and throttler transport adapters by specifying `testTransport(on = true)`
in your MultiNodeConfig.
5. [**](../../../akka/remote/testconductor/TestConductorProtocol.html "Permalink") final  class [TestConductorProtocol](TestConductorProtocol.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../akka/remote/testconductor/Player$.html "Permalink")  object [Player](Player$.html)
2. [**](../../../akka/remote/testconductor/TestConductor$.html "Permalink")  object [TestConductor](TestConductor$.html "Access to the akka.remote.testconductor.TestConductorExt extension:") extends [ExtensionId](../../actor/ExtensionId.html)\[[TestConductorExt](TestConductorExt.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)Access to the [akka.remote.testconductor.TestConductorExt](TestConductorExt.html) extension:

Access to the [akka.remote.testconductor.TestConductorExt](TestConductorExt.html) extension:

```
val tc = TestConductor(system)
tc.startController(numPlayers)
// OR
tc.startClient(conductorPort)
```
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/routing/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Player$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Player.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/index.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/index.html)*