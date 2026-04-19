---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SerializedEvent.html
title: SerializedEvent
---

# SerializedEvent

## Content

Package [akka.persistence](package-summary.html)
## Class SerializedEvent

- java.lang.Object
- - akka.persistence.SerializedEvent

- ---

```
public final class SerializedEvent
extends java.lang.Object
```

Some journal implementations may support events of this type by writing the event payload and
 serialization information without having to serialize it.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializedEvent](#%3Cinit%3E(byte%5B%5D,int,java.lang.String))​(byte[] bytes,  int serializerId,  java.lang.String serializerManifest)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `byte[]` | `[bytes](#bytes())()` |  |
	| `int` | `[serializerId](#serializerId())()` |  |
	| `java.lang.String` | `[serializerManifest](#serializerManifest())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SerializedEvent
		
		
		
		```
		public SerializedEvent​(byte[] bytes,
		                       int serializerId,
		                       java.lang.String serializerManifest)
		```

	- ### Method Detail
	
	
	
		- #### bytes
		
		
		
		```
		public byte[] bytes()
		```
		- #### serializerId
		
		
		
		```
		public int serializerId()
		```
		- #### serializerManifest
		
		
		
		```
		public java.lang.String serializerManifest()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SerializedEvent.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SerializedEvent.html)*