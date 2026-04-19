---
description: Akka 2.10.17 - akka.remote.serialization
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:11:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/serialization/index.html
title: Akka 2.10.17 - akka.remote.serialization
---

# Akka 2.10.17 - akka.remote.serialization

> **Summary:** Akka 2.10.17 - akka.remote.serialization

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/artery/index.html "Permalink")  package [artery](../artery/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/serialization/index.html "Permalink")  package serializationDefinition Classes[remote](../index.html)
- [ByteStringSerializer](ByteStringSerializer.html)
- [IntSerializer](IntSerializer.html)
- [LongSerializer](LongSerializer.html)
- [MessageContainerSerializer](MessageContainerSerializer.html)
- [MiscMessageSerializer](MiscMessageSerializer.html)
- [ProtobufSerializer](ProtobufSerializer.html "This Serializer serializes akka.protobufv3.internal.GeneratedMessageV3 and com.google.protobuf.Message It is using reflection to find the parseFrom and toByteArray methods to avoid dependency to com.google.protobuf.")
- [StringSerializer](StringSerializer.html)
- [SystemMessageSerializer](SystemMessageSerializer.html)
- [ThrowableNotSerializableException](ThrowableNotSerializableException.html "Use as replacement for an original exception when it can't be serialized or deserialized.")
- [**](../../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](../testconductor/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[remote](../index.html)
p[akka](../../index.html).[remote](../index.html)

# serialization[**](../../../akka/remote/serialization/index.html "Permalink")

#### package serialization

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/remote/serialization/MessageContainerSerializer.html "Permalink")  class [MessageContainerSerializer](MessageContainerSerializer.html) extends [BaseSerializer](../../serialization/BaseSerializer.html)
2. [**](../../../akka/remote/serialization/MiscMessageSerializer.html "Permalink")  class [MiscMessageSerializer](MiscMessageSerializer.html) extends [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html) with [BaseSerializer](../../serialization/BaseSerializer.html)
3. [**](../../../akka/remote/serialization/ProtobufSerializer.html "Permalink")  class [ProtobufSerializer](ProtobufSerializer.html "This Serializer serializes akka.protobufv3.internal.GeneratedMessageV3 and com.google.protobuf.Message It is using reflection to find the parseFrom and toByteArray methods to avoid dependency to com.google.protobuf.") extends [BaseSerializer](../../serialization/BaseSerializer.html)This Serializer serializes `akka.protobufv3.internal.GeneratedMessageV3` and `com.google.protobuf.Message`
It is using reflection to find the `parseFrom` and `toByteArray` methods to avoid
dependency to `com.google.protobuf`.
4. [**](../../../akka/remote/serialization/SystemMessageSerializer.html "Permalink")  class [SystemMessageSerializer](SystemMessageSerializer.html) extends [BaseSerializer](../../serialization/BaseSerializer.html)
5. [**](../../../akka/remote/serialization/ThrowableNotSerializableException.html "Permalink") final  class [ThrowableNotSerializableException](ThrowableNotSerializableException.html "Use as replacement for an original exception when it can't be serialized or deserialized.") extends IllegalArgumentExceptionUse as replacement for an original exception when it can't be serialized or deserialized.
### Deprecated Type Members

1. [**](../../../akka/remote/serialization/ByteStringSerializer.html "Permalink")  class [ByteStringSerializer](ByteStringSerializer.html) extends [BaseSerializer](../../serialization/BaseSerializer.html) with [ByteBufferSerializer](../../serialization/ByteBufferSerializer.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Moved to akka.serialization.ByteStringSerializer in akka\-actor
2. [**](../../../akka/remote/serialization/IntSerializer.html "Permalink")  class [IntSerializer](IntSerializer.html) extends [BaseSerializer](../../serialization/BaseSerializer.html) with [ByteBufferSerializer](../../serialization/ByteBufferSerializer.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Moved to akka.serialization.IntSerializer in akka\-actor
3. [**](../../../akka/remote/serialization/LongSerializer.html "Permalink")  class [LongSerializer](LongSerializer.html) extends [BaseSerializer](../../serialization/BaseSerializer.html) with [ByteBufferSerializer](../../serialization/ByteBufferSerializer.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Moved to akka.serialization.LongSerializer in akka\-actor
4. [**](../../../akka/remote/serialization/StringSerializer.html "Permalink")  class [StringSerializer](StringSerializer.html) extends [BaseSerializer](../../serialization/BaseSerializer.html) with [ByteBufferSerializer](../../serialization/ByteBufferSerializer.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Moved to akka.serialization.StringSerializer in akka\-actor
### Value Members

1. [**](../../../akka/remote/serialization/ProtobufSerializer$.html "Permalink")  object [ProtobufSerializer](ProtobufSerializer$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/routing/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/ByteStringSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/IntSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/LongSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/MessageContainerSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/MiscMessageSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/ProtobufSerializer$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/ProtobufSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/StringSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/SystemMessageSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/ThrowableNotSerializableException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/ByteBufferSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/index.html)*