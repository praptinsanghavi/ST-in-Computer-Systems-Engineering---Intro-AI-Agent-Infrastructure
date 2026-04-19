---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:35Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/persistence-testing.html
title: Testing • Akka core
---

# Testing • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Testing

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Persistence TestKit, add the module to your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-testkit" % AkkaVersion % Test
)
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
    <artifactId>akka-persistence-typed_${scala.binary.version}</artifactId>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-testkit_${scala.binary.version}</artifactId>
    <scope>test</scope>
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

  implementation "com.typesafe.akka:akka-persistence-typed_${versions.ScalaBinary}"
  testImplementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

| Project Info: Akka Persistence Testkit | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-persistence\-testkit 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.persistence.testkit |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Incubating](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#incubating) Since 2\.6\.5, 2020\-04\-30 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Unit testing with the BehaviorTestKit

**Note!** The `UnpersistentBehavior` is a new feature: the API may have changes breaking source compatibility in future versions.

Unit testing of `EventSourcedBehavior` can be performed by converting it into an [`UnpersistentBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/UnpersistentBehavior.html "akka.persistence.testkit.javadsl.UnpersistentBehavior")[`UnpersistentBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html "akka.persistence.testkit.scaladsl.UnpersistentBehavior"). Instead of persisting events and snapshots, the `UnpersistentBehavior` exposes [`PersistenceProbe`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/PersistenceProbe.html "akka.persistence.testkit.javadsl.PersistenceProbe")[`PersistenceProbe`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceProbe.html "akka.persistence.testkit.scaladsl.PersistenceProbe")s for events and snapshots which can be asserted on.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleUnpersistentDocSpec.scala#L65-L67 "Go to snippet source")private def onAnEmptyAccount
    : UnpersistentBehavior.EventSourced[AccountEntity.Command, AccountEntity.Event, AccountEntity.Account] =
  UnpersistentBehavior.fromEventSourced(AccountEntity("1", PersistenceId("Account", "1")))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleUnpersistentDocTest.java#L124-L128 "Go to snippet source")UnpersistentBehavior.fromEventSourced(
    AccountEntity.create("1", PersistenceId.of("Account", "1")),
    null, // use the initial state
    0 // initial sequence number
    );
```

The `UnpersistentBehavior` can be initialized with arbitrary states:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleUnpersistentDocSpec.scala#L71-L78 "Go to snippet source")private def onAnOpenedAccount
    : UnpersistentBehavior.EventSourced[AccountEntity.Command, AccountEntity.Event, AccountEntity.Account] =
  UnpersistentBehavior.fromEventSourced(
    AccountEntity("1", PersistenceId("Account", "1")),
    Some(
      AccountEntity.EmptyAccount.applyEvent(AccountEntity.AccountCreated) -> // reuse the event handler
      1L // assume that CreateAccount was the first command
    ))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleUnpersistentDocTest.java#L136-L141 "Go to snippet source")UnpersistentBehavior.fromEventSourced(
    AccountEntity.create("1", PersistenceId.of("Account", "1")),
    new AccountEntity.EmptyAccount()
        .openedAccount(), // duplicate the event handler for AccountCreated on an EmptyAccount
    1 // assume that CreateAccount was the first command
    );
```

The `UnpersistentBehavior` is especially well\-suited to the synchronous [`BehaviorTestKit`](testing-sync.html#synchronous-behavior-testing): the `UnpersistentBehavior` can directly construct a `BehaviorTestKit` wrapping the behavior. When commands are run by `BehaviorTestKit`, they are processed in the calling thread (viz. the test suite), so when the run returns, the suite can be sure that the message has been fully processed. The internal state of the `EventSourcedBehavior` is not exposed to the suite except to the extent that it affects how the behavior responds to commands or the events it persists (in addition, any snapshots made by the behavior are available through a `PersistenceProbe`).

A full test for the `AccountEntity`, which is shown in the [Persistence Style Guide](persistence-style.html) might look like:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleUnpersistentDocSpec.scala#L12-L86 "Go to snippet source")import akka.persistence.testkit.scaladsl.UnpersistentBehavior
import akka.persistence.typed.PersistenceId

class AccountExampleUnpersistentDocSpec
    extends AnyWordSpecLike
    {
  "Account" must {
    "be created with zero balance" in {
      onAnEmptyAccount { (testkit, eventProbe, snapshotProbe) =>
        testkit.runAskWithStatus[Done](AccountEntity.CreateAccount(_)).expectDone()

        eventProbe.expectPersisted(AccountEntity.AccountCreated)

        // internal state is only exposed by the behavior via responses to messages or if it happens
        //  to snapshot.  This particular behavior never snapshots, so we query within the actor's
        //  protocol
        snapshotProbe.hasEffects shouldBe false

        testkit.runAsk[AccountEntity.CurrentBalance](AccountEntity.GetBalance(_)).receiveReply().balance shouldBe 0
      }
    }

    "handle Deposit and Withdraw" in {
      onAnOpenedAccount { (testkit, eventProbe, _) =>
        testkit.runAskWithStatus[Done](AccountEntity.Deposit(100, _)).expectDone()

        eventProbe.expectPersisted(AccountEntity.Deposited(100))

        testkit.runAskWithStatus[Done](AccountEntity.Withdraw(10, _)).expectDone()

        eventProbe.expectPersisted(AccountEntity.Withdrawn(10))

        testkit.runAsk[AccountEntity.CurrentBalance](AccountEntity.GetBalance(_)).receiveReply().balance shouldBe 90
      }
    }

    "reject Withdraw overdraft" in {
      onAnAccountWithBalance(100) { (testkit, eventProbe, _) =>
        testkit.runAskWithStatus(AccountEntity.Withdraw(110, _)).receiveStatusReply().isError shouldBe true

        eventProbe.hasEffects shouldBe false
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleUnpersistentDocTest.java#L15-L153 "Go to snippet source")import java.math.BigDecimal;
import akka.actor.testkit.typed.javadsl.BehaviorTestKit;
import akka.actor.testkit.typed.javadsl.ReplyInbox;
import akka.actor.testkit.typed.javadsl.StatusReplyInbox;
import akka.actor.testkit.typed.javadsl.TestInbox;
import akka.persistence.testkit.javadsl.UnpersistentBehavior;
import akka.persistence.testkit.javadsl.PersistenceEffect;
import akka.persistence.typed.PersistenceId;

import org.junit.Test;

public class AccountExampleUnpersistentDocTest
{
  @Test
  public void createWithEmptyBalance() {
    UnpersistentBehavior<AccountEntity.Command, AccountEntity.Event, AccountEntity.Account>
        unpersistent = emptyAccount();

    BehaviorTestKit<AccountEntity.Command> testkit = unpersistent.getBehaviorTestKit();

    StatusReplyInbox<Done> ackInbox = testkit.runAskWithStatus(AccountEntity.CreateAccount::new);

    ackInbox.expectValue(Done.getInstance());
    unpersistent.getEventProbe().expectPersisted(AccountEntity.AccountCreated.INSTANCE);

    // internal state is only exposed by the behavior via responses to messages or if it happens
    //  to snapshot.  This particular behavior never snapshots, so we query within the actor's
    //  protocol
    assertFalse(unpersistent.getSnapshotProbe().hasEffects());

    ReplyInbox<AccountEntity.CurrentBalance> currentBalanceInbox =
        testkit.runAsk(AccountEntity.GetBalance::new);

    assertEquals(BigDecimal.ZERO, currentBalanceInbox.receiveReply().balance);
  }

  @Test
  public void handleDepositAndWithdraw() {
    UnpersistentBehavior<AccountEntity.Command, AccountEntity.Event, AccountEntity.Account>
        unpersistent = openedAccount();

    BehaviorTestKit<AccountEntity.Command> testkit = unpersistent.getBehaviorTestKit();
    BigDecimal currentBalance;

    testkit
        .runAskWithStatus(
            Done.class, replyTo -> new AccountEntity.Deposit(BigDecimal.valueOf(100), replyTo))
        .expectValue(Done.getInstance());

    assertEquals(
        BigDecimal.valueOf(100),
        unpersistent
            .getEventProbe()
            .expectPersistedClass(AccountEntity.Deposited.class)
            .persistedObject()
            .amount);

    currentBalance =
        testkit
            .runAsk(AccountEntity.CurrentBalance.class, AccountEntity.GetBalance::new)
            .receiveReply()
            .balance;

    assertEquals(BigDecimal.valueOf(100), currentBalance);

    testkit
        .runAskWithStatus(
            Done.class, replyTo -> new AccountEntity.Withdraw(BigDecimal.valueOf(10), replyTo))
        .expectValue(Done.getInstance());

    // can save the persistence effect for in-depth inspection
    PersistenceEffect<AccountEntity.Withdrawn> withdrawEffect =
        unpersistent.getEventProbe().expectPersistedClass(AccountEntity.Withdrawn.class);
    assertEquals(BigDecimal.valueOf(10), withdrawEffect.persistedObject().amount);
    assertEquals(3L, withdrawEffect.sequenceNr());
    assertTrue(withdrawEffect.tags().isEmpty());

    currentBalance =
        testkit
            .runAsk(AccountEntity.CurrentBalance.class, AccountEntity.GetBalance::new)
            .receiveReply()
            .balance;

    assertEquals(BigDecimal.valueOf(90), currentBalance);
  }

  @Test
  public void rejectWithdrawOverdraft() {
    UnpersistentBehavior<AccountEntity.Command, AccountEntity.Event, AccountEntity.Account>
        unpersistent = accountWithBalance(BigDecimal.valueOf(100));

    BehaviorTestKit<AccountEntity.Command> testkit = unpersistent.getBehaviorTestKit();

    testkit
        .runAskWithStatus(
            Done.class, replyTo -> new AccountEntity.Withdraw(BigDecimal.valueOf(110), replyTo))
        .expectErrorMessage("not enough funds to withdraw 110");

    assertFalse(unpersistent.getEventProbe().hasEffects());
  }

}
```

`UnpersistentBehavior` does not require any configuration. It therefore does not verify the serialization of commands, events, or state. If using this style, it is advised to independently test serialization for those classes.

## Unit testing with the the ActorTestKit and EventSourcedBehaviorTestKit

**Note!** The `EventSourcedBehaviorTestKit` is a new feature: the API may have changes breaking source compatibility in future versions.

Unit testing of `EventSourcedBehavior` can be done with the [`EventSourcedBehaviorTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html "akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit")[`EventSourcedBehaviorTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html "akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit"). It supports running one command at a time and you can assert that the synchronously returned result is as expected. The result contains the events emitted by the command and the new state after applying the events. It also has support for verifying the reply to a command.

You need to configure the `ActorSystem` with the `EventSourcedBehaviorTestKit.config`. The configuration enables the in\-memory journal and snapshot storage.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleDocSpec.scala#L23-L24 "Go to snippet source")class AccountExampleDocSpec
    extends ScalaTestWithActorTestKit(EventSourcedBehaviorTestKit.config)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleDocTest.java#L38-L46 "Go to snippet source")@ClassRule
public static final TestKitJunitResource testKit =
    new TestKitJunitResource(EventSourcedBehaviorTestKit.config());

private EventSourcedBehaviorTestKit<
        AccountEntity.Command, AccountEntity.Event, AccountEntity.Account>
    eventSourcedTestKit =
        EventSourcedBehaviorTestKit.create(
            testKit.system(), AccountEntity.create("1", PersistenceId.of("Account", "1")));
```

A full test for the `AccountEntity`, which is shown in the [Persistence Style Guide](persistence-style.html), may look like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleDocSpec.scala#L8-L81 "Go to snippet source")import akka.Done
import akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit
import akka.persistence.typed.PersistenceId
import akka.actor.testkit.typed.scaladsl.LogCapturing
import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.pattern.StatusReply
import org.scalatest.BeforeAndAfterEach
import org.scalatest.wordspec.AnyWordSpecLike

class AccountExampleDocSpec
    extends ScalaTestWithActorTestKit(EventSourcedBehaviorTestKit.config)
    with AnyWordSpecLike
    with BeforeAndAfterEach
    with LogCapturing {

  private val eventSourcedTestKit =
    EventSourcedBehaviorTestKit[AccountEntity.Command, AccountEntity.Event, AccountEntity.Account](
      system,
      AccountEntity("1", PersistenceId("Account", "1")))

  override protected def beforeEach(): Unit = {
    super.beforeEach()
    eventSourcedTestKit.clear()
  }

  "Account" must {

    "be created with zero balance" in {
      val result = eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.CreateAccount(_))
      result.reply shouldBe StatusReply.Ack
      result.event shouldBe AccountEntity.AccountCreated
      result.stateOfType[AccountEntity.OpenedAccount].balance shouldBe 0
    }

    "handle Withdraw" in {
      eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.CreateAccount(_))

      val result1 = eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.Deposit(100, _))
      result1.reply shouldBe StatusReply.Ack
      result1.event shouldBe AccountEntity.Deposited(100)
      result1.stateOfType[AccountEntity.OpenedAccount].balance shouldBe 100

      val result2 = eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.Withdraw(10, _))
      result2.reply shouldBe StatusReply.Ack
      result2.event shouldBe AccountEntity.Withdrawn(10)
      result2.stateOfType[AccountEntity.OpenedAccount].balance shouldBe 90
    }

    "reject Withdraw overdraft" in {
      eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.CreateAccount(_))
      eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.Deposit(100, _))

      val result = eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.Withdraw(110, _))
      result.reply.isError shouldBe true
      result.hasNoEvents shouldBe true
    }

    "handle GetBalance" in {
      eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.CreateAccount(_))
      eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.Deposit(100, _))

      val result = eventSourcedTestKit.runCommand[AccountEntity.CurrentBalance](AccountEntity.GetBalance(_))
      result.reply.balance shouldBe 100
      result.hasNoEvents shouldBe true
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleDocTest.java#L15-L131 "Go to snippet source")import java.math.BigDecimal;
import akka.actor.testkit.typed.javadsl.LogCapturing;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.typed.ActorRef;
import akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit;
import akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.CommandResultWithReply;
import akka.persistence.typed.PersistenceId;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

