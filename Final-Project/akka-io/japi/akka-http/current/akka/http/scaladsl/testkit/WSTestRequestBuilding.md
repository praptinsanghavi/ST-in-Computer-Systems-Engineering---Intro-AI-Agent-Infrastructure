---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding.html
title: WSTestRequestBuilding
---

# WSTestRequestBuilding

## Content

Package [akka.http.scaladsl.testkit](package-summary.html)
## Interface WSTestRequestBuilding

- All Known Subinterfaces:
`[RouteTest](RouteTest.html "interface in akka.http.scaladsl.testkit")`, `[ScalatestRouteTest](ScalatestRouteTest.html "interface in akka.http.scaladsl.testkit")`, `[Specs2RouteTest](Specs2RouteTest.html "interface in akka.http.scaladsl.testkit")`

All Known Implementing Classes:
`[WSTestRequestBuilding$](WSTestRequestBuilding$.html "class in akka.http.scaladsl.testkit")`

---

```
public interface WSTestRequestBuilding
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[WS](#WS(akka.http.scaladsl.model.Uri,akka.stream.scaladsl.Flow,scala.collection.immutable.Seq,akka.stream.Materializer))​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri,  akka.stream.scaladsl.Flow<[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​java.lang.Object> clientSideHandler,  scala.collection.immutable.Seq<java.lang.String> subprotocols,  akka.stream.Materializer materializer)` |  |

- - ### Method Detail
	
	
	
		- #### WS
		
		
		
		```
		[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") WS​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri,
		               akka.stream.scaladsl.Flow<[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​java.lang.Object> clientSideHandler,
		               scala.collection.immutable.Seq<java.lang.String> subprotocols,
		               akka.stream.Materializer materializer)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/Specs2RouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding.html)*