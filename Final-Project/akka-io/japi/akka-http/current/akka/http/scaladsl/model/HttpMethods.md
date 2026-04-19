---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethods.html
title: HttpMethods
---

# HttpMethods

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpMethods

- java.lang.Object
- - akka.http.scaladsl.model.HttpMethods

- ---

```
public class HttpMethods
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpMethods](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.collection.immutable.Map<K,​V>` | `[akka$http$impl$util$ObjectRegistry$$_registry](#akka$http$impl$util$ObjectRegistry$$_registry())()` |  |
	| `static void` | `[akka$http$impl$util$ObjectRegistry$$_registry_$eq](#akka$http$impl$util$ObjectRegistry$$_registry_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<K,​V> x$1)` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[CONNECT](#CONNECT())()` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[DELETE](#DELETE())()` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[GET](#GET())()` |  |
	| `static scala.Option<V>` | `[getForKey](#getForKey(K))​(K key)` |  |
	| `static scala.Option<[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")>` | `[getForKeyCaseInsensitive](#getForKeyCaseInsensitive(java.lang.String,scala.$less$colon$less))​(java.lang.String key,  scala.$less$colon$less<java.lang.String,​java.lang.String> conv)` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[HEAD](#HEAD())()` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[OPTIONS](#OPTIONS())()` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[PATCH](#PATCH())()` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[POST](#POST())()` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[PUT](#PUT())()` |  |
	| `protected static java.lang.Object` | `[register](#register(K,V))​(K key,  V obj)` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[TRACE](#TRACE())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpMethods
		
		
		
		```
		public HttpMethods()
		```

	- ### Method Detail
	
	
	
		- #### CONNECT
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") CONNECT()
		```
		- #### DELETE
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") DELETE()
		```
		- #### GET
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") GET()
		```
		- #### HEAD
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") HEAD()
		```
		- #### OPTIONS
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") OPTIONS()
		```
		- #### PATCH
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") PATCH()
		```
		- #### POST
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") POST()
		```
		- #### PUT
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") PUT()
		```
		- #### TRACE
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") TRACE()
		```
		- #### getForKeyCaseInsensitive
		
		
		
		```
		public static scala.Option<[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")> getForKeyCaseInsensitive​(java.lang.String key,
		                                                                scala.$less$colon$less<java.lang.String,​java.lang.String> conv)
		```
		- #### akka$http$impl$util$ObjectRegistry$$\_registry
		
		
		
		```
		public static scala.collection.immutable.Map<K,​V> akka$http$impl$util$ObjectRegistry$$_registry()
		```
		- #### akka$http$impl$util$ObjectRegistry$$\_registry\_$eq
		
		
		
		```
		public static void akka$http$impl$util$ObjectRegistry$$_registry_$eq​(scala.collection.immutable.Map<K,​V> x$1)
		```
		- #### register
		
		
		
		```
		protected static final java.lang.Object register​(K key,
		                                                 V obj)
		```
		- #### getForKey
		
		
		
		```
		public static scala.Option<V> getForKey​(K key)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethods.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethods.html)*