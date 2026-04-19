---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/NoopWriteEventAdapter$.html
title: NoopWriteEventAdapter$
---

# NoopWriteEventAdapter$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class NoopWriteEventAdapter$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal"),​akka.persistence.journal.NoopWriteEventAdapter\>
	- - akka.persistence.journal.NoopWriteEventAdapter$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal"),​akka.persistence.journal.NoopWriteEventAdapter>`

---

```
public class NoopWriteEventAdapter$
extends scala.runtime.AbstractFunction1<[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal"),​akka.persistence.journal.NoopWriteEventAdapter>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.NoopWriteEventAdapter$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoopWriteEventAdapter$](NoopWriteEventAdapter$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoopWriteEventAdapter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.journal.NoopWriteEventAdapter` | `[apply](#apply(akka.persistence.journal.ReadEventAdapter))​([ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal") readEventAdapter)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal")>` | `[unapply](#unapply(akka.persistence.journal.NoopWriteEventAdapter))​(akka.persistence.journal.NoopWriteEventAdapter x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoopWriteEventAdapter$](NoopWriteEventAdapter$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoopWriteEventAdapter$
		
		
		
		```
		public NoopWriteEventAdapter$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal"),​akka.persistence.journal.NoopWriteEventAdapter>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal"),​akka.persistence.journal.NoopWriteEventAdapter>`
		- #### apply
		
		
		
		```
		public akka.persistence.journal.NoopWriteEventAdapter apply​([ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal") readEventAdapter)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal"),​akka.persistence.journal.NoopWriteEventAdapter>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal")> unapply​(akka.persistence.journal.NoopWriteEventAdapter x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/NoopWriteEventAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/ReadEventAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/NoopWriteEventAdapter$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/NoopWriteEventAdapter$.html)*