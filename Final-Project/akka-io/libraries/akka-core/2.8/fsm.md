---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:12Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/docs/akka/current/fsm.html
title: Classic FSM • Akka Documentation
---

# Classic FSM • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Classic FSM

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the documentation of the new API of this feature and for new projects see [fsm](typed/fsm.html).

## Dependency

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
Maven
```
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>

```
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

To use Finite State Machine actors, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.8.9"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
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
      <version>2.8.9</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.8.9")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

## Overview

The FSM (Finite State Machine) is available as a mixin for the an abstract base class that implements an Akka Actor and is best described in the [Erlang design principles](https://www.erlang.org/documentation/doc-4.8.2/doc/design_principles/fsm.html)

A FSM can be described as a set of relations of the form:

> **State(S) x Event(E) \-\> Actions (A), State(S’)**

These relations are interpreted as meaning:

> *If we are in state S and the event E occurs, we should perform the actions A and make a transition to the state S’.*

## A Simple Example

To demonstrate most of the features of the `FSM` trait`AbstractFSM` class, consider an actor which shall receive and queue messages while they arrive in a burst and send them on after the burst ended or a flush request is received.

First, consider all of the below to use these import statements:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L47-L48 "Go to snippet source")import akka.actor.{ ActorRef, FSM }
import scala.concurrent.duration._
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/Buncher.java#L8-L14 "Go to snippet source")import akka.actor.AbstractFSM;
import akka.actor.ActorRef;
import akka.japi.pf.UnitMatch;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.time.Duration;
```

The contract of our “Buncher” actor is that it accepts or produces the following messages:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L21-L27 "Go to snippet source")// received events
final case class SetTarget(ref: ActorRef)
final case class Queue(obj: Any)
case object Flush

// sent events
final case class Batch(obj: immutable.Seq[Any])
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/Events.java#L14-L107 "Go to snippet source")static final class SetTarget {
  private final ActorRef ref;

  public SetTarget(ActorRef ref) {
    this.ref = ref;
  }

  public ActorRef getRef() {
    return ref;
  }

  @Override
  public String toString() {
    return "SetTarget{" + "ref=" + ref + '}';
  }
}

static final class Queue {
  private final Object obj;

  public Queue(Object obj) {
    this.obj = obj;
  }

  public Object getObj() {
    return obj;
  }

  @Override
  public String toString() {
    return "Queue{" + "obj=" + obj + '}';
  }
}

static final class Batch {
  private final List<Object> list;

  public Batch(List<Object> list) {
    this.list = list;
  }

  public List<Object> getList() {
    return list;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Batch batch = (Batch) o;

    return list.equals(batch.list);
  }

  @Override
  public int hashCode() {
    return list.hashCode();
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder();
    builder.append("Batch{list=");
    list.stream()
        .forEachOrdered(
            e -> {
              builder.append(e);
              builder.append(",");
            });
    int len = builder.length();
    builder.replace(len, len, "}");
    return builder.toString();
  }
}

static enum Flush {
  Flush
}
```

`SetTarget` is needed for starting it up, setting the destination for the `Batches` to be passed on; `Queue` will add to the internal queue while `Flush` will mark the end of a burst.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L30-L37 "Go to snippet source")// states
sealed trait State
case object Idle extends State
case object Active extends State

sealed trait Data
case object Uninitialized extends Data
final case class Todo(target: ActorRef, queue: immutable.Seq[Any]) extends Data
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/Buncher.java#L95-L154 "Go to snippet source")// states
enum State {
  Idle,
  Active
}

// state data
interface Data {}

enum Uninitialized implements Data {
  Uninitialized
}

final class Todo implements Data {
  private final ActorRef target;
  private final List<Object> queue;

  public Todo(ActorRef target, List<Object> queue) {
    this.target = target;
    this.queue = queue;
  }

  public ActorRef getTarget() {
    return target;
  }

  public List<Object> getQueue() {
    return queue;
  }

  @Override
  public String toString() {
    return "Todo{" + "target=" + target + ", queue=" + queue + '}';
  }

  public Todo addElement(Object element) {
    List<Object> nQueue = new LinkedList<>(queue);
    nQueue.add(element);
    return new Todo(this.target, nQueue);
  }

  public Todo copy(List<Object> queue) {
    return new Todo(this.target, queue);
  }

  public Todo copy(ActorRef target) {
    return new Todo(target, this.queue);
  }
}
```

The actor can be in two states: no message queued (aka `Idle`) or some message queued (aka `Active`). It will stay in the `Active` state as long as messages keep arriving and no flush is requested. The internal state data of the actor is made up of the target actor reference to send the batches to and the actual queue of messages.

Now let’s take a look at the skeleton for our FSM actor:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L51-L94 "Go to snippet source")class Buncher extends FSM[State, Data] {

  startWith(Idle, Uninitialized)

  when(Idle) {
    case Event(SetTarget(ref), Uninitialized) =>
      stay().using(Todo(ref, Vector.empty))
  }

  onTransition {
    case Active -> Idle =>
      stateData match {
        case Todo(ref, queue) => ref ! Batch(queue)
        case _                => // nothing to do
      }
  }

  when(Active, stateTimeout = 1 second) {
    case Event(Flush | StateTimeout, t: Todo) =>
      goto(Idle).using(t.copy(queue = Vector.empty))
  }

  whenUnhandled {
    // common code for both states
    case Event(Queue(obj), t @ Todo(_, v)) =>
      goto(Active).using(t.copy(queue = v :+ obj))

    case Event(e, s) =>
      log.warning("received unhandled request {} in state {}/{}", e, stateName, s)
      stay()
  }

  initialize()
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/Buncher.java#L24-L157 "Go to snippet source")public class Buncher extends AbstractFSM<State, Data> {
  {
    startWith(Idle, Uninitialized);

    when(
        Idle,
        matchEvent(
            SetTarget.class,
            Uninitialized.class,
            (setTarget, uninitialized) ->
                stay().using(new Todo(setTarget.getRef(), new LinkedList<>()))));

    onTransition(
        matchState(
                Active,
                Idle,
                () -> {
                  // reuse this matcher
                  final UnitMatch<Data> m =
                      UnitMatch.create(
                          matchData(
                              Todo.class,
                              todo ->
                                  todo.getTarget().tell(new Batch(todo.getQueue()), getSelf())));
                  m.match(stateData());
                })
            .state(
                Idle,
                Active,
                () -> {
                  /* Do something here */
                }));

    when(
        Active,
        Duration.ofSeconds(1L),
        matchEvent(
            Arrays.asList(Flush.class, StateTimeout()),
            Todo.class,
            (event, todo) -> goTo(Idle).using(todo.copy(new LinkedList<>()))));

    whenUnhandled(
        matchEvent(
                Queue.class,
                Todo.class,
                (queue, todo) -> goTo(Active).using(todo.addElement(queue.getObj())))
            .anyEvent(
                (event, state) -> {
                  log()
                      .warning(
                          "received unhandled request {} in state {}/{}",
                          event,
                          stateName(),
                          state);
                  return stay();
                }));

    initialize();
  }
}
```

The basic strategy is to declare the actor, mixing in the `FSM` traitby inheriting the `AbstractFSM` class and specifying the possible states and data values as type parameters. Within the body of the actor a DSL is used for declaring the state machine:

- `startWith` defines the initial state and initial data
- then there is one `when(<state>) { ... }` declaration per state to be handled (could potentially be multiple ones, the passed `PartialFunction` will be concatenated using `orElse`)
- finally starting it up using `initialize`, which performs the transition into the initial state and sets up timers (if required).

