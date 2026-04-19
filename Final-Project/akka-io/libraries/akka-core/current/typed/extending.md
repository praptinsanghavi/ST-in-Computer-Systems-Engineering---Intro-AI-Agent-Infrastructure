---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/extending.html
title: Extending Akka • Akka core
---

# Extending Akka • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Extending Akka

Akka extensions can be used for almost anything, they provide a way to create an instance of a class only once for the whole ActorSystem and be able to access it from anywhere. Akka features such as Cluster, Serialization and Sharding are all Akka extensions. Below is the use\-case of managing an expensive database connection pool and accessing it from various places in your application.

You can choose to have your Extension loaded on\-demand or at `ActorSystem` creation time through the Akka configuration. Details on how to make that happens are below, in the [Loading from Configuration](extending.html#loading) section.

Warning
Since an extension is a way to hook into Akka itself, the implementor of the extension needs to ensure the thread safety and that it is non\-blocking.

## Building an extension

Let’s build an extension to manage a shared database connection pool.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/extensions/ExtensionDocSpec.scala#L18-L20 "Go to snippet source")class ExpensiveDatabaseConnection {
  def executeQuery(query: String): Future[Any] = ???
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/extensions/ExtensionDocTest.java#L18-L23 "Go to snippet source")public class ExpensiveDatabaseConnection {
  public CompletionStage<Object> executeQuery(String query) {
    throw new RuntimeException("I should do a database query");
  }
  // ...
}
```

First create an [`Extension`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Extension.html "akka.actor.typed.Extension")[`Extension`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Extension.html "akka.actor.typed.Extension"), this will be created only once per ActorSystem:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/extensions/ExtensionDocSpec.scala#L35-L41 "Go to snippet source")class DatabasePool(system: ActorSystem[_]) extends Extension {
  // database configuration can be loaded from config
  // from the actor system
  private val _connection = new ExpensiveDatabaseConnection()

  def connection(): ExpensiveDatabaseConnection = _connection
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/extensions/ExtensionDocTest.java#L27-L60 "Go to snippet source")public class DatabaseConnectionPool implements Extension {

  private final ExpensiveDatabaseConnection _connection;

  private DatabaseConnectionPool(ActorSystem<?> system) {
    // database configuration can be loaded from config
    // from the actor system
    _connection = new ExpensiveDatabaseConnection();
  }

  public ExpensiveDatabaseConnection connection() {
    return _connection;
  }
}
```

This is the public API of your extension. Internally in this example we instantiate our expensive database connection. 

Then create an [`ExtensionId`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensionId.html "akka.actor.typed.ExtensionId")[`ExtensionId`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionId.html "akka.actor.typed.ExtensionId") to identify the extension. A good convention is to let the companion object of the `Extension` be the `ExtensionId`.A good convention is to define the `ExtensionId` as a static inner class of the `Extension`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/extensions/ExtensionDocSpec.scala#L24-L30 "Go to snippet source")object DatabasePool extends ExtensionId[DatabasePool] {
  // will only be called once
  def createExtension(system: ActorSystem[_]): DatabasePool = new DatabasePool(system)

  // Java API
  def get(system: ActorSystem[_]): DatabasePool = apply(system)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/extensions/ExtensionDocTest.java#L30-L45 "Go to snippet source")public static class Id extends ExtensionId<DatabaseConnectionPool> {

  private static final Id instance = new Id();

  private Id() {}

  // called once per ActorSystem
  @Override
  public DatabaseConnectionPool createExtension(ActorSystem<?> system) {
    return new DatabaseConnectionPool(system);
  }

  public static DatabaseConnectionPool get(ActorSystem<?> system) {
    return instance.apply(system);
  }
}
```

Then finally to use the extension it can be looked up:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/extensions/ExtensionDocSpec.scala#L54-L57 "Go to snippet source")Behaviors.setup[Any] { ctx =>
  DatabasePool(ctx.system).connection().executeQuery("insert into...")
  initialBehavior
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/extensions/ExtensionDocTest.java#L69-L75 "Go to snippet source")Behaviors.setup(
    (context) -> {
      DatabaseConnectionPool.Id.get(context.getSystem())
          .connection()
          .executeQuery("insert into...");
      return initialBehavior();
    });
```

