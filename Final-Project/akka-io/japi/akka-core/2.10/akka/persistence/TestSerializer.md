---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/TestSerializer.html
title: TestSerializer
---

# TestSerializer

## Content

Package [akka.persistence](package-summary.html)
## Class TestSerializer

- java.lang.Object
- - [akka.serialization.SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html "class in akka.serialization")
	- - akka.persistence.TestSerializer

- All Implemented Interfaces:
`[Serializer](../serialization/Serializer.html "interface in akka.serialization")`

---

```
public class TestSerializer
extends [SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html "class in akka.serialization")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestSerializer](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,java.lang.String))​(byte[] bytes,  java.lang.String manifest)` | Produces an object from an array of bytes, with an optional type\-hint. |
	| `int` | `[identifier](#identifier())()` | Completely unique value to identify this implementation of Serializer, used to optimize network traffic. |
	| `java.lang.String` | `[manifest](#manifest(java.lang.Object))​(java.lang.Object o)` | Return the manifest (type hint) that will be provided in the fromBinary method. |
	| `byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object o)` | Serializes the given object into an Array of Byte. |
	
	
		- ### Methods inherited from class akka.serialization.[SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html "class in akka.serialization")
		
		
		`[fromBinary](../serialization/SerializerWithStringManifest.html#fromBinary(byte%5B%5D,scala.Option)), [includeManifest](../serialization/SerializerWithStringManifest.html#includeManifest())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[Serializer](../serialization/Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](../serialization/Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](../serialization/Serializer.html#fromBinary(byte%5B%5D,java.lang.Class))`

- - ### Constructor Detail
	
	
	
		- #### TestSerializer
		
		
		
		```
		public TestSerializer​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### fromBinary
		
		
		
		```
		public java.lang.Object fromBinary​(byte[] bytes,
		                                   java.lang.String manifest)
		```
		
		Description copied from class: `[SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html#fromBinary(byte%5B%5D,java.lang.String))`
		Produces an object from an array of bytes, with an optional type\-hint.
		 
		 It's recommended to throw `java.io.NotSerializableException` in `fromBinary`
		 if the manifest is unknown. This makes it possible to introduce new message
		 types and send them to nodes that don't know about them. This is typically
		 needed when performing rolling upgrades, i.e. running a cluster with mixed
		 versions for while. `NotSerializableException` is treated as a transient
		 problem in the TCP based remoting layer. The problem will be logged
		 and message is dropped. Other exceptions will tear down the TCP connection
		 because it can be an indication of corrupt bytes from the underlying transport.
		
		
		
		Specified by:
		`[fromBinary](../serialization/SerializerWithStringManifest.html#fromBinary(byte%5B%5D,java.lang.String))` in class `[SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html "class in akka.serialization")`
		- #### identifier
		
		
		
		```
		public int identifier()
		```
		
		Description copied from class: `[SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html#identifier())`
		Completely unique value to identify this implementation of Serializer, used to optimize network traffic.
		 Values from 0 to 40 are reserved for Akka internal usage.
		
		Specified by:
		`[identifier](../serialization/Serializer.html#identifier())` in interface `[Serializer](../serialization/Serializer.html "interface in akka.serialization")`
		Specified by:
		`[identifier](../serialization/SerializerWithStringManifest.html#identifier())` in class `[SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html "class in akka.serialization")`
		- #### manifest
		
		
		
		```
		public java.lang.String manifest​(java.lang.Object o)
		```
		
		Description copied from class: `[SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html#manifest(java.lang.Object))`
		Return the manifest (type hint) that will be provided in the fromBinary method.
		 Use `""` if manifest is not needed.
		
		Specified by:
		`[manifest](../serialization/SerializerWithStringManifest.html#manifest(java.lang.Object))` in class `[SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html "class in akka.serialization")`
		- #### toBinary
		
		
		
		```
		public byte[] toBinary​(java.lang.Object o)
		```
		
		Description copied from class: `[SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html#toBinary(java.lang.Object))`
		Serializes the given object into an Array of Byte.
		 
		 Note that the array must not be mutated by the serializer after it has been returned.
		
		
		
		Specified by:
		`[toBinary](../serialization/Serializer.html#toBinary(java.lang.Object))` in interface `[Serializer](../serialization/Serializer.html "interface in akka.serialization")`
		Specified by:
		`[toBinary](../serialization/SerializerWithStringManifest.html#toBinary(java.lang.Object))` in class `[SerializerWithStringManifest](../serialization/SerializerWithStringManifest.html "class in akka.serialization")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/SerializerWithStringManifest.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/TestSerializer.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/TestSerializer.html)*