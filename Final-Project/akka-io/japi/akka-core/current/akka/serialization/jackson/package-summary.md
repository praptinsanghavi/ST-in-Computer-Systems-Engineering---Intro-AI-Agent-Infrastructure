---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:47:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/package-summary.html
title: akka.serialization.jackson
---

# akka.serialization.jackson

## Content

# Package akka.serialization.jackson

- Interface Summary 
| Interface | Description |
| [ActorRefModule](ActorRefModule.html "interface in akka.serialization.jackson") | INTERNAL API: Adds support for serializing and deserializing `ActorRef`. |
| --- | --- |
| [ActorSystemAccess](ActorSystemAccess.html "interface in akka.serialization.jackson") | INTERNAL API |
| [AddressModule](AddressModule.html "interface in akka.serialization.jackson") | INTERNAL API: Adds support for serializing and deserializing `Address`. |
| [CborSerializable](CborSerializable.html "interface in akka.serialization.jackson") | Predefined marker trait for serialization with Jackson CBOR. |
| [Compression.Algoritm](Compression.Algoritm.html "interface in akka.serialization.jackson") |  |
| [FiniteDurationModule](FiniteDurationModule.html "interface in akka.serialization.jackson") | INTERNAL API: Adds support for serializing and deserializing `FiniteDuration`. |
| [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson") | INTERNAL API |
| [JsonSerializable](JsonSerializable.html "interface in akka.serialization.jackson") | Predefined marker trait for serialization with Jackson JSON. |
| [StreamRefModule](StreamRefModule.html "interface in akka.serialization.jackson") | INTERNAL API: Adds support for serializing and deserializing [`SourceRef`](../../stream/SourceRef.html "interface in akka.stream") and [`SinkRef`](../../stream/SinkRef.html "interface in akka.stream"). |
| [TypedActorRefModule](TypedActorRefModule.html "interface in akka.serialization.jackson") | INTERNAL API: Adds support for serializing and deserializing [`ActorRef`](../../actor/typed/ActorRef.html "interface in akka.actor.typed"). |
- Class Summary 
| Class | Description |
| [ActorRefDeserializer$](ActorRefDeserializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| --- | --- |
| [ActorRefSerializer$](ActorRefSerializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [ActorSystemAccess$](ActorSystemAccess$.html "class in akka.serialization.jackson") | INTERNAL API |
| [AddressDeserializer$](AddressDeserializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [AddressSerializer$](AddressSerializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [AkkaJacksonModule](AkkaJacksonModule.html "class in akka.serialization.jackson") | Complete module with support for all custom serializers. |
| [AkkaJacksonModule$](AkkaJacksonModule$.html "class in akka.serialization.jackson") |  |
| [AkkaSerializationDeserializer](AkkaSerializationDeserializer.html "class in akka.serialization.jackson") |  |
| [AkkaSerializationSerializer](AkkaSerializationSerializer.html "class in akka.serialization.jackson") |  |
| [AkkaStreamJacksonModule](AkkaStreamJacksonModule.html "class in akka.serialization.jackson") |  |
| [AkkaStreamJacksonModule$](AkkaStreamJacksonModule$.html "class in akka.serialization.jackson") |  |
| [AkkaTypedJacksonModule](AkkaTypedJacksonModule.html "class in akka.serialization.jackson") |  |
| [AkkaTypedJacksonModule$](AkkaTypedJacksonModule$.html "class in akka.serialization.jackson") |  |
| [Compression](Compression.html "class in akka.serialization.jackson") |  |
| [Compression.GZip](Compression.GZip.html "class in akka.serialization.jackson") |  |
| [Compression.GZip$](Compression.GZip$.html "class in akka.serialization.jackson") |  |
| [Compression.LZ4](Compression.LZ4.html "class in akka.serialization.jackson") |  |
| [Compression.LZ4$](Compression.LZ4$.html "class in akka.serialization.jackson") |  |
| [Compression.Off$](Compression.Off$.html "class in akka.serialization.jackson") |  |
| [Compression$](Compression$.html "class in akka.serialization.jackson") |  |
| [FiniteDurationDeserializer$](FiniteDurationDeserializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [FiniteDurationSerializer$](FiniteDurationSerializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [JacksonMigration](JacksonMigration.html "class in akka.serialization.jackson") | Data migration of old formats to current format can  be implemented in a concrete subclass and configured to  be used by the `JacksonSerializer` for a changed class. |
| [JacksonModule.DeserializerResolverByClass](JacksonModule.DeserializerResolverByClass.html "class in akka.serialization.jackson") |  |
| [JacksonModule.SerializerResolverByClass](JacksonModule.SerializerResolverByClass.html "class in akka.serialization.jackson") |  |
| [JacksonModule$](JacksonModule$.html "class in akka.serialization.jackson") | INTERNAL API |
| [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") | Used with [`JacksonObjectMapperProviderSetup`](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson") for defining a `JacksonObjectMapperProvider` that can be  passed in when ActorSystem is created rather than creating one from configured class name. |
| [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson") | Registry of shared `ObjectMapper` instances, each with it's unique `bindingName`. |
| [JacksonObjectMapperProvider$](JacksonObjectMapperProvider$.html "class in akka.serialization.jackson") |  |
| [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson") | Setup for defining a `JacksonObjectMapperProvider` that can be passed in when ActorSystem  is created rather than creating one from configured class name. |
| [JacksonObjectMapperProviderSetup$](JacksonObjectMapperProviderSetup$.html "class in akka.serialization.jackson") |  |
| [JacksonSerializer$](JacksonSerializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [SinkRefDeserializer$](SinkRefDeserializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [SinkRefSerializer$](SinkRefSerializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [SourceRefDeserializer$](SourceRefDeserializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [SourceRefSerializer$](SourceRefSerializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [TypedActorRefDeserializer$](TypedActorRefDeserializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [TypedActorRefSerializer$](TypedActorRefSerializer$.html "class in akka.serialization.jackson") | INTERNAL API |
| [VersionExtractor](VersionExtractor.html "class in akka.serialization.jackson") | INTERNAL API |
| [VersionExtractor$](VersionExtractor$.html "class in akka.serialization.jackson") | INTERNAL API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/ActorRefDeserializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/ActorRefModule.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/ActorRefSerializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/ActorSystemAccess$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/ActorSystemAccess.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/AddressDeserializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/AddressModule.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/AddressSerializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/AkkaJacksonModule$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/AkkaJacksonModule.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/AkkaSerializationDeserializer.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/AkkaSerializationSerializer.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/AkkaStreamJacksonModule$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/AkkaStreamJacksonModule.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/AkkaTypedJacksonModule$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/AkkaTypedJacksonModule.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/CborSerializable.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/Compression$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/Compression.Algoritm.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/Compression.GZip$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/Compression.GZip.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/Compression.LZ4$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/Compression.LZ4.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/Compression.Off$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/Compression.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/FiniteDurationDeserializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/FiniteDurationModule.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/FiniteDurationSerializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JacksonMigration.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JacksonModule$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JacksonModule.DeserializerResolverByClass.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JacksonModule.SerializerResolverByClass.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JacksonModule.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JacksonObjectMapperFactory.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JacksonObjectMapperProvider$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JacksonObjectMapperProvider.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JacksonSerializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/JsonSerializable.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/SinkRefDeserializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/SinkRefSerializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/SourceRefDeserializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/SourceRefSerializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/StreamRefModule.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/TypedActorRefDeserializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/TypedActorRefModule.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/TypedActorRefSerializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/VersionExtractor$.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/serialization/jackson/package-summary.html)*