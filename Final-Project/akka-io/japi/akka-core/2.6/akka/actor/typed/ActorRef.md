---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:04:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html
title: ActorRef
---

# ActorRef

## Content

Package [akka.actor.typed](package-summary.html)
## Interface ActorRef\<T\>

- All Superinterfaces:
`java.lang.Comparable<[ActorRef](ActorRef.html "interface in akka.actor.typed")<?>>`, `[RecipientRef](RecipientRef.html "interface in akka.actor.typed")<T>`, `java.io.Serializable`

All Known Subinterfaces:
`[ActorRefImpl](internal/ActorRefImpl.html "interface in akka.actor.typed.internal")<T>`

All Known Implementing Classes:
`[ActorSystem](ActorSystem.html "class in akka.actor.typed")`

---

```
public interface ActorRef<T>
extends [RecipientRef](RecipientRef.html "interface in akka.actor.typed")<T>, java.lang.Comparable<[ActorRef](ActorRef.html "interface in akka.actor.typed")<?>>, java.io.Serializable
```

An ActorRef is the identity or address of an Actor instance. It is valid
 only during the Actor\&rsquo;s lifetime and allows messages to be sent to that
 Actor instance. Sending a message to an Actor that has terminated before
 receiving the message will lead to that message being discarded; such
 messages are delivered to the `DeadLetter` channel of the
 [`EventStream`](../../event/EventStream.html "class in akka.event") on a best effort basis
 (i.e. this delivery is not reliable).
 
 Not for user extension

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[ActorRef.ActorRefOps](ActorRef.ActorRefOps.html "class in akka.actor.typed")<[T](ActorRef.ActorRefOps.html "type parameter in ActorRef.ActorRefOps")>` |  |
	| `static class` | `[ActorRef.ActorRefOps$](ActorRef.ActorRefOps$.html "class in akka.actor.typed")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.typed.[RecipientRef](RecipientRef.html "interface in akka.actor.typed")
		
		
		`[RecipientRef.RecipientRefOps](RecipientRef.RecipientRefOps.html "class in akka.actor.typed")<[T](RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")>, [RecipientRef.RecipientRefOps$](RecipientRef.RecipientRefOps$.html "class in akka.actor.typed")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<U extends [T](ActorRef.html "type parameter in ActorRef")>[ActorRef](ActorRef.html "interface in akka.actor.typed")<U>` | `[narrow](#narrow())()` | Narrow the type of this `ActorRef`, which is always a safe operation. |
	| `[ActorPath](../ActorPath.html "interface in akka.actor")` | `[path](#path())()` | The hierarchical path name of the referenced Actor. |
	| `void` | `[tell](#tell(T))​([T](ActorRef.html "type parameter in ActorRef") msg)` | Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*  messaging semantics. |
	| `<U> [ActorRef](ActorRef.html "interface in akka.actor.typed")<U>` | `[unsafeUpcast](#unsafeUpcast())()` | Unsafe utility method for widening the type accepted by this ActorRef;  provided to avoid having to use `asInstanceOf` on the full reference type,  which would unfortunately also work on non\-ActorRefs. |
	| `java.lang.Object` | `[writeReplace](#writeReplace())()` |  |
	
	
		- ### Methods inherited from interface java.lang.Comparable
		
		
		`compareTo`

- - ### Method Detail
	
	
	
		- #### tell
		
		
		
		```
		void tell​([T](ActorRef.html "type parameter in ActorRef") msg)
		```
		
		Send a message to the Actor referenced by this ActorRef using \*at\-most\-once\*
		 messaging semantics.
		
		Specified by:
		`[tell](RecipientRef.html#tell(T))` in interface `[RecipientRef](RecipientRef.html "interface in akka.actor.typed")<[T](ActorRef.html "type parameter in ActorRef")>`
		- #### narrow
		
		
		
		```
		<U extends [T](ActorRef.html "type parameter in ActorRef")> [ActorRef](ActorRef.html "interface in akka.actor.typed")<U> narrow()
		```
		
		Narrow the type of this `ActorRef`, which is always a safe operation.
		- #### unsafeUpcast
		
		
		
		```
		<U> [ActorRef](ActorRef.html "interface in akka.actor.typed")<U> unsafeUpcast()
		```
		
		Unsafe utility method for widening the type accepted by this ActorRef;
		 provided to avoid having to use `asInstanceOf` on the full reference type,
		 which would unfortunately also work on non\-ActorRefs. Use it with caution,it may cause a `ClassCastException` when you send a message
		 to the widened {@link ActorRef\[U}].
		- #### path
		
		
		
		```
		[ActorPath](../ActorPath.html "interface in akka.actor") path()
		```
		
		The hierarchical path name of the referenced Actor. The lifecycle of the
		 ActorRef is fully contained within the lifecycle of the [`ActorPath`](../ActorPath.html "interface in akka.actor")
		 and more than one Actor instance can exist with the same path at different
		 points in time, but not concurrently.
		- #### writeReplace
		
		
		
		```
		java.lang.Object writeReplace()
		                       throws java.io.ObjectStreamException
		```
		
		
		Throws:
		`java.io.ObjectStreamException`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.ActorRefOps$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.ActorRefOps.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/RecipientRef.RecipientRefOps$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/RecipientRef.RecipientRefOps.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/internal/ActorRefImpl.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/EventStream.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html)*