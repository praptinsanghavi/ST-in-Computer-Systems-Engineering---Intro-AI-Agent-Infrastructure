---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/Broadcast.html
title: Broadcast
---

# Broadcast

## Content

Package [akka.routing](package-summary.html)
## Class Broadcast

- java.lang.Object
- - akka.routing.Broadcast

- All Implemented Interfaces:
`[WrappedMessage](../actor/WrappedMessage.html "interface in akka.actor")`, `[RouterEnvelope](RouterEnvelope.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Broadcast
extends java.lang.Object
implements [RouterEnvelope](RouterEnvelope.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

Used to broadcast a message to all routees in a router; only the
 contained message will be forwarded, i.e. the `Broadcast(...)`
 envelope will be stripped off.

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.Broadcast)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Broadcast](#%3Cinit%3E(java.lang.Object))​(java.lang.Object message)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Broadcast](Broadcast.html "class in akka.routing")` | `[apply](#apply(java.lang.Object))​(java.lang.Object message)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Broadcast](Broadcast.html "class in akka.routing")` | `[copy](#copy(java.lang.Object))​(java.lang.Object message)` |  |
	| `java.lang.Object` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.Object` | `[message](#message())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.routing.Broadcast))​([Broadcast](Broadcast.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Broadcast
		
		
		
		```
		public Broadcast​(java.lang.Object message)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Broadcast](Broadcast.html "class in akka.routing") apply​(java.lang.Object message)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​([Broadcast](Broadcast.html "class in akka.routing") x$0)
		```
		- #### message
		
		
		
		```
		public java.lang.Object message()
		```
		
		
		Specified by:
		`[message](RouterEnvelope.html#message())` in interface `[RouterEnvelope](RouterEnvelope.html "interface in akka.routing")`
		Specified by:
		`[message](../actor/WrappedMessage.html#message())` in interface `[WrappedMessage](../actor/WrappedMessage.html "interface in akka.actor")`
		- #### copy
		
		
		
		```
		public [Broadcast](Broadcast.html "class in akka.routing") copy​(java.lang.Object message)
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/WrappedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Broadcast.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/Broadcast.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Broadcast.html)*