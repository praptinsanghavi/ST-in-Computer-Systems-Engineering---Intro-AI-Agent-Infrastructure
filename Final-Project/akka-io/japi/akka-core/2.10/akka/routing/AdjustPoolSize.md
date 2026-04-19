---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/AdjustPoolSize.html
title: AdjustPoolSize
---

# AdjustPoolSize

## Content

Package [akka.routing](package-summary.html)
## Class AdjustPoolSize

- java.lang.Object
- - akka.routing.AdjustPoolSize

- All Implemented Interfaces:
`[RouterManagementMesssage](RouterManagementMesssage.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class AdjustPoolSize
extends java.lang.Object
implements [RouterManagementMesssage](RouterManagementMesssage.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

Increase or decrease the number of routees in a [`Pool`](Pool.html "interface in akka.routing").
 It may be handled after other messages.
 
 Positive `change` will add that number of routees to the [`Pool`](Pool.html "interface in akka.routing").
 Negative `change` will remove that number of routees from the [`Pool`](Pool.html "interface in akka.routing").
 Routees are stopped by sending a [`PoisonPill`](../actor/PoisonPill.html "class in akka.actor") to the routee.
 Precautions are taken reduce the risk of dropping messages that are concurrently
 being routed to the removed routee, but it is not guaranteed that messages are not
 lost.

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.AdjustPoolSize)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AdjustPoolSize](#%3Cinit%3E(int))​(int change)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [AdjustPoolSize](AdjustPoolSize.html "class in akka.routing")` | `[apply](#apply(int))​(int change)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[change](#change())()` |  |
	| `[AdjustPoolSize](AdjustPoolSize.html "class in akka.routing")` | `[copy](#copy(int))​(int change)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.routing.AdjustPoolSize))​([AdjustPoolSize](AdjustPoolSize.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### AdjustPoolSize
		
		
		
		```
		public AdjustPoolSize​(int change)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [AdjustPoolSize](AdjustPoolSize.html "class in akka.routing") apply​(int change)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​([AdjustPoolSize](AdjustPoolSize.html "class in akka.routing") x$0)
		```
		- #### change
		
		
		
		```
		public int change()
		```
		- #### copy
		
		
		
		```
		public [AdjustPoolSize](AdjustPoolSize.html "class in akka.routing") copy​(int change)
		```
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/AdjustPoolSize.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Pool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterManagementMesssage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/AdjustPoolSize.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/AdjustPoolSize.html)*