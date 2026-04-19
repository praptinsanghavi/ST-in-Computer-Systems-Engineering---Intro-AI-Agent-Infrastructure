---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:13Z'
section: libraries
site: akka-io
source_url: /instrumentations/scala/scala-futures.html
title: Scala Futures • Akka Insights
---

# Scala Futures • Akka Insights

## Content

# Scala Futures

Akka Insights is capable of capturing data for Scala Futures, for Scala 2\.11 and above.

Note
Cinnamon supports Scala 2\.11 and greater.

## Cinnamon Scala dependency

The Cinnamon Scala module is a transitive dependency of the [Cinnamon Akka module](../akka/akka.html), so it will be included automatically.

Note
Scala Future instrumentation is currently only supported in conjunction with Actor instrumentation, as the Scala Future telemetry uses the metric backends as configured for an ActorSystem. An ActorSystem needs to be initialized before Scala Future telemetry can be reported.

## Scala Future metrics

The following metrics are recorded for [named](scala-futures.html#scala-future-naming-api) Scala Futures, type of metric in parentheses:

- **Created futures** (rate) — the rate of Futures being created (for a given name).
- **Completing time** (recorder) — the time from creation to completing the underlying Promise for this Future.
- **Scheduled futures** (recorder) — the number of Futures currently scheduled (includes both Future runnables and Future callbacks).
- **Scheduling time** (recorder) — the time that Futures/callbacks are in scheduling (in execution context queues waiting to run).
- **Processed futures** (rate) — the rate of Futures/callbacks being processed (marked when the Future/callback has finished running).
- **Processing time** (recorder) — the time that Futures/callbacks take to run.

To illustrate how future metrics are recorded, consider a `map` operation on a Future. When `map` is called, a new Future is created for the result of the `map` function and an `onComplete` callback is added to the original Future. When the original Future has completed, the map callback is scheduled for execution. The callback will then run as determined by the execution context, calling the map function and completing the Future with the result. The way that metrics are recorded for the Future and callback are shown in this diagram:

![Scala future metrics](../../images/future-metrics.png)

Note that an `onComplete` callback by itself, or Future operations such as `foreach`, do not create new Futures and only record the callback metrics.

## Scala Future configuration

Telemetry for Scala Futures needs to be explicitly enabled, and Futures need to be explicitly named in code, using a [naming API](scala-futures.html#scala-future-naming-api) provided by the Cinnamon Scala module.

To enable telemetry for named Scala Futures, create a `cinnamon.conf` file and enable the `instrumentation` setting:

```
cinnamon.scala {
  future.instrumentation = on
}
```
Note
Scala Future configuration must be specified in a `cinnamon.conf` file and will not be read from the `application.conf`.

## Scala Future naming API

Cinnamon includes a *naming* API to indicate Futures or Future callbacks that should be instrumented and to specify the identifier to use in metrics or traces.

Note
only **named** Scala Futures will be instrumented.

For example, there is a named alternative to `Future.apply` which allows scheduled Futures to be instrumented:

```
// this Future is not instrumented
val future = Future {
  "compute all the things"
}

import com.lightbend.cinnamon.scala.future.named._

// this Future is instrumented and named "compute"
val instrumentedFuture = FutureNamed("compute") {
  "compute all the things"
}
```

There are also [`named alternatives`](../../reference/api/scaladoc/com/lightbend/cinnamon/scala/future/named/package$$FutureNamedOps.html "com.lightbend.cinnamon.scala.future.named.package.FutureNamedOps") for the callback operations, which are added implicitly as extension methods on Future. For example, to name and instrument a mapped transform operation, the `mapNamed` method can be used in place of `map`:

```
import com.lightbend.cinnamon.scala.future.named._

val future = Future { "something" }

val transformed = future.mapNamed("transform") {
  value => transform(value)
}
```
Note
If using Scala 2\.13 `Future`’s `delegate` method then you will need to use it off of the wrapped `Future` instead of the `FutureNamed`:

```
FutureNamed("compute") { 
  Future.delegate(Future("compute all the things")) 
}.flatten

```

Otherwise nested `Future` spans will be generated. 

If you want to name some Futures only for [tracing](../../extensions/opentracing/enabling.html#scala-futures), you can configure which Future names will be instrumented for metrics. Name selections can include a trailing wildcard.

For example, the following configuration will enable metrics for Future operations named `foo` and names starting with `ba`:

```
cinnamon.scala {
  future.instrumentation = on

  future.metrics {
    names = ["foo", "ba*"]
  }
}
```

The default is to record metrics for all named Futures.

## Code Examples

### Example 1: Scala Future configuration

```scala
cinnamon.scala {
  future.instrumentation = on
}
```

### Example 2: Scala Future naming API

```scala
// this Future is not instrumented
val future = Future {
  "compute all the things"
}

import com.lightbend.cinnamon.scala.future.named._

// this Future is instrumented and named "compute"
val instrumentedFuture = FutureNamed("compute") {
  "compute all the things"
}
```

### Example 3: Scala Future naming API

```scala
import com.lightbend.cinnamon.scala.future.named._

val future = Future { "something" }

val transformed = future.mapNamed("transform") {
  value => transform(value)
}
```

### Example 4: Scala Future naming API

```text
FutureNamed("compute") { 
  Future.delegate(Future("compute all the things")) 
}.flatten
```

### Example 5: Scala Future naming API

```scala
cinnamon.scala {
  future.instrumentation = on

  future.metrics {
    names = ["foo", "ba*"]
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/enabling.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka-http/akka-http-api.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka/akka.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/java/java-futures.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/scala/scala-futures.html
- https://doc.akka.io/libraries/akka-insights/2.21/reference/api/scaladoc/com/lightbend/cinnamon/scala/future/named/package$$FutureNamedOps.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/scala/scala-futures.html](https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/scala/scala-futures.html)*