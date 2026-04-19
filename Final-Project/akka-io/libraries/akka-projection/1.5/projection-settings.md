---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:38Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/projection-settings.html
title: Projection Settings • Akka Projection
---

# Projection Settings • Akka Projection

> **Summary:** Akka Projection.

## Content

# Projection Settings

A Projection is a background process that continuously consume event envelopes from a `Source`. Therefore, in case of failures, it is automatically restarted. This is done by automatically wrapping the `Source` with a [RestartSource with backoff on failures](https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/onFailuresWithBackoff.html#restartsource-onfailureswithbackoff).

By default, the backoff configuration defined in the reference configuration is used. Those values can be overriden in the `application.conf` file or programatically as shown below.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L27-L29 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection

val projection =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", "carts-1"),
      sourceProvider,
      handler = () => new ShoppingCartHandler)
    .withRestartBackoff(minBackoff = 10.seconds, maxBackoff = 60.seconds, randomFactor = 0.5)
    .withSaveOffset(100, 500.millis)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L41-L44 "Go to snippet source")import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.Projection;
import akka.projection.ProjectionId;

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atLeastOnce(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            ShoppingCartHandler::new)
        .withRestartBackoff(
            Duration.ofSeconds(10), /*minBackoff*/
            Duration.ofSeconds(60), /*maxBackoff*/
            0.5 /*randomFactor*/)
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

## Configuration

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-core/src/main/resources/reference.conf "Go to snippet source")# This defines the default configuration for akka-projection-core.
# Make your edits/overrides in your application.conf.

//#restart-backoff
akka.projection {
  # The configuration to use to restart the projection after an underlying streams failure
  # The Akka streams restart source is used to facilitate this behaviour
  # See the streams documentation for more details
  # https://doc.akka.io/libraries/akka-core/current/stream/stream-error.html#delayed-restarts-with-a-backoff-operator
  restart-backoff {
    min-backoff = 3s
    max-backoff = 30s
    random-factor = 0.2

    # -1 will not cap the amount of restarts
    # 0 will disable restarts
    max-restarts = -1
  }
}
//#restart-backoff

//#recovery-strategy
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
//#recovery-strategy

akka.projection {
  at-least-once {
    save-offset-after-envelopes = 100
    save-offset-after-duration = 500 ms
  }

  grouped {
    group-after-envelopes = 20
    group-after-duration = 500 ms
  }

  management {
    # timeout for the operations in ProjectionManagement
    operation-timeout = 10 s
    # timeout for individual management requests, they are retried in case of timeout until the operation-timeout
    ask-timeout = 3 s
  }
}

akka {
  actor {
    serializers {
      akka-projection = "akka.projection.internal.ProjectionSerializer"
    }
    serialization-identifiers {
      "akka.projection.internal.ProjectionSerializer" = 1558148900
    }
    serialization-bindings {
      "akka.projection.ProjectionBehavior$Internal$ProjectionManagementCommand" = akka-projection
      "akka.projection.ProjectionBehavior$Internal$CurrentOffset" = akka-projection
    }
  }
}
```

## Code Examples

### Example 1: Projection Settings

```scala
import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection

val projection =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", "carts-1"),
      sourceProvider,
      handler = () => new ShoppingCartHandler)
    .withRestartBackoff(minBackoff = 10.seconds, maxBackoff = 60.seconds, randomFactor = 0.5)
    .withSaveOffset(100, 500.millis)
```

### Example 2: Projection Settings

```java
import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.Projection;
import akka.projection.ProjectionId;

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atLeastOnce(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            ShoppingCartHandler::new)
        .withRestartBackoff(
            Duration.ofSeconds(10), /*minBackoff*/
            Duration.ofSeconds(60), /*maxBackoff*/
            0.5 /*randomFactor*/)
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

### Example 3: Configuration

```conf
# This defines the default configuration for akka-projection-core.
# Make your edits/overrides in your application.conf.

//#restart-backoff
akka.projection {
  # The configuration to use to restart the projection after an underlying streams failure
  # The Akka streams restart source is used to facilitate this behaviour
  # See the streams documentation for more details
  # https://doc.akka.io/libraries/akka-core/current/stream/stream-error.html#delayed-restarts-with-a-backoff-operator
  restart-backoff {
    min-backoff = 3s
    max-backoff = 30s
    random-factor = 0.2

    # -1 will not cap the amount of restarts
    # 0 will disable restarts
    max-restarts = -1
  }
}
//#restart-backoff

//#recovery-strategy
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
//#recovery-strategy

akka.projection {
  at-least-once {
    save-offset-after-envelopes = 100
    save-offset-after-duration = 500 ms
  }

  grouped {
    group-after-envelopes = 20
    group-after-duration = 500 ms
  }

  management {
    # timeout for the operations in ProjectionManagement
    operation-timeout = 10 s
    # timeout for individual management requests, they are retried in case of timeout until the operation-timeout
    ask-timeout = 3 s
  }
}

akka {
  actor {
    serializers {
      akka-projection = "akka.projection.internal.ProjectionSerializer"
    }
    serialization-identifiers {
      "akka.projection.internal.ProjectionSerializer" = 1558148900
    }
    serialization-bindings {
      "akka.projection.ProjectionBehavior$Internal$ProjectionManagementCommand" = akka-projection
      "akka.projection.ProjectionBehavior$Internal$CurrentOffset" = akka-projection
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/onFailuresWithBackoff.html
- https://doc.akka.io/libraries/akka-projection/1.5/error.html
- https://doc.akka.io/libraries/akka-projection/1.5/grpc.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/1.5/projection-settings.html](https://doc.akka.io/libraries/akka-projection/1.5/projection-settings.html)*