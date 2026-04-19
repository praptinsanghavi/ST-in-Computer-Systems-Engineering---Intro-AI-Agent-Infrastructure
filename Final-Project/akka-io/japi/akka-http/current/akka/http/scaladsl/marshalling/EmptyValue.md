---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/EmptyValue.html
title: EmptyValue
---

# EmptyValue

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Class EmptyValue\<T\>

- java.lang.Object
- - akka.http.scaladsl.marshalling.EmptyValue\<T\>

- ---

```
public class EmptyValue<T>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EmptyValue](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [EmptyValue](EmptyValue.html "class in akka.http.scaladsl.marshalling")<[UniversalEntity](../model/UniversalEntity.html "interface in akka.http.scaladsl.model")>` | `[emptyEntity](#emptyEntity())()` |  |
	| `static [EmptyValue](EmptyValue.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​[UniversalEntity](../model/UniversalEntity.html "interface in akka.http.scaladsl.model")>>` | `[emptyHeadersAndEntity](#emptyHeadersAndEntity())()` |  |
	| `static [EmptyValue](EmptyValue.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[emptyResponse](#emptyResponse())()` |  |
	| `[T](EmptyValue.html "type parameter in EmptyValue")` | `[emptyValue](#emptyValue())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EmptyValue
		
		
		
		```
		public EmptyValue()
		```

	- ### Method Detail
	
	
	
		- #### emptyEntity
		
		
		
		```
		public static [EmptyValue](EmptyValue.html "class in akka.http.scaladsl.marshalling")<[UniversalEntity](../model/UniversalEntity.html "interface in akka.http.scaladsl.model")> emptyEntity()
		```
		- #### emptyHeadersAndEntity
		
		
		
		```
		public static [EmptyValue](EmptyValue.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​[UniversalEntity](../model/UniversalEntity.html "interface in akka.http.scaladsl.model")>> emptyHeadersAndEntity()
		```
		- #### emptyResponse
		
		
		
		```
		public static [EmptyValue](EmptyValue.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> emptyResponse()
		```
		- #### emptyValue
		
		
		
		```
		public [T](EmptyValue.html "type parameter in EmptyValue") emptyValue()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/EmptyValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UniversalEntity.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/EmptyValue.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/EmptyValue.html)*