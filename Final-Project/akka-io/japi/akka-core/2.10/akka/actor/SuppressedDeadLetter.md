---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:58:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/SuppressedDeadLetter.html
title: SuppressedDeadLetter
---

# SuppressedDeadLetter

## Content

Package [akka.actor](package-summary.html)
## Class SuppressedDeadLetter

- java.lang.Object
- - akka.actor.SuppressedDeadLetter

- All Implemented Interfaces:
`[AllDeadLetters](AllDeadLetters.html "interface in akka.actor")`, `[WrappedMessage](WrappedMessage.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SuppressedDeadLetter
extends java.lang.Object
implements [AllDeadLetters](AllDeadLetters.html "interface in akka.actor"), scala.Product, java.io.Serializable
```

Similar to [`DeadLetter`](DeadLetter.html "class in akka.actor") with the slight twist of NOT being logged by the default dead letters listener.
 Messages which end up being suppressed dead letters are internal messages for which ending up as dead\-letter is both expected and harmless.
 
 It is possible to subscribe to suppressed dead letters on the ActorSystem's EventStream explicitly.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.SuppressedDeadLetter)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SuppressedDeadLetter](#%3Cinit%3E(akka.actor.DeadLetterSuppression,akka.actor.ActorRef,akka.actor.ActorRef))​([DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor") message,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor")` | `[apply](#apply(akka.actor.DeadLetterSuppression,akka.actor.ActorRef,akka.actor.ActorRef))​([DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor") message,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor")` | `[copy](#copy(akka.actor.DeadLetterSuppression,akka.actor.ActorRef,akka.actor.ActorRef))​([DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor") message,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |
	| `[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[copy$default$2](#copy$default$2())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[copy$default$3](#copy$default$3())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor")` | `[message](#message())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[recipient](#recipient())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[sender](#sender())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>>` | `[unapply](#unapply(akka.actor.SuppressedDeadLetter))​([SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SuppressedDeadLetter
		
		
		
		```
		public SuppressedDeadLetter​([DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor") message,
		                            [ActorRef](ActorRef.html "class in akka.actor") sender,
		                            [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor") apply​([DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor") message,
		                                         [ActorRef](ActorRef.html "class in akka.actor") sender,
		                                         [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>> unapply​([SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor") x$0)
		```
		- #### message
		
		
		
		```
		public [DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor") message()
		```
		
		
		Specified by:
		`[message](AllDeadLetters.html#message())` in interface `[AllDeadLetters](AllDeadLetters.html "interface in akka.actor")`
		Specified by:
		`[message](WrappedMessage.html#message())` in interface `[WrappedMessage](WrappedMessage.html "interface in akka.actor")`
		- #### sender
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") sender()
		```
		
		
		Specified by:
		`[sender](AllDeadLetters.html#sender())` in interface `[AllDeadLetters](AllDeadLetters.html "interface in akka.actor")`
		- #### recipient
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") recipient()
		```
		
		
		Specified by:
		`[recipient](AllDeadLetters.html#recipient())` in interface `[AllDeadLetters](AllDeadLetters.html "interface in akka.actor")`
		- #### copy
		
		
		
		```
		public [SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor") copy​([DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor") message,
		                                 [ActorRef](ActorRef.html "class in akka.actor") sender,
		                                 [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```
		- #### copy$default$1
		
		
		
		```
		public [DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") copy$default$3()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AllDeadLetters.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SuppressedDeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/WrappedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/SuppressedDeadLetter.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/SuppressedDeadLetter.html)*