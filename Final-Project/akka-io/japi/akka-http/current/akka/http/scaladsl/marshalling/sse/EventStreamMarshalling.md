---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html
title: EventStreamMarshalling
---

# EventStreamMarshalling

## Content

Package [akka.http.scaladsl.marshalling.sse](package-summary.html)
## Interface EventStreamMarshalling

- All Known Implementing Classes:
`[EventStreamMarshalling$](EventStreamMarshalling$.html "class in akka.http.scaladsl.marshalling.sse")`

---

```
public interface EventStreamMarshalling
```

Mixing in this trait lets a source of `ServerSentEvent`s be marshalled to a `HttpEntity` and hence as a
 `HttpResponse`.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Marshaller](../Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​java.lang.Object>,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[toEventStream](#toEventStream())()` |  |

- - ### Method Detail
	
	
	
		- #### toEventStream
		
		
		
		```
		[Marshaller](../Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​java.lang.Object>,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> toEventStream()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/sse/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html)*