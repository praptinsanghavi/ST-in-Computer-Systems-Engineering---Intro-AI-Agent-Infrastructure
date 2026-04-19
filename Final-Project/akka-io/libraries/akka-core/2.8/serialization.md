---
description: Serialization APIs built into Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:25:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/docs/akka/current/serialization.html
title: Serialization • Akka Documentation
---

# Serialization • Akka Documentation

> **Summary:** Serialization APIs built into Akka.

## Content

# Serialization

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

To use Serialization, you must add the following dependency in your project:

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

## Introduction

The messages that Akka actors send to each other are JVM objects (e.g. instances of Scala case classes). Message passing between actors that live on the same JVM is straightforward. It is done via reference passing. However, messages that have to escape the JVM to reach an actor running on a different host have to undergo some form of serialization (i.e. the objects have to be converted to and from byte arrays).

The serialization mechanism in Akka allows you to write custom serializers and to define which serializer to use for what.

[Serialization with Jackson](serialization-jackson.html) is a good choice in many cases and our recommendation if you don’t have other preference.

[Google Protocol Buffers](https://developers.google.com/protocol-buffers/) is good if you want more control over the schema evolution of your messages, but it requires more work to develop and maintain the mapping between serialized representation and domain representation.

Akka itself uses Protocol Buffers to serialize internal messages (for example cluster gossip messages).

## Usage

### Configuration

For Akka to know which `Serializer` to use for what, you need to edit your configuration: in the `akka.actor.serializers`\-section, you bind names to implementations of the [`akka.serialization.Serializer`](https://doc.akka.io/api/akka/2.8/akka/serialization/Serializer.html "akka.serialization.Serializer")[`akka.serialization.Serializer`](https://doc.akka.io/japi/akka/2.8/akka/serialization/Serializer.html "akka.serialization.Serializer") you wish to use, like this:

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L161-L170 "Go to snippet source")akka {
  actor {
    serializers {
      jackson-json = "akka.serialization.jackson.JacksonJsonSerializer"
      jackson-cbor = "akka.serialization.jackson.JacksonCborSerializer"
      proto = "akka.remote.serialization.ProtobufSerializer"
      myown = "docs.serialization.MyOwnSerializer"
    }
  }
}
```

After you’ve bound names to different implementations of `Serializer` you need to wire which classes should be serialized using which `Serializer`, this is done in the `akka.actor.serialization-bindings`\-section:

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L180-L196 "Go to snippet source")akka {
  actor {
    serializers {
      jackson-json = "akka.serialization.jackson.JacksonJsonSerializer"
      jackson-cbor = "akka.serialization.jackson.JacksonCborSerializer"
      proto = "akka.remote.serialization.ProtobufSerializer"
      myown = "docs.serialization.MyOwnSerializer"
    }

    serialization-bindings {
      "docs.serialization.JsonSerializable" = jackson-json
      "docs.serialization.CborSerializable" = jackson-cbor
      "com.google.protobuf.Message" = proto
      "docs.serialization.MyOwnSerializable" = myown
    }
  }
}
```

You only need to specify the name of a traitan interface or abstract base class of the messages. In case of ambiguity, i.e. the message implements several of the configured classes, the most specific configured class will be used, i.e. the one of which all other candidates are superclasses. If this condition cannot be met, because e.g. two marker traitsinterfaces that have been configured for serialization both apply and neither is a subtype of the other, a warning will be issued.

Note
If you are using Scala for your message protocol and your messages are contained inside of a Scala object, then in order to reference those messages, you will need to use the fully qualified Java class name. For a message named `Message` contained inside the Scala object named `Wrapper` you would need to reference it as `Wrapper$Message` instead of `Wrapper.Message`.

Akka provides serializers for several primitive types and [protobuf](https://github.com/protocolbuffers/protobuf) [`com.google.protobuf.GeneratedMessage`](https://javadoc.io/doc/com.google.protobuf/protobuf-java/latest/com/google/protobuf/GeneratedMessage.html "com.google.protobuf.GeneratedMessage") (protobuf2\) and [`com.google.protobuf.GeneratedMessageV3`](https://javadoc.io/doc/com.google.protobuf/protobuf-java/latest/com/google/protobuf/GeneratedMessageV3.html "com.google.protobuf.GeneratedMessageV3") (protobuf3\) by default (the latter only if depending on the akka\-remote module), so normally you don’t need to add configuration for that if you send raw protobuf messages as actor messages.

### Programmatic

If you want to programmatically serialize/deserialize using Akka Serialization, here are some examples:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L8-L12 "Go to snippet source")import akka.actor._
import akka.actor.typed.scaladsl.Behaviors
import akka.cluster.Cluster
import akka.serialization._

```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/serialization/SerializationDocTest.java#L14-L19 "Go to snippet source")import akka.actor.*;
import akka.serialization.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

```

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L206-L220 "Go to snippet source")val system = ActorSystem("example")

// Get the Serialization Extension
val serialization = SerializationExtension(system)

// Have something to serialize
val original = "woohoo"

// Turn it into bytes, and retrieve the serializerId and manifest, which are needed for deserialization
val bytes = serialization.serialize(original).get
val serializerId = serialization.findSerializerFor(original).identifier
val manifest = Serializers.manifestFor(serialization.findSerializerFor(original), original)