public class AccountExampleDocTest
{

  @ClassRule
  public static final TestKitJunitResource testKit =
      new TestKitJunitResource(EventSourcedBehaviorTestKit.config());

  private EventSourcedBehaviorTestKit<
          AccountEntity.Command, AccountEntity.Event, AccountEntity.Account>
      eventSourcedTestKit =
          EventSourcedBehaviorTestKit.create(
              testKit.system(), AccountEntity.create("1", PersistenceId.of("Account", "1")));

  @Rule public final LogCapturing logCapturing = new LogCapturing();

  @Before
  public void beforeEach() {
    eventSourcedTestKit.clear();
  }

  @Test
  public void createWithEmptyBalance() {
    CommandResultWithReply<
            AccountEntity.Command, AccountEntity.Event, AccountEntity.Account, StatusReply<Done>>
        result = eventSourcedTestKit.runCommand(AccountEntity.CreateAccount::new);
    assertEquals(StatusReply.ack(), result.reply());
    assertEquals(AccountEntity.AccountCreated.INSTANCE, result.event());
    assertEquals(BigDecimal.ZERO, result.stateOfType(AccountEntity.OpenedAccount.class).balance);
  }

  @Test
  public void createWithUnHandle() {
    CommandResultWithReply<
            AccountEntity.Command, AccountEntity.Event, AccountEntity.Account, StatusReply<Done>>
        result = eventSourcedTestKit.runCommand(AccountEntity.CreateAccount::new);
    assertFalse(result.hasNoReply());
  }

  @Test
  public void handleWithdraw() {
    eventSourcedTestKit.runCommand(AccountEntity.CreateAccount::new);

    CommandResultWithReply<
            AccountEntity.Command, AccountEntity.Event, AccountEntity.Account, StatusReply<Done>>
        result1 =
            eventSourcedTestKit.runCommand(
                replyTo -> new AccountEntity.Deposit(BigDecimal.valueOf(100), replyTo));
    assertEquals(StatusReply.ack(), result1.reply());
    assertEquals(
        BigDecimal.valueOf(100), result1.eventOfType(AccountEntity.Deposited.class).amount);
    assertEquals(
        BigDecimal.valueOf(100), result1.stateOfType(AccountEntity.OpenedAccount.class).balance);

    CommandResultWithReply<
            AccountEntity.Command, AccountEntity.Event, AccountEntity.Account, StatusReply<Done>>
        result2 =
            eventSourcedTestKit.runCommand(
                replyTo -> new AccountEntity.Withdraw(BigDecimal.valueOf(10), replyTo));
    assertEquals(StatusReply.ack(), result2.reply());
    assertEquals(BigDecimal.valueOf(10), result2.eventOfType(AccountEntity.Withdrawn.class).amount);
    assertEquals(
        BigDecimal.valueOf(90), result2.stateOfType(AccountEntity.OpenedAccount.class).balance);
  }

  @Test
  public void rejectWithdrawOverdraft() {
    eventSourcedTestKit.runCommand(AccountEntity.CreateAccount::new);
    eventSourcedTestKit.runCommand(
        (ActorRef<StatusReply<Done>> replyTo) ->
            new AccountEntity.Deposit(BigDecimal.valueOf(100), replyTo));

    CommandResultWithReply<
            AccountEntity.Command, AccountEntity.Event, AccountEntity.Account, StatusReply<Done>>
        result =
            eventSourcedTestKit.runCommand(
                replyTo -> new AccountEntity.Withdraw(BigDecimal.valueOf(110), replyTo));
    assertTrue(result.reply().isError());
    assertTrue(result.hasNoEvents());
  }

