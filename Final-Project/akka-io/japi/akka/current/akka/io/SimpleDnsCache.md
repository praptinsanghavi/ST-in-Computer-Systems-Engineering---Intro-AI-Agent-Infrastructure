---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:17:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/SimpleDnsCache.CacheEntry$.html
title: SimpleDnsCache.CacheEntry$
---

# SimpleDnsCache.CacheEntry$

## Content

Package [akka.io](package-summary.html)
## Class SimpleDnsCache.CacheEntry$

- java.lang.Object
- - akka.io.SimpleDnsCache.CacheEntry$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[SimpleDnsCache](SimpleDnsCache.html "class in akka.io")

---

```
public static class SimpleDnsCache.CacheEntry$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.io.SimpleDnsCache.CacheEntry$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SimpleDnsCache.CacheEntry$](SimpleDnsCache.CacheEntry$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CacheEntry$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> akka.io.SimpleDnsCache.CacheEntry<T>` | `[apply](#apply(T,long))​(T answer,  long until)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple2<T,​java.lang.Object>>` | `[unapply](#unapply(akka.io.SimpleDnsCache.CacheEntry))​(akka.io.SimpleDnsCache.CacheEntry<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SimpleDnsCache.CacheEntry$](SimpleDnsCache.CacheEntry$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CacheEntry$
		
		
		
		```
		public CacheEntry$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <T> akka.io.SimpleDnsCache.CacheEntry<T> apply​(T answer,
		                                                      long until)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple2<T,​java.lang.Object>> unapply​(akka.io.SimpleDnsCache.CacheEntry<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/SimpleDnsCache.CacheEntry$.html
- https://doc.akka.io/japi/akka/current/akka/io/SimpleDnsCache.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/SimpleDnsCache.CacheEntry$.html](https://doc.akka.io/japi/akka/current/akka/io/SimpleDnsCache.CacheEntry$.html)*