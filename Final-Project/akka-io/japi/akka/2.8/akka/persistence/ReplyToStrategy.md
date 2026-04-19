---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:29:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/ReplyToStrategy.html
title: ReplyToStrategy
---

# ReplyToStrategy

## Content

Package [akka.persistence](package-summary.html)
## Class ReplyToStrategy

- java.lang.Object
- - akka.persistence.ReplyToStrategy

- All Implemented Interfaces:
`[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ReplyToStrategy
extends java.lang.Object
implements [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence"), scala.Product, java.io.Serializable
```

Reply to sender with predefined response, and discard the received message silently.
 param: response the message replying to sender with

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.ReplyToStrategy)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplyToStrategy](#%3Cinit%3E(java.lang.Object))​(java.lang.Object response)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence")` | `[apply](#apply(java.lang.Object))​(java.lang.Object response)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence")` | `[copy](#copy(java.lang.Object))​(java.lang.Object response)` |  |
	| `java.lang.Object` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.Object` | `[response](#response())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.persistence.ReplyToStrategy))​([ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ReplyToStrategy
		
		
		
		```
		public ReplyToStrategy​(java.lang.Object response)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence") apply​(java.lang.Object response)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​([ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence") x$0)
		```
		- #### response
		
		
		
		```
		public java.lang.Object response()
		```
		- #### copy
		
		
		
		```
		public [ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence") copy​(java.lang.Object response)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Object copy$default$1()
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

- https://doc.akka.io/japi/akka/2.8/akka/persistence/ReplyToStrategy.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/StashOverflowStrategy.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/2.8/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/ReplyToStrategy.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/ReplyToStrategy.html)*