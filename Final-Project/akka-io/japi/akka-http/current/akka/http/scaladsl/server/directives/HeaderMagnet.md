---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet.html
title: HeaderMagnet
---

# HeaderMagnet

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface HeaderMagnet\<T\>

- ---

```
public interface HeaderMagnet<T>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.reflect.ClassTag<[T](HeaderMagnet.html "type parameter in HeaderMagnet")>` | `[classTag](#classTag())()` |  |
	| `scala.PartialFunction<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​[T](HeaderMagnet.html "type parameter in HeaderMagnet")>` | `[extractPF](#extractPF())()` | Returns a partial function that checks if the input value is of runtime type  T and returns the value if it does. |
	| `java.lang.String` | `[headerName](#headerName())()` |  |
	| `java.lang.Class<[T](HeaderMagnet.html "type parameter in HeaderMagnet")>` | `[runtimeClass](#runtimeClass())()` |  |

- - ### Method Detail
	
	
	
		- #### classTag
		
		
		
		```
		scala.reflect.ClassTag<[T](HeaderMagnet.html "type parameter in HeaderMagnet")> classTag()
		```
		- #### runtimeClass
		
		
		
		```
		java.lang.Class<[T](HeaderMagnet.html "type parameter in HeaderMagnet")> runtimeClass()
		```
		- #### headerName
		
		
		
		```
		java.lang.String headerName()
		```
		- #### extractPF
		
		
		
		```
		scala.PartialFunction<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​[T](HeaderMagnet.html "type parameter in HeaderMagnet")> extractPF()
		```
		
		Returns a partial function that checks if the input value is of runtime type
		 T and returns the value if it does. Doesn't take erased information into account.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet.html)*