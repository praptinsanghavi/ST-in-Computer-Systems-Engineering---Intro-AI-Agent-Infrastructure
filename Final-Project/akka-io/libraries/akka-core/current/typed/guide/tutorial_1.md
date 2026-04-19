---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:12Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_1.html
title: 'Part 1: Actor Architecture • Akka core'
---

# Part 1: Actor Architecture • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Part 1: Actor Architecture

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

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

Use of Akka relieves you from creating the infrastructure for an actor system and from writing the low\-level code necessary to control basic behavior. To appreciate this, let’s look at the relationships between actors you create in your code and those that Akka creates and manages for you internally, the actor lifecycle, and failure handling.

## The Akka actor hierarchy

An actor in Akka always belongs to a parent. You create an actor by calling [`ActorContext.spawn()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html#spawn(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props) "akka.actor.typed.javadsl.ActorContext")[`ActorContext.spawn()`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#spawn[U](behavior:akka.actor.typed.Behavior[U],name:String,props:akka.actor.typed.Props):akka.actor.typed.ActorRef[U] "akka.actor.typed.scaladsl.ActorContext"). The creator actor becomes the *parent* of the newly created *child* actor. You might ask then, who is the parent of the *first* actor you create?

As illustrated below, all your actors have a common parent, the user guardian, which is defined and created when you start the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem"). As we covered in the [first Hello World example](../actors.html#first-example), creation of an actor returns a reference that is a valid URL. So, for example, if we create an actor named `someActor` from the user guardian with `context.spawn(someBehavior, "someActor")`, its reference will include the path `/user/someActor`.

![actor tree diagram](diagrams/actor_top_tree.png)

In fact, before your first actor \- the user guardian \- is started, Akka has already created two other guardian actors in the system: `/` and `/system`. Thus, there are three *guardian* actors at the top of the tree:

- `/` the so\-called *root guardian*. This is the parent of all actors in the system, and the last one to stop when the system itself is terminated.
- `/system` the *system guardian*. Akka or other libraries built on top of Akka may create actors in the *system* namespace.
- `/user` the *user guardian*. This is the top level actor that you provide to start all other actors in your application.

The easiest way to see the actor hierarchy in action is to print [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") instances. In this small experiment, we create an actor, print its reference, create a child of this actor, and print the child’s reference. We start with the Hello World project, which you can download from: 

- Scala [akka\-quickstart\-scala.zip](../attachments/akka-quickstart-scala.zip)
- Java [akka\-quickstart\-java.zip](../attachments/akka-quickstart-java.zip)

In your Hello World project, navigate to the `com.example` package and create a new Scala file called `ActorHierarchyExperiments.scala` here. Copy and paste the code from the snippet below to this new source filea Java file for each of the classes in the snippet below and copy the respective contents. Save your file and run `sbt "runMain com.example.ActorHierarchyExperiments"`files and run `com.example.ActorHierarchyExperiments` from your build tool or IDE to observe the output.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_1/ActorHierarchyExperiments.scala#L9-L158 "Go to snippet source")package com.example

import akka.actor.typed.ActorSystem
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.AbstractBehavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object PrintMyActorRefActor {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new PrintMyActorRefActor(context))
}

class PrintMyActorRefActor(context: ActorContext[String]) extends AbstractBehavior[String](context) {

  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "printit" =>
        val secondRef = context.spawn(Behaviors.empty[String], "second-actor")
        println(s"Second: $secondRef")
        this
    }
}

object Main {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new Main(context))

}

class Main(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "start" =>
        val firstRef = context.spawn(PrintMyActorRefActor(), "first-actor")
        println(s"First: $firstRef")
        firstRef ! "printit"
        this
    }
}

object ActorHierarchyExperiments extends App {
  val testSystem = ActorSystem(Main(), "testSystem")
  testSystem ! "start"
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_1/ActorHierarchyExperiments.java#L9-L197 "Go to snippet source")package com.example;

import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

class PrintMyActorRefActor extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(PrintMyActorRefActor::new);
  }

  private PrintMyActorRefActor(ActorContext<String> context) {
    super(context);
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onMessageEquals("printit", this::printIt).build();
  }

  private Behavior<String> printIt() {
    ActorRef<String> secondRef = getContext().spawn(Behaviors.empty(), "second-actor");
    System.out.println("Second: " + secondRef);
    return this;
  }
}

class Main extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(Main::new);
  }

  private Main(ActorContext<String> context) {
    super(context);
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onMessageEquals("start", this::start).build();
  }

  private Behavior<String> start() {
    ActorRef<String> firstRef = getContext().spawn(PrintMyActorRefActor.create(), "first-actor");

    System.out.println("First: " + firstRef);
    firstRef.tell("printit");
    return Behaviors.same();
  }
}

public class ActorHierarchyExperiments {
  public static void main(String[] args) {
    ActorRef<String> testSystem = ActorSystem.create(Main.create(), "testSystem");
    testSystem.tell("start");
  }
}
```

Note the way a message asked the first actor to do its work. We sent the message by using the parent’s reference: `firstRef ! "printit"``firstRef.tell("printit", ActorRef.noSender())`. When the code executes, the output includes the references for the first actor and the child it created as part of the `printit` case. Your output should look similar to the following:

```
First: Actor[akka://testSystem/user/first-actor#1053618476]
Second: Actor[akka://testSystem/user/first-actor/second-actor#-1544706041]

```

Notice the structure of the references:

- Both paths start with `akka://testSystem/`. Since all actor references are valid URLs, `akka://` is the value of the protocol field.
- Next, just like on the World Wide Web, the URL identifies the system. In this example, the system is named `testSystem`, but it could be any other name. If remote communication between multiple systems is enabled, this part of the URL includes the hostname so other systems can find it on the network.
- Because the second actor’s reference includes the path `/first-actor/`, it identifies it as a child of the first.
- The last part of the actor reference, `#1053618476` or `#-1544706041` is a unique identifier that you can ignore in most cases.

Now that you understand what the actor hierarchy looks like, you might be wondering: *Why do we need this hierarchy? What is it used for?*

An important role of the hierarchy is to safely manage actor lifecycles. Let’s consider this next and see how that knowledge can help us write better code.

### The actor lifecycle

Actors pop into existence when created, then later, at user requests, they are stopped. Whenever an actor is stopped, all of its children are *recursively stopped* too. This behavior greatly simplifies resource cleanup and helps avoid resource leaks such as those caused by open sockets and files. In fact, a commonly overlooked difficulty when dealing with low\-level multi\-threaded code is the lifecycle management of various concurrent resources.

To stop an actor, the recommended pattern is to return [`Behaviors.stopped`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#stopped() "akka.actor.typed.javadsl.Behaviors")[`Behaviors.stopped`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#stopped[T]:akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") inside the actor to stop itself, usually as a response to some user defined stop message or when the actor is done with its job. Stopping a child actor is technically possible by calling [`context.stop(childRef)`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html#stop(akka.actor.typed.ActorRef) "akka.actor.typed.javadsl.ActorContext")[`context.stop(childRef)`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#stop[U](child:akka.actor.typed.ActorRef[U]):Unit "akka.actor.typed.scaladsl.ActorContext") from the parent, but it’s not possible to stop arbitrary (non\-child) actors this way.

The Akka actor API exposes some lifecycle signals, for example [`PostStop`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop")[`PostStop`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop") is sent just after the actor has been stopped. No messages are processed after this point.

Let’s use the `PostStop` lifecycle signal in a simple experiment to observe the behavior when we stop an actor. First, add the following 2 actor classes to your project:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_1/ActorHierarchyExperiments.scala#L46-L87 "Go to snippet source")object StartStopActor1 {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new StartStopActor1(context))
}

class StartStopActor1(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  println("first started")
  context.spawn(StartStopActor2(), "second")

  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "stop" => Behaviors.stopped
    }

  override def onSignal: PartialFunction[Signal, Behavior[String]] = {
    case PostStop =>
      println("first stopped")
      this
  }

}

