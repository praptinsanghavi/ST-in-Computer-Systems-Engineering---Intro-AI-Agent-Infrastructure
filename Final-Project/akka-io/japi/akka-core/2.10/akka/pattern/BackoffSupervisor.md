---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:11:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffSupervisor.RestartCount$.html
title: BackoffSupervisor.RestartCount$
---

# BackoffSupervisor.RestartCount$

## Content

Package [akka.pattern](package-summary.html)
## Class BackoffSupervisor.RestartCount$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Object,​[BackoffSupervisor.RestartCount](BackoffSupervisor.RestartCount.html "class in akka.pattern")\>
	- - akka.pattern.BackoffSupervisor.RestartCount$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Object,​[BackoffSupervisor.RestartCount](BackoffSupervisor.RestartCount.html "class in akka.pattern")>`

Enclosing class:
[BackoffSupervisor](BackoffSupervisor.html "class in akka.pattern")

---

```
public static class BackoffSupervisor.RestartCount$
extends scala.runtime.AbstractFunction1<java.lang.Object,​[BackoffSupervisor.RestartCount](BackoffSupervisor.RestartCount.html "class in akka.pattern")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.BackoffSupervisor.RestartCount$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BackoffSupervisor.RestartCount$](BackoffSupervisor.RestartCount$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartCount$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BackoffSupervisor.RestartCount](BackoffSupervisor.RestartCount.html "class in akka.pattern")` | `[apply](#apply(int))​(int count)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.pattern.BackoffSupervisor.RestartCount))​([BackoffSupervisor.RestartCount](BackoffSupervisor.RestartCount.html "class in akka.pattern") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BackoffSupervisor.RestartCount$](BackoffSupervisor.RestartCount$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RestartCount$
		
		
		
		```
		public RestartCount$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​[BackoffSupervisor.RestartCount](BackoffSupervisor.RestartCount.html "class in akka.pattern")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Object,​[BackoffSupervisor.RestartCount](BackoffSupervisor.RestartCount.html "class in akka.pattern")>`
		- #### apply
		
		
		
		```
		public [BackoffSupervisor.RestartCount](BackoffSupervisor.RestartCount.html "class in akka.pattern") apply​(int count)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​([BackoffSupervisor.RestartCount](BackoffSupervisor.RestartCount.html "class in akka.pattern") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffSupervisor.RestartCount$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffSupervisor.RestartCount.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffSupervisor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffSupervisor.RestartCount$.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffSupervisor.RestartCount$.html)*