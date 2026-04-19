---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifestCS.html
title: AsyncSerializerWithStringManifestCS
---

# AsyncSerializerWithStringManifestCS

## Content

Package [akka.serialization](package-summary.html)
## Class AsyncSerializerWithStringManifestCS

- java.lang.Object
- - [akka.serialization.SerializerWithStringManifest](SerializerWithStringManifest.html "class in akka.serialization")
	- - [akka.serialization.AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html "class in akka.serialization")
		- - akka.serialization.AsyncSerializerWithStringManifestCS

- All Implemented Interfaces:
`[AsyncSerializer](AsyncSerializer.html "interface in akka.serialization")`, `[Serializer](Serializer.html "interface in akka.serialization")`

---

```
public abstract class AsyncSerializerWithStringManifestCS
extends [AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html "class in akka.serialization")
```

Java API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls
 and blocks.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AsyncSerializerWithStringManifestCS](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<java.lang.Object>` | `[fromBinaryAsync](#fromBinaryAsync(byte%5B%5D,java.lang.String))​(byte[] bytes,  java.lang.String manifest)` | Delegates to [`fromBinaryAsyncCS(byte[], java.lang.String)`](#fromBinaryAsyncCS(byte%5B%5D,java.lang.String)) |
	| `abstract java.util.concurrent.CompletionStage<java.lang.Object>` | `[fromBinaryAsyncCS](#fromBinaryAsyncCS(byte%5B%5D,java.lang.String))​(byte[] bytes,  java.lang.String manifest)` |  |
	| `scala.concurrent.Future<byte[]>` | `[toBinaryAsync](#toBinaryAsync(java.lang.Object))​(java.lang.Object o)` | Delegates to [`toBinaryAsyncCS(java.lang.Object)`](#toBinaryAsyncCS(java.lang.Object)) |
	| `abstract java.util.concurrent.CompletionStage<byte[]>` | `[toBinaryAsyncCS](#toBinaryAsyncCS(java.lang.Object))​(java.lang.Object o)` |  |
	
	
		- ### Methods inherited from class akka.serialization.[AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html "class in akka.serialization")
		
		
		`[fromBinary](AsyncSerializerWithStringManifest.html#fromBinary(byte%5B%5D,java.lang.String)), [toBinary](AsyncSerializerWithStringManifest.html#toBinary(java.lang.Object))`
		- ### Methods inherited from class akka.serialization.[SerializerWithStringManifest](SerializerWithStringManifest.html "class in akka.serialization")
		
		
		`[fromBinary](SerializerWithStringManifest.html#fromBinary(byte%5B%5D,scala.Option)), [identifier](SerializerWithStringManifest.html#identifier()), [includeManifest](SerializerWithStringManifest.html#includeManifest()), [manifest](SerializerWithStringManifest.html#manifest(java.lang.Object))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[Serializer](Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](Serializer.html#fromBinary(byte%5B%5D,java.lang.Class))`

- - ### Constructor Detail
	
	
	
		- #### AsyncSerializerWithStringManifestCS
		
		
		
		```
		public AsyncSerializerWithStringManifestCS​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### fromBinaryAsync
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> fromBinaryAsync​(byte[] bytes,
		                                                                 java.lang.String manifest)
		```
		
		Delegates to [`fromBinaryAsyncCS(byte[], java.lang.String)`](#fromBinaryAsyncCS(byte%5B%5D,java.lang.String))
		- #### fromBinaryAsyncCS
		
		
		
		```
		public abstract java.util.concurrent.CompletionStage<java.lang.Object> fromBinaryAsyncCS​(byte[] bytes,
		                                                                                         java.lang.String manifest)
		```
		- #### toBinaryAsync
		
		
		
		```
		public final scala.concurrent.Future<byte[]> toBinaryAsync​(java.lang.Object o)
		```
		
		Delegates to [`toBinaryAsyncCS(java.lang.Object)`](#toBinaryAsyncCS(java.lang.Object))
		- #### toBinaryAsyncCS
		
		
		
		```
		public abstract java.util.concurrent.CompletionStage<byte[]> toBinaryAsyncCS​(java.lang.Object o)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/AsyncSerializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifest.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifestCS.html](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifestCS.html)*