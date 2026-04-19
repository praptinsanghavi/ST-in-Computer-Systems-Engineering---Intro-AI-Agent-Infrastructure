---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:12:49Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/distributed-pub-sub.html
title: Distributed Publish Subscribe in Cluster • Akka core
---

# Distributed Publish Subscribe in Cluster • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Distributed Publish Subscribe in Cluster

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Distributed Publish Subscribe](../distributed-pub-sub.html).

## Module info

The distributed publish subscribe topic API is available and usable with the core `akka-actor-typed` module, however it will only be distributed when used in a clustered application.

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

sbt
```
val AkkaVersion = "2.10.17"
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
      <version>2.10.17</version>
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
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}"
}
```

## The Topic Registry

Distributed publish subscribe is achieved by representing each pub sub topic with an actor, [`akka.actor.typed.pubsub.Topic`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html "akka.actor.typed.pubsub.Topic")[`akka.actor.typed.pubsub.Topic`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html "akka.actor.typed.pubsub.Topic").

The topic actor needs to run on each node where subscribers will live or that wants to publish messages to the topic. 

Topics can be looked up in the [`PubSub`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/PubSub$.html "akka.actor.typed.pubsub.PubSub")[`PubSub`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/PubSub.html "akka.actor.typed.pubsub.PubSub") registry, this way the same topic will be represented by the same actor for a whole actor system. If the topic has not yet been started it is started and returned, if it already is running, the existing `ActorRef` is returned.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/pubsub/PubSubExample.scala#L33-L39 "Go to snippet source")import akka.actor.typed.pubsub.Topic
import akka.actor.typed.pubsub.PubSub

