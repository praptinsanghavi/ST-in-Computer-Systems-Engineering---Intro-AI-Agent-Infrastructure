---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:14Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/persistence-style.html
title: Style Guide • Akka core
---

# Style Guide • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Style Guide

## Event handlers in the state

The section about [Changing Behavior](persistence.html#changing-behavior) described how commands and events can be handled differently depending on the state. One can take that one step further and define the event handler inside the state classes. In [the next section](persistence-style.html#command-handlers-in-the-state) the command handlers are also defined in the state.

The state can be seen as your domain object and it should contain the core business logic. Then it’s a matter of taste if event handlers and command handlers should be defined in the state or be kept outside of it.

Here we are using a bank account as the example domain. It has 3 state classes that are representing the lifecycle of the account; `EmptyAccount`, `OpenedAccount`, and `ClosedAccount`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleWithEventHandlersInState.scala#L29-L173 "Go to snippet source")object AccountEntity {
  // Command
  sealed trait Command extends CborSerializable
  final case class CreateAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Deposit(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Withdraw(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class GetBalance(replyTo: ActorRef[CurrentBalance]) extends Command
  final case class CloseAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command

  // Reply
  final case class CurrentBalance(balance: BigDecimal) extends CborSerializable

  // Event
  sealed trait Event extends CborSerializable
  case object AccountCreated extends Event
  case class Deposited(amount: BigDecimal) extends Event
  case class Withdrawn(amount: BigDecimal) extends Event
  case object AccountClosed extends Event

  val Zero = BigDecimal(0)

  // State
  sealed trait Account extends CborSerializable {
    def applyEvent(event: Event): Account
  }
  case object EmptyAccount extends Account {
    override def applyEvent(event: Event): Account = event match {
      case AccountCreated => OpenedAccount(Zero)
      case _              => throw new IllegalStateException(s"unexpected event [$event] in state [EmptyAccount]")
    }
  }
  case class OpenedAccount(balance: BigDecimal) extends Account {
    require(balance >= Zero, "Account balance can't be negative")

    override def applyEvent(event: Event): Account =
      event match {
        case Deposited(amount) => copy(balance = balance + amount)
        case Withdrawn(amount) => copy(balance = balance - amount)
        case AccountClosed     => ClosedAccount
        case AccountCreated    => throw new IllegalStateException(s"unexpected event [$event] in state [OpenedAccount]")
      }

    def canWithdraw(amount: BigDecimal): Boolean = {
      balance - amount >= Zero
    }

  }
  case object ClosedAccount extends Account {
    override def applyEvent(event: Event): Account =
      throw new IllegalStateException(s"unexpected event [$event] in state [ClosedAccount]")
  }

  // when used with sharding, this TypeKey can be used in `sharding.init` and `sharding.entityRefFor`:
  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("Account")

  // Note that after defining command, event and state classes you would probably start here when writing this.
  // When filling in the parameters of EventSourcedBehavior.apply you can use IntelliJ alt+Enter > createValue
  // to generate the stub with types for the command and event handlers.

  def apply(accountNumber: String, persistenceId: PersistenceId): Behavior[Command] = {
    EventSourcedBehavior.withEnforcedReplies(persistenceId, EmptyAccount, commandHandler(accountNumber), eventHandler)
  }

  private def commandHandler(accountNumber: String): (Account, Command) => ReplyEffect[Event, Account] = {
    (state, cmd) =>
      state match {
        case EmptyAccount =>
          cmd match {
            case c: CreateAccount => createAccount(c)
            case _                => Effect.unhandled.thenNoReply() // CreateAccount before handling any other commands
          }

        case acc @ OpenedAccount(_) =>
          cmd match {
            case c: Deposit      => deposit(c)
            case c: Withdraw     => withdraw(acc, c)
            case c: GetBalance   => getBalance(acc, c)
            case c: CloseAccount => closeAccount(acc, c)
            case c: CreateAccount =>
              Effect.reply(c.replyTo)(StatusReply.Error(s"Account $accountNumber is already created"))
          }

        case ClosedAccount =>
          cmd match {
            case c: Deposit =>
              replyClosed(accountNumber, c.replyTo)
            case c: Withdraw =>
              replyClosed(accountNumber, c.replyTo)
            case GetBalance(replyTo) =>
              Effect.reply(replyTo)(CurrentBalance(Zero))
            case CloseAccount(replyTo) =>
              replyClosed(accountNumber, replyTo)
            case CreateAccount(replyTo) =>
              replyClosed(accountNumber, replyTo)
          }
      }
  }

  private def replyClosed(
      accountNumber: String,
      replyTo: ActorRef[StatusReply[Done]]): ReplyEffect[Event, Account] = {
    Effect.reply(replyTo)(StatusReply.Error(s"Account $accountNumber is closed"))
  }

  private val eventHandler: (Account, Event) => Account = { (state, event) =>
    state.applyEvent(event)
  }

  private def createAccount(cmd: CreateAccount): ReplyEffect[Event, Account] = {
    Effect.persist(AccountCreated).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
  }

  private def deposit(cmd: Deposit): ReplyEffect[Event, Account] = {
    Effect.persist(Deposited(cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
  }

  private def withdraw(acc: OpenedAccount, cmd: Withdraw): ReplyEffect[Event, Account] = {
    if (acc.canWithdraw(cmd.amount))
      Effect.persist(Withdrawn(cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
    else
      Effect.reply(cmd.replyTo)(
        StatusReply.Error(s"Insufficient balance ${acc.balance} to be able to withdraw ${cmd.amount}"))
  }

  private def getBalance(acc: OpenedAccount, cmd: GetBalance): ReplyEffect[Event, Account] = {
    Effect.reply(cmd.replyTo)(CurrentBalance(acc.balance))
  }

  private def closeAccount(acc: OpenedAccount, cmd: CloseAccount): ReplyEffect[Event, Account] = {
    if (acc.balance == Zero)
      Effect.persist(AccountClosed).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
    else
      Effect.reply(cmd.replyTo)(StatusReply.Error("Can't close account with non-zero balance"))
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleWithEventHandlersInState.java#L32-L263 "Go to snippet source")public class AccountEntity
    extends EventSourcedBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Event, AccountEntity.Account> {

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

  // Event
  interface Event extends CborSerializable {}

  public enum AccountCreated implements Event {
    INSTANCE
  }

  public static class Deposited implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Deposited(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class Withdrawn implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Withdrawn(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class AccountClosed implements Event {}

  // State
  interface Account extends CborSerializable {}

  public static class EmptyAccount implements Account {
    OpenedAccount openedAccount() {
      return new OpenedAccount(BigDecimal.ZERO);
    }
  }

  public static class OpenedAccount implements Account {
    final BigDecimal balance;

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
    return new EmptyAccount();
  }

  @Override
  public CommandHandlerWithReply<Command, Event, Account> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, Event, Account> builder =
        newCommandHandlerWithReplyBuilder();

    builder.forStateType(EmptyAccount.class).onCommand(CreateAccount.class, this::createAccount);

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

  private ReplyEffect<Event, Account> createAccount(EmptyAccount account, CreateAccount command) {
    return Effect()
        .persist(AccountCreated.INSTANCE)
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> deposit(OpenedAccount account, Deposit command) {
    return Effect()
        .persist(new Deposited(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> withdraw(OpenedAccount account, Withdraw command) {
    if (!account.canWithdraw(command.amount)) {
      return Effect()
          .reply(
              command.replyTo,
              StatusReply.error("not enough funds to withdraw " + command.amount));
    } else {
      return Effect()
          .persist(new Withdrawn(command.amount))
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    }
  }

  private ReplyEffect<Event, Account> getBalance(OpenedAccount account, GetBalance command) {
    return Effect().reply(command.replyTo, new CurrentBalance(account.balance));
  }

  private ReplyEffect<Event, Account> closeAccount(OpenedAccount account, CloseAccount command) {
    if (account.balance.equals(BigDecimal.ZERO)) {
      return Effect()
          .persist(new AccountClosed())
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    } else {
      return Effect()
          .reply(command.replyTo, StatusReply.error("balance must be zero for closing account"));
    }
  }

  @Override
  public EventHandler<Account, Event> eventHandler() {
    EventHandlerBuilder<Account, Event> builder = newEventHandlerBuilder();

    builder
        .forStateType(EmptyAccount.class)
        .onEvent(AccountCreated.class, (account, created) -> account.openedAccount());

    builder
        .forStateType(OpenedAccount.class)
        .onEvent(Deposited.class, (account, deposited) -> account.makeDeposit(deposited.amount))
        .onEvent(Withdrawn.class, (account, withdrawn) -> account.makeWithdraw(withdrawn.amount))
        .onEvent(AccountClosed.class, (account, closed) -> account.closedAccount());

    return builder.build();
  }
}

```

Notice how the `eventHandler` delegates to the `applyEvent` in the `Account` (state), which is implemented in the concrete `EmptyAccount`, `OpenedAccount`, and `ClosedAccount`. Notice how the `eventHandler` delegates to methods in the concrete `Account` (state) classes; `EmptyAccount`, `OpenedAccount`, and `ClosedAccount`.

## Command handlers in the state

We can take the previous bank account example one step further by handling the commands in the state too.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleWithCommandHandlersInState.scala#L27-L147 "Go to snippet source")object AccountEntity {
  // Command
  sealed trait Command extends CborSerializable
  final case class CreateAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Deposit(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Withdraw(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class GetBalance(replyTo: ActorRef[CurrentBalance]) extends Command
  final case class CloseAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command

  // Reply
  final case class CurrentBalance(balance: BigDecimal)

  // Event
  sealed trait Event extends CborSerializable
  case object AccountCreated extends Event
  case class Deposited(amount: BigDecimal) extends Event
  case class Withdrawn(amount: BigDecimal) extends Event
  case object AccountClosed extends Event

  val Zero = BigDecimal(0)

  // type alias to reduce boilerplate
  type ReplyEffect = akka.persistence.typed.scaladsl.ReplyEffect[Event, Account]

  // State
  sealed trait Account extends CborSerializable {
    def applyCommand(cmd: Command): ReplyEffect
    def applyEvent(event: Event): Account
  }
  case object EmptyAccount extends Account {
    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case CreateAccount(replyTo) =>
          Effect.persist(AccountCreated).thenReply(replyTo)(_ => StatusReply.Ack)
        case _ =>
          // CreateAccount before handling any other commands
          Effect.unhandled.thenNoReply()
      }

    override def applyEvent(event: Event): Account =
      event match {
        case AccountCreated => OpenedAccount(Zero)
        case _              => throw new IllegalStateException(s"unexpected event [$event] in state [EmptyAccount]")
      }
  }
  case class OpenedAccount(balance: BigDecimal) extends Account {
    require(balance >= Zero, "Account balance can't be negative")

    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case Deposit(amount, replyTo) =>
          Effect.persist(Deposited(amount)).thenReply(replyTo)(_ => StatusReply.Ack)

        case Withdraw(amount, replyTo) =>
          if (canWithdraw(amount))
            Effect.persist(Withdrawn(amount)).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error(s"Insufficient balance $balance to be able to withdraw $amount"))

        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(balance))

        case CloseAccount(replyTo) =>
          if (balance == Zero)
            Effect.persist(AccountClosed).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error("Can't close account with non-zero balance"))

        case CreateAccount(replyTo) =>
          Effect.reply(replyTo)(StatusReply.Error("Account is already created"))

      }

    override def applyEvent(event: Event): Account =
      event match {
        case Deposited(amount) => copy(balance = balance + amount)
        case Withdrawn(amount) => copy(balance = balance - amount)
        case AccountClosed     => ClosedAccount
        case AccountCreated    => throw new IllegalStateException(s"unexpected event [$event] in state [OpenedAccount]")
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

    override def applyEvent(event: Event): Account =
      throw new IllegalStateException(s"unexpected event [$event] in state [ClosedAccount]")
  }

  // when used with sharding, this TypeKey can be used in `sharding.init` and `sharding.entityRefFor`:
  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("Account")

  def apply(persistenceId: PersistenceId): Behavior[Command] = {
    EventSourcedBehavior.withEnforcedReplies[Command, Event, Account](
      persistenceId,
      EmptyAccount,
      (state, cmd) => state.applyCommand(cmd),
      (state, event) => state.applyEvent(event))
  }

}
```

Notice how the command handler is delegating to `applyCommand` in the `Account` (state), which is implemented in the concrete `EmptyAccount`, `OpenedAccount`, and `ClosedAccount`.

## Optional initial state

Sometimes it’s not desirable to use a separate state class for the empty initial state, but rather treat that as there is no state yet. `null` can then be used as the `emptyState`, but be aware of that the `state` parameter will then be `null` for the first commands and events until the first event has be persisted to create the non\-null state. It’s possible to use `Optional` instead of `null` but that results in rather much boilerplate to unwrap the `Optional` state parameter and therefore `null` is probably preferred. The following example illustrates using `null` as the `emptyState`. `Option[State]` can be used as the state type and `None` as the `emptyState`. Pattern matching is then used in command and event handlers at the outer layer before delegating to the state or other methods.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleWithOptionState.scala#L27-L156 "Go to snippet source")object AccountEntity {
  // Command
  sealed trait Command extends CborSerializable
  final case class CreateAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Deposit(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class Withdraw(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
  final case class GetBalance(replyTo: ActorRef[CurrentBalance]) extends Command
  final case class CloseAccount(replyTo: ActorRef[StatusReply[Done]]) extends Command

  // Reply
  final case class CurrentBalance(balance: BigDecimal) extends CborSerializable

  // Event
  sealed trait Event extends CborSerializable
  case object AccountCreated extends Event
  case class Deposited(amount: BigDecimal) extends Event
  case class Withdrawn(amount: BigDecimal) extends Event
  case object AccountClosed extends Event

  val Zero = BigDecimal(0)

  // type alias to reduce boilerplate
  type ReplyEffect = akka.persistence.typed.scaladsl.ReplyEffect[Event, Option[Account]]

  // State
  sealed trait Account extends CborSerializable {
    def applyCommand(cmd: Command): ReplyEffect
    def applyEvent(event: Event): Account
  }
  case class OpenedAccount(balance: BigDecimal) extends Account {
    require(balance >= Zero, "Account balance can't be negative")

    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case Deposit(amount, replyTo) =>
          Effect.persist(Deposited(amount)).thenReply(replyTo)(_ => StatusReply.Ack)

        case Withdraw(amount, replyTo) =>
          if (canWithdraw(amount))
            Effect.persist(Withdrawn(amount)).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error(s"Insufficient balance $balance to be able to withdraw $amount"))

        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(balance))

        case CloseAccount(replyTo) =>
          if (balance == Zero)
            Effect.persist(AccountClosed).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error("Can't close account with non-zero balance"))

        case CreateAccount(replyTo) =>
          Effect.reply(replyTo)(StatusReply.Error("Account is already created"))

      }

    override def applyEvent(event: Event): Account =
      event match {
        case Deposited(amount) => copy(balance = balance + amount)
        case Withdrawn(amount) => copy(balance = balance - amount)
        case AccountClosed     => ClosedAccount
        case AccountCreated    => throw new IllegalStateException(s"unexpected event [$event] in state [OpenedAccount]")
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

    override def applyEvent(event: Event): Account =
      throw new IllegalStateException(s"unexpected event [$event] in state [ClosedAccount]")
  }

  // when used with sharding, this TypeKey can be used in `sharding.init` and `sharding.entityRefFor`:
  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("Account")

  def apply(persistenceId: PersistenceId): Behavior[Command] = {
    EventSourcedBehavior.withEnforcedReplies[Command, Event, Option[Account]](
      persistenceId,
      None,
      (state, cmd) =>
        state match {
          case None          => onFirstCommand(cmd)
          case Some(account) => account.applyCommand(cmd)
        },
      (state, event) =>
        state match {
          case None          => Some(onFirstEvent(event))
          case Some(account) => Some(account.applyEvent(event))
        })
  }

  def onFirstCommand(cmd: Command): ReplyEffect = {
    cmd match {
      case CreateAccount(replyTo) =>
        Effect.persist(AccountCreated).thenReply(replyTo)(_ => StatusReply.Ack)
      case _ =>
        // CreateAccount before handling any other commands
        Effect.unhandled.thenNoReply()
    }
  }

  def onFirstEvent(event: Event): Account = {
    event match {
      case AccountCreated => OpenedAccount(Zero)
      case _              => throw new IllegalStateException(s"unexpected event [$event] in state [EmptyAccount]")
    }
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleWithNullState.java#L31-L253 "Go to snippet source")public class AccountEntity
    extends EventSourcedBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Event, AccountEntity.Account> {

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

  // Event
  interface Event extends CborSerializable {}

  public enum AccountCreated implements Event {
    INSTANCE
  }

  public static class Deposited implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Deposited(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class Withdrawn implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Withdrawn(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class AccountClosed implements Event {}

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
  public CommandHandlerWithReply<Command, Event, Account> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, Event, Account> builder =
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

  private ReplyEffect<Event, Account> createAccount(CreateAccount command) {
    return Effect()
        .persist(AccountCreated.INSTANCE)
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> deposit(OpenedAccount account, Deposit command) {
    return Effect()
        .persist(new Deposited(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> withdraw(OpenedAccount account, Withdraw command) {
    if (!account.canWithdraw(command.amount)) {
      return Effect()
          .reply(
              command.replyTo,
              StatusReply.error("not enough funds to withdraw " + command.amount));
    } else {
      return Effect()
          .persist(new Withdrawn(command.amount))
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    }
  }

  private ReplyEffect<Event, Account> getBalance(OpenedAccount account, GetBalance command) {
    return Effect().reply(command.replyTo, new CurrentBalance(account.balance));
  }

  private ReplyEffect<Event, Account> closeAccount(OpenedAccount account, CloseAccount command) {
    if (account.balance.equals(BigDecimal.ZERO)) {
      return Effect()
          .persist(new AccountClosed())
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    } else {
      return Effect()
          .reply(command.replyTo, StatusReply.error("balance must be zero for closing account"));
    }
  }

  @Override
  public EventHandler<Account, Event> eventHandler() {
    EventHandlerBuilder<Account, Event> builder = newEventHandlerBuilder();

    builder.forNullState().onEvent(AccountCreated.class, () -> new OpenedAccount());

    builder
        .forStateType(OpenedAccount.class)
        .onEvent(Deposited.class, (account, deposited) -> account.makeDeposit(deposited.amount))
        .onEvent(Withdrawn.class, (account, withdrawn) -> account.makeWithdraw(withdrawn.amount))
        .onEvent(AccountClosed.class, (account, closed) -> account.closedAccount());

    return builder.build();
  }
}

```

## Mutable state

The state can be mutable or immutable. When it is immutable the event handler returns a new instance of the state for each change.

When using mutable state it’s important to not send the full state instance as a message to another actor, e.g. as a reply to a command. Messages must be immutable to avoid concurrency problems.

The above examples are using immutable state classes and below is corresponding example with mutable state.

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleWithMutableState.java#L31-L266 "Go to snippet source")public class AccountEntity
    extends EventSourcedBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Event, AccountEntity.Account> {

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

  // Event
  interface Event extends CborSerializable {}

  public enum AccountCreated implements Event {
    INSTANCE
  }

  public static class Deposited implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Deposited(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class Withdrawn implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Withdrawn(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class AccountClosed implements Event {}

  // State
  interface Account extends CborSerializable {}

  public static class EmptyAccount implements Account {
    OpenedAccount openedAccount() {
      return new OpenedAccount();
    }
  }

  public static class OpenedAccount implements Account {
    private BigDecimal balance = BigDecimal.ZERO;

    public BigDecimal getBalance() {
      return balance;
    }

    void makeDeposit(BigDecimal amount) {
      balance = balance.add(amount);
    }

    boolean canWithdraw(BigDecimal amount) {
      return (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0);
    }

    void makeWithdraw(BigDecimal amount) {
      if (!canWithdraw(amount))
        throw new IllegalStateException("Account balance can't be negative");
      balance = balance.subtract(amount);
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
    return new EmptyAccount();
  }

  @Override
  public CommandHandlerWithReply<Command, Event, Account> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, Event, Account> builder =
        newCommandHandlerWithReplyBuilder();

    builder.forStateType(EmptyAccount.class).onCommand(CreateAccount.class, this::createAccount);

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

  private ReplyEffect<Event, Account> createAccount(EmptyAccount account, CreateAccount command) {
    return Effect()
        .persist(AccountCreated.INSTANCE)
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> deposit(OpenedAccount account, Deposit command) {
    return Effect()
        .persist(new Deposited(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> withdraw(OpenedAccount account, Withdraw command) {
    if (!account.canWithdraw(command.amount)) {
      return Effect()
          .reply(
              command.replyTo,
              StatusReply.error("not enough funds to withdraw " + command.amount));
    } else {
      return Effect()
          .persist(new Withdrawn(command.amount))
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    }
  }

  private ReplyEffect<Event, Account> getBalance(OpenedAccount account, GetBalance command) {
    return Effect().reply(command.replyTo, new CurrentBalance(account.balance));
  }

  private ReplyEffect<Event, Account> closeAccount(OpenedAccount account, CloseAccount command) {
    if (account.getBalance().equals(BigDecimal.ZERO)) {
      return Effect()
          .persist(new AccountClosed())
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    } else {
      return Effect()
          .reply(command.replyTo, StatusReply.error("balance must be zero for closing account"));
    }
  }

  @Override
  public EventHandler<Account, Event> eventHandler() {
    EventHandlerBuilder<Account, Event> builder = newEventHandlerBuilder();

    builder
        .forStateType(EmptyAccount.class)
        .onEvent(AccountCreated.class, (account, event) -> account.openedAccount());

    builder
        .forStateType(OpenedAccount.class)
        .onEvent(
            Deposited.class,
            (account, deposited) -> {
              account.makeDeposit(deposited.amount);
              return account;
            })
        .onEvent(
            Withdrawn.class,
            (account, withdrawn) -> {
              account.makeWithdraw(withdrawn.amount);
              return account;
            })
        .onEvent(AccountClosed.class, (account, closed) -> account.closedAccount());

    return builder.build();
  }
}

```

If the state is mutable, it is important that the `emptyState` method creates a new State instance each time it is called to ensure that the state is recreated in case of failure restarts.

## Leveraging Java 21 features

When building event sourced entities in a project using Java 21 or newer, the [`EventSourcedOnCommandBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html "akka.persistence.typed.javadsl.EventSourcedOnCommandBehavior") base class provides an API that let you leverage the switch pattern match feature. When combined with `sealed` command and event top types this gives you a more direct handling of commands and events as well as a compile time completeness check that you have handled all kinds of commands and events in your event sourced behavior handler methods:

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java-21+/jdocs21/akka/persistence/typed/javadsl/AccountBehavior.java#L20-L181 "Go to snippet source")public class AccountBehavior
    extends EventSourcedOnCommandBehavior<
        AccountBehavior.Command, AccountBehavior.Event, AccountBehavior.Account> {

  public sealed interface Command extends CborSerializable {
  }

  public record CreateAccount(ActorRef<StatusReply<Done>> replyTo) implements Command {
  }

  public record Deposit(BigDecimal amount, ActorRef<StatusReply<Done>> replyTo) implements Command {
  }

  public record Withdraw(BigDecimal amount, ActorRef<StatusReply<Done>> replyTo) implements Command { }

  public record GetBalance(ActorRef<CurrentBalance> replyTo) implements Command {
  }

  public record CloseAccount(ActorRef<StatusReply<Done>> replyTo) implements Command {
  }

  // Reply
  public record CurrentBalance(BigDecimal balance) implements CborSerializable {
  }

  public sealed interface Event extends CborSerializable {
  }

  public record AccountCreated() implements Event {
  }

  public record Deposited(BigDecimal amount) implements Event {
  }

  public record Withdrawn(BigDecimal amount) implements Event {
  }

  public record AccountClosed() implements Event {
  }

  // State
  public sealed interface Account extends CborSerializable {}

  public record OpenedAccount(BigDecimal balance) implements Account {
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

  public record ClosedAccount() implements Account {
  }

  public static AccountBehavior create(String accountNumber, PersistenceId persistenceId) {
    return new AccountBehavior(accountNumber, persistenceId);
  }

  private final String accountNumber;

  private AccountBehavior(String accountNumber, PersistenceId persistenceId) {
    super(persistenceId);
    this.accountNumber = accountNumber;
  }

  @Override
  public Account emptyState() {
    return null;
  }

  @Override
  public Effect<Event, Account> onCommand(Account account, Command command) {
    return switch (account) {
      case null -> switch (command) {
        case CreateAccount create -> onCreateAccount(create);
        default -> Effect().unhandled();
      };
      case OpenedAccount opened -> switch (command) {
        case Deposit deposit -> onDeposit(opened, deposit);
        case Withdraw withdraw -> onWithdraw(opened, withdraw);
        case GetBalance getBalance -> onGetBalance(opened, getBalance);
        case CloseAccount closeAccount -> onCloseAccount(opened, closeAccount);
        case CreateAccount createAccount ->
            Effect().reply(createAccount.replyTo, StatusReply.error("Account already opened"));
      };
      case ClosedAccount ignore -> Effect().unhandled();
    };
  }

  private ReplyEffect<Event, Account> onCreateAccount(CreateAccount command) {
    return Effect()
        .persist(new AccountCreated())
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> onDeposit(OpenedAccount account, Deposit command) {
    return Effect()
        .persist(new Deposited(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> onWithdraw(OpenedAccount account, Withdraw command) {
    if (!account.canWithdraw(command.amount)) {
      return Effect()
          .reply(
              command.replyTo,
              StatusReply.error("not enough funds to withdraw " + command.amount));
    } else {
      return Effect()
          .persist(new Withdrawn(command.amount))
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    }
  }

  private ReplyEffect<Event, Account> onGetBalance(OpenedAccount account, GetBalance command) {
    return Effect().reply(command.replyTo, new CurrentBalance(account.balance));
  }

  private ReplyEffect<Event, Account> onCloseAccount(OpenedAccount account, CloseAccount command) {
    if (account.balance.equals(BigDecimal.ZERO)) {
      return Effect()
          .persist(new AccountClosed())
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    } else {
      return Effect()
          .reply(command.replyTo, StatusReply.error("balance must be zero for closing account"));
    }
  }

  @Override
  public Account onEvent(Account state, Event event) {
    return switch (state) {
      case null -> switch (event) {
        case AccountCreated ignored -> new OpenedAccount(BigDecimal.ZERO);
        default -> throw new IllegalStateException("Unexpected event for null account " + event);
      };
      case OpenedAccount account -> switch (event) {
        case Deposited deposited -> account.makeDeposit(deposited.amount);
        case Withdrawn withdrawn -> account.makeWithdraw(withdrawn.amount);
        case AccountClosed ignored -> account.closedAccount();
        case AccountCreated ignored ->
            throw new IllegalStateException("AccountCreated event for already open account");
      };
      case ClosedAccount ignored ->
          throw new IllegalStateException("ClosedAccount does not accept any events but saw event " + event);
    };
  }
}
```

## Code Examples

### Example 1: Event handlers in the state

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

  // Event
  sealed trait Event extends CborSerializable
  case object AccountCreated extends Event
  case class Deposited(amount: BigDecimal) extends Event
  case class Withdrawn(amount: BigDecimal) extends Event
  case object AccountClosed extends Event

  val Zero = BigDecimal(0)

  // State
  sealed trait Account extends CborSerializable {
    def applyEvent(event: Event): Account
  }
  case object EmptyAccount extends Account {
    override def applyEvent(event: Event): Account = event match {
      case AccountCreated => OpenedAccount(Zero)
      case _              => throw new IllegalStateException(s"unexpected event [$event] in state [EmptyAccount]")
    }
  }
  case class OpenedAccount(balance: BigDecimal) extends Account {
    require(balance >= Zero, "Account balance can't be negative")

    override def applyEvent(event: Event): Account =
      event match {
        case Deposited(amount) => copy(balance = balance + amount)
        case Withdrawn(amount) => copy(balance = balance - amount)
        case AccountClosed     => ClosedAccount
        case AccountCreated    => throw new IllegalStateException(s"unexpected event [$event] in state [OpenedAccount]")
      }

    def canWithdraw(amount: BigDecimal): Boolean = {
      balance - amount >= Zero
    }

  }
  case object ClosedAccount extends Account {
    override def applyEvent(event: Event): Account =
      throw new IllegalStateException(s"unexpected event [$event] in state [ClosedAccount]")
  }

  // when used with sharding, this TypeKey can be used in `sharding.init` and `sharding.entityRefFor`:
  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("Account")

  // Note that after defining command, event and state classes you would probably start here when writing this.
  // When filling in the parameters of EventSourcedBehavior.apply you can use IntelliJ alt+Enter > createValue
  // to generate the stub with types for the command and event handlers.

  def apply(accountNumber: String, persistenceId: PersistenceId): Behavior[Command] = {
    EventSourcedBehavior.withEnforcedReplies(persistenceId, EmptyAccount, commandHandler(accountNumber), eventHandler)
  }

  private def commandHandler(accountNumber: String): (Account, Command) => ReplyEffect[Event, Account] = {
    (state, cmd) =>
      state match {
        case EmptyAccount =>
          cmd match {
            case c: CreateAccount => createAccount(c)
            case _                => Effect.unhandled.thenNoReply() // CreateAccount before handling any other commands
          }

        case acc @ OpenedAccount(_) =>
          cmd match {
            case c: Deposit      => deposit(c)
            case c: Withdraw     => withdraw(acc, c)
            case c: GetBalance   => getBalance(acc, c)
            case c: CloseAccount => closeAccount(acc, c)
            case c: CreateAccount =>
              Effect.reply(c.replyTo)(StatusReply.Error(s"Account $accountNumber is already created"))
          }

        case ClosedAccount =>
          cmd match {
            case c: Deposit =>
              replyClosed(accountNumber, c.replyTo)
            case c: Withdraw =>
              replyClosed(accountNumber, c.replyTo)
            case GetBalance(replyTo) =>
              Effect.reply(replyTo)(CurrentBalance(Zero))
            case CloseAccount(replyTo) =>
              replyClosed(accountNumber, replyTo)
            case CreateAccount(replyTo) =>
              replyClosed(accountNumber, replyTo)
          }
      }
  }

  private def replyClosed(
      accountNumber: String,
      replyTo: ActorRef[StatusReply[Done]]): ReplyEffect[Event, Account] = {
    Effect.reply(replyTo)(StatusReply.Error(s"Account $accountNumber is closed"))
  }

  private val eventHandler: (Account, Event) => Account = { (state, event) =>
    state.applyEvent(event)
  }

  private def createAccount(cmd: CreateAccount): ReplyEffect[Event, Account] = {
    Effect.persist(AccountCreated).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
  }

  private def deposit(cmd: Deposit): ReplyEffect[Event, Account] = {
    Effect.persist(Deposited(cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
  }

  private def withdraw(acc: OpenedAccount, cmd: Withdraw): ReplyEffect[Event, Account] = {
    if (acc.canWithdraw(cmd.amount))
      Effect.persist(Withdrawn(cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
    else
      Effect.reply(cmd.replyTo)(
        StatusReply.Error(s"Insufficient balance ${acc.balance} to be able to withdraw ${cmd.amount}"))
  }

  private def getBalance(acc: OpenedAccount, cmd: GetBalance): ReplyEffect[Event, Account] = {
    Effect.reply(cmd.replyTo)(CurrentBalance(acc.balance))
  }

  private def closeAccount(acc: OpenedAccount, cmd: CloseAccount): ReplyEffect[Event, Account] = {
    if (acc.balance == Zero)
      Effect.persist(AccountClosed).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
    else
      Effect.reply(cmd.replyTo)(StatusReply.Error("Can't close account with non-zero balance"))
  }

}
```

### Example 2: Event handlers in the state

```java
public class AccountEntity
    extends EventSourcedBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Event, AccountEntity.Account> {

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

  // Event
  interface Event extends CborSerializable {}

  public enum AccountCreated implements Event {
    INSTANCE
  }

  public static class Deposited implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Deposited(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class Withdrawn implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Withdrawn(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class AccountClosed implements Event {}

  // State
  interface Account extends CborSerializable {}

  public static class EmptyAccount implements Account {
    OpenedAccount openedAccount() {
      return new OpenedAccount(BigDecimal.ZERO);
    }
  }

  public static class OpenedAccount implements Account {
    final BigDecimal balance;

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
    return new EmptyAccount();
  }

  @Override
  public CommandHandlerWithReply<Command, Event, Account> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, Event, Account> builder =
        newCommandHandlerWithReplyBuilder();

    builder.forStateType(EmptyAccount.class).onCommand(CreateAccount.class, this::createAccount);

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

  private ReplyEffect<Event, Account> createAccount(EmptyAccount account, CreateAccount command) {
    return Effect()
        .persist(AccountCreated.INSTANCE)
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> deposit(OpenedAccount account, Deposit command) {
    return Effect()
        .persist(new Deposited(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> withdraw(OpenedAccount account, Withdraw command) {
    if (!account.canWithdraw(command.amount)) {
      return Effect()
          .reply(
              command.replyTo,
              StatusReply.error("not enough funds to withdraw " + command.amount));
    } else {
      return Effect()
          .persist(new Withdrawn(command.amount))
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    }
  }

  private ReplyEffect<Event, Account> getBalance(OpenedAccount account, GetBalance command) {
    return Effect().reply(command.replyTo, new CurrentBalance(account.balance));
  }

  private ReplyEffect<Event, Account> closeAccount(OpenedAccount account, CloseAccount command) {
    if (account.balance.equals(BigDecimal.ZERO)) {
      return Effect()
          .persist(new AccountClosed())
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    } else {
      return Effect()
          .reply(command.replyTo, StatusReply.error("balance must be zero for closing account"));
    }
  }

  @Override
  public EventHandler<Account, Event> eventHandler() {
    EventHandlerBuilder<Account, Event> builder = newEventHandlerBuilder();

    builder
        .forStateType(EmptyAccount.class)
        .onEvent(AccountCreated.class, (account, created) -> account.openedAccount());

    builder
        .forStateType(OpenedAccount.class)
        .onEvent(Deposited.class, (account, deposited) -> account.makeDeposit(deposited.amount))
        .onEvent(Withdrawn.class, (account, withdrawn) -> account.makeWithdraw(withdrawn.amount))
        .onEvent(AccountClosed.class, (account, closed) -> account.closedAccount());

    return builder.build();
  }
}
```

### Example 3: Command handlers in the state

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

  // Event
  sealed trait Event extends CborSerializable
  case object AccountCreated extends Event
  case class Deposited(amount: BigDecimal) extends Event
  case class Withdrawn(amount: BigDecimal) extends Event
  case object AccountClosed extends Event

  val Zero = BigDecimal(0)

  // type alias to reduce boilerplate
  type ReplyEffect = akka.persistence.typed.scaladsl.ReplyEffect[Event, Account]

  // State
  sealed trait Account extends CborSerializable {
    def applyCommand(cmd: Command): ReplyEffect
    def applyEvent(event: Event): Account
  }
  case object EmptyAccount extends Account {
    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case CreateAccount(replyTo) =>
          Effect.persist(AccountCreated).thenReply(replyTo)(_ => StatusReply.Ack)
        case _ =>
          // CreateAccount before handling any other commands
          Effect.unhandled.thenNoReply()
      }

    override def applyEvent(event: Event): Account =
      event match {
        case AccountCreated => OpenedAccount(Zero)
        case _              => throw new IllegalStateException(s"unexpected event [$event] in state [EmptyAccount]")
      }
  }
  case class OpenedAccount(balance: BigDecimal) extends Account {
    require(balance >= Zero, "Account balance can't be negative")

    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case Deposit(amount, replyTo) =>
          Effect.persist(Deposited(amount)).thenReply(replyTo)(_ => StatusReply.Ack)

        case Withdraw(amount, replyTo) =>
          if (canWithdraw(amount))
            Effect.persist(Withdrawn(amount)).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error(s"Insufficient balance $balance to be able to withdraw $amount"))

        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(balance))

        case CloseAccount(replyTo) =>
          if (balance == Zero)
            Effect.persist(AccountClosed).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error("Can't close account with non-zero balance"))

        case CreateAccount(replyTo) =>
          Effect.reply(replyTo)(StatusReply.Error("Account is already created"))

      }

    override def applyEvent(event: Event): Account =
      event match {
        case Deposited(amount) => copy(balance = balance + amount)
        case Withdrawn(amount) => copy(balance = balance - amount)
        case AccountClosed     => ClosedAccount
        case AccountCreated    => throw new IllegalStateException(s"unexpected event [$event] in state [OpenedAccount]")
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

    override def applyEvent(event: Event): Account =
      throw new IllegalStateException(s"unexpected event [$event] in state [ClosedAccount]")
  }

  // when used with sharding, this TypeKey can be used in `sharding.init` and `sharding.entityRefFor`:
  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("Account")

  def apply(persistenceId: PersistenceId): Behavior[Command] = {
    EventSourcedBehavior.withEnforcedReplies[Command, Event, Account](
      persistenceId,
      EmptyAccount,
      (state, cmd) => state.applyCommand(cmd),
      (state, event) => state.applyEvent(event))
  }

}
```

### Example 4: Optional initial state

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

  // Event
  sealed trait Event extends CborSerializable
  case object AccountCreated extends Event
  case class Deposited(amount: BigDecimal) extends Event
  case class Withdrawn(amount: BigDecimal) extends Event
  case object AccountClosed extends Event

  val Zero = BigDecimal(0)

  // type alias to reduce boilerplate
  type ReplyEffect = akka.persistence.typed.scaladsl.ReplyEffect[Event, Option[Account]]

  // State
  sealed trait Account extends CborSerializable {
    def applyCommand(cmd: Command): ReplyEffect
    def applyEvent(event: Event): Account
  }
  case class OpenedAccount(balance: BigDecimal) extends Account {
    require(balance >= Zero, "Account balance can't be negative")

    override def applyCommand(cmd: Command): ReplyEffect =
      cmd match {
        case Deposit(amount, replyTo) =>
          Effect.persist(Deposited(amount)).thenReply(replyTo)(_ => StatusReply.Ack)

        case Withdraw(amount, replyTo) =>
          if (canWithdraw(amount))
            Effect.persist(Withdrawn(amount)).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error(s"Insufficient balance $balance to be able to withdraw $amount"))

        case GetBalance(replyTo) =>
          Effect.reply(replyTo)(CurrentBalance(balance))

        case CloseAccount(replyTo) =>
          if (balance == Zero)
            Effect.persist(AccountClosed).thenReply(replyTo)(_ => StatusReply.Ack)
          else
            Effect.reply(replyTo)(StatusReply.Error("Can't close account with non-zero balance"))

        case CreateAccount(replyTo) =>
          Effect.reply(replyTo)(StatusReply.Error("Account is already created"))

      }

    override def applyEvent(event: Event): Account =
      event match {
        case Deposited(amount) => copy(balance = balance + amount)
        case Withdrawn(amount) => copy(balance = balance - amount)
        case AccountClosed     => ClosedAccount
        case AccountCreated    => throw new IllegalStateException(s"unexpected event [$event] in state [OpenedAccount]")
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

    override def applyEvent(event: Event): Account =
      throw new IllegalStateException(s"unexpected event [$event] in state [ClosedAccount]")
  }

  // when used with sharding, this TypeKey can be used in `sharding.init` and `sharding.entityRefFor`:
  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("Account")

  def apply(persistenceId: PersistenceId): Behavior[Command] = {
    EventSourcedBehavior.withEnforcedReplies[Command, Event, Option[Account]](
      persistenceId,
      None,
      (state, cmd) =>
        state match {
          case None          => onFirstCommand(cmd)
          case Some(account) => account.applyCommand(cmd)
        },
      (state, event) =>
        state match {
          case None          => Some(onFirstEvent(event))
          case Some(account) => Some(account.applyEvent(event))
        })
  }

  def onFirstCommand(cmd: Command): ReplyEffect = {
    cmd match {
      case CreateAccount(replyTo) =>
        Effect.persist(AccountCreated).thenReply(replyTo)(_ => StatusReply.Ack)
      case _ =>
        // CreateAccount before handling any other commands
        Effect.unhandled.thenNoReply()
    }
  }

  def onFirstEvent(event: Event): Account = {
    event match {
      case AccountCreated => OpenedAccount(Zero)
      case _              => throw new IllegalStateException(s"unexpected event [$event] in state [EmptyAccount]")
    }
  }

}
```

### Example 5: Optional initial state

```java
public class AccountEntity
    extends EventSourcedBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Event, AccountEntity.Account> {

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

  // Event
  interface Event extends CborSerializable {}

  public enum AccountCreated implements Event {
    INSTANCE
  }

  public static class Deposited implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Deposited(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class Withdrawn implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Withdrawn(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class AccountClosed implements Event {}

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
  public CommandHandlerWithReply<Command, Event, Account> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, Event, Account> builder =
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

  private ReplyEffect<Event, Account> createAccount(CreateAccount command) {
    return Effect()
        .persist(AccountCreated.INSTANCE)
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> deposit(OpenedAccount account, Deposit command) {
    return Effect()
        .persist(new Deposited(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> withdraw(OpenedAccount account, Withdraw command) {
    if (!account.canWithdraw(command.amount)) {
      return Effect()
          .reply(
              command.replyTo,
              StatusReply.error("not enough funds to withdraw " + command.amount));
    } else {
      return Effect()
          .persist(new Withdrawn(command.amount))
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    }
  }

  private ReplyEffect<Event, Account> getBalance(OpenedAccount account, GetBalance command) {
    return Effect().reply(command.replyTo, new CurrentBalance(account.balance));
  }

  private ReplyEffect<Event, Account> closeAccount(OpenedAccount account, CloseAccount command) {
    if (account.balance.equals(BigDecimal.ZERO)) {
      return Effect()
          .persist(new AccountClosed())
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    } else {
      return Effect()
          .reply(command.replyTo, StatusReply.error("balance must be zero for closing account"));
    }
  }

  @Override
  public EventHandler<Account, Event> eventHandler() {
    EventHandlerBuilder<Account, Event> builder = newEventHandlerBuilder();

    builder.forNullState().onEvent(AccountCreated.class, () -> new OpenedAccount());

    builder
        .forStateType(OpenedAccount.class)
        .onEvent(Deposited.class, (account, deposited) -> account.makeDeposit(deposited.amount))
        .onEvent(Withdrawn.class, (account, withdrawn) -> account.makeWithdraw(withdrawn.amount))
        .onEvent(AccountClosed.class, (account, closed) -> account.closedAccount());

    return builder.build();
  }
}
```

### Example 6: Mutable state

```java
public class AccountEntity
    extends EventSourcedBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Event, AccountEntity.Account> {

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

  // Event
  interface Event extends CborSerializable {}

  public enum AccountCreated implements Event {
    INSTANCE
  }

  public static class Deposited implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Deposited(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class Withdrawn implements Event {
    public final BigDecimal amount;

    @JsonCreator
    Withdrawn(BigDecimal amount) {
      this.amount = amount;
    }
  }

  public static class AccountClosed implements Event {}

  // State
  interface Account extends CborSerializable {}

  public static class EmptyAccount implements Account {
    OpenedAccount openedAccount() {
      return new OpenedAccount();
    }
  }

  public static class OpenedAccount implements Account {
    private BigDecimal balance = BigDecimal.ZERO;

    public BigDecimal getBalance() {
      return balance;
    }

    void makeDeposit(BigDecimal amount) {
      balance = balance.add(amount);
    }

    boolean canWithdraw(BigDecimal amount) {
      return (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0);
    }

    void makeWithdraw(BigDecimal amount) {
      if (!canWithdraw(amount))
        throw new IllegalStateException("Account balance can't be negative");
      balance = balance.subtract(amount);
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
    return new EmptyAccount();
  }

  @Override
  public CommandHandlerWithReply<Command, Event, Account> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, Event, Account> builder =
        newCommandHandlerWithReplyBuilder();

    builder.forStateType(EmptyAccount.class).onCommand(CreateAccount.class, this::createAccount);

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

  private ReplyEffect<Event, Account> createAccount(EmptyAccount account, CreateAccount command) {
    return Effect()
        .persist(AccountCreated.INSTANCE)
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> deposit(OpenedAccount account, Deposit command) {
    return Effect()
        .persist(new Deposited(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> withdraw(OpenedAccount account, Withdraw command) {
    if (!account.canWithdraw(command.amount)) {
      return Effect()
          .reply(
              command.replyTo,
              StatusReply.error("not enough funds to withdraw " + command.amount));
    } else {
      return Effect()
          .persist(new Withdrawn(command.amount))
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    }
  }

  private ReplyEffect<Event, Account> getBalance(OpenedAccount account, GetBalance command) {
    return Effect().reply(command.replyTo, new CurrentBalance(account.balance));
  }

  private ReplyEffect<Event, Account> closeAccount(OpenedAccount account, CloseAccount command) {
    if (account.getBalance().equals(BigDecimal.ZERO)) {
      return Effect()
          .persist(new AccountClosed())
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    } else {
      return Effect()
          .reply(command.replyTo, StatusReply.error("balance must be zero for closing account"));
    }
  }

  @Override
  public EventHandler<Account, Event> eventHandler() {
    EventHandlerBuilder<Account, Event> builder = newEventHandlerBuilder();

    builder
        .forStateType(EmptyAccount.class)
        .onEvent(AccountCreated.class, (account, event) -> account.openedAccount());

    builder
        .forStateType(OpenedAccount.class)
        .onEvent(
            Deposited.class,
            (account, deposited) -> {
              account.makeDeposit(deposited.amount);
              return account;
            })
        .onEvent(
            Withdrawn.class,
            (account, withdrawn) -> {
              account.makeWithdraw(withdrawn.amount);
              return account;
            })
        .onEvent(AccountClosed.class, (account, closed) -> account.closedAccount());

    return builder.build();
  }
}
```

### Example 7: Leveraging Java 21 features

```java
public class AccountBehavior
    extends EventSourcedOnCommandBehavior<
        AccountBehavior.Command, AccountBehavior.Event, AccountBehavior.Account> {

  public sealed interface Command extends CborSerializable {
  }

  public record CreateAccount(ActorRef<StatusReply<Done>> replyTo) implements Command {
  }

  public record Deposit(BigDecimal amount, ActorRef<StatusReply<Done>> replyTo) implements Command {
  }

  public record Withdraw(BigDecimal amount, ActorRef<StatusReply<Done>> replyTo) implements Command { }

  public record GetBalance(ActorRef<CurrentBalance> replyTo) implements Command {
  }

  public record CloseAccount(ActorRef<StatusReply<Done>> replyTo) implements Command {
  }

  // Reply
  public record CurrentBalance(BigDecimal balance) implements CborSerializable {
  }


  public sealed interface Event extends CborSerializable {
  }

  public record AccountCreated() implements Event {
  }

  public record Deposited(BigDecimal amount) implements Event {
  }

  public record Withdrawn(BigDecimal amount) implements Event {
  }

  public record AccountClosed() implements Event {
  }

  // State
  public sealed interface Account extends CborSerializable {}

  public record OpenedAccount(BigDecimal balance) implements Account {
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

  public record ClosedAccount() implements Account {
  }

  public static AccountBehavior create(String accountNumber, PersistenceId persistenceId) {
    return new AccountBehavior(accountNumber, persistenceId);
  }

  private final String accountNumber;

  private AccountBehavior(String accountNumber, PersistenceId persistenceId) {
    super(persistenceId);
    this.accountNumber = accountNumber;
  }

  @Override
  public Account emptyState() {
    return null;
  }

  @Override
  public Effect<Event, Account> onCommand(Account account, Command command) {
    return switch (account) {
      case null -> switch (command) {
        case CreateAccount create -> onCreateAccount(create);
        default -> Effect().unhandled();
      };
      case OpenedAccount opened -> switch (command) {
        case Deposit deposit -> onDeposit(opened, deposit);
        case Withdraw withdraw -> onWithdraw(opened, withdraw);
        case GetBalance getBalance -> onGetBalance(opened, getBalance);
        case CloseAccount closeAccount -> onCloseAccount(opened, closeAccount);
        case CreateAccount createAccount ->
            Effect().reply(createAccount.replyTo, StatusReply.error("Account already opened"));
      };
      case ClosedAccount ignore -> Effect().unhandled();
    };
  }

  private ReplyEffect<Event, Account> onCreateAccount(CreateAccount command) {
    return Effect()
        .persist(new AccountCreated())
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> onDeposit(OpenedAccount account, Deposit command) {
    return Effect()
        .persist(new Deposited(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }

  private ReplyEffect<Event, Account> onWithdraw(OpenedAccount account, Withdraw command) {
    if (!account.canWithdraw(command.amount)) {
      return Effect()
          .reply(
              command.replyTo,
              StatusReply.error("not enough funds to withdraw " + command.amount));
    } else {
      return Effect()
          .persist(new Withdrawn(command.amount))
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    }
  }

  private ReplyEffect<Event, Account> onGetBalance(OpenedAccount account, GetBalance command) {
    return Effect().reply(command.replyTo, new CurrentBalance(account.balance));
  }

  private ReplyEffect<Event, Account> onCloseAccount(OpenedAccount account, CloseAccount command) {
    if (account.balance.equals(BigDecimal.ZERO)) {
      return Effect()
          .persist(new AccountClosed())
          .thenReply(command.replyTo, account2 -> StatusReply.ack());
    } else {
      return Effect()
          .reply(command.replyTo, StatusReply.error("balance must be zero for closing account"));
    }
  }


  @Override
  public Account onEvent(Account state, Event event) {
    return switch (state) {
      case null -> switch (event) {
        case AccountCreated ignored -> new OpenedAccount(BigDecimal.ZERO);
        default -> throw new IllegalStateException("Unexpected event for null account " + event);
      };
      case OpenedAccount account -> switch (event) {
        case Deposited deposited -> account.makeDeposit(deposited.amount);
        case Withdrawn withdrawn -> account.makeWithdraw(withdrawn.amount);
        case AccountClosed ignored -> account.closedAccount();
        case AccountCreated ignored ->
            throw new IllegalStateException("AccountCreated event for already open account");
      };
      case ClosedAccount ignored ->
          throw new IllegalStateException("ClosedAccount does not accept any events but saw event " + event);
    };
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cqrs.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/persistence-snapshot.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/persistence-style.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/persistence.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/typed/persistence-style.html](https://doc.akka.io/libraries/akka-core/2.10/typed/persistence-style.html)*