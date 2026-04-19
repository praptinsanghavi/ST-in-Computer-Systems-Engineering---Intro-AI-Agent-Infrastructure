---
description: Akka Projection 1.5.9 - akka.projection.jdbc
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:32:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/index.html
title: Akka Projection 1.5.9 - akka.projection.jdbc
---

# Akka Projection 1.5.9 - akka.projection.jdbc

> **Summary:** Akka Projection 1.5.9 - akka.projection.jdbc

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](../cassandra/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/eventsourced/index.html "Permalink")  package [eventsourced](../eventsourced/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../grpc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/jdbc/index.html "Permalink")  package jdbcDefinition Classes[projection](../index.html)
- [**](../../../akka/projection/jdbc/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../../akka/projection/jdbc/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../akka/projection/jdbc/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [JdbcHandlerLifecycle](JdbcHandlerLifecycle.html)
- [JdbcSession](JdbcSession.html "Generic interface to give access to basic JDBC connection operations.")
- [**](../../../akka/projection/kafka/index.html "Permalink")  package [kafka](../kafka/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](../r2dbc/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/slick/index.html "Permalink")  package [slick](../slick/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[projection](../index.html)
- [**](../../../akka/projection/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[projection](../index.html)
p[akka](../../index.html).[projection](../index.html)

# jdbc[**](../../../akka/projection/jdbc/index.html "Permalink")

#### package jdbc

### Package Members

1. [**](../../../akka/projection/jdbc/internal/index.html "Permalink")  package [internal](internal/index.html)
2. [**](../../../akka/projection/jdbc/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
3. [**](../../../akka/projection/jdbc/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
### Type Members

1. [**](../../../akka/projection/jdbc/JdbcHandlerLifecycle.html "Permalink")  trait [JdbcHandlerLifecycle](JdbcHandlerLifecycle.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../akka/projection/jdbc/JdbcSession.html "Permalink")  trait [JdbcSession](JdbcSession.html "Generic interface to give access to basic JDBC connection operations.") extends [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Generic interface to give access to basic JDBC connection operations.

Generic interface to give access to basic JDBC connection operations.

A new [JdbcSession](JdbcSession.html) will be created for each call to the projection handler. Upon creation a database connection
must be created (preferably relying on connection pool) and used through out the live of this instance.

After usage, the underlying database connection will be closed (returned to the pool) after committing or rolling back
the transaction. It's paramount to configure the connection to NOT use `auto-commit` in order to guarantee that the
event handling and offset persistence operations participate on the same transaction.

The only requirement to implement a [JdbcSession](JdbcSession.html) is to have access to the underlying JDBC Connection.
When using plain JDBC, one can initialize a connection directly, but when relying on a JDBC framework like JPA it will depend on the
chosen implementation. Hibernate for instance provides indirect access to the underlying connection through a
lambda call and therefore can be used (see [JdbcSession\#withConnection](JdbcSession.html#withConnection[Result](func:akka.japi.function.Function[java.sql.Connection,Result]):Result) method). Other JPA implementations may not provide this feature.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/cassandra/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/eventsourced/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/internal/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/JdbcHandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/JdbcSession.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/internal/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/state/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/testkit/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/index.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/index.html)*