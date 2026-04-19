---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html
title: PredefinedToEntityMarshallers
---

# PredefinedToEntityMarshallers

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Interface PredefinedToEntityMarshallers

- All Superinterfaces:
`[MultipartMarshallers](MultipartMarshallers.html "interface in akka.http.scaladsl.marshalling")`

All Known Implementing Classes:
`[Marshaller$](Marshaller$.html "class in akka.http.scaladsl.marshalling")`, `[PredefinedToEntityMarshallers$](PredefinedToEntityMarshallers$.html "class in akka.http.scaladsl.marshalling")`

---

```
public interface PredefinedToEntityMarshallers
extends [MultipartMarshallers](MultipartMarshallers.html "interface in akka.http.scaladsl.marshalling")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[byteArrayMarshaller](#byteArrayMarshaller(akka.http.scaladsl.model.ContentType))​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[ByteArrayMarshaller](#ByteArrayMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[byteStringMarshaller](#byteStringMarshaller(akka.http.scaladsl.model.ContentType))​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[ByteStringMarshaller](#ByteStringMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[charArrayMarshaller](#charArrayMarshaller(akka.http.scaladsl.model.MediaType.WithFixedCharset))​([MediaType.WithFixedCharset](../model/MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[charArrayMarshaller](#charArrayMarshaller(akka.http.scaladsl.model.MediaType.WithOpenCharset))​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[CharArrayMarshaller](#CharArrayMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.Done,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[DoneMarshaller](#DoneMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[FormData](../model/FormData.html "class in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[FormDataMarshaller](#FormDataMarshaller())()` |  |
	| `[HttpEntity.Strict](../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[marshalCharArray](#marshalCharArray(char%5B%5D,akka.http.scaladsl.model.ContentType.NonBinary))​(char[] value,  [ContentType.NonBinary](../model/ContentType.NonBinary.html "interface in akka.http.scaladsl.model") contentType)` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[MessageEntityMarshaller](#MessageEntityMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[stringMarshaller](#stringMarshaller(akka.http.scaladsl.model.MediaType.WithFixedCharset))​([MediaType.WithFixedCharset](../model/MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[stringMarshaller](#stringMarshaller(akka.http.scaladsl.model.MediaType.WithOpenCharset))​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[StringMarshaller](#StringMarshaller())()` |  |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[MultipartMarshallers](MultipartMarshallers.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[multipartBoundaryLength](MultipartMarshallers.html#multipartBoundaryLength()), [multipartBoundaryRandom](MultipartMarshallers.html#multipartBoundaryRandom()), [multipartMarshaller](MultipartMarshallers.html#multipartMarshaller(akka.event.LoggingAdapter)), [randomBoundary](MultipartMarshallers.html#randomBoundary())`

- - ### Method Detail
	
	
	
		- #### ByteArrayMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> ByteArrayMarshaller()
		```
		- #### byteArrayMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> byteArrayMarshaller​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```
		- #### ByteStringMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> ByteStringMarshaller()
		```
		- #### byteStringMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> byteStringMarshaller​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```
		- #### CharArrayMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> CharArrayMarshaller()
		```
		- #### charArrayMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> charArrayMarshaller​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### charArrayMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> charArrayMarshaller​([MediaType.WithFixedCharset](../model/MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### marshalCharArray
		
		
		
		```
		[HttpEntity.Strict](../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model") marshalCharArray​(char[] value,
		                                   [ContentType.NonBinary](../model/ContentType.NonBinary.html "interface in akka.http.scaladsl.model") contentType)
		```
		- #### DoneMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.Done,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> DoneMarshaller()
		```
		- #### StringMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> StringMarshaller()
		```
		- #### stringMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> stringMarshaller​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### stringMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> stringMarshaller​([MediaType.WithFixedCharset](../model/MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### FormDataMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[FormData](../model/FormData.html "class in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> FormDataMarshaller()
		```
		- #### MessageEntityMarshaller
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> MessageEntityMarshaller()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html)*