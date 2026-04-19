---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:11:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite$.html
title: AtomicWrite$
---

# AtomicWrite$

## Content

Package [akka.persistence](package-summary.html)
## Class AtomicWrite$

- java.lang.Object
- - akka.persistence.AtomicWrite$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class AtomicWrite$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.AtomicWrite$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AtomicWrite$](AtomicWrite$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AtomicWrite$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AtomicWrite](AtomicWrite.html "class in akka.persistence")` | `[apply](#apply(akka.persistence.PersistentRepr))​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") event)` |  |
	| `[AtomicWrite](AtomicWrite.html "class in akka.persistence")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")> payload)` |  |
	| `scala.Option<scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")>>` | `[unapply](#unapply(akka.persistence.AtomicWrite))​([AtomicWrite](AtomicWrite.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AtomicWrite$](AtomicWrite$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AtomicWrite$
		
		
		
		```
		public AtomicWrite$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [AtomicWrite](AtomicWrite.html "class in akka.persistence") apply​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") event)
		```
		- #### apply
		
		
		
		```
		public [AtomicWrite](AtomicWrite.html "class in akka.persistence") apply​(scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")> payload)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Seq<[PersistentRepr](PersistentRepr.html "interface in akka.persistence")>> unapply​([AtomicWrite](AtomicWrite.html "class in akka.persistence") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite$.html)*