  @Test
  public void handleGetBalance() {
    eventSourcedTestKit.runCommand(AccountEntity.CreateAccount::new);
    eventSourcedTestKit.runCommand(
        (ActorRef<StatusReply<Done>> replyTo) ->
            new AccountEntity.Deposit(BigDecimal.valueOf(100), replyTo));

    CommandResultWithReply<
            AccountEntity.Command,
            AccountEntity.Event,
            AccountEntity.Account,
            AccountEntity.CurrentBalance>
        result = eventSourcedTestKit.runCommand(AccountEntity.GetBalance::new);
    assertEquals(BigDecimal.valueOf(100), result.reply().balance);
  }
}
```

Serialization of commands, events and state are verified automatically. The serialization checks can be customized with the `SerializationSettings` when creating the `EventSourcedBehaviorTestKit`. By default, the serialization roundtrip is checked but the equality of the result of the serialization is not checked. `equals` must be implemented (or using `case class`) in the commands, events and state if `verifyEquality` is enabled.

To test recovery the `restart` method of the `EventSourcedBehaviorTestKit` can be used. It will restart the behavior, which will then recover from stored snapshot and events from previous commands. It’s also possible to populate the storage with events or simulate failures by using the underlying [`PersistenceTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/PersistenceTestKit.html "akka.persistence.testkit.javadsl.PersistenceTestKit")[`PersistenceTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html "akka.persistence.testkit.scaladsl.PersistenceTestKit").

## Persistence TestKit

**Note!** The `PersistenceTestKit` is a new feature: the API may have changes breaking source compatibility in future versions.

Persistence testkit allows to check events saved in a storage, emulate storage operations and exceptions. To use the testkit you need to add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-testkit" % AkkaVersion
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
    <artifactId>akka-persistence-testkit_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

There are two testkit classes which have similar api:

- [`PersistenceTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/PersistenceTestKit.html "akka.persistence.testkit.javadsl.PersistenceTestKit")[`PersistenceTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html "akka.persistence.testkit.scaladsl.PersistenceTestKit") class is for events
- [`SnapshotTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/SnapshotTestKit.html "akka.persistence.testkit.javadsl.SnapshotTestKit")[`SnapshotTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.html "akka.persistence.testkit.scaladsl.SnapshotTestKit") class is for snapshots

The testkit classes have two corresponding plugins which emulate the behavior of the storages: 

- [`PersistenceTestKitPlugin`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html "akka.persistence.testkit.PersistenceTestKitPlugin")[`PersistenceTestKitPlugin`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html "akka.persistence.testkit.PersistenceTestKitPlugin") class emulates a events storage
- [`PersistenceTestKitSnapshotPlugin`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html "akka.persistence.testkit.PersistenceTestKitSnapshotPlugin")[`PersistenceTestKitSnapshotPlugin`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html "akka.persistence.testkit.PersistenceTestKitSnapshotPlugin") class emulates a snapshots storage

**Note!** The corresponding plugins **must** be configured in the actor system which is used to initialize the particular testkit class:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/testkit/Configuration.scala#L15-L22 "Go to snippet source")  
val yourConfiguration = ConfigFactory.defaultApplication()

val system =
  ActorSystem(??? /*some behavior*/, "test-system", PersistenceTestKitPlugin.config.withFallback(yourConfiguration))

val testKit = PersistenceTestKit(system)

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/testkit/Configuration.java#L19-L29 "Go to snippet source")public class PersistenceTestKitConfig {

  Config conf =
      PersistenceTestKitPlugin.getInstance()
          .config()
          .withFallback(ConfigFactory.defaultApplication());

  ActorSystem<Command> system = ActorSystem.create(new SomeBehavior(), "example", conf);

  PersistenceTestKit testKit = PersistenceTestKit.create(system);
}
```

and

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/testkit/Configuration.scala#L30-L39 "Go to snippet source")  
val yourConfiguration = ConfigFactory.defaultApplication()

val system = ActorSystem(
  ??? /*some behavior*/,
  "test-system",
  PersistenceTestKitSnapshotPlugin.config.withFallback(yourConfiguration))

val testKit = SnapshotTestKit(system)

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/testkit/Configuration.java#L33-L43 "Go to snippet source")public class SnapshotTestKitConfig {

  Config conf =
      PersistenceTestKitSnapshotPlugin.getInstance()
          .config()
          .withFallback(ConfigFactory.defaultApplication());

  ActorSystem<Command> system = ActorSystem.create(new SomeBehavior(), "example", conf);

  SnapshotTestKit testKit = SnapshotTestKit.create(system);
}
```

A typical scenario is to create a persistent actor, send commands to it and check that it persists events as it is expected:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/testkit/TestKitExamples.scala#L30-L65 "Go to snippet source")import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.persistence.testkit.PersistenceTestKitPlugin
import akka.persistence.testkit.scaladsl.PersistenceTestKit

class PersistenceTestKitSampleSpec
    extends ScalaTestWithActorTestKit(PersistenceTestKitPlugin.config.withFallback(ConfigFactory.defaultApplication()))
    with AnyWordSpecLike
    with BeforeAndAfterEach {

  val persistenceTestKit = PersistenceTestKit(system)

  override def beforeEach(): Unit = {
    persistenceTestKit.clearAll()
  }

  "Persistent actor" should {

    "persist all events" in {

      val persistenceId = PersistenceId.ofUniqueId("your-persistence-id")
      val persistentActor = spawn(
        EventSourcedBehavior[Cmd, Evt, State](
          persistenceId,
          emptyState = State.empty,
          commandHandler = (_, cmd) => Effect.persist(Evt(cmd.data)),
          eventHandler = (state, evt) => state.updated(evt)))
      val cmd = Cmd("data")

      persistentActor ! cmd

      val expectedPersistedEvent = Evt(cmd.data)
      persistenceTestKit.expectNextPersisted(persistenceId.id, expectedPersistedEvent)
    }

  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/testkit/PersistenceTestKitSampleTest.java#L26-L124 "Go to snippet source")public class PersistenceTestKitSampleTest extends AbstractJavaTest {

  @ClassRule
  public static final TestKitJunitResource testKit =
      new TestKitJunitResource(
          PersistenceTestKitPlugin.getInstance()
              .config()
              .withFallback(ConfigFactory.defaultApplication()));

  PersistenceTestKit persistenceTestKit = PersistenceTestKit.create(testKit.system());

  @Before
  public void beforeEach() {
    persistenceTestKit.clearAll();
  }

  @Test
  public void test() {
    PersistenceId persistenceId = PersistenceId.ofUniqueId("some-id");
    ActorRef<YourPersistentBehavior.Cmd> ref =
        testKit.spawn(YourPersistentBehavior.create(persistenceId));

    YourPersistentBehavior.Cmd cmd = new YourPersistentBehavior.Cmd("data");
    ref.tell(cmd);
    YourPersistentBehavior.Evt expectedEventPersisted = new YourPersistentBehavior.Evt(cmd.data);

    persistenceTestKit.expectNextPersisted(persistenceId.id(), expectedEventPersisted);
  }
}

class YourPersistentBehavior
    extends EventSourcedBehavior<
        YourPersistentBehavior.Cmd, YourPersistentBehavior.Evt, YourPersistentBehavior.State> {

  static final class Cmd implements CborSerializable {

    public final String data;

    @JsonCreator
    public Cmd(String data) {
      this.data = data;
    }
  }

  static final class Evt implements CborSerializable {

    public final String data;

    @JsonCreator
    public Evt(String data) {
      this.data = data;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Evt evt = (Evt) o;

      return data.equals(evt.data);
    }

    @Override
    public int hashCode() {
      return data.hashCode();
    }
  }

  static final class State implements CborSerializable {}

  static Behavior<Cmd> create(PersistenceId persistenceId) {
    return Behaviors.setup(context -> new YourPersistentBehavior(persistenceId));
  }

  private YourPersistentBehavior(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    // some state
    return new State();
  }

  @Override
  public CommandHandler<Cmd, Evt, State> commandHandler() {
    return newCommandHandlerBuilder()
        .forAnyState()
        .onCommand(Cmd.class, command -> Effect().persist(new Evt(command.data)))
        .build();
  }

  @Override
  public EventHandler<State, Evt> eventHandler() {
    // TODO handle events
    return newEventHandlerBuilder().forAnyState().onEvent(Evt.class, (state, evt) -> state).build();
  }
}
```

You can safely use persistence testkit in combination with main akka testkit.

The main methods of the api allow to (see [`PersistenceTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/PersistenceTestKit.html "akka.persistence.testkit.javadsl.PersistenceTestKit")[`PersistenceTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html "akka.persistence.testkit.scaladsl.PersistenceTestKit") and [`SnapshotTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/SnapshotTestKit.html "akka.persistence.testkit.javadsl.SnapshotTestKit")[`SnapshotTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.html "akka.persistence.testkit.scaladsl.SnapshotTestKit") for more details):

