---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Compressor.html
title: Compressor
---

# Compressor

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class Compressor

- java.lang.Object
- - akka.http.scaladsl.coding.Compressor

- Direct Known Subclasses:
`[DeflateCompressor](DeflateCompressor.html "class in akka.http.scaladsl.coding")`, `[NoCodingCompressor$](NoCodingCompressor$.html "class in akka.http.scaladsl.coding")`

---

```
public abstract class Compressor
extends java.lang.Object
```

Deprecated.
Compressor is internal API and will be moved or removed in the future. Since 10\.2\.0\.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Compressor](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `abstract akka.util.ByteString` | `[compress](#compress(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. Compresses the given input and returns compressed data. |
	| `abstract akka.util.ByteString` | `[compressAndFinish](#compressAndFinish(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. Combines \`compress\` \+ \`finish\` |
	| `abstract akka.util.ByteString` | `[compressAndFlush](#compressAndFlush(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. Combines \`compress\` \+ \`flush\` |
	| `abstract akka.util.ByteString` | `[finish](#finish())()` | Deprecated. Closes this compressed stream and return the remaining compressed data. |
	| `abstract akka.util.ByteString` | `[flush](#flush())()` | Deprecated. Flushes any output data and returns the currently remaining compressed data. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Compressor
		
		
		
		```
		public Compressor()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### compress
		
		
		
		```
		public abstract akka.util.ByteString compress​(akka.util.ByteString input)
		```
		
		Deprecated.
		Compresses the given input and returns compressed data. The implementation
		 can and will choose to buffer output data to improve compression. Use
		 `flush` or `compressAndFlush` to make sure that all input data has been
		 compressed and pending output data has been returned.
		
		Parameters:
		`input` \- (undocumented)
		Returns:
		(undocumented)
		- #### compressAndFinish
		
		
		
		```
		public abstract akka.util.ByteString compressAndFinish​(akka.util.ByteString input)
		```
		
		Deprecated.
		Combines \`compress\` \+ \`finish\`
		- #### compressAndFlush
		
		
		
		```
		public abstract akka.util.ByteString compressAndFlush​(akka.util.ByteString input)
		```
		
		Deprecated.
		Combines \`compress\` \+ \`flush\`
		- #### finish
		
		
		
		```
		public abstract akka.util.ByteString finish()
		```
		
		Deprecated.
		Closes this compressed stream and return the remaining compressed data. After
		 calling this method, this Compressor cannot be used any further.
		
		Returns:
		(undocumented)
		- #### flush
		
		
		
		```
		public abstract akka.util.ByteString flush()
		```
		
		Deprecated.
		Flushes any output data and returns the currently remaining compressed data.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Compressor.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Compressor.html)*