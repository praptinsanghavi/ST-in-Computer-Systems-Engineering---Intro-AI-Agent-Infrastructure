---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html
title: PredefinedToRequestMarshallers$
---

# PredefinedToRequestMarshallers$

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Class PredefinedToRequestMarshallers$

- java.lang.Object
- - akka.http.scaladsl.marshalling.PredefinedToRequestMarshallers$

- All Implemented Interfaces:
`[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html "interface in akka.http.scaladsl.marshalling")`

---

```
public class PredefinedToRequestMarshallers$
extends java.lang.Object
implements [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html "interface in akka.http.scaladsl.marshalling")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PredefinedToRequestMarshallers$](PredefinedToRequestMarshallers$.html "class in akka.http.scaladsl.marshalling")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PredefinedToRequestMarshallers$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[fromRequest](#fromRequest())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[fromMethodAndUriAndHeadersAndValue](PredefinedToRequestMarshallers.html#fromMethodAndUriAndHeadersAndValue(akka.http.scaladsl.marshalling.Marshaller)), [fromMethodAndUriAndValue](PredefinedToRequestMarshallers.html#fromMethodAndUriAndValue(akka.http.scaladsl.marshalling.Marshaller)), [fromUri](PredefinedToRequestMarshallers.html#fromUri())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PredefinedToRequestMarshallers$](PredefinedToRequestMarshallers$.html "class in akka.http.scaladsl.marshalling") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PredefinedToRequestMarshallers$
		
		
		
		```
		public PredefinedToRequestMarshallers$()
		```

	- ### Method Detail
	
	
	
		- #### fromRequest
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> fromRequest()
		```
		
		
		Specified by:
		`[fromRequest](PredefinedToRequestMarshallers.html#fromRequest())` in interface `[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html "interface in akka.http.scaladsl.marshalling")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html)*