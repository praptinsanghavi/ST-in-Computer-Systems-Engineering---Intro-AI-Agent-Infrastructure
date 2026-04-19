---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/NewHostConnectionPool$.html
title: NewHostConnectionPool$
---

# NewHostConnectionPool$

## Content

Package [akka.http.impl.engine.client.pool](package-summary.html)
## Class NewHostConnectionPool$

- java.lang.Object
- - akka.http.impl.engine.client.pool.NewHostConnectionPool$

- ---

```
public class NewHostConnectionPool$
extends java.lang.Object
```

Internal API
 
 New host connection pool implementation.
 

 Backpressure logic of the external interface:
 

 \* pool pulls if there's a free slot
 \* pool buffers outgoing response in a slot and registers them for becoming dispatchable. When a response is pulled
 a waiting slot is notified and the response is then dispatched.
 

 The implementation is split up into this class which does all the stream\-based wiring. It contains a vector of
 slots that contain the mutable slot state for every slot.
 

 The actual state machine logic is handled in separate [`SlotState`](SlotState.html "class in akka.http.impl.engine.client.pool") subclasses that interface with the logic through
 the clean [`SlotContext`](SlotContext.html "class in akka.http.impl.engine.client.pool") interface.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NewHostConnectionPool$](NewHostConnectionPool$.html "class in akka.http.impl.engine.client.pool")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NewHostConnectionPool$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<[PoolFlow.RequestContext](../PoolFlow.RequestContext.html "class in akka.http.impl.engine.client"),​[PoolFlow.ResponseContext](../PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client"),​akka.NotUsed>` | `[apply](#apply(akka.stream.scaladsl.Flow,akka.http.scaladsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter))​(akka.stream.scaladsl.Flow<[HttpRequest](../../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](../../../../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl")>> connectionFlow,  [ConnectionPoolSettings](../../../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NewHostConnectionPool$](NewHostConnectionPool$.html "class in akka.http.impl.engine.client.pool") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NewHostConnectionPool$
		
		
		
		```
		public NewHostConnectionPool$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.stream.scaladsl.Flow<[PoolFlow.RequestContext](../PoolFlow.RequestContext.html "class in akka.http.impl.engine.client"),​[PoolFlow.ResponseContext](../PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client"),​akka.NotUsed> apply​(akka.stream.scaladsl.Flow<[HttpRequest](../../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](../../../../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl")>> connectionFlow,
		                                                                                                                  [ConnectionPoolSettings](../../../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                  akka.event.LoggingAdapter log)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.ResponseContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/NewHostConnectionPool$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/NewHostConnectionPool$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/NewHostConnectionPool$.html)*