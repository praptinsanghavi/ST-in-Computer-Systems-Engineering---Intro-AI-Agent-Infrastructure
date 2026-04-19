---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:11:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.Internal$.Delivery$.html
title: AtLeastOnceDelivery.Internal$.Delivery$
---

# AtLeastOnceDelivery.Internal$.Delivery$

## Content

Package [akka.persistence](package-summary.html)
## Class AtLeastOnceDelivery.Internal$.Delivery$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<[ActorPath](../actor/ActorPath.html "interface in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.AtLeastOnceDelivery.Internal.Delivery\>
	- - akka.persistence.AtLeastOnceDelivery.Internal$.Delivery$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<[ActorPath](../actor/ActorPath.html "interface in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.AtLeastOnceDelivery.Internal.Delivery>`

Enclosing class:
[AtLeastOnceDelivery.Internal$](AtLeastOnceDelivery.Internal$.html "class in akka.persistence")

---

```
public class AtLeastOnceDelivery.Internal$.Delivery$
extends scala.runtime.AbstractFunction4<[ActorPath](../actor/ActorPath.html "interface in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.AtLeastOnceDelivery.Internal.Delivery>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.AtLeastOnceDelivery.Internal$.Delivery$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AtLeastOnceDelivery.Internal$.Delivery$](AtLeastOnceDelivery.Internal$.Delivery$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Delivery$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.AtLeastOnceDelivery.Internal.Delivery` | `[apply](#apply(akka.actor.ActorPath,java.lang.Object,long,int))​([ActorPath](../actor/ActorPath.html "interface in akka.actor") destination,  java.lang.Object message,  long timestamp,  int attempt)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<[ActorPath](../actor/ActorPath.html "interface in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.AtLeastOnceDelivery.Internal.Delivery))​(akka.persistence.AtLeastOnceDelivery.Internal.Delivery x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function4
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AtLeastOnceDelivery.Internal$.Delivery$](AtLeastOnceDelivery.Internal$.Delivery$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Delivery$
		
		
		
		```
		public Delivery$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<[ActorPath](../actor/ActorPath.html "interface in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.AtLeastOnceDelivery.Internal.Delivery>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<[ActorPath](../actor/ActorPath.html "interface in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.persistence.AtLeastOnceDelivery.Internal.Delivery>`
		- #### apply
		
		
		
		```
		public akka.persistence.AtLeastOnceDelivery.Internal.Delivery apply​([ActorPath](../actor/ActorPath.html "interface in akka.actor") destination,
		                                                                    java.lang.Object message,
		                                                                    long timestamp,
		                                                                    int attempt)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<[ActorPath](../actor/ActorPath.html "interface in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​(akka.persistence.AtLeastOnceDelivery.Internal.Delivery x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.Internal$.Delivery$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.Internal$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.Internal$.Delivery$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.Internal$.Delivery$.html)*