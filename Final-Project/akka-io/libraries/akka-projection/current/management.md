---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:03:08Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/management.html
title: Management of a Projection • Akka Projection
---

# Management of a Projection • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Management of a Projection

## Offset management

With the [`ProjectionManagement`](/api/akka-projection/1.6.20/akka/projection/javadsl/ProjectionManagement.html "akka.projection.javadsl.ProjectionManagement")[`ProjectionManagement`](/api/akka-projection/1.6.20/akka/projection/scaladsl/ProjectionManagement.html "akka.projection.scaladsl.ProjectionManagement") API you can manage the offset of a projection.

Note
This management API is only usable with a running projection within the same system.

To retrieve latest stored offset:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L274-L279 "Go to snippet source")import akka.projection.scaladsl.ProjectionManagement
import akka.persistence.query.Offset
import akka.projection.ProjectionId

val projectionId = ProjectionId("shopping-carts", "carts-1")
val currentOffset: Future[Option[Offset]] = ProjectionManagement(system).getOffset[Offset](projectionId)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L65-L364 "Go to snippet source")import akka.projection.javadsl.ProjectionManagement;

ProjectionId projectionId = ProjectionId.of("shopping-carts", "carts-1");
CompletionStage<Optional<Offset>> currentOffset =
    ProjectionManagement.get(system).getOffset(projectionId);
```

The offset can be cleared if the projection should be completely rebuilt, starting over again from the first offset. The operation will automatically restart the projection.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L286-L287 "Go to snippet source")val projectionId = ProjectionId("shopping-carts", "carts-1")
val done: Future[Done] = ProjectionManagement(system).clearOffset(projectionId)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L371-L373 "Go to snippet source")  
ProjectionId projectionId = ProjectionId.of("shopping-carts", "carts-1");
CompletionStage<Done> done = ProjectionManagement.get(system).clearOffset(projectionId);
```

The offset can also be updated, which can be useful if the projection is stuck with errors on a specific offset and should skip that offset and continue with next. The operation will automatically restart the projection.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L295-L301 "Go to snippet source")import akka.persistence.query.Sequence
val projectionId = ProjectionId("shopping-carts", "carts-1")
val currentOffset: Future[Option[Sequence]] = ProjectionManagement(system).getOffset[Sequence](projectionId)
currentOffset.foreach {
  case Some(s) => ProjectionManagement(system).updateOffset[Sequence](projectionId, Sequence(s.value + 1))
  case None    => // already removed
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L70-L391 "Go to snippet source")import akka.persistence.query.Sequence;

ProjectionId projectionId = ProjectionId.of("shopping-carts", "carts-1");
CompletionStage<Optional<Sequence>> currentOffset =
    ProjectionManagement.get(system).getOffset(projectionId);
currentOffset.thenAccept(
    optionalOffset -> {
      if (optionalOffset.isPresent()) {
        Sequence newOffset = new Sequence(optionalOffset.get().value());
        CompletionStage<Done> done =
            ProjectionManagement.get(system).updateOffset(projectionId, newOffset);
      }
    });
```

## Pause and resume

With the [`ProjectionManagement`](/api/akka-projection/1.6.20/akka/projection/javadsl/ProjectionManagement.html "akka.projection.javadsl.ProjectionManagement")[`ProjectionManagement`](/api/akka-projection/1.6.20/akka/projection/scaladsl/ProjectionManagement.html "akka.projection.scaladsl.ProjectionManagement") API you can pause and resume processing of a projection. For example, this can be useful when performing some data migration and projection processing cannot run while the migration is in progress.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L309-L318 "Go to snippet source")import akka.projection.scaladsl.ProjectionManagement
import akka.projection.ProjectionId

val projectionId = ProjectionId("shopping-carts", "carts-1")
val mgmt = ProjectionManagement(system)
val done = for {
  _ <- mgmt.pause(projectionId)
  _ <- someDataMigration()
  _ <- mgmt.resume(projectionId)
} yield Done
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L408-L413 "Go to snippet source")  
ProjectionId projectionId = ProjectionId.of("shopping-carts", "carts-1");
ProjectionManagement mgmt = ProjectionManagement.get(system);
CompletionStage<Done> pauseDone = mgmt.pause(projectionId);
CompletionStage<Done> migrationDone = pauseDone.thenCompose(notUsed -> someDataMigration());
CompletionStage<Done> resumeDone = migrationDone.thenCompose(notUsed -> mgmt.resume(projectionId));
```

The paused/resumed state is stored and, and it is read when the Projections are started, for example in case of rebalance or system restart.

