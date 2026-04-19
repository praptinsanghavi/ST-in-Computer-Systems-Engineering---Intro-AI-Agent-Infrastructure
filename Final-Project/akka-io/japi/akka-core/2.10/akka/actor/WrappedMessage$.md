---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:12:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/WrappedMessage$.html
title: WrappedMessage$
---

# WrappedMessage$

## Content

Package [akka.actor](package-summary.html)
## Class WrappedMessage$

- java.lang.Object
- - akka.actor.WrappedMessage$

- ---

```
public class WrappedMessage$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WrappedMessage$](WrappedMessage$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WrappedMessage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[unwrap](#unwrap(java.lang.Object))​(java.lang.Object message)` | Unwrap [`WrappedMessage`](WrappedMessage.html "interface in akka.actor") recursively. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WrappedMessage$](WrappedMessage$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WrappedMessage$
		
		
		
		```
		public WrappedMessage$()
		```

	- ### Method Detail
	
	
	
		- #### unwrap
		
		
		
		```
		public java.lang.Object unwrap​(java.lang.Object message)
		```
		
		Unwrap [`WrappedMessage`](WrappedMessage.html "interface in akka.actor") recursively.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/WrappedMessage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/WrappedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/WrappedMessage$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/WrappedMessage$.html)*