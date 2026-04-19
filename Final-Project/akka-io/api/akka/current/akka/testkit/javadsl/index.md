---
description: Akka 2.10.17 - akka.testkit.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:46:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/javadsl/index.html
title: Akka 2.10.17 - akka.testkit.javadsl
---

# Akka 2.10.17 - akka.testkit.javadsl

> **Summary:** Akka 2.10.17 - akka.testkit.javadsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/testkit/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[testkit](../index.html)
- [**](../../../akka/testkit/javadsl/index.html "Permalink")  package javadslDefinition Classes[testkit](../index.html)
- [EventFilter](EventFilter.html)
- [TestKit](TestKit.html "Java API: Test kit for testing actors.")
p[akka](../../index.html).[testkit](../index.html)

# javadsl[**](../../../akka/testkit/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/testkit/javadsl/EventFilter.html "Permalink")  class [EventFilter](EventFilter.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../akka/testkit/javadsl/TestKit.html "Permalink")  class [TestKit](TestKit.html "Java API: Test kit for testing actors.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: Test kit for testing actors.

Java API: Test kit for testing actors. Inheriting from this class enables
reception of replies from actors, which are queued by an internal actor and
can be examined using the `expectMsg...` methods. Assertions and
bounds concerning timing are available in the form of `Within`
blocks.

Beware of two points:

	- the ActorSystem passed into the constructor needs to be shutdown,
	 otherwise thread pools and memory will be leaked \- this trait is not
	 thread\-safe (only one actor with one queue, one stack of `Within`
	 blocks); take care not to run tests within a single test class instance in
	 parallel.
	- It should be noted that for CI servers and the like all maximum Durations
	 are scaled using the `dilated` method, which uses the
	 TestKitExtension.Settings.TestTimeFactor settable via akka.conf entry
	 "akka.test.timefactor".
### Value Members

1. [**](../../../akka/testkit/javadsl/TestKit$.html "Permalink")  object [TestKit](TestKit$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/internal/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/EventFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/TestKit$.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/TestKit.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/javadsl/index.html](https://doc.akka.io/api/akka/current/akka/testkit/javadsl/index.html)*