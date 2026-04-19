---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/CachePolicy.Ttl$.html
title: CachePolicy.Ttl$
---

# CachePolicy.Ttl$

## Content

Package [akka.io.dns](package-summary.html)
## Class CachePolicy.Ttl$

- java.lang.Object
- - akka.io.dns.CachePolicy.Ttl$

- Enclosing class:
[CachePolicy](CachePolicy.html "class in akka.io.dns")

---

```
public static class CachePolicy.Ttl$
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[CachePolicy.Ttl$.TtlIsOrdered$](CachePolicy.Ttl$.TtlIsOrdered$.html "class in akka.io.dns")` |  |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CachePolicy.Ttl$](CachePolicy.Ttl$.html "class in akka.io.dns")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Ttl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")` | `[effectivelyForever](#effectivelyForever())()` |  |
	| `[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")` | `[fromPositive](#fromPositive(java.time.Duration))​(java.time.Duration value)` |  |
	| `[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")` | `[fromPositive](#fromPositive(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")` | `[never](#never())()` |  |
	| `scala.Option<scala.concurrent.duration.FiniteDuration>` | `[unapply](#unapply(akka.io.dns.CachePolicy.Ttl))​([CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CachePolicy.Ttl$](CachePolicy.Ttl$.html "class in akka.io.dns") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Ttl$
		
		
		
		```
		public Ttl$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Option<scala.concurrent.duration.FiniteDuration> unapply​([CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") ttl)
		```
		- #### fromPositive
		
		
		
		```
		public [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") fromPositive​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### fromPositive
		
		
		
		```
		public [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") fromPositive​(java.time.Duration value)
		```
		- #### never
		
		
		
		```
		public [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") never()
		```
		- #### effectivelyForever
		
		
		
		```
		public [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") effectivelyForever()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/CachePolicy.Ttl$.TtlIsOrdered$.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/CachePolicy.Ttl$.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/CachePolicy.Ttl.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/CachePolicy.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/CachePolicy.Ttl$.html](https://doc.akka.io/japi/akka/current/akka/io/dns/CachePolicy.Ttl$.html)*