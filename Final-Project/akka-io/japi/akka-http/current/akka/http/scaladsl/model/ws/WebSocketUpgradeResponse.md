---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html
title: WebSocketUpgradeResponse
---

# WebSocketUpgradeResponse

## Content

Package [akka.http.scaladsl.model.ws](package-summary.html)
## Interface WebSocketUpgradeResponse

- All Known Implementing Classes:
`[InvalidUpgradeResponse](InvalidUpgradeResponse.html "class in akka.http.scaladsl.model.ws")`, `[ValidUpgrade](ValidUpgrade.html "class in akka.http.scaladsl.model.ws")`

---

```
public interface WebSocketUpgradeResponse
```

Represents the response to a websocket upgrade request. Can either be [`ValidUpgrade`](ValidUpgrade.html "class in akka.http.scaladsl.model.ws") or [`InvalidUpgradeResponse`](InvalidUpgradeResponse.html "class in akka.http.scaladsl.model.ws").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[response](#response())()` |  |

- - ### Method Detail
	
	
	
		- #### response
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") response()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/InvalidUpgradeResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/ValidUpgrade.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html)*