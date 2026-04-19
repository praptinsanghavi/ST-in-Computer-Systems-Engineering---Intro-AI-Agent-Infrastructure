---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/Failed$.html
title: Failed$
---

# Failed$

## Content

Package [akka.dispatch.sysmsg](package-summary.html)
## Class Failed$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Object,​akka.dispatch.sysmsg.Failed\>
	- - akka.dispatch.sysmsg.Failed$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Object,​akka.dispatch.sysmsg.Failed>`

---

```
public class Failed$
extends scala.runtime.AbstractFunction3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Object,​akka.dispatch.sysmsg.Failed>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.dispatch.sysmsg.Failed$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Failed$](Failed$.html "class in akka.dispatch.sysmsg")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Failed$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.dispatch.sysmsg.Failed` | `[apply](#apply(akka.actor.ActorRef,java.lang.Throwable,int))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") child,  java.lang.Throwable cause,  int uid)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Object>>` | `[unapply](#unapply(akka.dispatch.sysmsg.Failed))​(akka.dispatch.sysmsg.Failed x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Failed$](Failed$.html "class in akka.dispatch.sysmsg") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Failed$
		
		
		
		```
		public Failed$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Object,​akka.dispatch.sysmsg.Failed>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Object,​akka.dispatch.sysmsg.Failed>`
		- #### apply
		
		
		
		```
		public akka.dispatch.sysmsg.Failed apply​([ActorRef](../../actor/ActorRef.html "class in akka.actor") child,
		                                         java.lang.Throwable cause,
		                                         int uid)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Object>> unapply​(akka.dispatch.sysmsg.Failed x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/Failed$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/Failed$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/Failed$.html)*