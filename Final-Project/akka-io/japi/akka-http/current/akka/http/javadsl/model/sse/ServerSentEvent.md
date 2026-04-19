---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/sse/ServerSentEvent.html
title: ServerSentEvent
---

# ServerSentEvent

## Content

Package [akka.http.javadsl.model.sse](package-summary.html)
## Class ServerSentEvent

- java.lang.Object
- - akka.http.javadsl.model.sse.ServerSentEvent

- Direct Known Subclasses:
`[ServerSentEvent](../../../scaladsl/model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse")`

---

```
@DoNotInherit
public abstract class ServerSentEvent
extends java.lang.Object
```

Representation of a server\-sent event. According to the specification, an empty data field
 designates an event which is to be ignored which is useful for heartbeats.
 
 Not for user extension

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerSentEvent](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse")` | `[create](#create(java.lang.String))​(java.lang.String data)` | Creates a \[\[ServerSentEvent]]. |
	| `static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse")` | `[create](#create(java.lang.String,int))​(java.lang.String data,  int retry)` | Creates a \[\[ServerSentEvent]]. |
	| `static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse")` | `[create](#create(java.lang.String,java.lang.String))​(java.lang.String data,  java.lang.String type)` | Creates a \[\[ServerSentEvent]]. |
	| `static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse")` | `[create](#create(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String data,  java.lang.String type,  java.lang.String id)` | Creates a \[\[ServerSentEvent]]. |
	| `static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse")` | `[create](#create(java.lang.String,java.util.Optional,java.util.Optional,java.util.OptionalInt))​(java.lang.String data,  java.util.Optional<java.lang.String> type,  java.util.Optional<java.lang.String> id,  java.util.OptionalInt retry)` | Creates a \[\[ServerSentEvent]]. |
	| `abstract akka.util.ByteString` | `[encode](#encode())()` | Encode the event to bytes for use in a response |
	| `abstract java.lang.String` | `[getData](#getData())()` | Data, may span multiple lines. |
	| `abstract java.util.Optional<java.lang.String>` | `[getEventType](#getEventType())()` | Optional type, must not contain \\n or \\r. |
	| `abstract java.util.Optional<java.lang.String>` | `[getId](#getId())()` | Optional id, must not contain \\n or \\r. |
	| `abstract java.util.OptionalInt` | `[getRetry](#getRetry())()` | Optional reconnection delay in milliseconds. |
	| `static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse")` | `[heartbeat](#heartbeat())()` | Provides a \[\[ServerSentEvent]] with empty data which can be used as a heartbeat |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ServerSentEvent
		
		
		
		```
		public ServerSentEvent()
		```

	- ### Method Detail
	
	
	
		- #### heartbeat
		
		
		
		```
		public static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse") heartbeat()
		```
		
		Provides a \[\[ServerSentEvent]] with empty data which can be used as a heartbeat
		- #### create
		
		
		
		```
		public static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse") create​(java.lang.String data)
		```
		
		Creates a \[\[ServerSentEvent]].
		
		Parameters:
		`data` \- data, may be empty or span multiple lines
		- #### create
		
		
		
		```
		public static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse") create​(java.lang.String data,
		                                     java.lang.String type)
		```
		
		Creates a \[\[ServerSentEvent]].
		
		Parameters:
		`data` \- data, may span multiple lines
		`type` \- type, must not contain \\n or \\r
		- #### create
		
		
		
		```
		public static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse") create​(java.lang.String data,
		                                     java.lang.String type,
		                                     java.lang.String id)
		```
		
		Creates a \[\[ServerSentEvent]].
		
		Parameters:
		`data` \- data, may span multiple lines
		`type` \- type, must not contain \\n or \\r
		`id` \- id, must not contain \\n or \\r
		- #### create
		
		
		
		```
		public static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse") create​(java.lang.String data,
		                                     int retry)
		```
		
		Creates a \[\[ServerSentEvent]].
		
		Parameters:
		`data` \- data, may span multiple lines
		`retry` \- reconnection delay in milliseconds
		- #### create
		
		
		
		```
		public static [ServerSentEvent](ServerSentEvent.html "class in akka.http.javadsl.model.sse") create​(java.lang.String data,
		                                     java.util.Optional<java.lang.String> type,
		                                     java.util.Optional<java.lang.String> id,
		                                     java.util.OptionalInt retry)
		```
		
		Creates a \[\[ServerSentEvent]].
		
		Parameters:
		`data` \- data, may span multiple lines
		`type` \- optional type, must not contain \\n or \\r
		`id` \- optional id, must not contain \\n or \\r
		`retry` \- optional reconnection delay in milliseconds
		- #### getData
		
		
		
		```
		public abstract java.lang.String getData()
		```
		
		Data, may span multiple lines.
		- #### getEventType
		
		
		
		```
		public abstract java.util.Optional<java.lang.String> getEventType()
		```
		
		Optional type, must not contain \\n or \\r.
		- #### getId
		
		
		
		```
		public abstract java.util.Optional<java.lang.String> getId()
		```
		
		Optional id, must not contain \\n or \\r.
		- #### getRetry
		
		
		
		```
		public abstract java.util.OptionalInt getRetry()
		```
		
		Optional reconnection delay in milliseconds.
		- #### encode
		
		
		
		```
		public abstract akka.util.ByteString encode()
		```
		
		Encode the event to bytes for use in a response

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/sse/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/sse/ServerSentEvent.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/sse/ServerSentEvent.html)*