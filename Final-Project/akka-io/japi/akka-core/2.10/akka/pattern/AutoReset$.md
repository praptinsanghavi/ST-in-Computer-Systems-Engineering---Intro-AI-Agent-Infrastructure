---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AutoReset$.html
title: AutoReset$
---

# AutoReset$

## Content

Package [akka.pattern](package-summary.html)
## Class AutoReset$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​akka.pattern.AutoReset\>
	- - akka.pattern.AutoReset$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.concurrent.duration.FiniteDuration,​akka.pattern.AutoReset>`

---

```
public class AutoReset$
extends scala.runtime.AbstractFunction1<scala.concurrent.duration.FiniteDuration,​akka.pattern.AutoReset>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.AutoReset$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AutoReset$](AutoReset$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AutoReset$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.pattern.AutoReset` | `[apply](#apply(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration resetBackoff)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.concurrent.duration.FiniteDuration>` | `[unapply](#unapply(akka.pattern.AutoReset))​(akka.pattern.AutoReset x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AutoReset$](AutoReset$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AutoReset$
		
		
		
		```
		public AutoReset$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.concurrent.duration.FiniteDuration,​akka.pattern.AutoReset>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.concurrent.duration.FiniteDuration,​akka.pattern.AutoReset>`
		- #### apply
		
		
		
		```
		public akka.pattern.AutoReset apply​(scala.concurrent.duration.FiniteDuration resetBackoff)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.concurrent.duration.FiniteDuration,​akka.pattern.AutoReset>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.concurrent.duration.FiniteDuration> unapply​(akka.pattern.AutoReset x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AutoReset$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AutoReset$.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AutoReset$.html)*