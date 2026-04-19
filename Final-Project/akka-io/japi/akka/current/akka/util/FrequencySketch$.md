---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/FrequencySketch$.html
title: FrequencySketch$
---

# FrequencySketch$

## Content

Package [akka.util](package-summary.html)
## Class FrequencySketch$

- java.lang.Object
- - akka.util.FrequencySketch$

- ---

```
public class FrequencySketch$
extends java.lang.Object
```

INTERNAL API
 
 A frequency sketch for estimating the popularity of items. For implementing the TinyLFU cache admission policy.
 The frequency sketch includes the TinyLFU reset operation, which periodically halves all counters.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FrequencySketch$](FrequencySketch$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrequencySketch$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> akka.util.FrequencySketch<A>` | `[apply](#apply(int,int,double,int,int,akka.util.FrequencySketch.Hasher))​(int capacity,  int widthMultiplier,  double resetMultiplier,  int depth,  int counterBits,  akka.util.FrequencySketch.Hasher<A> hasher)` | Create a new FrequencySketch based on the cache capacity (which will be increased to the nearest power of two). |
	| `<A> int` | `[apply$default$2](#apply$default$2())()` |  |
	| `<A> double` | `[apply$default$3](#apply$default$3())()` |  |
	| `<A> int` | `[apply$default$4](#apply$default$4())()` |  |
	| `<A> int` | `[apply$default$5](#apply$default$5())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FrequencySketch$](FrequencySketch$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FrequencySketch$
		
		
		
		```
		public FrequencySketch$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A> akka.util.FrequencySketch<A> apply​(int capacity,
		                                              int widthMultiplier,
		                                              double resetMultiplier,
		                                              int depth,
		                                              int counterBits,
		                                              akka.util.FrequencySketch.Hasher<A> hasher)
		```
		
		Create a new FrequencySketch based on the cache capacity (which will be increased to the nearest power of two).
		 
		
		Parameters:
		`capacity` \- the cache capacity (maximum items that will be cached)
		`widthMultiplier` \- a multiplier for the width of the sketch
		`resetMultiplier` \- the multiplier on the capacity for the reset size
		`depth` \- the depth of count\-min sketch (number of hash functions)
		`counterBits` \- the size of the counters in bits: 2, 4, 8, 16, 32, or 64 bits
		`hasher` \- the hash function for the element type
		Returns:
		a configured FrequencySketch
		- #### apply$default$2
		
		
		
		```
		public <A> int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public <A> double apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public <A> int apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public <A> int apply$default$5()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/FrequencySketch$.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/FrequencySketch$.html](https://doc.akka.io/japi/akka/current/akka/util/FrequencySketch$.html)*