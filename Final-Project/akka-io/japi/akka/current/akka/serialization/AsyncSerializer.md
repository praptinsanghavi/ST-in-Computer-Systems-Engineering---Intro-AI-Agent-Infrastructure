---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/AsyncSerializer.html
title: AsyncSerializer
---

# AsyncSerializer

## Content

Package [akka.serialization](package-summary.html)
## Interface AsyncSerializer

- All Known Implementing Classes:
`[AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html "class in akka.serialization")`, `[AsyncSerializerWithStringManifestCS](AsyncSerializerWithStringManifestCS.html "class in akka.serialization")`

---

```
public interface AsyncSerializer
```

Serializer that supports async serialization.
 
 Only used for Akka persistence journals that explicitly support async serializers.
 

 Implementations should typically extend [`AsyncSerializerWithStringManifest`](AsyncSerializerWithStringManifest.html "class in akka.serialization") or
 [`AsyncSerializerWithStringManifestCS`](AsyncSerializerWithStringManifestCS.html "class in akka.serialization") that delegates synchronous calls to their async equivalents.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<java.lang.Object>` | `[fromBinaryAsync](#fromBinaryAsync(byte%5B%5D,java.lang.String))​(byte[] bytes,  java.lang.String manifest)` | Produces an object from an array of bytes, with an optional type\-hint. |
	| `scala.concurrent.Future<byte[]>` | `[toBinaryAsync](#toBinaryAsync(java.lang.Object))​(java.lang.Object o)` | Serializes the given object into an Array of Byte. |

- - ### Method Detail
	
	
	
		- #### fromBinaryAsync
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> fromBinaryAsync​(byte[] bytes,
		                                                          java.lang.String manifest)
		```
		
		Produces an object from an array of bytes, with an optional type\-hint.
		- #### toBinaryAsync
		
		
		
		```
		scala.concurrent.Future<byte[]> toBinaryAsync​(java.lang.Object o)
		```
		
		Serializes the given object into an Array of Byte.
		 
		 Note that the array must not be mutated by the serializer after it has been used to complete the returned `Future`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/AsyncSerializerWithStringManifest.html
- https://doc.akka.io/japi/akka/current/akka/serialization/AsyncSerializerWithStringManifestCS.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/AsyncSerializer.html](https://doc.akka.io/japi/akka/current/akka/serialization/AsyncSerializer.html)*