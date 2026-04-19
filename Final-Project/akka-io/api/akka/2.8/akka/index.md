---
description: Akka 2.8.9 - akka
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:24:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/index.html
title: Akka 2.8.9 - akka
---

# Akka 2.8.9 - akka

> **Summary:** Akka 2.8.9 - akka

## Content

Akka2\.8\.9 \< Back****# Packages

- [**](../index.html "Permalink")  package [root](../index.html)Definition Classes[root](../index.html)
- [**](../akka/index.html "Permalink")  package akkaDefinition Classes[root](../index.html)
- [**](../akka/actor/index.html "Permalink")  package [actor](actor/index.html)
- [**](../akka/annotation/index.html "Permalink")  package [annotation](annotation/index.html)
- [**](../akka/cluster/index.html "Permalink")  package [cluster](cluster/index.html)
- [**](../akka/coordination/index.html "Permalink")  package [coordination](coordination/index.html)
- [**](../akka/discovery/index.html "Permalink")  package [discovery](discovery/index.html)
- [**](../akka/dispatch/index.html "Permalink")  package [dispatch](dispatch/index.html)
- [**](../akka/event/index.html "Permalink")  package [event](event/index.html)
- [**](../akka/io/index.html "Permalink")  package [io](io/index.html)
- [**](../akka/japi/index.html "Permalink")  package [japi](japi/index.html)
- [**](../akka/pattern/index.html "Permalink")  package [pattern](pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.11/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
- [**](../akka/persistence/index.html "Permalink")  package [persistence](persistence/index.html)
- [**](../akka/pki/index.html "Permalink")  package [pki](pki/index.html)
- [**](../akka/remote/index.html "Permalink")  package [remote](remote/index.html)
- [**](../akka/routing/index.html "Permalink")  package [routing](routing/index.html)
- [**](../akka/serialization/index.html "Permalink")  package [serialization](serialization/index.html)
- [**](../akka/stream/index.html "Permalink")  package [stream](stream/index.html)
- [**](../akka/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
- [**](../akka/util/index.html "Permalink")  package [util](util/index.html)
- [AkkaException](AkkaException.html "Akka base Exception.")
- [AkkaVersion](AkkaVersion$.html)
- [ConfigurationException](ConfigurationException.html "This exception is thrown when Akka detects a problem with the provided configuration")
- [Done](Done.html "Typically used together with Future to signal completion but there is no actual value completed.")
- [Main](Main$.html "Main class to start an akka.actor.ActorSystem with one top level application supervisor actor.")
- [NotUsed](NotUsed.html "This type is used in generic type signatures wherever the actual value is of no importance.")
- [OnlyCauseStackTrace](OnlyCauseStackTrace.html "Mix in this trait to suppress the StackTrace for the instance of the exception but not the cause, scala.util.control.NoStackTrace suppresses all the StackTraces.")
- [UnsupportedAkkaVersion](UnsupportedAkkaVersion.html)
- [Version](Version$.html)
p# akka[**](../akka/index.html "Permalink")

#### package akka

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../akka/actor/index.html "Permalink")  package [actor](actor/index.html)
2. [**](../akka/annotation/index.html "Permalink")  package [annotation](annotation/index.html)
3. [**](../akka/cluster/index.html "Permalink")  package [cluster](cluster/index.html)
4. [**](../akka/coordination/index.html "Permalink")  package [coordination](coordination/index.html)
5. [**](../akka/discovery/index.html "Permalink")  package [discovery](discovery/index.html)
6. [**](../akka/dispatch/index.html "Permalink")  package [dispatch](dispatch/index.html)
7. [**](../akka/event/index.html "Permalink")  package [event](event/index.html)
8. [**](../akka/io/index.html "Permalink")  package [io](io/index.html)
9. [**](../akka/japi/index.html "Permalink")  package [japi](japi/index.html)
10. [**](../akka/pattern/index.html "Permalink")  package [pattern](pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.11/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
11. [**](../akka/persistence/index.html "Permalink")  package [persistence](persistence/index.html)
12. [**](../akka/pki/index.html "Permalink")  package [pki](pki/index.html)
13. [**](../akka/remote/index.html "Permalink")  package [remote](remote/index.html)
14. [**](../akka/routing/index.html "Permalink")  package [routing](routing/index.html)
15. [**](../akka/serialization/index.html "Permalink")  package [serialization](serialization/index.html)
16. [**](../akka/stream/index.html "Permalink")  package [stream](stream/index.html)
17. [**](../akka/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
18. [**](../akka/util/index.html "Permalink")  package [util](util/index.html)
### Type Members

1. [**](../akka/AkkaException.html "Permalink")  class [AkkaException](AkkaException.html "Akka base Exception.") extends RuntimeException with SerializableAkka base Exception.

Akka base Exception.

Annotations@SerialVersionUID()
2. [**](../akka/ConfigurationException.html "Permalink")  class [ConfigurationException](ConfigurationException.html "This exception is thrown when Akka detects a problem with the provided configuration") extends [AkkaException](AkkaException.html)This exception is thrown when Akka detects a problem with the provided configuration
3. [**](../akka/Done.html "Permalink") sealed abstract  class [Done](Done.html "Typically used together with Future to signal completion but there is no actual value completed.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Typically used together with `Future` to signal completion
but there is no actual value completed.

Typically used together with `Future` to signal completion
but there is no actual value completed. More clearly signals intent
than `Unit` and is available both from Scala and Java (which `Unit` is not).

Annotations@[DoNotInherit](annotation/DoNotInherit.html)()
4. [**](../akka/NotUsed.html "Permalink") sealed abstract  class [NotUsed](NotUsed.html "This type is used in generic type signatures wherever the actual value is of no importance.") extends [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)This type is used in generic type signatures wherever the actual value is of no importance.

This type is used in generic type signatures wherever the actual value is of no importance.
It is a combination of Scala’s `Unit` and Java’s `Void`, which both have different issues when
used from the other language. An example use\-case is the materialized value of an Akka Stream for cases
where no result shall be returned from materialization.
5. [**](../akka/OnlyCauseStackTrace.html "Permalink")  trait [OnlyCauseStackTrace](OnlyCauseStackTrace.html "Mix in this trait to suppress the StackTrace for the instance of the exception but not the cause, scala.util.control.NoStackTrace suppresses all the StackTraces.") extends [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Mix in this trait to suppress the StackTrace for the instance of the exception but not the cause,
scala.util.control.NoStackTrace suppresses all the StackTraces.
6. [**](../akka/UnsupportedAkkaVersion.html "Permalink") final  class [UnsupportedAkkaVersion](UnsupportedAkkaVersion.html) extends RuntimeException
### Value Members

1. [**](../akka/AkkaVersion$.html "Permalink")  object [AkkaVersion](AkkaVersion$.html)
2. [**](../akka/Done$.html "Permalink")  case object [Done](Done$.html) extends [Done](Done.html) with [Product](https://www.scala-lang.org/api/2.13.11/scala/Product.html#scala.Product) with Serializable
3. [**](../akka/NotUsed$.html "Permalink")  case object [NotUsed](NotUsed$.html) extends [NotUsed](NotUsed.html) with [Product](https://www.scala-lang.org/api/2.13.11/scala/Product.html#scala.Product) with Serializable
4. [**](../akka/Version$.html "Permalink")  object [Version](Version$.html)
### Deprecated Value Members

1. [**](../akka/Main$.html "Permalink")  object [Main](Main$.html "Main class to start an akka.actor.ActorSystem with one top level application supervisor actor.")Main class to start an [akka.actor.ActorSystem](actor/ActorSystem.html) with one
top level application supervisor actor.

Main class to start an [akka.actor.ActorSystem](actor/ActorSystem.html) with one
top level application supervisor actor. It will shutdown
the actor system when the top level actor is terminated.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Implement your own main class instead, from which you start the ActorSystem and actors.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/AkkaException.html
- https://doc.akka.io/api/akka/2.8/akka/AkkaVersion$.html
- https://doc.akka.io/api/akka/2.8/akka/ConfigurationException.html
- https://doc.akka.io/api/akka/2.8/akka/Done$.html
- https://doc.akka.io/api/akka/2.8/akka/Done.html
- https://doc.akka.io/api/akka/2.8/akka/Main$.html
- https://doc.akka.io/api/akka/2.8/akka/NotUsed$.html
- https://doc.akka.io/api/akka/2.8/akka/NotUsed.html
- https://doc.akka.io/api/akka/2.8/akka/OnlyCauseStackTrace.html
- https://doc.akka.io/api/akka/2.8/akka/UnsupportedAkkaVersion.html
- https://doc.akka.io/api/akka/2.8/akka/Version$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.8/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/2.8/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.8/akka/actor/index.html
- https://doc.akka.io/api/akka/2.8/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.8/akka/annotation/index.html
- https://doc.akka.io/api/akka/2.8/akka/cluster/index.html
- https://doc.akka.io/api/akka/2.8/akka/coordination/index.html
- https://doc.akka.io/api/akka/2.8/akka/discovery/index.html
- https://doc.akka.io/api/akka/2.8/akka/dispatch/index.html
- https://doc.akka.io/api/akka/2.8/akka/event/index.html
- https://doc.akka.io/api/akka/2.8/akka/index.html
- https://doc.akka.io/api/akka/2.8/akka/io/index.html
- https://doc.akka.io/api/akka/2.8/akka/japi/index.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/2.8/akka/pattern/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.8/akka/pki/index.html
- https://doc.akka.io/api/akka/2.8/akka/remote/index.html
- https://doc.akka.io/api/akka/2.8/akka/routing/index.html
- https://doc.akka.io/api/akka/2.8/akka/serialization/index.html
- https://doc.akka.io/api/akka/2.8/akka/stream/index.html
- https://doc.akka.io/api/akka/2.8/akka/testkit/index.html
- https://doc.akka.io/api/akka/2.8/akka/util/index.html
- https://doc.akka.io/api/akka/2.8/index.html

---
*Source: [https://doc.akka.io/api/akka/2.8/akka/index.html](https://doc.akka.io/api/akka/2.8/akka/index.html)*