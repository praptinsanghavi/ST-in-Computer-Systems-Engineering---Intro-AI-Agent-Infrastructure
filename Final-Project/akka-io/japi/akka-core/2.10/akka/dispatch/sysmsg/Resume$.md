---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:08:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/Resume$.html
title: Resume$
---

# Resume$

## Content

Package [akka.dispatch.sysmsg](package-summary.html)
## Class Resume$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Throwable,​akka.dispatch.sysmsg.Resume\>
	- - akka.dispatch.sysmsg.Resume$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Throwable,​akka.dispatch.sysmsg.Resume>`

---

```
public class Resume$
extends scala.runtime.AbstractFunction1<java.lang.Throwable,​akka.dispatch.sysmsg.Resume>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.dispatch.sysmsg.Resume$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Resume$](Resume$.html "class in akka.dispatch.sysmsg")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Resume$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.dispatch.sysmsg.Resume` | `[apply](#apply(java.lang.Throwable))​(java.lang.Throwable causedByFailure)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Throwable>` | `[unapply](#unapply(akka.dispatch.sysmsg.Resume))​(akka.dispatch.sysmsg.Resume x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Resume$](Resume$.html "class in akka.dispatch.sysmsg") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Resume$
		
		
		
		```
		public Resume$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Throwable,​akka.dispatch.sysmsg.Resume>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Throwable,​akka.dispatch.sysmsg.Resume>`
		- #### apply
		
		
		
		```
		public akka.dispatch.sysmsg.Resume apply​(java.lang.Throwable causedByFailure)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.Throwable,​akka.dispatch.sysmsg.Resume>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Throwable> unapply​(akka.dispatch.sysmsg.Resume x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/Resume$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/Resume$.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/Resume$.html)*