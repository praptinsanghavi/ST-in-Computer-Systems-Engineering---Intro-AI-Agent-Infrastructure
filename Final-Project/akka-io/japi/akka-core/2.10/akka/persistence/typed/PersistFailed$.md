---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistFailed$.html
title: PersistFailed$
---

# PersistFailed$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class PersistFailed$

- java.lang.Object
- - akka.persistence.typed.PersistFailed$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class PersistFailed$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.PersistFailed$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistFailed$](PersistFailed$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistFailed$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​Event>[PersistFailed](PersistFailed.html "class in akka.persistence.typed")<Command,​Event>` | `[apply](#apply(java.lang.Throwable,scala.Option))​(java.lang.Throwable failure,  scala.Option<Command> command)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<Command,​Event>scala.Option<scala.Tuple2<java.lang.Throwable,​scala.Option<Command>>>` | `[unapply](#unapply(akka.persistence.typed.PersistFailed))​([PersistFailed](PersistFailed.html "class in akka.persistence.typed")<Command,​Event> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistFailed$](PersistFailed$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistFailed$
		
		
		
		```
		public PersistFailed$()
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
		public <Command,​Event> [PersistFailed](PersistFailed.html "class in akka.persistence.typed")<Command,​Event> apply​(java.lang.Throwable failure,
		                                                                      scala.Option<Command> command)
		```
		- #### unapply
		
		
		
		```
		public <Command,​Event> scala.Option<scala.Tuple2<java.lang.Throwable,​scala.Option<Command>>> unapply​([PersistFailed](PersistFailed.html "class in akka.persistence.typed")<Command,​Event> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistFailed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistFailed$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistFailed$.html)*