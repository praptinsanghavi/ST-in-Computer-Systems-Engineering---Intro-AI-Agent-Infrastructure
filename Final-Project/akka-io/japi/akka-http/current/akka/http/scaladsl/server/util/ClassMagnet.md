---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ClassMagnet.html
title: ClassMagnet
---

# ClassMagnet

## Content

Package [akka.http.scaladsl.server.util](package-summary.html)
## Interface ClassMagnet\<T\>

- ---

```
public interface ClassMagnet<T>
```

A magnet that wraps a ClassTag

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.reflect.ClassTag<[T](ClassMagnet.html "type parameter in ClassMagnet")>` | `[classTag](#classTag())()` |  |
	| `scala.PartialFunction<java.lang.Object,​[T](ClassMagnet.html "type parameter in ClassMagnet")>` | `[extractPF](#extractPF())()` | Returns a partial function that checks if the input value is of runtime type  T and returns the value if it does. |
	| `java.lang.Class<[T](ClassMagnet.html "type parameter in ClassMagnet")>` | `[runtimeClass](#runtimeClass())()` |  |

- - ### Method Detail
	
	
	
		- #### classTag
		
		
		
		```
		scala.reflect.ClassTag<[T](ClassMagnet.html "type parameter in ClassMagnet")> classTag()
		```
		- #### runtimeClass
		
		
		
		```
		java.lang.Class<[T](ClassMagnet.html "type parameter in ClassMagnet")> runtimeClass()
		```
		- #### extractPF
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​[T](ClassMagnet.html "type parameter in ClassMagnet")> extractPF()
		```
		
		Returns a partial function that checks if the input value is of runtime type
		 T and returns the value if it does. Doesn't take erased information into account.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ClassMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ClassMagnet.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ClassMagnet.html)*