---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetector.Clock.html
title: FailureDetector.Clock
---

# FailureDetector.Clock

## Content

Package [akka.remote](package-summary.html)
## Class FailureDetector.Clock

- java.lang.Object
- - akka.remote.FailureDetector.Clock

- All Implemented Interfaces:
`scala.Function0<java.lang.Object>`

Enclosing interface:
[FailureDetector](FailureDetector.html "interface in akka.remote")

---

```
public abstract static class FailureDetector.Clock
extends java.lang.Object
implements scala.Function0<java.lang.Object>
```

Abstraction of a clock that returns time in milliseconds. Clock can only be used to measure elapsed
 time and is not related to any other notion of system or wall\-clock time.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Clock](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function0
		
		
		`apply, apply$mcB$sp, apply$mcC$sp, apply$mcD$sp, apply$mcF$sp, apply$mcI$sp, apply$mcJ$sp, apply$mcS$sp, apply$mcV$sp, apply$mcZ$sp, toString`

- - ### Constructor Detail
	
	
	
		- #### Clock
		
		
		
		```
		public Clock()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetector.Clock.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetector.Clock.html)*