---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Keep$.html
title: Keep$
---

# Keep$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Keep$

- java.lang.Object
- - akka.stream.scaladsl.Keep$

- ---

```
public class Keep$
extends java.lang.Object
```

Convenience functions for often\-encountered purposes like keeping only the
 left (first) or only the right (second) of two input values.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Keep$](Keep$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Keep$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<L,​R>scala.Function2<L,​R,​scala.Tuple2<L,​R>>` | `[both](#both())()` |  |
	| `<L,​R>scala.Function2<L,​R,​L>` | `[left](#left())()` |  |
	| `<L,​R>scala.Function2<L,​R,​[NotUsed](../../NotUsed.html "class in akka")>` | `[none](#none())()` |  |
	| `<L,​R>scala.Function2<L,​R,​R>` | `[right](#right())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Keep$](Keep$.html "class in akka.stream.scaladsl") MODULE$
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
		public <L,​R> scala.Function2<L,​R,​L> left()
		```
		- #### right
		
		
		
		```
		public <L,​R> scala.Function2<L,​R,​R> right()
		```
		- #### both
		
		
		
		```
		public <L,​R> scala.Function2<L,​R,​scala.Tuple2<L,​R>> both()
		```
		- #### none
		
		
		
		```
		public <L,​R> scala.Function2<L,​R,​[NotUsed](../../NotUsed.html "class in akka")> none()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Keep$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Keep$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Keep$.html)*