---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:57:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter$.html
title: DeadLetter$
---

# DeadLetter$

## Content

Package [akka.actor](package-summary.html)
## Class DeadLetter$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.Object,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[DeadLetter](DeadLetter.html "class in akka.actor")\>
	- - akka.actor.DeadLetter$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.Object,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[DeadLetter](DeadLetter.html "class in akka.actor")>`

---

```
public class DeadLetter$
extends scala.runtime.AbstractFunction3<java.lang.Object,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[DeadLetter](DeadLetter.html "class in akka.actor")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.DeadLetter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DeadLetter$](DeadLetter$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeadLetter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DeadLetter](DeadLetter.html "class in akka.actor")` | `[apply](#apply(java.lang.Object,akka.actor.ActorRef,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](ActorRef.html "class in akka.actor") sender,  [ActorRef](ActorRef.html "class in akka.actor") recipient)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.Object,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>>` | `[unapply](#unapply(akka.actor.DeadLetter))​([DeadLetter](DeadLetter.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DeadLetter$](DeadLetter$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DeadLetter$
		
		
		
		```
		public DeadLetter$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<java.lang.Object,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[DeadLetter](DeadLetter.html "class in akka.actor")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<java.lang.Object,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[DeadLetter](DeadLetter.html "class in akka.actor")>`
		- #### apply
		
		
		
		```
		public [DeadLetter](DeadLetter.html "class in akka.actor") apply​(java.lang.Object message,
		                        [ActorRef](ActorRef.html "class in akka.actor") sender,
		                        [ActorRef](ActorRef.html "class in akka.actor") recipient)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<java.lang.Object,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor"),​[DeadLetter](DeadLetter.html "class in akka.actor")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.Object,​[ActorRef](ActorRef.html "class in akka.actor"),​[ActorRef](ActorRef.html "class in akka.actor")>> unapply​([DeadLetter](DeadLetter.html "class in akka.actor") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter$.html)*