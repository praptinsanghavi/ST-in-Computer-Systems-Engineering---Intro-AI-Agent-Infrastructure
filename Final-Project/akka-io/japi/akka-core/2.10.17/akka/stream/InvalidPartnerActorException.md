---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:29:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/InvalidPartnerActorException.html
title: InvalidPartnerActorException
---

# InvalidPartnerActorException

## Content

Package [akka.stream](package-summary.html)
## Class InvalidPartnerActorException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - java.lang.IllegalStateException
				- - akka.stream.InvalidPartnerActorException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class InvalidPartnerActorException
extends java.lang.IllegalStateException
implements scala.Product, java.io.Serializable
```

Stream refs establish a connection between a local and remote actor, representing the origin and remote sides
 of a stream. Each such actor refers to the other side as its "partner". We make sure that no other actor than
 the initial partner can send demand/messages to the other side accidentally.
 
 This exception is thrown when a message is received from a non\-partner actor,
 which could mean a bug or some actively malicient behavior from the other side.
 

 This is not meant as a security feature, but rather as plain sanity\-check.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.InvalidPartnerActorException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InvalidPartnerActorException](#%3Cinit%3E(akka.actor.ActorRef,akka.actor.ActorRef,java.lang.String))​([ActorRef](../actor/ActorRef.html "class in akka.actor") expectedRef,  [ActorRef](../actor/ActorRef.html "class in akka.actor") gotRef,  java.lang.String msg)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream")` | `[apply](#apply(akka.actor.ActorRef,akka.actor.ActorRef,java.lang.String))​([ActorRef](../actor/ActorRef.html "class in akka.actor") expectedRef,  [ActorRef](../actor/ActorRef.html "class in akka.actor") gotRef,  java.lang.String msg)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream")` | `[copy](#copy(akka.actor.ActorRef,akka.actor.ActorRef,java.lang.String))​([ActorRef](../actor/ActorRef.html "class in akka.actor") expectedRef,  [ActorRef](../actor/ActorRef.html "class in akka.actor") gotRef,  java.lang.String msg)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[copy$default$2](#copy$default$2())()` |  |
	| `java.lang.String` | `[copy$default$3](#copy$default$3())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[expectedRef](#expectedRef())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[gotRef](#gotRef())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[msg](#msg())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String>>` | `[unapply](#unapply(akka.stream.InvalidPartnerActorException))​([InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### InvalidPartnerActorException
		
		
		
		```
		public InvalidPartnerActorException​([ActorRef](../actor/ActorRef.html "class in akka.actor") expectedRef,
		                                    [ActorRef](../actor/ActorRef.html "class in akka.actor") gotRef,
		                                    java.lang.String msg)
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		- #### apply
		
		
		
		```
		public static [InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream") apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") expectedRef,
		                                                 [ActorRef](../actor/ActorRef.html "class in akka.actor") gotRef,
		                                                 java.lang.String msg)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String>> unapply​([InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream") x$0)
		```
		- #### expectedRef
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") expectedRef()
		```
		- #### gotRef
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") gotRef()
		```
		- #### msg
		
		
		
		```
		public java.lang.String msg()
		```
		- #### copy
		
		
		
		```
		public [InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream") copy​([ActorRef](../actor/ActorRef.html "class in akka.actor") expectedRef,
		                                         [ActorRef](../actor/ActorRef.html "class in akka.actor") gotRef,
		                                         java.lang.String msg)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public java.lang.String copy$default$3()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/InvalidPartnerActorException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/InvalidPartnerActorException.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/InvalidPartnerActorException.html)*