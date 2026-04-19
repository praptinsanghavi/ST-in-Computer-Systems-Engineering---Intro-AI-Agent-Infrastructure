---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:46:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Terminated$.html
title: Terminated$
---

# Terminated$

## Content

Package [akka.actor](package-summary.html)
## Class Terminated$

- java.lang.Object
- - akka.actor.Terminated$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Terminated$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Terminated$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Terminated$](Terminated$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Terminated$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Terminated](Terminated.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef,boolean,boolean))​([ActorRef](ActorRef.html "class in akka.actor") actor,  boolean existenceConfirmed,  boolean addressTerminated)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.actor.Terminated))​([Terminated](Terminated.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Terminated$](Terminated$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Terminated$
		
		
		
		```
		public Terminated$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public [Terminated](Terminated.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") actor,
		                        boolean existenceConfirmed,
		                        boolean addressTerminated)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> unapply​([Terminated](Terminated.html "class in akka.actor") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Terminated$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Terminated$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Terminated$.html)*