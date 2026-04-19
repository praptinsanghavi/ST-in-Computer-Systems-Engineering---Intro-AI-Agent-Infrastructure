---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Compression.html
title: Compression
---

# Compression

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Compression

- java.lang.Object
- - akka.stream.javadsl.Compression

- ---

```
public class Compression
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Compression](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[deflate](#deflate())()` | Creates a flow that deflate\-compresses a stream of ByteString. |
	| `static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[deflate](#deflate(int,boolean))​(int level,  boolean nowrap)` | Same as [`deflate()`](#deflate()) with configurable level and nowrap |
	| `static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[gunzip](#gunzip(int))​(int maxBytesPerChunk)` | Creates a Flow that decompresses gzip\-compressed stream of data. |
	| `static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[gzip](#gzip())()` | Creates a flow that gzip\-compresses a stream of ByteStrings. |
	| `static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[gzip](#gzip(int))​(int level)` | Same as [`gzip()`](#gzip()) with a custom level. |
	| `static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[inflate](#inflate(int))​(int maxBytesPerChunk)` | Creates a Flow that decompresses deflate\-compressed stream of data. |
	| `static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[inflate](#inflate(int,boolean))​(int maxBytesPerChunk,  boolean nowrap)` | Same as [`inflate(int)`](#inflate(int)) with configurable maximum output length and nowrap |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Compression
		
		
		
		```
		public Compression()
		```

	- ### Method Detail
	
	
	
		- #### gunzip
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> gunzip​(int maxBytesPerChunk)
		```
		
		Creates a Flow that decompresses gzip\-compressed stream of data.
		 
		
		Parameters:
		`maxBytesPerChunk` \- Maximum length of the output `ByteString` chunk.
		- #### inflate
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> inflate​(int maxBytesPerChunk)
		```
		
		Creates a Flow that decompresses deflate\-compressed stream of data.
		 
		
		Parameters:
		`maxBytesPerChunk` \- Maximum length of the output `ByteString` chunk.
		- #### inflate
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> inflate​(int maxBytesPerChunk,
		                                                                      boolean nowrap)
		```
		
		Same as [`inflate(int)`](#inflate(int)) with configurable maximum output length and nowrap
		 
		
		Parameters:
		`maxBytesPerChunk` \- Maximum length of the output `ByteString` chunk.
		`nowrap` \- if true then use GZIP compatible decompression
		- #### gzip
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> gzip()
		```
		
		Creates a flow that gzip\-compresses a stream of ByteStrings. Note that the compressor
		 will SYNC\_FLUSH after every `ByteString` so that it is guaranteed that every `ByteString`
		 coming out of the flow can be fully decompressed without waiting for additional data. This may
		 come at a compression performance cost for very small chunks.
		- #### gzip
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> gzip​(int level)
		```
		
		Same as [`gzip()`](#gzip()) with a custom level.
		 
		
		Parameters:
		`level` \- Compression level (0\-9\)
		- #### deflate
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> deflate()
		```
		
		Creates a flow that deflate\-compresses a stream of ByteString. Note that the compressor
		 will SYNC\_FLUSH after every `ByteString` so that it is guaranteed that every `ByteString`
		 coming out of the flow can be fully decompressed without waiting for additional data. This may
		 come at a compression performance cost for very small chunks.
		- #### deflate
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> deflate​(int level,
		                                                                      boolean nowrap)
		```
		
		Same as [`deflate()`](#deflate()) with configurable level and nowrap
		 
		
		Parameters:
		`level` \- Compression level (0\-9\)
		`nowrap` \- if true then use GZIP compatible compression

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Compression.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Compression.html)*