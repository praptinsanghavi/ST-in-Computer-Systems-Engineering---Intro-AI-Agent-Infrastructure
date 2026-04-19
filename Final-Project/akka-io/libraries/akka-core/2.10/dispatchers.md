---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:27:56Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/dispatchers.html
title: Classic Dispatchers • Akka core
---

# Classic Dispatchers • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Dispatchers

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the full documentation of this feature and for new projects see [Dispatchers](typed/dispatchers.html).

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Dispatchers are part of core Akka, which means that they are part of the akka\-actor dependency:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

## Looking up a Dispatcher

Dispatchers implement the [`ExecutionContext`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html "scala.concurrent.ExecutionContext")[`Executor`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Executor.html "java.util.concurrent.Executor") interface and can thus be used to run [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")[`CompletableFuture`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletableFuture.html "java.util.concurrent.CompletableFuture") invocations etc.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L343-L344 "Go to snippet source")// for use with Futures, Scheduler, etc.
implicit val executionContext = system.dispatchers.lookup("my-dispatcher")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/dispatcher/DispatcherDocTest.java#L91-L94 "Go to snippet source")// this is scala.concurrent.ExecutionContextExecutor, which implements
// both scala.concurrent.ExecutionContext (for use with Futures, Scheduler, etc.)
// and java.util.concurrent.Executor (for use with CompletableFuture etc.)
final ExecutionContextExecutor ex = system.dispatchers().lookup("my-dispatcher");
```

## Setting the dispatcher for an Actor

So in case you want to give your [`Actor`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html "akka.actor.Actor")[`Actor`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html "akka.actor.Actor") a different dispatcher than the default, you need to do two things, of which the first is to configure the dispatcher:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L50-L70 "Go to snippet source")my-dispatcher {
  # Dispatcher is the name of the event-based dispatcher
  type = Dispatcher
  # What kind of ExecutionService to use
  executor = "fork-join-executor"
  # Configuration for the fork join pool
  fork-join-executor {
    # Min number of threads to cap factor-based parallelism number to
    parallelism-min = 2
    # Parallelism (threads) ... ceil(available processors * factor)
    parallelism-factor = 2.0
    # Max number of threads to cap factor-based parallelism number to
    parallelism-max = 10
    # Max number of additional threads to spawn by ManagedBlocker
    maximum-spare-threads = 16
  }
  # Throughput defines the maximum number of messages to be
  # processed per actor before the thread jumps to the next actor.
  # Set to 1 for as fair as possible.
  throughput = 100
}
```
Note
Note that the `parallelism-max` does not set the upper bound on the total number of threads allocated by the ForkJoinPool. It is a setting specifically talking about the number of *hot* threads the pool keep running in order to reduce the latency of handling a new incoming task. You can read more about parallelism in the JDK’s [ForkJoinPool documentation](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ForkJoinPool.html).

Another example that uses the “thread\-pool\-executor”:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L134-L141 "Go to snippet source")blocking-io-dispatcher {
  type = Dispatcher
  executor = "thread-pool-executor"
  thread-pool-executor {
    fixed-pool-size = 32
  }
  throughput = 1
}
```
Note
The thread pool executor dispatcher is implemented using a [`java.util.concurrent.ThreadPoolExecutor`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ThreadPoolExecutor.html "java.util.concurrent.ThreadPoolExecutor"). You can read more about it in the JDK’s [ThreadPoolExecutor documentation](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadPoolExecutor.html).

For more options, see [Dispatchers](typed/dispatchers.html) and the `default-dispatcher` section of the [configuration](general/configuration.html).

Then you create the actor as usual and define the dispatcher in the deployment configuration.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L299-L300 "Go to snippet source")import akka.actor.Props
val myActor = context.actorOf(Props[MyActor](), "myactor")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/dispatcher/DispatcherDocTest.java#L57 "Go to snippet source")ActorRef myActor = system.actorOf(Props.create(MyActor.class), "myactor");
```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L173-L177 "Go to snippet source")akka.actor.deployment {
  /myactor {
    dispatcher = my-dispatcher
  }
}
```

An alternative to the deployment configuration is to define the dispatcher in code. If you define the `dispatcher` in the deployment configuration then this value will be used instead of programmatically provided parameter.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L307-L309 "Go to snippet source")import akka.actor.Props
val myActor =
  context.actorOf(Props[MyActor]().withDispatcher("my-dispatcher"), "myactor1")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/dispatcher/DispatcherDocTest.java#L65-L66 "Go to snippet source")ActorRef myActor =
    system.actorOf(Props.create(MyActor.class).withDispatcher("my-dispatcher"), "myactor3");
```

