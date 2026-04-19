---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:51:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
title: BehaviorTestKit
---

# BehaviorTestKit

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Interface BehaviorTestKit\<T\>

- ---

```
public interface BehaviorTestKit<T>
```

Used for synchronous testing [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed")s. Stores all effects e.g. Spawning of children,
 watching and offers access to what effects have taken place.
 
 For asynchronous testing of `Behavior`s running see [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")

 Not for user extension. See `BehaviorTestKit.apply` factory methods

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<U> [TestInbox](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl")<U>` | `[childInbox](#childInbox(akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> child)` | Get the child inbox for the child ActorRef, or fail if there is no such child. |
	| `<U> [TestInbox](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl")<U>` | `[childInbox](#childInbox(java.lang.String))​(java.lang.String name)` | Get the child inbox for the child with the given name, or fail if there is no child with the given name  spawned |
	| `<U> [BehaviorTestKit](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")<U>` | `[childTestKit](#childTestKit(akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> child)` | Get the [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed") testkit for the given child [`ActorRef`](../../../typed/ActorRef.html "interface in akka.actor.typed"). |
	| `void` | `[clearLog](#clearLog())()` | Clear the log entries |
	| `[TypedActorContext](../../../typed/TypedActorContext.html "interface in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")>` | `[context](#context())()` |  |
	| `[Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")>` | `[currentBehavior](#currentBehavior())()` | The current behavior, can change any time `run` is called |
	| `void` | `[expectEffect](#expectEffect(akka.actor.testkit.typed.Effect))​([Effect](../Effect.html "class in akka.actor.testkit.typed") expectedEffect)` | Asserts that the oldest effect is the expectedEffect. |
	| `<R> R` | `[expectEffectPF](#expectEffectPF(scala.PartialFunction))​(scala.PartialFunction<[Effect](../Effect.html "class in akka.actor.testkit.typed"),​R> f)` | Asserts that the oldest effect matches the given partial function. |
	| `<E extends [Effect](../Effect.html "class in akka.actor.testkit.typed")>E` | `[expectEffectType](#expectEffectType(scala.reflect.ClassTag))​(scala.reflect.ClassTag<E> classTag)` | Asserts that the oldest effect is of type T. |
	| `boolean` | `[hasEffects](#hasEffects())()` | Returns if there have been any effects. |
	| `boolean` | `[isAlive](#isAlive())()` | Is the current behavior alive or stopped |
	| `scala.collection.immutable.Seq<[CapturedLogEvent](../CapturedLogEvent.html "class in akka.actor.testkit.typed")>` | `[logEntries](#logEntries())()` | Returns all the `CapturedLogEvent` issued by this behavior(s) |
	| `[TestInbox](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl")<[Receptionist.Command](../../../typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")>` | `[receptionistInbox](#receptionistInbox())()` | The receptionist inbox contains messages sent to `system.receptionist` |
	| `[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")>` | `[ref](#ref())()` | The self reference of the actor living inside this testkit. |
	| `scala.collection.immutable.Seq<[Effect](../Effect.html "class in akka.actor.testkit.typed")>` | `[retrieveAllEffects](#retrieveAllEffects())()` | Requests all the effects. |
	| `[Effect](../Effect.html "class in akka.actor.testkit.typed")` | `[retrieveEffect](#retrieveEffect())()` | Requests the oldest `Effect` or [`Effect.NoEffects`](../Effect.NoEffects.html "class in akka.actor.testkit.typed") if no effects  have taken place. |
	| `[Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")>` | `[returnedBehavior](#returnedBehavior())()` | Returns the current behavior as it was returned from processing the previous message. |
	| `void` | `[run](#run(T))​([T](BehaviorTestKit.html "type parameter in BehaviorTestKit") message)` | Send the message to the behavior and record any `Effect`s |
	| `<Res> [ReplyInbox](ReplyInbox.html "interface in akka.actor.testkit.typed.scaladsl")<Res>` | `[runAsk](#runAsk(scala.Function1))​(scala.Function1<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> f)` | Constructs a message using the provided function to inject a single\-use "reply to" [`ActorRef`](../../../typed/ActorRef.html "interface in akka.actor.typed"),  and sends the constructed message to the behavior, recording any `Effect`s. |
	| `<Res> [StatusReplyInbox](StatusReplyInbox.html "interface in akka.actor.testkit.typed.scaladsl")<Res>` | `[runAskWithStatus](#runAskWithStatus(scala.Function1))​(scala.Function1<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> f)` | The same as [`<Res>runAsk(scala.Function1<akka.actor.typed.ActorRef<Res>,T>)`](#runAsk(scala.Function1)) but only for requests that result in a response of type [`StatusReply`](../../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `void` | `[runOne](#runOne())()` | Send the first message in the selfInbox to the behavior and run it, recording `Effect`s. |
	| `[TestInbox](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")>` | `[selfInbox](#selfInbox())()` | The self inbox contains messages the behavior sent to `context.self` |
	| `void` | `[signal](#signal(akka.actor.typed.Signal))​([Signal](../../../typed/Signal.html "interface in akka.actor.typed") signal)` | Send the signal to the behavior and record any `Effect`s |

- - ### Method Detail
	
	
	
		- #### runAsk
		
		
		
		```
		<Res> [ReplyInbox](ReplyInbox.html "interface in akka.actor.testkit.typed.scaladsl")<Res> runAsk​(scala.Function1<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> f)
		```
		
		Constructs a message using the provided function to inject a single\-use "reply to" [`ActorRef`](../../../typed/ActorRef.html "interface in akka.actor.typed"),
		 and sends the constructed message to the behavior, recording any `Effect`s.
		 
		 The returned [`ReplyInbox`](ReplyInbox.html "interface in akka.actor.testkit.typed.scaladsl") allows the message sent to the "reply to" `ActorRef` to be asserted on.
		- #### runAskWithStatus
		
		
		
		```
		<Res> [StatusReplyInbox](StatusReplyInbox.html "interface in akka.actor.testkit.typed.scaladsl")<Res> runAskWithStatus​(scala.Function1<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> f)
		```
		
		The same as [`<Res>runAsk(scala.Function1<akka.actor.typed.ActorRef<Res>,T>)`](#runAsk(scala.Function1)) but only for requests that result in a response of type [`StatusReply`](../../../../pattern/StatusReply.html "class in akka.pattern").
		- #### context
		
		
		
		```
		[TypedActorContext](../../../typed/TypedActorContext.html "interface in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> context()
		```
		- #### retrieveEffect
		
		
		
		```
		[Effect](../Effect.html "class in akka.actor.testkit.typed") retrieveEffect()
		```
		
		Requests the oldest `Effect` or [`Effect.NoEffects`](../Effect.NoEffects.html "class in akka.actor.testkit.typed") if no effects
		 have taken place. The effect is consumed, subsequent calls won't
		 will not include this effect.
		- #### childInbox
		
		
		
		```
		<U> [TestInbox](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl")<U> childInbox​(java.lang.String name)
		```
		
		Get the child inbox for the child with the given name, or fail if there is no child with the given name
		 spawned
		- #### childInbox
		
		
		
		```
		<U> [TestInbox](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl")<U> childInbox​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> child)
		```
		
		Get the child inbox for the child ActorRef, or fail if there is no such child.
		- #### childTestKit
		
		
		
		```
		<U> [BehaviorTestKit](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")<U> childTestKit​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> child)
		```
		
		Get the [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed") testkit for the given child [`ActorRef`](../../../typed/ActorRef.html "interface in akka.actor.typed").
		- #### selfInbox
		
		
		
		```
		[TestInbox](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> selfInbox()
		```
		
		The self inbox contains messages the behavior sent to `context.self`
		- #### ref
		
		
		
		```
		[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> ref()
		```
		
		The self reference of the actor living inside this testkit.
		- #### retrieveAllEffects
		
		
		
		```
		scala.collection.immutable.Seq<[Effect](../Effect.html "class in akka.actor.testkit.typed")> retrieveAllEffects()
		```
		
		Requests all the effects. The effects are consumed, subsequent calls will only
		 see new effects.
		- #### hasEffects
		
		
		
		```
		boolean hasEffects()
		```
		
		Returns if there have been any effects.
		- #### expectEffect
		
		
		
		```
		void expectEffect​([Effect](../Effect.html "class in akka.actor.testkit.typed") expectedEffect)
		```
		
		Asserts that the oldest effect is the expectedEffect. Removing it from
		 further assertions.
		- #### expectEffectType
		
		
		
		```
		<E extends [Effect](../Effect.html "class in akka.actor.testkit.typed")> E expectEffectType​(scala.reflect.ClassTag<E> classTag)
		```
		
		Asserts that the oldest effect is of type T. Consumes and returns the concrete effect for
		 further direct assertions.
		- #### expectEffectPF
		
		
		
		```
		<R> R expectEffectPF​(scala.PartialFunction<[Effect](../Effect.html "class in akka.actor.testkit.typed"),​R> f)
		```
		
		Asserts that the oldest effect matches the given partial function.
		- #### currentBehavior
		
		
		
		```
		[Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> currentBehavior()
		```
		
		The current behavior, can change any time `run` is called
		- #### returnedBehavior
		
		
		
		```
		[Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> returnedBehavior()
		```
		
		Returns the current behavior as it was returned from processing the previous message.
		 For example if `Behaviors.unhandled` is returned it will be kept here, but not in
		 [`currentBehavior()`](#currentBehavior()).
		- #### isAlive
		
		
		
		```
		boolean isAlive()
		```
		
		Is the current behavior alive or stopped
		- #### run
		
		
		
		```
		void run​([T](BehaviorTestKit.html "type parameter in BehaviorTestKit") message)
		```
		
		Send the message to the behavior and record any `Effect`s
		- #### runOne
		
		
		
		```
		void runOne()
		```
		
		Send the first message in the selfInbox to the behavior and run it, recording `Effect`s.
		- #### signal
		
		
		
		```
		void signal​([Signal](../../../typed/Signal.html "interface in akka.actor.typed") signal)
		```
		
		Send the signal to the behavior and record any `Effect`s
		- #### logEntries
		
		
		
		```
		scala.collection.immutable.Seq<[CapturedLogEvent](../CapturedLogEvent.html "class in akka.actor.testkit.typed")> logEntries()
		```
		
		Returns all the `CapturedLogEvent` issued by this behavior(s)
		- #### clearLog
		
		
		
		```
		void clearLog()
		```
		
		Clear the log entries
		- #### receptionistInbox
		
		
		
		```
		[TestInbox](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl")<[Receptionist.Command](../../../typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")> receptionistInbox()
		```
		
		The receptionist inbox contains messages sent to `system.receptionist`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/CapturedLogEvent.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.NoEffects.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ReplyInbox.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/TestInbox.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.Command.html
- https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html)*