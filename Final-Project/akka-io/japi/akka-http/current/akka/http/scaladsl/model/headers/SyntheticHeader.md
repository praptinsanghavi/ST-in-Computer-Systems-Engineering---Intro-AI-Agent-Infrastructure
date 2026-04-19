---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/SyntheticHeader.html
title: SyntheticHeader
---

# SyntheticHeader

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Interface SyntheticHeader

- All Superinterfaces:
`[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`, `java.io.Serializable`

All Known Implementing Classes:
`[EmptyHeader$](EmptyHeader$.html "class in akka.http.scaladsl.model.headers")`, `[Raw$minusRequest$minusURI](Raw$minusRequest$minusURI.html "class in akka.http.scaladsl.model.headers")`, `[Remote$minusAddress](Remote$minusAddress.html "class in akka.http.scaladsl.model.headers")`, `[Timeout$minusAccess](Timeout$minusAccess.html "class in akka.http.scaladsl.model.headers")`, `[Tls$minusSession$minusInfo](Tls$minusSession$minusInfo.html "class in akka.http.scaladsl.model.headers")`

---

```
public interface SyntheticHeader
extends [ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
```

- - ### Method Summary
	
	
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[companion](ModeledHeader.html#companion()), [lowercaseName](ModeledHeader.html#lowercaseName()), [name](ModeledHeader.html#name()), [render](ModeledHeader.html#render(R)), [renderInRequests](ModeledHeader.html#renderInRequests()), [renderInResponses](ModeledHeader.html#renderInResponses()), [renderValue](ModeledHeader.html#renderValue(R)), [value](ModeledHeader.html#value())`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EmptyHeader$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Raw$minusRequest$minusURI.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Remote$minusAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Timeout$minusAccess.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Tls$minusSession$minusInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/SyntheticHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/SyntheticHeader.html)*