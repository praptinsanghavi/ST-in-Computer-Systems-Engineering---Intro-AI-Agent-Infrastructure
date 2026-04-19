---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/actor.html
title: Processing with Actor • Akka Projection
---

# Processing with Actor • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Processing with Actor

A good alternative for advanced state management is to implement the handler as an [actor](https://doc.akka.io/libraries/akka-core/current/typed/actors.html).

The following example is using the `CassandraProjection` but the handler and actor would be the same if used any other [offset storage](overview.html). 

An actor `Behavior` for the word count example that was introduced in the section about [Stateful handler](cassandra.html#stateful-handler):

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/WordCountDocExample.scala#L201-L272 "Go to snippet source")import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.SupervisorStrategy
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object WordCountProcessor {
  trait Command
  final case class Handle(envelope: WordEnvelope, replyTo: ActorRef[Try[Done]]) extends Command
  private final case class InitialState(state: Map[Word, Count]) extends Command
  private final case class SaveCompleted(word: Word, saveResult: Try[Done]) extends Command

  def apply(projectionId: ProjectionId, repository: WordCountRepository): Behavior[Command] =
    Behaviors
      .supervise[Command] {
        Behaviors.setup { context =>
          new WordCountProcessor(context, projectionId, repository).init()
        }
      }
      .onFailure(SupervisorStrategy.restartWithBackoff(1.second, 10.seconds, 0.1))
}

class WordCountProcessor(
    context: ActorContext[WordCountProcessor.Command],
    projectionId: ProjectionId,
    repository: WordCountRepository) {
  import WordCountProcessor._

  // loading initial state from db
  def init(): Behavior[Command] = {
    Behaviors.withStash(10) { buffer =>
      context.pipeToSelf(repository.loadAll(projectionId.id)) {
        case Success(value) => InitialState(value)
        case Failure(exc)   => throw exc
      }

      Behaviors.receiveMessage {
        case InitialState(state) =>
          context.log.debug("Initial state [{}]", state)
          buffer.unstashAll(idle(state))
        case other =>
          context.log.debug("Stashed [{}]", other)
          buffer.stash(other)
          Behaviors.same
      }
    }
  }

  // waiting for next envelope
  private def idle(state: Map[Word, Count]): Behavior[Command] =
    Behaviors.receiveMessagePartial {
      case Handle(envelope, replyTo) =>
        val word = envelope.word
        context.pipeToSelf(repository.save(projectionId.id, word, state.getOrElse(word, 0) + 1)) { saveResult =>
          SaveCompleted(word, saveResult)
        }
        saving(state, replyTo) // will reply from SaveCompleted
      case _: InitialState =>
        Behaviors.unhandled
    }

  // saving the new count for a word in db
  private def saving(state: Map[Word, Count], replyTo: ActorRef[Try[Done]]): Behavior[Command] =
    Behaviors.receiveMessagePartial {
      case SaveCompleted(word, saveResult) =>
        replyTo ! saveResult
        saveResult match {
          case Success(_)   => idle(state.updated(word, state.getOrElse(word, 0) + 1))
          case Failure(exc) => throw exc // restart, reload state from db
        }
    }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/WordCountDocExample.java#L19-L25 "Go to snippet source")import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public class WordCountProcessor {
  public interface Command {}

  public static class Handle implements Command {
    public final WordEnvelope envelope;
    public final ActorRef<Result> replyTo;

    public Handle(WordEnvelope envelope, ActorRef<Result> replyTo) {
      this.envelope = envelope;
      this.replyTo = replyTo;
    }
  }

  public static class Result {
    public final Optional<Throwable> error;

    public Result(Optional<Throwable> error) {
      this.error = error;
    }
  }

  private static class InitialState implements Command {
    final Map<String, Integer> state;

    private InitialState(Map<String, Integer> state) {
      this.state = state;
    }
  }

  private static class SaveCompleted implements Command {
    final String word;
    final Optional<Throwable> error;
    final ActorRef<Result> replyTo;

    private SaveCompleted(String word, Optional<Throwable> error, ActorRef<Result> replyTo) {
      this.word = word;
      this.error = error;
      this.replyTo = replyTo;
    }
  }

  public static Behavior<Command> create(
      ProjectionId projectionId, WordCountRepository repository) {
    return Behaviors.supervise(
            Behaviors.setup(
                (ActorContext<Command> context) ->
                    new WordCountProcessor(projectionId, repository).init(context)))
        .onFailure(
            SupervisorStrategy.restartWithBackoff(
                Duration.ofSeconds(1), Duration.ofSeconds(10), 0.1));
  }

  private final ProjectionId projectionId;
  private final WordCountRepository repository;

  private WordCountProcessor(ProjectionId projectionId, WordCountRepository repository) {
    this.projectionId = projectionId;
    this.repository = repository;
  }

  Behavior<Command> init(ActorContext<Command> context) {
    return Behaviors.withStash(10, buffer -> new Initializing(context, buffer));
  }

  private class Initializing extends AbstractBehavior<Command> {
    private final StashBuffer<Command> buffer;

    private Initializing(ActorContext<Command> context, StashBuffer<Command> buffer) {
      super(context);
      this.buffer = buffer;

      getContext()
          .pipeToSelf(
              repository.loadAll(projectionId.id()),
              (value, exc) -> {
                if (value != null) return new InitialState(value);
                else throw new RuntimeException("Load failed.", exc);
              });
    }

    @Override
    public Receive<Command> createReceive() {
      return newReceiveBuilder()
          .onMessage(InitialState.class, this::onInitalState)
          .onAnyMessage(this::onOther)
          .build();
    }

    private Behavior<Command> onInitalState(InitialState initialState) {
      getContext().getLog().debug("Initial state [{}]", initialState.state);
      return buffer.unstashAll(new Active(getContext(), initialState.state));
    }

    private Behavior<Command> onOther(Command command) {
      getContext().getLog().debug("Stashed [{}]", command);
      buffer.stash(command);
      return this;
    }
  }

  private class Active extends AbstractBehavior<Command> {
    private final Map<String, Integer> state;

    public Active(ActorContext<Command> context, Map<String, Integer> state) {
      super(context);
      this.state = state;
    }

    @Override
    public Receive<Command> createReceive() {
      return newReceiveBuilder()
          .onMessage(Handle.class, this::onHandle)
          .onMessage(SaveCompleted.class, this::onSaveCompleted)
          .build();
    }

    private Behavior<Command> onHandle(Handle command) {
      String word = command.envelope.word;
      int newCount = state.getOrDefault(word, 0) + 1;
      getContext()
          .pipeToSelf(
              repository.save(projectionId.id(), word, newCount),
              (done, exc) ->
                  // will reply from SaveCompleted
                  new SaveCompleted(word, Optional.ofNullable(exc), command.replyTo));
      return this;
    }

    private Behavior<Command> onSaveCompleted(SaveCompleted completed) {
      completed.replyTo.tell(new Result(completed.error));
      if (completed.error.isPresent()) {
        // restart, reload state from db
        throw new RuntimeException("Save failed.", completed.error.get());
      } else {
        String word = completed.word;
        int newCount = state.getOrDefault(word, 0) + 1;
        state.put(word, newCount);
      }
      return this;
    }
  }
}
```

The handler can be definined as:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/WordCountDocExample.scala#L182-L197 "Go to snippet source")import akka.projection.scaladsl.ActorHandler

class WordCountActorHandler(behavior: Behavior[WordCountProcessor.Command])(implicit system: ActorSystem[_])
    extends ActorHandler[WordEnvelope, WordCountProcessor.Command](behavior) {
  import akka.actor.typed.scaladsl.AskPattern._
  import system.executionContext

  private implicit val askTimeout: Timeout = 5.seconds

  override def process(actor: ActorRef[WordCountProcessor.Command], envelope: WordEnvelope): Future[Done] = {
    actor.ask[Try[Done]](replyTo => WordCountProcessor.Handle(envelope, replyTo)).map {
      case Success(_)   => Done
      case Failure(exc) => throw exc
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/WordCountDocExample.java#L271-L302 "Go to snippet source")class WordCountActorHandler extends ActorHandler<WordEnvelope, WordCountProcessor.Command> {
  private final ActorSystem<?> system;
  private final Duration askTimeout = Duration.ofSeconds(5);

  WordCountActorHandler(Behavior<WordCountProcessor.Command> behavior, ActorSystem<?> system) {
    super(behavior);
    this.system = system;
  }

  @Override
  public CompletionStage<Done> process(
      ActorRef<WordCountProcessor.Command> actor, WordEnvelope envelope) {
    CompletionStage<WordCountProcessor.Result> result =
        AskPattern.ask(
            actor,
            (ActorRef<WordCountProcessor.Result> replyTo) ->
                new WordCountProcessor.Handle(envelope, replyTo),
            askTimeout,
            system.scheduler());

    return result.thenCompose(
        r -> {
          if (r.error.isPresent()) {
            CompletableFuture<Done> err = new CompletableFuture<>();
            err.completeExceptionally(r.error.get());
            return err;
          } else {
            return CompletableFuture.completedFuture(Done.getInstance());
          }
        });
  }
}
```

and the `Projection`:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/WordCountDocExampleSpec.scala#L110-L115 "Go to snippet source")val projection =
  CassandraProjection
    .atLeastOnce[Long, WordEnvelope](
      projectionId,
      sourceProvider = new WordSource,
      handler = () => new WordCountActorHandler(WordCountProcessor(projectionId, repository)))
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/WordCountDocExampleTest.java#L128-L134 "Go to snippet source")Projection<WordEnvelope> projection =
    CassandraProjection.atLeastOnce(
        projectionId,
        new WordSource(),
        () ->
            new WordCountActorHandler(
                WordCountProcessor.create(projectionId, repository), system));
```

The `Behavior` given to the `ActorHandler` is spawned automatically by the `Projection` and each envelope is sent to the actor with `ask`. The actor is supposed to send a response message to the `replyTo` when it has completed the processing of the envelope. The `Try``Optional<Throwable> error` indicates if the processing was successful or failed.

The lifecycle of the actor is managed by the `Projection`. The actor is automatically stopped when the `Projection` is stopped.

Another implementation that is loading the current count for a word on demand, and thereafter caches it in the in\-memory state: 

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/WordCountDocExample.scala#L300-L377 "Go to snippet source")object WordCountProcessor {
  trait Command
  final case class Handle(envelope: WordEnvelope, replyTo: ActorRef[Try[Done]]) extends Command
  private final case class LoadCompleted(word: Word, loadResult: Try[Count]) extends Command
  private final case class SaveCompleted(word: Word, saveResult: Try[Done]) extends Command

  def apply(projectionId: ProjectionId, repository: WordCountRepository): Behavior[Command] =
    Behaviors
      .supervise[Command] {
        Behaviors.setup[Command] { context =>
          new WordCountProcessor(context, projectionId, repository).idle(Map.empty)
        }
      }
      .onFailure(SupervisorStrategy.restartWithBackoff(1.second, 10.seconds, 0.1))
}

class WordCountProcessor(
    context: ActorContext[WordCountProcessor.Command],
    projectionId: ProjectionId,
    repository: WordCountRepository) {
  import WordCountProcessor._

  // waiting for next envelope
  private def idle(state: Map[Word, Count]): Behavior[Command] =
    Behaviors.receiveMessagePartial {
      case Handle(envelope, replyTo) =>
        val word = envelope.word
        state.get(word) match {
          case None =>
            load(word)
            loading(state, replyTo) // will continue from LoadCompleted
          case Some(count) =>
            save(word, count + 1)
            saving(state, replyTo) // will reply from SaveCompleted
        }
    }

  private def load(word: String): Unit = {
    context.pipeToSelf(repository.load(projectionId.id, word)) { loadResult =>
      LoadCompleted(word, loadResult)
    }
  }

  // loading the count for a word from db
  private def loading(state: Map[Word, Count], replyTo: ActorRef[Try[Done]]): Behavior[Command] =
    Behaviors.receiveMessagePartial {
      case LoadCompleted(word, loadResult) =>
        loadResult match {
          case Success(count) =>
            save(word, count + 1)
            saving(state, replyTo) // will reply from SaveCompleted
          case Failure(exc) =>
            replyTo ! Failure(exc)
            idle(state)
        }
    }

  private def save(word: String, count: Count): Unit = {
    context.pipeToSelf(repository.save(projectionId.id, word, count)) { saveResult =>
      SaveCompleted(word, saveResult)
    }
  }

  // saving the new count for a word in db
  private def saving(state: Map[Word, Count], replyTo: ActorRef[Try[Done]]): Behavior[Command] =
    Behaviors.receiveMessagePartial {
      case SaveCompleted(word, saveResult) =>
        replyTo ! saveResult
        saveResult match {
          case Success(_) =>
            idle(state.updated(word, state.getOrElse(word, 0) + 1))
          case Failure(_) =>
            // remove the word from the state if the save failed, because it could have been a timeout
            // so that it was actually saved, best to reload
            idle(state - word)
        }
    }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/WordCountDocExample.java#L488-L617 "Go to snippet source")  public class WordCountProcessor extends AbstractBehavior<WordCountProcessor.Command> {
    public interface Command {}

    public static class Handle implements Command {
      public final WordEnvelope envelope;
      public final ActorRef<Result> replyTo;

      public Handle(WordEnvelope envelope, ActorRef<Result> replyTo) {
        this.envelope = envelope;
        this.replyTo = replyTo;
      }
    }

    public static class Result {
      public final Optional<Throwable> error;

      public Result(Optional<Throwable> error) {
        this.error = error;
      }
    }

    private static class LoadCompleted implements Command {
      final String word;
      final Optional<Throwable> error;
      final ActorRef<Result> replyTo;

      private LoadCompleted(String word, Optional<Throwable> error, ActorRef<Result> replyTo) {
        this.word = word;
        this.error = error;
        this.replyTo = replyTo;
      }
    }

    private static class SaveCompleted implements Command {
      final String word;
      final Optional<Throwable> error;
      final ActorRef<Result> replyTo;

      private SaveCompleted(String word, Optional<Throwable> error, ActorRef<Result> replyTo) {
        this.word = word;
        this.error = error;
        this.replyTo = replyTo;
      }
    }

    public static Behavior<Command> create(
        ProjectionId projectionId, WordCountRepository repository) {
      return Behaviors.supervise(
              Behaviors.setup(
                  (ActorContext<Command> context) ->
                      new WordCountProcessor(context, projectionId, repository)))
          .onFailure(
              SupervisorStrategy.restartWithBackoff(
                  Duration.ofSeconds(1), Duration.ofSeconds(10), 0.1));
    }

    private final ProjectionId projectionId;
    private final WordCountRepository repository;
    private final Map<String, Integer> state = new HashMap<>();

    private WordCountProcessor(
        ActorContext<Command> context,
        ProjectionId projectionId,
        WordCountRepository repository) {
      super(context);
      this.projectionId = projectionId;
      this.repository = repository;
    }

    @Override
    public Receive<Command> createReceive() {
      return newReceiveBuilder()
          .onMessage(Handle.class, this::onHandle)
          .onMessage(LoadCompleted.class, this::onLoadCompleted)
          .onMessage(SaveCompleted.class, this::onSaveCompleted)
          .build();
    }

    private Behavior<Command> onHandle(Handle command) {
      String word = command.envelope.word;
      if (state.containsKey(word)) {
        int newCount = state.get(word) + 1;
        getContext()
            .pipeToSelf(
                repository.save(projectionId.id(), word, newCount),
                (done, exc) ->
                    // will reply from SaveCompleted
                    new SaveCompleted(word, Optional.ofNullable(exc), command.replyTo));
      } else {
        getContext()
            .pipeToSelf(
                repository.load(projectionId.id(), word),
                (loadResult, exc) ->
                    // will reply from LoadCompleted
                    new LoadCompleted(word, Optional.ofNullable(exc), command.replyTo));
      }
      return this;
    }

    private Behavior<Command> onLoadCompleted(LoadCompleted completed) {
      if (completed.error.isPresent()) {
        completed.replyTo.tell(new Result(completed.error));
      } else {
        String word = completed.word;
        int newCount = state.getOrDefault(word, 0) + 1;
        getContext()
            .pipeToSelf(
                repository.save(projectionId.id(), word, newCount),
                (done, exc) ->
                    // will reply from SaveCompleted
                    new SaveCompleted(word, Optional.ofNullable(exc), completed.replyTo));
      }
      return this;
    }

    private Behavior<Command> onSaveCompleted(SaveCompleted completed) {
      completed.replyTo.tell(new Result(completed.error));
      if (completed.error.isPresent()) {
        // remove the word from the state if the save failed, because it could have been a timeout
        // so that it was actually saved, best to reload
        state.remove(completed.word);
      } else {
        String word = completed.word;
        int newCount = state.getOrDefault(word, 0) + 1;
        state.put(word, newCount);
      }
      return this;
    }
  }
}
```

## Code Examples

### Example 1: Processing with Actor

```scala
import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.SupervisorStrategy
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object WordCountProcessor {
  trait Command
  final case class Handle(envelope: WordEnvelope, replyTo: ActorRef[Try[Done]]) extends Command
  private final case class InitialState(state: Map[Word, Count]) extends Command
  private final case class SaveCompleted(word: Word, saveResult: Try[Done]) extends Command

  def apply(projectionId: ProjectionId, repository: WordCountRepository): Behavior[Command] =
    Behaviors
      .supervise[Command] {
        Behaviors.setup { context =>
          new WordCountProcessor(context, projectionId, repository).init()
        }
      }
      .onFailure(SupervisorStrategy.restartWithBackoff(1.second, 10.seconds, 0.1))
}

class WordCountProcessor(
    context: ActorContext[WordCountProcessor.Command],
    projectionId: ProjectionId,
    repository: WordCountRepository) {
  import WordCountProcessor._

  // loading initial state from db
  def init(): Behavior[Command] = {
    Behaviors.withStash(10) { buffer =>
      context.pipeToSelf(repository.loadAll(projectionId.id)) {
        case Success(value) => InitialState(value)
        case Failure(exc)   => throw exc
      }

      Behaviors.receiveMessage {
        case InitialState(state) =>
          context.log.debug("Initial state [{}]", state)
          buffer.unstashAll(idle(state))
        case other =>
          context.log.debug("Stashed [{}]", other)
          buffer.stash(other)
          Behaviors.same
      }
    }
  }

  // waiting for next envelope
  private def idle(state: Map[Word, Count]): Behavior[Command] =
    Behaviors.receiveMessagePartial {
      case Handle(envelope, replyTo) =>
        val word = envelope.word
        context.pipeToSelf(repository.save(projectionId.id, word, state.getOrElse(word, 0) + 1)) { saveResult =>
          SaveCompleted(word, saveResult)
        }
        saving(state, replyTo) // will reply from SaveCompleted
      case _: InitialState =>
        Behaviors.unhandled
    }

  // saving the new count for a word in db
  private def saving(state: Map[Word, Count], replyTo: ActorRef[Try[Done]]): Behavior[Command] =
    Behaviors.receiveMessagePartial {
      case SaveCompleted(word, saveResult) =>
        replyTo ! saveResult
        saveResult match {
          case Success(_)   => idle(state.updated(word, state.getOrElse(word, 0) + 1))
          case Failure(exc) => throw exc // restart, reload state from db
        }
    }
}
```

### Example 2: Processing with Actor

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public class WordCountProcessor {
  public interface Command {}

  public static class Handle implements Command {
    public final WordEnvelope envelope;
    public final ActorRef<Result> replyTo;

    public Handle(WordEnvelope envelope, ActorRef<Result> replyTo) {
      this.envelope = envelope;
      this.replyTo = replyTo;
    }
  }

  public static class Result {
    public final Optional<Throwable> error;

    public Result(Optional<Throwable> error) {
      this.error = error;
    }
  }

  private static class InitialState implements Command {
    final Map<String, Integer> state;

    private InitialState(Map<String, Integer> state) {
      this.state = state;
    }
  }

  private static class SaveCompleted implements Command {
    final String word;
    final Optional<Throwable> error;
    final ActorRef<Result> replyTo;

    private SaveCompleted(String word, Optional<Throwable> error, ActorRef<Result> replyTo) {
      this.word = word;
      this.error = error;
      this.replyTo = replyTo;
    }
  }

  public static Behavior<Command> create(
      ProjectionId projectionId, WordCountRepository repository) {
    return Behaviors.supervise(
            Behaviors.setup(
                (ActorContext<Command> context) ->
                    new WordCountProcessor(projectionId, repository).init(context)))
        .onFailure(
            SupervisorStrategy.restartWithBackoff(
                Duration.ofSeconds(1), Duration.ofSeconds(10), 0.1));
  }

  private final ProjectionId projectionId;
  private final WordCountRepository repository;

  private WordCountProcessor(ProjectionId projectionId, WordCountRepository repository) {
    this.projectionId = projectionId;
    this.repository = repository;
  }

  Behavior<Command> init(ActorContext<Command> context) {
    return Behaviors.withStash(10, buffer -> new Initializing(context, buffer));
  }

  private class Initializing extends AbstractBehavior<Command> {
    private final StashBuffer<Command> buffer;

    private Initializing(ActorContext<Command> context, StashBuffer<Command> buffer) {
      super(context);
      this.buffer = buffer;

      getContext()
          .pipeToSelf(
              repository.loadAll(projectionId.id()),
              (value, exc) -> {
                if (value != null) return new InitialState(value);
                else throw new RuntimeException("Load failed.", exc);
              });
    }

    @Override
    public Receive<Command> createReceive() {
      return newReceiveBuilder()
          .onMessage(InitialState.class, this::onInitalState)
          .onAnyMessage(this::onOther)
          .build();
    }

    private Behavior<Command> onInitalState(InitialState initialState) {
      getContext().getLog().debug("Initial state [{}]", initialState.state);
      return buffer.unstashAll(new Active(getContext(), initialState.state));
    }

    private Behavior<Command> onOther(Command command) {
      getContext().getLog().debug("Stashed [{}]", command);
      buffer.stash(command);
      return this;
    }
  }

  private class Active extends AbstractBehavior<Command> {
    private final Map<String, Integer> state;

    public Active(ActorContext<Command> context, Map<String, Integer> state) {
      super(context);
      this.state = state;
    }

    @Override
    public Receive<Command> createReceive() {
      return newReceiveBuilder()
          .onMessage(Handle.class, this::onHandle)
          .onMessage(SaveCompleted.class, this::onSaveCompleted)
          .build();
    }

    private Behavior<Command> onHandle(Handle command) {
      String word = command.envelope.word;
      int newCount = state.getOrDefault(word, 0) + 1;
      getContext()
          .pipeToSelf(
              repository.save(projectionId.id(), word, newCount),
              (done, exc) ->
                  // will reply from SaveCompleted
                  new SaveCompleted(word, Optional.ofNullable(exc), command.replyTo));
      return this;
    }

    private Behavior<Command> onSaveCompleted(SaveCompleted completed) {
      completed.replyTo.tell(new Result(completed.error));
      if (completed.error.isPresent()) {
        // restart, reload state from db
        throw new RuntimeException("Save failed.", completed.error.get());
      } else {
        String word = completed.word;
        int newCount = state.getOrDefault(word, 0) + 1;
        state.put(word, newCount);
      }
      return this;
    }
  }
}
```

### Example 3: Processing with Actor

```scala
import akka.projection.scaladsl.ActorHandler

class WordCountActorHandler(behavior: Behavior[WordCountProcessor.Command])(implicit system: ActorSystem[_])
    extends ActorHandler[WordEnvelope, WordCountProcessor.Command](behavior) {
  import akka.actor.typed.scaladsl.AskPattern._
  import system.executionContext

  private implicit val askTimeout: Timeout = 5.seconds

  override def process(actor: ActorRef[WordCountProcessor.Command], envelope: WordEnvelope): Future[Done] = {
    actor.ask[Try[Done]](replyTo => WordCountProcessor.Handle(envelope, replyTo)).map {
      case Success(_)   => Done
      case Failure(exc) => throw exc
    }
  }
}
```

### Example 4: Processing with Actor

```java
class WordCountActorHandler extends ActorHandler<WordEnvelope, WordCountProcessor.Command> {
  private final ActorSystem<?> system;
  private final Duration askTimeout = Duration.ofSeconds(5);

  WordCountActorHandler(Behavior<WordCountProcessor.Command> behavior, ActorSystem<?> system) {
    super(behavior);
    this.system = system;
  }

  @Override
  public CompletionStage<Done> process(
      ActorRef<WordCountProcessor.Command> actor, WordEnvelope envelope) {
    CompletionStage<WordCountProcessor.Result> result =
        AskPattern.ask(
            actor,
            (ActorRef<WordCountProcessor.Result> replyTo) ->
                new WordCountProcessor.Handle(envelope, replyTo),
            askTimeout,
            system.scheduler());

    return result.thenCompose(
        r -> {
          if (r.error.isPresent()) {
            CompletableFuture<Done> err = new CompletableFuture<>();
            err.completeExceptionally(r.error.get());
            return err;
          } else {
            return CompletableFuture.completedFuture(Done.getInstance());
          }
        });
  }
}
```

### Example 5: Processing with Actor

```scala
val projection =
  CassandraProjection
    .atLeastOnce[Long, WordEnvelope](
      projectionId,
      sourceProvider = new WordSource,
      handler = () => new WordCountActorHandler(WordCountProcessor(projectionId, repository)))
```

### Example 6: Processing with Actor

```java
Projection<WordEnvelope> projection =
    CassandraProjection.atLeastOnce(
        projectionId,
        new WordSource(),
        () ->
            new WordCountActorHandler(
                WordCountProcessor.create(projectionId, repository), system));
```

### Example 7: Processing with Actor

```scala
object WordCountProcessor {
  trait Command
  final case class Handle(envelope: WordEnvelope, replyTo: ActorRef[Try[Done]]) extends Command
  private final case class LoadCompleted(word: Word, loadResult: Try[Count]) extends Command
  private final case class SaveCompleted(word: Word, saveResult: Try[Done]) extends Command

  def apply(projectionId: ProjectionId, repository: WordCountRepository): Behavior[Command] =
    Behaviors
      .supervise[Command] {
        Behaviors.setup[Command] { context =>
          new WordCountProcessor(context, projectionId, repository).idle(Map.empty)
        }
      }
      .onFailure(SupervisorStrategy.restartWithBackoff(1.second, 10.seconds, 0.1))
}

class WordCountProcessor(
    context: ActorContext[WordCountProcessor.Command],
    projectionId: ProjectionId,
    repository: WordCountRepository) {
  import WordCountProcessor._

  // waiting for next envelope
  private def idle(state: Map[Word, Count]): Behavior[Command] =
    Behaviors.receiveMessagePartial {
      case Handle(envelope, replyTo) =>
        val word = envelope.word
        state.get(word) match {
          case None =>
            load(word)
            loading(state, replyTo) // will continue from LoadCompleted
          case Some(count) =>
            save(word, count + 1)
            saving(state, replyTo) // will reply from SaveCompleted
        }
    }

  private def load(word: String): Unit = {
    context.pipeToSelf(repository.load(projectionId.id, word)) { loadResult =>
      LoadCompleted(word, loadResult)
    }
  }

  // loading the count for a word from db
  private def loading(state: Map[Word, Count], replyTo: ActorRef[Try[Done]]): Behavior[Command] =
    Behaviors.receiveMessagePartial {
      case LoadCompleted(word, loadResult) =>
        loadResult match {
          case Success(count) =>
            save(word, count + 1)
            saving(state, replyTo) // will reply from SaveCompleted
          case Failure(exc) =>
            replyTo ! Failure(exc)
            idle(state)
        }
    }

  private def save(word: String, count: Count): Unit = {
    context.pipeToSelf(repository.save(projectionId.id, word, count)) { saveResult =>
      SaveCompleted(word, saveResult)
    }
  }

  // saving the new count for a word in db
  private def saving(state: Map[Word, Count], replyTo: ActorRef[Try[Done]]): Behavior[Command] =
    Behaviors.receiveMessagePartial {
      case SaveCompleted(word, saveResult) =>
        replyTo ! saveResult
        saveResult match {
          case Success(_) =>
            idle(state.updated(word, state.getOrElse(word, 0) + 1))
          case Failure(_) =>
            // remove the word from the state if the save failed, because it could have been a timeout
            // so that it was actually saved, best to reload
            idle(state - word)
        }
    }
}
```

### Example 8: Processing with Actor

```java
public class WordCountProcessor extends AbstractBehavior<WordCountProcessor.Command> {
    public interface Command {}

    public static class Handle implements Command {
      public final WordEnvelope envelope;
      public final ActorRef<Result> replyTo;

      public Handle(WordEnvelope envelope, ActorRef<Result> replyTo) {
        this.envelope = envelope;
        this.replyTo = replyTo;
      }
    }

    public static class Result {
      public final Optional<Throwable> error;

      public Result(Optional<Throwable> error) {
        this.error = error;
      }
    }

    private static class LoadCompleted implements Command {
      final String word;
      final Optional<Throwable> error;
      final ActorRef<Result> replyTo;

      private LoadCompleted(String word, Optional<Throwable> error, ActorRef<Result> replyTo) {
        this.word = word;
        this.error = error;
        this.replyTo = replyTo;
      }
    }

    private static class SaveCompleted implements Command {
      final String word;
      final Optional<Throwable> error;
      final ActorRef<Result> replyTo;

      private SaveCompleted(String word, Optional<Throwable> error, ActorRef<Result> replyTo) {
        this.word = word;
        this.error = error;
        this.replyTo = replyTo;
      }
    }

    public static Behavior<Command> create(
        ProjectionId projectionId, WordCountRepository repository) {
      return Behaviors.supervise(
              Behaviors.setup(
                  (ActorContext<Command> context) ->
                      new WordCountProcessor(context, projectionId, repository)))
          .onFailure(
              SupervisorStrategy.restartWithBackoff(
                  Duration.ofSeconds(1), Duration.ofSeconds(10), 0.1));
    }

    private final ProjectionId projectionId;
    private final WordCountRepository repository;
    private final Map<String, Integer> state = new HashMap<>();

    private WordCountProcessor(
        ActorContext<Command> context,
        ProjectionId projectionId,
        WordCountRepository repository) {
      super(context);
      this.projectionId = projectionId;
      this.repository = repository;
    }

    @Override
    public Receive<Command> createReceive() {
      return newReceiveBuilder()
          .onMessage(Handle.class, this::onHandle)
          .onMessage(LoadCompleted.class, this::onLoadCompleted)
          .onMessage(SaveCompleted.class, this::onSaveCompleted)
          .build();
    }

    private Behavior<Command> onHandle(Handle command) {
      String word = command.envelope.word;
      if (state.containsKey(word)) {
        int newCount = state.get(word) + 1;
        getContext()
            .pipeToSelf(
                repository.save(projectionId.id(), word, newCount),
                (done, exc) ->
                    // will reply from SaveCompleted
                    new SaveCompleted(word, Optional.ofNullable(exc), command.replyTo));
      } else {
        getContext()
            .pipeToSelf(
                repository.load(projectionId.id(), word),
                (loadResult, exc) ->
                    // will reply from LoadCompleted
                    new LoadCompleted(word, Optional.ofNullable(exc), command.replyTo));
      }
      return this;
    }

    private Behavior<Command> onLoadCompleted(LoadCompleted completed) {
      if (completed.error.isPresent()) {
        completed.replyTo.tell(new Result(completed.error));
      } else {
        String word = completed.word;
        int newCount = state.getOrDefault(word, 0) + 1;
        getContext()
            .pipeToSelf(
                repository.save(projectionId.id(), word, newCount),
                (done, exc) ->
                    // will reply from SaveCompleted
                    new SaveCompleted(word, Optional.ofNullable(exc), completed.replyTo));
      }
      return this;
    }

    private Behavior<Command> onSaveCompleted(SaveCompleted completed) {
      completed.replyTo.tell(new Result(completed.error));
      if (completed.error.isPresent()) {
        // remove the word from the state if the save failed, because it could have been a timeout
        // so that it was actually saved, best to reload
        state.remove(completed.word);
      } else {
        String word = completed.word;
        int newCount = state.getOrDefault(word, 0) + 1;
        state.put(word, newCount);
      }
      return this;
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-projection/current/cassandra.html
- https://doc.akka.io/libraries/akka-projection/current/flow.html
- https://doc.akka.io/libraries/akka-projection/current/overview.html
- https://doc.akka.io/libraries/akka-projection/current/running.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/actor.html](https://doc.akka.io/libraries/akka-projection/current/actor.html)*