In this case, we start out in the `Idle` state with `Uninitialized` data, where only the `SetTarget()` message is handled; `stay` prepares to end this event’s processing for not leaving the current state, while the `using` modifier makes the FSM replace the internal state (which is `Uninitialized` at this point) with a fresh `Todo()` object containing the target actor reference. The `Active` state has a state timeout declared, which means that if no message is received for 1 second, a `FSM.StateTimeout` message will be generated. This has the same effect as receiving the `Flush` command in this case, namely to transition back into the `Idle` state and resetting the internal queue to the empty vector. But how do messages get queued? Since this shall work identically in both states, we make use of the fact that any event which is not handled by the `when()` block is passed to the `whenUnhandled()` block:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L81-L89 "Go to snippet source")whenUnhandled {
  // common code for both states
  case Event(Queue(obj), t @ Todo(_, v)) =>
    goto(Active).using(t.copy(queue = v :+ obj))

  case Event(e, s) =>
    log.warning("received unhandled request {} in state {}/{}", e, stateName, s)
    stay()
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/Buncher.java#L71-L85 "Go to snippet source")whenUnhandled(
    matchEvent(
            Queue.class,
            Todo.class,
            (queue, todo) -> goTo(Active).using(todo.addElement(queue.getObj())))
        .anyEvent(
            (event, state) -> {
              log()
                  .warning(
                      "received unhandled request {} in state {}/{}",
                      event,
                      stateName(),
                      state);
              return stay();
            }));
```

The first case handled here is adding `Queue()` requests to the internal queue and going to the `Active` state (this does the obvious thing of staying in the `Active` state if already there), but only if the FSM data are not `Uninitialized` when the `Queue()` event is received. Otherwise—and in all other non\-handled cases—the second case just logs a warning and does not change the internal state.

The only missing piece is where the `Batches` are actually sent to the target, for which we use the `onTransition` mechanism: you can declare multiple such blocks and all of them will be tried for matching behavior in case a state transition occurs (i.e. only when the state actually changes).

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L64-L70 "Go to snippet source")onTransition {
  case Active -> Idle =>
    stateData match {
      case Todo(ref, queue) => ref ! Batch(queue)
      case _                => // nothing to do
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/Buncher.java#L40-L59 "Go to snippet source")onTransition(
    matchState(
            Active,
            Idle,
            () -> {
              // reuse this matcher
              final UnitMatch<Data> m =
                  UnitMatch.create(
                      matchData(
                          Todo.class,
                          todo ->
                              todo.getTarget().tell(new Batch(todo.getQueue()), getSelf())));
              m.match(stateData());
            })
        .state(
            Idle,
            Active,
            () -> {
              /* Do something here */
            }));
```

The transition callback is a partial functionbuilder constructed by `matchState`, followed by zero or multiple `state`, which takes as input a pair of states—the current and the next state. The FSM trait includes a convenience extractor for these in form of an arrow operator, which conveniently reminds you of the direction of the state change which is being matched. During the state change, the old state data is available via `stateData``stateData()` as shown, and the new state data would be available as `nextStateData``nextStateData()`.

Note
Same\-state transitions can be implemented (when currently in state `S`) using `goto(S)` or `stay()`. The difference between those being that `goto(S)` will emit an event `S->S` event that can be handled by `onTransition`, whereas `stay()` will *not*.

To verify that this buncher actually works, it is quite easy to write a test using the [Testing Actor Systems which is conveniently bundled with ScalaTest traits into `AkkaSpec`](testing.html)[TestKit](testing.html), here using JUnit as an example:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L13-L232 "Go to snippet source")import akka.actor.Props
import scala.collection.immutable

object FSMDocSpec {
  // messages and data types
}

class FSMDocSpec extends MyFavoriteTestFrameWorkPlusAkkaTestKit {
  import FSMDocSpec._

  import akka.actor.{ ActorRef, FSM }
  import scala.concurrent.duration._
  class Buncher extends FSM[State, Data] {

    startWith(Idle, Uninitialized)

    when(Idle) {
      case Event(SetTarget(ref), Uninitialized) =>
        stay().using(Todo(ref, Vector.empty))
    }

    onTransition {
      case Active -> Idle =>
        stateData match {
          case Todo(ref, queue) => ref ! Batch(queue)
          case _                => // nothing to do
        }
    }

    when(Active, stateTimeout = 1 second) {
      case Event(Flush | StateTimeout, t: Todo) =>
        goto(Idle).using(t.copy(queue = Vector.empty))
    }

    whenUnhandled {
      // common code for both states
      case Event(Queue(obj), t @ Todo(_, v)) =>
        goto(Active).using(t.copy(queue = v :+ obj))

      case Event(e, s) =>
        log.warning("received unhandled request {} in state {}/{}", e, stateName, s)
        stay()
    }

    initialize()
  }
  object DemoCode {
    trait StateType
    case object SomeState extends StateType
    case object Processing extends StateType
    case object Error extends StateType
    case object Idle extends StateType
    case object Active extends StateType

    class Dummy extends FSM[StateType, Int] {
      class X
      val newData = 42
      object WillDo
      object Tick

      when(SomeState) {
        case Event(msg, _) =>
          goto(Processing).using(newData).forMax(5 seconds).replying(WillDo)
      }

      onTransition {
        case Idle -> Active => startTimerWithFixedDelay("timeout", Tick, 1 second)
        case Active -> _    => cancelTimer("timeout")
        case x -> Idle      => log.info("entering Idle from " + x)
      }

      onTransition(handler _)

      def handler(from: StateType, to: StateType): Unit = {
        // handle it here ...
      }

      when(Error) {
        case Event("stop", _) =>
          // do cleanup ...
          stop()
      }

      when(SomeState)(transform {
        case Event(bytes: ByteString, read) => stay().using(read + bytes.length)
      }.using {
        case s @ FSM.State(state, read, timeout, stopReason, replies) if read > 1000 =>
          goto(Processing)
      })

      val processingTrigger: PartialFunction[State, State] = {
        case s @ FSM.State(state, read, timeout, stopReason, replies) if read > 1000 =>
          goto(Processing)
      }

      when(SomeState)(transform {
        case Event(bytes: ByteString, read) => stay().using(read + bytes.length)
      }.using(processingTrigger))

      onTermination {
        case StopEvent(FSM.Normal, state, data)         => // ...
        case StopEvent(FSM.Shutdown, state, data)       => // ...
        case StopEvent(FSM.Failure(cause), state, data) => // ...
      }

      whenUnhandled {
        case Event(x: X, data) =>
          log.info("Received unhandled event: " + x)
          stay()
        case Event(msg, _) =>
          log.warning("Received unknown event: " + msg)
          goto(Error)
      }

    }

    import akka.actor.LoggingFSM
    class MyFSM extends LoggingFSM[StateType, Data] {
      override def logDepth = 12
      onTermination {
        case StopEvent(FSM.Failure(_), state, data) =>
          val lastEvents = getLog.mkString("\n\t")
          log.warning(
            "Failure in state " + state + " with data " + data + "\n" +
            "Events leading up to this point:\n\t" + lastEvents)
      }
      // ...
    }

  }

