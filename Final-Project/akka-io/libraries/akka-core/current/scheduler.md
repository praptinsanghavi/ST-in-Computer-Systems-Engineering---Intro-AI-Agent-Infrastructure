---
description: How to schedule processes in Akka with the Scheduler.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:29:59Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/scheduler.html
title: Classic Scheduler • Akka core
---

# Classic Scheduler • Akka core

> **Summary:** How to schedule processes in Akka with the Scheduler.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Scheduler

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the new API see [typed scheduling](typed/interaction-patterns.html#typed-scheduling).

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Scheduler, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
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
      <version>2.10.17</version>
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
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

## Introduction

Sometimes the need for making things happen in the future arises, and where do you go look then? Look no further than [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")! There you find the [`scheduler`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html#scheduler:akka.actor.Scheduler "akka.actor.ActorSystem")[`getScheduler()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html#getScheduler() "akka.actor.ActorSystem") method that returns an instance of [`Scheduler`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Scheduler.html "akka.actor.Scheduler")[`Scheduler`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.html "akka.actor.Scheduler"), this instance is unique per ActorSystem and is used internally for scheduling things to happen at specific points in time.

You can schedule sending of messages to actors and execution of tasks (functions or Runnable). You will get a [`Cancellable`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Cancellable.html "akka.actor.Cancellable")[`Cancellable`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Cancellable.html "akka.actor.Cancellable") back that you can call [`cancel`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Cancellable.html#cancel():Boolean "akka.actor.Cancellable")[`cancel()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Cancellable.html#cancel() "akka.actor.Cancellable") on to cancel the execution of the scheduled operation.

When scheduling periodic or single messages in an actor to itself it is recommended to use the [Actor Timers](actors.html#actors-timers) instead of using the [`Scheduler`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Scheduler.html "akka.actor.Scheduler")[`Scheduler`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.html "akka.actor.Scheduler") directly.

The scheduler in Akka is designed for high\-throughput of thousands up to millions of triggers. The prime use\-case being triggering Actor receive timeouts, Future timeouts, circuit breakers and other time dependent events which happen all\-the\-time and in many instances at the same time. The implementation is based on a Hashed Wheel Timer, which is a known datastructure and algorithm for handling such use cases, refer to the [Hashed and Hierarchical Timing Wheels](http://www.cs.columbia.edu/~nahum/w6998/papers/sosp87-timing-wheels.pdf) whitepaper by Varghese and Lauck if you’d like to understand its inner workings. 

The Akka scheduler is **not** designed for long\-term scheduling (see [akka\-quartz\-scheduler](https://github.com/enragedginger/akka-quartz-scheduler) instead for this use case) nor is it to be used for highly precise firing of the events. The maximum amount of time into the future you can schedule an event to trigger is around 8 months, which in practice is too much to be useful since this would assume the system never went down during that period. If you need long\-term scheduling we highly recommend looking into alternative schedulers, as this is not the use\-case the Akka scheduler is implemented for.

Warning
The default implementation of [`Scheduler`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Scheduler.html "akka.actor.Scheduler")[`Scheduler`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.html "akka.actor.Scheduler") used by Akka is based on job buckets which are emptied according to a fixed schedule. It does not execute tasks at the exact time, but on every tick, it will run everything that is (over)due. The accuracy of the default Scheduler can be modified by the `akka.scheduler.tick-duration` configuration property.

## Some examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/SchedulerDocSpec.scala#L10-L13 "Go to snippet source")import akka.actor.Actor
import akka.actor.Props
import scala.concurrent.duration._

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/SchedulerDocTest.java#L8 "Go to snippet source")import java.time.Duration;
```

Schedule to send the “foo”\-message to the testActor after 50ms:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/SchedulerDocSpec.scala#L21-L25 "Go to snippet source")//Use the system's dispatcher as ExecutionContext
import system.dispatcher

//Schedules to send the "foo"-message to the testActor after 50ms
system.scheduler.scheduleOnce(50 milliseconds, testActor, "foo")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/SchedulerDocTest.java#L36-L39 "Go to snippet source")system
    .scheduler()
    .scheduleOnce(
        Duration.ofMillis(50), testActor, "foo", system.dispatcher(), ActorRef.noSender());
```

Schedule a function[`Runnable`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html "java.lang.Runnable"), that sends the current time to the testActor, to be executed after 50ms:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/SchedulerDocSpec.scala#L31-L34 "Go to snippet source")//Schedules a function to be executed (send a message to the testActor) after 50ms
system.scheduler.scheduleOnce(50 milliseconds) {
  testActor ! System.currentTimeMillis
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/SchedulerDocTest.java#L43-L53 "Go to snippet source")system
    .scheduler()
    .scheduleOnce(
        Duration.ofMillis(50),
        new Runnable() {
          @Override
          public void run() {
            testActor.tell(System.currentTimeMillis(), ActorRef.noSender());
          }
        },
        system.dispatcher());
```

Schedule to send the “Tick”\-message to the `tickActor` after 0ms repeating every 50ms:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/SchedulerDocSpec.scala#L42-L58 "Go to snippet source")val Tick = "tick"
class TickActor extends Actor {
  def receive = {
    case Tick => //Do something
  }
}
val tickActor = system.actorOf(Props(classOf[TickActor], this))
//Use system's dispatcher as ExecutionContext
import system.dispatcher

//This will schedule to send the Tick-message
//to the tickActor after 0ms repeating every 50ms
val cancellable =
  system.scheduler.scheduleWithFixedDelay(Duration.Zero, 50.milliseconds, tickActor, Tick)

//This cancels further Ticks to be sent
cancellable.cancel()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/SchedulerDocTest.java#L60-L89 "Go to snippet source")class Ticker extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals(
            "Tick",
            m -> {
              // Do something
            })
        .build();
  }
}

ActorRef tickActor = system.actorOf(Props.create(Ticker.class, this));

// This will schedule to send the Tick-message
// to the tickActor after 0ms repeating every 50ms
Cancellable cancellable =
    system
        .scheduler()
        .scheduleWithFixedDelay(
            Duration.ZERO,
            Duration.ofMillis(50),
            tickActor,
            "Tick",
            system.dispatcher(),
            ActorRef.noSender());

// This cancels further Ticks to be sent
cancellable.cancel();
```

Warning
If you schedule functions or Runnable instances you should be extra careful to not close over unstable references. In practice this means not using `this` inside the closure in the scope of an Actor instance, not accessing [`sender`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html#sender():akka.actor.ActorRef "akka.actor.Actor")[`sender()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html#sender() "akka.actor.Actor") directly and not calling the methods of the Actor instance directly. If you need to schedule an invocation schedule a message to [`self`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html#self:akka.actor.ActorRef "akka.actor.Actor")[`self()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html#self() "akka.actor.Actor") instead (containing the necessary parameters) and then call the method when the message is received.

Warning
All scheduled task will be executed when the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") is terminated, i.e. the task may execute before its timeout.

## Schedule periodically

Scheduling of recurring tasks or messages can have two different characteristics:

- fixed\-delay \- The delay between subsequent execution will always be (at least) the given `delay`. Use `scheduleWithFixedDelay`.
- fixed\-rate \- The frequency of execution over time will meet the given `interval`. Use `scheduleAtFixedRate`.

If you are uncertain of which one to use you should pick `scheduleWithFixedDelay`.

When using **fixed\-delay** it will not compensate the delay between tasks or messages if the execution takes long time or if scheduling is delayed longer than specified for some reason. The delay between subsequent execution will always be (at least) the given `delay`. In the long run, the frequency of execution will generally be slightly lower than the reciprocal of the specified `delay`.

Fixed\-delay execution is appropriate for recurring activities that require “smoothness.” In other words, it is appropriate for activities where it is more important to keep the frequency accurate in the short run than in the long run.

When using **fixed\-rate** it will compensate the delay for a subsequent task if the previous tasks took too long to execute. For example, if the given `interval` is 1000 milliseconds and a task takes 200 milliseconds to execute the next task will be scheduled to run after 800 milliseconds. In such cases, the actual execution interval will differ from the interval passed to the `scheduleAtFixedRate` method.

If the execution of the tasks takes longer than the `interval`, the subsequent execution will start immediately after the prior one completes (there will be no overlap of executions). This also has the consequence that after long garbage collection pauses or other reasons when the JVM was suspended all “missed” tasks will execute when the process wakes up again. For example, `scheduleAtFixedRate` with an interval of 1 second and the process is suspended for 30 seconds will result in 30 tasks (or messages) being executed in rapid succession to catch up. In the long run, the frequency of execution will be exactly the reciprocal of the specified `interval`.

Fixed\-rate execution is appropriate for recurring activities that are sensitive to absolute time or where the total time to perform a fixed number of executions is important, such as a countdown timer that ticks once every second for ten seconds.

Warning
`scheduleAtFixedRate` can result in bursts of scheduled tasks or messages after long garbage collection pauses, which may in worst case cause undesired load on the system. `scheduleWithFixedDelay` is often preferred.

## The Scheduler interface

The actual scheduler implementation is loaded reflectively upon [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") start\-up, which means that it is possible to provide a different one using the `akka.scheduler.implementation` configuration property. The referenced class must implement the [`Scheduler`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Scheduler.html "akka.actor.Scheduler")[`Scheduler`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.html "akka.actor.Scheduler")[`AbstractScheduler`](https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractScheduler.html "akka.actor.AbstractScheduler")[`AbstractScheduler`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractScheduler.html "akka.actor.AbstractScheduler") interface.

## The Cancellable interface

Scheduling a task will result in a [`Cancellable`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Cancellable.html "akka.actor.Cancellable")[`Cancellable`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Cancellable.html "akka.actor.Cancellable") (or throw an [`IllegalStateException`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IllegalStateException.html "java.lang.IllegalStateException") if attempted after the scheduler’s shutdown). This allows you to cancel something that has been scheduled for execution.

Warning
This does not abort the execution of the task, if it had already been started. Check the return value of [`cancel`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Cancellable.html#cancel():Boolean "akka.actor.Cancellable")[`cancel()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Cancellable.html#cancel() "akka.actor.Cancellable") to detect whether the scheduled task was canceled or will (eventually) have run.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
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
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

### Example 4: Some examples

```scala
import akka.actor.Actor
import akka.actor.Props
import scala.concurrent.duration._
```

### Example 5: Some examples

```java
import java.time.Duration;
```

### Example 6: Some examples

```scala
//Use the system's dispatcher as ExecutionContext
import system.dispatcher

//Schedules to send the "foo"-message to the testActor after 50ms
system.scheduler.scheduleOnce(50 milliseconds, testActor, "foo")
```

### Example 7: Some examples

```java
system
    .scheduler()
    .scheduleOnce(
        Duration.ofMillis(50), testActor, "foo", system.dispatcher(), ActorRef.noSender());
```

### Example 8: Some examples

```scala
//Schedules a function to be executed (send a message to the testActor) after 50ms
system.scheduler.scheduleOnce(50 milliseconds) {
  testActor ! System.currentTimeMillis
}
```

### Example 9: Some examples

```java
system
    .scheduler()
    .scheduleOnce(
        Duration.ofMillis(50),
        new Runnable() {
          @Override
          public void run() {
            testActor.tell(System.currentTimeMillis(), ActorRef.noSender());
          }
        },
        system.dispatcher());
```

### Example 10: Some examples

```scala
val Tick = "tick"
class TickActor extends Actor {
  def receive = {
    case Tick => //Do something
  }
}
val tickActor = system.actorOf(Props(classOf[TickActor], this))
//Use system's dispatcher as ExecutionContext
import system.dispatcher

//This will schedule to send the Tick-message
//to the tickActor after 0ms repeating every 50ms
val cancellable =
  system.scheduler.scheduleWithFixedDelay(Duration.Zero, 50.milliseconds, tickActor, Tick)

//This cancels further Ticks to be sent
cancellable.cancel()
```

### Example 11: Some examples

```java
class Ticker extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals(
            "Tick",
            m -> {
              // Do something
            })
        .build();
  }
}

ActorRef tickActor = system.actorOf(Props.create(Ticker.class, this));

// This will schedule to send the Tick-message
// to the tickActor after 0ms repeating every 50ms
Cancellable cancellable =
    system
        .scheduler()
        .scheduleWithFixedDelay(
            Duration.ZERO,
            Duration.ofMillis(50),
            tickActor,
            "Tick",
            system.dispatcher(),
            ActorRef.noSender());

// This cancels further Ticks to be sent
cancellable.cancel();
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractScheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractScheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Scheduler.html
- https://doc.akka.io/libraries/akka-core/current/actors.html
- https://doc.akka.io/libraries/akka-core/current/extending-akka.html
- https://doc.akka.io/libraries/akka-core/current/logging.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-core/current/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/current/typed/interaction-patterns.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/scheduler.html](https://doc.akka.io/libraries/akka-core/current/scheduler.html)*