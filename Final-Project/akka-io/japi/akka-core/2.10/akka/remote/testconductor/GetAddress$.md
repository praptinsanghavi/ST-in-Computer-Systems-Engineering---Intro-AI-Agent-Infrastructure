---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:15:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/GetAddress$.html
title: GetAddress$
---

# GetAddress$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class GetAddress$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[RoleName](RoleName.html "class in akka.remote.testconductor"),​akka.remote.testconductor.GetAddress\>
	- - akka.remote.testconductor.GetAddress$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[RoleName](RoleName.html "class in akka.remote.testconductor"),​akka.remote.testconductor.GetAddress>`

---

```
public class GetAddress$
extends scala.runtime.AbstractFunction1<[RoleName](RoleName.html "class in akka.remote.testconductor"),​akka.remote.testconductor.GetAddress>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testconductor.GetAddress$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GetAddress$](GetAddress$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetAddress$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.testconductor.GetAddress` | `[apply](#apply(akka.remote.testconductor.RoleName))​([RoleName](RoleName.html "class in akka.remote.testconductor") node)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[RoleName](RoleName.html "class in akka.remote.testconductor")>` | `[unapply](#unapply(akka.remote.testconductor.GetAddress))​(akka.remote.testconductor.GetAddress x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GetAddress$](GetAddress$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GetAddress$
		
		
		
		```
		public GetAddress$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[RoleName](RoleName.html "class in akka.remote.testconductor"),​akka.remote.testconductor.GetAddress>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[RoleName](RoleName.html "class in akka.remote.testconductor"),​akka.remote.testconductor.GetAddress>`
		- #### apply
		
		
		
		```
		public akka.remote.testconductor.GetAddress apply​([RoleName](RoleName.html "class in akka.remote.testconductor") node)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[RoleName](RoleName.html "class in akka.remote.testconductor"),​akka.remote.testconductor.GetAddress>`
		- #### unapply
		
		
		
		```
		public scala.Option<[RoleName](RoleName.html "class in akka.remote.testconductor")> unapply​(akka.remote.testconductor.GetAddress x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/GetAddress$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/GetAddress$.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/GetAddress$.html)*