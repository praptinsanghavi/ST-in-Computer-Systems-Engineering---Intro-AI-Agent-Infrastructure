---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:46:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteTarget.WriteMessages$.html
title: AsyncWriteTarget.WriteMessages$
---

# AsyncWriteTarget.WriteMessages$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class AsyncWriteTarget.WriteMessages$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")\>,​[AsyncWriteTarget.WriteMessages](AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal")\>
	- - akka.persistence.journal.AsyncWriteTarget.WriteMessages$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")>,​[AsyncWriteTarget.WriteMessages](AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal")>`

Enclosing class:
[AsyncWriteTarget](AsyncWriteTarget.html "class in akka.persistence.journal")

---

```
public static class AsyncWriteTarget.WriteMessages$
extends scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")>,​[AsyncWriteTarget.WriteMessages](AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.AsyncWriteTarget.WriteMessages$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AsyncWriteTarget.WriteMessages$](AsyncWriteTarget.WriteMessages$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WriteMessages$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AsyncWriteTarget.WriteMessages](AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")> messages)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")>>` | `[unapply](#unapply(akka.persistence.journal.AsyncWriteTarget.WriteMessages))​([AsyncWriteTarget.WriteMessages](AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AsyncWriteTarget.WriteMessages$](AsyncWriteTarget.WriteMessages$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WriteMessages$
		
		
		
		```
		public WriteMessages$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")>,​[AsyncWriteTarget.WriteMessages](AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")>,​[AsyncWriteTarget.WriteMessages](AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal")>`
		- #### apply
		
		
		
		```
		public [AsyncWriteTarget.WriteMessages](AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal") apply​(scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")> messages)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")>,​[AsyncWriteTarget.WriteMessages](AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Seq<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")>> unapply​([AsyncWriteTarget.WriteMessages](AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteTarget.WriteMessages$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteTarget.WriteMessages.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteTarget.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteTarget.WriteMessages$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteTarget.WriteMessages$.html)*