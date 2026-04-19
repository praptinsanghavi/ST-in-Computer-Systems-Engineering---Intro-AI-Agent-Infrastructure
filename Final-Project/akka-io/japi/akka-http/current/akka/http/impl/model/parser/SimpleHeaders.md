---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/SimpleHeaders.html
title: SimpleHeaders
---

# SimpleHeaders

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Interface SimpleHeaders

- All Known Implementing Classes:
`[HeaderParser](HeaderParser.html "class in akka.http.impl.model.parser")`

---

```
public interface SimpleHeaders
```

INTERNAL API.
 Parser rules for all headers that can be parsed with one single rule.
 All header rules that require more than one single rule are modelled in their own trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Age](../../../scaladsl/model/headers/Age.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[age](#age())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Allow](../../../scaladsl/model/headers/Allow.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[allow](#allow())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Authorization](../../../scaladsl/model/headers/Authorization.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[authorization](#authorization())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Connection](../../../scaladsl/model/headers/Connection.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[connection](#connection())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Cookie](../../../scaladsl/model/headers/Cookie.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[cookie](#cookie())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Date](../../../scaladsl/model/headers/Date.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[date](#date())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[ETag](../../../scaladsl/model/headers/ETag.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[etag](#etag())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Expect](../../../scaladsl/model/headers/Expect.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[expect](#expect())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Expires](../../../scaladsl/model/headers/Expires.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[expires](#expires())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Host](../../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[host](#host())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Location](../../../scaladsl/model/headers/Location.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[location](#location())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Origin](../../../scaladsl/model/headers/Origin.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[origin](#origin())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[UpgradeProtocol](../../../scaladsl/model/headers/UpgradeProtocol.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[protocol](#protocol())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Range](../../../scaladsl/model/headers/Range.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[range](#range())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Referer](../../../scaladsl/model/headers/Referer.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[referer](#referer())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Server](../../../scaladsl/model/headers/Server.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[server](#server())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[TE](../../../scaladsl/model/headers/TE.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[te](#te())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Upgrade](../../../scaladsl/model/headers/Upgrade.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[upgrade](#upgrade())()` |  |

- - ### Method Detail
	
	
	
		- #### age
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Age](../../../scaladsl/model/headers/Age.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> age()
		```
		- #### allow
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Allow](../../../scaladsl/model/headers/Allow.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> allow()
		```
		- #### authorization
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Authorization](../../../scaladsl/model/headers/Authorization.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> authorization()
		```
		- #### connection
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Connection](../../../scaladsl/model/headers/Connection.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> connection()
		```
		- #### cookie
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Cookie](../../../scaladsl/model/headers/Cookie.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> cookie()
		```
		- #### date
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Date](../../../scaladsl/model/headers/Date.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> date()
		```
		- #### etag
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[ETag](../../../scaladsl/model/headers/ETag.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> etag()
		```
		- #### expect
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Expect](../../../scaladsl/model/headers/Expect.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> expect()
		```
		- #### expires
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Expires](../../../scaladsl/model/headers/Expires.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> expires()
		```
		- #### host
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Host](../../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> host()
		```
		- #### location
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Location](../../../scaladsl/model/headers/Location.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> location()
		```
		- #### origin
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Origin](../../../scaladsl/model/headers/Origin.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> origin()
		```
		- #### protocol
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[UpgradeProtocol](../../../scaladsl/model/headers/UpgradeProtocol.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> protocol()
		```
		- #### range
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Range](../../../scaladsl/model/headers/Range.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> range()
		```
		- #### referer
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Referer](../../../scaladsl/model/headers/Referer.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> referer()
		```
		- #### server
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Server](../../../scaladsl/model/headers/Server.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> server()
		```
		- #### te
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[TE](../../../scaladsl/model/headers/TE.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> te()
		```
		- #### upgrade
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Upgrade](../../../scaladsl/model/headers/Upgrade.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> upgrade()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Age.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Allow.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Authorization.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Connection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Date.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ETag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Expect.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Expires.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Location.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Origin.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Range.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Referer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Server.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/TE.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Upgrade.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/UpgradeProtocol.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/SimpleHeaders.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/SimpleHeaders.html)*