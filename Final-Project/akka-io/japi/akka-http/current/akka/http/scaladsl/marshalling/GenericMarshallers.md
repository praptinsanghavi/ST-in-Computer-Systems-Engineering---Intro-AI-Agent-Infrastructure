---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers.html
title: GenericMarshallers
---

# GenericMarshallers

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Interface GenericMarshallers

- All Superinterfaces:
`[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")`

All Known Implementing Classes:
`[GenericMarshallers$](GenericMarshallers$.html "class in akka.http.scaladsl.marshalling")`, `[Marshaller$](Marshaller$.html "class in akka.http.scaladsl.marshalling")`

---

```
public interface GenericMarshallers
extends [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<A1,​A2,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.util.Either<A1,​A2>,​B>` | `[eitherMarshaller](#eitherMarshaller(akka.http.scaladsl.marshalling.Marshaller,akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A1,​B> m1,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A2,​B> m2)` |  |
	| `<A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.concurrent.Future<A>,​B>` | `[futureMarshaller](#futureMarshaller(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m)` |  |
	| `<A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Option<A>,​B>` | `[optionMarshaller](#optionMarshaller(akka.http.scaladsl.marshalling.Marshaller,akka.http.scaladsl.marshalling.EmptyValue))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m,  [EmptyValue](EmptyValue.html "class in akka.http.scaladsl.marshalling")<B> empty)` |  |
	| `<T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.Throwable,​T>` | `[throwableMarshaller](#throwableMarshaller())()` |  |
	| `<A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.util.Try<A>,​B>` | `[tryMarshaller](#tryMarshaller(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m)` |  |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[fromEntityStreamingSupportAndByteStringSourceMarshaller](LowPriorityToResponseMarshallerImplicits.html#fromEntityStreamingSupportAndByteStringSourceMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag)), [fromEntityStreamingSupportAndEntityMarshaller](LowPriorityToResponseMarshallerImplicits.html#fromEntityStreamingSupportAndEntityMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag)), [liftMarshaller](LowPriorityToResponseMarshallerImplicits.html#liftMarshaller(akka.http.scaladsl.marshalling.Marshaller)), [liftMarshallerConversion](LowPriorityToResponseMarshallerImplicits.html#liftMarshallerConversion(akka.http.scaladsl.marshalling.Marshaller))`

- - ### Method Detail
	
	
	
		- #### throwableMarshaller
		
		
		
		```
		<T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.Throwable,​T> throwableMarshaller()
		```
		- #### optionMarshaller
		
		
		
		```
		<A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Option<A>,​B> optionMarshaller​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m,
		                                                                 [EmptyValue](EmptyValue.html "class in akka.http.scaladsl.marshalling")<B> empty)
		```
		- #### eitherMarshaller
		
		
		
		```
		<A1,​A2,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.util.Either<A1,​A2>,​B> eitherMarshaller​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A1,​B> m1,
		                                                                                          [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A2,​B> m2)
		```
		- #### futureMarshaller
		
		
		
		```
		<A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.concurrent.Future<A>,​B> futureMarshaller​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m)
		```
		- #### tryMarshaller
		
		
		
		```
		<A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.util.Try<A>,​B> tryMarshaller​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/EmptyValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/LowPriorityToResponseMarshallerImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers.html)*