// Turn it back into an object
val back = serialization.deserialize(bytes, serializerId, manifest).get
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/serialization/SerializationDocTest.java#L161-L176 "Go to snippet source")ActorSystem system = ActorSystem.create("example");

// Get the Serialization Extension
Serialization serialization = SerializationExtension.get(system);

// Have something to serialize
String original = "woohoo";

// Turn it into bytes, and retrieve the serializerId and manifest, which are needed for
// deserialization
byte[] bytes = serialization.serialize(original).get();
int serializerId = serialization.findSerializerFor(original).identifier();
String manifest = Serializers.manifestFor(serialization.findSerializerFor(original), original);

// Turn it back into an object
String back = (String) serialization.deserialize(bytes, serializerId, manifest).get();
```

The manifest is a type hint so that the same serializer can be used for different classes.

Note that when deserializing from bytes the manifest and the identifier of the serializer are needed. It is important to use the serializer identifier in this way to support rolling updates, where the `serialization-bindings` for a class may have changed from one serializer to another. Therefore the three parts consisting of the bytes, the serializer id, and the manifest should always be transferred or stored together so that they can be deserialized with different `serialization-bindings` configuration.

The [`SerializationExtension`](https://doc.akka.io/api/akka/2.8/akka/serialization/SerializationExtension$.html "akka.serialization.SerializationExtension")[`SerializationExtension`](https://doc.akka.io/japi/akka/2.8/akka/serialization/SerializationExtension.html "akka.serialization.SerializationExtension") is a Classic [`Extension`](https://doc.akka.io/api/akka/2.8/akka/actor/Extension.html "akka.actor.Extension")[`Extension`](https://doc.akka.io/japi/akka/2.8/akka/actor/Extension.html "akka.actor.Extension"), but it can be used with an [`akka.actor.typed.ActorSystem`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`akka.actor.typed.ActorSystem`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") like this:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L231-L236 "Go to snippet source")import akka.actor.typed.ActorSystem

val system = ActorSystem(Behaviors.empty, "example")

// Get the Serialization Extension
val serialization = SerializationExtension(system)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/serialization/SerializationDocTest.java#L187-L191 "Go to snippet source")akka.actor.typed.ActorSystem<Void> system =
    akka.actor.typed.ActorSystem.create(Behaviors.empty(), "example");

// Get the Serialization Extension
Serialization serialization = SerializationExtension.get(system);
```

## Customization

The first code snippet on this page contains a configuration file that references a custom serializer `docs.serialization.MyOwnSerializer`. How would we go about creating such a custom serializer?

### Creating new Serializers

