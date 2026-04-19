---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/ByteString$.html
title: ByteString$
---

# ByteString$

## Content

Package [akka.util](package-summary.html)
## Class ByteString$

- java.lang.Object
- - akka.util.ByteString$

- ---

```
public class ByteString$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ByteString$](ByteString$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteString$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(byte%5B%5D))​(byte[] bytes)` | Creates a new ByteString by copying a byte array. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(java.lang.String))​(java.lang.String string)` | Creates a new ByteString by encoding a String as UTF\-8\. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String string,  java.lang.String charset)` | Creates a new ByteString by encoding a String with a charset. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(java.lang.String,java.nio.charset.Charset))​(java.lang.String string,  java.nio.charset.Charset charset)` | Creates a new ByteString by encoding a String with a charset. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(java.nio.ByteBuffer))​(java.nio.ByteBuffer bytes)` | Creates a new ByteString by copying bytes from a ByteBuffer. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> bytes)` | Creates a new ByteString by copying bytes. |
	| `<T> [ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(scala.collection.immutable.Seq,scala.math.Integral))​(scala.collection.immutable.Seq<T> bytes,  scala.math.Integral<T> num)` | Creates a new ByteString by converting from integral numbers to bytes. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[apply](#apply(scala.collection.IterableOnce))​(scala.collection.IterableOnce<java.lang.Object> bytes)` | Creates a new ByteString by iterating over bytes. |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[createBuilder](#createBuilder())()` | Java API |
	| `[ByteString](ByteString.html "class in akka.util")` | `[empty](#empty())()` |  |
	| `[ByteString](ByteString.html "class in akka.util")` | `[emptyByteString](#emptyByteString())()` | Java API |
	| `[ByteString](ByteString.html "class in akka.util")` | `[fromArray](#fromArray(byte%5B%5D))​(byte[] array)` | Creates a new ByteString by copying a byte array. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[fromArray](#fromArray(byte%5B%5D,int,int))​(byte[] array,  int offset,  int length)` | Creates a new ByteString by copying length bytes starting at offset from  an Array. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[fromArrayUnsafe](#fromArrayUnsafe(byte%5B%5D))​(byte[] array)` | Unsafe API: Use only in situations you are completely confident that this is what  you need, and that you understand the implications documented below. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[fromArrayUnsafe](#fromArrayUnsafe(byte%5B%5D,int,int))​(byte[] array,  int offset,  int length)` | Unsafe API: Use only in situations you are completely confident that this is what  you need, and that you understand the implications documented below. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[fromByteBuffer](#fromByteBuffer(java.nio.ByteBuffer))​(java.nio.ByteBuffer buffer)` | Creates a new ByteString by copying bytes out of a ByteBuffer. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[fromInts](#fromInts(int...))​(int... array)` | JAVA API  Creates a new ByteString by copying an int array by converting from integral numbers to bytes. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[fromInts](#fromInts(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> array)` | JAVA API  Creates a new ByteString by copying an int array by converting from integral numbers to bytes. |
	| `[ByteString](ByteString.html "class in akka.util")` | `[fromString](#fromString(java.lang.String))​(java.lang.String string)` | Creates a new ByteString which will contain the UTF\-8 representation of the given String |
	| `[ByteString](ByteString.html "class in akka.util")` | `[fromString](#fromString(java.lang.String,java.lang.String))​(java.lang.String string,  java.lang.String charset)` | Creates a new ByteString which will contain the representation of the given String in the given charset |
	| `[ByteString](ByteString.html "class in akka.util")` | `[fromString](#fromString(java.lang.String,java.nio.charset.Charset))​(java.lang.String string,  java.nio.charset.Charset charset)` | Creates a new ByteString which will contain the representation of the given String in the given charset |
	| `[ByteStringBuilder](ByteStringBuilder.html "class in akka.util")` | `[newBuilder](#newBuilder())()` |  |
	| `java.lang.String` | `[UTF_8](#UTF_8())()` | Standard "UTF\-8" charset |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ByteString$](ByteString$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ByteString$
		
		
		
		```
		public ByteString$()
		```

	- ### Method Detail
	
	
	
		- #### fromInts
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") fromInts​(int... array)
		```
		
		JAVA API
		 Creates a new ByteString by copying an int array by converting from integral numbers to bytes.
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​(byte[] bytes)
		```
		
		Creates a new ByteString by copying a byte array.
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​(scala.collection.immutable.Seq<java.lang.Object> bytes)
		```
		
		Creates a new ByteString by copying bytes.
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​(scala.collection.IterableOnce<java.lang.Object> bytes)
		```
		
		Creates a new ByteString by iterating over bytes.
		- #### apply
		
		
		
		```
		public <T> [ByteString](ByteString.html "class in akka.util") apply​(scala.collection.immutable.Seq<T> bytes,
		                            scala.math.Integral<T> num)
		```
		
		Creates a new ByteString by converting from integral numbers to bytes.
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​(java.nio.ByteBuffer bytes)
		```
		
		Creates a new ByteString by copying bytes from a ByteBuffer.
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​(java.lang.String string)
		```
		
		Creates a new ByteString by encoding a String as UTF\-8\.
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​(java.lang.String string,
		                        java.lang.String charset)
		```
		
		Creates a new ByteString by encoding a String with a charset.
		- #### apply
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") apply​(java.lang.String string,
		                        java.nio.charset.Charset charset)
		```
		
		Creates a new ByteString by encoding a String with a charset.
		- #### fromArray
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") fromArray​(byte[] array)
		```
		
		Creates a new ByteString by copying a byte array.
		- #### fromArrayUnsafe
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") fromArrayUnsafe​(byte[] array)
		```
		
		Unsafe API: Use only in situations you are completely confident that this is what
		 you need, and that you understand the implications documented below.
		 
		 Creates a ByteString without copying the passed in byte array, unlike other factory
		 methods defined on ByteString. This method of creating a ByteString saves one array
		 copy and allocation and therefore can lead to better performance, however it also means
		 that one MUST NOT modify the passed in array, or unexpected immutable data structure
		 contract\-breaking behavior will manifest itself.
		 
		
		
		 This API is intended for users who have obtained an byte array from some other API, and
		 want wrap it into an ByteArray, and from there on only use that reference (the ByteString)
		 to operate on the wrapped data. For all other intents and purposes, please use the usual
		 apply and create methods \- which provide the immutability guarantees by copying the array.
		- #### fromArray
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") fromArray​(byte[] array,
		                            int offset,
		                            int length)
		```
		
		Creates a new ByteString by copying length bytes starting at offset from
		 an Array.
		- #### fromArrayUnsafe
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") fromArrayUnsafe​(byte[] array,
		                                  int offset,
		                                  int length)
		```
		
		Unsafe API: Use only in situations you are completely confident that this is what
		 you need, and that you understand the implications documented below.
		 
		 Creates a ByteString without copying the passed in byte array, unlike other factory
		 methods defined on ByteString. This method of creating a ByteString saves one array
		 copy and allocation and therefore can lead to better performance, however it also means
		 that one MUST NOT modify the passed in array, or unexpected immutable data structure
		 contract\-breaking behavior will manifest itself.
		 
		
		
		 This API is intended for users who have obtained an byte array from some other API, and
		 want wrap it into an ByteArray, and from there on only use that reference (the ByteString)
		 to operate on the wrapped data. For all other intents and purposes, please use the usual
		 apply and create methods \- which provide the immutability guarantees by copying the array.
		- #### fromInts
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") fromInts​(scala.collection.immutable.Seq<java.lang.Object> array)
		```
		
		JAVA API
		 Creates a new ByteString by copying an int array by converting from integral numbers to bytes.
		- #### fromString
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") fromString​(java.lang.String string)
		```
		
		Creates a new ByteString which will contain the UTF\-8 representation of the given String
		- #### fromString
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") fromString​(java.lang.String string,
		                             java.lang.String charset)
		```
		
		Creates a new ByteString which will contain the representation of the given String in the given charset
		- #### fromString
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") fromString​(java.lang.String string,
		                             java.nio.charset.Charset charset)
		```
		
		Creates a new ByteString which will contain the representation of the given String in the given charset
		- #### UTF\_8
		
		
		
		```
		public java.lang.String UTF_8()
		```
		
		Standard "UTF\-8" charset
		- #### fromByteBuffer
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") fromByteBuffer​(java.nio.ByteBuffer buffer)
		```
		
		Creates a new ByteString by copying bytes out of a ByteBuffer.
		- #### empty
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") empty()
		```
		- #### emptyByteString
		
		
		
		```
		public [ByteString](ByteString.html "class in akka.util") emptyByteString()
		```
		
		Java API
		- #### newBuilder
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") newBuilder()
		```
		- #### createBuilder
		
		
		
		```
		public [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") createBuilder()
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/ByteString$.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteStringBuilder.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/ByteString$.html](https://doc.akka.io/japi/akka/current/akka/util/ByteString$.html)*