---
description: Akka 2.10.17 - akka.serialization
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/index.html
title: Akka 2.10.17 - akka.serialization
---

# Akka 2.10.17 - akka.serialization

> **Summary:** Akka 2.10.17 - akka.serialization

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](../dispatch/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](../event/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](../io/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](../pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](../persistence/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package serializationDefinition Classes[akka](../index.html)
- [**](../../akka/serialization/jackson/index.html "Permalink")  package [jackson](jackson/index.html)
- [AsyncSerializer](AsyncSerializer.html "Serializer that supports async serialization.")
- [AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html "Scala API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls and blocks.")
- [AsyncSerializerWithStringManifestCS](AsyncSerializerWithStringManifestCS.html "Java API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls and blocks.")
- [BaseSerializer](BaseSerializer.html "Base serializer trait with serialization identifiers configuration contract, when globally unique serialization identifier is configured in the reference.conf.")
- [ByteArraySerializer](ByteArraySerializer.html "This is a special Serializer that Serializes and deserializes byte arrays only, (just returns the byte array unchanged/uncopied)")
- [ByteBufferSerializer](ByteBufferSerializer.html "Serializer between an object and a ByteBuffer representing that object.")
- [DisabledJavaSerializer](DisabledJavaSerializer.html "This Serializer is used when akka.actor.java-serialization = off")
- [JSerializer](JSerializer.html "Java API for creating a Serializer: make sure to include a constructor which takes exactly one argument of type akka.actor.ExtendedActorSystem, because that is the preferred constructor which will be invoked when reflectively instantiating the JSerializer (also possible with empty constructor).")
- [JavaSerializer](JavaSerializer.html "This Serializer uses standard Java Serialization")
- [NullSerializer](NullSerializer.html "This is a special Serializer that Serializes and deserializes nulls only")
- [Serialization](Serialization.html "Serialization module.")
- [SerializationExtension](SerializationExtension$.html "SerializationExtension is an Akka Extension to interact with the Serialization that is built into Akka")
- [SerializationSetup](SerializationSetup.html "Setup for the serialization subsystem, constructor is *Internal API*, use factories in SerializationSetup")
- [Serializer](Serializer.html "A Serializer represents a bimap between an object and an array of bytes representing that object.")
- [SerializerDetails](SerializerDetails.html "Constructor is internal API: Use the factories SerializerDetails#create or SerializerDetails#apply to construct")
- [SerializerWithStringManifest](SerializerWithStringManifest.html "A Serializer represents a bimap between an object and an array of bytes representing that object.")
- [Serializers](Serializers$.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# serialization[**](../../akka/serialization/index.html "Permalink")

#### package serialization

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/serialization/jackson/index.html "Permalink")  package [jackson](jackson/index.html)
### Type Members

1. [**](../../akka/serialization/AsyncSerializer.html "Permalink")  trait [AsyncSerializer](AsyncSerializer.html "Serializer that supports async serialization.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Serializer that supports async serialization.

Serializer that supports async serialization.

Only used for Akka persistence journals that explicitly support async serializers.

Implementations should typically extend [AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html) or
[AsyncSerializerWithStringManifestCS](AsyncSerializerWithStringManifestCS.html) that delegates synchronous calls to their async equivalents.
2. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html "Permalink") abstract  class [AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html "Scala API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls and blocks.") extends [SerializerWithStringManifest](SerializerWithStringManifest.html) with [AsyncSerializer](AsyncSerializer.html)Scala API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls
and blocks.
3. [**](../../akka/serialization/AsyncSerializerWithStringManifestCS.html "Permalink") abstract  class [AsyncSerializerWithStringManifestCS](AsyncSerializerWithStringManifestCS.html "Java API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls and blocks.") extends [AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html)Java API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls
and blocks.
4. [**](../../akka/serialization/BaseSerializer.html "Permalink")  trait [BaseSerializer](BaseSerializer.html "Base serializer trait with serialization identifiers configuration contract, when globally unique serialization identifier is configured in the reference.conf.") extends [Serializer](Serializer.html) Base serializer trait with serialization identifiers configuration contract,
 when globally unique serialization identifier is configured in the `reference.conf`.
5. [**](../../akka/serialization/ByteArraySerializer.html "Permalink")  class [ByteArraySerializer](ByteArraySerializer.html "This is a special Serializer that Serializes and deserializes byte arrays only, (just returns the byte array unchanged/uncopied)") extends [BaseSerializer](BaseSerializer.html) with [ByteBufferSerializer](ByteBufferSerializer.html)This is a special Serializer that Serializes and deserializes byte arrays only,
(just returns the byte array unchanged/uncopied)
6. [**](../../akka/serialization/ByteBufferSerializer.html "Permalink")  trait [ByteBufferSerializer](ByteBufferSerializer.html "Serializer between an object and a ByteBuffer representing that object.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Serializer between an object and a `ByteBuffer` representing that object.

Serializer between an object and a `ByteBuffer` representing that object.

Implementations should typically extend [SerializerWithStringManifest](SerializerWithStringManifest.html) and
in addition to the `ByteBuffer` based `toBinary` and `fromBinary` methods also
implement the array based `toBinary` and `fromBinary` methods. The array based
methods will be used when `ByteBuffer` is not used, e.g. in Akka Persistence.

Note that the array based methods can for example be implemented by delegation
like this:

```
 // you need to know the maximum size in bytes of the serialized messages
 val pool = new akka.io.DirectByteBufferPool(defaultBufferSize = 1024 * 1024, maxPoolEntries = 10)

// Implement this method for compatibility with `SerializerWithStringManifest`.
override def toBinary(o: AnyRef): Array[Byte] = {
  val buf = pool.acquire()
  try {
    toBinary(o, buf)
    buf.flip()
    val bytes = new Array[Byte](buf.remaining)
    buf.get(bytes)
    bytes
  } finally {
    pool.release(buf)
  }
}

// Implement this method for compatibility with `SerializerWithStringManifest`.
override def fromBinary(bytes: Array[Byte], manifest: String): AnyRef =
  fromBinary(ByteBuffer.wrap(bytes), manifest)
```
7. [**](../../akka/serialization/DisabledJavaSerializer.html "Permalink") final  case class [DisabledJavaSerializer](DisabledJavaSerializer.html "This Serializer is used when akka.actor.java-serialization = off")(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)) extends [Serializer](Serializer.html) with [ByteBufferSerializer](ByteBufferSerializer.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis Serializer is used when `akka.actor.java-serialization = off`
8. [**](../../akka/serialization/JSerializer.html "Permalink") abstract  class [JSerializer](JSerializer.html "Java API for creating a Serializer: make sure to include a constructor which takes exactly one argument of type akka.actor.ExtendedActorSystem, because that is the preferred constructor which will be invoked when reflectively instantiating the JSerializer (also possible with empty constructor).") extends [Serializer](Serializer.html)Java API for creating a Serializer: make sure to include a constructor which
takes exactly one argument of type [akka.actor.ExtendedActorSystem](../actor/ExtendedActorSystem.html), because
that is the preferred constructor which will be invoked when reflectively instantiating
the JSerializer (also possible with empty constructor).
9. [**](../../akka/serialization/JavaSerializer.html "Permalink")  class [JavaSerializer](JavaSerializer.html "This Serializer uses standard Java Serialization") extends [BaseSerializer](BaseSerializer.html)This Serializer uses standard Java Serialization
10. [**](../../akka/serialization/NullSerializer.html "Permalink")  class [NullSerializer](NullSerializer.html "This is a special Serializer that Serializes and deserializes nulls only") extends [Serializer](Serializer.html)This is a special Serializer that Serializes and deserializes nulls only
11. [**](../../akka/serialization/Serialization.html "Permalink")  class [Serialization](Serialization.html "Serialization module.") extends [Extension](../actor/Extension.html)Serialization module.

Serialization module. Contains methods for serialization and deserialization as well as
locating a Serializer for a particular class as defined in the mapping in the configuration.
12. [**](../../akka/serialization/SerializationSetup.html "Permalink") final  class [SerializationSetup](SerializationSetup.html "Setup for the serialization subsystem, constructor is *Internal API*, use factories in SerializationSetup") extends [Setup](../actor/setup/Setup.html)Setup for the serialization subsystem, constructor is \*Internal API\*, use factories in [SerializationSetup](SerializationSetup.html)
13. [**](../../akka/serialization/Serializer.html "Permalink")  trait [Serializer](Serializer.html "A Serializer represents a bimap between an object and an array of bytes representing that object.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A Serializer represents a bimap between an object and an array of bytes representing that object.

A Serializer represents a bimap between an object and an array of bytes representing that object.

Serializers are loaded using reflection during [akka.actor.ActorSystem](../actor/ActorSystem.html)
start\-up, where constructors are tried in order:

	- taking exactly one argument of type [akka.actor.ExtendedActorSystem](../actor/ExtendedActorSystem.html);
	this should be the preferred one because all reflective loading of classes
	during deserialization should use ExtendedActorSystem.dynamicAccess (see
	[akka.actor.DynamicAccess](../actor/DynamicAccess.html))
	- taking exactly one argument of type [akka.actor.ActorSystem](../actor/ActorSystem.html)
	- taking exactly one argument of type [akka.actor.ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)
	- without arguments
	- taking two arguments of type [akka.actor.ExtendedActorSystem](../actor/ExtendedActorSystem.html) and `String` where the second `String` argument is the binding name
	- taking two arguments of type [akka.actor.ActorSystem](../actor/ActorSystem.html) and `String` where the second `String` argument is the binding name
	- taking two arguments of type [akka.actor.ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html) and `String` where the second `String` argument is the binding name**Be sure to always use the** [akka.actor.DynamicAccess](../actor/DynamicAccess.html) **for loading classes!** This is necessary to
avoid strange match errors and inequalities which arise from different class loaders loading
the same class.
14. [**](../../akka/serialization/SerializerDetails.html "Permalink") final  class [SerializerDetails](SerializerDetails.html "Constructor is internal API: Use the factories SerializerDetails#create or SerializerDetails#apply to construct") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Constructor is internal API: Use the factories [SerializerDetails\#create](SerializerDetails$.html#create(alias:String,serializer:akka.serialization.Serializer,useFor:java.util.List[Class[_]]):akka.serialization.SerializerDetails) or [SerializerDetails\#apply](SerializerDetails$.html#apply(alias:String,serializer:akka.serialization.Serializer,useFor:Seq[Class[_]]):akka.serialization.SerializerDetails)
to construct
15. [**](../../akka/serialization/SerializerWithStringManifest.html "Permalink") abstract  class [SerializerWithStringManifest](SerializerWithStringManifest.html "A Serializer represents a bimap between an object and an array of bytes representing that object.") extends [Serializer](Serializer.html)A Serializer represents a bimap between an object and an array of bytes representing that object.

A Serializer represents a bimap between an object and an array of bytes representing that object.

For serialization of data that need to evolve over time the `SerializerWithStringManifest` is recommended instead
of [Serializer](Serializer.html) because the manifest (type hint) is a `String` instead of a `Class`. That means
that the class can be moved/removed and the serializer can still deserialize old data by matching
on the `String`. This is especially useful for Akka Persistence.

The manifest string can also encode a version number that can be used in `fromBinary` to
deserialize in different ways to migrate old data to new domain objects.

If the data was originally serialized with [Serializer](Serializer.html) and in a later version of the
system you change to `SerializerWithStringManifest` the manifest string will be the full class name if
you used `includeManifest=true`, otherwise it will be the empty string.

Serializers are loaded using reflection during [akka.actor.ActorSystem](../actor/ActorSystem.html)
start\-up, where constructors are tried in order:

	- taking exactly one argument of type [akka.actor.ExtendedActorSystem](../actor/ExtendedActorSystem.html);
	this should be the preferred one because all reflective loading of classes
	during deserialization should use ExtendedActorSystem.dynamicAccess (see
	[akka.actor.DynamicAccess](../actor/DynamicAccess.html))
	- taking exactly one argument of type [akka.actor.ActorSystem](../actor/ActorSystem.html)
	- taking exactly one argument of type [akka.actor.ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)
	- without arguments
	- taking two arguments of type [akka.actor.ExtendedActorSystem](../actor/ExtendedActorSystem.html) and `String` where the second `String` argument is the binding name
	- taking two arguments of type [akka.actor.ActorSystem](../actor/ActorSystem.html) and `String` where the second `String` argument is the binding name
	- taking two arguments of type [akka.actor.ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html) and `String` where the second `String` argument is the binding name**Be sure to always use the** [akka.actor.DynamicAccess](../actor/DynamicAccess.html) **for loading classes!** This is necessary to
avoid strange match errors and inequalities which arise from different class loaders loading
the same class.
### Value Members

1. [**](../../akka/serialization/BaseSerializer$.html "Permalink")  object [BaseSerializer](BaseSerializer$.html)
2. [**](../../akka/serialization/DisabledJavaSerializer$.html "Permalink")  object [DisabledJavaSerializer](DisabledJavaSerializer$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
3. [**](../../akka/serialization/JavaSerializer$.html "Permalink")  object [JavaSerializer](JavaSerializer$.html)
4. [**](../../akka/serialization/NullSerializer$.html "Permalink")  object [NullSerializer](NullSerializer$.html) extends [NullSerializer](NullSerializer.html)
5. [**](../../akka/serialization/Serialization$.html "Permalink")  object [Serialization](Serialization$.html)
6. [**](../../akka/serialization/SerializationExtension$.html "Permalink")  object [SerializationExtension](SerializationExtension$.html "SerializationExtension is an Akka Extension to interact with the Serialization that is built into Akka") extends [ExtensionId](../actor/ExtensionId.html)\[[Serialization](Serialization.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)SerializationExtension is an Akka Extension to interact with the Serialization
that is built into Akka
7. [**](../../akka/serialization/SerializationSetup$.html "Permalink")  object [SerializationSetup](SerializationSetup$.html)
8. [**](../../akka/serialization/SerializerDetails$.html "Permalink")  object [SerializerDetails](SerializerDetails$.html)
9. [**](../../akka/serialization/Serializers$.html "Permalink")  object [Serializers](Serializers$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DynamicAccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/Setup.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/pki/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/AsyncSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifestCS.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/BaseSerializer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/ByteArraySerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/ByteBufferSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/DisabledJavaSerializer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/DisabledJavaSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/JSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/JavaSerializer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/JavaSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/NullSerializer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/NullSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serialization$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serialization.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializationExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializationSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializationSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializerDetails$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializerDetails.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serializers$.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/serialization/index.html](https://doc.akka.io/api/akka-core/2.10/akka/serialization/index.html)*