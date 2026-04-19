---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:04:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/style-guide.html
title: Style guide • Akka Documentation
---

# Style guide • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Style guide

This is a style guide with recommendations of idioms and patterns for writing Akka actors. Note that this guide does not cover the classic actor API.

As with all style guides, treat this as a list of rules to be broken. There are certainly times when alternative styles should be preferred over the ones given here.

## Functional versus object\-oriented style

There are two flavors of the Actor APIs.

1. The functional programming style where you pass a function to a factory which then constructs a behavior, for stateful actors this means passing immutable state around as parameters and switching to a new behavior whenever you need to act on a changed state.
2. The object\-oriented style where a concrete class for the actor behavior is defined and mutable state is kept inside of it as fields.

An example of a counter actor implemented in the functional style:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L21-L60 "Go to snippet source")  
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  def apply(): Behavior[Command] =
    counter(0)

  private def counter(n: Int): Behavior[Command] =
    Behaviors.receive { (context, message) =>
      message match {
        case Increment =>
          val newValue = n + 1
          context.log.debug("Incremented counter to [{}]", newValue)
          counter(newValue)
        case GetValue(replyTo) =>
          replyTo ! Value(n)
          Behaviors.same
      }
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L9-L74 "Go to snippet source")import akka.actor.typed.Behavior;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;

public class Counter {
  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(context -> counter(context, 0));
  }

  private static Behavior<Command> counter(final ActorContext<Command> context, final int n) {

    return Behaviors.receive(Command.class)
        .onMessage(Increment.class, notUsed -> onIncrement(context, n))
        .onMessage(GetValue.class, command -> onGetValue(n, command))
        .build();
  }

  private static Behavior<Command> onIncrement(ActorContext<Command> context, int n) {
    int newValue = n + 1;
    context.getLog().debug("Incremented counter to [{}]", newValue);
    return counter(context, newValue);
  }

  private static Behavior<Command> onGetValue(int n, GetValue command) {
    command.replyTo.tell(new Value(n));
    return Behaviors.same();
  }
}
```

Corresponding actor implemented in the object\-oriented style:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L21-L97 "Go to snippet source")  
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.AbstractBehavior
import org.slf4j.Logger

object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  def apply(): Behavior[Command] = {
    Behaviors.setup(context => new Counter(context))
  }
}

class Counter(context: ActorContext[Counter.Command]) extends AbstractBehavior[Counter.Command](context) {
  import Counter._

  private var n = 0

  override def onMessage(msg: Command): Behavior[Counter.Command] = {
    msg match {
      case Increment =>
        n += 1
        context.log.debug("Incremented counter to [{}]", n)
        this
      case GetValue(replyTo) =>
        replyTo ! Value(n)
        this
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L9-L141 "Go to snippet source")import akka.actor.typed.Behavior;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.Receive;

public class Counter extends AbstractBehavior<Counter.Command> {

  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(Counter::new);
  }

  private int n;

  private Counter(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, notUsed -> onIncrement())
        .onMessage(GetValue.class, this::onGetValue)
        .build();
  }

  private Behavior<Command> onIncrement() {
    n++;
    getContext().getLog().debug("Incremented counter to [{}]", n);
    return this;
  }

  private Behavior<Command> onGetValue(GetValue command) {
    command.replyTo.tell(new Value(n));
    return this;
  }
}
```

Some similarities to note:

- Messages are defined in the same way.
- Both have an `apply` factory method in the companion objecta static `create` factory method to create the initial behavior, i.e. from the outside they are used in the same way.
- Pattern matchingMatching and handling of the messages are done in the same way.
- The `ActorContext` API is the same.

A few differences to note:

- There is no class in the functional style, but that is not strictly a requirement and sometimes it’s convenient to use a class also with the functional style to reduce number of parameters in the methods.
- Mutable state, such as the `var n``int n` is typically used in the object\-oriented style.
- In the functional style the state is is updated by returning a new behavior that holds the new immutable state, the `n: Int``final int n` parameter of the `counter` method.
- The object\-oriented style must use a new instance of the initial `Behavior` for each spawned actor instance, since the state in `AbstractBehavior` instance must not be shared between actor instances. This is “hidden” in the functional style since the immutable state is captured by the function.
- In the object\-oriented style one can return `this` to stay with the same behavior for next message. In the functional style there is no `this` so `Behaviors.same` is used instead.
- The `ActorContext` is accessed in different ways. In the object\-oriented style it’s retrieved from `Behaviors.setup` and kept as an instance field, while in the functional style it’s passed in alongside the message. That said, `Behaviors.setup` is often used in the functional style as well, and then often together with `Behaviors.receiveMessage` that doesn’t pass in the context with the message. The `ActorContext` is accessed with `Behaviors.setup` but then kept in different ways. As an instance field versus a method parameter.

Which style you choose to use is a matter of taste and both styles can be mixed depending on which is best for a specific actor. An actor can switch between behaviors implemented in different styles. For example, it may have an initial behavior that is only stashing messages until some initial query has been completed and then switching over to its main active behavior that is maintaining some mutable state. Such initial behavior is nice in the functional style and the active behavior may be better with the object\-oriented style.

We would recommend using the tool that is best for the job. The APIs are similar in many ways to make it easy to learn both. You may of course also decide to just stick to one style for consistency and familiarity reasons.

When developing in Scala the functional style will probably be the choice for many.

Some reasons why you may want to use the functional style:

- You are familiar with a functional approach of structuring the code. Note that this API is still not using any advanced functional programming or type theory constructs.
- The state is immutable and can be passed to “next” behavior.
- The `Behavior` is stateless.
- The actor lifecycle has several different phases that can be represented by switching between different behaviors, like a [finite state machine](fsm.html). This is also supported with the object\-oriented style, but it’s typically nicer with the functional style.
- It’s less risk of accessing mutable state in the actor from other threads, like `Future` or Streams callbacks.

Some reasons why you may want to use the object\-oriented style:

- You are more familiar with an object\-oriented style of structuring the code with methods in a class rather than functions.
- Some state is not immutable.
- It could be more familiar and easier to upgrade existing classic actors to this style.
- Mutable state can sometimes have better performance, e.g. mutable collections and avoiding allocating new instance for next behavior (be sure to benchmark if this is your motivation).

When developing in Java the object\-oriented style will probably be the choice for many.

Some reasons why you may want to use the object\-oriented style:

- You are more familiar with an object\-oriented style of structuring the code with methods in a class rather than functions.
- Java lambdas can only close over final or effectively final fields, making it impractical to use the functional style in behaviors that mutate their fields.
- Some state is not immutable, e.g. immutable collections are not widely used in Java. It is OK to use mutable state also with the functional style but you must make sure that it’s not shared between different actor instances.
- It could be more familiar and easier to upgrade existing classic actors to this style.
- Mutable state can sometimes have better performance, e.g. mutable collections and avoiding allocating new instance for next behavior (be sure to benchmark if this is your motivation).

Some reasons why you may want to use the functional style:

- You are familiar with a functional approach of structuring the code. Note that this API is still not using any advanced functional programming or type theory constructs.
- The state is immutable and can be passed to “next” behavior.
- The `Behavior` is stateless.
- The actor lifecycle has several different phases that can be represented by switching between different behaviors, like a [finite state machine](fsm.html). This is also supported with the object\-oriented style, but it’s typically nicer with the functional style.
- It’s less risk of accessing mutable state in the actor from other threads, like `CompletionStage` or Streams callbacks.

## Passing around too many parameters

One thing you will quickly run into when using the functional style is that you need to pass around many parameters.

Let’s add `name` parameter and timers to the previous `Counter` example. A first approach would be to just add those as separate parameters:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L104-L138 "Go to snippet source")  
// this is an anti-example, better solutions exists
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class IncrementRepeatedly(interval: FiniteDuration) extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  def apply(name: String): Behavior[Command] =
    Behaviors.withTimers { timers =>
      counter(name, timers, 0)
    }

  private def counter(name: String, timers: TimerScheduler[Command], n: Int): Behavior[Command] =
    Behaviors.receive { (context, message) =>
      message match {
        case IncrementRepeatedly(interval) =>
          context.log.debug(
            "[{}] Starting repeated increments with interval [{}], current count is [{}]",
            name,
            interval.toString,
            n.toString)
          timers.startTimerWithFixedDelay(Increment, interval)
          Behaviors.same
        case Increment =>
          val newValue = n + 1
          context.log.debug2("[{}] Incremented counter to [{}]", name, newValue)
          counter(name, timers, newValue)
        case GetValue(replyTo) =>
          replyTo ! Value(n)
          Behaviors.same
      }
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L149-L230 "Go to snippet source")  
// this is an anti-example, better solutions exists
public class Counter {
  public interface Command {}

