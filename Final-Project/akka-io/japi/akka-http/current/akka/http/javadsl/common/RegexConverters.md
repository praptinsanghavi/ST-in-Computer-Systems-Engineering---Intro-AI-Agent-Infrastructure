---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/RegexConverters.html
title: RegexConverters
---

# RegexConverters

## Content

Package [akka.http.javadsl.common](package-summary.html)
## Class RegexConverters

- java.lang.Object
- - akka.http.javadsl.common.RegexConverters

- ---

```
public final class RegexConverters
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RegexConverters](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.util.matching.Regex` | `[toScala](#toScala(java.util.regex.Pattern))​(java.util.regex.Pattern p)` | Converts the given Java Pattern into a scala Regex, without recompiling it. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RegexConverters
		
		
		
		```
		public RegexConverters()
		```

	- ### Method Detail
	
	
	
		- #### toScala
		
		
		
		```
		public static scala.util.matching.Regex toScala​(java.util.regex.Pattern p)
		```
		
		Converts the given Java Pattern into a scala Regex, without recompiling it.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/RegexConverters.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/RegexConverters.html)*