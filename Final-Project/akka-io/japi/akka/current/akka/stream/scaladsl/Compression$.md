---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Compression$.html
title: Compression$
---

# Compression$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Compression$

- java.lang.Object
- - akka.stream.scaladsl.Compression$

- ---

```
public class Compression$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Compression$](Compression$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Compression$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[deflate](#deflate())()` | Creates a flow that deflate\-compresses a stream of ByteString. |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[deflate](#deflate(int,boolean))​(int level,  boolean nowrap)` | Same as [`deflate()`](#deflate()) with configurable level and nowrap |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[gunzip](#gunzip(int))​(int maxBytesPerChunk)` | Creates a Flow that decompresses a gzip\-compressed stream of data. |
	| `int` | `[gunzip$default$1](#gunzip$default$1())()` |  |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[gzip](#gzip())()` | Creates a flow that gzip\-compresses a stream of ByteStrings. |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[gzip](#gzip(int))​(int level)` | Same as [`gzip()`](#gzip()) with a custom level. |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[inflate](#inflate(int))​(int maxBytesPerChunk)` | Creates a Flow that decompresses a deflate\-compressed stream of data. |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[inflate](#inflate(int,boolean))​(int maxBytesPerChunk,  boolean nowrap)` | Creates a Flow that decompresses a deflate\-compressed stream of data. |
	| `int` | `[inflate$default$1](#inflate$default$1())()` |  |
	| `int` | `[MaxBytesPerChunkDefault](#MaxBytesPerChunkDefault())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Compression$](Compression$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Compression$
		
		
		
		```
		public Compression$()
		```

	- ### Method Detail
	
	
	
		- #### MaxBytesPerChunkDefault
		
		
		
		```
		public final int MaxBytesPerChunkDefault()
		```
		- #### gzip
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> gzip()
		```
		
		Creates a flow that gzip\-compresses a stream of ByteStrings. Note that the compressor
		 will SYNC\_FLUSH after every `ByteString` so that it is guaranteed that every `ByteString`
		 coming out of the flow can be fully decompressed without waiting for additional data. This may
		 come at a compression performance cost for very small chunks.
		 
		 FIXME: should strategy / flush mode be configurable? See https://github.com/akka/akka\-core/issues/21849
		- #### gzip
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> gzip​(int level)
		```
		
		Same as [`gzip()`](#gzip()) with a custom level.
		 
		
		Parameters:
		`level` \- Compression level (0\-9\)
		- #### gunzip
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> gunzip​(int maxBytesPerChunk)
		```
		
		Creates a Flow that decompresses a gzip\-compressed stream of data.
		 
		
		Parameters:
		`maxBytesPerChunk` \- Maximum length of an output `ByteString` chunk.
		- #### gunzip$default$1
		
		
		
		```
		public int gunzip$default$1()
		```
		- #### deflate
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> deflate()
		```
		
		Creates a flow that deflate\-compresses a stream of ByteString. Note that the compressor
		 will SYNC\_FLUSH after every `ByteString` so that it is guaranteed that every `ByteString`
		 coming out of the flow can be fully decompressed without waiting for additional data. This may
		 come at a compression performance cost for very small chunks.
		 
		 FIXME: should strategy / flush mode be configurable? See https://github.com/akka/akka\-core/issues/21849
		- #### deflate
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> deflate​(int level,
		                                                               boolean nowrap)
		```
		
		Same as [`deflate()`](#deflate()) with configurable level and nowrap
		 
		
		Parameters:
		`level` \- Compression level (0\-9\)
		`nowrap` \- if true then use GZIP compatible compression
		- #### inflate
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> inflate​(int maxBytesPerChunk)
		```
		
		Creates a Flow that decompresses a deflate\-compressed stream of data.
		 
		
		Parameters:
		`maxBytesPerChunk` \- Maximum length of an output `ByteString` chunk.
		- #### inflate
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> inflate​(int maxBytesPerChunk,
		                                                               boolean nowrap)
		```
		
		Creates a Flow that decompresses a deflate\-compressed stream of data.
		 
		
		Parameters:
		`maxBytesPerChunk` \- Maximum length of an output `ByteString` chunk.
		`nowrap` \- if true then use GZIP compatible decompression
		- #### inflate$default$1
		
		
		
		```
		public int inflate$default$1()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Compression$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Compression$.html)*