object StartStopActor2 {
  def apply(): Behavior[String] =
    Behaviors.setup(new StartStopActor2(_))
}

class StartStopActor2(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  println("second started")

  override def onMessage(msg: String): Behavior[String] = {
    // no messages handled by this actor
    Behaviors.unhandled
  }

  override def onSignal: PartialFunction[Signal, Behavior[String]] = {
    case PostStop =>
      println("second stopped")
      this
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_1/ActorHierarchyExperiments.java#L51-L98 "Go to snippet source")class StartStopActor1 extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(StartStopActor1::new);
  }

  private StartStopActor1(ActorContext<String> context) {
    super(context);
    System.out.println("first started");

    context.spawn(StartStopActor2.create(), "second");
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder()
        .onMessageEquals("stop", Behaviors::stopped)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private Behavior<String> onPostStop() {
    System.out.println("first stopped");
    return this;
  }
}

class StartStopActor2 extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(StartStopActor2::new);
  }

  private StartStopActor2(ActorContext<String> context) {
    super(context);
    System.out.println("second started");
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onSignal(PostStop.class, signal -> onPostStop()).build();
  }

  private Behavior<String> onPostStop() {
    System.out.println("second stopped");
    return this;
  }
}
```

And create a ‘main’ class like above to start the actors and then send them a `"stop"` message:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_1/ActorHierarchyExperiments.scala#L169-L170 "Go to snippet source")val first = context.spawn(StartStopActor1(), "first")
first ! "stop"
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_1/ActorHierarchyExperiments.java#L206-L207 "Go to snippet source")ActorRef<String> first = context.spawn(StartStopActor1.create(), "first");
first.tell("stop");
```