  "simple finite state machine" must {

    "demonstrate NullFunction" in {
      class A extends FSM[Int, Null] {
        val SomeState = 0
        when(SomeState)(FSM.NullFunction)
      }
    }

    "batch correctly" in {
      val buncher = system.actorOf(Props(classOf[Buncher], this))
      buncher ! SetTarget(testActor)
      buncher ! Queue(42)
      buncher ! Queue(43)
      expectMsg(Batch(immutable.Seq(42, 43)))
      buncher ! Queue(44)
      buncher ! Flush
      buncher ! Queue(45)
      expectMsg(Batch(immutable.Seq(44)))
      expectMsg(Batch(immutable.Seq(45)))
    }

    "not batch if uninitialized" in {
      val buncher = system.actorOf(Props(classOf[Buncher], this))
      buncher ! Queue(42)
      expectNoMessage()
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/BuncherTest.java#L23-L79 "Go to snippet source")public class BuncherTest extends AbstractJavaTest {

  static ActorSystem system;

  @BeforeClass
  public static void setup() {
    system = ActorSystem.create("BuncherTest");
  }

  @AfterClass
  public static void tearDown() {
    TestKit.shutdownActorSystem(system);
    system = null;
  }

  @Test
  public void testBuncherActorBatchesCorrectly() {
    new TestKit(system) {
      {
        final ActorRef buncher = system.actorOf(Props.create(Buncher.class));
        final ActorRef probe = getRef();

        buncher.tell(new SetTarget(probe), probe);
        buncher.tell(new Queue(42), probe);
        buncher.tell(new Queue(43), probe);
        LinkedList<Object> list1 = new LinkedList<>();
        list1.add(42);
        list1.add(43);
        expectMsgEquals(new Batch(list1));
        buncher.tell(new Queue(44), probe);
        buncher.tell(Flush, probe);
        buncher.tell(new Queue(45), probe);
        LinkedList<Object> list2 = new LinkedList<>();
        list2.add(44);
        expectMsgEquals(new Batch(list2));
        LinkedList<Object> list3 = new LinkedList<>();
        list3.add(45);
        expectMsgEquals(new Batch(list3));
        system.stop(buncher);
      }
    };
  }

  @Test
  public void testBuncherActorDoesntBatchUninitialized() {
    new TestKit(system) {
      {
        final ActorRef buncher = system.actorOf(Props.create(Buncher.class));
        final ActorRef probe = getRef();

        buncher.tell(new Queue(42), probe);
        expectNoMessage();
        system.stop(buncher);
      }
    };
  }
}
```

## Reference

### The FSM Trait and ObjectAbstractFSM Class

 The `FSM` trait inherits directly from `Actor`, when you extend `FSM` you must be aware that an actor is actually created:   The `AbstractFSM` abstract class is the base class used to implement an FSM. It implements Actor since an Actor is created to drive the FSM. 

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L51-L94 "Go to snippet source")class Buncher extends FSM[State, Data] {

  startWith(Idle, Uninitialized)

  when(Idle) {
    case Event(SetTarget(ref), Uninitialized) =>
      stay().using(Todo(ref, Vector.empty))
  }

  onTransition {
    case Active -> Idle =>
      stateData match {
        case Todo(ref, queue) => ref ! Batch(queue)
        case _                => // nothing to do
      }
  }

  when(Active, stateTimeout = 1 second) {
    case Event(Flush | StateTimeout, t: Todo) =>
      goto(Idle).using(t.copy(queue = Vector.empty))
  }

  whenUnhandled {
    // common code for both states
    case Event(Queue(obj), t @ Todo(_, v)) =>
      goto(Active).using(t.copy(queue = v :+ obj))

    case Event(e, s) =>
      log.warning("received unhandled request {} in state {}/{}", e, stateName, s)
      stay()
  }

  initialize()
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/Buncher.java#L24-L157 "Go to snippet source")public class Buncher extends AbstractFSM<State, Data> {
  {
    startWith(Idle, Uninitialized);

    when(
        Idle,
        matchEvent(
            SetTarget.class,
            Uninitialized.class,
            (setTarget, uninitialized) ->
                stay().using(new Todo(setTarget.getRef(), new LinkedList<>()))));

    onTransition(
        matchState(
                Active,
                Idle,
                () -> {
                  // reuse this matcher
                  final UnitMatch<Data> m =
                      UnitMatch.create(
                          matchData(
                              Todo.class,
                              todo ->
                                  todo.getTarget().tell(new Batch(todo.getQueue()), getSelf())));
                  m.match(stateData());
                })
            .state(
                Idle,
                Active,
                () -> {
                  /* Do something here */
                }));

    when(
        Active,
        Duration.ofSeconds(1L),
        matchEvent(
            Arrays.asList(Flush.class, StateTimeout()),
            Todo.class,
            (event, todo) -> goTo(Idle).using(todo.copy(new LinkedList<>()))));

    whenUnhandled(
        matchEvent(
                Queue.class,
                Todo.class,
                (queue, todo) -> goTo(Active).using(todo.addElement(queue.getObj())))
            .anyEvent(
                (event, state) -> {
                  log()
                      .warning(
                          "received unhandled request {} in state {}/{}",
                          event,
                          stateName(),
                          state);
                  return stay();
                }));

    initialize();
  }
}
```

Note
The `FSM` trait`AbstractFSM` class defines a `receive` method which handles internal messages and passes everything else through to the FSM logic (according to the current state). When overriding the `receive` method, keep in mind that e.g. state timeout handling depends on actually passing the messages through the FSM logic.

The `FSM` trait`AbstractFSM` class takes two type parameters:

1. the supertype of all state names, usually a sealed trait with case objects extending itan enum
2. the type of the state data which are tracked by the `FSM``AbstractFSM` module itself.

Note
The state data together with the state name describe the internal state of the state machine; if you stick to this scheme and do not add mutable fields to the FSM class you have the advantage of making all changes of the internal state explicit in a few well\-known places.

### Defining States

A state is defined by one or more invocations of the method

```
when(<name>[, stateTimeout = <timeout>])(stateFunction)

```

The given name must be an object which is type\-compatible with the first type parameter given to the `FSM` trait`AbstractFSM` class. This object is used as a hash key, so you must ensure that it properly implements `equals` and `hashCode`; in particular it must not be mutable. The easiest fit for these requirements are case objects.

If the `stateTimeout` parameter is given, then all transitions into this state, including staying, receive this timeout by default. Initiating the transition with an explicit timeout may be used to override this default, see [Initiating Transitions](#initiating-transitions) for more information. The state timeout of any state may be changed during action processing with `setStateTimeout(state, duration)`. This enables runtime configuration e.g. via external message.

The `stateFunction` argument is a `PartialFunction[Event, State]`, which is conveniently given using the partial function literalstate function builder syntax as demonstrated below:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L57-L77 "Go to snippet source")when(Idle) {
  case Event(SetTarget(ref), Uninitialized) =>
    stay().using(Todo(ref, Vector.empty))
}

when(Active, stateTimeout = 1 second) {
  case Event(Flush | StateTimeout, t: Todo) =>
    goto(Idle).using(t.copy(queue = Vector.empty))
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/Buncher.java#L30-L36 "Go to snippet source")when(
    Idle,
    matchEvent(
        SetTarget.class,
        Uninitialized.class,
        (setTarget, uninitialized) ->
            stay().using(new Todo(setTarget.getRef(), new LinkedList<>()))));
```

The `Event(msg: Any, data: D)` case class is parameterized with the data type held by the FSM for convenient pattern matching.

Warning
It is required that you define handlers for each of the possible FSM states, otherwise there will be failures when trying to switch to undeclared states.

It is recommended practice to declare the states as objects extending a sealed traitan enum and then verify that there is a `when` clause for each of the states. If you want to leave the handling of a state “unhandled” (more below), it still needs to be declared like this:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L208 "Go to snippet source")when(SomeState)(FSM.NullFunction)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/FSMDocTest.java#L75 "Go to snippet source")when(SomeState, AbstractFSM.NullFunction());
```

### Defining the Initial State

Each FSM needs a starting point, which is declared using

```
startWith(state, data[, timeout])

```

The optionally given timeout argument overrides any specification given for the desired initial state. If you want to cancel a default timeout, use `None``Duration.Inf`.

### Unhandled Events

If a state doesn’t handle a received event a warning is logged. If you want to do something else in this case you can specify that with `whenUnhandled(stateFunction)`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L170-L177 "Go to snippet source")whenUnhandled {
  case Event(x: X, data) =>
    log.info("Received unhandled event: " + x)
    stay()
  case Event(msg, _) =>
    log.warning("Received unknown event: " + msg)
    goto(Error)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/FSMDocTest.java#L123-L135 "Go to snippet source")  whenUnhandled(
      matchEvent(
              X.class,
              (x, data) -> {
                log().info("Received unhandled event: " + x);
                return stay();
              })
          .anyEvent(
              (event, data) -> {
                log().warning("Received unknown event: " + event);
                return goTo(Error);
              }));
}
```

Within this handler the state of the FSM may be queried using the `stateName` method.

**IMPORTANT**: This handler is not stacked, meaning that each invocation of `whenUnhandled` replaces the previously installed handler.

### Initiating Transitions

The result of any `stateFunction` must be a definition of the next state unless terminating the FSM, which is described in [Termination from Inside](fsm.html#termination-from-inside). The state definition can either be the current state, as described by the `stay` directive, or it is a different state as given by `goto(state)`. The resulting object allows further qualification by way of the modifiers described in the following:

- `forMax(duration)` This modifier sets a state timeout on the next state. This means that a timer is started which upon expiry sends a `StateTimeout` message to the FSM. This timer is canceled upon reception of any other message in the meantime; you can rely on the fact that the `StateTimeout` message will not be processed after an intervening message. This modifier can also be used to override any default timeout which is specified for the target state. If you want to cancel the default timeout, use `Duration.Inf`.
- `using(data)` This modifier replaces the old state data with the new data given. If you follow the advice [above](fsm.html#defining-states), this is the only place where internal state data are ever modified.
- `replying(msg)` This modifier sends a reply to the currently processed message and otherwise does not modify the state transition.

All modifiers can be chained to achieve a nice and concise description:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L111-L114 "Go to snippet source")when(SomeState) {
  case Event(msg, _) =>
    goto(Processing).using(newData).forMax(5 seconds).replying(WillDo)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/FSMDocTest.java#L63-L71 "Go to snippet source")when(
    SomeState,
    matchAnyEvent(
        (msg, data) -> {
          return goTo(Processing)
              .using(newData)
              .forMax(Duration.ofSeconds(5))
              .replying(WillDo);
        }));
```

