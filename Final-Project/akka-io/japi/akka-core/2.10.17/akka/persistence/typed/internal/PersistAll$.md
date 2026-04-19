---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:49:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/PersistAll$.html
title: PersistAll$
---

# PersistAll$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class PersistAll$

- java.lang.Object
- - akka.persistence.typed.internal.PersistAll$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class PersistAll$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.PersistAll$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistAll$](PersistAll$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistAll$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Event,​State>akka.persistence.typed.internal.PersistAll<Event,​State>` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>> eventsWithMetadata)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<Event,​State>scala.Option<scala.collection.immutable.Seq<[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>>>` | `[unapply](#unapply(akka.persistence.typed.internal.PersistAll))​(akka.persistence.typed.internal.PersistAll<Event,​State> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistAll$](PersistAll$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistAll$
		
		
		
		```
		public PersistAll$()
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
		public <Event,​State> akka.persistence.typed.internal.PersistAll<Event,​State> apply​(scala.collection.immutable.Seq<[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>> eventsWithMetadata)
		```
		- #### unapply
		
		
		
		```
		public <Event,​State> scala.Option<scala.collection.immutable.Seq<[EventWithMetadata](../scaladsl/EventWithMetadata.html "class in akka.persistence.typed.scaladsl")<Event>>> unapply​(akka.persistence.typed.internal.PersistAll<Event,​State> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/PersistAll$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventWithMetadata.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/PersistAll$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/PersistAll$.html)*