- check if the given event/snapshot object is the next persisted in the storage.
- read a sequence of persisted events/snapshots.
- check that no events/snapshots have been persisted in the storage.
- throw the default exception from the storage on attempt to persist, read or delete the following event/snapshot.
- clear the events/snapshots persisted in the storage.
- reject the events, but not snapshots (rejections are not supported for snapshots in the original api).
- set your own [policy](#setting-your-own-policy-for-the-storage) which emulates the work of the storage. Policy determines what to do when persistence needs to execute some operation on the storage (i.e. read, delete, etc.).
- get all the events/snapshots persisted in the storage
- put the events/snapshots in the storage to test recovery

#### Setting your own policy for the storage

You can implement and set your own policy for the storage to control its actions on particular operations, for example you can fail or reject events on your own conditions. Implement the [`ProcessingPolicy[EventStorage.JournalOperation]`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html "akka.persistence.testkit.ProcessingPolicy")[`ProcessingPolicy<EventStorage.JournalOperation>`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html "akka.persistence.testkit.ProcessingPolicy") traitinterface for event storage or [`ProcessingPolicy[SnapshotStorage.SnapshotOperation]`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html "akka.persistence.testkit.ProcessingPolicy")[`ProcessingPolicy<SnapshotStorage.SnapshotOperation>`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html "akka.persistence.testkit.ProcessingPolicy") traitinterface for snapshot storage, and set it with `withPolicy()` method.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/testkit/TestKitExamples.scala#L125-L165 "Go to snippet source")class PersistenceTestKitSampleSpecWithPolicy
    extends ScalaTestWithActorTestKit(PersistenceTestKitPlugin.config.withFallback(ConfigFactory.defaultApplication()))
    with AnyWordSpecLike
    with BeforeAndAfterEach {

  val persistenceTestKit = PersistenceTestKit(system)

  override def beforeEach(): Unit = {
    persistenceTestKit.clearAll()
    persistenceTestKit.resetPolicy()
  }

  "Testkit policy" should {

    "fail all operations with custom exception" in {
      val policy = new EventStorage.JournalPolicies.PolicyType {

        class CustomFailure extends RuntimeException

        override def tryProcess(persistenceId: String, processingUnit: JournalOperation): ProcessingResult =
          processingUnit match {
            case WriteEvents(_) => StorageFailure(new CustomFailure)
            case _              => ProcessingSuccess
          }
      }
      persistenceTestKit.withPolicy(policy)

      val persistenceId = PersistenceId.ofUniqueId("your-persistence-id")
      val persistentActor = spawn(
        EventSourcedBehavior[Cmd, Evt, State](
          persistenceId,
          emptyState = State.empty,
          commandHandler = (_, cmd) => Effect.persist(Evt(cmd.data)),
          eventHandler = (state, evt) => state.updated(evt)))

      persistentActor ! Cmd("data")
      persistenceTestKit.expectNothingPersisted(persistenceId.id)

    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/testkit/PersistenceTestKitPolicySampleTest.java#L25-L67 "Go to snippet source")public class PersistenceTestKitPolicySampleTest extends AbstractJavaTest {

  @ClassRule
  public static final TestKitJunitResource testKit =
      new TestKitJunitResource(
          PersistenceTestKitPlugin.getInstance()
              .config()
              .withFallback(ConfigFactory.defaultApplication()));

  PersistenceTestKit persistenceTestKit = PersistenceTestKit.create(testKit.system());

  @Before
  public void beforeEach() {
    persistenceTestKit.clearAll();
    persistenceTestKit.resetPolicy();
  }

  @Test
  public void test() {
    SampleEventStoragePolicy policy = new SampleEventStoragePolicy();
    persistenceTestKit.withPolicy(policy);

    PersistenceId persistenceId = PersistenceId.ofUniqueId("some-id");
    ActorRef<YourPersistentBehavior.Cmd> ref =
        testKit.spawn(YourPersistentBehavior.create(persistenceId));

    YourPersistentBehavior.Cmd cmd = new YourPersistentBehavior.Cmd("data");
    ref.tell(cmd);

    persistenceTestKit.expectNothingPersisted(persistenceId.id());
  }

  static class SampleEventStoragePolicy implements ProcessingPolicy<JournalOperation> {
    @Override
    public ProcessingResult tryProcess(String processId, JournalOperation processingUnit) {
      if (processingUnit instanceof WriteEvents) {
        return StorageFailure.create();
      } else {
        return ProcessingSuccess.getInstance();
      }
    }
  }
}
```

`tryProcess()` method of the [`ProcessingPolicy`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html "akka.persistence.testkit.ProcessingPolicy")[`ProcessingPolicy`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html "akka.persistence.testkit.ProcessingPolicy") has two arguments: persistence id and the storage operation. 

Event storage has the following operations:

- [`ReadEvents`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ReadEvents.html "akka.persistence.testkit.ReadEvents")[`ReadEvents`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadEvents.html "akka.persistence.testkit.ReadEvents") Read the events from the storage.
- [`WriteEvents`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/WriteEvents.html "akka.persistence.testkit.WriteEvents")[`WriteEvents`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/WriteEvents.html "akka.persistence.testkit.WriteEvents") Write the events to the storage.
- [`DeleteEvents`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/DeleteEvents.html "akka.persistence.testkit.DeleteEvents")[`DeleteEvents`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteEvents.html "akka.persistence.testkit.DeleteEvents") Delete the events from the storage.
- [`ReadSeqNum`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ReadSeqNum$.html "akka.persistence.testkit.ReadSeqNum")[`ReadSeqNum`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadSeqNum.html "akka.persistence.testkit.ReadSeqNum") Read the highest sequence number for particular persistence id.

Snapshot storage has the following operations:

- [`ReadSnapshot`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ReadSnapshot.html "akka.persistence.testkit.ReadSnapshot")[`ReadSnapshot`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadSnapshot.html "akka.persistence.testkit.ReadSnapshot") Read the snapshot from the storage.
- [`WriteSnapshot`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/WriteSnapshot.html "akka.persistence.testkit.WriteSnapshot")[`WriteSnapshot`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/WriteSnapshot.html "akka.persistence.testkit.WriteSnapshot") Writhe the snapshot to the storage.
- [`DeleteSnapshotsByCriteria`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotsByCriteria.html "akka.persistence.testkit.DeleteSnapshotsByCriteria")[`DeleteSnapshotsByCriteria`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotsByCriteria.html "akka.persistence.testkit.DeleteSnapshotsByCriteria") Delete snapshots in the storage by criteria.
- [`DeleteSnapshotByMeta`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotByMeta.html "akka.persistence.testkit.DeleteSnapshotByMeta")[`DeleteSnapshotByMeta`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotByMeta.html "akka.persistence.testkit.DeleteSnapshotByMeta") Delete particular snapshot from the storage by its metadata.

The `tryProcess()` method must return one of the processing results:

- [`ProcessingSuccess`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess.html "akka.persistence.testkit.ProcessingSuccess")[`ProcessingSuccess`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess.html "akka.persistence.testkit.ProcessingSuccess") Successful completion of the operation. All the events will be saved/read/deleted.
- [`StorageFailure`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/StorageFailure.html "akka.persistence.testkit.StorageFailure")[`StorageFailure`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/StorageFailure.html "akka.persistence.testkit.StorageFailure") Emulates exception from the storage.
- [`Reject`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/Reject.html "akka.persistence.testkit.Reject")[`Reject`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/Reject.html "akka.persistence.testkit.Reject") Emulates rejection from the storage.

**Note** that snapshot storage does not have rejections. If you return `Reject` in the `tryProcess()` of the snapshot storage policy, it will have the same effect as the `StorageFailure`.

Here is an example of the policy for an event storage:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/testkit/TestKitExamples.scala#L69-L93 "Go to snippet source")import akka.persistence.testkit._

class SampleEventStoragePolicy extends EventStorage.JournalPolicies.PolicyType {

  //you can use internal state, it does not need to be thread safe
  var count = 1

  override def tryProcess(persistenceId: String, processingUnit: JournalOperation): ProcessingResult =
    if (count < 10) {
      count += 1
      //check the type of operation and react with success or with reject or with failure.
      //if you return ProcessingSuccess the operation will be performed, otherwise not.
      processingUnit match {
        case ReadEvents(batch) if batch.nonEmpty => ProcessingSuccess
        case WriteEvents(batch) if batch.size > 1 =>
          ProcessingSuccess
        case ReadSeqNum      => StorageFailure()
        case DeleteEvents(_) => Reject()
        case _               => StorageFailure()
      }
    } else {
      ProcessingSuccess
    }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/testkit/TestKitExamples.java#L26-L57 "Go to snippet source")class SampleEventStoragePolicy implements ProcessingPolicy<JournalOperation> {

  // you can use internal state, it does not need to be thread safe
  int count = 1;

  @Override
  public ProcessingResult tryProcess(String processId, JournalOperation processingUnit) {
    // check the type of operation and react with success or with reject or with failure.
    // if you return ProcessingSuccess the operation will be performed, otherwise not.
    if (count < 10) {
      count += 1;
      if (processingUnit instanceof ReadEvents) {
        ReadEvents read = (ReadEvents) processingUnit;
        if (read.batch().nonEmpty()) {
          ProcessingSuccess.getInstance();
        } else {
          return StorageFailure.create();
        }
      } else if (processingUnit instanceof WriteEvents) {
        return ProcessingSuccess.getInstance();
      } else if (processingUnit instanceof DeleteEvents) {
        return ProcessingSuccess.getInstance();
      } else if (processingUnit.equals(ReadSeqNum.getInstance())) {
        return Reject.create();
      }
      // you can set your own exception
      return StorageFailure.create(new RuntimeException("your exception"));
    } else {
      return ProcessingSuccess.getInstance();
    }
  }
}
```

Here is an example of the policy for a snapshot storage:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/testkit/TestKitExamples.scala#L98-L121 "Go to snippet source")class SampleSnapshotStoragePolicy extends SnapshotStorage.SnapshotPolicies.PolicyType {

  //you can use internal state, it does not need to be thread safe
  var count = 1

  override def tryProcess(persistenceId: String, processingUnit: SnapshotOperation): ProcessingResult =
    if (count < 10) {
      count += 1
      //check the type of operation and react with success or with reject or with failure.
      //if you return ProcessingSuccess the operation will be performed, otherwise not.
      processingUnit match {
        case ReadSnapshot(_, payload) if payload.nonEmpty =>
          ProcessingSuccess
        case WriteSnapshot(meta, payload) if meta.sequenceNr > 10 =>
          ProcessingSuccess
        case DeleteSnapshotsByCriteria(_) => StorageFailure()
        case DeleteSnapshotByMeta(meta) if meta.sequenceNr < 10 =>
          ProcessingSuccess
        case _ => StorageFailure()
      }
    } else {
      ProcessingSuccess
    }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/testkit/TestKitExamples.java#L61-L92 "Go to snippet source")class SnapshotStoragePolicy implements ProcessingPolicy<SnapshotOperation> {

  // you can use internal state, it doesn't need to be thread safe
  int count = 1;

  @Override
  public ProcessingResult tryProcess(String processId, SnapshotOperation processingUnit) {
    // check the type of operation and react with success or with failure.
    // if you return ProcessingSuccess the operation will be performed, otherwise not.
    if (count < 10) {
      count += 1;
      if (processingUnit instanceof ReadSnapshot) {
        ReadSnapshot read = (ReadSnapshot) processingUnit;
        if (read.getSnapshot().isPresent()) {
          ProcessingSuccess.getInstance();
        } else {
          return StorageFailure.create();
        }
      } else if (processingUnit instanceof WriteSnapshot) {
        return ProcessingSuccess.getInstance();
      } else if (processingUnit instanceof DeleteSnapshotsByCriteria) {
        return ProcessingSuccess.getInstance();
      } else if (processingUnit instanceof DeleteSnapshotByMeta) {
        return ProcessingSuccess.getInstance();
      }
      // you can set your own exception
      return StorageFailure.create(new RuntimeException("your exception"));
    } else {
      return ProcessingSuccess.getInstance();
    }
  }
}
```

### Configuration of Persistence TestKit

There are several configuration properties for persistence testkit, please refer to the [reference configuration](../general/configuration-reference.html#config-akka-persistence-testkit)

## Integration testing

`EventSourcedBehavior` actors can be tested with the [ActorTestKit](testing-async.html) together with other actors. The in\-memory journal and snapshot storage from the [Persistence TestKit](persistence-testing.html#persistence-testkit) can be used also for integration style testing of a single `ActorSystem`, for example when using Cluster Sharding with a single Cluster node.

For tests that involve more than one Cluster node you have to use another journal and snapshot store. While it’s possible to use the [Persistence Plugin Proxy](../persistence-plugins.html#persistence-plugin-proxy) it’s often better and more realistic to use a real database.

The [Microservices with Akka tutorial](https://doc.akka.io/libraries/guide/microservices-tutorial/) includes tests that are using a real database.

### Plugin initialization

Some Persistence plugins create tables automatically, but has the limitation that it can’t be done concurrently from several ActorSystems. That can be a problem if the test creates a Cluster and all nodes tries to initialize the plugins at the same time. To coordinate initialization you can use the `PersistenceInit` utility.

`PersistenceInit` is part of `akka-persistence-testkit` and you need to add the dependency to your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-testkit" % AkkaVersion
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
    <artifactId>akka-persistence-testkit_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/testkit/PersistenceInitSpec.scala#L14-L19 "Go to snippet source")import akka.persistence.testkit.scaladsl.PersistenceInit

import scala.concurrent.Await
import scala.concurrent.Future
import scala.concurrent.duration._

val timeout = 5.seconds
val done: Future[Done] = PersistenceInit.initializeDefaultPlugins(system, timeout)
Await.result(done, timeout)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/testkit/PersistenceInitTest.java#L17-L23 "Go to snippet source")import akka.persistence.testkit.javadsl.PersistenceInit;
import akka.Done;

import java.time.Duration;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

Duration timeout = Duration.ofSeconds(5);
CompletionStage<Done> done =
    PersistenceInit.initializeDefaultPlugins(testKit.system(), timeout);
done.toCompletableFuture().get(timeout.getSeconds(), TimeUnit.SECONDS);
```

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-testkit" % AkkaVersion % Test
)
```

### Example 2: Module info

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
    <artifactId>akka-persistence-typed_${scala.binary.version}</artifactId>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-testkit_${scala.binary.version}</artifactId>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-persistence-typed_${versions.ScalaBinary}"
  testImplementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

### Example 4: Unit testing with the BehaviorTestKit

```scala
private def onAnEmptyAccount
    : UnpersistentBehavior.EventSourced[AccountEntity.Command, AccountEntity.Event, AccountEntity.Account] =
  UnpersistentBehavior.fromEventSourced(AccountEntity("1", PersistenceId("Account", "1")))
```

### Example 5: Unit testing with the BehaviorTestKit

```java
UnpersistentBehavior.fromEventSourced(
    AccountEntity.create("1", PersistenceId.of("Account", "1")),
    null, // use the initial state
    0 // initial sequence number
    );
```

### Example 6: Unit testing with the BehaviorTestKit

```scala
private def onAnOpenedAccount
    : UnpersistentBehavior.EventSourced[AccountEntity.Command, AccountEntity.Event, AccountEntity.Account] =
  UnpersistentBehavior.fromEventSourced(
    AccountEntity("1", PersistenceId("Account", "1")),
    Some(
      AccountEntity.EmptyAccount.applyEvent(AccountEntity.AccountCreated) -> // reuse the event handler
      1L // assume that CreateAccount was the first command
    ))
```

### Example 7: Unit testing with the BehaviorTestKit

```java
UnpersistentBehavior.fromEventSourced(
    AccountEntity.create("1", PersistenceId.of("Account", "1")),
    new AccountEntity.EmptyAccount()
        .openedAccount(), // duplicate the event handler for AccountCreated on an EmptyAccount
    1 // assume that CreateAccount was the first command
    );
```

### Example 8: Unit testing with the BehaviorTestKit

```scala
import akka.persistence.testkit.scaladsl.UnpersistentBehavior
import akka.persistence.typed.PersistenceId

class AccountExampleUnpersistentDocSpec
    extends AnyWordSpecLike
    {
  "Account" must {
    "be created with zero balance" in {
      onAnEmptyAccount { (testkit, eventProbe, snapshotProbe) =>
        testkit.runAskWithStatus[Done](AccountEntity.CreateAccount(_)).expectDone()

        eventProbe.expectPersisted(AccountEntity.AccountCreated)

        // internal state is only exposed by the behavior via responses to messages or if it happens
        //  to snapshot.  This particular behavior never snapshots, so we query within the actor's
        //  protocol
        snapshotProbe.hasEffects shouldBe false

        testkit.runAsk[AccountEntity.CurrentBalance](AccountEntity.GetBalance(_)).receiveReply().balance shouldBe 0
      }
    }

    "handle Deposit and Withdraw" in {
      onAnOpenedAccount { (testkit, eventProbe, _) =>
        testkit.runAskWithStatus[Done](AccountEntity.Deposit(100, _)).expectDone()

        eventProbe.expectPersisted(AccountEntity.Deposited(100))

        testkit.runAskWithStatus[Done](AccountEntity.Withdraw(10, _)).expectDone()

        eventProbe.expectPersisted(AccountEntity.Withdrawn(10))

        testkit.runAsk[AccountEntity.CurrentBalance](AccountEntity.GetBalance(_)).receiveReply().balance shouldBe 90
      }
    }

    "reject Withdraw overdraft" in {
      onAnAccountWithBalance(100) { (testkit, eventProbe, _) =>
        testkit.runAskWithStatus(AccountEntity.Withdraw(110, _)).receiveStatusReply().isError shouldBe true

        eventProbe.hasEffects shouldBe false
      }
    }
  }
}
```

### Example 9: Unit testing with the BehaviorTestKit

```java
import java.math.BigDecimal;
import akka.actor.testkit.typed.javadsl.BehaviorTestKit;
import akka.actor.testkit.typed.javadsl.ReplyInbox;
import akka.actor.testkit.typed.javadsl.StatusReplyInbox;
import akka.actor.testkit.typed.javadsl.TestInbox;
import akka.persistence.testkit.javadsl.UnpersistentBehavior;
import akka.persistence.testkit.javadsl.PersistenceEffect;
import akka.persistence.typed.PersistenceId;

import org.junit.Test;

public class AccountExampleUnpersistentDocTest
{
  @Test
  public void createWithEmptyBalance() {
    UnpersistentBehavior<AccountEntity.Command, AccountEntity.Event, AccountEntity.Account>
        unpersistent = emptyAccount();

    BehaviorTestKit<AccountEntity.Command> testkit = unpersistent.getBehaviorTestKit();

    StatusReplyInbox<Done> ackInbox = testkit.runAskWithStatus(AccountEntity.CreateAccount::new);

    ackInbox.expectValue(Done.getInstance());
    unpersistent.getEventProbe().expectPersisted(AccountEntity.AccountCreated.INSTANCE);

    // internal state is only exposed by the behavior via responses to messages or if it happens
    //  to snapshot.  This particular behavior never snapshots, so we query within the actor's
    //  protocol
    assertFalse(unpersistent.getSnapshotProbe().hasEffects());

    ReplyInbox<AccountEntity.CurrentBalance> currentBalanceInbox =
        testkit.runAsk(AccountEntity.GetBalance::new);

    assertEquals(BigDecimal.ZERO, currentBalanceInbox.receiveReply().balance);
  }

  @Test
  public void handleDepositAndWithdraw() {
    UnpersistentBehavior<AccountEntity.Command, AccountEntity.Event, AccountEntity.Account>
        unpersistent = openedAccount();

    BehaviorTestKit<AccountEntity.Command> testkit = unpersistent.getBehaviorTestKit();
    BigDecimal currentBalance;

    testkit
        .runAskWithStatus(
            Done.class, replyTo -> new AccountEntity.Deposit(BigDecimal.valueOf(100), replyTo))
        .expectValue(Done.getInstance());

    assertEquals(
        BigDecimal.valueOf(100),
        unpersistent
            .getEventProbe()
            .expectPersistedClass(AccountEntity.Deposited.class)
            .persistedObject()
            .amount);

    currentBalance =
        testkit
            .runAsk(AccountEntity.CurrentBalance.class, AccountEntity.GetBalance::new)
            .receiveReply()
            .balance;

    assertEquals(BigDecimal.valueOf(100), currentBalance);

    testkit
        .runAskWithStatus(
            Done.class, replyTo -> new AccountEntity.Withdraw(BigDecimal.valueOf(10), replyTo))
        .expectValue(Done.getInstance());

    // can save the persistence effect for in-depth inspection
    PersistenceEffect<AccountEntity.Withdrawn> withdrawEffect =
        unpersistent.getEventProbe().expectPersistedClass(AccountEntity.Withdrawn.class);
    assertEquals(BigDecimal.valueOf(10), withdrawEffect.persistedObject().amount);
    assertEquals(3L, withdrawEffect.sequenceNr());
    assertTrue(withdrawEffect.tags().isEmpty());

    currentBalance =
        testkit
            .runAsk(AccountEntity.CurrentBalance.class, AccountEntity.GetBalance::new)
            .receiveReply()
            .balance;

    assertEquals(BigDecimal.valueOf(90), currentBalance);
  }

  @Test
  public void rejectWithdrawOverdraft() {
    UnpersistentBehavior<AccountEntity.Command, AccountEntity.Event, AccountEntity.Account>
        unpersistent = accountWithBalance(BigDecimal.valueOf(100));

    BehaviorTestKit<AccountEntity.Command> testkit = unpersistent.getBehaviorTestKit();

    testkit
        .runAskWithStatus(
            Done.class, replyTo -> new AccountEntity.Withdraw(BigDecimal.valueOf(110), replyTo))
        .expectErrorMessage("not enough funds to withdraw 110");

    assertFalse(unpersistent.getEventProbe().hasEffects());
  }

}
```

### Example 10: Unit testing with the the ActorTestKit and EventSourcedBehaviorTestKit

```scala
class AccountExampleDocSpec
    extends ScalaTestWithActorTestKit(EventSourcedBehaviorTestKit.config)
```

### Example 11: Unit testing with the the ActorTestKit and EventSourcedBehaviorTestKit

```java
@ClassRule
public static final TestKitJunitResource testKit =
    new TestKitJunitResource(EventSourcedBehaviorTestKit.config());

private EventSourcedBehaviorTestKit<
        AccountEntity.Command, AccountEntity.Event, AccountEntity.Account>
    eventSourcedTestKit =
        EventSourcedBehaviorTestKit.create(
            testKit.system(), AccountEntity.create("1", PersistenceId.of("Account", "1")));
```

### Example 12: Unit testing with the the ActorTestKit and EventSourcedBehaviorTestKit

```scala
import akka.Done
import akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit
import akka.persistence.typed.PersistenceId
import akka.actor.testkit.typed.scaladsl.LogCapturing
import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.pattern.StatusReply
import org.scalatest.BeforeAndAfterEach
import org.scalatest.wordspec.AnyWordSpecLike

class AccountExampleDocSpec
    extends ScalaTestWithActorTestKit(EventSourcedBehaviorTestKit.config)
    with AnyWordSpecLike
    with BeforeAndAfterEach
    with LogCapturing {

  private val eventSourcedTestKit =
    EventSourcedBehaviorTestKit[AccountEntity.Command, AccountEntity.Event, AccountEntity.Account](
      system,
      AccountEntity("1", PersistenceId("Account", "1")))

  override protected def beforeEach(): Unit = {
    super.beforeEach()
    eventSourcedTestKit.clear()
  }

  "Account" must {

    "be created with zero balance" in {
      val result = eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.CreateAccount(_))
      result.reply shouldBe StatusReply.Ack
      result.event shouldBe AccountEntity.AccountCreated
      result.stateOfType[AccountEntity.OpenedAccount].balance shouldBe 0
    }

    "handle Withdraw" in {
      eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.CreateAccount(_))

      val result1 = eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.Deposit(100, _))
      result1.reply shouldBe StatusReply.Ack
      result1.event shouldBe AccountEntity.Deposited(100)
      result1.stateOfType[AccountEntity.OpenedAccount].balance shouldBe 100

      val result2 = eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.Withdraw(10, _))
      result2.reply shouldBe StatusReply.Ack
      result2.event shouldBe AccountEntity.Withdrawn(10)
      result2.stateOfType[AccountEntity.OpenedAccount].balance shouldBe 90
    }

    "reject Withdraw overdraft" in {
      eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.CreateAccount(_))
      eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.Deposit(100, _))

      val result = eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.Withdraw(110, _))
      result.reply.isError shouldBe true
      result.hasNoEvents shouldBe true
    }

    "handle GetBalance" in {
      eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.CreateAccount(_))
      eventSourcedTestKit.runCommand[StatusReply[Done]](AccountEntity.Deposit(100, _))

      val result = eventSourcedTestKit.runCommand[AccountEntity.CurrentBalance](AccountEntity.GetBalance(_))
      result.reply.balance shouldBe 100
      result.hasNoEvents shouldBe true
    }
  }
}
```

### Example 13: Unit testing with the the ActorTestKit and EventSourcedBehaviorTestKit

```java
import java.math.BigDecimal;
import akka.actor.testkit.typed.javadsl.LogCapturing;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.typed.ActorRef;
import akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit;
import akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.CommandResultWithReply;
import akka.persistence.typed.PersistenceId;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

