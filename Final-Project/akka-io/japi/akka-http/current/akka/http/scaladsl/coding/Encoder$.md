---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder$.html
title: Encoder$
---

# Encoder$

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class Encoder$

- java.lang.Object
- - akka.http.scaladsl.coding.Encoder$

- ---

```
public class Encoder$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Encoder$](Encoder$.html "class in akka.http.scaladsl.coding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Encoder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object>` | `[DefaultFilter](#DefaultFilter())()` |  |
	| `boolean` | `[isCompressible](#isCompressible(akka.http.scaladsl.model.HttpMessage))​([HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model") msg)` |  |
	| `scala.Function1<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model"),​java.lang.Object>` | `[isContentEncodingHeader](#isContentEncodingHeader())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Encoder$](Encoder$.html "class in akka.http.scaladsl.coding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Encoder$
		
		
		
		```
		public Encoder$()
		```

	- ### Method Detail
	
	
	
		- #### DefaultFilter
		
		
		
		```
		public scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> DefaultFilter()
		```
		- #### isCompressible
		
		
		
		```
		public boolean isCompressible​([HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model") msg)
		```
		- #### isContentEncodingHeader
		
		
		
		```
		public scala.Function1<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model"),​java.lang.Object> isContentEncodingHeader()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder$.html)*