---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:48:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/AbruptTerminationException.html
title: AbruptTerminationException
---

# AbruptTerminationException

## Content

Package [akka.stream](package-summary.html)
## Class AbruptTerminationException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.stream.AbruptStreamTerminationException](AbruptStreamTerminationException.html "class in akka.stream")
				- - akka.stream.AbruptTerminationException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.util.control.NoStackTrace`

---

```
public final class AbruptTerminationException
extends [AbruptStreamTerminationException](AbruptStreamTerminationException.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

This exception signals that an actor implementing a Reactive Streams Subscriber, Publisher or Processor
 has been terminated without being notified by an onError, onComplete or cancel signal. This usually happens
 when an ActorSystem is shut down while stream processing actors are still running.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.AbruptTerminationException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbruptTerminationException](#%3Cinit%3E(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[actor](#actor())()` |  |
	| `static [AbruptTerminationException](AbruptTerminationException.html "class in akka.stream")` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[AbruptTerminationException](AbruptTerminationException.html "class in akka.stream")` | `[copy](#copy(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.stream.AbruptTerminationException))​([AbruptTerminationException](AbruptTerminationException.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### AbruptTerminationException
		
		
		
		```
		public AbruptTerminationException​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor)
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		- #### apply
		
		
		
		```
		public static [AbruptTerminationException](AbruptTerminationException.html "class in akka.stream") apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> unapply​([AbruptTerminationException](AbruptTerminationException.html "class in akka.stream") x$0)
		```
		- #### actor
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") actor()
		```
		- #### copy
		
		
		
		```
		public [AbruptTerminationException](AbruptTerminationException.html "class in akka.stream") copy​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/AbruptStreamTerminationException.html
- https://doc.akka.io/japi/akka/current/akka/stream/AbruptTerminationException.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/AbruptTerminationException.html](https://doc.akka.io/japi/akka/current/akka/stream/AbruptTerminationException.html)*