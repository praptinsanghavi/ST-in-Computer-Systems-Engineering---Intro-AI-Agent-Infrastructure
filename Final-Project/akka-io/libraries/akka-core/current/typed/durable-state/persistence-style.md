---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/durable-state/persistence-style.html
title: Style Guide • Akka core
---

# Style Guide • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Style Guide

## Command handlers in the state

We can take the previous bank account example one step further by handling the commands within the state as well.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleWithCommandHandlersInDurableState.scala#L26-L132 "Go to snippet source")object AccountEntity {
  // Command
  sealed trait Command extends CborSerializable
  final case class CreateAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Deposit(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Withdraw(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class GetBalance(replyTo: ActorRef[CurrentBalance]) extends Command
  final case class CloseAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command

  // Reply
  final case class CurrentBalance(balance: BigDecimal)

  val Zero = BigDecimal(0)

  // type alias to reduce boilerplate
  type ReplyEffect = akka.persistence.typed.state.scaladsl.ReplyEffect[Account]

  // State
  sealed trait Account extends CborSerializable {
    def applyCommand(cmd: Command): ReplyEffect
  }
  case object EmptyAccount extends Account {
    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case CreateAccount(replyTo) =>
          Effect.persist(OpenedAccount(Zero)).thenReply(replyTo)(_ => StatusReply.Ack)
        case _ =>
          // CreateAccount before handling any other commands
          Effect.unhandled.thenNoReply()
      }
  }
  case class OpenedAccount(balance: BigDecimal) extends Account {
    require(balance >= Zero, "Account balance can't be negative")

    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case cmd @ Deposit(_, _) => deposit(cmd)

        case cmd @ Withdraw(_, _) => withdraw(cmd)

        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(balance))

        case CloseAccount(replyTo) =>
          if (balance == Zero)
            Effect.persist(ClosedAccount).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error("Can't close account with non-zero balance"))

        case CreateAccount(replyTo) =>
          Effect.reply(replyTo)(StatusReply.Error("Account is already created"))

      }

    private def canWithdraw(amount: BigDecimal): Boolean = {
      balance - amount >= Zero
    }

    private def deposit(cmd: Deposit) = {
      Effect.persist(copy(balance = balance + cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
    }

    private def withdraw(cmd: Withdraw) = {
      if (canWithdraw(cmd.amount))
        Effect.persist(copy(balance = balance - cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
      else
        Effect.reply(cmd.replyTo)(
          StatusReply.Error(s"Insufficient balance ${balance} to be able to withdraw ${cmd.amount}"))
    }

  }
  case object ClosedAccount extends Account {
    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case c: Deposit =>
          replyClosed(c.replyTo)
        case c: Withdraw =>
          replyClosed(c.replyTo)
        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(Zero))
        case CloseAccount(replyTo) =>
          replyClosed(replyTo)
        case CreateAccount(replyTo) =>
          replyClosed(replyTo)
      }

    private def replyClosed(replyTo: ActorRef[StatusReply[Done]]): ReplyEffect =
      Effect.reply(replyTo)(StatusReply.Error(s"Account is closed"))
  }

  // when used with sharding, this TypeKey can be used in `sharding.init` and `sharding.entityRefFor`:
  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("Account")

  def apply(persistenceId: PersistenceId): Behavior[Command] = {
    DurableStateBehavior
      .withEnforcedReplies[Command, Account](persistenceId, EmptyAccount, (state, cmd) => state.applyCommand(cmd))
  }
}
```

Take note of how the command handler is delegating to `applyCommand` in the `Account` (state), which is implemented in the concrete `EmptyAccount`, `OpenedAccount`, and `ClosedAccount`.

## Optional initial state

Sometimes it’s not desirable to use a separate state class for the empty initial state, but rather act as if there is no state yet. You can use `null` as the `emptyState`, but be aware of that the `state` parameter will be `null` until the first non\-null state has been persisted It’s possible to use `Optional` instead of `null`, but that requires extra boilerplate to unwrap the `Optional` state parameter. Therefore use of `null` is simpler. The following example illustrates using `null` as the `emptyState`. `Option[State]` can be used as the state type and `None` as the `emptyState`. Then pattern matching is used in command handlers at the outer layer before delegating to the state or other methods.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleWithOptionDurableState.scala#L26-L123 "Go to snippet source")object AccountEntity {
  // Command
  sealed trait Command extends CborSerializable
  final case class CreateAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Deposit(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Withdraw(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class GetBalance(replyTo: ActorRef[CurrentBalance]) extends Command
  final case class CloseAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command

  // Reply
  final case class CurrentBalance(balance: BigDecimal) extends CborSerializable

  val Zero = BigDecimal(0)

  // type alias to reduce boilerplate
  type ReplyEffect = akka.persistence.typed.state.scaladsl.ReplyEffect[Option[Account]]

  // State
  sealed trait Account extends CborSerializable {
    def applyCommand(cmd: Command): ReplyEffect
  }
  case class OpenedAccount(balance: BigDecimal) extends Account {
    require(balance >= Zero, "Account balance can't be negative")

    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case Deposit(amount, replyTo) =>
          Effect.persist(Some(copy(balance = balance + amount))).thenReply(replyTo)(_ => StatusReply.Ack)

        case Withdraw(amount, replyTo) =>
          if (canWithdraw(amount))
            Effect.persist(Some(copy(balance = balance - amount))).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error(s"Insufficient balance $balance to be able to withdraw $amount"))

        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(balance))

        case CloseAccount(replyTo) =>
          if (balance == Zero)
            Effect.persist(Some(ClosedAccount)).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error("Can't close account with non-zero balance"))

        case CreateAccount(replyTo) =>
          Effect.reply(replyTo)(StatusReply.Error("Account is already created"))

      }

    def canWithdraw(amount: BigDecimal): Boolean = {
      balance - amount >= Zero
    }
  }

  case object ClosedAccount extends Account {
    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case c: Deposit =>
          replyClosed(c.replyTo)
        case c: Withdraw =>
          replyClosed(c.replyTo)
        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(Zero))
        case CloseAccount(replyTo) =>
          replyClosed(replyTo)
        case CreateAccount(replyTo) =>
          replyClosed(replyTo)
      }

    private def replyClosed(replyTo: ActorRef[StatusReply[Done]]): ReplyEffect =
      Effect.reply(replyTo)(StatusReply.Error(s"Account is closed"))
  }

  // when used with sharding, this TypeKey can be used in `sharding.init` and `sharding.entityRefFor`:
  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("Account")

  def apply(persistenceId: PersistenceId): Behavior[Command] = {
    DurableStateBehavior.withEnforcedReplies[Command, Option[Account]](
      persistenceId,
      None,
      (state, cmd) =>
        state match {
          case None          => onFirstCommand(cmd)
          case Some(account) => account.applyCommand(cmd)
        })
  }

  def onFirstCommand(cmd: Command): ReplyEffect = {
    cmd match {
      case CreateAccount(replyTo) =>
        Effect.persist(Some(OpenedAccount(Zero))).thenReply(replyTo)(_ => StatusReply.Ack)
      case _ =>
        // CreateAccount before handling any other commands
        Effect.unhandled.thenNoReply()
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleWithNullDurableState.java#L30-L215 "Go to snippet source")public class AccountEntity
    extends DurableStateBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Account> {

  public static final EntityTypeKey<Command> ENTITY_TYPE_KEY =
      EntityTypeKey.create(Command.class, "Account");

  // Command
  interface Command extends CborSerializable {}

  public static class CreateAccount implements Command {
    public final ActorRef<StatusReply<Done>> replyTo;

    @JsonCreator
    public CreateAccount(ActorRef<StatusReply<Done>> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Deposit implements Command {
    public final BigDecimal amount;
    public final ActorRef<StatusReply<Done>> replyTo;

    public Deposit(BigDecimal amount, ActorRef<StatusReply<Done>> replyTo) {
      this.replyTo = replyTo;
      this.amount = amount;
    }
  }

  public static class Withdraw implements Command {
    public final BigDecimal amount;
    public final ActorRef<StatusReply<Done>> replyTo;

    public Withdraw(BigDecimal amount, ActorRef<StatusReply<Done>> replyTo) {
      this.amount = amount;
      this.replyTo = replyTo;
    }
  }

  public static class GetBalance implements Command {
    public final ActorRef<CurrentBalance> replyTo;

    @JsonCreator
    public GetBalance(ActorRef<CurrentBalance> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class CloseAccount implements Command {
    public final ActorRef<StatusReply<Done>> replyTo;

    @JsonCreator
    public CloseAccount(ActorRef<StatusReply<Done>> replyTo) {
      this.replyTo = replyTo;
    }
  }

  // Reply
  public static class CurrentBalance implements CborSerializable {
    public final BigDecimal balance;

    @JsonCreator
    public CurrentBalance(BigDecimal balance) {
      this.balance = balance;
    }
  }

  // State
  interface Account extends CborSerializable {}

  public static class OpenedAccount implements Account {
    public final BigDecimal balance;

    public OpenedAccount() {
      this.balance = BigDecimal.ZERO;
    }

    @JsonCreator
    public OpenedAccount(BigDecimal balance) {
      this.balance = balance;
    }

    OpenedAccount makeDeposit(BigDecimal amount) {
      return new OpenedAccount(balance.add(amount));
    }

    boolean canWithdraw(BigDecimal amount) {
      return (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0);
    }

    OpenedAccount makeWithdraw(BigDecimal amount) {
      if (!canWithdraw(amount))
        throw new IllegalStateException("Account balance can't be negative");
      return new OpenedAccount(balance.subtract(amount));
    }

    ClosedAccount closedAccount() {
      return new ClosedAccount();
    }
  }

  public static class ClosedAccount implements Account {}

  public static AccountEntity create(String accountNumber, PersistenceId persistenceId) {
    return new AccountEntity(accountNumber, persistenceId);
  }

  private final String accountNumber;

  private AccountEntity(String accountNumber, PersistenceId persistenceId) {
    super(persistenceId);
    this.accountNumber = accountNumber;
  }

  @Override
  public Account emptyState() {
    return null;
  }

  @Override
  public CommandHandlerWithReply<Command, Account> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, Account> builder =
        newCommandHandlerWithReplyBuilder();

    builder.forNullState().onCommand(CreateAccount.class, this::createAccount);

    builder
        .forStateType(OpenedAccount.class)
        .onCommand(Deposit.class, this::deposit)
        .onCommand(Withdraw.class, this::withdraw)
        .onCommand(GetBalance.class, this::getBalance)
        .onCommand(CloseAccount.class, this::closeAccount);

    builder
        .forStateType(ClosedAccount.class)
        .onAnyCommand(() -> Effect().unhandled().thenNoReply());

    return builder.build();
  }

  private ReplyEffect<Account> createAccount(CreateAccount command) {
    return Effect()
        .persist(new OpenedAccount())
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Account> deposit(OpenedAccount account, Deposit command) {
    return Effect()
        .persist(account.makeDeposit(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Account> withdraw(OpenedAccount account, Withdraw command) {
    if (!account.canWithdraw(command.amount)) {
      return Effect()
          .reply(
              command.replyTo,
              StatusReply.error("not enough funds to withdraw " + command.amount));
    } else {
      return Effect()
          .persist(account.makeWithdraw(command.amount))
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    }
  }

  private ReplyEffect<Account> getBalance(OpenedAccount account, GetBalance command) {
    return Effect().reply(command.replyTo, new CurrentBalance(account.balance));
  }

  private ReplyEffect<Account> closeAccount(OpenedAccount account, CloseAccount command) {
    if (account.balance.equals(BigDecimal.ZERO)) {
      return Effect()
          .persist(account.closedAccount())
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    } else {
      return Effect()
          .reply(command.replyTo, StatusReply.error("balance must be zero for closing account"));
    }
  }
}

```

