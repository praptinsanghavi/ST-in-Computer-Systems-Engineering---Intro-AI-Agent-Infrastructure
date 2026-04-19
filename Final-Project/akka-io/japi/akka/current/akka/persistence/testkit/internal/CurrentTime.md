---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/CurrentTime.html
title: CurrentTime
---

# CurrentTime

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Class CurrentTime

- java.lang.Object
- - akka.persistence.testkit.internal.CurrentTime

- ---

```
public class CurrentTime
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CurrentTime](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static long` | `[now](#now())()` | `System.currentTimeMillis` but always increasing. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CurrentTime
		
		
		
		```
		public CurrentTime()
		```

	- ### Method Detail
	
	
	
		- #### now
		
		
		
		```
		public static long now()
		```
		
		`System.currentTimeMillis` but always increasing.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/CurrentTime.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/CurrentTime.html)*