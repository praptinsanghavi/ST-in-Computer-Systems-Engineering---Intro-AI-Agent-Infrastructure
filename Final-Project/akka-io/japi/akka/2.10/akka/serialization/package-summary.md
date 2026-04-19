---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:11:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/serialization/package-summary.html
title: akka.serialization
---

# akka.serialization

## Content

# Package akka.serialization

- Interface Summary 
| Interface | Description |
| [AsyncSerializer](AsyncSerializer.html "interface in akka.serialization") | Serializer that supports async serialization. |
| --- | --- |
| [BaseSerializer](BaseSerializer.html "interface in akka.serialization") | Base serializer trait with serialization identifiers configuration contract,  when globally unique serialization identifier is configured in the `reference.conf`. |
| [ByteBufferSerializer](ByteBufferSerializer.html "interface in akka.serialization") | Serializer between an object and a `ByteBuffer` representing that object. |
| [Serializer](Serializer.html "interface in akka.serialization") | A Serializer represents a bimap between an object and an array of bytes representing that object. |
- Class Summary 
| Class | Description |
| [AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html "class in akka.serialization") | Scala API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls  and blocks. |
| --- | --- |
| [AsyncSerializerWithStringManifestCS](AsyncSerializerWithStringManifestCS.html "class in akka.serialization") | Java API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls  and blocks. |
| [BaseSerializer$](BaseSerializer$.html "class in akka.serialization") |  |
| [ByteArraySerializer](ByteArraySerializer.html "class in akka.serialization") | This is a special Serializer that Serializes and deserializes byte arrays only,  (just returns the byte array unchanged/uncopied) |
| [DisabledJavaSerializer](DisabledJavaSerializer.html "class in akka.serialization") | This Serializer is used when `akka.actor.java-serialization = off` |
| [DisabledJavaSerializer$](DisabledJavaSerializer$.html "class in akka.serialization") |  |
| [JavaSerializer](JavaSerializer.html "class in akka.serialization") | This Serializer uses standard Java Serialization |
| [JavaSerializer.CurrentSystem](JavaSerializer.CurrentSystem.html "class in akka.serialization") |  |
| [JavaSerializer$](JavaSerializer$.html "class in akka.serialization") |  |
| [JSerializer](JSerializer.html "class in akka.serialization") | Java API for creating a Serializer: make sure to include a constructor which  takes exactly one argument of type [`ExtendedActorSystem`](../actor/ExtendedActorSystem.html "class in akka.actor"), because  that is the preferred constructor which will be invoked when reflectively instantiating  the JSerializer (also possible with empty constructor). |
| [NullSerializer](NullSerializer.html "class in akka.serialization") | This is a special Serializer that Serializes and deserializes nulls only |
| [NullSerializer$](NullSerializer$.html "class in akka.serialization") |  |
| [Serialization](Serialization.html "class in akka.serialization") | Serialization module. |
| [Serialization.Information](Serialization.Information.html "class in akka.serialization") | Serialization information needed for serializing local actor refs,  or if serializer library e.g. |
| [Serialization.Information$](Serialization.Information$.html "class in akka.serialization") |  |
| [Serialization.Settings](Serialization.Settings.html "class in akka.serialization") |  |
| [Serialization$](Serialization$.html "class in akka.serialization") |  |
| [SerializationExtension](SerializationExtension.html "class in akka.serialization") | SerializationExtension is an Akka Extension to interact with the Serialization  that is built into Akka |
| [SerializationExtension$](SerializationExtension$.html "class in akka.serialization") | SerializationExtension is an Akka Extension to interact with the Serialization  that is built into Akka |
| [SerializationSetup](SerializationSetup.html "class in akka.serialization") | Setup for the serialization subsystem, constructor is \*Internal API\*, use factories in [`SerializationSetup`](SerializationSetup.html "class in akka.serialization") |
| [SerializationSetup$](SerializationSetup$.html "class in akka.serialization") |  |
| [SerializerDetails](SerializerDetails.html "class in akka.serialization") | Constructor is internal API: Use the factories [`SerializerDetails.create(java.lang.String, akka.serialization.Serializer, java.util.List<java.lang.Class<?>>)`](SerializerDetails.html#create(java.lang.String,akka.serialization.Serializer,java.util.List)) or [`SerializerDetails.apply(java.lang.String, akka.serialization.Serializer, scala.collection.immutable.Seq<java.lang.Class<?>>)`](SerializerDetails.html#apply(java.lang.String,akka.serialization.Serializer,scala.collection.immutable.Seq))  to construct |
| [SerializerDetails$](SerializerDetails$.html "class in akka.serialization") |  |
| [Serializers](Serializers.html "class in akka.serialization") |  |
| [Serializers$](Serializers$.html "class in akka.serialization") |  |
| [SerializerWithStringManifest](SerializerWithStringManifest.html "class in akka.serialization") | A Serializer represents a bimap between an object and an array of bytes representing that object. |
- Exception Summary 
| Exception | Description |
| [DisabledJavaSerializer.JavaSerializationException](DisabledJavaSerializer.JavaSerializationException.html "class in akka.serialization") |  |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/AsyncSerializer.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/AsyncSerializerWithStringManifest.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/AsyncSerializerWithStringManifestCS.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/BaseSerializer$.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/BaseSerializer.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/ByteArraySerializer.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/ByteBufferSerializer.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/DisabledJavaSerializer$.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/DisabledJavaSerializer.JavaSerializationException.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/DisabledJavaSerializer.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/JSerializer.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/JavaSerializer$.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/JavaSerializer.CurrentSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/JavaSerializer.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/NullSerializer$.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/NullSerializer.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/Serialization$.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/Serialization.Information$.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/Serialization.Information.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/Serialization.Settings.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/Serialization.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/SerializationExtension$.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/SerializationExtension.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/SerializationSetup$.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/SerializationSetup.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/SerializerDetails$.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/SerializerDetails.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/Serializers$.html
- https://doc.akka.io/japi/akka/2.10/akka/serialization/Serializers.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/serialization/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/serialization/package-summary.html)*