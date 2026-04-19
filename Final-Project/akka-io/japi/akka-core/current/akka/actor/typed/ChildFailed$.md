---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:49:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ChildFailed$.html
title: ChildFailed$
---

# ChildFailed$

## Content

Package [akka.actor.typed](package-summary.html)
## Class ChildFailed$

- java.lang.Object
- - akka.actor.typed.ChildFailed$

- ---

```
public class ChildFailed$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ChildFailed$](ChildFailed$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ChildFailed$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ChildFailed](ChildFailed.html "class in akka.actor.typed")` | `[apply](#apply(akka.actor.typed.ActorRef,java.lang.Throwable))​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref,  java.lang.Throwable cause)` |  |
	| `scala.Option<scala.Tuple2<[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​java.lang.Throwable>>` | `[unapply](#unapply(akka.actor.typed.ChildFailed))​([ChildFailed](ChildFailed.html "class in akka.actor.typed") t)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ChildFailed$](ChildFailed$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ChildFailed$
		
		
		
		```
		public ChildFailed$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ChildFailed](ChildFailed.html "class in akka.actor.typed") apply​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref,
		                         java.lang.Throwable cause)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​java.lang.Throwable>> unapply​([ChildFailed](ChildFailed.html "class in akka.actor.typed") t)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ChildFailed$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ChildFailed$.html](https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ChildFailed$.html)*