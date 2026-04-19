---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:46:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteProxy.SetStore$.html
title: AsyncWriteProxy.SetStore$
---

# AsyncWriteProxy.SetStore$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class AsyncWriteProxy.SetStore$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal")\>
	- - akka.persistence.journal.AsyncWriteProxy.SetStore$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal")>`

Enclosing interface:
[AsyncWriteProxy](AsyncWriteProxy.html "interface in akka.persistence.journal")

---

```
public static class AsyncWriteProxy.SetStore$
extends scala.runtime.AbstractFunction1<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.AsyncWriteProxy.SetStore$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AsyncWriteProxy.SetStore$](AsyncWriteProxy.SetStore$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SetStore$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal")` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.persistence.journal.AsyncWriteProxy.SetStore))​([AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AsyncWriteProxy.SetStore$](AsyncWriteProxy.SetStore$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SetStore$
		
		
		
		```
		public SetStore$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal")>`
		- #### apply
		
		
		
		```
		public [AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal") apply​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​[AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> unapply​([AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteProxy.SetStore$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteProxy.SetStore.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteProxy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteProxy.SetStore$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/AsyncWriteProxy.SetStore$.html)*