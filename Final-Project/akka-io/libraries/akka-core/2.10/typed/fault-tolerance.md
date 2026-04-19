---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:27Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/fault-tolerance.html
title: Fault Tolerance • Akka core
---

# Fault Tolerance • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Fault Tolerance

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Fault Tolerance](../fault-tolerance.html).

When an actor throws an unexpected exception, a failure, while processing a message or during initialization, the actor will by default be stopped.

Note
An important difference between [Typed actors](actors.html) and [Classic actors](../actors.html) is that by default: the former are stopped if an exception is thrown and no supervision strategy is defined while in Classic they are restarted.

Note that there is an important distinction between failures and validation errors:

A **validation error** means that the data of a command sent to an actor is not valid, this should rather be modelled as a part of the actor protocol than make the actor throw exceptions.

A **failure** is instead something unexpected or outside the control of the actor itself, for example a database connection that broke. Opposite to validation errors, it is seldom useful to model failures as part of the protocol as a sending actor can very seldomly do anything useful about it.

For failures it is useful to apply the “let it crash” philosophy: instead of mixing fine grained recovery and correction of internal state that may have become partially invalid because of the failure with the business logic we move that responsibility somewhere else. For many cases the resolution can then be to “crash” the actor, and start a new one, with a fresh state that we know is valid.

## Supervision

In Akka this “somewhere else” is called supervision. Supervision allows you to declaratively describe what should happen when certain types of exceptions are thrown inside an actor. 

