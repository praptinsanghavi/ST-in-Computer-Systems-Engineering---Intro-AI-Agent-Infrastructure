---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor$.html
title: Actor$
---

# Actor$

## Content

Package [akka.actor](package-summary.html)
## Class Actor$

- java.lang.Object
- - akka.actor.Actor$

- ---

```
public class Actor$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Actor$](Actor$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Actor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[noSender](#noSender())()` | Default placeholder (null) used for "!" to indicate that there is no sender of the message,  that will be translated to the receiving system's deadLetters. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Actor$](Actor$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Actor$
		
		
		
		```
		public Actor$()
		```

	- ### Method Detail
	
	
	
		- #### noSender
		
		
		
		```
		public final [ActorRef](ActorRef.html "class in akka.actor") noSender()
		```
		
		Default placeholder (null) used for "!" to indicate that there is no sender of the message,
		 that will be translated to the receiving system's deadLetters.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor$.html)*