---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/SerializerWithStringManifest.html
title: SerializerWithStringManifest
---

# SerializerWithStringManifest

## Content

Package [akka.serialization](package-summary.html)
## Class SerializerWithStringManifest

- java.lang.Object
- - akka.serialization.SerializerWithStringManifest

- All Implemented Interfaces:
`[Serializer](Serializer.html "interface in akka.serialization")`

Direct Known Subclasses:
`[AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html "class in akka.serialization")`, `[ClusterMessageSerializer](../cluster/protobuf/ClusterMessageSerializer.html "class in akka.cluster.protobuf")`, `[MessageSerializer](../cluster/metrics/protobuf/MessageSerializer.html "class in akka.cluster.metrics.protobuf")`, `[MiscMessageSerializer](../remote/serialization/MiscMessageSerializer.html "class in akka.remote.serialization")`, `[PayloadSerializer](../persistence/serialization/PayloadSerializer.html "class in akka.persistence.serialization")`, `[ReplicatedDataSerializer](../cluster/ddata/protobuf/ReplicatedDataSerializer.html "class in akka.cluster.ddata.protobuf")`, `[ReplicatorMessageSerializer](../cluster/ddata/protobuf/ReplicatorMessageSerializer.html "class in akka.cluster.ddata.protobuf")`, `[ServiceKeySerializer](../actor/typed/internal/receptionist/ServiceKeySerializer.html "class in akka.actor.typed.internal.receptionist")`, `[TestSerializer](../persistence/TestSerializer.html "class in akka.persistence")`

---

```
public abstract class SerializerWithStringManifest
extends java.lang.Object
implements [Serializer](Serializer.html "interface in akka.serialization")
```

