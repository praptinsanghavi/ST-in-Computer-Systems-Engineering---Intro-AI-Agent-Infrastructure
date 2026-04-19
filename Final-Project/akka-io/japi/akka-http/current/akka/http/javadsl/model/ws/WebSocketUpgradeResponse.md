---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/WebSocketUpgradeResponse.html
title: WebSocketUpgradeResponse
---

# WebSocketUpgradeResponse

## Content

Package [akka.http.javadsl.model.ws](package-summary.html)
## Interface WebSocketUpgradeResponse

- ---

```
public interface WebSocketUpgradeResponse
```

Represents an upgrade response for a WebSocket upgrade request. Can either be valid, in which
 case the `chosenSubprotocol` method is valid, or if invalid, the `invalidationReason` method
 can be used to find out why the upgrade failed.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.Optional<java.lang.String>` | `[chosenSubprotocol](#chosenSubprotocol())()` | If valid, returns `Some(subprotocol)` (if any was requested), or `None` if none was  chosen or offered. |
	| `java.lang.String` | `[invalidationReason](#invalidationReason())()` | If invalid, the reason why the server's upgrade response could not be accepted. |
	| `boolean` | `[isValid](#isValid())()` |  |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model")` | `[response](#response())()` | Returns the response object as received from the server for further inspection. |

- - ### Method Detail
	
	
	
		- #### isValid
		
		
		
		```
		boolean isValid()
		```
		- #### response
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model") response()
		```
		
		Returns the response object as received from the server for further inspection.
		
		Returns:
		(undocumented)
		- #### chosenSubprotocol
		
		
		
		```
		java.util.Optional<java.lang.String> chosenSubprotocol()
		```
		
		If valid, returns `Some(subprotocol)` (if any was requested), or `None` if none was
		 chosen or offered.
		
		Returns:
		(undocumented)
		- #### invalidationReason
		
		
		
		```
		java.lang.String invalidationReason()
		```
		
		If invalid, the reason why the server's upgrade response could not be accepted.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/WebSocketUpgradeResponse.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/WebSocketUpgradeResponse.html)*