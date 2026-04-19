---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:57:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/FunctionRef$.html
title: FunctionRef$
---

# FunctionRef$

## Content

Package [akka.actor](package-summary.html)
## Class FunctionRef$

- java.lang.Object
- - akka.actor.FunctionRef$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class FunctionRef$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.FunctionRef$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FunctionRef$](FunctionRef$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FunctionRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Function2<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Object,​scala.runtime.BoxedUnit>` | `[deadLetterMessageHandler](#deadLetterMessageHandler(akka.actor.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor") system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FunctionRef$](FunctionRef$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FunctionRef$
		
		
		
		```
		public FunctionRef$()
		```

	- ### Method Detail
	
	
	
		- #### deadLetterMessageHandler
		
		
		
		```
		public scala.Function2<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Object,​scala.runtime.BoxedUnit> deadLetterMessageHandler​([ActorSystem](ActorSystem.html "class in akka.actor") system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/FunctionRef$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/FunctionRef$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/FunctionRef$.html)*