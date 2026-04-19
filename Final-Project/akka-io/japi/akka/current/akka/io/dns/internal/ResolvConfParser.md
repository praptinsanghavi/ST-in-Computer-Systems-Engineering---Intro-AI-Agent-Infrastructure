---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/internal/ResolvConfParser.html
title: ResolvConfParser
---

# ResolvConfParser

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class ResolvConfParser

- java.lang.Object
- - akka.io.dns.internal.ResolvConfParser

- ---

```
public class ResolvConfParser
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResolvConfParser](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.util.Try<akka.io.dns.internal.ResolvConf>` | `[parseFile](#parseFile(java.io.File))​(java.io.File file)` | Does a partial parse according to https://linux.die.net/man/5/resolver. |
	| `static akka.io.dns.internal.ResolvConf` | `[parseLines](#parseLines(scala.collection.Iterator))​(scala.collection.Iterator<java.lang.String> lines)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ResolvConfParser
		
		
		
		```
		public ResolvConfParser()
		```

	- ### Method Detail
	
	
	
		- #### parseFile
		
		
		
		```
		public static scala.util.Try<akka.io.dns.internal.ResolvConf> parseFile​(java.io.File file)
		```
		
		Does a partial parse according to https://linux.die.net/man/5/resolver.
		- #### parseLines
		
		
		
		```
		public static akka.io.dns.internal.ResolvConf parseLines​(scala.collection.Iterator<java.lang.String> lines)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/internal/ResolvConfParser.html](https://doc.akka.io/japi/akka/current/akka/io/dns/internal/ResolvConfParser.html)*