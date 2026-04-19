---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Tls$minusSession$minusInfo$.html
title: Tls$minusSession$minusInfo$
---

# Tls$minusSession$minusInfo$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Tls$minusSession$minusInfo$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Tls$minusSession$minusInfo](Tls$minusSession$minusInfo.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Tls$minusSession$minusInfo$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Tls$minusSession$minusInfo$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Tls$minusSession$minusInfo](Tls$minusSession$minusInfo.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

Model for the synthetic `Tls-Session-Info` header which carries the SSLSession of the connection
 the message carrying this header was received with.
 
 This header will only be added if it enabled in the configuration by setting
 

`akka.http.[client|server].parsing.tls-session-info-header = on` 

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Tls$minusSession$minusInfo$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Tls$minusSession$minusInfo$](Tls$minusSession$minusInfo$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tls$minusSession$minusInfo$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Tls$minusSession$minusInfo$](Tls$minusSession$minusInfo$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Tls$minusSession$minusInfo$
		
		
		
		```
		public Tls$minusSession$minusInfo$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Tls$minusSession$minusInfo$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Tls$minusSession$minusInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Tls$minusSession$minusInfo$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Tls$minusSession$minusInfo$.html)*