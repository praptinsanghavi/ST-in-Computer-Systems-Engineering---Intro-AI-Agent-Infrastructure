---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:58:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.WatchedWith.html
title: Effect.WatchedWith
---

# Effect.WatchedWith

## Content

Package [akka.actor.testkit.typed](package-summary.html)
## Class Effect.WatchedWith\<U,​T\>

- java.lang.Object
- - [akka.actor.testkit.typed.Effect](Effect.html "class in akka.actor.testkit.typed")
	- - akka.actor.testkit.typed.Effect.WatchedWith\<U,​T\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Effect](Effect.html "class in akka.actor.testkit.typed")

---

```
public static final class Effect.WatchedWith<U,​T>
extends [Effect](Effect.html "class in akka.actor.testkit.typed")
implements scala.Product, java.io.Serializable
```

The behavior started watching `other`, through `context.watchWith(other, message)`

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.testkit.typed.Effect.WatchedWith)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.testkit.typed.[Effect](Effect.html "class in akka.actor.testkit.typed")
		
		
		`[Effect.AskInitiated](Effect.AskInitiated.html "class in akka.actor.testkit.typed")<[Req](Effect.AskInitiated.html "type parameter in Effect.AskInitiated"),​[Res](Effect.AskInitiated.html "type parameter in Effect.AskInitiated"),​[T](Effect.AskInitiated.html "type parameter in Effect.AskInitiated")>, [Effect.AskInitiated$](Effect.AskInitiated$.html "class in akka.actor.testkit.typed"), [Effect.MessageAdapter](Effect.MessageAdapter.html "class in akka.actor.testkit.typed")<[A](Effect.MessageAdapter.html "type parameter in Effect.MessageAdapter"),​[T](Effect.MessageAdapter.html "type parameter in Effect.MessageAdapter")>, [Effect.MessageAdapter$](Effect.MessageAdapter$.html "class in akka.actor.testkit.typed"), [Effect.NoEffects](Effect.NoEffects.html "class in akka.actor.testkit.typed"), [Effect.NoEffects$](Effect.NoEffects$.html "class in akka.actor.testkit.typed"), [Effect.ReceiveTimeoutCancelled](Effect.ReceiveTimeoutCancelled.html "class in akka.actor.testkit.typed"), [Effect.ReceiveTimeoutCancelled$](Effect.ReceiveTimeoutCancelled$.html "class in akka.actor.testkit.typed"), [Effect.ReceiveTimeoutSet](Effect.ReceiveTimeoutSet.html "class in akka.actor.testkit.typed")<[T](Effect.ReceiveTimeoutSet.html "type parameter in Effect.ReceiveTimeoutSet")>, [Effect.ReceiveTimeoutSet$](Effect.ReceiveTimeoutSet$.html "class in akka.actor.testkit.typed"), [Effect.Scheduled](Effect.Scheduled.html "class in akka.actor.testkit.typed")<[U](Effect.Scheduled.html "type parameter in Effect.Scheduled")>, [Effect.Scheduled$](Effect.Scheduled$.html "class in akka.actor.testkit.typed"), [Effect.Spawned](Effect.Spawned.html "class in akka.actor.testkit.typed")<[T](Effect.Spawned.html "type parameter in Effect.Spawned")>, [Effect.Spawned$](Effect.Spawned$.html "class in akka.actor.testkit.typed"), [Effect.SpawnedAdapter$](Effect.SpawnedAdapter$.html "class in akka.actor.testkit.typed"), [Effect.SpawnedAnonymous](Effect.SpawnedAnonymous.html "class in akka.actor.testkit.typed")<[T](Effect.SpawnedAnonymous.html "type parameter in Effect.SpawnedAnonymous")>, [Effect.SpawnedAnonymous$](Effect.SpawnedAnonymous$.html "class in akka.actor.testkit.typed"), [Effect.SpawnedAnonymousAdapter$](Effect.SpawnedAnonymousAdapter$.html "class in akka.actor.testkit.typed"), [Effect.Stopped](Effect.Stopped.html "class in akka.actor.testkit.typed"), [Effect.Stopped$](Effect.Stopped$.html "class in akka.actor.testkit.typed"), [Effect.TimerCancelled](Effect.TimerCancelled.html "class in akka.actor.testkit.typed"), [Effect.TimerCancelled$](Effect.TimerCancelled$.html "class in akka.actor.testkit.typed"), [Effect.TimerScheduled](Effect.TimerScheduled.html "class in akka.actor.testkit.typed")<[U](Effect.TimerScheduled.html "type parameter in Effect.TimerScheduled")>, [Effect.TimerScheduled$](Effect.TimerScheduled$.html "class in akka.actor.testkit.typed"), [Effect.Unwatched](Effect.Unwatched.html "class in akka.actor.testkit.typed")<[T](Effect.Unwatched.html "type parameter in Effect.Unwatched")>, [Effect.Unwatched$](Effect.Unwatched$.html "class in akka.actor.testkit.typed"), [Effect.Watched](Effect.Watched.html "class in akka.actor.testkit.typed")<[T](Effect.Watched.html "type parameter in Effect.Watched")>, [Effect.Watched$](Effect.Watched$.html "class in akka.actor.testkit.typed"), [Effect.WatchedWith](Effect.WatchedWith.html "class in akka.actor.testkit.typed")<[U](Effect.WatchedWith.html "type parameter in Effect.WatchedWith"),​[T](Effect.WatchedWith.html "type parameter in Effect.WatchedWith")>, [Effect.WatchedWith$](Effect.WatchedWith$.html "class in akka.actor.testkit.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WatchedWith](#%3Cinit%3E(akka.actor.typed.ActorRef,T))​([ActorRef](../../typed/ActorRef.html "interface in akka.actor.typed")<[U](Effect.WatchedWith.html "type parameter in Effect.WatchedWith")> other,  [T](Effect.WatchedWith.html "type parameter in Effect.WatchedWith") message)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<U,​T>[Effect.WatchedWith](Effect.WatchedWith.html "class in akka.actor.testkit.typed")<U,​T>` | `[copy](#copy(akka.actor.typed.ActorRef,T))​([ActorRef](../../typed/ActorRef.html "interface in akka.actor.typed")<U> other,  T message)` |  |
	| `<U,​T>[ActorRef](../../typed/ActorRef.html "interface in akka.actor.typed")<U>` | `[copy$default$1](#copy$default$1())()` |  |
	| `<U,​T>T` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[T](Effect.WatchedWith.html "type parameter in Effect.WatchedWith")` | `[message](#message())()` |  |
	| `[ActorRef](../../typed/ActorRef.html "interface in akka.actor.typed")<[U](Effect.WatchedWith.html "type parameter in Effect.WatchedWith")>` | `[other](#other())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.actor.testkit.typed.[Effect](Effect.html "class in akka.actor.testkit.typed")
		
		
		`[timerScheduled](Effect.html#timerScheduled())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### WatchedWith
		
		
		
		```
		public WatchedWith​([ActorRef](../../typed/ActorRef.html "interface in akka.actor.typed")<[U](Effect.WatchedWith.html "type parameter in Effect.WatchedWith")> other,
		                   [T](Effect.WatchedWith.html "type parameter in Effect.WatchedWith") message)
		```

	- ### Method Detail
	
	
	
		- #### other
		
		
		
		```
		public [ActorRef](../../typed/ActorRef.html "interface in akka.actor.typed")<[U](Effect.WatchedWith.html "type parameter in Effect.WatchedWith")> other()
		```
		- #### message
		
		
		
		```
		public [T](Effect.WatchedWith.html "type parameter in Effect.WatchedWith") message()
		```
		- #### copy
		
		
		
		```
		public <U,​T> [Effect.WatchedWith](Effect.WatchedWith.html "class in akka.actor.testkit.typed")<U,​T> copy​([ActorRef](../../typed/ActorRef.html "interface in akka.actor.typed")<U> other,
		                                                      T message)
		```
		- #### copy$default$1
		
		
		
		```
		public <U,​T> [ActorRef](../../typed/ActorRef.html "interface in akka.actor.typed")<U> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <U,​T> T copy$default$2()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.AskInitiated$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.AskInitiated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.MessageAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.MessageAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.NoEffects$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.NoEffects.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.ReceiveTimeoutCancelled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.ReceiveTimeoutCancelled.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.ReceiveTimeoutSet$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.ReceiveTimeoutSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.Scheduled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.Scheduled.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.Spawned$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.Spawned.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.SpawnedAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.SpawnedAnonymous$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.SpawnedAnonymous.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.SpawnedAnonymousAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.Stopped$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.Stopped.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.TimerCancelled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.TimerCancelled.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.TimerScheduled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.TimerScheduled.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.Unwatched$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.Unwatched.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.Watched$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.Watched.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.WatchedWith$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.WatchedWith.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.WatchedWith.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.WatchedWith.html)*