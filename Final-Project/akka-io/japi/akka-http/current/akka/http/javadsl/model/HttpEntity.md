---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.ChunkStreamPart.html
title: HttpEntity.ChunkStreamPart
---

# HttpEntity.ChunkStreamPart

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class HttpEntity.ChunkStreamPart

- java.lang.Object
- - akka.http.javadsl.model.HttpEntity.ChunkStreamPart

- Direct Known Subclasses:
`[HttpEntity.ChunkStreamPart](../../scaladsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model")`

Enclosing interface:
[HttpEntity](HttpEntity.html "interface in akka.http.javadsl.model")

---

```
public abstract static class HttpEntity.ChunkStreamPart
extends java.lang.Object
```

A part of a stream of incoming data for \`Transfer\-Encoding: chunked\` messages.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model")` | `[LAST](#LAST)` | The default last ChunkStreamPart that has no extension and no trailer headers. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ChunkStreamPart](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model")` | `[create](#create(akka.util.ByteString))​(akka.util.ByteString data)` | Creates a chunk from data with an empty extension. |
	| `static [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model")` | `[create](#create(akka.util.ByteString,java.lang.String))​(akka.util.ByteString data,  java.lang.String extension)` | Creates a chunk from data and extension. |
	| `static [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model")` | `[createLast](#createLast(java.lang.String,java.lang.Iterable))​(java.lang.String extension,  java.lang.Iterable<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")> trailerHeaders)` | Creates a last chunk with extension and headers. |
	| `abstract akka.util.ByteString` | `[data](#data())()` | Returns the byte data of this chunk. |
	| `abstract java.lang.String` | `[extension](#extension())()` | Returns extensions data for this chunk. |
	| `abstract java.lang.Iterable<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")>` | `[getTrailerHeaders](#getTrailerHeaders())()` | If this is the last chunk, this will return an Iterable of the trailer headers. |
	| `abstract boolean` | `[isLastChunk](#isLastChunk())()` | Returns if this is the last chunk |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### LAST
		
		
		
		```
		public static final [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model") LAST
		```
		
		The default last ChunkStreamPart that has no extension and no trailer headers.

	- ### Constructor Detail
	
	
	
		- #### ChunkStreamPart
		
		
		
		```
		public ChunkStreamPart()
		```

	- ### Method Detail
	
	
	
		- #### data
		
		
		
		```
		public abstract akka.util.ByteString data()
		```
		
		Returns the byte data of this chunk. Will be non\-empty for every regular
		 chunk. Will be empty for the last chunk.
		- #### extension
		
		
		
		```
		public abstract java.lang.String extension()
		```
		
		Returns extensions data for this chunk.
		- #### isLastChunk
		
		
		
		```
		public abstract boolean isLastChunk()
		```
		
		Returns if this is the last chunk
		- #### getTrailerHeaders
		
		
		
		```
		public abstract java.lang.Iterable<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")> getTrailerHeaders()
		```
		
		If this is the last chunk, this will return an Iterable of the trailer headers. Otherwise,
		 it will be empty.
		- #### create
		
		
		
		```
		public static [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model") create​(akka.util.ByteString data,
		                                                java.lang.String extension)
		```
		
		Creates a chunk from data and extension.
		- #### create
		
		
		
		```
		public static [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model") create​(akka.util.ByteString data)
		```
		
		Creates a chunk from data with an empty extension.
		- #### createLast
		
		
		
		```
		public static [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model") createLast​(java.lang.String extension,
		                                                    java.lang.Iterable<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")> trailerHeaders)
		```
		
		Creates a last chunk with extension and headers.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.ChunkStreamPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.ChunkStreamPart.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.ChunkStreamPart.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.ChunkStreamPart.html)*