---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:37:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testconductor/ThrottleMsg$.html
title: ThrottleMsg$
---

# ThrottleMsg$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class ThrottleMsg$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.ThrottleMsg\>
	- - akka.remote.testconductor.ThrottleMsg$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.ThrottleMsg>`

---

```
public class ThrottleMsg$
extends scala.runtime.AbstractFunction3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.ThrottleMsg>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testconductor.ThrottleMsg$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ThrottleMsg$](ThrottleMsg$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThrottleMsg$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.testconductor.ThrottleMsg` | `[apply](#apply(akka.actor.Address,akka.remote.testkit.Direction,float))​([Address](../../actor/Address.html "class in akka.actor") target,  [Direction](../testkit/Direction.html "interface in akka.remote.testkit") direction,  float rateMBit)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object>>` | `[unapply](#unapply(akka.remote.testconductor.ThrottleMsg))​(akka.remote.testconductor.ThrottleMsg x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ThrottleMsg$](ThrottleMsg$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ThrottleMsg$
		
		
		
		```
		public ThrottleMsg$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.ThrottleMsg>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object,​akka.remote.testconductor.ThrottleMsg>`
		- #### apply
		
		
		
		```
		public akka.remote.testconductor.ThrottleMsg apply​([Address](../../actor/Address.html "class in akka.actor") target,
		                                                   [Direction](../testkit/Direction.html "interface in akka.remote.testkit") direction,
		                                                   float rateMBit)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​[Direction](../testkit/Direction.html "interface in akka.remote.testkit"),​java.lang.Object>> unapply​(akka.remote.testconductor.ThrottleMsg x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/ThrottleMsg$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/Direction.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testconductor/ThrottleMsg$.html](https://doc.akka.io/japi/akka/current/akka/remote/testconductor/ThrottleMsg$.html)*