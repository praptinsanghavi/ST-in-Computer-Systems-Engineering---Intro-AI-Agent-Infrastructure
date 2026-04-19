---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/PeerClosedConnectionException.html
title: PeerClosedConnectionException
---

# PeerClosedConnectionException

## Content

Package [akka.http.javadsl.model.ws](package-summary.html)
## Interface PeerClosedConnectionException

- All Known Implementing Classes:
`[PeerClosedConnectionException](../../../scaladsl/model/ws/PeerClosedConnectionException.html "class in akka.http.scaladsl.model.ws")`

---

```
public interface PeerClosedConnectionException
```

A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.
 `closeCode` and `closeReason` contain close messages as reported by the peer.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[closeCode](#closeCode())()` |  |
	| `java.lang.String` | `[closeReason](#closeReason())()` |  |

- - ### Method Detail
	
	
	
		- #### closeCode
		
		
		
		```
		int closeCode()
		```
		- #### closeReason
		
		
		
		```
		java.lang.String closeReason()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/PeerClosedConnectionException.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/PeerClosedConnectionException.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/PeerClosedConnectionException.html)*