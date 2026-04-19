---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/Encoder.html
title: Encoder
---

# Encoder

## Content

Package [akka.http.shaded.com.twitter.hpack](package-summary.html)
## Class Encoder

- java.lang.Object
- - akka.http.shaded.com.twitter.hpack.Encoder

- ---

```
public final class Encoder
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Encoder](#%3Cinit%3E(int))​(int maxHeaderTableSize)` | Creates a new encoder. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[encodeHeader](#encodeHeader(java.io.OutputStream,java.lang.String,java.lang.String,boolean))​(java.io.OutputStream out,  java.lang.String name,  java.lang.String value,  boolean sensitive)` | Encode the header field into the header block. |
	| `int` | `[getMaxHeaderTableSize](#getMaxHeaderTableSize())()` | Return the maximum table size. |
	| `void` | `[setMaxHeaderTableSize](#setMaxHeaderTableSize(java.io.OutputStream,int))​(java.io.OutputStream out,  int maxHeaderTableSize)` | Set the maximum table size. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Encoder
		
		
		
		```
		public Encoder​(int maxHeaderTableSize)
		```
		
		Creates a new encoder.

	- ### Method Detail
	
	
	
		- #### encodeHeader
		
		
		
		```
		public void encodeHeader​(java.io.OutputStream out,
		                         java.lang.String name,
		                         java.lang.String value,
		                         boolean sensitive)
		                  throws java.io.IOException
		```
		
		Encode the header field into the header block.
		
		Throws:
		`java.io.IOException`
		- #### setMaxHeaderTableSize
		
		
		
		```
		public void setMaxHeaderTableSize​(java.io.OutputStream out,
		                                  int maxHeaderTableSize)
		                           throws java.io.IOException
		```
		
		Set the maximum table size.
		
		Throws:
		`java.io.IOException`
		- #### getMaxHeaderTableSize
		
		
		
		```
		public int getMaxHeaderTableSize()
		```
		
		Return the maximum table size.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/Encoder.html](https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/Encoder.html)*