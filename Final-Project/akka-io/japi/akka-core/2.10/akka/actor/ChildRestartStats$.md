---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:57:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/ChildRestartStats$.html
title: ChildRestartStats$
---

# ChildRestartStats$

## Content

Package [akka.actor](package-summary.html)
## Class ChildRestartStats$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​[ChildRestartStats](ChildRestartStats.html "class in akka.actor")\>
	- - akka.actor.ChildRestartStats$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​[ChildRestartStats](ChildRestartStats.html "class in akka.actor")>`

---

```
public class ChildRestartStats$
extends scala.runtime.AbstractFunction3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​[ChildRestartStats](ChildRestartStats.html "class in akka.actor")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ChildRestartStats$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ChildRestartStats$](ChildRestartStats$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ChildRestartStats$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `long` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `[ChildRestartStats](ChildRestartStats.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef,int,long))​([ActorRef](ActorRef.html "class in akka.actor") child,  int maxNrOfRetriesCount,  long restartTimeWindowStartNanos)` |  |
	| `int` | `[apply$default$2](#apply$default$2())()` |  |
	| `long` | `[apply$default$3](#apply$default$3())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.actor.ChildRestartStats))​([ChildRestartStats](ChildRestartStats.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ChildRestartStats$](ChildRestartStats$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ChildRestartStats$
		
		
		
		```
		public ChildRestartStats$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public int $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public long $lessinit$greater$default$3()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​[ChildRestartStats](ChildRestartStats.html "class in akka.actor")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​[ChildRestartStats](ChildRestartStats.html "class in akka.actor")>`
		- #### apply
		
		
		
		```
		public [ChildRestartStats](ChildRestartStats.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") child,
		                               int maxNrOfRetriesCount,
		                               long restartTimeWindowStartNanos)
		```
		- #### apply$default$2
		
		
		
		```
		public int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public long apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object>> unapply​([ChildRestartStats](ChildRestartStats.html "class in akka.actor") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ChildRestartStats$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ChildRestartStats.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/ChildRestartStats$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ChildRestartStats$.html)*