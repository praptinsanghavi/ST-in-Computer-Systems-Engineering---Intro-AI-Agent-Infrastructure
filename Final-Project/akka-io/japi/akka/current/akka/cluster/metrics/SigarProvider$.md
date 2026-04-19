---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/SigarProvider$.html
title: SigarProvider$
---

# SigarProvider$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class SigarProvider$

- java.lang.Object
- - akka.cluster.metrics.SigarProvider$

- ---

```
public class SigarProvider$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SigarProvider$](SigarProvider$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SigarProvider$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[close](#close(org.hyperic.sigar.SigarProxy))​(org.hyperic.sigar.SigarProxy sigar)` | Release underlying sigar proxy resources. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SigarProvider$](SigarProvider$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SigarProvider$
		
		
		
		```
		public SigarProvider$()
		```

	- ### Method Detail
	
	
	
		- #### close
		
		
		
		```
		public void close​(org.hyperic.sigar.SigarProxy sigar)
		```
		
		Release underlying sigar proxy resources.
		 
		 Note: `SigarProxy` is not `Sigar` during tests.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/SigarProvider$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/SigarProvider$.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/SigarProvider$.html)*