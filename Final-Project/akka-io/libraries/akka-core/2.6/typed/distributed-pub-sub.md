---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:15:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/distributed-pub-sub.html
title: Distributed Publish Subscribe in Cluster • Akka Documentation
---

# Distributed Publish Subscribe in Cluster • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Distributed Publish Subscribe in Cluster

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Distributed Publish Subscribe](../distributed-pub-sub.html).

## Module info

The distributed publish subscribe topic API is available and usable with the core `akka-actor-typed` module, however it will only be distributed when used in a clustered application:

sbt
```
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-typed" % AkkaVersion
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
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}"
}
```

## The Topic Actor

Distributed publish subscribe is achieved by representing each pub sub topic with an actor, [`akka.actor.typed.pubsub.Topic`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/pubsub/Topic$.html "akka.actor.typed.pubsub.Topic")[`akka.actor.typed.pubsub.Topic`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/pubsub/Topic.html "akka.actor.typed.pubsub.Topic"). 

The topic actor needs to run on each node where subscribers will live or that wants to publish messages to the topic.

The identity of the topic is a tuple of the type of messages that can be published and a string topic name but it is recommended to not define multiple topics with different types and the same topic name.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/pubsub/PubSubExample.scala#L17-L20 "Go to snippet source")import akka.actor.typed.pubsub.Topic

Behaviors.setup { context =>
  val topic = context.spawn(Topic[Message]("my-topic"), "MyTopic")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/pubsub/PubSubExample.java#L12-L31 "Go to snippet source")import akka.actor.typed.pubsub.Topic;

Behaviors.setup(
    context -> {
      ActorRef<Topic.Command<Message>> topic =
          context.spawn(Topic.create(Message.class, "my-topic"), "MyTopic");
```

Local actors can then subscribe to the topic (and unsubscribe from it):

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/pubsub/PubSubExample.scala#L25-L27 "Go to snippet source")topic ! Topic.Subscribe(subscriberActor)

topic ! Topic.Unsubscribe(subscriberActor)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/pubsub/PubSubExample.java#L36-L38 "Go to snippet source")topic.tell(Topic.subscribe(subscriberActor));

topic.tell(Topic.unsubscribe(subscriberActor));
```

And publish messages to the topic:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/pubsub/PubSubExample.scala#L31 "Go to snippet source")topic ! Topic.Publish(Message("Hello Subscribers!"))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/pubsub/PubSubExample.java#L42 "Go to snippet source")topic.tell(Topic.publish(new Message("Hello Subscribers!")));
```

## Pub Sub Scalability

Each topic is represented by one [Receptionist](actor-discovery.html) service key meaning that the number of topics will scale to thousands or tens of thousands but for higher numbers of topics will require custom solutions. It also means that a very high turnaround of unique topics will not work well and for such use cases a custom solution is advised.

The topic actor acts as a proxy and delegates to the local subscribers handling deduplication so that a published message is only sent once to a node regardless of how many subscribers there are to the topic on that node.

When a topic actor has no subscribers for a topic it will deregister itself from the receptionist meaning published messages for the topic will not be sent to it.

## Delivery Guarantee

As in [Message Delivery Reliability](../general/message-delivery-reliability.html) of Akka, message delivery guarantee in distributed pub sub modes is **at\-most\-once delivery**. In other words, messages can be lost over the wire. In addition to that the registry of nodes which have subscribers is eventually consistent meaning that subscribing an actor on one node will have a short delay before it is known on other nodes and published to.

If you are looking for at\-least\-once delivery guarantee, we recommend [Alpakka Kafka](https://doc.akka.io/docs/alpakka-kafka/current/).

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-typed" % AkkaVersion
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
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}"
}
```

### Example 4: The Topic Actor

```scala
import akka.actor.typed.pubsub.Topic

Behaviors.setup { context =>
  val topic = context.spawn(Topic[Message]("my-topic"), "MyTopic")
```

### Example 5: The Topic Actor

```java
import akka.actor.typed.pubsub.Topic;

Behaviors.setup(
    context -> {
      ActorRef<Topic.Command<Message>> topic =
          context.spawn(Topic.create(Message.class, "my-topic"), "MyTopic");
```

### Example 6: The Topic Actor

```scala
topic ! Topic.Subscribe(subscriberActor)

topic ! Topic.Unsubscribe(subscriberActor)
```

### Example 7: The Topic Actor

```java
topic.tell(Topic.subscribe(subscriberActor));

topic.tell(Topic.unsubscribe(subscriberActor));
```

### Example 8: The Topic Actor

```scala
topic ! Topic.Publish(Message("Hello Subscribers!"))
```

### Example 9: The Topic Actor

```java
topic.tell(Topic.publish(new Message("Hello Subscribers!")));
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/docs/alpakka-kafka/current/
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/pubsub/Topic.html
- https://doc.akka.io/libraries/akka-core/2.6/distributed-pub-sub.html
- https://doc.akka.io/libraries/akka-core/2.6/general/message-delivery-reliability.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/actor-discovery.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/cluster-dc.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/reliable-delivery.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/typed/distributed-pub-sub.html](https://doc.akka.io/libraries/akka-core/2.6/typed/distributed-pub-sub.html)*