---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/VersionExtractor$.html
title: VersionExtractor$
---

# VersionExtractor$

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class VersionExtractor$

- java.lang.Object
- - akka.serialization.jackson.VersionExtractor$

- ---

```
public class VersionExtractor$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [VersionExtractor$](VersionExtractor$.html "class in akka.serialization.jackson")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[VersionExtractor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Some<scala.Tuple2<java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(com.fasterxml.jackson.core.Version))​(com.fasterxml.jackson.core.Version v)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [VersionExtractor$](VersionExtractor$.html "class in akka.serialization.jackson") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### VersionExtractor$
		
		
		
		```
		public VersionExtractor$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Some<scala.Tuple2<java.lang.Object,​java.lang.Object>> unapply​(com.fasterxml.jackson.core.Version v)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/VersionExtractor$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/VersionExtractor$.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/VersionExtractor$.html)*