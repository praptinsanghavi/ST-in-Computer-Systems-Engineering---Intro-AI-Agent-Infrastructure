---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:47:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeathPactException.html
title: DeathPactException
---

# DeathPactException

## Content

Package [akka.actor](package-summary.html)
## Class DeathPactException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../AkkaException.html "class in akka")
				- - akka.actor.DeathPactException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.util.control.NoStackTrace`

---

```
public final class DeathPactException
extends [AkkaException](../AkkaException.html "class in akka")
implements scala.util.control.NoStackTrace, scala.Product, java.io.Serializable
```

A DeathPactException is thrown by an Actor that receives a Terminated(someActor) message
 that it doesn't handle itself, effectively crashing the Actor and escalating to the supervisor.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.DeathPactException)

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DeathPactException](DeathPactException.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") dead)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DeathPactException](DeathPactException.html "class in akka.actor")` | `[copy](#copy(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") dead)` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[dead](#dead())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.actor.DeathPactException))​([DeathPactException](DeathPactException.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		- #### apply
		
		
		
		```
		public static [DeathPactException](DeathPactException.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") dead)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> unapply​([DeathPactException](DeathPactException.html "class in akka.actor") x$0)
		```
		- #### dead
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") dead()
		```
		- #### copy
		
		
		
		```
		public [DeathPactException](DeathPactException.html "class in akka.actor") copy​([ActorRef](ActorRef.html "class in akka.actor") dead)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") copy$default$1()
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
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeathPactException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeathPactException.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeathPactException.html)*