public class AccountExampleDocTest
{

  @ClassRule
  public static final TestKitJunitResource testKit =
      new TestKitJunitResource(EventSourcedBehaviorTestKit.config());

  private EventSourcedBehaviorTestKit<
          AccountEntity.Command, AccountEntity.Event, AccountEntity.Account>
      eventSourcedTestKit =
          EventSourcedBehaviorTestKit.create(
              testKit.system(), AccountEntity.create("1", PersistenceId.of("Account", "1")));

  @Rule public final LogCapturing logCapturing = new LogCapturing();

  @Before
  public void beforeEach() {
    eventSourcedTestKit.clear();
  }

  @Test
  public void createWithEmptyBalance() {
    CommandResultWithReply<
            AccountEntity.Command, AccountEntity.Event, AccountEntity.Account, StatusReply<Done>>
        result = eventSourcedTestKit.runCommand(AccountEntity.CreateAccount::new);
    assertEquals(StatusReply.ack(), result.reply());
    assertEquals(AccountEntity.AccountCreated.INSTANCE, result.event());
    assertEquals(BigDecimal.ZERO, result.stateOfType(AccountEntity.OpenedAccount.class).balance);
  }

  @Test
  public void createWithUnHandle() {
    CommandResultWithReply<
            AccountEntity.Command, AccountEntity.Event, AccountEntity.Account, StatusReply<Done>>
        result = eventSourcedTestKit.runCommand(AccountEntity.CreateAccount::new);
    assertFalse(result.hasNoReply());
  }

