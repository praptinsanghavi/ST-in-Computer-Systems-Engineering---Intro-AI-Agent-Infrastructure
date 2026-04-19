---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/ByteArraySerializer.html
title: ByteArraySerializer
---

# ByteArraySerializer

## Content

Package [akka.serialization](package-summary.html)
## Class ByteArraySerializer

- java.lang.Object
- - akka.serialization.ByteArraySerializer

- All Implemented Interfaces:
`[BaseSerializer](BaseSerializer.html "interface in akka.serialization")`, `[ByteBufferSerializer](ByteBufferSerializer.html "interface in akka.serialization")`, `[Serializer](Serializer.html "interface in akka.serialization")`

---

```
public class ByteArraySerializer
extends java.lang.Object
implements [BaseSerializer](BaseSerializer.html "interface in akka.serialization"), [ByteBufferSerializer](ByteBufferSerializer.html "interface in akka.serialization")
```

This is a special Serializer that Serializes and deserializes byte arrays only,
 (just returns the byte array unchanged/uncopied)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteArraySerializer](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$serialization$BaseSerializer$_setter_$identifier_$eq](#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))​(int x$1)` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,scala.Option))​(byte[] bytes,  scala.Option<java.lang.Class<?>> clazz)` | Produces an object from an array of bytes, with an optional type\-hint;  the class should be loaded using ActorSystem.dynamicAccess. |
	| `java.lang.Object` | `[fromBinary](#fromBinary(java.nio.ByteBuffer,java.lang.String))​(java.nio.ByteBuffer buf,  java.lang.String manifest)` | Produces an object from a `ByteBuffer`, with an optional type\-hint;  the class should be loaded using ActorSystem.dynamicAccess. |
	| `int` | `[identifier](#identifier())()` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `boolean` | `[includeManifest](#includeManifest())()` | Returns whether this serializer needs a manifest in the fromBinary method |
	| `[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` | Actor system which is required by most serializer implementations. |
	| `byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object o)` | Serializes the given object into an Array of Byte. |
	| `void` | `[toBinary](#toBinary(java.lang.Object,java.nio.ByteBuffer))​(java.lang.Object o,  java.nio.ByteBuffer buf)` | Serializes the given object into the `ByteBuffer`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[BaseSerializer](BaseSerializer.html "interface in akka.serialization")
		
		
		`[identifierFromConfig](BaseSerializer.html#identifierFromConfig()), [SerializationIdentifiers](BaseSerializer.html#SerializationIdentifiers())`
		- ### Methods inherited from interface akka.serialization.[Serializer](Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](Serializer.html#fromBinary(byte%5B%5D,java.lang.Class))`

- - ### Constructor Detail
	
	
	
		- #### ByteArraySerializer
		
		
		
		```
		public ByteArraySerializer​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### akka$serialization$BaseSerializer$\_setter\_$identifier\_$eq
		
		
		
		```
		protected void akka$serialization$BaseSerializer$_setter_$identifier_$eq​(int x$1)
		```
		
		Description copied from interface: `[BaseSerializer](BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))`
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[akka$serialization$BaseSerializer$_setter_$identifier_$eq](BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))` in interface `[BaseSerializer](BaseSerializer.html "interface in akka.serialization")`
		- #### fromBinary
		
		
		
		```
		public java.lang.Object fromBinary​(byte[] bytes,
		                                   scala.Option<java.lang.Class<?>> clazz)
		                            throws java.io.NotSerializableException
		```
		
		Description copied from interface: `[Serializer](Serializer.html#fromBinary(byte%5B%5D,scala.Option))`
		Produces an object from an array of bytes, with an optional type\-hint;
		 the class should be loaded using ActorSystem.dynamicAccess.
		
		Specified by:
		`[fromBinary](Serializer.html#fromBinary(byte%5B%5D,scala.Option))` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		Throws:
		`java.io.NotSerializableException`
		- #### fromBinary
		
		
		
		```
		public java.lang.Object fromBinary​(java.nio.ByteBuffer buf,
		                                   java.lang.String manifest)
		                            throws java.io.NotSerializableException
		```
		
		Description copied from interface: `[ByteBufferSerializer](ByteBufferSerializer.html#fromBinary(java.nio.ByteBuffer,java.lang.String))`
		Produces an object from a `ByteBuffer`, with an optional type\-hint;
		 the class should be loaded using ActorSystem.dynamicAccess.
		
		Specified by:
		`[fromBinary](ByteBufferSerializer.html#fromBinary(java.nio.ByteBuffer,java.lang.String))` in interface `[ByteBufferSerializer](ByteBufferSerializer.html "interface in akka.serialization")`
		Throws:
		`java.io.NotSerializableException`
		- #### identifier
		
		
		
		```
		public int identifier()
		```
		
		Description copied from interface: `[BaseSerializer](BaseSerializer.html#identifier())`
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[identifier](BaseSerializer.html#identifier())` in interface `[BaseSerializer](BaseSerializer.html "interface in akka.serialization")`
		Specified by:
		`[identifier](Serializer.html#identifier())` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		- #### includeManifest
		
		
		
		```
		public boolean includeManifest()
		```
		
		Description copied from interface: `[Serializer](Serializer.html#includeManifest())`
		Returns whether this serializer needs a manifest in the fromBinary method
		
		Specified by:
		`[includeManifest](Serializer.html#includeManifest())` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		
		Description copied from interface: `[BaseSerializer](BaseSerializer.html#system())`
		Actor system which is required by most serializer implementations.
		
		Specified by:
		`[system](BaseSerializer.html#system())` in interface `[BaseSerializer](BaseSerializer.html "interface in akka.serialization")`
		- #### toBinary
		
		
		
		```
		public byte[] toBinary​(java.lang.Object o)
		```
		
		Description copied from interface: `[Serializer](Serializer.html#toBinary(java.lang.Object))`
		Serializes the given object into an Array of Byte.
		 
		 Note that the array must not be mutated by the serializer after it has been returned.
		
		
		
		Specified by:
		`[toBinary](Serializer.html#toBinary(java.lang.Object))` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		- #### toBinary
		
		
		
		```
		public void toBinary​(java.lang.Object o,
		                     java.nio.ByteBuffer buf)
		```
		
		Description copied from interface: `[ByteBufferSerializer](ByteBufferSerializer.html#toBinary(java.lang.Object,java.nio.ByteBuffer))`
		Serializes the given object into the `ByteBuffer`.
		
		Specified by:
		`[toBinary](ByteBufferSerializer.html#toBinary(java.lang.Object,java.nio.ByteBuffer))` in interface `[ByteBufferSerializer](ByteBufferSerializer.html "interface in akka.serialization")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/ByteBufferSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/ByteArraySerializer.html](https://doc.akka.io/japi/akka/current/akka/serialization/ByteArraySerializer.html)*