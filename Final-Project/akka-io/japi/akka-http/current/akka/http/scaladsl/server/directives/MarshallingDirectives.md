---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/MarshallingDirectives.html
title: MarshallingDirectives
---

# MarshallingDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface MarshallingDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`, `[FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "interface in akka.http.scaladsl.server.directives")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`, `[MarshallingDirectives$](MarshallingDirectives$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface MarshallingDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>` | `[as](#as(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​T> um)` | Returns the in\-scope `FromRequestUnmarshaller` for the given type. |
	| `<T> scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>>` | `[completeWith](#completeWith(akka.http.scaladsl.marshalling.Marshaller,scala.Function1))​([Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> marshaller,  scala.Function1<scala.Function1<T,​scala.runtime.BoxedUnit>,​scala.runtime.BoxedUnit> inner)` | Uses the marshaller for the given type to produce a completion function that is passed to its inner function. |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[entity](#entity(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​T> um)` | Unmarshalls the requests entity to the given type passes it to its inner Route. |
	| `<A,​B>scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>>` | `[handleWith](#handleWith(scala.Function1,akka.http.scaladsl.unmarshalling.Unmarshaller,akka.http.scaladsl.marshalling.Marshaller))​(scala.Function1<A,​B> f,  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​A> um,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<B,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> m)` | Completes the request using the given function. |
	| `<T> [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[instanceOf](#instanceOf(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> m)` | Returns the in\-scope Marshaller for the given type. |

- - ### Method Detail
	
	
	
		- #### entity
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> entity​([Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​T> um)
		```
		
		Unmarshalls the requests entity to the given type passes it to its inner Route.
		 If there is a problem with unmarshalling the request is rejected with the `Rejection`
		 produced by the unmarshaller.
		 
		
		Parameters:
		`um` \- (undocumented)
		Returns:
		(undocumented)
		- #### as
		
		
		
		```
		<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​T> as​([Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​T> um)
		```
		
		Returns the in\-scope `FromRequestUnmarshaller` for the given type.
		 
		
		Parameters:
		`um` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeWith
		
		
		
		```
		<T> scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> completeWith​([Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> marshaller,
		                                                                                            scala.Function1<scala.Function1<T,​scala.runtime.BoxedUnit>,​scala.runtime.BoxedUnit> inner)
		```
		
		Uses the marshaller for the given type to produce a completion function that is passed to its inner function.
		 You can use it do decouple marshaller resolution from request completion.
		 
		
		Parameters:
		`marshaller` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### instanceOf
		
		
		
		```
		<T> [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> instanceOf​([Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> m)
		```
		
		Returns the in\-scope Marshaller for the given type.
		 
		
		Parameters:
		`m` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleWith
		
		
		
		```
		<A,​B> scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> handleWith​(scala.Function1<A,​B> f,
		                                                                                                  [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​A> um,
		                                                                                                  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<B,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> m)
		```
		
		Completes the request using the given function. The input to the function is produced with the in\-scope
		 entity unmarshaller and the result value of the function is marshalled with the in\-scope marshaller.
		 
		
		Parameters:
		`f` \- (undocumented)
		`um` \- (undocumented)
		`m` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/MarshallingDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/MarshallingDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/MarshallingDirectives.html)*