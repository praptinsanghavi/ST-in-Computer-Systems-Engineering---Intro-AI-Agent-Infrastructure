---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/Persist$.html
title: Persist$
---

# Persist$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class Persist$

- java.lang.Object
- - akka.persistence.typed.internal.Persist$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Persist$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.Persist$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Persist$](Persist$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Persist$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Event,​State>akka.persistence.typed.internal.Persist<Event,​State>` | `[apply](#apply(Event,scala.collection.immutable.Seq))​(Event event,  scala.collection.immutable.Seq<java.lang.Object> metadataEntries)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<Event,​State>scala.Option<scala.Tuple2<Event,​scala.collection.immutable.Seq<java.lang.Object>>>` | `[unapply](#unapply(akka.persistence.typed.internal.Persist))​(akka.persistence.typed.internal.Persist<Event,​State> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Persist$](Persist$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Persist$
		
		
		
		```
		public Persist$()
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
		public <Event,​State> akka.persistence.typed.internal.Persist<Event,​State> apply​(Event event,
		                                                                                            scala.collection.immutable.Seq<java.lang.Object> metadataEntries)
		```
		- #### unapply
		
		
		
		```
		public <Event,​State> scala.Option<scala.Tuple2<Event,​scala.collection.immutable.Seq<java.lang.Object>>> unapply​(akka.persistence.typed.internal.Persist<Event,​State> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/Persist$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/Persist$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/Persist$.html)*