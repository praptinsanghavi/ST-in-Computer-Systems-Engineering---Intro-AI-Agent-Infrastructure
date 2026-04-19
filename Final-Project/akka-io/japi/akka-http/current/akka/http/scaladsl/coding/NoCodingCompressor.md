---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor.html
title: NoCodingCompressor
---

# NoCodingCompressor

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class NoCodingCompressor

- java.lang.Object
- - akka.http.scaladsl.coding.NoCodingCompressor

- ---

```
public class NoCodingCompressor
extends java.lang.Object
```

Deprecated.
NoCodingCompressor is internal API and will be moved or removed in the future. Since 10\.2\.0\.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoCodingCompressor](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static akka.util.ByteString` | `[compress](#compress(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. |
	| `static akka.util.ByteString` | `[compressAndFinish](#compressAndFinish(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. |
	| `static akka.util.ByteString` | `[compressAndFlush](#compressAndFlush(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. |
	| `static akka.util.ByteString` | `[finish](#finish())()` | Deprecated. |
	| `static akka.util.ByteString` | `[flush](#flush())()` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NoCodingCompressor
		
		
		
		```
		public NoCodingCompressor()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### compress
		
		
		
		```
		public static akka.util.ByteString compress​(akka.util.ByteString input)
		```
		
		Deprecated.
		- #### flush
		
		
		
		```
		public static akka.util.ByteString flush()
		```
		
		Deprecated.
		- #### finish
		
		
		
		```
		public static akka.util.ByteString finish()
		```
		
		Deprecated.
		- #### compressAndFlush
		
		
		
		```
		public static akka.util.ByteString compressAndFlush​(akka.util.ByteString input)
		```
		
		Deprecated.
		- #### compressAndFinish
		
		
		
		```
		public static akka.util.ByteString compressAndFinish​(akka.util.ByteString input)
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor.html)*