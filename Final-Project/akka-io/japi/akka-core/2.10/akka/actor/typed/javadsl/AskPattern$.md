---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AskPattern$.html
title: AskPattern$
---

# AskPattern$

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class AskPattern$

- java.lang.Object
- - akka.actor.typed.javadsl.AskPattern$

- ---

```
public class AskPattern$
extends java.lang.Object
```

The ask\-pattern implements the initiator side of a request–reply protocol.
 
 Note that if you are inside of an actor you should prefer `ActorContext.ask`
 as that provides better safety.
 

 The party that asks may be within or without an Actor, since the
 implementation will fabricate a (hidden) `ActorRef` that is bound to a
 `CompletableFuture`. This ActorRef will need to be injected in the
 message that is sent to the target Actor in order to function as a reply\-to
 address, therefore the argument to the ask method is not the message itself
 but a function that given the reply\-to address will create the message.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AskPattern$](AskPattern$.html "class in akka.actor.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AskPattern$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Req,​Res>java.util.concurrent.CompletionStage<Res>` | `[ask](#ask(akka.actor.typed.RecipientRef,akka.japi.function.Function,java.time.Duration,akka.actor.typed.Scheduler))​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> actor,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> messageFactory,  java.time.Duration timeout,  [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)` |  |
	| `<Req,​Res>java.util.concurrent.CompletionStage<Res>` | `[askWithStatus](#askWithStatus(akka.actor.typed.RecipientRef,akka.japi.function.Function,java.time.Duration,akka.actor.typed.Scheduler))​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> actor,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​Req> messageFactory,  java.time.Duration timeout,  [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)` | The same as [`<Req,Res>ask(akka.actor.typed.RecipientRef<Req>,akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,Req>,java.time.Duration,akka.actor.typed.Scheduler)`](#ask(akka.actor.typed.RecipientRef,akka.japi.function.Function,java.time.Duration,akka.actor.typed.Scheduler)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AskPattern$](AskPattern$.html "class in akka.actor.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AskPattern$
		
		
		
		```
		public AskPattern$()
		```

	- ### Method Detail
	
	
	
		- #### ask
		
		
		
		```
		public <Req,​Res> java.util.concurrent.CompletionStage<Res> ask​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> actor,
		                                                                     [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​Req> messageFactory,
		                                                                     java.time.Duration timeout,
		                                                                     [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)
		```
		- #### askWithStatus
		
		
		
		```
		public <Req,​Res> java.util.concurrent.CompletionStage<Res> askWithStatus​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<Req> actor,
		                                                                               [Function](../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​Req> messageFactory,
		                                                                               java.time.Duration timeout,
		                                                                               [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)
		```
		
		The same as [`<Req,Res>ask(akka.actor.typed.RecipientRef<Req>,akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,Req>,java.time.Duration,akka.actor.typed.Scheduler)`](#ask(akka.actor.typed.RecipientRef,akka.japi.function.Function,java.time.Duration,akka.actor.typed.Scheduler)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern").
		 If the response is a [`StatusReply.success(T)`](../../../pattern/StatusReply.html#success(T)) the returned future is completed successfully with the wrapped response.
		 If the status response is a [`StatusReply.error(java.lang.String)`](../../../pattern/StatusReply.html#error(java.lang.String)) the returned future will be failed with the
		 exception in the error (normally a [`StatusReply.ErrorMessage`](../../../pattern/StatusReply.ErrorMessage.html "class in akka.pattern")).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AskPattern$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.ErrorMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AskPattern$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AskPattern$.html)*