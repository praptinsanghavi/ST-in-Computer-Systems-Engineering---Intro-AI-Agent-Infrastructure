---
description: Serialization with Jackson for Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/serialization-jackson.html
title: Serialization with Jackson • Akka core
---

# Serialization with Jackson • Akka core

> **Summary:** Serialization with Jackson for Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Serialization with Jackson

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Jackson Serialization, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-serialization-jackson" % AkkaVersion
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
    <artifactId>akka-serialization-jackson_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-serialization-jackson_${versions.ScalaBinary}"
}
```

## Introduction

You find general concepts for Akka serialization in the [Serialization](serialization.html) section. This section describes how to use the Jackson serializer for application specific messages and persistent events and snapshots.

[Jackson](https://github.com/FasterXML/jackson) has support for both text based JSON and binary formats.

In many cases ordinary classes can be serialized by Jackson without any additional hints, but sometimes annotations are needed to specify how to convert the objects to JSON/bytes.

## Usage

To enable Jackson serialization for a class there needs to be a serialization binding for it or one of its super classes in serialization\-bindings configuration. 

You can use one of the two predefined marker traitsinterfaces `akka.serialization.jackson.JsonSerializable` or `akka.serialization.jackson.CborSerializable`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/SerializationDocSpec.scala#L25-L27 "Go to snippet source")import akka.serialization.jackson.JsonSerializable

final case class Message(name: String, nr: Int) extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/MySerializable.java#L8-L19 "Go to snippet source")  
import akka.serialization.jackson.JsonSerializable;

class MyMessage implements JsonSerializable {
  public final String name;
  public final int nr;

  public MyMessage(String name, int nr) {
    this.name = name;
    this.nr = nr;
  }
}
```

If the pre\-defined markers are not suitable for your project it is also possible to define your own marker traitinterface and let the messages extendimplement that. You will then have to add serialization binding configuration for your own marker in config, see [Serialization](serialization.html) for more details.

That is all that is needed for basic classes where Jackson understands the structure. A few cases that requires annotations are described below.

Note
Add the `-parameters` Java compiler option for usage by the [ParameterNamesModule](https://github.com/FasterXML/jackson-modules-java8/tree/master/parameter-names). It reduces the need for some annotations.

## Security

For security reasons it is disallowed to bind the Jackson serializers to open\-ended types that might be a target for [serialization gadgets](https://cowtowncoder.medium.com/on-jackson-cves-dont-panic-here-is-what-you-need-to-know-54cd0d6e8062), such as:

- [`java.lang.Object`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html "java.lang.Object")
- [`java.io.Serializable`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html "java.io.Serializable")
- [`java.lang.Comparable`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html "java.lang.Comparable").

The deny list of possible serialization gadget classes defined by Jackson databind are checked and disallowed for deserialization.

Warning
Don’t use [`@JsonTypeInfo(use = Id.CLASS)`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-annotations/latest/com/fasterxml/jackson/annotation/JsonTypeInfo.html "com.fasterxml.jackson.annotation.JsonTypeInfo") or [`ObjectMapper.enableDefaultTyping`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/ObjectMapper.html#enableDefaultTyping-- "com.fasterxml.jackson.databind.ObjectMapper") since that is a security risk when using [polymorphic types](serialization-jackson.html#polymorphic-types).

### Formats

The following formats are supported, and you select which one to use in the `serialization-bindings` configuration as described above.

- `jackson-json` \- ordinary text based JSON
- `jackson-cbor` \- binary [CBOR data format](https://github.com/FasterXML/jackson-dataformats-binary/tree/master/cbor)

The binary format is more compact, with slightly better performance than the JSON format.

## Annotations

### Polymorphic types

A polymorphic type is when a certain base type has multiple alternative implementations. When nested fields or collections are of polymorphic type the concrete implementations of the type must be listed with [`@JsonTypeInfo`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-annotations/latest/com/fasterxml/jackson/annotation/JsonTypeInfo.html "com.fasterxml.jackson.annotation.JsonTypeInfo") and [`@JsonSubTypes`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-annotations/latest/com/fasterxml/jackson/annotation/JsonSubTypes.html "com.fasterxml.jackson.annotation.JsonSubTypes") annotations.

Example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/SerializationDocSpec.scala#L131-L142 "Go to snippet source")final case class Zoo(primaryAttraction: Animal) extends JsonSerializable

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes(
  Array(
    new JsonSubTypes.Type(value = classOf[Lion], name = "lion"),
    new JsonSubTypes.Type(value = classOf[Elephant], name = "elephant")))
sealed trait Animal

final case class Lion(name: String) extends Animal

final case class Elephant(name: String, age: Int) extends Animal
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/SerializationDocTest.java#L53-L84 "Go to snippet source")public class Zoo implements JsonSerializable {
  public final Animal primaryAttraction;

  public Zoo(Animal primaryAttraction) {
    this.primaryAttraction = primaryAttraction;
  }
}

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = Lion.class, name = "lion"),
  @JsonSubTypes.Type(value = Elephant.class, name = "elephant")
})
interface Animal {}

public final class Lion implements Animal {
  public final String name;

  public Lion(String name) {
    this.name = name;
  }
}

public final class Elephant implements Animal {
  public final String name;
  public final int age;