A Serializer represents a bimap between an object and an array of bytes representing that object.
 
 For serialization of data that need to evolve over time the `SerializerWithStringManifest` is recommended instead
 of [`Serializer`](Serializer.html "interface in akka.serialization") because the manifest (type hint) is a `String` instead of a `Class`. That means
 that the class can be moved/removed and the serializer can still deserialize old data by matching
 on the `String`. This is especially useful for Akka Persistence.
 

 The manifest string can also encode a version number that can be used in `fromBinary` to
 deserialize in different ways to migrate old data to new domain objects.
 

 If the data was originally serialized with [`Serializer`](Serializer.html "interface in akka.serialization") and in a later version of the
 system you change to `SerializerWithStringManifest` the manifest string will be the full class name if
 you used `includeManifest=true`, otherwise it will be the empty string.
 

 Serializers are loaded using reflection during [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor")
 start\-up, where constructors are tried in order:
 

	- taking exactly one argument of type [`ExtendedActorSystem`](../actor/ExtendedActorSystem.html "class in akka.actor");
	 this should be the preferred one because all reflective loading of classes
	 during deserialization should use ExtendedActorSystem.dynamicAccess (see
	 [`DynamicAccess`](../actor/DynamicAccess.html "class in akka.actor"))
	- taking exactly one argument of type [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor")
	- taking exactly one argument of type [`ClassicActorSystemProvider`](../actor/ClassicActorSystemProvider.html "interface in akka.actor")
	- without arguments
	- taking two arguments of type [`ExtendedActorSystem`](../actor/ExtendedActorSystem.html "class in akka.actor") and `String` where the second `String` argument is the binding name
	- taking two arguments of type [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") and `String` where the second `String` argument is the binding name
	- taking two arguments of type [`ClassicActorSystemProvider`](../actor/ClassicActorSystemProvider.html "interface in akka.actor") and `String` where the second `String` argument is the binding name

**Be sure to always use the** [`DynamicAccess`](../actor/DynamicAccess.html "class in akka.actor") **for loading classes!** This is necessary to
 avoid strange match errors and inequalities which arise from different class loaders loading
 the same class.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializerWithStringManifest](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,java.lang.String))​(byte[] bytes,  java.lang.String manifest)` | Produces an object from an array of bytes, with an optional type\-hint. |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,scala.Option))​(byte[] bytes,  scala.Option<java.lang.Class<?>> manifest)` | Produces an object from an array of bytes, with an optional type\-hint;  the class should be loaded using ActorSystem.dynamicAccess. |
	| `abstract int` | `[identifier](#identifier())()` | Completely unique value to identify this implementation of Serializer, used to optimize network traffic. |
	| `boolean` | `[includeManifest](#includeManifest())()` | Returns whether this serializer needs a manifest in the fromBinary method |
	| `abstract java.lang.String` | `[manifest](#manifest(java.lang.Object))​(java.lang.Object o)` | Return the manifest (type hint) that will be provided in the fromBinary method. |
	| `abstract byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object o)` | Serializes the given object into an Array of Byte. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[Serializer](Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](Serializer.html#fromBinary(byte%5B%5D,java.lang.Class))`

- - ### Constructor Detail
	
	
	
		- #### SerializerWithStringManifest
		
		
		
		```
		public SerializerWithStringManifest()
		```

	- ### Method Detail
	
	
	
		- #### fromBinary
		
		
		
		```
		public abstract java.lang.Object fromBinary​(byte[] bytes,
		                                            java.lang.String manifest)
		                                     throws java.io.NotSerializableException
		```
		
		Produces an object from an array of bytes, with an optional type\-hint.
		 
		 It's recommended to throw `java.io.NotSerializableException` in `fromBinary`
		 if the manifest is unknown. This makes it possible to introduce new message
		 types and send them to nodes that don't know about them. This is typically
		 needed when performing rolling upgrades, i.e. running a cluster with mixed
		 versions for while. `NotSerializableException` is treated as a transient
		 problem in the TCP based remoting layer. The problem will be logged
		 and message is dropped. Other exceptions will tear down the TCP connection
		 because it can be an indication of corrupt bytes from the underlying transport.
		
		
		
		Throws:
		`java.io.NotSerializableException`
		- #### fromBinary
		
		
		
		```
		public final java.lang.Object fromBinary​(byte[] bytes,
		                                         scala.Option<java.lang.Class<?>> manifest)
		```
		
		Description copied from interface: `[Serializer](Serializer.html#fromBinary(byte%5B%5D,scala.Option))`
		Produces an object from an array of bytes, with an optional type\-hint;
		 the class should be loaded using ActorSystem.dynamicAccess.
		
		Specified by:
		`[fromBinary](Serializer.html#fromBinary(byte%5B%5D,scala.Option))` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		- #### identifier
		
		
		
		```
		public abstract int identifier()
		```
		
		Completely unique value to identify this implementation of Serializer, used to optimize network traffic.
		 Values from 0 to 40 are reserved for Akka internal usage.
		
		Specified by:
		`[identifier](Serializer.html#identifier())` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		- #### includeManifest
		
		
		
		```
		public final boolean includeManifest()
		```
		
		Description copied from interface: `[Serializer](Serializer.html#includeManifest())`
		Returns whether this serializer needs a manifest in the fromBinary method
		
		Specified by:
		`[includeManifest](Serializer.html#includeManifest())` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		- #### manifest
		
		
		
		```
		public abstract java.lang.String manifest​(java.lang.Object o)
		```
		
		Return the manifest (type hint) that will be provided in the fromBinary method.
		 Use `""` if manifest is not needed.
		- #### toBinary
		
		
		
		```
		public abstract byte[] toBinary​(java.lang.Object o)
		```
		
		Serializes the given object into an Array of Byte.
		 
		 Note that the array must not be mutated by the serializer after it has been returned.
		
		
		
		Specified by:
		`[toBinary](Serializer.html#toBinary(java.lang.Object))` in interface `[Serializer](Serializer.html "interface in akka.serialization")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ServiceKeySerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/MessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/ClusterMessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/TestSerializer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/PayloadSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/MiscMessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/AsyncSerializerWithStringManifest.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/SerializerWithStringManifest.html](https://doc.akka.io/japi/akka/current/akka/serialization/SerializerWithStringManifest.html)*