---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html
title: MultipartMarshallers
---

# MultipartMarshallers

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Interface MultipartMarshallers

- All Known Subinterfaces:
`[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")`

All Known Implementing Classes:
`[Marshaller$](Marshaller$.html "class in akka.http.scaladsl.marshalling")`, `[MultipartMarshallers$](MultipartMarshallers$.html "class in akka.http.scaladsl.marshalling")`, `[PredefinedToEntityMarshallers$](PredefinedToEntityMarshallers$.html "class in akka.http.scaladsl.marshalling")`

---

```
public interface MultipartMarshallers
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[multipartBoundaryLength](#multipartBoundaryLength())()` | The length of randomly generated multipart boundaries (before base64 encoding). |
	| `java.util.Random` | `[multipartBoundaryRandom](#multipartBoundaryRandom())()` | The random instance that is used to create multipart boundaries. |
	| `<T extends [Multipart](../model/Multipart.html "interface in akka.http.scaladsl.model")>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[multipartMarshaller](#multipartMarshaller(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter log)` |  |
	| `java.lang.String` | `[randomBoundary](#randomBoundary())()` | The method used to create boundaries in `multipartMarshaller`. |

- - ### Method Detail
	
	
	
		- #### multipartMarshaller
		
		
		
		```
		<T extends [Multipart](../model/Multipart.html "interface in akka.http.scaladsl.model")> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> multipartMarshaller​(akka.event.LoggingAdapter log)
		```
		- #### multipartBoundaryRandom
		
		
		
		```
		java.util.Random multipartBoundaryRandom()
		```
		
		The random instance that is used to create multipart boundaries. This can be overridden (e.g. in tests) to
		 choose how a boundary is created.
		
		Returns:
		(undocumented)
		- #### multipartBoundaryLength
		
		
		
		```
		int multipartBoundaryLength()
		```
		
		The length of randomly generated multipart boundaries (before base64 encoding). Can be overridden
		 to configure.
		
		Returns:
		(undocumented)
		- #### randomBoundary
		
		
		
		```
		java.lang.String randomBoundary()
		```
		
		The method used to create boundaries in `multipartMarshaller`. Can be overridden to create custom boundaries.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html)*