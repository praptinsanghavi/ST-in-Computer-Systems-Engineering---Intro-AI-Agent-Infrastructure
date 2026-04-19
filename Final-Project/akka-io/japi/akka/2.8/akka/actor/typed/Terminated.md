---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:24:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Terminated.html
title: Terminated
---

# Terminated

## Content

Package [akka.actor.typed](package-summary.html)
## Class Terminated

- java.lang.Object
- - akka.actor.typed.Terminated

- All Implemented Interfaces:
`[Signal](Signal.html "interface in akka.actor.typed")`

Direct Known Subclasses:
`[ChildFailed](ChildFailed.html "class in akka.actor.typed")`

---

```
public class Terminated
extends java.lang.Object
implements [Signal](Signal.html "interface in akka.actor.typed")
```

Lifecycle signal that is fired when an Actor that was watched has terminated.
 Watching is performed by invoking the
 `akka.actor.typed.scaladsl.ActorContext.watch`. The DeathWatch service is
 idempotent, meaning that registering twice has the same effect as registering
 once. Registration does not need to happen before the Actor terminates, a
 notification is guaranteed to arrive after both registration and termination
 have occurred. This message is also sent when the watched actor is on a node
 that has been removed from the cluster when using Akka Cluster.
 
 param: ref Scala API: the `ActorRef` for the terminated actor

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Terminated](#%3Cinit%3E(akka.actor.typed.ActorRef))​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Terminated](Terminated.html "class in akka.actor.typed")` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `[ActorRef](ActorRef.html "interface in akka.actor.typed")<java.lang.Void>` | `[getRef](#getRef())()` | Java API: The actor that was watched and got terminated |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>` | `[ref](#ref())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>>` | `[unapply](#unapply(akka.actor.typed.Terminated))​([Terminated](Terminated.html "class in akka.actor.typed") t)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Terminated
		
		
		
		```
		public Terminated​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Terminated](Terminated.html "class in akka.actor.typed") apply​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>> unapply​([Terminated](Terminated.html "class in akka.actor.typed") t)
		```
		- #### ref
		
		
		
		```
		public [ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref()
		```
		- #### getRef
		
		
		
		```
		public [ActorRef](ActorRef.html "interface in akka.actor.typed")<java.lang.Void> getRef()
		```
		
		Java API: The actor that was watched and got terminated
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Terminated.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Terminated.html](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Terminated.html)*