You can again use `sbt` to start this program. The output should look like this:

```
first started
second started
second stopped
first stopped

```

When we stopped actor `first`, it stopped its child actor, `second`, before stopping itself. This ordering is strict, *all* [`PostStop`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop")[`PostStop`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html "akka.actor.typed.PostStop") signals of the children are processed before the `PostStop` signal of the parent is processed.

### Failure handling

Parents and children are connected throughout their lifecycles. Whenever an actor fails (throws an exception or an unhandled exception bubbles out from [`onMessage`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AbstractBehavior.html#onMessage(msg:T):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.AbstractBehavior")[`Receive`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Receive.html "akka.actor.typed.javadsl.Receive")) the failure information is propagated to the supervision strategy, which then decides how to handle the exception caused by the actor. The supervision strategy is typically defined by the parent actor when it spawns a child actor. In this way, parents act as supervisors for their children. The default *supervisor strategy* is to stop the child. If you don’t define the strategy all failures result in a stop.

Let’s observe a restart supervision strategy in a simple experiment. Add the following classes to your project, just as you did with the previous ones:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_1/ActorHierarchyExperiments.scala#L91-L133 "Go to snippet source")object SupervisingActor {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new SupervisingActor(context))
}

class SupervisingActor(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  private val child = context.spawn(
    Behaviors.supervise(SupervisedActor()).onFailure(SupervisorStrategy.restart),
    name = "supervised-actor")

  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "failChild" =>
        child ! "fail"
        this
    }
}

object SupervisedActor {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new SupervisedActor(context))
}

class SupervisedActor(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  println("supervised actor started")

  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "fail" =>
        println("supervised actor fails now")
        throw new Exception("I failed!")
    }

  override def onSignal: PartialFunction[Signal, Behavior[String]] = {
    case PreRestart =>
      println("supervised actor will be restarted")
      this
    case PostStop =>
      println("supervised actor stopped")
      this
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_1/ActorHierarchyExperiments.java#L102-L163 "Go to snippet source")class SupervisingActor extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(SupervisingActor::new);
  }

  private final ActorRef<String> child;

  private SupervisingActor(ActorContext<String> context) {
    super(context);
    child =
        context.spawn(
            Behaviors.supervise(SupervisedActor.create()).onFailure(SupervisorStrategy.restart()),
            "supervised-actor");
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onMessageEquals("failChild", this::onFailChild).build();
  }

  private Behavior<String> onFailChild() {
    child.tell("fail");
    return this;
  }
}

