---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html
title: LowerPriorityGenericUnmarshallers
---

# LowerPriorityGenericUnmarshallers

## Content

Package [akka.http.scaladsl.unmarshalling](package-summary.html)
## Interface LowerPriorityGenericUnmarshallers

- All Known Subinterfaces:
`[GenericUnmarshallers](GenericUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`

All Known Implementing Classes:
`[Unmarshaller$](Unmarshaller$.html "class in akka.http.scaladsl.unmarshalling")`

---

```
public interface LowerPriorityGenericUnmarshallers
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<L,​R>[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​scala.util.Either<L,​R>>` | `[eitherUnmarshaller](#eitherUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller,scala.reflect.ClassTag,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.reflect.ClassTag))​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​L> ua,  scala.reflect.ClassTag<R> rightTag,  [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​R> ub,  scala.reflect.ClassTag<L> leftTag)` | Enables using `Either` to encode the following unmarshalling logic:  Attempt unmarshalling the entity as as `R` first (yielding `R`),  and if it fails attempt unmarshalling as `L` (yielding `Left`). |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<A>,​B>` | `[liftToSourceOptionUnmarshaller](#liftToSourceOptionUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> um)` |  |
	| `<T> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​T>` | `[messageUnmarshallerFromEntityUnmarshaller](#messageUnmarshallerFromEntityUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> um)` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<A>,​B>` | `[sourceOptionUnmarshaller](#sourceOptionUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> um)` |  |

- - ### Method Detail
	
	
	
		- #### messageUnmarshallerFromEntityUnmarshaller
		
		
		
		```
		<T> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​T> messageUnmarshallerFromEntityUnmarshaller​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> um)
		```
		- #### liftToSourceOptionUnmarshaller
		
		
		
		```
		<A,​B> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<A>,​B> liftToSourceOptionUnmarshaller​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> um)
		```
		- #### sourceOptionUnmarshaller
		
		
		
		```
		<A,​B> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<scala.Option<A>,​B> sourceOptionUnmarshaller​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> um)
		```
		- #### eitherUnmarshaller
		
		
		
		```
		<L,​R> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​scala.util.Either<L,​R>> eitherUnmarshaller​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​L> ua,
		                                                                                           scala.reflect.ClassTag<R> rightTag,
		                                                                                           [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​R> ub,
		                                                                                           scala.reflect.ClassTag<L> leftTag)
		```
		
		Enables using `Either` to encode the following unmarshalling logic:
		 Attempt unmarshalling the entity as as `R` first (yielding `R`),
		 and if it fails attempt unmarshalling as `L` (yielding `Left`).
		 
		 The either unmarshaller only works with strict entities, so make sure to wrap routes that want to use it with
		 `toStrictEntity`. Otherwise, if a non\-strict entity is provided, it will fail with an `IllegalArgumentException`.
		 
		
		
		 Note that the Either's "R" type will be attempted first (as Left is often considered as the "failed case" in Either).
		
		
		
		Parameters:
		`ua` \- (undocumented)
		`rightTag` \- (undocumented)
		`ub` \- (undocumented)
		`leftTag` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html)*