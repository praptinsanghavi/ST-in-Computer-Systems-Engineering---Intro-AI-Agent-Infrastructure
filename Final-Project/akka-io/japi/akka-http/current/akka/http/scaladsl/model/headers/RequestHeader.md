---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestHeader.html
title: RequestHeader
---

# RequestHeader

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Interface RequestHeader

- All Superinterfaces:
`[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`, `java.io.Serializable`

All Known Subinterfaces:
`[RequestResponseHeader](RequestResponseHeader.html "interface in akka.http.scaladsl.model.headers")`

All Known Implementing Classes:
`[Accept](Accept.html "class in akka.http.scaladsl.model.headers")`, `[Accept$minusCharset](Accept$minusCharset.html "class in akka.http.scaladsl.model.headers")`, `[Accept$minusEncoding](Accept$minusEncoding.html "class in akka.http.scaladsl.model.headers")`, `[Accept$minusLanguage](Accept$minusLanguage.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusRequest$minusHeaders](Access$minusControl$minusRequest$minusHeaders.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusRequest$minusMethod](Access$minusControl$minusRequest$minusMethod.html "class in akka.http.scaladsl.model.headers")`, `[Authorization](Authorization.html "class in akka.http.scaladsl.model.headers")`, `[Cache$minusControl](Cache$minusControl.html "class in akka.http.scaladsl.model.headers")`, `[Connection](Connection.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusDisposition](Content$minusDisposition.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusEncoding](Content$minusEncoding.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusLength](Content$minusLength.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusRange](Content$minusRange.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusType](Content$minusType.html "class in akka.http.scaladsl.model.headers")`, `[Cookie](Cookie.html "class in akka.http.scaladsl.model.headers")`, `[Date](Date.html "class in akka.http.scaladsl.model.headers")`, `[Expect](Expect.html "class in akka.http.scaladsl.model.headers")`, `[Host](Host.html "class in akka.http.scaladsl.model.headers")`, `[If$minusMatch](If$minusMatch.html "class in akka.http.scaladsl.model.headers")`, `[If$minusModified$minusSince](If$minusModified$minusSince.html "class in akka.http.scaladsl.model.headers")`, `[If$minusNone$minusMatch](If$minusNone$minusMatch.html "class in akka.http.scaladsl.model.headers")`, `[If$minusRange](If$minusRange.html "class in akka.http.scaladsl.model.headers")`, `[If$minusUnmodified$minusSince](If$minusUnmodified$minusSince.html "class in akka.http.scaladsl.model.headers")`, `[Last$minusEvent$minusID](Last$minusEvent$minusID.html "class in akka.http.scaladsl.model.headers")`, `[Link](Link.html "class in akka.http.scaladsl.model.headers")`, `[Origin](Origin.html "class in akka.http.scaladsl.model.headers")`, `[Proxy$minusAuthorization](Proxy$minusAuthorization.html "class in akka.http.scaladsl.model.headers")`, `[Range](Range.html "class in akka.http.scaladsl.model.headers")`, `[Referer](Referer.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusExtensions](Sec$minusWebSocket$minusExtensions.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusKey](Sec$minusWebSocket$minusKey.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusProtocol](Sec$minusWebSocket$minusProtocol.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusVersion](Sec$minusWebSocket$minusVersion.html "class in akka.http.scaladsl.model.headers")`, `[TE](TE.html "class in akka.http.scaladsl.model.headers")`, `[Transfer$minusEncoding](Transfer$minusEncoding.html "class in akka.http.scaladsl.model.headers")`, `[Upgrade](Upgrade.html "class in akka.http.scaladsl.model.headers")`, `[User$minusAgent](User$minusAgent.html "class in akka.http.scaladsl.model.headers")`, `[X$minusForwarded$minusFor](X$minusForwarded$minusFor.html "class in akka.http.scaladsl.model.headers")`, `[X$minusForwarded$minusHost](X$minusForwarded$minusHost.html "class in akka.http.scaladsl.model.headers")`, `[X$minusForwarded$minusProto](X$minusForwarded$minusProto.html "class in akka.http.scaladsl.model.headers")`, `[X$minusReal$minusIp](X$minusReal$minusIp.html "class in akka.http.scaladsl.model.headers")`

---

```
public interface RequestHeader
extends [ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[renderInRequests](#renderInRequests())()` |  |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[companion](ModeledHeader.html#companion()), [lowercaseName](ModeledHeader.html#lowercaseName()), [name](ModeledHeader.html#name()), [render](ModeledHeader.html#render(R)), [renderInResponses](ModeledHeader.html#renderInResponses()), [renderValue](ModeledHeader.html#renderValue(R)), [value](ModeledHeader.html#value())`

- - ### Method Detail
	
	
	
		- #### renderInRequests
		
		
		
		```
		boolean renderInRequests()
		```
		
		
		Specified by:
		`[renderInRequests](ModeledHeader.html#renderInRequests())` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusLanguage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Authorization.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cache$minusControl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Connection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusDisposition.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusLength.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Date.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Expect.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusMatch.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusModified$minusSince.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusNone$minusMatch.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusUnmodified$minusSince.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Last$minusEvent$minusID.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Origin.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Proxy$minusAuthorization.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Range.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Referer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestResponseHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusExtensions.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusVersion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/TE.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Transfer$minusEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Upgrade.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/User$minusAgent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusForwarded$minusFor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusForwarded$minusHost.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusForwarded$minusProto.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusReal$minusIp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestHeader.html)*