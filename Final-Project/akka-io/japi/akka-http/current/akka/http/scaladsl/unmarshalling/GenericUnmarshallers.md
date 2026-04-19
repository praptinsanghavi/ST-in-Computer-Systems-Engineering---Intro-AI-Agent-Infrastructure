---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
title: GenericUnmarshallers
---

# GenericUnmarshallers

## Content

Package [akka.http.scaladsl.unmarshalling](package-summary.html)
## Interface GenericUnmarshallers

- All Superinterfaces:
`[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`

All Known Implementing Classes:
`[Unmarshaller$](Unmarshaller$.html "class in akka.http.scaladsl.unmarshalling")`

---

```
public interface GenericUnmarshallers
extends [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​scala.Option<B>>` | `[liftToTargetOptionUnmarshaller](#liftToTargetOptionUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> um)` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​scala.Option<B>>` | `[targetOptionUnmarshaller](#targetOptionUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> um)` |  |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.unmarshalling.[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
		
		
		`[eitherUnmarshaller](LowerPriorityGenericUnmarshallers.html#eitherUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller,scala.reflect.ClassTag,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.reflect.ClassTag)), [liftToSourceOptionUnmarshaller](LowerPriorityGenericUnmarshallers.html#liftToSourceOptionUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller)), [messageUnmarshallerFromEntityUnmarshaller](LowerPriorityGenericUnmarshallers.html#messageUnmarshallerFromEntityUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller)), [sourceOptionUnmarshaller](LowerPriorityGenericUnmarshallers.html#sourceOptionUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller))`

- - ### Method Detail
	
	
	
		- #### liftToTargetOptionUnmarshaller
		
		
		
		```
		<A,​B> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​scala.Option<B>> liftToTargetOptionUnmarshaller​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> um)
		```
		- #### targetOptionUnmarshaller
		
		
		
		```
		<A,​B> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​scala.Option<B>> targetOptionUnmarshaller​([Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> um)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html)*