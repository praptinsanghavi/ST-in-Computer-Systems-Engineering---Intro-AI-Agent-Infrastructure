---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/UniversalEntity.html
title: UniversalEntity
---

# UniversalEntity

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Interface UniversalEntity

- All Superinterfaces:
`[BodyPartEntity](../../javadsl/model/BodyPartEntity.html "interface in akka.http.javadsl.model")`, `[BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model")`, `[HttpEntity](../../javadsl/model/HttpEntity.html "interface in akka.http.javadsl.model")`, `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`, `[RequestEntity](../../javadsl/model/RequestEntity.html "interface in akka.http.javadsl.model")`, `[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")`, `[ResponseEntity](../../javadsl/model/ResponseEntity.html "interface in akka.http.javadsl.model")`, `[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")`, `[UniversalEntity](../../javadsl/model/UniversalEntity.html "interface in akka.http.javadsl.model")`

All Known Implementing Classes:
`[HttpEntity.Default](HttpEntity.Default.html "class in akka.http.scaladsl.model")`, `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")`

---

```
public interface UniversalEntity
extends [UniversalEntity](../../javadsl/model/UniversalEntity.html "interface in akka.http.javadsl.model"), [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model"), [BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[HttpEntity](../../javadsl/model/HttpEntity.html "interface in akka.http.javadsl.model")
		
		
		`[HttpEntity.Chunked](../../javadsl/model/HttpEntity.Chunked.html "interface in akka.http.javadsl.model"), [HttpEntity.ChunkStreamPart](../../javadsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model"), [HttpEntity.CloseDelimited](../../javadsl/model/HttpEntity.CloseDelimited.html "interface in akka.http.javadsl.model"), [HttpEntity.Default](../../javadsl/model/HttpEntity.Default.html "interface in akka.http.javadsl.model"), [HttpEntity.DiscardedEntity](../../javadsl/model/HttpEntity.DiscardedEntity.html "interface in akka.http.javadsl.model"), [HttpEntity.IndefiniteLength](../../javadsl/model/HttpEntity.IndefiniteLength.html "interface in akka.http.javadsl.model"), [HttpEntity.Strict](../../javadsl/model/HttpEntity.Strict.html "interface in akka.http.javadsl.model")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.model.[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")
		
		
		`[HttpEntity.Chunk](HttpEntity.Chunk.html "class in akka.http.scaladsl.model"), [HttpEntity.Chunk$](HttpEntity.Chunk$.html "class in akka.http.scaladsl.model"), [HttpEntity.Chunked](HttpEntity.Chunked.html "class in akka.http.scaladsl.model"), [HttpEntity.Chunked$](HttpEntity.Chunked$.html "class in akka.http.scaladsl.model"), [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"), [HttpEntity.ChunkStreamPart$](HttpEntity.ChunkStreamPart$.html "class in akka.http.scaladsl.model"), [HttpEntity.CloseDelimited](HttpEntity.CloseDelimited.html "class in akka.http.scaladsl.model"), [HttpEntity.CloseDelimited$](HttpEntity.CloseDelimited$.html "class in akka.http.scaladsl.model"), [HttpEntity.Default](HttpEntity.Default.html "class in akka.http.scaladsl.model"), [HttpEntity.Default$](HttpEntity.Default$.html "class in akka.http.scaladsl.model"), [HttpEntity.DiscardedEntity](HttpEntity.DiscardedEntity.html "class in akka.http.scaladsl.model"), [HttpEntity.HttpEntityScalaDSLSugar](HttpEntity.HttpEntityScalaDSLSugar.html "class in akka.http.scaladsl.model"), [HttpEntity.HttpEntityScalaDSLSugar$](HttpEntity.HttpEntityScalaDSLSugar$.html "class in akka.http.scaladsl.model"), [HttpEntity.IndefiniteLength](HttpEntity.IndefiniteLength.html "class in akka.http.scaladsl.model"), [HttpEntity.IndefiniteLength$](HttpEntity.IndefiniteLength$.html "class in akka.http.scaladsl.model"), [HttpEntity.LastChunk](HttpEntity.LastChunk.html "class in akka.http.scaladsl.model"), [HttpEntity.LastChunk$](HttpEntity.LastChunk$.html "class in akka.http.scaladsl.model"), [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model"), [HttpEntity.Strict$](HttpEntity.Strict$.html "class in akka.http.scaladsl.model"), [HttpEntity.WithoutKnownLength](HttpEntity.WithoutKnownLength.html "interface in akka.http.scaladsl.model")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `long` | `[contentLength](#contentLength())()` |  |
	| `scala.Option<java.lang.Object>` | `[contentLengthOption](#contentLengthOption())()` | Some(content length) if a length is defined for this entity, None otherwise. |
	| `[UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model")` | `[withContentType](#withContentType(akka.http.scaladsl.model.ContentType))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)` | Creates a copy of this HttpEntity with the `contentType` overridden with the given one. |
	| `[UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model")` | `[withoutSizeLimit](#withoutSizeLimit())()` | See [`HttpEntity.withoutSizeLimit()`](HttpEntity.html#withoutSizeLimit()) |
	| `[UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model")` | `[withSizeLimit](#withSizeLimit(long))​(long maxBytes)` | See [`HttpEntity.withSizeLimit(long)`](HttpEntity.html#withSizeLimit(long)). |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.model.[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")
		
		
		`[completionStageCovariant](HttpEntity.html#completionStageCovariant(java.util.concurrent.CompletionStage)), [contentType](HttpEntity.html#contentType()), [dataBytes](HttpEntity.html#dataBytes()), [discardBytes](HttpEntity.html#discardBytes(akka.actor.ClassicActorSystemProvider)), [discardBytes](HttpEntity.html#discardBytes(akka.stream.Materializer)), [getContentLengthOption](HttpEntity.html#getContentLengthOption()), [getContentType](HttpEntity.html#getContentType()), [getDataBytes](HttpEntity.html#getDataBytes()), [isChunked](HttpEntity.html#isChunked()), [isCloseDelimited](HttpEntity.html#isCloseDelimited()), [isDefault](HttpEntity.html#isDefault()), [isIndefiniteLength](HttpEntity.html#isIndefiniteLength()), [isKnownEmpty](HttpEntity.html#isKnownEmpty()), [isStrict](HttpEntity.html#isStrict()), [toStrict](HttpEntity.html#toStrict(long,long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpEntity.html#toStrict(long,long,akka.stream.Materializer)), [toStrict](HttpEntity.html#toStrict(long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpEntity.html#toStrict(long,akka.stream.Materializer)), [toStrict](HttpEntity.html#toStrict(scala.concurrent.duration.FiniteDuration,long,akka.stream.Materializer)), [toStrict](HttpEntity.html#toStrict(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer)), [transformDataBytes](HttpEntity.html#transformDataBytes(long,akka.stream.scaladsl.Flow)), [withContentType](HttpEntity.html#withContentType(akka.http.javadsl.model.ContentType))`
		- ### Methods inherited from interface akka.http.scaladsl.model.[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")
		
		
		`[transformDataBytes](RequestEntity.html#transformDataBytes(akka.stream.scaladsl.Flow))`

- - ### Method Detail
	
	
	
		- #### contentLength
		
		
		
		```
		long contentLength()
		```
		- #### contentLengthOption
		
		
		
		```
		scala.Option<java.lang.Object> contentLengthOption()
		```
		
		Description copied from interface: `[HttpEntity](HttpEntity.html#contentLengthOption())`
		Some(content length) if a length is defined for this entity, None otherwise.
		 A length is only defined for Strict and Default entity types.
		 
		 In many cases it's dangerous to rely on the (non\-)existence of a content\-length.
		 HTTP intermediaries like (transparent) proxies are allowed to change the transfer\-encoding
		 which can result in the entity being delivered as another type as expected.
		
		
		
		Specified by:
		`[contentLengthOption](HttpEntity.html#contentLengthOption())` in interface `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`
		Returns:
		(undocumented)
		- #### withContentType
		
		
		
		```
		[UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model") withContentType​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```
		
		Description copied from interface: `[HttpEntity](HttpEntity.html#withContentType(akka.http.scaladsl.model.ContentType))`
		Creates a copy of this HttpEntity with the `contentType` overridden with the given one.
		
		Specified by:
		`[withContentType](BodyPartEntity.html#withContentType(akka.http.scaladsl.model.ContentType))` in interface `[BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[withContentType](HttpEntity.html#withContentType(akka.http.scaladsl.model.ContentType))` in interface `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[withContentType](RequestEntity.html#withContentType(akka.http.scaladsl.model.ContentType))` in interface `[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[withContentType](ResponseEntity.html#withContentType(akka.http.scaladsl.model.ContentType))` in interface `[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")`
		Parameters:
		`contentType` \- (undocumented)
		Returns:
		(undocumented)
		- #### withSizeLimit
		
		
		
		```
		[UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model") withSizeLimit​(long maxBytes)
		```
		
		See [`HttpEntity.withSizeLimit(long)`](HttpEntity.html#withSizeLimit(long)).
		
		Specified by:
		`[withSizeLimit](BodyPartEntity.html#withSizeLimit(long))` in interface `[BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[withSizeLimit](../../javadsl/model/HttpEntity.html#withSizeLimit(long))` in interface `[HttpEntity](../../javadsl/model/HttpEntity.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[withSizeLimit](HttpEntity.html#withSizeLimit(long))` in interface `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[withSizeLimit](RequestEntity.html#withSizeLimit(long))` in interface `[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[withSizeLimit](ResponseEntity.html#withSizeLimit(long))` in interface `[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")`
		Parameters:
		`maxBytes` \- (undocumented)
		Returns:
		(undocumented)
		- #### withoutSizeLimit
		
		
		
		```
		[UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model") withoutSizeLimit()
		```
		
		See [`HttpEntity.withoutSizeLimit()`](HttpEntity.html#withoutSizeLimit())
		
		Specified by:
		`[withoutSizeLimit](BodyPartEntity.html#withoutSizeLimit())` in interface `[BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[withoutSizeLimit](../../javadsl/model/HttpEntity.html#withoutSizeLimit())` in interface `[HttpEntity](../../javadsl/model/HttpEntity.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[withoutSizeLimit](HttpEntity.html#withoutSizeLimit())` in interface `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[withoutSizeLimit](RequestEntity.html#withoutSizeLimit())` in interface `[RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[withoutSizeLimit](ResponseEntity.html#withoutSizeLimit())` in interface `[ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model")`
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.ChunkStreamPart.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.Chunked.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.CloseDelimited.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.Default.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.IndefiniteLength.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/UniversalEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.Chunk$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.Chunk.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.ChunkStreamPart$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.ChunkStreamPart.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.Chunked$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.Chunked.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.CloseDelimited$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.CloseDelimited.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.Default$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.Default.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.HttpEntityScalaDSLSugar$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.HttpEntityScalaDSLSugar.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.IndefiniteLength$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.IndefiniteLength.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.LastChunk$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.LastChunk.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.Strict$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.WithoutKnownLength.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/UniversalEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/UniversalEntity.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/UniversalEntity.html)*