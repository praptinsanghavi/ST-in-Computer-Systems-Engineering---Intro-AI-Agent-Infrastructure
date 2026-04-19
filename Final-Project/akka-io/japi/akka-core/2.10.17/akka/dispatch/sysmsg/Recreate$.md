---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/Recreate$.html
title: Recreate$
---

# Recreate$

## Content

Package [akka.dispatch.sysmsg](package-summary.html)
## Class Recreate$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Throwable,​akka.dispatch.sysmsg.Recreate\>
	- - akka.dispatch.sysmsg.Recreate$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Throwable,​akka.dispatch.sysmsg.Recreate>`

---

```
public class Recreate$
extends scala.runtime.AbstractFunction1<java.lang.Throwable,​akka.dispatch.sysmsg.Recreate>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.dispatch.sysmsg.Recreate$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Recreate$](Recreate$.html "class in akka.dispatch.sysmsg")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Recreate$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.dispatch.sysmsg.Recreate` | `[apply](#apply(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Throwable>` | `[unapply](#unapply(akka.dispatch.sysmsg.Recreate))​(akka.dispatch.sysmsg.Recreate x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Recreate$](Recreate$.html "class in akka.dispatch.sysmsg") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Recreate$
		
		
		
		```
		public Recreate$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Throwable,​akka.dispatch.sysmsg.Recreate>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Throwable,​akka.dispatch.sysmsg.Recreate>`
		- #### apply
		
		
		
		```
		public akka.dispatch.sysmsg.Recreate apply​(java.lang.Throwable cause)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.Throwable,​akka.dispatch.sysmsg.Recreate>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Throwable> unapply​(akka.dispatch.sysmsg.Recreate x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/Recreate$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/Recreate$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/Recreate$.html)*