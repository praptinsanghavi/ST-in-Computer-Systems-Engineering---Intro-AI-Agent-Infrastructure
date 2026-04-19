---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:15:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Throttle$.html
title: Throttle$
---

# Throttle$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class Throttle$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.Throttle\>
	- - akka.remote.testconductor.Throttle$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.Throttle>`

---

```
public class Throttle$
extends scala.runtime.AbstractFunction4<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.Throttle>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testconductor.Throttle$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Throttle$](Throttle$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Throttle$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.testconductor.Throttle` | `[apply](#apply(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName,akka.remote.testkit.Direction,float))​([RoleName](RoleName.html "class in akka.remote.testconductor") node,  [RoleName](RoleName.html "class in akka.remote.testconductor") target,  [Direction](../testkit/Direction.html "interface in akka.remote.testkit") direction,  float rateMBit)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object>>` | `[unapply](#unapply(akka.remote.testconductor.Throttle))​(akka.remote.testconductor.Throttle x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function4
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Throttle$](Throttle$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Throttle$
		
		
		
		```
		public Throttle$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.Throttle>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.Throttle>`
		- #### apply
		
		
		
		```
		public akka.remote.testconductor.Throttle apply​([RoleName](RoleName.html "class in akka.remote.testconductor") node,
		                                                [RoleName](RoleName.html "class in akka.remote.testconductor") target,
		                                                [Direction](../testkit/Direction.html "interface in akka.remote.testkit") direction,
		                                                float rateMBit)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object>> unapply​(akka.remote.testconductor.Throttle x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Throttle$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Direction.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Throttle$.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Throttle$.html)*