  @Test
  public void handleWithdraw() {
    eventSourcedTestKit.runCommand(AccountEntity.CreateAccount::new);

    CommandResultWithReply<
            AccountEntity.Command, AccountEntity.Event, AccountEntity.Account, StatusReply<Done>>
        result1 =
            eventSourcedTestKit.runCommand(
                replyTo -> new AccountEntity.Deposit(BigDecimal.valueOf(100), replyTo));
    assertEquals(StatusReply.ack(), result1.reply());
    assertEquals(
        BigDecimal.valueOf(100), result1.eventOfType(AccountEntity.Deposited.class).amount);
    assertEquals(
        BigDecimal.valueOf(100), result1.stateOfType(AccountEntity.OpenedAccount.class).balance);

    CommandResultWithReply<
            AccountEntity.Command, AccountEntity.Event, AccountEntity.Account, StatusReply<Done>>
        result2 =
            eventSourcedTestKit.runCommand(
                replyTo -> new AccountEntity.Withdraw(BigDecimal.valueOf(10), replyTo));
    assertEquals(StatusReply.ack(), result2.reply());
    assertEquals(BigDecimal.valueOf(10), result2.eventOfType(AccountEntity.Withdrawn.class).amount);
    assertEquals(
        BigDecimal.valueOf(90), result2.stateOfType(AccountEntity.OpenedAccount.class).balance);
  }