A custom `Serializer` has to inherit from [`akka.serialization.Serializer`](https://doc.akka.io/api/akka/2.8/akka/serialization/Serializer.html "akka.serialization.Serializer")[`akka.serialization.Serializer`](https://doc.akka.io/japi/akka/2.8/akka/serialization/Serializer.html "akka.serialization.Serializer")[`akka.serialization.JSerializer`](https://doc.akka.io/api/akka/2.8/akka/serialization/JSerializer.html "akka.serialization.JSerializer")[`akka.serialization.JSerializer`](https://doc.akka.io/japi/akka/2.8/akka/serialization/JSerializer.html "akka.serialization.JSerializer") and can be defined like the following:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L8-L12 "Go to snippet source")import akka.actor._
import akka.actor.typed.scaladsl.Behaviors
import akka.cluster.Cluster
import akka.serialization._

```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/serialization/SerializationDocTest.java#L14-L19 "Go to snippet source")import akka.actor.*;
import akka.serialization.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

```

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L21-L52 "Go to snippet source")class MyOwnSerializer extends Serializer {

  // If you need logging here, introduce a constructor that takes an ExtendedActorSystem.
  // class MyOwnSerializer(actorSystem: ExtendedActorSystem) extends Serializer
  // Get a logger using:
  // private val logger = Logging(actorSystem, this)

  // This is whether "fromBinary" requires a "clazz" or not
  def includeManifest: Boolean = true

  // Pick a unique identifier for your Serializer,
  // you've got a couple of billions to choose from,
  // 0 - 40 is reserved by Akka itself
  def identifier = 1234567

  // "toBinary" serializes the given object to an Array of Bytes
  def toBinary(obj: AnyRef): Array[Byte] = {
    // Put the code that serializes the object here
    //#...
    Array[Byte]()
    //#...
  }

  // "fromBinary" deserializes the given array,
  // using the type hint (if any, see "includeManifest" above)
  def fromBinary(bytes: Array[Byte], clazz: Option[Class[_]]): AnyRef = {
    // Put your code that deserializes here
    //#...
    null
    //#...
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/serialization/SerializationDocTest.java#L25-L64 "Go to snippet source")static class MyOwnSerializer extends JSerializer {

  // If you need logging here, introduce a constructor that takes an ExtendedActorSystem.
  // public MyOwnSerializer(ExtendedActorSystem actorSystem)
  // Get a logger using:
  // private final LoggingAdapter logger = Logging.getLogger(actorSystem, this);

  // This is whether "fromBinary" requires a "clazz" or not
  @Override
  public boolean includeManifest() {
    return false;
  }

  // Pick a unique identifier for your Serializer,
  // you've got a couple of billions to choose from,
  // 0 - 40 is reserved by Akka itself
  @Override
  public int identifier() {
    return 1234567;
  }

  // "toBinary" serializes the given object to an Array of Bytes
  @Override
  public byte[] toBinary(Object obj) {
    // Put the code that serializes the object here
    // #...
    return new byte[0];
    // #...
  }

  // "fromBinary" deserializes the given array,
  // using the type hint (if any, see "includeManifest" above)
  @Override
  public Object fromBinaryJava(byte[] bytes, Class<?> clazz) {
    // Put your code that deserializes here
    // #...
    return null;
    // #...
  }
}
```

The `identifier` must be unique. The identifier is used when selecting which serializer to use for deserialization. If you have accidentally configured several serializers with the same identifier that will be detected and prevent the [`ActorSystem`](https://doc.akka.io/api/akka/2.8/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.8/akka/actor/ActorSystem.html "akka.actor.ActorSystem") from being started. It can be a hardcoded value because it must remain the same value to support rolling updates. 

If you prefer to define the identifier in cofiguration that is supported by the [`BaseSerializer`](https://doc.akka.io/api/akka/2.8/akka/serialization/BaseSerializer.html "akka.serialization.BaseSerializer")[`BaseSerializer`](https://doc.akka.io/japi/akka/2.8/akka/serialization/BaseSerializer.html "akka.serialization.BaseSerializer") trait, which implements the `def identifier` by reading it from configuration based on the serializer’s class name:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L116-L122 "Go to snippet source")akka {
  actor {
    serialization-identifiers {
      "docs.serialization.MyOwnSerializer" = 1234567
    }
  }
}
```

The manifest is a type hint so that the same serializer can be used for different classes. The manifest parameter in [`fromBinary`](https://doc.akka.io/api/akka/2.8/akka/serialization/Serializer.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):AnyRef "akka.serialization.Serializer")[`fromBinaryJava`](https://doc.akka.io/japi/akka/2.8/akka/serialization/JSerializer.html#fromBinaryJava(byte[],java.lang.Class) "akka.serialization.JSerializer") is the class of the object that was serialized. In `fromBinary``fromBinaryJava` you can match on the class and deserialize the bytes to different objects.

Then you only need to fill in the blanks, bind it to a name in your configuration and list which classes should be deserialized with it.

The serializers are initialized eagerly by the [`SerializationExtension`](https://doc.akka.io/api/akka/2.8/akka/serialization/SerializationExtension$.html "akka.serialization.SerializationExtension")[`SerializationExtension`](https://doc.akka.io/japi/akka/2.8/akka/serialization/SerializationExtension.html "akka.serialization.SerializationExtension") when the [`ActorSystem`](https://doc.akka.io/api/akka/2.8/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.8/akka/actor/ActorSystem.html "akka.actor.ActorSystem") is started and therefore a serializer itself must not access the `SerializationExtension` from its constructor. Instead, it should access the `SerializationExtension` lazily.

### Serializer with String Manifest

The `Serializer` illustrated above supports a class based manifest (type hint). For serialization of data that need to evolve over time the [`SerializerWithStringManifest`](https://doc.akka.io/api/akka/2.8/akka/serialization/SerializerWithStringManifest.html "akka.serialization.SerializerWithStringManifest")[`SerializerWithStringManifest`](https://doc.akka.io/japi/akka/2.8/akka/serialization/SerializerWithStringManifest.html "akka.serialization.SerializerWithStringManifest") is recommended instead of `Serializer` because the manifest (type hint) is a [`String`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html "java.lang.String") instead of a [`Class`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html "java.lang.Class"). That means that the class can be moved/removed and the serializer can still deserialize old data by matching on the `String`. This is especially useful for [Persistence](persistence.html).

The manifest string can also encode a version number that can be used in [`fromBinary`](https://doc.akka.io/api/akka/2.8/akka/serialization/Serializer.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):AnyRef "akka.serialization.Serializer")[`fromBinaryJava`](https://doc.akka.io/japi/akka/2.8/akka/serialization/JSerializer.html#fromBinaryJava(byte[],java.lang.Class) "akka.serialization.JSerializer") to deserialize in different ways to migrate old data to new domain objects.

If the data was originally serialized with `Serializer` and in a later version of the system you change to `SerializerWithStringManifest` then the manifest string will be the full class name if you used `includeManifest=true`, otherwise it will be the empty string.

This is how a `SerializerWithStringManifest` looks like:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L56-L95 "Go to snippet source")class MyOwnSerializer2 extends SerializerWithStringManifest {

  val CustomerManifest = "customer"
  val UserManifest = "user"
  val UTF_8 = StandardCharsets.UTF_8.name()

  // Pick a unique identifier for your Serializer,
  // you've got a couple of billions to choose from,
  // 0 - 40 is reserved by Akka itself
  def identifier = 1234567

  // The manifest (type hint) that will be provided in the fromBinary method
  // Use `""` if manifest is not needed.
  def manifest(obj: AnyRef): String =
    obj match {
      case _: Customer => CustomerManifest
      case _: User     => UserManifest
    }

  // "toBinary" serializes the given object to an Array of Bytes
  def toBinary(obj: AnyRef): Array[Byte] = {
    // Put the real code that serializes the object here
    obj match {
      case Customer(name) => name.getBytes(UTF_8)
      case User(name)     => name.getBytes(UTF_8)
    }
  }

  // "fromBinary" deserializes the given array,
  // using the type hint
  def fromBinary(bytes: Array[Byte], manifest: String): AnyRef = {
    // Put the real code that deserializes here
    manifest match {
      case CustomerManifest =>
        Customer(new String(bytes, UTF_8))
      case UserManifest =>
        User(new String(bytes, UTF_8))
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/java/jdocs/serialization/SerializationDocTest.java#L85-L124 "Go to snippet source")static class MyOwnSerializer2 extends SerializerWithStringManifest {

  private static final String CUSTOMER_MANIFEST = "customer";
  private static final String USER_MANIFEST = "user";
  private static final Charset UTF_8 = StandardCharsets.UTF_8;

  // Pick a unique identifier for your Serializer,
  // you've got a couple of billions to choose from,
  // 0 - 40 is reserved by Akka itself
  @Override
  public int identifier() {
    return 1234567;
  }

  @Override
  public String manifest(Object obj) {
    if (obj instanceof Customer) return CUSTOMER_MANIFEST;
    else if (obj instanceof User) return USER_MANIFEST;
    else throw new IllegalArgumentException("Unknown type: " + obj);
  }

  // "toBinary" serializes the given object to an Array of Bytes
  @Override
  public byte[] toBinary(Object obj) {
    // Put the real code that serializes the object here
    if (obj instanceof Customer) return ((Customer) obj).name.getBytes(UTF_8);
    else if (obj instanceof User) return ((User) obj).name.getBytes(UTF_8);
    else throw new IllegalArgumentException("Unknown type: " + obj);
  }

  // "fromBinary" deserializes the given array,
  // using the type hint
  @Override
  public Object fromBinary(byte[] bytes, String manifest) {
    // Put the real code that deserializes here
    if (manifest.equals(CUSTOMER_MANIFEST)) return new Customer(new String(bytes, UTF_8));
    else if (manifest.equals(USER_MANIFEST)) return new User(new String(bytes, UTF_8));
    else throw new IllegalArgumentException("Unknown manifest: " + manifest);
  }
}
```

You must also bind it to a name in your configuration and then list which classes should be serialized by it.

It’s recommended to throw [`IllegalArgumentException`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IllegalArgumentException.html "java.lang.IllegalArgumentException") or [`NotSerializableException`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/NotSerializableException.html "java.io.NotSerializableException") in `fromBinary` if the manifest is unknown. This makes it possible to introduce new message types and send them to nodes that don’t know about them. This is typically needed when performing rolling updates, i.e. running a cluster with mixed versions for a while. Those exceptions are treated as a transient problem in the classic remoting layer. The problem will be logged and the message dropped. Other exceptions will tear down the TCP connection because it can be an indication of corrupt bytes from the underlying transport. Artery TCP handles all deserialization exceptions as transient problems.

### Serializing ActorRefs

Actor references are typically included in the messages. All ActorRefs are serializable when using [Serialization with Jackson](serialization-jackson.html), but in case you are writing your own serializer, you might want to know how to serialize and deserialize them properly.

To serialize actor references to/from string representation you would use the [`ActorRefResolver`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRefResolver.html "akka.actor.typed.ActorRefResolver")[`ActorRefResolver`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRefResolver.html "akka.actor.typed.ActorRefResolver").

For example here’s how a serializer could look for `Ping` and `Pong` messages:

Scala

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/PingSerializer.scala#L16-L52 "Go to snippet source")class PingSerializer(system: ExtendedActorSystem) extends SerializerWithStringManifest {
  private val actorRefResolver = ActorRefResolver(system.toTyped)

  private val PingManifest = "a"
  private val PongManifest = "b"

  override def identifier = 41

  override def manifest(msg: AnyRef) = msg match {
    case _: PingService.Ping => PingManifest
    case PingService.Pong    => PongManifest
    case _ =>
      throw new IllegalArgumentException(s"Can't serialize object of type ${msg.getClass} in [${getClass.getName}]")
  }

  override def toBinary(msg: AnyRef) = msg match {
    case PingService.Ping(who) =>
      actorRefResolver.toSerializationFormat(who).getBytes(StandardCharsets.UTF_8)
    case PingService.Pong =>
      Array.emptyByteArray
    case _ =>
      throw new IllegalArgumentException(s"Can't serialize object of type ${msg.getClass} in [${getClass.getName}]")
  }

  override def fromBinary(bytes: Array[Byte], manifest: String) = {
    manifest match {
      case PingManifest =>
        val str = new String(bytes, StandardCharsets.UTF_8)
        val ref = actorRefResolver.resolveActorRef[PingService.Pong.type](str)
        PingService.Ping(ref)
      case PongManifest =>
        PingService.Pong
      case _ =>
        throw new IllegalArgumentException(s"Unknown manifest [$manifest]")
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/PingSerializerExampleTest.java#L27-L86 "Go to snippet source")public class PingSerializer extends SerializerWithStringManifest {

  final ExtendedActorSystem system;
  final ActorRefResolver actorRefResolver;

  static final String PING_MANIFEST = "a";
  static final String PONG_MANIFEST = "b";

  PingSerializer(ExtendedActorSystem system) {
    this.system = system;
    actorRefResolver = ActorRefResolver.get(Adapter.toTyped(system));
  }

  @Override
  public int identifier() {
    return 97876;
  }

  @Override
  public String manifest(Object obj) {
    if (obj instanceof Ping) return PING_MANIFEST;
    else if (obj instanceof Pong) return PONG_MANIFEST;
    else
      throw new IllegalArgumentException(
          "Can't serialize object of type "
              + obj.getClass()
              + " in ["
              + getClass().getName()
              + "]");
  }

  @Override
  public byte[] toBinary(Object obj) {
    if (obj instanceof Ping)
      return actorRefResolver
          .toSerializationFormat(((Ping) obj).replyTo)
          .getBytes(StandardCharsets.UTF_8);
    else if (obj instanceof Pong) return new byte[0];
    else
      throw new IllegalArgumentException(
          "Can't serialize object of type "
              + obj.getClass()
              + " in ["
              + getClass().getName()
              + "]");
  }

  @Override
  public Object fromBinary(byte[] bytes, String manifest) {
    if (PING_MANIFEST.equals(manifest)) {
      String str = new String(bytes, StandardCharsets.UTF_8);
      ActorRef<Pong> ref = actorRefResolver.resolveActorRef(str);
      return new Ping(ref);
    } else if (PONG_MANIFEST.equals(manifest)) {
      return new Pong();
    } else {
      throw new IllegalArgumentException("Unable to handle manifest: " + manifest);
    }
  }
}
```

Serialization of Classic [`ActorRef`](https://doc.akka.io/api/akka/2.8/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka/2.8/akka/actor/ActorRef.html "akka.actor.ActorRef") is described in [Classic Serialization](serialization-classic.html#serializing-actorrefs). Classic and Typed actor references have the same serialization format so they can be interchanged.

### Deep serialization of Actors

The recommended approach to do deep serialization of internal actor state is to use Akka [Persistence](persistence.html).

## Serialization of Akka’s messages

Akka is using a Protobuf 3 for serialization of messages defined by Akka. This dependency is shaded in the `akka-protobuf-v3` artifact so that applications can use another version of Protobuf.

Applications should use standard Protobuf dependency and not `akka-protobuf-v3`.

## Java serialization

Java serialization is known to be slow and [prone to attacks](https://community.microfocus.com/cyberres/fortify/f/fortify-discussions/317555/the-perils-of-java-deserialization) of various kinds \- it never was designed for high throughput messaging after all. One may think that network bandwidth and latency limit the performance of remote messaging, but serialization is a more typical bottleneck.

Note
Akka serialization with Java serialization is disabled by default and Akka itself doesn’t use Java serialization for any of its internal messages. It is highly discouraged to enable Java serialization in production.

The log messages emitted by the disabled Java serializer in production SHOULD be treated as potential attacks which the serializer prevented, as they MAY indicate an external operator attempting to send malicious messages intending to use java serialization as attack vector. The attempts are logged with the SECURITY marker.

However, for early prototyping it is very convenient to use. For that reason and for compatibility with older systems that rely on Java serialization it can be enabled with the following configuration:

```
akka.actor.allow-java-serialization = on

```

Akka will still log warning when Java serialization is used and to silent that you may add:

```
akka.actor.warn-about-java-serializer-usage = off

```

### Java serialization compatibility

It is not safe to mix major Scala versions when using the Java serialization as Scala does not guarantee compatibility and this could lead to very surprising errors.

## Rolling updates

A serialized remote message (or persistent event) consists of serializer\-id, the manifest, and the binary payload. When deserializing it is only looking at the serializer\-id to pick which `Serializer``JSerializer` to use for [`fromBinary`](https://doc.akka.io/api/akka/2.8/akka/serialization/Serializer.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):AnyRef "akka.serialization.Serializer")[`fromBinaryJava`](https://doc.akka.io/japi/akka/2.8/akka/serialization/JSerializer.html#fromBinaryJava(byte[],java.lang.Class) "akka.serialization.JSerializer"). The message class (the bindings) is not used for deserialization. The manifest is only used within the `Serializer``JSerializer` to decide how to deserialize the payload, so one `Serializer``JSerializer` can handle many classes.

That means that it is possible to change serialization for a message by performing two rolling update steps to switch to the new serializer.

1. Add the `Serializer``JSerializer` class and define it in `akka.actor.serializers` config section, but not in `akka.actor.serialization-bindings`. Perform a rolling update for this change. This means that the serializer class exists on all nodes and is registered, but it is still not used for serializing any messages. That is important because during the rolling update the old nodes still don’t know about the new serializer and would not be able to deserialize messages with that format.
2. The second change is to register that the serializer is to be used for certain classes by defining those in the `akka.actor.serialization-bindings` config section. Perform a rolling update for this change. This means that new nodes will use the new serializer when sending messages and old nodes will be able to deserialize the new format. Old nodes will continue to use the old serializer when sending messages and new nodes will be able to deserialize the old format.

As an optional third step the old serializer can be completely removed if it was not used for persistent events. It must still be possible to deserialize the events that were stored with the old serializer.

### Verification

Normally, messages sent between local actors (i.e. same JVM) do not undergo serialization. For testing, sometimes, it may be desirable to force serialization on all messages (both remote and local). If you want to do this in order to verify that your messages are serializable you can enable the following config option:

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L131-L135 "Go to snippet source")akka {
  actor {
    serialize-messages = on
  }
}
```

Certain messages can be excluded from verification by extending the marker traitinterface [`akka.actor.NoSerializationVerificationNeeded`](https://doc.akka.io/api/akka/2.8/akka/actor/NoSerializationVerificationNeeded.html "akka.actor.NoSerializationVerificationNeeded")[`akka.actor.NoSerializationVerificationNeeded`](https://doc.akka.io/japi/akka/2.8/akka/actor/NoSerializationVerificationNeeded.html "akka.actor.NoSerializationVerificationNeeded") or define a class name prefix in configuration `akka.actor.no-serialization-verification-needed-class-prefix`.

If you want to verify that your [`Props`](https://doc.akka.io/api/akka/2.8/akka/actor/Props.html "akka.actor.Props")[`Props`](https://doc.akka.io/japi/akka/2.8/akka/actor/Props.html "akka.actor.Props") are serializable you can enable the following config option:

```
[source](https://github.com/akka/akka/tree/v2.8.9/akka-docs/src/test/scala/docs/serialization/SerializationDocSpec.scala#L146-L150 "Go to snippet source")akka {
  actor {
    serialize-creators = on
  }
}
```
Warning
We recommend having these config options turned on **only** when you’re running tests. Turning these options on in production is pointless, as it would negatively impact the performance of local message passing without giving any gain.

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

### Example 7: Configuration

```scala
akka {
  actor {
    serializers {
      jackson-json = "akka.serialization.jackson.JacksonJsonSerializer"
      jackson-cbor = "akka.serialization.jackson.JacksonCborSerializer"
      proto = "akka.remote.serialization.ProtobufSerializer"
      myown = "docs.serialization.MyOwnSerializer"
    }
  }
}
```

### Example 8: Configuration

```scala
akka {
  actor {
    serializers {
      jackson-json = "akka.serialization.jackson.JacksonJsonSerializer"
      jackson-cbor = "akka.serialization.jackson.JacksonCborSerializer"
      proto = "akka.remote.serialization.ProtobufSerializer"
      myown = "docs.serialization.MyOwnSerializer"
    }

    serialization-bindings {
      "docs.serialization.JsonSerializable" = jackson-json
      "docs.serialization.CborSerializable" = jackson-cbor
      "com.google.protobuf.Message" = proto
      "docs.serialization.MyOwnSerializable" = myown
    }
  }
}
```

### Example 9: Programmatic

```scala
import akka.actor._
import akka.actor.typed.scaladsl.Behaviors
import akka.cluster.Cluster
import akka.serialization._
```

### Example 10: Programmatic

```java
import akka.actor.*;
import akka.serialization.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
```

### Example 11: Programmatic

```scala
val system = ActorSystem("example")

// Get the Serialization Extension
val serialization = SerializationExtension(system)

// Have something to serialize
val original = "woohoo"

// Turn it into bytes, and retrieve the serializerId and manifest, which are needed for deserialization
val bytes = serialization.serialize(original).get
val serializerId = serialization.findSerializerFor(original).identifier
val manifest = Serializers.manifestFor(serialization.findSerializerFor(original), original)

// Turn it back into an object
val back = serialization.deserialize(bytes, serializerId, manifest).get
```

### Example 12: Programmatic

```java
ActorSystem system = ActorSystem.create("example");

// Get the Serialization Extension
Serialization serialization = SerializationExtension.get(system);

// Have something to serialize
String original = "woohoo";

// Turn it into bytes, and retrieve the serializerId and manifest, which are needed for
// deserialization
byte[] bytes = serialization.serialize(original).get();
int serializerId = serialization.findSerializerFor(original).identifier();
String manifest = Serializers.manifestFor(serialization.findSerializerFor(original), original);

// Turn it back into an object
String back = (String) serialization.deserialize(bytes, serializerId, manifest).get();
```

### Example 13: Programmatic

```scala
import akka.actor.typed.ActorSystem

val system = ActorSystem(Behaviors.empty, "example")

// Get the Serialization Extension
val serialization = SerializationExtension(system)
```

### Example 14: Programmatic

```java
akka.actor.typed.ActorSystem<Void> system =
    akka.actor.typed.ActorSystem.create(Behaviors.empty(), "example");

// Get the Serialization Extension
Serialization serialization = SerializationExtension.get(system);
```

### Example 15: Creating new Serializers

```scala
import akka.actor._
import akka.actor.typed.scaladsl.Behaviors
import akka.cluster.Cluster
import akka.serialization._
```

### Example 16: Creating new Serializers

```java
import akka.actor.*;
import akka.serialization.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
```

### Example 17: Creating new Serializers

```scala
class MyOwnSerializer extends Serializer {

  // If you need logging here, introduce a constructor that takes an ExtendedActorSystem.
  // class MyOwnSerializer(actorSystem: ExtendedActorSystem) extends Serializer
  // Get a logger using:
  // private val logger = Logging(actorSystem, this)

  // This is whether "fromBinary" requires a "clazz" or not
  def includeManifest: Boolean = true

  // Pick a unique identifier for your Serializer,
  // you've got a couple of billions to choose from,
  // 0 - 40 is reserved by Akka itself
  def identifier = 1234567

  // "toBinary" serializes the given object to an Array of Bytes
  def toBinary(obj: AnyRef): Array[Byte] = {
    // Put the code that serializes the object here
    //#...
    Array[Byte]()
    //#...
  }

  // "fromBinary" deserializes the given array,
  // using the type hint (if any, see "includeManifest" above)
  def fromBinary(bytes: Array[Byte], clazz: Option[Class[_]]): AnyRef = {
    // Put your code that deserializes here
    //#...
    null
    //#...
  }
}
```

### Example 18: Creating new Serializers

```java
static class MyOwnSerializer extends JSerializer {

  // If you need logging here, introduce a constructor that takes an ExtendedActorSystem.
  // public MyOwnSerializer(ExtendedActorSystem actorSystem)
  // Get a logger using:
  // private final LoggingAdapter logger = Logging.getLogger(actorSystem, this);

  // This is whether "fromBinary" requires a "clazz" or not
  @Override
  public boolean includeManifest() {
    return false;
  }

  // Pick a unique identifier for your Serializer,
  // you've got a couple of billions to choose from,
  // 0 - 40 is reserved by Akka itself
  @Override
  public int identifier() {
    return 1234567;
  }

  // "toBinary" serializes the given object to an Array of Bytes
  @Override
  public byte[] toBinary(Object obj) {
    // Put the code that serializes the object here
    // #...
    return new byte[0];
    // #...
  }

  // "fromBinary" deserializes the given array,
  // using the type hint (if any, see "includeManifest" above)
  @Override
  public Object fromBinaryJava(byte[] bytes, Class<?> clazz) {
    // Put your code that deserializes here
    // #...
    return null;
    // #...
  }
}
```

### Example 19: Creating new Serializers

```scala
akka {
  actor {
    serialization-identifiers {
      "docs.serialization.MyOwnSerializer" = 1234567
    }
  }
}
```

### Example 20: Serializer with String Manifest

```scala
class MyOwnSerializer2 extends SerializerWithStringManifest {

  val CustomerManifest = "customer"
  val UserManifest = "user"
  val UTF_8 = StandardCharsets.UTF_8.name()

  // Pick a unique identifier for your Serializer,
  // you've got a couple of billions to choose from,
  // 0 - 40 is reserved by Akka itself
  def identifier = 1234567

  // The manifest (type hint) that will be provided in the fromBinary method
  // Use `""` if manifest is not needed.
  def manifest(obj: AnyRef): String =
    obj match {
      case _: Customer => CustomerManifest
      case _: User     => UserManifest
    }

  // "toBinary" serializes the given object to an Array of Bytes
  def toBinary(obj: AnyRef): Array[Byte] = {
    // Put the real code that serializes the object here
    obj match {
      case Customer(name) => name.getBytes(UTF_8)
      case User(name)     => name.getBytes(UTF_8)
    }
  }

  // "fromBinary" deserializes the given array,
  // using the type hint
  def fromBinary(bytes: Array[Byte], manifest: String): AnyRef = {
    // Put the real code that deserializes here
    manifest match {
      case CustomerManifest =>
        Customer(new String(bytes, UTF_8))
      case UserManifest =>
        User(new String(bytes, UTF_8))
    }
  }
}
```

### Example 21: Serializer with String Manifest

```java
static class MyOwnSerializer2 extends SerializerWithStringManifest {

  private static final String CUSTOMER_MANIFEST = "customer";
  private static final String USER_MANIFEST = "user";
  private static final Charset UTF_8 = StandardCharsets.UTF_8;

  // Pick a unique identifier for your Serializer,
  // you've got a couple of billions to choose from,
  // 0 - 40 is reserved by Akka itself
  @Override
  public int identifier() {
    return 1234567;
  }

  @Override
  public String manifest(Object obj) {
    if (obj instanceof Customer) return CUSTOMER_MANIFEST;
    else if (obj instanceof User) return USER_MANIFEST;
    else throw new IllegalArgumentException("Unknown type: " + obj);
  }

  // "toBinary" serializes the given object to an Array of Bytes
  @Override
  public byte[] toBinary(Object obj) {
    // Put the real code that serializes the object here
    if (obj instanceof Customer) return ((Customer) obj).name.getBytes(UTF_8);
    else if (obj instanceof User) return ((User) obj).name.getBytes(UTF_8);
    else throw new IllegalArgumentException("Unknown type: " + obj);
  }

  // "fromBinary" deserializes the given array,
  // using the type hint
  @Override
  public Object fromBinary(byte[] bytes, String manifest) {
    // Put the real code that deserializes here
    if (manifest.equals(CUSTOMER_MANIFEST)) return new Customer(new String(bytes, UTF_8));
    else if (manifest.equals(USER_MANIFEST)) return new User(new String(bytes, UTF_8));
    else throw new IllegalArgumentException("Unknown manifest: " + manifest);
  }
}
```

### Example 22: Serializing ActorRefs

```scala
class PingSerializer(system: ExtendedActorSystem) extends SerializerWithStringManifest {
  private val actorRefResolver = ActorRefResolver(system.toTyped)

  private val PingManifest = "a"
  private val PongManifest = "b"

  override def identifier = 41

  override def manifest(msg: AnyRef) = msg match {
    case _: PingService.Ping => PingManifest
    case PingService.Pong    => PongManifest
    case _ =>
      throw new IllegalArgumentException(s"Can't serialize object of type ${msg.getClass} in [${getClass.getName}]")
  }

  override def toBinary(msg: AnyRef) = msg match {
    case PingService.Ping(who) =>
      actorRefResolver.toSerializationFormat(who).getBytes(StandardCharsets.UTF_8)
    case PingService.Pong =>
      Array.emptyByteArray
    case _ =>
      throw new IllegalArgumentException(s"Can't serialize object of type ${msg.getClass} in [${getClass.getName}]")
  }

  override def fromBinary(bytes: Array[Byte], manifest: String) = {
    manifest match {
      case PingManifest =>
        val str = new String(bytes, StandardCharsets.UTF_8)
        val ref = actorRefResolver.resolveActorRef[PingService.Pong.type](str)
        PingService.Ping(ref)
      case PongManifest =>
        PingService.Pong
      case _ =>
        throw new IllegalArgumentException(s"Unknown manifest [$manifest]")
    }
  }
}
```

### Example 23: Serializing ActorRefs

```java
public class PingSerializer extends SerializerWithStringManifest {

  final ExtendedActorSystem system;
  final ActorRefResolver actorRefResolver;

  static final String PING_MANIFEST = "a";
  static final String PONG_MANIFEST = "b";

  PingSerializer(ExtendedActorSystem system) {
    this.system = system;
    actorRefResolver = ActorRefResolver.get(Adapter.toTyped(system));
  }

  @Override
  public int identifier() {
    return 97876;
  }

  @Override
  public String manifest(Object obj) {
    if (obj instanceof Ping) return PING_MANIFEST;
    else if (obj instanceof Pong) return PONG_MANIFEST;
    else
      throw new IllegalArgumentException(
          "Can't serialize object of type "
              + obj.getClass()
              + " in ["
              + getClass().getName()
              + "]");
  }

  @Override
  public byte[] toBinary(Object obj) {
    if (obj instanceof Ping)
      return actorRefResolver
          .toSerializationFormat(((Ping) obj).replyTo)
          .getBytes(StandardCharsets.UTF_8);
    else if (obj instanceof Pong) return new byte[0];
    else
      throw new IllegalArgumentException(
          "Can't serialize object of type "
              + obj.getClass()
              + " in ["
              + getClass().getName()
              + "]");
  }

  @Override
  public Object fromBinary(byte[] bytes, String manifest) {
    if (PING_MANIFEST.equals(manifest)) {
      String str = new String(bytes, StandardCharsets.UTF_8);
      ActorRef<Pong> ref = actorRefResolver.resolveActorRef(str);
      return new Ping(ref);
    } else if (PONG_MANIFEST.equals(manifest)) {
      return new Pong();
    } else {
      throw new IllegalArgumentException("Unable to handle manifest: " + manifest);
    }
  }
}
```

### Example 24: Java serialization

```ruby
akka.actor.allow-java-serialization = on
```

### Example 25: Java serialization

```ruby
akka.actor.warn-about-java-serializer-usage = off
```

### Example 26: Verification

```scala
akka {
  actor {
    serialize-messages = on
  }
}
```

### Example 27: Verification

```scala
akka {
  actor {
    serialize-creators = on
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.8/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.8/akka/actor/Extension.html
- https://doc.akka.io/api/akka/2.8/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/2.8/akka/actor/Props.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.8/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka/2.8/akka/serialization/JSerializer.html
- https://doc.akka.io/api/akka/2.8/akka/serialization/SerializationExtension$.html
- https://doc.akka.io/api/akka/2.8/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka/2.8/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Props.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/2.8/akka/serialization/BaseSerializer.html
- https://doc.akka.io/japi/akka/2.8/akka/serialization/JSerializer.html
- https://doc.akka.io/japi/akka/2.8/akka/serialization/SerializationExtension.html
- https://doc.akka.io/japi/akka/2.8/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka/2.8/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/libraries/akka-core/2.8/persistence.html
- https://doc.akka.io/libraries/akka-core/2.8/serialization-classic.html
- https://doc.akka.io/libraries/akka-core/2.8/serialization-jackson.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/reliable-delivery.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.8/serialization.html](https://doc.akka.io/libraries/akka-core/2.8/serialization.html)*