Note
The dispatcher you specify in [`withDispatcher`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html#withDispatcher(d:String):akka.actor.Props "akka.actor.Props")[`withDispatcher`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html#withDispatcher(java.lang.String) "akka.actor.Props") and the `dispatcher` property in the deployment configuration is in fact a path into your configuration. So in this example it’s a top\-level section, but you could for instance put it as a sub\-section, where you’d use periods to denote sub\-sections, like this: `"foo.bar.my-dispatcher"`

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
```

### Example 2: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

### Example 4: Looking up a Dispatcher

```scala
// for use with Futures, Scheduler, etc.
implicit val executionContext = system.dispatchers.lookup("my-dispatcher")
```

### Example 5: Looking up a Dispatcher

```java
// this is scala.concurrent.ExecutionContextExecutor, which implements
// both scala.concurrent.ExecutionContext (for use with Futures, Scheduler, etc.)
// and java.util.concurrent.Executor (for use with CompletableFuture etc.)
final ExecutionContextExecutor ex = system.dispatchers().lookup("my-dispatcher");
```

### Example 6: Setting the dispatcher for an Actor

```scala
my-dispatcher {
  # Dispatcher is the name of the event-based dispatcher
  type = Dispatcher
  # What kind of ExecutionService to use
  executor = "fork-join-executor"
  # Configuration for the fork join pool
  fork-join-executor {
    # Min number of threads to cap factor-based parallelism number to
    parallelism-min = 2
    # Parallelism (threads) ... ceil(available processors * factor)
    parallelism-factor = 2.0
    # Max number of threads to cap factor-based parallelism number to
    parallelism-max = 10
    # Max number of additional threads to spawn by ManagedBlocker
    maximum-spare-threads = 16
  }
  # Throughput defines the maximum number of messages to be
  # processed per actor before the thread jumps to the next actor.
  # Set to 1 for as fair as possible.
  throughput = 100
}
```

### Example 7: Setting the dispatcher for an Actor

```scala
blocking-io-dispatcher {
  type = Dispatcher
  executor = "thread-pool-executor"
  thread-pool-executor {
    fixed-pool-size = 32
  }
  throughput = 1
}
```

### Example 8: Setting the dispatcher for an Actor

```scala
import akka.actor.Props
val myActor = context.actorOf(Props[MyActor](), "myactor")
```

### Example 9: Setting the dispatcher for an Actor

```java
ActorRef myActor = system.actorOf(Props.create(MyActor.class), "myactor");
```

### Example 10: Setting the dispatcher for an Actor

```scala
akka.actor.deployment {
  /myactor {
    dispatcher = my-dispatcher
  }
}
```

### Example 11: Setting the dispatcher for an Actor

```scala
import akka.actor.Props
val myActor =
  context.actorOf(Props[MyActor]().withDispatcher("my-dispatcher"), "myactor1")
```

### Example 12: Setting the dispatcher for an Actor

```java
ActorRef myActor =
    system.actorOf(Props.create(MyActor.class).withDispatcher("my-dispatcher"), "myactor3");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/libraries/akka-core/2.10/fault-tolerance.html
- https://doc.akka.io/libraries/akka-core/2.10/general/configuration.html
- https://doc.akka.io/libraries/akka-core/2.10/mailboxes.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/dispatchers.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/dispatchers.html](https://doc.akka.io/libraries/akka-core/2.10/dispatchers.html)*