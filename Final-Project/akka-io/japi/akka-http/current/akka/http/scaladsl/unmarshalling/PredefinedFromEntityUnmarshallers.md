---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
title: PredefinedFromEntityUnmarshallers
---

# PredefinedFromEntityUnmarshallers

## Content

Package [akka.http.scaladsl.unmarshalling](package-summary.html)
## Interface PredefinedFromEntityUnmarshallers

- All Superinterfaces:
`[MultipartUnmarshallers](MultipartUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`

All Known Implementing Classes:
`[PredefinedFromEntityUnmarshallers$](PredefinedFromEntityUnmarshallers$.html "class in akka.http.scaladsl.unmarshalling")`, `[Unmarshaller$](Unmarshaller$.html "class in akka.http.scaladsl.unmarshalling")`

---

```
public interface PredefinedFromEntityUnmarshallers
extends [MultipartUnmarshallers](MultipartUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​byte[]>` | `[byteArrayUnmarshaller](#byteArrayUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.util.ByteString>` | `[byteStringUnmarshaller](#byteStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​char[]>` | `[charArrayUnmarshaller](#charArrayUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[FormData](../model/FormData.html "class in akka.http.scaladsl.model")>` | `[defaultUrlEncodedFormDataUnmarshaller](#defaultUrlEncodedFormDataUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​java.lang.String>` | `[stringUnmarshaller](#stringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[FormData](../model/FormData.html "class in akka.http.scaladsl.model")>` | `[urlEncodedFormDataUnmarshaller](#urlEncodedFormDataUnmarshaller(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> ranges)` |  |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.unmarshalling.[MultipartUnmarshallers](MultipartUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
		
		
		`[defaultMultipartByteRangesUnmarshaller](MultipartUnmarshallers.html#defaultMultipartByteRangesUnmarshaller(akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings)), [defaultMultipartGeneralUnmarshaller](MultipartUnmarshallers.html#defaultMultipartGeneralUnmarshaller(akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings)), [multipartByteRangesUnmarshaller](MultipartUnmarshallers.html#multipartByteRangesUnmarshaller(akka.http.scaladsl.model.HttpCharset,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings)), [multipartFormDataUnmarshaller](MultipartUnmarshallers.html#multipartFormDataUnmarshaller(akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings)), [multipartGeneralUnmarshaller](MultipartUnmarshallers.html#multipartGeneralUnmarshaller(akka.http.scaladsl.model.HttpCharset,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings)), [multipartUnmarshaller](MultipartUnmarshallers.html#multipartUnmarshaller(akka.http.scaladsl.model.MediaRange,akka.http.scaladsl.model.ContentType,scala.Function2,scala.Function2,scala.Function2,scala.Function2,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings))`

- - ### Method Detail
	
	
	
		- #### byteStringUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.util.ByteString> byteStringUnmarshaller()
		```
		- #### byteArrayUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​byte[]> byteArrayUnmarshaller()
		```
		- #### charArrayUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​char[]> charArrayUnmarshaller()
		```
		- #### stringUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​java.lang.String> stringUnmarshaller()
		```
		- #### defaultUrlEncodedFormDataUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[FormData](../model/FormData.html "class in akka.http.scaladsl.model")> defaultUrlEncodedFormDataUnmarshaller()
		```
		- #### urlEncodedFormDataUnmarshaller
		
		
		
		```
		[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[FormData](../model/FormData.html "class in akka.http.scaladsl.model")> urlEncodedFormDataUnmarshaller​(scala.collection.immutable.Seq<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> ranges)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html)*