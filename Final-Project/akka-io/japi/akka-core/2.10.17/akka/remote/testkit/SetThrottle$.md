---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/SetThrottle$.html
title: SetThrottle$
---

# SetThrottle$

## Content

Package [akka.remote.testkit](package-summary.html)
## Class SetThrottle$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](Direction.html "interface in akka.remote.testkit"),​[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​[SetThrottle](SetThrottle.html "class in akka.remote.testkit")\>
	- - akka.remote.testkit.SetThrottle$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](Direction.html "interface in akka.remote.testkit"),​[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​[SetThrottle](SetThrottle.html "class in akka.remote.testkit")>`

---

```
public class SetThrottle$
extends scala.runtime.AbstractFunction3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](Direction.html "interface in akka.remote.testkit"),​[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​[SetThrottle](SetThrottle.html "class in akka.remote.testkit")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testkit.SetThrottle$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SetThrottle$](SetThrottle$.html "class in akka.remote.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SetThrottle$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SetThrottle](SetThrottle.html "class in akka.remote.testkit")` | `[apply](#apply(akka.actor.Address,akka.remote.testkit.Direction,akka.remote.testkit.ThrottleMode))​([Address](../../actor/Address.html "class in akka.actor") address,  [Direction](Direction.html "interface in akka.remote.testkit") direction,  [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") mode)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](Direction.html "interface in akka.remote.testkit"),​[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")>>` | `[unapply](#unapply(akka.remote.testkit.SetThrottle))​([SetThrottle](SetThrottle.html "class in akka.remote.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SetThrottle$](SetThrottle$.html "class in akka.remote.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SetThrottle$
		
		
		
		```
		public SetThrottle$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](Direction.html "interface in akka.remote.testkit"),​[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​[SetThrottle](SetThrottle.html "class in akka.remote.testkit")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](Direction.html "interface in akka.remote.testkit"),​[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​[SetThrottle](SetThrottle.html "class in akka.remote.testkit")>`
		- #### apply
		
		
		
		```
		public [SetThrottle](SetThrottle.html "class in akka.remote.testkit") apply​([Address](../../actor/Address.html "class in akka.actor") address,
		                         [Direction](Direction.html "interface in akka.remote.testkit") direction,
		                         [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") mode)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](Direction.html "interface in akka.remote.testkit"),​[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​[SetThrottle](SetThrottle.html "class in akka.remote.testkit")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](Direction.html "interface in akka.remote.testkit"),​[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")>> unapply​([SetThrottle](SetThrottle.html "class in akka.remote.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/Direction.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/SetThrottle$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/SetThrottle.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/SetThrottle$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/SetThrottle$.html)*