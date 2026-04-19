---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html
title: PredefinedToResponseMarshallers$
---

# PredefinedToResponseMarshallers$

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Class PredefinedToResponseMarshallers$

- java.lang.Object
- - akka.http.scaladsl.marshalling.PredefinedToResponseMarshallers$

- All Implemented Interfaces:
`[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")`, `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling")`

---

```
public class PredefinedToResponseMarshallers$
extends java.lang.Object
implements [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PredefinedToResponseMarshallers$](PredefinedToResponseMarshallers$.html "class in akka.http.scaladsl.marshalling")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PredefinedToResponseMarshallers$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromResponse](#fromResponse())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCode](#fromStatusCode())()` | Creates a response for a status code. |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCodeAndHeaders](#fromStatusCodeAndHeaders())()` | Creates a response from status code and headers. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[fromEntityStreamingSupportAndByteStringSourceMarshaller](LowPriorityToResponseMarshallerImplicits.html#fromEntityStreamingSupportAndByteStringSourceMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag)), [fromEntityStreamingSupportAndEntityMarshaller](LowPriorityToResponseMarshallerImplicits.html#fromEntityStreamingSupportAndEntityMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag)), [liftMarshaller](LowPriorityToResponseMarshallerImplicits.html#liftMarshaller(akka.http.scaladsl.marshalling.Marshaller)), [liftMarshallerConversion](LowPriorityToResponseMarshallerImplicits.html#liftMarshallerConversion(akka.http.scaladsl.marshalling.Marshaller))`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[fromEntityStreamingSupportAndByteStringMarshaller](PredefinedToResponseMarshallers.html#fromEntityStreamingSupportAndByteStringMarshaller(scala.reflect.ClassTag,akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller)), [fromStatusCodeAndHeadersAndValue](PredefinedToResponseMarshallers.html#fromStatusCodeAndHeadersAndValue(akka.http.scaladsl.marshalling.Marshaller)), [fromStatusCodeAndValue](PredefinedToResponseMarshallers.html#fromStatusCodeAndValue(scala.Function1,akka.http.scaladsl.marshalling.Marshaller)), [fromStatusCodeConvertibleAndHeadersAndT](PredefinedToResponseMarshallers.html#fromStatusCodeConvertibleAndHeadersAndT(scala.Function1,akka.http.scaladsl.marshalling.Marshaller)), [fromToEntityMarshaller](PredefinedToResponseMarshallers.html#fromToEntityMarshaller(akka.http.scaladsl.model.StatusCode,scala.collection.immutable.Seq,akka.http.scaladsl.marshalling.Marshaller))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PredefinedToResponseMarshallers$](PredefinedToResponseMarshallers$.html "class in akka.http.scaladsl.marshalling") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PredefinedToResponseMarshallers$
		
		
		
		```
		public PredefinedToResponseMarshallers$()
		```

	- ### Method Detail
	
	
	
		- #### fromResponse
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromResponse()
		```
		
		
		Specified by:
		`[fromResponse](PredefinedToResponseMarshallers.html#fromResponse())` in interface `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		- #### fromStatusCode
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCode()
		```
		
		Description copied from interface: `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html#fromStatusCode())`
		Creates a response for a status code. Does not support content\-type negotiation but will return
		 a response either with a `text-plain` entity containing the `status.defaultMessage` or an empty entity
		 for status codes that don't allow a response.
		
		Specified by:
		`[fromStatusCode](PredefinedToResponseMarshallers.html#fromStatusCode())` in interface `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		Returns:
		(undocumented)
		- #### fromStatusCodeAndHeaders
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCodeAndHeaders()
		```
		
		Description copied from interface: `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html#fromStatusCodeAndHeaders())`
		Creates a response from status code and headers. Does not support content\-type negotiation but will return
		 a response either with a `text-plain` entity containing the `status.defaultMessage` or an empty entity
		 for status codes that don't allow a response.
		
		Specified by:
		`[fromStatusCodeAndHeaders](PredefinedToResponseMarshallers.html#fromStatusCodeAndHeaders())` in interface `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/LowPriorityToResponseMarshallerImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html)*