The parentheses are not actually needed in all cases, but they visually distinguish between modifiers and their arguments and therefore make the code even more pleasant to read.

Note
Please note that the `return` statement may not be used in `when` blocks or similar; this is a Scala restriction. Either refactor your code using `if () ... else ...` or move it into a method definition.

### Monitoring Transitions

Transitions occur “between states” conceptually, which means after any actions you have put into the event handling block; this is obvious since the next state is only defined by the value returned by the event handling logic. You do not need to worry about the exact order with respect to setting the internal state variable, as everything within the FSM actor is running single\-threaded anyway.

#### Internal Monitoring

Up to this point, the FSM DSL has been centered on states and events. The dual view is to describe it as a series of transitions. This is enabled by the method

```
onTransition(handler)

```

which associates actions with a transition instead of with a state and event. The handler is a partial function which takes a pair of states as input; no resulting state is needed as it is not possible to modify the transition in progress.

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L118-L122 "Go to snippet source")onTransition {
  case Idle -> Active => startTimerWithFixedDelay("timeout", Tick, 1 second)
  case Active -> _    => cancelTimer("timeout")
  case x -> Idle      => log.info("entering Idle from " + x)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/FSMDocTest.java#L79-L85 "Go to snippet source")onTransition(
    matchState(
            Idle,
            Active,
            () -> startTimerWithFixedDelay("timeout", Tick, Duration.ofSeconds(1L)))
        .state(Active, null, () -> cancelTimer("timeout"))
        .state(null, Idle, (f, t) -> log().info("entering Idle from " + f)));
```

The convenience extractor `->` enables decomposition of the pair of states with a clear visual reminder of the transition’s direction. As usual in pattern matches, an underscore may be used for irrelevant parts; alternatively you could bind the unconstrained state to a variable, e.g. for logging as shown in the last case.

It is also possible to pass a function object accepting two states to `onTransition`, in case your transition handling logic is implemented as a method:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L126-L130 "Go to snippet source")onTransition(handler _)

def handler(from: StateType, to: StateType): Unit = {
  // handle it here ...
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/FSMDocTest.java#L56-L89 "Go to snippet source")public void handler(StateType from, StateType to) {
  // handle transition here
}

  onTransition(this::handler);
```

The handlers registered with this method are stacked, so you can intersperse `onTransition` blocks with `when` blocks as suits your design. It should be noted, however, that *all handlers will be invoked for each transition*, not only the first matching one. This is designed specifically so you can put all transition handling for a certain aspect into one place without having to worry about earlier declarations shadowing later ones; the actions are still executed in declaration order, though.

Note
This kind of internal monitoring may be used to structure your FSM according to transitions, so that for example the cancellation of a timer upon leaving a certain state cannot be forgot when adding new target states.

#### External Monitoring

External actors may be registered to be notified of state transitions by sending a message `SubscribeTransitionCallBack(actorRef)`. The named actor will be sent a `CurrentState(self, stateName)` message immediately and will receive `Transition(actorRef, oldState, newState)` messages whenever a state change is triggered.

Please note that a state change includes the action of performing an `goto(S)`, while already being state `S`. In that case the monitoring actor will be notified with an `Transition(ref,S,S)` message. This may be useful if your `FSM` should react on all (also same\-state) transitions. In case you’d rather not emit events for same\-state transitions use `stay()` instead of `goto(S)`.

External monitors may be unregistered by sending `UnsubscribeTransitionCallBack(actorRef)` to the `FSM` actor.

Stopping a listener without unregistering will not remove the listener from the subscription list; use `UnsubscribeTransitionCallback` before stopping the listener.

### Transforming State

The partial functions supplied as argument to the `when()` blocks can be transformed using Scala’s full supplement of functional programming tools. In order to retain type inference, there is a helper function which may be used in case some common handling logic shall be applied to different clauses:

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L142-L147 "Go to snippet source")when(SomeState)(transform {
  case Event(bytes: ByteString, read) => stay().using(read + bytes.length)
}.using {
  case s @ FSM.State(state, read, timeout, stopReason, replies) if read > 1000 =>
    goto(Processing)
})
```

It goes without saying that the arguments to this method may also be stored, to be used several times, e.g. when applying the same transformation to several `when()` blocks:

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L151-L158 "Go to snippet source")val processingTrigger: PartialFunction[State, State] = {
  case s @ FSM.State(state, read, timeout, stopReason, replies) if read > 1000 =>
    goto(Processing)
}

when(SomeState)(transform {
  case Event(bytes: ByteString, read) => stay().using(read + bytes.length)
}.using(processingTrigger))
```

