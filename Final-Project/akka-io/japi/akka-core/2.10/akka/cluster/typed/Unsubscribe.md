---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Unsubscribe.html
title: Unsubscribe
---

# Unsubscribe

## Content

Package [akka.cluster.typed](package-summary.html)
## Class Unsubscribe\<T\>

- java.lang.Object
- - akka.cluster.typed.Unsubscribe\<T\>

- All Implemented Interfaces:
`[ClusterStateSubscription](ClusterStateSubscription.html "interface in akka.cluster.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Unsubscribe<T>
extends java.lang.Object
implements [ClusterStateSubscription](ClusterStateSubscription.html "interface in akka.cluster.typed"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.Unsubscribe)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unsubscribe](#%3Cinit%3E(akka.actor.typed.ActorRef))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[T](Unsubscribe.html "type parameter in Unsubscribe")> subscriber)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Unsubscribe](Unsubscribe.html "class in akka.cluster.typed")<T>` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T> subscriber)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T> [Unsubscribe](Unsubscribe.html "class in akka.cluster.typed")<T>` | `[copy](#copy(akka.actor.typed.ActorRef))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T> subscriber)` |  |
	| `<T> [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[T](Unsubscribe.html "type parameter in Unsubscribe")>` | `[subscriber](#subscriber())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <T> scala.Option<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>>` | `[unapply](#unapply(akka.cluster.typed.Unsubscribe))​([Unsubscribe](Unsubscribe.html "class in akka.cluster.typed")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Unsubscribe
		
		
		
		```
		public Unsubscribe​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[T](Unsubscribe.html "type parameter in Unsubscribe")> subscriber)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Unsubscribe](Unsubscribe.html "class in akka.cluster.typed")<T> apply​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T> subscriber)
		```
		- #### unapply
		
		
		
		```
		public static <T> scala.Option<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>> unapply​([Unsubscribe](Unsubscribe.html "class in akka.cluster.typed")<T> x$0)
		```
		- #### subscriber
		
		
		
		```
		public [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[T](Unsubscribe.html "type parameter in Unsubscribe")> subscriber()
		```
		- #### copy
		
		
		
		```
		public <T> [Unsubscribe](Unsubscribe.html "class in akka.cluster.typed")<T> copy​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T> subscriber)
		```
		- #### copy$default$1
		
		
		
		```
		public <T> [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T> copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Unsubscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Unsubscribe.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Unsubscribe.html)*