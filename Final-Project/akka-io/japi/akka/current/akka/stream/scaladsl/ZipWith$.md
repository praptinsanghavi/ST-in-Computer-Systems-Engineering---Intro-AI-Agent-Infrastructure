---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:43:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith$.html
title: ZipWith$
---

# ZipWith$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipWith$

- java.lang.Object
- - akka.stream.scaladsl.ZipWith$

- All Implemented Interfaces:
`[ZipWithApply](ZipWithApply.html "interface in akka.stream.scaladsl")`

---

```
public class ZipWith$
extends java.lang.Object
implements [ZipWithApply](ZipWithApply.html "interface in akka.stream.scaladsl")
```

Combine the elements of multiple streams into a stream of combined elements using a combiner function.
 
 '''Emits when''' all of the inputs has an element available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' any upstream completes
 

 '''Cancels when''' downstream cancels

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ZipWith$](ZipWith$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipWith$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.scaladsl.[ZipWithApply](ZipWithApply.html "interface in akka.stream.scaladsl")
		
		
		`[apply](ZipWithApply.html#apply(scala.Function10)), [apply](ZipWithApply.html#apply(scala.Function11)), [apply](ZipWithApply.html#apply(scala.Function12)), [apply](ZipWithApply.html#apply(scala.Function13)), [apply](ZipWithApply.html#apply(scala.Function14)), [apply](ZipWithApply.html#apply(scala.Function15)), [apply](ZipWithApply.html#apply(scala.Function16)), [apply](ZipWithApply.html#apply(scala.Function17)), [apply](ZipWithApply.html#apply(scala.Function18)), [apply](ZipWithApply.html#apply(scala.Function19)), [apply](ZipWithApply.html#apply(scala.Function2)), [apply](ZipWithApply.html#apply(scala.Function20)), [apply](ZipWithApply.html#apply(scala.Function21)), [apply](ZipWithApply.html#apply(scala.Function22)), [apply](ZipWithApply.html#apply(scala.Function3)), [apply](ZipWithApply.html#apply(scala.Function4)), [apply](ZipWithApply.html#apply(scala.Function5)), [apply](ZipWithApply.html#apply(scala.Function6)), [apply](ZipWithApply.html#apply(scala.Function7)), [apply](ZipWithApply.html#apply(scala.Function8)), [apply](ZipWithApply.html#apply(scala.Function9))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ZipWith$](ZipWith$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ZipWith$
		
		
		
		```
		public ZipWith$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWithApply.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith$.html)*