  public Elephant(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
```

If you haven’t defined the annotations you will see an exception like this:

```
InvalidDefinitionException: Cannot construct instance of `...` (no Creators, like default construct, exist): abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information

```

Note that this is not needed for a top level class, but for fields inside it. In this example `Animal` is used inside of `Zoo`, which is sent as a message or persisted. If `Animal` was sent or persisted standalone the annotations are not needed because then it is the concrete subclasses `Lion` or `Elephant` that are serialized.

When specifying allowed subclasses with those annotations the class names will not be included in the serialized representation and that is important for [preventing loading of malicious serialization gadgets](serialization-jackson.html#security) when deserializing.

Warning
Don’t use [`@JsonTypeInfo(use = Id.CLASS)`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-annotations/latest/com/fasterxml/jackson/annotation/JsonTypeInfo.html "com.fasterxml.jackson.annotation.JsonTypeInfo") or [`ObjectMapper.enableDefaultTyping`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/ObjectMapper.html#enableDefaultTyping-- "com.fasterxml.jackson.databind.ObjectMapper") since that is a security risk when using polymorphic types.

### ADT with trait and case object

It’s common in Scala to use a sealed trait and case objects to represent enums. If the values are case classes the [`@JsonSubTypes`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-annotations/latest/com/fasterxml/jackson/annotation/JsonSubTypes.html "com.fasterxml.jackson.annotation.JsonSubTypes") annotation as described above works, but if the values are case objects it will not. The annotation requires a [`Class`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html "java.lang.Class") and there is no way to define that in an annotation for a `case object`.

The easiest workaround is to define the case objects as case class without any field. 

Alternatively, you can define an intermediate trait for the case object and a custom deserializer for it. The example below builds on the previous `Animal` sample by adding a fictitious, single instance, new animal, an `Unicorn`. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/SerializationDocSpec.scala#L149-L170 "Go to snippet source")final case class Zoo(primaryAttraction: Animal) extends JsonSerializable

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes(
  Array(
    new JsonSubTypes.Type(value = classOf[Lion], name = "lion"),
    new JsonSubTypes.Type(value = classOf[Elephant], name = "elephant"),
    new JsonSubTypes.Type(value = classOf[Unicorn], name = "unicorn")))
sealed trait Animal

final case class Lion(name: String) extends Animal
final case class Elephant(name: String, age: Int) extends Animal

@JsonDeserialize(`using` = classOf[UnicornDeserializer])
sealed trait Unicorn extends Animal
@JsonTypeName("unicorn")
case object Unicorn extends Unicorn

class UnicornDeserializer extends StdDeserializer[Unicorn](Unicorn.getClass) {
  // whenever we need to deserialize an instance of Unicorn trait, we return the object Unicorn
  override def deserialize(p: JsonParser, ctxt: DeserializationContext): Unicorn = Unicorn
}
```

The case object `Unicorn` can’t be used in a [`@JsonSubTypes`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-annotations/latest/com/fasterxml/jackson/annotation/JsonSubTypes.html "com.fasterxml.jackson.annotation.JsonSubTypes") annotation, but its trait can. When serializing the case object we need to know which type tag to use, hence the [`@JsonTypeName`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-annotations/latest/com/fasterxml/jackson/annotation/JsonTypeName.html "com.fasterxml.jackson.annotation.JsonTypeName") annotation on the object. When deserializing, Jackson will only know about the trait variant therefore we need a custom deserializer that returns the case object. 

On the other hand, if the ADT only has case objects, you can solve it by implementing a custom serialization for the enums. Annotate the `trait` with [`@JsonSerialize`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/annotation/JsonSerialize.html "com.fasterxml.jackson.databind.annotation.JsonSerialize") and [`@JsonDeserialize`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/annotation/JsonDeserialize.html "com.fasterxml.jackson.databind.annotation.JsonDeserialize") and implement the serialization with [`StdSerializer`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/ser/std/StdSerializer.html "com.fasterxml.jackson.databind.ser.std.StdSerializer") and [`StdDeserializer`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/deser/std/StdDeserializer.html "com.fasterxml.jackson.databind.deser.std.StdDeserializer").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/CustomAdtSerializer.scala#L12-L59 "Go to snippet source")import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

@JsonSerialize(`using` = classOf[DirectionJsonSerializer])
@JsonDeserialize(`using` = classOf[DirectionJsonDeserializer])
sealed trait Direction

object Direction {
  case object North extends Direction
  case object East extends Direction
  case object South extends Direction
  case object West extends Direction
}

class DirectionJsonSerializer extends StdSerializer[Direction](classOf[Direction]) {
  import Direction._

  override def serialize(value: Direction, gen: JsonGenerator, provider: SerializerProvider): Unit = {
    val strValue = value match {
      case North => "N"
      case East  => "E"
      case South => "S"
      case West  => "W"
    }
    gen.writeString(strValue)
  }
}

class DirectionJsonDeserializer extends StdDeserializer[Direction](classOf[Direction]) {
  import Direction._

  override def deserialize(p: JsonParser, ctxt: DeserializationContext): Direction = {
    p.getText match {
      case "N" => North
      case "E" => East
      case "S" => South
      case "W" => West
    }
  }
}

final case class Compass(currentDirection: Direction) extends JsonSerializable
```

### Enumerations

Jackson support for Scala Enumerations defaults to serializing a `Value` as a `JsonObject` that includes a field with the `"value"` and a field with the `"type"` whose value is the FQCN of the enumeration. Jackson includes the [`@JsonScalaEnumeration`](https://github.com/FasterXML/jackson-module-scala/wiki/Enumerations) to statically specify the type information to a field. When using the `@JsonScalaEnumeration` annotation the enumeration value is serialized as a JsonString.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/akka/serialization/jackson/JacksonSerializerSpec.scala#L110-L121 "Go to snippet source")object Planet extends Enumeration {
  type Planet = Value
  val Mercury, Venus, Earth, Mars, Krypton = Value
}

// Uses default Jackson serialization format for Scala Enumerations
final case class Alien(name: String, planet: Planet.Planet) extends TestMessage

// Serializes planet values as a JsonString
class PlanetType extends TypeReference[Planet.type] {}
final case class Superhero(name: String, @JsonScalaEnumeration(classOf[PlanetType]) planet: Planet.Planet)
    extends TestMessage
```

## Schema Evolution

When using Event Sourcing, but also for rolling updates, schema evolution becomes an important aspect of developing your application. The requirements as well as our own understanding of the business domain may (and will) change over time.

The Jackson serializer provides a way to perform transformations of the JSON tree model during deserialization. This is working in the same way for the textual and binary formats.

We will look at a few scenarios of how the classes may be evolved.

### Remove Field

Removing a field can be done without any migration code. The Jackson serializer will ignore properties that does not exist in the class.

### Add Optional Field

Adding an optional field can be done without any migration code. The default value will be None`Optional.empty`.

Old class:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v1/ItemAdded.scala#L11 "Go to snippet source")case class ItemAdded(shoppingCartId: String, productId: String, quantity: Int) extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v1/ItemAdded.java#L11-L21 "Go to snippet source")public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;
  public final String productId;
  public final int quantity;

  public ItemAdded(String shoppingCartId, String productId, int quantity) {
    this.shoppingCartId = shoppingCartId;
    this.productId = productId;
    this.quantity = quantity;
  }
}
```

New class with a new optional `discount` property and a new `note` field with default value:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2a/ItemAdded.scala#L11-L18 "Go to snippet source")case class ItemAdded(shoppingCartId: String, productId: String, quantity: Int, discount: Option[Double], note: String)
    extends JsonSerializable {

  // alternative constructor because `note` should have default value "" when not defined in json
  @JsonCreator
  def this(shoppingCartId: String, productId: String, quantity: Int, discount: Option[Double], note: Option[String]) =
    this(shoppingCartId, productId, quantity, discount, note.getOrElse(""))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2a/ItemAdded.java#L12-L40 "Go to snippet source")public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;
  public final String productId;
  public final int quantity;
  public final Optional<Double> discount;
  public final String note;

  @JsonCreator
  public ItemAdded(
      String shoppingCartId,
      String productId,
      int quantity,
      Optional<Double> discount,
      String note) {
    this.shoppingCartId = shoppingCartId;
    this.productId = productId;
    this.quantity = quantity;
    this.discount = discount;

    // default for note is "" if not included in json
    if (note == null) this.note = "";
    else this.note = note;
  }

  public ItemAdded(
      String shoppingCartId, String productId, int quantity, Optional<Double> discount) {
    this(shoppingCartId, productId, quantity, discount, "");
  }
}
```

### Add Mandatory Field

Let’s say we want to have a mandatory `discount` property without default value instead:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2b/ItemAdded.scala#L10-L11 "Go to snippet source")case class ItemAdded(shoppingCartId: String, productId: String, quantity: Int, discount: Double)
    extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2b/ItemAdded.java#L10-L22 "Go to snippet source")public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;
  public final String productId;
  public final int quantity;
  public final double discount;

  public ItemAdded(String shoppingCartId, String productId, int quantity, double discount) {
    this.shoppingCartId = shoppingCartId;
    this.productId = productId;
    this.quantity = quantity;
    this.discount = discount;
  }
}
```

To add a new mandatory field we have to use a [`JacksonMigration`](https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html "akka.serialization.jackson.JacksonMigration")[`JacksonMigration`](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html "akka.serialization.jackson.JacksonMigration") class and set the default value in the migration code.

This is how a migration class would look like for adding a `discount` field:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2b/ItemAddedMigration.scala#L8-L24 "Go to snippet source")import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.DoubleNode
import com.fasterxml.jackson.databind.node.ObjectNode
import akka.serialization.jackson.JacksonMigration

class ItemAddedMigration extends JacksonMigration {

  override def currentVersion: Int = 2

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = {
    val root = json.asInstanceOf[ObjectNode]
    if (fromVersion <= 1) {
      root.set("discount", DoubleNode.valueOf(0.0))
    }
    root
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2b/ItemAddedMigration.java#L8-L28 "Go to snippet source")import akka.serialization.jackson.JacksonMigration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ItemAddedMigration extends JacksonMigration {

  @Override
  public int currentVersion() {
    return 2;
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    ObjectNode root = (ObjectNode) json;
    if (fromVersion <= 1) {
      root.set("discount", DoubleNode.valueOf(0.0));
    }
    return root;
  }
}
```

