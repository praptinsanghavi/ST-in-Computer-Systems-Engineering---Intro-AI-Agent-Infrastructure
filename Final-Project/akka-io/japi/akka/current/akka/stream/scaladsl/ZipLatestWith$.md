---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:43:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith$.html
title: ZipLatestWith$
---

# ZipLatestWith$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipLatestWith$

- java.lang.Object
- - akka.stream.scaladsl.ZipLatestWith$

- All Implemented Interfaces:
`[ZipLatestWithApply](ZipLatestWithApply.html "interface in akka.stream.scaladsl")`

---

```
public class ZipLatestWith$
extends java.lang.Object
implements [ZipLatestWithApply](ZipLatestWithApply.html "interface in akka.stream.scaladsl")
```

Combine the elements of multiple streams into a stream of combined elements using a combiner function,
 picking always the latest of the elements of each source. The combined stream completes immediately if
 some upstreams have already completed while some upstreams did not emitted any value yet.
 If all upstreams produced some value and the optional parameter `eagerComplete` is true (default),
 the combined stream completes when any of the upstreams completes, otherwise, the combined stream
 will wait for all upstreams to complete.
 
 No element is emitted until at least one element from each Source becomes available. Whenever a new
 element appears, the zipping function is invoked with a tuple containing the new element
 and the other last seen elements.
 

 '''Emits when''' all of the inputs have at least an element available, and then each time an element becomes
 available on either of the inputs
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' any of the upstreams completes
 

 '''Cancels when''' downstream cancels

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ZipLatestWith$](ZipLatestWith$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipLatestWith$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.scaladsl.[ZipLatestWithApply](ZipLatestWithApply.html "interface in akka.stream.scaladsl")
		
		
		`[apply](ZipLatestWithApply.html#apply(scala.Function10)), [apply](ZipLatestWithApply.html#apply(scala.Function10,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function11)), [apply](ZipLatestWithApply.html#apply(scala.Function11,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function12)), [apply](ZipLatestWithApply.html#apply(scala.Function12,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function13)), [apply](ZipLatestWithApply.html#apply(scala.Function13,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function14)), [apply](ZipLatestWithApply.html#apply(scala.Function14,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function15)), [apply](ZipLatestWithApply.html#apply(scala.Function15,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function16)), [apply](ZipLatestWithApply.html#apply(scala.Function16,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function17)), [apply](ZipLatestWithApply.html#apply(scala.Function17,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function18)), [apply](ZipLatestWithApply.html#apply(scala.Function18,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function19)), [apply](ZipLatestWithApply.html#apply(scala.Function19,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function2)), [apply](ZipLatestWithApply.html#apply(scala.Function2,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function20)), [apply](ZipLatestWithApply.html#apply(scala.Function20,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function21)), [apply](ZipLatestWithApply.html#apply(scala.Function21,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function22)), [apply](ZipLatestWithApply.html#apply(scala.Function22,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function3)), [apply](ZipLatestWithApply.html#apply(scala.Function3,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function4)), [apply](ZipLatestWithApply.html#apply(scala.Function4,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function5)), [apply](ZipLatestWithApply.html#apply(scala.Function5,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function6)), [apply](ZipLatestWithApply.html#apply(scala.Function6,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function7)), [apply](ZipLatestWithApply.html#apply(scala.Function7,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function8)), [apply](ZipLatestWithApply.html#apply(scala.Function8,boolean)), [apply](ZipLatestWithApply.html#apply(scala.Function9)), [apply](ZipLatestWithApply.html#apply(scala.Function9,boolean))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ZipLatestWith$](ZipLatestWith$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ZipLatestWith$
		
		
		
		```
		public ZipLatestWith$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWithApply.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith$.html)*