---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/CurrentTime$.html
title: CurrentTime$
---

# CurrentTime$

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Class CurrentTime$

- java.lang.Object
- - akka.persistence.testkit.internal.CurrentTime$

- ---

```
public class CurrentTime$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CurrentTime$](CurrentTime$.html "class in akka.persistence.testkit.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CurrentTime$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[now](#now())()` | `System.currentTimeMillis` but always increasing. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CurrentTime$](CurrentTime$.html "class in akka.persistence.testkit.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CurrentTime$
		
		
		
		```
		public CurrentTime$()
		```

	- ### Method Detail
	
	
	
		- #### now
		
		
		
		```
		public long now()
		```
		
		`System.currentTimeMillis` but always increasing.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/CurrentTime$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/CurrentTime$.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/CurrentTime$.html)*