## Leveraging Java 21 features

When building durable state entities in a project using Java 21 or newer, the [`DurableStateOnCommandBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateOnCommandBehavior.html "akka.persistence.typed.state.javadsl.DurableStateOnCommandBehavior") base class provides an API that let you leverage the switch pattern match feature. When combined with `sealed` command and event top types this gives you a more direct handling of commands and events as well as a compile time completeness check that you have handled all kinds of commands and events in your event sourced behavior handler methods:

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java-21+/jdocs21/akka/persistence/typed/javadsl/BlogPostEntityDurableState.java#L15-L138 "Go to snippet source")public class BlogPostEntityDurableState
    extends DurableStateOnCommandBehavior<
        BlogPostEntityDurableState.Command, BlogPostEntityDurableState.State> {

  public sealed interface Command {}

  public record AddPost(PostContent content, ActorRef<AddPostDone> replyTo) implements Command {}
  public record GetPost(ActorRef<PostContent> replyTo) implements Command {}
  public record ChangeBody(String newBody, ActorRef<Done> replyTo) implements Command {}
  public record Publish(ActorRef<Done> replyTo) implements Command {}
  public record PostContent(String postId, String title, String body) implements Command {}
  // reply
  public record AddPostDone(String postId) {}

  public sealed interface State {}

  public record BlankState() implements State {}

  public record DraftState(PostContent content) implements State {
    DraftState withContent(PostContent newContent) {
      return new DraftState(newContent);
    }
    DraftState withBody(String newBody) {
      return withContent(new PostContent(postId(), content.title, newBody));
    }
    String postId() {
      return content.postId;
    }
  }

  public record PublishedState(PostContent content) implements State {
    PublishedState withContent(PostContent newContent) {
      return new PublishedState(newContent);
    }
    PublishedState withBody(String newBody) {
      return withContent(new PostContent(postId(), content.title, newBody));
    }
    String postId() {
      return content.postId;
    }
  }

  public static Behavior<Command> create(String entityId, PersistenceId persistenceId) {
    return Behaviors.setup(
        context -> {
          context.getLog().info("Starting BlogPostEntityDurableState {}", entityId);
          return new BlogPostEntityDurableState(persistenceId);
        });
  }

  private BlogPostEntityDurableState(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return new BlankState();
  }

  @Override
  public Effect<State> onCommand(State state, Command command) {
    return switch(state) {
      case BlankState ignored ->
        switch(command) {
          case AddPost addPost -> onAddPost(addPost);
          default -> Effect().unhandled();
        };
      case DraftState draft ->
        switch(command) {
          case ChangeBody changeBody -> onChangeBody(draft, changeBody);
          case Publish publish -> onPublish(draft, publish);
          case GetPost getPost -> onGetPost(draft, getPost);
          default -> Effect().unhandled();
        };
      case PublishedState published ->
        switch(command) {
          case ChangeBody changeBody -> onChangeBody(published, changeBody);
          case GetPost getPost -> onGetPost(published, getPost);
          default -> Effect().unhandled();
        };
    };
  }

  private Effect<State> onAddPost(AddPost cmd) {
    return Effect()
        .persist(new DraftState(cmd.content))
        .thenRun(() -> cmd.replyTo.tell(new AddPostDone(cmd.content.postId)));
  }

  private Effect<State> onChangeBody(DraftState state, ChangeBody cmd) {
    return Effect()
        .persist(state.withBody(cmd.newBody))
        .thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
  }

  private Effect<State> onChangeBody(PublishedState state, ChangeBody cmd) {
    return Effect()
        .persist(state.withBody(cmd.newBody))
        .thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
  }

  private Effect<State> onPublish(DraftState state, Publish cmd) {
    return Effect()
        .persist(new PublishedState(state.content))
        .thenRun(
            () -> {
              System.out.println("Blog post published: " + state.postId());
              cmd.replyTo.tell(Done.getInstance());
            });
  }

  private Effect<State> onGetPost(DraftState state, GetPost cmd) {
    cmd.replyTo.tell(state.content);
    return Effect().none();
  }

  private Effect<State> onGetPost(PublishedState state, GetPost cmd) {
    cmd.replyTo.tell(state.content);
    return Effect().none();
  }
}
```

## Code Examples

### Example 1: Command handlers in the state

```scala
object AccountEntity {
  // Command
  sealed trait Command extends CborSerializable
  final case class CreateAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Deposit(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Withdraw(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class GetBalance(replyTo: ActorRef[CurrentBalance]) extends Command
  final case class CloseAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command

  // Reply
  final case class CurrentBalance(balance: BigDecimal)

  val Zero = BigDecimal(0)

  // type alias to reduce boilerplate
  type ReplyEffect = akka.persistence.typed.state.scaladsl.ReplyEffect[Account]

  // State
  sealed trait Account extends CborSerializable {
    def applyCommand(cmd: Command): ReplyEffect
  }
  case object EmptyAccount extends Account {
    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case CreateAccount(replyTo) =>
          Effect.persist(OpenedAccount(Zero)).thenReply(replyTo)(_ => StatusReply.Ack)
        case _ =>
          // CreateAccount before handling any other commands
          Effect.unhandled.thenNoReply()
      }
  }
  case class OpenedAccount(balance: BigDecimal) extends Account {
    require(balance >= Zero, "Account balance can't be negative")

    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case cmd @ Deposit(_, _) => deposit(cmd)

        case cmd @ Withdraw(_, _) => withdraw(cmd)

        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(balance))

        case CloseAccount(replyTo) =>
          if (balance == Zero)
            Effect.persist(ClosedAccount).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error("Can't close account with non-zero balance"))

        case CreateAccount(replyTo) =>
          Effect.reply(replyTo)(StatusReply.Error("Account is already created"))

      }

    private def canWithdraw(amount: BigDecimal): Boolean = {
      balance - amount >= Zero
    }

    private def deposit(cmd: Deposit) = {
      Effect.persist(copy(balance = balance + cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
    }

    private def withdraw(cmd: Withdraw) = {
      if (canWithdraw(cmd.amount))
        Effect.persist(copy(balance = balance - cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
      else
        Effect.reply(cmd.replyTo)(
          StatusReply.Error(s"Insufficient balance ${balance} to be able to withdraw ${cmd.amount}"))
    }

  }
  case object ClosedAccount extends Account {
    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case c: Deposit =>
          replyClosed(c.replyTo)
        case c: Withdraw =>
          replyClosed(c.replyTo)
        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(Zero))
        case CloseAccount(replyTo) =>
          replyClosed(replyTo)
        case CreateAccount(replyTo) =>
          replyClosed(replyTo)
      }

    private def replyClosed(replyTo: ActorRef[StatusReply[Done]]): ReplyEffect =
      Effect.reply(replyTo)(StatusReply.Error(s"Account is closed"))
  }

  // when used with sharding, this TypeKey can be used in `sharding.init` and `sharding.entityRefFor`:
  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("Account")

  def apply(persistenceId: PersistenceId): Behavior[Command] = {
    DurableStateBehavior
      .withEnforcedReplies[Command, Account](persistenceId, EmptyAccount, (state, cmd) => state.applyCommand(cmd))
  }
}
```

### Example 2: Optional initial state

```scala
object AccountEntity {
  // Command
  sealed trait Command extends CborSerializable
  final case class CreateAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Deposit(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Withdraw(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class GetBalance(replyTo: ActorRef[CurrentBalance]) extends Command
  final case class CloseAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command

  // Reply
  final case class CurrentBalance(balance: BigDecimal) extends CborSerializable

  val Zero = BigDecimal(0)

  // type alias to reduce boilerplate
  type ReplyEffect = akka.persistence.typed.state.scaladsl.ReplyEffect[Option[Account]]

  // State
  sealed trait Account extends CborSerializable {
    def applyCommand(cmd: Command): ReplyEffect
  }
  case class OpenedAccount(balance: BigDecimal) extends Account {
    require(balance >= Zero, "Account balance can't be negative")

    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case Deposit(amount, replyTo) =>
          Effect.persist(Some(copy(balance = balance + amount))).thenReply(replyTo)(_ => StatusReply.Ack)

        case Withdraw(amount, replyTo) =>
          if (canWithdraw(amount))
            Effect.persist(Some(copy(balance = balance - amount))).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error(s"Insufficient balance $balance to be able to withdraw $amount"))

        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(balance))

        case CloseAccount(replyTo) =>
          if (balance == Zero)
            Effect.persist(Some(ClosedAccount)).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error("Can't close account with non-zero balance"))

        case CreateAccount(replyTo) =>
          Effect.reply(replyTo)(StatusReply.Error("Account is already created"))

      }

    def canWithdraw(amount: BigDecimal): Boolean = {
      balance - amount >= Zero
    }
  }

  case object ClosedAccount extends Account {
    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case c: Deposit =>
          replyClosed(c.replyTo)
        case c: Withdraw =>
          replyClosed(c.replyTo)
        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(Zero))
        case CloseAccount(replyTo) =>
          replyClosed(replyTo)
        case CreateAccount(replyTo) =>
          replyClosed(replyTo)
      }

    private def replyClosed(replyTo: ActorRef[StatusReply[Done]]): ReplyEffect =
      Effect.reply(replyTo)(StatusReply.Error(s"Account is closed"))
  }

  // when used with sharding, this TypeKey can be used in `sharding.init` and `sharding.entityRefFor`:
  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("Account")

  def apply(persistenceId: PersistenceId): Behavior[Command] = {
    DurableStateBehavior.withEnforcedReplies[Command, Option[Account]](
      persistenceId,
      None,
      (state, cmd) =>
        state match {
          case None          => onFirstCommand(cmd)
          case Some(account) => account.applyCommand(cmd)
        })
  }

  def onFirstCommand(cmd: Command): ReplyEffect = {
    cmd match {
      case CreateAccount(replyTo) =>
        Effect.persist(Some(OpenedAccount(Zero))).thenReply(replyTo)(_ => StatusReply.Ack)
      case _ =>
        // CreateAccount before handling any other commands
        Effect.unhandled.thenNoReply()
    }
  }
}
```

### Example 3: Optional initial state

```java
public class AccountEntity
    extends DurableStateBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Account> {

  public static final EntityTypeKey<Command> ENTITY_TYPE_KEY =
      EntityTypeKey.create(Command.class, "Account");

  // Command
  interface Command extends CborSerializable {}

  public static class CreateAccount implements Command {
    public final ActorRef<StatusReply<Done>> replyTo;

    @JsonCreator
    public CreateAccount(ActorRef<StatusReply<Done>> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class Deposit implements Command {
    public final BigDecimal amount;
    public final ActorRef<StatusReply<Done>> replyTo;

    public Deposit(BigDecimal amount, ActorRef<StatusReply<Done>> replyTo) {
      this.replyTo = replyTo;
      this.amount = amount;
    }
  }

  public static class Withdraw implements Command {
    public final BigDecimal amount;
    public final ActorRef<StatusReply<Done>> replyTo;

    public Withdraw(BigDecimal amount, ActorRef<StatusReply<Done>> replyTo) {
      this.amount = amount;
      this.replyTo = replyTo;
    }
  }

  public static class GetBalance implements Command {
    public final ActorRef<CurrentBalance> replyTo;

    @JsonCreator
    public GetBalance(ActorRef<CurrentBalance> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static class CloseAccount implements Command {
    public final ActorRef<StatusReply<Done>> replyTo;

    @JsonCreator
    public CloseAccount(ActorRef<StatusReply<Done>> replyTo) {
      this.replyTo = replyTo;
    }
  }

  // Reply
  public static class CurrentBalance implements CborSerializable {
    public final BigDecimal balance;

    @JsonCreator
    public CurrentBalance(BigDecimal balance) {
      this.balance = balance;
    }
  }

  // State
  interface Account extends CborSerializable {}

  public static class OpenedAccount implements Account {
    public final BigDecimal balance;

    public OpenedAccount() {
      this.balance = BigDecimal.ZERO;
    }

    @JsonCreator
    public OpenedAccount(BigDecimal balance) {
      this.balance = balance;
    }

    OpenedAccount makeDeposit(BigDecimal amount) {
      return new OpenedAccount(balance.add(amount));
    }

    boolean canWithdraw(BigDecimal amount) {
      return (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0);
    }

    OpenedAccount makeWithdraw(BigDecimal amount) {
      if (!canWithdraw(amount))
        throw new IllegalStateException("Account balance can't be negative");
      return new OpenedAccount(balance.subtract(amount));
    }

    ClosedAccount closedAccount() {
      return new ClosedAccount();
    }
  }

  public static class ClosedAccount implements Account {}

  public static AccountEntity create(String accountNumber, PersistenceId persistenceId) {
    return new AccountEntity(accountNumber, persistenceId);
  }

  private final String accountNumber;

  private AccountEntity(String accountNumber, PersistenceId persistenceId) {
    super(persistenceId);
    this.accountNumber = accountNumber;
  }

  @Override
  public Account emptyState() {
    return null;
  }

  @Override
  public CommandHandlerWithReply<Command, Account> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, Account> builder =
        newCommandHandlerWithReplyBuilder();

    builder.forNullState().onCommand(CreateAccount.class, this::createAccount);

    builder
        .forStateType(OpenedAccount.class)
        .onCommand(Deposit.class, this::deposit)
        .onCommand(Withdraw.class, this::withdraw)
        .onCommand(GetBalance.class, this::getBalance)
        .onCommand(CloseAccount.class, this::closeAccount);

    builder
        .forStateType(ClosedAccount.class)
        .onAnyCommand(() -> Effect().unhandled().thenNoReply());

    return builder.build();
  }

  private ReplyEffect<Account> createAccount(CreateAccount command) {
    return Effect()
        .persist(new OpenedAccount())
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Account> deposit(OpenedAccount account, Deposit command) {
    return Effect()
        .persist(account.makeDeposit(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Account> withdraw(OpenedAccount account, Withdraw command) {
    if (!account.canWithdraw(command.amount)) {
      return Effect()
          .reply(
              command.replyTo,
              StatusReply.error("not enough funds to withdraw " + command.amount));
    } else {
      return Effect()
          .persist(account.makeWithdraw(command.amount))
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    }
  }

  private ReplyEffect<Account> getBalance(OpenedAccount account, GetBalance command) {
    return Effect().reply(command.replyTo, new CurrentBalance(account.balance));
  }

  private ReplyEffect<Account> closeAccount(OpenedAccount account, CloseAccount command) {
    if (account.balance.equals(BigDecimal.ZERO)) {
      return Effect()
          .persist(account.closedAccount())
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    } else {
      return Effect()
          .reply(command.replyTo, StatusReply.error("balance must be zero for closing account"));
    }
  }
}
```

### Example 4: Leveraging Java 21 features

```java
public class BlogPostEntityDurableState
    extends DurableStateOnCommandBehavior<
        BlogPostEntityDurableState.Command, BlogPostEntityDurableState.State> {

  public sealed interface Command {}

  public record AddPost(PostContent content, ActorRef<AddPostDone> replyTo) implements Command {}
  public record GetPost(ActorRef<PostContent> replyTo) implements Command {}
  public record ChangeBody(String newBody, ActorRef<Done> replyTo) implements Command {}
  public record Publish(ActorRef<Done> replyTo) implements Command {}
  public record PostContent(String postId, String title, String body) implements Command {}
  // reply
  public record AddPostDone(String postId) {}


  public sealed interface State {}

  public record BlankState() implements State {}

  public record DraftState(PostContent content) implements State {
    DraftState withContent(PostContent newContent) {
      return new DraftState(newContent);
    }
    DraftState withBody(String newBody) {
      return withContent(new PostContent(postId(), content.title, newBody));
    }
    String postId() {
      return content.postId;
    }
  }

  public record PublishedState(PostContent content) implements State {
    PublishedState withContent(PostContent newContent) {
      return new PublishedState(newContent);
    }
    PublishedState withBody(String newBody) {
      return withContent(new PostContent(postId(), content.title, newBody));
    }
    String postId() {
      return content.postId;
    }
  }

  public static Behavior<Command> create(String entityId, PersistenceId persistenceId) {
    return Behaviors.setup(
        context -> {
          context.getLog().info("Starting BlogPostEntityDurableState {}", entityId);
          return new BlogPostEntityDurableState(persistenceId);
        });
  }

  private BlogPostEntityDurableState(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return new BlankState();
  }

  @Override
  public Effect<State> onCommand(State state, Command command) {
    return switch(state) {
      case BlankState ignored ->
        switch(command) {
          case AddPost addPost -> onAddPost(addPost);
          default -> Effect().unhandled();
        };
      case DraftState draft ->
        switch(command) {
          case ChangeBody changeBody -> onChangeBody(draft, changeBody);
          case Publish publish -> onPublish(draft, publish);
          case GetPost getPost -> onGetPost(draft, getPost);
          default -> Effect().unhandled();
        };
      case PublishedState published ->
        switch(command) {
          case ChangeBody changeBody -> onChangeBody(published, changeBody);
          case GetPost getPost -> onGetPost(published, getPost);
          default -> Effect().unhandled();
        };
    };
  }

  private Effect<State> onAddPost(AddPost cmd) {
    return Effect()
        .persist(new DraftState(cmd.content))
        .thenRun(() -> cmd.replyTo.tell(new AddPostDone(cmd.content.postId)));
  }

  private Effect<State> onChangeBody(DraftState state, ChangeBody cmd) {
    return Effect()
        .persist(state.withBody(cmd.newBody))
        .thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
  }

  private Effect<State> onChangeBody(PublishedState state, ChangeBody cmd) {
    return Effect()
        .persist(state.withBody(cmd.newBody))
        .thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
  }

  private Effect<State> onPublish(DraftState state, Publish cmd) {
    return Effect()
        .persist(new PublishedState(state.content))
        .thenRun(
            () -> {
              System.out.println("Blog post published: " + state.postId());
              cmd.replyTo.tell(Done.getInstance());
            });
  }

  private Effect<State> onGetPost(DraftState state, GetPost cmd) {
    cmd.replyTo.tell(state.content);
    return Effect().none();
  }

  private Effect<State> onGetPost(PublishedState state, GetPost cmd) {
    cmd.replyTo.tell(state.content);
    return Effect().none();
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateOnCommandBehavior.html
- https://doc.akka.io/libraries/akka-core/current/typed/durable-state/cqrs.html
- https://doc.akka.io/libraries/akka-core/current/typed/durable-state/persistence.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/durable-state/persistence-style.html](https://doc.akka.io/libraries/akka-core/current/typed/durable-state/persistence-style.html)*