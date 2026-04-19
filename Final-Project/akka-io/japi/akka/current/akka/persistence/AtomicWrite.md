---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/AtomicWrite.html
title: AtomicWrite
---

# AtomicWrite

## Content

Package [akka.persistence](package-summary.html)
## Class AtomicWrite

- java.lang.Object
- - akka.persistence.AtomicWrite

- All Implemented Interfaces:
`[PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence")`, `[Message](serialization/Message.html "interface in akka.persistence.serialization")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class AtomicWrite
extends java.lang.Object
implements [PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence"), [Message](serialization/Message.html "interface in akka.persistence.serialization"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.AtomicWrite)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AtomicWrite](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")> payload)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [AtomicWrite](AtomicWrite.html "class in akka.persistence")` | `[apply](#apply(akka.persistence.PersistentRepr))​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") event)` |  |
	| `static [AtomicWrite](AtomicWrite.html "class in akka.persistence")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")> payload)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[AtomicWrite](AtomicWrite.html "class in akka.persistence")` | `[copy](#copy(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")> payload)` |  |
	| `scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `long` | `[highestSequenceNr](#highestSequenceNr())()` |  |
	| `long` | `[lowestSequenceNr](#lowestSequenceNr())()` |  |
	| `scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")>` | `[payload](#payload())()` |  |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[sender](#sender())()` |  |
	| `int` | `[size](#size())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")>>` | `[unapply](#unapply(akka.persistence.AtomicWrite))​([AtomicWrite](AtomicWrite.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### AtomicWrite
		
		
		
		```
		public AtomicWrite​(scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")> payload)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [AtomicWrite](AtomicWrite.html "class in akka.persistence") apply​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") event)
		```
		- #### apply
		
		
		
		```
		public static [AtomicWrite](AtomicWrite.html "class in akka.persistence") apply​(scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")> payload)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")>> unapply​([AtomicWrite](AtomicWrite.html "class in akka.persistence") x$0)
		```
		- #### payload
		
		
		
		```
		public scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")> payload()
		```
		
		
		Specified by:
		`[payload](PersistentEnvelope.html#payload())` in interface `[PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence")`
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		- #### lowestSequenceNr
		
		
		
		```
		public long lowestSequenceNr()
		```
		- #### highestSequenceNr
		
		
		
		```
		public long highestSequenceNr()
		```
		- #### sender
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") sender()
		```
		
		
		Specified by:
		`[sender](PersistentEnvelope.html#sender())` in interface `[PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence")`
		- #### size
		
		
		
		```
		public int size()
		```
		
		
		Specified by:
		`[size](PersistentEnvelope.html#size())` in interface `[PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence")`
		- #### copy
		
		
		
		```
		public [AtomicWrite](AtomicWrite.html "class in akka.persistence") copy​(scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")> payload)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")> copy$default$1()
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
- https://doc.akka.io/japi/akka/current/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/Message.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/AtomicWrite.html](https://doc.akka.io/japi/akka/current/akka/persistence/AtomicWrite.html)*