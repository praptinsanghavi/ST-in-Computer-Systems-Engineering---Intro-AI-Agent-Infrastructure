---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:16:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/DirectByteBufferPool$.html
title: DirectByteBufferPool$
---

# DirectByteBufferPool$

## Content

Package [akka.io](package-summary.html)
## Class DirectByteBufferPool$

- java.lang.Object
- - akka.io.DirectByteBufferPool$

- ---

```
public class DirectByteBufferPool$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DirectByteBufferPool$](DirectByteBufferPool$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DirectByteBufferPool$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[tryCleanDirectByteBuffer](#tryCleanDirectByteBuffer(java.nio.ByteBuffer))​(java.nio.ByteBuffer byteBuffer)` | DirectByteBuffers are garbage collected by using a phantom reference and a  reference queue. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DirectByteBufferPool$](DirectByteBufferPool$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DirectByteBufferPool$
		
		
		
		```
		public DirectByteBufferPool$()
		```

	- ### Method Detail
	
	
	
		- #### tryCleanDirectByteBuffer
		
		
		
		```
		public void tryCleanDirectByteBuffer​(java.nio.ByteBuffer byteBuffer)
		```
		
		DirectByteBuffers are garbage collected by using a phantom reference and a
		 reference queue. Every once a while, the JVM checks the reference queue and
		 cleans the DirectByteBuffers. However, as this doesn't happen
		 immediately after discarding all references to a DirectByteBuffer, it's
		 easy to OutOfMemoryError yourself using DirectByteBuffers. This function
		 explicitly calls the Cleaner method of a DirectByteBuffer.
		 
		 Utilizes reflection to avoid dependency to `sun.misc.Cleaner`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/DirectByteBufferPool$.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/DirectByteBufferPool$.html](https://doc.akka.io/japi/akka/current/akka/io/DirectByteBufferPool$.html)*