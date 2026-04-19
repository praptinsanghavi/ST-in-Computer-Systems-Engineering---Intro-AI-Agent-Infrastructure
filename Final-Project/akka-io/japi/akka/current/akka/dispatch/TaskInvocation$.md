---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/TaskInvocation$.html
title: TaskInvocation$
---

# TaskInvocation$

## Content

Package [akka.dispatch](package-summary.html)
## Class TaskInvocation$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[EventStream](../event/EventStream.html "class in akka.event"),​java.lang.Runnable,​scala.Function0\<scala.runtime.BoxedUnit\>,​[TaskInvocation](TaskInvocation.html "class in akka.dispatch")\>
	- - akka.dispatch.TaskInvocation$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[EventStream](../event/EventStream.html "class in akka.event"),​java.lang.Runnable,​scala.Function0<scala.runtime.BoxedUnit>,​[TaskInvocation](TaskInvocation.html "class in akka.dispatch")>`

---

```
public class TaskInvocation$
extends scala.runtime.AbstractFunction3<[EventStream](../event/EventStream.html "class in akka.event"),​java.lang.Runnable,​scala.Function0<scala.runtime.BoxedUnit>,​[TaskInvocation](TaskInvocation.html "class in akka.dispatch")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.TaskInvocation$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TaskInvocation$](TaskInvocation$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TaskInvocation$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TaskInvocation](TaskInvocation.html "class in akka.dispatch")` | `[apply](#apply(akka.event.EventStream,java.lang.Runnable,scala.Function0))​([EventStream](../event/EventStream.html "class in akka.event") eventStream,  java.lang.Runnable runnable,  scala.Function0<scala.runtime.BoxedUnit> cleanup)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[EventStream](../event/EventStream.html "class in akka.event"),​java.lang.Runnable,​scala.Function0<scala.runtime.BoxedUnit>>>` | `[unapply](#unapply(akka.dispatch.TaskInvocation))​([TaskInvocation](TaskInvocation.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TaskInvocation$](TaskInvocation$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TaskInvocation$
		
		
		
		```
		public TaskInvocation$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[EventStream](../event/EventStream.html "class in akka.event"),​java.lang.Runnable,​scala.Function0<scala.runtime.BoxedUnit>,​[TaskInvocation](TaskInvocation.html "class in akka.dispatch")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[EventStream](../event/EventStream.html "class in akka.event"),​java.lang.Runnable,​scala.Function0<scala.runtime.BoxedUnit>,​[TaskInvocation](TaskInvocation.html "class in akka.dispatch")>`
		- #### apply
		
		
		
		```
		public [TaskInvocation](TaskInvocation.html "class in akka.dispatch") apply​([EventStream](../event/EventStream.html "class in akka.event") eventStream,
		                            java.lang.Runnable runnable,
		                            scala.Function0<scala.runtime.BoxedUnit> cleanup)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[EventStream](../event/EventStream.html "class in akka.event"),​java.lang.Runnable,​scala.Function0<scala.runtime.BoxedUnit>,​[TaskInvocation](TaskInvocation.html "class in akka.dispatch")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[EventStream](../event/EventStream.html "class in akka.event"),​java.lang.Runnable,​scala.Function0<scala.runtime.BoxedUnit>>> unapply​([TaskInvocation](TaskInvocation.html "class in akka.dispatch") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/TaskInvocation$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/TaskInvocation.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/event/EventStream.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/TaskInvocation$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/TaskInvocation$.html)*