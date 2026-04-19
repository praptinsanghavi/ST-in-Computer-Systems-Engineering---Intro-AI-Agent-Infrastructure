---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/Join$.html
title: Join$
---

# Join$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class Join$

- java.lang.Object
- - akka.cluster.typed.Join$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Join$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.Join$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Join$](Join$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Join$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Join](Join.html "class in akka.cluster.typed")` | `[apply](#apply(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `[Join](Join.html "class in akka.cluster.typed")` | `[create](#create(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` | Java API |
	| `scala.Option<[Address](../../actor/Address.html "class in akka.actor")>` | `[unapply](#unapply(akka.cluster.typed.Join))​([Join](Join.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Join$](Join$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Join$
		
		
		
		```
		public Join$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [Join](Join.html "class in akka.cluster.typed") create​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public [Join](Join.html "class in akka.cluster.typed") apply​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<[Address](../../actor/Address.html "class in akka.actor")> unapply​([Join](Join.html "class in akka.cluster.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/Join$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/Join.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/Join$.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/Join$.html)*