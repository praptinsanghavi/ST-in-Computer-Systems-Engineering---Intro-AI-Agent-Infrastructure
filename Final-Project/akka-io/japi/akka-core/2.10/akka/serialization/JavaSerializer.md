---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/serialization/JavaSerializer.html
title: JavaSerializer
---

# JavaSerializer

## Content

Package [akka.serialization](package-summary.html)
## Class JavaSerializer

- java.lang.Object
- - akka.serialization.JavaSerializer

- All Implemented Interfaces:
`[BaseSerializer](BaseSerializer.html "interface in akka.serialization")`, `[Serializer](Serializer.html "interface in akka.serialization")`

---

```
public class JavaSerializer
extends java.lang.Object
implements [BaseSerializer](BaseSerializer.html "interface in akka.serialization")
```

This Serializer uses standard Java Serialization

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[JavaSerializer.CurrentSystem](JavaSerializer.CurrentSystem.html "class in akka.serialization")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JavaSerializer](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$serialization$BaseSerializer$_setter_$identifier_$eq](#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))​(int x$1)` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `static [JavaSerializer.CurrentSystem](JavaSerializer.CurrentSystem.html "class in akka.serialization")` | `[currentSystem](#currentSystem())()` | This holds a reference to the current ActorSystem (the surrounding context)  during serialization and deserialization. |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,scala.Option))​(byte[] bytes,  scala.Option<java.lang.Class<?>> clazz)` | Produces an object from an array of bytes, with an optional type\-hint;  the class should be loaded using ActorSystem.dynamicAccess. |
	| `int` | `[identifier](#identifier())()` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `boolean` | `[includeManifest](#includeManifest())()` | Returns whether this serializer needs a manifest in the fromBinary method |
	| `[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` | Actor system which is required by most serializer implementations. |
	| `byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object o)` | Serializes the given object into an Array of Byte. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[BaseSerializer](BaseSerializer.html "interface in akka.serialization")
		
		
		`[identifierFromConfig](BaseSerializer.html#identifierFromConfig()), [SerializationIdentifiers](BaseSerializer.html#SerializationIdentifiers())`
		- ### Methods inherited from interface akka.serialization.[Serializer](Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](Serializer.html#fromBinary(byte%5B%5D,java.lang.Class))`

- - ### Constructor Detail
	
	
	
		- #### JavaSerializer
		
		
		
		```
		public JavaSerializer​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### currentSystem
		
		
		
		```
		public static [JavaSerializer.CurrentSystem](JavaSerializer.CurrentSystem.html "class in akka.serialization") currentSystem()
		```
		
		This holds a reference to the current ActorSystem (the surrounding context)
		 during serialization and deserialization.
		 
		 If you are using Serializers yourself, outside of SerializationExtension,
		 you'll need to surround the serialization/deserialization with:
		 
		
		
		 JavaSerializer.currentSystem.withValue(system) {
		 ...code...
		 }
		 
		
		
		 or
		 
		
		
		 JavaSerializer.currentSystem.withValue(system, callable)
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
		- #### akka$serialization$BaseSerializer$\_setter\_$identifier\_$eq
		
		
		
		```
		protected void akka$serialization$BaseSerializer$_setter_$identifier_$eq​(int x$1)
		```
		
		Description copied from interface: `[BaseSerializer](BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))`
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[akka$serialization$BaseSerializer$_setter_$identifier_$eq](BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))` in interface `[BaseSerializer](BaseSerializer.html "interface in akka.serialization")`
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		
		Description copied from interface: `[BaseSerializer](BaseSerializer.html#system())`
		Actor system which is required by most serializer implementations.
		
		Specified by:
		`[system](BaseSerializer.html#system())` in interface `[BaseSerializer](BaseSerializer.html "interface in akka.serialization")`
		- #### includeManifest
		
		
		
		```
		public boolean includeManifest()
		```
		
		Description copied from interface: `[Serializer](Serializer.html#includeManifest())`
		Returns whether this serializer needs a manifest in the fromBinary method
		
		Specified by:
		`[includeManifest](Serializer.html#includeManifest())` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		- #### toBinary
		
		
		
		```
		public byte[] toBinary​(java.lang.Object o)
		```
		
		Description copied from interface: `[Serializer](Serializer.html#toBinary(java.lang.Object))`
		Serializes the given object into an Array of Byte.
		 
		 Note that the array must not be mutated by the serializer after it has been returned.
		
		
		
		Specified by:
		`[toBinary](Serializer.html#toBinary(java.lang.Object))` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/BaseSerializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/JavaSerializer.CurrentSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/serialization/JavaSerializer.html](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/JavaSerializer.html)*