---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestResponseHeader.html
title: RequestResponseHeader
---

# RequestResponseHeader

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Interface RequestResponseHeader

- All Superinterfaces:
`[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`, `[RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers")`, `[ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers")`, `java.io.Serializable`

All Known Implementing Classes:
`[Cache$minusControl](Cache$minusControl.html "class in akka.http.scaladsl.model.headers")`, `[Connection](Connection.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusDisposition](Content$minusDisposition.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusEncoding](Content$minusEncoding.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusLength](Content$minusLength.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusRange](Content$minusRange.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusType](Content$minusType.html "class in akka.http.scaladsl.model.headers")`, `[Date](Date.html "class in akka.http.scaladsl.model.headers")`, `[Link](Link.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusExtensions](Sec$minusWebSocket$minusExtensions.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusProtocol](Sec$minusWebSocket$minusProtocol.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusVersion](Sec$minusWebSocket$minusVersion.html "class in akka.http.scaladsl.model.headers")`, `[Transfer$minusEncoding](Transfer$minusEncoding.html "class in akka.http.scaladsl.model.headers")`, `[Upgrade](Upgrade.html "class in akka.http.scaladsl.model.headers")`

---

```
public interface RequestResponseHeader
extends [RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers"), [ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers")
```

- - ### Method Summary
	
	
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[companion](ModeledHeader.html#companion()), [lowercaseName](ModeledHeader.html#lowercaseName()), [name](ModeledHeader.html#name()), [render](ModeledHeader.html#render(R)), [renderValue](ModeledHeader.html#renderValue(R)), [value](ModeledHeader.html#value())`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[renderInRequests](RequestHeader.html#renderInRequests())`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[renderInResponses](ResponseHeader.html#renderInResponses())`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cache$minusControl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Connection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusDisposition.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusLength.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Date.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ResponseHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusExtensions.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusVersion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Transfer$minusEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Upgrade.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestResponseHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestResponseHeader.html)*