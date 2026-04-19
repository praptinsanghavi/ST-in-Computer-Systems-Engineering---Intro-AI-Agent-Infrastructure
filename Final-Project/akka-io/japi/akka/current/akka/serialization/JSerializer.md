---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/JSerializer.html
title: JSerializer
---

# JSerializer

## Content

Package [akka.serialization](package-summary.html)
## Class JSerializer

- java.lang.Object
- - akka.serialization.JSerializer

- All Implemented Interfaces:
`[Serializer](Serializer.html "interface in akka.serialization")`

Direct Known Subclasses:
`[AbstractSerializationSupport](../cluster/ddata/protobuf/AbstractSerializationSupport.html "class in akka.cluster.ddata.protobuf")`

---

```
public abstract class JSerializer
extends java.lang.Object
implements [Serializer](Serializer.html "interface in akka.serialization")
```

Java API for creating a Serializer: make sure to include a constructor which
 takes exactly one argument of type [`ExtendedActorSystem`](../actor/ExtendedActorSystem.html "class in akka.actor"), because
 that is the preferred constructor which will be invoked when reflectively instantiating
 the JSerializer (also possible with empty constructor).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JSerializer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,scala.Option))​(byte[] bytes,  scala.Option<java.lang.Class<?>> manifest)` | Produces an object from an array of bytes, with an optional type\-hint;  the class should be loaded using ActorSystem.dynamicAccess. |
	| `protected abstract java.lang.Object` | `[fromBinaryJava](#fromBinaryJava(byte%5B%5D,java.lang.Class))​(byte[] bytes,  java.lang.Class<?> manifest)` | This method must be implemented, manifest may be null. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[Serializer](Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](Serializer.html#fromBinary(byte%5B%5D,java.lang.Class)), [identifier](Serializer.html#identifier()), [includeManifest](Serializer.html#includeManifest()), [toBinary](Serializer.html#toBinary(java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### JSerializer
		
		
		
		```
		public JSerializer()
		```

	- ### Method Detail
	
	
	
		- #### fromBinary
		
		
		
		```
		public final java.lang.Object fromBinary​(byte[] bytes,
		                                         scala.Option<java.lang.Class<?>> manifest)
		                                  throws java.io.NotSerializableException
		```
		
		Description copied from interface: `[Serializer](Serializer.html#fromBinary(byte%5B%5D,scala.Option))`
		Produces an object from an array of bytes, with an optional type\-hint;
		 the class should be loaded using ActorSystem.dynamicAccess.
		
		Specified by:
		`[fromBinary](Serializer.html#fromBinary(byte%5B%5D,scala.Option))` in interface `[Serializer](Serializer.html "interface in akka.serialization")`
		Throws:
		`java.io.NotSerializableException`
		- #### fromBinaryJava
		
		
		
		```
		protected abstract java.lang.Object fromBinaryJava​(byte[] bytes,
		                                                   java.lang.Class<?> manifest)
		```
		
		This method must be implemented, manifest may be null.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/JSerializer.html](https://doc.akka.io/japi/akka/current/akka/serialization/JSerializer.html)*