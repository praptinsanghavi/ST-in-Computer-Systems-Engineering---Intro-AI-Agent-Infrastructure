---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/error.html
title: Error handling • Akka Projection
---

# Error handling • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Error handling

Errors are handled at two levels.

## Handler recovery

A [`HandlerRecoveryStrategy`](/api/akka-projection/1.6.20/akka/projection/HandlerRecoveryStrategy.html "akka.projection.HandlerRecoveryStrategy")[`HandlerRecoveryStrategy`](/api/akka-projection/1.6.20/akka/projection/HandlerRecoveryStrategy.html "akka.projection.HandlerRecoveryStrategy") can be defined for the `Projection` to specify what to do when processing of an envelope fails. The alternatives are:

- `fail` \- If the first attempt to invoke the handler fails it will immediately give up and the projection will be [restarted](error.html#projection-restart).
- `skip` \- If the first attempt to invoke the handler fails it will immediately give up, discard the element and continue with next.
- `retryAndFail(retries, delay)` \- If the first attempt to invoke the handler fails it will retry invoking the handler with the same envelope a number of `retries` with the `delay` between each attempt. It will give up and [restart](error.html#projection-restart) the projection if all attempts fail.
- `retryAndSkip(retries, delay)` \- If the first attempt to invoke the handler fails it will retry invoking the handler with the same envelope a number of `retries` with the `delay` between each attempt. It will give up, discard the element and continue with next if all attempts fail.

The following example is using the `CassandraProjection` but the same can be used with any other [Projection type](overview.html).

The `HandlerRecoveryStrategy` can be defined `withRecoveryStrategy`:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L147-L155 "Go to snippet source")import akka.projection.HandlerRecoveryStrategy

val projection =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", "carts-1"),
      sourceProvider,
      handler = () => new ShoppingCartHandler)
    .withRecoveryStrategy(HandlerRecoveryStrategy.retryAndFail(retries = 10, delay = 1.second))
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L60-L228 "Go to snippet source")import akka.projection.HandlerRecoveryStrategy;

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atLeastOnce(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            ShoppingCartHandler::new)
        .withRecoveryStrategy(HandlerRecoveryStrategy.retryAndFail(10, Duration.ofSeconds(1)));
```

If the recovery strategy is not defined on the `Projection` the default is `fail`, and that can be defined in configuration:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-core/src/main/resources/reference.conf#L23-L46 "Go to snippet source")akka.projection {

  # The strategy to use to recover from unhandled exceptions without causing the projection to fail
  recovery-strategy {
    # fail - If the first attempt to invoke the handler fails it will immediately give up and fail the stream.
    # skip - If the first attempt to invoke the handler fails it will immediately give up, discard the element and
    #        continue with next.
    # retry-and-fail - If the first attempt to invoke the handler fails it will retry invoking the handler with the
    #                  same envelope this number of `retries` with the `delay` between each attempt. It will give up
    #                  and fail the stream if all attempts fail.
    # retry-and-skip - If the first attempt to invoke the handler fails it will retry invoking the handler with the
    #                  same envelope this number of `retries` with the `delay` between each attempt. It will give up,
    #                  discard the element and continue with next if all attempts fail.
    strategy = fail

    # The number of times to retry handler function
    # This is only applicable to `retry-and-fail` and `retry-and-skip` recovery strategies
    retries = 5

    # The delay between retry attempts
    # Only applicable to `retry-and-fail` and `retry-and-skip` recovery strategies
    retry-delay = 1 s
  }
}
```

## Projection restart

The `Projection` will be restarted if it fails, for example if the offset can’t be saved or processing of an envelope fails after applying the [Handler recovery](error.html#handler-recovery). Restart means that the projection is restarted from latest saved offset. Projections are restarted in case of failures by default, but it can be customized.

The following example is using the `CassandraProjection` but the same can be used with any other [Projection type](overview.html).

The restart can be defined with exponential backoff settings:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L161-L167 "Go to snippet source")val projection =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", "carts-1"),
      sourceProvider,
      handler = () => new ShoppingCartHandler)
    .withRestartBackoff(minBackoff = 200.millis, maxBackoff = 5.seconds, randomFactor = 0.1)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L239-L248 "Go to snippet source")Duration minBackoff = Duration.ofMillis(200);
