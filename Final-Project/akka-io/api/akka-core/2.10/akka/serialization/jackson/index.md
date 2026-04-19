---
description: Akka 2.10.17 - akka.serialization.jackson
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:23:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/index.html
title: Akka 2.10.17 - akka.serialization.jackson
---

# Akka 2.10.17 - akka.serialization.jackson

> **Summary:** Akka 2.10.17 - akka.serialization.jackson

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/serialization/index.html "Permalink")  package [serialization](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/serialization/jackson/index.html "Permalink")  package jacksonDefinition Classes[serialization](../index.html)
- [**](../../../akka/serialization/jackson/internal/index.html "Permalink")  package [internal](internal/index.html)
- [AkkaJacksonModule](AkkaJacksonModule.html "Complete module with support for all custom serializers.")
- [AkkaSerializationDeserializer](AkkaSerializationDeserializer.html)
- [AkkaSerializationSerializer](AkkaSerializationSerializer.html)
- [AkkaStreamJacksonModule](AkkaStreamJacksonModule.html)
- [AkkaTypedJacksonModule](AkkaTypedJacksonModule.html)
- [CborSerializable](CborSerializable.html "Predefined marker trait for serialization with Jackson CBOR.")
- [Compression](Compression$.html)
- [JacksonMigration](JacksonMigration.html "Data migration of old formats to current format can be implemented in a concrete subclass and configured to be used by the JacksonSerializer for a changed class.")
- [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "Used with JacksonObjectMapperProviderSetup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "Registry of shared ObjectMapper instances, each with it's unique bindingName.")
- [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "Setup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JsonSerializable](JsonSerializable.html "Predefined marker trait for serialization with Jackson JSON.")
p[akka](../../index.html).[serialization](../index.html)

# jackson[**](../../../akka/serialization/jackson/index.html "Permalink")

#### package jackson

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/serialization/jackson/internal/index.html "Permalink")  package [internal](internal/index.html)
### Type Members

1. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html "Permalink")  class [AkkaJacksonModule](AkkaJacksonModule.html "Complete module with support for all custom serializers.") extends Module with JacksonModule with ActorRefModule with AddressModule with FiniteDurationModuleComplete module with support for all custom serializers.
2. [**](../../../akka/serialization/jackson/AkkaSerializationDeserializer.html "Permalink") final  class [AkkaSerializationDeserializer](AkkaSerializationDeserializer.html) extends StdScalarDeserializer\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)] with ActorSystemAccess
3. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html "Permalink") final  class [AkkaSerializationSerializer](AkkaSerializationSerializer.html) extends StdScalarSerializer\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)] with ActorSystemAccess
4. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html "Permalink")  class [AkkaStreamJacksonModule](AkkaStreamJacksonModule.html) extends Module with JacksonModule with StreamRefModule
5. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html "Permalink")  class [AkkaTypedJacksonModule](AkkaTypedJacksonModule.html) extends Module with JacksonModule with TypedActorRefModule
6. [**](../../../akka/serialization/jackson/CborSerializable.html "Permalink")  trait [CborSerializable](CborSerializable.html "Predefined marker trait for serialization with Jackson CBOR.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Predefined marker trait for serialization with Jackson CBOR.

Predefined marker trait for serialization with Jackson CBOR.
Enabled in reference.conf `akka.actor.serialization-bindings` (via application.conf).
7. [**](../../../akka/serialization/jackson/JacksonMigration.html "Permalink") abstract  class [JacksonMigration](JacksonMigration.html "Data migration of old formats to current format can be implemented in a concrete subclass and configured to be used by the JacksonSerializer for a changed class.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Data migration of old formats to current format can
be implemented in a concrete subclass and configured to
be used by the `JacksonSerializer` for a changed class.

Data migration of old formats to current format can
be implemented in a concrete subclass and configured to
be used by the `JacksonSerializer` for a changed class.

It is used when deserializing data of older version than the
[JacksonMigration\#currentVersion](JacksonMigration.html#currentVersion:Int). You implement the transformation of the
JSON structure in the [JacksonMigration\#transform](JacksonMigration.html#transform(fromVersion:Int,json:com.fasterxml.jackson.databind.JsonNode):com.fasterxml.jackson.databind.JsonNode) method. If you have changed the
class name you should override [JacksonMigration\#transformClassName](JacksonMigration.html#transformClassName(fromVersion:Int,className:String):String) and return
current class name.
8. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html "Permalink")  class [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "Used with JacksonObjectMapperProviderSetup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Used with [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html) for defining a `JacksonObjectMapperProvider` that can be
passed in when ActorSystem is created rather than creating one from configured class name.

Used with [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html) for defining a `JacksonObjectMapperProvider` that can be
passed in when ActorSystem is created rather than creating one from configured class name.
Create a subclass and override the methods to amend the defaults.
9. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html "Permalink") final  class [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "Registry of shared ObjectMapper instances, each with it's unique bindingName.") extends [Extension](../../actor/Extension.html)Registry of shared `ObjectMapper` instances, each with it's unique `bindingName`.
10. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html "Permalink") final  class [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "Setup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.") extends [Setup](../../actor/setup/Setup.html)Setup for defining a `JacksonObjectMapperProvider` that can be passed in when ActorSystem
is created rather than creating one from configured class name.

Setup for defining a `JacksonObjectMapperProvider` that can be passed in when ActorSystem
is created rather than creating one from configured class name. Create a subclass of
[JacksonObjectMapperFactory](JacksonObjectMapperFactory.html) and override the methods to amend the defaults.
11. [**](../../../akka/serialization/jackson/JsonSerializable.html "Permalink")  trait [JsonSerializable](JsonSerializable.html "Predefined marker trait for serialization with Jackson JSON.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Predefined marker trait for serialization with Jackson JSON.

Predefined marker trait for serialization with Jackson JSON.
Enabled in reference.conf `akka.actor.serialization-bindings` (via application.conf).
### Value Members

1. [**](../../../akka/serialization/jackson/AkkaJacksonModule$.html "Permalink")  object [AkkaJacksonModule](AkkaJacksonModule$.html) extends [AkkaJacksonModule](AkkaJacksonModule.html)
2. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule$.html "Permalink")  object [AkkaStreamJacksonModule](AkkaStreamJacksonModule$.html) extends [AkkaJacksonModule](AkkaJacksonModule.html)
3. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html "Permalink")  object [AkkaTypedJacksonModule](AkkaTypedJacksonModule$.html) extends [AkkaJacksonModule](AkkaJacksonModule.html)
4. [**](../../../akka/serialization/jackson/Compression$.html "Permalink")  object [Compression](Compression$.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
5. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html "Permalink")  object [JacksonObjectMapperProvider](JacksonObjectMapperProvider$.html) extends [ExtensionId](../../actor/ExtensionId.html)\[[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)
6. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html "Permalink")  object [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/Setup.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaSerializationDeserializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaSerializationSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaStreamJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaStreamJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaTypedJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaTypedJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/CborSerializable.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/Compression$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperFactory.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProvider$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JsonSerializable.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/index.html](https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/index.html)*