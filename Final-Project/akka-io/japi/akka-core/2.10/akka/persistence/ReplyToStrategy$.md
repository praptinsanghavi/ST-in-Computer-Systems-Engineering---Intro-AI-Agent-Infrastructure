---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:11:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ReplyToStrategy$.html
title: ReplyToStrategy$
---

# ReplyToStrategy$

## Content

Package [akka.persistence](package-summary.html)
## Class ReplyToStrategy$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Object,​[ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence")\>
	- - akka.persistence.ReplyToStrategy$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Object,​[ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence")>`

---

```
public class ReplyToStrategy$
extends scala.runtime.AbstractFunction1<java.lang.Object,​[ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.ReplyToStrategy$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplyToStrategy$](ReplyToStrategy$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplyToStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence")` | `[apply](#apply(java.lang.Object))​(java.lang.Object response)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.persistence.ReplyToStrategy))​([ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplyToStrategy$](ReplyToStrategy$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplyToStrategy$
		
		
		
		```
		public ReplyToStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​[ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Object,​[ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence")>`
		- #### apply
		
		
		
		```
		public [ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence") apply​(java.lang.Object response)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.Object,​[ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence")>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​([ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ReplyToStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ReplyToStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ReplyToStrategy$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ReplyToStrategy$.html)*