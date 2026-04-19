---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:46:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxy.TargetLocation$.html
title: PersistencePluginProxy.TargetLocation$
---

# PersistencePluginProxy.TargetLocation$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class PersistencePluginProxy.TargetLocation$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[Address](../../actor/Address.html "class in akka.actor"),​[PersistencePluginProxy.TargetLocation](PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal")\>
	- - akka.persistence.journal.PersistencePluginProxy.TargetLocation$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[Address](../../actor/Address.html "class in akka.actor"),​[PersistencePluginProxy.TargetLocation](PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal")>`

Enclosing class:
[PersistencePluginProxy](PersistencePluginProxy.html "class in akka.persistence.journal")

---

```
public static class PersistencePluginProxy.TargetLocation$
extends scala.runtime.AbstractFunction1<[Address](../../actor/Address.html "class in akka.actor"),​[PersistencePluginProxy.TargetLocation](PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.PersistencePluginProxy.TargetLocation$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistencePluginProxy.TargetLocation$](PersistencePluginProxy.TargetLocation$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TargetLocation$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PersistencePluginProxy.TargetLocation](PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal")` | `[apply](#apply(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[Address](../../actor/Address.html "class in akka.actor")>` | `[unapply](#unapply(akka.persistence.journal.PersistencePluginProxy.TargetLocation))​([PersistencePluginProxy.TargetLocation](PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistencePluginProxy.TargetLocation$](PersistencePluginProxy.TargetLocation$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TargetLocation$
		
		
		
		```
		public TargetLocation$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[Address](../../actor/Address.html "class in akka.actor"),​[PersistencePluginProxy.TargetLocation](PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[Address](../../actor/Address.html "class in akka.actor"),​[PersistencePluginProxy.TargetLocation](PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal")>`
		- #### apply
		
		
		
		```
		public [PersistencePluginProxy.TargetLocation](PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal") apply​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[Address](../../actor/Address.html "class in akka.actor"),​[PersistencePluginProxy.TargetLocation](PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[Address](../../actor/Address.html "class in akka.actor")> unapply​([PersistencePluginProxy.TargetLocation](PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxy.TargetLocation$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxy.TargetLocation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxy.TargetLocation$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxy.TargetLocation$.html)*