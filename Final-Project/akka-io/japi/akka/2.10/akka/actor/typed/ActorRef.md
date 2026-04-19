---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorRef.ActorRefOps.html
title: ActorRef.ActorRefOps
---

# ActorRef.ActorRefOps

## Content

Package [akka.actor.typed](package-summary.html)
## Class ActorRef.ActorRefOps\<T\>

- java.lang.Object
- - scala.AnyVal
	- - akka.actor.typed.ActorRef.ActorRefOps\<T\>

- Enclosing interface:
[ActorRef](ActorRef.html "interface in akka.actor.typed")\<[T](ActorRef.html "type parameter in ActorRef")\>

---

```
public static final class ActorRef.ActorRefOps<T>
extends scala.AnyVal
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorRefOps](#%3Cinit%3E(akka.actor.typed.ActorRef))​([ActorRef](ActorRef.html "interface in akka.actor.typed")<[T](ActorRef.ActorRefOps.html "type parameter in ActorRef.ActorRefOps")> ref)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[$bang](#$bang(T))​([T](ActorRef.ActorRefOps.html "type parameter in ActorRef.ActorRefOps") msg)` | Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*  messaging semantics. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[ActorRef](ActorRef.html "interface in akka.actor.typed")<[T](ActorRef.ActorRefOps.html "type parameter in ActorRef.ActorRefOps")>` | `[ref](#ref())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorRefOps
		
		
		
		```
		public ActorRefOps​([ActorRef](ActorRef.html "interface in akka.actor.typed")<[T](ActorRef.ActorRefOps.html "type parameter in ActorRef.ActorRefOps")> ref)
		```

	- ### Method Detail
	
	
	
		- #### ref
		
		
		
		```
		public [ActorRef](ActorRef.html "interface in akka.actor.typed")<[T](ActorRef.ActorRefOps.html "type parameter in ActorRef.ActorRefOps")> ref()
		```
		- #### $bang
		
		
		
		```
		public void $bang​([T](ActorRef.ActorRefOps.html "type parameter in ActorRef.ActorRefOps") msg)
		```
		
		Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*
		 messaging semantics.
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorRef.ActorRefOps.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorRef.ActorRefOps.html](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorRef.ActorRefOps.html)*