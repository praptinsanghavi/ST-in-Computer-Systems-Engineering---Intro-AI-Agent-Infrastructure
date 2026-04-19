---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
title: ModeledCompanion
---

# ModeledCompanion

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class ModeledCompanion\<T\>

- java.lang.Object
- - akka.http.scaladsl.model.headers.ModeledCompanion\<T\>

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[Accept$](Accept$.html "class in akka.http.scaladsl.model.headers")`, `[Accept$minusCharset$](Accept$minusCharset$.html "class in akka.http.scaladsl.model.headers")`, `[Accept$minusEncoding$](Accept$minusEncoding$.html "class in akka.http.scaladsl.model.headers")`, `[Accept$minusLanguage$](Accept$minusLanguage$.html "class in akka.http.scaladsl.model.headers")`, `[Accept$minusRanges$](Accept$minusRanges$.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusAllow$minusCredentials$](Access$minusControl$minusAllow$minusCredentials$.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusAllow$minusHeaders$](Access$minusControl$minusAllow$minusHeaders$.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusAllow$minusMethods$](Access$minusControl$minusAllow$minusMethods$.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusExpose$minusHeaders$](Access$minusControl$minusExpose$minusHeaders$.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusMax$minusAge$](Access$minusControl$minusMax$minusAge$.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusRequest$minusHeaders$](Access$minusControl$minusRequest$minusHeaders$.html "class in akka.http.scaladsl.model.headers")`, `[Access$minusControl$minusRequest$minusMethod$](Access$minusControl$minusRequest$minusMethod$.html "class in akka.http.scaladsl.model.headers")`, `[Age$](Age$.html "class in akka.http.scaladsl.model.headers")`, `[Allow$](Allow$.html "class in akka.http.scaladsl.model.headers")`, `[Authorization$](Authorization$.html "class in akka.http.scaladsl.model.headers")`, `[Cache$minusControl$](Cache$minusControl$.html "class in akka.http.scaladsl.model.headers")`, `[Connection$](Connection$.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusDisposition$](Content$minusDisposition$.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusEncoding$](Content$minusEncoding$.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusLength$](Content$minusLength$.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusLocation$](Content$minusLocation$.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusRange$](Content$minusRange$.html "class in akka.http.scaladsl.model.headers")`, `[Content$minusType$](Content$minusType$.html "class in akka.http.scaladsl.model.headers")`, `[Cookie$](Cookie$.html "class in akka.http.scaladsl.model.headers")`, `[Date$](Date$.html "class in akka.http.scaladsl.model.headers")`, `[EmptyCompanion$](EmptyCompanion$.html "class in akka.http.scaladsl.model.headers")`, `[ETag$](ETag$.html "class in akka.http.scaladsl.model.headers")`, `[Expect$](Expect$.html "class in akka.http.scaladsl.model.headers")`, `[Expires$](Expires$.html "class in akka.http.scaladsl.model.headers")`, `[Host$](Host$.html "class in akka.http.scaladsl.model.headers")`, `[If$minusMatch$](If$minusMatch$.html "class in akka.http.scaladsl.model.headers")`, `[If$minusModified$minusSince$](If$minusModified$minusSince$.html "class in akka.http.scaladsl.model.headers")`, `[If$minusNone$minusMatch$](If$minusNone$minusMatch$.html "class in akka.http.scaladsl.model.headers")`, `[If$minusRange$](If$minusRange$.html "class in akka.http.scaladsl.model.headers")`, `[If$minusUnmodified$minusSince$](If$minusUnmodified$minusSince$.html "class in akka.http.scaladsl.model.headers")`, `[Last$minusEvent$minusID$](Last$minusEvent$minusID$.html "class in akka.http.scaladsl.model.headers")`, `[Last$minusModified$](Last$minusModified$.html "class in akka.http.scaladsl.model.headers")`, `[Link$](Link$.html "class in akka.http.scaladsl.model.headers")`, `[Location$](Location$.html "class in akka.http.scaladsl.model.headers")`, `[Origin$](Origin$.html "class in akka.http.scaladsl.model.headers")`, `[Proxy$minusAuthenticate$](Proxy$minusAuthenticate$.html "class in akka.http.scaladsl.model.headers")`, `[Proxy$minusAuthorization$](Proxy$minusAuthorization$.html "class in akka.http.scaladsl.model.headers")`, `[Range$](Range$.html "class in akka.http.scaladsl.model.headers")`, `[Raw$minusRequest$minusURI$](Raw$minusRequest$minusURI$.html "class in akka.http.scaladsl.model.headers")`, `[Referer$](Referer$.html "class in akka.http.scaladsl.model.headers")`, `[Remote$minusAddress$](Remote$minusAddress$.html "class in akka.http.scaladsl.model.headers")`, `[Retry$minusAfter$](Retry$minusAfter$.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusAccept$](Sec$minusWebSocket$minusAccept$.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusExtensions$](Sec$minusWebSocket$minusExtensions$.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusKey$](Sec$minusWebSocket$minusKey$.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusProtocol$](Sec$minusWebSocket$minusProtocol$.html "class in akka.http.scaladsl.model.headers")`, `[Sec$minusWebSocket$minusVersion$](Sec$minusWebSocket$minusVersion$.html "class in akka.http.scaladsl.model.headers")`, `[Server$](Server$.html "class in akka.http.scaladsl.model.headers")`, `[Set$minusCookie$](Set$minusCookie$.html "class in akka.http.scaladsl.model.headers")`, `[Strict$minusTransport$minusSecurity$](Strict$minusTransport$minusSecurity$.html "class in akka.http.scaladsl.model.headers")`, `[TE$](TE$.html "class in akka.http.scaladsl.model.headers")`, `[Timeout$minusAccess$](Timeout$minusAccess$.html "class in akka.http.scaladsl.model.headers")`, `[Tls$minusSession$minusInfo$](Tls$minusSession$minusInfo$.html "class in akka.http.scaladsl.model.headers")`, `[Transfer$minusEncoding$](Transfer$minusEncoding$.html "class in akka.http.scaladsl.model.headers")`, `[Upgrade$](Upgrade$.html "class in akka.http.scaladsl.model.headers")`, `[User$minusAgent$](User$minusAgent$.html "class in akka.http.scaladsl.model.headers")`, `[WWW$minusAuthenticate$](WWW$minusAuthenticate$.html "class in akka.http.scaladsl.model.headers")`, `[X$minusForwarded$minusFor$](X$minusForwarded$minusFor$.html "class in akka.http.scaladsl.model.headers")`, `[X$minusForwarded$minusHost$](X$minusForwarded$minusHost$.html "class in akka.http.scaladsl.model.headers")`, `[X$minusForwarded$minusProto$](X$minusForwarded$minusProto$.html "class in akka.http.scaladsl.model.headers")`, `[X$minusReal$minusIp$](X$minusReal$minusIp$.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class ModeledCompanion<T>
extends java.lang.Object
implements [Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ModeledCompanion](#%3Cinit%3E(scala.reflect.ClassTag))​(scala.reflect.ClassTag<[T](ModeledCompanion.html "type parameter in ModeledCompanion")> evidence$1)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[lowercaseName](#lowercaseName())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `static <T> java.lang.String` | `[nameFromClass](#nameFromClass(java.lang.Class))​(java.lang.Class<T> clazz)` |  |
	| `scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​[T](ModeledCompanion.html "type parameter in ModeledCompanion")>` | `[parseFromValueString](#parseFromValueString(java.lang.String))​(java.lang.String value)` | Parses the given value into a header of this type. |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ModeledCompanion
		
		
		
		```
		public ModeledCompanion​(scala.reflect.ClassTag<[T](ModeledCompanion.html "type parameter in ModeledCompanion")> evidence$1)
		```

	- ### Method Detail
	
	
	
		- #### nameFromClass
		
		
		
		```
		public static <T> java.lang.String nameFromClass​(java.lang.Class<T> clazz)
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### lowercaseName
		
		
		
		```
		public java.lang.String lowercaseName()
		```
		- #### render
		
		
		
		```
		public final <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`
		- #### parseFromValueString
		
		
		
		```
		public scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​[T](ModeledCompanion.html "type parameter in ModeledCompanion")> parseFromValueString​(java.lang.String value)
		```
		
		Parses the given value into a header of this type. Returns `Right[T]` if parsing
		 was successful and `Left(errors)` otherwise.
		
		Parameters:
		`value` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusEncoding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusLanguage$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusRanges$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusCredentials$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusHeaders$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusExpose$minusHeaders$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusMax$minusAge$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusMethod$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Age$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Allow$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Authorization$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cache$minusControl$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Connection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusDisposition$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusEncoding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusLength$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusLocation$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusType$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cookie$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Date$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ETag$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EmptyCompanion$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Expect$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Expires$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusMatch$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusModified$minusSince$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusNone$minusMatch$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/If$minusUnmodified$minusSince$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Last$minusEvent$minusID$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Last$minusModified$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Location$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Origin$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Proxy$minusAuthenticate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Proxy$minusAuthorization$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Range$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Raw$minusRequest$minusURI$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Referer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Remote$minusAddress$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html)*