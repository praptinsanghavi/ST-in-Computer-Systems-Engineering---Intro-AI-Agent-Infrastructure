---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html
title: ModeledHeader
---

# ModeledHeader

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Interface ModeledHeader

- All Superinterfaces:
`java.io.Serializable`

All Known Subinterfaces:
`[RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers")`, `[RequestResponseHeader](RequestResponseHeader.html "interface in akka.http.scaladsl.model.headers")`, `[ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers")`, `[SyntheticHeader](SyntheticHeader.html "interface in akka.http.scaladsl.model.headers")`

All Known Implementing Classes:
`[Accept](Accept.html "class in akka.http.scaladsl.model.headers")`, `[Accept$minusCharset](Accept$minusCharset.html "class in akka.http.scaladsl.model.headers")`, `[Accept$minusEncoding](Accept$minusEncoding.html "class in akka.http.scaladsl.model.headers")`, `[Accept$minusLanguage](Accept$minusLanguage.html "class in akka.http.scaladsl.model.headers")`, `[Accept$minusRanges](Accept$minusRanges.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusAllow$minusCredentials](Access$minusControl$minusAllow$minusCredentials.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusAllow$minusHeaders](Access$minusControl$minusAllow$minusHeaders.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusAllow$minusMethods](Access$minusControl$minusAllow$minusMethods.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusExpose$minusHeaders](Access$minusControl$minusExpose$minusHeaders.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusMax$minusAge](Access$minusControl$minusMax$minusAge.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusRequest$minusHeaders](Access$minusControl$minusRequest$minusHeaders.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusRequest$minusMethod](Access$minusControl$minusRequest$minusMethod.html "class in akka.http.scaladsl.model.headers")`, `[Age](Age.html "class in akka.http.scaladsl.model.headers")`, `[Allow](Allow.html "class in akka.http.scaladsl.model.headers")`, `[Authorization](Authorization.html "class in akka.http.scaladsl.model.headers")`, `[Cache$minusControl](Cache$minusControl.html "class in akka.http.scaladsl.model.headers")`, `[Connection](Connection.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusDisposition](Content$minusDisposition.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusEncoding](Content$minusEncoding.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusLength](Content$minusLength.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusLocation](Content$minusLocation.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusRange](Content$minusRange.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusType](Content$minusType.html "class in akka.http.scaladsl.model.headers")`, `[Cookie](Cookie.html "class in akka.http.scaladsl.model.headers")`, `[Date](Date.html "class in akka.http.scaladsl.model.headers")`, `[EmptyHeader$](EmptyHeader$.html "class in akka.http.scaladsl.model.headers")`, `[ETag](ETag.html "class in akka.http.scaladsl.model.headers")`, `[Expect](Expect.html "class in akka.http.scaladsl.model.headers")`, `[Expires](Expires.html "class in akka.http.scaladsl.model.headers")`, `[Host](Host.html "class in akka.http.scaladsl.model.headers")`, `[If$minusMatch](If$minusMatch.html "class in akka.http.scaladsl.model.headers")`, `[If$minusModified$minusSince](If$minusModified$minusSince.html "class in akka.http.scaladsl.model.headers")`, `[If$minusNone$minusMatch](If$minusNone$minusMatch.html "class in akka.http.scaladsl.model.headers")`, `[If$minusRange](If$minusRange.html "class in akka.http.scaladsl.model.headers")`, `[If$minusUnmodified$minusSince](If$minusUnmodified$minusSince.html "class in akka.http.scaladsl.model.headers")`, `[Last$minusEvent$minusID](Last$minusEvent$minusID.html "class in akka.http.scaladsl.model.headers")`, `[Last$minusModified](Last$minusModified.html "class in akka.http.scaladsl.model.headers")`, `[Link](Link.html "class in akka.http.scaladsl.model.headers")`, `[Location](Location.html "class in akka.http.scaladsl.model.headers")`, `[Origin](Origin.html "class in akka.http.scaladsl.model.headers")`, `[Proxy$minusAuthenticate](Proxy$minusAuthenticate.html "class in akka.http.scaladsl.model.headers")`, `[Proxy$minusAuthorization](Proxy$minusAuthorization.html "class in akka.http.scaladsl.model.headers")`, `[Range](Range.html "class in akka.http.scaladsl.model.headers")`, `[Raw$minusRequest$minusURI](Raw$minusRequest$minusURI.html "class in akka.http.scaladsl.model.headers")`, `[Referer](Referer.html "class in akka.http.scaladsl.model.headers")`, `[Remote$minusAddress](Remote$minusAddress.html "class in akka.http.scaladsl.model.headers")`, `[Retry$minusAfter](Retry$minusAfter.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusAccept](Sec$minusWebSocket$minusAccept.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusExtensions](Sec$minusWebSocket$minusExtensions.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusKey](Sec$minusWebSocket$minusKey.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusProtocol](Sec$minusWebSocket$minusProtocol.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusVersion](Sec$minusWebSocket$minusVersion.html "class in akka.http.scaladsl.model.headers")`, `[Server](Server.html "class in akka.http.scaladsl.model.headers")`, `[Set$minusCookie](Set$minusCookie.html "class in akka.http.scaladsl.model.headers")`, `[Strict$minusTransport$minusSecurity](Strict$minusTransport$minusSecurity.html "class in akka.http.scaladsl.model.headers")`, `[TE](TE.html "class in akka.http.scaladsl.model.headers")`, `[Timeout$minusAccess](Timeout$minusAccess.html "class in akka.http.scaladsl.model.headers")`, `[Tls$minusSession$minusInfo](Tls$minusSession$minusInfo.html "class in akka.http.scaladsl.model.headers")`, `[Transfer$minusEncoding](Transfer$minusEncoding.html "class in akka.http.scaladsl.model.headers")`, `[Upgrade](Upgrade.html "class in akka.http.scaladsl.model.headers")`, `[User$minusAgent](User$minusAgent.html "class in akka.http.scaladsl.model.headers")`, `[WWW$minusAuthenticate](WWW$minusAuthenticate.html "class in akka.http.scaladsl.model.headers")`, `[X$minusForwarded$minusFor](X$minusForwarded$minusFor.html "class in akka.http.scaladsl.model.headers")`, `[X$minusForwarded$minusHost](X$minusForwarded$minusHost.html "class in akka.http.scaladsl.model.headers")`, `[X$minusForwarded$minusProto](X$minusForwarded$minusProto.html "class in akka.http.scaladsl.model.headers")`, `[X$minusReal$minusIp](X$minusReal$minusIp.html "class in akka.http.scaladsl.model.headers")`

