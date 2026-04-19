---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/ActorRefImpl.html
title: ActorRefImpl
---

# ActorRefImpl

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Interface ActorRefImpl\<T\>

- All Superinterfaces:
`[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>`, `java.lang.Comparable<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<?>>`, `[RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<T>`, `java.io.Serializable`

---

```
public interface ActorRefImpl<T>
extends [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>
```

Every ActorRef is also an ActorRefImpl, but these two methods shall be
 completely hidden from client code. There is an implicit converter
 available in the package object, enabling `ref.toImpl` (or `ref.toImplN`
 for `ActorRef[Nothing]`—Scala refuses to infer `Nothing` as a type parameter).

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.typed.[ActorRef](../ActorRef.html "interface in akka.actor.typed")
		
		
		`[ActorRef.ActorRefOps](../ActorRef.ActorRefOps.html "class in akka.actor.typed")<[T](../ActorRef.ActorRefOps.html "type parameter in ActorRef.ActorRefOps")>, [ActorRef.ActorRefOps$](../ActorRef.ActorRefOps$.html "class in akka.actor.typed")`
		- ### Nested classes/interfaces inherited from interface akka.actor.typed.[RecipientRef](../RecipientRef.html "interface in akka.actor.typed")
		
		
		`[RecipientRef.RecipientRefOps](../RecipientRef.RecipientRefOps.html "class in akka.actor.typed")<[T](../RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")>, [RecipientRef.RecipientRefOps$](../RecipientRef.RecipientRefOps$.html "class in akka.actor.typed")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[compareTo](#compareTo(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<?> other)` | Comparison takes path and the unique id of the actor cell into account. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` | Equals takes path and the unique id of the actor cell into account. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isLocal](#isLocal())()` |  |
	| `<U extends [T](ActorRefImpl.html "type parameter in ActorRefImpl")>[ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[narrow](#narrow())()` | Narrow the type of this `ActorRef`, which is always a safe operation. |
	| `void` | `[sendSystem](#sendSystem(akka.actor.typed.internal.SystemMessage))​([SystemMessage](SystemMessage.html "interface in akka.actor.typed.internal") signal)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U>` | `[unsafeUpcast](#unsafeUpcast())()` | Unsafe utility method for widening the type accepted by this ActorRef;  provided to avoid having to use `asInstanceOf` on the full reference type,  which would unfortunately also work on non\-ActorRefs. |
	
	
		- ### Methods inherited from interface akka.actor.typed.[ActorRef](../ActorRef.html "interface in akka.actor.typed")
		
		
		`[path](../ActorRef.html#path()), [tell](../ActorRef.html#tell(T)), [writeReplace](../ActorRef.html#writeReplace())`

- - ### Method Detail
	
	
	
		- #### compareTo
		
		
		
		```
		int compareTo​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<?> other)
		```
		
		Comparison takes path and the unique id of the actor cell into account.
		
		Specified by:
		`compareTo` in interface `java.lang.Comparable<[T](ActorRefImpl.html "type parameter in ActorRefImpl")>`
		- #### equals
		
		
		
		```
		boolean equals​(java.lang.Object that)
		```
		
		Equals takes path and the unique id of the actor cell into account.
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### isLocal
		
		
		
		```
		boolean isLocal()
		```
		- #### narrow
		
		
		
		```
		<U extends [T](ActorRefImpl.html "type parameter in ActorRefImpl")> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> narrow()
		```
		
		Description copied from interface: `[ActorRef](../ActorRef.html#narrow())`
		Narrow the type of this `ActorRef`, which is always a safe operation.
		
		Specified by:
		`[narrow](../ActorRef.html#narrow())` in interface `[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[T](ActorRefImpl.html "type parameter in ActorRefImpl")>`
		- #### sendSystem
		
		
		
		```
		void sendSystem​([SystemMessage](SystemMessage.html "interface in akka.actor.typed.internal") signal)
		```
		- #### toString
		
		
		
		```
		java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### unsafeUpcast
		
		
		
		```
		<U> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<U> unsafeUpcast()
		```
		
		Description copied from interface: `[ActorRef](../ActorRef.html#unsafeUpcast())`
		Unsafe utility method for widening the type accepted by this ActorRef;
		 provided to avoid having to use `asInstanceOf` on the full reference type,
		 which would unfortunately also work on non\-ActorRefs. Use it with caution,it may cause a `ClassCastException` when you send a message
		 to the widened {@link ActorRef\[U}].
		
		Specified by:
		`[unsafeUpcast](../ActorRef.html#unsafeUpcast())` in interface `[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[T](ActorRefImpl.html "type parameter in ActorRefImpl")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.ActorRefOps$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.ActorRefOps.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/ActorRefImpl.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/SystemMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/ActorRefImpl.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/ActorRefImpl.html)*