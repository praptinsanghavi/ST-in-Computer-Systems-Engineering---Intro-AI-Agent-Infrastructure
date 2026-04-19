---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/jdbc.html
title: Offset in a relational DB with JDBC • Akka Projection
---

# Offset in a relational DB with JDBC • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Offset in a relational DB with JDBC

The [`JdbcProjection`](/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcProjection$.html "akka.projection.jdbc.javadsl.JdbcProjection")[`JdbcProjection`](/api/akka-projection/1.6.20/akka/projection/jdbc/scaladsl/JdbcProjection$.html "akka.projection.jdbc.scaladsl.JdbcProjection") has support for storing the offset in a relational database using JDBC.

The source of the envelopes can be [events from Akka Persistence](eventsourced.html) or any other `SourceProvider` with supported [offset types](jdbc.html#offset-types).

A [`JdbcHandler`](/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcHandler.html "akka.projection.jdbc.javadsl.JdbcHandler")[`JdbcHandler`](/api/akka-projection/1.6.20/akka/projection/jdbc/scaladsl/JdbcHandler.html "akka.projection.jdbc.scaladsl.JdbcHandler") receives a [`JdbcSession`](/api/akka-projection/1.6.20/akka/projection/jdbc/JdbcSession.html "akka.projection.jdbc.JdbcSession")[`JdbcSession`](/api/akka-projection/1.6.20/akka/projection/jdbc/JdbcSession.html "akka.projection.jdbc.JdbcSession") instance and an envelope. The `JdbcSession` provides the means to access an open JDBC connection that can be used to process the envelope. The target database operations can be run in the same transaction as the storage of the offset, which means that [exactly\-once](jdbc.html#exactly-once) processing semantics is supported. It also offers [at\-least\-once](jdbc.html#at-least-once) semantics.

## Dependencies

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
Maven
```
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>

```
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

To use the JDBC module of Akka Projections add the following dependency in your project:

sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-projection-jdbc" % "1.6.20"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-jdbc_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-jdbc_${versions.ScalaBinary}:1.6.20"
}
```

Akka Projections require Akka 2\.10\.13 or later, see [Akka version](overview.html#akka-version).

| Project Info: Akka Projections JDBC | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-projection\-jdbc 1\.6\.20 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.projection.jdbc |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-projection/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2020\-09\-10 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-projection/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-projection/issues) |
| Sources | [https://github.com/akka/akka\-projection](https://github.com/akka/akka-projection) |

### Transitive dependencies

The table below shows `akka-projection-jdbc`’s direct dependencies, and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.lightbend.akka | akka\-projection\-core\_2\.13 | [1\.6\.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.6.20) |
| com.typesafe.akka | akka\-persistence\-query\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.lightbend.akka    akka-projection-core_2.13    [1.6.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.6.20)
    com.typesafe.akka    akka-actor-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-typed_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-slf4j_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
    com.typesafe.akka    akka-persistence-query_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-persistence_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-persistence-query_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-persistence_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## Required configuration settings

There are two settings that need to be set beforehand in your `application.conf` file.

- `akka.projection.jdbc.dialect` \- The dialect type indicating your database of choice. Supported dialects are: `mysql-dialect`, `postgres-dialect`, `mssql-dialect`, `oracle-dialect` or `h2-dialect` (testing).
- `akka.projection.jdbc.blocking-jdbc-dispatcher.thread-pool-executor.fixed-pool-size` indicating the size of the blocking JDBC dispatcher. See also [Blocking JDBC Dispatcher](jdbc.html#blocking-jdbc-dispatcher).

## Defining a JdbcSession

Before using Akka Projections JDBC you must implement a `JdbcSession` traitinterface. `JdbcSession` is used to open a connection and start a transaction. A new `JdbcSession` will be created for each call to the handler. At the end of the processing, the transaction will be committed (or rolled back). 

When using `JdbcProjection.exactlyOnce`, the `JdbcSession` that is passed to the handler will be used to save the offset behind the scenes. Therefore, it’s extremely important to disable auto\-commit (eg: `setAutoCommit(false)`), otherwise the two operations won’t participate on the same transaction. 

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/jdbc/JdbcProjectionDocExample.scala#L30-L33 "Go to snippet source")import java.sql.Connection
import java.sql.DriverManager
import akka.projection.jdbc.JdbcSession

class PlainJdbcSession extends JdbcSession {

  lazy val conn = {
    Class.forName("org.h2.Driver")
    val c = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;OPTIMIZE_REUSE_RESULTS=FALSE")
    c.setAutoCommit(false)
    c
  }
  override def withConnection[Result](func: function.Function[Connection, Result]): Result =
    func(conn)
  override def commit(): Unit = conn.commit()
  override def rollback(): Unit = conn.rollback()
  override def close(): Unit = conn.close()
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/jdbc/JdbcProjectionDocExample.java#L27-L31 "Go to snippet source")import akka.projection.jdbc.JdbcSession;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

class PlainJdbcSession implements JdbcSession {

  private final Connection connection;

  public PlainJdbcSession() {
    try {
      Class.forName("org.h2.Driver");
      this.connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;OPTIMIZE_REUSE_RESULTS=FALSE");
      connection.setAutoCommit(false);
    } catch (ClassNotFoundException | SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public <Result> Result withConnection(Function<Connection, Result> func) throws Exception {
    return func.apply(connection);
  }

  @Override
  public void commit() throws SQLException {
    connection.commit();
  }

  @Override
  public void rollback() throws SQLException {
    connection.rollback();
  }

  @Override
  public void close() throws SQLException {
    connection.close();
  }
}
```

Note
It’s highly recommended configuring it with a connection pool, for example [HikariCP](https://github.com/brettwooldridge/HikariCP).

When declaring a `JdbcProjection` you must provide a factory for the `JdbcSession`. The factory will be used to create new instances whenever needed.

An alternative Hibernate based implementation would look like this:

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/jdbc/HibernateJdbcSession.java#L10-L15 "Go to snippet source")import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.sql.Connection;
import java.sql.SQLException;
import org.hibernate.Session;

public class HibernateJdbcSession implements JdbcSession {

  public final EntityManager entityManager;
  private final EntityTransaction transaction;

  public HibernateJdbcSession(EntityManager entityManager) {
    this.entityManager = entityManager;
    this.transaction = this.entityManager.getTransaction();
    this.transaction.begin();
  }

  @Override
  public <Result> Result withConnection(Function<Connection, Result> func) {
    Session hibernateSession = entityManager.unwrap(Session.class);
    return hibernateSession.doReturningWork(
        connection -> {
          try {
            return func.apply(connection);
          } catch (SQLException e) {
            throw e;
          } catch (Exception e) {
            throw new SQLException(e);
          }
        });
  }

  @Override
  public void commit() {
    transaction.commit();
  }

  @Override
  public void rollback() {
    // propagates rollback call if transaction is active
    if (transaction.isActive()) transaction.rollback();
  }

  @Override
  public void close() {
    this.entityManager.close();
  }
}
```

And a special factory that initializes the `EntityManagerFactory` and builds the `JdbcSession` instance:

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/jdbc/HibernateSessionFactory.java#L8-L10 "Go to snippet source")import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateSessionFactory {
  private final EntityManagerFactory entityManagerFactory;

  public HibernateSessionFactory() {
    this.entityManagerFactory = Persistence.createEntityManagerFactory("akka-projection-hibernate");
  }

  public HibernateJdbcSession newInstance() {
    return new HibernateJdbcSession(entityManagerFactory.createEntityManager());
  }
}
```

## Blocking JDBC Dispatcher

JDBC APIs are blocking by design, therefore Akka Projections JDBC will use a dedicated dispatcher to run all JDBC calls. It’s important to configure the dispatcher to have the same size as the connection pool. 

Each time the projection handler is called one thread and one database connection will be used. If your connection pool is smaller than the number of threads, the thread can potentially block while waiting for the connection pool to provide a connection. 

The dispatcher pool size can be configured through the `akka.projection.jdbc.blocking-jdbc-dispatcher.thread-pool-executor.fixed-pool-size` settings. See [Configuration](jdbc.html#configuration) section below.

Note
Most applications will use database connections to read data, for instance to read a projected model upon user request. This means that other parts of the application will be competing for a connection. It’s recommend to configure a connection pool dedicated to the projections and use a different one in other parts of the application. 

## exactly\-once

The offset is stored in the same transaction used for the user defined `handler`, which means exactly\-once processing semantics if the projection is restarted from previously stored offset.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/jdbc/JdbcProjectionDocExample.scala#L21-L23 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.jdbc.scaladsl.JdbcProjection

val projection =
  JdbcProjection
    .exactlyOnce(
      projectionId = ProjectionId("ShoppingCarts", "carts-1"),
      sourceProvider,
      () => new PlainJdbcSession, // JdbcSession Factory
      handler = () => new ShoppingCartHandler(orderRepository))
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/jdbc/JdbcProjectionDocExample.java#L167-L175 "Go to snippet source")final HibernateSessionFactory sessionProvider = new HibernateSessionFactory();

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    JdbcProjection.exactlyOnce(
        ProjectionId.of("shopping-carts", "carts-1"),
        sourceProvider,
        sessionProvider::newInstance,
        ShoppingCartHandler::new,
        system);
```

The [`ShoppingCartHandler` is shown below](jdbc.html#handler).

## at\-least\-once

The offset is stored after the envelope has been processed and giving at\-least\-once processing semantics. This means that if the projection is restarted from a previously stored offset some elements may be processed more than once. Therefore, the [Handler](jdbc.html#handler) code must be idempotent.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/jdbc/JdbcProjectionDocExample.scala#L21-L23 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.jdbc.scaladsl.JdbcProjection

val projection =
  JdbcProjection
    .atLeastOnce(
      projectionId = ProjectionId("ShoppingCarts", "carts-1"),
      sourceProvider,
      () => new PlainJdbcSession, // JdbcSession Factory
      handler = () => new ShoppingCartHandler(orderRepository))
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/jdbc/JdbcProjectionDocExample.java#L181-L192 "Go to snippet source")final HibernateSessionFactory sessionProvider = new HibernateSessionFactory();
int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    JdbcProjection.atLeastOnce(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            sessionProvider::newInstance,
            ShoppingCartHandler::new,
            system)
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

The offset is stored after a time window, or limited by a number of envelopes, whatever happens first. This window can be defined with `withSaveOffset` of the returned `AtLeastOnceProjection`. The default settings for the window is defined in configuration section `akka.projection.at-least-once`. There is a performance benefit of not storing the offset too often, but the drawback is that there can be more duplicates when the projection that will be processed again when the projection is restarted.

The [`ShoppingCartHandler` is shown below](jdbc.html#handler).

## groupedWithin

The envelopes can be grouped before processing, which can be useful for batch updates.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/jdbc/JdbcProjectionDocExample.scala#L21-L23 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.jdbc.scaladsl.JdbcProjection

val projection =
  JdbcProjection
    .groupedWithin(
      projectionId = ProjectionId("ShoppingCarts", "carts-1"),
      sourceProvider,
      () => new PlainJdbcSession, // JdbcSession Factory
      handler = () => new GroupedShoppingCartHandler(orderRepository))
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/jdbc/JdbcProjectionDocExample.java#L198-L209 "Go to snippet source")final HibernateSessionFactory sessionProvider = new HibernateSessionFactory();
int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    JdbcProjection.groupedWithin(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            sessionProvider::newInstance,
            GroupedShoppingCartHandler::new,
            system)
        .withGroup(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

The envelopes are grouped within a time window, or limited by a number of envelopes, whatever happens first. This window can be defined with `withGroup` of the returned `GroupedProjection`. The default settings for the window is defined in configuration section `akka.projection.grouped`.

When using `groupedWithin` the handler is a `JdbcHandler[immutable.Seq[EventEnvelope[ShoppingCart.Event]]]``JdbcHandler<List<EventEnvelope<ShoppingCart.Event>>>`. The [`GroupedShoppingCartHandler` is shown below](jdbc.html#grouped-handler).

The offset is stored in the same transaction used for the user defined `handler`, which means exactly\-once processing semantics if the projection is restarted from previously stored offset.

## Handler

It’s in the [`JdbcHandler`](/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcHandler.html "akka.projection.jdbc.javadsl.JdbcHandler")[`JdbcHandler`](/api/akka-projection/1.6.20/akka/projection/jdbc/scaladsl/JdbcHandler.html "akka.projection.jdbc.scaladsl.JdbcHandler") that you implement the processing of each envelope. It’s essentially a consumer function from `(JdbcSession, Envelope)` to `Unit``void`. 

A handler that is consuming `ShoppingCart.Event` from `eventsByTag` can look like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/jdbc/JdbcProjectionDocExample.scala#L16-L17 "Go to snippet source")import akka.projection.jdbc.scaladsl.JdbcHandler

class ShoppingCartHandler(repository: OrderRepository)
    extends JdbcHandler[EventEnvelope[ShoppingCart.Event], PlainJdbcSession] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(session: PlainJdbcSession, envelope: EventEnvelope[ShoppingCart.Event]): Unit = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")
        session.withConnection { conn =>
          repository.save(conn, Order(cartId, time))
        }

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/jdbc/JdbcProjectionDocExample.java#L105-L126 "Go to snippet source")public class ShoppingCartHandler
    extends JdbcHandler<EventEnvelope<ShoppingCart.Event>, HibernateJdbcSession> {
  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public void process(HibernateJdbcSession session, EventEnvelope<ShoppingCart.Event> envelope)
      throws Exception {
    ShoppingCart.Event event = envelope.event();
    if (event instanceof ShoppingCart.CheckedOut) {
      ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
      logger.info(
          "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

      // pass the EntityManager created by the projection
      // to the repository in order to use the same transaction
      orderRepository.save(
          session.entityManager, new Order(checkedOut.cartId, checkedOut.eventTime));
    } else {
      logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
    }
  }
}
```

Hint
Such simple handlers can also be defined as plain functions via the helper `JdbcHandler.apply``JdbcHandler.fromFunction` factory method.

where the `OrderRepository` is an implementation of:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/jdbc/JdbcProjectionDocExample.scala#L42-L45 "Go to snippet source")case class Order(id: String, time: Instant)
trait OrderRepository {
  def save(connection: Connection, order: Order): Unit
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/jdbc/JdbcProjectionDocExample.java#L45-L57 "Go to snippet source")class Order {
  public final String id;
  public final Instant time;

  public Order(String id, Instant time) {
    this.id = id;
    this.time = time;
  }
}

interface OrderRepository {
  void save(EntityManager entityManager, Order order);
}
```

### Grouped handler

When using [`JdbcProjection.groupedWithin`](jdbc.html#groupedwithin) the handler is processing a `Seq``List` of envelopes.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/jdbc/JdbcProjectionDocExample.scala#L16-L17 "Go to snippet source")import akka.projection.jdbc.scaladsl.JdbcHandler

import scala.collection.immutable

class GroupedShoppingCartHandler(repository: OrderRepository)
    extends JdbcHandler[immutable.Seq[EventEnvelope[ShoppingCart.Event]], PlainJdbcSession] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(
      session: PlainJdbcSession,
      envelopes: immutable.Seq[EventEnvelope[ShoppingCart.Event]]): Unit = {

    // save all events in DB
    envelopes.map(_.event).foreach {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")
        session.withConnection { conn =>
          repository.save(conn, Order(cartId, time))
        }

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/jdbc/JdbcProjectionDocExample.java#L130-L155 "Go to snippet source")public class GroupedShoppingCartHandler
    extends JdbcHandler<List<EventEnvelope<ShoppingCart.Event>>, HibernateJdbcSession> {
  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public void process(
      HibernateJdbcSession session, List<EventEnvelope<ShoppingCart.Event>> envelopes)
      throws Exception {
    for (EventEnvelope<ShoppingCart.Event> envelope : envelopes) {
      ShoppingCart.Event event = envelope.event();
      if (event instanceof ShoppingCart.CheckedOut) {
        ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
        logger.info(
            "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

        // pass the EntityManager created by the projection
        // to the repository in order to use the same transaction
        orderRepository.save(
            session.entityManager, new Order(checkedOut.cartId, checkedOut.eventTime));

      } else {
        logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      }
    }
  }
}
```

### Stateful handler

The `JdbcHandler` can be stateful, with variables and mutable data structures. It is invoked by the `Projection` machinery one envelope at a time and visibility guarantees between the invocations are handled automatically, i.e. no volatile or other concurrency primitives are needed for managing the state as long as it’s not accessed by other threads than the one that called `process`.

Note
It is important that the `Handler` instance is not shared between several `Projection` instances, because then it would be invoked concurrently, which is not how it is intended to be used. Each `Projection` instance should use a new `Handler` instance. 

### Async handler

The [`Handler`](/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html "akka.projection.javadsl.Handler")[`Handler`](/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html "akka.projection.scaladsl.Handler") can be used with `JdbcProjection.atLeastOnceAsync` and `JdbcProjection.groupedWithinAsync` if the handler is not storing the projection result in the database. The handler could [send to a Kafka topic](kafka.html#sending-to-kafka) or integrate with something else.

There are several examples of such `Handler` in the [documentation for Cassandra Projections](cassandra.html#handler). Same type of handlers can be used with `JdbcProjection` instead of `CassandraProjection`.

### Actor handler

A good alternative for advanced state management is to implement the handler as an [actor](https://doc.akka.io/libraries/akka-core/current/typed/actors.html), which is described in [Processing with Actor](actor.html).

### Flow handler

An Akka Streams `FlowWithContext` can be used instead of a handler for processing the envelopes, which is described in [Processing with Akka Streams](flow.html).

### Handler lifecycle

You can override the `start` and `stop` methods of the [`JdbcHandler`](/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcHandler.html "akka.projection.jdbc.javadsl.JdbcHandler")[`JdbcHandler`](/api/akka-projection/1.6.20/akka/projection/jdbc/scaladsl/JdbcHandler.html "akka.projection.jdbc.scaladsl.JdbcHandler") to implement initialization before first envelope is processed and resource cleanup when the projection is stopped. Those methods are also called when the `Projection` is restarted after failure.

See also [error handling](error.html).

## Schema

The database schema for the offset storage table:

PostgreSQL

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/resources/create-table-postgres.sql#L4-L22 "Go to snippet source")CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

CREATE INDEX IF NOT EXISTS akka_projection_name_index ON akka_projection_offset_store (projection_name);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

MySQL

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/resources/create-table-mysql.sql#L3-L21 "Go to snippet source")CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

CREATE INDEX akka_projection_name_index ON akka_projection_offset_store (projection_name);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

Microsoft SQL Server

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/resources/create-table-mssql.sql#L3-L29 "Go to snippet source")IF NOT EXISTS (SELECT 1 FROM SYS.OBJECTS WHERE OBJECT_ID = OBJECT_ID(N'akka_projection_offset_store') AND TYPE IN (N'U'))
BEGIN
CREATE TABLE akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BIT NOT NULL,
  last_updated BIGINT NOT NULL
)

ALTER TABLE akka_projection_offset_store ADD CONSTRAINT pk_projection_id PRIMARY KEY(projection_name, projection_key)

CREATE INDEX akka_projection_name_index ON akka_projection_offset_store (projection_name)
END

IF NOT EXISTS (SELECT 1 FROM SYS.OBJECTS WHERE OBJECT_ID = OBJECT_ID(N'akka_projection_management') AND TYPE IN (N'U'))
BEGIN
CREATE TABLE akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BIT NOT NULL,
  last_updated BIGINT NOT NULL
)

ALTER TABLE akka_projection_management ADD CONSTRAINT pk_projection_management_id PRIMARY KEY(projection_name, projection_key)
END
```

Oracle

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/resources/create-table-oracle.sql#L3-L26 "Go to snippet source")BEGIN
execute immediate 'create table "AKKA_PROJECTION_OFFSET_STORE" ("PROJECTION_NAME" VARCHAR2(255) NOT NULL,"PROJECTION_KEY" VARCHAR2(255) NOT NULL,"CURRENT_OFFSET" VARCHAR2(255) NOT NULL,"MANIFEST" VARCHAR2(4) NOT NULL,"MERGEABLE" CHAR(1) NOT NULL check ("MERGEABLE" in (0, 1)),"LAST_UPDATED" NUMBER(19) NOT NULL) ';
execute immediate 'alter table "AKKA_PROJECTION_OFFSET_STORE" add constraint "PK_PROJECTION_ID" primary key("PROJECTION_NAME","PROJECTION_KEY") ';
execute immediate 'create index "AKKA_PROJECTION_NAME_INDEX" on "AKKA_PROJECTION_OFFSET_STORE" ("PROJECTION_NAME") ';
EXCEPTION
    WHEN OTHERS THEN
      IF SQLCODE = -955 THEN
        NULL; -- suppresses ORA-00955 exception
      ELSE
         RAISE;
      END IF;
END;

BEGIN
execute immediate 'create table "AKKA_PROJECTION_MANAGEMENT" ("PROJECTION_NAME" VARCHAR2(255) NOT NULL,"PROJECTION_KEY" VARCHAR2(255) NOT NULL,"PAUSED" CHAR(1) NOT NULL check ("PAUSED" in (0, 1)),"LAST_UPDATED" NUMBER(19) NOT NULL) ';
execute immediate 'alter table "AKKA_PROJECTION_MANAGEMENT" add constraint "PK_PROJECTION_MANAGEMENT_ID" primary key("PROJECTION_NAME","PROJECTION_KEY") ';
EXCEPTION
    WHEN OTHERS THEN
      IF SQLCODE = -955 THEN
        NULL; -- suppresses ORA-00955 exception
      ELSE
         RAISE;
      END IF;
END;
```

H2

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/resources/create-table-h2.sql#L3-L21 "Go to snippet source")CREATE TABLE IF NOT EXISTS "akka_projection_offset_store" (
  "projection_name" VARCHAR(255) NOT NULL,
  "projection_key" VARCHAR(255) NOT NULL,
  "current_offset" VARCHAR(255) NOT NULL,
  "manifest" VARCHAR(4) NOT NULL,
  "mergeable" BOOLEAN NOT NULL,
  "last_updated" BIGINT NOT NULL,
  PRIMARY KEY("projection_name", "projection_key")
);

CREATE INDEX IF NOT EXISTS "akka_projection_name_index" ON "akka_projection_offset_store" ("projection_name");

CREATE TABLE IF NOT EXISTS "akka_projection_management" (
  "projection_name" VARCHAR(255) NOT NULL,
  "projection_key" VARCHAR(255) NOT NULL,
  "paused" BOOLEAN NOT NULL,
  "last_updated" BIGINT NOT NULL,
  PRIMARY KEY("projection_name", "projection_key")
);
```

The schema can be created and dropped using the methods `JdbcProjection.createTablesIfNotExists` and `JdbcProjection.dropTablesIfExists`. This is particularly useful when writting tests. For production enviornments, we recommend creating the schema before deploying the application.

Important
As of version 1\.2\.2, the index name `PROJECTION_NAME_INDEX` has been changed to `AKKA_PROJECTION_NAME_INDEX` If you have a schema in production, we recommend applying an ALTER index script to change it accordingly.

@@@ warning { title\=Important } As of version 1\.1\.0, the schema for PostgreSQL and H2 databases has changed. It now defaults to lowercase table and column names. If you have a schema in production, we recommend applying an ALTER table script to change it accordingly.

Alternatively, you can fallback to the uppercase format. You will also need to set `akka.projection.jdbc.offset-store.table` as an uppercase value, as this setting is now defaulting to lowercase.

```
akka.projection.jdbc.offset-store {
  table = "AKKA_PROJECTION_OFFSET_STORE"
  use-lowercase-schema = false
}

```

## Offset types

The supported offset types of the `JdbcProjection` are:

- [`Offset`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Offset.html "akka.persistence.query.Offset")[`Offset`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html "akka.persistence.query.Offset") types from [events from Akka Persistence](eventsourced.html)
- [`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset")[`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset") that is used for [messages from Kafka](kafka.html#mergeable-offset)
- `String`
- `Int`
- `Long`
- Any other type that has a configured Akka Serializer is stored with base64 encoding of the serialized bytes.

## Configuration

Make your edits/overrides in your application.conf.

The reference configuration file with the default values:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-jdbc/src/main/resources/reference.conf#L5-L35 "Go to snippet source")akka.projection.jdbc {
  # choose one of: mysql-dialect, postgres-dialect, mssql-dialect, oracle-dialect or h2-dialect (testing)
  dialect = ""
  use-dispatcher = "akka.projection.jdbc.blocking-jdbc-dispatcher"
  blocking-jdbc-dispatcher {
    type = Dispatcher
    executor = "thread-pool-executor"
    thread-pool-executor {
      # Use same number of threads as connections in the JDBC connection pool.
      fixed-pool-size = ""
    }
    throughput = 1
  }

  offset-store {
    # set this to your database schema if applicable, empty by default
    schema = ""
    # the database table name for the offset store
    table = "akka_projection_offset_store"

    # the database table name for the projection manangement data
    management-table = "akka_projection_management"

    # Use lowercase table and column names. 
    # This is mostly useful for H2 and Postgres databases. MySQL and SQL Server are case insensitive. 
    # Oracle schema is case sensitive and is defined with uppercase, this property is therefore ignore when using Oracle
    use-lowercase-schema = true
  }

  debug.verbose-offset-store-logging = false
}
```
Note
Settings `akka.projection.jdbc.dialect` and `akka.projection.jdbc.blocking-jdbc-dispatcher.thread-pool-executor.fixed-pool-size` do not have a valid default value. You must configured them in your `application.conf` file. 

See [Required Configuration Settings](jdbc.html#required-configuration-settings) and [Blocking JDBC Dispatcher](jdbc.html#blocking-jdbc-dispatcher) sections for details.

## Code Examples

### Example 1: Dependencies

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 2: Dependencies

```xml
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>
```

### Example 3: Dependencies

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Dependencies

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-projection-jdbc" % "1.6.20"
```

### Example 5: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-jdbc_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
</dependencies>
```

### Example 6: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-jdbc_${versions.ScalaBinary}:1.6.20"
}
```

### Example 7: Defining a JdbcSession

```scala
import java.sql.Connection
import java.sql.DriverManager
import akka.projection.jdbc.JdbcSession

class PlainJdbcSession extends JdbcSession {

  lazy val conn = {
    Class.forName("org.h2.Driver")
    val c = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;OPTIMIZE_REUSE_RESULTS=FALSE")
    c.setAutoCommit(false)
    c
  }
  override def withConnection[Result](func: function.Function[Connection, Result]): Result =
    func(conn)
  override def commit(): Unit = conn.commit()
  override def rollback(): Unit = conn.rollback()
  override def close(): Unit = conn.close()
}
```

### Example 8: Defining a JdbcSession

```java
import akka.projection.jdbc.JdbcSession;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

class PlainJdbcSession implements JdbcSession {

  private final Connection connection;

  public PlainJdbcSession() {
    try {
      Class.forName("org.h2.Driver");
      this.connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;OPTIMIZE_REUSE_RESULTS=FALSE");
      connection.setAutoCommit(false);
    } catch (ClassNotFoundException | SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public <Result> Result withConnection(Function<Connection, Result> func) throws Exception {
    return func.apply(connection);
  }

  @Override
  public void commit() throws SQLException {
    connection.commit();
  }

  @Override
  public void rollback() throws SQLException {
    connection.rollback();
  }

  @Override
  public void close() throws SQLException {
    connection.close();
  }
}
```

### Example 9: Defining a JdbcSession

```java
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.sql.Connection;
import java.sql.SQLException;
import org.hibernate.Session;

public class HibernateJdbcSession implements JdbcSession {

  public final EntityManager entityManager;
  private final EntityTransaction transaction;

  public HibernateJdbcSession(EntityManager entityManager) {
    this.entityManager = entityManager;
    this.transaction = this.entityManager.getTransaction();
    this.transaction.begin();
  }

  @Override
  public <Result> Result withConnection(Function<Connection, Result> func) {
    Session hibernateSession = entityManager.unwrap(Session.class);
    return hibernateSession.doReturningWork(
        connection -> {
          try {
            return func.apply(connection);
          } catch (SQLException e) {
            throw e;
          } catch (Exception e) {
            throw new SQLException(e);
          }
        });
  }

  @Override
  public void commit() {
    transaction.commit();
  }

  @Override
  public void rollback() {
    // propagates rollback call if transaction is active
    if (transaction.isActive()) transaction.rollback();
  }

  @Override
  public void close() {
    this.entityManager.close();
  }
}
```

### Example 10: Defining a JdbcSession

```java
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateSessionFactory {
  private final EntityManagerFactory entityManagerFactory;

  public HibernateSessionFactory() {
    this.entityManagerFactory = Persistence.createEntityManagerFactory("akka-projection-hibernate");
  }

  public HibernateJdbcSession newInstance() {
    return new HibernateJdbcSession(entityManagerFactory.createEntityManager());
  }
}
```

### Example 11: exactly-once

```scala
import akka.projection.ProjectionId
import akka.projection.jdbc.scaladsl.JdbcProjection

val projection =
  JdbcProjection
    .exactlyOnce(
      projectionId = ProjectionId("ShoppingCarts", "carts-1"),
      sourceProvider,
      () => new PlainJdbcSession, // JdbcSession Factory
      handler = () => new ShoppingCartHandler(orderRepository))
```

### Example 12: exactly-once

```java
final HibernateSessionFactory sessionProvider = new HibernateSessionFactory();

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    JdbcProjection.exactlyOnce(
        ProjectionId.of("shopping-carts", "carts-1"),
        sourceProvider,
        sessionProvider::newInstance,
        ShoppingCartHandler::new,
        system);
```

### Example 13: at-least-once

```scala
import akka.projection.ProjectionId
import akka.projection.jdbc.scaladsl.JdbcProjection

val projection =
  JdbcProjection
    .atLeastOnce(
      projectionId = ProjectionId("ShoppingCarts", "carts-1"),
      sourceProvider,
      () => new PlainJdbcSession, // JdbcSession Factory
      handler = () => new ShoppingCartHandler(orderRepository))
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

### Example 14: at-least-once

```java
final HibernateSessionFactory sessionProvider = new HibernateSessionFactory();
int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    JdbcProjection.atLeastOnce(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            sessionProvider::newInstance,
            ShoppingCartHandler::new,
            system)
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

### Example 15: groupedWithin

```scala
import akka.projection.ProjectionId
import akka.projection.jdbc.scaladsl.JdbcProjection

val projection =
  JdbcProjection
    .groupedWithin(
      projectionId = ProjectionId("ShoppingCarts", "carts-1"),
      sourceProvider,
      () => new PlainJdbcSession, // JdbcSession Factory
      handler = () => new GroupedShoppingCartHandler(orderRepository))
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

### Example 16: groupedWithin

```java
final HibernateSessionFactory sessionProvider = new HibernateSessionFactory();
int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    JdbcProjection.groupedWithin(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            sessionProvider::newInstance,
            GroupedShoppingCartHandler::new,
            system)
        .withGroup(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

### Example 17: Handler

```scala
import akka.projection.jdbc.scaladsl.JdbcHandler

class ShoppingCartHandler(repository: OrderRepository)
    extends JdbcHandler[EventEnvelope[ShoppingCart.Event], PlainJdbcSession] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(session: PlainJdbcSession, envelope: EventEnvelope[ShoppingCart.Event]): Unit = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")
        session.withConnection { conn =>
          repository.save(conn, Order(cartId, time))
        }

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
    }
  }
}
```

### Example 18: Handler

```java
public class ShoppingCartHandler
    extends JdbcHandler<EventEnvelope<ShoppingCart.Event>, HibernateJdbcSession> {
  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public void process(HibernateJdbcSession session, EventEnvelope<ShoppingCart.Event> envelope)
      throws Exception {
    ShoppingCart.Event event = envelope.event();
    if (event instanceof ShoppingCart.CheckedOut) {
      ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
      logger.info(
          "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

      // pass the EntityManager created by the projection
      // to the repository in order to use the same transaction
      orderRepository.save(
          session.entityManager, new Order(checkedOut.cartId, checkedOut.eventTime));
    } else {
      logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
    }
  }
}
```

### Example 19: Handler

```scala
case class Order(id: String, time: Instant)
trait OrderRepository {
  def save(connection: Connection, order: Order): Unit
}
```

### Example 20: Handler

```java
class Order {
  public final String id;
  public final Instant time;

  public Order(String id, Instant time) {
    this.id = id;
    this.time = time;
  }
}

interface OrderRepository {
  void save(EntityManager entityManager, Order order);
}
```

### Example 21: Grouped handler

```scala
import akka.projection.jdbc.scaladsl.JdbcHandler

import scala.collection.immutable

class GroupedShoppingCartHandler(repository: OrderRepository)
    extends JdbcHandler[immutable.Seq[EventEnvelope[ShoppingCart.Event]], PlainJdbcSession] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(
      session: PlainJdbcSession,
      envelopes: immutable.Seq[EventEnvelope[ShoppingCart.Event]]): Unit = {

    // save all events in DB
    envelopes.map(_.event).foreach {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")
        session.withConnection { conn =>
          repository.save(conn, Order(cartId, time))
        }

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
    }
  }
}
```

### Example 22: Grouped handler

```java
public class GroupedShoppingCartHandler
    extends JdbcHandler<List<EventEnvelope<ShoppingCart.Event>>, HibernateJdbcSession> {
  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public void process(
      HibernateJdbcSession session, List<EventEnvelope<ShoppingCart.Event>> envelopes)
      throws Exception {
    for (EventEnvelope<ShoppingCart.Event> envelope : envelopes) {
      ShoppingCart.Event event = envelope.event();
      if (event instanceof ShoppingCart.CheckedOut) {
        ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
        logger.info(
            "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

        // pass the EntityManager created by the projection
        // to the repository in order to use the same transaction
        orderRepository.save(
            session.entityManager, new Order(checkedOut.cartId, checkedOut.eventTime));

      } else {
        logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      }
    }
  }
}
```

### Example 23: Schema

```sql
CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

CREATE INDEX IF NOT EXISTS akka_projection_name_index ON akka_projection_offset_store (projection_name);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

### Example 24: Schema

```sql
CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

CREATE INDEX akka_projection_name_index ON akka_projection_offset_store (projection_name);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

### Example 25: Schema

```sql
IF NOT EXISTS (SELECT 1 FROM SYS.OBJECTS WHERE OBJECT_ID = OBJECT_ID(N'akka_projection_offset_store') AND TYPE IN (N'U'))
BEGIN
CREATE TABLE akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BIT NOT NULL,
  last_updated BIGINT NOT NULL
)

ALTER TABLE akka_projection_offset_store ADD CONSTRAINT pk_projection_id PRIMARY KEY(projection_name, projection_key)

CREATE INDEX akka_projection_name_index ON akka_projection_offset_store (projection_name)
END

IF NOT EXISTS (SELECT 1 FROM SYS.OBJECTS WHERE OBJECT_ID = OBJECT_ID(N'akka_projection_management') AND TYPE IN (N'U'))
BEGIN
CREATE TABLE akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BIT NOT NULL,
  last_updated BIGINT NOT NULL
)

ALTER TABLE akka_projection_management ADD CONSTRAINT pk_projection_management_id PRIMARY KEY(projection_name, projection_key)
END
```

### Example 26: Schema

```sql
BEGIN
execute immediate 'create table "AKKA_PROJECTION_OFFSET_STORE" ("PROJECTION_NAME" VARCHAR2(255) NOT NULL,"PROJECTION_KEY" VARCHAR2(255) NOT NULL,"CURRENT_OFFSET" VARCHAR2(255) NOT NULL,"MANIFEST" VARCHAR2(4) NOT NULL,"MERGEABLE" CHAR(1) NOT NULL check ("MERGEABLE" in (0, 1)),"LAST_UPDATED" NUMBER(19) NOT NULL) ';
execute immediate 'alter table "AKKA_PROJECTION_OFFSET_STORE" add constraint "PK_PROJECTION_ID" primary key("PROJECTION_NAME","PROJECTION_KEY") ';
execute immediate 'create index "AKKA_PROJECTION_NAME_INDEX" on "AKKA_PROJECTION_OFFSET_STORE" ("PROJECTION_NAME") ';
EXCEPTION
    WHEN OTHERS THEN
      IF SQLCODE = -955 THEN
        NULL; -- suppresses ORA-00955 exception
      ELSE
         RAISE;
      END IF;
END;

BEGIN
execute immediate 'create table "AKKA_PROJECTION_MANAGEMENT" ("PROJECTION_NAME" VARCHAR2(255) NOT NULL,"PROJECTION_KEY" VARCHAR2(255) NOT NULL,"PAUSED" CHAR(1) NOT NULL check ("PAUSED" in (0, 1)),"LAST_UPDATED" NUMBER(19) NOT NULL) ';
execute immediate 'alter table "AKKA_PROJECTION_MANAGEMENT" add constraint "PK_PROJECTION_MANAGEMENT_ID" primary key("PROJECTION_NAME","PROJECTION_KEY") ';
EXCEPTION
    WHEN OTHERS THEN
      IF SQLCODE = -955 THEN
        NULL; -- suppresses ORA-00955 exception
      ELSE
         RAISE;
      END IF;
END;
```

### Example 27: Schema

```sql
CREATE TABLE IF NOT EXISTS "akka_projection_offset_store" (
  "projection_name" VARCHAR(255) NOT NULL,
  "projection_key" VARCHAR(255) NOT NULL,
  "current_offset" VARCHAR(255) NOT NULL,
  "manifest" VARCHAR(4) NOT NULL,
  "mergeable" BOOLEAN NOT NULL,
  "last_updated" BIGINT NOT NULL,
  PRIMARY KEY("projection_name", "projection_key")
);

CREATE INDEX IF NOT EXISTS "akka_projection_name_index" ON "akka_projection_offset_store" ("projection_name");

CREATE TABLE IF NOT EXISTS "akka_projection_management" (
  "projection_name" VARCHAR(255) NOT NULL,
  "projection_key" VARCHAR(255) NOT NULL,
  "paused" BOOLEAN NOT NULL,
  "last_updated" BIGINT NOT NULL,
  PRIMARY KEY("projection_name", "projection_key")
);
```

### Example 28: Schema

```hocon
akka.projection.jdbc.offset-store {
  table = "AKKA_PROJECTION_OFFSET_STORE"
  use-lowercase-schema = false
}
```

### Example 29: Configuration

```conf
akka.projection.jdbc {
  # choose one of: mysql-dialect, postgres-dialect, mssql-dialect, oracle-dialect or h2-dialect (testing)
  dialect = ""
  use-dispatcher = "akka.projection.jdbc.blocking-jdbc-dispatcher"
  blocking-jdbc-dispatcher {
    type = Dispatcher
    executor = "thread-pool-executor"
    thread-pool-executor {
      # Use same number of threads as connections in the JDBC connection pool.
      fixed-pool-size = ""
    }
    throughput = 1
  }

  offset-store {
    # set this to your database schema if applicable, empty by default
    schema = ""
    # the database table name for the offset store
    table = "akka_projection_offset_store"

    # the database table name for the projection manangement data
    management-table = "akka_projection_management"

    # Use lowercase table and column names. 
    # This is mostly useful for H2 and Postgres databases. MySQL and SQL Server are case insensitive. 
    # Oracle schema is case sensitive and is defined with uppercase, this property is therefore ignore when using Oracle
    use-lowercase-schema = true
  }

  debug.verbose-offset-store-logging = false
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/JdbcSession.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/javadsl/JdbcProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/scaladsl/JdbcHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/scaladsl/JdbcProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-projection/current/actor.html
- https://doc.akka.io/libraries/akka-projection/current/cassandra.html
- https://doc.akka.io/libraries/akka-projection/current/error.html
- https://doc.akka.io/libraries/akka-projection/current/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/current/flow.html
- https://doc.akka.io/libraries/akka-projection/current/jdbc.html
- https://doc.akka.io/libraries/akka-projection/current/kafka.html
- https://doc.akka.io/libraries/akka-projection/current/overview.html
- https://doc.akka.io/libraries/akka-projection/current/slick.html
- https://doc.akka.io/libraries/akka-projection/current/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/jdbc.html](https://doc.akka.io/libraries/akka-projection/current/jdbc.html)*