### Timers

Besides state timeouts, FSM manages timers identified by `String` names. You may set a timer using

```
startSingleTimer(name, msg, interval)
startTimerWithFixedDelay(name, msg, interval)

```

where `msg` is the message object which will be sent after the duration `interval` has elapsed.

Any existing timer with the same name will automatically be canceled before adding the new timer.

The [Scheduler](scheduler.html#schedule-periodically) documentation describes the difference between `fixed-delay` and `fixed-rate` scheduling. If you are uncertain of which one to use you should pick `startTimerWithFixedDelay`.

Timers may be canceled using

```
cancelTimer(name)

```

which is guaranteed to work immediately, meaning that the scheduled message will not be processed after this call even if the timer already fired and queued it. The status of any timer may be inquired with

```
isTimerActive(name)

```

These named timers complement state timeouts because they are not affected by intervening reception of other messages.

### Termination from Inside

The FSM is stopped by specifying the result state as

```
stop([reason[, data]])

```

The reason must be one of `Normal` (which is the default), `Shutdown` or `Failure(reason)`, and the second argument may be given to change the state data which is available during termination handling.

Note
It should be noted that `stop` does not abort the actions and stop the FSM immediately. The stop action must be returned from the event handler in the same way as a state transition (but note that the `return` statement may not be used within a `when` block).

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L134-L138 "Go to snippet source")when(Error) {
  case Event("stop", _) =>
    // do cleanup ...
    stop()
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/FSMDocTest.java#L93-L100 "Go to snippet source")when(
    Error,
    matchEventEquals(
        "stop",
        (event, data) -> {
          // do cleanup ...
          return stop();
        }));
```

You can use `onTermination(handler)` to specify custom code that is executed when the FSM is stopped. The handler is a partial function which takes a `StopEvent(reason, stateName, stateData)` as argument:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L162-L166 "Go to snippet source")onTermination {
  case StopEvent(FSM.Normal, state, data)         => // ...
  case StopEvent(FSM.Shutdown, state, data)       => // ...
  case StopEvent(FSM.Failure(cause), state, data) => // ...
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/FSMDocTest.java#L104-L119 "Go to snippet source")onTermination(
    matchStop(
            Normal(),
            (state, data) -> {
              /* Do something here */
            })
        .stop(
            Shutdown(),
            (state, data) -> {
              /* Do something here */
            })
        .stop(
            Failure.class,
            (reason, state, data) -> {
              /* Do something here */
            }));
```

As for the `whenUnhandled` case, this handler is not stacked, so each invocation of `onTermination` replaces the previously installed handler.

### Termination from Outside

When an `ActorRef` associated to a FSM is stopped using the `stop()` method, its `postStop` hook will be executed. The default implementation by the `FSM` trait`AbstractFSM` class is to execute the `onTermination` handler if that is prepared to handle a `StopEvent(Shutdown, ...)`.

Warning
In case you override `postStop` and want to have your `onTermination` handler called, do not forget to call `super.postStop`.

## Testing and Debugging Finite State Machines

During development and for trouble shooting FSMs need care just as any other actor. There are specialized tools available as described in [TestFSMRef](testing.html#testfsmref) and in the following.

### Event Tracing

The setting `akka.actor.debug.fsm` in [configuration](general/configuration.html) enables logging of an event trace by `LoggingFSM` instances:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L183-L196 "Go to snippet source")import akka.actor.LoggingFSM
class MyFSM extends LoggingFSM[StateType, Data] {
  override def logDepth = 12
  onTermination {
    case StopEvent(FSM.Failure(_), state, data) =>
      val lastEvents = getLog.mkString("\n\t")
      log.warning(
        "Failure in state " + state + " with data " + data + "\n" +
        "Events leading up to this point:\n\t" + lastEvents)
  }
  // ...
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/FSMDocTest.java#L141-L198 "Go to snippet source")static class MyFSM extends AbstractLoggingFSM<StateType, Data> {
  @Override
  public int logDepth() {
    return 12;
  }

  {
    onTermination(
        matchStop(
            Failure.class,
            (reason, state, data) -> {
              String lastEvents = getLog().mkString("\n\t");
              log()
                  .warning(
                      "Failure in state "
                          + state
                          + " with data "
                          + data
                          + "\n"
                          + "Events leading up to this point:\n\t"
                          + lastEvents);
            }));
    // ...
  }
}
```

This FSM will log at DEBUG level:

- all processed events, including `StateTimeout` and scheduled timer messages
- every setting and cancellation of named timers
- all state transitions

Life cycle changes and special messages can be logged as described for [Actors](testing.html#actor-logging).

### Rolling Event Log

The `LoggingFSM` trait`AbstractLoggingFSM` class adds one more feature to the FSM: a rolling event log which may be used during debugging (for tracing how the FSM entered a certain failure state) or for other creative uses:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/actor/FSMDocSpec.scala#L183-L196 "Go to snippet source")import akka.actor.LoggingFSM
class MyFSM extends LoggingFSM[StateType, Data] {
  override def logDepth = 12
  onTermination {
    case StopEvent(FSM.Failure(_), state, data) =>
      val lastEvents = getLog.mkString("\n\t")
      log.warning(
        "Failure in state " + state + " with data " + data + "\n" +
        "Events leading up to this point:\n\t" + lastEvents)
  }
  // ...
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/actor/fsm/FSMDocTest.java#L141-L198 "Go to snippet source")static class MyFSM extends AbstractLoggingFSM<StateType, Data> {
  @Override
  public int logDepth() {
    return 12;
  }

  {
    onTermination(
        matchStop(
            Failure.class,
            (reason, state, data) -> {
              String lastEvents = getLog().mkString("\n\t");
              log()
                  .warning(
                      "Failure in state "
                          + state
                          + " with data "
                          + data
                          + "\n"
                          + "Events leading up to this point:\n\t"
                          + lastEvents);
            }));
    // ...
  }
}
```

The `logDepth` defaults to zero, which turns off the event log.

Warning
The log buffer is allocated during actor creation, which is why the configuration is done using a virtual method call. If you want to override with a `val`, make sure that its initialization happens before the initializer of `LoggingFSM` runs, and do not change the value returned by `logDepth` after the buffer has been allocated.

The contents of the event log are available using method `getLog`, which returns an `IndexedSeq[LogEntry]` where the oldest entry is at index zero.

## Code Examples

### Example 1: Dependency

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 2: Dependency

```xml
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>
```

### Example 3: Dependency

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Dependency

```scala
val AkkaVersion = "2.8.9"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
```

### Example 5: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.8.9</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 6: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.8.9")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

### Example 7: A Simple Example

```scala
import akka.actor.{ ActorRef, FSM }
import scala.concurrent.duration._
```

### Example 8: A Simple Example

```java
import akka.actor.AbstractFSM;
import akka.actor.ActorRef;
import akka.japi.pf.UnitMatch;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.time.Duration;
```

### Example 9: A Simple Example

```scala
// received events
final case class SetTarget(ref: ActorRef)
final case class Queue(obj: Any)
case object Flush

// sent events
final case class Batch(obj: immutable.Seq[Any])
```

### Example 10: A Simple Example

