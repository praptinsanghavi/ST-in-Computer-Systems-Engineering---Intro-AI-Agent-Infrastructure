---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusDisposition$.html
title: Content$minusDisposition$
---

# Content$minusDisposition$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Content$minusDisposition$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Content$minusDisposition](Content$minusDisposition.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Content$minusDisposition$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Content$minusDisposition$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Content$minusDisposition](Content$minusDisposition.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

Document https://tools.ietf.org/html/rfc6266 updates document https://www.w3\.org/Protocols/rfc2616/rfc2616\-sec19\.html . Between these
 two there is slight but important difference regarding how parameter values are formatted. In RFC6266 parameters values are without quotes and
 in RFC2616 they are quoted. Since common practice among http servers is to understand quoted values, we use older document
 as reference here.
 Extended (i.e. encoded) parameter values are not quoted, see ext\-parameter \- https://tools.ietf.org/html/rfc5987\#section\-3\.2\.1
 
 Note: Akka HTTP uses "filename" key to store filename and handles encoding/decoding automatically.
 To output customized ASCII fallback version of filename provide "filename\*" for unicode and "filename" for ASCII.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Content$minusDisposition$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Content$minusDisposition$](Content$minusDisposition$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Content$minusDisposition$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Content$minusDisposition$](Content$minusDisposition$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Content$minusDisposition$
		
		
		
		```
		public Content$minusDisposition$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusDisposition$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusDisposition.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusDisposition$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusDisposition$.html)*