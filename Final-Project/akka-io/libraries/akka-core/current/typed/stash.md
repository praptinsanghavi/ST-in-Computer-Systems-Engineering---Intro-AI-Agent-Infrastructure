---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:08Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/stash.html
title: Stash • Akka core
---

# Stash • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Stash

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Actors](../actors.html#stash).

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Actor Typed, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
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
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}"
}
```

## Introduction

Stashing enables an actor to temporarily buffer all or some messages that cannot or should not be handled using the actor’s current behavior.

A typical example when this is useful is if the actor has to load some initial state or initialize some resources before it can accept the first real message. Another example is when the actor is waiting for something to complete before processing the next message.

Let’s illustrate these two with an example. The `DataAccess` actor below is used like a single access point to a value stored in a database. When it’s started it loads current state from the database, and while waiting for that initial value all incoming messages are stashed.

When a new state is saved in the database it also stashes incoming messages to make the processing sequential, one after the other without multiple pending writes.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/StashDocSpec.scala#L13-L99 "Go to snippet source")import scala.concurrent.Future
import scala.util.Failure
import scala.util.Success

import akka.Done
import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.StashBuffer

trait DB {
  def save(id: String, value: String): Future[Done]
  def load(id: String): Future[String]
}

object DataAccess {
  sealed trait Command
  final case class Save(value: String, replyTo: ActorRef[Done]) extends Command
  final case class Get(replyTo: ActorRef[String]) extends Command
  private final case class InitialState(value: String) extends Command
  private case object SaveSuccess extends Command
  private final case class DBError(cause: Throwable) extends Command

  def apply(id: String, db: DB): Behavior[Command] = {
    Behaviors.withStash(100) { buffer =>
      Behaviors.setup[Command] { context =>
        new DataAccess(context, buffer, id, db).start()
      }
    }
  }
}

class DataAccess(
    context: ActorContext[DataAccess.Command],
    buffer: StashBuffer[DataAccess.Command],
    id: String,
    db: DB) {
  import DataAccess._

  private def start(): Behavior[Command] = {
    context.pipeToSelf(db.load(id)) {
      case Success(value) => InitialState(value)
      case Failure(cause) => DBError(cause)
    }

    Behaviors.receiveMessage {
      case InitialState(value) =>
        // now we are ready to handle stashed messages if any
        buffer.unstashAll(active(value))
      case DBError(cause) =>
        throw cause
      case other =>
        // stash all other messages for later processing
        buffer.stash(other)
        Behaviors.same
    }
  }

  private def active(state: String): Behavior[Command] = {
    Behaviors.receiveMessagePartial {
      case Get(replyTo) =>
        replyTo ! state
        Behaviors.same
      case Save(value, replyTo) =>
        context.pipeToSelf(db.save(id, value)) {
          case Success(_)     => SaveSuccess
          case Failure(cause) => DBError(cause)
        }
        saving(value, replyTo)
    }
  }

  private def saving(state: String, replyTo: ActorRef[Done]): Behavior[Command] = {
    Behaviors.receiveMessage {
      case SaveSuccess =>
        replyTo ! Done
        buffer.unstashAll(active(state))
      case DBError(cause) =>
        throw cause
      case other =>
        buffer.stash(other)
        Behaviors.same
    }
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/StashDocSample.java#L8-L15 "Go to snippet source")import akka.Done;
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.StashBuffer;
import java.util.concurrent.CompletionStage;

interface DB {
  CompletionStage<Done> save(String id, String value);

  CompletionStage<String> load(String id);
}

public class DataAccess {

  public interface Command {}

  public static class Save implements Command {
    public final String payload;
    public final ActorRef<Done> replyTo;

    public Save(String payload, ActorRef<Done> replyTo) {
      this.payload = payload;
      this.replyTo = replyTo;
    }
  }

  public static class Get implements Command {
    public final ActorRef<String> replyTo;

    public Get(ActorRef<String> replyTo) {
      this.replyTo = replyTo;
    }
  }

  private static class InitialState implements Command {
    public final String value;

    InitialState(String value) {
      this.value = value;
    }
  }

  private enum SaveSuccess implements Command {
    INSTANCE
  }

  private static class DBError implements Command {
    public final RuntimeException cause;

    DBError(RuntimeException cause) {
      this.cause = cause;
    }
  }

  private final ActorContext<Command> context;
  private final StashBuffer<Command> buffer;
  private final String id;
  private final DB db;

  private DataAccess(
      ActorContext<Command> context, StashBuffer<Command> buffer, String id, DB db) {
    this.context = context;
    this.buffer = buffer;
    this.id = id;
    this.db = db;
  }

  public static Behavior<Command> create(String id, DB db) {
    return Behaviors.withStash(
        100,
        stash ->
            Behaviors.setup(
                ctx -> {
                  ctx.pipeToSelf(
                      db.load(id),
                      (value, cause) -> {
                        if (cause == null) return new InitialState(value);
                        else return new DBError(asRuntimeException(cause));
                      });

                  return new DataAccess(ctx, stash, id, db).start();
                }));
  }

  private Behavior<Command> start() {
    return Behaviors.receive(Command.class)
        .onMessage(InitialState.class, this::onInitialState)
        .onMessage(DBError.class, this::onDBError)
        .onMessage(Command.class, this::stashOtherCommand)
        .build();
  }

  private Behavior<Command> onInitialState(InitialState message) {
    // now we are ready to handle stashed messages if any
    return buffer.unstashAll(active(message.value));
  }

  private Behavior<Command> onDBError(DBError message) {
    throw message.cause;
  }

  private Behavior<Command> stashOtherCommand(Command message) {
    // stash all other messages for later processing
    buffer.stash(message);
    return Behaviors.same();
  }

  private Behavior<Command> active(String state) {
    return Behaviors.receive(Command.class)
        .onMessage(Get.class, message -> onGet(state, message))
        .onMessage(Save.class, this::onSave)
        .build();
  }

  private Behavior<Command> onGet(String state, Get message) {
    message.replyTo.tell(state);
    return Behaviors.same();
  }

  private Behavior<Command> onSave(Save message) {
    context.pipeToSelf(
        db.save(id, message.payload),
        (value, cause) -> {
          if (cause == null) return SaveSuccess.INSTANCE;
          else return new DBError(asRuntimeException(cause));
        });
    return saving(message.payload, message.replyTo);
  }

  private Behavior<Command> saving(String state, ActorRef<Done> replyTo) {
    return Behaviors.receive(Command.class)
        .onMessage(SaveSuccess.class, message -> onSaveSuccess(state, replyTo))
        .onMessage(DBError.class, this::onDBError)
        .onMessage(Command.class, this::stashOtherCommand)
        .build();
  }

  private Behavior<Command> onSaveSuccess(String state, ActorRef<Done> replyTo) {
    replyTo.tell(Done.getInstance());
    return buffer.unstashAll(active(state));
  }

  private static RuntimeException asRuntimeException(Throwable t) {
    // can't throw Throwable in lambdas
    if (t instanceof RuntimeException) {
      return (RuntimeException) t;
    } else {
      return new RuntimeException(t);
    }
  }
}

```

