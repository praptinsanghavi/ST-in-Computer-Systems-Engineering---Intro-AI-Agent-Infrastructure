---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Leave$.html
title: Leave$
---

# Leave$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class Leave$

- java.lang.Object
- - akka.cluster.typed.Leave$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Leave$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.Leave$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Leave$](Leave$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Leave$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Leave](Leave.html "class in akka.cluster.typed")` | `[apply](#apply(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `[Leave](Leave.html "class in akka.cluster.typed")` | `[create](#create(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` | Java API |
	| `scala.Option<[Address](../../actor/Address.html "class in akka.actor")>` | `[unapply](#unapply(akka.cluster.typed.Leave))​([Leave](Leave.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Leave$](Leave$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Leave$
		
		
		
		```
		public Leave$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [Leave](Leave.html "class in akka.cluster.typed") create​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public [Leave](Leave.html "class in akka.cluster.typed") apply​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<[Address](../../actor/Address.html "class in akka.actor")> unapply​([Leave](Leave.html "class in akka.cluster.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Leave$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Leave.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Leave$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Leave$.html)*