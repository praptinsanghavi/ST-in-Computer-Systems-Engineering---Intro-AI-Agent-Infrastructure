---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/internal/ResolvConfParser$.html
title: ResolvConfParser$
---

# ResolvConfParser$

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class ResolvConfParser$

- java.lang.Object
- - akka.io.dns.internal.ResolvConfParser$

- ---

```
public class ResolvConfParser$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ResolvConfParser$](ResolvConfParser$.html "class in akka.io.dns.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResolvConfParser$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.util.Try<akka.io.dns.internal.ResolvConf>` | `[parseFile](#parseFile(java.io.File))​(java.io.File file)` | Does a partial parse according to https://linux.die.net/man/5/resolver. |
	| `akka.io.dns.internal.ResolvConf` | `[parseLines](#parseLines(scala.collection.Iterator))​(scala.collection.Iterator<java.lang.String> lines)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ResolvConfParser$](ResolvConfParser$.html "class in akka.io.dns.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ResolvConfParser$
		
		
		
		```
		public ResolvConfParser$()
		```

	- ### Method Detail
	
	
	
		- #### parseFile
		
		
		
		```
		public scala.util.Try<akka.io.dns.internal.ResolvConf> parseFile​(java.io.File file)
		```
		
		Does a partial parse according to https://linux.die.net/man/5/resolver.
		- #### parseLines
		
		
		
		```
		public akka.io.dns.internal.ResolvConf parseLines​(scala.collection.Iterator<java.lang.String> lines)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/ResolvConfParser$.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/internal/ResolvConfParser$.html](https://doc.akka.io/japi/akka/current/akka/io/dns/internal/ResolvConfParser$.html)*