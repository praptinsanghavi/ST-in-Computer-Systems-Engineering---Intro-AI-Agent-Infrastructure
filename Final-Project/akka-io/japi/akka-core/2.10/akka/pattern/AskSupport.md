---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:58:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskSupport.html
title: AskSupport
---

# AskSupport

## Content

Package [akka.pattern](package-summary.html)
## Interface AskSupport

- ---

```
public interface AskSupport
```

This object contains implementation details of the \&ldquo;ask\&rdquo; pattern.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[AskableActorRef](AskableActorRef.html "class in akka.pattern")` | `[ask](#ask(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)` | Import this implicit conversion to gain `?` and `ask` methods on  [`ActorRef`](../actor/ActorRef.html "class in akka.actor"), which will defer to the  `ask(actorRef, message)(timeout)` method defined here. |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorRef,java.lang.Object,akka.actor.ActorRef,akka.util.Timeout))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorRef,java.lang.Object,akka.util.Timeout))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | Sends a message asynchronously and returns a `Future`  holding the eventual reply message; this means that the target actor  needs to send the result to the `sender` reference provided. |
	| `[AskableActorSelection](AskableActorSelection.html "class in akka.pattern")` | `[ask](#ask(akka.actor.ActorSelection))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection)` | Import this implicit conversion to gain `?` and `ask` methods on  [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor"), which will defer to the  `ask(actorSelection, message)(timeout)` method defined here. |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorSelection,java.lang.Object,akka.actor.ActorRef,akka.util.Timeout))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection,  java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorSelection,java.lang.Object,akka.util.Timeout))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | Sends a message asynchronously and returns a `Future`  holding the eventual reply message; this means that the target actor  needs to send the result to the `sender` reference provided. |
	| `scala.concurrent.Future<java.lang.Object>` | `[askWithStatus](#askWithStatus(akka.actor.ActorRef,java.lang.Object,akka.actor.ActorRef,akka.util.Timeout))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | Use for messages whose response is known to be a [`StatusReply`](StatusReply.html "class in akka.pattern"). |
	| `scala.concurrent.Future<java.lang.Object>` | `[askWithStatus](#askWithStatus(akka.actor.ActorRef,java.lang.Object,akka.util.Timeout))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | Use for messages whose response is known to be a [`StatusReply`](StatusReply.html "class in akka.pattern"). |

- - ### Method Detail
	
	
	
		- #### ask
		
		
		
		```
		[AskableActorRef](AskableActorRef.html "class in akka.pattern") ask​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)
		```
		
		Import this implicit conversion to gain `?` and `ask` methods on
		 [`ActorRef`](../actor/ActorRef.html "class in akka.actor"), which will defer to the
		 `ask(actorRef, message)(timeout)` method defined here.
		 
		
		
		
		```
		
		 import akka.pattern.ask
		
		 val future = actor ? message             // => ask(actor, message)
		 val future = actor ask message           // => ask(actor, message)
		 val future = actor.ask(message)(timeout) // => ask(actor, message)(timeout)
		 
		```
		
		
		 All of the above use an implicit [`Timeout`](../util/Timeout.html "class in akka.util").
		- #### ask
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> ask​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,
		                                              java.lang.Object message,
		                                              [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		Sends a message asynchronously and returns a `Future`
		 holding the eventual reply message; this means that the target actor
		 needs to send the result to the `sender` reference provided.
		 
		 The Future will be completed with an [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern") after the
		 given timeout has expired; this is independent from any timeout applied
		 while awaiting a result for this future (i.e. in
		 `Await.result(..., timeout)`). A typical reason for `AskTimeoutException` is that the
		 recipient actor didn't send a reply.
		 
		
		
		**Warning:**
		 When using future callbacks, inside actors you need to carefully avoid closing over
		 the containing actor\&rsquo;s object, i.e. do not call methods or access mutable state
		 on the enclosing actor from within the callback. This would break the actor
		 encapsulation and may introduce synchronization bugs and race conditions because
		 the callback will be scheduled concurrently to the enclosing actor. Unfortunately
		 there is not yet a way to detect these illegal accesses at compile time.
		 
		
		
		**Recommended usage:**
		
		
		
		
		
		
		```
		
		   val f = ask(worker, request)(timeout)
		   f.map { response =>
		     EnrichedMessage(response)
		   } pipeTo nextActor
		 
		```
		- #### ask
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> ask​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,
		                                              java.lang.Object message,
		                                              [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,
		                                              [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		- #### ask
		
		
		
		```
		[AskableActorSelection](AskableActorSelection.html "class in akka.pattern") ask​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection)
		```
		
		Import this implicit conversion to gain `?` and `ask` methods on
		 [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor"), which will defer to the
		 `ask(actorSelection, message)(timeout)` method defined here.
		 
		
		
		
		```
		
		 import akka.pattern.ask
		
		 val future = selection ? message             // => ask(selection, message)
		 val future = selection ask message           // => ask(selection, message)
		 val future = selection.ask(message)(timeout) // => ask(selection, message)(timeout)
		 
		```
		
		
		 All of the above use an implicit [`Timeout`](../util/Timeout.html "class in akka.util").
		- #### ask
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> ask​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection,
		                                              java.lang.Object message,
		                                              [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		Sends a message asynchronously and returns a `Future`
		 holding the eventual reply message; this means that the target actor
		 needs to send the result to the `sender` reference provided.
		 
		 The Future will be completed with an [`AskTimeoutException`](AskTimeoutException.html "class in akka.pattern") after the
		 given timeout has expired; this is independent from any timeout applied
		 while awaiting a result for this future (i.e. in
		 `Await.result(..., timeout)`). A typical reason for `AskTimeoutException` is that the
		 recipient actor didn't send a reply.
		 
		
		
		**Warning:**
		 When using future callbacks, inside actors you need to carefully avoid closing over
		 the containing actor\&rsquo;s object, i.e. do not call methods or access mutable state
		 on the enclosing actor from within the callback. This would break the actor
		 encapsulation and may introduce synchronization bugs and race conditions because
		 the callback will be scheduled concurrently to the enclosing actor. Unfortunately
		 there is not yet a way to detect these illegal accesses at compile time.
		 
		
		
		**Recommended usage:**
		
		
		
		
		
		
		```
		
		   val f = ask(worker, request)(timeout)
		   f.map { response =>
		     EnrichedMessage(response)
		   } pipeTo nextActor
		 
		```
		- #### ask
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> ask​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection,
		                                              java.lang.Object message,
		                                              [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,
		                                              [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		- #### askWithStatus
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> askWithStatus​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,
		                                                        java.lang.Object message,
		                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use for messages whose response is known to be a [`StatusReply`](StatusReply.html "class in akka.pattern"). When a `akka.pattern.StatusReply.Success` response
		 arrives the future is completed with the wrapped value, if a `akka.pattern.StatusReply.Error` arrives the future is instead
		 failed.
		- #### askWithStatus
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> askWithStatus​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,
		                                                        java.lang.Object message,
		                                                        [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,
		                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use for messages whose response is known to be a [`StatusReply`](StatusReply.html "class in akka.pattern"). When a `akka.pattern.StatusReply.Success` response
		 arrives the future is completed with the wrapped value, if a `akka.pattern.StatusReply.Error` arrives the future is instead
		 failed.

## Code Examples

### Example 1: ask

```text
import akka.pattern.ask

 val future = actor ? message             // => ask(actor, message)
 val future = actor ask message           // => ask(actor, message)
 val future = actor.ask(message)(timeout) // => ask(actor, message)(timeout)
```

### Example 2: ask

```text
val f = ask(worker, request)(timeout)
   f.map { response =>
     EnrichedMessage(response)
   } pipeTo nextActor
```

### Example 3: ask

```text
import akka.pattern.ask

 val future = selection ? message             // => ask(selection, message)
 val future = selection ask message           // => ask(selection, message)
 val future = selection.ask(message)(timeout) // => ask(selection, message)(timeout)
```

### Example 4: ask

```text
val f = ask(worker, request)(timeout)
   f.map { response =>
     EnrichedMessage(response)
   } pipeTo nextActor
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskableActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskSupport.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskSupport.html)*