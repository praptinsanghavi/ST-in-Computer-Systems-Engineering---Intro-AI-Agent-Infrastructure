---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/FrequencySketchUtil.html
title: FrequencySketchUtil
---

# FrequencySketchUtil

## Content

Package [akka.util](package-summary.html)
## Class FrequencySketchUtil

- java.lang.Object
- - akka.util.FrequencySketchUtil

- ---

```
public class FrequencySketchUtil
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrequencySketchUtil](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[debugString](#debugString(long%5B%5D%5B%5D,int,int,int,long))​(long[][] matrix,  int rowWidth,  int slots,  int counterWidth,  long counterMax)` | Create a pretty table with all the frequency sketch counters for debugging (smaller) sketches. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FrequencySketchUtil
		
		
		
		```
		public FrequencySketchUtil()
		```

	- ### Method Detail
	
	
	
		- #### debugString
		
		
		
		```
		public static java.lang.String debugString​(long[][] matrix,
		                                           int rowWidth,
		                                           int slots,
		                                           int counterWidth,
		                                           long counterMax)
		```
		
		Create a pretty table with all the frequency sketch counters for debugging (smaller) sketches.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/FrequencySketchUtil.html](https://doc.akka.io/japi/akka/current/akka/util/FrequencySketchUtil.html)*