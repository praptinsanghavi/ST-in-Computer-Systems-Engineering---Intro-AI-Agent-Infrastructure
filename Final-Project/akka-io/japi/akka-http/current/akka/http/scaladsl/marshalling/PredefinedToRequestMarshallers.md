---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html
title: PredefinedToRequestMarshallers
---

# PredefinedToRequestMarshallers

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Interface PredefinedToRequestMarshallers

- All Known Implementing Classes:
`[Marshaller$](Marshaller$.html "class in akka.http.scaladsl.marshalling")`, `[PredefinedToRequestMarshallers$](PredefinedToRequestMarshallers$.html "class in akka.http.scaladsl.marshalling")`

---

```
public interface PredefinedToRequestMarshallers
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple4<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model"),​[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[fromMethodAndUriAndHeadersAndValue](#fromMethodAndUriAndHeadersAndValue(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)` |  |
	| `<S,​T>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model"),​[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​T>,​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[fromMethodAndUriAndValue](#fromMethodAndUriAndValue(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[fromRequest](#fromRequest())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[fromUri](#fromUri())()` |  |

- - ### Method Detail
	
	
	
		- #### fromRequest
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> fromRequest()
		```
		- #### fromUri
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> fromUri()
		```
		- #### fromMethodAndUriAndValue
		
		
		
		```
		<S,​T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model"),​[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​T>,​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> fromMethodAndUriAndValue​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)
		```
		- #### fromMethodAndUriAndHeadersAndValue
		
		
		
		```
		<T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple4<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model"),​[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> fromMethodAndUriAndHeadersAndValue​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html)*