Override the [`currentVersion`](https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html#currentVersion:Int "akka.serialization.jackson.JacksonMigration")[`currentVersion()`](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html#currentVersion() "akka.serialization.jackson.JacksonMigration") method to define the version number of the current (latest) version. The first version, when no migration was used, is always 1\. Increase this version number whenever you perform a change that is not backwards compatible without migration code.

Implement the transformation of the old JSON structure to the new JSON structure in the [`transform(fromVersion, jsonNode)`](https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html#transform(fromVersion:Int,json:com.fasterxml.jackson.databind.JsonNode):com.fasterxml.jackson.databind.JsonNode "akka.serialization.jackson.JacksonMigration")[`transform(fromVersion, jsonNode)`](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html#transform(int,com.fasterxml.jackson.databind.JsonNode) "akka.serialization.jackson.JacksonMigration") method. The [`JsonNode`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/JsonNode.html "com.fasterxml.jackson.databind.JsonNode") is mutable, so you can add and remove fields, or change values. Note that you have to cast to specific sub\-classes such as [`ObjectNode`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/node/ObjectNode.html "com.fasterxml.jackson.databind.node.ObjectNode") and [`ArrayNode`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/node/ArrayNode.html "com.fasterxml.jackson.databind.node.ArrayNode") to get access to mutators.

The migration class must be defined in configuration file:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/SerializationDocSpec.scala#L43-L45 "Go to snippet source")akka.serialization.jackson.migrations {
  "com.myservice.event.ItemAdded" = "com.myservice.event.ItemAddedMigration"
}
```

The same thing could have been done for the `note` field, adding a default value of `""` in the `ItemAddedMigration`.

### Rename Field

Let’s say that we want to rename the `productId` field to `itemId` in the previous example.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2c/ItemAdded.scala#L10 "Go to snippet source")case class ItemAdded(shoppingCartId: String, itemId: String, quantity: Int) extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2c/ItemAdded.java#L10-L22 "Go to snippet source")public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;

  public final String itemId;

  public final int quantity;

  public ItemAdded(String shoppingCartId, String itemId, int quantity) {
    this.shoppingCartId = shoppingCartId;
    this.itemId = itemId;
    this.quantity = quantity;
  }
}
```

The migration code would look like:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2c/ItemAddedMigration.scala#L8-L24 "Go to snippet source")import akka.serialization.jackson.JacksonMigration
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode

class ItemAddedMigration extends JacksonMigration {

  override def currentVersion: Int = 2

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = {
    val root = json.asInstanceOf[ObjectNode]
    if (fromVersion <= 1) {
      root.set[JsonNode]("itemId", root.get("productId"))
      root.remove("productId")
    }
    root
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2c/ItemAddedMigration.java#L8-L29 "Go to snippet source")  
import akka.serialization.jackson.JacksonMigration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ItemAddedMigration extends JacksonMigration {

  @Override
  public int currentVersion() {
    return 2;
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    ObjectNode root = (ObjectNode) json;
    if (fromVersion <= 1) {
      root.set("itemId", root.get("productId"));
      root.remove("productId");
    }
    return root;
  }
}
```

### Structural Changes

In a similar way we can do arbitrary structural changes.

Old class:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v1/Customer.scala#L10-L11 "Go to snippet source")case class Customer(name: String, street: String, city: String, zipCode: String, country: String)
    extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v1/Customer.java#L10-L24 "Go to snippet source")public class Customer implements JsonSerializable {
  public final String name;
  public final String street;
  public final String city;
  public final String zipCode;
  public final String country;

  public Customer(String name, String street, String city, String zipCode, String country) {
    this.name = name;
    this.street = street;
    this.city = city;
    this.zipCode = zipCode;
    this.country = country;
  }
}
```

New class:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2a/Customer.scala#L10 "Go to snippet source")case class Customer(name: String, shippingAddress: Address, billingAddress: Option[Address]) extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2a/Customer.java#L11-L21 "Go to snippet source")public class Customer implements JsonSerializable {
  public final String name;
  public final Address shippingAddress;
  public final Optional<Address> billingAddress;

  public Customer(String name, Address shippingAddress, Optional<Address> billingAddress) {
    this.name = name;
    this.shippingAddress = shippingAddress;
    this.billingAddress = billingAddress;
  }
}
```

with the `Address` class:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2a/Address.scala#L10 "Go to snippet source")case class Address(street: String, city: String, zipCode: String, country: String) extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2a/Address.java#L8-L20 "Go to snippet source")public class Address {
  public final String street;
  public final String city;
  public final String zipCode;
  public final String country;

  public Address(String street, String city, String zipCode, String country) {
    this.street = street;
    this.city = city;
    this.zipCode = zipCode;
    this.country = country;
  }
}
```

The migration code would look like:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2a/CustomerMigration.scala#L8-L31 "Go to snippet source")import akka.serialization.jackson.JacksonMigration
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode

class CustomerMigration extends JacksonMigration {

  override def currentVersion: Int = 2

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = {
    val root = json.asInstanceOf[ObjectNode]
    if (fromVersion <= 1) {
      val shippingAddress = root.withObject("/shippingAddress")
      shippingAddress.set[JsonNode]("street", root.get("street"))
      shippingAddress.set[JsonNode]("city", root.get("city"))
      shippingAddress.set[JsonNode]("zipCode", root.get("zipCode"))
      shippingAddress.set[JsonNode]("country", root.get("country"))
      root.remove("street")
      root.remove("city")
      root.remove("zipCode")
      root.remove("country")
    }
    root
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2a/CustomerMigration.java#L8-L35 "Go to snippet source")import akka.serialization.jackson.JacksonMigration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class CustomerMigration extends JacksonMigration {

  @Override
  public int currentVersion() {
    return 2;
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    ObjectNode root = (ObjectNode) json;
    if (fromVersion <= 1) {
      ObjectNode shippingAddress = root.withObject("/shippingAddress");
      shippingAddress.set("street", root.get("street"));
      shippingAddress.set("city", root.get("city"));
      shippingAddress.set("zipCode", root.get("zipCode"));
      shippingAddress.set("country", root.get("country"));
      root.remove("street");
      root.remove("city");
      root.remove("zipCode");
      root.remove("country");
    }
    return root;
  }
}
```

### Rename Class

It is also possible to rename the class. For example, let’s rename `OrderAdded` to `OrderPlaced`.

Old class:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v1/OrderAdded.scala#L10 "Go to snippet source")case class OrderAdded(shoppingCartId: String) extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v1/OrderAdded.java#L10-L16 "Go to snippet source")public class OrderAdded implements JsonSerializable {
  public final String shoppingCartId;

  public OrderAdded(String shoppingCartId) {
    this.shoppingCartId = shoppingCartId;
  }
}
```

New class:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2a/OrderPlaced.scala#L10 "Go to snippet source")case class OrderPlaced(shoppingCartId: String) extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2a/OrderPlaced.java#L10-L16 "Go to snippet source")public class OrderPlaced implements JsonSerializable {
  public final String shoppingCartId;

  public OrderPlaced(String shoppingCartId) {
    this.shoppingCartId = shoppingCartId;
  }
}
```

The migration code would look like:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2a/OrderPlacedMigration.scala#L11-L19 "Go to snippet source")class OrderPlacedMigration extends JacksonMigration {

  override def currentVersion: Int = 2

  override def transformClassName(fromVersion: Int, className: String): String =
    classOf[OrderPlaced].getName

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = json
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2a/OrderPlacedMigration.java#L11-L27 "Go to snippet source")public class OrderPlacedMigration extends JacksonMigration {

  @Override
  public int currentVersion() {
    return 2;
  }

  @Override
  public String transformClassName(int fromVersion, String className) {
    return OrderPlaced.class.getName();
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    return json;
  }
}
```

Note the override of the [`transformClassName(fromVersion, className)`](https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html#transformClassName(fromVersion:Int,className:String):String "akka.serialization.jackson.JacksonMigration")[`transformClassName(fromVersion, className)`](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html#transformClassName(int,java.lang.String) "akka.serialization.jackson.JacksonMigration") method to define the new class name.

That type of migration must be configured with the old class name as key. The actual class can be removed.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/SerializationDocSpec.scala#L51-L53 "Go to snippet source")akka.serialization.jackson.migrations {
  "com.myservice.event.OrderAdded" = "com.myservice.event.OrderPlacedMigration"
}
```

### Remove from serialization\-bindings

When a class is not used for serialization anymore it can be removed from `serialization-bindings` but to still allow deserialization it must then be listed in the `allowed-class-prefix` configuration. This is useful for example during rolling update with serialization changes, or when reading old stored data. It can also be used when changing from Jackson serializer to another serializer (e.g. Protobuf) and thereby changing the serialization binding, but it should still be possible to deserialize old data with Jackson.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/SerializationDocSpec.scala#L185-L186 "Go to snippet source")akka.serialization.jackson.allowed-class-prefix =
  ["com.myservice.event.OrderAdded", "com.myservice.command"]
```

It’s a list of class names or prefixes of class names.

## Rolling updates

When doing a rolling update, for a period of time there are two different binaries running in production. If the schema has evolved requiring a new schema version, the data serialized by the new binary will be unreadable from the old binary. This situation causes transient errors on the processes running the old binary. This service degradation is usually fine since the rolling update will eventually complete and all old processes will be replaced with the new binary. To avoid this service degradation you can also use forward\-one support in your schema evolutions.

To complete a no\-degradation rolling update, you need to make two deployments. First, deploy a new binary which can read the new schema but still uses the old schema. Then, deploy a second binary which serializes data using the new schema and drops the downcasting code from the migration. 

Let’s take, for example, the case above where we [renamed a field](#rename-field).

The starting schema is:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v1/ItemAdded.scala#L11 "Go to snippet source")case class ItemAdded(shoppingCartId: String, productId: String, quantity: Int) extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v1/ItemAdded.java#L11-L21 "Go to snippet source")public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;
  public final String productId;
  public final int quantity;

  public ItemAdded(String shoppingCartId, String productId, int quantity) {
    this.shoppingCartId = shoppingCartId;
    this.productId = productId;
    this.quantity = quantity;
  }
}
```

In a first deployment, we still don’t make any change to the event class:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v1/ItemAdded.scala#L11 "Go to snippet source")case class ItemAdded(shoppingCartId: String, productId: String, quantity: Int) extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v1/ItemAdded.java#L11-L21 "Go to snippet source")public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;
  public final String productId;
  public final int quantity;

  public ItemAdded(String shoppingCartId, String productId, int quantity) {
    this.shoppingCartId = shoppingCartId;
    this.productId = productId;
    this.quantity = quantity;
  }
}
```

but we introduce a migration that can read the newer schema which is versioned `2`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v1withv2/ItemAddedMigration.scala#L8-L28 "Go to snippet source")import akka.serialization.jackson.JacksonMigration
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode

class ItemAddedMigration extends JacksonMigration {

  // Data produced in this node is still produced using the version 1 of the schema
  override def currentVersion: Int = 1

  override def supportedForwardVersion: Int = 2

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = {
    val root = json.asInstanceOf[ObjectNode]
    if (fromVersion == 2) {
      // When receiving an event of version 2 we down-cast it to the version 1 of the schema
      root.set[JsonNode]("productId", root.get("itemId"))
      root.remove("itemId")
    }
    root
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v1withv2/ItemAddedMigration.java#L8-L36 "Go to snippet source")  
import akka.serialization.jackson.JacksonMigration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ItemAddedMigration extends JacksonMigration {

  // Data produced in this node is still produced using the version 1 of the schema
  @Override
  public int currentVersion() {
    return 1;
  }

  @Override
  public int supportedForwardVersion() {
    return 2;
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    ObjectNode root = (ObjectNode) json;
    if (fromVersion == 2) {
      // When receiving an event of version 2 we down-cast it to the version 1 of the schema
      root.set("productId", root.get("itemId"));
      root.remove("itemId");
    }
    return root;
  }
}
```

Once all running nodes have the new migration code which can read version `2` of `ItemAdded` we can proceed with the second step. So, we deploy the updated event:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2c/ItemAdded.scala#L10 "Go to snippet source")case class ItemAdded(shoppingCartId: String, itemId: String, quantity: Int) extends JsonSerializable
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2c/ItemAdded.java#L10-L22 "Go to snippet source")public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;

  public final String itemId;

  public final int quantity;

  public ItemAdded(String shoppingCartId, String itemId, int quantity) {
    this.shoppingCartId = shoppingCartId;
    this.itemId = itemId;
    this.quantity = quantity;
  }
}
```

and the final migration code which no longer needs forward\-compatibility code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/v2c/ItemAddedMigration.scala#L8-L24 "Go to snippet source")import akka.serialization.jackson.JacksonMigration
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode

class ItemAddedMigration extends JacksonMigration {

  override def currentVersion: Int = 2

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = {
    val root = json.asInstanceOf[ObjectNode]
    if (fromVersion <= 1) {
      root.set[JsonNode]("itemId", root.get("productId"))
      root.remove("productId")
    }
    root
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/java/jdoc/akka/serialization/jackson/v2c/ItemAddedMigration.java#L8-L29 "Go to snippet source")  
import akka.serialization.jackson.JacksonMigration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ItemAddedMigration extends JacksonMigration {

  @Override
  public int currentVersion() {
    return 2;
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    ObjectNode root = (ObjectNode) json;
    if (fromVersion <= 1) {
      root.set("itemId", root.get("productId"));
      root.remove("productId");
    }
    return root;
  }
}
```

## Jackson Modules

The following Jackson modules are enabled by default:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/resources/reference.conf#L9-L21 "Go to snippet source")akka.serialization.jackson {

  # The Jackson JSON serializer will register these modules.
  jackson-modules += "akka.serialization.jackson.AkkaJacksonModule"
  # AkkaTypedJacksonModule optionally included if akka-actor-typed is in classpath
  jackson-modules += "akka.serialization.jackson.AkkaTypedJacksonModule"
  # AkkaStreamsModule optionally included if akka-streams is in classpath
  jackson-modules += "akka.serialization.jackson.AkkaStreamJacksonModule"
  jackson-modules += "com.fasterxml.jackson.module.paramnames.ParameterNamesModule"
  jackson-modules += "com.fasterxml.jackson.datatype.jdk8.Jdk8Module"
  jackson-modules += "com.fasterxml.jackson.datatype.jsr310.JavaTimeModule"
  jackson-modules += "com.fasterxml.jackson.module.scala.DefaultScalaModule"
}
```

You can amend the configuration `akka.serialization.jackson.jackson-modules` to enable other modules.

The [ParameterNamesModule](https://github.com/FasterXML/jackson-modules-java8/tree/master/parameter-names) requires that the `-parameters` Java compiler option is enabled.

### Compression

JSON can be rather verbose and for large messages it can be beneficial to compress large payloads. For the `jackson-json` binding the default configuration is:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/resources/reference.conf#L211-L222 "Go to snippet source")# Compression settings for the jackson-json binding
akka.serialization.jackson.jackson-json.compression {
  # Compression algorithm.
  # - off  : no compression
  # - gzip : using common java gzip
  # - lz4 : using lz4-java
  algorithm = gzip

  # If compression is enabled with the `algorithm` setting the payload is compressed
  # when it's larger than this value.
  compress-larger-than = 32 KiB
}
```

Supported compression algorithms are: gzip, lz4\. Use ‘off’ to disable compression. Gzip is generally slower than lz4\. Messages larger than the `compress-larger-than` property are compressed.

Compression can be disabled by setting the `algorithm` property to `off`. It will still be able to decompress payloads that were compressed when serialized, e.g. if this configuration is changed.

For the `jackson-cbor` and custom bindings other than `jackson-json` compression is by default disabled, but can be enabled in the same way as the configuration shown above but replacing `jackson-json` with the binding name (for example `jackson-cbor`).

## Using Akka Serialization for embedded types

For types that already have an Akka Serializer defined that are embedded in types serialized with Jackson the [`AkkaSerializationSerializer`](https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaSerializationSerializer.html "akka.serialization.jackson.AkkaSerializationSerializer")[`AkkaSerializationSerializer`](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/AkkaSerializationSerializer.html "akka.serialization.jackson.AkkaSerializationSerializer") and [`AkkaSerializationDeserializer`](https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaSerializationDeserializer.html "akka.serialization.jackson.AkkaSerializationDeserializer")[`AkkaSerializationDeserializer`](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/AkkaSerializationDeserializer.html "akka.serialization.jackson.AkkaSerializationDeserializer") can be used to Akka Serialization for individual fields. 

The serializer/deserializer are not enabled automatically. The [`@JsonSerialize`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/annotation/JsonSerialize.html "com.fasterxml.jackson.databind.annotation.JsonSerialize") and [`@JsonDeserialize`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/annotation/JsonDeserialize.html "com.fasterxml.jackson.databind.annotation.JsonDeserialize") annotation needs to be added to the fields containing the types to be serialized with Akka Serialization.

The type will be embedded as an object with the fields:

- serId \- the serializer id
- serManifest \- the manifest for the type
- payload \- base64 encoded bytes

## Additional configuration

### Configuration per binding

By default, the configuration for the Jackson serializers and their [`ObjectMapper`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/ObjectMapper.html "com.fasterxml.jackson.databind.ObjectMapper")s is defined in the `akka.serialization.jackson` section. It is possible to override that configuration in a more specific `akka.serialization.jackson.<binding name>` section.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/SerializationDocSpec.scala#L59-L68 "Go to snippet source")akka.serialization.jackson.jackson-json {
  serialization-features {
    WRITE_DATES_AS_TIMESTAMPS = off
  }
}
akka.serialization.jackson.jackson-cbor {
  serialization-features {
    WRITE_DATES_AS_TIMESTAMPS = on
  }
}
```

It’s also possible to define several bindings and use different configuration for them. For example, different settings for remote messages and persisted events.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/SerializationDocSpec.scala#L74-L99 "Go to snippet source")akka.actor {
  serializers {
    jackson-json-message = "akka.serialization.jackson.JacksonJsonSerializer"
    jackson-json-event   = "akka.serialization.jackson.JacksonJsonSerializer"
  }
  serialization-identifiers {
    jackson-json-message = 9001
    jackson-json-event = 9002
  }
  serialization-bindings {
    "com.myservice.MyMessage" = jackson-json-message
    "com.myservice.MyEvent" = jackson-json-event
  }
}
akka.serialization.jackson {
  jackson-json-message {
    serialization-features {
      WRITE_DATES_AS_TIMESTAMPS = on
    }
  }
  jackson-json-event {
    serialization-features {
      WRITE_DATES_AS_TIMESTAMPS = off
    }
  }
}
```

### Manifest\-less serialization

When using the Jackson serializer for persistence, given that the fully qualified class name is stored in the manifest, this can result in a lot of wasted disk and IO used, especially when the events are small. To address this, a `type-in-manifest` flag can be turned off, which will result in the class name not appearing in the manifest.

When deserializing, the Jackson serializer will use the type defined in `deserialization-type`, if present, otherwise it will look for exactly one serialization binding class, and use that. For this to be useful, generally that single type must be a [Polymorphic type](serialization-jackson.html#polymorphic-types), with all type information necessary to deserialize to the various sub types contained in the JSON message.

When switching serializers, for example, if doing a rolling update as described [here](additional/rolling-updates.html#from-java-serialization-to-jackson), there will be periods of time when you may have no serialization bindings declared for the type. In such circumstances, you must use the `deserialization-type` configuration attribute to specify which type should be used to deserialize messages.

Since this configuration can only be applied to a single root type, you will usually only want to apply it to a per binding configuration, not to the regular `jackson-json` or `jackson-cbor` configurations.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/SerializationDocSpec.scala#L105-L124 "Go to snippet source")akka.actor {
  serializers {
    jackson-json-event = "akka.serialization.jackson.JacksonJsonSerializer"
  }
  serialization-identifiers {
    jackson-json-event = 9001
  }
  serialization-bindings {
    "com.myservice.MyEvent" = jackson-json-event
  }
}
akka.serialization.jackson {
  jackson-json-event {
    type-in-manifest = off
    # Since there is exactly one serialization binding declared for this
    # serializer above, this is optional, but if there were none or many,
    # this would be mandatory.
    deserialization-type = "com.myservice.MyEvent"
  }
}
```

Note that Akka remoting already implements manifest compression, and so this optimization will have no significant impact for messages sent over remoting. It’s only useful for messages serialized for other purposes, such as persistence or distributed data.

## Additional features

Additional Jackson serialization features can be enabled/disabled in configuration. The default values from Jackson are used aside from the following that are changed in Akka’s default configuration.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/resources/reference.conf#L39-L207 "Go to snippet source")akka.serialization.jackson {
  # Configuration of the ObjectMapper serialization features.
  # See com.fasterxml.jackson.databind.SerializationFeature
  # Enum values corresponding to the SerializationFeature and their boolean value.
  serialization-features {
    # Date/time in ISO-8601 (rfc3339) yyyy-MM-dd'T'HH:mm:ss.SSSZ format
    # as defined by com.fasterxml.jackson.databind.util.StdDateFormat
    # For interoperability it's better to use the ISO format, i.e. WRITE_DATES_AS_TIMESTAMPS=off,
    # but WRITE_DATES_AS_TIMESTAMPS=on has better performance.
    WRITE_DATES_AS_TIMESTAMPS = off
    WRITE_DURATIONS_AS_TIMESTAMPS = off
    FAIL_ON_EMPTY_BEANS = off
  }

  # Configuration of the ObjectMapper deserialization features.
  # See com.fasterxml.jackson.databind.DeserializationFeature
  # Enum values corresponding to the DeserializationFeature and their boolean value.
  deserialization-features {
    FAIL_ON_UNKNOWN_PROPERTIES = off
  }

  # Configuration of the ObjectMapper mapper features.
  # See com.fasterxml.jackson.databind.MapperFeature
  # Enum values corresponding to the MapperFeature and their
  # boolean values, for example:
  #
  # mapper-features {
  #   SORT_PROPERTIES_ALPHABETICALLY = on
  # }
  mapper-features {}

  # Allowed values USE_PROPERTIES_BASED, USE_DELEGATING, DEFAULT, EXPLICIT_ONLY
  # see com.fasterxml.jackson.databind.cfg.ConstructorDetector for details for each option
  # The default USE_PROPERTIES_BASED allows for detecting single argument constructors without @JsonCreator annotations
  # while DEAFULT provides the old Jackson behavior of requiring such an annotation.
  constructor-detector-mode = "USE_PROPERTIES_BASED"

  # Configuration of the ObjectMapper JsonParser features.
  # See com.fasterxml.jackson.core.JsonParser.Feature
  # Enum values corresponding to the JsonParser.Feature and their
  # boolean value, for example:
  #
  # json-parser-features {
  #   ALLOW_SINGLE_QUOTES = on
  # }
  json-parser-features {}

  # Configuration of the ObjectMapper JsonParser features.
  # See com.fasterxml.jackson.core.JsonGenerator.Feature
  # Enum values corresponding to the JsonGenerator.Feature and
  # their boolean value, for example:
  #
  # json-generator-features {
  #   WRITE_NUMBERS_AS_STRINGS = on
  # }
  json-generator-features {}

  # Configuration of the JsonFactory StreamReadFeature.
  # See com.fasterxml.jackson.core.StreamReadFeature
  # Enum values corresponding to the StreamReadFeatures and
  # their boolean value, for example:
  #
  # stream-read-features {
  #   STRICT_DUPLICATE_DETECTION = on
  # }
  stream-read-features {}

  # Configuration of the JsonFactory StreamWriteFeature.
  # See com.fasterxml.jackson.core.StreamWriteFeature
  # Enum values corresponding to the StreamWriteFeatures and
  # their boolean value, for example:
  #
  # stream-write-features {
  #   WRITE_BIGDECIMAL_AS_PLAIN = on
  # }
  stream-write-features {}

  # Configuration of the JsonFactory JsonReadFeature.
  # See com.fasterxml.jackson.core.json.JsonReadFeature
  # Enum values corresponding to the JsonReadFeatures and
  # their boolean value, for example:
  #
  # json-read-features {
  #   ALLOW_SINGLE_QUOTES = on
  # }
  json-read-features {}

  # Configuration of the JsonFactory JsonWriteFeature.
  # See com.fasterxml.jackson.core.json.JsonWriteFeature
  # Enum values corresponding to the JsonWriteFeatures and
  # their boolean value, for example:
  #
  # json-write-features {
  #   WRITE_NUMBERS_AS_STRINGS = on
  # }
  json-write-features {}

  # Configuration of the JsonFactory Visibility.
  # See com.fasterxml.jackson.annotation.PropertyAccessor
  # and com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility
  # Enum values. For example, to serialize only public fields
  # overwrite the default values with:
  #
  # visibility {
  #   FIELD = PUBLIC_ONLY
  # }
  # Default: all fields (including private and protected) are serialized.
  visibility {
    FIELD = ANY
  }

  # Deprecated, use `allowed-class-prefix` instead
  whitelist-class-prefix = []

  # Additional classes that are allowed even if they are not defined in `serialization-bindings`.
  # This is useful when a class is not used for serialization any more and therefore removed
  # from `serialization-bindings`, but should still be possible to deserialize.
  allowed-class-prefix = ${akka.serialization.jackson.whitelist-class-prefix}

  # settings for compression of the payload
  compression {
    # Compression algorithm.
    # - off  : no compression
    # - gzip : using common java gzip
    # - lz4 : using lz4-java
    algorithm = off

    # If compression is enabled with the `algorithm` setting the payload is compressed
    # when it's larger than this value.
    compress-larger-than = 0 KiB
  }

  # Whether the type should be written to the manifest.
  # If this is off, then either deserialization-type must be defined, or there must be exactly
  # one serialization binding declared for this serializer, and the type in that binding will be
  # used as the deserialization type. This feature will only work if that type either is a
  # concrete class, or if it is a supertype that uses Jackson polymorphism (ie, the
  # @JsonTypeInfo annotation) to store type information in the JSON itself. The intention behind
  # disabling this is to remove extraneous type information (ie, fully qualified class names) when
  # serialized objects are persisted in Akka persistence or replicated using Akka distributed
  # data. Note that Akka remoting already has manifest compression optimizations that address this,
  # so for types that just get sent over remoting, this offers no optimization.
  type-in-manifest = on

  # The type to use for deserialization.
  # This is only used if type-in-manifest is disabled. If set, this type will be used to
  # deserialize all messages. This is useful if the binding configuration you want to use when
  # disabling type in manifest cannot be expressed as a single type. Examples of when you might
  # use this include when changing serializers, so you don't want this serializer used for
  # serialization and you haven't declared any bindings for it, but you still want to be able to
  # deserialize messages that were serialized with this serializer, as well as situations where
  # you only want some sub types of a given Jackson polymorphic type to be serialized using this
  # serializer.
  deserialization-type = ""

  # Specific settings for jackson-json binding can be defined in this section to
  # override the settings in 'akka.serialization.jackson'
  jackson-json {}

  # Specific settings for jackson-cbor binding can be defined in this section to
  # override the settings in 'akka.serialization.jackson'
  jackson-cbor {}

  # Issue #28918 for compatibility with data serialized with JacksonCborSerializer in
  # Akka 2.6.4 or earlier, which was plain JSON format.
  jackson-cbor-264 = ${akka.serialization.jackson.jackson-cbor}

}
```

### Date/time format

[`WRITE_DATES_AS_TIMESTAMPS`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/SerializationFeature.html#WRITE_DATES_AS_TIMESTAMPS "com.fasterxml.jackson.databind.SerializationFeature") and [`WRITE_DURATIONS_AS_TIMESTAMPS`](https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/SerializationFeature.html#WRITE_DURATIONS_AS_TIMESTAMPS "com.fasterxml.jackson.databind.SerializationFeature") are by default disabled, which means that date/time fields are serialized in ISO\-8601 (rfc3339\) `yyyy-MM-dd'T'HH:mm:ss.SSSZ` format instead of numeric arrays. This is better for interoperability but it is slower. If you don’t need the ISO format for interoperability with external systems you can change the following configuration for better performance of date/time fields.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/test/scala/doc/akka/serialization/jackson/SerializationDocSpec.scala#L176-L179 "Go to snippet source")akka.serialization.jackson.serialization-features {
  WRITE_DATES_AS_TIMESTAMPS = on
  WRITE_DURATIONS_AS_TIMESTAMPS = on
}
```

Jackson is still able to deserialize the other format independent of this setting.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-serialization-jackson" % AkkaVersion
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
    <artifactId>akka-serialization-jackson_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-serialization-jackson_${versions.ScalaBinary}"
}
```

### Example 4: Usage

```scala
import akka.serialization.jackson.JsonSerializable

final case class Message(name: String, nr: Int) extends JsonSerializable
```

### Example 5: Usage

```java
import akka.serialization.jackson.JsonSerializable;

class MyMessage implements JsonSerializable {
  public final String name;
  public final int nr;

  public MyMessage(String name, int nr) {
    this.name = name;
    this.nr = nr;
  }
}
```

### Example 6: Polymorphic types

```scala
final case class Zoo(primaryAttraction: Animal) extends JsonSerializable

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes(
  Array(
    new JsonSubTypes.Type(value = classOf[Lion], name = "lion"),
    new JsonSubTypes.Type(value = classOf[Elephant], name = "elephant")))
sealed trait Animal

final case class Lion(name: String) extends Animal

final case class Elephant(name: String, age: Int) extends Animal
```

### Example 7: Polymorphic types

```java
public class Zoo implements JsonSerializable {
  public final Animal primaryAttraction;

  public Zoo(Animal primaryAttraction) {
    this.primaryAttraction = primaryAttraction;
  }
}

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = Lion.class, name = "lion"),
  @JsonSubTypes.Type(value = Elephant.class, name = "elephant")
})
interface Animal {}

public final class Lion implements Animal {
  public final String name;

  public Lion(String name) {
    this.name = name;
  }
}

public final class Elephant implements Animal {
  public final String name;
  public final int age;

  public Elephant(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
```

### Example 8: Polymorphic types

```text
InvalidDefinitionException: Cannot construct instance of `...` (no Creators, like default construct, exist): abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information
```

### Example 9: ADT with trait and case object

```scala
final case class Zoo(primaryAttraction: Animal) extends JsonSerializable

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes(
  Array(
    new JsonSubTypes.Type(value = classOf[Lion], name = "lion"),
    new JsonSubTypes.Type(value = classOf[Elephant], name = "elephant"),
    new JsonSubTypes.Type(value = classOf[Unicorn], name = "unicorn")))
sealed trait Animal

final case class Lion(name: String) extends Animal
final case class Elephant(name: String, age: Int) extends Animal

@JsonDeserialize(`using` = classOf[UnicornDeserializer])
sealed trait Unicorn extends Animal
@JsonTypeName("unicorn")
case object Unicorn extends Unicorn

class UnicornDeserializer extends StdDeserializer[Unicorn](Unicorn.getClass) {
  // whenever we need to deserialize an instance of Unicorn trait, we return the object Unicorn
  override def deserialize(p: JsonParser, ctxt: DeserializationContext): Unicorn = Unicorn
}
```

### Example 10: ADT with trait and case object

```scala
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

@JsonSerialize(`using` = classOf[DirectionJsonSerializer])
@JsonDeserialize(`using` = classOf[DirectionJsonDeserializer])
sealed trait Direction

object Direction {
  case object North extends Direction
  case object East extends Direction
  case object South extends Direction
  case object West extends Direction
}

class DirectionJsonSerializer extends StdSerializer[Direction](classOf[Direction]) {
  import Direction._

  override def serialize(value: Direction, gen: JsonGenerator, provider: SerializerProvider): Unit = {
    val strValue = value match {
      case North => "N"
      case East  => "E"
      case South => "S"
      case West  => "W"
    }
    gen.writeString(strValue)
  }
}

class DirectionJsonDeserializer extends StdDeserializer[Direction](classOf[Direction]) {
  import Direction._

  override def deserialize(p: JsonParser, ctxt: DeserializationContext): Direction = {
    p.getText match {
      case "N" => North
      case "E" => East
      case "S" => South
      case "W" => West
    }
  }
}

final case class Compass(currentDirection: Direction) extends JsonSerializable
```

### Example 11: Enumerations

```scala
object Planet extends Enumeration {
  type Planet = Value
  val Mercury, Venus, Earth, Mars, Krypton = Value
}

// Uses default Jackson serialization format for Scala Enumerations
final case class Alien(name: String, planet: Planet.Planet) extends TestMessage

// Serializes planet values as a JsonString
class PlanetType extends TypeReference[Planet.type] {}
final case class Superhero(name: String, @JsonScalaEnumeration(classOf[PlanetType]) planet: Planet.Planet)
    extends TestMessage
```

### Example 12: Add Optional Field

```scala
case class ItemAdded(shoppingCartId: String, productId: String, quantity: Int) extends JsonSerializable
```

### Example 13: Add Optional Field

```java
public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;
  public final String productId;
  public final int quantity;

  public ItemAdded(String shoppingCartId, String productId, int quantity) {
    this.shoppingCartId = shoppingCartId;
    this.productId = productId;
    this.quantity = quantity;
  }
}
```

### Example 14: Add Optional Field

```scala
case class ItemAdded(shoppingCartId: String, productId: String, quantity: Int, discount: Option[Double], note: String)
    extends JsonSerializable {

  // alternative constructor because `note` should have default value "" when not defined in json
  @JsonCreator
  def this(shoppingCartId: String, productId: String, quantity: Int, discount: Option[Double], note: Option[String]) =
    this(shoppingCartId, productId, quantity, discount, note.getOrElse(""))
}
```

### Example 15: Add Optional Field

```java
public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;
  public final String productId;
  public final int quantity;
  public final Optional<Double> discount;
  public final String note;

  @JsonCreator
  public ItemAdded(
      String shoppingCartId,
      String productId,
      int quantity,
      Optional<Double> discount,
      String note) {
    this.shoppingCartId = shoppingCartId;
    this.productId = productId;
    this.quantity = quantity;
    this.discount = discount;

    // default for note is "" if not included in json
    if (note == null) this.note = "";
    else this.note = note;
  }

  public ItemAdded(
      String shoppingCartId, String productId, int quantity, Optional<Double> discount) {
    this(shoppingCartId, productId, quantity, discount, "");
  }
}
```

### Example 16: Add Mandatory Field

```scala
case class ItemAdded(shoppingCartId: String, productId: String, quantity: Int, discount: Double)
    extends JsonSerializable
```

### Example 17: Add Mandatory Field

```java
public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;
  public final String productId;
  public final int quantity;
  public final double discount;

  public ItemAdded(String shoppingCartId, String productId, int quantity, double discount) {
    this.shoppingCartId = shoppingCartId;
    this.productId = productId;
    this.quantity = quantity;
    this.discount = discount;
  }
}
```

### Example 18: Add Mandatory Field

```scala
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.DoubleNode
import com.fasterxml.jackson.databind.node.ObjectNode
import akka.serialization.jackson.JacksonMigration

