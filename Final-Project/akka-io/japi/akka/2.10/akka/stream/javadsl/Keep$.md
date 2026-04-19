---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:01:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Keep$.html
title: Keep$
---

# Keep$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Keep$

- java.lang.Object
- - akka.stream.javadsl.Keep$

- ---

```
public class Keep$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Keep$](Keep$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Keep$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<L,​R>[Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​[Pair](../../japi/Pair.html "class in akka.japi")<L,​R>>` | `[both](#both())()` |  |
	| `<L,​R>[Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​L>` | `[left](#left())()` |  |
	| `<L,​R>[Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​[NotUsed](../../NotUsed.html "class in akka")>` | `[none](#none())()` |  |
	| `<L,​R>[Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​R>` | `[right](#right())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Keep$](Keep$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Keep$
		
		
		
		```
		public Keep$()
		```

	- ### Method Detail
	
	
	
		- #### left
		
		
		
		```
		public <L,​R> [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​L> left()
		```
		- #### right
		
		
		
		```
		public <L,​R> [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​R> right()
		```
		- #### both
		
		
		
		```
		public <L,​R> [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​[Pair](../../japi/Pair.html "class in akka.japi")<L,​R>> both()
		```
		- #### none
		
		
		
		```
		public <L,​R> [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​[NotUsed](../../NotUsed.html "class in akka")> none()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Keep$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Keep$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Keep$.html)*