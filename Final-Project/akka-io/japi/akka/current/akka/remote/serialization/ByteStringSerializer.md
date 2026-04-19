---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/serialization/ByteStringSerializer.html
title: ByteStringSerializer
---

# ByteStringSerializer

## Content

Package [akka.remote.serialization](package-summary.html)
## Class ByteStringSerializer

- java.lang.Object
- - akka.remote.serialization.ByteStringSerializer

- All Implemented Interfaces:
`[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`, `[ByteBufferSerializer](../../serialization/ByteBufferSerializer.html "interface in akka.serialization")`, `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`

---

```
public class ByteStringSerializer
extends java.lang.Object
implements [BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization"), [ByteBufferSerializer](../../serialization/ByteBufferSerializer.html "interface in akka.serialization")
```

Deprecated.
Moved to akka.serialization.ByteStringSerializer in akka\-actor. Since 2\.6\.0\.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteStringSerializer](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$serialization$BaseSerializer$_setter_$identifier_$eq](#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))​(int x$1)` | Deprecated. Globally unique serialization identifier configured in the `reference.conf`. |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,scala.Option))​(byte[] bytes,  scala.Option<java.lang.Class<?>> manifest)` | Deprecated. Produces an object from an array of bytes, with an optional type\-hint;  the class should be loaded using ActorSystem.dynamicAccess. |
	| `java.lang.Object` | `[fromBinary](#fromBinary(java.nio.ByteBuffer,java.lang.String))​(java.nio.ByteBuffer buf,  java.lang.String manifest)` | Deprecated. Produces an object from a `ByteBuffer`, with an optional type\-hint;  the class should be loaded using ActorSystem.dynamicAccess. |
	| `int` | `[identifier](#identifier())()` | Deprecated. Globally unique serialization identifier configured in the `reference.conf`. |
	| `boolean` | `[includeManifest](#includeManifest())()` | Deprecated. Returns whether this serializer needs a manifest in the fromBinary method |
	| `[ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` | Deprecated. Actor system which is required by most serializer implementations. |
	| `byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object o)` | Deprecated. Serializes the given object into an Array of Byte. |
	| `void` | `[toBinary](#toBinary(java.lang.Object,java.nio.ByteBuffer))​(java.lang.Object o,  java.nio.ByteBuffer buf)` | Deprecated. Serializes the given object into the `ByteBuffer`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")
		
		
		`[identifierFromConfig](../../serialization/BaseSerializer.html#identifierFromConfig()), [SerializationIdentifiers](../../serialization/BaseSerializer.html#SerializationIdentifiers())`
		- ### Methods inherited from interface akka.serialization.[Serializer](../../serialization/Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](../../serialization/Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](../../serialization/Serializer.html#fromBinary(byte%5B%5D,java.lang.Class))`

- - ### Constructor Detail
	
	
	
		- #### ByteStringSerializer
		
		
		
		```
		public ByteStringSerializer​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### akka$serialization$BaseSerializer$\_setter\_$identifier\_$eq
		
		
		
		```
		protected void akka$serialization$BaseSerializer$_setter_$identifier_$eq​(int x$1)
		```
		
		Deprecated.
		Description copied from interface: `[BaseSerializer](../../serialization/BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))`
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[akka$serialization$BaseSerializer$_setter_$identifier_$eq](../../serialization/BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))` in interface `[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`
		- #### fromBinary
		
		
		
		```
		public java.lang.Object fromBinary​(java.nio.ByteBuffer buf,
		                                   java.lang.String manifest)
		```
		
		Deprecated.
		Description copied from interface: `[ByteBufferSerializer](../../serialization/ByteBufferSerializer.html#fromBinary(java.nio.ByteBuffer,java.lang.String))`
		Produces an object from a `ByteBuffer`, with an optional type\-hint;
		 the class should be loaded using ActorSystem.dynamicAccess.
		
		Specified by:
		`[fromBinary](../../serialization/ByteBufferSerializer.html#fromBinary(java.nio.ByteBuffer,java.lang.String))` in interface `[ByteBufferSerializer](../../serialization/ByteBufferSerializer.html "interface in akka.serialization")`
		- #### fromBinary
		
		
		
		```
		public java.lang.Object fromBinary​(byte[] bytes,
		                                   scala.Option<java.lang.Class<?>> manifest)
		```
		
		Deprecated.
		Description copied from interface: `[Serializer](../../serialization/Serializer.html#fromBinary(byte%5B%5D,scala.Option))`
		Produces an object from an array of bytes, with an optional type\-hint;
		 the class should be loaded using ActorSystem.dynamicAccess.
		
		Specified by:
		`[fromBinary](../../serialization/Serializer.html#fromBinary(byte%5B%5D,scala.Option))` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`
		- #### identifier
		
		
		
		```
		public int identifier()
		```
		
		Deprecated.
		Description copied from interface: `[BaseSerializer](../../serialization/BaseSerializer.html#identifier())`
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[identifier](../../serialization/BaseSerializer.html#identifier())` in interface `[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`
		Specified by:
		`[identifier](../../serialization/Serializer.html#identifier())` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`
		- #### includeManifest
		
		
		
		```
		public boolean includeManifest()
		```
		
		Deprecated.
		Description copied from interface: `[Serializer](../../serialization/Serializer.html#includeManifest())`
		Returns whether this serializer needs a manifest in the fromBinary method
		
		Specified by:
		`[includeManifest](../../serialization/Serializer.html#includeManifest())` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		
		Deprecated.
		Description copied from interface: `[BaseSerializer](../../serialization/BaseSerializer.html#system())`
		Actor system which is required by most serializer implementations.
		
		Specified by:
		`[system](../../serialization/BaseSerializer.html#system())` in interface `[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`
		- #### toBinary
		
		
		
		```
		public void toBinary​(java.lang.Object o,
		                     java.nio.ByteBuffer buf)
		```
		
		Deprecated.
		Description copied from interface: `[ByteBufferSerializer](../../serialization/ByteBufferSerializer.html#toBinary(java.lang.Object,java.nio.ByteBuffer))`
		Serializes the given object into the `ByteBuffer`.
		
		Specified by:
		`[toBinary](../../serialization/ByteBufferSerializer.html#toBinary(java.lang.Object,java.nio.ByteBuffer))` in interface `[ByteBufferSerializer](../../serialization/ByteBufferSerializer.html "interface in akka.serialization")`
		- #### toBinary
		
		
		
		```
		public byte[] toBinary​(java.lang.Object o)
		```
		
		Deprecated.
		Description copied from interface: `[Serializer](../../serialization/Serializer.html#toBinary(java.lang.Object))`
		Serializes the given object into an Array of Byte.
		 
		 Note that the array must not be mutated by the serializer after it has been returned.
		
		
		
		Specified by:
		`[toBinary](../../serialization/Serializer.html#toBinary(java.lang.Object))` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/ByteBufferSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/serialization/ByteStringSerializer.html](https://doc.akka.io/japi/akka/current/akka/remote/serialization/ByteStringSerializer.html)*