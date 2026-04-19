---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:29:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorNotFound.html
title: ActorNotFound
---

# ActorNotFound

## Content

Package [akka.actor](package-summary.html)
## Class ActorNotFound

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.actor.ActorNotFound

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ActorNotFound
extends java.lang.RuntimeException
implements scala.Product, java.io.Serializable
```

When [`ActorSelection.resolveOne(akka.util.Timeout)`](ActorSelection.html#resolveOne(akka.util.Timeout)) can't identify the actor the
 `Future` is completed with this failure.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorNotFound)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorNotFound](#%3Cinit%3E(akka.actor.ActorSelection))​([ActorSelection](ActorSelection.html "class in akka.actor") selection)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ActorNotFound](ActorNotFound.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorSelection))​([ActorSelection](ActorSelection.html "class in akka.actor") selection)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ActorNotFound](ActorNotFound.html "class in akka.actor")` | `[copy](#copy(akka.actor.ActorSelection))​([ActorSelection](ActorSelection.html "class in akka.actor") selection)` |  |
	| `[ActorSelection](ActorSelection.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorSelection](ActorSelection.html "class in akka.actor")` | `[selection](#selection())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ActorSelection](ActorSelection.html "class in akka.actor")>` | `[unapply](#unapply(akka.actor.ActorNotFound))​([ActorNotFound](ActorNotFound.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ActorNotFound
		
		
		
		```
		public ActorNotFound​([ActorSelection](ActorSelection.html "class in akka.actor") selection)
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		- #### apply
		
		
		
		```
		public static [ActorNotFound](ActorNotFound.html "class in akka.actor") apply​([ActorSelection](ActorSelection.html "class in akka.actor") selection)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ActorSelection](ActorSelection.html "class in akka.actor")> unapply​([ActorNotFound](ActorNotFound.html "class in akka.actor") x$0)
		```
		- #### selection
		
		
		
		```
		public [ActorSelection](ActorSelection.html "class in akka.actor") selection()
		```
		- #### copy
		
		
		
		```
		public [ActorNotFound](ActorNotFound.html "class in akka.actor") copy​([ActorSelection](ActorSelection.html "class in akka.actor") selection)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorSelection](ActorSelection.html "class in akka.actor") copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorNotFound.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorNotFound.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorNotFound.html)*