To retrieve the paused state:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L326-L327 "Go to snippet source")val projectionId = ProjectionId("shopping-carts", "carts-1")
val paused: Future[Boolean] = ProjectionManagement(system).isPaused(projectionId)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L398-L401 "Go to snippet source")  
ProjectionId projectionId = ProjectionId.of("shopping-carts", "carts-1");
CompletionStage<Boolean> paused =
    ProjectionManagement.get(system).isPaused(projectionId);
```

## Status tracking

The status of a `Projection` can be tracked by implementing a [`StatusObserver`](/api/akka-projection/1.6.20/akka/projection/StatusObserver.html "akka.projection.StatusObserver")[`StatusObserver`](/api/akka-projection/1.6.20/akka/projection/StatusObserver.html "akka.projection.StatusObserver") and enable it with `withStatusObserver` before running the `Projection`.

The `StatusObserver` is called when errors occur and envelopes are retried or the projection failed (restarted). It also has callbacks for processing progress and projection lifecyle.

The intention is that the implementation of the `StatusObserver` would maintain a view that can be accessed from an administrative UI to have an overview of current status of the projections.

## Code Examples

### Example 1: Offset management

```scala
import akka.projection.scaladsl.ProjectionManagement
import akka.persistence.query.Offset
import akka.projection.ProjectionId

val projectionId = ProjectionId("shopping-carts", "carts-1")
val currentOffset: Future[Option[Offset]] = ProjectionManagement(system).getOffset[Offset](projectionId)
```

### Example 2: Offset management

```java
import akka.projection.javadsl.ProjectionManagement;


ProjectionId projectionId = ProjectionId.of("shopping-carts", "carts-1");
CompletionStage<Optional<Offset>> currentOffset =
    ProjectionManagement.get(system).getOffset(projectionId);
```

### Example 3: Offset management

```scala
val projectionId = ProjectionId("shopping-carts", "carts-1")
val done: Future[Done] = ProjectionManagement(system).clearOffset(projectionId)
```

### Example 4: Offset management

```java
ProjectionId projectionId = ProjectionId.of("shopping-carts", "carts-1");
CompletionStage<Done> done = ProjectionManagement.get(system).clearOffset(projectionId);
```

### Example 5: Offset management

```scala
import akka.persistence.query.Sequence
val projectionId = ProjectionId("shopping-carts", "carts-1")
val currentOffset: Future[Option[Sequence]] = ProjectionManagement(system).getOffset[Sequence](projectionId)
currentOffset.foreach {
  case Some(s) => ProjectionManagement(system).updateOffset[Sequence](projectionId, Sequence(s.value + 1))
  case None    => // already removed
}
```

### Example 6: Offset management

```java
import akka.persistence.query.Sequence;


ProjectionId projectionId = ProjectionId.of("shopping-carts", "carts-1");
CompletionStage<Optional<Sequence>> currentOffset =
    ProjectionManagement.get(system).getOffset(projectionId);
currentOffset.thenAccept(
    optionalOffset -> {
      if (optionalOffset.isPresent()) {
        Sequence newOffset = new Sequence(optionalOffset.get().value());
        CompletionStage<Done> done =
            ProjectionManagement.get(system).updateOffset(projectionId, newOffset);
      }
    });
```

### Example 7: Pause and resume

```scala
import akka.projection.scaladsl.ProjectionManagement
import akka.projection.ProjectionId

val projectionId = ProjectionId("shopping-carts", "carts-1")
val mgmt = ProjectionManagement(system)
val done = for {
  _ <- mgmt.pause(projectionId)
  _ <- someDataMigration()
  _ <- mgmt.resume(projectionId)
} yield Done
```

### Example 8: Pause and resume

```java
ProjectionId projectionId = ProjectionId.of("shopping-carts", "carts-1");
ProjectionManagement mgmt = ProjectionManagement.get(system);
CompletionStage<Done> pauseDone = mgmt.pause(projectionId);
CompletionStage<Done> migrationDone = pauseDone.thenCompose(notUsed -> someDataMigration());
CompletionStage<Done> resumeDone = migrationDone.thenCompose(notUsed -> mgmt.resume(projectionId));
```

### Example 9: Pause and resume

```scala
val projectionId = ProjectionId("shopping-carts", "carts-1")
val paused: Future[Boolean] = ProjectionManagement(system).isPaused(projectionId)
```

### Example 10: Pause and resume

```java
ProjectionId projectionId = ProjectionId.of("shopping-carts", "carts-1");
CompletionStage<Boolean> paused =
    ProjectionManagement.get(system).isPaused(projectionId);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/StatusObserver.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ProjectionManagement.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/ProjectionManagement.html
- https://doc.akka.io/libraries/akka-projection/current/grpc-replicated-event-sourcing-transport.html
- https://doc.akka.io/libraries/akka-projection/current/testing.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/management.html](https://doc.akka.io/libraries/akka-projection/current/management.html)*