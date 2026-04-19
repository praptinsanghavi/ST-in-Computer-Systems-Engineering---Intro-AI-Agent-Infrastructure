---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:51:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/OriginalRestartException$.html
title: OriginalRestartException$
---

# OriginalRestartException$

## Content

Package [akka.actor](package-summary.html)
## Class OriginalRestartException$

- java.lang.Object
- - akka.actor.OriginalRestartException$

- ---

```
public class OriginalRestartException$
extends java.lang.Object
```

This is an extractor for retrieving the original cause (i.e. the first
 failure) from a [`PostRestartException`](PostRestartException.html "class in akka.actor"). In the face of multiple
 \&ldquo;nested\&rdquo; restarts it will walk the origCause\-links until it arrives at a
 non\-PostRestartException type.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [OriginalRestartException$](OriginalRestartException$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OriginalRestartException$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<java.lang.Throwable>` | `[unapply](#unapply(akka.actor.PostRestartException))​([PostRestartException](PostRestartException.html "class in akka.actor") ex)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [OriginalRestartException$](OriginalRestartException$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### OriginalRestartException$
		
		
		
		```
		public OriginalRestartException$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Throwable> unapply​([PostRestartException](PostRestartException.html "class in akka.actor") ex)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/OriginalRestartException$.html
- https://doc.akka.io/japi/akka/current/akka/actor/PostRestartException.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/OriginalRestartException$.html](https://doc.akka.io/japi/akka/current/akka/actor/OriginalRestartException$.html)*