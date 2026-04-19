---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html
title: FramedEntityStreamingDirectives
---

# FramedEntityStreamingDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface FramedEntityStreamingDirectives

- All Superinterfaces:
`[MarshallingDirectives](MarshallingDirectives.html "interface in akka.http.scaladsl.server.directives")`

All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface FramedEntityStreamingDirectives
extends [MarshallingDirectives](MarshallingDirectives.html "interface in akka.http.scaladsl.server.directives")
```

Allows the `MarshallingDirectives.entity` directive to extract a `Source` of elements.
 
 See `common.EntityStreamingSupport` for useful default framing `Flow` instances and
 support traits such as `SprayJsonSupport` (or your other favourite JSON library) to provide the needed `Marshaller` s.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<T,​akka.NotUsed>>` | `[asSourceOf](#asSourceOf(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.unmarshalling.Unmarshaller))​([EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") support,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T> um)` | Extracts entity as `Source` of elements of type `T`. |
	| `<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<T,​akka.NotUsed>>` | `[asSourceOf](#asSourceOf(akka.http.scaladsl.unmarshalling.Unmarshaller,akka.http.scaladsl.common.EntityStreamingSupport))​([Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T> um,  [EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") support)` | Extracts entity as `Source` of elements of type `T`. |
	| `<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<T,​akka.NotUsed>>` | `[asSourceOfInternal](#asSourceOfInternal(akka.http.scaladsl.unmarshalling.Unmarshaller,akka.http.scaladsl.common.EntityStreamingSupport))​([Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T> um,  [EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") support)` |  |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[MarshallingDirectives](MarshallingDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[as](MarshallingDirectives.html#as(akka.http.scaladsl.unmarshalling.Unmarshaller)), [completeWith](MarshallingDirectives.html#completeWith(akka.http.scaladsl.marshalling.Marshaller,scala.Function1)), [entity](MarshallingDirectives.html#entity(akka.http.scaladsl.unmarshalling.Unmarshaller)), [handleWith](MarshallingDirectives.html#handleWith(scala.Function1,akka.http.scaladsl.unmarshalling.Unmarshaller,akka.http.scaladsl.marshalling.Marshaller)), [instanceOf](MarshallingDirectives.html#instanceOf(akka.http.scaladsl.marshalling.Marshaller))`

- - ### Method Detail
	
	
	
		- #### asSourceOf
		
		
		
		```
		<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<T,​akka.NotUsed>> asSourceOf​([Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T> um,
		                                                                                                 [EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") support)
		```
		
		Extracts entity as `Source` of elements of type `T`.
		 This is achieved by applying the implicitly provided (in the following order):
		 
		 \- 1st: chunk\-up the incoming `ByteString`s by applying the `Content-Type`\-aware framing
		 \- 2nd: apply the `Unmarshaller` (from `ByteString` to `T`) for each of the respective "chunks" (e.g. for each JSON element contained within an array).
		 
		
		
		 The request will be rejected with an [`UnsupportedRequestContentTypeRejection`](../UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") if
		 its `ContentType` is not supported by the used `framing` or `unmarshaller`.
		 
		
		
		 Cancelling extracted `Source` closes the connection abruptly (same as cancelling the `entity.dataBytes`).
		 
		
		
		 See also `MiscDirectives.withoutSizeLimit` as you may want to allow streaming infinite streams of data in this route.
		 By default the uploaded data is limited by the `akka.http.parsing.max-content-length`.
		
		
		
		Parameters:
		`um` \- (undocumented)
		`support` \- (undocumented)
		Returns:
		(undocumented)
		- #### asSourceOf
		
		
		
		```
		<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<T,​akka.NotUsed>> asSourceOf​([EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") support,
		                                                                                                 [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T> um)
		```
		
		Extracts entity as `Source` of elements of type `T`.
		 This is achieved by applying the implicitly provided (in the following order):
		 
		 \- 1st: chunk\-up the incoming `ByteString`s by applying the `Content-Type`\-aware framing
		 \- 2nd: apply the `Unmarshaller` (from `ByteString` to `T`) for each of the respective "chunks" (e.g. for each JSON element contained within an array).
		 
		
		
		 The request will be rejected with an [`UnsupportedRequestContentTypeRejection`](../UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") if
		 its `ContentType` is not supported by the used `framing` or `unmarshaller`.
		 
		
		
		 Cancelling extracted `Source` closes the connection abruptly (same as cancelling the `entity.dataBytes`).
		 
		
		
		 See also `MiscDirectives.withoutSizeLimit` as you may want to allow streaming infinite streams of data in this route.
		 By default the uploaded data is limited by the `akka.http.parsing.max-content-length`.
		
		
		
		Parameters:
		`support` \- (undocumented)
		`um` \- (undocumented)
		Returns:
		(undocumented)
		- #### asSourceOfInternal
		
		
		
		```
		<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<T,​akka.NotUsed>> asSourceOfInternal​([Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T> um,
		                                                                                                         [EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") support)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/MarshallingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html)*