---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/SensitiveHttpHeader.html
title: SensitiveHttpHeader
---

# SensitiveHttpHeader

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Interface SensitiveHttpHeader

- All Known Implementing Classes:
`[Authorization](headers/Authorization.html "class in akka.http.scaladsl.model.headers")`, `[Cookie](headers/Cookie.html "class in akka.http.scaladsl.model.headers")`, `[Host](headers/Host.html "class in akka.http.scaladsl.model.headers")`, `[Origin](headers/Origin.html "class in akka.http.scaladsl.model.headers")`, `[Proxy$minusAuthorization](headers/Proxy$minusAuthorization.html "class in akka.http.scaladsl.model.headers")`, `[Referer](headers/Referer.html "class in akka.http.scaladsl.model.headers")`, `[Remote$minusAddress](headers/Remote$minusAddress.html "class in akka.http.scaladsl.model.headers")`, `[X$minusForwarded$minusFor](headers/X$minusForwarded$minusFor.html "class in akka.http.scaladsl.model.headers")`, `[X$minusForwarded$minusHost](headers/X$minusForwarded$minusHost.html "class in akka.http.scaladsl.model.headers")`, `[X$minusReal$minusIp](headers/X$minusReal$minusIp.html "class in akka.http.scaladsl.model.headers")`

---

```
public interface SensitiveHttpHeader
```

Marker trait for headers which contain portentially secret / sensitive information.
 
 Mixing this trait will make `toString` to return the name of the header thus avoiding any
 detail leak.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[toString](#toString())()` |  |

- - ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Authorization.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Origin.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Proxy$minusAuthorization.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Referer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Remote$minusAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusForwarded$minusFor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusForwarded$minusHost.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusReal$minusIp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/SensitiveHttpHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/SensitiveHttpHeader.html)*