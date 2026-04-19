---
description: Akka, Actors, Futures and the Java Memory Model.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:29:54Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/general/jmm.html
title: Akka and the Java Memory Model • Akka core
---

# Akka and the Java Memory Model • Akka core

> **Summary:** Akka, Actors, Futures and the Java Memory Model.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka and the Java Memory Model

A major benefit of using the Lightbend Platform, including Scala and Akka, is that it simplifies the process of writing concurrent software. This article discusses how the Lightbend Platform, and Akka in particular, approaches shared memory in concurrent applications.

## The Java Memory Model

Prior to Java 5, the Java Memory Model (JMM) was ill defined. It was possible to get all kinds of strange results when shared memory was accessed by multiple threads, such as:

- a thread not seeing values written by other threads: a visibility problem
- a thread observing ‘impossible’ behavior of other threads, caused by instructions not being executed in the order expected: an instruction reordering problem.

With the implementation of JSR 133 in Java 5, a lot of these issues have been resolved. The JMM is a set of rules based on the “happens\-before” relation, which constrain when one memory access must happen before another, and conversely, when they are allowed to happen out of order. Two examples of these rules are:

- **The monitor lock rule:** a release of a lock happens before every subsequent acquire of the same lock.
- **The volatile variable rule:** a write of a volatile variable happens before every subsequent read of the same volatile variable

Although the JMM can seem complicated, the specification tries to find a balance between ease of use and the ability to write performant and scalable concurrent data structures.

## Actors and the Java Memory Model

With the Actors implementation in Akka, there are two ways multiple threads can execute actions on shared memory:

- if a message is sent to an actor (e.g. by another actor). In most cases messages are immutable, but if that message is not a properly constructed immutable object, without a “happens before” rule, it would be possible for the receiver to see partially initialized data structures and possibly even values out of thin air (longs/doubles).
- if an actor makes changes to its internal state while processing a message, and accesses that state while processing another message moments later. It is important to realize that with the actor model you don’t get any guarantee that the same thread will be executing the same actor for different messages.

To prevent visibility and reordering problems on actors, Akka guarantees the following two “happens before” rules:

- **The actor send rule:** the send of the message to an actor happens before the receive of that message by the same actor.
- **The actor subsequent processing rule:** processing of one message happens before processing of the next message by the same actor.

Note
In layman’s terms this means that changes to internal fields of the actor are visible when the next message is processed by that actor. So fields in your actor need not be volatile or equivalent.

Both rules only apply for the same actor instance and are not valid if different actors are used.

## Futures and the Java Memory Model

The completion of a Future “happens before” the invocation of any callbacks registered to it are executed.

We recommend not to close over non\-final fields (final in Java and val in Scala), and if you *do* choose to close over non\-final fields, they must be marked *volatile* in order for the current value of the field to be visible to the callback.

If you close over a reference, you must also ensure that the instance that is referred to is thread safe. We highly recommend staying away from objects that use locking, since it can introduce performance problems and in the worst case, deadlocks. Such are the perils of synchronized.

## Actors and shared mutable state

Since Akka runs on the JVM there are still some rules to be followed.

