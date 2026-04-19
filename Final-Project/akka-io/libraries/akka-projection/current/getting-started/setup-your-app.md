---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:34Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/getting-started/setup-your-app.html
title: Setup your application • Akka Projection
---

# Setup your application • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Setup your application

Add the Akka Projections core library to a new project. This isn’t strictly required, because as we add other dependencies in the following steps it will transitively include core as a dependency, but it never hurts to be explicit.

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

Additionally, add the dependency as below.

sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-projection-core" % "1.6.20"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-core_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-core_${versions.ScalaBinary}:1.6.20"
}
```

Define the event type protocol that will represent each `Envelope` streamed from the Source Provider. Add `ShoppingCartEvents` to your project:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/guide/ShoppingCartEvents.scala#L6-L30 "Go to snippet source")package docs.guide

import akka.serialization.jackson.CborSerializable

import java.time.Instant

object ShoppingCartEvents {

  /**
   * This interface defines all the events that the ShoppingCart supports.
   */
  sealed trait Event extends CborSerializable {
    def cartId: String
  }

  sealed trait ItemEvent extends Event {
    def itemId: String
  }

  final case class ItemAdded(cartId: String, itemId: String, quantity: Int) extends ItemEvent
  final case class ItemRemoved(cartId: String, itemId: String, oldQuantity: Int) extends ItemEvent
  final case class ItemQuantityAdjusted(cartId: String, itemId: String, newQuantity: Int, oldQuantity: Int)
      extends ItemEvent
  final case class CheckedOut(cartId: String, eventTime: Instant) extends Event
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/guide/ShoppingCartEvents.java#L6-L95 "Go to snippet source")package jdocs.guide;

import akka.serialization.jackson.CborSerializable;
import java.time.Instant;

public class ShoppingCartEvents {
  public interface Event extends CborSerializable {
    String getCartId();
  }

  public interface ItemEvent extends Event {
    String getItemId();
  }

  public static final class ItemAdded implements ItemEvent {
    public final String cartId;
    public final String itemId;
    public final int quantity;

    public ItemAdded(String cartId, String itemId, int quantity) {
      this.cartId = cartId;
      this.itemId = itemId;
      this.quantity = quantity;
    }

    public String getCartId() {
      return this.cartId;
    }

    public String getItemId() {
      return this.itemId;
    }
  }

  public static final class ItemRemoved implements ItemEvent {
    public final String cartId;
    public final String itemId;
    public final int oldQuantity;

    public ItemRemoved(String cartId, String itemId, int oldQuantity) {
      this.cartId = cartId;
      this.itemId = itemId;
      this.oldQuantity = oldQuantity;
    }

    public String getCartId() {
      return this.cartId;
    }

    public String getItemId() {
      return this.itemId;
    }
  }

  public static final class ItemQuantityAdjusted implements ItemEvent {
    public final String cartId;
    public final String itemId;
    public final int newQuantity;
    public final int oldQuantity;

    public ItemQuantityAdjusted(String cartId, String itemId, int newQuantity, int oldQuantity) {
      this.cartId = cartId;
      this.itemId = itemId;
      this.newQuantity = newQuantity;
      this.oldQuantity = oldQuantity;
    }

    public String getCartId() {
      return this.cartId;
    }

    public String getItemId() {
      return this.itemId;
    }
  }

  public static final class CheckedOut implements Event {
    public final String cartId;
    public final Instant eventTime;

    public CheckedOut(String cartId, Instant eventTime) {
      this.cartId = cartId;
      this.eventTime = eventTime;
    }

    public String getCartId() {
      return this.cartId;
    }
  }
}
```

