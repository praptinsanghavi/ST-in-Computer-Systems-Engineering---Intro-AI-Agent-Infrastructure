---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html
title: EventStreamUnmarshalling
---

# EventStreamUnmarshalling

## Content

Package [akka.http.scaladsl.unmarshalling.sse](package-summary.html)
## Interface EventStreamUnmarshalling

- All Known Implementing Classes:
`[EventStreamUnmarshalling$](EventStreamUnmarshalling$.html "class in akka.http.scaladsl.unmarshalling.sse")`

---

```
public interface EventStreamUnmarshalling
```

Mixing in this trait lets a `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of
 `ServerSentEvent`s.
 
 The maximum size for parsing server\-sent events is 8KiB by default and can be customized by configuring
 `akka.http.sse.max-event-size`. The maximum size for parsing lines of a server\-sent event is 4KiB by
 default and can be customized by configuring `akka.http.sse.max-line-size`.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Unmarshaller](../Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>>` | `[fromEventsStream](#fromEventsStream(int,int,boolean))​(int maxLineSize,  int maxEventSize,  boolean emitEmptyEvents)` |  |
	| `[Unmarshaller](../Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>>` | `[fromEventsStream](#fromEventsStream(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | Lets an `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of `ServerSentEvent`s. |
	| `[Unmarshaller](../Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>>` | `[fromEventsStream](#fromEventsStream(akka.http.scaladsl.settings.ServerSentEventSettings))​([ServerSentEventSettings](../../settings/ServerSentEventSettings.html "class in akka.http.scaladsl.settings") settings)` | Lets an `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of `ServerSentEvent`s. |
	| `[Unmarshaller](../Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>>` | `[fromEventStream](#fromEventStream())()` | Deprecated. Binary compatibility method. |
	| `int` | `[maxEventSize](#maxEventSize())()` | Deprecated. Set this property in configuration as \`akka.http.sse.max\-event\-size\` before calling fromEventsStream(implicit ActorSystem). |
	| `int` | `[maxLineSize](#maxLineSize())()` | Deprecated. Set this property in configuration as \`akka.http.sse.max\-line\-size\` before calling fromEventsStream(implicit ActorSystem). |

- - ### Method Detail
	
	
	
		- #### maxLineSize
		
		
		
		```
		int maxLineSize()
		```
		
		Deprecated.
		Set this property in configuration as \`akka.http.sse.max\-line\-size\` before calling fromEventsStream(implicit ActorSystem). Since 10\.1\.8\.
		
		The maximum size for parsing lines of a server\-sent event; 4KiB by default.
		
		Returns:
		(undocumented)
		- #### maxEventSize
		
		
		
		```
		int maxEventSize()
		```
		
		Deprecated.
		Set this property in configuration as \`akka.http.sse.max\-event\-size\` before calling fromEventsStream(implicit ActorSystem). Since 10\.1\.8\.
		
		The maximum size for parsing server\-sent events; 8KiB by default.
		
		Returns:
		(undocumented)
		- #### fromEventStream
		
		
		
		```
		[Unmarshaller](../Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>> fromEventStream()
		```
		
		Deprecated.
		Binary compatibility method. Invocations should have an implicit ActorSystem in scope to provide access to configuration. Since 10\.1\.8\.
		- #### fromEventsStream
		
		
		
		```
		[Unmarshaller](../Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>> fromEventsStream​(akka.actor.ActorSystem system)
		```
		
		Lets an `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of `ServerSentEvent`s.
		
		Parameters:
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### fromEventsStream
		
		
		
		```
		[Unmarshaller](../Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>> fromEventsStream​([ServerSentEventSettings](../../settings/ServerSentEventSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		Lets an `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of `ServerSentEvent`s.
		
		Parameters:
		`settings` \- overrides the default unmarshalling behavior.
		Returns:
		(undocumented)
		- #### fromEventsStream
		
		
		
		```
		[Unmarshaller](../Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>> fromEventsStream​(int maxLineSize,
		                                                                                                                int maxEventSize,
		                                                                                                                boolean emitEmptyEvents)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html)*