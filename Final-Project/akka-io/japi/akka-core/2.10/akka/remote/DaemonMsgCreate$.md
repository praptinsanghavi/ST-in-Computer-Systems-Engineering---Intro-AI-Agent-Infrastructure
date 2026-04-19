---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:14:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/DaemonMsgCreate$.html
title: DaemonMsgCreate$
---

# DaemonMsgCreate$

## Content

Package [akka.remote](package-summary.html)
## Class DaemonMsgCreate$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<[Props](../actor/Props.html "class in akka.actor"),​[Deploy](../actor/Deploy.html "class in akka.actor"),​java.lang.String,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​akka.remote.DaemonMsgCreate\>
	- - akka.remote.DaemonMsgCreate$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<[Props](../actor/Props.html "class in akka.actor"),​[Deploy](../actor/Deploy.html "class in akka.actor"),​java.lang.String,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​akka.remote.DaemonMsgCreate>`

---

```
public class DaemonMsgCreate$
extends scala.runtime.AbstractFunction4<[Props](../actor/Props.html "class in akka.actor"),​[Deploy](../actor/Deploy.html "class in akka.actor"),​java.lang.String,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​akka.remote.DaemonMsgCreate>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.DaemonMsgCreate$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DaemonMsgCreate$](DaemonMsgCreate$.html "class in akka.remote")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DaemonMsgCreate$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.DaemonMsgCreate` | `[apply](#apply(akka.actor.Props,akka.actor.Deploy,java.lang.String,akka.actor.ActorRef))​([Props](../actor/Props.html "class in akka.actor") props,  [Deploy](../actor/Deploy.html "class in akka.actor") deploy,  java.lang.String path,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<[Props](../actor/Props.html "class in akka.actor"),​[Deploy](../actor/Deploy.html "class in akka.actor"),​java.lang.String,​[ActorRef](../actor/ActorRef.html "class in akka.actor")>>` | `[unapply](#unapply(akka.remote.DaemonMsgCreate))​(akka.remote.DaemonMsgCreate x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DaemonMsgCreate$](DaemonMsgCreate$.html "class in akka.remote") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DaemonMsgCreate$
		
		
		
		```
		public DaemonMsgCreate$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<[Props](../actor/Props.html "class in akka.actor"),​[Deploy](../actor/Deploy.html "class in akka.actor"),​java.lang.String,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​akka.remote.DaemonMsgCreate>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<[Props](../actor/Props.html "class in akka.actor"),​[Deploy](../actor/Deploy.html "class in akka.actor"),​java.lang.String,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​akka.remote.DaemonMsgCreate>`
		- #### apply
		
		
		
		```
		public akka.remote.DaemonMsgCreate apply​([Props](../actor/Props.html "class in akka.actor") props,
		                                         [Deploy](../actor/Deploy.html "class in akka.actor") deploy,
		                                         java.lang.String path,
		                                         [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function4<[Props](../actor/Props.html "class in akka.actor"),​[Deploy](../actor/Deploy.html "class in akka.actor"),​java.lang.String,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​akka.remote.DaemonMsgCreate>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<[Props](../actor/Props.html "class in akka.actor"),​[Deploy](../actor/Deploy.html "class in akka.actor"),​java.lang.String,​[ActorRef](../actor/ActorRef.html "class in akka.actor")>> unapply​(akka.remote.DaemonMsgCreate x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Deploy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/DaemonMsgCreate$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/DaemonMsgCreate$.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/DaemonMsgCreate$.html)*