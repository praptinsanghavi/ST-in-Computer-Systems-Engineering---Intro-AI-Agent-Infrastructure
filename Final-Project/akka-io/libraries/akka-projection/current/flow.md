---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:05Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/flow.html
title: Processing with Akka Streams • Akka Projection
---

# Processing with Akka Streams • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Processing with Akka Streams

An Akka Streams `FlowWithContext` can be used instead of a handler for processing the envelopes with at\-least\-once semantics.

The following example is using the `CassandraProjection` but the flow would be the same if used any other [offset storage](overview.html).

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L124-L141 "Go to snippet source")val logger = LoggerFactory.getLogger(getClass)

val flow = FlowWithContext[EventEnvelope[ShoppingCart.Event], ProjectionContext]
  .map(envelope => envelope.event)
  .map {
    case ShoppingCart.CheckedOut(cartId, time) =>
      logger.info("Shopping cart {} was checked out at {}", cartId, time)
      Done

    case otherEvent =>
      logger.debug("Shopping cart {} changed by {}", otherEvent.cartId, otherEvent)
      Done
  }

val projection =
  CassandraProjection
    .atLeastOnceFlow(projectionId = ProjectionId("shopping-carts", "carts-1"), sourceProvider, handler = flow)
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L183-L211 "Go to snippet source")  
Logger logger = LoggerFactory.getLogger("example");

FlowWithContext<
        EventEnvelope<ShoppingCart.Event>, ProjectionContext, Done, ProjectionContext, NotUsed>
    flow =
        FlowWithContext.<EventEnvelope<ShoppingCart.Event>, ProjectionContext>create()
            .map(EventEnvelope::event)
            .map(
                event -> {
                  if (event instanceof ShoppingCart.CheckedOut) {
                    ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
                    logger.info(
                        "Shopping cart {} was checked out at {}",
                        checkedOut.cartId,
                        checkedOut.eventTime);
                  } else {
                    logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
                  }
                  return Done.getInstance();
                });

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atLeastOnceFlow(
            ProjectionId.of("shopping-carts", "carts-1"), sourceProvider, flow)
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

The flow should emit a `Done` element for each completed envelope. The offset of the envelope is carried in the context of the `FlowWithContext` and is stored in Cassandra when corresponding `Done` is emitted. Since the offset is stored after processing the envelope, it means that if the projection is restarted from previously stored offset some envelopes may be processed more than once.

There are a few caveats to be aware of:

- If the flow filters out envelopes the corresponding offset will not be stored, and such an envelope will be processed again if the projection is restarted and no later offset was stored. Instead of filter it is better to skip the processing but still emit the `Done` element.
- The flow should not duplicate emitted envelopes (`mapConcat`) with same offset, because then it can result in that the first offset is stored and when the projection is restarted that offset is considered completed even though more of the duplicated envelopes were never processed.
- The flow must not reorder elements, because the offsets may be stored in the wrong order and when the projection is restarted all envelopes up to the latest stored offset are considered completed even though some of them may not have been processed. This is the reason the flow is restricted to `FlowWithContext` rather than ordinary `Flow`.

## Code Examples

### Example 1: Processing with Akka Streams

```scala
val logger = LoggerFactory.getLogger(getClass)

val flow = FlowWithContext[EventEnvelope[ShoppingCart.Event], ProjectionContext]
  .map(envelope => envelope.event)
  .map {
    case ShoppingCart.CheckedOut(cartId, time) =>
      logger.info("Shopping cart {} was checked out at {}", cartId, time)
      Done

    case otherEvent =>
      logger.debug("Shopping cart {} changed by {}", otherEvent.cartId, otherEvent)
      Done
  }

val projection =
  CassandraProjection
    .atLeastOnceFlow(projectionId = ProjectionId("shopping-carts", "carts-1"), sourceProvider, handler = flow)
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

### Example 2: Processing with Akka Streams

```java
Logger logger = LoggerFactory.getLogger("example");

FlowWithContext<
        EventEnvelope<ShoppingCart.Event>, ProjectionContext, Done, ProjectionContext, NotUsed>
    flow =
        FlowWithContext.<EventEnvelope<ShoppingCart.Event>, ProjectionContext>create()
            .map(EventEnvelope::event)
            .map(
                event -> {
                  if (event instanceof ShoppingCart.CheckedOut) {
                    ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
                    logger.info(
                        "Shopping cart {} was checked out at {}",
                        checkedOut.cartId,
                        checkedOut.eventTime);
                  } else {
                    logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
                  }
                  return Done.getInstance();
                });

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atLeastOnceFlow(
            ProjectionId.of("shopping-carts", "carts-1"), sourceProvider, flow)
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-projection/current/actor.html
- https://doc.akka.io/libraries/akka-projection/current/error.html
- https://doc.akka.io/libraries/akka-projection/current/overview.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/flow.html](https://doc.akka.io/libraries/akka-projection/current/flow.html)*