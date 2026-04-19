---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/TaskInvocation.html
title: TaskInvocation
---

# TaskInvocation

## Content

Package [akka.dispatch](package-summary.html)
## Class TaskInvocation

- java.lang.Object
- - akka.dispatch.TaskInvocation

- All Implemented Interfaces:
`[Batchable](Batchable.html "interface in akka.dispatch")`, `java.io.Serializable`, `java.lang.Runnable`, `scala.Equals`, `scala.Product`

---

```
public final class TaskInvocation
extends java.lang.Object
implements [Batchable](Batchable.html "interface in akka.dispatch"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.TaskInvocation)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TaskInvocation](#%3Cinit%3E(akka.event.EventStream,java.lang.Runnable,scala.Function0))​([EventStream](../event/EventStream.html "class in akka.event") eventStream,  java.lang.Runnable runnable,  scala.Function0<scala.runtime.BoxedUnit> cleanup)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TaskInvocation](TaskInvocation.html "class in akka.dispatch")` | `[apply](#apply(akka.event.EventStream,java.lang.Runnable,scala.Function0))​([EventStream](../event/EventStream.html "class in akka.event") eventStream,  java.lang.Runnable runnable,  scala.Function0<scala.runtime.BoxedUnit> cleanup)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.Function0<scala.runtime.BoxedUnit>` | `[cleanup](#cleanup())()` |  |
	| `[TaskInvocation](TaskInvocation.html "class in akka.dispatch")` | `[copy](#copy(akka.event.EventStream,java.lang.Runnable,scala.Function0))​([EventStream](../event/EventStream.html "class in akka.event") eventStream,  java.lang.Runnable runnable,  scala.Function0<scala.runtime.BoxedUnit> cleanup)` |  |
	| `[EventStream](../event/EventStream.html "class in akka.event")` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.Runnable` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.Function0<scala.runtime.BoxedUnit>` | `[copy$default$3](#copy$default$3())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[EventStream](../event/EventStream.html "class in akka.event")` | `[eventStream](#eventStream())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isBatchable](#isBatchable())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `void` | `[run](#run())()` |  |
	| `java.lang.Runnable` | `[runnable](#runnable())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<[EventStream](../event/EventStream.html "class in akka.event"),​java.lang.Runnable,​scala.Function0<scala.runtime.BoxedUnit>>>` | `[unapply](#unapply(akka.dispatch.TaskInvocation))​([TaskInvocation](TaskInvocation.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### TaskInvocation
		
		
		
		```
		public TaskInvocation​([EventStream](../event/EventStream.html "class in akka.event") eventStream,
		                      java.lang.Runnable runnable,
		                      scala.Function0<scala.runtime.BoxedUnit> cleanup)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [TaskInvocation](TaskInvocation.html "class in akka.dispatch") apply​([EventStream](../event/EventStream.html "class in akka.event") eventStream,
		                                   java.lang.Runnable runnable,
		                                   scala.Function0<scala.runtime.BoxedUnit> cleanup)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<[EventStream](../event/EventStream.html "class in akka.event"),​java.lang.Runnable,​scala.Function0<scala.runtime.BoxedUnit>>> unapply​([TaskInvocation](TaskInvocation.html "class in akka.dispatch") x$0)
		```
		- #### eventStream
		
		
		
		```
		public [EventStream](../event/EventStream.html "class in akka.event") eventStream()
		```
		- #### runnable
		
		
		
		```
		public java.lang.Runnable runnable()
		```
		- #### cleanup
		
		
		
		```
		public scala.Function0<scala.runtime.BoxedUnit> cleanup()
		```
		- #### isBatchable
		
		
		
		```
		public final boolean isBatchable()
		```
		
		
		Specified by:
		`[isBatchable](Batchable.html#isBatchable())` in interface `[Batchable](Batchable.html "interface in akka.dispatch")`
		- #### run
		
		
		
		```
		public void run()
		```
		
		
		Specified by:
		`run` in interface `java.lang.Runnable`
		- #### copy
		
		
		
		```
		public [TaskInvocation](TaskInvocation.html "class in akka.dispatch") copy​([EventStream](../event/EventStream.html "class in akka.event") eventStream,
		                           java.lang.Runnable runnable,
		                           scala.Function0<scala.runtime.BoxedUnit> cleanup)
		```
		- #### copy$default$1
		
		
		
		```
		public [EventStream](../event/EventStream.html "class in akka.event") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.Runnable copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public scala.Function0<scala.runtime.BoxedUnit> copy$default$3()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/Batchable.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/TaskInvocation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/TaskInvocation.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/TaskInvocation.html)*