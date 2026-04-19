---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:56Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/instrumentations/java/java-futures.html
title: Java Futures • Akka Insights
---

# Java Futures • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Java Futures

Akka Insights is capable of capturing data for Java CompletableFutures.

Note
Cinnamon only supports Java 11, Java 17, or Java 21\.

## Cinnamon Java dependency

The Cinnamon Java module is a transitive dependency of the [Cinnamon Akka module](../akka/akka.html), so it will be included automatically.

Note
Java Future instrumentation is currently only supported in conjunction with Actor instrumentation, as the Java Future telemetry uses the metric backends as configured for an ActorSystem. An ActorSystem needs to be initialized before Java Future telemetry can be reported.

## Java Future metrics

The following metrics are recorded for [named](java-futures.html#java-future-naming-api) Java CompletableFutures, type of metric in parentheses:

- **Created futures** (rate) — the rate of CompletableFutures being created (for a given name).
- **Completing time** (recorder) — the time from creation to completing the CompletableFuture.
- **Scheduled futures** (recorder) — the number of futures currently scheduled (includes both future async sources and completion callbacks).
- **Scheduling time** (recorder) — the time that futures/callbacks are in scheduling (in executor queues waiting to run).
- **Processed futures** (rate) — the rate of futures/callbacks being processed (marked when the future/callback has finished running).
- **Processing time** (recorder) — the time that futures/callbacks take to run.

To illustrate how future metrics are recorded, consider a `thenApplyAsync` operation on a CompletionStage. When `thenApplyAsync` is called, a new CompletableFuture is created for the result of the `thenApplyAsync` function and a completion callback is added to the original CompletableFuture. When the original CompletableFuture has completed, the `thenApplyAsync` callback is scheduled for execution. The callback will then run as determined by the executor, calling the `thenApplyAsync` function and completing the CompletableFuture with the result. The way that metrics are recorded for the CompletableFuture and completion callback are shown in this diagram:

![Java future metrics](../../images/java-future-metrics.png)

## Java Future configuration

Telemetry for Java Futures needs to be explicitly enabled, and CompletableFutures or CompletionStage callbacks need to be explicitly named in code, using a [naming API](java-futures.html#java-future-naming-api) provided by the Cinnamon Java module.

To enable telemetry for named Java Futures, create a `cinnamon.conf` file and enable the `instrumentation` setting:

```
cinnamon.java {
  future.instrumentation = on
}
```
Note
Java Future configuration must be specified in a `cinnamon.conf` file and will not be read from the `application.conf`.

## Java Future naming API

Cinnamon includes a *naming* API to indicate CompletableFutures or CompletionStage callbacks that should be instrumented and to specify the identifier to use in telemetry.

Note
Only **named** Java CompletableFutures will be instrumented.

For example, [`NameableCompletableFuture`](../../reference/api/javadoc/?com/lightbend/cinnamon/java/future/NameableCompletableFuture.html "com.lightbend.cinnamon.java.future.NameableCompletableFuture") has a named alternative to `CompletableFuture.supplyAsync` which allows scheduled CompletableFutures to be instrumented:

```
import com.lightbend.cinnamon.java.future.NameableCompletableFuture;
import java.util.concurrent.CompletableFuture;

// this CompletableFuture is not instrumented
CompletableFuture<String> future =
    CompletableFuture.supplyAsync(() -> "compute all the things");

// this CompletableFuture is instrumented and named "compute"
CompletableFuture<String> instrumented =
    NameableCompletableFuture.supplyAsyncNamed("compute", () -> "compute all the things");
```

There is also a [`NameableCompletionStage`](../../reference/api/javadoc/?com/lightbend/cinnamon/java/future/NameableCompletionStage.html "com.lightbend.cinnamon.java.future.NameableCompletionStage") with named alternatives for the CompletionStage callback operations. For example, to name and instrument a transform operation the `thenApplyNamed` method can be used in place of `thenApply`:

```
import com.lightbend.cinnamon.java.future.NameableCompletionStage;
import java.util.concurrent.CompletionStage;

CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "something");

CompletionStage<String> transformed =
    NameableCompletionStage.nameable(future)
        .thenApplyNamed("transform", value -> transform(value));
```

If you want to name some CompletableFutures or CompletionStage callbacks only for [tracing](../../extensions/opentracing/enabling.html#java-futures), you can configure which Future names will be instrumented for metrics. Name selections can include a trailing wildcard.

For example, the following configuration will enable metrics for Future operations named `foo` and names starting with `ba`:

```
cinnamon.java {
  future.instrumentation = on

  future.metrics {
    names = ["foo", "ba*"]
  }
}
```

The default is to record metrics for all named Futures.

## Code Examples

### Example 1: Java Future configuration

```scala
cinnamon.java {
  future.instrumentation = on
}
```

### Example 2: Java Future naming API

```java
import com.lightbend.cinnamon.java.future.NameableCompletableFuture;
import java.util.concurrent.CompletableFuture;

// this CompletableFuture is not instrumented
CompletableFuture<String> future =
    CompletableFuture.supplyAsync(() -> "compute all the things");

// this CompletableFuture is instrumented and named "compute"
CompletableFuture<String> instrumented =
    NameableCompletableFuture.supplyAsyncNamed("compute", () -> "compute all the things");
```

### Example 3: Java Future naming API

```java
import com.lightbend.cinnamon.java.future.NameableCompletionStage;
import java.util.concurrent.CompletionStage;

CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "something");

CompletionStage<String> transformed =
    NameableCompletionStage.nameable(future)
        .thenApplyNamed("transform", value -> transform(value));
```

### Example 4: Java Future naming API

```scala
cinnamon.java {
  future.instrumentation = on

  future.metrics {
    names = ["foo", "ba*"]
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-insights/current/extensions/extensions.html
- https://doc.akka.io/libraries/akka-insights/current/extensions/opentracing/enabling.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka/akka.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/java/java-futures.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/scala/scala-futures.html
- https://doc.akka.io/libraries/akka-insights/current/reference/api/javadoc/?com/lightbend/cinnamon/java/future/NameableCompletableFuture.html
- https://doc.akka.io/libraries/akka-insights/current/reference/api/javadoc/?com/lightbend/cinnamon/java/future/NameableCompletionStage.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/instrumentations/java/java-futures.html](https://doc.akka.io/libraries/akka-insights/current/instrumentations/java/java-futures.html)*