class ItemAddedMigration extends JacksonMigration {

  override def currentVersion: Int = 2

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = {
    val root = json.asInstanceOf[ObjectNode]
    if (fromVersion <= 1) {
      root.set("discount", DoubleNode.valueOf(0.0))
    }
    root
  }
}
```

### Example 19: Add Mandatory Field

```java
import akka.serialization.jackson.JacksonMigration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ItemAddedMigration extends JacksonMigration {

  @Override
  public int currentVersion() {
    return 2;
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    ObjectNode root = (ObjectNode) json;
    if (fromVersion <= 1) {
      root.set("discount", DoubleNode.valueOf(0.0));
    }
    return root;
  }
}
```

### Example 20: Add Mandatory Field

```scala
akka.serialization.jackson.migrations {
  "com.myservice.event.ItemAdded" = "com.myservice.event.ItemAddedMigration"
}
```

### Example 21: Rename Field

```scala
case class ItemAdded(shoppingCartId: String, itemId: String, quantity: Int) extends JsonSerializable
```

### Example 22: Rename Field

```java
public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;

  public final String itemId;

  public final int quantity;

  public ItemAdded(String shoppingCartId, String itemId, int quantity) {
    this.shoppingCartId = shoppingCartId;
    this.itemId = itemId;
    this.quantity = quantity;
  }
}
```

### Example 23: Rename Field

```scala
import akka.serialization.jackson.JacksonMigration
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode

