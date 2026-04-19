---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html
title: ServerSentEvent
---

# ServerSentEvent

## Content

Package [akka.http.scaladsl.model.sse](package-summary.html)
## Class ServerSentEvent

- java.lang.Object
- - [akka.http.javadsl.model.sse.ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse")
	- - akka.http.scaladsl.model.sse.ServerSentEvent

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ServerSentEvent
extends [ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.sse.ServerSentEvent)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerSentEvent](#%3Cinit%3E(java.lang.String,scala.Option,scala.Option,scala.Option))​(java.lang.String data,  scala.Option<java.lang.String> eventType,  scala.Option<java.lang.String> id,  scala.Option<java.lang.Object> retry)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse")` | `[apply](#apply(java.lang.String,int))​(java.lang.String data,  int retry)` | Creates a [`ServerSentEvent`](ServerSentEvent.html "class in akka.http.scaladsl.model.sse"). |
	| `static [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String data,  java.lang.String type)` | Creates a [`ServerSentEvent`](ServerSentEvent.html "class in akka.http.scaladsl.model.sse"). |
	| `static [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse")` | `[apply](#apply(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String data,  java.lang.String type,  java.lang.String id)` | Creates a [`ServerSentEvent`](ServerSentEvent.html "class in akka.http.scaladsl.model.sse"). |
	| `java.lang.String` | `[data](#data())()` |  |
	| `akka.util.ByteString` | `[encode](#encode())()` | Encode the event to bytes for use in a response |
	| `scala.Option<java.lang.String>` | `[eventType](#eventType())()` |  |
	| `java.lang.String` | `[getData](#getData())()` | Data, may span multiple lines. |
	| `java.util.Optional<java.lang.String>` | `[getEventType](#getEventType())()` | Optional type, must not contain \\n or \\r. |
	| `java.util.Optional<java.lang.String>` | `[getId](#getId())()` | Optional id, must not contain \\n or \\r. |
	| `java.util.OptionalInt` | `[getRetry](#getRetry())()` | Optional reconnection delay in milliseconds. |
	| `static [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse")` | `[heartbeat](#heartbeat())()` |  |
	| `scala.Option<java.lang.String>` | `[id](#id())()` |  |
	| `scala.Option<java.lang.Object>` | `[retry](#retry())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.sse.[ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse")
		
		
		`[create](../../../javadsl/model/sse/ServerSentEvent.html#create(java.lang.String)), [create](../../../javadsl/model/sse/ServerSentEvent.html#create(java.lang.String,int)), [create](../../../javadsl/model/sse/ServerSentEvent.html#create(java.lang.String,java.lang.String)), [create](../../../javadsl/model/sse/ServerSentEvent.html#create(java.lang.String,java.lang.String,java.lang.String)), [create](../../../javadsl/model/sse/ServerSentEvent.html#create(java.lang.String,java.util.Optional,java.util.Optional,java.util.OptionalInt))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### ServerSentEvent
		
		
		
		```
		public ServerSentEvent​(java.lang.String data,
		                       scala.Option<java.lang.String> eventType,
		                       scala.Option<java.lang.String> id,
		                       scala.Option<java.lang.Object> retry)
		```

	- ### Method Detail
	
	
	
		- #### heartbeat
		
		
		
		```
		public static [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse") heartbeat()
		```
		- #### apply
		
		
		
		```
		public static [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse") apply​(java.lang.String data,
		                                    java.lang.String type)
		```
		
		Creates a [`ServerSentEvent`](ServerSentEvent.html "class in akka.http.scaladsl.model.sse").
		 
		
		Parameters:
		`data` \- data, may span multiple lines
		`type` \- type, must not contain \\n or \\r
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public static [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse") apply​(java.lang.String data,
		                                    java.lang.String type,
		                                    java.lang.String id)
		```
		
		Creates a [`ServerSentEvent`](ServerSentEvent.html "class in akka.http.scaladsl.model.sse").
		 
		
		Parameters:
		`data` \- data, may span multiple lines
		`type` \- type, must not contain \\n or \\r
		`id` \- id, must not contain \\n or \\r
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public static [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse") apply​(java.lang.String data,
		                                    int retry)
		```
		
		Creates a [`ServerSentEvent`](ServerSentEvent.html "class in akka.http.scaladsl.model.sse").
		 
		
		Parameters:
		`data` \- data, may span multiple lines
		`retry` \- reconnection delay in milliseconds
		Returns:
		(undocumented)
		- #### data
		
		
		
		```
		public java.lang.String data()
		```
		- #### eventType
		
		
		
		```
		public scala.Option<java.lang.String> eventType()
		```
		- #### id
		
		
		
		```
		public scala.Option<java.lang.String> id()
		```
		- #### retry
		
		
		
		```
		public scala.Option<java.lang.Object> retry()
		```
		- #### encode
		
		
		
		```
		public akka.util.ByteString encode()
		```
		
		Description copied from class: `[ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html#encode())`
		Encode the event to bytes for use in a response
		
		Specified by:
		`[encode](../../../javadsl/model/sse/ServerSentEvent.html#encode())` in class `[ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse")`
		- #### getData
		
		
		
		```
		public java.lang.String getData()
		```
		
		Description copied from class: `[ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html#getData())`
		Data, may span multiple lines.
		
		Specified by:
		`[getData](../../../javadsl/model/sse/ServerSentEvent.html#getData())` in class `[ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse")`
		- #### getEventType
		
		
		
		```
		public java.util.Optional<java.lang.String> getEventType()
		```
		
		Description copied from class: `[ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html#getEventType())`
		Optional type, must not contain \\n or \\r.
		
		Specified by:
		`[getEventType](../../../javadsl/model/sse/ServerSentEvent.html#getEventType())` in class `[ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse")`
		- #### getId
		
		
		
		```
		public java.util.Optional<java.lang.String> getId()
		```
		
		Description copied from class: `[ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html#getId())`
		Optional id, must not contain \\n or \\r.
		
		Specified by:
		`[getId](../../../javadsl/model/sse/ServerSentEvent.html#getId())` in class `[ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse")`
		- #### getRetry
		
		
		
		```
		public java.util.OptionalInt getRetry()
		```
		
		Description copied from class: `[ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html#getRetry())`
		Optional reconnection delay in milliseconds.
		
		Specified by:
		`[getRetry](../../../javadsl/model/sse/ServerSentEvent.html#getRetry())` in class `[ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html)*