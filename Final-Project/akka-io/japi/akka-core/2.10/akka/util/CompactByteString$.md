---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:20:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/util/CompactByteString$.html
title: CompactByteString$
---

# CompactByteString$

## Content

Package [akka.util](package-summary.html)
## Class CompactByteString$

- java.lang.Object
- - akka.util.CompactByteString$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class CompactByteString$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.util.CompactByteString$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CompactByteString$](CompactByteString$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CompactByteString$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(byte%5B%5D))​(byte[] bytes)` | Creates a new CompactByteString by copying a byte array. |
	| `[CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(java.lang.String))​(java.lang.String string)` | Creates a new CompactByteString by encoding a String as UTF\-8\. |
	| `[CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String string,  java.lang.String charset)` | Creates a new CompactByteString by encoding a String with a charset. |
	| `[CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(java.lang.String,java.nio.charset.Charset))​(java.lang.String string,  java.nio.charset.Charset charset)` | Creates a new CompactByteString by encoding a String with a charset. |
	| `[CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(java.nio.ByteBuffer))​(java.nio.ByteBuffer bytes)` | Creates a new CompactByteString by copying bytes from a ByteBuffer. |
	| `[CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> bytes)` | Creates a new CompactByteString by copying bytes. |
	| `<T> [CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(scala.collection.immutable.Seq,scala.math.Integral))​(scala.collection.immutable.Seq<T> bytes,  scala.math.Integral<T> num)` | Creates a new CompactByteString by converting from integral numbers to bytes. |
	| `[CompactByteString](CompactByteString.html "class in akka.util")` | `[apply](#apply(scala.collection.IterableOnce))​(scala.collection.IterableOnce<java.lang.Object> bytes)` | Creates a new CompactByteString by traversing bytes. |
	| `[CompactByteString](CompactByteString.html "class in akka.util")` | `[empty](#empty())()` |  |
	| `[CompactByteString](CompactByteString.html "class in akka.util")` | `[fromArray](#fromArray(byte%5B%5D,int,int))​(byte[] array,  int offset,  int length)` | Creates a new CompactByteString by copying length bytes starting at offset from  an Array. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CompactByteString$](CompactByteString$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CompactByteString$
		
		
		
		```
		public CompactByteString$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [CompactByteString](CompactByteString.html "class in akka.util") apply​(byte[] bytes)
		```
		
		Creates a new CompactByteString by copying a byte array.
		- #### apply
		
		
		
		```
		public [CompactByteString](CompactByteString.html "class in akka.util") apply​(scala.collection.immutable.Seq<java.lang.Object> bytes)
		```
		
		Creates a new CompactByteString by copying bytes.
		- #### apply
		
		
		
		```
		public [CompactByteString](CompactByteString.html "class in akka.util") apply​(scala.collection.IterableOnce<java.lang.Object> bytes)
		```
		
		Creates a new CompactByteString by traversing bytes.
		- #### apply
		
		
		
		```
		public <T> [CompactByteString](CompactByteString.html "class in akka.util") apply​(scala.collection.immutable.Seq<T> bytes,
		                                   scala.math.Integral<T> num)
		```
		
		Creates a new CompactByteString by converting from integral numbers to bytes.
		- #### apply
		
		
		
		```
		public [CompactByteString](CompactByteString.html "class in akka.util") apply​(java.nio.ByteBuffer bytes)
		```
		
		Creates a new CompactByteString by copying bytes from a ByteBuffer.
		- #### apply
		
		
		
		```
		public [CompactByteString](CompactByteString.html "class in akka.util") apply​(java.lang.String string)
		```
		
		Creates a new CompactByteString by encoding a String as UTF\-8\.
		- #### apply
		
		
		
		```
		public [CompactByteString](CompactByteString.html "class in akka.util") apply​(java.lang.String string,
		                               java.lang.String charset)
		```
		
		Creates a new CompactByteString by encoding a String with a charset.
		- #### apply
		
		
		
		```
		public [CompactByteString](CompactByteString.html "class in akka.util") apply​(java.lang.String string,
		                               java.nio.charset.Charset charset)
		```
		
		Creates a new CompactByteString by encoding a String with a charset.
		- #### fromArray
		
		
		
		```
		public [CompactByteString](CompactByteString.html "class in akka.util") fromArray​(byte[] array,
		                                   int offset,
		                                   int length)
		```
		
		Creates a new CompactByteString by copying length bytes starting at offset from
		 an Array.
		- #### empty
		
		
		
		```
		public [CompactByteString](CompactByteString.html "class in akka.util") empty()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/util/CompactByteString$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/CompactByteString.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/util/CompactByteString$.html](https://doc.akka.io/japi/akka-core/2.10/akka/util/CompactByteString$.html)*