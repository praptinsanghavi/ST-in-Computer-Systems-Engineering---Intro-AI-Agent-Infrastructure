---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/Listen.html
title: Listen
---

# Listen

## Content

Package [akka.routing](package-summary.html)
## Class Listen

- java.lang.Object
- - akka.routing.Listen

- All Implemented Interfaces:
`[ListenerMessage](ListenerMessage.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Listen
extends java.lang.Object
implements [ListenerMessage](ListenerMessage.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.Listen)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Listen](#%3Cinit%3E(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") listener)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Listen](Listen.html "class in akka.routing")` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") listener)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Listen](Listen.html "class in akka.routing")` | `[copy](#copy(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") listener)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[listener](#listener())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.routing.Listen))​([Listen](Listen.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Listen
		
		
		
		```
		public Listen​([ActorRef](../actor/ActorRef.html "class in akka.actor") listener)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Listen](Listen.html "class in akka.routing") apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") listener)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> unapply​([Listen](Listen.html "class in akka.routing") x$0)
		```
		- #### listener
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") listener()
		```
		- #### copy
		
		
		
		```
		public [Listen](Listen.html "class in akka.routing") copy​([ActorRef](../actor/ActorRef.html "class in akka.actor") listener)
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

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/routing/Listen.html
- https://doc.akka.io/japi/akka/current/akka/routing/ListenerMessage.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/Listen.html](https://doc.akka.io/japi/akka/current/akka/routing/Listen.html)*