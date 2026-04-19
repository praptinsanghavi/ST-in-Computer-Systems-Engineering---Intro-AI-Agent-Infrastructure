---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ChildFailed.html
title: ChildFailed
---

# ChildFailed

## Content

Package [akka.actor.typed](package-summary.html)
## Class ChildFailed

- java.lang.Object
- - [akka.actor.typed.Terminated](Terminated.html "class in akka.actor.typed")
	- - akka.actor.typed.ChildFailed

- All Implemented Interfaces:
`[Signal](Signal.html "interface in akka.actor.typed")`

---

```
public final class ChildFailed
extends [Terminated](Terminated.html "class in akka.actor.typed")
```

Child has failed due an uncaught exception

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ChildFailed](#%3Cinit%3E(akka.actor.typed.ActorRef,java.lang.Throwable))​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ChildFailed](ChildFailed.html "class in akka.actor.typed")` | `[apply](#apply(akka.actor.typed.ActorRef,java.lang.Throwable))​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref,  java.lang.Throwable cause)` |  |
	| `java.lang.Throwable` | `[cause](#cause())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `java.lang.Throwable` | `[getCause](#getCause())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​java.lang.Throwable>>` | `[unapply](#unapply(akka.actor.typed.ChildFailed))​([ChildFailed](ChildFailed.html "class in akka.actor.typed") t)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[Terminated](Terminated.html "class in akka.actor.typed")
		
		
		`[apply](Terminated.html#apply(akka.actor.typed.ActorRef)), [getRef](Terminated.html#getRef()), [ref](Terminated.html#ref()), [unapply](Terminated.html#unapply(akka.actor.typed.Terminated))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ChildFailed
		
		
		
		```
		public ChildFailed​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref,
		                   java.lang.Throwable cause)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ChildFailed](ChildFailed.html "class in akka.actor.typed") apply​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref,
		                                java.lang.Throwable cause)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​java.lang.Throwable>> unapply​([ChildFailed](ChildFailed.html "class in akka.actor.typed") t)
		```
		- #### cause
		
		
		
		```
		public java.lang.Throwable cause()
		```
		- #### getCause
		
		
		
		```
		public java.lang.Throwable getCause()
		```
		
		Java API
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](Terminated.html#toString())` in class `[Terminated](Terminated.html "class in akka.actor.typed")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`[hashCode](Terminated.html#hashCode())` in class `[Terminated](Terminated.html "class in akka.actor.typed")`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Overrides:
		`[equals](Terminated.html#equals(java.lang.Object))` in class `[Terminated](Terminated.html "class in akka.actor.typed")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ChildFailed.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ChildFailed.html)*