class SupervisedActor extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(SupervisedActor::new);
  }

  private SupervisedActor(ActorContext<String> context) {
    super(context);
    System.out.println("supervised actor started");
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder()
        .onMessageEquals("fail", this::fail)
        .onSignal(PreRestart.class, signal -> preRestart())
        .onSignal(PostStop.class, signal -> postStop())
        .build();
  }

  private Behavior<String> fail() {
    System.out.println("supervised actor fails now");
    throw new RuntimeException("I failed!");
  }

  private Behavior<String> preRestart() {
    System.out.println("supervised will be restarted");
    return this;
  }

  private Behavior<String> postStop() {
    System.out.println("supervised stopped");
    return this;
  }
}
```

And run with:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_1/ActorHierarchyExperiments.scala#L176-L177 "Go to snippet source")val supervisingActor = context.spawn(SupervisingActor(), "supervising-actor")
supervisingActor ! "failChild"
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_1/ActorHierarchyExperiments.java#L217-L219 "Go to snippet source")ActorRef<String> supervisingActor =
    context.spawn(SupervisingActor.create(), "supervising-actor");
supervisingActor.tell("failChild");
```

You should see output similar to the following:

```
supervised actor started
supervised actor fails now
supervised actor will be restarted
supervised actor started
[ERROR] [11/12/2018 12:03:27.171] [ActorHierarchyExperiments-akka.actor.default-dispatcher-2] [akka://ActorHierarchyExperiments/user/supervising-actor/supervised-actor] Supervisor akka.actor.typed.internal.RestartSupervisor@1c452254 saw failure: I failed!
java.lang.Exception: I failed!
	at typed.tutorial_1.SupervisedActor.onMessage(ActorHierarchyExperiments.scala:113)
	at typed.tutorial_1.SupervisedActor.onMessage(ActorHierarchyExperiments.scala:106)
	at akka.actor.typed.scaladsl.AbstractBehavior.receive(AbstractBehavior.scala:59)
	at akka.actor.typed.Behavior$.interpret(Behavior.scala:395)
	at akka.actor.typed.Behavior$.interpretMessage(Behavior.scala:369)
	at akka.actor.typed.internal.InterceptorImpl$$anon$2.apply(InterceptorImpl.scala:49)
	at akka.actor.typed.internal.SimpleSupervisor.aroundReceive(Supervision.scala:85)
	at akka.actor.typed.internal.InterceptorImpl.receive(InterceptorImpl.scala:70)
	at akka.actor.typed.Behavior$.interpret(Behavior.scala:395)
	at akka.actor.typed.Behavior$.interpretMessage(Behavior.scala:369)

```

We see that after failure the supervised actor is stopped and immediately restarted. We also see a log entry reporting the exception that was handled, in this case, our test exception. In this example we also used the [`PreRestart`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart.html "akka.actor.typed.PreRestart")[`PreRestart`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart.html "akka.actor.typed.PreRestart") signal which is processed before restarts.

For the impatient, we also recommend looking into the [fault tolerance reference page](../fault-tolerance.html) for more in\-depth details.

# Summary

We’ve learned about how Akka manages actors in hierarchies where parents supervise their children and handle exceptions. We saw how to create a very simple actor and child. Next, we’ll apply this knowledge to our example use case by modeling the communication necessary to get information from device actors. Later, we’ll deal with how to manage the actors in groups.

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

### Example 4: The Akka actor hierarchy

```scala
package com.example

import akka.actor.typed.ActorSystem
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.AbstractBehavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object PrintMyActorRefActor {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new PrintMyActorRefActor(context))
}

class PrintMyActorRefActor(context: ActorContext[String]) extends AbstractBehavior[String](context) {

  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "printit" =>
        val secondRef = context.spawn(Behaviors.empty[String], "second-actor")
        println(s"Second: $secondRef")
        this
    }
}

object Main {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new Main(context))

}

class Main(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "start" =>
        val firstRef = context.spawn(PrintMyActorRefActor(), "first-actor")
        println(s"First: $firstRef")
        firstRef ! "printit"
        this
    }
}

object ActorHierarchyExperiments extends App {
  val testSystem = ActorSystem(Main(), "testSystem")
  testSystem ! "start"
}
```

