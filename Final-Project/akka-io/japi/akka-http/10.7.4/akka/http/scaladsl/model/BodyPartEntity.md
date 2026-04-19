---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html
title: BodyPartEntity
---

# BodyPartEntity

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Interface BodyPartEntity

- All Superinterfaces:
`[BodyPartEntity](../../javadsl/model/BodyPartEntity.html "interface in akka.http.javadsl.model")`, `[HttpEntity](../../javadsl/model/HttpEntity.html "interface in akka.http.javadsl.model")`, `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`

All Known Subinterfaces:
`[UniversalEntity](UniversalEntity.html "interface in akka.http.scaladsl.model")`

All Known Implementing Classes:
`[HttpEntity.Default](HttpEntity.Default.html "class in akka.http.scaladsl.model")`, `[HttpEntity.IndefiniteLength](HttpEntity.IndefiniteLength.html "class in akka.http.scaladsl.model")`, `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")`

---

```
public interface BodyPartEntity
extends [HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model"), [BodyPartEntity](../../javadsl/model/BodyPartEntity.html "interface in akka.http.javadsl.model")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[HttpEntity](../../javadsl/model/HttpEntity.html "interface in akka.http.javadsl.model")
		
		
		`[HttpEntity.Chunked](../../javadsl/model/HttpEntity.Chunked.html "interface in akka.http.javadsl.model"), [HttpEntity.ChunkStreamPart](../../javadsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model"), [HttpEntity.CloseDelimited](../../javadsl/model/HttpEntity.CloseDelimited.html "interface in akka.http.javadsl.model"), [HttpEntity.Default](../../javadsl/model/HttpEntity.Default.html "interface in akka.http.javadsl.model"), [HttpEntity.DiscardedEntity](../../javadsl/model/HttpEntity.DiscardedEntity.html "interface in akka.http.javadsl.model"), [HttpEntity.IndefiniteLength](../../javadsl/model/HttpEntity.IndefiniteLength.html "interface in akka.http.javadsl.model"), [HttpEntity.Strict](../../javadsl/model/HttpEntity.Strict.html "interface in akka.http.javadsl.model")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.model.[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")
		
		
		`[HttpEntity.Chunk](HttpEntity.Chunk.html "class in akka.http.scaladsl.model"), [HttpEntity.Chunk$](HttpEntity.Chunk$.html "class in akka.http.scaladsl.model"), [HttpEntity.Chunked](HttpEntity.Chunked.html "class in akka.http.scaladsl.model"), [HttpEntity.Chunked$](HttpEntity.Chunked$.html "class in akka.http.scaladsl.model"), [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"), [HttpEntity.ChunkStreamPart$](HttpEntity.ChunkStreamPart$.html "class in akka.http.scaladsl.model"), [HttpEntity.CloseDelimited](HttpEntity.CloseDelimited.html "class in akka.http.scaladsl.model"), [HttpEntity.CloseDelimited$](HttpEntity.CloseDelimited$.html "class in akka.http.scaladsl.model"), [HttpEntity.Default](HttpEntity.Default.html "class in akka.http.scaladsl.model"), [HttpEntity.Default$](HttpEntity.Default$.html "class in akka.http.scaladsl.model"), [HttpEntity.DiscardedEntity](HttpEntity.DiscardedEntity.html "class in akka.http.scaladsl.model"), [HttpEntity.HttpEntityScalaDSLSugar](HttpEntity.HttpEntityScalaDSLSugar.html "class in akka.http.scaladsl.model"), [HttpEntity.HttpEntityScalaDSLSugar$](HttpEntity.HttpEntityScalaDSLSugar$.html "class in akka.http.scaladsl.model"), [HttpEntity.IndefiniteLength](HttpEntity.IndefiniteLength.html "class in akka.http.scaladsl.model"), [HttpEntity.IndefiniteLength$](HttpEntity.IndefiniteLength$.html "class in akka.http.scaladsl.model"), [HttpEntity.LastChunk](HttpEntity.LastChunk.html "class in akka.http.scaladsl.model"), [HttpEntity.LastChunk$](HttpEntity.LastChunk$.html "class in akka.http.scaladsl.model"), [HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model"), [HttpEntity.Strict$](HttpEntity.Strict$.html "class in akka.http.scaladsl.model"), [HttpEntity.WithoutKnownLength](HttpEntity.WithoutKnownLength.html "interface in akka.http.scaladsl.model")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model")` | `[withContentType](#withContentType(akka.http.scaladsl.model.ContentType))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)` | Creates a copy of this HttpEntity with the `contentType` overridden with the given one. |
	| `[BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model")` | `[withoutSizeLimit](#withoutSizeLimit())()` | Lift the size limit from this entity by returning a new entity instance which skips the size verification. |
	| `[BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model")` | `[withSizeLimit](#withSizeLimit(long))​(long maxBytes)` | Apply the given size limit to this entity by returning a new entity instance which automatically verifies that the  data stream encapsulated by this instance produces at most `maxBytes` data bytes. |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.model.[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")
		
		
		`[completionStageCovariant](HttpEntity.html#completionStageCovariant(java.util.concurrent.CompletionStage)), [contentLengthOption](HttpEntity.html#contentLengthOption()), [contentType](HttpEntity.html#contentType()), [dataBytes](HttpEntity.html#dataBytes()), [discardBytes](HttpEntity.html#discardBytes(akka.actor.ClassicActorSystemProvider)), [discardBytes](HttpEntity.html#discardBytes(akka.stream.Materializer)), [getContentLengthOption](HttpEntity.html#getContentLengthOption()), [getContentType](HttpEntity.html#getContentType()), [getDataBytes](HttpEntity.html#getDataBytes()), [isChunked](HttpEntity.html#isChunked()), [isCloseDelimited](HttpEntity.html#isCloseDelimited()), [isDefault](HttpEntity.html#isDefault()), [isIndefiniteLength](HttpEntity.html#isIndefiniteLength()), [isKnownEmpty](HttpEntity.html#isKnownEmpty()), [isStrict](HttpEntity.html#isStrict()), [toStrict](HttpEntity.html#toStrict(long,long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpEntity.html#toStrict(long,long,akka.stream.Materializer)), [toStrict](HttpEntity.html#toStrict(long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpEntity.html#toStrict(long,akka.stream.Materializer)), [toStrict](HttpEntity.html#toStrict(scala.concurrent.duration.FiniteDuration,long,akka.stream.Materializer)), [toStrict](HttpEntity.html#toStrict(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer)), [transformDataBytes](HttpEntity.html#transformDataBytes(long,akka.stream.scaladsl.Flow)), [transformDataBytes](HttpEntity.html#transformDataBytes(akka.stream.scaladsl.Flow)), [withContentType](HttpEntity.html#withContentType(akka.http.javadsl.model.ContentType))`

- - ### Method Detail
	
	
	
		- #### withContentType
		
		
		
		```
		[BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model") withContentType​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)
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
		[BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model") withSizeLimit​(long maxBytes)
		```
		
		Description copied from interface: `[HttpEntity](HttpEntity.html#withSizeLimit(long))`
		Apply the given size limit to this entity by returning a new entity instance which automatically verifies that the
		 data stream encapsulated by this instance produces at most `maxBytes` data bytes. In case this verification fails
		 the respective stream will be terminated with an `EntityStreamException` either directly at materialization
		 time (if the Content\-Length is known) or whenever more data bytes than allowed have been read.
		 
		 When called on `Strict` entities the method will return the entity itself if the length is within the bound,
		 otherwise a `Default` entity with a single element data stream. This allows for potential refinement of the
		 entity size limit at a later point (before materialization of the data stream).
		 
		
		
		 By default all message entities produced by the HTTP layer automatically carry the limit that is defined in the
		 application's `max-content-length` config setting. If the entity is transformed in a way that changes the
		 Content\-Length and then another limit is applied then this new limit will be evaluated against the new
		 Content\-Length. If the entity is transformed in a way that changes the Content\-Length and no new limit is applied
		 then the previous limit will be applied against the previous Content\-Length.
		
		
		
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
		[BodyPartEntity](BodyPartEntity.html "interface in akka.http.scaladsl.model") withoutSizeLimit()
		```
		
		Description copied from interface: `[HttpEntity](HttpEntity.html#withoutSizeLimit())`
		Lift the size limit from this entity by returning a new entity instance which skips the size verification.
		 
		 By default all message entities produced by the HTTP layer automatically carry the limit that is defined in the
		 application's `max-content-length` config setting. It is recommended to always keep an upper limit on accepted
		 entities to avoid potential attackers flooding you with too large requests/responses, so use this method with caution.
		 
		
		
		 See [`HttpEntity.withSizeLimit(long)`](HttpEntity.html#withSizeLimit(long)) for more details.
		
		
		
		Specified by:
		`[withoutSizeLimit](../../javadsl/model/HttpEntity.html#withoutSizeLimit())` in interface `[HttpEntity](../../javadsl/model/HttpEntity.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[withoutSizeLimit](HttpEntity.html#withoutSizeLimit())` in interface `[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")`
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
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/UniversalEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html)*