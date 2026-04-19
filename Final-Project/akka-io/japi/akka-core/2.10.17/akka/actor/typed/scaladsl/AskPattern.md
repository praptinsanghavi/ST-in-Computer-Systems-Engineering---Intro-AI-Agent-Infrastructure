---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:57:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/AskPattern.Askable$.html
title: AskPattern.Askable$
---

# AskPattern.Askable$

## Content

Package [akka.actor.typed.scaladsl](package-summary.html)
## Class AskPattern.Askable$

- java.lang.Object
- - akka.actor.typed.scaladsl.AskPattern.Askable$

- Enclosing class:
[AskPattern](AskPattern.html "class in akka.actor.typed.scaladsl")

---

```
public static class AskPattern.Askable$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AskPattern.Askable$](AskPattern.Askable$.html "class in akka.actor.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Askable$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Res,​Req>scala.concurrent.Future<Res>` | `[$qmark$extension](#$qmark$extension(akka.actor.typed.scaladsl.AskPattern.Askable,scala.Function1,akka.util.Timeout,akka.actor.typed.Scheduler))​([AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req> $this,  scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> replyTo,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout,  [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)` |  |
	| `<Res,​Req>scala.concurrent.Future<Res>` | `[ask$extension](#ask$extension(akka.actor.typed.scaladsl.AskPattern.Askable,scala.Function1,akka.util.Timeout,akka.actor.typed.Scheduler))​([AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req> $this,  scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> replyTo,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout,  [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)` |  |
	| `<Res,​Req>scala.concurrent.Future<Res>` | `[askWithStatus$extension](#askWithStatus$extension(akka.actor.typed.scaladsl.AskPattern.Askable,scala.Function1,akka.util.Timeout,akka.actor.typed.Scheduler))​([AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req> $this,  scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​Req> replyTo,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout,  [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)` |  |
	| `<Req> boolean` | `[equals$extension](#equals$extension(akka.actor.typed.scaladsl.AskPattern.Askable,java.lang.Object))​([AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req> $this,  java.lang.Object x$1)` |  |
	| `<Req> int` | `[hashCode$extension](#hashCode$extension(akka.actor.typed.scaladsl.AskPattern.Askable))​([AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req> $this)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AskPattern.Askable$](AskPattern.Askable$.html "class in akka.actor.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Askable$
		
		
		
		```
		public Askable$()
		```

	- ### Method Detail
	
	
	
		- #### $qmark$extension
		
		
		
		```
		public final <Res,​Req> scala.concurrent.Future<Res> $qmark$extension​([AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req> $this,
		                                                                           scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> replyTo,
		                                                                           [Timeout](../../../util/Timeout.html "class in akka.util") timeout,
		                                                                           [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)
		```
		- #### ask$extension
		
		
		
		```
		public final <Res,​Req> scala.concurrent.Future<Res> ask$extension​([AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req> $this,
		                                                                        scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> replyTo,
		                                                                        [Timeout](../../../util/Timeout.html "class in akka.util") timeout,
		                                                                        [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)
		```
		- #### askWithStatus$extension
		
		
		
		```
		public final <Res,​Req> scala.concurrent.Future<Res> askWithStatus$extension​([AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req> $this,
		                                                                                  scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​Req> replyTo,
		                                                                                  [Timeout](../../../util/Timeout.html "class in akka.util") timeout,
		                                                                                  [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)
		```
		- #### hashCode$extension
		
		
		
		```
		public final <Req> int hashCode$extension​([AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req> $this)
		```
		- #### equals$extension
		
		
		
		```
		public final <Req> boolean equals$extension​([AskPattern.Askable](AskPattern.Askable.html "class in akka.actor.typed.scaladsl")<Req> $this,
		                                            java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/AskPattern.Askable$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/AskPattern.Askable.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/AskPattern.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/AskPattern.Askable$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/AskPattern.Askable$.html)*