### Example 5: The Akka actor hierarchy

```java
package com.example;

import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

class PrintMyActorRefActor extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(PrintMyActorRefActor::new);
  }

  private PrintMyActorRefActor(ActorContext<String> context) {
    super(context);
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onMessageEquals("printit", this::printIt).build();
  }

  private Behavior<String> printIt() {
    ActorRef<String> secondRef = getContext().spawn(Behaviors.empty(), "second-actor");
    System.out.println("Second: " + secondRef);
    return this;
  }
}

class Main extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(Main::new);
  }

  private Main(ActorContext<String> context) {
    super(context);
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onMessageEquals("start", this::start).build();
  }

  private Behavior<String> start() {
    ActorRef<String> firstRef = getContext().spawn(PrintMyActorRefActor.create(), "first-actor");

    System.out.println("First: " + firstRef);
    firstRef.tell("printit");
    return Behaviors.same();
  }
}

public class ActorHierarchyExperiments {
  public static void main(String[] args) {
    ActorRef<String> testSystem = ActorSystem.create(Main.create(), "testSystem");
    testSystem.tell("start");
  }
}
```

### Example 6: The Akka actor hierarchy

```text
First: Actor[akka://testSystem/user/first-actor#1053618476]
Second: Actor[akka://testSystem/user/first-actor/second-actor#-1544706041]
```

### Example 7: The actor lifecycle

```scala
object StartStopActor1 {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new StartStopActor1(context))
}

class StartStopActor1(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  println("first started")
  context.spawn(StartStopActor2(), "second")

  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "stop" => Behaviors.stopped
    }

  override def onSignal: PartialFunction[Signal, Behavior[String]] = {
    case PostStop =>
      println("first stopped")
      this
  }

}

object StartStopActor2 {
  def apply(): Behavior[String] =
    Behaviors.setup(new StartStopActor2(_))
}

class StartStopActor2(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  println("second started")

  override def onMessage(msg: String): Behavior[String] = {
    // no messages handled by this actor
    Behaviors.unhandled
  }

  override def onSignal: PartialFunction[Signal, Behavior[String]] = {
    case PostStop =>
      println("second stopped")
      this
  }

}
```

### Example 8: The actor lifecycle

```java
class StartStopActor1 extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(StartStopActor1::new);
  }

  private StartStopActor1(ActorContext<String> context) {
    super(context);
    System.out.println("first started");

    context.spawn(StartStopActor2.create(), "second");
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder()
        .onMessageEquals("stop", Behaviors::stopped)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private Behavior<String> onPostStop() {
    System.out.println("first stopped");
    return this;
  }
}

class StartStopActor2 extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(StartStopActor2::new);
  }

  private StartStopActor2(ActorContext<String> context) {
    super(context);
    System.out.println("second started");
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onSignal(PostStop.class, signal -> onPostStop()).build();
  }

  private Behavior<String> onPostStop() {
    System.out.println("second stopped");
    return this;
  }
}
```

### Example 9: The actor lifecycle

```scala
val first = context.spawn(StartStopActor1(), "first")
first ! "stop"
```

### Example 10: The actor lifecycle

```java
ActorRef<String> first = context.spawn(StartStopActor1.create(), "first");
first.tell("stop");
```

### Example 11: The actor lifecycle

```text
first started
second started
second stopped
first stopped
```

### Example 12: Failure handling

