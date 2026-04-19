---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor$.html
title: NoCodingCompressor$
---

# NoCodingCompressor$

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class NoCodingCompressor$

- java.lang.Object
- - [akka.http.scaladsl.coding.Compressor](Compressor.html "class in akka.http.scaladsl.coding")
	- - akka.http.scaladsl.coding.NoCodingCompressor$

- ---

```
public class NoCodingCompressor$
extends [Compressor](Compressor.html "class in akka.http.scaladsl.coding")
```

Deprecated.
NoCodingCompressor is internal API and will be moved or removed in the future. Since 10\.2\.0\.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoCodingCompressor$](NoCodingCompressor$.html "class in akka.http.scaladsl.coding")` | `[MODULE$](#MODULE$)` | Deprecated. Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoCodingCompressor$](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `akka.util.ByteString` | `[compress](#compress(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. Compresses the given input and returns compressed data. |
	| `akka.util.ByteString` | `[compressAndFinish](#compressAndFinish(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. Combines \`compress\` \+ \`finish\` |
	| `akka.util.ByteString` | `[compressAndFlush](#compressAndFlush(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. Combines \`compress\` \+ \`flush\` |
	| `akka.util.ByteString` | `[finish](#finish())()` | Deprecated. Closes this compressed stream and return the remaining compressed data. |
	| `akka.util.ByteString` | `[flush](#flush())()` | Deprecated. Flushes any output data and returns the currently remaining compressed data. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoCodingCompressor$](NoCodingCompressor$.html "class in akka.http.scaladsl.coding") MODULE$
		```
		
		Deprecated.
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoCodingCompressor$
		
		
		
		```
		public NoCodingCompressor$()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### compress
		
		
		
		```
		public akka.util.ByteString compress​(akka.util.ByteString input)
		```
		
		Deprecated.
		Description copied from class: `[Compressor](Compressor.html#compress(akka.util.ByteString))`
		Compresses the given input and returns compressed data. The implementation
		 can and will choose to buffer output data to improve compression. Use
		 `flush` or `compressAndFlush` to make sure that all input data has been
		 compressed and pending output data has been returned.
		
		Specified by:
		`[compress](Compressor.html#compress(akka.util.ByteString))` in class `[Compressor](Compressor.html "class in akka.http.scaladsl.coding")`
		Parameters:
		`input` \- (undocumented)
		Returns:
		(undocumented)
		- #### flush
		
		
		
		```
		public akka.util.ByteString flush()
		```
		
		Deprecated.
		Description copied from class: `[Compressor](Compressor.html#flush())`
		Flushes any output data and returns the currently remaining compressed data.
		
		Specified by:
		`[flush](Compressor.html#flush())` in class `[Compressor](Compressor.html "class in akka.http.scaladsl.coding")`
		Returns:
		(undocumented)
		- #### finish
		
		
		
		```
		public akka.util.ByteString finish()
		```
		
		Deprecated.
		Description copied from class: `[Compressor](Compressor.html#finish())`
		Closes this compressed stream and return the remaining compressed data. After
		 calling this method, this Compressor cannot be used any further.
		
		Specified by:
		`[finish](Compressor.html#finish())` in class `[Compressor](Compressor.html "class in akka.http.scaladsl.coding")`
		Returns:
		(undocumented)
		- #### compressAndFlush
		
		
		
		```
		public akka.util.ByteString compressAndFlush​(akka.util.ByteString input)
		```
		
		Deprecated.
		Description copied from class: `[Compressor](Compressor.html#compressAndFlush(akka.util.ByteString))`
		Combines \`compress\` \+ \`flush\`
		
		Specified by:
		`[compressAndFlush](Compressor.html#compressAndFlush(akka.util.ByteString))` in class `[Compressor](Compressor.html "class in akka.http.scaladsl.coding")`
		- #### compressAndFinish
		
		
		
		```
		public akka.util.ByteString compressAndFinish​(akka.util.ByteString input)
		```
		
		Deprecated.
		Description copied from class: `[Compressor](Compressor.html#compressAndFinish(akka.util.ByteString))`
		Combines \`compress\` \+ \`finish\`
		
		Specified by:
		`[compressAndFinish](Compressor.html#compressAndFinish(akka.util.ByteString))` in class `[Compressor](Compressor.html "class in akka.http.scaladsl.coding")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Compressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor$.html)*