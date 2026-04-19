---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent$.html
title: ServerSentEvent$
---

# ServerSentEvent$

## Content

Package [akka.http.scaladsl.model.sse](package-summary.html)
## Class ServerSentEvent$

- java.lang.Object
- - akka.http.scaladsl.model.sse.ServerSentEvent$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ServerSentEvent$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.sse.ServerSentEvent$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ServerSentEvent$](ServerSentEvent$.html "class in akka.http.scaladsl.model.sse")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerSentEvent$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse")` | `[apply](#apply(java.lang.String,int))​(java.lang.String data,  int retry)` | Creates a [`ServerSentEvent`](ServerSentEvent.html "class in akka.http.scaladsl.model.sse"). |
	| `[ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String data,  java.lang.String type)` | Creates a [`ServerSentEvent`](ServerSentEvent.html "class in akka.http.scaladsl.model.sse"). |
	| `[ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse")` | `[apply](#apply(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String data,  java.lang.String type,  java.lang.String id)` | Creates a [`ServerSentEvent`](ServerSentEvent.html "class in akka.http.scaladsl.model.sse"). |
	| `[ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse")` | `[heartbeat](#heartbeat())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ServerSentEvent$](ServerSentEvent$.html "class in akka.http.scaladsl.model.sse") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ServerSentEvent$
		
		
		
		```
		public ServerSentEvent$()
		```

	- ### Method Detail
	
	
	
		- #### heartbeat
		
		
		
		```
		public [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse") heartbeat()
		```
		- #### apply
		
		
		
		```
		public [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse") apply​(java.lang.String data,
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
		public [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse") apply​(java.lang.String data,
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
		public [ServerSentEvent](ServerSentEvent.html "class in akka.http.scaladsl.model.sse") apply​(java.lang.String data,
		                             int retry)
		```
		
		Creates a [`ServerSentEvent`](ServerSentEvent.html "class in akka.http.scaladsl.model.sse").
		 
		
		Parameters:
		`data` \- data, may span multiple lines
		`retry` \- reconnection delay in milliseconds
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent$.html)*