---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:23:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRefFactory.html
title: ActorRefFactory
---

# ActorRefFactory

## Content

Package [akka.actor](package-summary.html)
## Interface ActorRefFactory

- All Known Subinterfaces:
`[AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor")`, `[ActorContext](ActorContext.html "interface in akka.actor")`

All Known Implementing Classes:
`[ActorSystem](ActorSystem.html "class in akka.actor")`, `[ExtendedActorSystem](ExtendedActorSystem.html "class in akka.actor")`

---

```
public interface ActorRefFactory
```

Interface implemented by ActorSystem and ActorContext, the only two places
 from which you can get fresh actors.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[actorOf](#actorOf(akka.actor.Props))​([Props](Props.html "class in akka.actor") props)` | Create new actor as child of this context and give it an automatically  generated name (currently similar to base64\-encoded integer count,  reversed and with \&ldquo;$\&rdquo; prepended, may change in the future). |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[actorOf](#actorOf(akka.actor.Props,java.lang.String))​([Props](Props.html "class in akka.actor") props,  java.lang.String name)` | Create new actor as child of this context with the given name, which must  not be null, empty or start with \&ldquo;$\&rdquo;. |
	| `[ActorSelection](ActorSelection.html "class in akka.actor")` | `[actorSelection](#actorSelection(akka.actor.ActorPath))​([ActorPath](ActorPath.html "interface in akka.actor") path)` | Construct an [`ActorSelection`](ActorSelection.html "class in akka.actor") from the given path, which is  parsed for wildcards (these are replaced by regular expressions  internally). |
	| `[ActorSelection](ActorSelection.html "class in akka.actor")` | `[actorSelection](#actorSelection(java.lang.String))​(java.lang.String path)` | Construct an [`ActorSelection`](ActorSelection.html "class in akka.actor") from the given path, which is  parsed for wildcards (these are replaced by regular expressions  internally). |
	| `scala.concurrent.ExecutionContextExecutor` | `[dispatcher](#dispatcher())()` | Returns the default MessageDispatcher associated with this ActorRefFactory |
	| `akka.actor.InternalActorRef` | `[guardian](#guardian())()` | Parent of all children created by this interface. |
	| `akka.actor.InternalActorRef` | `[lookupRoot](#lookupRoot())()` | INTERNAL API |
	| `[ActorRefProvider](ActorRefProvider.html "interface in akka.actor")` | `[provider](#provider())()` | INTERNAL API |
	| `void` | `[stop](#stop(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") actor)` | Stop the actor pointed to by the given [`ActorRef`](ActorRef.html "class in akka.actor"); this is  an asynchronous operation, i.e. |
	| `akka.actor.ActorSystemImpl` | `[systemImpl](#systemImpl())()` | INTERNAL API |

- - ### Method Detail
	
	
	
		- #### actorOf
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") actorOf​([Props](Props.html "class in akka.actor") props)
		```
		
		Create new actor as child of this context and give it an automatically
		 generated name (currently similar to base64\-encoded integer count,
		 reversed and with \&ldquo;$\&rdquo; prepended, may change in the future).
		 
		 See [`Props`](Props.html "class in akka.actor") for details on how to obtain a `Props` object.
		 
		
		
		
		Throws:
		`[ConfigurationException](../ConfigurationException.html "class in akka")` \- if deployment, dispatcher
		 or mailbox configuration is wrong
		`java.lang.UnsupportedOperationException` \- if invoked on an ActorSystem that
		 uses a custom user guardian
		- #### actorOf
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") actorOf​([Props](Props.html "class in akka.actor") props,
		                 java.lang.String name)
		```
		
		Create new actor as child of this context with the given name, which must
		 not be null, empty or start with \&ldquo;$\&rdquo;. If the given name is already in use,
		 an `InvalidActorNameException` is thrown.
		 
		 See [`Props`](Props.html "class in akka.actor") for details on how to obtain a `Props` object.
		 
		
		
		
		Throws:
		`[InvalidActorNameException](InvalidActorNameException.html "class in akka.actor")` \- if the given name is
		 invalid or already in use
		`[ConfigurationException](../ConfigurationException.html "class in akka")` \- if deployment, dispatcher
		 or mailbox configuration is wrong
		`java.lang.UnsupportedOperationException` \- if invoked on an ActorSystem that
		 uses a custom user guardian
		- #### actorSelection
		
		
		
		```
		[ActorSelection](ActorSelection.html "class in akka.actor") actorSelection​(java.lang.String path)
		```
		
		Construct an [`ActorSelection`](ActorSelection.html "class in akka.actor") from the given path, which is
		 parsed for wildcards (these are replaced by regular expressions
		 internally). No attempt is made to verify the existence of any part of
		 the supplied path, it is recommended to send a message and gather the
		 replies in order to resolve the matching set of actors.
		- #### actorSelection
		
		
		
		```
		[ActorSelection](ActorSelection.html "class in akka.actor") actorSelection​([ActorPath](ActorPath.html "interface in akka.actor") path)
		```
		
		Construct an [`ActorSelection`](ActorSelection.html "class in akka.actor") from the given path, which is
		 parsed for wildcards (these are replaced by regular expressions
		 internally). No attempt is made to verify the existence of any part of
		 the supplied path, it is recommended to send a message and gather the
		 replies in order to resolve the matching set of actors.
		- #### dispatcher
		
		
		
		```
		scala.concurrent.ExecutionContextExecutor dispatcher()
		```
		
		Returns the default MessageDispatcher associated with this ActorRefFactory
		- #### guardian
		
		
		
		```
		akka.actor.InternalActorRef guardian()
		```
		
		Parent of all children created by this interface.
		 
		 INTERNAL API
		- #### lookupRoot
		
		
		
		```
		akka.actor.InternalActorRef lookupRoot()
		```
		
		INTERNAL API
		- #### provider
		
		
		
		```
		[ActorRefProvider](ActorRefProvider.html "interface in akka.actor") provider()
		```
		
		INTERNAL API
		- #### stop
		
		
		
		```
		void stop​([ActorRef](ActorRef.html "class in akka.actor") actor)
		```
		
		Stop the actor pointed to by the given [`ActorRef`](ActorRef.html "class in akka.actor"); this is
		 an asynchronous operation, i.e. involves a message send.
		 If this method is applied to the `self` reference from inside an Actor
		 then that Actor is guaranteed to not process any further messages after
		 this call; please note that the processing of the current message will
		 continue, this method does not immediately terminate this actor.
		- #### systemImpl
		
		
		
		```
		akka.actor.ActorSystemImpl systemImpl()
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/ConfigurationException.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRefProvider.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/InvalidActorNameException.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRefFactory.html](https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRefFactory.html)*