---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponseEntity.html
title: ResponseEntity
---

# ResponseEntity

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Interface ResponseEntity

- All Superinterfaces:
`[HttpEntity](../../javadsl/model/HttpEntity.html "interface in akka.http.javadsl.model")`, `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`, `[ResponseEntity](../../javadsl/model/ResponseEntity.html "interface in akka.http.javadsl.model")`

All Known Subinterfaces:
`[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")`, `[UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model")`

All Known Implementing Classes:
`[HttpEntity.Chunked](HttpEntity.Chunked.html "class in akka.http.scaladsl.model")`, `[HttpEntity.CloseDelimited](HttpEntity.CloseDelimited.html "class in akka.http.scaladsl.model")`, `[HttpEntity.Default](HttpEntity.Default.html "class in akka.http.scaladsl.model")`, `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")`

---

```
public interface ResponseEntity
extends [HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model"), [ResponseEntity](../../javadsl/model/ResponseEntity.html "interface in akka.http.javadsl.model")
```

An [`HttpEntity`](HttpEntity.html "interface in akka.http.scaladsl.model") that can be used for responses.
 Note that all entities that can be used for requests can also be used for responses.
 (But not the other way around, since [`HttpEntity.CloseDelimited`](HttpEntity.CloseDelimited.html "class in akka.http.scaladsl.model") can only be used for responses!)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[HttpEntity](../../javadsl/model/HttpEntity.html "interface in akka.http.javadsl.model")
		
		
		`[HttpEntity.Chunked](../../javadsl/model/HttpEntity.Chunked.html "interface in akka.http.javadsl.model"), [HttpEntity.ChunkStreamPart](../../javadsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model"), [HttpEntity.CloseDelimited](../../javadsl/model/HttpEntity.CloseDelimited.html "interface in akka.http.javadsl.model"), [HttpEntity.Default](../../javadsl/model/HttpEntity.Default.html "interface in akka.http.javadsl.model"), [HttpEntity.DiscardedEntity](../../javadsl/model/HttpEntity.DiscardedEntity.html "interface in akka.http.javadsl.model"), [HttpEntity.IndefiniteLength](../../javadsl/model/HttpEntity.IndefiniteLength.html "interface in akka.http.javadsl.model"), [HttpEntity.Strict](../../javadsl/model/HttpEntity.Strict.html "interface in akka.http.javadsl.model")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.model.[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")
		
		
		`[HttpEntity.Chunk](HttpEntity.Chunk.html "class in akka.http.scaladsl.model"), [HttpEntity.Chunk$](HttpEntity.Chunk$.html "class in akka.http.scaladsl.model"), [HttpEntity.Chunked](HttpEntity.Chunked.html "class in akka.http.scaladsl.model"), [HttpEntity.Chunked$](HttpEntity.Chunked$.html "class in akka.http.scaladsl.model"), [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"), [HttpEntity.ChunkStreamPart$](HttpEntity.ChunkStreamPart$.html "class in akka.http.scaladsl.model"), [HttpEntity.CloseDelimited](HttpEntity.CloseDelimited.html "class in akka.http.scaladsl.model"), [HttpEntity.CloseDelimited$](HttpEntity.CloseDelimited$.html "class in akka.http.scaladsl.model"), [HttpEntity.Default](HttpEntity.Default.html "class in akka.http.scaladsl.model"), [HttpEntity.Default$](HttpEntity.Default$.html "class in akka.http.scaladsl.model"), [HttpEntity.DiscardedEntity](HttpEntity.DiscardedEntity.html "class in akka.http.scaladsl.model"), [HttpEntity.HttpEntityScalaDSLSugar](HttpEntity.HttpEntityScalaDSLSugar.html "class in akka.http.scaladsl.model"), [HttpEntity.HttpEntityScalaDSLSugar$](HttpEntity.HttpEntityScalaDSLSugar$.html "class in akka.http.scaladsl.model"), [HttpEntity.IndefiniteLength](HttpEntity.IndefiniteLength.html "class in akka.http.scaladsl.model"), [HttpEntity.IndefiniteLength$](HttpEntity.IndefiniteLength$.html "class in akka.http.scaladsl.model"), [HttpEntity.LastChunk](HttpEntity.LastChunk.html "class in akka.http.scaladsl.model"), [HttpEntity.LastChunk$](HttpEntity.LastChunk$.html "class in akka.http.scaladsl.model"), [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model"), [HttpEntity.Strict$](HttpEntity.Strict$.html "class in akka.http.scaladsl.model"), [HttpEntity.WithoutKnownLength](HttpEntity.WithoutKnownLength.html "interface in akka.http.scaladsl.model")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")` | `[transformDataBytes](#transformDataBytes(akka.stream.scaladsl.Flow))​(akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​java.lang.Object> transformer)` | Returns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer. |
	| `[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")` | `[withContentType](#withContentType(akka.http.scaladsl.model.ContentType))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)` | Creates a copy of this HttpEntity with the `contentType` overridden with the given one. |
	| `[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")` | `[withoutSizeLimit](#withoutSizeLimit())()` | See [`HttpEntity.withoutSizeLimit()`](HttpEntity.html#withoutSizeLimit()) |
	| `[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")` | `[withSizeLimit](#withSizeLimit(long))​(long maxBytes)` | See [`HttpEntity.withSizeLimit(long)`](HttpEntity.html#withSizeLimit(long)). |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.model.[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")
		
		
		`[completionStageCovariant](HttpEntity.html#completionStageCovariant(java.util.concurrent.CompletionStage)), [contentLengthOption](HttpEntity.html#contentLengthOption()), [contentType](HttpEntity.html#contentType()), [dataBytes](HttpEntity.html#dataBytes()), [discardBytes](HttpEntity.html#discardBytes(akka.actor.ClassicActorSystemProvider)), [discardBytes](HttpEntity.html#discardBytes(akka.stream.Materializer)), [getContentLengthOption](HttpEntity.html#getContentLengthOption()), [getContentType](HttpEntity.html#getContentType()), [getDataBytes](HttpEntity.html#getDataBytes()), [isChunked](HttpEntity.html#isChunked()), [isCloseDelimited](HttpEntity.html#isCloseDelimited()), [isDefault](HttpEntity.html#isDefault()), [isIndefiniteLength](HttpEntity.html#isIndefiniteLength()), [isKnownEmpty](HttpEntity.html#isKnownEmpty()), [isStrict](HttpEntity.html#isStrict()), [toStrict](HttpEntity.html#toStrict(long,long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpEntity.html#toStrict(long,long,akka.stream.Materializer)), [toStrict](HttpEntity.html#toStrict(long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpEntity.html#toStrict(long,akka.stream.Materializer)), [toStrict](HttpEntity.html#toStrict(scala.concurrent.duration.FiniteDuration,long,akka.stream.Materializer)), [toStrict](HttpEntity.html#toStrict(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer)), [transformDataBytes](HttpEntity.html#transformDataBytes(long,akka.stream.scaladsl.Flow)), [withContentType](HttpEntity.html#withContentType(akka.http.javadsl.model.ContentType))`

- - ### Method Detail
	
	
	
		- #### withContentType
		
		
		
		```
		[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") withContentType​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```
		
		Description copied from interface: `[HttpEntity](HttpEntity.html#withContentType(akka.http.scaladsl.model.ContentType))`
		Creates a copy of this HttpEntity with the `contentType` overridden with the given one.
		
		Specified by:
		`[withContentType](HttpEntity.html#withContentType(akka.http.scaladsl.model.ContentType))` in interface `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`
		Parameters:
		`contentType` \- (undocumented)
		Returns:
		(undocumented)
		- #### withSizeLimit
		
		
		
		```
		[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") withSizeLimit​(long maxBytes)
		```
		
		See [`HttpEntity.withSizeLimit(long)`](HttpEntity.html#withSizeLimit(long)).
		
		Specified by:
		`[withSizeLimit](../../javadsl/model/HttpEntity.html#withSizeLimit(long))` in interface `[HttpEntity](../../javadsl/model/HttpEntity.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[withSizeLimit](HttpEntity.html#withSizeLimit(long))` in interface `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`
		Parameters:
		`maxBytes` \- (undocumented)
		Returns:
		(undocumented)
		- #### withoutSizeLimit
		
		
		
		```
		[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") withoutSizeLimit()
		```
		
		See [`HttpEntity.withoutSizeLimit()`](HttpEntity.html#withoutSizeLimit())
		
		Specified by:
		`[withoutSizeLimit](../../javadsl/model/HttpEntity.html#withoutSizeLimit())` in interface `[HttpEntity](../../javadsl/model/HttpEntity.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[withoutSizeLimit](HttpEntity.html#withoutSizeLimit())` in interface `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`
		Returns:
		(undocumented)
		- #### transformDataBytes
		
		
		
		```
		[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") transformDataBytes​(akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​java.lang.Object> transformer)
		```
		
		Description copied from interface: `[HttpEntity](HttpEntity.html#transformDataBytes(akka.stream.scaladsl.Flow))`
		Returns a copy of the given entity with the ByteString chunks of this entity transformed by the given transformer.
		 For a `Chunked` entity, the chunks will be transformed one by one keeping the chunk metadata (but may introduce an
		 extra chunk before the `LastChunk` if `transformer.onTermination` returns additional data).
		 
		 This method may only throw an exception if the `transformer` function throws an exception while creating the transformer.
		 Any other errors are reported through the new entity data stream.
		
		
		
		Specified by:
		`[transformDataBytes](HttpEntity.html#transformDataBytes(akka.stream.scaladsl.Flow))` in interface `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`
		Parameters:
		`transformer` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.ChunkStreamPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.Chunked.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.CloseDelimited.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.Default.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.IndefiniteLength.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Chunk$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Chunk.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.ChunkStreamPart$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.ChunkStreamPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Chunked$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Chunked.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.CloseDelimited$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.CloseDelimited.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Default$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Default.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.HttpEntityScalaDSLSugar$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.HttpEntityScalaDSLSugar.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.IndefiniteLength$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.IndefiniteLength.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.LastChunk$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.LastChunk.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.WithoutKnownLength.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UniversalEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponseEntity.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponseEntity.html)*