---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling$.html
title: EventStreamUnmarshalling$
---

# EventStreamUnmarshalling$

## Content

Package [akka.http.scaladsl.unmarshalling.sse](package-summary.html)
## Class EventStreamUnmarshalling$

- java.lang.Object
- - akka.http.scaladsl.unmarshalling.sse.EventStreamUnmarshalling$

- All Implemented Interfaces:
`[EventStreamUnmarshalling](EventStreamUnmarshalling.html "interface in akka.http.scaladsl.unmarshalling.sse")`

---

```
public class EventStreamUnmarshalling$
extends java.lang.Object
implements [EventStreamUnmarshalling](EventStreamUnmarshalling.html "interface in akka.http.scaladsl.unmarshalling.sse")
```

Importing `EventStreamUnmarshalling.fromEventsStream` lets an `HttpEntity` with a `text/event-stream` media type be
 unmarshalled to a source of `ServerSentEvent`s.
 
 The maximum size for parsing server\-sent events is 8KiB. The maximum size for parsing lines of a server\-sent event
 is 4KiB. If you need to customize any of these, set the `akka.http.sse.max-event-size` and
 `akka.http.sse.max-line-size` properties respectively.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventStreamUnmarshalling$](EventStreamUnmarshalling$.html "class in akka.http.scaladsl.unmarshalling.sse")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventStreamUnmarshalling$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Unmarshaller](../Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>>` | `[fromEventStream](#fromEventStream())()` | Deprecated. Binary compatibility method. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.unmarshalling.sse.[EventStreamUnmarshalling](EventStreamUnmarshalling.html "interface in akka.http.scaladsl.unmarshalling.sse")
		
		
		`[fromEventsStream](EventStreamUnmarshalling.html#fromEventsStream(int,int,boolean)), [fromEventsStream](EventStreamUnmarshalling.html#fromEventsStream(akka.actor.ActorSystem)), [fromEventsStream](EventStreamUnmarshalling.html#fromEventsStream(akka.http.scaladsl.settings.ServerSentEventSettings)), [maxEventSize](EventStreamUnmarshalling.html#maxEventSize()), [maxLineSize](EventStreamUnmarshalling.html#maxLineSize())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventStreamUnmarshalling$](EventStreamUnmarshalling$.html "class in akka.http.scaladsl.unmarshalling.sse") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventStreamUnmarshalling$
		
		
		
		```
		public EventStreamUnmarshalling$()
		```

	- ### Method Detail
	
	
	
		- #### fromEventStream
		
		
		
		```
		public final [Unmarshaller](../Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>> fromEventStream()
		```
		
		Deprecated.
		Binary compatibility method. Invocations should have an implicit ActorSystem in scope to provide access to configuration. Since 10\.1\.8\.
		
		
		Specified by:
		`[fromEventStream](EventStreamUnmarshalling.html#fromEventStream())` in interface `[EventStreamUnmarshalling](EventStreamUnmarshalling.html "interface in akka.http.scaladsl.unmarshalling.sse")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling$.html)*