To enable serialization and deserialization of events with Akka Persistence it’s necessary to define a base type for your event type hierarchy. In this guide we are using `akka.serialization.jackson.CborSerializable` that has a built\-in binding to [Jackson Serialization](https://doc.akka.io/libraries/akka-core/current/serialization-jackson.html).

Note
For Jackson serialization to work correctly in Java projects you must use the `javac` compiler parameter `-parameters` when building your project. In sbt you can add it your sbt project by adding it to the `javacOptions` Setting: `javacOptions += "-parameters"`maven you can add an argument to `maven-compiler-plugin` plugin under `compilerArgs` ([see an example here](https://github.com/akka/akka-samples/blob/2.6/akka-sample-cqrs-java/pom.xml#L136)).

Define the persistence tags to be used in your project. Note that partitioned tags will be used later when [running the projection in Akka Cluster](running-cluster.html). Add `ShoppingCartTags` to your project:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/guide/ShoppingCartTags.scala#L6-L11 "Go to snippet source")package docs.guide

object ShoppingCartTags {
  val Single = "shopping-cart"
  val Tags = Vector("carts-0", "carts-1", "carts-2")
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/guide/ShoppingCartTags.java#L6-L11 "Go to snippet source")package jdocs.guide;

public class ShoppingCartTags {
  public static String SINGLE = "shopping-cart";
  public static String[] TAGS = {"carts-0", "carts-1", "carts-2"};
}
```

Create the `ShoppingCartApp` with an `akka.actor.typed.ActorSystem` (API: [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")) for Projections to use. Create an empty [Guardian Actor](https://doc.akka.io/libraries/akka-core/current/typed/actor-lifecycle.html#the-guardian-actor) (the root Actor of the `ActorSystem`). We will populate this Actor in the following steps of the guide. Note that we are using the `docs.scaladsl``jdocs.scaladsl` package. You may use any package, but we include this package in snippets throughout the guide.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/guide/ShoppingCartApp.scala#L6-L66 "Go to snippet source")package docs.guide

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.projection.ProjectionBehavior
import akka.projection.eventsourced.EventEnvelope
import com.typesafe.config.ConfigFactory

object ShoppingCartApp extends App {
  val config = ConfigFactory.load("guide-shopping-cart-app.conf")

  ActorSystem(
    Behaviors.setup[String] { context =>
      val system = context.system

      // ...

      Behaviors.empty
    },
    "ShoppingCartApp",
    config)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/guide/ShoppingCartApp.java#L6-L74 "Go to snippet source")package jdocs.guide;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.projection.ProjectionBehavior;
import akka.projection.eventsourced.EventEnvelope;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ShoppingCartApp {
  public static void main(String[] args) throws Exception {
    Config config = ConfigFactory.load("guide-shopping-cart-app.conf");

    ActorSystem.create(
        Behaviors.setup(
            context -> {
              ActorSystem<Void> system = context.getSystem();

              // ...

              return Behaviors.empty();
            }),
        "ShoppingCartApp",
        config);
  }
}
```

## Code Examples

### Example 1: Setup your application

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 2: Setup your application

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

### Example 3: Setup your application

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Setup your application

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-projection-core" % "1.6.20"
```

### Example 5: Setup your application

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-core_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
</dependencies>
```

### Example 6: Setup your application

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-core_${versions.ScalaBinary}:1.6.20"
}
```

### Example 7: Setup your application

```scala
package docs.guide

import akka.serialization.jackson.CborSerializable

import java.time.Instant

object ShoppingCartEvents {

  /**
   * This interface defines all the events that the ShoppingCart supports.
   */
  sealed trait Event extends CborSerializable {
    def cartId: String
  }

  sealed trait ItemEvent extends Event {
    def itemId: String
  }

  final case class ItemAdded(cartId: String, itemId: String, quantity: Int) extends ItemEvent
  final case class ItemRemoved(cartId: String, itemId: String, oldQuantity: Int) extends ItemEvent
  final case class ItemQuantityAdjusted(cartId: String, itemId: String, newQuantity: Int, oldQuantity: Int)
      extends ItemEvent
  final case class CheckedOut(cartId: String, eventTime: Instant) extends Event
}
```

### Example 8: Setup your application

```java
package jdocs.guide;

import akka.serialization.jackson.CborSerializable;
import java.time.Instant;

public class ShoppingCartEvents {
  public interface Event extends CborSerializable {
    String getCartId();
  }

  public interface ItemEvent extends Event {
    String getItemId();
  }

  public static final class ItemAdded implements ItemEvent {
    public final String cartId;
    public final String itemId;
    public final int quantity;

    public ItemAdded(String cartId, String itemId, int quantity) {
      this.cartId = cartId;
      this.itemId = itemId;
      this.quantity = quantity;
    }

    public String getCartId() {
      return this.cartId;
    }

    public String getItemId() {
      return this.itemId;
    }
  }

  public static final class ItemRemoved implements ItemEvent {
    public final String cartId;
    public final String itemId;
    public final int oldQuantity;

    public ItemRemoved(String cartId, String itemId, int oldQuantity) {
      this.cartId = cartId;
      this.itemId = itemId;
      this.oldQuantity = oldQuantity;
    }

    public String getCartId() {
      return this.cartId;
    }

    public String getItemId() {
      return this.itemId;
    }
  }

  public static final class ItemQuantityAdjusted implements ItemEvent {
    public final String cartId;
    public final String itemId;
    public final int newQuantity;
    public final int oldQuantity;

    public ItemQuantityAdjusted(String cartId, String itemId, int newQuantity, int oldQuantity) {
      this.cartId = cartId;
      this.itemId = itemId;
      this.newQuantity = newQuantity;
      this.oldQuantity = oldQuantity;
    }

    public String getCartId() {
      return this.cartId;
    }

    public String getItemId() {
      return this.itemId;
    }
  }

  public static final class CheckedOut implements Event {
    public final String cartId;
    public final Instant eventTime;

    public CheckedOut(String cartId, Instant eventTime) {
      this.cartId = cartId;
      this.eventTime = eventTime;
    }

    public String getCartId() {
      return this.cartId;
    }
  }
}
```

### Example 9: Setup your application

```scala
package docs.guide

object ShoppingCartTags {
  val Single = "shopping-cart"
  val Tags = Vector("carts-0", "carts-1", "carts-2")
}
```

### Example 10: Setup your application

```java
package jdocs.guide;

public class ShoppingCartTags {
  public static String SINGLE = "shopping-cart";
  public static String[] TAGS = {"carts-0", "carts-1", "carts-2"};
}
```

### Example 11: Setup your application

```scala
package docs.guide

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.projection.ProjectionBehavior
import akka.projection.eventsourced.EventEnvelope
import com.typesafe.config.ConfigFactory

object ShoppingCartApp extends App {
  val config = ConfigFactory.load("guide-shopping-cart-app.conf")

  ActorSystem(
    Behaviors.setup[String] { context =>
      val system = context.system

      // ...

      Behaviors.empty
    },
    "ShoppingCartApp",
    config)
}
```

### Example 12: Setup your application

```java
package jdocs.guide;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.projection.ProjectionBehavior;
import akka.projection.eventsourced.EventEnvelope;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ShoppingCartApp {
  public static void main(String[] args) throws Exception {
    Config config = ConfigFactory.load("guide-shopping-cart-app.conf");

    ActorSystem.create(
        Behaviors.setup(
            context -> {
              ActorSystem<Void> system = context.getSystem();

              // ...

              return Behaviors.empty();
            }),
        "ShoppingCartApp",
        config);
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/libraries/akka-core/current/serialization-jackson.html
- https://doc.akka.io/libraries/akka-core/current/typed/actor-lifecycle.html
- https://doc.akka.io/libraries/akka-projection/current/getting-started/index.html
- https://doc.akka.io/libraries/akka-projection/current/getting-started/running-cluster.html
- https://doc.akka.io/libraries/akka-projection/current/getting-started/source-provider.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/getting-started/setup-your-app.html](https://doc.akka.io/libraries/akka-projection/current/getting-started/setup-your-app.html)*