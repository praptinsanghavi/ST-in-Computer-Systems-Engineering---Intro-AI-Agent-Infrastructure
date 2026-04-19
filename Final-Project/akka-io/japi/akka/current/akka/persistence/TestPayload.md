---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/TestPayload.html
title: TestPayload
---

# TestPayload

## Content

Package [akka.persistence](package-summary.html)
## Class TestPayload

- java.lang.Object
- - akka.persistence.TestPayload

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class TestPayload
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.TestPayload)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestPayload](#%3Cinit%3E(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TestPayload](TestPayload.html "class in akka.persistence")` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[TestPayload](TestPayload.html "class in akka.persistence")` | `[copy](#copy(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ref](#ref())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.persistence.TestPayload))​([TestPayload](TestPayload.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### TestPayload
		
		
		
		```
		public TestPayload​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [TestPayload](TestPayload.html "class in akka.persistence") apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> unapply​([TestPayload](TestPayload.html "class in akka.persistence") x$0)
		```
		- #### ref
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") ref()
		```
		- #### copy
		
		
		
		```
		public [TestPayload](TestPayload.html "class in akka.persistence") copy​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
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
- https://doc.akka.io/japi/akka/current/akka/persistence/TestPayload.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/TestPayload.html](https://doc.akka.io/japi/akka/current/akka/persistence/TestPayload.html)*