```scala
object SupervisingActor {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new SupervisingActor(context))
}

class SupervisingActor(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  private val child = context.spawn(
    Behaviors.supervise(SupervisedActor()).onFailure(SupervisorStrategy.restart),
    name = "supervised-actor")

  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "failChild" =>
        child ! "fail"
        this
    }
}

object SupervisedActor {
  def apply(): Behavior[String] =
    Behaviors.setup(context => new SupervisedActor(context))
}

class SupervisedActor(context: ActorContext[String]) extends AbstractBehavior[String](context) {
  println("supervised actor started")

  override def onMessage(msg: String): Behavior[String] =
    msg match {
      case "fail" =>
        println("supervised actor fails now")
        throw new Exception("I failed!")
    }

  override def onSignal: PartialFunction[Signal, Behavior[String]] = {
    case PreRestart =>
      println("supervised actor will be restarted")
      this
    case PostStop =>
      println("supervised actor stopped")
      this
  }

}
```

### Example 13: Failure handling

```java
class SupervisingActor extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(SupervisingActor::new);
  }

  private final ActorRef<String> child;

  private SupervisingActor(ActorContext<String> context) {
    super(context);
    child =
        context.spawn(
            Behaviors.supervise(SupervisedActor.create()).onFailure(SupervisorStrategy.restart()),
            "supervised-actor");
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onMessageEquals("failChild", this::onFailChild).build();
  }

  private Behavior<String> onFailChild() {
    child.tell("fail");
    return this;
  }
}

class SupervisedActor extends AbstractBehavior<String> {

  static Behavior<String> create() {
    return Behaviors.setup(SupervisedActor::new);
  }

  private SupervisedActor(ActorContext<String> context) {
    super(context);
    System.out.println("supervised actor started");
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder()
        .onMessageEquals("fail", this::fail)
        .onSignal(PreRestart.class, signal -> preRestart())
        .onSignal(PostStop.class, signal -> postStop())
        .build();
  }

  private Behavior<String> fail() {
    System.out.println("supervised actor fails now");
    throw new RuntimeException("I failed!");
  }

  private Behavior<String> preRestart() {
    System.out.println("supervised will be restarted");
    return this;
  }

  private Behavior<String> postStop() {
    System.out.println("supervised stopped");
    return this;
  }
}
```

### Example 14: Failure handling

```scala
val supervisingActor = context.spawn(SupervisingActor(), "supervising-actor")
supervisingActor ! "failChild"
```

### Example 15: Failure handling

```java
ActorRef<String> supervisingActor =
    context.spawn(SupervisingActor.create(), "supervising-actor");
supervisingActor.tell("failChild");
```

### Example 16: Failure handling

```text
supervised actor started
supervised actor fails now
supervised actor will be restarted
supervised actor started
[ERROR] [11/12/2018 12:03:27.171] [ActorHierarchyExperiments-akka.actor.default-dispatcher-2] [akka://ActorHierarchyExperiments/user/supervising-actor/supervised-actor] Supervisor akka.actor.typed.internal.RestartSupervisor@1c452254 saw failure: I failed!
java.lang.Exception: I failed!
	at typed.tutorial_1.SupervisedActor.onMessage(ActorHierarchyExperiments.scala:113)
	at typed.tutorial_1.SupervisedActor.onMessage(ActorHierarchyExperiments.scala:106)
	at akka.actor.typed.scaladsl.AbstractBehavior.receive(AbstractBehavior.scala:59)
	at akka.actor.typed.Behavior$.interpret(Behavior.scala:395)
	at akka.actor.typed.Behavior$.interpretMessage(Behavior.scala:369)
	at akka.actor.typed.internal.InterceptorImpl$$anon$2.apply(InterceptorImpl.scala:49)
	at akka.actor.typed.internal.SimpleSupervisor.aroundReceive(Supervision.scala:85)
	at akka.actor.typed.internal.InterceptorImpl.receive(InterceptorImpl.scala:70)
	at akka.actor.typed.Behavior$.interpret(Behavior.scala:395)
	at akka.actor.typed.Behavior$.interpretMessage(Behavior.scala:369)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/PreRestart.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-core/current/typed/attachments/akka-quickstart-java.zip
- https://doc.akka.io/libraries/akka-core/current/typed/attachments/akka-quickstart-scala.zip
- https://doc.akka.io/libraries/akka-core/current/typed/fault-tolerance.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_2.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_1.html](https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_1.html)*