---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:47:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/package-summary.html
title: akka.remote.serialization
---

# akka.remote.serialization

## Content

# Package akka.remote.serialization

- Class Summary 
| Class | Description |
| [ActorRefResolveThreadLocalCache$](ActorRefResolveThreadLocalCache$.html "class in akka.remote.serialization") | INTERNAL API: Thread local cache per actor system |
| --- | --- |
| [ArteryMessageSerializer$](ArteryMessageSerializer$.html "class in akka.remote.serialization") | INTERNAL API |
| [ByteStringSerializer](ByteStringSerializer.html "class in akka.remote.serialization") | Deprecated. Moved to akka.serialization.ByteStringSerializer in akka\-actor. |
| [IntSerializer](IntSerializer.html "class in akka.remote.serialization") | Deprecated. Moved to akka.serialization.IntSerializer in akka\-actor. |
| [LongSerializer](LongSerializer.html "class in akka.remote.serialization") | Deprecated. Moved to akka.serialization.LongSerializer in akka\-actor. |
| [MessageContainerSerializer](MessageContainerSerializer.html "class in akka.remote.serialization") |  |
| [MiscMessageSerializer](MiscMessageSerializer.html "class in akka.remote.serialization") |  |
| [ProtobufSerializer](ProtobufSerializer.html "class in akka.remote.serialization") | This Serializer serializes `akka.protobufv3.internal.GeneratedMessageV3` and `com.google.protobuf.Message`  It is using reflection to find the `parseFrom` and `toByteArray` methods to avoid  dependency to `com.google.protobuf`. |
| [ProtobufSerializer$](ProtobufSerializer$.html "class in akka.remote.serialization") |  |
| [StringSerializer](StringSerializer.html "class in akka.remote.serialization") | Deprecated. Moved to akka.serialization.StringSerializer in akka\-actor. |
| [SystemMessageSerializer](SystemMessageSerializer.html "class in akka.remote.serialization") |  |
| [WrappedPayloadSupport$](WrappedPayloadSupport$.html "class in akka.remote.serialization") |  |
- Exception Summary 
| Exception | Description |
| [ThrowableNotSerializableException](ThrowableNotSerializableException.html "class in akka.remote.serialization") | Use as replacement for an original exception when it can't be serialized or deserialized. |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/ActorRefResolveThreadLocalCache$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/ArteryMessageSerializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/ByteStringSerializer.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/IntSerializer.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/LongSerializer.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/MessageContainerSerializer.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/MiscMessageSerializer.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/ProtobufSerializer$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/ProtobufSerializer.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/StringSerializer.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/SystemMessageSerializer.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/ThrowableNotSerializableException.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/WrappedPayloadSupport$.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/remote/serialization/package-summary.html)*