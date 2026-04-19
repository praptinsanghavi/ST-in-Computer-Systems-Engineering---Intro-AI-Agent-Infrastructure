---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:46:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PreRestartException.html
title: PreRestartException
---

# PreRestartException

## Content

Package [akka.actor](package-summary.html)
## Class PreRestartException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../AkkaException.html "class in akka")
				- - [akka.actor.ActorInitializationException](ActorInitializationException.html "class in akka.actor")
					- - akka.actor.PreRestartException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class PreRestartException
extends [ActorInitializationException](ActorInitializationException.html "class in akka.actor")
implements scala.Product, java.io.Serializable
```

A PreRestartException is thrown when the preRestart() method failed; this
 exception is not propagated to the supervisor, as it originates from the
 already failed instance, hence it is only visible as log entry on the event
 stream.
 
 param: actor is the actor whose preRestart() hook failed
 param: cause is the exception thrown by that actor within preRestart()
 param: originalCause is the exception which caused the restart in the first place
 param: messageOption is the message which was optionally passed into preRestart()

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.PreRestartException)

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[actor](#actor())()` |  |
	| `static [PreRestartException](PreRestartException.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef,java.lang.Throwable,java.lang.Throwable,scala.Option))​([ActorRef](ActorRef.html "class in akka.actor") actor,  java.lang.Throwable cause,  java.lang.Throwable originalCause,  scala.Option<java.lang.Object> messageOption)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Throwable` | `[cause](#cause())()` |  |
	| `[PreRestartException](PreRestartException.html "class in akka.actor")` | `[copy](#copy(akka.actor.ActorRef,java.lang.Throwable,java.lang.Throwable,scala.Option))​([ActorRef](ActorRef.html "class in akka.actor") actor,  java.lang.Throwable cause,  java.lang.Throwable originalCause,  scala.Option<java.lang.Object> messageOption)` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.Throwable` | `[copy$default$2](#copy$default$2())()` |  |
	| `java.lang.Throwable` | `[copy$default$3](#copy$default$3())()` |  |
	| `scala.Option<java.lang.Object>` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.Option<java.lang.Object>` | `[messageOption](#messageOption())()` |  |
	| `java.lang.Throwable` | `[originalCause](#originalCause())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple4<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​scala.Option<java.lang.Object>>>` | `[unapply](#unapply(akka.actor.PreRestartException))​([PreRestartException](PreRestartException.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class akka.actor.[ActorInitializationException](ActorInitializationException.html "class in akka.actor")
		
		
		`[getActor](ActorInitializationException.html#getActor()), [unapply](ActorInitializationException.html#unapply(akka.actor.ActorInitializationException))`
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		- #### apply
		
		
		
		```
		public static [PreRestartException](PreRestartException.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") actor,
		                                        java.lang.Throwable cause,
		                                        java.lang.Throwable originalCause,
		                                        scala.Option<java.lang.Object> messageOption)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple4<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​scala.Option<java.lang.Object>>> unapply​([PreRestartException](PreRestartException.html "class in akka.actor") x$0)
		```
		- #### actor
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") actor()
		```
		- #### cause
		
		
		
		```
		public java.lang.Throwable cause()
		```
		- #### originalCause
		
		
		
		```
		public java.lang.Throwable originalCause()
		```
		- #### messageOption
		
		
		
		```
		public scala.Option<java.lang.Object> messageOption()
		```
		- #### copy
		
		
		
		```
		public [PreRestartException](PreRestartException.html "class in akka.actor") copy​([ActorRef](ActorRef.html "class in akka.actor") actor,
		                                java.lang.Throwable cause,
		                                java.lang.Throwable originalCause,
		                                scala.Option<java.lang.Object> messageOption)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.Throwable copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public java.lang.Throwable copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public scala.Option<java.lang.Object> copy$default$4()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorInitializationException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PreRestartException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PreRestartException.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PreRestartException.html)*