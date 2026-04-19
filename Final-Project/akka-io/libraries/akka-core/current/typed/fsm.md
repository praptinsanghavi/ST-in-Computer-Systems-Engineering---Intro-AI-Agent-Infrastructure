---
description: Finite State Machines (FSM) with Akka Actors.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/fsm.html
title: Behaviors as finite state machines • Akka core
---

# Behaviors as finite state machines • Akka core

> **Summary:** Finite State Machines (FSM) with Akka Actors.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Behaviors as finite state machines

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic FSM](../fsm.html).

An actor can be used to model a Finite State Machine (FSM).

To demonstrate this, consider an actor which shall receive and queue messages while they arrive in a burst and send them on after the burst ended or a flush request is received.

This example demonstrates how to:

- Model states using different behaviors
- Model storing data at each state by representing the behavior as a method
- Implement state timeouts

The events the FSM can receive become the type of message the Actor can receive:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/FSMDocSpec.scala#L21-L71 "Go to snippet source")object Buncher {

  // FSM event becomes the type of the message Actor supports
  sealed trait Event
  final case class SetTarget(ref: ActorRef[Batch]) extends Event
  final case class Queue(obj: Any) extends Event
  case object Flush extends Event
  private case object Timeout extends Event
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/FSMDocTest.java#L20-L167 "Go to snippet source")public abstract class Buncher {

  public interface Event {}

  public static final class SetTarget implements Event {
    public final ActorRef<Batch> ref;

    public SetTarget(ActorRef<Batch> ref) {
      this.ref = ref;
    }
  }

  private enum Timeout implements Event {
    INSTANCE
  }

  public enum Flush implements Event {
    INSTANCE
  }

  public static final class Queue implements Event {
    public final Object obj;

    public Queue(Object obj) {
      this.obj = obj;
    }
  }
}
```

`SetTarget` is needed for starting it up, setting the destination for the `Batches` to be passed on; `Queue` will add to the internal queue while `Flush` will mark the end of a burst.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/FSMDocSpec.scala#L33-L37 "Go to snippet source")sealed trait Data
case object Uninitialized extends Data
final case class Todo(target: ActorRef[Batch], queue: immutable.Seq[Any]) extends Data

final case class Batch(obj: immutable.Seq[Any])
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/FSMDocTest.java#L51-L124 "Go to snippet source")interface Data {}

public static final class Todo implements Data {
  public final ActorRef<Batch> target;
  public final List<Object> queue;

  public Todo(ActorRef<Batch> target, List<Object> queue) {
    this.target = target;
    this.queue = queue;
  }

}

public static final class Batch {
  public final List<Object> list;

  public Batch(List<Object> list) {
    this.list = list;
  }

}
```

Each state becomes a distinct behavior and after processing a message the next state in the form of a [`Behavior`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") is returned.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/FSMDocSpec.scala#L21-L71 "Go to snippet source")object Buncher {
  // states of the FSM represented as behaviors

  // initial state
  def apply(): Behavior[Event] = idle(Uninitialized)

  private def idle(data: Data): Behavior[Event] = Behaviors.receiveMessage[Event] { message =>
    (message, data) match {
      case (SetTarget(ref), Uninitialized) =>
        idle(Todo(ref, Vector.empty))
      case (Queue(obj), t @ Todo(_, v)) =>
        active(t.copy(queue = v :+ obj))
      case _ =>
        Behaviors.unhandled
    }
  }

  private def active(data: Todo): Behavior[Event] =
    Behaviors.withTimers[Event] { timers =>
      // instead of FSM state timeout
      timers.startSingleTimer(Timeout, 1.second)
      Behaviors.receiveMessagePartial {
        case Flush | Timeout =>
          data.target ! Batch(data.queue)
          idle(data.copy(queue = Vector.empty))
        case Queue(obj) =>
          active(data.copy(queue = data.queue :+ obj))
      }
    }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/FSMDocTest.java#L20-L167 "Go to snippet source")public abstract class Buncher {
  // FSM states represented as behaviors

  // initial state
  public static Behavior<Event> create() {
    return uninitialized();
  }

  private static Behavior<Event> uninitialized() {
    return Behaviors.receive(Event.class)
        .onMessage(
            SetTarget.class, message -> idle(new Todo(message.ref, Collections.emptyList())))
        .build();
  }

  private static Behavior<Event> idle(Todo data) {
    return Behaviors.receive(Event.class)
        .onMessage(Queue.class, message -> active(data.addElement(message)))
        .build();
  }

  private static Behavior<Event> active(Todo data) {
    return Behaviors.withTimers(
        timers -> {
          // State timeouts done with withTimers
          timers.startSingleTimer("Timeout", Timeout.INSTANCE, Duration.ofSeconds(1));
          return Behaviors.receive(Event.class)
              .onMessage(Queue.class, message -> active(data.addElement(message)))
              .onMessage(Flush.class, message -> activeOnFlushOrTimeout(data))
              .onMessage(Timeout.class, message -> activeOnFlushOrTimeout(data))
              .build();
        });
  }

  private static Behavior<Event> activeOnFlushOrTimeout(Todo data) {
    data.target.tell(new Batch(data.queue));
    return idle(data.copy(new ArrayList<>()));
  }

}
```

The method `idle` above makes use of [`Behaviors.unhandled`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#unhandled() "akka.actor.typed.javadsl.Behaviors")[`Behaviors.unhandled`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#unhandled[T]:akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") which advises the system to reuse the previous behavior, including the hint that the message has not been handled. There are two related behaviors:

- return [`Behaviors.empty`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#empty() "akka.actor.typed.javadsl.Behaviors")[`Behaviors.empty`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#empty[T]:akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") as next behavior in case you reached a state where you don’t expect messages any more. For instance if an actor only waits until all spawned child actors stopped. Unhandled messages are still logged with this behavior.
- return [`Behaviors.ignore`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#ignore() "akka.actor.typed.javadsl.Behaviors")[`Behaviors.ignore`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#ignore[T]:akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") as next behavior in case you don’t care about unhandled messages. All messages sent to an actor with such a behavior are simply dropped and ignored (without logging)

To set state timeouts use [`Behaviors.withTimers`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#withTimers(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.withTimers`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#withTimers[T](factory:akka.actor.typed.scaladsl.TimerScheduler[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") along with a [`startSingleTimer`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/TimerScheduler.html#startSingleTimer(java.lang.Object,T,java.time.Duration) "akka.actor.typed.javadsl.TimerScheduler")[`startSingleTimer`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/TimerScheduler.html#startSingleTimer(key:Any,msg:T,delay:scala.concurrent.duration.FiniteDuration):Unit "akka.actor.typed.scaladsl.TimerScheduler").

