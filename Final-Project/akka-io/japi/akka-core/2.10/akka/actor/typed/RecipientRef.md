---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:33:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.RecipientRefOps.html
title: RecipientRef.RecipientRefOps
---

# RecipientRef.RecipientRefOps

## Content

Package [akka.actor.typed](package-summary.html)
## Class RecipientRef.RecipientRefOps\<T\>

- java.lang.Object
- - scala.AnyVal
	- - akka.actor.typed.RecipientRef.RecipientRefOps\<T\>

- Enclosing interface:
[RecipientRef](RecipientRef.html "interface in akka.actor.typed")\<[T](RecipientRef.html "type parameter in RecipientRef")\>

---

```
public static final class RecipientRef.RecipientRefOps<T>
extends scala.AnyVal
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecipientRefOps](#%3Cinit%3E(akka.actor.typed.RecipientRef))​([RecipientRef](RecipientRef.html "interface in akka.actor.typed")<[T](RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")> ref)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[$bang](#$bang(T))​([T](RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps") msg)` | Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*  messaging semantics. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[RecipientRef](RecipientRef.html "interface in akka.actor.typed")<[T](RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")>` | `[ref](#ref())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RecipientRefOps
		
		
		
		```
		public RecipientRefOps​([RecipientRef](RecipientRef.html "interface in akka.actor.typed")<[T](RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")> ref)
		```

	- ### Method Detail
	
	
	
		- #### ref
		
		
		
		```
		public [RecipientRef](RecipientRef.html "interface in akka.actor.typed")<[T](RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")> ref()
		```
		- #### $bang
		
		
		
		```
		public void $bang​([T](RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps") msg)
		```
		
		Send a message to the destination referenced by this `RecipientRef` using \*at\-most\-once\*
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.RecipientRefOps.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.RecipientRefOps.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.RecipientRefOps.html)*