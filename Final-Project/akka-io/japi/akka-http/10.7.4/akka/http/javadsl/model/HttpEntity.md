---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.IndefiniteLength.html
title: HttpEntity.IndefiniteLength
---

# HttpEntity.IndefiniteLength

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Interface HttpEntity.IndefiniteLength

- All Superinterfaces:
`[BodyPartEntity](BodyPartEntity.html "interface in akka.http.javadsl.model")`, `[HttpEntity](HttpEntity.html "interface in akka.http.javadsl.model")`

All Known Implementing Classes:
`[HttpEntity.IndefiniteLength](../../scaladsl/model/HttpEntity.IndefiniteLength.html "class in akka.http.scaladsl.model")`

Enclosing interface:
[HttpEntity](HttpEntity.html "interface in akka.http.javadsl.model")

---

```
public static interface HttpEntity.IndefiniteLength
extends [BodyPartEntity](BodyPartEntity.html "interface in akka.http.javadsl.model")
```

Represents an entity without a predetermined content\-length to use in a BodyParts.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[HttpEntity](HttpEntity.html "interface in akka.http.javadsl.model")
		
		
		`[HttpEntity.Chunked](HttpEntity.Chunked.html "interface in akka.http.javadsl.model"), [HttpEntity.ChunkStreamPart](HttpEntity.ChunkStreamPart.html "class in akka.http.javadsl.model"), [HttpEntity.CloseDelimited](HttpEntity.CloseDelimited.html "interface in akka.http.javadsl.model"), [HttpEntity.Default](HttpEntity.Default.html "interface in akka.http.javadsl.model"), [HttpEntity.DiscardedEntity](HttpEntity.DiscardedEntity.html "interface in akka.http.javadsl.model"), [HttpEntity.IndefiniteLength](HttpEntity.IndefiniteLength.html "interface in akka.http.javadsl.model"), [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")`

	- ### Method Summary
	
	
		- ### Methods inherited from interface akka.http.javadsl.model.[HttpEntity](HttpEntity.html "interface in akka.http.javadsl.model")
		
		
		`[discardBytes](HttpEntity.html#discardBytes(akka.actor.ClassicActorSystemProvider)), [discardBytes](HttpEntity.html#discardBytes(akka.stream.Materializer)), [getContentLengthOption](HttpEntity.html#getContentLengthOption()), [getContentType](HttpEntity.html#getContentType()), [getDataBytes](HttpEntity.html#getDataBytes()), [isChunked](HttpEntity.html#isChunked()), [isCloseDelimited](HttpEntity.html#isCloseDelimited()), [isDefault](HttpEntity.html#isDefault()), [isIndefiniteLength](HttpEntity.html#isIndefiniteLength()), [isKnownEmpty](HttpEntity.html#isKnownEmpty()), [isStrict](HttpEntity.html#isStrict()), [toStrict](HttpEntity.html#toStrict(long,long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpEntity.html#toStrict(long,long,akka.stream.Materializer)), [toStrict](HttpEntity.html#toStrict(long,akka.actor.ClassicActorSystemProvider)), [toStrict](HttpEntity.html#toStrict(long,akka.stream.Materializer)), [withContentType](HttpEntity.html#withContentType(akka.http.javadsl.model.ContentType)), [withoutSizeLimit](HttpEntity.html#withoutSizeLimit()), [withSizeLimit](HttpEntity.html#withSizeLimit(long))`

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
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.IndefiniteLength.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.IndefiniteLength.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.IndefiniteLength.html)*