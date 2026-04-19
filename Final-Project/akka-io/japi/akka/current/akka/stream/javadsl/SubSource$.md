---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SubSource$.html
title: SubSource$
---

# SubSource$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class SubSource$

- java.lang.Object
- - akka.stream.javadsl.SubSource$

- ---

```
public class SubSource$
extends java.lang.Object
```

\* Upcast a stream of elements to a stream of supertypes of that element. Useful in combination with
 fan\-in operators where you do not want to pay the cost of casting each element in a `map`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SubSource$](SubSource$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SubSource$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<U,​T extends U,​Mat>[SubSource](SubSource.html "class in akka.stream.javadsl")<U,​Mat>` | `[upcast](#upcast(akka.stream.javadsl.SubSource))​([SubSource](SubSource.html "class in akka.stream.javadsl")<T,​Mat> source)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SubSource$](SubSource$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SubSource$
		
		
		
		```
		public SubSource$()
		```

	- ### Method Detail
	
	
	
		- #### upcast
		
		
		
		```
		public <U,​T extends U,​Mat> [SubSource](SubSource.html "class in akka.stream.javadsl")<U,​Mat> upcast​([SubSource](SubSource.html "class in akka.stream.javadsl")<T,​Mat> source)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SubSource$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SubSource.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SubSource$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SubSource$.html)*