---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:51:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/Terminated.html
title: Terminated
---

# Terminated

## Content

Package [akka.actor](package-summary.html)
## Class Terminated

- java.lang.Object
- - akka.actor.Terminated

- All Implemented Interfaces:
`[AutoReceivedMessage](AutoReceivedMessage.html "interface in akka.actor")`, `[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor")`, `[NoSerializationVerificationNeeded](NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[PossiblyHarmful](PossiblyHarmful.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Terminated
extends java.lang.Object
implements [AutoReceivedMessage](AutoReceivedMessage.html "interface in akka.actor"), [PossiblyHarmful](PossiblyHarmful.html "interface in akka.actor"), [DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor"), [NoSerializationVerificationNeeded](NoSerializationVerificationNeeded.html "interface in akka.actor"), scala.Product, java.io.Serializable
```

When Death Watch is used, the watcher will receive a Terminated(watched)
 message when watched is terminated.
 Terminated message can't be forwarded to another actor, since that actor
 might not be watching the subject. Instead, if you need to forward Terminated
 to another actor you should send the information in your own message.
 
 param: actor the watched actor that terminated
 param: existenceConfirmed is false when the Terminated message was not sent
 directly from the watched actor, but derived from another source, such as
 when watching a non\-local ActorRef, which might not have been resolved
 param: addressTerminated the Terminated message was derived from
 that the remote node hosting the watched actor was detected as unreachable

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Terminated)

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[actor](#actor())()` |  |
	| `boolean` | `[addressTerminated](#addressTerminated())()` |  |
	| `static [Terminated](Terminated.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef,boolean,boolean))​([ActorRef](ActorRef.html "class in akka.actor") actor,  boolean existenceConfirmed,  boolean addressTerminated)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Terminated](Terminated.html "class in akka.actor")` | `[copy](#copy(akka.actor.ActorRef,boolean,boolean))​([ActorRef](ActorRef.html "class in akka.actor") actor,  boolean existenceConfirmed,  boolean addressTerminated)` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `boolean` | `[existenceConfirmed](#existenceConfirmed())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[getActor](#getActor())()` |  |
	| `boolean` | `[getAddressTerminated](#getAddressTerminated())()` |  |
	| `boolean` | `[getExistenceConfirmed](#getExistenceConfirmed())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.actor.Terminated))​([Terminated](Terminated.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Terminated](Terminated.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") actor,
		                               boolean existenceConfirmed,
		                               boolean addressTerminated)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> unapply​([Terminated](Terminated.html "class in akka.actor") x$0)
		```
		- #### actor
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") actor()
		```
		- #### existenceConfirmed
		
		
		
		```
		public boolean existenceConfirmed()
		```
		- #### addressTerminated
		
		
		
		```
		public boolean addressTerminated()
		```
		- #### copy
		
		
		
		```
		public [Terminated](Terminated.html "class in akka.actor") copy​([ActorRef](ActorRef.html "class in akka.actor") actor,
		                       boolean existenceConfirmed,
		                       boolean addressTerminated)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") copy$default$1()
		```
		- #### getActor
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") getActor()
		```
		- #### getAddressTerminated
		
		
		
		```
		public boolean getAddressTerminated()
		```
		- #### getExistenceConfirmed
		
		
		
		```
		public boolean getExistenceConfirmed()
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

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/AutoReceivedMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/japi/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka/current/akka/actor/PossiblyHarmful.html
- https://doc.akka.io/japi/akka/current/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/Terminated.html](https://doc.akka.io/japi/akka/current/akka/actor/Terminated.html)*