---

```
public interface ModeledHeader
extends java.io.Serializable
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<?>` | `[companion](#companion())()` |  |
	| `java.lang.String` | `[lowercaseName](#lowercaseName())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `boolean` | `[renderInRequests](#renderInRequests())()` |  |
	| `boolean` | `[renderInResponses](#renderInResponses())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderValue](#renderValue(R))​(R r)` |  |
	| `java.lang.String` | `[value](#value())()` |  |

- - ### Method Detail
	
	
	
		- #### companion
		
		
		
		```
		[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<?> companion()
		```
		- #### lowercaseName
		
		
		
		```
		java.lang.String lowercaseName()
		```
		- #### name
		
		
		
		```
		java.lang.String name()
		```
		- #### render
		
		
		
		```
		<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		- #### renderInRequests
		
		
		
		```
		boolean renderInRequests()
		```
		- #### renderInResponses
		
		
		
		```
		boolean renderInResponses()
		```
		- #### renderValue
		
		
		
		```
		<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") renderValue​(R r)
		```
		- #### value
		
		
		
		```
		java.lang.String value()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusLanguage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusHeaders.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusExpose$minusHeaders.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusMax$minusAge.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Age.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Allow.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Authorization.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cache$minusControl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Connection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusDisposition.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusLength.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusLocation.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Date.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ETag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EmptyHeader$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Expect.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Expires.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusMatch.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusModified$minusSince.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusNone$minusMatch.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusUnmodified$minusSince.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Last$minusEvent$minusID.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Last$minusModified.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Location.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Origin.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Proxy$minusAuthenticate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Proxy$minusAuthorization.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Range.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Raw$minusRequest$minusURI.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Referer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Remote$minusAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestResponseHeader.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html)*