---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html
title: MultipartUnmarshallers
---

# MultipartUnmarshallers

## Content

Package [akka.http.scaladsl.unmarshalling](package-summary.html)
## Interface MultipartUnmarshallers

- All Known Subinterfaces:
`[PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`

All Known Implementing Classes:
`[MultipartUnmarshallers$](MultipartUnmarshallers$.html "class in akka.http.scaladsl.unmarshalling")`, `[PredefinedFromEntityUnmarshallers$](PredefinedFromEntityUnmarshallers$.html "class in akka.http.scaladsl.unmarshalling")`, `[Unmarshaller$](Unmarshaller$.html "class in akka.http.scaladsl.unmarshalling")`

---

```
public interface MultipartUnmarshallers
```

Provides [`Multipart`](../model/Multipart.html "interface in akka.http.scaladsl.model") marshallers.
 It is possible to configure the default parsing mode by providing an implicit [`ParserSettings`](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") instance.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.ByteRanges](../model/Multipart.ByteRanges.html "class in akka.http.scaladsl.model")>` | `[defaultMultipartByteRangesUnmarshaller](#defaultMultipartByteRangesUnmarshaller(akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings))​(akka.event.LoggingAdapter log,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.General](../model/Multipart.General.html "class in akka.http.scaladsl.model")>` | `[defaultMultipartGeneralUnmarshaller](#defaultMultipartGeneralUnmarshaller(akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings))​(akka.event.LoggingAdapter log,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.ByteRanges](../model/Multipart.ByteRanges.html "class in akka.http.scaladsl.model")>` | `[multipartByteRangesUnmarshaller](#multipartByteRangesUnmarshaller(akka.http.scaladsl.model.HttpCharset,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings))​([HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model") defaultCharset,  akka.event.LoggingAdapter log,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.FormData](../model/Multipart.FormData.html "class in akka.http.scaladsl.model")>` | `[multipartFormDataUnmarshaller](#multipartFormDataUnmarshaller(akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings))​(akka.event.LoggingAdapter log,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.General](../model/Multipart.General.html "class in akka.http.scaladsl.model")>` | `[multipartGeneralUnmarshaller](#multipartGeneralUnmarshaller(akka.http.scaladsl.model.HttpCharset,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings))​([HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model") defaultCharset,  akka.event.LoggingAdapter log,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)` |  |
	| `<T extends [Multipart](../model/Multipart.html "interface in akka.http.scaladsl.model"),​BP extends [Multipart.BodyPart](../model/Multipart.BodyPart.html "interface in akka.http.scaladsl.model"),​BPS extends [Multipart.BodyPart.Strict](../../javadsl/model/Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model")>[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T>` | `[multipartUnmarshaller](#multipartUnmarshaller(akka.http.scaladsl.model.MediaRange,akka.http.scaladsl.model.ContentType,scala.Function2,scala.Function2,scala.Function2,scala.Function2,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings))​([MediaRange](../model/MediaRange.html "class in akka.http.scaladsl.model") mediaRange,  [ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") defaultContentType,  scala.Function2<[BodyPartEntity](../model/BodyPartEntity.html "interface in akka.http.scaladsl.model"),​scala.collection.immutable.List<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​BP> createBodyPart,  scala.Function2<[MediaType.Multipart](../model/MediaType.Multipart.html "class in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<BP,​java.lang.Object>,​T> createStreamed,  scala.Function2<[HttpEntity.Strict](../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.List<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​BPS> createStrictBodyPart,  scala.Function2<[MediaType.Multipart](../model/MediaType.Multipart.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<BPS>,​T> createStrict,  akka.event.LoggingAdapter log,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)` |  |

- - ### Method Detail
	
	
	
		- #### defaultMultipartGeneralUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.General](../model/Multipart.General.html "class in akka.http.scaladsl.model")> defaultMultipartGeneralUnmarshaller​(akka.event.LoggingAdapter log,
		                                                                                     [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)
		```
		- #### multipartGeneralUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.General](../model/Multipart.General.html "class in akka.http.scaladsl.model")> multipartGeneralUnmarshaller​([HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model") defaultCharset,
		                                                                              akka.event.LoggingAdapter log,
		                                                                              [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)
		```
		- #### multipartFormDataUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.FormData](../model/Multipart.FormData.html "class in akka.http.scaladsl.model")> multipartFormDataUnmarshaller​(akka.event.LoggingAdapter log,
		                                                                                [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)
		```
		- #### defaultMultipartByteRangesUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.ByteRanges](../model/Multipart.ByteRanges.html "class in akka.http.scaladsl.model")> defaultMultipartByteRangesUnmarshaller​(akka.event.LoggingAdapter log,
		                                                                                           [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)
		```
		- #### multipartByteRangesUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.ByteRanges](../model/Multipart.ByteRanges.html "class in akka.http.scaladsl.model")> multipartByteRangesUnmarshaller​([HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model") defaultCharset,
		                                                                                    akka.event.LoggingAdapter log,
		                                                                                    [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)
		```
		- #### multipartUnmarshaller
		
		
		
		```
		<T extends [Multipart](../model/Multipart.html "interface in akka.http.scaladsl.model"),​BP extends [Multipart.BodyPart](../model/Multipart.BodyPart.html "interface in akka.http.scaladsl.model"),​BPS extends [Multipart.BodyPart.Strict](../../javadsl/model/Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model")> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> multipartUnmarshaller​([MediaRange](../model/MediaRange.html "class in akka.http.scaladsl.model") mediaRange,
		                                                                                                                                                             [ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") defaultContentType,
		                                                                                                                                                             scala.Function2<[BodyPartEntity](../model/BodyPartEntity.html "interface in akka.http.scaladsl.model"),​scala.collection.immutable.List<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​BP> createBodyPart,
		                                                                                                                                                             scala.Function2<[MediaType.Multipart](../model/MediaType.Multipart.html "class in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<BP,​java.lang.Object>,​T> createStreamed,
		                                                                                                                                                             scala.Function2<[HttpEntity.Strict](../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.List<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​BPS> createStrictBodyPart,
		                                                                                                                                                             scala.Function2<[MediaType.Multipart](../model/MediaType.Multipart.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<BPS>,​T> createStrict,
		                                                                                                                                                             akka.event.LoggingAdapter log,
		                                                                                                                                                             [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.BodyPart.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.BodyPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.ByteRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.General.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html)*