class ItemAddedMigration extends JacksonMigration {

  override def currentVersion: Int = 2

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = {
    val root = json.asInstanceOf[ObjectNode]
    if (fromVersion <= 1) {
      root.set[JsonNode]("itemId", root.get("productId"))
      root.remove("productId")
    }
    root
  }
}
```

### Example 24: Rename Field

```java
import akka.serialization.jackson.JacksonMigration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ItemAddedMigration extends JacksonMigration {

  @Override
  public int currentVersion() {
    return 2;
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    ObjectNode root = (ObjectNode) json;
    if (fromVersion <= 1) {
      root.set("itemId", root.get("productId"));
      root.remove("productId");
    }
    return root;
  }
}
```

### Example 25: Structural Changes

```scala
case class Customer(name: String, street: String, city: String, zipCode: String, country: String)
    extends JsonSerializable
```

### Example 26: Structural Changes

```java
public class Customer implements JsonSerializable {
  public final String name;
  public final String street;
  public final String city;
  public final String zipCode;
  public final String country;

  public Customer(String name, String street, String city, String zipCode, String country) {
    this.name = name;
    this.street = street;
    this.city = city;
    this.zipCode = zipCode;
    this.country = country;
  }
}
```

### Example 27: Structural Changes

```scala
case class Customer(name: String, shippingAddress: Address, billingAddress: Option[Address]) extends JsonSerializable
```

### Example 28: Structural Changes

```java
public class Customer implements JsonSerializable {
  public final String name;
  public final Address shippingAddress;
  public final Optional<Address> billingAddress;

