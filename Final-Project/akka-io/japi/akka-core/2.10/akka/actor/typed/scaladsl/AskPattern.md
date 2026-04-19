---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:20:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern.Askable.html
title: AskPattern.Askable
---

# AskPattern.Askable

## Content

Package [akka.actor.typed.scaladsl](package-summary.html)
## Class AskPattern.Askable\<Req\>

- java.lang.Object
- - scala.AnyVal
	- - akka.actor.typed.scaladsl.AskPattern.Askable\<Req\>

- Type Parameters:
`Req` \- The request protocol, what the other actor accepts

Enclosing class:
[AskPattern](AskPattern.html "class in akka.actor.typed.scaladsl")

---

```
public static final class AskPattern.Askable<Req>
extends scala.AnyVal
```

See [`<Res>ask(scala.Function1<akka.actor.typed.ActorRef<Res>,Req>,akka.util.Timeout,akka.actor.typed.Scheduler)`](#ask(scala.Function1,akka.util.Timeout,akka.actor.typed.Scheduler))

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Askable](#%3Cinit%3E(akka.actor.typed.RecipientRef))​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<[Req](AskPattern.Askable.html "type parameter in AskPattern.Askable")> ref)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Res> scala.concurrent.Future<Res>` | `[$qmark](#$qmark(scala.Function1,akka.util.Timeout,akka.actor.typed.Scheduler))​(scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​[Req](AskPattern.Askable.html "type parameter in AskPattern.Askable")> replyTo,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout,  [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)` | The ask\-pattern implements the initiator side of a request–reply protocol. |
	| `<Res> scala.concurrent.Future<Res>` | `[ask](#ask(scala.Function1,akka.util.Timeout,akka.actor.typed.Scheduler))​(scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​[Req](AskPattern.Askable.html "type parameter in AskPattern.Askable")> replyTo,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout,  [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)` | The ask\-pattern implements the initiator side of a request–reply protocol. |
	| `<Res> scala.concurrent.Future<Res>` | `[askWithStatus](#askWithStatus(scala.Function1,akka.util.Timeout,akka.actor.typed.Scheduler))​(scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[Req](AskPattern.Askable.html "type parameter in AskPattern.Askable")> replyTo,  [Timeout](../../../util/Timeout.html "class in akka.util") timeout,  [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)` | The same as [`<Res>ask(scala.Function1<akka.actor.typed.ActorRef<Res>,Req>,akka.util.Timeout,akka.actor.typed.Scheduler)`](#ask(scala.Function1,akka.util.Timeout,akka.actor.typed.Scheduler)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<[Req](AskPattern.Askable.html "type parameter in AskPattern.Askable")>` | `[ref](#ref())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Askable
		
		
		
		```
		public Askable​([RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<[Req](AskPattern.Askable.html "type parameter in AskPattern.Askable")> ref)
		```

	- ### Method Detail
	
	
	
		- #### ref
		
		
		
		```
		public [RecipientRef](../RecipientRef.html "interface in akka.actor.typed")<[Req](AskPattern.Askable.html "type parameter in AskPattern.Askable")> ref()
		```
		- #### $qmark
		
		
		
		```
		public <Res> scala.concurrent.Future<Res> $qmark​(scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​[Req](AskPattern.Askable.html "type parameter in AskPattern.Askable")> replyTo,
		                                                 [Timeout](../../../util/Timeout.html "class in akka.util") timeout,
		                                                 [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)
		```
		
		The ask\-pattern implements the initiator side of a request–reply protocol.
		 The `?` operator is pronounced as "ask" (and a convenience symbolic operation
		 kept since the previous ask API, if unsure which one to use, prefer the non\-symbolic
		 method as it leads to fewer surprises with the scope of the `replyTo` function)
		 
		 Note that if you are inside of an actor you should prefer `ActorContext.ask`
		 as that provides better safety.
		 
		
		
		 The party that asks may be within or without an Actor, since the
		 implementation will fabricate a (hidden) `ActorRef` that is bound to a
		 `Promise`. This ActorRef will need to be injected in the
		 message that is sent to the target Actor in order to function as a reply\-to
		 address, therefore the argument to the ask / `?`
		 operator is not the message itself but a function that given the reply\-to
		 address will create the message.
		 
		
		
		
		
		
		```
		
		 case class Request(msg: String, replyTo: ActorRef[Reply])
		 case class Reply(msg: String)
		
		 implicit val system = ...
		 implicit val timeout = Timeout(3.seconds)
		 val target: ActorRef[Request] = ...
		 val f: Future[Reply] = target ? (replyTo => Request("hello", replyTo))
		 
		```
		
		
		 Note: it is preferrable to use the non\-symbolic ask method as it easier allows for wildcards for
		 the `replyTo: ActorRef`.
		- #### ask
		
		
		
		```
		public <Res> scala.concurrent.Future<Res> ask​(scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<Res>,​[Req](AskPattern.Askable.html "type parameter in AskPattern.Askable")> replyTo,
		                                              [Timeout](../../../util/Timeout.html "class in akka.util") timeout,
		                                              [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)
		```
		
		The ask\-pattern implements the initiator side of a request–reply protocol.
		 
		 Note that if you are inside of an actor you should prefer `ActorContext.ask`
		 as that provides better safety.
		 
		
		
		 The party that asks may be within or without an Actor, since the
		 implementation will fabricate a (hidden) `ActorRef` that is bound to a
		 `Promise`. This ActorRef will need to be injected in the
		 message that is sent to the target Actor in order to function as a reply\-to
		 address, therefore the argument to the ask / `?`
		 operator is not the message itself but a function that given the reply\-to
		 address will create the message.
		 
		
		
		
		
		
		```
		
		 case class Request(msg: String, replyTo: ActorRef[Reply])
		 case class Reply(msg: String)
		
		 implicit val system = ...
		 implicit val timeout = Timeout(3.seconds)
		 val target: ActorRef[Request] = ...
		 val f: Future[Reply] = target.ask(replyTo => Request("hello", replyTo))
		 // alternatively
		 val f2: Future[Reply] = target.ask(Request("hello", _))
		 
		```
		- #### askWithStatus
		
		
		
		```
		public <Res> scala.concurrent.Future<Res> askWithStatus​(scala.Function1<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[Req](AskPattern.Askable.html "type parameter in AskPattern.Askable")> replyTo,
		                                                        [Timeout](../../../util/Timeout.html "class in akka.util") timeout,
		                                                        [Scheduler](../Scheduler.html "interface in akka.actor.typed") scheduler)
		```
		
		The same as [`<Res>ask(scala.Function1<akka.actor.typed.ActorRef<Res>,Req>,akka.util.Timeout,akka.actor.typed.Scheduler)`](#ask(scala.Function1,akka.util.Timeout,akka.actor.typed.Scheduler)) but only for requests that result in a response of type [`StatusReply`](../../../pattern/StatusReply.html "class in akka.pattern").
		 If the response is a `akka.pattern.StatusReply.Success` the returned future is completed successfully with the wrapped response.
		 If the status response is a `akka.pattern.StatusReply.Error` the returned future will be failed with the
		 exception in the error (normally a [`StatusReply.ErrorMessage`](../../../pattern/StatusReply.ErrorMessage.html "class in akka.pattern")).
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`

## Code Examples

### Example 1: $qmark

```text
case class Request(msg: String, replyTo: ActorRef[Reply])
 case class Reply(msg: String)

 implicit val system = ...
 implicit val timeout = Timeout(3.seconds)
 val target: ActorRef[Request] = ...
 val f: Future[Reply] = target ? (replyTo => Request("hello", replyTo))
```

### Example 2: ask

```text
case class Request(msg: String, replyTo: ActorRef[Reply])
 case class Reply(msg: String)

 implicit val system = ...
 implicit val timeout = Timeout(3.seconds)
 val target: ActorRef[Request] = ...
 val f: Future[Reply] = target.ask(replyTo => Request("hello", replyTo))
 // alternatively
 val f2: Future[Reply] = target.ask(Request("hello", _))
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern.Askable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.ErrorMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern.Askable.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern.Askable.html)*