Duration maxBackoff = Duration.ofSeconds(5);
double randomFactor = 0.1;

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atLeastOnce(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            ShoppingCartHandler::new)
        .withRestartBackoff(minBackoff, maxBackoff, randomFactor);
```

If the recovery strategy is not defined on the `Projection` the default is defined in configuration:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-core/src/main/resources/reference.conf#L5-L19 "Go to snippet source")akka.projection {
  # The configuration to use to restart the projection after an underlying streams failure
  # The Akka streams restart source is used to facilitate this behaviour
  # See the streams documentation for more details
  restart-backoff {
    min-backoff = 3s
    max-backoff = 30s
    random-factor = 0.2

    # -1 will not cap the amount of restarts
    # 0 will disable restarts
    max-restarts = -1
  }
}
```

## Code Examples

### Example 1: Handler recovery

```scala
import akka.projection.HandlerRecoveryStrategy

val projection =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", "carts-1"),
      sourceProvider,
      handler = () => new ShoppingCartHandler)
    .withRecoveryStrategy(HandlerRecoveryStrategy.retryAndFail(retries = 10, delay = 1.second))
```

### Example 2: Handler recovery

```java
import akka.projection.HandlerRecoveryStrategy;

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atLeastOnce(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            ShoppingCartHandler::new)
        .withRecoveryStrategy(HandlerRecoveryStrategy.retryAndFail(10, Duration.ofSeconds(1)));
```

### Example 3: Handler recovery

```conf
akka.projection {

  # The strategy to use to recover from unhandled exceptions without causing the projection to fail
  recovery-strategy {
    # fail - If the first attempt to invoke the handler fails it will immediately give up and fail the stream.
    # skip - If the first attempt to invoke the handler fails it will immediately give up, discard the element and
    #        continue with next.
    # retry-and-fail - If the first attempt to invoke the handler fails it will retry invoking the handler with the
    #                  same envelope this number of `retries` with the `delay` between each attempt. It will give up
    #                  and fail the stream if all attempts fail.
    # retry-and-skip - If the first attempt to invoke the handler fails it will retry invoking the handler with the
    #                  same envelope this number of `retries` with the `delay` between each attempt. It will give up,
    #                  discard the element and continue with next if all attempts fail.
    strategy = fail

    # The number of times to retry handler function
    # This is only applicable to `retry-and-fail` and `retry-and-skip` recovery strategies
    retries = 5

    # The delay between retry attempts
    # Only applicable to `retry-and-fail` and `retry-and-skip` recovery strategies
    retry-delay = 1 s
  }
}
```

### Example 4: Projection restart

```scala
val projection =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", "carts-1"),
      sourceProvider,
      handler = () => new ShoppingCartHandler)
    .withRestartBackoff(minBackoff = 200.millis, maxBackoff = 5.seconds, randomFactor = 0.1)
```

### Example 5: Projection restart

```java
Duration minBackoff = Duration.ofMillis(200);
Duration maxBackoff = Duration.ofSeconds(5);
double randomFactor = 0.1;

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atLeastOnce(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            ShoppingCartHandler::new)
        .withRestartBackoff(minBackoff, maxBackoff, randomFactor);
```

### Example 6: Projection restart

```conf
akka.projection {
  # The configuration to use to restart the projection after an underlying streams failure
  # The Akka streams restart source is used to facilitate this behaviour
  # See the streams documentation for more details
  restart-backoff {
    min-backoff = 3s
    max-backoff = 30s
    random-factor = 0.2

    # -1 will not cap the amount of restarts
    # 0 will disable restarts
    max-restarts = -1
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/HandlerRecoveryStrategy.html
- https://doc.akka.io/libraries/akka-projection/current/error.html
- https://doc.akka.io/libraries/akka-projection/current/flow.html
- https://doc.akka.io/libraries/akka-projection/current/overview.html
- https://doc.akka.io/libraries/akka-projection/current/projection-settings.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/error.html](https://doc.akka.io/libraries/akka-projection/current/error.html)*