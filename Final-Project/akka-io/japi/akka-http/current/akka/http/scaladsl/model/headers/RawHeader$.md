---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RawHeader$.html
title: RawHeader$
---

# RawHeader$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class RawHeader$

- java.lang.Object
- - akka.http.scaladsl.model.headers.RawHeader$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class RawHeader$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.RawHeader$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RawHeader$](RawHeader$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RawHeader$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<H extends [HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")>scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[unapply](#unapply(H))​(H customHeader)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RawHeader$](RawHeader$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RawHeader$
		
		
		
		```
		public RawHeader$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public <H extends [HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")> scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> unapply​(H customHeader)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RawHeader$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RawHeader$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RawHeader$.html)*