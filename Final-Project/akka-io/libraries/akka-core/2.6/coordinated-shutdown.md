---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/coordinated-shutdown.html
title: Coordinated Shutdown • Akka Documentation
---

# Coordinated Shutdown • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Coordinated Shutdown

Under normal conditions, when an `ActorSystem` is terminated or the JVM process is shut down, certain actors and services will be stopped in a specific order. 

The [`CoordinatedShutdown`](https://doc.akka.io/api/akka-core/2.6/akka/actor/CoordinatedShutdown$.html "akka.actor.CoordinatedShutdown")[`CoordinatedShutdown`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/CoordinatedShutdown.html "akka.actor.CoordinatedShutdown") extension registers internal and user\-defined tasks to be executed during the shutdown process. The tasks are grouped in configuration\-defined “phases” which define the shutdown order.

Especially the phases `before-service-unbind`, `before-cluster-shutdown` and `before-actor-system-terminate` are intended for application specific phases or tasks.

The order of the shutdown phases is defined in configuration `akka.coordinated-shutdown.phases`. See the default phases in the `reference.conf` tab:

Most relevant default phases

| Phase | Description |
| --- | --- |
| before\-service\-unbind | The first pre\-defined phase during shutdown. |
| before\-cluster\-shutdown | Phase for custom application tasks that are to be run after service shutdown and before cluster shutdown. |
| before\-actor\-system\-terminate | Phase for custom application tasks that are to be run after cluster shutdown and before `ActorSystem` termination. |

reference.conf (HOCON)
 

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor/src/main/resources/reference.conf#L1203-L1306 "Go to snippet source")# CoordinatedShutdown is enabled by default and will run the tasks that
# are added to these phases by individual Akka modules and user logic.
#
# The phases are ordered as a DAG by defining the dependencies between the phases
# to make sure shutdown tasks are run in the right order.
#
# In general user tasks belong in the first few phases, but there may be use
# cases where you would want to hook in new phases or register tasks later in
# the DAG.
#
# Each phase is defined as a named config section with the
# following optional properties:
# - timeout=15s: Override the default-phase-timeout for this phase.
# - recover=off: If the phase fails the shutdown is aborted
#                and depending phases will not be executed.
# - enabled=off: Skip all tasks registered in this phase. DO NOT use
#                this to disable phases unless you are absolutely sure what the
#                consequences are. Many of the built in tasks depend on other tasks
#                having been executed in earlier phases and may break if those are disabled.
# depends-on=[]: Run the phase after the given phases
phases {

  # The first pre-defined phase that applications can add tasks to.
  # Note that more phases can be added in the application's
  # configuration by overriding this phase with an additional
  # depends-on.
  before-service-unbind {
  }

  # Stop accepting new incoming connections.
  # This is where you can register tasks that makes a server stop accepting new connections. Already
  # established connections should be allowed to continue and complete if possible.
  service-unbind {
    depends-on = [before-service-unbind]
  }

  # Wait for requests that are in progress to be completed.
  # This is where you register tasks that will wait for already established connections to complete, potentially
  # also first telling them that it is time to close down.
  service-requests-done {
    depends-on = [service-unbind]
  }

  # Final shutdown of service endpoints.
  # This is where you would add tasks that forcefully kill connections that are still around.
  service-stop {
    depends-on = [service-requests-done]
  }

  # Phase for custom application tasks that are to be run
  # after service shutdown and before cluster shutdown.
  before-cluster-shutdown {
    depends-on = [service-stop]
  }

  # Graceful shutdown of the Cluster Sharding regions.
  # This phase is not meant for users to add tasks to.
  cluster-sharding-shutdown-region {
    timeout = 10 s
    depends-on = [before-cluster-shutdown]
  }

  # Emit the leave command for the node that is shutting down.
  # This phase is not meant for users to add tasks to.
  cluster-leave {
    depends-on = [cluster-sharding-shutdown-region]
  }

  # Shutdown cluster singletons
  # This is done as late as possible to allow the shard region shutdown triggered in
  # the "cluster-sharding-shutdown-region" phase to complete before the shard coordinator is shut down.
  # This phase is not meant for users to add tasks to.
  cluster-exiting {
    timeout = 10 s
    depends-on = [cluster-leave]
  }

  # Wait until exiting has been completed
  # This phase is not meant for users to add tasks to.
  cluster-exiting-done {
    depends-on = [cluster-exiting]
  }

  # Shutdown the cluster extension
  # This phase is not meant for users to add tasks to.
  cluster-shutdown {
    depends-on = [cluster-exiting-done]
  }

  # Phase for custom application tasks that are to be run
  # after cluster shutdown and before ActorSystem termination.
  before-actor-system-terminate {
    depends-on = [cluster-shutdown]
  }

  # Last phase. See terminate-actor-system and exit-jvm above.
  # Don't add phases that depends on this phase because the
  # dispatcher and scheduler of the ActorSystem have been shutdown.
  # This phase is not meant for users to add tasks to.
  actor-system-terminate {
    timeout = 10 s
    depends-on = [before-actor-system-terminate]
  }
}
```

More phases can be added in the application’s `application.conf` if needed by overriding a phase with an additional `depends-on`.

The default phases are defined in a single linear order, but the phases can be ordered as a directed acyclic graph (DAG) by defining the dependencies between the phases. The phases are ordered with [topological](https://en.wikipedia.org/wiki/Topological_sorting) sort of the DAG.

Tasks can be added to a phase like in this example which allows a certain actor to react before termination starts:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/actor/typed/CoordinatedActorShutdownSpec.scala#L20-L47 "Go to snippet source")object MyActor {

  trait Messages
  case class Stop(replyTo: ActorRef[Done]) extends Messages

  def behavior: Behavior[Messages] =
    Behaviors.receiveMessage {
      // ...
      case Stop(replyTo) =>
        // shut down the actor internals
        // ..
        replyTo.tell(Done)
        Behaviors.stopped
    }
}

  CoordinatedShutdown(context.system).addTask(CoordinatedShutdown.PhaseBeforeServiceUnbind, "someTaskName") { () =>
    implicit val timeout: Timeout = 5.seconds
    myActor.ask(MyActor.Stop(_))
  }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/actor/typed/CoordinatedActorShutdownTest.java#L15-L77 "Go to snippet source")import static akka.actor.typed.javadsl.AskPattern.ask;

public static class MyActor extends AbstractBehavior<MyActor.Messages> {
  interface Messages {}

  // ...

  static final class Stop implements Messages {
    final ActorRef<Done> replyTo;

    Stop(ActorRef<Done> replyTo) {
      this.replyTo = replyTo;
    }
  }
  @Override
  public Receive<Messages> createReceive() {
    return newReceiveBuilder().onMessage(Stop.class, this::stop).build();
  }

  private Behavior<Messages> stop(Stop stop) {
    // shut down the actor internal
    // ...
    stop.replyTo.tell(Done.done());
    return Behaviors.stopped();
  }
}

          CoordinatedShutdown.get(system)
              .addTask(
                  CoordinatedShutdown.PhaseBeforeServiceUnbind(),
                  "someTaskName",
                  () ->
                      ask(myActor, MyActor.Stop::new, Duration.ofSeconds(5), system.scheduler()));
```

The returned `Future[Done]` `CompletionStage<Done>` should be completed when the task is completed. The task name parameter is only used for debugging/logging.

Tasks added to the same phase are executed in parallel without any ordering assumptions. Next phase will not start until all tasks of previous phase have been completed.

If tasks are not completed within a configured timeout (see [reference.conf](general/configuration-reference.html#config-akka-actor)) the next phase will be started anyway. It is possible to configure `recover=off` for a phase to abort the rest of the shutdown process if a task fails or is not completed within the timeout.

If cancellation of previously added tasks is required:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/actor/typed/CoordinatedActorShutdownSpec.scala#L60-L69 "Go to snippet source")val c: Cancellable =
  CoordinatedShutdown(system).addCancellableTask(CoordinatedShutdown.PhaseBeforeServiceUnbind, "cleanup") { () =>
    Future {
      cleanup()
      Done
    }
  }

// much later...
c.cancel()
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/actor/typed/CoordinatedActorShutdownTest.java#L101-L106 "Go to snippet source")Cancellable cancellable =
    CoordinatedShutdown.get(system)
        .addCancellableTask(
            CoordinatedShutdown.PhaseBeforeServiceUnbind(), "someTaskCleanup", () -> cleanup());
// much later...
cancellable.cancel();
```

In the above example, it may be more convenient to simply stop the actor when it’s done shutting down, rather than send back a done message, and for the shutdown task to not complete until the actor is terminated. A convenience method is provided that adds a task that sends a message to the actor and then watches its termination (there is currently no corresponding functionality for the new actors API [see \#29056](https://github.com/akka/akka/issues/29056)):

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/actor/ActorDocSpec.scala#L733-L737 "Go to snippet source")CoordinatedShutdown(system).addActorTerminationTask(
  CoordinatedShutdown.PhaseBeforeServiceUnbind,
  "someTaskName",
  someActor,
  Some("stop"))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/actor/ActorDocTest.java#L890-L895 "Go to snippet source")CoordinatedShutdown.get(system)
    .addActorTerminationTask(
        CoordinatedShutdown.PhaseBeforeServiceUnbind(),
        "someTaskName",
        someActor,
        Optional.of("stop"));
```

Tasks should typically be registered as early as possible after system startup. When running the coordinated shutdown tasks that have been registered will be performed but tasks that are added too late will not be run.

To start the coordinated shutdown process you can either invoke `terminate()` on the `ActorSystem`, or `run` `runAll` on the `CoordinatedShutdown` extension and pass it a class implementing [`CoordinatedShutdown.Reason`](https://doc.akka.io/api/akka-core/2.6/akka/actor/CoordinatedShutdown$$Reason.html "akka.actor.CoordinatedShutdown.Reason")[`CoordinatedShutdown.Reason`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/CoordinatedShutdown.Reason.html "akka.actor.CoordinatedShutdown.Reason") for informational purposes:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/actor/typed/CoordinatedActorShutdownSpec.scala#L81-L87 "Go to snippet source")// shut down with `ActorSystemTerminateReason`
system.terminate()

// or define a specific reason
case object UserInitiatedShutdown extends CoordinatedShutdown.Reason

val done: Future[Done] = CoordinatedShutdown(system).run(UserInitiatedShutdown)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/actor/typed/CoordinatedActorShutdownTest.java#L117-L129 "Go to snippet source")// shut down with `ActorSystemTerminateReason`
system.terminate();

// or define a specific reason
class UserInitiatedShutdown implements CoordinatedShutdown.Reason {
  @Override
  public String toString() {
    return "UserInitiatedShutdown";
  }
}

CompletionStage<Done> done =
    CoordinatedShutdown.get(system).runAll(new UserInitiatedShutdown());
```

It’s safe to call the `run` `runAll` method multiple times. It will only run once.

That also means that the `ActorSystem` will be terminated in the last phase. By default, the JVM is not forcefully stopped (it will be stopped if all non\-daemon threads have been terminated). To enable a hard `System.exit` as a final action you can configure:

```
akka.coordinated-shutdown.exit-jvm = on

```

The coordinated shutdown process is also started once the actor system’s root actor is stopped.

When using [Akka Cluster](cluster-usage.html) the `CoordinatedShutdown` will automatically run when the cluster node sees itself as `Exiting`, i.e. leaving from another node will trigger the shutdown process on the leaving node. Tasks for graceful leaving of cluster including graceful shutdown of Cluster Singletons and Cluster Sharding are added automatically when Akka Cluster is used, i.e. running the shutdown process will also trigger the graceful leaving if it’s not already in progress.

By default, the `CoordinatedShutdown` will be run when the JVM process exits, e.g. via `kill SIGTERM` signal (`SIGINT` ctrl\-c doesn’t work). This behavior can be disabled with:

```
akka.coordinated-shutdown.run-by-jvm-shutdown-hook=off

```

If you have application specific JVM shutdown hooks it’s recommended that you register them via the `CoordinatedShutdown` so that they are running before Akka internal shutdown hooks, e.g. those shutting down Akka Remoting (Artery).

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/actor/typed/CoordinatedActorShutdownSpec.scala#L73-L75 "Go to snippet source")CoordinatedShutdown(system).addJvmShutdownHook {
  println("custom JVM shutdown hook...")
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/actor/typed/CoordinatedActorShutdownTest.java#L110-L111 "Go to snippet source")CoordinatedShutdown.get(system)
    .addJvmShutdownHook(() -> System.out.println("custom JVM shutdown hook..."));
```

For some tests it might be undesired to terminate the `ActorSystem` via `CoordinatedShutdown`. You can disable that by adding the following to the configuration of the `ActorSystem` that is used in the test:

```
# Don't terminate ActorSystem via CoordinatedShutdown in tests
akka.coordinated-shutdown.terminate-actor-system = off
akka.coordinated-shutdown.run-by-actor-system-terminate = off
akka.coordinated-shutdown.run-by-jvm-shutdown-hook = off
akka.cluster.run-coordinated-shutdown-when-down = off

```

## Code Examples

### Example 1: Coordinated Shutdown

```conf
# CoordinatedShutdown is enabled by default and will run the tasks that
# are added to these phases by individual Akka modules and user logic.
#
# The phases are ordered as a DAG by defining the dependencies between the phases
# to make sure shutdown tasks are run in the right order.
#
# In general user tasks belong in the first few phases, but there may be use
# cases where you would want to hook in new phases or register tasks later in
# the DAG.
#
# Each phase is defined as a named config section with the
# following optional properties:
# - timeout=15s: Override the default-phase-timeout for this phase.
# - recover=off: If the phase fails the shutdown is aborted
#                and depending phases will not be executed.
# - enabled=off: Skip all tasks registered in this phase. DO NOT use
#                this to disable phases unless you are absolutely sure what the
#                consequences are. Many of the built in tasks depend on other tasks
#                having been executed in earlier phases and may break if those are disabled.
# depends-on=[]: Run the phase after the given phases
phases {

  # The first pre-defined phase that applications can add tasks to.
  # Note that more phases can be added in the application's
  # configuration by overriding this phase with an additional
  # depends-on.
  before-service-unbind {
  }

  # Stop accepting new incoming connections.
  # This is where you can register tasks that makes a server stop accepting new connections. Already
  # established connections should be allowed to continue and complete if possible.
  service-unbind {
    depends-on = [before-service-unbind]
  }

  # Wait for requests that are in progress to be completed.
  # This is where you register tasks that will wait for already established connections to complete, potentially
  # also first telling them that it is time to close down.
  service-requests-done {
    depends-on = [service-unbind]
  }

  # Final shutdown of service endpoints.
  # This is where you would add tasks that forcefully kill connections that are still around.
  service-stop {
    depends-on = [service-requests-done]
  }

  # Phase for custom application tasks that are to be run
  # after service shutdown and before cluster shutdown.
  before-cluster-shutdown {
    depends-on = [service-stop]
  }

  # Graceful shutdown of the Cluster Sharding regions.
  # This phase is not meant for users to add tasks to.
  cluster-sharding-shutdown-region {
    timeout = 10 s
    depends-on = [before-cluster-shutdown]
  }

  # Emit the leave command for the node that is shutting down.
  # This phase is not meant for users to add tasks to.
  cluster-leave {
    depends-on = [cluster-sharding-shutdown-region]
  }

  # Shutdown cluster singletons
  # This is done as late as possible to allow the shard region shutdown triggered in
  # the "cluster-sharding-shutdown-region" phase to complete before the shard coordinator is shut down.
  # This phase is not meant for users to add tasks to.
  cluster-exiting {
    timeout = 10 s
    depends-on = [cluster-leave]
  }

  # Wait until exiting has been completed
  # This phase is not meant for users to add tasks to.
  cluster-exiting-done {
    depends-on = [cluster-exiting]
  }

  # Shutdown the cluster extension
  # This phase is not meant for users to add tasks to.
  cluster-shutdown {
    depends-on = [cluster-exiting-done]
  }

  # Phase for custom application tasks that are to be run
  # after cluster shutdown and before ActorSystem termination.
  before-actor-system-terminate {
    depends-on = [cluster-shutdown]
  }

  # Last phase. See terminate-actor-system and exit-jvm above.
  # Don't add phases that depends on this phase because the
  # dispatcher and scheduler of the ActorSystem have been shutdown.
  # This phase is not meant for users to add tasks to.
  actor-system-terminate {
    timeout = 10 s
    depends-on = [before-actor-system-terminate]
  }
}
```

### Example 2: Coordinated Shutdown

```scala
object MyActor {

  trait Messages
  case class Stop(replyTo: ActorRef[Done]) extends Messages

  def behavior: Behavior[Messages] =
    Behaviors.receiveMessage {
      // ...
      case Stop(replyTo) =>
        // shut down the actor internals
        // ..
        replyTo.tell(Done)
        Behaviors.stopped
    }
}

  CoordinatedShutdown(context.system).addTask(CoordinatedShutdown.PhaseBeforeServiceUnbind, "someTaskName") { () =>
    implicit val timeout: Timeout = 5.seconds
    myActor.ask(MyActor.Stop(_))
  }
```

### Example 3: Coordinated Shutdown

```java
import static akka.actor.typed.javadsl.AskPattern.ask;

public static class MyActor extends AbstractBehavior<MyActor.Messages> {
  interface Messages {}

  // ...

  static final class Stop implements Messages {
    final ActorRef<Done> replyTo;

    Stop(ActorRef<Done> replyTo) {
      this.replyTo = replyTo;
    }
  }
  @Override
  public Receive<Messages> createReceive() {
    return newReceiveBuilder().onMessage(Stop.class, this::stop).build();
  }

  private Behavior<Messages> stop(Stop stop) {
    // shut down the actor internal
    // ...
    stop.replyTo.tell(Done.done());
    return Behaviors.stopped();
  }
}

          CoordinatedShutdown.get(system)
              .addTask(
                  CoordinatedShutdown.PhaseBeforeServiceUnbind(),
                  "someTaskName",
                  () ->
                      ask(myActor, MyActor.Stop::new, Duration.ofSeconds(5), system.scheduler()));
```

### Example 4: Coordinated Shutdown

```scala
val c: Cancellable =
  CoordinatedShutdown(system).addCancellableTask(CoordinatedShutdown.PhaseBeforeServiceUnbind, "cleanup") { () =>
    Future {
      cleanup()
      Done
    }
  }

// much later...
c.cancel()
```

### Example 5: Coordinated Shutdown

```java
Cancellable cancellable =
    CoordinatedShutdown.get(system)
        .addCancellableTask(
            CoordinatedShutdown.PhaseBeforeServiceUnbind(), "someTaskCleanup", () -> cleanup());
// much later...
cancellable.cancel();
```

### Example 6: Coordinated Shutdown

```scala
CoordinatedShutdown(system).addActorTerminationTask(
  CoordinatedShutdown.PhaseBeforeServiceUnbind,
  "someTaskName",
  someActor,
  Some("stop"))
```

### Example 7: Coordinated Shutdown

```java
CoordinatedShutdown.get(system)
    .addActorTerminationTask(
        CoordinatedShutdown.PhaseBeforeServiceUnbind(),
        "someTaskName",
        someActor,
        Optional.of("stop"));
```

### Example 8: Coordinated Shutdown

```scala
// shut down with `ActorSystemTerminateReason`
system.terminate()

// or define a specific reason
case object UserInitiatedShutdown extends CoordinatedShutdown.Reason

val done: Future[Done] = CoordinatedShutdown(system).run(UserInitiatedShutdown)
```

### Example 9: Coordinated Shutdown

```java
// shut down with `ActorSystemTerminateReason`
system.terminate();

// or define a specific reason
class UserInitiatedShutdown implements CoordinatedShutdown.Reason {
  @Override
  public String toString() {
    return "UserInitiatedShutdown";
  }
}

CompletionStage<Done> done =
    CoordinatedShutdown.get(system).runAll(new UserInitiatedShutdown());
```

### Example 10: Coordinated Shutdown

```text
akka.coordinated-shutdown.exit-jvm = on
```

### Example 11: Coordinated Shutdown

```text
akka.coordinated-shutdown.run-by-jvm-shutdown-hook=off
```

### Example 12: Coordinated Shutdown

```scala
CoordinatedShutdown(system).addJvmShutdownHook {
  println("custom JVM shutdown hook...")
}
```

### Example 13: Coordinated Shutdown

```java
CoordinatedShutdown.get(system)
    .addJvmShutdownHook(() -> System.out.println("custom JVM shutdown hook..."));
```

### Example 14: Coordinated Shutdown

```text
# Don't terminate ActorSystem via CoordinatedShutdown in tests
akka.coordinated-shutdown.terminate-actor-system = off
akka.coordinated-shutdown.run-by-actor-system-terminate = off
akka.coordinated-shutdown.run-by-jvm-shutdown-hook = off
akka.cluster.run-coordinated-shutdown-when-down = off
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/CoordinatedShutdown$$Reason.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/CoordinatedShutdown$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/CoordinatedShutdown.Reason.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/libraries/akka-core/2.6/cluster-usage.html
- https://doc.akka.io/libraries/akka-core/2.6/general/configuration-reference.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/dispatchers.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/fsm.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/coordinated-shutdown.html](https://doc.akka.io/libraries/akka-core/2.6/coordinated-shutdown.html)*