  public static class IncrementRepeatedly implements Command {
    public final Duration interval;

    public IncrementRepeatedly(Duration interval) {
      this.interval = interval;
    }
  }

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }

  public static Behavior<Command> create(String name) {
    return Behaviors.setup(
        context -> Behaviors.withTimers(timers -> counter(name, context, timers, 0)));
  }

  private static Behavior<Command> counter(
      final String name,
      final ActorContext<Command> context,
      final TimerScheduler<Command> timers,
      final int n) {

    return Behaviors.receive(Command.class)
        .onMessage(
            IncrementRepeatedly.class,
            command -> onIncrementRepeatedly(name, context, timers, n, command))
        .onMessage(Increment.class, notUsed -> onIncrement(name, context, timers, n))
        .onMessage(GetValue.class, command -> onGetValue(n, command))
        .build();
  }

  private static Behavior<Command> onIncrementRepeatedly(
      String name,
      ActorContext<Command> context,
      TimerScheduler<Command> timers,
      int n,
      IncrementRepeatedly command) {
    context
        .getLog()
        .debug(
            "[{}] Starting repeated increments with interval [{}], current count is [{}]",
            name,
            command.interval,
            n);
    timers.startTimerWithFixedDelay(Increment.INSTANCE, command.interval);
    return Behaviors.same();
  }

  private static Behavior<Command> onIncrement(
      String name, ActorContext<Command> context, TimerScheduler<Command> timers, int n) {
    int newValue = n + 1;
    context.getLog().debug("[{}] Incremented counter to [{}]", name, newValue);
    return counter(name, context, timers, newValue);
  }

  private static Behavior<Command> onGetValue(int n, GetValue command) {
    command.replyTo.tell(new Value(n));
    return Behaviors.same();
  }
}
```

Ouch, that doesn’t look good. More things may be needed, such as stashing or application specific “constructor” parameters. As you can imagine, that will be too much boilerplate.

As a first step we can place all these parameters in a class so that we at least only have to pass around one thing. Still good to have the “changing” state, the `n: Int``final int n` here, as a separate parameter.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L144-L180 "Go to snippet source")  
// this is better than previous example, but even better solution exists
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class IncrementRepeatedly(interval: FiniteDuration) extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  private case class Setup(name: String, context: ActorContext[Command], timers: TimerScheduler[Command])

  def apply(name: String): Behavior[Command] =
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        counter(Setup(name, context, timers), 0)
      }
    }

  private def counter(setup: Setup, n: Int): Behavior[Command] =
    Behaviors.receiveMessage {
      case IncrementRepeatedly(interval) =>
        setup.context.log.debugN(
          "[{}] Starting repeated increments with interval [{}], current count is [{}]",
          setup.name,
          interval,
          n)
        setup.timers.startTimerWithFixedDelay(Increment, interval)
        Behaviors.same
      case Increment =>
        val newValue = n + 1
        setup.context.log.debug2("[{}] Incremented counter to [{}]", setup.name, newValue)
        counter(setup, newValue)
      case GetValue(replyTo) =>
        replyTo ! Value(n)
        Behaviors.same
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L236-L324 "Go to snippet source")  
// this is better than previous example, but even better solution exists
public class Counter {
  // messages omitted for brevity, same messages as above example

  private static class Setup {
    final String name;
    final ActorContext<Command> context;
    final TimerScheduler<Command> timers;

    private Setup(String name, ActorContext<Command> context, TimerScheduler<Command> timers) {
      this.name = name;
      this.context = context;
      this.timers = timers;
    }
  }

  public static Behavior<Command> create(String name) {
    return Behaviors.setup(
        context ->
            Behaviors.withTimers(timers -> counter(new Setup(name, context, timers), 0)));
  }

  private static Behavior<Command> counter(final Setup setup, final int n) {

    return Behaviors.receive(Command.class)
        .onMessage(
            IncrementRepeatedly.class, command -> onIncrementRepeatedly(setup, n, command))
        .onMessage(Increment.class, notUsed -> onIncrement(setup, n))
        .onMessage(GetValue.class, command -> onGetValue(n, command))
        .build();
  }

  private static Behavior<Command> onIncrementRepeatedly(
      Setup setup, int n, IncrementRepeatedly command) {
    setup
        .context
        .getLog()
        .debug(
            "[{}] Starting repeated increments with interval [{}], current count is [{}]",
            setup.name,
            command.interval,
            n);
    setup.timers.startTimerWithFixedDelay(Increment.INSTANCE, command.interval);
    return Behaviors.same();
  }

  private static Behavior<Command> onIncrement(Setup setup, int n) {
    int newValue = n + 1;
    setup.context.getLog().debug("[{}] Incremented counter to [{}]", setup.name, newValue);
    return counter(setup, newValue);
  }

  private static Behavior<Command> onGetValue(int n, GetValue command) {
    command.replyTo.tell(new Value(n));
    return Behaviors.same();
  }
}
```

That’s better. Only one thing to carry around and easy to add more things to it without rewriting everything. Note that we also placed the `ActorContext` in the `Setup` class, and therefore switched from `Behaviors.receive` to `Behaviors.receiveMessage` since we already have access to the `context`.

It’s still rather annoying to have to pass the same thing around everywhere.

We can do better by introducing an enclosing class, even though it’s still using the functional style. The “constructor” parameters can be immutable`final` instance fields and can be accessed from member methods.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L186-L227 "Go to snippet source")  
// this is better than previous examples
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class IncrementRepeatedly(interval: FiniteDuration) extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  def apply(name: String): Behavior[Command] =
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        new Counter(name, context, timers).counter(0)
      }
    }
}

class Counter private (
    name: String,
    context: ActorContext[Counter.Command],
    timers: TimerScheduler[Counter.Command]) {
  import Counter._

  private def counter(n: Int): Behavior[Command] =
    Behaviors.receiveMessage {
      case IncrementRepeatedly(interval) =>
        context.log.debugN(
          "[{}] Starting repeated increments with interval [{}], current count is [{}]",
          name,
          interval,
          n)
        timers.startTimerWithFixedDelay(Increment, interval)
        Behaviors.same
      case Increment =>
        val newValue = n + 1
        context.log.debug2("[{}] Incremented counter to [{}]", name, newValue)
        counter(newValue)
      case GetValue(replyTo) =>
        replyTo ! Value(n)
        Behaviors.same
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L330-L412 "Go to snippet source")  
// this is better than previous examples
public class Counter {
  // messages omitted for brevity, same messages as above example

  public static Behavior<Command> create(String name) {
    return Behaviors.setup(
        context ->
            Behaviors.withTimers(timers -> new Counter(name, context, timers).counter(0)));
  }

  private final String name;
  private final ActorContext<Command> context;
  private final TimerScheduler<Command> timers;

  private Counter(String name, ActorContext<Command> context, TimerScheduler<Command> timers) {
    this.name = name;
    this.context = context;
    this.timers = timers;
  }

  private Behavior<Command> counter(final int n) {
    return Behaviors.receive(Command.class)
        .onMessage(IncrementRepeatedly.class, command -> onIncrementRepeatedly(n, command))
        .onMessage(Increment.class, notUsed -> onIncrement(n))
        .onMessage(GetValue.class, command -> onGetValue(n, command))
        .build();
  }

  private Behavior<Command> onIncrementRepeatedly(int n, IncrementRepeatedly command) {
    context
        .getLog()
        .debug(
            "[{}] Starting repeated increments with interval [{}], current count is [{}]",
            name,
            command.interval,
            n);
    timers.startTimerWithFixedDelay(Increment.INSTANCE, command.interval);
    return Behaviors.same();
  }

  private Behavior<Command> onIncrement(int n) {
    int newValue = n + 1;
    context.getLog().debug("[{}] Incremented counter to [{}]", name, newValue);
    return counter(newValue);
  }

  private Behavior<Command> onGetValue(int n, GetValue command) {
    command.replyTo.tell(new Value(n));
    return Behaviors.same();
  }
}
```

That’s nice. One thing to be cautious with here is that it’s important that you create a new instance for each spawned actor, since those parameters must not be shared between different actor instances. That comes natural when creating the instance from `Behaviors.setup` as in the above example. Having a `apply` factory method in the companion object and making the constructor private is recommended. static `create` factory method and making the constructor private is recommended.

This can also be useful when testing the behavior by creating a test subclass that overrides certain methods in the class. The test would create the instance without the `apply` factory methodstatic `create` factory method. Then you need to relax the visibility constraints of the constructor and methods.

It’s not recommended to place mutable state and `var` membersnon\-final members in the enclosing class. It would be correct from an actor thread\-safety perspective as long as the same instance of the enclosing class is not shared between different actor instances, but if that is what you need you should rather use the object\-oriented style with the `AbstractBehavior` class.

Similar can be achieved without an enclosing class by placing the `def counter` inside the `Behaviors.setup` block. That works fine, but for more complex behaviors it can be better to structure the methods in a class. For completeness, here is how it would look like:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L233-L268 "Go to snippet source")  
// this works, but previous example is better for structuring more complex behaviors
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class IncrementRepeatedly(interval: FiniteDuration) extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  def apply(name: String): Behavior[Command] =
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        def counter(n: Int): Behavior[Command] =
          Behaviors.receiveMessage {
            case IncrementRepeatedly(interval) =>
              context.log.debugN(
                "[{}] Starting repeated increments with interval [{}], current count is [{}]",
                name,
                interval,
                n)
              timers.startTimerWithFixedDelay(Increment, interval)
              Behaviors.same
            case Increment =>
              val newValue = n + 1
              context.log.debug2("[{}] Incremented counter to [{}]", name, newValue)
              counter(newValue)
            case GetValue(replyTo) =>
              replyTo ! Value(n)
              Behaviors.same
          }

        counter(0)
      }
    }
}

```

## Behavior factory method

The initial behavior should be created via a factory method in the companion objecta static factory method. Thereby the usage of the behavior doesn’t change when the implementation is changed, for example if changing between object\-oriented and function style.

The factory method is a good place for retrieving resources like `Behaviors.withTimers`, `Behaviors.withStash` and `ActorContext` with `Behaviors.setup`.

When using the object\-oriented style, `AbstractBehavior`, a new instance should be created from a `Behaviors.setup` block in this factory method even though the `ActorContext` is not needed. This is important because a new instance should be created when restart supervision is used. Typically, the `ActorContext` is needed anyway.

The naming convention for the factory method is `apply` (when using Scala)`create` (when using Java). Consistent naming makes it easier for readers of the code to find the “starting point” of the behavior.

In the functional style the factory could even have been defined as a `val``static field` if all state is immutable and captured by the function, but since most behaviors need some initialization parameters it is preferred to consistently use a method (`def`) for the factory.

Example:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L274-L299 "Go to snippet source")object CountDown {
  sealed trait Command
  case object Down extends Command

  // factory for the initial `Behavior`
  def apply(countDownFrom: Int, notifyWhenZero: ActorRef[Done]): Behavior[Command] =
    new CountDown(notifyWhenZero).counter(countDownFrom)
}

