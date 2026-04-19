---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/OutgoingConnectionBlueprint$.html
title: OutgoingConnectionBlueprint$
---

# OutgoingConnectionBlueprint$

## Content

Package [akka.http.impl.engine.client](package-summary.html)
## Class OutgoingConnectionBlueprint$

- java.lang.Object
- - akka.http.impl.engine.client.OutgoingConnectionBlueprint$

- ---

```
public class OutgoingConnectionBlueprint$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [OutgoingConnectionBlueprint$](OutgoingConnectionBlueprint$.html "class in akka.http.impl.engine.client")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OutgoingConnectionBlueprint$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[apply](#apply(akka.http.scaladsl.model.headers.Host,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([Host](../../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers") hostHeader,  [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [OutgoingConnectionBlueprint$](OutgoingConnectionBlueprint$.html "class in akka.http.impl.engine.client") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### OutgoingConnectionBlueprint$
		
		
		
		```
		public OutgoingConnectionBlueprint$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> apply​([Host](../../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers") hostHeader,
		                                                                                                                                                                                       [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                       akka.event.LoggingAdapter log)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/OutgoingConnectionBlueprint$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/OutgoingConnectionBlueprint$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/OutgoingConnectionBlueprint$.html)*