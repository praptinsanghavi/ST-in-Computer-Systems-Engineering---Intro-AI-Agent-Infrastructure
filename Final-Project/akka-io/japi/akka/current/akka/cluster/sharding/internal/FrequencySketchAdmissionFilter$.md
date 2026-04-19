---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/FrequencySketchAdmissionFilter$.html
title: FrequencySketchAdmissionFilter$
---

# FrequencySketchAdmissionFilter$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class FrequencySketchAdmissionFilter$

- java.lang.Object
- - akka.cluster.sharding.internal.FrequencySketchAdmissionFilter$

- ---

```
public class FrequencySketchAdmissionFilter$
extends java.lang.Object
```

INTERNAL API
 
 Admission filter based on a frequency sketch.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FrequencySketchAdmissionFilter$](FrequencySketchAdmissionFilter$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrequencySketchAdmissionFilter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.sharding.internal.AdmissionFilter` | `[apply](#apply(int,int,double,int,int))​(int initialCapacity,  int widthMultiplier,  double resetMultiplier,  int depth,  int counterBits)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FrequencySketchAdmissionFilter$](FrequencySketchAdmissionFilter$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FrequencySketchAdmissionFilter$
		
		
		
		```
		public FrequencySketchAdmissionFilter$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.cluster.sharding.internal.AdmissionFilter apply​(int initialCapacity,
		                                                            int widthMultiplier,
		                                                            double resetMultiplier,
		                                                            int depth,
		                                                            int counterBits)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/FrequencySketchAdmissionFilter$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/FrequencySketchAdmissionFilter$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/FrequencySketchAdmissionFilter$.html)*