Most importantly, you must not close over internal Actor state and exposing it to other threads:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/typed/SharedMutableStateDocSpec.scala#L35-L95 "Go to snippet source")class MyActor(context: ActorContext[MyActor.Command]) extends AbstractBehavior[MyActor.Command](context) {
  import MyActor._

  var state = ""
  val mySet = mutable.Set[String]()

  def onMessage(cmd: MyActor.Command) = cmd match {
    case Message(text, otherActor) =>
      // Very bad: shared mutable object allows
      // the other actor to mutate your own state,
      // or worse, you might get weird race conditions
      otherActor ! mySet

      implicit val ec = context.executionContext

      // Example of incorrect approach
      // Very bad: shared mutable state will cause your
      // application to break in weird ways
      Future { state = "This will race" }

      // Example of incorrect approach
      // Very bad: shared mutable state will cause your
      // application to break in weird ways
      expensiveCalculation().foreach { result =>
        state = s"new state: $result"
      }

      // Example of correct approach
      // Turn the future result into a message that is sent to
      // self when future completes
      val futureResult = expensiveCalculation()
      context.pipeToSelf(futureResult) {
        case Success(result) => UpdateState(result)
        case Failure(ex)     => throw ex
      }

      // Another example of incorrect approach
      // mutating actor state from ask future callback
      import akka.actor.typed.scaladsl.AskPattern._
      implicit val timeout: Timeout = 5.seconds // needed for `ask` below
      implicit val scheduler = context.system.scheduler
      val future: Future[String] = otherActor.ask(Query(_))
      future.foreach { result =>
        state = result
      }

      // use context.ask instead, turns the completion
      // into a message sent to self
      context.ask[Query, String](otherActor, Query(_)) {
        case Success(result) => UpdateState(result)
        case Failure(ex)     => throw ex
      }
      this

    case UpdateState(newState) =>
      // safe as long as `newState` is immutable, if it is mutable we'd need to
      // make a defensive copy
      state = newState
      this
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/typed/SharedMutableStateDocTest.java#L34-L138 "Go to snippet source")class MyActor extends AbstractBehavior<MyActor.Command> {

  interface Command {}

  class Message implements Command {
    public final ActorRef<Object> otherActor;

    public Message(ActorRef<Object> replyTo) {
      this.otherActor = replyTo;
    }
  }

  class UpdateState implements Command {
    public final String newState;

    public UpdateState(String newState) {
      this.newState = newState;
    }
  }

  private String state = "";
  private Set<String> mySet = new HashSet<>();

  public MyActor(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Message.class, this::onMessage)
        .onMessage(UpdateState.class, this::onUpdateState)
        .build();
  }

  private Behavior<Command> onMessage(Message message) {
    // Very bad: shared mutable object allows
    // the other actor to mutate your own state,
    // or worse, you might get weird race conditions
    message.otherActor.tell(mySet);

    // Example of incorrect approach
    // Very bad: shared mutable state will cause your
    // application to break in weird ways
    CompletableFuture.runAsync(
        () -> {
          state = "This will race";
        });

    // Example of incorrect approach
    // Very bad: shared mutable state will cause your
    // application to break in weird ways
    expensiveCalculation()
        .whenComplete(
            (result, failure) -> {
              if (result != null) state = "new state: " + result;
            });

    // Example of correct approach
    // Turn the future result into a message that is sent to
    // self when future completes
    CompletableFuture<String> futureResult = expensiveCalculation();
    getContext()
        .pipeToSelf(
            futureResult,
            (result, failure) -> {
              if (result != null) return new UpdateState(result);
              else throw new RuntimeException(failure);
            });

    // Another example of incorrect approach
    // mutating actor state from ask future callback
    CompletionStage<String> response =
        AskPattern.ask(
            message.otherActor,
            Query::new,
            Duration.ofSeconds(3),
            getContext().getSystem().scheduler());
    response.whenComplete(
        (result, failure) -> {
          if (result != null) state = "new state: " + result;
        });

    // use context.ask instead, turns the completion
    // into a message sent to self
    getContext()
        .ask(
            String.class,
            message.otherActor,
            Duration.ofSeconds(3),
            Query::new,
            (result, failure) -> {
              if (result != null) return new UpdateState(result);
              else throw new RuntimeException(failure);
            });
    return this;
  }

  private Behavior<Command> onUpdateState(UpdateState command) {
    // safe as long as `newState` is immutable, if it is mutable we'd need to
    // make a defensive copy
    this.state = command.newState;
    return this;
  }
}
```

- Messages **should** be immutable, this is to avoid the shared mutable state trap.

## Code Examples

### Example 1: Actors and shared mutable state

```scala
class MyActor(context: ActorContext[MyActor.Command]) extends AbstractBehavior[MyActor.Command](context) {
  import MyActor._

  var state = ""
  val mySet = mutable.Set[String]()

