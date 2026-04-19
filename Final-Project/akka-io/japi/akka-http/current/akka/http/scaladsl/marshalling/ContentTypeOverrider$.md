---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/ContentTypeOverrider$.html
title: ContentTypeOverrider$
---

# ContentTypeOverrider$

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Class ContentTypeOverrider$

- java.lang.Object
- - akka.http.scaladsl.marshalling.ContentTypeOverrider$

- ---

```
public class ContentTypeOverrider$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ContentTypeOverrider$](ContentTypeOverrider$.html "class in akka.http.scaladsl.marshalling")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ContentTypeOverrider$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T extends [HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model")>[ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<T>` | `[forEntity](#forEntity())()` |  |
	| `<T extends [HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model")>[ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<scala.Tuple2<scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>>` | `[forHeadersAndEntity](#forHeadersAndEntity())()` |  |
	| `[ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[forRequest](#forRequest())()` |  |
	| `[ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[forResponse](#forResponse())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ContentTypeOverrider$](ContentTypeOverrider$.html "class in akka.http.scaladsl.marshalling") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ContentTypeOverrider$
		
		
		
		```
		public ContentTypeOverrider$()
		```

	- ### Method Detail
	
	
	
		- #### forEntity
		
		
		
		```
		public <T extends [HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model")> [ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<T> forEntity()
		```
		- #### forHeadersAndEntity
		
		
		
		```
		public <T extends [HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model")> [ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<scala.Tuple2<scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>> forHeadersAndEntity()
		```
		- #### forResponse
		
		
		
		```
		public [ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> forResponse()
		```
		- #### forRequest
		
		
		
		```
		public [ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> forRequest()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/ContentTypeOverrider$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/ContentTypeOverrider.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/ContentTypeOverrider$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/ContentTypeOverrider$.html)*