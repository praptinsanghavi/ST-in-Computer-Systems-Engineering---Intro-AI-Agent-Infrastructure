---
description: Akka 2.10.17 - akka.actor.testkit.typed
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:11:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/index.html
title: Akka 2.10.17 - akka.actor.testkit.typed
---

# Akka 2.10.17 - akka.actor.testkit.typed

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/testkit/typed/index.html "Permalink")  package typedDefinition Classes[testkit](../index.html)
- [**](../../../../akka/actor/testkit/typed/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../../../akka/actor/testkit/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [CapturedLogEvent](CapturedLogEvent.html "Representation of a Log Event issued by a akka.actor.typed.Behavior when testing with akka.actor.testkit.typed.scaladsl.BehaviorTestKit or akka.actor.testkit.typed.javadsl.BehaviorTestKit.")
- [Effect](Effect.html "All tracked effects for the akka.actor.testkit.typed.scaladsl.BehaviorTestKit and akka.actor.testkit.typed.javadsl.BehaviorTestKit must extend this type.")
- [FishingOutcome](FishingOutcome.html "Not for user extension.")
- [LoggingEvent](LoggingEvent.html "Representation of logging event when testing with akka.actor.testkit.typed.scaladsl.LoggingTestKit or akka.actor.testkit.typed.javadsl.LoggingTestKit.")
- [TestException](TestException.html "A predefined exception that can be used in tests.")
- [TestKitSettings](TestKitSettings.html)
p[akka](../../../index.html).[actor](../../index.html).[testkit](../index.html)

# typed[**](../../../../akka/actor/testkit/typed/index.html "Permalink")

#### package typed

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/actor/testkit/typed/internal/index.html "Permalink")  package [internal](internal/index.html)
2. [**](../../../../akka/actor/testkit/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
3. [**](../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
### Type Members

1. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent.html "Permalink") final  case class [CapturedLogEvent](CapturedLogEvent.html "Representation of a Log Event issued by a akka.actor.typed.Behavior when testing with akka.actor.testkit.typed.scaladsl.BehaviorTestKit or akka.actor.testkit.typed.javadsl.BehaviorTestKit.")(level: Level, message: String, cause: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable], marker: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Marker]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRepresentation of a Log Event issued by a [akka.actor.typed.Behavior](../../typed/Behavior.html)
when testing with [akka.actor.testkit.typed.scaladsl.BehaviorTestKit](scaladsl/BehaviorTestKit.html)
or [akka.actor.testkit.typed.javadsl.BehaviorTestKit](javadsl/BehaviorTestKit.html).
2. [**](../../../../akka/actor/testkit/typed/Effect.html "Permalink") abstract  class [Effect](Effect.html "All tracked effects for the akka.actor.testkit.typed.scaladsl.BehaviorTestKit and akka.actor.testkit.typed.javadsl.BehaviorTestKit must extend this type.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)All tracked effects for the [akka.actor.testkit.typed.scaladsl.BehaviorTestKit](scaladsl/BehaviorTestKit.html) and
[akka.actor.testkit.typed.javadsl.BehaviorTestKit](javadsl/BehaviorTestKit.html) must extend this type.

All tracked effects for the [akka.actor.testkit.typed.scaladsl.BehaviorTestKit](scaladsl/BehaviorTestKit.html) and
[akka.actor.testkit.typed.javadsl.BehaviorTestKit](javadsl/BehaviorTestKit.html) must extend this type.

Factories/types for effects are available through [akka.actor.testkit.typed.javadsl.Effects](javadsl/Effects$.html)
and [akka.actor.testkit.typed.javadsl.Effects](javadsl/Effects$.html)

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
3. [**](../../../../akka/actor/testkit/typed/FishingOutcome.html "Permalink") sealed  trait [FishingOutcome](FishingOutcome.html "Not for user extension.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user extension.

Not for user extension.

Instances are available from `FishingOutcomes` in the respective dsls: [akka.actor.testkit.typed.scaladsl.FishingOutcomes](scaladsl/FishingOutcomes$.html)
and [akka.actor.testkit.typed.javadsl.FishingOutcomes](javadsl/FishingOutcomes$.html)

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
4. [**](../../../../akka/actor/testkit/typed/LoggingEvent.html "Permalink") final  case class [LoggingEvent](LoggingEvent.html "Representation of logging event when testing with akka.actor.testkit.typed.scaladsl.LoggingTestKit or akka.actor.testkit.typed.javadsl.LoggingTestKit.")(level: Level, loggerName: String, threadName: String, message: String, timeStamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), marker: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Marker], throwable: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable], mdc: Map\[String, String]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRepresentation of logging event when testing with [akka.actor.testkit.typed.scaladsl.LoggingTestKit](scaladsl/LoggingTestKit.html)
or [akka.actor.testkit.typed.javadsl.LoggingTestKit](javadsl/LoggingTestKit.html).
5. [**](../../../../akka/actor/testkit/typed/TestException.html "Permalink") final  case class [TestException](TestException.html "A predefined exception that can be used in tests.")(message: String) extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA predefined exception that can be used in tests.

A predefined exception that can be used in tests. It doesn't include a stack trace.
6. [**](../../../../akka/actor/testkit/typed/TestKitSettings.html "Permalink") final  class [TestKitSettings](TestKitSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/actor/testkit/typed/CapturedLogEvent$.html "Permalink")  object [CapturedLogEvent](CapturedLogEvent$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
2. [**](../../../../akka/actor/testkit/typed/Effect$.html "Permalink")  object [Effect](Effect$.html)
3. [**](../../../../akka/actor/testkit/typed/FishingOutcome$.html "Permalink")  object [FishingOutcome](FishingOutcome$.html)
4. [**](../../../../akka/actor/testkit/typed/LoggingEvent$.html "Permalink")  object [LoggingEvent](LoggingEvent$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
5. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html "Permalink")  object [TestKitSettings](TestKitSettings$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/CapturedLogEvent$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/CapturedLogEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/FishingOutcome$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/FishingOutcome.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/LoggingEvent$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/LoggingEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/TestException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/TestKitSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/Effects$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/FishingOutcomes$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/index.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/index.html)*