---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_2.html
title: 'Part 2: Creating the First Actor • Akka core'
---

# Part 2: Creating the First Actor • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Part 2: Creating the First Actor

## Introduction

With an understanding of actor hierarchy and behavior, the remaining question is how to map the top\-level components of our IoT system to actors. The *user guardian* can be an actor that represents the whole application. In other words, we will have a single top\-level actor in our IoT system. The components that create and manage devices and dashboards will be children of this actor. This allows us to refactor the example use case architecture diagram into a tree of actors:

![actor tree diagram of the architecture](diagrams/arch_tree_diagram.png)

We can define the first actor, the IotSupervisor, with a few lines of code. To start your tutorial application:

1. Create a new `IotSupervisor` source file in the `com.example` package.
2. Paste the following code into the new file to define the IotSupervisor.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_2/IotSupervisor.scala#L9-L40 "Go to snippet source")package com.example

import akka.actor.typed.Behavior
import akka.actor.typed.PostStop
import akka.actor.typed.Signal
import akka.actor.typed.scaladsl.AbstractBehavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object IotSupervisor {
  def apply(): Behavior[Nothing] =
    Behaviors.setup[Nothing](context => new IotSupervisor(context))
}

class IotSupervisor(context: ActorContext[Nothing]) extends AbstractBehavior[Nothing](context) {
  context.log.info("IoT Application started")

  override def onMessage(msg: Nothing): Behavior[Nothing] = {
    // No need to handle any messages
    Behaviors.unhandled
  }

  override def onSignal: PartialFunction[Signal, Behavior[Nothing]] = {
    case PostStop =>
      context.log.info("IoT Application stopped")
      this
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_2/IotSupervisor.java#L9-L43 "Go to snippet source")package com.example;

import akka.actor.typed.Behavior;
import akka.actor.typed.PostStop;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public class IotSupervisor extends AbstractBehavior<Void> {

  public static Behavior<Void> create() {
    return Behaviors.setup(IotSupervisor::new);
  }

  private IotSupervisor(ActorContext<Void> context) {
    super(context);
    context.getLog().info("IoT Application started");
  }

  // No need to handle any messages
  @Override
  public Receive<Void> createReceive() {
    return newReceiveBuilder().onSignal(PostStop.class, signal -> onPostStop()).build();
  }

  private IotSupervisor onPostStop() {
    getContext().getLog().info("IoT Application stopped");
    return this;
  }
}
```

The code is similar to the actor examples we used in the previous experiments, but notice that instead of `println()` we use Akka’s built in logging facility via [`context.log`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html#log:org.slf4j.Logger "akka.actor.typed.scaladsl.ActorContext")[`context.getLog()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html#getLog() "akka.actor.typed.javadsl.ActorContext").

To provide the `main` entry point that creates the actor system, add the following code to the new `IotApp` object `IotMain` class.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_2/IotApp.scala#L9-L24 "Go to snippet source")package com.example

import akka.actor.typed.ActorSystem

object IotApp {

  def main(args: Array[String]): Unit = {
    // Create ActorSystem and top level supervisor
    ActorSystem[Nothing](IotSupervisor(), "iot-system")
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_2/IotMain.java#L9-L23 "Go to snippet source")package com.example;

import akka.actor.typed.ActorSystem;

public class IotMain {

  public static void main(String[] args) {
    // Create ActorSystem and top level supervisor
    ActorSystem.create(IotSupervisor.create(), "iot-system");
  }
}
```

The application does little, other than log that it is started. But, we have the first actor in place and we are ready to add other actors.

## What’s next?

In the following chapters we will grow the application gradually, by:

1. Creating the representation for a device.
2. Creating the device management component.
3. Adding query capabilities to device groups.

## Code Examples

### Example 1: Introduction

```scala
package com.example

import akka.actor.typed.Behavior
import akka.actor.typed.PostStop
import akka.actor.typed.Signal
import akka.actor.typed.scaladsl.AbstractBehavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object IotSupervisor {
  def apply(): Behavior[Nothing] =
    Behaviors.setup[Nothing](context => new IotSupervisor(context))
}

class IotSupervisor(context: ActorContext[Nothing]) extends AbstractBehavior[Nothing](context) {
  context.log.info("IoT Application started")

  override def onMessage(msg: Nothing): Behavior[Nothing] = {
    // No need to handle any messages
    Behaviors.unhandled
  }

  override def onSignal: PartialFunction[Signal, Behavior[Nothing]] = {
    case PostStop =>
      context.log.info("IoT Application stopped")
      this
  }
}
```

### Example 2: Introduction

```java
package com.example;

import akka.actor.typed.Behavior;
import akka.actor.typed.PostStop;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public class IotSupervisor extends AbstractBehavior<Void> {

  public static Behavior<Void> create() {
    return Behaviors.setup(IotSupervisor::new);
  }

  private IotSupervisor(ActorContext<Void> context) {
    super(context);
    context.getLog().info("IoT Application started");
  }

  // No need to handle any messages
  @Override
  public Receive<Void> createReceive() {
    return newReceiveBuilder().onSignal(PostStop.class, signal -> onPostStop()).build();
  }

  private IotSupervisor onPostStop() {
    getContext().getLog().info("IoT Application stopped");
    return this;
  }
}
```

### Example 3: Introduction

```scala
package com.example

import akka.actor.typed.ActorSystem

object IotApp {

  def main(args: Array[String]): Unit = {
    // Create ActorSystem and top level supervisor
    ActorSystem[Nothing](IotSupervisor(), "iot-system")
  }

}
```

### Example 4: Introduction

```java
package com.example;

import akka.actor.typed.ActorSystem;

public class IotMain {

  public static void main(String[] args) {
    // Create ActorSystem and top level supervisor
    ActorSystem.create(IotSupervisor.create(), "iot-system");
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_1.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_3.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_2.html](https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_2.html)*