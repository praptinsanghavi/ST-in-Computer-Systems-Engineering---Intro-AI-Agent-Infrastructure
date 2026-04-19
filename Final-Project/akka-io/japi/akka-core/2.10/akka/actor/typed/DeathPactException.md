---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:03:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/DeathPactException.html
title: DeathPactException
---

# DeathPactException

## Content

Package [akka.actor.typed](package-summary.html)
## Class DeathPactException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.actor.typed.DeathPactException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class DeathPactException
extends java.lang.RuntimeException
implements scala.Product, java.io.Serializable
```

Exception that an actor fails with if it does not handle a Terminated message.

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.DeathPactException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeathPactException](#%3Cinit%3E(akka.actor.typed.ActorRef))​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DeathPactException](DeathPactException.html "class in akka.actor.typed")` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DeathPactException](DeathPactException.html "class in akka.actor.typed")` | `[copy](#copy(akka.actor.typed.ActorRef))​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)` |  |
	| `[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ActorRef](ActorRef.html "interface in akka.actor.typed")<java.lang.Void>` | `[getRef](#getRef())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>` | `[ref](#ref())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>>` | `[unapply](#unapply(akka.actor.typed.DeathPactException))​([DeathPactException](DeathPactException.html "class in akka.actor.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DeathPactException
		
		
		
		```
		public DeathPactException​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		- #### apply
		
		
		
		```
		public static [DeathPactException](DeathPactException.html "class in akka.actor.typed") apply​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>> unapply​([DeathPactException](DeathPactException.html "class in akka.actor.typed") x$0)
		```
		- #### ref
		
		
		
		```
		public [ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref()
		```
		- #### getRef
		
		
		
		```
		public [ActorRef](ActorRef.html "interface in akka.actor.typed")<java.lang.Void> getRef()
		```
		
		Java API
		- #### copy
		
		
		
		```
		public [DeathPactException](DeathPactException.html "class in akka.actor.typed") copy​([ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> ref)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorRef](ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/DeathPactException.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/DeathPactException.html)*