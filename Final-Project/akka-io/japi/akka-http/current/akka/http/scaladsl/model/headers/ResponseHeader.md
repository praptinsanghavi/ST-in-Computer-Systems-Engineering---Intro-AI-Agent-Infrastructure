---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ResponseHeader.html
title: ResponseHeader
---

# ResponseHeader

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Interface ResponseHeader

- All Superinterfaces:
`[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`, `java.io.Serializable`

All Known Subinterfaces:
`[RequestResponseHeader](RequestResponseHeader.html "interface in akka.http.scaladsl.model.headers")`

All Known Implementing Classes:
`[Accept$minusRanges](Accept$minusRanges.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusAllow$minusCredentials](Access$minusControl$minusAllow$minusCredentials.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusAllow$minusHeaders](Access$minusControl$minusAllow$minusHeaders.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusAllow$minusMethods](Access$minusControl$minusAllow$minusMethods.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusExpose$minusHeaders](Access$minusControl$minusExpose$minusHeaders.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusMax$minusAge](Access$minusControl$minusMax$minusAge.html "class in akka.http.scaladsl.model.headers")`, `[Age](Age.html "class in akka.http.scaladsl.model.headers")`, `[Allow](Allow.html "class in akka.http.scaladsl.model.headers")`, `[Cache$minusControl](Cache$minusControl.html "class in akka.http.scaladsl.model.headers")`, `[Connection](Connection.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusDisposition](Content$minusDisposition.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusEncoding](Content$minusEncoding.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusLength](Content$minusLength.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusLocation](Content$minusLocation.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusRange](Content$minusRange.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusType](Content$minusType.html "class in akka.http.scaladsl.model.headers")`, `[Date](Date.html "class in akka.http.scaladsl.model.headers")`, `[ETag](ETag.html "class in akka.http.scaladsl.model.headers")`, `[Expires](Expires.html "class in akka.http.scaladsl.model.headers")`, `[Last$minusModified](Last$minusModified.html "class in akka.http.scaladsl.model.headers")`, `[Link](Link.html "class in akka.http.scaladsl.model.headers")`, `[Location](Location.html "class in akka.http.scaladsl.model.headers")`, `[Proxy$minusAuthenticate](Proxy$minusAuthenticate.html "class in akka.http.scaladsl.model.headers")`, `[Retry$minusAfter](Retry$minusAfter.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusAccept](Sec$minusWebSocket$minusAccept.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusExtensions](Sec$minusWebSocket$minusExtensions.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusProtocol](Sec$minusWebSocket$minusProtocol.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusVersion](Sec$minusWebSocket$minusVersion.html "class in akka.http.scaladsl.model.headers")`, `[Server](Server.html "class in akka.http.scaladsl.model.headers")`, `[Set$minusCookie](Set$minusCookie.html "class in akka.http.scaladsl.model.headers")`, `[Strict$minusTransport$minusSecurity](Strict$minusTransport$minusSecurity.html "class in akka.http.scaladsl.model.headers")`, `[Transfer$minusEncoding](Transfer$minusEncoding.html "class in akka.http.scaladsl.model.headers")`, `[Upgrade](Upgrade.html "class in akka.http.scaladsl.model.headers")`, `[WWW$minusAuthenticate](WWW$minusAuthenticate.html "class in akka.http.scaladsl.model.headers")`

---

```
public interface ResponseHeader
extends [ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[renderInResponses](#renderInResponses())()` |  |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[companion](ModeledHeader.html#companion()), [lowercaseName](ModeledHeader.html#lowercaseName()), [name](ModeledHeader.html#name()), [render](ModeledHeader.html#render(R)), [renderInRequests](ModeledHeader.html#renderInRequests()), [renderValue](ModeledHeader.html#renderValue(R)), [value](ModeledHeader.html#value())`

- - ### Method Detail
	
	
	
		- #### renderInResponses
		
		
		
		```
		boolean renderInResponses()
		```
		
		
		Specified by:
		`[renderInResponses](ModeledHeader.html#renderInResponses())` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusHeaders.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusExpose$minusHeaders.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusMax$minusAge.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Age.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Allow.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cache$minusControl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Connection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusDisposition.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusLength.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusLocation.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Date.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ETag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Expires.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Last$minusModified.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Location.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Proxy$minusAuthenticate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestResponseHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Retry$minusAfter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusAccept.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusExtensions.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusVersion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Server.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Set$minusCookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Strict$minusTransport$minusSecurity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Transfer$minusEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Upgrade.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/WWW$minusAuthenticate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ResponseHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ResponseHeader.html)*