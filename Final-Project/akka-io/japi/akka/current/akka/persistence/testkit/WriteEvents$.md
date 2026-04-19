---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/WriteEvents$.html
title: WriteEvents$
---

# WriteEvents$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class WriteEvents$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<java.lang.Object\>,​[WriteEvents](WriteEvents.html "class in akka.persistence.testkit")\>
	- - akka.persistence.testkit.WriteEvents$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.collection.immutable.Seq<java.lang.Object>,​[WriteEvents](WriteEvents.html "class in akka.persistence.testkit")>`

---

```
public class WriteEvents$
extends scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<java.lang.Object>,​[WriteEvents](WriteEvents.html "class in akka.persistence.testkit")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.WriteEvents$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WriteEvents$](WriteEvents$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WriteEvents$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WriteEvents](WriteEvents.html "class in akka.persistence.testkit")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> batch)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.collection.immutable.Seq<java.lang.Object>>` | `[unapply](#unapply(akka.persistence.testkit.WriteEvents))​([WriteEvents](WriteEvents.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WriteEvents$](WriteEvents$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WriteEvents$
		
		
		
		```
		public WriteEvents$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.collection.immutable.Seq<java.lang.Object>,​[WriteEvents](WriteEvents.html "class in akka.persistence.testkit")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<java.lang.Object>,​[WriteEvents](WriteEvents.html "class in akka.persistence.testkit")>`
		- #### apply
		
		
		
		```
		public [WriteEvents](WriteEvents.html "class in akka.persistence.testkit") apply​(scala.collection.immutable.Seq<java.lang.Object> batch)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.collection.immutable.Seq<java.lang.Object>,​[WriteEvents](WriteEvents.html "class in akka.persistence.testkit")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Seq<java.lang.Object>> unapply​([WriteEvents](WriteEvents.html "class in akka.persistence.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/WriteEvents$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/WriteEvents.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/WriteEvents$.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/WriteEvents$.html)*