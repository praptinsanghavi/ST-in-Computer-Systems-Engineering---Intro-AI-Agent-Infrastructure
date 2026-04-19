---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodings.html
title: HttpEncodings
---

# HttpEncodings

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpEncodings

- java.lang.Object
- - akka.http.scaladsl.model.headers.HttpEncodings

- ---

```
public class HttpEncodings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpEncodings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.collection.immutable.Map<K,​V>` | `[akka$http$impl$util$ObjectRegistry$$_registry](#akka$http$impl$util$ObjectRegistry$$_registry())()` |  |
	| `static void` | `[akka$http$impl$util$ObjectRegistry$$_registry_$eq](#akka$http$impl$util$ObjectRegistry$$_registry_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<K,​V> x$1)` |  |
	| `static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[chunked](#chunked())()` |  |
	| `static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[compress](#compress())()` |  |
	| `static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[deflate](#deflate())()` |  |
	| `static scala.Option<V>` | `[getForKey](#getForKey(K))​(K key)` |  |
	| `static scala.Option<V>` | `[getForKeyCaseInsensitive](#getForKeyCaseInsensitive(java.lang.String,scala.$less$colon$less))​(java.lang.String key,  scala.$less$colon$less<java.lang.String,​K> conv)` |  |
	| `static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[gzip](#gzip())()` |  |
	| `static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[identity](#identity())()` |  |
	| `protected static java.lang.Object` | `[register](#register(K,V))​(K key,  V obj)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpEncodings
		
		
		
		```
		public HttpEncodings()
		```

	- ### Method Detail
	
	
	
		- #### compress
		
		
		
		```
		public static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers") compress()
		```
		- #### chunked
		
		
		
		```
		public static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers") chunked()
		```
		- #### deflate
		
		
		
		```
		public static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers") deflate()
		```
		- #### gzip
		
		
		
		```
		public static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers") gzip()
		```
		- #### identity
		
		
		
		```
		public static [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers") identity()
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
		- #### getForKeyCaseInsensitive
		
		
		
		```
		public static scala.Option<V> getForKeyCaseInsensitive​(java.lang.String key,
		                                                       scala.$less$colon$less<java.lang.String,​K> conv)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodings.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodings.html)*