---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling$.html
title: EventStreamMarshalling$
---

# EventStreamMarshalling$

## Content

Package [akka.http.scaladsl.marshalling.sse](package-summary.html)
## Class EventStreamMarshalling$

- java.lang.Object
- - akka.http.scaladsl.marshalling.sse.EventStreamMarshalling$

- All Implemented Interfaces:
`[EventStreamMarshalling](EventStreamMarshalling.html "interface in akka.http.scaladsl.marshalling.sse")`

---

```
public class EventStreamMarshalling$
extends java.lang.Object
implements [EventStreamMarshalling](EventStreamMarshalling.html "interface in akka.http.scaladsl.marshalling.sse")
```

Importing `EventStreamMarshalling.toEventStream` lets a source of `ServerSentEvent`s be marshalled to a
 `HttpEntity` and hence as a `HttpResponse`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventStreamMarshalling$](EventStreamMarshalling$.html "class in akka.http.scaladsl.marshalling.sse")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventStreamMarshalling$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Marshaller](../Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​java.lang.Object>,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[toEventStream](#toEventStream())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventStreamMarshalling$](EventStreamMarshalling$.html "class in akka.http.scaladsl.marshalling.sse") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventStreamMarshalling$
		
		
		
		```
		public EventStreamMarshalling$()
		```

	- ### Method Detail
	
	
	
		- #### toEventStream
		
		
		
		```
		public final [Marshaller](../Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​java.lang.Object>,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> toEventStream()
		```
		
		
		Specified by:
		`[toEventStream](EventStreamMarshalling.html#toEventStream())` in interface `[EventStreamMarshalling](EventStreamMarshalling.html "interface in akka.http.scaladsl.marshalling.sse")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/sse/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling$.html)*