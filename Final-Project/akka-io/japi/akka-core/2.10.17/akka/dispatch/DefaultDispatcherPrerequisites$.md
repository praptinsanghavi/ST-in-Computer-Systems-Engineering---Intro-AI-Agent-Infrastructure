---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:42:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/DefaultDispatcherPrerequisites$.html
title: DefaultDispatcherPrerequisites$
---

# DefaultDispatcherPrerequisites$

## Content

Package [akka.dispatch](package-summary.html)
## Class DefaultDispatcherPrerequisites$

- java.lang.Object
- - scala.runtime.AbstractFunction7\<java.util.concurrent.ThreadFactory,​[EventStream](../event/EventStream.html "class in akka.event"),​[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​[DynamicAccess](../actor/DynamicAccess.html "class in akka.actor"),​[ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor"),​akka.dispatch.Mailboxes,​scala.Option\<scala.concurrent.ExecutionContext\>,​akka.dispatch.DefaultDispatcherPrerequisites\>
	- - akka.dispatch.DefaultDispatcherPrerequisites$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function7<java.util.concurrent.ThreadFactory,​[EventStream](../event/EventStream.html "class in akka.event"),​[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​[DynamicAccess](../actor/DynamicAccess.html "class in akka.actor"),​[ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor"),​akka.dispatch.Mailboxes,​scala.Option<scala.concurrent.ExecutionContext>,​akka.dispatch.DefaultDispatcherPrerequisites>`

---

```
public class DefaultDispatcherPrerequisites$
extends scala.runtime.AbstractFunction7<java.util.concurrent.ThreadFactory,​[EventStream](../event/EventStream.html "class in akka.event"),​[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​[DynamicAccess](../actor/DynamicAccess.html "class in akka.actor"),​[ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor"),​akka.dispatch.Mailboxes,​scala.Option<scala.concurrent.ExecutionContext>,​akka.dispatch.DefaultDispatcherPrerequisites>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.DefaultDispatcherPrerequisites$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DefaultDispatcherPrerequisites$](DefaultDispatcherPrerequisites$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultDispatcherPrerequisites$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.dispatch.DefaultDispatcherPrerequisites` | `[apply](#apply(java.util.concurrent.ThreadFactory,akka.event.EventStream,akka.actor.Scheduler,akka.actor.DynamicAccess,akka.actor.ActorSystem.Settings,akka.dispatch.Mailboxes,scala.Option))​(java.util.concurrent.ThreadFactory threadFactory,  [EventStream](../event/EventStream.html "class in akka.event") eventStream,  [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  [DynamicAccess](../actor/DynamicAccess.html "class in akka.actor") dynamicAccess,  [ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings,  akka.dispatch.Mailboxes mailboxes,  scala.Option<scala.concurrent.ExecutionContext> defaultExecutionContext)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple7<java.util.concurrent.ThreadFactory,​[EventStream](../event/EventStream.html "class in akka.event"),​[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​[DynamicAccess](../actor/DynamicAccess.html "class in akka.actor"),​[ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor"),​akka.dispatch.Mailboxes,​scala.Option<scala.concurrent.ExecutionContext>>>` | `[unapply](#unapply(akka.dispatch.DefaultDispatcherPrerequisites))​(akka.dispatch.DefaultDispatcherPrerequisites x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction7
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DefaultDispatcherPrerequisites$](DefaultDispatcherPrerequisites$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DefaultDispatcherPrerequisites$
		
		
		
		```
		public DefaultDispatcherPrerequisites$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function7<java.util.concurrent.ThreadFactory,​[EventStream](../event/EventStream.html "class in akka.event"),​[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​[DynamicAccess](../actor/DynamicAccess.html "class in akka.actor"),​[ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor"),​akka.dispatch.Mailboxes,​scala.Option<scala.concurrent.ExecutionContext>,​akka.dispatch.DefaultDispatcherPrerequisites>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction7<java.util.concurrent.ThreadFactory,​[EventStream](../event/EventStream.html "class in akka.event"),​[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​[DynamicAccess](../actor/DynamicAccess.html "class in akka.actor"),​[ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor"),​akka.dispatch.Mailboxes,​scala.Option<scala.concurrent.ExecutionContext>,​akka.dispatch.DefaultDispatcherPrerequisites>`
		- #### apply
		
		
		
		```
		public akka.dispatch.DefaultDispatcherPrerequisites apply​(java.util.concurrent.ThreadFactory threadFactory,
		                                                          [EventStream](../event/EventStream.html "class in akka.event") eventStream,
		                                                          [Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                                          [DynamicAccess](../actor/DynamicAccess.html "class in akka.actor") dynamicAccess,
		                                                          [ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings,
		                                                          akka.dispatch.Mailboxes mailboxes,
		                                                          scala.Option<scala.concurrent.ExecutionContext> defaultExecutionContext)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function7<java.util.concurrent.ThreadFactory,​[EventStream](../event/EventStream.html "class in akka.event"),​[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​[DynamicAccess](../actor/DynamicAccess.html "class in akka.actor"),​[ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor"),​akka.dispatch.Mailboxes,​scala.Option<scala.concurrent.ExecutionContext>,​akka.dispatch.DefaultDispatcherPrerequisites>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple7<java.util.concurrent.ThreadFactory,​[EventStream](../event/EventStream.html "class in akka.event"),​[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​[DynamicAccess](../actor/DynamicAccess.html "class in akka.actor"),​[ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor"),​akka.dispatch.Mailboxes,​scala.Option<scala.concurrent.ExecutionContext>>> unapply​(akka.dispatch.DefaultDispatcherPrerequisites x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/DefaultDispatcherPrerequisites$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/DefaultDispatcherPrerequisites$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/DefaultDispatcherPrerequisites$.html)*