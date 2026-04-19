---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:57:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/Dropped.html
title: Dropped
---

# Dropped

## Content

Package [akka.actor](package-summary.html)
## Class Dropped

- java.lang.Object
- - akka.actor.Dropped

- All Implemented Interfaces:
`[AllDeadLetters](AllDeadLetters.html "interface in akka.actor")`, `[WrappedMessage](WrappedMessage.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Dropped
extends java.lang.Object
implements [AllDeadLetters](AllDeadLetters.html "interface in akka.actor"), scala.Product, java.io.Serializable
```

Envelope that is published on the eventStream wrapped in [`DeadLetter`](DeadLetter.html "class in akka.actor") for every message that is
 dropped due to overfull queues or routers with no routees.
 
 When this message was sent without a sender [`ActorRef`](ActorRef.html "class in akka.actor"), `sender` will be `ActorRef.noSender`, i.e. `null`.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Dropped)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Dropped](#%3Cinit%3E(java.lang.Object,java.lang.String,akka.actor.ActorRef,akka.actor.ActorRef))​(java.lang.Object message,  java.lang.String reason,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Dropped](Dropped.html "class in akka.actor")` | `[apply](#apply(java.lang.Object,java.lang.String,akka.actor.ActorRef))​(java.lang.Object message,  java.lang.String reason,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` | Convenience for creating `Dropped` without a `sender`. |
	| `static [Dropped](Dropped.html "class in akka.actor")` | `[apply](#apply(java.lang.Object,java.lang.String,akka.actor.ActorRef,akka.actor.ActorRef))​(java.lang.Object message,  java.lang.String reason,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Dropped](Dropped.html "class in akka.actor")` | `[copy](#copy(java.lang.Object,java.lang.String,akka.actor.ActorRef,akka.actor.ActorRef))​(java.lang.Object message,  java.lang.String reason,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |
	| `java.lang.Object` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[copy$default$3](#copy$default$3())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.Object` | `[message](#message())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[reason](#reason())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[recipient](#recipient())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[sender](#sender())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple4<java.lang.Object,​java.lang.String,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>>` | `[unapply](#unapply(akka.actor.Dropped))​([Dropped](Dropped.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Dropped
		
		
		
		```
		public Dropped​(java.lang.Object message,
		               java.lang.String reason,
		               [ActorRef](ActorRef.html "class in akka.actor") sender,
		               [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Dropped](Dropped.html "class in akka.actor") apply​(java.lang.Object message,
		                            java.lang.String reason,
		                            [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```
		
		Convenience for creating `Dropped` without a `sender`.
		- #### apply
		
		
		
		```
		public static [Dropped](Dropped.html "class in akka.actor") apply​(java.lang.Object message,
		                            java.lang.String reason,
		                            [ActorRef](ActorRef.html "class in akka.actor") sender,
		                            [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple4<java.lang.Object,​java.lang.String,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>> unapply​([Dropped](Dropped.html "class in akka.actor") x$0)
		```
		- #### message
		
		
		
		```
		public java.lang.Object message()
		```
		
		
		Specified by:
		`[message](AllDeadLetters.html#message())` in interface `[AllDeadLetters](AllDeadLetters.html "interface in akka.actor")`
		Specified by:
		`[message](WrappedMessage.html#message())` in interface `[WrappedMessage](WrappedMessage.html "interface in akka.actor")`
		- #### reason
		
		
		
		```
		public java.lang.String reason()
		```
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
		public [Dropped](Dropped.html "class in akka.actor") copy​(java.lang.Object message,
		                    java.lang.String reason,
		                    [ActorRef](ActorRef.html "class in akka.actor") sender,
		                    [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Object copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.String copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") copy$default$4()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Dropped.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/WrappedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/Dropped.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Dropped.html)*