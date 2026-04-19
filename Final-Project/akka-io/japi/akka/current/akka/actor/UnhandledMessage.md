---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:51:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/UnhandledMessage.html
title: UnhandledMessage
---

# UnhandledMessage

## Content

Package [akka.actor](package-summary.html)
## Class UnhandledMessage

- java.lang.Object
- - akka.actor.UnhandledMessage

- All Implemented Interfaces:
`[AllDeadLetters](AllDeadLetters.html "interface in akka.actor")`, `[NoSerializationVerificationNeeded](NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[WrappedMessage](WrappedMessage.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class UnhandledMessage
extends java.lang.Object
implements [NoSerializationVerificationNeeded](NoSerializationVerificationNeeded.html "interface in akka.actor"), [WrappedMessage](WrappedMessage.html "interface in akka.actor"), [AllDeadLetters](AllDeadLetters.html "interface in akka.actor"), scala.Product, java.io.Serializable
```

This message is published to the EventStream whenever an Actor receives a message it doesn't understand

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.UnhandledMessage)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnhandledMessage](#%3Cinit%3E(java.lang.Object,akka.actor.ActorRef,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [UnhandledMessage](UnhandledMessage.html "class in akka.actor")` | `[apply](#apply(java.lang.Object,akka.actor.ActorRef,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[UnhandledMessage](UnhandledMessage.html "class in akka.actor")` | `[copy](#copy(java.lang.Object,akka.actor.ActorRef,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |
	| `java.lang.Object` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[copy$default$2](#copy$default$2())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[copy$default$3](#copy$default$3())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Object` | `[getMessage](#getMessage())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[getRecipient](#getRecipient())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[getSender](#getSender())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.Object` | `[message](#message())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[recipient](#recipient())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[sender](#sender())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<java.lang.Object,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>>` | `[unapply](#unapply(akka.actor.UnhandledMessage))​([UnhandledMessage](UnhandledMessage.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### UnhandledMessage
		
		
		
		```
		public UnhandledMessage​(java.lang.Object message,
		                        [ActorRef](ActorRef.html "class in akka.actor") sender,
		                        [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [UnhandledMessage](UnhandledMessage.html "class in akka.actor") apply​(java.lang.Object message,
		                                     [ActorRef](ActorRef.html "class in akka.actor") sender,
		                                     [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<java.lang.Object,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>> unapply​([UnhandledMessage](UnhandledMessage.html "class in akka.actor") x$0)
		```
		- #### message
		
		
		
		```
		public java.lang.Object message()
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
		public [UnhandledMessage](UnhandledMessage.html "class in akka.actor") copy​(java.lang.Object message,
		                             [ActorRef](ActorRef.html "class in akka.actor") sender,
		                             [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Object copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") copy$default$3()
		```
		- #### getMessage
		
		
		
		```
		public java.lang.Object getMessage()
		```
		- #### getRecipient
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") getRecipient()
		```
		- #### getSender
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") getSender()
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
- https://doc.akka.io/japi/akka/current/akka/actor/AllDeadLetters.html
- https://doc.akka.io/japi/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka/current/akka/actor/UnhandledMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/WrappedMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/UnhandledMessage.html](https://doc.akka.io/japi/akka/current/akka/actor/UnhandledMessage.html)*