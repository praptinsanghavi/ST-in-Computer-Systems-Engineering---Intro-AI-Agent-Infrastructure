---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityRef.html
title: EntityRef
---

# EntityRef

## Content

Package [akka.cluster.sharding.typed.javadsl](package-summary.html)
## Class EntityRef\<M\>

- java.lang.Object
- - akka.cluster.sharding.typed.javadsl.EntityRef\<M\>

- All Implemented Interfaces:
`[RecipientRef](../../../../actor/typed/RecipientRef.html "interface in akka.actor.typed")<M>`

---

```
public abstract class EntityRef<M>
extends java.lang.Object
implements [RecipientRef](../../../../actor/typed/RecipientRef.html "interface in akka.actor.typed")<M>
```

A reference to an sharded Entity, which allows `ActorRef`\-like usage.
 
 An [`EntityRef`](EntityRef.html "class in akka.cluster.sharding.typed.javadsl") is NOT an `ActorRef`–by design–in order to be explicit about the fact that the life\-cycle
 of a sharded Entity is very different than a plain Actor. Most notably, this is shown by features of Entities
 such as re\-balancing (an active Entity to a different node) or passivation. Both of which are aimed to be completely
 transparent to users of such Entity. In other words, if this were to be a plain ActorRef, it would be possible to
 apply DeathWatch to it, which in turn would then trigger when the sharded Actor stopped, breaking the illusion that
 Entity refs are "always there". Please note that while not encouraged, it is possible to expose an Actor's `self`
`ActorRef` and watch it in case such notification is desired.
 

 Not for user extension.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.typed.[RecipientRef](../../../../actor/typed/RecipientRef.html "interface in akka.actor.typed")
		
		
		`[RecipientRef.RecipientRefOps](../../../../actor/typed/RecipientRef.RecipientRefOps.html "class in akka.actor.typed")<[T](../../../../actor/typed/RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")>, [RecipientRef.RecipientRefOps$](../../../../actor/typed/RecipientRef.RecipientRefOps$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityRef](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `abstract <Res> java.util.concurrent.CompletionStage<Res>` | `[ask](#ask(akka.japi.function.Function,java.time.Duration))​([Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[M](EntityRef.html "type parameter in EntityRef")> message,  java.time.Duration timeout)` | Allows to "ask" the [`EntityRef`](EntityRef.html "class in akka.cluster.sharding.typed.javadsl") for a reply. |
	| `abstract <Res> java.util.concurrent.CompletionStage<Res>` | `[askWithStatus](#askWithStatus(scala.Function1,java.time.Duration))​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[M](EntityRef.html "type parameter in EntityRef")> f,  java.time.Duration timeout)` | The same as [`<Res>ask(akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,M>,java.time.Duration)`](#ask(akka.japi.function.Function,java.time.Duration)) but only for requests that result in a response of type [`StatusReply`](../../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `java.util.Optional<java.lang.String>` | `[getDataCenter](#getDataCenter())()` | Deprecated. Use Akka Distributed Cluster instead. |
	| `java.lang.String` | `[getEntityId](#getEntityId())()` | The identifier for the particular entity referenced by this EntityRef. |
	| `[EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<[M](EntityRef.html "type parameter in EntityRef")>` | `[getTypeKey](#getTypeKey())()` | The name of the EntityTypeKey associated with this EntityRef |
	| `abstract void` | `[tell](#tell(M))​([M](EntityRef.html "type parameter in EntityRef") msg)` | Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*  messaging semantics. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EntityRef
		
		
		
		```
		public EntityRef()
		```

	- ### Method Detail
	
	
	
		- #### ask
		
		
		
		```
		public abstract <Res> java.util.concurrent.CompletionStage<Res> ask​([Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[M](EntityRef.html "type parameter in EntityRef")> message,
		                                                                    java.time.Duration timeout)
		```
		
		Allows to "ask" the [`EntityRef`](EntityRef.html "class in akka.cluster.sharding.typed.javadsl") for a reply.
		 See [`AskPattern`](../../../../actor/typed/javadsl/AskPattern.html "class in akka.actor.typed.javadsl") for a complete write\-up of this pattern
		 
		 Note that if you are inside of an actor you should prefer `akka.actor.typed.javadsl.ActorContext.ask`
		 as that provides better safety.
		- #### askWithStatus
		
		
		
		```
		public abstract <Res> java.util.concurrent.CompletionStage<Res> askWithStatus​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[M](EntityRef.html "type parameter in EntityRef")> f,
		                                                                              java.time.Duration timeout)
		```
		
		The same as [`<Res>ask(akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,M>,java.time.Duration)`](#ask(akka.japi.function.Function,java.time.Duration)) but only for requests that result in a response of type [`StatusReply`](../../../../pattern/StatusReply.html "class in akka.pattern").
		 If the response is a [`StatusReply.success(T)`](../../../../pattern/StatusReply.html#success(T)) the returned future is completed successfully with the wrapped response.
		 If the status response is a [`StatusReply.error(java.lang.String)`](../../../../pattern/StatusReply.html#error(java.lang.String)) the returned future will be failed with the
		 exception in the error (normally a [`StatusReply.ErrorMessage`](../../../../pattern/StatusReply.ErrorMessage.html "class in akka.pattern")).
		- #### getDataCenter
		
		
		
		```
		public java.util.Optional<java.lang.String> getDataCenter()
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		
		The specified datacenter of the incarnation of the particular entity referenced by this EntityRef,
		 if a datacenter was specified.
		- #### getEntityId
		
		
		
		```
		public java.lang.String getEntityId()
		```
		
		The identifier for the particular entity referenced by this EntityRef.
		- #### getTypeKey
		
		
		
		```
		public [EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<[M](EntityRef.html "type parameter in EntityRef")> getTypeKey()
		```
		
		The name of the EntityTypeKey associated with this EntityRef
		- #### tell
		
		
		
		```
		public abstract void tell​([M](EntityRef.html "type parameter in EntityRef") msg)
		```
		
		Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*
		 messaging semantics.
		
		Specified by:
		`[tell](../../../../actor/typed/RecipientRef.html#tell(T))` in interface `[RecipientRef](../../../../actor/typed/RecipientRef.html "interface in akka.actor.typed")<[M](EntityRef.html "type parameter in EntityRef")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/AskPattern.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/StatusReply.ErrorMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityRef.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityRef.html)*