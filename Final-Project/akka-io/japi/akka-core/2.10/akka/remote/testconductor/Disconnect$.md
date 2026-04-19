---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:15:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Disconnect$.html
title: Disconnect$
---

# Disconnect$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class Disconnect$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​java.lang.Object,​akka.remote.testconductor.Disconnect\>
	- - akka.remote.testconductor.Disconnect$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​java.lang.Object,​akka.remote.testconductor.Disconnect>`

---

```
public class Disconnect$
extends scala.runtime.AbstractFunction3<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​java.lang.Object,​akka.remote.testconductor.Disconnect>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testconductor.Disconnect$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Disconnect$](Disconnect$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Disconnect$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.testconductor.Disconnect` | `[apply](#apply(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName,boolean))​([RoleName](RoleName.html "class in akka.remote.testconductor") node,  [RoleName](RoleName.html "class in akka.remote.testconductor") target,  boolean abort)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​java.lang.Object>>` | `[unapply](#unapply(akka.remote.testconductor.Disconnect))​(akka.remote.testconductor.Disconnect x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Disconnect$](Disconnect$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Disconnect$
		
		
		
		```
		public Disconnect$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​java.lang.Object,​akka.remote.testconductor.Disconnect>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​java.lang.Object,​akka.remote.testconductor.Disconnect>`
		- #### apply
		
		
		
		```
		public akka.remote.testconductor.Disconnect apply​([RoleName](RoleName.html "class in akka.remote.testconductor") node,
		                                                  [RoleName](RoleName.html "class in akka.remote.testconductor") target,
		                                                  boolean abort)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​java.lang.Object>> unapply​(akka.remote.testconductor.Disconnect x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Disconnect$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Disconnect$.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Disconnect$.html)*