private class CountDown(notifyWhenZero: ActorRef[Done]) {
  import CountDown._

  private def counter(remaining: Int): Behavior[Command] = {
    Behaviors.receiveMessage {
      case Down =>
        if (remaining == 1) {
          notifyWhenZero.tell(Done)
          Behaviors.stopped
        } else
          counter(remaining - 1)
    }
  }

}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L418-L455 "Go to snippet source")public class CountDown extends AbstractBehavior<CountDown.Command> {

  public interface Command {}

  public enum Down implements Command {
    INSTANCE
  }

  // factory for the initial `Behavior`
  public static Behavior<Command> create(int countDownFrom, ActorRef<Done> notifyWhenZero) {
    return Behaviors.setup(context -> new CountDown(context, countDownFrom, notifyWhenZero));
  }

  private final ActorRef<Done> notifyWhenZero;
  private int remaining;

  private CountDown(
      ActorContext<Command> context, int countDownFrom, ActorRef<Done> notifyWhenZero) {
    super(context);
    this.remaining = countDownFrom;
    this.notifyWhenZero = notifyWhenZero;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder().onMessage(Down.class, notUsed -> onDown()).build();
  }

  private Behavior<Command> onDown() {
    remaining--;
    if (remaining == 0) {
      notifyWhenZero.tell(Done.getInstance());
      return Behaviors.stopped();
    } else {
      return this;
    }
  }
}
```

When spawning an actor from this initial behavior it looks like:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L307 "Go to snippet source")val countDown = context.spawn(CountDown(100, doneRef), "countDown")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L464-L465 "Go to snippet source")ActorRef<CountDown.Command> countDown =
    context.spawn(CountDown.create(100, doneRef), "countDown");
```

## Where to define messages

When sending or receiving actor messages they should be prefixed with the name of the actor/behavior that defines them to avoid ambiguities.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L311 "Go to snippet source")countDown ! CountDown.Down
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L469 "Go to snippet source")countDown.tell(CountDown.Down.INSTANCE);
```

Such a style is preferred over using importing `Down` and using `countDown ! Down` importing `Down` and using `countDown.tell(Down.INSTANCE);`. However, within the `Behavior` that handle these messages the short names can be used.

Therefore it is not recommended to define messages as top\-level classes.

For the majority of cases it’s good style to define the messages in the companion objectas static inner classes together with the `Behavior`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L37-L60 "Go to snippet source")object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L83-L141 "Go to snippet source")public class Counter extends AbstractBehavior<Counter.Command> {

  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }
}
```

If several actors share the same message protocol, it’s recommended to define those messages in a separate `object``interface` for that protocol.

Here’s an example of a shared message protocol setup:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L318-L327 "Go to snippet source")object CounterProtocol {
  sealed trait Command

  final case class Increment(delta: Int, replyTo: ActorRef[OperationResult]) extends Command
  final case class Decrement(delta: Int, replyTo: ActorRef[OperationResult]) extends Command

  sealed trait OperationResult
  case object Confirmed extends OperationResult
  final case class Rejected(reason: String) extends OperationResult
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L477-L513 "Go to snippet source")interface CounterProtocol {
  interface Command {}

  public static class Increment implements Command {
    public final int delta;
    private final ActorRef<OperationResult> replyTo;

    public Increment(int delta, ActorRef<OperationResult> replyTo) {
      this.delta = delta;
      this.replyTo = replyTo;
    }
  }

  public static class Decrement implements Command {
    public final int delta;
    private final ActorRef<OperationResult> replyTo;

    public Decrement(int delta, ActorRef<OperationResult> replyTo) {
      this.delta = delta;
      this.replyTo = replyTo;
    }
  }

  interface OperationResult {}

  enum Confirmed implements OperationResult {
    INSTANCE
  }

  public static class Rejected implements OperationResult {
    public final String reason;

    public Rejected(String reason) {
      this.reason = reason;
    }
  }
}
```

Note that the response message hierarchy in this case could be completely avoided by using the API instead (see [Generic Response Wrapper](interaction-patterns.html#generic-response-wrapper)).

## Public versus private messages

Often an actor has some messages that are only for its internal implementation and not part of the public message protocol, such as timer messages or wrapper messages for `ask` or `messageAdapter`.

Such messages should be declared `private` so they can’t be accessed and sent from the outside of the actor. Note that they must still extendimplement the public `Command` traitinterface.

Here is an example of using `private` for an internal message:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L333-L368 "Go to snippet source")object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  // Tick is private so can't be sent from the outside
  private case object Tick extends Command

  def apply(name: String, tickInterval: FiniteDuration): Behavior[Command] =
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        timers.startTimerWithFixedDelay(Tick, tickInterval)
        new Counter(name, context).counter(0)
      }
    }
}

class Counter private (name: String, context: ActorContext[Counter.Command]) {
  import Counter._

  private def counter(n: Int): Behavior[Command] =
    Behaviors.receiveMessage {
      case Increment =>
        val newValue = n + 1
        context.log.debug2("[{}] Incremented counter to [{}]", name, newValue)
        counter(newValue)
      case Tick =>
        val newValue = n + 1
        context.log.debug2("[{}] Incremented counter by background tick to [{}]", name, newValue)
        counter(newValue)
      case GetValue(replyTo) =>
        replyTo ! Value(n)
        Behaviors.same
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L522-L643 "Go to snippet source")public class Counter extends AbstractBehavior<Counter.Command> {

  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }

  // Tick is private so can't be sent from the outside
  private enum Tick implements Command {
    INSTANCE
  }

  public static Behavior<Command> create(String name, Duration tickInterval) {
    return Behaviors.setup(
        context ->
            Behaviors.withTimers(
                timers -> {
                  timers.startTimerWithFixedDelay(Tick.INSTANCE, tickInterval);
                  return new Counter(name, context);
                }));
  }

  private final String name;
  private int count;

  private Counter(String name, ActorContext<Command> context) {
    super(context);
    this.name = name;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, notUsed -> onIncrement())
        .onMessage(Tick.class, notUsed -> onTick())
        .onMessage(GetValue.class, this::onGetValue)
        .build();
  }

  private Behavior<Command> onIncrement() {
    count++;
    getContext().getLog().debug("[{}] Incremented counter to [{}]", name, count);
    return this;
  }

  private Behavior<Command> onTick() {
    count++;
    getContext()
        .getLog()
        .debug("[{}] Incremented counter by background tick to [{}]", name, count);
    return this;
  }

  private Behavior<Command> onGetValue(GetValue command) {
    command.replyTo.tell(new Value(count));
    return this;
  }

}
```

