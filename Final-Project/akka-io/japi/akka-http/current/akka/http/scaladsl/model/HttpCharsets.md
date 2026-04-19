---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsets.html
title: HttpCharsets
---

# HttpCharsets

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpCharsets

- java.lang.Object
- - akka.http.scaladsl.model.HttpCharsets

- ---

```
public class HttpCharsets
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCharsets](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.collection.immutable.Map<K,​V>` | `[akka$http$impl$util$ObjectRegistry$$_registry](#akka$http$impl$util$ObjectRegistry$$_registry())()` |  |
	| `static void` | `[akka$http$impl$util$ObjectRegistry$$_registry_$eq](#akka$http$impl$util$ObjectRegistry$$_registry_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<K,​V> x$1)` |  |
	| `static scala.Option<V>` | `[getForKey](#getForKey(K))​(K key)` |  |
	| `static scala.Option<V>` | `[getForKeyCaseInsensitive](#getForKeyCaseInsensitive(java.lang.String,scala.$less$colon$less))​(java.lang.String key,  scala.$less$colon$less<java.lang.String,​K> conv)` |  |
	| `protected static java.lang.Object` | `[register](#register(K,V))​(K key,  V obj)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpCharsets
		
		
		
		```
		public HttpCharsets()
		```

	- ### Method Detail
	
	
	
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

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsets.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsets.html)*