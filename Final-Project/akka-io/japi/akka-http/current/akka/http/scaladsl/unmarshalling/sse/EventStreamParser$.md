---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamParser$.html
title: EventStreamParser$
---

# EventStreamParser$

## Content

Package [akka.http.scaladsl.unmarshalling.sse](package-summary.html)
## Class EventStreamParser$

- java.lang.Object
- - akka.http.scaladsl.unmarshalling.sse.EventStreamParser$

- ---

```
public class EventStreamParser$
extends java.lang.Object
```

Flow that converts raw byte string input into `ServerSentEvent`s.
 
 This API is made for use in non\-akka\-http clients, like Play's WSClient.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventStreamParser$](EventStreamParser$.html "class in akka.http.scaladsl.unmarshalling.sse")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventStreamParser$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>` | `[apply](#apply(int,int))​(int maxLineSize,  int maxEventSize)` | Flow that converts raw byte string input into `ServerSentEvent`s. |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed>` | `[apply](#apply(int,int,boolean))​(int maxLineSize,  int maxEventSize,  boolean emitEmptyEvents)` | Flow that converts raw byte string input into `ServerSentEvent`s. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventStreamParser$](EventStreamParser$.html "class in akka.http.scaladsl.unmarshalling.sse") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventStreamParser$
		
		
		
		```
		public EventStreamParser$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.util.ByteString,​[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed> apply​(int maxLineSize,
		                                                                                                      int maxEventSize)
		```
		
		Flow that converts raw byte string input into `ServerSentEvent`s.
		 
		 This API is made for use in non\-akka\-http clients, like Play's WSClient.
		 
		
		
		
		Parameters:
		`maxLineSize` \- The maximum size of a line for the event Stream parser
		`maxEventSize` \- The maximum size of a server\-sent event for the event Stream parser
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.util.ByteString,​[ServerSentEvent](../../model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse"),​akka.NotUsed> apply​(int maxLineSize,
		                                                                                                      int maxEventSize,
		                                                                                                      boolean emitEmptyEvents)
		```
		
		Flow that converts raw byte string input into `ServerSentEvent`s.
		 
		 This API is made for use in non\-akka\-http clients, like Play's WSClient.
		 
		
		
		
		Parameters:
		`maxLineSize` \- The maximum size of a line for the event Stream parser
		`maxEventSize` \- The maximum size of a server\-sent event for the event Stream parser
		`emitEmptyEvents` \- Should the parser emit events with empty data field
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamParser$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamParser$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamParser$.html)*