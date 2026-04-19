---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshalling/sse/EventStreamMarshalling$.html
title: EventStreamMarshalling$
---

# EventStreamMarshalling$

## Content

Package [akka.http.javadsl.marshalling.sse](package-summary.html)
## Class EventStreamMarshalling$

- java.lang.Object
- - akka.http.javadsl.marshalling.sse.EventStreamMarshalling$

- ---

```
public class EventStreamMarshalling$
extends java.lang.Object
```

Using `eventStreamMarshaller` lets a source of `ServerSentEvent`s be marshalled to a `HttpResponse`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventStreamMarshalling$](EventStreamMarshalling$.html "class in akka.http.javadsl.marshalling.sse")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventStreamMarshalling$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Marshaller](../Marshaller.html "class in akka.http.javadsl.marshalling")<akka.stream.javadsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse"),​akka.NotUsed>,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[toEventStream](#toEventStream())()` | Lets a source of `ServerSentEvent`s be marshalled to a `HttpResponse`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventStreamMarshalling$](EventStreamMarshalling$.html "class in akka.http.javadsl.marshalling.sse") MODULE$
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
		public [Marshaller](../Marshaller.html "class in akka.http.javadsl.marshalling")<akka.stream.javadsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse"),​akka.NotUsed>,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> toEventStream()
		```
		
		Lets a source of `ServerSentEvent`s be marshalled to a `HttpResponse`.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshalling/sse/EventStreamMarshalling$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshalling/sse/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/sse/ServerSentEvent.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshalling/sse/EventStreamMarshalling$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshalling/sse/EventStreamMarshalling$.html)*