---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/sse/EventStreamUnmarshalling.html
title: EventStreamUnmarshalling
---

# EventStreamUnmarshalling

## Content

Package [akka.http.javadsl.unmarshalling.sse](package-summary.html)
## Class EventStreamUnmarshalling

- java.lang.Object
- - akka.http.javadsl.unmarshalling.sse.EventStreamUnmarshalling

- ---

```
public class EventStreamUnmarshalling
extends java.lang.Object
```

Using `fromEventsStream` lets a `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of
 `ServerSentEvent`s.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventStreamUnmarshalling](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [Unmarshaller](../Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.javadsl.model"),​akka.stream.javadsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse"),​akka.NotUsed>>` | `[fromEventsStream](#fromEventsStream(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | Lets an `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of `ServerSentEvent`s. |
	| `static [Unmarshaller](../Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.javadsl.model"),​akka.stream.javadsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse"),​akka.NotUsed>>` | `[fromEventsStream](#fromEventsStream(akka.http.scaladsl.settings.ServerSentEventSettings))​([ServerSentEventSettings](../../../scaladsl/settings/ServerSentEventSettings.html "class in akka.http.scaladsl.settings") settings)` | Lets an `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of `ServerSentEvent`s. |
	| `static [Unmarshaller](../Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.javadsl.model"),​akka.stream.javadsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse"),​akka.NotUsed>>` | `[fromEventStream](#fromEventStream())()` | Deprecated. Binary compatibility method. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventStreamUnmarshalling
		
		
		
		```
		public EventStreamUnmarshalling()
		```

	- ### Method Detail
	
	
	
		- #### fromEventsStream
		
		
		
		```
		public static [Unmarshaller](../Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.javadsl.model"),​akka.stream.javadsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse"),​akka.NotUsed>> fromEventsStream​(akka.actor.ActorSystem system)
		```
		
		Lets an `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of `ServerSentEvent`s.
		
		Parameters:
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### fromEventsStream
		
		
		
		```
		public static [Unmarshaller](../Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.javadsl.model"),​akka.stream.javadsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse"),​akka.NotUsed>> fromEventsStream​([ServerSentEventSettings](../../../scaladsl/settings/ServerSentEventSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		Lets an `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of `ServerSentEvent`s.
		
		Parameters:
		`settings` \- overrides the default unmarshalling behavior.
		Returns:
		(undocumented)
		- #### fromEventStream
		
		
		
		```
		public static [Unmarshaller](../Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.javadsl.model"),​akka.stream.javadsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse"),​akka.NotUsed>> fromEventStream()
		```
		
		Deprecated.
		Binary compatibility method. Invocations should have an implicit ActorSystem in scope to provide access to configuration. Since 10\.1\.8\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/sse/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSentEventSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/sse/EventStreamUnmarshalling.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/sse/EventStreamUnmarshalling.html)*