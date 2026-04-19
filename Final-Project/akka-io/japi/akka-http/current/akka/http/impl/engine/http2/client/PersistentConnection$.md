---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/PersistentConnection$.html
title: PersistentConnection$
---

# PersistentConnection$

## Content

Package [akka.http.impl.engine.http2\.client](package-summary.html)
## Class PersistentConnection$

- java.lang.Object
- - akka.http.impl.engine.http2\.client.PersistentConnection$

- ---

```
public class PersistentConnection$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistentConnection$](PersistentConnection$.html "class in akka.http.impl.engine.http2.client")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistentConnection$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<[HttpRequest](../../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[managedConnection](#managedConnection(akka.stream.scaladsl.Flow,akka.http.scaladsl.settings.Http2ClientSettings))​(akka.stream.scaladsl.Flow<[HttpRequest](../../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](../../../../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl")>> connectionFlow,  [Http2ClientSettings](../../../../scaladsl/settings/Http2ClientSettings.html "interface in akka.http.scaladsl.settings") settings)` | Wraps a connection flow with transparent reconnection support. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistentConnection$](PersistentConnection$.html "class in akka.http.impl.engine.http2.client") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistentConnection$
		
		
		
		```
		public PersistentConnection$()
		```

	- ### Method Detail
	
	
	
		- #### managedConnection
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](../../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> managedConnection​(akka.stream.scaladsl.Flow<[HttpRequest](../../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](../../../../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl")>> connectionFlow,
		                                                                                                      [Http2ClientSettings](../../../../scaladsl/settings/Http2ClientSettings.html "interface in akka.http.scaladsl.settings") settings)
		```
		
		Wraps a connection flow with transparent reconnection support.
		 
		 Backpressure logic:
		 
		
		
		 \* when unconnected wait for pull on response side to pull request side
		 \* when first request comes in, establish connection and send initial request to connection
		 \* connection then drives backpressure logic, i.e.
		 \* it may pull regardless of outer demand
		 \* if it pulls and runs multiple requests concurrently, it must also buffer them internally
		 \* this stage will only ever buffer requests directly in the incoming request slot
		 \* outgoing responses are never buffer but we pull the connection only if there is outer demand
		 
		
		
		 Error reporting logic when connection breaks while requests are running:
		 \* generate error responses with 502 status code
		 \* custom attribute contains internal error information
		
		
		
		Parameters:
		`connectionFlow` \- (undocumented)
		`settings` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/PersistentConnection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/PersistentConnection$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/PersistentConnection$.html)*