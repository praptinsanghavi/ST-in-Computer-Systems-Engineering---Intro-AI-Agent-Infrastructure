---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
title: Envelope
---

# Envelope

## Content

Package [akka.dispatch](package-summary.html)
## Class Envelope

- java.lang.Object
- - akka.dispatch.Envelope

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Envelope
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.Envelope)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Envelope](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Envelope](Envelope.html "class in akka.dispatch")` | `[apply](#apply(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `static [Envelope](Envelope.html "class in akka.dispatch")` | `[apply](#apply(java.lang.Object,akka.actor.ActorRef,akka.actor.ActorSystem))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Envelope](Envelope.html "class in akka.dispatch")` | `[copy](#copy(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `java.lang.Object` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.Object` | `[message](#message())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[sender](#sender())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor")>>` | `[unapply](#unapply(akka.dispatch.Envelope))​([Envelope](Envelope.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Envelope
		
		
		
		```
		public Envelope()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Envelope](Envelope.html "class in akka.dispatch") apply​(java.lang.Object message,
		                             [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,
		                             [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static [Envelope](Envelope.html "class in akka.dispatch") apply​(java.lang.Object message,
		                             [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor")>> unapply​([Envelope](Envelope.html "class in akka.dispatch") x$0)
		```
		- #### message
		
		
		
		```
		public java.lang.Object message()
		```
		- #### sender
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") sender()
		```
		- #### copy
		
		
		
		```
		public [Envelope](Envelope.html "class in akka.dispatch") copy​(java.lang.Object message,
		                     [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Object copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") copy$default$2()
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
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html](https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html)*