---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:47:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/PersistenceTestKitPlugin.Write$.html
title: PersistenceTestKitPlugin.Write$
---

# PersistenceTestKitPlugin.Write$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class PersistenceTestKitPlugin.Write$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​akka.persistence.testkit.PersistenceTestKitPlugin.Write\>
	- - akka.persistence.testkit.PersistenceTestKitPlugin.Write$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.String,​java.lang.Object,​akka.persistence.testkit.PersistenceTestKitPlugin.Write>`

Enclosing class:
[PersistenceTestKitPlugin](PersistenceTestKitPlugin.html "class in akka.persistence.testkit")

---

```
public static class PersistenceTestKitPlugin.Write$
extends scala.runtime.AbstractFunction2<java.lang.String,​java.lang.Object,​akka.persistence.testkit.PersistenceTestKitPlugin.Write>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.PersistenceTestKitPlugin.Write$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistenceTestKitPlugin.Write$](PersistenceTestKitPlugin.Write$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Write$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.testkit.PersistenceTestKitPlugin.Write` | `[apply](#apply(java.lang.String,long))​(java.lang.String persistenceId,  long toSequenceNr)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.testkit.PersistenceTestKitPlugin.Write))​(akka.persistence.testkit.PersistenceTestKitPlugin.Write x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistenceTestKitPlugin.Write$](PersistenceTestKitPlugin.Write$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Write$
		
		
		
		```
		public Write$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.String,​java.lang.Object,​akka.persistence.testkit.PersistenceTestKitPlugin.Write>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.String,​java.lang.Object,​akka.persistence.testkit.PersistenceTestKitPlugin.Write>`
		- #### apply
		
		
		
		```
		public akka.persistence.testkit.PersistenceTestKitPlugin.Write apply​(java.lang.String persistenceId,
		                                                                     long toSequenceNr)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.String,​java.lang.Object>> unapply​(akka.persistence.testkit.PersistenceTestKitPlugin.Write x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/PersistenceTestKitPlugin.Write$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/PersistenceTestKitPlugin.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/PersistenceTestKitPlugin.Write$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/PersistenceTestKitPlugin.Write$.html)*