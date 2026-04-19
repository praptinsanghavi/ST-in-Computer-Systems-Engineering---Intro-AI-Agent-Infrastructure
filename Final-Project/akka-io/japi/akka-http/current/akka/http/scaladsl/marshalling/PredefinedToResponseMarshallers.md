---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html
title: PredefinedToResponseMarshallers
---

# PredefinedToResponseMarshallers

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Interface PredefinedToResponseMarshallers

- All Superinterfaces:
`[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")`

All Known Implementing Classes:
`[Marshaller$](Marshaller$.html "class in akka.http.scaladsl.marshalling")`, `[PredefinedToResponseMarshallers$](PredefinedToResponseMarshallers$.html "class in akka.http.scaladsl.marshalling")`

---

```
public interface PredefinedToResponseMarshallers
extends [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T,​M>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<T,​M>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromEntityStreamingSupportAndByteStringMarshaller](#fromEntityStreamingSupportAndByteStringMarshaller(scala.reflect.ClassTag,akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller))​(scala.reflect.ClassTag<T> evidence$1,  [EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") s,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​akka.util.ByteString> m)` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromResponse](#fromResponse())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCode](#fromStatusCode())()` | Creates a response for a status code. |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCodeAndHeaders](#fromStatusCodeAndHeaders())()` | Creates a response from status code and headers. |
	| `<T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCodeAndHeadersAndValue](#fromStatusCodeAndHeadersAndValue(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)` |  |
	| `<S,​T>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<S,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCodeAndValue](#fromStatusCodeAndValue(scala.Function1,akka.http.scaladsl.marshalling.Marshaller))​(scala.Function1<S,​[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")> sConv,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)` |  |
	| `<S,​T>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<S,​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCodeConvertibleAndHeadersAndT](#fromStatusCodeConvertibleAndHeadersAndT(scala.Function1,akka.http.scaladsl.marshalling.Marshaller))​(scala.Function1<S,​[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")> sConv,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)` |  |
	| `<T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromToEntityMarshaller](#fromToEntityMarshaller(akka.http.scaladsl.model.StatusCode,scala.collection.immutable.Seq,akka.http.scaladsl.marshalling.Marshaller))​([StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model") status,  scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)` |  |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[fromEntityStreamingSupportAndByteStringSourceMarshaller](LowPriorityToResponseMarshallerImplicits.html#fromEntityStreamingSupportAndByteStringSourceMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag)), [fromEntityStreamingSupportAndEntityMarshaller](LowPriorityToResponseMarshallerImplicits.html#fromEntityStreamingSupportAndEntityMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag)), [liftMarshaller](LowPriorityToResponseMarshallerImplicits.html#liftMarshaller(akka.http.scaladsl.marshalling.Marshaller)), [liftMarshallerConversion](LowPriorityToResponseMarshallerImplicits.html#liftMarshallerConversion(akka.http.scaladsl.marshalling.Marshaller))`

- - ### Method Detail
	
	
	
		- #### fromToEntityMarshaller
		
		
		
		```
		<T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromToEntityMarshaller​([StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model") status,
		                                                            scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                                                            [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)
		```
		- #### fromResponse
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromResponse()
		```
		- #### fromStatusCode
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCode()
		```
		
		Creates a response for a status code. Does not support content\-type negotiation but will return
		 a response either with a `text-plain` entity containing the `status.defaultMessage` or an empty entity
		 for status codes that don't allow a response.
		
		Returns:
		(undocumented)
		- #### fromStatusCodeAndHeaders
		
		
		
		```
		[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCodeAndHeaders()
		```
		
		Creates a response from status code and headers. Does not support content\-type negotiation but will return
		 a response either with a `text-plain` entity containing the `status.defaultMessage` or an empty entity
		 for status codes that don't allow a response.
		
		Returns:
		(undocumented)
		- #### fromStatusCodeAndValue
		
		
		
		```
		<S,​T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<S,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCodeAndValue​(scala.Function1<S,​[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")> sConv,
		                                                                                          [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)
		```
		- #### fromStatusCodeConvertibleAndHeadersAndT
		
		
		
		```
		<S,​T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<S,​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCodeConvertibleAndHeadersAndT​(scala.Function1<S,​[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")> sConv,
		                                                                                                                                                            [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)
		```
		- #### fromStatusCodeAndHeadersAndValue
		
		
		
		```
		<T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCodeAndHeadersAndValue​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)
		```
		- #### fromEntityStreamingSupportAndByteStringMarshaller
		
		
		
		```
		<T,​M> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<T,​M>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromEntityStreamingSupportAndByteStringMarshaller​(scala.reflect.ClassTag<T> evidence$1,
		                                                                                                                                    [EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") s,
		                                                                                                                                    [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​akka.util.ByteString> m)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/LowPriorityToResponseMarshallerImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html)*