  public Customer(String name, Address shippingAddress, Optional<Address> billingAddress) {
    this.name = name;
    this.shippingAddress = shippingAddress;
    this.billingAddress = billingAddress;
  }
}
```

### Example 29: Structural Changes

```scala
case class Address(street: String, city: String, zipCode: String, country: String) extends JsonSerializable
```

### Example 30: Structural Changes

```java
public class Address {
  public final String street;
  public final String city;
  public final String zipCode;
  public final String country;

  public Address(String street, String city, String zipCode, String country) {
    this.street = street;
    this.city = city;
    this.zipCode = zipCode;
    this.country = country;
  }
}
```

### Example 31: Structural Changes

```scala
import akka.serialization.jackson.JacksonMigration
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode

class CustomerMigration extends JacksonMigration {

  override def currentVersion: Int = 2

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = {
    val root = json.asInstanceOf[ObjectNode]
    if (fromVersion <= 1) {
      val shippingAddress = root.withObject("/shippingAddress")
      shippingAddress.set[JsonNode]("street", root.get("street"))
      shippingAddress.set[JsonNode]("city", root.get("city"))
      shippingAddress.set[JsonNode]("zipCode", root.get("zipCode"))
      shippingAddress.set[JsonNode]("country", root.get("country"))
      root.remove("street")
      root.remove("city")
      root.remove("zipCode")
      root.remove("country")
    }
    root
  }
}
```

### Example 32: Structural Changes

```java
import akka.serialization.jackson.JacksonMigration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class CustomerMigration extends JacksonMigration {

  @Override
  public int currentVersion() {
    return 2;
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    ObjectNode root = (ObjectNode) json;
    if (fromVersion <= 1) {
      ObjectNode shippingAddress = root.withObject("/shippingAddress");
      shippingAddress.set("street", root.get("street"));
      shippingAddress.set("city", root.get("city"));
      shippingAddress.set("zipCode", root.get("zipCode"));
      shippingAddress.set("country", root.get("country"));
      root.remove("street");
      root.remove("city");
      root.remove("zipCode");
      root.remove("country");
    }
    return root;
  }
}
```

### Example 33: Rename Class

```scala
case class OrderAdded(shoppingCartId: String) extends JsonSerializable
```

### Example 34: Rename Class

```java
public class OrderAdded implements JsonSerializable {
  public final String shoppingCartId;

