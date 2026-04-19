---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.Desequenced$.html
title: AsyncWriteJournal.Desequenced$
---

# AsyncWriteJournal.Desequenced$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class AsyncWriteJournal.Desequenced$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[AsyncWriteJournal.Desequenced](AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal")\>
	- - akka.persistence.journal.AsyncWriteJournal.Desequenced$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<java.lang.Object,​java.lang.Object,​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[AsyncWriteJournal.Desequenced](AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal")>`

Enclosing interface:
[AsyncWriteJournal](AsyncWriteJournal.html "interface in akka.persistence.journal")

---

```
public static class AsyncWriteJournal.Desequenced$
extends scala.runtime.AbstractFunction4<java.lang.Object,​java.lang.Object,​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[AsyncWriteJournal.Desequenced](AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.AsyncWriteJournal.Desequenced$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AsyncWriteJournal.Desequenced$](AsyncWriteJournal.Desequenced$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Desequenced$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AsyncWriteJournal.Desequenced](AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal")` | `[apply](#apply(java.lang.Object,long,akka.actor.ActorRef,akka.actor.ActorRef))​(java.lang.Object msg,  long snr,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") target,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>>` | `[unapply](#unapply(akka.persistence.journal.AsyncWriteJournal.Desequenced))​([AsyncWriteJournal.Desequenced](AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function4
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AsyncWriteJournal.Desequenced$](AsyncWriteJournal.Desequenced$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Desequenced$
		
		
		
		```
		public Desequenced$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<java.lang.Object,​java.lang.Object,​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[AsyncWriteJournal.Desequenced](AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<java.lang.Object,​java.lang.Object,​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[AsyncWriteJournal.Desequenced](AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal")>`
		- #### apply
		
		
		
		```
		public [AsyncWriteJournal.Desequenced](AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal") apply​(java.lang.Object msg,
		                                           long snr,
		                                           [ActorRef](../../actor/ActorRef.html "class in akka.actor") target,
		                                           [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>> unapply​([AsyncWriteJournal.Desequenced](AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.Desequenced$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.Desequenced.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.Desequenced$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.Desequenced$.html)*