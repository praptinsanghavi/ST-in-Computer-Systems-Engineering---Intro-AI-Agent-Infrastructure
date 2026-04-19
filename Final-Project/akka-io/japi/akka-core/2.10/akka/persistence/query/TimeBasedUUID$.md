---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/TimeBasedUUID$.html
title: TimeBasedUUID$
---

# TimeBasedUUID$

## Content

Package [akka.persistence.query](package-summary.html)
## Class TimeBasedUUID$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.util.UUID,​[TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query")\>
	- - akka.persistence.query.TimeBasedUUID$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.util.UUID,​[TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query")>`

---

```
public class TimeBasedUUID$
extends scala.runtime.AbstractFunction1<java.util.UUID,​[TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.query.TimeBasedUUID$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TimeBasedUUID$](TimeBasedUUID$.html "class in akka.persistence.query")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TimeBasedUUID$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query")` | `[apply](#apply(java.util.UUID))​(java.util.UUID value)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.util.UUID>` | `[unapply](#unapply(akka.persistence.query.TimeBasedUUID))​([TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TimeBasedUUID$](TimeBasedUUID$.html "class in akka.persistence.query") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TimeBasedUUID$
		
		
		
		```
		public TimeBasedUUID$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.util.UUID,​[TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.util.UUID,​[TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query")>`
		- #### apply
		
		
		
		```
		public [TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query") apply​(java.util.UUID value)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.util.UUID,​[TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query")>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.util.UUID> unapply​([TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/TimeBasedUUID$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/TimeBasedUUID.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/TimeBasedUUID$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/TimeBasedUUID$.html)*