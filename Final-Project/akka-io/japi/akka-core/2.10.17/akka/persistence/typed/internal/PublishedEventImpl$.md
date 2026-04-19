---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:49:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/PublishedEventImpl$.html
title: PublishedEventImpl$
---

# PublishedEventImpl$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class PublishedEventImpl$

- java.lang.Object
- - scala.runtime.AbstractFunction6\<[PersistenceId](../PersistenceId.html "class in akka.persistence.typed"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option\<[ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")\>,​scala.Option\<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")\<[Done](../../../Done.html "class in akka")\>\>,​akka.persistence.typed.internal.PublishedEventImpl\>
	- - akka.persistence.typed.internal.PublishedEventImpl$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function6<[PersistenceId](../PersistenceId.html "class in akka.persistence.typed"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option<[ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")>,​scala.Option<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>>,​akka.persistence.typed.internal.PublishedEventImpl>`

---

```
public class PublishedEventImpl$
extends scala.runtime.AbstractFunction6<[PersistenceId](../PersistenceId.html "class in akka.persistence.typed"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option<[ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")>,​scala.Option<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>>,​akka.persistence.typed.internal.PublishedEventImpl>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.PublishedEventImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PublishedEventImpl$](PublishedEventImpl$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PublishedEventImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.typed.internal.PublishedEventImpl` | `[apply](#apply(akka.persistence.typed.PersistenceId,long,java.lang.Object,long,scala.Option,scala.Option))​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,  long sequenceNumber,  java.lang.Object payload,  long timestamp,  scala.Option<[ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")> replicatedMetaData,  scala.Option<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>> replyTo)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple6<[PersistenceId](../PersistenceId.html "class in akka.persistence.typed"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option<[ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")>,​scala.Option<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>>>>` | `[unapply](#unapply(akka.persistence.typed.internal.PublishedEventImpl))​(akka.persistence.typed.internal.PublishedEventImpl x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction6
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function6
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PublishedEventImpl$](PublishedEventImpl$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PublishedEventImpl$
		
		
		
		```
		public PublishedEventImpl$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function6<[PersistenceId](../PersistenceId.html "class in akka.persistence.typed"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option<[ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")>,​scala.Option<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>>,​akka.persistence.typed.internal.PublishedEventImpl>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction6<[PersistenceId](../PersistenceId.html "class in akka.persistence.typed"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option<[ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")>,​scala.Option<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>>,​akka.persistence.typed.internal.PublishedEventImpl>`
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.PublishedEventImpl apply​([PersistenceId](../PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                                                                long sequenceNumber,
		                                                                java.lang.Object payload,
		                                                                long timestamp,
		                                                                scala.Option<[ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")> replicatedMetaData,
		                                                                scala.Option<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>> replyTo)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple6<[PersistenceId](../PersistenceId.html "class in akka.persistence.typed"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option<[ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal")>,​scala.Option<[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Done](../../../Done.html "class in akka")>>>> unapply​(akka.persistence.typed.internal.PublishedEventImpl x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/PublishedEventImpl$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/ReplicatedPublishedEventMetaData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/PublishedEventImpl$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/PublishedEventImpl$.html)*