## Example project

[FSM example project](../attachments/akka-samples-fsm-java.zip) [FSM example project](../attachments/akka-samples-fsm-scala.zip) is an example project that can be downloaded, and with instructions of how to run.

This project contains a Dining Hakkers sample illustrating how to model a Finite State Machine (FSM) with actors.

## Code Examples

### Example 1: Behaviors as finite state machines

```scala
object Buncher {

  // FSM event becomes the type of the message Actor supports
  sealed trait Event
  final case class SetTarget(ref: ActorRef[Batch]) extends Event
  final case class Queue(obj: Any) extends Event
  case object Flush extends Event
  private case object Timeout extends Event
}
```

### Example 2: Behaviors as finite state machines

```java
public abstract class Buncher {

  public interface Event {}

  public static final class SetTarget implements Event {
    public final ActorRef<Batch> ref;

    public SetTarget(ActorRef<Batch> ref) {
      this.ref = ref;
    }
  }

  private enum Timeout implements Event {
    INSTANCE
  }

  public enum Flush implements Event {
    INSTANCE
  }

  public static final class Queue implements Event {
    public final Object obj;

    public Queue(Object obj) {
      this.obj = obj;
    }
  }
}
```

### Example 3: Behaviors as finite state machines

```scala
sealed trait Data
case object Uninitialized extends Data
final case class Todo(target: ActorRef[Batch], queue: immutable.Seq[Any]) extends Data

final case class Batch(obj: immutable.Seq[Any])
```

### Example 4: Behaviors as finite state machines

```java
interface Data {}

public static final class Todo implements Data {
  public final ActorRef<Batch> target;
  public final List<Object> queue;

  public Todo(ActorRef<Batch> target, List<Object> queue) {
    this.target = target;
    this.queue = queue;
  }

}

public static final class Batch {
  public final List<Object> list;

  public Batch(List<Object> list) {
    this.list = list;
  }

}
```

### Example 5: Behaviors as finite state machines

```scala
object Buncher {
  // states of the FSM represented as behaviors

  // initial state
  def apply(): Behavior[Event] = idle(Uninitialized)

  private def idle(data: Data): Behavior[Event] = Behaviors.receiveMessage[Event] { message =>
    (message, data) match {
      case (SetTarget(ref), Uninitialized) =>
        idle(Todo(ref, Vector.empty))
      case (Queue(obj), t @ Todo(_, v)) =>
        active(t.copy(queue = v :+ obj))
      case _ =>
        Behaviors.unhandled
    }
  }

  private def active(data: Todo): Behavior[Event] =
    Behaviors.withTimers[Event] { timers =>
      // instead of FSM state timeout
      timers.startSingleTimer(Timeout, 1.second)
      Behaviors.receiveMessagePartial {
        case Flush | Timeout =>
          data.target ! Batch(data.queue)
          idle(data.copy(queue = Vector.empty))
        case Queue(obj) =>
          active(data.copy(queue = data.queue :+ obj))
      }
    }

}
```

### Example 6: Behaviors as finite state machines

```java
public abstract class Buncher {
  // FSM states represented as behaviors

  // initial state
  public static Behavior<Event> create() {
    return uninitialized();
  }

  private static Behavior<Event> uninitialized() {
    return Behaviors.receive(Event.class)
        .onMessage(
            SetTarget.class, message -> idle(new Todo(message.ref, Collections.emptyList())))
        .build();
  }

  private static Behavior<Event> idle(Todo data) {
    return Behaviors.receive(Event.class)
        .onMessage(Queue.class, message -> active(data.addElement(message)))
        .build();
  }

  private static Behavior<Event> active(Todo data) {
    return Behaviors.withTimers(
        timers -> {
          // State timeouts done with withTimers
          timers.startSingleTimer("Timeout", Timeout.INSTANCE, Duration.ofSeconds(1));
          return Behaviors.receive(Event.class)
              .onMessage(Queue.class, message -> active(data.addElement(message)))
              .onMessage(Flush.class, message -> activeOnFlushOrTimeout(data))
              .onMessage(Timeout.class, message -> activeOnFlushOrTimeout(data))
              .build();
        });
  }

  private static Behavior<Event> activeOnFlushOrTimeout(Todo data) {
    data.target.tell(new Batch(data.queue));
    return idle(data.copy(new ArrayList<>()));
  }

}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/TimerScheduler.html
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-samples-fsm-java.zip
- https://doc.akka.io/libraries/akka-core/current/attachments/akka-samples-fsm-scala.zip
- https://doc.akka.io/libraries/akka-core/current/coordinated-shutdown.html
- https://doc.akka.io/libraries/akka-core/current/fsm.html
- https://doc.akka.io/libraries/akka-core/current/typed/stash.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/fsm.html](https://doc.akka.io/libraries/akka-core/current/typed/fsm.html)*