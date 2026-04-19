---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/Routees.html
title: Routees
---

# Routees

## Content

Package [akka.routing](package-summary.html)
## Class Routees

- java.lang.Object
- - akka.routing.Routees

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Routees
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Message used to carry information about what routees the router is currently using.

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.Routees)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Routees](#%3Cinit%3E(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Routees](Routees.html "class in akka.routing")` | `[apply](#apply(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Routees](Routees.html "class in akka.routing")` | `[copy](#copy(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` |  |
	| `scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.util.List<[Routee](Routee.html "interface in akka.routing")>` | `[getRoutees](#getRoutees())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>` | `[routees](#routees())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>>` | `[unapply](#unapply(akka.routing.Routees))​([Routees](Routees.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Routees
		
		
		
		```
		public Routees​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Routees](Routees.html "class in akka.routing") apply​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>> unapply​([Routees](Routees.html "class in akka.routing") x$0)
		```
		- #### routees
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees()
		```
		- #### getRoutees
		
		
		
		```
		public java.util.List<[Routee](Routee.html "interface in akka.routing")> getRoutees()
		```
		
		Java API
		- #### copy
		
		
		
		```
		public [Routees](Routees.html "class in akka.routing") copy​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/routing/Routee.html
- https://doc.akka.io/japi/akka/current/akka/routing/Routees.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/Routees.html](https://doc.akka.io/japi/akka/current/akka/routing/Routees.html)*