An alternative approach is using a type hierarchy and `narrow` to have a super\-type for the public messages as a distinct type from the super\-type of all actor messages. The former approach is recommended but it is good to know this alternative as it can be useful when using shared message protocol classes as described in [Where to define messages](style-guide.html#where-to-define-messages).

Here’s an example of using a type hierarchy to separate public and private messages:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L374-L419 "Go to snippet source")// above example is preferred, but this is possible and not wrong
object Counter {
  // The type of all public and private messages the Counter actor handles
  sealed trait Message

  /** Counter's public message protocol type. */
  sealed trait Command extends Message
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  // The type of the Counter actor's internal messages.
  sealed trait PrivateCommand extends Message
  // Tick is a private command so can't be sent to an ActorRef[Command]
  case object Tick extends PrivateCommand

  def apply(name: String, tickInterval: FiniteDuration): Behavior[Command] = {
    Behaviors
      .setup[Counter.Message] { context =>
        Behaviors.withTimers { timers =>
          timers.startTimerWithFixedDelay(Tick, tickInterval)
          new Counter(name, context).counter(0)
        }
      }
      .narrow // note narrow here
  }
}

class Counter private (name: String, context: ActorContext[Counter.Message]) {
  import Counter._

  private def counter(n: Int): Behavior[Message] =
    Behaviors.receiveMessage {
      case Increment =>
        val newValue = n + 1
        context.log.debug2("[{}] Incremented counter to [{}]", name, newValue)
        counter(newValue)
      case Tick =>
        val newValue = n + 1
        context.log.debug2("[{}] Incremented counter by background tick to [{}]", name, newValue)
        counter(newValue)
      case GetValue(replyTo) =>
        replyTo ! Value(n)
        Behaviors.same
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L650-L733 "Go to snippet source")// above example is preferred, but this is possible and not wrong
public class Counter extends AbstractBehavior<Counter.Message> {

  // The type of all public and private messages the Counter actor handles
  public interface Message {}

  /** Counter's public message protocol type. */
  public interface Command extends Message {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }

  // The type of the Counter actor's internal messages.
  interface PrivateCommand extends Message {}

  // Tick is a private command so can't be sent to an ActorRef<Command>
  enum Tick implements PrivateCommand {
    INSTANCE
  }

  public static Behavior<Command> create(String name, Duration tickInterval) {
    return Behaviors.setup(
            (ActorContext<Message> context) ->
                Behaviors.withTimers(
                    timers -> {
                      timers.startTimerWithFixedDelay(Tick.INSTANCE, tickInterval);
                      return new Counter(name, context);
                    }))
        .narrow(); // note narrow here
  }

  private final String name;
  private int count;

  private Counter(String name, ActorContext<Message> context) {
    super(context);
    this.name = name;
  }

  @Override
  public Receive<Message> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, notUsed -> onIncrement())
        .onMessage(Tick.class, notUsed -> onTick())
        .onMessage(GetValue.class, this::onGetValue)
        .build();
  }

  private Behavior<Message> onIncrement() {
    count++;
    getContext().getLog().debug("[{}] Incremented counter to [{}]", name, count);
    return this;
  }

  private Behavior<Message> onTick() {
    count++;
    getContext()
        .getLog()
        .debug("[{}] Incremented counter by background tick to [{}]", name, count);
    return this;
  }

  private Behavior<Message> onGetValue(GetValue command) {
    command.replyTo.tell(new Value(count));
    return this;
  }
}
```

`private` visibility can be defined for the `PrivateCommand` messages but it’s not strictly needed since they can’t be sent to an ActorRef\[Command]ActorRef, which is the public message type of the actor.

### Singleton messages

For messages without parameters the `enum` singleton pattern is recommended:

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L88-L90 "Go to snippet source")public enum Increment implements Command {
  INSTANCE
}
```

In the `ReceiveBuilder` it can be matched in same way as other messages:

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L124 "Go to snippet source").onMessage(Increment.class, notUsed -> onIncrement())
```

## Lambdas versus method references

It’s recommended to keep the message matching with the `ReceiveBuilder` as short and clean as possible and delegate to methods. This improves readability and ease of method navigation with an IDE.

The delegation can be with lambdas or [method references](https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html).

Example of delegation using a lambda:

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L571-L594 "Go to snippet source")@Override
public Receive<Command> createReceive() {
  return newReceiveBuilder()
      .onMessage(Increment.class, notUsed -> onIncrement())
      .build();
}

private Behavior<Command> onIncrement() {
  count++;
  getContext().getLog().debug("[{}] Incremented counter to [{}]", name, count);
  return this;
}
```

When possible it’s preferred to use method references instead of lambdas. The benefit is less verbosity and in some cases it can actually give better type inference.

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L571-L609 "Go to snippet source")@Override
public Receive<Command> createReceive() {
  return newReceiveBuilder()
      .onMessage(GetValue.class, this::onGetValue)
      .build();
}

private Behavior<Command> onGetValue(GetValue command) {
  command.replyTo.tell(new Value(count));
  return this;
}
```

`this::onGetValue` is a method reference in above example. It corresponds to `command -> onGetValue(command)`.

If you are using IntelliJ IDEA it has support for converting lambdas to method references.

More important than the choice between lambdas or method references is to avoid lambdas with a large block of code. An anti\-pattern would be to inline all message handling inside the lambdas like this:

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L519-L640 "Go to snippet source")// this is an anti-pattern, don't use lambdas with a large block of code
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(
            Increment.class,
            notUsed -> {
              count++;
              getContext().getLog().debug("[{}] Incremented counter to [{}]", name, count);
              return this;
            })
        .onMessage(
            Tick.class,
            notUsed -> {
              count++;
              getContext()
                  .getLog()
                  .debug("[{}] Incremented counter by background tick to [{}]", name, count);
              return this;
            })
        .onMessage(
            GetValue.class,
            command -> {
              command.replyTo.tell(new Value(count));
              return this;
            })
        .build();
  }
```

In a real application it would often be more than 3 lines for each message. It’s not only making it more difficult to get an overview of the message matching, but compiler errors related to lambdas can sometimes be difficult to understand.

Ideally, lambdas should be written in one line of code. Two lines can be ok, but three is probably too much. Also, don’t use braces and return statements in one\-line lambda bodies.

## Partial versus total Function

It’s recommended to use a `sealed` trait as the super type of the commands (incoming messages) of an actor as the compiler will emit a warning if a message type is forgotten in the pattern match.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L458-L461 "Go to snippet source")sealed trait Command
case object Down extends Command
final case class GetValue(replyTo: ActorRef[Value]) extends Command
final case class Value(n: Int)
```

That is the main reason for `Behaviors.receive`, `Behaviors.receiveMessage` taking a `Function` rather than a `PartialFunction`.

The compiler warning if `GetValue` is not handled would be:

```
[warn] ... Counter.scala:45:34: match may not be exhaustive.
[warn] It would fail on the following input: GetValue(_)
[warn]         Behaviors.receiveMessage {
[warn]                                  ^

```

Note that a `MatchError` will be thrown at runtime if a message is not handled, so it’s important to pay attention to those. If a `Behavior` should not handle certain messages you can still include them in the pattern match and return `Behaviors.unhandled`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L469-L477 "Go to snippet source")val zero: Behavior[Command] = {
  Behaviors.receiveMessage {
    case GetValue(replyTo) =>
      replyTo ! Value(0)
      Behaviors.same
    case Down =>
      Behaviors.unhandled
  }
}
```

It’s recommended to use the `sealed` trait and total functions with exhaustiveness check to detect mistakes of forgetting to handle some messages. Sometimes that can be inconvenient and then you can use a `PartialFunction` with `Behaviors.receivePartial` or `Behaviors.receiveMessagePartial`

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L483-L489 "Go to snippet source")val zero: Behavior[Command] = {
  Behaviors.receiveMessagePartial {
    case GetValue(replyTo) =>
      replyTo ! Value(0)
      Behaviors.same
  }
}
```

## How to compose Partial Functions

Following up from previous section, there are times when one might want to combine different `PartialFunction`s into one `Behavior`.

A good use case for composing two or more `PartialFunction`s is when there is a bit of behavior that repeats across different states of the Actor. Below, you can find a simplified example for this use case.

The Command definition is still highly recommended be kept within a `sealed` Trait:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L499-L502 "Go to snippet source")sealed trait Command
case object Down extends Command
final case class GetValue(replyTo: ActorRef[Value]) extends Command
final case class Value(n: Int)
```

