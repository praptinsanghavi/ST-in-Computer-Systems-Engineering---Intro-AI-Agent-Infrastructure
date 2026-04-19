---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/testkit/scaladsl/TestEntityRef$.html
title: TestEntityRef$
---

# TestEntityRef$

## Content

Package [akka.cluster.sharding.typed.testkit.scaladsl](package-summary.html)
## Class TestEntityRef$

- java.lang.Object
- - akka.cluster.sharding.typed.testkit.scaladsl.TestEntityRef$

- ---

```
public class TestEntityRef$
extends java.lang.Object
```

For testing purposes this `EntityRef` can be used in place of a real `EntityRef`.
 It forwards all messages to the `probe`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestEntityRef$](TestEntityRef$.html "class in akka.cluster.sharding.typed.testkit.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestEntityRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<M> [EntityRef](../../scaladsl/EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl")<M>` | `[apply](#apply(akka.cluster.sharding.typed.scaladsl.EntityTypeKey,java.lang.String,akka.actor.typed.ActorRef))​([EntityTypeKey](../../scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<M> typeKey,  java.lang.String entityId,  [ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<M> probe)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestEntityRef$](TestEntityRef$.html "class in akka.cluster.sharding.typed.testkit.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestEntityRef$
		
		
		
		```
		public TestEntityRef$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <M> [EntityRef](../../scaladsl/EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl")<M> apply​([EntityTypeKey](../../scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<M> typeKey,
		                              java.lang.String entityId,
		                              [ActorRef](../../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<M> probe)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/testkit/scaladsl/TestEntityRef$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/testkit/scaladsl/TestEntityRef$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/testkit/scaladsl/TestEntityRef$.html)*