  public OrderAdded(String shoppingCartId) {
    this.shoppingCartId = shoppingCartId;
  }
}
```

### Example 35: Rename Class

```scala
case class OrderPlaced(shoppingCartId: String) extends JsonSerializable
```

### Example 36: Rename Class

```java
public class OrderPlaced implements JsonSerializable {
  public final String shoppingCartId;

  public OrderPlaced(String shoppingCartId) {
    this.shoppingCartId = shoppingCartId;
  }
}
```

### Example 37: Rename Class

```scala
class OrderPlacedMigration extends JacksonMigration {

  override def currentVersion: Int = 2

  override def transformClassName(fromVersion: Int, className: String): String =
    classOf[OrderPlaced].getName

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = json
}
```

### Example 38: Rename Class

```java
public class OrderPlacedMigration extends JacksonMigration {

  @Override
  public int currentVersion() {
    return 2;
  }

  @Override
  public String transformClassName(int fromVersion, String className) {
    return OrderPlaced.class.getName();
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    return json;
  }
}
```

### Example 39: Rename Class

```scala
akka.serialization.jackson.migrations {
  "com.myservice.event.OrderAdded" = "com.myservice.event.OrderPlacedMigration"
}
```

### Example 40: Remove from serialization-bindings

```scala
akka.serialization.jackson.allowed-class-prefix =
  ["com.myservice.event.OrderAdded", "com.myservice.command"]
```

### Example 41: Rolling updates

```scala
case class ItemAdded(shoppingCartId: String, productId: String, quantity: Int) extends JsonSerializable
```

### Example 42: Rolling updates

```java
public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;
  public final String productId;
  public final int quantity;

  public ItemAdded(String shoppingCartId, String productId, int quantity) {
    this.shoppingCartId = shoppingCartId;
    this.productId = productId;
    this.quantity = quantity;
  }
}
```

### Example 43: Rolling updates

```scala
case class ItemAdded(shoppingCartId: String, productId: String, quantity: Int) extends JsonSerializable
```

### Example 44: Rolling updates

```java
public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;
  public final String productId;
  public final int quantity;

  public ItemAdded(String shoppingCartId, String productId, int quantity) {
    this.shoppingCartId = shoppingCartId;
    this.productId = productId;
    this.quantity = quantity;
  }
}
```

### Example 45: Rolling updates

```scala
import akka.serialization.jackson.JacksonMigration
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode

class ItemAddedMigration extends JacksonMigration {

  // Data produced in this node is still produced using the version 1 of the schema
  override def currentVersion: Int = 1

  override def supportedForwardVersion: Int = 2

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = {
    val root = json.asInstanceOf[ObjectNode]
    if (fromVersion == 2) {
      // When receiving an event of version 2 we down-cast it to the version 1 of the schema
      root.set[JsonNode]("productId", root.get("itemId"))
      root.remove("itemId")
    }
    root
  }
}
```

### Example 46: Rolling updates

```java
import akka.serialization.jackson.JacksonMigration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ItemAddedMigration extends JacksonMigration {

  // Data produced in this node is still produced using the version 1 of the schema
  @Override
  public int currentVersion() {
    return 1;
  }

  @Override
  public int supportedForwardVersion() {
    return 2;
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    ObjectNode root = (ObjectNode) json;
    if (fromVersion == 2) {
      // When receiving an event of version 2 we down-cast it to the version 1 of the schema
      root.set("productId", root.get("itemId"));
      root.remove("itemId");
    }
    return root;
  }
}
```

### Example 47: Rolling updates

```scala
case class ItemAdded(shoppingCartId: String, itemId: String, quantity: Int) extends JsonSerializable
```

### Example 48: Rolling updates

```java
public class ItemAdded implements JsonSerializable {
  public final String shoppingCartId;

  public final String itemId;

  public final int quantity;

  public ItemAdded(String shoppingCartId, String itemId, int quantity) {
    this.shoppingCartId = shoppingCartId;
    this.itemId = itemId;
    this.quantity = quantity;
  }
}
```

### Example 49: Rolling updates

```scala
import akka.serialization.jackson.JacksonMigration
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode

class ItemAddedMigration extends JacksonMigration {

  override def currentVersion: Int = 2