In this particular case, the Behavior that is repeating over is the one in charge to handle the `GetValue` Command, as it behaves the same regardless of the Actor’s internal state. Instead of defining the specific handlers as a `Behavior`, we can define them as a `PartialFunction`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L506-L510 "Go to snippet source")def getHandler(value: Int): PartialFunction[Command, Behavior[Command]] = {
  case GetValue(replyTo) =>
    replyTo ! Value(value)
    Behaviors.same
}
def setHandlerNotZero(value: Int): PartialFunction[Command, Behavior[Command]] = {
  case Down =>
    if (value == 1)
      zero
    else
      nonZero(value - 1)
}
def setHandlerZero(log: Logger): PartialFunction[Command, Behavior[Command]] = {
  case Down =>
    log.error("Counter is already at zero!")
    Behaviors.same
}
```

Finally, we can go on defining the two different behaviors for this specific actor. For each `Behavior` we would go and concatenate all needed `PartialFunction` instances with `orElse` to finally apply the command to the resulting one:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L532-L540 "Go to snippet source")val zero: Behavior[Command] = Behaviors.setup { context =>
  Behaviors.receiveMessagePartial(getHandler(0).orElse(setHandlerZero(context.log)))
}

def nonZero(capacity: Int): Behavior[Command] =
  Behaviors.receiveMessagePartial(getHandler(capacity).orElse(setHandlerNotZero(capacity)))

// Default Initial Behavior for this actor
def apply(initialCapacity: Int): Behavior[Command] = nonZero(initialCapacity)
```

Even though in this particular example we could use `receiveMessage` as we cover all cases, we use `receiveMessagePartial` instead to cover potential future unhandled message cases.

## ask versus ?

When using the `AskPattern` it’s recommended to use the `ask` method rather than the infix `?` operator, like so:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L429-L435 "Go to snippet source")import akka.actor.typed.scaladsl.AskPattern._
import akka.util.Timeout

implicit val timeout: Timeout = Timeout(3.seconds)
val counter: ActorRef[Command] = ???

val result: Future[OperationResult] = counter.ask(replyTo => Increment(delta = 2, replyTo))
```

You may also use the more terse placeholder syntax `_` instead of `replyTo`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L439 "Go to snippet source")val result2: Future[OperationResult] = counter.ask(Increment(delta = 2, _))
```

However, using the infix operator `?` with the placeholder syntax `_`, like is done in the following example, won’t typecheck because of the binding scope rules for wildcard parameters:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L444-L445 "Go to snippet source")// doesn't compile
val result3: Future[OperationResult] = counter ? Increment(delta = 2, _)
```

Adding the necessary parentheses (as shown below) makes it typecheck, but, subjectively, it’s rather ugly so the recommendation is to use `ask`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L450 "Go to snippet source")val result3: Future[OperationResult] = counter ? (Increment(delta = 2, _))
```

Note that `AskPattern` is only intended for request\-response interaction from outside an actor. If the requester is inside an actor, prefer `ActorContext.ask` as it provides better thread\-safety by not requiring the use of a `Future``CompletionStage` inside the actor.

## ReceiveBuilder

Using the `ReceiveBuilder` is the typical, and recommended, way of defining message handlers, but it can be good to know that it’s optional in case you would prefer a different approach. Alternatives could be like:

