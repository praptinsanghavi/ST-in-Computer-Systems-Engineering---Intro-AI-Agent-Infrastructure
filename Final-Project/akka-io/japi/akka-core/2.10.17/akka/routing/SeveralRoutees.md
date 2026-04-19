---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:54:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/SeveralRoutees.html
title: SeveralRoutees
---

# SeveralRoutees

## Content

Package [akka.routing](package-summary.html)
## Class SeveralRoutees

- java.lang.Object
- - akka.routing.SeveralRoutees

- All Implemented Interfaces:
`[Routee](Routee.html "interface in akka.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SeveralRoutees
extends java.lang.Object
implements [Routee](Routee.html "interface in akka.routing"), scala.Product, java.io.Serializable
```

[`Routee`](Routee.html "interface in akka.routing") that sends each message to all `routees`.

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.SeveralRoutees)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SeveralRoutees](#%3Cinit%3E(java.lang.Iterable))​(java.lang.Iterable<[Routee](Routee.html "interface in akka.routing")> rs)` | Java API |
	| `[SeveralRoutees](#%3Cinit%3E(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SeveralRoutees](SeveralRoutees.html "class in akka.routing")` | `[apply](#apply(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SeveralRoutees](SeveralRoutees.html "class in akka.routing")` | `[copy](#copy(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` |  |
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
	| `void` | `[send](#send(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>>` | `[unapply](#unapply(akka.routing.SeveralRoutees))​([SeveralRoutees](SeveralRoutees.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SeveralRoutees
		
		
		
		```
		public SeveralRoutees​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		- #### SeveralRoutees
		
		
		
		```
		public SeveralRoutees​(java.lang.Iterable<[Routee](Routee.html "interface in akka.routing")> rs)
		```
		
		Java API

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SeveralRoutees](SeveralRoutees.html "class in akka.routing") apply​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>> unapply​([SeveralRoutees](SeveralRoutees.html "class in akka.routing") x$0)
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
		- #### send
		
		
		
		```
		public void send​(java.lang.Object message,
		                 [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		
		Specified by:
		`[send](Routee.html#send(java.lang.Object,akka.actor.ActorRef))` in interface `[Routee](Routee.html "interface in akka.routing")`
		- #### copy
		
		
		
		```
		public [SeveralRoutees](SeveralRoutees.html "class in akka.routing") copy​(scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/SeveralRoutees.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/SeveralRoutees.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/SeveralRoutees.html)*