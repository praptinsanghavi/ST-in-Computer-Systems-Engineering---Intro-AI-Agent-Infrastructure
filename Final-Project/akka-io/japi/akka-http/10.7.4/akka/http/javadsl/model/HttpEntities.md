---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntities.html
title: HttpEntities
---

# HttpEntities

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class HttpEntities

- java.lang.Object
- - akka.http.javadsl.model.HttpEntities

- ---

```
public final class HttpEntities
extends java.lang.Object
```

Constructors for HttpEntity instances

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")` | `[EMPTY](#EMPTY)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")` | `[create](#create(byte%5B%5D))​(byte[] bytes)` |  |
	| `static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.ContentType.NonBinary,java.lang.String))​([ContentType.NonBinary](ContentType.NonBinary.html "interface in akka.http.javadsl.model") contentType,  java.lang.String string)` |  |
	| `static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.ContentType,byte%5B%5D))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  byte[] bytes)` |  |
	| `static [HttpEntity.Default](HttpEntity.Default.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.ContentType,long,akka.stream.javadsl.Source))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  long contentLength,  akka.stream.javadsl.Source<akka.util.ByteString,​?> data)` |  |
	| `static [HttpEntity.Chunked](HttpEntity.Chunked.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.ContentType,akka.stream.javadsl.Source))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  akka.stream.javadsl.Source<akka.util.ByteString,​?> data)` |  |
	| `static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.ContentType,akka.util.ByteString))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  akka.util.ByteString bytes)` |  |
	| `static [UniversalEntity](UniversalEntity.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.ContentType,java.io.File))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  java.io.File file)` |  |
	| `static [UniversalEntity](UniversalEntity.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.ContentType,java.io.File,int))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  java.io.File file,  int chunkSize)` |  |
	| `static [UniversalEntity](UniversalEntity.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.ContentType,java.nio.file.Path))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  java.nio.file.Path file)` |  |
	| `static [UniversalEntity](UniversalEntity.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.ContentType,java.nio.file.Path,int))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  java.nio.file.Path file,  int chunkSize)` |  |
	| `static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.util.ByteString))​(akka.util.ByteString bytes)` |  |
	| `static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")` | `[create](#create(java.lang.String))​(java.lang.String string)` |  |
	| `static [HttpEntity.Chunked](HttpEntity.Chunked.html "interface in akka.http.javadsl.model")` | `[createChunked](#createChunked(akka.http.javadsl.model.ContentType,akka.stream.javadsl.Source))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  akka.stream.javadsl.Source<akka.util.ByteString,​?> data)` |  |
	| `static [HttpEntity.CloseDelimited](HttpEntity.CloseDelimited.html "interface in akka.http.javadsl.model")` | `[createCloseDelimited](#createCloseDelimited(akka.http.javadsl.model.ContentType,akka.stream.javadsl.Source))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  akka.stream.javadsl.Source<akka.util.ByteString,​?> data)` |  |
	| `static [HttpEntity.IndefiniteLength](HttpEntity.IndefiniteLength.html "interface in akka.http.javadsl.model")` | `[createIndefiniteLength](#createIndefiniteLength(akka.http.javadsl.model.ContentType,akka.stream.javadsl.Source))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  akka.stream.javadsl.Source<akka.util.ByteString,​?> data)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### EMPTY
		
		
		
		```
		public static final [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") EMPTY
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") create​(java.lang.String string)
		```
		- #### create
		
		
		
		```
		public static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") create​(byte[] bytes)
		```
		- #### create
		
		
		
		```
		public static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") create​(akka.util.ByteString bytes)
		```
		- #### create
		
		
		
		```
		public static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") create​([ContentType.NonBinary](ContentType.NonBinary.html "interface in akka.http.javadsl.model") contentType,
		                                       java.lang.String string)
		```
		- #### create
		
		
		
		```
		public static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") create​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                       byte[] bytes)
		```
		- #### create
		
		
		
		```
		public static [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") create​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                       akka.util.ByteString bytes)
		```
		- #### create
		
		
		
		```
		public static [UniversalEntity](UniversalEntity.html "interface in akka.http.javadsl.model") create​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                     java.io.File file)
		```
		- #### create
		
		
		
		```
		public static [UniversalEntity](UniversalEntity.html "interface in akka.http.javadsl.model") create​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                     java.nio.file.Path file)
		```
		- #### create
		
		
		
		```
		public static [UniversalEntity](UniversalEntity.html "interface in akka.http.javadsl.model") create​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                     java.io.File file,
		                                     int chunkSize)
		```
		- #### create
		
		
		
		```
		public static [UniversalEntity](UniversalEntity.html "interface in akka.http.javadsl.model") create​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                     java.nio.file.Path file,
		                                     int chunkSize)
		```
		- #### create
		
		
		
		```
		public static [HttpEntity.Default](HttpEntity.Default.html "interface in akka.http.javadsl.model") create​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                        long contentLength,
		                                        akka.stream.javadsl.Source<akka.util.ByteString,​?> data)
		```
		- #### create
		
		
		
		```
		public static [HttpEntity.Chunked](HttpEntity.Chunked.html "interface in akka.http.javadsl.model") create​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                        akka.stream.javadsl.Source<akka.util.ByteString,​?> data)
		```
		- #### createCloseDelimited
		
		
		
		```
		public static [HttpEntity.CloseDelimited](HttpEntity.CloseDelimited.html "interface in akka.http.javadsl.model") createCloseDelimited​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                                             akka.stream.javadsl.Source<akka.util.ByteString,​?> data)
		```
		- #### createIndefiniteLength
		
		
		
		```
		public static [HttpEntity.IndefiniteLength](HttpEntity.IndefiniteLength.html "interface in akka.http.javadsl.model") createIndefiniteLength​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                                                 akka.stream.javadsl.Source<akka.util.ByteString,​?> data)
		```
		- #### createChunked
		
		
		
		```
		public static [HttpEntity.Chunked](HttpEntity.Chunked.html "interface in akka.http.javadsl.model") createChunked​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                               akka.stream.javadsl.Source<akka.util.ByteString,​?> data)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentType.NonBinary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.Chunked.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.CloseDelimited.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.Default.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.IndefiniteLength.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/UniversalEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntities.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntities.html)*