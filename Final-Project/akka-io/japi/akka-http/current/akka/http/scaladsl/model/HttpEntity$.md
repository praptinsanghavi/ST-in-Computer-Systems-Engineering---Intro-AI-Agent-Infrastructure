---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity$.html
title: HttpEntity$
---

# HttpEntity$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpEntity$

- java.lang.Object
- - akka.http.scaladsl.model.HttpEntity$

- ---

```
public class HttpEntity$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpEntity$](HttpEntity$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpEntity$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[apply](#apply(byte%5B%5D))​(byte[] bytes)` |  |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.ContentType.NonBinary,java.lang.String))​([ContentType.NonBinary](ContentType.NonBinary.html "interface in akka.http.scaladsl.model") contentType,  java.lang.String string)` |  |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.ContentType.WithFixedCharset,java.lang.String))​([ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "class in akka.http.scaladsl.model") contentType,  java.lang.String string)` |  |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.ContentType,byte%5B%5D))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,  byte[] bytes)` |  |
	| `[UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.ContentType,long,akka.stream.scaladsl.Source))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,  long contentLength,  akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object> data)` |  |
	| `[HttpEntity.Chunked](HttpEntity.Chunked.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.ContentType,akka.stream.scaladsl.Source))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,  akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object> data)` |  |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.ContentType,akka.util.ByteString))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,  akka.util.ByteString data)` |  |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.util.ByteString))​(akka.util.ByteString data)` |  |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.lang.String))​(java.lang.String string)` |  |
	| `<T extends [HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")>scala.Tuple2<T,​scala.concurrent.Future<scala.runtime.BoxedUnit>>` | `[captureTermination](#captureTermination(T))​(T entity)` | INTERNAL API |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[empty](#empty(akka.http.scaladsl.model.ContentType))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)` |  |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[Empty](#Empty())()` |  |
	| `[UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model")` | `[fromFile](#fromFile(akka.http.scaladsl.model.ContentType,java.io.File,int))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,  java.io.File file,  int chunkSize)` | Returns either the empty entity, if the given file is empty, or a [`HttpEntity.Default`](HttpEntity.Default.html "class in akka.http.scaladsl.model") entity  consisting of a stream of `ByteString` instances each containing `chunkSize` bytes  (except for the final ByteString, which simply contains the remaining bytes). |
	| `[UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model")` | `[fromPath](#fromPath(akka.http.scaladsl.model.ContentType,java.nio.file.Path,int))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,  java.nio.file.Path file,  int chunkSize)` | Returns either the empty entity, if the given file is empty, or a [`HttpEntity.Default`](HttpEntity.Default.html "class in akka.http.scaladsl.model") entity  consisting of a stream of `ByteString` instances each containing `chunkSize` bytes  (except for the final ByteString, which simply contains the remaining bytes). |
	| `<Mat> akka.stream.scaladsl.Source<akka.util.ByteString,​Mat>` | `[limitableByteSource](#limitableByteSource(akka.stream.scaladsl.Source))​(akka.stream.scaladsl.Source<akka.util.ByteString,​Mat> source)` | Deprecated. Not needed explicitly any more. . |
	| `<Mat> akka.stream.scaladsl.Source<[HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"),​Mat>` | `[limitableChunkSource](#limitableChunkSource(akka.stream.scaladsl.Source))​(akka.stream.scaladsl.Source<[HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"),​Mat> source)` | Deprecated. Not needed explicitly any more. . |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpEntity$](HttpEntity$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpEntity$
		
		
		
		```
		public HttpEntity$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") apply​(java.lang.String string)
		```
		- #### apply
		
		
		
		```
		public [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") apply​(byte[] bytes)
		```
		- #### apply
		
		
		
		```
		public [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") apply​(akka.util.ByteString data)
		```
		- #### apply
		
		
		
		```
		public [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") apply​([ContentType.NonBinary](ContentType.NonBinary.html "interface in akka.http.scaladsl.model") contentType,
		                               java.lang.String string)
		```
		- #### apply
		
		
		
		```
		public [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") apply​([ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "class in akka.http.scaladsl.model") contentType,
		                               java.lang.String string)
		```
		- #### apply
		
		
		
		```
		public [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") apply​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,
		                               byte[] bytes)
		```
		- #### apply
		
		
		
		```
		public [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") apply​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,
		                               akka.util.ByteString data)
		```
		- #### apply
		
		
		
		```
		public [UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model") apply​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,
		                             long contentLength,
		                             akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object> data)
		```
		- #### apply
		
		
		
		```
		public [HttpEntity.Chunked](HttpEntity.Chunked.html "class in akka.http.scaladsl.model") apply​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,
		                                akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object> data)
		```
		- #### fromFile
		
		
		
		```
		public [UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model") fromFile​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,
		                                java.io.File file,
		                                int chunkSize)
		```
		
		Returns either the empty entity, if the given file is empty, or a [`HttpEntity.Default`](HttpEntity.Default.html "class in akka.http.scaladsl.model") entity
		 consisting of a stream of `ByteString` instances each containing `chunkSize` bytes
		 (except for the final ByteString, which simply contains the remaining bytes).
		 
		 If the given `chunkSize` is \-1 the default chunk size is used.
		
		
		
		Parameters:
		`contentType` \- (undocumented)
		`file` \- (undocumented)
		`chunkSize` \- (undocumented)
		Returns:
		(undocumented)
		- #### fromPath
		
		
		
		```
		public [UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model") fromPath​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType,
		                                java.nio.file.Path file,
		                                int chunkSize)
		```
		
		Returns either the empty entity, if the given file is empty, or a [`HttpEntity.Default`](HttpEntity.Default.html "class in akka.http.scaladsl.model") entity
		 consisting of a stream of `ByteString` instances each containing `chunkSize` bytes
		 (except for the final ByteString, which simply contains the remaining bytes).
		 
		 If the given `chunkSize` is \-1 the default chunk size is used.
		
		
		
		Parameters:
		`contentType` \- (undocumented)
		`file` \- (undocumented)
		`chunkSize` \- (undocumented)
		Returns:
		(undocumented)
		- #### Empty
		
		
		
		```
		public [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") Empty()
		```
		- #### empty
		
		
		
		```
		public [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") empty​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```
		- #### limitableByteSource
		
		
		
		```
		public <Mat> akka.stream.scaladsl.Source<akka.util.ByteString,​Mat> limitableByteSource​(akka.stream.scaladsl.Source<akka.util.ByteString,​Mat> source)
		```
		
		Deprecated.
		Not needed explicitly any more. . Since 10\.1\.5\.
		
		Deprecated: no\-op, not explicitly needed any more.
		
		Parameters:
		`source` \- (undocumented)
		Returns:
		(undocumented)
		- #### limitableChunkSource
		
		
		
		```
		public <Mat> akka.stream.scaladsl.Source<[HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"),​Mat> limitableChunkSource​(akka.stream.scaladsl.Source<[HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"),​Mat> source)
		```
		
		Deprecated.
		Not needed explicitly any more. . Since 10\.1\.5\.
		
		Deprecated: no\-op, not explicitly needed any more.
		
		Parameters:
		`source` \- (undocumented)
		Returns:
		(undocumented)
		- #### captureTermination
		
		
		
		```
		public <T extends [HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")> scala.Tuple2<T,​scala.concurrent.Future<scala.runtime.BoxedUnit>> captureTermination​(T entity)
		```
		
		INTERNAL API
		
		Parameters:
		`entity` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.ChunkStreamPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Chunked.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Default.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UniversalEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity$.html)*