  @Test
  public void rejectWithdrawOverdraft() {
    eventSourcedTestKit.runCommand(AccountEntity.CreateAccount::new);
    eventSourcedTestKit.runCommand(
        (ActorRef<StatusReply<Done>> replyTo) ->
            new AccountEntity.Deposit(BigDecimal.valueOf(100), replyTo));

    CommandResultWithReply<
            AccountEntity.Command, AccountEntity.Event, AccountEntity.Account, StatusReply<Done>>
        result =
            eventSourcedTestKit.runCommand(
                replyTo -> new AccountEntity.Withdraw(BigDecimal.valueOf(110), replyTo));
    assertTrue(result.reply().isError());
    assertTrue(result.hasNoEvents());
  }

  @Test
  public void handleGetBalance() {
    eventSourcedTestKit.runCommand(AccountEntity.CreateAccount::new);
    eventSourcedTestKit.runCommand(
        (ActorRef<StatusReply<Done>> replyTo) ->
            new AccountEntity.Deposit(BigDecimal.valueOf(100), replyTo));

    CommandResultWithReply<
            AccountEntity.Command,
            AccountEntity.Event,
            AccountEntity.Account,
            AccountEntity.CurrentBalance>
        result = eventSourcedTestKit.runCommand(AccountEntity.GetBalance::new);
    assertEquals(BigDecimal.valueOf(100), result.reply().balance);
  }
}
```

### Example 14: Persistence TestKit

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-testkit" % AkkaVersion
```

### Example 15: Persistence TestKit

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
    <artifactId>akka-persistence-testkit_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 16: Persistence TestKit

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

### Example 17: Persistence TestKit

```scala
val yourConfiguration = ConfigFactory.defaultApplication()

val system =
  ActorSystem(??? /*some behavior*/, "test-system", PersistenceTestKitPlugin.config.withFallback(yourConfiguration))

val testKit = PersistenceTestKit(system)
```

### Example 18: Persistence TestKit

```java
public class PersistenceTestKitConfig {

  Config conf =
      PersistenceTestKitPlugin.getInstance()
          .config()
          .withFallback(ConfigFactory.defaultApplication());

  ActorSystem<Command> system = ActorSystem.create(new SomeBehavior(), "example", conf);

  PersistenceTestKit testKit = PersistenceTestKit.create(system);
}
```

### Example 19: Persistence TestKit

```scala
val yourConfiguration = ConfigFactory.defaultApplication()

val system = ActorSystem(
  ??? /*some behavior*/,
  "test-system",
  PersistenceTestKitSnapshotPlugin.config.withFallback(yourConfiguration))

val testKit = SnapshotTestKit(system)
```

### Example 20: Persistence TestKit

```java
public class SnapshotTestKitConfig {

  Config conf =
      PersistenceTestKitSnapshotPlugin.getInstance()
          .config()
          .withFallback(ConfigFactory.defaultApplication());

  ActorSystem<Command> system = ActorSystem.create(new SomeBehavior(), "example", conf);

  SnapshotTestKit testKit = SnapshotTestKit.create(system);
}
```

### Example 21: Persistence TestKit

```scala
import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.persistence.testkit.PersistenceTestKitPlugin
import akka.persistence.testkit.scaladsl.PersistenceTestKit

class PersistenceTestKitSampleSpec
    extends ScalaTestWithActorTestKit(PersistenceTestKitPlugin.config.withFallback(ConfigFactory.defaultApplication()))
    with AnyWordSpecLike
    with BeforeAndAfterEach {

  val persistenceTestKit = PersistenceTestKit(system)

  override def beforeEach(): Unit = {
    persistenceTestKit.clearAll()
  }

  "Persistent actor" should {

    "persist all events" in {

      val persistenceId = PersistenceId.ofUniqueId("your-persistence-id")
      val persistentActor = spawn(
        EventSourcedBehavior[Cmd, Evt, State](
          persistenceId,
          emptyState = State.empty,
          commandHandler = (_, cmd) => Effect.persist(Evt(cmd.data)),
          eventHandler = (state, evt) => state.updated(evt)))
      val cmd = Cmd("data")

      persistentActor ! cmd

      val expectedPersistedEvent = Evt(cmd.data)
      persistenceTestKit.expectNextPersisted(persistenceId.id, expectedPersistedEvent)
    }

  }
}
```

### Example 22: Persistence TestKit

```java
public class PersistenceTestKitSampleTest extends AbstractJavaTest {

  @ClassRule
  public static final TestKitJunitResource testKit =
      new TestKitJunitResource(
          PersistenceTestKitPlugin.getInstance()
              .config()
              .withFallback(ConfigFactory.defaultApplication()));

  PersistenceTestKit persistenceTestKit = PersistenceTestKit.create(testKit.system());

  @Before
  public void beforeEach() {
    persistenceTestKit.clearAll();
  }

  @Test
  public void test() {
    PersistenceId persistenceId = PersistenceId.ofUniqueId("some-id");
    ActorRef<YourPersistentBehavior.Cmd> ref =
        testKit.spawn(YourPersistentBehavior.create(persistenceId));

    YourPersistentBehavior.Cmd cmd = new YourPersistentBehavior.Cmd("data");
    ref.tell(cmd);
    YourPersistentBehavior.Evt expectedEventPersisted = new YourPersistentBehavior.Evt(cmd.data);

    persistenceTestKit.expectNextPersisted(persistenceId.id(), expectedEventPersisted);
  }
}

class YourPersistentBehavior
    extends EventSourcedBehavior<
        YourPersistentBehavior.Cmd, YourPersistentBehavior.Evt, YourPersistentBehavior.State> {

  static final class Cmd implements CborSerializable {

    public final String data;

    @JsonCreator
    public Cmd(String data) {
      this.data = data;
    }
  }

  static final class Evt implements CborSerializable {

    public final String data;

    @JsonCreator
    public Evt(String data) {
      this.data = data;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Evt evt = (Evt) o;

      return data.equals(evt.data);
    }

    @Override
    public int hashCode() {
      return data.hashCode();
    }
  }

  static final class State implements CborSerializable {}

  static Behavior<Cmd> create(PersistenceId persistenceId) {
    return Behaviors.setup(context -> new YourPersistentBehavior(persistenceId));
  }

  private YourPersistentBehavior(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    // some state
    return new State();
  }

  @Override
  public CommandHandler<Cmd, Evt, State> commandHandler() {
    return newCommandHandlerBuilder()
        .forAnyState()
        .onCommand(Cmd.class, command -> Effect().persist(new Evt(command.data)))
        .build();
  }

  @Override
  public EventHandler<State, Evt> eventHandler() {
    // TODO handle events
    return newEventHandlerBuilder().forAnyState().onEvent(Evt.class, (state, evt) -> state).build();
  }
}
```

### Example 23: Setting your own policy for the storage

