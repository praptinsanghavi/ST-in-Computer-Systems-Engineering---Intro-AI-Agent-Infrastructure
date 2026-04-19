---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RoutingLog.html
title: RoutingLog
---

# RoutingLog

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Interface RoutingLog

- ---

```
public interface RoutingLog
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.event.LoggingAdapter` | `[log](#log())()` |  |
	| `akka.event.LoggingAdapter` | `[requestLog](#requestLog(akka.http.scaladsl.model.HttpRequest))​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request)` |  |

- - ### Method Detail
	
	
	
		- #### log
		
		
		
		```
		akka.event.LoggingAdapter log()
		```
		- #### requestLog
		
		
		
		```
		akka.event.LoggingAdapter requestLog​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RoutingLog.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RoutingLog.html)*