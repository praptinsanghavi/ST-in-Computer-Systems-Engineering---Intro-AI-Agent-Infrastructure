---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/ReplyWith$.html
title: ReplyWith$
---

# ReplyWith$

## Content

Package [akka.pattern](package-summary.html)
## Class ReplyWith$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Object,​akka.pattern.ReplyWith\>
	- - akka.pattern.ReplyWith$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Object,​akka.pattern.ReplyWith>`

---

```
public class ReplyWith$
extends scala.runtime.AbstractFunction1<java.lang.Object,​akka.pattern.ReplyWith>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.ReplyWith$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplyWith$](ReplyWith$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplyWith$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.pattern.ReplyWith` | `[apply](#apply(java.lang.Object))​(java.lang.Object msg)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.pattern.ReplyWith))​(akka.pattern.ReplyWith x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplyWith$](ReplyWith$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplyWith$
		
		
		
		```
		public ReplyWith$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​akka.pattern.ReplyWith>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Object,​akka.pattern.ReplyWith>`
		- #### apply
		
		
		
		```
		public akka.pattern.ReplyWith apply​(java.lang.Object msg)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.Object,​akka.pattern.ReplyWith>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​(akka.pattern.ReplyWith x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/pattern/ReplyWith$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/ReplyWith$.html](https://doc.akka.io/japi/akka/current/akka/pattern/ReplyWith$.html)*