---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/ActorInitializationException$.html
title: ActorInitializationException$
---

# ActorInitializationException$

## Content

Package [akka.actor](package-summary.html)
## Class ActorInitializationException$

- java.lang.Object
- - akka.actor.ActorInitializationException$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ActorInitializationException$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorInitializationException$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorInitializationException$](ActorInitializationException$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorInitializationException$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<scala.Tuple3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Throwable>>` | `[unapply](#unapply(akka.actor.ActorInitializationException))​([ActorInitializationException](ActorInitializationException.html "class in akka.actor") ex)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorInitializationException$](ActorInitializationException$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorInitializationException$
		
		
		
		```
		public ActorInitializationException$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Throwable>> unapply​([ActorInitializationException](ActorInitializationException.html "class in akka.actor") ex)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorInitializationException$.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorInitializationException.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/ActorInitializationException$.html](https://doc.akka.io/japi/akka/current/akka/actor/ActorInitializationException$.html)*