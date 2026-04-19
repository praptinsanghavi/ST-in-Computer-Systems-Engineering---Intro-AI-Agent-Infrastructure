---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplicatedEvent$.html
title: ReplicatedEvent$
---

# ReplicatedEvent$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class ReplicatedEvent$

- java.lang.Object
- - akka.persistence.typed.internal.ReplicatedEvent$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ReplicatedEvent$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.ReplicatedEvent$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicatedEvent$](ReplicatedEvent$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedEvent$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<E> akka.persistence.typed.internal.ReplicatedEvent<E>` | `[apply](#apply(E,scala.Option,akka.persistence.typed.ReplicaId,long,akka.persistence.typed.internal.VersionVector))​(E event,  scala.Option<java.lang.Object> metadata,  [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,  long originSequenceNr,  akka.persistence.typed.internal.VersionVector originVersion)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<E> scala.Option<scala.Tuple5<E,​scala.Option<java.lang.Object>,​[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.Object,​akka.persistence.typed.internal.VersionVector>>` | `[unapply](#unapply(akka.persistence.typed.internal.ReplicatedEvent))​(akka.persistence.typed.internal.ReplicatedEvent<E> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicatedEvent$](ReplicatedEvent$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicatedEvent$
		
		
		
		```
		public ReplicatedEvent$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <E> akka.persistence.typed.internal.ReplicatedEvent<E> apply​(E event,
		                                                                    scala.Option<java.lang.Object> metadata,
		                                                                    [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica,
		                                                                    long originSequenceNr,
		                                                                    akka.persistence.typed.internal.VersionVector originVersion)
		```
		- #### unapply
		
		
		
		```
		public <E> scala.Option<scala.Tuple5<E,​scala.Option<java.lang.Object>,​[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.Object,​akka.persistence.typed.internal.VersionVector>> unapply​(akka.persistence.typed.internal.ReplicatedEvent<E> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplicatedEvent$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplicatedEvent$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplicatedEvent$.html)*