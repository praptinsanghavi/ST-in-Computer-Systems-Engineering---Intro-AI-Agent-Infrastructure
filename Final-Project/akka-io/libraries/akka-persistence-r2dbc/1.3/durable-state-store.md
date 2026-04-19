---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:37:41Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/durable-state-store.html
title: Durable state store plugin • Akka Persistence R2DBC Documentation
---

# Durable state store plugin • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Durable state store plugin

The durable state plugin enables storing and loading key\-value entries for [durable state actors](https://doc.akka.io/libraries/akka-core/2.10/typed/durable-state/persistence.html).

## Schema

The `durable_state` table and `durable_state_slice_idx` index need to be created in the configured database, see schema definition in [Creating the schema](getting-started.html#schema).

The `durable_state_slice_idx` index is only needed if the slice based [queries](query.html) are used.

## Configuration

To enable the durable state store plugin to be used by default, add the following line to your Akka `application.conf`:

```
akka.persistence.state.plugin = "akka.persistence.r2dbc.state"

```

It can also be enabled with the `durableStateStorePluginId` for a specific `DurableStateBehavior` and multiple plugin configurations are supported.

See also [Connection configuration](config.html#connection-configuration).

### Reference configuration

The following can be overridden in your `application.conf` for the durable state store specific settings:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/main/resources/reference.conf#L78-L118 "Go to snippet source")akka.persistence.r2dbc {
  # Durable state store
  state {
    class = "akka.persistence.r2dbc.state.R2dbcDurableStateStoreProvider"

    table = "durable_state"

    # the column type to use for durable state payloads (bytea or jsonb)
    payload-column-type = "BYTEA"

    # When this is enabled the updates verifies that the revision is +1 of
    # previous revision. There might be a small performance gain if
    # this is disabled.
    assert-single-writer = on

    # Extract a field from the state and store in an additional database column.
    # Primary use case is for secondary indexes that can be queried.
    # Each entity type can have several additional columns.
    # The AdditionalColumn implementation may optionally define an ActorSystem
    # constructor parameter.
    additional-columns {
      #"<entity-type-name>" = ["<fqcn of AdditionalColumn implementation>"]
    }

    # Use another table for the given entity types. Typically used together with
    # additional-columns but can also be used without addition-columns.
    custom-table {
      #"<entity-type-name>" =  <other_durable_state_table>
    }

    # Additional processing in the same transaction as the Durable State upsert
    # or delete. Primary use case is for storing a query or aggregate representation
    # in a separate table.
    # The ChangeHandler implementation may optionally define an ActorSystem
    # constructor parameter.
    change-handler {
      #<entity-type-name>" = "<fqcn of ChangeHandler implementation>"
    }

  }
}
```

## State serialization

The state is serialized with [Akka Serialization](https://doc.akka.io/libraries/akka-core/2.10/serialization.html) and the binary representation is stored in the `state_payload` column together with information about what serializer that was used in the `state_ser_id` and `state_ser_manifest` columns.

For PostgreSQL the payload is stored as `BYTEA` type. Alternatively, you can use `JSONB` column type as described in [PostgreSQL JSON](postgres_json.html).

## Deletes

The store supports deletes through hard deletes, which means the durable state store entries are actually deleted from the database. There is no materialized view with a copy of the state so make sure to not delete durable states too early if they are used from projections or queries.

For each persistent id one tombstone record is kept in the store when the state of the persistence id has been deleted. The reason for the tombstone record is to keep track of the latest revision number so that subsequent state changes don’t reuse the same revision numbers that have been deleted.

See the [DurableStateCleanup tool](cleanup.html#durable-state-cleanup-tool) for more information about how to delete state tombstone records.

## Storing query representation

[Durable state actors](https://doc.akka.io/libraries/akka-core/2.10/typed/durable-state/persistence.html) can only be looked up by their entity id. Additional indexed data can be stored as a query representation. You can either store the query representation from an asynchronous [Projection](projection.html) or you can store it in the same transaction as the Durable State upsert or delete.

Advantages of storing the query representation in the same transaction as the Durable State change:

- exactly\-once processing and atomic update with the Durable State change
- no eventual consistency delay from asynchronous Projection processing
- no need for Projection offset storage

That said, for write heavy Durable State, a Projection can have the advantage of not impacting write latency of the Durable State updates. Note that updating the secondary index also has an impact on the write latency.

### Additional columns

In many cases you just want a secondary index on one or a few fields other than the entity id. For that purpose you can configure one or more [`AdditionalColumn`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn.html "akka.persistence.r2dbc.state.javadsl.AdditionalColumn")[`AdditionalColumn`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html "akka.persistence.r2dbc.state.scaladsl.AdditionalColumn") classes for an entity type. The `AdditionalColumn` will extract the field from the Durable State value and define how to bind it to a database column.

The configuration:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/state/BlogPostTitleColumn.scala#L14-L21 "Go to snippet source")akka.persistence.r2dbc.state {
  additional-columns {
    "BlogPost" = ["docs.BlogPostTitleColumn"]
  }
  custom-table {
    "BlogPost" =  durable_state_blog_post
  }
}
```

For each entity type you can define a list of fully qualified class names of `AdditionalColumn` implementations. The `AdditionalColumn` implementation may optionally define an ActorSystem constructor parameter.

`AdditionalColumn` for a secondary index on the title of [blog posts (example in the Akka documentation)](https://doc.akka.io/libraries/akka-core/2.10/typed/durable-state/persistence.html#changing-behavior):

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/state/BlogPostTitleColumn.scala#L8-L39 "Go to snippet source")import akka.persistence.r2dbc.state.scaladsl.AdditionalColumn

class BlogPostTitleColumn extends AdditionalColumn[BlogPost.State, String] {

  override val columnName: String = "title"

  override def bind(upsert: AdditionalColumn.Upsert[BlogPost.State]): AdditionalColumn.Binding[String] =
    upsert.value match {
      case BlogPost.BlankState =>
        AdditionalColumn.BindNull
      case s: BlogPost.DraftState =>
        AdditionalColumn.BindValue(s.content.title)
      case _: BlogPost.PublishedState =>
        AdditionalColumn.Skip
    }
}
```

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/state/BlogPostTitleColumn.java#L8-L33 "Go to snippet source")import akka.persistence.r2dbc.state.javadsl.AdditionalColumn;

public class BlogPostTitleColumn extends AdditionalColumn<BlogPost.State, String> {
  @Override
  public Class<String> fieldClass() {
    return String.class;
  }

  @Override
  public String columnName() {
    return "title";
  }

  @Override
  public Binding<String> bind(Upsert<BlogPost.State> upsert) {
    BlogPost.State state = upsert.value();
    if (state.equals(BlogPost.BlankState.INSTANCE)) {
      return AdditionalColumn.bindNull();
    } else if (state instanceof BlogPost.DraftState) {
      BlogPost.DraftState draft = (BlogPost.DraftState) state;
      return AdditionalColumn.bindValue(draft.content.title);
    } else {
      return AdditionalColumn.skip();
    }
  }
}
```

From the `bind` method you can return one of:

- `AdditionalColumn.BindValue``AdditionalColumn.bindValue` \- bind a value such as a `String` or `Long` to the database column
- `AdditionalColumn.BindNull``AdditionalColumn.bindNull` \- store `null` in the database column
- `AdditionalColumn.Skip``AdditionalColumn.skip` \- don’t update the database column for this change, keep existing value

You would have to add the additional columns to the `durable_state` table definition, and create secondary database index. Unless you only have one entity type it’s best to define a separate table with the `custom-table` configuration, see example above. The full serialized state and the additional columns are stored in the custom table instead of the default `durable_state` table. The custom table should have the same table definition as the default `durable_state` table but with the extra columns added.

The state can be found by the additional column and deserialized like this:

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/state/BlogPostQuery.scala#L8-L36 "Go to snippet source")import scala.concurrent.Future

import akka.actor.typed.ActorSystem
import akka.persistence.r2dbc.session.scaladsl.R2dbcSession
import akka.serialization.SerializationExtension

class BlogPostQuery(system: ActorSystem[_]) {

  private val findByTitleSql =
    "SELECT state_ser_id, state_ser_manifest, state_payload " +
    "FROM durable_state_blog_post " +
    "WHERE title = $1"

  def findByTitle(title: String): Future[IndexedSeq[BlogPost.State]] = {
    R2dbcSession.withSession(system) { session =>
      session.select(session.createStatement(findByTitleSql).bind(0, title)) { row =>
        val serializerId = row.get("state_ser_id", classOf[java.lang.Integer])
        val serializerManifest = row.get("state_ser_manifest", classOf[String])
        val payload = row.get("state_payload", classOf[Array[Byte]])
        val state = SerializationExtension(system)
          .deserialize(payload, serializerId, serializerManifest)
          .get
          .asInstanceOf[BlogPost.State]
        state
      }
    }
  }

}
```

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/state/BlogPostQuery.java#L8-L47 "Go to snippet source")import akka.actor.typed.ActorSystem;
import akka.persistence.r2dbc.session.javadsl.R2dbcSession;
import akka.serialization.SerializationExtension;
import io.r2dbc.spi.Statement;
import java.util.List;
import java.util.concurrent.CompletionStage;

public class BlogPostQuery {
  private final ActorSystem<?> system;

  public BlogPostQuery(ActorSystem<?> system) {
    this.system = system;
  }

  private final String findByTitleSql =
      "SELECT state_ser_id, state_ser_manifest, state_payload "
          + "FROM durable_state_blog_post "
          + "WHERE title = $1";

  public CompletionStage<List<BlogPost.State>> findByTitle(String title) {
    return R2dbcSession.withSession(
        system,
        session -> {
          Statement stmt = session.createStatement(findByTitleSql).bind(0, title);
          return session.select(
              stmt,
              row -> {
                int serializerId = row.get("state_ser_id", Integer.class);
                String serializerManifest = row.get("state_ser_manifest", String.class);
                byte[] payload = row.get("state_payload", byte[].class);
                BlogPost.State state =
                    (BlogPost.State)
                        SerializationExtension.get(system)
                            .deserialize(payload, serializerId, serializerManifest)
                            .get();
                return state;
              });
        });
  }
}
```

#### Additional column as PostgreSQL JSON

With PostgreSQL the additional column type can be `JSONB` to take advantage of PostgreSQL support for [JSON Types](https://www.postgresql.org/docs/current/datatype-json.html).

Then you would wrap the string or byte array representation of the JSON in `io.r2dbc.postgresql.codec.Json` when binding the value.

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/state/BlogPostJsonColumn.scala#L9-L30 "Go to snippet source")import io.r2dbc.postgresql.codec.Json

class BlogPostJsonColumn extends AdditionalColumn[BlogPost.State, Json] {

  override val columnName: String = "query_json"

  override def bind(upsert: AdditionalColumn.Upsert[BlogPost.State]): AdditionalColumn.Binding[Json] =
    upsert.value match {
      case s: BlogPost.DraftState =>
        // a json library would be used here
        val jsonString = s"""{"title": "${s.content.title}", "published": false}"""
        val json = Json.of(jsonString)
        AdditionalColumn.BindValue(json)
      case s: BlogPost.PublishedState =>
        // a json library would be used here
        val jsonString = s"""{"title": "${s.content.title}", "published": true}"""
        val json = Json.of(jsonString)
        AdditionalColumn.BindValue(json)
      case _ =>
        AdditionalColumn.Skip
    }
}
```

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/state/BlogPostJsonColumn.java#L9-L41 "Go to snippet source")import io.r2dbc.postgresql.codec.Json;

public class BlogPostJsonColumn extends AdditionalColumn<BlogPost.State, Json> {
  @Override
  public Class<Json> fieldClass() {
    return Json.class;
  }

  @Override
  public String columnName() {
    return "query_json";
  }

  @Override
  public Binding<Json> bind(Upsert<BlogPost.State> upsert) {
    BlogPost.State state = upsert.value();
    if (state instanceof BlogPost.DraftState) {
      BlogPost.DraftState s = (BlogPost.DraftState) state;
      // a json library would be used here
      String jsonString = "{\"title\": \"" + s.content.title + "\", \"published\": false}";
      Json json = Json.of(jsonString);
      return AdditionalColumn.bindValue(json);
    } else if (state instanceof BlogPost.PublishedState) {
      BlogPost.PublishedState s = (BlogPost.PublishedState) state;
      // a json library would be used here
      String jsonString = "{\"title\": \"" + s.content.title + "\", \"published\": true}";
      Json json = Json.of(jsonString);
      return AdditionalColumn.bindValue(json);
    } else {
      return AdditionalColumn.skip();
    }
  }
}
```

#### Additional column schema with H2

As it runs in\-process it is not possible to create schema up front with H2, instead additional columns to the state table or additional tables can be created through the `additional-init` setting:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/test/scala/akka/persistence/r2dbc/internal/H2AdditionalInitForSchemaSpec.scala#L28-L33 "Go to snippet source")akka.persistence.r2dbc.connection-factory = $${akka.persistence.r2dbc.h2}
akka.persistence.r2dbc.connection-factory {
  protocol = "mem"
  database = "h2-test-db"
  additional-init = "alter table durable_state add if not exists col1 varchar(256)"
}
```

### Change handler

For more advanced cases where the query representation would not fit in [additional columns](durable-state-store.html#additional-columns) you can configure a [`ChangeHandler`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/ChangeHandler.html "akka.persistence.r2dbc.state.javadsl.ChangeHandler")[`ChangeHandler`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/ChangeHandler.html "akka.persistence.r2dbc.state.scaladsl.ChangeHandler") for an entity type. The `ChangeHandler` will be invoked for each Durable State change. From the `ChangeHandler` you can run database operations in the same transaction as the Durable State upsert or delete.

The configuration:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/state/BlogPostCounts.scala#L24-L28 "Go to snippet source")akka.persistence.r2dbc.state {
  change-handler {
    "BlogPost" = "docs.BlogPostCounts"
  }
}
```

For each entity type you can define the fully qualified class name of a `ChangeHandler` implementation. The `ChangeHandler` implementation may optionally define an ActorSystem constructor parameter.

`ChangeHandler` for a keeping track of number of published [blog posts (example in the Akka documentation)](https://doc.akka.io/libraries/akka-core/2.10/typed/durable-state/persistence.html#changing-behavior):

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/state/BlogPostCounts.scala#L8-L73 "Go to snippet source")import scala.concurrent.ExecutionContext
import scala.concurrent.Future

import akka.Done
import akka.actor.typed.ActorSystem
import akka.persistence.Persistence
import akka.persistence.query.DeletedDurableState
import akka.persistence.query.DurableStateChange
import akka.persistence.query.UpdatedDurableState
import akka.persistence.r2dbc.session.scaladsl.R2dbcSession
import akka.persistence.r2dbc.state.scaladsl.ChangeHandler

/**
 * Keep track of number of published blog posts. Count per slice.
 *
 * {{{
 * CREATE TABLE post_count (slice INT NOT NULL, cnt BIGINT NOT NULL, PRIMARY KEY(slice));
 * }}}
 */
class BlogPostCounts(system: ActorSystem[_]) extends ChangeHandler[BlogPost.State] {

  private val incrementSql =
    "INSERT INTO post_count (slice, cnt) VALUES ($1, 1) " +
    "ON CONFLICT (slice) DO UPDATE SET cnt = excluded.cnt + 1"

  private val decrementSql =
    "UPDATE post_count SET cnt = cnt - 1 WHERE slice = $1"

  private implicit val ec: ExecutionContext = system.executionContext

  override def process(session: R2dbcSession, change: DurableStateChange[BlogPost.State]): Future[Done] = {
    change match {
      case upd: UpdatedDurableState[BlogPost.State] =>
        upd.value match {
          case _: BlogPost.PublishedState =>
            val slice = Persistence(system).sliceForPersistenceId(upd.persistenceId)
            val stmt = session
              .createStatement(incrementSql)
              .bind(0, slice)
            session.updateOne(stmt).map(_ => Done)
          case _ =>
            Future.successful(Done)
        }

      case del: DeletedDurableState[BlogPost.State] =>
        val slice = Persistence(system).sliceForPersistenceId(del.persistenceId)
        val stmt = session
          .createStatement(decrementSql)
          .bind(0, slice)
        session.updateOne(stmt).map(_ => Done)
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/state/BlogPostCounts.java#L8-L70 "Go to snippet source")import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.persistence.Persistence;
import akka.persistence.query.DeletedDurableState;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.UpdatedDurableState;
import akka.persistence.r2dbc.session.javadsl.R2dbcSession;
import akka.persistence.r2dbc.state.javadsl.ChangeHandler;
import io.r2dbc.spi.Statement;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Keep track of number of published blog posts. Count per slice.
 *
 * <pre>
 * CREATE TABLE post_count (slice INT NOT NULL, cnt BIGINT NOT NULL, PRIMARY KEY(slice));
 * </pre>
 */
public class BlogPostCounts implements ChangeHandler<BlogPost.State> {

  private final ActorSystem<?> system;

  private final String incrementSql =
      "INSERT INTO post_count (slice, cnt) VALUES ($1, 1) "
          + "ON CONFLICT (slice) DO UPDATE SET cnt = excluded.cnt + 1";

  private final String decrementSql = "UPDATE post_count SET cnt = cnt - 1 WHERE slice = $1";

  public BlogPostCounts(ActorSystem<?> system) {
    this.system = system;
  }

  @Override
  public CompletionStage<Done> process(
      R2dbcSession session, DurableStateChange<BlogPost.State> change) {
    if (change instanceof UpdatedDurableState) {
      return processUpdate(session, (UpdatedDurableState<BlogPost.State>) change);
    } else if (change instanceof DeletedDurableState) {
      return processDelete(session, (DeletedDurableState<BlogPost.State>) change);
    } else {
      throw new IllegalArgumentException("Unexpected change " + change.getClass().getName());
    }
  }

  private CompletionStage<Done> processUpdate(
      R2dbcSession session, UpdatedDurableState<BlogPost.State> upd) {
    if (upd.value() instanceof BlogPost.PublishedState) {
      int slice = Persistence.get(system).sliceForPersistenceId(upd.persistenceId());
      Statement stmt = session.createStatement(incrementSql).bind(0, slice);
      return session.updateOne(stmt).thenApply(count -> Done.getInstance());
    } else {
      return CompletableFuture.completedFuture(Done.getInstance());
    }
  }

  private CompletionStage<Done> processDelete(
      R2dbcSession session, DeletedDurableState<BlogPost.State> del) {
    int slice = Persistence.get(system).sliceForPersistenceId(del.persistenceId());
    Statement stmt = session.createStatement(decrementSql).bind(0, slice);
    return session.updateOne(stmt).thenApply(count -> Done.getInstance());
  }
}
```

The [`DurableStateChange`](https://doc.akka.io/api/akka/2.10/akka/persistence/query/DurableStateChange.html "akka.persistence.query.DurableStateChange")[`DurableStateChange`](https://doc.akka.io/japi/akka/2.10/?akka/persistence/query/DurableStateChange.html "akka.persistence.query.DurableStateChange") parameter is an [`UpdatedDurableState`](https://doc.akka.io/api/akka/2.10/akka/persistence/query/UpdatedDurableState.html "akka.persistence.query.UpdatedDurableState")[`UpdatedDurableState`](https://doc.akka.io/japi/akka/2.10/?akka/persistence/query/UpdatedDurableState.html "akka.persistence.query.UpdatedDurableState") when the Durable State is created or updated. It is a [`DeletedDurableState`](https://doc.akka.io/api/akka/2.10/akka/persistence/query/DeletedDurableState.html "akka.persistence.query.DeletedDurableState")[`DeletedDurableState`](https://doc.akka.io/japi/akka/2.10/?akka/persistence/query/DeletedDurableState.html "akka.persistence.query.DeletedDurableState") when the Durable State is deleted.

The [`R2dbcSession`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/javadsl/R2dbcSession.html "akka.persistence.r2dbc.session.javadsl.R2dbcSession")[`R2dbcSession`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html "akka.persistence.r2dbc.session.scaladsl.R2dbcSession") provides the means to access an open R2DBC connection that can be used to process the change. The target database operations run in the same transaction as the storage of the Durable State change.

One change is processed at a time. It will not be invoked with the next change until after the `process` method returns and the returned `Future``CompletionStage` is completed.

Concurrency semantics
The `ChangeHandler` should be implemented as a stateless function without mutable state because the same `ChangeHandler` instance may be invoked concurrently for different entities. For a specific entity (persistenceId) one change is processed at a time and the `process` method will not be invoked with the next change for that entity until after the returned `Future``CompletionStage` is completed.

### PostgreSQL JSON payload

For PostgreSQL, an alternative to defining additional columns or change handlers can be to store the state as JSON as described in [PostgreSQL JSON](postgres_json.html). Then you can add [secondary jsonb indexes](https://www.postgresql.org/docs/current/datatype-json.html#JSON-INDEXING) on the payload content for queries.

## Code Examples

### Example 1: Configuration

```text
akka.persistence.state.plugin = "akka.persistence.r2dbc.state"
```

### Example 2: Reference configuration

```conf
akka.persistence.r2dbc {
  # Durable state store
  state {
    class = "akka.persistence.r2dbc.state.R2dbcDurableStateStoreProvider"

    table = "durable_state"

    # the column type to use for durable state payloads (bytea or jsonb)
    payload-column-type = "BYTEA"

    # When this is enabled the updates verifies that the revision is +1 of
    # previous revision. There might be a small performance gain if
    # this is disabled.
    assert-single-writer = on

    # Extract a field from the state and store in an additional database column.
    # Primary use case is for secondary indexes that can be queried.
    # Each entity type can have several additional columns.
    # The AdditionalColumn implementation may optionally define an ActorSystem
    # constructor parameter.
    additional-columns {
      #"<entity-type-name>" = ["<fqcn of AdditionalColumn implementation>"]
    }

    # Use another table for the given entity types. Typically used together with
    # additional-columns but can also be used without addition-columns.
    custom-table {
      #"<entity-type-name>" =  <other_durable_state_table>
    }

    # Additional processing in the same transaction as the Durable State upsert
    # or delete. Primary use case is for storing a query or aggregate representation
    # in a separate table.
    # The ChangeHandler implementation may optionally define an ActorSystem
    # constructor parameter.
    change-handler {
      #<entity-type-name>" = "<fqcn of ChangeHandler implementation>"
    }

  }
}
```

### Example 3: Additional columns

```scala
akka.persistence.r2dbc.state {
  additional-columns {
    "BlogPost" = ["docs.BlogPostTitleColumn"]
  }
  custom-table {
    "BlogPost" =  durable_state_blog_post
  }
}
```

### Example 4: Additional columns

```scala
import akka.persistence.r2dbc.state.scaladsl.AdditionalColumn

class BlogPostTitleColumn extends AdditionalColumn[BlogPost.State, String] {

  override val columnName: String = "title"

  override def bind(upsert: AdditionalColumn.Upsert[BlogPost.State]): AdditionalColumn.Binding[String] =
    upsert.value match {
      case BlogPost.BlankState =>
        AdditionalColumn.BindNull
      case s: BlogPost.DraftState =>
        AdditionalColumn.BindValue(s.content.title)
      case _: BlogPost.PublishedState =>
        AdditionalColumn.Skip
    }
}
```

### Example 5: Additional columns

```java
import akka.persistence.r2dbc.state.javadsl.AdditionalColumn;

public class BlogPostTitleColumn extends AdditionalColumn<BlogPost.State, String> {
  @Override
  public Class<String> fieldClass() {
    return String.class;
  }

  @Override
  public String columnName() {
    return "title";
  }

  @Override
  public Binding<String> bind(Upsert<BlogPost.State> upsert) {
    BlogPost.State state = upsert.value();
    if (state.equals(BlogPost.BlankState.INSTANCE)) {
      return AdditionalColumn.bindNull();
    } else if (state instanceof BlogPost.DraftState) {
      BlogPost.DraftState draft = (BlogPost.DraftState) state;
      return AdditionalColumn.bindValue(draft.content.title);
    } else {
      return AdditionalColumn.skip();
    }
  }
}
```

### Example 6: Additional columns

```scala
import scala.concurrent.Future

import akka.actor.typed.ActorSystem
import akka.persistence.r2dbc.session.scaladsl.R2dbcSession
import akka.serialization.SerializationExtension

class BlogPostQuery(system: ActorSystem[_]) {

  private val findByTitleSql =
    "SELECT state_ser_id, state_ser_manifest, state_payload " +
    "FROM durable_state_blog_post " +
    "WHERE title = $1"

  def findByTitle(title: String): Future[IndexedSeq[BlogPost.State]] = {
    R2dbcSession.withSession(system) { session =>
      session.select(session.createStatement(findByTitleSql).bind(0, title)) { row =>
        val serializerId = row.get("state_ser_id", classOf[java.lang.Integer])
        val serializerManifest = row.get("state_ser_manifest", classOf[String])
        val payload = row.get("state_payload", classOf[Array[Byte]])
        val state = SerializationExtension(system)
          .deserialize(payload, serializerId, serializerManifest)
          .get
          .asInstanceOf[BlogPost.State]
        state
      }
    }
  }

}
```

### Example 7: Additional columns

```java
import akka.actor.typed.ActorSystem;
import akka.persistence.r2dbc.session.javadsl.R2dbcSession;
import akka.serialization.SerializationExtension;
import io.r2dbc.spi.Statement;
import java.util.List;
import java.util.concurrent.CompletionStage;

public class BlogPostQuery {
  private final ActorSystem<?> system;

  public BlogPostQuery(ActorSystem<?> system) {
    this.system = system;
  }

  private final String findByTitleSql =
      "SELECT state_ser_id, state_ser_manifest, state_payload "
          + "FROM durable_state_blog_post "
          + "WHERE title = $1";

  public CompletionStage<List<BlogPost.State>> findByTitle(String title) {
    return R2dbcSession.withSession(
        system,
        session -> {
          Statement stmt = session.createStatement(findByTitleSql).bind(0, title);
          return session.select(
              stmt,
              row -> {
                int serializerId = row.get("state_ser_id", Integer.class);
                String serializerManifest = row.get("state_ser_manifest", String.class);
                byte[] payload = row.get("state_payload", byte[].class);
                BlogPost.State state =
                    (BlogPost.State)
                        SerializationExtension.get(system)
                            .deserialize(payload, serializerId, serializerManifest)
                            .get();
                return state;
              });
        });
  }
}
```

### Example 8: Additional column as PostgreSQL JSON

```scala
import io.r2dbc.postgresql.codec.Json

class BlogPostJsonColumn extends AdditionalColumn[BlogPost.State, Json] {

  override val columnName: String = "query_json"

  override def bind(upsert: AdditionalColumn.Upsert[BlogPost.State]): AdditionalColumn.Binding[Json] =
    upsert.value match {
      case s: BlogPost.DraftState =>
        // a json library would be used here
        val jsonString = s"""{"title": "${s.content.title}", "published": false}"""
        val json = Json.of(jsonString)
        AdditionalColumn.BindValue(json)
      case s: BlogPost.PublishedState =>
        // a json library would be used here
        val jsonString = s"""{"title": "${s.content.title}", "published": true}"""
        val json = Json.of(jsonString)
        AdditionalColumn.BindValue(json)
      case _ =>
        AdditionalColumn.Skip
    }
}
```

### Example 9: Additional column as PostgreSQL JSON

```java
import io.r2dbc.postgresql.codec.Json;

public class BlogPostJsonColumn extends AdditionalColumn<BlogPost.State, Json> {
  @Override
  public Class<Json> fieldClass() {
    return Json.class;
  }

  @Override
  public String columnName() {
    return "query_json";
  }

  @Override
  public Binding<Json> bind(Upsert<BlogPost.State> upsert) {
    BlogPost.State state = upsert.value();
    if (state instanceof BlogPost.DraftState) {
      BlogPost.DraftState s = (BlogPost.DraftState) state;
      // a json library would be used here
      String jsonString = "{\"title\": \"" + s.content.title + "\", \"published\": false}";
      Json json = Json.of(jsonString);
      return AdditionalColumn.bindValue(json);
    } else if (state instanceof BlogPost.PublishedState) {
      BlogPost.PublishedState s = (BlogPost.PublishedState) state;
      // a json library would be used here
      String jsonString = "{\"title\": \"" + s.content.title + "\", \"published\": true}";
      Json json = Json.of(jsonString);
      return AdditionalColumn.bindValue(json);
    } else {
      return AdditionalColumn.skip();
    }
  }
}
```

### Example 10: Additional column schema with H2

```scala
akka.persistence.r2dbc.connection-factory = $${akka.persistence.r2dbc.h2}
akka.persistence.r2dbc.connection-factory {
  protocol = "mem"
  database = "h2-test-db"
  additional-init = "alter table durable_state add if not exists col1 varchar(256)"
}
```

### Example 11: Change handler

```scala
akka.persistence.r2dbc.state {
  change-handler {
    "BlogPost" = "docs.BlogPostCounts"
  }
}
```

### Example 12: Change handler

```scala
import scala.concurrent.ExecutionContext
import scala.concurrent.Future

import akka.Done
import akka.actor.typed.ActorSystem
import akka.persistence.Persistence
import akka.persistence.query.DeletedDurableState
import akka.persistence.query.DurableStateChange
import akka.persistence.query.UpdatedDurableState
import akka.persistence.r2dbc.session.scaladsl.R2dbcSession
import akka.persistence.r2dbc.state.scaladsl.ChangeHandler

/**
 * Keep track of number of published blog posts. Count per slice.
 *
 * {{{
 * CREATE TABLE post_count (slice INT NOT NULL, cnt BIGINT NOT NULL, PRIMARY KEY(slice));
 * }}}
 */
class BlogPostCounts(system: ActorSystem[_]) extends ChangeHandler[BlogPost.State] {

  private val incrementSql =
    "INSERT INTO post_count (slice, cnt) VALUES ($1, 1) " +
    "ON CONFLICT (slice) DO UPDATE SET cnt = excluded.cnt + 1"

  private val decrementSql =
    "UPDATE post_count SET cnt = cnt - 1 WHERE slice = $1"

  private implicit val ec: ExecutionContext = system.executionContext

  override def process(session: R2dbcSession, change: DurableStateChange[BlogPost.State]): Future[Done] = {
    change match {
      case upd: UpdatedDurableState[BlogPost.State] =>
        upd.value match {
          case _: BlogPost.PublishedState =>
            val slice = Persistence(system).sliceForPersistenceId(upd.persistenceId)
            val stmt = session
              .createStatement(incrementSql)
              .bind(0, slice)
            session.updateOne(stmt).map(_ => Done)
          case _ =>
            Future.successful(Done)
        }

      case del: DeletedDurableState[BlogPost.State] =>
        val slice = Persistence(system).sliceForPersistenceId(del.persistenceId)
        val stmt = session
          .createStatement(decrementSql)
          .bind(0, slice)
        session.updateOne(stmt).map(_ => Done)
    }
  }
}
```

### Example 13: Change handler

```java
import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.persistence.Persistence;
import akka.persistence.query.DeletedDurableState;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.UpdatedDurableState;
import akka.persistence.r2dbc.session.javadsl.R2dbcSession;
import akka.persistence.r2dbc.state.javadsl.ChangeHandler;
import io.r2dbc.spi.Statement;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Keep track of number of published blog posts. Count per slice.
 *
 * <pre>
 * CREATE TABLE post_count (slice INT NOT NULL, cnt BIGINT NOT NULL, PRIMARY KEY(slice));
 * </pre>
 */
public class BlogPostCounts implements ChangeHandler<BlogPost.State> {

  private final ActorSystem<?> system;

  private final String incrementSql =
      "INSERT INTO post_count (slice, cnt) VALUES ($1, 1) "
          + "ON CONFLICT (slice) DO UPDATE SET cnt = excluded.cnt + 1";

  private final String decrementSql = "UPDATE post_count SET cnt = cnt - 1 WHERE slice = $1";

  public BlogPostCounts(ActorSystem<?> system) {
    this.system = system;
  }

  @Override
  public CompletionStage<Done> process(
      R2dbcSession session, DurableStateChange<BlogPost.State> change) {
    if (change instanceof UpdatedDurableState) {
      return processUpdate(session, (UpdatedDurableState<BlogPost.State>) change);
    } else if (change instanceof DeletedDurableState) {
      return processDelete(session, (DeletedDurableState<BlogPost.State>) change);
    } else {
      throw new IllegalArgumentException("Unexpected change " + change.getClass().getName());
    }
  }

  private CompletionStage<Done> processUpdate(
      R2dbcSession session, UpdatedDurableState<BlogPost.State> upd) {
    if (upd.value() instanceof BlogPost.PublishedState) {
      int slice = Persistence.get(system).sliceForPersistenceId(upd.persistenceId());
      Statement stmt = session.createStatement(incrementSql).bind(0, slice);
      return session.updateOne(stmt).thenApply(count -> Done.getInstance());
    } else {
      return CompletableFuture.completedFuture(Done.getInstance());
    }
  }

  private CompletionStage<Done> processDelete(
      R2dbcSession session, DeletedDurableState<BlogPost.State> del) {
    int slice = Persistence.get(system).sliceForPersistenceId(del.persistenceId());
    Statement stmt = session.createStatement(decrementSql).bind(0, slice);
    return session.updateOne(stmt).thenApply(count -> Done.getInstance());
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/javadsl/R2dbcSession.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/scaladsl/R2dbcSession.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/ChangeHandler.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/ChangeHandler.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/japi/akka/2.10/?akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/japi/akka/2.10/?akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/japi/akka/2.10/?akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/libraries/akka-core/2.10/serialization.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/durable-state/persistence.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/cleanup.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/config.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/durable-state-store.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/getting-started.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/postgres_json.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/projection.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/durable-state-store.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/durable-state-store.html)*