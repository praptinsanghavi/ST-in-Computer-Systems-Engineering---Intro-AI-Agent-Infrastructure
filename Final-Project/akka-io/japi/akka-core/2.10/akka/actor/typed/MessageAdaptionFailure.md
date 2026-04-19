---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MessageAdaptionFailure.html
title: MessageAdaptionFailure
---

# MessageAdaptionFailure

## Content

Package [akka.actor.typed](package-summary.html)
## Class MessageAdaptionFailure

- java.lang.Object
- - akka.actor.typed.MessageAdaptionFailure

- All Implemented Interfaces:
`[Signal](Signal.html "interface in akka.actor.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class MessageAdaptionFailure
extends java.lang.Object
implements [Signal](Signal.html "interface in akka.actor.typed"), scala.Product, java.io.Serializable
```

Signal passed to the actor when a message adapter has thrown an exception adapting an incoming message.
 Default signal handlers will re\-throw the exception so that such failures are handled by supervision.

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.MessageAdaptionFailure)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageAdaptionFailure](#%3Cinit%3E(java.lang.Throwable))​(java.lang.Throwable exception)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [MessageAdaptionFailure](MessageAdaptionFailure.html "class in akka.actor.typed")` | `[apply](#apply(java.lang.Throwable))​(java.lang.Throwable exception)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[MessageAdaptionFailure](MessageAdaptionFailure.html "class in akka.actor.typed")` | `[copy](#copy(java.lang.Throwable))​(java.lang.Throwable exception)` |  |
	| `java.lang.Throwable` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Throwable` | `[exception](#exception())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Throwable>` | `[unapply](#unapply(akka.actor.typed.MessageAdaptionFailure))​([MessageAdaptionFailure](MessageAdaptionFailure.html "class in akka.actor.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### MessageAdaptionFailure
		
		
		
		```
		public MessageAdaptionFailure​(java.lang.Throwable exception)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [MessageAdaptionFailure](MessageAdaptionFailure.html "class in akka.actor.typed") apply​(java.lang.Throwable exception)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Throwable> unapply​([MessageAdaptionFailure](MessageAdaptionFailure.html "class in akka.actor.typed") x$0)
		```
		- #### exception
		
		
		
		```
		public java.lang.Throwable exception()
		```
		- #### copy
		
		
		
		```
		public [MessageAdaptionFailure](MessageAdaptionFailure.html "class in akka.actor.typed") copy​(java.lang.Throwable exception)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Throwable copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MessageAdaptionFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MessageAdaptionFailure.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MessageAdaptionFailure.html)*