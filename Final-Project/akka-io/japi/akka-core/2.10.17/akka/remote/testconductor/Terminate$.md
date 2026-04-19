---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:52:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/Terminate$.html
title: Terminate$
---

# Terminate$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class Terminate$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[RoleName](RoleName.html "class in akka.remote.testconductor"),​scala.util.Either\<java.lang.Object,​java.lang.Object\>,​akka.remote.testconductor.Terminate\>
	- - akka.remote.testconductor.Terminate$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​scala.util.Either<java.lang.Object,​java.lang.Object>,​akka.remote.testconductor.Terminate>`

---

```
public class Terminate$
extends scala.runtime.AbstractFunction2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​scala.util.Either<java.lang.Object,​java.lang.Object>,​akka.remote.testconductor.Terminate>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testconductor.Terminate$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Terminate$](Terminate$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Terminate$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.testconductor.Terminate` | `[apply](#apply(akka.remote.testconductor.RoleName,scala.util.Either))​([RoleName](RoleName.html "class in akka.remote.testconductor") node,  scala.util.Either<java.lang.Object,​java.lang.Object> shutdownOrExit)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​scala.util.Either<java.lang.Object,​java.lang.Object>>>` | `[unapply](#unapply(akka.remote.testconductor.Terminate))​(akka.remote.testconductor.Terminate x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Terminate$](Terminate$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Terminate$
		
		
		
		```
		public Terminate$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​scala.util.Either<java.lang.Object,​java.lang.Object>,​akka.remote.testconductor.Terminate>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​scala.util.Either<java.lang.Object,​java.lang.Object>,​akka.remote.testconductor.Terminate>`
		- #### apply
		
		
		
		```
		public akka.remote.testconductor.Terminate apply​([RoleName](RoleName.html "class in akka.remote.testconductor") node,
		                                                 scala.util.Either<java.lang.Object,​java.lang.Object> shutdownOrExit)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​scala.util.Either<java.lang.Object,​java.lang.Object>,​akka.remote.testconductor.Terminate>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​scala.util.Either<java.lang.Object,​java.lang.Object>>> unapply​(akka.remote.testconductor.Terminate x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/Terminate$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/Terminate$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/Terminate$.html)*