```java
static final class SetTarget {
  private final ActorRef ref;

  public SetTarget(ActorRef ref) {
    this.ref = ref;
  }

  public ActorRef getRef() {
    return ref;
  }

  @Override
  public String toString() {
    return "SetTarget{" + "ref=" + ref + '}';
  }
}

static final class Queue {
  private final Object obj;

  public Queue(Object obj) {
    this.obj = obj;
  }

  public Object getObj() {
    return obj;
  }

  @Override
  public String toString() {
    return "Queue{" + "obj=" + obj + '}';
  }
}

static final class Batch {
  private final List<Object> list;

  public Batch(List<Object> list) {
    this.list = list;
  }

  public List<Object> getList() {
    return list;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Batch batch = (Batch) o;

    return list.equals(batch.list);
  }

  @Override
  public int hashCode() {
    return list.hashCode();
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder();
    builder.append("Batch{list=");
    list.stream()
        .forEachOrdered(
            e -> {
              builder.append(e);
              builder.append(",");
            });
    int len = builder.length();
    builder.replace(len, len, "}");
    return builder.toString();
  }
}

static enum Flush {
  Flush
}
```

### Example 11: A Simple Example

```scala
// states
sealed trait State
case object Idle extends State
case object Active extends State

sealed trait Data
case object Uninitialized extends Data
final case class Todo(target: ActorRef, queue: immutable.Seq[Any]) extends Data
```

### Example 12: A Simple Example

```java
// states
enum State {
  Idle,
  Active
}

// state data
interface Data {}

enum Uninitialized implements Data {
  Uninitialized
}

final class Todo implements Data {
  private final ActorRef target;
  private final List<Object> queue;

  public Todo(ActorRef target, List<Object> queue) {
    this.target = target;
    this.queue = queue;
  }

  public ActorRef getTarget() {
    return target;
  }

  public List<Object> getQueue() {
    return queue;
  }

  @Override
  public String toString() {
    return "Todo{" + "target=" + target + ", queue=" + queue + '}';
  }

  public Todo addElement(Object element) {
    List<Object> nQueue = new LinkedList<>(queue);
    nQueue.add(element);
    return new Todo(this.target, nQueue);
  }

  public Todo copy(List<Object> queue) {
    return new Todo(this.target, queue);
  }

  public Todo copy(ActorRef target) {
    return new Todo(target, this.queue);
  }
}
```

### Example 13: A Simple Example

```scala
class Buncher extends FSM[State, Data] {

  startWith(Idle, Uninitialized)

  when(Idle) {
    case Event(SetTarget(ref), Uninitialized) =>
      stay().using(Todo(ref, Vector.empty))
  }

  onTransition {
    case Active -> Idle =>
      stateData match {
        case Todo(ref, queue) => ref ! Batch(queue)
        case _                => // nothing to do
      }
  }

  when(Active, stateTimeout = 1 second) {
    case Event(Flush | StateTimeout, t: Todo) =>
      goto(Idle).using(t.copy(queue = Vector.empty))
  }

  whenUnhandled {
    // common code for both states
    case Event(Queue(obj), t @ Todo(_, v)) =>
      goto(Active).using(t.copy(queue = v :+ obj))

    case Event(e, s) =>
      log.warning("received unhandled request {} in state {}/{}", e, stateName, s)
      stay()
  }

  initialize()
}
```

### Example 14: A Simple Example

```java
public class Buncher extends AbstractFSM<State, Data> {
  {
    startWith(Idle, Uninitialized);

    when(
        Idle,
        matchEvent(
            SetTarget.class,
            Uninitialized.class,
            (setTarget, uninitialized) ->
                stay().using(new Todo(setTarget.getRef(), new LinkedList<>()))));

    onTransition(
        matchState(
                Active,
                Idle,
                () -> {
                  // reuse this matcher
                  final UnitMatch<Data> m =
                      UnitMatch.create(
                          matchData(
                              Todo.class,
                              todo ->
                                  todo.getTarget().tell(new Batch(todo.getQueue()), getSelf())));
                  m.match(stateData());
                })
            .state(
                Idle,
                Active,
                () -> {
                  /* Do something here */
                }));

    when(
        Active,
        Duration.ofSeconds(1L),
        matchEvent(
            Arrays.asList(Flush.class, StateTimeout()),
            Todo.class,
            (event, todo) -> goTo(Idle).using(todo.copy(new LinkedList<>()))));

    whenUnhandled(
        matchEvent(
                Queue.class,
                Todo.class,
                (queue, todo) -> goTo(Active).using(todo.addElement(queue.getObj())))
            .anyEvent(
                (event, state) -> {
                  log()
                      .warning(
                          "received unhandled request {} in state {}/{}",
                          event,
                          stateName(),
                          state);
                  return stay();
                }));

    initialize();
  }
}
```

### Example 15: A Simple Example

```scala
whenUnhandled {
  // common code for both states
  case Event(Queue(obj), t @ Todo(_, v)) =>
    goto(Active).using(t.copy(queue = v :+ obj))

  case Event(e, s) =>
    log.warning("received unhandled request {} in state {}/{}", e, stateName, s)
    stay()
}
```

### Example 16: A Simple Example

```java
whenUnhandled(
    matchEvent(
            Queue.class,
            Todo.class,
            (queue, todo) -> goTo(Active).using(todo.addElement(queue.getObj())))
        .anyEvent(
            (event, state) -> {
              log()
                  .warning(
                      "received unhandled request {} in state {}/{}",
                      event,
                      stateName(),
                      state);
              return stay();
            }));
```

### Example 17: A Simple Example

```scala
onTransition {
  case Active -> Idle =>
    stateData match {
      case Todo(ref, queue) => ref ! Batch(queue)
      case _                => // nothing to do
    }
}
```

### Example 18: A Simple Example

```java
onTransition(
    matchState(
            Active,
            Idle,
            () -> {
              // reuse this matcher
              final UnitMatch<Data> m =
                  UnitMatch.create(
                      matchData(
                          Todo.class,
                          todo ->
                              todo.getTarget().tell(new Batch(todo.getQueue()), getSelf())));
              m.match(stateData());
            })
        .state(
            Idle,
            Active,
            () -> {
              /* Do something here */
            }));
```

### Example 19: A Simple Example

