---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityRef.html
title: EntityRef
---

# EntityRef

## Content

Package [akka.cluster.sharding.typed.scaladsl](package-summary.html)
## Interface EntityRef\<M\>

- All Superinterfaces:
`[RecipientRef](../../../../actor/typed/RecipientRef.html "interface in akka.actor.typed")<M>`

---

```
public interface EntityRef<M>
extends [RecipientRef](../../../../actor/typed/RecipientRef.html "interface in akka.actor.typed")<M>
```

A reference to an sharded Entity, which allows `ActorRef`\-like usage.
 
 An [`EntityRef`](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl") is NOT an `ActorRef`–by design–in order to be explicit about the fact that the life\-cycle
 of a sharded Entity is very different than a plain Actors. Most notably, this is shown by features of Entities
 such as re\-balancing (an active Entity to a different node) or passivation. Both of which are aimed to be completely
 transparent to users of such Entity. In other words, if this were to be a plain ActorRef, it would be possible to
 apply DeathWatch to it, which in turn would then trigger when the sharded Actor stopped, breaking the illusion that
 Entity refs are "always there". Please note that while not encouraged, it is possible to expose an Actor's `self`
`ActorRef` and watch it in case such notification is desired.
 Not for user extension.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.typed.[RecipientRef](../../../../actor/typed/RecipientRef.html "interface in akka.actor.typed")
		
		
		`[RecipientRef.RecipientRefOps](../../../../actor/typed/RecipientRef.RecipientRefOps.html "class in akka.actor.typed")<[T](../../../../actor/typed/RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")>, [RecipientRef.RecipientRefOps$](../../../../actor/typed/RecipientRef.RecipientRefOps$.html "class in akka.actor.typed")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `void` | `[$bang](#$bang(M))​([M](EntityRef.html "type parameter in EntityRef") msg)` | Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*  messaging semantics. |
	| `<Res> scala.concurrent.Future<Res>` | `[$qmark](#$qmark(scala.Function1,akka.util.Timeout))​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[M](EntityRef.html "type parameter in EntityRef")> message,  [Timeout](../../../../util/Timeout.html "class in akka.util") timeout)` | Allows to "ask" the [`EntityRef`](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl") for a reply. |
	| `[EntityRef](../javadsl/EntityRef.html "class in akka.cluster.sharding.typed.javadsl")<[M](EntityRef.html "type parameter in EntityRef")>` | `[asJava](#asJava())()` | INTERNAL API |
	| `<Res> scala.concurrent.Future<Res>` | `[ask](#ask(scala.Function1,akka.util.Timeout))​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[M](EntityRef.html "type parameter in EntityRef")> f,  [Timeout](../../../../util/Timeout.html "class in akka.util") timeout)` | Allows to "ask" the [`EntityRef`](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl") for a reply. |
	| `<Res> scala.concurrent.Future<Res>` | `[askWithStatus](#askWithStatus(scala.Function1,akka.util.Timeout))​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[M](EntityRef.html "type parameter in EntityRef")> f,  [Timeout](../../../../util/Timeout.html "class in akka.util") timeout)` | The same as [`<Res>ask(scala.Function1<akka.actor.typed.ActorRef<Res>,M>,akka.util.Timeout)`](#ask(scala.Function1,akka.util.Timeout)) but only for requests that result in a response of type [`StatusReply`](../../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `scala.Option<java.lang.String>` | `[dataCenter](#dataCenter())()` | Deprecated. Use Akka Distributed Cluster instead. |
	| `java.lang.String` | `[entityId](#entityId())()` | The identifier for the particular entity referenced by this EntityRef. |
	| `void` | `[tell](#tell(M))​([M](EntityRef.html "type parameter in EntityRef") msg)` | Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*  messaging semantics. |
	| `[EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<[M](EntityRef.html "type parameter in EntityRef")>` | `[typeKey](#typeKey())()` | The EntityTypeKey associated with this EntityRef. |

- - ### Method Detail
	
	
	
		- #### $bang
		
		
		
		```
		void $bang​([M](EntityRef.html "type parameter in EntityRef") msg)
		```
		
		Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*
		 messaging semantics.
		 
		 Example usage:
		 
		
		
		```
		
		 val target: EntityRef[String] = ...
		 target ! "Hello"
		 
		```
		- #### $qmark
		
		
		
		```
		<Res> scala.concurrent.Future<Res> $qmark​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[M](EntityRef.html "type parameter in EntityRef")> message,
		                                          [Timeout](../../../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Allows to "ask" the [`EntityRef`](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl") for a reply.
		 See [`AskPattern`](../../../../actor/typed/scaladsl/AskPattern.html "class in akka.actor.typed.scaladsl") for a complete write\-up of this pattern
		 
		 Note that if you are inside of an actor you should prefer `akka.actor.typed.scaladsl.ActorContext.ask`
		 as that provides better safety.
		 
		
		
		 Example usage:
		 
		
		
		```
		
		 case class Request(msg: String, replyTo: ActorRef[Reply])
		 case class Reply(msg: String)
		
		 implicit val timeout = Timeout(3.seconds)
		 val target: EntityRef[Request] = ...
		 val f: Future[Reply] = target ? (replyTo => Request("hello", replyTo))
		 
		```
		
		
		 Please note that an implicit [`Timeout`](../../../../util/Timeout.html "class in akka.util") must be available to use this pattern.
		 
		
		
		 Note: it is preferable to use the non\-symbolic ask method as it easier allows for wildcards for
		 the `replyTo: ActorRef`.
		- #### asJava
		
		
		
		```
		[EntityRef](../javadsl/EntityRef.html "class in akka.cluster.sharding.typed.javadsl")<[M](EntityRef.html "type parameter in EntityRef")> asJava()
		```
		
		INTERNAL API
		- #### ask
		
		
		
		```
		<Res> scala.concurrent.Future<Res> ask​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[M](EntityRef.html "type parameter in EntityRef")> f,
		                                       [Timeout](../../../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Allows to "ask" the [`EntityRef`](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl") for a reply.
		 See [`AskPattern`](../../../../actor/typed/scaladsl/AskPattern.html "class in akka.actor.typed.scaladsl") for a complete write\-up of this pattern
		 
		 Note that if you are inside of an actor you should prefer `akka.actor.typed.scaladsl.ActorContext.ask`
		 as that provides better safety.
		 
		
		
		 Example usage:
		 
		
		
		```
		
		 case class Request(msg: String, replyTo: ActorRef[Reply])
		 case class Reply(msg: String)
		
		 implicit val timeout = Timeout(3.seconds)
		 val target: EntityRef[Request] = ...
		 val f: Future[Reply] = target.ask(Request("hello", _))
		 
		```
		
		
		 Please note that an implicit [`Timeout`](../../../../util/Timeout.html "class in akka.util") must be available to use this pattern.
		- #### askWithStatus
		
		
		
		```
		<Res> scala.concurrent.Future<Res> askWithStatus​(scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[M](EntityRef.html "type parameter in EntityRef")> f,
		                                                 [Timeout](../../../../util/Timeout.html "class in akka.util") timeout)
		```
		
		The same as [`<Res>ask(scala.Function1<akka.actor.typed.ActorRef<Res>,M>,akka.util.Timeout)`](#ask(scala.Function1,akka.util.Timeout)) but only for requests that result in a response of type [`StatusReply`](../../../../pattern/StatusReply.html "class in akka.pattern").
		 If the response is a `akka.pattern.StatusReply.Success` the returned future is completed successfully with the wrapped response.
		 If the status response is a `akka.pattern.StatusReply.Error` the returned future will be failed with the
		 exception in the error (normally a [`StatusReply.ErrorMessage`](../../../../pattern/StatusReply.ErrorMessage.html "class in akka.pattern")).
		- #### dataCenter
		
		
		
		```
		scala.Option<java.lang.String> dataCenter()
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		
		The specified datacenter of the incarnation of the particular entity referenced by this EntityRef,
		 if a datacenter was specified.
		- #### entityId
		
		
		
		```
		java.lang.String entityId()
		```
		
		The identifier for the particular entity referenced by this EntityRef.
		 
		
		
		
		```
		
		 // given sharding, typeKey
		 sharding.entityRefFor(typeKey, "someId").entityId == "someId"  // always true
		 
		```
		- #### tell
		
		
		
		```
		void tell​([M](EntityRef.html "type parameter in EntityRef") msg)
		```
		
		Send a message to the entity referenced by this EntityRef using \*at\-most\-once\*
		 messaging semantics.
		 
		 Example usage:
		 
		
		
		```
		
		 val target: EntityRef[String] = ...
		 target.tell("Hello")
		 
		```
		
		
		Specified by:
		`[tell](../../../../actor/typed/RecipientRef.html#tell(T))` in interface `[RecipientRef](../../../../actor/typed/RecipientRef.html "interface in akka.actor.typed")<[M](EntityRef.html "type parameter in EntityRef")>`
		- #### typeKey
		
		
		
		```
		[EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<[M](EntityRef.html "type parameter in EntityRef")> typeKey()
		```
		
		The EntityTypeKey associated with this EntityRef.

## Code Examples

### Example 1: $bang

```text
val target: EntityRef[String] = ...
 target ! "Hello"
```

### Example 2: $qmark

```text
case class Request(msg: String, replyTo: ActorRef[Reply])
 case class Reply(msg: String)

 implicit val timeout = Timeout(3.seconds)
 val target: EntityRef[Request] = ...
 val f: Future[Reply] = target ? (replyTo => Request("hello", replyTo))
```

### Example 3: ask

```text
case class Request(msg: String, replyTo: ActorRef[Reply])
 case class Reply(msg: String)

 implicit val timeout = Timeout(3.seconds)
 val target: EntityRef[Request] = ...
 val f: Future[Reply] = target.ask(Request("hello", _))
```

### Example 4: entityId

```text
// given sharding, typeKey
 sharding.entityRefFor(typeKey, "someId").entityId == "someId"  // always true
```

### Example 5: tell

```text
val target: EntityRef[String] = ...
 target.tell("Hello")
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.RecipientRefOps$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.RecipientRefOps.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.ErrorMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityRef.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityRef.html)*