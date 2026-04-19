---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifest.html
title: AsyncSerializerWithStringManifest
---

# AsyncSerializerWithStringManifest

## Content

Package [akka.serialization](package-summary.html)
## Class AsyncSerializerWithStringManifest

- java.lang.Object
- - [akka.serialization.SerializerWithStringManifest](SerializerWithStringManifest.html "class in akka.serialization")
	- - akka.serialization.AsyncSerializerWithStringManifest

- All Implemented Interfaces:
`[AsyncSerializer](AsyncSerializer.html "interface in akka.serialization")`, `[Serializer](Serializer.html "interface in akka.serialization")`

Direct Known Subclasses:
`[AsyncSerializerWithStringManifestCS](AsyncSerializerWithStringManifestCS.html "class in akka.serialization")`

---

```
public abstract class AsyncSerializerWithStringManifest
extends [SerializerWithStringManifest](SerializerWithStringManifest.html "class in akka.serialization")
implements [AsyncSerializer](AsyncSerializer.html "interface in akka.serialization")
```

Scala API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls
 and blocks.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AsyncSerializerWithStringManifest](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,java.lang.String))​(byte[] bytes,  java.lang.String manifest)` | Produces an object from an array of bytes, with an optional type\-hint. |
	| `byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object o)` | Serializes the given object into an Array of Byte. |
	
	
		- ### Methods inherited from class akka.serialization.[SerializerWithStringManifest](SerializerWithStringManifest.html "class in akka.serialization")
		
		
		`[fromBinary](SerializerWithStringManifest.html#fromBinary(byte%5B%5D,scala.Option)), [identifier](SerializerWithStringManifest.html#identifier()), [includeManifest](SerializerWithStringManifest.html#includeManifest()), [manifest](SerializerWithStringManifest.html#manifest(java.lang.Object))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[AsyncSerializer](AsyncSerializer.html "interface in akka.serialization")
		
		
		`[fromBinaryAsync](AsyncSerializer.html#fromBinaryAsync(byte%5B%5D,java.lang.String)), [toBinaryAsync](AsyncSerializer.html#toBinaryAsync(java.lang.Object))`
		- ### Methods inherited from interface akka.serialization.[Serializer](Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](Serializer.html#fromBinary(byte%5B%5D,java.lang.Class))`

- - ### Constructor Detail
	
	
	
		- #### AsyncSerializerWithStringManifest
		
		
		
		```
		public AsyncSerializerWithStringManifest​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### fromBinary
		
		
		
		```
		public final java.lang.Object fromBinary​(byte[] bytes,
		                                         java.lang.String manifest)
		```
		
		Description copied from class: `[SerializerWithStringManifest](SerializerWithStringManifest.html#fromBinary(byte%5B%5D,java.lang.String))`
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
		`[fromBinary](SerializerWithStringManifest.html#fromBinary(byte%5B%5D,java.lang.String))` in class `[SerializerWithStringManifest](SerializerWithStringManifest.html "class in akka.serialization")`
		- #### toBinary
		
		
		
		```
		public final byte[] toBinary​(java.lang.Object o)
		```
		
		Description copied from class: `[SerializerWithStringManifest](SerializerWithStringManifest.html#toBinary(java.lang.Object))`
		Serializes the given object into an Array of Byte.
		 
		 Note that the array must not be mutated by the serializer after it has been returned.
		
		
		
		Specified by:
		`[toBinary](Serializer.html#toBinary(java.lang.Object))` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		Specified by:
		`[toBinary](SerializerWithStringManifest.html#toBinary(java.lang.Object))` in class `[SerializerWithStringManifest](SerializerWithStringManifest.html "class in akka.serialization")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/AsyncSerializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifestCS.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifest.html](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifest.html)*