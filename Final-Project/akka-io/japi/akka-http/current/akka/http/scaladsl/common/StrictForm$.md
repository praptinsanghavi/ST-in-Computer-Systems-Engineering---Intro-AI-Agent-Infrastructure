---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm$.html
title: StrictForm$
---

# StrictForm$

## Content

Package [akka.http.scaladsl.common](package-summary.html)
## Class StrictForm$

- java.lang.Object
- - akka.http.scaladsl.common.StrictForm$

- ---

```
public class StrictForm$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StrictForm$](StrictForm$.html "class in akka.http.scaladsl.common")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StrictForm$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[toStrictTimeout](#toStrictTimeout())()` |  |
	| `[Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[StrictForm](StrictForm.html "class in akka.http.scaladsl.common")>` | `[unmarshaller](#unmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller,akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[FormData](../model/FormData.html "class in akka.http.scaladsl.model")> formDataUM,  [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.FormData](../model/Multipart.FormData.html "class in akka.http.scaladsl.model")> multipartUM)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StrictForm$](StrictForm$.html "class in akka.http.scaladsl.common") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StrictForm$
		
		
		
		```
		public StrictForm$()
		```

	- ### Method Detail
	
	
	
		- #### toStrictTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration toStrictTimeout()
		```
		- #### unmarshaller
		
		
		
		```
		public [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[StrictForm](StrictForm.html "class in akka.http.scaladsl.common")> unmarshaller​([Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[FormData](../model/FormData.html "class in akka.http.scaladsl.model")> formDataUM,
		                                                              [Unmarshaller](../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​[Multipart.FormData](../model/Multipart.FormData.html "class in akka.http.scaladsl.model")> multipartUM)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm$.html)*