  override def transform(fromVersion: Int, json: JsonNode): JsonNode = {
    val root = json.asInstanceOf[ObjectNode]
    if (fromVersion <= 1) {
      root.set[JsonNode]("itemId", root.get("productId"))
      root.remove("productId")
    }
    root
  }
}
```

### Example 50: Rolling updates

```java
import akka.serialization.jackson.JacksonMigration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ItemAddedMigration extends JacksonMigration {

  @Override
  public int currentVersion() {
    return 2;
  }

  @Override
  public JsonNode transform(int fromVersion, JsonNode json) {
    ObjectNode root = (ObjectNode) json;
    if (fromVersion <= 1) {
      root.set("itemId", root.get("productId"));
      root.remove("productId");
    }
    return root;
  }
}
```

### Example 51: Jackson Modules

```conf
akka.serialization.jackson {

  # The Jackson JSON serializer will register these modules.
  jackson-modules += "akka.serialization.jackson.AkkaJacksonModule"
  # AkkaTypedJacksonModule optionally included if akka-actor-typed is in classpath
  jackson-modules += "akka.serialization.jackson.AkkaTypedJacksonModule"
  # AkkaStreamsModule optionally included if akka-streams is in classpath
  jackson-modules += "akka.serialization.jackson.AkkaStreamJacksonModule"
  jackson-modules += "com.fasterxml.jackson.module.paramnames.ParameterNamesModule"
  jackson-modules += "com.fasterxml.jackson.datatype.jdk8.Jdk8Module"
  jackson-modules += "com.fasterxml.jackson.datatype.jsr310.JavaTimeModule"
  jackson-modules += "com.fasterxml.jackson.module.scala.DefaultScalaModule"
}
```

### Example 52: Compression

```conf
# Compression settings for the jackson-json binding
akka.serialization.jackson.jackson-json.compression {
  # Compression algorithm.
  # - off  : no compression
  # - gzip : using common java gzip
  # - lz4 : using lz4-java
  algorithm = gzip

  # If compression is enabled with the `algorithm` setting the payload is compressed
  # when it's larger than this value.
  compress-larger-than = 32 KiB
}
```

### Example 53: Configuration per binding

```scala
akka.serialization.jackson.jackson-json {
  serialization-features {
    WRITE_DATES_AS_TIMESTAMPS = off
  }
}
akka.serialization.jackson.jackson-cbor {
  serialization-features {
    WRITE_DATES_AS_TIMESTAMPS = on
  }
}
```

### Example 54: Configuration per binding

```scala
akka.actor {
  serializers {
    jackson-json-message = "akka.serialization.jackson.JacksonJsonSerializer"
    jackson-json-event   = "akka.serialization.jackson.JacksonJsonSerializer"
  }
  serialization-identifiers {
    jackson-json-message = 9001
    jackson-json-event = 9002
  }
  serialization-bindings {
    "com.myservice.MyMessage" = jackson-json-message
    "com.myservice.MyEvent" = jackson-json-event
  }
}
akka.serialization.jackson {
  jackson-json-message {
    serialization-features {
      WRITE_DATES_AS_TIMESTAMPS = on
    }
  }
  jackson-json-event {
    serialization-features {
      WRITE_DATES_AS_TIMESTAMPS = off
    }
  }
}
```

### Example 55: Manifest-less serialization

```scala
akka.actor {
  serializers {
    jackson-json-event = "akka.serialization.jackson.JacksonJsonSerializer"
  }
  serialization-identifiers {
    jackson-json-event = 9001
  }
  serialization-bindings {
    "com.myservice.MyEvent" = jackson-json-event
  }
}
akka.serialization.jackson {
  jackson-json-event {
    type-in-manifest = off
    # Since there is exactly one serialization binding declared for this
    # serializer above, this is optional, but if there were none or many,
    # this would be mandatory.
    deserialization-type = "com.myservice.MyEvent"
  }
}
```

### Example 56: Additional features

```conf
akka.serialization.jackson {
  # Configuration of the ObjectMapper serialization features.
  # See com.fasterxml.jackson.databind.SerializationFeature
  # Enum values corresponding to the SerializationFeature and their boolean value.
  serialization-features {
    # Date/time in ISO-8601 (rfc3339) yyyy-MM-dd'T'HH:mm:ss.SSSZ format
    # as defined by com.fasterxml.jackson.databind.util.StdDateFormat
    # For interoperability it's better to use the ISO format, i.e. WRITE_DATES_AS_TIMESTAMPS=off,
    # but WRITE_DATES_AS_TIMESTAMPS=on has better performance.
    WRITE_DATES_AS_TIMESTAMPS = off
    WRITE_DURATIONS_AS_TIMESTAMPS = off
    FAIL_ON_EMPTY_BEANS = off
  }

  # Configuration of the ObjectMapper deserialization features.
  # See com.fasterxml.jackson.databind.DeserializationFeature
  # Enum values corresponding to the DeserializationFeature and their boolean value.
  deserialization-features {
    FAIL_ON_UNKNOWN_PROPERTIES = off
  }

  # Configuration of the ObjectMapper mapper features.
  # See com.fasterxml.jackson.databind.MapperFeature
  # Enum values corresponding to the MapperFeature and their
  # boolean values, for example:
  #
  # mapper-features {
  #   SORT_PROPERTIES_ALPHABETICALLY = on
  # }
  mapper-features {}

  # Allowed values USE_PROPERTIES_BASED, USE_DELEGATING, DEFAULT, EXPLICIT_ONLY
  # see com.fasterxml.jackson.databind.cfg.ConstructorDetector for details for each option
  # The default USE_PROPERTIES_BASED allows for detecting single argument constructors without @JsonCreator annotations
  # while DEAFULT provides the old Jackson behavior of requiring such an annotation.
  constructor-detector-mode = "USE_PROPERTIES_BASED"

  # Configuration of the ObjectMapper JsonParser features.
  # See com.fasterxml.jackson.core.JsonParser.Feature
  # Enum values corresponding to the JsonParser.Feature and their
  # boolean value, for example:
  #
  # json-parser-features {
  #   ALLOW_SINGLE_QUOTES = on
  # }
  json-parser-features {}

  # Configuration of the ObjectMapper JsonParser features.
  # See com.fasterxml.jackson.core.JsonGenerator.Feature
  # Enum values corresponding to the JsonGenerator.Feature and
  # their boolean value, for example:
  #
  # json-generator-features {
  #   WRITE_NUMBERS_AS_STRINGS = on
  # }
  json-generator-features {}

  # Configuration of the JsonFactory StreamReadFeature.
  # See com.fasterxml.jackson.core.StreamReadFeature
  # Enum values corresponding to the StreamReadFeatures and
  # their boolean value, for example:
  #
  # stream-read-features {
  #   STRICT_DUPLICATE_DETECTION = on
  # }
  stream-read-features {}

  # Configuration of the JsonFactory StreamWriteFeature.
  # See com.fasterxml.jackson.core.StreamWriteFeature
  # Enum values corresponding to the StreamWriteFeatures and
  # their boolean value, for example:
  #
  # stream-write-features {
  #   WRITE_BIGDECIMAL_AS_PLAIN = on
  # }
  stream-write-features {}

  # Configuration of the JsonFactory JsonReadFeature.
  # See com.fasterxml.jackson.core.json.JsonReadFeature
  # Enum values corresponding to the JsonReadFeatures and
  # their boolean value, for example:
  #
  # json-read-features {
  #   ALLOW_SINGLE_QUOTES = on
  # }
  json-read-features {}

  # Configuration of the JsonFactory JsonWriteFeature.
  # See com.fasterxml.jackson.core.json.JsonWriteFeature
  # Enum values corresponding to the JsonWriteFeatures and
  # their boolean value, for example:
  #
  # json-write-features {
  #   WRITE_NUMBERS_AS_STRINGS = on
  # }
  json-write-features {}

  # Configuration of the JsonFactory Visibility.
  # See com.fasterxml.jackson.annotation.PropertyAccessor
  # and com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility
  # Enum values. For example, to serialize only public fields
  # overwrite the default values with:
  #
  # visibility {
  #   FIELD = PUBLIC_ONLY
  # }
  # Default: all fields (including private and protected) are serialized.
  visibility {
    FIELD = ANY
  }

  # Deprecated, use `allowed-class-prefix` instead
  whitelist-class-prefix = []

  # Additional classes that are allowed even if they are not defined in `serialization-bindings`.
  # This is useful when a class is not used for serialization any more and therefore removed
  # from `serialization-bindings`, but should still be possible to deserialize.
  allowed-class-prefix = ${akka.serialization.jackson.whitelist-class-prefix}


  # settings for compression of the payload
  compression {
    # Compression algorithm.
    # - off  : no compression
    # - gzip : using common java gzip
    # - lz4 : using lz4-java
    algorithm = off

    # If compression is enabled with the `algorithm` setting the payload is compressed
    # when it's larger than this value.
    compress-larger-than = 0 KiB
  }

  # Whether the type should be written to the manifest.
  # If this is off, then either deserialization-type must be defined, or there must be exactly
  # one serialization binding declared for this serializer, and the type in that binding will be
  # used as the deserialization type. This feature will only work if that type either is a
  # concrete class, or if it is a supertype that uses Jackson polymorphism (ie, the
  # @JsonTypeInfo annotation) to store type information in the JSON itself. The intention behind
  # disabling this is to remove extraneous type information (ie, fully qualified class names) when
  # serialized objects are persisted in Akka persistence or replicated using Akka distributed
  # data. Note that Akka remoting already has manifest compression optimizations that address this,
  # so for types that just get sent over remoting, this offers no optimization.
  type-in-manifest = on

  # The type to use for deserialization.
  # This is only used if type-in-manifest is disabled. If set, this type will be used to
  # deserialize all messages. This is useful if the binding configuration you want to use when
  # disabling type in manifest cannot be expressed as a single type. Examples of when you might
  # use this include when changing serializers, so you don't want this serializer used for
  # serialization and you haven't declared any bindings for it, but you still want to be able to
  # deserialize messages that were serialized with this serializer, as well as situations where
  # you only want some sub types of a given Jackson polymorphic type to be serialized using this
  # serializer.
  deserialization-type = ""

  # Specific settings for jackson-json binding can be defined in this section to
  # override the settings in 'akka.serialization.jackson'
  jackson-json {}

  # Specific settings for jackson-cbor binding can be defined in this section to
  # override the settings in 'akka.serialization.jackson'
  jackson-cbor {}

  # Issue #28918 for compatibility with data serialized with JacksonCborSerializer in
  # Akka 2.6.4 or earlier, which was plain JSON format.
  jackson-cbor-264 = ${akka.serialization.jackson.jackson-cbor}

}
```

### Example 57: Date/time format

```scala
akka.serialization.jackson.serialization-features {
  WRITE_DATES_AS_TIMESTAMPS = on
  WRITE_DURATIONS_AS_TIMESTAMPS = on
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaSerializationDeserializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaSerializationSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/AkkaSerializationDeserializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/AkkaSerializationSerializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html
- https://doc.akka.io/libraries/akka-core/current/additional/rolling-updates.html
- https://doc.akka.io/libraries/akka-core/current/multi-jvm-testing.html
- https://doc.akka.io/libraries/akka-core/current/serialization-jackson.html
- https://doc.akka.io/libraries/akka-core/current/serialization.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/serialization-jackson.html](https://doc.akka.io/libraries/akka-core/current/serialization-jackson.html)*