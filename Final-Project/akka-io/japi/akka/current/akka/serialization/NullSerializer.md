---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/NullSerializer.html
title: NullSerializer
---

# NullSerializer

## Content

Package [akka.serialization](package-summary.html)
## Class NullSerializer

- java.lang.Object
- - akka.serialization.NullSerializer

- All Implemented Interfaces:
`[Serializer](Serializer.html "interface in akka.serialization")`

Direct Known Subclasses:
`[NullSerializer$](NullSerializer$.html "class in akka.serialization")`

---

```
public class NullSerializer
extends java.lang.Object
implements [Serializer](Serializer.html "interface in akka.serialization")
```

This is a special Serializer that Serializes and deserializes nulls only

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NullSerializer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,scala.Option))​(byte[] bytes,  scala.Option<java.lang.Class<?>> clazz)` | Produces an object from an array of bytes, with an optional type\-hint;  the class should be loaded using ActorSystem.dynamicAccess. |
	| `int` | `[identifier](#identifier())()` | Completely unique value to identify this implementation of Serializer, used to optimize network traffic. |
	| `boolean` | `[includeManifest](#includeManifest())()` | Returns whether this serializer needs a manifest in the fromBinary method |
	| `byte[]` | `[nullAsBytes](#nullAsBytes())()` |  |
	| `byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object o)` | Serializes the given object into an Array of Byte. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[Serializer](Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](Serializer.html#fromBinary(byte%5B%5D,java.lang.Class))`

- - ### Constructor Detail
	
	
	
		- #### NullSerializer
		
		
		
		```
		public NullSerializer()
		```

	- ### Method Detail
	
	
	
		- #### nullAsBytes
		
		
		
		```
		public byte[] nullAsBytes()
		```
		- #### includeManifest
		
		
		
		```
		public boolean includeManifest()
		```
		
		Description copied from interface: `[Serializer](Serializer.html#includeManifest())`
		Returns whether this serializer needs a manifest in the fromBinary method
		
		Specified by:
		`[includeManifest](Serializer.html#includeManifest())` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		- #### identifier
		
		
		
		```
		public int identifier()
		```
		
		Description copied from interface: `[Serializer](Serializer.html#identifier())`
		Completely unique value to identify this implementation of Serializer, used to optimize network traffic.
		 Values from 0 to 40 are reserved for Akka internal usage.
		
		Specified by:
		`[identifier](Serializer.html#identifier())` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
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

- https://doc.akka.io/japi/akka/current/akka/serialization/NullSerializer$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/NullSerializer.html](https://doc.akka.io/japi/akka/current/akka/serialization/NullSerializer.html)*