- direct processing because there is only one message type
- if or switch statements
- annotation processor
- [Vavr Pattern Matching DSL](https://www.vavr.io/vavr-docs/#_pattern_matching)
- pattern matching since JDK 14 ([JEP 305](https://openjdk.java.net/jeps/305))

In `Behaviors` there are `receive`, `receiveMessage` and `receiveSignal` factory methods that takes functions instead of using the `ReceiveBuilder`, which is the `receive` with the class parameter.

In `AbstractBehavior` you can return your own `akka.actor.typed.javadsl.Receive` from `createReceive` instead of using `newReceiveBuilder`. Implement the `receiveMessage` and `receiveSignal` in the `Receive` subclass.

## Nesting setup

When an actor behavior needs more than one of `setup`, `withTimers` and `withStash` the methods can be nested to access the needed dependencies:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L548-L560 "Go to snippet source")def apply(): Behavior[Command] =
  Behaviors.setup[Command](context =>
    Behaviors.withStash(100)(stash =>
      Behaviors.withTimers { timers =>
        context.log.debug("Starting up")

        // behavior using context, stash and timers ...
      }))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L741-L756 "Go to snippet source")public static Behavior<Command> apply() {
  return Behaviors.setup(
      context ->
          Behaviors.withStash(
              100,
              stash ->
                  Behaviors.withTimers(
                      timers -> {
                        context.getLog().debug("Starting up");

                        // behavior using context, stash and timers ...
                      })));
}
```

The order of the nesting does not change the behavior as long as there is no additional logic in any other function than the innermost one. It can be nice to default to put `setup` outermost as that is the least likely block that will be removed if the actor logic changes. 

Note that adding `supervise` to the mix is different as it will restart the behavior it wraps, but not the behavior around itself: 

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StyleGuideDocExamples.scala#L568-L584 "Go to snippet source")def apply(): Behavior[Command] =
  Behaviors.setup { context =>
    // only run on initial actor start, not on crash-restart
    context.log.info("Starting")

    Behaviors
      .supervise(Behaviors.withStash[Command](100) { stash =>
        // every time the actor crashes and restarts a new stash is created (previous stash is lost)
        context.log.debug("Starting up with stash")
        // Behaviors.receiveMessage { ... }
      })
      .onFailure[RuntimeException](SupervisorStrategy.restart)
  }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StyleGuideDocExamples.java#L764-L784 "Go to snippet source")public static Behavior<Command> create() {
  return Behaviors.setup(
      context -> {
        // only run on initial actor start, not on crash-restart
        context.getLog().info("Starting");

        return Behaviors.<Command>supervise(
                Behaviors.withStash(
                    100,
                    stash -> {
                      // every time the actor crashes and restarts a new stash is created
                      // (previous stash is lost)
                      context.getLog().debug("Starting up with stash");
                      // Behaviors.receiveMessage { ... }
                    }))
            .onFailure(RuntimeException.class, SupervisorStrategy.restart());
      });
}
```

## Additional naming conventions

Some naming conventions have already been mentioned in the context of other recommendations, but here is a list of additional conventions:

- `replyTo` is the typical name for the `ActorRef[Reply]``ActorRef<Reply>` parameter in messages to which a reply or acknowledgement should be sent.
- Incoming messages to an actor are typically called commands, and therefore the super type of all messages that an actor can handle is typically `sealed trait Command``interface Command {}`.
- Use past tense for the events persisted by an `EventSourcedBehavior` since those represent facts that have happened, for example `Incremented`.

## Code Examples

### Example 1: Functional versus object-oriented style

```scala
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  def apply(): Behavior[Command] =
    counter(0)

  private def counter(n: Int): Behavior[Command] =
    Behaviors.receive { (context, message) =>
      message match {
        case Increment =>
          val newValue = n + 1
          context.log.debug("Incremented counter to [{}]", newValue)
          counter(newValue)
        case GetValue(replyTo) =>
          replyTo ! Value(n)
          Behaviors.same
      }
    }
}
```

### Example 2: Functional versus object-oriented style

```java
import akka.actor.typed.Behavior;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;

public class Counter {
  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(context -> counter(context, 0));
  }

  private static Behavior<Command> counter(final ActorContext<Command> context, final int n) {

    return Behaviors.receive(Command.class)
        .onMessage(Increment.class, notUsed -> onIncrement(context, n))
        .onMessage(GetValue.class, command -> onGetValue(n, command))
        .build();
  }

  private static Behavior<Command> onIncrement(ActorContext<Command> context, int n) {
    int newValue = n + 1;
    context.getLog().debug("Incremented counter to [{}]", newValue);
    return counter(context, newValue);
  }

  private static Behavior<Command> onGetValue(int n, GetValue command) {
    command.replyTo.tell(new Value(n));
    return Behaviors.same();
  }
}
```

### Example 3: Functional versus object-oriented style

```scala
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.AbstractBehavior
import org.slf4j.Logger

object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  def apply(): Behavior[Command] = {
    Behaviors.setup(context => new Counter(context))
  }
}

class Counter(context: ActorContext[Counter.Command]) extends AbstractBehavior[Counter.Command](context) {
  import Counter._

  private var n = 0

  override def onMessage(msg: Command): Behavior[Counter.Command] = {
    msg match {
      case Increment =>
        n += 1
        context.log.debug("Incremented counter to [{}]", n)
        this
      case GetValue(replyTo) =>
        replyTo ! Value(n)
        this
    }
  }
}
```

### Example 4: Functional versus object-oriented style

```java
import akka.actor.typed.Behavior;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.Receive;

public class Counter extends AbstractBehavior<Counter.Command> {

  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(Counter::new);
  }

  private int n;

  private Counter(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, notUsed -> onIncrement())
        .onMessage(GetValue.class, this::onGetValue)
        .build();
  }

  private Behavior<Command> onIncrement() {
    n++;
    getContext().getLog().debug("Incremented counter to [{}]", n);
    return this;
  }

  private Behavior<Command> onGetValue(GetValue command) {
    command.replyTo.tell(new Value(n));
    return this;
  }
}
```

### Example 5: Passing around too many parameters

```scala
// this is an anti-example, better solutions exists
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class IncrementRepeatedly(interval: FiniteDuration) extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  def apply(name: String): Behavior[Command] =
    Behaviors.withTimers { timers =>
      counter(name, timers, 0)
    }

  private def counter(name: String, timers: TimerScheduler[Command], n: Int): Behavior[Command] =
    Behaviors.receive { (context, message) =>
      message match {
        case IncrementRepeatedly(interval) =>
          context.log.debug(
            "[{}] Starting repeated increments with interval [{}], current count is [{}]",
            name,
            interval.toString,
            n.toString)
          timers.startTimerWithFixedDelay(Increment, interval)
          Behaviors.same
        case Increment =>
          val newValue = n + 1
          context.log.debug2("[{}] Incremented counter to [{}]", name, newValue)
          counter(name, timers, newValue)
        case GetValue(replyTo) =>
          replyTo ! Value(n)
          Behaviors.same
      }
    }
}
```

### Example 6: Passing around too many parameters

```java
// this is an anti-example, better solutions exists
public class Counter {
  public interface Command {}

  public static class IncrementRepeatedly implements Command {
    public final Duration interval;

    public IncrementRepeatedly(Duration interval) {
      this.interval = interval;
    }
  }

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }

  public static Behavior<Command> create(String name) {
    return Behaviors.setup(
        context -> Behaviors.withTimers(timers -> counter(name, context, timers, 0)));
  }

  private static Behavior<Command> counter(
      final String name,
      final ActorContext<Command> context,
      final TimerScheduler<Command> timers,
      final int n) {

    return Behaviors.receive(Command.class)
        .onMessage(
            IncrementRepeatedly.class,
            command -> onIncrementRepeatedly(name, context, timers, n, command))
        .onMessage(Increment.class, notUsed -> onIncrement(name, context, timers, n))
        .onMessage(GetValue.class, command -> onGetValue(n, command))
        .build();
  }

  private static Behavior<Command> onIncrementRepeatedly(
      String name,
      ActorContext<Command> context,
      TimerScheduler<Command> timers,
      int n,
      IncrementRepeatedly command) {
    context
        .getLog()
        .debug(
            "[{}] Starting repeated increments with interval [{}], current count is [{}]",
            name,
            command.interval,
            n);
    timers.startTimerWithFixedDelay(Increment.INSTANCE, command.interval);
    return Behaviors.same();
  }

  private static Behavior<Command> onIncrement(
      String name, ActorContext<Command> context, TimerScheduler<Command> timers, int n) {
    int newValue = n + 1;
    context.getLog().debug("[{}] Incremented counter to [{}]", name, newValue);
    return counter(name, context, timers, newValue);
  }

  private static Behavior<Command> onGetValue(int n, GetValue command) {
    command.replyTo.tell(new Value(n));
    return Behaviors.same();
  }
}
```

### Example 7: Passing around too many parameters

```scala
// this is better than previous example, but even better solution exists
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class IncrementRepeatedly(interval: FiniteDuration) extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  private case class Setup(name: String, context: ActorContext[Command], timers: TimerScheduler[Command])

  def apply(name: String): Behavior[Command] =
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        counter(Setup(name, context, timers), 0)
      }
    }

  private def counter(setup: Setup, n: Int): Behavior[Command] =
    Behaviors.receiveMessage {
      case IncrementRepeatedly(interval) =>
        setup.context.log.debugN(
          "[{}] Starting repeated increments with interval [{}], current count is [{}]",
          setup.name,
          interval,
          n)
        setup.timers.startTimerWithFixedDelay(Increment, interval)
        Behaviors.same
      case Increment =>
        val newValue = n + 1
        setup.context.log.debug2("[{}] Incremented counter to [{}]", setup.name, newValue)
        counter(setup, newValue)
      case GetValue(replyTo) =>
        replyTo ! Value(n)
        Behaviors.same
    }
}
```

### Example 8: Passing around too many parameters

```java
// this is better than previous example, but even better solution exists
public class Counter {
  // messages omitted for brevity, same messages as above example

  private static class Setup {
    final String name;
    final ActorContext<Command> context;
    final TimerScheduler<Command> timers;

    private Setup(String name, ActorContext<Command> context, TimerScheduler<Command> timers) {
      this.name = name;
      this.context = context;
      this.timers = timers;
    }
  }

  public static Behavior<Command> create(String name) {
    return Behaviors.setup(
        context ->
            Behaviors.withTimers(timers -> counter(new Setup(name, context, timers), 0)));
  }

  private static Behavior<Command> counter(final Setup setup, final int n) {

    return Behaviors.receive(Command.class)
        .onMessage(
            IncrementRepeatedly.class, command -> onIncrementRepeatedly(setup, n, command))
        .onMessage(Increment.class, notUsed -> onIncrement(setup, n))
        .onMessage(GetValue.class, command -> onGetValue(n, command))
        .build();
  }

  private static Behavior<Command> onIncrementRepeatedly(
      Setup setup, int n, IncrementRepeatedly command) {
    setup
        .context
        .getLog()
        .debug(
            "[{}] Starting repeated increments with interval [{}], current count is [{}]",
            setup.name,
            command.interval,
            n);
    setup.timers.startTimerWithFixedDelay(Increment.INSTANCE, command.interval);
    return Behaviors.same();
  }

  private static Behavior<Command> onIncrement(Setup setup, int n) {
    int newValue = n + 1;
    setup.context.getLog().debug("[{}] Incremented counter to [{}]", setup.name, newValue);
    return counter(setup, newValue);
  }

  private static Behavior<Command> onGetValue(int n, GetValue command) {
    command.replyTo.tell(new Value(n));
    return Behaviors.same();
  }
}
```

### Example 9: Passing around too many parameters

```scala
// this is better than previous examples
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class IncrementRepeatedly(interval: FiniteDuration) extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  def apply(name: String): Behavior[Command] =
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        new Counter(name, context, timers).counter(0)
      }
    }
}

class Counter private (
    name: String,
    context: ActorContext[Counter.Command],
    timers: TimerScheduler[Counter.Command]) {
  import Counter._

  private def counter(n: Int): Behavior[Command] =
    Behaviors.receiveMessage {
      case IncrementRepeatedly(interval) =>
        context.log.debugN(
          "[{}] Starting repeated increments with interval [{}], current count is [{}]",
          name,
          interval,
          n)
        timers.startTimerWithFixedDelay(Increment, interval)
        Behaviors.same
      case Increment =>
        val newValue = n + 1
        context.log.debug2("[{}] Incremented counter to [{}]", name, newValue)
        counter(newValue)
      case GetValue(replyTo) =>
        replyTo ! Value(n)
        Behaviors.same
    }
}
```

### Example 10: Passing around too many parameters

```java
// this is better than previous examples
public class Counter {
  // messages omitted for brevity, same messages as above example

  public static Behavior<Command> create(String name) {
    return Behaviors.setup(
        context ->
            Behaviors.withTimers(timers -> new Counter(name, context, timers).counter(0)));
  }

  private final String name;
  private final ActorContext<Command> context;
  private final TimerScheduler<Command> timers;

  private Counter(String name, ActorContext<Command> context, TimerScheduler<Command> timers) {
    this.name = name;
    this.context = context;
    this.timers = timers;
  }

  private Behavior<Command> counter(final int n) {
    return Behaviors.receive(Command.class)
        .onMessage(IncrementRepeatedly.class, command -> onIncrementRepeatedly(n, command))
        .onMessage(Increment.class, notUsed -> onIncrement(n))
        .onMessage(GetValue.class, command -> onGetValue(n, command))
        .build();
  }

  private Behavior<Command> onIncrementRepeatedly(int n, IncrementRepeatedly command) {
    context
        .getLog()
        .debug(
            "[{}] Starting repeated increments with interval [{}], current count is [{}]",
            name,
            command.interval,
            n);
    timers.startTimerWithFixedDelay(Increment.INSTANCE, command.interval);
    return Behaviors.same();
  }

  private Behavior<Command> onIncrement(int n) {
    int newValue = n + 1;
    context.getLog().debug("[{}] Incremented counter to [{}]", name, newValue);
    return counter(newValue);
  }

  private Behavior<Command> onGetValue(int n, GetValue command) {
    command.replyTo.tell(new Value(n));
    return Behaviors.same();
  }
}
```

### Example 11: Passing around too many parameters

```scala
// this works, but previous example is better for structuring more complex behaviors
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class IncrementRepeatedly(interval: FiniteDuration) extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  def apply(name: String): Behavior[Command] =
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        def counter(n: Int): Behavior[Command] =
          Behaviors.receiveMessage {
            case IncrementRepeatedly(interval) =>
              context.log.debugN(
                "[{}] Starting repeated increments with interval [{}], current count is [{}]",
                name,
                interval,
                n)
              timers.startTimerWithFixedDelay(Increment, interval)
              Behaviors.same
            case Increment =>
              val newValue = n + 1
              context.log.debug2("[{}] Incremented counter to [{}]", name, newValue)
              counter(newValue)
            case GetValue(replyTo) =>
              replyTo ! Value(n)
              Behaviors.same
          }

        counter(0)
      }
    }
}
```

### Example 12: Behavior factory method

```scala
object CountDown {
  sealed trait Command
  case object Down extends Command

  // factory for the initial `Behavior`
  def apply(countDownFrom: Int, notifyWhenZero: ActorRef[Done]): Behavior[Command] =
    new CountDown(notifyWhenZero).counter(countDownFrom)
}

private class CountDown(notifyWhenZero: ActorRef[Done]) {
  import CountDown._

  private def counter(remaining: Int): Behavior[Command] = {
    Behaviors.receiveMessage {
      case Down =>
        if (remaining == 1) {
          notifyWhenZero.tell(Done)
          Behaviors.stopped
        } else
          counter(remaining - 1)
    }
  }

}
```

### Example 13: Behavior factory method

```java
public class CountDown extends AbstractBehavior<CountDown.Command> {

  public interface Command {}

  public enum Down implements Command {
    INSTANCE
  }

  // factory for the initial `Behavior`
  public static Behavior<Command> create(int countDownFrom, ActorRef<Done> notifyWhenZero) {
    return Behaviors.setup(context -> new CountDown(context, countDownFrom, notifyWhenZero));
  }

  private final ActorRef<Done> notifyWhenZero;
  private int remaining;

  private CountDown(
      ActorContext<Command> context, int countDownFrom, ActorRef<Done> notifyWhenZero) {
    super(context);
    this.remaining = countDownFrom;
    this.notifyWhenZero = notifyWhenZero;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder().onMessage(Down.class, notUsed -> onDown()).build();
  }

  private Behavior<Command> onDown() {
    remaining--;
    if (remaining == 0) {
      notifyWhenZero.tell(Done.getInstance());
      return Behaviors.stopped();
    } else {
      return this;
    }
  }
}
```

### Example 14: Behavior factory method

```scala
val countDown = context.spawn(CountDown(100, doneRef), "countDown")
```

### Example 15: Behavior factory method

```java
ActorRef<CountDown.Command> countDown =
    context.spawn(CountDown.create(100, doneRef), "countDown");
```

### Example 16: Where to define messages

```scala
countDown ! CountDown.Down
```

### Example 17: Where to define messages

```java
countDown.tell(CountDown.Down.INSTANCE);
```

### Example 18: Where to define messages

```scala
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)
}
```

### Example 19: Where to define messages

```java
public class Counter extends AbstractBehavior<Counter.Command> {

  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }
}
```

### Example 20: Where to define messages

```scala
object CounterProtocol {
  sealed trait Command

  final case class Increment(delta: Int, replyTo: ActorRef[OperationResult]) extends Command
  final case class Decrement(delta: Int, replyTo: ActorRef[OperationResult]) extends Command

  sealed trait OperationResult
  case object Confirmed extends OperationResult
  final case class Rejected(reason: String) extends OperationResult
}
```

### Example 21: Where to define messages

```java
interface CounterProtocol {
  interface Command {}

  public static class Increment implements Command {
    public final int delta;
    private final ActorRef<OperationResult> replyTo;

    public Increment(int delta, ActorRef<OperationResult> replyTo) {
      this.delta = delta;
      this.replyTo = replyTo;
    }
  }

  public static class Decrement implements Command {
    public final int delta;
    private final ActorRef<OperationResult> replyTo;

    public Decrement(int delta, ActorRef<OperationResult> replyTo) {
      this.delta = delta;
      this.replyTo = replyTo;
    }
  }

  interface OperationResult {}

  enum Confirmed implements OperationResult {
    INSTANCE
  }

  public static class Rejected implements OperationResult {
    public final String reason;

    public Rejected(String reason) {
      this.reason = reason;
    }
  }
}
```

### Example 22: Public versus private messages

```scala
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  // Tick is private so can't be sent from the outside
  private case object Tick extends Command

  def apply(name: String, tickInterval: FiniteDuration): Behavior[Command] =
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        timers.startTimerWithFixedDelay(Tick, tickInterval)
        new Counter(name, context).counter(0)
      }
    }
}

class Counter private (name: String, context: ActorContext[Counter.Command]) {
  import Counter._

  private def counter(n: Int): Behavior[Command] =
    Behaviors.receiveMessage {
      case Increment =>
        val newValue = n + 1
        context.log.debug2("[{}] Incremented counter to [{}]", name, newValue)
        counter(newValue)
      case Tick =>
        val newValue = n + 1
        context.log.debug2("[{}] Incremented counter by background tick to [{}]", name, newValue)
        counter(newValue)
      case GetValue(replyTo) =>
        replyTo ! Value(n)
        Behaviors.same
    }
}
```

### Example 23: Public versus private messages

```java
public class Counter extends AbstractBehavior<Counter.Command> {

  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }

  // Tick is private so can't be sent from the outside
  private enum Tick implements Command {
    INSTANCE
  }

  public static Behavior<Command> create(String name, Duration tickInterval) {
    return Behaviors.setup(
        context ->
            Behaviors.withTimers(
                timers -> {
                  timers.startTimerWithFixedDelay(Tick.INSTANCE, tickInterval);
                  return new Counter(name, context);
                }));
  }

  private final String name;
  private int count;

  private Counter(String name, ActorContext<Command> context) {
    super(context);
    this.name = name;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, notUsed -> onIncrement())
        .onMessage(Tick.class, notUsed -> onTick())
        .onMessage(GetValue.class, this::onGetValue)
        .build();
  }


  private Behavior<Command> onIncrement() {
    count++;
    getContext().getLog().debug("[{}] Incremented counter to [{}]", name, count);
    return this;
  }

  private Behavior<Command> onTick() {
    count++;
    getContext()
        .getLog()
        .debug("[{}] Incremented counter by background tick to [{}]", name, count);
    return this;
  }

  private Behavior<Command> onGetValue(GetValue command) {
    command.replyTo.tell(new Value(count));
    return this;
  }

}
```

### Example 24: Public versus private messages

```scala
// above example is preferred, but this is possible and not wrong
object Counter {
  // The type of all public and private messages the Counter actor handles
  sealed trait Message

  /** Counter's public message protocol type. */
  sealed trait Command extends Message
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Value]) extends Command
  final case class Value(n: Int)

  // The type of the Counter actor's internal messages.
  sealed trait PrivateCommand extends Message
  // Tick is a private command so can't be sent to an ActorRef[Command]
  case object Tick extends PrivateCommand

  def apply(name: String, tickInterval: FiniteDuration): Behavior[Command] = {
    Behaviors
      .setup[Counter.Message] { context =>
        Behaviors.withTimers { timers =>
          timers.startTimerWithFixedDelay(Tick, tickInterval)
          new Counter(name, context).counter(0)
        }
      }
      .narrow // note narrow here
  }
}

class Counter private (name: String, context: ActorContext[Counter.Message]) {
  import Counter._

  private def counter(n: Int): Behavior[Message] =
    Behaviors.receiveMessage {
      case Increment =>
        val newValue = n + 1
        context.log.debug2("[{}] Incremented counter to [{}]", name, newValue)
        counter(newValue)
      case Tick =>
        val newValue = n + 1
        context.log.debug2("[{}] Incremented counter by background tick to [{}]", name, newValue)
        counter(newValue)
      case GetValue(replyTo) =>
        replyTo ! Value(n)
        Behaviors.same
    }
}
```

### Example 25: Public versus private messages

```java
// above example is preferred, but this is possible and not wrong
public class Counter extends AbstractBehavior<Counter.Message> {

  // The type of all public and private messages the Counter actor handles
  public interface Message {}

  /** Counter's public message protocol type. */
  public interface Command extends Message {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    public final ActorRef<Value> replyTo;

    public GetValue(ActorRef<Value> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Value {
    public final int value;

    public Value(int value) {
      this.value = value;
    }
  }

  // The type of the Counter actor's internal messages.
  interface PrivateCommand extends Message {}

  // Tick is a private command so can't be sent to an ActorRef<Command>
  enum Tick implements PrivateCommand {
    INSTANCE
  }

  public static Behavior<Command> create(String name, Duration tickInterval) {
    return Behaviors.setup(
            (ActorContext<Message> context) ->
                Behaviors.withTimers(
                    timers -> {
                      timers.startTimerWithFixedDelay(Tick.INSTANCE, tickInterval);
                      return new Counter(name, context);
                    }))
        .narrow(); // note narrow here
  }

  private final String name;
  private int count;

  private Counter(String name, ActorContext<Message> context) {
    super(context);
    this.name = name;
  }

  @Override
  public Receive<Message> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, notUsed -> onIncrement())
        .onMessage(Tick.class, notUsed -> onTick())
        .onMessage(GetValue.class, this::onGetValue)
        .build();
  }

  private Behavior<Message> onIncrement() {
    count++;
    getContext().getLog().debug("[{}] Incremented counter to [{}]", name, count);
    return this;
  }

  private Behavior<Message> onTick() {
    count++;
    getContext()
        .getLog()
        .debug("[{}] Incremented counter by background tick to [{}]", name, count);
    return this;
  }

  private Behavior<Message> onGetValue(GetValue command) {
    command.replyTo.tell(new Value(count));
    return this;
  }
}
```

### Example 26: Singleton messages

```java
public enum Increment implements Command {
  INSTANCE
}
```

### Example 27: Singleton messages

```java
.onMessage(Increment.class, notUsed -> onIncrement())
```

### Example 28: Lambdas versus method references

```java
@Override
public Receive<Command> createReceive() {
  return newReceiveBuilder()
      .onMessage(Increment.class, notUsed -> onIncrement())
      .build();
}

private Behavior<Command> onIncrement() {
  count++;
  getContext().getLog().debug("[{}] Incremented counter to [{}]", name, count);
  return this;
}
```

### Example 29: Lambdas versus method references

```java
@Override
public Receive<Command> createReceive() {
  return newReceiveBuilder()
      .onMessage(GetValue.class, this::onGetValue)
      .build();
}

private Behavior<Command> onGetValue(GetValue command) {
  command.replyTo.tell(new Value(count));
  return this;
}
```

### Example 30: Lambdas versus method references

```java
// this is an anti-pattern, don't use lambdas with a large block of code
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(
            Increment.class,
            notUsed -> {
              count++;
              getContext().getLog().debug("[{}] Incremented counter to [{}]", name, count);
              return this;
            })
        .onMessage(
            Tick.class,
            notUsed -> {
              count++;
              getContext()
                  .getLog()
                  .debug("[{}] Incremented counter by background tick to [{}]", name, count);
              return this;
            })
        .onMessage(
            GetValue.class,
            command -> {
              command.replyTo.tell(new Value(count));
              return this;
            })
        .build();
  }
```

### Example 31: Partial versus total Function

```scala
sealed trait Command
case object Down extends Command
final case class GetValue(replyTo: ActorRef[Value]) extends Command
final case class Value(n: Int)
```

### Example 32: Partial versus total Function

```text
[warn] ... Counter.scala:45:34: match may not be exhaustive.
[warn] It would fail on the following input: GetValue(_)
[warn]         Behaviors.receiveMessage {
[warn]                                  ^
```

### Example 33: Partial versus total Function

```scala
val zero: Behavior[Command] = {
  Behaviors.receiveMessage {
    case GetValue(replyTo) =>
      replyTo ! Value(0)
      Behaviors.same
    case Down =>
      Behaviors.unhandled
  }
}
```

### Example 34: Partial versus total Function

```scala
val zero: Behavior[Command] = {
  Behaviors.receiveMessagePartial {
    case GetValue(replyTo) =>
      replyTo ! Value(0)
      Behaviors.same
  }
}
```

### Example 35: How to compose Partial Functions

```scala
sealed trait Command
case object Down extends Command
final case class GetValue(replyTo: ActorRef[Value]) extends Command
final case class Value(n: Int)
```

### Example 36: How to compose Partial Functions

```scala
def getHandler(value: Int): PartialFunction[Command, Behavior[Command]] = {
  case GetValue(replyTo) =>
    replyTo ! Value(value)
    Behaviors.same
}
def setHandlerNotZero(value: Int): PartialFunction[Command, Behavior[Command]] = {
  case Down =>
    if (value == 1)
      zero
    else
      nonZero(value - 1)
}
def setHandlerZero(log: Logger): PartialFunction[Command, Behavior[Command]] = {
  case Down =>
    log.error("Counter is already at zero!")
    Behaviors.same
}
```

### Example 37: How to compose Partial Functions

```scala
val zero: Behavior[Command] = Behaviors.setup { context =>
  Behaviors.receiveMessagePartial(getHandler(0).orElse(setHandlerZero(context.log)))
}

def nonZero(capacity: Int): Behavior[Command] =
  Behaviors.receiveMessagePartial(getHandler(capacity).orElse(setHandlerNotZero(capacity)))

// Default Initial Behavior for this actor
def apply(initialCapacity: Int): Behavior[Command] = nonZero(initialCapacity)
```

### Example 38: ask versus ?

```scala
import akka.actor.typed.scaladsl.AskPattern._
import akka.util.Timeout

implicit val timeout: Timeout = Timeout(3.seconds)
val counter: ActorRef[Command] = ???

val result: Future[OperationResult] = counter.ask(replyTo => Increment(delta = 2, replyTo))
```

### Example 39: ask versus ?

```scala
val result2: Future[OperationResult] = counter.ask(Increment(delta = 2, _))
```

### Example 40: ask versus ?

```scala
// doesn't compile
val result3: Future[OperationResult] = counter ? Increment(delta = 2, _)
```

### Example 41: ask versus ?

```scala
val result3: Future[OperationResult] = counter ? (Increment(delta = 2, _))
```

### Example 42: Nesting setup

```scala
def apply(): Behavior[Command] =
  Behaviors.setup[Command](context =>
    Behaviors.withStash(100)(stash =>
      Behaviors.withTimers { timers =>
        context.log.debug("Starting up")

        // behavior using context, stash and timers ...
      }))
```

### Example 43: Nesting setup

```java
public static Behavior<Command> apply() {
  return Behaviors.setup(
      context ->
          Behaviors.withStash(
              100,
              stash ->
                  Behaviors.withTimers(
                      timers -> {
                        context.getLog().debug("Starting up");

                        // behavior using context, stash and timers ...
                      })));
}
```

### Example 44: Nesting setup

```scala
def apply(): Behavior[Command] =
  Behaviors.setup { context =>
    // only run on initial actor start, not on crash-restart
    context.log.info("Starting")

    Behaviors
      .supervise(Behaviors.withStash[Command](100) { stash =>
        // every time the actor crashes and restarts a new stash is created (previous stash is lost)
        context.log.debug("Starting up with stash")
        // Behaviors.receiveMessage { ... }
      })
      .onFailure[RuntimeException](SupervisorStrategy.restart)
  }
```

### Example 45: Nesting setup

```java
public static Behavior<Command> create() {
  return Behaviors.setup(
      context -> {
        // only run on initial actor start, not on crash-restart
        context.getLog().info("Starting");

        return Behaviors.<Command>supervise(
                Behaviors.withStash(
                    100,
                    stash -> {
                      // every time the actor crashes and restarts a new stash is created
                      // (previous stash is lost)
                      context.getLog().debug("Starting up with stash");
                      // Behaviors.receiveMessage { ... }
                    }))
            .onFailure(RuntimeException.class, SupervisorStrategy.restart());
      });
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.6/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/from-classic.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/fsm.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/interaction-patterns.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/style-guide.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/typed/style-guide.html](https://doc.akka.io/libraries/akka-core/2.6/typed/style-guide.html)*