The `DatabaseConnectionPool` can be looked up in this way any number of times and it will return the same instance.

## Loading from configuration

Loading an extension from configuration is optional. It is an optimization and can be used to eagerly load the extension when the ActorSystem is started. If not done from configuration, the extension is instantiated and registered the first time it is accessed.

To be able to load extensions from your Akka configuration you must add FQCNs of implementations of the `ExtensionId` in the `akka.actor.typed.extensions` section of the config you provide to your `ActorSystem`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/extensions/ExtensionDocSpec.scala#L47 "Go to snippet source")akka.actor.typed.extensions = ["docs.akka.extensions.DatabasePool"]
```

Java

```
akka.actor.typed {
  extensions = ["jdocs.akka.extensions.ExtensionDocTest$DatabaseConnectionPool$Id"]
}

```

## Code Examples

### Example 1: Building an extension

```scala
class ExpensiveDatabaseConnection {
  def executeQuery(query: String): Future[Any] = ???
}
```

### Example 2: Building an extension

```java
public class ExpensiveDatabaseConnection {
  public CompletionStage<Object> executeQuery(String query) {
    throw new RuntimeException("I should do a database query");
  }
  // ...
}
```

### Example 3: Building an extension

```scala
class DatabasePool(system: ActorSystem[_]) extends Extension {
  // database configuration can be loaded from config
  // from the actor system
  private val _connection = new ExpensiveDatabaseConnection()

  def connection(): ExpensiveDatabaseConnection = _connection
}
```

### Example 4: Building an extension

```java
public class DatabaseConnectionPool implements Extension {

  private final ExpensiveDatabaseConnection _connection;

  private DatabaseConnectionPool(ActorSystem<?> system) {
    // database configuration can be loaded from config
    // from the actor system
    _connection = new ExpensiveDatabaseConnection();
  }

  public ExpensiveDatabaseConnection connection() {
    return _connection;
  }
}
```

### Example 5: Building an extension

```scala
object DatabasePool extends ExtensionId[DatabasePool] {
  // will only be called once
  def createExtension(system: ActorSystem[_]): DatabasePool = new DatabasePool(system)

  // Java API
  def get(system: ActorSystem[_]): DatabasePool = apply(system)
}
```

### Example 6: Building an extension

```java
public static class Id extends ExtensionId<DatabaseConnectionPool> {

  private static final Id instance = new Id();

  private Id() {}

  // called once per ActorSystem
  @Override
  public DatabaseConnectionPool createExtension(ActorSystem<?> system) {
    return new DatabaseConnectionPool(system);
  }

  public static DatabaseConnectionPool get(ActorSystem<?> system) {
    return instance.apply(system);
  }
}
```

### Example 7: Building an extension

```scala
Behaviors.setup[Any] { ctx =>
  DatabasePool(ctx.system).connection().executeQuery("insert into...")
  initialBehavior
}
```

### Example 8: Building an extension

```java
Behaviors.setup(
    (context) -> {
      DatabaseConnectionPool.Id.get(context.getSystem())
          .connection()
          .executeQuery("insert into...");
      return initialBehavior();
    });
```

### Example 9: Loading from configuration

```scala
akka.actor.typed.extensions = ["docs.akka.extensions.DatabasePool"]
```

### Example 10: Loading from configuration

```ruby
akka.actor.typed {
  extensions = ["jdocs.akka.extensions.ExtensionDocTest$DatabaseConnectionPool$Id"]
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/libraries/akka-core/current/common/other-modules.html
- https://doc.akka.io/libraries/akka-core/current/futures.html
- https://doc.akka.io/libraries/akka-core/current/typed/extending.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/extending.html](https://doc.akka.io/libraries/akka-core/current/typed/extending.html)*