One important thing to be aware of is that the [`StashBuffer`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/StashBuffer.html "akka.actor.typed.javadsl.StashBuffer")[`StashBuffer`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html "akka.actor.typed.scaladsl.StashBuffer") is a buffer and stashed messages will be kept in memory until they are unstashed (or the actor is stopped and garbage collected). It’s recommended to avoid stashing too many messages to avoid too much memory usage and even risking [`OutOfMemoryError`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/OutOfMemoryError.html "java.lang.OutOfMemoryError") if many actors are stashing many messages. Therefore the [`StashBuffer`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/StashBuffer.html "akka.actor.typed.javadsl.StashBuffer")[`StashBuffer`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html "akka.actor.typed.scaladsl.StashBuffer") is bounded and the `capacity` of how many messages it can hold must be specified when it’s created.

If you try to stash more messages than the `capacity` a [`StashOverflowException`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/StashOverflowException.html "akka.actor.typed.javadsl.StashOverflowException")[`StashOverflowException`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashOverflowException.html "akka.actor.typed.scaladsl.StashOverflowException") will be thrown. You can use [`StashBuffer.isFull`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/StashBuffer.html#isFull() "akka.actor.typed.javadsl.StashBuffer")[`StashBuffer.isFull`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html#isFull:Boolean "akka.actor.typed.scaladsl.StashBuffer") before stashing a message to avoid that and take other actions, such as dropping the message.

When unstashing the buffered messages by calling [`unstashAll`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/StashBuffer.html#unstashAll(akka.actor.typed.Behavior) "akka.actor.typed.javadsl.StashBuffer")[`unstashAll`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html#unstashAll(behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.StashBuffer") the messages will be processed sequentially in the order they were added and all are processed unless an exception is thrown. The actor is unresponsive to other new messages until [`unstashAll`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/StashBuffer.html#unstashAll(akka.actor.typed.Behavior) "akka.actor.typed.javadsl.StashBuffer")[`unstashAll`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html#unstashAll(behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.StashBuffer") is completed. That is another reason for keeping the number of stashed messages low. Actors that hog the message processing thread for too long can result in starvation of other actors.

That can be mitigated by using the [`StashBuffer.unstash`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/StashBuffer.html#unstash(akka.actor.typed.Behavior,int,java.util.function.Function) "akka.actor.typed.javadsl.StashBuffer")[`StashBuffer.unstash`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html#unstash(behavior:akka.actor.typed.Behavior[T],numberOfMessages:Int,wrap:T=%3ET):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.StashBuffer") with `numberOfMessages` parameter and then send a message to `context.self``context.getSelf` before continuing unstashing more. That means that other new messages may arrive in\-between and those must be stashed to keep the original order of messages. It becomes more complicated, so better keep the number of stashed messages low.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
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
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}"
}
```

### Example 4: Introduction

```scala
import scala.concurrent.Future
import scala.util.Failure
import scala.util.Success

import akka.Done
import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.StashBuffer

trait DB {
  def save(id: String, value: String): Future[Done]
  def load(id: String): Future[String]
}

object DataAccess {
  sealed trait Command
  final case class Save(value: String, replyTo: ActorRef[Done]) extends Command
  final case class Get(replyTo: ActorRef[String]) extends Command
  private final case class InitialState(value: String) extends Command
  private case object SaveSuccess extends Command
  private final case class DBError(cause: Throwable) extends Command

  def apply(id: String, db: DB): Behavior[Command] = {
    Behaviors.withStash(100) { buffer =>
      Behaviors.setup[Command] { context =>
        new DataAccess(context, buffer, id, db).start()
      }
    }
  }
}

class DataAccess(
    context: ActorContext[DataAccess.Command],
    buffer: StashBuffer[DataAccess.Command],
    id: String,
    db: DB) {
  import DataAccess._

  private def start(): Behavior[Command] = {
    context.pipeToSelf(db.load(id)) {
      case Success(value) => InitialState(value)
      case Failure(cause) => DBError(cause)
    }

    Behaviors.receiveMessage {
      case InitialState(value) =>
        // now we are ready to handle stashed messages if any
        buffer.unstashAll(active(value))
      case DBError(cause) =>
        throw cause
      case other =>
        // stash all other messages for later processing
        buffer.stash(other)
        Behaviors.same
    }
  }

  private def active(state: String): Behavior[Command] = {
    Behaviors.receiveMessagePartial {
      case Get(replyTo) =>
        replyTo ! state
        Behaviors.same
      case Save(value, replyTo) =>
        context.pipeToSelf(db.save(id, value)) {
          case Success(_)     => SaveSuccess
          case Failure(cause) => DBError(cause)
        }
        saving(value, replyTo)
    }
  }

  private def saving(state: String, replyTo: ActorRef[Done]): Behavior[Command] = {
    Behaviors.receiveMessage {
      case SaveSuccess =>
        replyTo ! Done
        buffer.unstashAll(active(state))
      case DBError(cause) =>
        throw cause
      case other =>
        buffer.stash(other)
        Behaviors.same
    }
  }

}
```

### Example 5: Introduction

```java
import akka.Done;
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.StashBuffer;
import java.util.concurrent.CompletionStage;


interface DB {
  CompletionStage<Done> save(String id, String value);

  CompletionStage<String> load(String id);
}

public class DataAccess {

  public interface Command {}

  public static class Save implements Command {
    public final String payload;
    public final ActorRef<Done> replyTo;

    public Save(String payload, ActorRef<Done> replyTo) {
      this.payload = payload;
      this.replyTo = replyTo;
    }
  }

  public static class Get implements Command {
    public final ActorRef<String> replyTo;

    public Get(ActorRef<String> replyTo) {
      this.replyTo = replyTo;
    }
  }

  private static class InitialState implements Command {
    public final String value;

    InitialState(String value) {
      this.value = value;
    }
  }

  private enum SaveSuccess implements Command {
    INSTANCE
  }

  private static class DBError implements Command {
    public final RuntimeException cause;

    DBError(RuntimeException cause) {
      this.cause = cause;
    }
  }

  private final ActorContext<Command> context;
  private final StashBuffer<Command> buffer;
  private final String id;
  private final DB db;

  private DataAccess(
      ActorContext<Command> context, StashBuffer<Command> buffer, String id, DB db) {
    this.context = context;
    this.buffer = buffer;
    this.id = id;
    this.db = db;
  }

  public static Behavior<Command> create(String id, DB db) {
    return Behaviors.withStash(
        100,
        stash ->
            Behaviors.setup(
                ctx -> {
                  ctx.pipeToSelf(
                      db.load(id),
                      (value, cause) -> {
                        if (cause == null) return new InitialState(value);
                        else return new DBError(asRuntimeException(cause));
                      });

                  return new DataAccess(ctx, stash, id, db).start();
                }));
  }

  private Behavior<Command> start() {
    return Behaviors.receive(Command.class)
        .onMessage(InitialState.class, this::onInitialState)
        .onMessage(DBError.class, this::onDBError)
        .onMessage(Command.class, this::stashOtherCommand)
        .build();
  }

  private Behavior<Command> onInitialState(InitialState message) {
    // now we are ready to handle stashed messages if any
    return buffer.unstashAll(active(message.value));
  }

  private Behavior<Command> onDBError(DBError message) {
    throw message.cause;
  }

  private Behavior<Command> stashOtherCommand(Command message) {
    // stash all other messages for later processing
    buffer.stash(message);
    return Behaviors.same();
  }

  private Behavior<Command> active(String state) {
    return Behaviors.receive(Command.class)
        .onMessage(Get.class, message -> onGet(state, message))
        .onMessage(Save.class, this::onSave)
        .build();
  }

  private Behavior<Command> onGet(String state, Get message) {
    message.replyTo.tell(state);
    return Behaviors.same();
  }

  private Behavior<Command> onSave(Save message) {
    context.pipeToSelf(
        db.save(id, message.payload),
        (value, cause) -> {
          if (cause == null) return SaveSuccess.INSTANCE;
          else return new DBError(asRuntimeException(cause));
        });
    return saving(message.payload, message.replyTo);
  }

  private Behavior<Command> saving(String state, ActorRef<Done> replyTo) {
    return Behaviors.receive(Command.class)
        .onMessage(SaveSuccess.class, message -> onSaveSuccess(state, replyTo))
        .onMessage(DBError.class, this::onDBError)
        .onMessage(Command.class, this::stashOtherCommand)
        .build();
  }

  private Behavior<Command> onSaveSuccess(String state, ActorRef<Done> replyTo) {
    replyTo.tell(Done.getInstance());
    return buffer.unstashAll(active(state));
  }

  private static RuntimeException asRuntimeException(Throwable t) {
    // can't throw Throwable in lambdas
    if (t instanceof RuntimeException) {
      return (RuntimeException) t;
    } else {
      return new RuntimeException(t);
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/StashBuffer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/StashOverflowException.html
- https://doc.akka.io/libraries/akka-core/current/actors.html
- https://doc.akka.io/libraries/akka-core/current/typed/fsm.html
- https://doc.akka.io/libraries/akka-core/current/typed/routers.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/stash.html](https://doc.akka.io/libraries/akka-core/current/typed/stash.html)*