```scala
class PersistenceTestKitSampleSpecWithPolicy
    extends ScalaTestWithActorTestKit(PersistenceTestKitPlugin.config.withFallback(ConfigFactory.defaultApplication()))
    with AnyWordSpecLike
    with BeforeAndAfterEach {

  val persistenceTestKit = PersistenceTestKit(system)

  override def beforeEach(): Unit = {
    persistenceTestKit.clearAll()
    persistenceTestKit.resetPolicy()
  }

  "Testkit policy" should {

    "fail all operations with custom exception" in {
      val policy = new EventStorage.JournalPolicies.PolicyType {

        class CustomFailure extends RuntimeException

        override def tryProcess(persistenceId: String, processingUnit: JournalOperation): ProcessingResult =
          processingUnit match {
            case WriteEvents(_) => StorageFailure(new CustomFailure)
            case _              => ProcessingSuccess
          }
      }
      persistenceTestKit.withPolicy(policy)

      val persistenceId = PersistenceId.ofUniqueId("your-persistence-id")
      val persistentActor = spawn(
        EventSourcedBehavior[Cmd, Evt, State](
          persistenceId,
          emptyState = State.empty,
          commandHandler = (_, cmd) => Effect.persist(Evt(cmd.data)),
          eventHandler = (state, evt) => state.updated(evt)))

      persistentActor ! Cmd("data")
      persistenceTestKit.expectNothingPersisted(persistenceId.id)

    }
  }
}
```

### Example 24: Setting your own policy for the storage

```java
public class PersistenceTestKitPolicySampleTest extends AbstractJavaTest {

  @ClassRule
  public static final TestKitJunitResource testKit =
      new TestKitJunitResource(
          PersistenceTestKitPlugin.getInstance()
              .config()
              .withFallback(ConfigFactory.defaultApplication()));

  PersistenceTestKit persistenceTestKit = PersistenceTestKit.create(testKit.system());

  @Before
  public void beforeEach() {
    persistenceTestKit.clearAll();
    persistenceTestKit.resetPolicy();
  }

  @Test
  public void test() {
    SampleEventStoragePolicy policy = new SampleEventStoragePolicy();
    persistenceTestKit.withPolicy(policy);

    PersistenceId persistenceId = PersistenceId.ofUniqueId("some-id");
    ActorRef<YourPersistentBehavior.Cmd> ref =
        testKit.spawn(YourPersistentBehavior.create(persistenceId));

    YourPersistentBehavior.Cmd cmd = new YourPersistentBehavior.Cmd("data");
    ref.tell(cmd);

    persistenceTestKit.expectNothingPersisted(persistenceId.id());
  }

  static class SampleEventStoragePolicy implements ProcessingPolicy<JournalOperation> {
    @Override
    public ProcessingResult tryProcess(String processId, JournalOperation processingUnit) {
      if (processingUnit instanceof WriteEvents) {
        return StorageFailure.create();
      } else {
        return ProcessingSuccess.getInstance();
      }
    }
  }
}
```

### Example 25: Setting your own policy for the storage

```scala
import akka.persistence.testkit._

class SampleEventStoragePolicy extends EventStorage.JournalPolicies.PolicyType {

  //you can use internal state, it does not need to be thread safe
  var count = 1

  override def tryProcess(persistenceId: String, processingUnit: JournalOperation): ProcessingResult =
    if (count < 10) {
      count += 1
      //check the type of operation and react with success or with reject or with failure.
      //if you return ProcessingSuccess the operation will be performed, otherwise not.
      processingUnit match {
        case ReadEvents(batch) if batch.nonEmpty => ProcessingSuccess
        case WriteEvents(batch) if batch.size > 1 =>
          ProcessingSuccess
        case ReadSeqNum      => StorageFailure()
        case DeleteEvents(_) => Reject()
        case _               => StorageFailure()
      }
    } else {
      ProcessingSuccess
    }

}
```

### Example 26: Setting your own policy for the storage

```java
class SampleEventStoragePolicy implements ProcessingPolicy<JournalOperation> {

  // you can use internal state, it does not need to be thread safe
  int count = 1;

  @Override
  public ProcessingResult tryProcess(String processId, JournalOperation processingUnit) {
    // check the type of operation and react with success or with reject or with failure.
    // if you return ProcessingSuccess the operation will be performed, otherwise not.
    if (count < 10) {
      count += 1;
      if (processingUnit instanceof ReadEvents) {
        ReadEvents read = (ReadEvents) processingUnit;
        if (read.batch().nonEmpty()) {
          ProcessingSuccess.getInstance();
        } else {
          return StorageFailure.create();
        }
      } else if (processingUnit instanceof WriteEvents) {
        return ProcessingSuccess.getInstance();
      } else if (processingUnit instanceof DeleteEvents) {
        return ProcessingSuccess.getInstance();
      } else if (processingUnit.equals(ReadSeqNum.getInstance())) {
        return Reject.create();
      }
      // you can set your own exception
      return StorageFailure.create(new RuntimeException("your exception"));
    } else {
      return ProcessingSuccess.getInstance();
    }
  }
}
```

### Example 27: Setting your own policy for the storage

```scala
class SampleSnapshotStoragePolicy extends SnapshotStorage.SnapshotPolicies.PolicyType {

  //you can use internal state, it does not need to be thread safe
  var count = 1

  override def tryProcess(persistenceId: String, processingUnit: SnapshotOperation): ProcessingResult =
    if (count < 10) {
      count += 1
      //check the type of operation and react with success or with reject or with failure.
      //if you return ProcessingSuccess the operation will be performed, otherwise not.
      processingUnit match {
        case ReadSnapshot(_, payload) if payload.nonEmpty =>
          ProcessingSuccess
        case WriteSnapshot(meta, payload) if meta.sequenceNr > 10 =>
          ProcessingSuccess
        case DeleteSnapshotsByCriteria(_) => StorageFailure()
        case DeleteSnapshotByMeta(meta) if meta.sequenceNr < 10 =>
          ProcessingSuccess
        case _ => StorageFailure()
      }
    } else {
      ProcessingSuccess
    }
}
```

### Example 28: Setting your own policy for the storage

```java
class SnapshotStoragePolicy implements ProcessingPolicy<SnapshotOperation> {

  // you can use internal state, it doesn't need to be thread safe
  int count = 1;

  @Override
  public ProcessingResult tryProcess(String processId, SnapshotOperation processingUnit) {
    // check the type of operation and react with success or with failure.
    // if you return ProcessingSuccess the operation will be performed, otherwise not.
    if (count < 10) {
      count += 1;
      if (processingUnit instanceof ReadSnapshot) {
        ReadSnapshot read = (ReadSnapshot) processingUnit;
        if (read.getSnapshot().isPresent()) {
          ProcessingSuccess.getInstance();
        } else {
          return StorageFailure.create();
        }
      } else if (processingUnit instanceof WriteSnapshot) {
        return ProcessingSuccess.getInstance();
      } else if (processingUnit instanceof DeleteSnapshotsByCriteria) {
        return ProcessingSuccess.getInstance();
      } else if (processingUnit instanceof DeleteSnapshotByMeta) {
        return ProcessingSuccess.getInstance();
      }
      // you can set your own exception
      return StorageFailure.create(new RuntimeException("your exception"));
    } else {
      return ProcessingSuccess.getInstance();
    }
  }
}
```

### Example 29: Plugin initialization

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-testkit" % AkkaVersion
```

### Example 30: Plugin initialization

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
    <artifactId>akka-persistence-testkit_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 31: Plugin initialization

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

### Example 32: Plugin initialization

```scala
import akka.persistence.testkit.scaladsl.PersistenceInit

import scala.concurrent.Await
import scala.concurrent.Future
import scala.concurrent.duration._

val timeout = 5.seconds
val done: Future[Done] = PersistenceInit.initializeDefaultPlugins(system, timeout)
Await.result(done, timeout)
```

### Example 33: Plugin initialization

```java
import akka.persistence.testkit.javadsl.PersistenceInit;
import akka.Done;

import java.time.Duration;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

Duration timeout = Duration.ofSeconds(5);
CompletionStage<Done> done =
    PersistenceInit.initializeDefaultPlugins(testKit.system(), timeout);
done.toCompletableFuture().get(timeout.getSeconds(), TimeUnit.SECONDS);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/DeleteEvents.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotByMeta.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotsByCriteria.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ReadEvents.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ReadSeqNum$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ReadSnapshot.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/Reject.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/StorageFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/WriteEvents.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/WriteSnapshot.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteEvents.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotByMeta.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotsByCriteria.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadEvents.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadSeqNum.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/Reject.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/StorageFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/WriteEvents.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/WriteSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/PersistenceProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/SnapshotTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/javadsl/UnpersistentBehavior.html
- https://doc.akka.io/libraries/akka-core/current/general/configuration-reference.html
- https://doc.akka.io/libraries/akka-core/current/persistence-plugins.html
- https://doc.akka.io/libraries/akka-core/current/persistence-schema-evolution.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence-snapshot.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence-style.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence-testing.html
- https://doc.akka.io/libraries/akka-core/current/typed/project/links.html
- https://doc.akka.io/libraries/akka-core/current/typed/testing-async.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/persistence-testing.html](https://doc.akka.io/libraries/akka-core/current/typed/persistence-testing.html)*