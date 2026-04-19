---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSTestRequestBuilding.html
title: WSTestRequestBuilding
---

# WSTestRequestBuilding

## Content

Package [akka.http.javadsl.testkit](package-summary.html)
## Interface WSTestRequestBuilding

- All Known Implementing Classes:
`[JUnitRouteTest](JUnitRouteTest.html "class in akka.http.javadsl.testkit")`, `[JUnitRouteTestBase](JUnitRouteTestBase.html "class in akka.http.javadsl.testkit")`, `[RouteTest](RouteTest.html "class in akka.http.javadsl.testkit")`

---

```
public interface WSTestRequestBuilding
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model")` | `[WS](#WS(akka.http.javadsl.model.Uri,akka.stream.javadsl.Flow,akka.stream.Materializer))​([Uri](../model/Uri.html "class in akka.http.javadsl.model") uri,  akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> clientSideHandler,  akka.stream.Materializer materializer)` |  |
	| `<T> [HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model")` | `[WS](#WS(akka.http.javadsl.model.Uri,akka.stream.javadsl.Flow,akka.stream.Materializer,java.util.List))​([Uri](../model/Uri.html "class in akka.http.javadsl.model") uri,  akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> clientSideHandler,  akka.stream.Materializer materializer,  java.util.List<java.lang.String> subprotocols)` |  |

- - ### Method Detail
	
	
	
		- #### WS
		
		
		
		```
		<T> [HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") WS​([Uri](../model/Uri.html "class in akka.http.javadsl.model") uri,
		                   akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> clientSideHandler,
		                   akka.stream.Materializer materializer)
		```
		- #### WS
		
		
		
		```
		<T> [HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") WS​([Uri](../model/Uri.html "class in akka.http.javadsl.model") uri,
		                   akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> clientSideHandler,
		                   akka.stream.Materializer materializer,
		                   java.util.List<java.lang.String> subprotocols)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/JUnitRouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/JUnitRouteTestBase.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/RouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSTestRequestBuilding.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSTestRequestBuilding.html)*