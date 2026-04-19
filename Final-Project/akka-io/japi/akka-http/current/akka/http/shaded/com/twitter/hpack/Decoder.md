---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/Decoder.html
title: Decoder
---

# Decoder

## Content

Package [akka.http.shaded.com.twitter.hpack](package-summary.html)
## Class Decoder

- java.lang.Object
- - akka.http.shaded.com.twitter.hpack.Decoder

- ---

```
public final class Decoder
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Decoder](#%3Cinit%3E(int,int))​(int maxHeaderSize,  int maxHeaderTableSize)` | Creates a new decoder. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[decode](#decode(java.io.InputStream,akka.http.shaded.com.twitter.hpack.HeaderListener))​(java.io.InputStream in,  [HeaderListener](HeaderListener.html "interface in akka.http.shaded.com.twitter.hpack") headerListener)` | Decode the header block into header fields. |
	| `boolean` | `[endHeaderBlock](#endHeaderBlock())()` | End the current header block. |
	| `int` | `[getMaxHeaderTableSize](#getMaxHeaderTableSize())()` | Return the maximum table size. |
	| `void` | `[setMaxHeaderTableSize](#setMaxHeaderTableSize(int))​(int maxHeaderTableSize)` | Set the maximum table size. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Decoder
		
		
		
		```
		public Decoder​(int maxHeaderSize,
		               int maxHeaderTableSize)
		```
		
		Creates a new decoder.

	- ### Method Detail
	
	
	
		- #### decode
		
		
		
		```
		public void decode​(java.io.InputStream in,
		                   [HeaderListener](HeaderListener.html "interface in akka.http.shaded.com.twitter.hpack") headerListener)
		            throws java.io.IOException
		```
		
		Decode the header block into header fields.
		
		Throws:
		`java.io.IOException`
		- #### endHeaderBlock
		
		
		
		```
		public boolean endHeaderBlock()
		```
		
		End the current header block. Returns if the header field has been truncated.
		 This must be called after the header block has been completely decoded.
		- #### setMaxHeaderTableSize
		
		
		
		```
		public void setMaxHeaderTableSize​(int maxHeaderTableSize)
		```
		
		Set the maximum table size.
		 If this is below the maximum size of the dynamic table used by the encoder,
		 the beginning of the next header block MUST signal this change.
		- #### getMaxHeaderTableSize
		
		
		
		```
		public int getMaxHeaderTableSize()
		```
		
		Return the maximum table size.
		 This is the maximum size allowed by both the encoder and the decoder.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/HeaderListener.html
- https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/Decoder.html](https://doc.akka.io/japi/akka-http/current/akka/http/shaded/com/twitter/hpack/Decoder.html)*