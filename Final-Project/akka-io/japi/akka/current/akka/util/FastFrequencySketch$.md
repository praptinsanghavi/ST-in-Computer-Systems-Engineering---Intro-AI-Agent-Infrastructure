---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/FastFrequencySketch$.html
title: FastFrequencySketch$
---

# FastFrequencySketch$

## Content

Package [akka.util](package-summary.html)
## Class FastFrequencySketch$

- java.lang.Object
- - akka.util.FastFrequencySketch$

- ---

```
public class FastFrequencySketch$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FastFrequencySketch$](FastFrequencySketch$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FastFrequencySketch$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> akka.util.FastFrequencySketch<A>` | `[apply](#apply(int,int,double))​(int capacity,  int widthMultiplier,  double resetMultiplier)` | Create a new FastFrequencySketch based on the cache capacity (which will be increased to the nearest power of two). |
	| `<A> int` | `[apply$default$2](#apply$default$2())()` |  |
	| `<A> double` | `[apply$default$3](#apply$default$3())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FastFrequencySketch$](FastFrequencySketch$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FastFrequencySketch$
		
		
		
		```
		public FastFrequencySketch$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A> akka.util.FastFrequencySketch<A> apply​(int capacity,
		                                                  int widthMultiplier,
		                                                  double resetMultiplier)
		```
		
		Create a new FastFrequencySketch based on the cache capacity (which will be increased to the nearest power of two).
		 
		
		Parameters:
		`capacity` \- the cache capacity (maximum items that will be cached)
		`widthMultiplier` \- a multiplier for the width of the sketch
		`resetMultiplier` \- the multiplier on the capacity for the reset size
		Returns:
		a configured FastFrequencySketch
		- #### apply$default$2
		
		
		
		```
		public <A> int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public <A> double apply$default$3()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/FastFrequencySketch$.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/FastFrequencySketch$.html](https://doc.akka.io/japi/akka/current/akka/util/FastFrequencySketch$.html)*