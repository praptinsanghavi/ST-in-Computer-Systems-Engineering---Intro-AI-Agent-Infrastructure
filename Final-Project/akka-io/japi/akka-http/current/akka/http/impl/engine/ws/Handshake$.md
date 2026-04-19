---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake$.html
title: Handshake$
---

# Handshake$

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class Handshake$

- java.lang.Object
- - akka.http.impl.engine.ws.Handshake$

- ---

```
public class Handshake$
extends java.lang.Object
```

Server\-side implementation of the WebSocket handshake
 
 INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Handshake$](Handshake$.html "class in akka.http.impl.engine.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Handshake$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Connection](../../../scaladsl/model/headers/Connection.html "class in akka.http.scaladsl.model.headers")` | `[ConnectionUpgradeHeader](#ConnectionUpgradeHeader())()` |  |
	| `int` | `[CurrentWebSocketVersion](#CurrentWebSocketVersion())()` |  |
	| `[Sec$minusWebSocket$minusVersion](../../../scaladsl/model/headers/Sec$minusWebSocket$minusVersion.html "class in akka.http.scaladsl.model.headers")` | `[SecWebSocketVersionHeader](#SecWebSocketVersionHeader())()` |  |
	| `[Upgrade](../../../scaladsl/model/headers/Upgrade.html "class in akka.http.scaladsl.model.headers")` | `[UpgradeHeader](#UpgradeHeader())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Handshake$](Handshake$.html "class in akka.http.impl.engine.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Handshake$
		
		
		
		```
		public Handshake$()
		```

	- ### Method Detail
	
	
	
		- #### CurrentWebSocketVersion
		
		
		
		```
		public int CurrentWebSocketVersion()
		```
		- #### UpgradeHeader
		
		
		
		```
		public [Upgrade](../../../scaladsl/model/headers/Upgrade.html "class in akka.http.scaladsl.model.headers") UpgradeHeader()
		```
		- #### ConnectionUpgradeHeader
		
		
		
		```
		public [Connection](../../../scaladsl/model/headers/Connection.html "class in akka.http.scaladsl.model.headers") ConnectionUpgradeHeader()
		```
		- #### SecWebSocketVersionHeader
		
		
		
		```
		public [Sec$minusWebSocket$minusVersion](../../../scaladsl/model/headers/Sec$minusWebSocket$minusVersion.html "class in akka.http.scaladsl.model.headers") SecWebSocketVersionHeader()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Connection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusVersion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Upgrade.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake$.html)*