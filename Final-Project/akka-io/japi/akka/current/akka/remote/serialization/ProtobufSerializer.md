---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/serialization/ProtobufSerializer.html
title: ProtobufSerializer
---

# ProtobufSerializer

## Content

Package [akka.remote.serialization](package-summary.html)
## Class ProtobufSerializer

- java.lang.Object
- - akka.remote.serialization.ProtobufSerializer

- All Implemented Interfaces:
`[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`, `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`

---

```
public class ProtobufSerializer
extends java.lang.Object
implements [BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")
```

This Serializer serializes `akka.protobufv3.internal.GeneratedMessageV3` and `com.google.protobuf.Message`
 It is using reflection to find the `parseFrom` and `toByteArray` methods to avoid
 dependency to `com.google.protobuf`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProtobufSerializer](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$serialization$BaseSerializer$_setter_$identifier_$eq](#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))​(int x$1)` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `static [ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[deserializeActorRef](#deserializeActorRef(akka.actor.ExtendedActorSystem,akka.remote.WireFormats.ActorRefData))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,  [WireFormats.ActorRefData](../WireFormats.ActorRefData.html "class in akka.remote") refProtocol)` | Helper to materialize (lookup) an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor")  from Akka's protobuf representation in the supplied  [`ActorSystem`](../../actor/ActorSystem.html "class in akka.actor"). |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,scala.Option))​(byte[] bytes,  scala.Option<java.lang.Class<?>> manifest)` | Produces an object from an array of bytes, with an optional type\-hint;  the class should be loaded using ActorSystem.dynamicAccess. |
	| `int` | `[identifier](#identifier())()` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `boolean` | `[includeManifest](#includeManifest())()` | Returns whether this serializer needs a manifest in the fromBinary method |
	| `static [WireFormats.ActorRefData](../WireFormats.ActorRefData.html "class in akka.remote")` | `[serializeActorRef](#serializeActorRef(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` | Helper to serialize an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor") to Akka's  protobuf representation. |
	| `[ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` | Actor system which is required by most serializer implementations. |
	| `byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object obj)` | Serializes the given object into an Array of Byte. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")
		
		
		`[identifierFromConfig](../../serialization/BaseSerializer.html#identifierFromConfig()), [SerializationIdentifiers](../../serialization/BaseSerializer.html#SerializationIdentifiers())`
		- ### Methods inherited from interface akka.serialization.[Serializer](../../serialization/Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](../../serialization/Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](../../serialization/Serializer.html#fromBinary(byte%5B%5D,java.lang.Class))`

- - ### Constructor Detail
	
	
	
		- #### ProtobufSerializer
		
		
		
		```
		public ProtobufSerializer​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### serializeActorRef
		
		
		
		```
		public static [WireFormats.ActorRefData](../WireFormats.ActorRefData.html "class in akka.remote") serializeActorRef​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		Helper to serialize an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor") to Akka's
		 protobuf representation.
		- #### deserializeActorRef
		
		
		
		```
		public static [ActorRef](../../actor/ActorRef.html "class in akka.actor") deserializeActorRef​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                           [WireFormats.ActorRefData](../WireFormats.ActorRefData.html "class in akka.remote") refProtocol)
		```
		
		Helper to materialize (lookup) an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor")
		 from Akka's protobuf representation in the supplied
		 [`ActorSystem`](../../actor/ActorSystem.html "class in akka.actor").
		- #### identifier
		
		
		
		```
		public int identifier()
		```
		
		Description copied from interface: `[BaseSerializer](../../serialization/BaseSerializer.html#identifier())`
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[identifier](../../serialization/BaseSerializer.html#identifier())` in interface `[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`
		Specified by:
		`[identifier](../../serialization/Serializer.html#identifier())` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`
		- #### akka$serialization$BaseSerializer$\_setter\_$identifier\_$eq
		
		
		
		```
		protected void akka$serialization$BaseSerializer$_setter_$identifier_$eq​(int x$1)
		```
		
		Description copied from interface: `[BaseSerializer](../../serialization/BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))`
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[akka$serialization$BaseSerializer$_setter_$identifier_$eq](../../serialization/BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))` in interface `[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		
		Description copied from interface: `[BaseSerializer](../../serialization/BaseSerializer.html#system())`
		Actor system which is required by most serializer implementations.
		
		Specified by:
		`[system](../../serialization/BaseSerializer.html#system())` in interface `[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`
		- #### includeManifest
		
		
		
		```
		public boolean includeManifest()
		```
		
		Description copied from interface: `[Serializer](../../serialization/Serializer.html#includeManifest())`
		Returns whether this serializer needs a manifest in the fromBinary method
		
		Specified by:
		`[includeManifest](../../serialization/Serializer.html#includeManifest())` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`
		- #### fromBinary
		
		
		
		```
		public java.lang.Object fromBinary​(byte[] bytes,
		                                   scala.Option<java.lang.Class<?>> manifest)
		```
		
		Description copied from interface: `[Serializer](../../serialization/Serializer.html#fromBinary(byte%5B%5D,scala.Option))`
		Produces an object from an array of bytes, with an optional type\-hint;
		 the class should be loaded using ActorSystem.dynamicAccess.
		
		Specified by:
		`[fromBinary](../../serialization/Serializer.html#fromBinary(byte%5B%5D,scala.Option))` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`
		- #### toBinary
		
		
		
		```
		public byte[] toBinary​(java.lang.Object obj)
		```
		
		Description copied from interface: `[Serializer](../../serialization/Serializer.html#toBinary(java.lang.Object))`
		Serializes the given object into an Array of Byte.
		 
		 Note that the array must not be mutated by the serializer after it has been returned.
		
		
		
		Specified by:
		`[toBinary](../../serialization/Serializer.html#toBinary(java.lang.Object))` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.ActorRefData.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/serialization/ProtobufSerializer.html](https://doc.akka.io/japi/akka/current/akka/remote/serialization/ProtobufSerializer.html)*