The default [supervision](../general/supervision.html) strategy is to stop the actor if an exception is thrown. In many cases you will want to further customize this behavior. To use supervision the actual Actor behavior is wrapped using [`Behaviors.supervise`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#supervise(akka.actor.typed.Behavior) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.supervise`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#supervise[T](wrapped:akka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Supervise[T] "akka.actor.typed.scaladsl.Behaviors"). Typically you would wrap the actor with supervision in the parent when spawning it as a child.

This example restarts the actor when it fails with an [`IllegalStateException`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IllegalStateException.html "java.lang.IllegalStateException"): 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/supervision/SupervisionCompileOnly.scala#L21 "Go to snippet source")Behaviors.supervise(behavior).onFailure[IllegalStateException](SupervisorStrategy.restart)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/supervision/SupervisionCompileOnlyTest.java#L62-L63 "Go to snippet source")Behaviors.supervise(behavior)
    .onFailure(IllegalStateException.class, SupervisorStrategy.restart());
```

Or to resume, ignore the failure and process the next message, instead:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/supervision/SupervisionCompileOnly.scala#L25 "Go to snippet source")Behaviors.supervise(behavior).onFailure[IllegalStateException](SupervisorStrategy.resume)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/supervision/SupervisionCompileOnlyTest.java#L67-L68 "Go to snippet source")Behaviors.supervise(behavior)
    .onFailure(IllegalStateException.class, SupervisorStrategy.resume());
```

More complicated restart strategies can be used e.g. to restart no more than 10 times in a 10 second period:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/supervision/SupervisionCompileOnly.scala#L29-L32 "Go to snippet source")Behaviors
  .supervise(behavior)
  .onFailure[IllegalStateException](
    SupervisorStrategy.restart.withLimit(maxNrOfRetries = 10, withinTimeRange = 10.seconds))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/supervision/SupervisionCompileOnlyTest.java#L72-L75 "Go to snippet source")Behaviors.supervise(behavior)
    .onFailure(
        IllegalStateException.class,
        SupervisorStrategy.restart().withLimit(10, Duration.ofSeconds(10)));
```

To handle different exceptions with different strategies calls to [`supervise`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#supervise(akka.actor.typed.Behavior) "akka.actor.typed.javadsl.Behaviors")[`supervise`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#supervise[T](wrapped:akka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Supervise[T] "akka.actor.typed.scaladsl.Behaviors") can be nested:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/supervision/SupervisionCompileOnly.scala#L36-L38 "Go to snippet source")Behaviors
  .supervise(Behaviors.supervise(behavior).onFailure[IllegalStateException](SupervisorStrategy.restart))
  .onFailure[IllegalArgumentException](SupervisorStrategy.stop)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/supervision/SupervisionCompileOnlyTest.java#L79-L82 "Go to snippet source")Behaviors.supervise(
        Behaviors.supervise(behavior)
            .onFailure(IllegalStateException.class, SupervisorStrategy.restart()))
    .onFailure(IllegalArgumentException.class, SupervisorStrategy.stop());
```

For a full list of strategies see the public methods on [`SupervisorStrategy`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SupervisorStrategy.html "akka.actor.typed.SupervisorStrategy")[`SupervisorStrategy`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SupervisorStrategy.html "akka.actor.typed.SupervisorStrategy").

Note
When the behavior is restarted the original [`Behavior`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") that was given to [`Behaviors.supervise`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#supervise(akka.actor.typed.Behavior) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.supervise`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#supervise[T](wrapped:akka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Supervise[T] "akka.actor.typed.scaladsl.Behaviors") is re\-installed, which means that if it contains mutable state it must be a factory via [`Behaviors.setup`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.setup`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors"). When using the object\-oriented style with a class extending [`AbstractBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AbstractBehavior.html "akka.actor.typed.javadsl.AbstractBehavior")[`AbstractBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AbstractBehavior.html "akka.actor.typed.scaladsl.AbstractBehavior") it’s always recommended to create it via [`Behaviors.setup`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.setup`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") as described in [Behavior factory method](style-guide.html#behavior-factory-method). For the function style there is typically no need for the factory if the state is captured in immutable parameters.

### Wrapping behaviors

With the [functional style](style-guide.html#functional-versus-object-oriented-style) it is very common to store state by changing behavior e.g.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/supervision/SupervisionCompileOnly.scala#L42-L60 "Go to snippet source")object Counter {
  sealed trait Command
  case class Increment(nr: Int) extends Command
  case class GetCount(replyTo: ActorRef[Int]) extends Command

  def apply(): Behavior[Command] =
    Behaviors.supervise(counter(1)).onFailure(SupervisorStrategy.restart)

  private def counter(count: Int): Behavior[Command] =
    Behaviors.receiveMessage[Command] {
      case Increment(nr: Int) =>
        counter(count + nr)
      case GetCount(replyTo) =>
        replyTo ! count
        Behaviors.same
    }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/supervision/SupervisionCompileOnlyTest.java#L13-L55 "Go to snippet source")public static class Counter {
  public interface Command {}

  public static final class Increase implements Command {}

  public static final class Get implements Command {
    public final ActorRef<Got> replyTo;

    public Get(ActorRef<Got> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static final class Got {
    public final int n;

    public Got(int n) {
      this.n = n;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.supervise(counter(1)).onFailure(SupervisorStrategy.restart());
  }

  private static Behavior<Command> counter(int currentValue) {
    return Behaviors.receive(Command.class)
        .onMessage(Increase.class, o -> onIncrease(currentValue))
        .onMessage(Get.class, command -> onGet(currentValue, command))
        .build();
  }

  private static Behavior<Command> onIncrease(int currentValue) {
    return counter(currentValue + 1);
  }

  private static Behavior<Command> onGet(int currentValue, Get command) {
    command.replyTo.tell(new Got(currentValue));
    return Behaviors.same();
  }
}
```

When doing this supervision only needs to be added to the top level:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/supervision/SupervisionCompileOnly.scala#L48-L49 "Go to snippet source")def apply(): Behavior[Command] =
  Behaviors.supervise(counter(1)).onFailure(SupervisorStrategy.restart)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/supervision/SupervisionCompileOnlyTest.java#L35-L37 "Go to snippet source")public static Behavior<Command> create() {
  return Behaviors.supervise(counter(1)).onFailure(SupervisorStrategy.restart());
}
```

Each returned behavior will be re\-wrapped automatically with the supervisor.

## Child actors are stopped when parent is restarting

Child actors are often started in a [`setup`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`setup`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") block that is run again when the parent actor is restarted. The child actors are stopped to avoid resource leaks of creating new child actors each time the parent is restarted.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/supervision/SupervisionCompileOnly.scala#L64-L84 "Go to snippet source")def child(size: Long): Behavior[String] =
  Behaviors.receiveMessage(msg => child(size + msg.length))

def parent: Behavior[String] = {
  Behaviors
    .supervise[String] {
      Behaviors.setup { ctx =>
        val child1 = ctx.spawn(child(0), "child1")
        val child2 = ctx.spawn(child(0), "child2")

        Behaviors.receiveMessage[String] { msg =>
          // message handling that might throw an exception
          val parts = msg.split(" ")
          child1 ! parts(0)
          child2 ! parts(1)
          Behaviors.same
        }
      }
    }
    .onFailure(SupervisorStrategy.restart)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/supervision/SupervisionCompileOnlyTest.java#L88-L109 "Go to snippet source")static Behavior<String> child(long size) {
  return Behaviors.receiveMessage(msg -> child(size + msg.length()));
}

static Behavior<String> parent() {
  return Behaviors.<String>supervise(
          Behaviors.setup(
              ctx -> {
                final ActorRef<String> child1 = ctx.spawn(child(0), "child1");
                final ActorRef<String> child2 = ctx.spawn(child(0), "child2");

                return Behaviors.receiveMessage(
                    msg -> {
                      // message handling that might throw an exception
                      String[] parts = msg.split(" ");
                      child1.tell(parts[0]);
                      child2.tell(parts[1]);
                      return Behaviors.same();
                    });
              }))
      .onFailure(SupervisorStrategy.restart());
}
```

It is possible to override this so that child actors are not influenced when the parent actor is restarted. The restarted parent instance will then have the same children as before the failure.

If child actors are created from [`setup`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`setup`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") like in the previous example and they should remain intact (not stopped) when parent is restarted the [`supervise`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#supervise(akka.actor.typed.Behavior) "akka.actor.typed.javadsl.Behaviors")[`supervise`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#supervise[T](wrapped:akka.actor.typed.Behavior[T]):akka.actor.typed.scaladsl.Behaviors.Supervise[T] "akka.actor.typed.scaladsl.Behaviors") should be placed inside the [`setup`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`setup`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") and using [`SupervisorStrategy.restart.withStopChildren(false)`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RestartSupervisorStrategy.html#withStopChildren(enabled:Boolean):akka.actor.typed.RestartSupervisorStrategy "akka.actor.typed.RestartSupervisorStrategy")[`SupervisorStrategy.restart().withStopChildren(false)`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RestartSupervisorStrategy.html#withStopChildren(boolean) "akka.actor.typed.RestartSupervisorStrategy") like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/supervision/SupervisionCompileOnly.scala#L88-L106 "Go to snippet source")def parent2: Behavior[String] = {
  Behaviors.setup { ctx =>
    val child1 = ctx.spawn(child(0), "child1")
    val child2 = ctx.spawn(child(0), "child2")

    // supervision strategy inside the setup to not recreate children on restart
    Behaviors
      .supervise {
        Behaviors.receiveMessage[String] { msg =>
          // message handling that might throw an exception
          val parts = msg.split(" ")
          child1 ! parts(0)
          child2 ! parts(1)
          Behaviors.same
        }
      }
      .onFailure(SupervisorStrategy.restart.withStopChildren(false))
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/supervision/SupervisionCompileOnlyTest.java#L113-L131 "Go to snippet source")static Behavior<String> parent2() {
  return Behaviors.setup(
      ctx -> {
        final ActorRef<String> child1 = ctx.spawn(child(0), "child1");
        final ActorRef<String> child2 = ctx.spawn(child(0), "child2");

        // supervision strategy inside the setup to not recreate children on restart
        return Behaviors.<String>supervise(
                Behaviors.receiveMessage(
                    msg -> {
                      // message handling that might throw an exception
                      String[] parts = msg.split(" ");
                      child1.tell(parts[0]);
                      child2.tell(parts[1]);
                      return Behaviors.same();
                    }))
            .onFailure(SupervisorStrategy.restart().withStopChildren(false));
      });
}
```

That means that the [`setup`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`setup`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") block will only be run when the parent actor is first started, and not when it is restarted.

## The PreRestart signal

Before a supervised actor is restarted it is sent the [`PreRestart`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart.html "akka.actor.typed.PreRestart")[`PreRestart`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart.html "akka.actor.typed.PreRestart") signal giving it a chance to clean up resources it has created, much like the [`PostStop`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop")[`PostStop`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop") signal when the [actor stops](actor-lifecycle.html#stopping-actors). The returned behavior from the [`PreRestart`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart.html "akka.actor.typed.PreRestart")[`PreRestart`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart.html "akka.actor.typed.PreRestart") signal is ignored.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/supervision/SupervisionCompileOnly.scala#L117-L140 "Go to snippet source")def withPreRestart: Behavior[String] = {
  Behaviors
    .supervise[String] {
      Behaviors.setup { ctx =>
        val resource = claimResource()

        Behaviors
          .receiveMessage[String] { msg =>
            // message handling that might throw an exception

            val parts = msg.split(" ")
            resource.process(parts)
            Behaviors.same
          }
          .receiveSignal {
            case (_, signal) if signal == PreRestart || signal == PostStop =>
              resource.close()
              Behaviors.same
          }
      }
    }
    .onFailure[Exception](SupervisorStrategy.restart)
}

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/supervision/SupervisionCompileOnlyTest.java#L146-L174 "Go to snippet source")Behaviors.supervise(
        Behaviors.<String>setup(
            ctx -> {
              final Resource resource = claimResource();

              return Behaviors.receive(String.class)
                  .onMessage(
                      String.class,
                      msg -> {
                        // message handling that might throw an exception
                        String[] parts = msg.split(" ");
                        resource.process(parts);
                        return Behaviors.same();
                      })
                  .onSignal(
                      PreRestart.class,
                      signal -> {
                        resource.close();
                        return Behaviors.same();
                      })
                  .onSignal(
                      PostStop.class,
                      signal -> {
                        resource.close();
                        return Behaviors.same();
                      })
                  .build();
            }))
    .onFailure(Exception.class, SupervisorStrategy.restart());
```

Note that [`PostStop`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop")[`PostStop`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop") is not emitted for a restart, so typically you need to handle both [`PreRestart`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart.html "akka.actor.typed.PreRestart")[`PreRestart`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart.html "akka.actor.typed.PreRestart") and [`PostStop`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop")[`PostStop`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop") to cleanup resources.

## Bubble failures up through the hierarchy

In some scenarios it may be useful to push the decision about what to do on a failure upwards in the Actor hierarchy and let the parent actor handle what should happen on failures (in classic Akka Actors this is how it works by default).

For a parent to be notified when a child is terminated it has to [watch](actor-lifecycle.html#watching-actors) the child. If the child was stopped because of a failure the [`ChildFailed`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ChildFailed.html "akka.actor.typed.ChildFailed")[`ChildFailed`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ChildFailed.html "akka.actor.typed.ChildFailed") signal will be received which will contain the cause. [`ChildFailed`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ChildFailed.html "akka.actor.typed.ChildFailed")[`ChildFailed`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ChildFailed.html "akka.actor.typed.ChildFailed") extends [`Terminated`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated")[`Terminated`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated") so if your use case does not need to distinguish between stopping and failing you can handle both cases with the [`Terminated`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated")[`Terminated`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated") signal.

If the parent in turn does not handle the [`Terminated`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated")[`Terminated`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated") message it will itself fail with an [`DeathPactException`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DeathPactException.html "akka.actor.typed.DeathPactException")[`DeathPactException`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/DeathPactException.html "akka.actor.typed.DeathPactException").

This means that a hierarchy of actors can have a child failure bubble up making each actor on the way stop but informing the top\-most parent that there was a failure and how to deal with it, however, the original exception that caused the failure will only be available to the immediate parent out of the box (this is most often a good thing, not leaking implementation details). 

There might be cases when you want the original exception to bubble up the hierarchy, this can be done by handling the [`Terminated`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated")[`Terminated`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated") signal, and rethrowing the exception in each actor.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/FaultToleranceDocSpec.scala#L13-L75 "Go to snippet source")import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.DeathPactException
import akka.actor.typed.SupervisorStrategy
import akka.actor.typed.scaladsl.Behaviors

object Protocol {
  sealed trait Command
  case class Fail(text: String) extends Command
  case class Hello(text: String, replyTo: ActorRef[String]) extends Command
}
import Protocol._

object Worker {
  def apply(): Behavior[Command] =
    Behaviors.receiveMessage {
      case Fail(text) =>
        throw new RuntimeException(text)
      case Hello(text, replyTo) =>
        replyTo ! text
        Behaviors.same
    }
}

object MiddleManagement {
  def apply(): Behavior[Command] =
    Behaviors.setup[Command] { context =>
      context.log.info("Middle management starting up")
      // default supervision of child, meaning that it will stop on failure
      val child = context.spawn(Worker(), "child")
      // we want to know when the child terminates, but since we do not handle
      // the Terminated signal, we will in turn fail on child termination
      context.watch(child)

      // here we don't handle Terminated at all which means that
      // when the child fails or stops gracefully this actor will
      // fail with a DeathPactException
      Behaviors.receiveMessage { message =>
        child ! message
        Behaviors.same
      }
    }
}

object Boss {
  def apply(): Behavior[Command] =
    Behaviors
      .supervise(Behaviors.setup[Command] { context =>
        context.log.info("Boss starting up")
        // default supervision of child, meaning that it will stop on failure
        val middleManagement = context.spawn(MiddleManagement(), "middle-management")
        context.watch(middleManagement)

        // here we don't handle Terminated at all which means that
        // when middle management fails with a DeathPactException
        // this actor will also fail
        Behaviors.receiveMessage[Command] { message =>
          middleManagement ! message
          Behaviors.same
        }
      })
      .onFailure[DeathPactException](SupervisorStrategy.restart)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/BubblingSample.java#L10-L139 "Go to snippet source")import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.DeathPactException;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public interface Protocol {
  public interface Command {}

  public static class Fail implements Command {
    public final String text;

    public Fail(String text) {
      this.text = text;
    }
  }

  public static class Hello implements Command {
    public final String text;
    public final ActorRef<String> replyTo;

    public Hello(String text, ActorRef<String> replyTo) {
      this.text = text;
      this.replyTo = replyTo;
    }
  }
}

public static class Worker extends AbstractBehavior<Protocol.Command> {

  public static Behavior<Protocol.Command> create() {
    return Behaviors.setup(Worker::new);
  }

  private Worker(ActorContext<Protocol.Command> context) {
    super(context);
  }

  @Override
  public Receive<Protocol.Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Protocol.Fail.class, this::onFail)
        .onMessage(Protocol.Hello.class, this::onHello)
        .build();
  }

  private Behavior<Protocol.Command> onFail(Protocol.Fail message) {
    throw new RuntimeException(message.text);
  }

  private Behavior<Protocol.Command> onHello(Protocol.Hello message) {
    message.replyTo.tell(message.text);
    return this;
  }
}

public static class MiddleManagement extends AbstractBehavior<Protocol.Command> {

  public static Behavior<Protocol.Command> create() {
    return Behaviors.setup(MiddleManagement::new);
  }

  private final ActorRef<Protocol.Command> child;

  private MiddleManagement(ActorContext<Protocol.Command> context) {
    super(context);

    context.getLog().info("Middle management starting up");
    // default supervision of child, meaning that it will stop on failure
    child = context.spawn(Worker.create(), "child");

    // we want to know when the child terminates, but since we do not handle
    // the Terminated signal, we will in turn fail on child termination
    context.watch(child);
  }

  @Override
  public Receive<Protocol.Command> createReceive() {
    // here we don't handle Terminated at all which means that
    // when the child fails or stops gracefully this actor will
    // fail with a DeathPactException
    return newReceiveBuilder().onMessage(Protocol.Command.class, this::onCommand).build();
  }

  private Behavior<Protocol.Command> onCommand(Protocol.Command message) {
    // just pass messages on to the child
    child.tell(message);
    return this;
  }
}

public static class Boss extends AbstractBehavior<Protocol.Command> {

  public static Behavior<Protocol.Command> create() {
    return Behaviors.supervise(Behaviors.setup(Boss::new))
        .onFailure(DeathPactException.class, SupervisorStrategy.restart());
  }

  private final ActorRef<Protocol.Command> middleManagement;

  private Boss(ActorContext<Protocol.Command> context) {
    super(context);
    context.getLog().info("Boss starting up");
    // default supervision of child, meaning that it will stop on failure
    middleManagement = context.spawn(MiddleManagement.create(), "middle-management");
    context.watch(middleManagement);
  }

  @Override
  public Receive<Protocol.Command> createReceive() {
    // here we don't handle Terminated at all which means that
    // when middle management fails with a DeathPactException
    // this actor will also fail
    return newReceiveBuilder().onMessage(Protocol.Command.class, this::onCommand).build();
  }

  private Behavior<Protocol.Command> onCommand(Protocol.Command message) {
    // just pass messages on to the child
    middleManagement.tell(message);
    return this;
  }
}

```

## Code Examples

### Example 1: Supervision

```scala
Behaviors.supervise(behavior).onFailure[IllegalStateException](SupervisorStrategy.restart)
```

### Example 2: Supervision

```java
Behaviors.supervise(behavior)
    .onFailure(IllegalStateException.class, SupervisorStrategy.restart());
```

### Example 3: Supervision

```scala
Behaviors.supervise(behavior).onFailure[IllegalStateException](SupervisorStrategy.resume)
```

### Example 4: Supervision

```java
Behaviors.supervise(behavior)
    .onFailure(IllegalStateException.class, SupervisorStrategy.resume());
```

### Example 5: Supervision

```scala
Behaviors
  .supervise(behavior)
  .onFailure[IllegalStateException](
    SupervisorStrategy.restart.withLimit(maxNrOfRetries = 10, withinTimeRange = 10.seconds))
```

### Example 6: Supervision

```java
Behaviors.supervise(behavior)
    .onFailure(
        IllegalStateException.class,
        SupervisorStrategy.restart().withLimit(10, Duration.ofSeconds(10)));
```

### Example 7: Supervision

```scala
Behaviors
  .supervise(Behaviors.supervise(behavior).onFailure[IllegalStateException](SupervisorStrategy.restart))
  .onFailure[IllegalArgumentException](SupervisorStrategy.stop)
```

### Example 8: Supervision

```java
Behaviors.supervise(
        Behaviors.supervise(behavior)
            .onFailure(IllegalStateException.class, SupervisorStrategy.restart()))
    .onFailure(IllegalArgumentException.class, SupervisorStrategy.stop());
```

### Example 9: Wrapping behaviors

```scala
object Counter {
  sealed trait Command
  case class Increment(nr: Int) extends Command
  case class GetCount(replyTo: ActorRef[Int]) extends Command

  def apply(): Behavior[Command] =
    Behaviors.supervise(counter(1)).onFailure(SupervisorStrategy.restart)

  private def counter(count: Int): Behavior[Command] =
    Behaviors.receiveMessage[Command] {
      case Increment(nr: Int) =>
        counter(count + nr)
      case GetCount(replyTo) =>
        replyTo ! count
        Behaviors.same
    }
}
```

### Example 10: Wrapping behaviors

```java
public static class Counter {
  public interface Command {}

  public static final class Increase implements Command {}

  public static final class Get implements Command {
    public final ActorRef<Got> replyTo;

    public Get(ActorRef<Got> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static final class Got {
    public final int n;

    public Got(int n) {
      this.n = n;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.supervise(counter(1)).onFailure(SupervisorStrategy.restart());
  }

  private static Behavior<Command> counter(int currentValue) {
    return Behaviors.receive(Command.class)
        .onMessage(Increase.class, o -> onIncrease(currentValue))
        .onMessage(Get.class, command -> onGet(currentValue, command))
        .build();
  }

  private static Behavior<Command> onIncrease(int currentValue) {
    return counter(currentValue + 1);
  }

  private static Behavior<Command> onGet(int currentValue, Get command) {
    command.replyTo.tell(new Got(currentValue));
    return Behaviors.same();
  }
}
```

### Example 11: Wrapping behaviors

```scala
def apply(): Behavior[Command] =
  Behaviors.supervise(counter(1)).onFailure(SupervisorStrategy.restart)
```

### Example 12: Wrapping behaviors

```java
public static Behavior<Command> create() {
  return Behaviors.supervise(counter(1)).onFailure(SupervisorStrategy.restart());
}
```

### Example 13: Child actors are stopped when parent is restarting

```scala
def child(size: Long): Behavior[String] =
  Behaviors.receiveMessage(msg => child(size + msg.length))

def parent: Behavior[String] = {
  Behaviors
    .supervise[String] {
      Behaviors.setup { ctx =>
        val child1 = ctx.spawn(child(0), "child1")
        val child2 = ctx.spawn(child(0), "child2")

        Behaviors.receiveMessage[String] { msg =>
          // message handling that might throw an exception
          val parts = msg.split(" ")
          child1 ! parts(0)
          child2 ! parts(1)
          Behaviors.same
        }
      }
    }
    .onFailure(SupervisorStrategy.restart)
}
```

### Example 14: Child actors are stopped when parent is restarting

```java
static Behavior<String> child(long size) {
  return Behaviors.receiveMessage(msg -> child(size + msg.length()));
}

static Behavior<String> parent() {
  return Behaviors.<String>supervise(
          Behaviors.setup(
              ctx -> {
                final ActorRef<String> child1 = ctx.spawn(child(0), "child1");
                final ActorRef<String> child2 = ctx.spawn(child(0), "child2");

                return Behaviors.receiveMessage(
                    msg -> {
                      // message handling that might throw an exception
                      String[] parts = msg.split(" ");
                      child1.tell(parts[0]);
                      child2.tell(parts[1]);
                      return Behaviors.same();
                    });
              }))
      .onFailure(SupervisorStrategy.restart());
}
```

### Example 15: Child actors are stopped when parent is restarting

```scala
def parent2: Behavior[String] = {
  Behaviors.setup { ctx =>
    val child1 = ctx.spawn(child(0), "child1")
    val child2 = ctx.spawn(child(0), "child2")

    // supervision strategy inside the setup to not recreate children on restart
    Behaviors
      .supervise {
        Behaviors.receiveMessage[String] { msg =>
          // message handling that might throw an exception
          val parts = msg.split(" ")
          child1 ! parts(0)
          child2 ! parts(1)
          Behaviors.same
        }
      }
      .onFailure(SupervisorStrategy.restart.withStopChildren(false))
  }
}
```

### Example 16: Child actors are stopped when parent is restarting

```java
static Behavior<String> parent2() {
  return Behaviors.setup(
      ctx -> {
        final ActorRef<String> child1 = ctx.spawn(child(0), "child1");
        final ActorRef<String> child2 = ctx.spawn(child(0), "child2");

        // supervision strategy inside the setup to not recreate children on restart
        return Behaviors.<String>supervise(
                Behaviors.receiveMessage(
                    msg -> {
                      // message handling that might throw an exception
                      String[] parts = msg.split(" ");
                      child1.tell(parts[0]);
                      child2.tell(parts[1]);
                      return Behaviors.same();
                    }))
            .onFailure(SupervisorStrategy.restart().withStopChildren(false));
      });
}
```

### Example 17: The PreRestart signal

```scala
def withPreRestart: Behavior[String] = {
  Behaviors
    .supervise[String] {
      Behaviors.setup { ctx =>
        val resource = claimResource()

        Behaviors
          .receiveMessage[String] { msg =>
            // message handling that might throw an exception

            val parts = msg.split(" ")
            resource.process(parts)
            Behaviors.same
          }
          .receiveSignal {
            case (_, signal) if signal == PreRestart || signal == PostStop =>
              resource.close()
              Behaviors.same
          }
      }
    }
    .onFailure[Exception](SupervisorStrategy.restart)
}
```

### Example 18: The PreRestart signal

```java
Behaviors.supervise(
        Behaviors.<String>setup(
            ctx -> {
              final Resource resource = claimResource();

              return Behaviors.receive(String.class)
                  .onMessage(
                      String.class,
                      msg -> {
                        // message handling that might throw an exception
                        String[] parts = msg.split(" ");
                        resource.process(parts);
                        return Behaviors.same();
                      })
                  .onSignal(
                      PreRestart.class,
                      signal -> {
                        resource.close();
                        return Behaviors.same();
                      })
                  .onSignal(
                      PostStop.class,
                      signal -> {
                        resource.close();
                        return Behaviors.same();
                      })
                  .build();
            }))
    .onFailure(Exception.class, SupervisorStrategy.restart());
```

### Example 19: Bubble failures up through the hierarchy

```scala
import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.DeathPactException
import akka.actor.typed.SupervisorStrategy
import akka.actor.typed.scaladsl.Behaviors

object Protocol {
  sealed trait Command
  case class Fail(text: String) extends Command
  case class Hello(text: String, replyTo: ActorRef[String]) extends Command
}
import Protocol._

object Worker {
  def apply(): Behavior[Command] =
    Behaviors.receiveMessage {
      case Fail(text) =>
        throw new RuntimeException(text)
      case Hello(text, replyTo) =>
        replyTo ! text
        Behaviors.same
    }
}

object MiddleManagement {
  def apply(): Behavior[Command] =
    Behaviors.setup[Command] { context =>
      context.log.info("Middle management starting up")
      // default supervision of child, meaning that it will stop on failure
      val child = context.spawn(Worker(), "child")
      // we want to know when the child terminates, but since we do not handle
      // the Terminated signal, we will in turn fail on child termination
      context.watch(child)

      // here we don't handle Terminated at all which means that
      // when the child fails or stops gracefully this actor will
      // fail with a DeathPactException
      Behaviors.receiveMessage { message =>
        child ! message
        Behaviors.same
      }
    }
}

object Boss {
  def apply(): Behavior[Command] =
    Behaviors
      .supervise(Behaviors.setup[Command] { context =>
        context.log.info("Boss starting up")
        // default supervision of child, meaning that it will stop on failure
        val middleManagement = context.spawn(MiddleManagement(), "middle-management")
        context.watch(middleManagement)

        // here we don't handle Terminated at all which means that
        // when middle management fails with a DeathPactException
        // this actor will also fail
        Behaviors.receiveMessage[Command] { message =>
          middleManagement ! message
          Behaviors.same
        }
      })
      .onFailure[DeathPactException](SupervisorStrategy.restart)
}
```

### Example 20: Bubble failures up through the hierarchy

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.DeathPactException;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public interface Protocol {
  public interface Command {}

  public static class Fail implements Command {
    public final String text;

    public Fail(String text) {
      this.text = text;
    }
  }

  public static class Hello implements Command {
    public final String text;
    public final ActorRef<String> replyTo;

    public Hello(String text, ActorRef<String> replyTo) {
      this.text = text;
      this.replyTo = replyTo;
    }
  }
}

public static class Worker extends AbstractBehavior<Protocol.Command> {

  public static Behavior<Protocol.Command> create() {
    return Behaviors.setup(Worker::new);
  }

  private Worker(ActorContext<Protocol.Command> context) {
    super(context);
  }

  @Override
  public Receive<Protocol.Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Protocol.Fail.class, this::onFail)
        .onMessage(Protocol.Hello.class, this::onHello)
        .build();
  }

  private Behavior<Protocol.Command> onFail(Protocol.Fail message) {
    throw new RuntimeException(message.text);
  }

  private Behavior<Protocol.Command> onHello(Protocol.Hello message) {
    message.replyTo.tell(message.text);
    return this;
  }
}

public static class MiddleManagement extends AbstractBehavior<Protocol.Command> {

  public static Behavior<Protocol.Command> create() {
    return Behaviors.setup(MiddleManagement::new);
  }

  private final ActorRef<Protocol.Command> child;

  private MiddleManagement(ActorContext<Protocol.Command> context) {
    super(context);

    context.getLog().info("Middle management starting up");
    // default supervision of child, meaning that it will stop on failure
    child = context.spawn(Worker.create(), "child");

    // we want to know when the child terminates, but since we do not handle
    // the Terminated signal, we will in turn fail on child termination
    context.watch(child);
  }

  @Override
  public Receive<Protocol.Command> createReceive() {
    // here we don't handle Terminated at all which means that
    // when the child fails or stops gracefully this actor will
    // fail with a DeathPactException
    return newReceiveBuilder().onMessage(Protocol.Command.class, this::onCommand).build();
  }

  private Behavior<Protocol.Command> onCommand(Protocol.Command message) {
    // just pass messages on to the child
    child.tell(message);
    return this;
  }
}

public static class Boss extends AbstractBehavior<Protocol.Command> {

  public static Behavior<Protocol.Command> create() {
    return Behaviors.supervise(Behaviors.setup(Boss::new))
        .onFailure(DeathPactException.class, SupervisorStrategy.restart());
  }

  private final ActorRef<Protocol.Command> middleManagement;

  private Boss(ActorContext<Protocol.Command> context) {
    super(context);
    context.getLog().info("Boss starting up");
    // default supervision of child, meaning that it will stop on failure
    middleManagement = context.spawn(MiddleManagement.create(), "middle-management");
    context.watch(middleManagement);
  }

  @Override
  public Receive<Protocol.Command> createReceive() {
    // here we don't handle Terminated at all which means that
    // when middle management fails with a DeathPactException
    // this actor will also fail
    return newReceiveBuilder().onMessage(Protocol.Command.class, this::onCommand).build();
  }

  private Behavior<Protocol.Command> onCommand(Protocol.Command message) {
    // just pass messages on to the child
    middleManagement.tell(message);
    return this;
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RestartSupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RestartSupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/libraries/akka-core/2.10/actors.html
- https://doc.akka.io/libraries/akka-core/2.10/fault-tolerance.html
- https://doc.akka.io/libraries/akka-core/2.10/general/supervision.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/actor-discovery.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/actor-lifecycle.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/interaction-patterns.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/style-guide.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/typed/fault-tolerance.html](https://doc.akka.io/libraries/akka-core/2.10/typed/fault-tolerance.html)*