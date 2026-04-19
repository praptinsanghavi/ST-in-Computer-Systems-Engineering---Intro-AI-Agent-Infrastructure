---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:12:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/OriginalRestartException.html
title: OriginalRestartException
---

# OriginalRestartException

## Content

Package [akka.actor](package-summary.html)
## Class OriginalRestartException

- java.lang.Object
- - akka.actor.OriginalRestartException

- ---

```
public class OriginalRestartException
extends java.lang.Object
```

This is an extractor for retrieving the original cause (i.e. the first
 failure) from a [`PostRestartException`](PostRestartException.html "class in akka.actor"). In the face of multiple
 \&ldquo;nested\&rdquo; restarts it will walk the origCause\-links until it arrives at a
 non\-PostRestartException type.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OriginalRestartException](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.Option<java.lang.Throwable>` | `[unapply](#unapply(akka.actor.PostRestartException))​([PostRestartException](PostRestartException.html "class in akka.actor") ex)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### OriginalRestartException
		
		
		
		```
		public OriginalRestartException()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Throwable> unapply​([PostRestartException](PostRestartException.html "class in akka.actor") ex)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/PostRestartException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/OriginalRestartException.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/OriginalRestartException.html)*