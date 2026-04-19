---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/PersistentImpl$.html
title: PersistentImpl$
---

# PersistentImpl$

## Content

Package [akka.persistence](package-summary.html)
## Class PersistentImpl$

- java.lang.Object
- - scala.runtime.AbstractFunction9\<java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.String,​java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​scala.Option\<java.lang.Object\>,​akka.persistence.PersistentImpl\>
	- - akka.persistence.PersistentImpl$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function9<java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.String,​java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​scala.Option<java.lang.Object>,​akka.persistence.PersistentImpl>`

---

```
public class PersistentImpl$
extends scala.runtime.AbstractFunction9<java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.String,​java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​scala.Option<java.lang.Object>,​akka.persistence.PersistentImpl>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.PersistentImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistentImpl$](PersistentImpl$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistentImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.PersistentImpl` | `[apply](#apply(java.lang.Object,long,java.lang.String,java.lang.String,boolean,akka.actor.ActorRef,java.lang.String,long,scala.Option))​(java.lang.Object payload,  long sequenceNr,  java.lang.String persistenceId,  java.lang.String manifest,  boolean deleted,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,  java.lang.String writerUuid,  long timestamp,  scala.Option<java.lang.Object> metadata)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple9<java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.String,​java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​scala.Option<java.lang.Object>>>` | `[unapply](#unapply(akka.persistence.PersistentImpl))​(akka.persistence.PersistentImpl x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction9
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function9
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistentImpl$](PersistentImpl$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistentImpl$
		
		
		
		```
		public PersistentImpl$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function9<java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.String,​java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​scala.Option<java.lang.Object>,​akka.persistence.PersistentImpl>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction9<java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.String,​java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​scala.Option<java.lang.Object>,​akka.persistence.PersistentImpl>`
		- #### apply
		
		
		
		```
		public akka.persistence.PersistentImpl apply​(java.lang.Object payload,
		                                             long sequenceNr,
		                                             java.lang.String persistenceId,
		                                             java.lang.String manifest,
		                                             boolean deleted,
		                                             [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,
		                                             java.lang.String writerUuid,
		                                             long timestamp,
		                                             scala.Option<java.lang.Object> metadata)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple9<java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.String,​java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​scala.Option<java.lang.Object>>> unapply​(akka.persistence.PersistentImpl x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentImpl$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/PersistentImpl$.html](https://doc.akka.io/japi/akka/current/akka/persistence/PersistentImpl$.html)*