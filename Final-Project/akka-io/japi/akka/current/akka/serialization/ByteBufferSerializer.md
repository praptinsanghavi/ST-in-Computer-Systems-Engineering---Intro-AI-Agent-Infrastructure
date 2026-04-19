---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/ByteBufferSerializer.html
title: ByteBufferSerializer
---

# ByteBufferSerializer

## Content

Package [akka.serialization](package-summary.html)
## Interface ByteBufferSerializer

- All Known Implementing Classes:
`[ByteArraySerializer](ByteArraySerializer.html "class in akka.serialization")`, `[ByteStringSerializer](../remote/serialization/ByteStringSerializer.html "class in akka.remote.serialization")`, `[DisabledJavaSerializer](DisabledJavaSerializer.html "class in akka.serialization")`, `[IntSerializer](../remote/serialization/IntSerializer.html "class in akka.remote.serialization")`, `[LongSerializer](../remote/serialization/LongSerializer.html "class in akka.remote.serialization")`, `[StringSerializer](../remote/serialization/StringSerializer.html "class in akka.remote.serialization")`

---

```
public interface ByteBufferSerializer
```

Serializer between an object and a `ByteBuffer` representing that object.
 
 Implementations should typically extend [`SerializerWithStringManifest`](SerializerWithStringManifest.html "class in akka.serialization") and
 in addition to the `ByteBuffer` based `toBinary` and `fromBinary` methods also
 implement the array based `toBinary` and `fromBinary` methods. The array based
 methods will be used when `ByteBuffer` is not used, e.g. in Akka Persistence.
 

 Note that the array based methods can for example be implemented by delegation
 like this:
 

```

   // you need to know the maximum size in bytes of the serialized messages
   val pool = new akka.io.DirectByteBufferPool(defaultBufferSize = 1024 * 1024, maxPoolEntries = 10)

  // Implement this method for compatibility with `SerializerWithStringManifest`.
  override def toBinary(o: AnyRef): Array[Byte] = {
    val buf = pool.acquire()
    try {
      toBinary(o, buf)
      buf.flip()
      val bytes = new Array[Byte](buf.remaining)
      buf.get(bytes)
      bytes
    } finally {
      pool.release(buf)
    }
  }

  // Implement this method for compatibility with `SerializerWithStringManifest`.
  override def fromBinary(bytes: Array[Byte], manifest: String): AnyRef =
    fromBinary(ByteBuffer.wrap(bytes), manifest)

 
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[fromBinary](#fromBinary(java.nio.ByteBuffer,java.lang.String))​(java.nio.ByteBuffer buf,  java.lang.String manifest)` | Produces an object from a `ByteBuffer`, with an optional type\-hint;  the class should be loaded using ActorSystem.dynamicAccess. |
	| `void` | `[toBinary](#toBinary(java.lang.Object,java.nio.ByteBuffer))​(java.lang.Object o,  java.nio.ByteBuffer buf)` | Serializes the given object into the `ByteBuffer`. |

- - ### Method Detail
	
	
	
		- #### fromBinary
		
		
		
		```
		java.lang.Object fromBinary​(java.nio.ByteBuffer buf,
		                            java.lang.String manifest)
		                     throws java.io.NotSerializableException
		```
		
		Produces an object from a `ByteBuffer`, with an optional type\-hint;
		 the class should be loaded using ActorSystem.dynamicAccess.
		
		Throws:
		`java.io.NotSerializableException`
		- #### toBinary
		
		
		
		```
		void toBinary​(java.lang.Object o,
		              java.nio.ByteBuffer buf)
		```
		
		Serializes the given object into the `ByteBuffer`.

## Code Examples

### Example 1: Interface ByteBufferSerializer

```text
// you need to know the maximum size in bytes of the serialized messages
   val pool = new akka.io.DirectByteBufferPool(defaultBufferSize = 1024 * 1024, maxPoolEntries = 10)


  // Implement this method for compatibility with `SerializerWithStringManifest`.
  override def toBinary(o: AnyRef): Array[Byte] = {
    val buf = pool.acquire()
    try {
      toBinary(o, buf)
      buf.flip()
      val bytes = new Array[Byte](buf.remaining)
      buf.get(bytes)
      bytes
    } finally {
      pool.release(buf)
    }
  }

  // Implement this method for compatibility with `SerializerWithStringManifest`.
  override def fromBinary(bytes: Array[Byte], manifest: String): AnyRef =
    fromBinary(ByteBuffer.wrap(bytes), manifest)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/serialization/ByteStringSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/IntSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/LongSerializer.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/StringSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/ByteArraySerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/DisabledJavaSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/ByteBufferSerializer.html](https://doc.akka.io/japi/akka/current/akka/serialization/ByteBufferSerializer.html)*