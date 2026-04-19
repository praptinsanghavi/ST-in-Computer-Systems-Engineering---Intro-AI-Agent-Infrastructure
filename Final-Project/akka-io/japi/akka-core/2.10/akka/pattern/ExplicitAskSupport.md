---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:58:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ExplicitAskSupport.html
title: ExplicitAskSupport
---

# ExplicitAskSupport

## Content

Package [akka.pattern](package-summary.html)
## Interface ExplicitAskSupport

- ---

```
public interface ExplicitAskSupport
```

This object contains implementation details of the \&ldquo;ask\&rdquo; pattern,
 which can be combined with "replyTo" pattern.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern")` | `[ask](#ask(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)` | Import this implicit conversion to gain `?` and `ask` methods on  [`ActorRef`](../actor/ActorRef.html "class in akka.actor"), which will defer to the  `ask(actorRef, askSender => message)(timeout)` method defined here. |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorRef,scala.Function1,akka.actor.ActorRef,akka.util.Timeout))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorRef,scala.Function1,akka.util.Timeout))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | Sends a message asynchronously and returns a `Future`  holding the eventual reply message; this means that the target actor  needs to send the result to the `sender` reference provided. |
	| `[ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern")` | `[ask](#ask(akka.actor.ActorSelection))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection)` | Import this implicit conversion to gain `?` and `ask` methods on  [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor"), which will defer to the  `ask(actorSelection, message)(timeout)` method defined here. |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorSelection,scala.Function1,akka.actor.ActorRef,akka.util.Timeout))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(akka.actor.ActorSelection,scala.Function1,akka.util.Timeout))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | Sends a message asynchronously and returns a `Future`  holding the eventual reply message; this means that the target actor  needs to send the result to the `sender` reference provided. |

- - ### Method Detail
	
	
	
		- #### ask
		
		
		
		```
		[ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") ask​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)
		```
		
		Import this implicit conversion to gain `?` and `ask` methods on
		 [`ActorRef`](../actor/ActorRef.html "class in akka.actor"), which will defer to the
		 `ask(actorRef, askSender => message)(timeout)` method defined here.
		 
		
		
		
		```
		
		 import akka.pattern.ask
		
		 // same as `ask(actor, askSender => Request(askSender))`
		 val future = actor ? { askSender => Request(askSender) }
		
		 // same as `ask(actor, Request(_))`
		 val future = actor ? (Request(_))
		
		 // same as `ask(actor, Request(_))(timeout)`
		 val future = actor ? (Request(_))(timeout)
		 
		```
		
		
		 All of the above use a required implicit [`Timeout`](../util/Timeout.html "class in akka.util") and optional implicit
		 sender [`ActorRef`](../actor/ActorRef.html "class in akka.actor").
		- #### ask
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> ask​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,
		                                              scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
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
		
		 val f = ask(worker, replyTo => Request(replyTo))(timeout)
		 f.map { response =>
		   EnrichedMessage(response)
		 } pipeTo nextActor
		 
		```
		- #### ask
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> ask​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef,
		                                              scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
		                                              [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,
		                                              [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		- #### ask
		
		
		
		```
		[ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") ask​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection)
		```
		
		Import this implicit conversion to gain `?` and `ask` methods on
		 [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor"), which will defer to the
		 `ask(actorSelection, message)(timeout)` method defined here.
		 
		
		
		
		```
		
		 import akka.pattern.ask
		
		 // same as `ask(selection, askSender => Request(askSender))`
		 val future = selection ? { askSender => Request(askSender) }
		
		 // same as `ask(selection, Request(_))`
		 val future = selection ? (Request(_))
		
		 // same as `ask(selection, Request(_))(timeout)`
		 val future = selection ? (Request(_))(timeout)
		 
		```
		
		
		 All of the above use a required implicit [`Timeout`](../util/Timeout.html "class in akka.util") and optional implicit
		 sender [`ActorRef`](../actor/ActorRef.html "class in akka.actor").
		- #### ask
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> ask​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection,
		                                              scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
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
		
		 val f = ask(worker, replyTo => Request(replyTo))(timeout)
		 f.map { response =>
		   EnrichedMessage(response)
		 } pipeTo nextActor
		 
		```
		- #### ask
		
		
		
		```
		scala.concurrent.Future<java.lang.Object> ask​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSelection,
		                                              scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
		                                              [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,
		                                              [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```

## Code Examples

### Example 1: ask

```text
import akka.pattern.ask

 // same as `ask(actor, askSender => Request(askSender))`
 val future = actor ? { askSender => Request(askSender) }

 // same as `ask(actor, Request(_))`
 val future = actor ? (Request(_))

 // same as `ask(actor, Request(_))(timeout)`
 val future = actor ? (Request(_))(timeout)
```

### Example 2: ask

```text
val f = ask(worker, replyTo => Request(replyTo))(timeout)
 f.map { response =>
   EnrichedMessage(response)
 } pipeTo nextActor
```

### Example 3: ask

```text
import akka.pattern.ask

 // same as `ask(selection, askSender => Request(askSender))`
 val future = selection ? { askSender => Request(askSender) }

 // same as `ask(selection, Request(_))`
 val future = selection ? (Request(_))

 // same as `ask(selection, Request(_))(timeout)`
 val future = selection ? (Request(_))(timeout)
```

### Example 4: ask

```text
val f = ask(worker, replyTo => Request(replyTo))(timeout)
 f.map { response =>
   EnrichedMessage(response)
 } pipeTo nextActor
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ExplicitlyAskableActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ExplicitAskSupport.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/ExplicitAskSupport.html)*