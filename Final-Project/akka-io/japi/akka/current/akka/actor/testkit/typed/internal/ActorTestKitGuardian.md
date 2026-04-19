---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/ActorTestKitGuardian.StopActor.html
title: ActorTestKitGuardian.StopActor
---

# ActorTestKitGuardian.StopActor

## Content

Package [akka.actor.testkit.typed.internal](package-summary.html)
## Class ActorTestKitGuardian.StopActor\<T\>

- java.lang.Object
- - akka.actor.testkit.typed.internal.ActorTestKitGuardian.StopActor\<T\>

- All Implemented Interfaces:
`[ActorTestKitGuardian.TestKitCommand](ActorTestKitGuardian.TestKitCommand.html "interface in akka.actor.testkit.typed.internal")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[ActorTestKitGuardian](ActorTestKitGuardian.html "class in akka.actor.testkit.typed.internal")

---

```
public static final class ActorTestKitGuardian.StopActor<T>
extends java.lang.Object
implements [ActorTestKitGuardian.TestKitCommand](ActorTestKitGuardian.TestKitCommand.html "interface in akka.actor.testkit.typed.internal"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.testkit.typed.internal.ActorTestKitGuardian.StopActor)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StopActor](#%3Cinit%3E(akka.actor.typed.ActorRef,akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](ActorTestKitGuardian.StopActor.html "type parameter in ActorTestKitGuardian.StopActor")> ref,  [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorTestKitGuardian.Ack$](ActorTestKitGuardian.Ack$.html "class in akka.actor.testkit.typed.internal")> replyTo)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T> [ActorTestKitGuardian.StopActor](ActorTestKitGuardian.StopActor.html "class in akka.actor.testkit.typed.internal")<T>` | `[copy](#copy(akka.actor.typed.ActorRef,akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref,  [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorTestKitGuardian.Ack$](ActorTestKitGuardian.Ack$.html "class in akka.actor.testkit.typed.internal")> replyTo)` |  |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[copy$default$1](#copy$default$1())()` |  |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorTestKitGuardian.Ack$](ActorTestKitGuardian.Ack$.html "class in akka.actor.testkit.typed.internal")>` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](ActorTestKitGuardian.StopActor.html "type parameter in ActorTestKitGuardian.StopActor")>` | `[ref](#ref())()` |  |
	| `[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorTestKitGuardian.Ack$](ActorTestKitGuardian.Ack$.html "class in akka.actor.testkit.typed.internal")>` | `[replyTo](#replyTo())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### StopActor
		
		
		
		```
		public StopActor​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](ActorTestKitGuardian.StopActor.html "type parameter in ActorTestKitGuardian.StopActor")> ref,
		                 [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorTestKitGuardian.Ack$](ActorTestKitGuardian.Ack$.html "class in akka.actor.testkit.typed.internal")> replyTo)
		```

	- ### Method Detail
	
	
	
		- #### ref
		
		
		
		```
		public [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](ActorTestKitGuardian.StopActor.html "type parameter in ActorTestKitGuardian.StopActor")> ref()
		```
		- #### replyTo
		
		
		
		```
		public [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorTestKitGuardian.Ack$](ActorTestKitGuardian.Ack$.html "class in akka.actor.testkit.typed.internal")> replyTo()
		```
		- #### copy
		
		
		
		```
		public <T> [ActorTestKitGuardian.StopActor](ActorTestKitGuardian.StopActor.html "class in akka.actor.testkit.typed.internal")<T> copy​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref,
		                                                  [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorTestKitGuardian.Ack$](ActorTestKitGuardian.Ack$.html "class in akka.actor.testkit.typed.internal")> replyTo)
		```
		- #### copy$default$1
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[ActorTestKitGuardian.Ack$](ActorTestKitGuardian.Ack$.html "class in akka.actor.testkit.typed.internal")> copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/ActorTestKitGuardian.Ack$.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/ActorTestKitGuardian.StopActor.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/ActorTestKitGuardian.TestKitCommand.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/ActorTestKitGuardian.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/ActorTestKitGuardian.StopActor.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/ActorTestKitGuardian.StopActor.html)*