Behaviors.setup { context =>
  val pubSub = PubSub(context.system)

  val topic: ActorRef[Topic.Command[Message]] = pubSub.topic[Message]("my-topic")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/pubsub/PubSubExample.java#L12-L49 "Go to snippet source")import akka.actor.typed.pubsub.PubSub;
import akka.actor.typed.pubsub.Topic;

import java.time.Duration;

Behaviors.setup(
    context -> {
      PubSub pubSub = PubSub.get(context.getSystem());

      ActorRef<Topic.Command<Message>> topic =
          pubSub.topic(Message.class, "my-topic");
```

The identity of the topic is the topic name and if it already has been started with a different type of message this will lead to an exception.

Local actors can then subscribe to the topic (and unsubscribe from it) via messages defined in [`Topic`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html "akka.actor.typed.pubsub.Topic")[`Topic`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html "akka.actor.typed.pubsub.Topic"):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/pubsub/PubSubExample.scala#L48-L50 "Go to snippet source")topic ! Topic.Subscribe(subscriberActor)

topic ! Topic.Unsubscribe(subscriberActor)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/pubsub/PubSubExample.java#L60-L62 "Go to snippet source")topic.tell(Topic.subscribe(subscriberActor));

topic.tell(Topic.unsubscribe(subscriberActor));
```

And publish messages to the topic:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/pubsub/PubSubExample.scala#L54 "Go to snippet source")topic ! Topic.Publish(Message("Hello Subscribers!"))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/pubsub/PubSubExample.java#L66 "Go to snippet source")topic.tell(Topic.publish(new Message("Hello Subscribers!")));
```

Messages published only be delivered to other nodes if the topic is started and there are any local subscribers registered with the topic there. The message is deduplicated so that even if there are multiple subscribers on a node, the message is only passed over the network to that node once.

It is possible to define a TTL (time to live) for the local topic actor, if it has no local subscribers or messages passing through for the given time period it stopped and removed from the registry:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/pubsub/PubSubExample.scala#L43 "Go to snippet source")val topicWithTtl = pubSub.topic[Message]("my-topic", 3.minutes)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/pubsub/PubSubExample.java#L53-L54 "Go to snippet source")ActorRef<Topic.Command<Message>> topicWithTtl =
    pubSub.topic(Message.class, "my-ttl-topic", Duration.ofMinutes(3));
```

## The Topic Actor

The topic actor can also be started and managed manually. This means that multiple actors for the same topic can be started on the same node. Messages published to a topic on other cluster nodes will be sent between the nodes once per active topic actor that has any local subscribers:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/pubsub/PubSubExample.scala#L21-L24 "Go to snippet source")import akka.actor.typed.pubsub.Topic

Behaviors.setup { context =>
  val topic = context.spawn(Topic[Message]("my-topic"), "MyTopic")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/pubsub/PubSubExample.java#L14-L36 "Go to snippet source")import akka.actor.typed.pubsub.Topic;

import java.time.Duration;

Behaviors.setup(
    context -> {
      ActorRef<Topic.Command<Message>> topic =
          context.spawn(Topic.create(Message.class, "my-topic"), "MyTopic");
```

## Pub Sub Scalability

Each topic is represented by one [Receptionist](actor-discovery.html) service key meaning that the number of topics will scale to thousands or tens of thousands but for higher numbers of topics will require custom solutions. It also means that a very high turnaround of unique topics will not work well and for such use cases a custom solution is advised.

The topic actor acts as a proxy and delegates to the local subscribers handling deduplication so that a published message is only sent once to a node regardless of how many subscribers there are to the topic on that node.

When a topic actor has no subscribers for a topic it will deregister itself from the receptionist meaning published messages for the topic will not be sent to it.

## Delivery Guarantee

As in [Message Delivery Reliability](../general/message-delivery-reliability.html) of Akka, message delivery guarantee in distributed pub sub modes is **at\-most\-once delivery**. In other words, messages can be lost over the wire. In addition to that the registry of nodes which have subscribers is eventually consistent meaning that subscribing an actor on one node will have a short delay before it is known on other nodes and published to.

If you are looking for at\-least\-once delivery guarantee, we recommend [Alpakka Kafka](https://doc.akka.io/libraries/alpakka-kafka/current/).

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
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
      <version>2.10.17</version>
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
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}"
}
```

### Example 4: The Topic Registry

```scala
import akka.actor.typed.pubsub.Topic
import akka.actor.typed.pubsub.PubSub

Behaviors.setup { context =>
  val pubSub = PubSub(context.system)

  val topic: ActorRef[Topic.Command[Message]] = pubSub.topic[Message]("my-topic")
```

### Example 5: The Topic Registry

```java
import akka.actor.typed.pubsub.PubSub;
import akka.actor.typed.pubsub.Topic;

import java.time.Duration;

Behaviors.setup(
    context -> {
      PubSub pubSub = PubSub.get(context.getSystem());

      ActorRef<Topic.Command<Message>> topic =
          pubSub.topic(Message.class, "my-topic");
```

### Example 6: The Topic Registry

```scala
topic ! Topic.Subscribe(subscriberActor)

topic ! Topic.Unsubscribe(subscriberActor)
```

### Example 7: The Topic Registry

```java
topic.tell(Topic.subscribe(subscriberActor));

topic.tell(Topic.unsubscribe(subscriberActor));
```

### Example 8: The Topic Registry

```scala
topic ! Topic.Publish(Message("Hello Subscribers!"))
```

### Example 9: The Topic Registry

```java
topic.tell(Topic.publish(new Message("Hello Subscribers!")));
```

### Example 10: The Topic Registry

```scala
val topicWithTtl = pubSub.topic[Message]("my-topic", 3.minutes)
```

### Example 11: The Topic Registry

```java
ActorRef<Topic.Command<Message>> topicWithTtl =
    pubSub.topic(Message.class, "my-ttl-topic", Duration.ofMinutes(3));
```

### Example 12: The Topic Actor

```scala
import akka.actor.typed.pubsub.Topic

Behaviors.setup { context =>
  val topic = context.spawn(Topic[Message]("my-topic"), "MyTopic")
```

### Example 13: The Topic Actor

```java
import akka.actor.typed.pubsub.Topic;

import java.time.Duration;

Behaviors.setup(
    context -> {
      ActorRef<Topic.Command<Message>> topic =
          context.spawn(Topic.create(Message.class, "my-topic"), "MyTopic");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/PubSub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/PubSub.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html
- https://doc.akka.io/libraries/akka-core/2.10/distributed-pub-sub.html
- https://doc.akka.io/libraries/akka-core/2.10/general/message-delivery-reliability.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/actor-discovery.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharded-daemon-process.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/reliable-delivery.html
- https://doc.akka.io/libraries/alpakka-kafka/current/

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/typed/distributed-pub-sub.html](https://doc.akka.io/libraries/akka-core/2.10/typed/distributed-pub-sub.html)*