```scala
import akka.actor.Props
import scala.collection.immutable

object FSMDocSpec {
  // messages and data types
}

class FSMDocSpec extends MyFavoriteTestFrameWorkPlusAkkaTestKit {
  import FSMDocSpec._

  import akka.actor.{ ActorRef, FSM }
  import scala.concurrent.duration._
  class Buncher extends FSM[State, Data] {

    startWith(Idle, Uninitialized)

    when(Idle) {
      case Event(SetTarget(ref), Uninitialized) =>
        stay().using(Todo(ref, Vector.empty))
    }

    onTransition {
      case Active -> Idle =>
        stateData match {
          case Todo(ref, queue) => ref ! Batch(queue)
          case _                => // nothing to do
        }
    }

    when(Active, stateTimeout = 1 second) {
      case Event(Flush | StateTimeout, t: Todo) =>
        goto(Idle).using(t.copy(queue = Vector.empty))
    }

    whenUnhandled {
      // common code for both states
      case Event(Queue(obj), t @ Todo(_, v)) =>
        goto(Active).using(t.copy(queue = v :+ obj))

      case Event(e, s) =>
        log.warning("received unhandled request {} in state {}/{}", e, stateName, s)
        stay()
    }

    initialize()
  }
  object DemoCode {
    trait StateType
    case object SomeState extends StateType
    case object Processing extends StateType
    case object Error extends StateType
    case object Idle extends StateType
    case object Active extends StateType

    class Dummy extends FSM[StateType, Int] {
      class X
      val newData = 42
      object WillDo
      object Tick

      when(SomeState) {
        case Event(msg, _) =>
          goto(Processing).using(newData).forMax(5 seconds).replying(WillDo)
      }

      onTransition {
        case Idle -> Active => startTimerWithFixedDelay("timeout", Tick, 1 second)
        case Active -> _    => cancelTimer("timeout")
        case x -> Idle      => log.info("entering Idle from " + x)
      }

      onTransition(handler _)

      def handler(from: StateType, to: StateType): Unit = {
        // handle it here ...
      }

      when(Error) {
        case Event("stop", _) =>
          // do cleanup ...
          stop()
      }

      when(SomeState)(transform {
        case Event(bytes: ByteString, read) => stay().using(read + bytes.length)
      }.using {
        case s @ FSM.State(state, read, timeout, stopReason, replies) if read > 1000 =>
          goto(Processing)
      })

      val processingTrigger: PartialFunction[State, State] = {
        case s @ FSM.State(state, read, timeout, stopReason, replies) if read > 1000 =>
          goto(Processing)
      }

      when(SomeState)(transform {
        case Event(bytes: ByteString, read) => stay().using(read + bytes.length)
      }.using(processingTrigger))

      onTermination {
        case StopEvent(FSM.Normal, state, data)         => // ...
        case StopEvent(FSM.Shutdown, state, data)       => // ...
        case StopEvent(FSM.Failure(cause), state, data) => // ...
      }

      whenUnhandled {
        case Event(x: X, data) =>
          log.info("Received unhandled event: " + x)
          stay()
        case Event(msg, _) =>
          log.warning("Received unknown event: " + msg)
          goto(Error)
      }

    }

    import akka.actor.LoggingFSM
    class MyFSM extends LoggingFSM[StateType, Data] {
      override def logDepth = 12
      onTermination {
        case StopEvent(FSM.Failure(_), state, data) =>
          val lastEvents = getLog.mkString("\n\t")
          log.warning(
            "Failure in state " + state + " with data " + data + "\n" +
            "Events leading up to this point:\n\t" + lastEvents)
      }
      // ...
    }

  }

  "simple finite state machine" must {

    "demonstrate NullFunction" in {
      class A extends FSM[Int, Null] {
        val SomeState = 0
        when(SomeState)(FSM.NullFunction)
      }
    }

    "batch correctly" in {
      val buncher = system.actorOf(Props(classOf[Buncher], this))
      buncher ! SetTarget(testActor)
      buncher ! Queue(42)
      buncher ! Queue(43)
      expectMsg(Batch(immutable.Seq(42, 43)))
      buncher ! Queue(44)
      buncher ! Flush
      buncher ! Queue(45)
      expectMsg(Batch(immutable.Seq(44)))
      expectMsg(Batch(immutable.Seq(45)))
    }

    "not batch if uninitialized" in {
      val buncher = system.actorOf(Props(classOf[Buncher], this))
      buncher ! Queue(42)
      expectNoMessage()
    }
  }
}
```

### Example 20: A Simple Example

```java
public class BuncherTest extends AbstractJavaTest {

  static ActorSystem system;

  @BeforeClass
  public static void setup() {
    system = ActorSystem.create("BuncherTest");
  }

  @AfterClass
  public static void tearDown() {
    TestKit.shutdownActorSystem(system);
    system = null;
  }

  @Test
  public void testBuncherActorBatchesCorrectly() {
    new TestKit(system) {
      {
        final ActorRef buncher = system.actorOf(Props.create(Buncher.class));
        final ActorRef probe = getRef();

        buncher.tell(new SetTarget(probe), probe);
        buncher.tell(new Queue(42), probe);
        buncher.tell(new Queue(43), probe);
        LinkedList<Object> list1 = new LinkedList<>();
        list1.add(42);
        list1.add(43);
        expectMsgEquals(new Batch(list1));
        buncher.tell(new Queue(44), probe);
        buncher.tell(Flush, probe);
        buncher.tell(new Queue(45), probe);
        LinkedList<Object> list2 = new LinkedList<>();
        list2.add(44);
        expectMsgEquals(new Batch(list2));
        LinkedList<Object> list3 = new LinkedList<>();
        list3.add(45);
        expectMsgEquals(new Batch(list3));
        system.stop(buncher);
      }
    };
  }

  @Test
  public void testBuncherActorDoesntBatchUninitialized() {
    new TestKit(system) {
      {
        final ActorRef buncher = system.actorOf(Props.create(Buncher.class));
        final ActorRef probe = getRef();

        buncher.tell(new Queue(42), probe);
        expectNoMessage();
        system.stop(buncher);
      }
    };
  }
}
```

### Example 21: TheFSM Trait and ObjectAbstractFSM Class

```scala
class Buncher extends FSM[State, Data] {

  startWith(Idle, Uninitialized)

  when(Idle) {
    case Event(SetTarget(ref), Uninitialized) =>
      stay().using(Todo(ref, Vector.empty))
  }

  onTransition {
    case Active -> Idle =>
      stateData match {
        case Todo(ref, queue) => ref ! Batch(queue)
        case _                => // nothing to do
      }
  }

  when(Active, stateTimeout = 1 second) {
    case Event(Flush | StateTimeout, t: Todo) =>
      goto(Idle).using(t.copy(queue = Vector.empty))
  }

  whenUnhandled {
    // common code for both states
    case Event(Queue(obj), t @ Todo(_, v)) =>
      goto(Active).using(t.copy(queue = v :+ obj))

    case Event(e, s) =>
      log.warning("received unhandled request {} in state {}/{}", e, stateName, s)
      stay()
  }

  initialize()
}
```

### Example 22: TheFSM Trait and ObjectAbstractFSM Class

```java
public class Buncher extends AbstractFSM<State, Data> {
  {
    startWith(Idle, Uninitialized);

    when(
        Idle,
        matchEvent(
            SetTarget.class,
            Uninitialized.class,
            (setTarget, uninitialized) ->
                stay().using(new Todo(setTarget.getRef(), new LinkedList<>()))));

    onTransition(
        matchState(
                Active,
                Idle,
                () -> {
                  // reuse this matcher
                  final UnitMatch<Data> m =
                      UnitMatch.create(
                          matchData(
                              Todo.class,
                              todo ->
                                  todo.getTarget().tell(new Batch(todo.getQueue()), getSelf())));
                  m.match(stateData());
                })
            .state(
                Idle,
                Active,
                () -> {
                  /* Do something here */
                }));

    when(
        Active,
        Duration.ofSeconds(1L),
        matchEvent(
            Arrays.asList(Flush.class, StateTimeout()),
            Todo.class,
            (event, todo) -> goTo(Idle).using(todo.copy(new LinkedList<>()))));

    whenUnhandled(
        matchEvent(
                Queue.class,
                Todo.class,
                (queue, todo) -> goTo(Active).using(todo.addElement(queue.getObj())))
            .anyEvent(
                (event, state) -> {
                  log()
                      .warning(
                          "received unhandled request {} in state {}/{}",
                          event,
                          stateName(),
                          state);
                  return stay();
                }));

    initialize();
  }
}
```

### Example 23: Defining States

```text
when(<name>[, stateTimeout = <timeout>])(stateFunction)
```

