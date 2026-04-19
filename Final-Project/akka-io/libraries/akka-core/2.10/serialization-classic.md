---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:09:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/serialization-classic.html
title: Classic Serialization • Akka core
---

# Classic Serialization • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Serialization

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

Serialization is the same for Classic and Typed actors. It is described in [Serialization](serialization.html), aside from serialization of `ActorRef` that is described [here](serialization-classic.html#serializing-actorrefs).

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Serialization, you must add the following dependency in your project:

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

## Serializing ActorRefs

All ActorRefs are serializable when using [Serialization with Jackson](serialization-jackson.html), but in case you are writing your own serializer, you might want to know how to serialize and deserialize them properly. In the general case, the local address to be used depends on the type of remote address which shall be the recipient of the serialized information. Use `Serialization.serializedActorPath(actorRef)` like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L8-L12 "Go to snippet source")import akka.actor._
import akka.actor.typed.scaladsl.Behaviors
import akka.cluster.Cluster
import akka.serialization._

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/serialization/SerializationDocTest.java#L14-L19 "Go to snippet source")import akka.actor.*;
import akka.serialization.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L241-L250 "Go to snippet source")// Serialize
// (beneath toBinary)
val serializedRef: String = Serialization.serializedActorPath(theActorRef)

// Then serialize the identifier however you like

// Deserialize
// (beneath fromBinary)
val deserializedRef = extendedSystem.provider.resolveActorRef(serializedRef)
// Then use the ActorRef
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/serialization/SerializationDocTest.java#L133-L142 "Go to snippet source")// Serialize
// (beneath toBinary)
String serializedRef = Serialization.serializedActorPath(theActorRef);

// Then just serialize the identifier however you like

// Deserialize
// (beneath fromBinary)
final ActorRef deserializedRef = extendedSystem.provider().resolveActorRef(serializedRef);
// Then just use the ActorRef
```

This assumes that serialization happens in the context of sending a message through the remote transport. There are other uses of serialization, though, e.g. storing actor references outside of an actor application (database, etc.). In this case, it is important to keep in mind that the address part of an actor’s path determines how that actor is communicated with. Storing a local actor path might be the right choice if the retrieval happens in the same logical context, but it is not enough when deserializing it on a different network host: for that it would need to include the system’s remote transport address.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L258-L261 "Go to snippet source")val selfAddress = Cluster(system).selfAddress

val serializedRef: String =
  theActorRef.path.toSerializationFormatWithAddress(selfAddress)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/serialization/SerializationDocTest.java#L152-L154 "Go to snippet source")Address selfAddress = Cluster.get(system).selfAddress();

String serializedRef = theActorRef.path().toSerializationFormatWithAddress(selfAddress);
```

Note
`ActorPath.toSerializationFormatWithAddress` differs from `toString` if the address does not already have `host` and `port` components, i.e. it only inserts address information for local addresses.

`toSerializationFormatWithAddress` also adds the unique id of the actor, which will change when the actor is stopped and then created again with the same name. Sending messages to a reference pointing the old actor will not be delivered to the new actor. If you don’t want this behavior, e.g. in case of long term storage of the reference, you can use `toStringWithAddress`, which doesn’t include the unique id.

There is also a default remote address which is the one used by cluster support (and typical systems have just this one); you can get it like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L258-L261 "Go to snippet source")val selfAddress = Cluster(system).selfAddress

val serializedRef: String =
  theActorRef.path.toSerializationFormatWithAddress(selfAddress)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/serialization/SerializationDocTest.java#L152-L154 "Go to snippet source")Address selfAddress = Cluster.get(system).selfAddress();

String serializedRef = theActorRef.path().toSerializationFormatWithAddress(selfAddress);
```

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

### Example 4: Serializing ActorRefs

```scala
import akka.actor._
import akka.actor.typed.scaladsl.Behaviors
import akka.cluster.Cluster
import akka.serialization._
```

### Example 5: Serializing ActorRefs

```java
import akka.actor.*;
import akka.serialization.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
```

### Example 6: Serializing ActorRefs

```scala
// Serialize
// (beneath toBinary)
val serializedRef: String = Serialization.serializedActorPath(theActorRef)

// Then serialize the identifier however you like

// Deserialize
// (beneath fromBinary)
val deserializedRef = extendedSystem.provider.resolveActorRef(serializedRef)
// Then use the ActorRef
```

### Example 7: Serializing ActorRefs

```java
// Serialize
// (beneath toBinary)
String serializedRef = Serialization.serializedActorPath(theActorRef);

// Then just serialize the identifier however you like

// Deserialize
// (beneath fromBinary)
final ActorRef deserializedRef = extendedSystem.provider().resolveActorRef(serializedRef);
// Then just use the ActorRef
```

### Example 8: Serializing ActorRefs

```scala
val selfAddress = Cluster(system).selfAddress

val serializedRef: String =
  theActorRef.path.toSerializationFormatWithAddress(selfAddress)
```

### Example 9: Serializing ActorRefs

```java
Address selfAddress = Cluster.get(system).selfAddress();

String serializedRef = theActorRef.path().toSerializationFormatWithAddress(selfAddress);
```

### Example 10: Serializing ActorRefs

```scala
val selfAddress = Cluster(system).selfAddress

val serializedRef: String =
  theActorRef.path.toSerializationFormatWithAddress(selfAddress)
```

### Example 11: Serializing ActorRefs

```java
Address selfAddress = Cluster.get(system).selfAddress();

String serializedRef = theActorRef.path().toSerializationFormatWithAddress(selfAddress);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/distributed-data.html
- https://doc.akka.io/libraries/akka-core/2.10/index-network.html
- https://doc.akka.io/libraries/akka-core/2.10/serialization-classic.html
- https://doc.akka.io/libraries/akka-core/2.10/serialization-jackson.html
- https://doc.akka.io/libraries/akka-core/2.10/serialization.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/serialization-classic.html](https://doc.akka.io/libraries/akka-core/2.10/serialization-classic.html)*