---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers$.html
title: GenericMarshallers$
---

# GenericMarshallers$

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Class GenericMarshallers$

- java.lang.Object
- - akka.http.scaladsl.marshalling.GenericMarshallers$

- All Implemented Interfaces:
`[GenericMarshallers](GenericMarshallers.html "interface in akka.http.scaladsl.marshalling")`, `[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")`

---

```
public class GenericMarshallers$
extends java.lang.Object
implements [GenericMarshallers](GenericMarshallers.html "interface in akka.http.scaladsl.marshalling")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GenericMarshallers$](GenericMarshallers$.html "class in akka.http.scaladsl.marshalling")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GenericMarshallers$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[GenericMarshallers](GenericMarshallers.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[eitherMarshaller](GenericMarshallers.html#eitherMarshaller(akka.http.scaladsl.marshalling.Marshaller,akka.http.scaladsl.marshalling.Marshaller)), [futureMarshaller](GenericMarshallers.html#futureMarshaller(akka.http.scaladsl.marshalling.Marshaller)), [optionMarshaller](GenericMarshallers.html#optionMarshaller(akka.http.scaladsl.marshalling.Marshaller,akka.http.scaladsl.marshalling.EmptyValue)), [throwableMarshaller](GenericMarshallers.html#throwableMarshaller()), [tryMarshaller](GenericMarshallers.html#tryMarshaller(akka.http.scaladsl.marshalling.Marshaller))`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[fromEntityStreamingSupportAndByteStringSourceMarshaller](LowPriorityToResponseMarshallerImplicits.html#fromEntityStreamingSupportAndByteStringSourceMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag)), [fromEntityStreamingSupportAndEntityMarshaller](LowPriorityToResponseMarshallerImplicits.html#fromEntityStreamingSupportAndEntityMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag)), [liftMarshaller](LowPriorityToResponseMarshallerImplicits.html#liftMarshaller(akka.http.scaladsl.marshalling.Marshaller)), [liftMarshallerConversion](LowPriorityToResponseMarshallerImplicits.html#liftMarshallerConversion(akka.http.scaladsl.marshalling.Marshaller))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GenericMarshallers$](GenericMarshallers$.html "class in akka.http.scaladsl.marshalling") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GenericMarshallers$
		
		
		
		```
		public GenericMarshallers$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/LowPriorityToResponseMarshallerImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers$.html)*