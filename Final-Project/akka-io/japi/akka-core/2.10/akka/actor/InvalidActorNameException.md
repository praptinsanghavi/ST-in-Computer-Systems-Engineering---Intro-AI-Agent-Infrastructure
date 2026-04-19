---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:29:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/InvalidActorNameException.html
title: InvalidActorNameException
---

# InvalidActorNameException

## Content

Package [akka.actor](package-summary.html)
## Class InvalidActorNameException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../AkkaException.html "class in akka")
				- - akka.actor.InvalidActorNameException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class InvalidActorNameException
extends [AkkaException](../AkkaException.html "class in akka")
implements scala.Product, java.io.Serializable
```

An InvalidActorNameException is thrown when you try to convert something, usually a String, to an Actor name
 which doesn't validate.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.InvalidActorNameException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InvalidActorNameException](#%3Cinit%3E(java.lang.String))​(java.lang.String message)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [InvalidActorNameException](InvalidActorNameException.html "class in akka.actor")` | `[apply](#apply(java.lang.String))​(java.lang.String message)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[InvalidActorNameException](InvalidActorNameException.html "class in akka.actor")` | `[copy](#copy(java.lang.String))​(java.lang.String message)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[message](#message())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.String>` | `[unapply](#unapply(akka.actor.InvalidActorNameException))​([InvalidActorNameException](InvalidActorNameException.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### InvalidActorNameException
		
		
		
		```
		public InvalidActorNameException​(java.lang.String message)
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		- #### apply
		
		
		
		```
		public static [InvalidActorNameException](InvalidActorNameException.html "class in akka.actor") apply​(java.lang.String message)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.String> unapply​([InvalidActorNameException](InvalidActorNameException.html "class in akka.actor") x$0)
		```
		- #### message
		
		
		
		```
		public java.lang.String message()
		```
		- #### copy
		
		
		
		```
		public [InvalidActorNameException](InvalidActorNameException.html "class in akka.actor") copy​(java.lang.String message)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/InvalidActorNameException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/InvalidActorNameException.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/InvalidActorNameException.html)*