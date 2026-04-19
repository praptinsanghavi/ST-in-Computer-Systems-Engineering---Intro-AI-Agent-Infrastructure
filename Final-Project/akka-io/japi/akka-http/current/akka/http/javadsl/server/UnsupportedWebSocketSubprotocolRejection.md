---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html
title: UnsupportedWebSocketSubprotocolRejection
---

# UnsupportedWebSocketSubprotocolRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface UnsupportedWebSocketSubprotocolRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[UnsupportedWebSocketSubprotocolRejection](../../scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface UnsupportedWebSocketSubprotocolRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Rejection created when a websocket request was not handled because none of the given subprotocols
 was supported.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[supportedProtocol](#supportedProtocol())()` |  |

- - ### Method Detail
	
	
	
		- #### supportedProtocol
		
		
		
		```
		java.lang.String supportedProtocol()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html)*