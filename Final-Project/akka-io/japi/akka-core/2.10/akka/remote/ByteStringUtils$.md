---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ByteStringUtils$.html
title: ByteStringUtils$
---

# ByteStringUtils$

## Content

Package [akka.remote](package-summary.html)
## Class ByteStringUtils$

- java.lang.Object
- - akka.remote.ByteStringUtils$

- ---

```
public class ByteStringUtils$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ByteStringUtils$](ByteStringUtils$.html "class in akka.remote")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteStringUtils$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.protobufv3.internal.ByteString` | `[toProtoByteStringUnsafe](#toProtoByteStringUnsafe(byte%5B%5D))​(byte[] bytes)` |  |
	| `akka.protobufv3.internal.ByteString` | `[toProtoByteStringUnsafe](#toProtoByteStringUnsafe(akka.util.ByteString))​([ByteString](../util/ByteString.html "class in akka.util") bytes)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ByteStringUtils$](ByteStringUtils$.html "class in akka.remote") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ByteStringUtils$
		
		
		
		```
		public ByteStringUtils$()
		```

	- ### Method Detail
	
	
	
		- #### toProtoByteStringUnsafe
		
		
		
		```
		public akka.protobufv3.internal.ByteString toProtoByteStringUnsafe​([ByteString](../util/ByteString.html "class in akka.util") bytes)
		```
		- #### toProtoByteStringUnsafe
		
		
		
		```
		public akka.protobufv3.internal.ByteString toProtoByteStringUnsafe​(byte[] bytes)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ByteStringUtils$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ByteStringUtils$.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ByteStringUtils$.html)*