### Example 24: Defining States

```scala
when(Idle) {
  case Event(SetTarget(ref), Uninitialized) =>
    stay().using(Todo(ref, Vector.empty))
}

when(Active, stateTimeout = 1 second) {
  case Event(Flush | StateTimeout, t: Todo) =>
    goto(Idle).using(t.copy(queue = Vector.empty))
}
```

### Example 25: Defining States

```java
when(
    Idle,
    matchEvent(
        SetTarget.class,
        Uninitialized.class,
        (setTarget, uninitialized) ->
            stay().using(new Todo(setTarget.getRef(), new LinkedList<>()))));
```

### Example 26: Defining States

```scala
when(SomeState)(FSM.NullFunction)
```

### Example 27: Defining States

```java
when(SomeState, AbstractFSM.NullFunction());
```

### Example 28: Defining the Initial State

```text
startWith(state, data[, timeout])
```

### Example 29: Unhandled Events

```scala
whenUnhandled {
  case Event(x: X, data) =>
    log.info("Received unhandled event: " + x)
    stay()
  case Event(msg, _) =>
    log.warning("Received unknown event: " + msg)
    goto(Error)
}
```

### Example 30: Unhandled Events

```java
whenUnhandled(
      matchEvent(
              X.class,
              (x, data) -> {
                log().info("Received unhandled event: " + x);
                return stay();
              })
          .anyEvent(
              (event, data) -> {
                log().warning("Received unknown event: " + event);
                return goTo(Error);
              }));
}
```

### Example 31: Initiating Transitions

```scala
when(SomeState) {
  case Event(msg, _) =>
    goto(Processing).using(newData).forMax(5 seconds).replying(WillDo)
}
```

### Example 32: Initiating Transitions

```java
when(
    SomeState,
    matchAnyEvent(
        (msg, data) -> {
          return goTo(Processing)
              .using(newData)
              .forMax(Duration.ofSeconds(5))
              .replying(WillDo);
        }));
```

### Example 33: Internal Monitoring

```text
onTransition(handler)
```

### Example 34: Internal Monitoring

```scala
onTransition {
  case Idle -> Active => startTimerWithFixedDelay("timeout", Tick, 1 second)
  case Active -> _    => cancelTimer("timeout")
  case x -> Idle      => log.info("entering Idle from " + x)
}
```

### Example 35: Internal Monitoring

```java
onTransition(
    matchState(
            Idle,
            Active,
            () -> startTimerWithFixedDelay("timeout", Tick, Duration.ofSeconds(1L)))
        .state(Active, null, () -> cancelTimer("timeout"))
        .state(null, Idle, (f, t) -> log().info("entering Idle from " + f)));
```

### Example 36: Internal Monitoring

```scala
onTransition(handler _)

def handler(from: StateType, to: StateType): Unit = {
  // handle it here ...
}
```

### Example 37: Internal Monitoring

```java
public void handler(StateType from, StateType to) {
  // handle transition here
}

  onTransition(this::handler);
```

### Example 38: Transforming State

```scala
when(SomeState)(transform {
  case Event(bytes: ByteString, read) => stay().using(read + bytes.length)
}.using {
  case s @ FSM.State(state, read, timeout, stopReason, replies) if read > 1000 =>
    goto(Processing)
})
```

### Example 39: Transforming State

```scala
val processingTrigger: PartialFunction[State, State] = {
  case s @ FSM.State(state, read, timeout, stopReason, replies) if read > 1000 =>
    goto(Processing)
}

when(SomeState)(transform {
  case Event(bytes: ByteString, read) => stay().using(read + bytes.length)
}.using(processingTrigger))
```

### Example 40: Timers

```text
startSingleTimer(name, msg, interval)
startTimerWithFixedDelay(name, msg, interval)
```

### Example 41: Timers

```text
cancelTimer(name)
```

### Example 42: Timers

```text
isTimerActive(name)
```

### Example 43: Termination from Inside

```text
stop([reason[, data]])
```

### Example 44: Termination from Inside

```scala
when(Error) {
  case Event("stop", _) =>
    // do cleanup ...
    stop()
}
```

### Example 45: Termination from Inside

```java
when(
    Error,
    matchEventEquals(
        "stop",
        (event, data) -> {
          // do cleanup ...
          return stop();
        }));
```

### Example 46: Termination from Inside

```scala
onTermination {
  case StopEvent(FSM.Normal, state, data)         => // ...
  case StopEvent(FSM.Shutdown, state, data)       => // ...
  case StopEvent(FSM.Failure(cause), state, data) => // ...
}
```

### Example 47: Termination from Inside

```java
onTermination(
    matchStop(
            Normal(),
            (state, data) -> {
              /* Do something here */
            })
        .stop(
            Shutdown(),
            (state, data) -> {
              /* Do something here */
            })
        .stop(
            Failure.class,
            (reason, state, data) -> {
              /* Do something here */
            }));
```

### Example 48: Event Tracing

```scala
import akka.actor.LoggingFSM
class MyFSM extends LoggingFSM[StateType, Data] {
  override def logDepth = 12
  onTermination {
    case StopEvent(FSM.Failure(_), state, data) =>
      val lastEvents = getLog.mkString("\n\t")
      log.warning(
        "Failure in state " + state + " with data " + data + "\n" +
        "Events leading up to this point:\n\t" + lastEvents)
  }
  // ...
}
```

### Example 49: Event Tracing

```java
static class MyFSM extends AbstractLoggingFSM<StateType, Data> {
  @Override
  public int logDepth() {
    return 12;
  }

  {
    onTermination(
        matchStop(
            Failure.class,
            (reason, state, data) -> {
              String lastEvents = getLog().mkString("\n\t");
              log()
                  .warning(
                      "Failure in state "
                          + state
                          + " with data "
                          + data
                          + "\n"
                          + "Events leading up to this point:\n\t"
                          + lastEvents);
            }));
    // ...
  }
}
```

### Example 50: Rolling Event Log

```scala
import akka.actor.LoggingFSM
class MyFSM extends LoggingFSM[StateType, Data] {
  override def logDepth = 12
  onTermination {
    case StopEvent(FSM.Failure(_), state, data) =>
      val lastEvents = getLog.mkString("\n\t")
      log.warning(
        "Failure in state " + state + " with data " + data + "\n" +
        "Events leading up to this point:\n\t" + lastEvents)
  }
  // ...
}
```

### Example 51: Rolling Event Log

```java
static class MyFSM extends AbstractLoggingFSM<StateType, Data> {
  @Override
  public int logDepth() {
    return 12;
  }

  {
    onTermination(
        matchStop(
            Failure.class,
            (reason, state, data) -> {
              String lastEvents = getLog().mkString("\n\t");
              log()
                  .warning(
                      "Failure in state "
                          + state
                          + " with data "
                          + data
                          + "\n"
                          + "Events leading up to this point:\n\t"
                          + lastEvents);
            }));
    // ...
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.8/fsm.html
- https://doc.akka.io/libraries/akka-core/2.8/general/configuration.html
- https://doc.akka.io/libraries/akka-core/2.8/persistence.html
- https://doc.akka.io/libraries/akka-core/2.8/routing.html
- https://doc.akka.io/libraries/akka-core/2.8/scheduler.html
- https://doc.akka.io/libraries/akka-core/2.8/testing.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/fsm.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.8/fsm.html](https://doc.akka.io/libraries/akka-core/2.8/fsm.html)*