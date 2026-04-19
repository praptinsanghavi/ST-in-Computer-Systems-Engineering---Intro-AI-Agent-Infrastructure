---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:57:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/SuppressedDeadLetter$.html
title: SuppressedDeadLetter$
---

# SuppressedDeadLetter$

## Content

Package [akka.actor](package-summary.html)
## Class SuppressedDeadLetter$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor")\>
	- - akka.actor.SuppressedDeadLetter$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor")>`

---

```
public class SuppressedDeadLetter$
extends scala.runtime.AbstractFunction3<[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.SuppressedDeadLetter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SuppressedDeadLetter$](SuppressedDeadLetter$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SuppressedDeadLetter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor")` | `[apply](#apply(akka.actor.DeadLetterSuppression,akka.actor.ActorRef,akka.actor.ActorRef))​([DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor") message,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>>` | `[unapply](#unapply(akka.actor.SuppressedDeadLetter))​([SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SuppressedDeadLetter$](SuppressedDeadLetter$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SuppressedDeadLetter$
		
		
		
		```
		public SuppressedDeadLetter$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor")>`
		- #### apply
		
		
		
		```
		public [SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor") apply​([DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor") message,
		                                  [ActorRef](ActorRef.html "class in akka.actor") sender,
		                                  [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>> unapply​([SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SuppressedDeadLetter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SuppressedDeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/SuppressedDeadLetter$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/SuppressedDeadLetter$.html)*