  def onMessage(cmd: MyActor.Command) = cmd match {
    case Message(text, otherActor) =>
      // Very bad: shared mutable object allows
      // the other actor to mutate your own state,
      // or worse, you might get weird race conditions
      otherActor ! mySet

      implicit val ec = context.executionContext

      // Example of incorrect approach
      // Very bad: shared mutable state will cause your
      // application to break in weird ways
      Future { state = "This will race" }

      // Example of incorrect approach
      // Very bad: shared mutable state will cause your
      // application to break in weird ways
      expensiveCalculation().foreach { result =>
        state = s"new state: $result"
      }

      // Example of correct approach
      // Turn the future result into a message that is sent to
      // self when future completes
      val futureResult = expensiveCalculation()
      context.pipeToSelf(futureResult) {
        case Success(result) => UpdateState(result)
        case Failure(ex)     => throw ex
      }

      // Another example of incorrect approach
      // mutating actor state from ask future callback
      import akka.actor.typed.scaladsl.AskPattern._
      implicit val timeout: Timeout = 5.seconds // needed for `ask` below
      implicit val scheduler = context.system.scheduler
      val future: Future[String] = otherActor.ask(Query(_))
      future.foreach { result =>
        state = result
      }

      // use context.ask instead, turns the completion
      // into a message sent to self
      context.ask[Query, String](otherActor, Query(_)) {
        case Success(result) => UpdateState(result)
        case Failure(ex)     => throw ex
      }
      this

    case UpdateState(newState) =>
      // safe as long as `newState` is immutable, if it is mutable we'd need to
      // make a defensive copy
      state = newState
      this
  }
}
```

### Example 2: Actors and shared mutable state

```java
class MyActor extends AbstractBehavior<MyActor.Command> {

  interface Command {}

  class Message implements Command {
    public final ActorRef<Object> otherActor;

    public Message(ActorRef<Object> replyTo) {
      this.otherActor = replyTo;
    }
  }

  class UpdateState implements Command {
    public final String newState;

    public UpdateState(String newState) {
      this.newState = newState;
    }
  }

  private String state = "";
  private Set<String> mySet = new HashSet<>();

  public MyActor(ActorContext<Command> context) {
    super(context);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Message.class, this::onMessage)
        .onMessage(UpdateState.class, this::onUpdateState)
        .build();
  }

  private Behavior<Command> onMessage(Message message) {
    // Very bad: shared mutable object allows
    // the other actor to mutate your own state,
    // or worse, you might get weird race conditions
    message.otherActor.tell(mySet);

    // Example of incorrect approach
    // Very bad: shared mutable state will cause your
    // application to break in weird ways
    CompletableFuture.runAsync(
        () -> {
          state = "This will race";
        });

    // Example of incorrect approach
    // Very bad: shared mutable state will cause your
    // application to break in weird ways
    expensiveCalculation()
        .whenComplete(
            (result, failure) -> {
              if (result != null) state = "new state: " + result;
            });

    // Example of correct approach
    // Turn the future result into a message that is sent to
    // self when future completes
    CompletableFuture<String> futureResult = expensiveCalculation();
    getContext()
        .pipeToSelf(
            futureResult,
            (result, failure) -> {
              if (result != null) return new UpdateState(result);
              else throw new RuntimeException(failure);
            });

    // Another example of incorrect approach
    // mutating actor state from ask future callback
    CompletionStage<String> response =
        AskPattern.ask(
            message.otherActor,
            Query::new,
            Duration.ofSeconds(3),
            getContext().getSystem().scheduler());
    response.whenComplete(
        (result, failure) -> {
          if (result != null) state = "new state: " + result;
        });

    // use context.ask instead, turns the completion
    // into a message sent to self
    getContext()
        .ask(
            String.class,
            message.otherActor,
            Duration.ofSeconds(3),
            Query::new,
            (result, failure) -> {
              if (result != null) return new UpdateState(result);
              else throw new RuntimeException(failure);
            });
    return this;
  }

  private Behavior<Command> onUpdateState(UpdateState command) {
    // safe as long as `newState` is immutable, if it is mutable we'd need to
    // make a defensive copy
    this.state = command.newState;
    return this;
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/general/message-delivery-reliability.html
- https://doc.akka.io/libraries/akka-core/current/general/remoting.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/general/jmm.html](https://doc.akka.io/libraries/akka-core/current/general/jmm.html)*