---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
title: BehaviorTestKit
---

# BehaviorTestKit

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Class BehaviorTestKit\<T\>

- java.lang.Object
- - akka.actor.testkit.typed.javadsl.BehaviorTestKit\<T\>

- ---

```
public abstract class BehaviorTestKit<T>
extends java.lang.Object
```

Used for synchronous testing [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed")s. Stores all effects e.g. Spawning of children,
 watching and offers access to what effects have taken place.
 
 Not for user extension or instantiation. See `BehaviorTestKit.create` factory methods
 

 For asynchronous testing of `Behavior`s running see [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BehaviorTestKit](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static com.typesafe.config.Config` | `[applicationTestConfig](#applicationTestConfig())()` | JAVA API |
	| `abstract <U> [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<U>` | `[childInbox](#childInbox(akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> child)` | Get the child inbox for the child with the given name, or fail if there is no child with the given name  spawned |
	| `abstract <U> [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<U>` | `[childInbox](#childInbox(java.lang.String))​(java.lang.String name)` | Get the child inbox for the child with the given name, or fail if there is no child with the given name  spawned |
	| `abstract <U> [BehaviorTestKit](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")<U>` | `[childTestKit](#childTestKit(akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> child)` | Get the [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed") testkit for the given child [`ActorRef`](../../../typed/ActorRef.html "interface in akka.actor.typed"). |
	| `abstract void` | `[clearLog](#clearLog())()` | Clear the log entries |
	| `static <T> [BehaviorTestKit](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")<T>` | `[create](#create(akka.actor.typed.Behavior))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior)` | JAVA API |
	| `static <T> [BehaviorTestKit](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior,  java.lang.String name)` | JAVA API |
	| `static <T> [BehaviorTestKit](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String,com.typesafe.config.Config))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior,  java.lang.String name,  com.typesafe.config.Config config)` | JAVA API |
	| `abstract [Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")>` | `[currentBehavior](#currentBehavior())()` | The current behavior, can change any time `run` is called |
	| `abstract void` | `[expectEffect](#expectEffect(akka.actor.testkit.typed.Effect))​([Effect](../Effect.html "class in akka.actor.testkit.typed") expectedEffect)` | Asserts that the oldest effect is the expectedEffect. |
	| `abstract <U extends [Effect](../Effect.html "class in akka.actor.testkit.typed")>U` | `[expectEffectClass](#expectEffectClass(java.lang.Class))​(java.lang.Class<U> effectClass)` | Asserts that the oldest effect is an instance of of class T. |
	| `abstract java.util.List<[Effect](../Effect.html "class in akka.actor.testkit.typed")>` | `[getAllEffects](#getAllEffects())()` | Requests all the effects. |
	| `abstract java.util.List<[CapturedLogEvent](../CapturedLogEvent.html "class in akka.actor.testkit.typed")>` | `[getAllLogEntries](#getAllLogEntries())()` | Returns all the `CapturedLogEvent` issued by this behavior(s) |
	| `abstract [Effect](../Effect.html "class in akka.actor.testkit.typed")` | `[getEffect](#getEffect())()` | Requests the oldest `Effect` or `akka.actor.testkit.typed.javadsl.Effects.noEffects` if no effects  have taken place. |
	| `[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")>` | `[getRef](#getRef())()` | The self reference of the actor living inside this testkit. |
	| `abstract boolean` | `[hasEffects](#hasEffects())()` | Returns if there have been any effects. |
	| `abstract boolean` | `[isAlive](#isAlive())()` | Is the current behavior alive or stopped |
	| `abstract [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<[Receptionist.Command](../../../typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")>` | `[receptionistInbox](#receptionistInbox())()` | The receptionist inbox contains messages sent to `system.receptionist` |
	| `abstract [Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")>` | `[returnedBehavior](#returnedBehavior())()` | Returns the current behavior as it was returned from processing the previous message. |
	| `abstract void` | `[run](#run(T))​([T](BehaviorTestKit.html "type parameter in BehaviorTestKit") message)` | Send the message to the behavior and record any `Effect`s |
	| `abstract <Res> [ReplyInbox](ReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")<Res>` | `[runAsk](#runAsk(akka.japi.function.Function))​([Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> messageFactory)` | Constructs a message using the provided 'messageFactory' to inject a single\-use "reply to"  [`ActorRef`](../../../typed/ActorRef.html "interface in akka.actor.typed"), and sends the constructed message to the behavior, recording any `Effect`s. |
	| `<Res> [ReplyInbox](ReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")<Res>` | `[runAsk](#runAsk(java.lang.Class,akka.japi.function.Function))​(java.lang.Class<Res> responseClass,  [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> messageFactory)` | The same as [`<Res>runAsk(akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,T>)`](#runAsk(akka.japi.function.Function)), but with the response class specified. |
	| `abstract <Res> [StatusReplyInbox](StatusReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")<Res>` | `[runAskWithStatus](#runAskWithStatus(akka.japi.function.Function))​([Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> messageFactory)` | The same as [`<Res>runAsk(akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,T>)`](#runAsk(akka.japi.function.Function)) but only for requests that result in a response of type [`StatusReply`](../../../../pattern/StatusReply.html "class in akka.pattern"). |
	| `<Res> [StatusReplyInbox](StatusReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")<Res>` | `[runAskWithStatus](#runAskWithStatus(java.lang.Class,akka.japi.function.Function))​(java.lang.Class<Res> responseClass,  [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> messageFactory)` | The same as [`<Res>runAskWithStatus(akka.japi.function.Function<akka.actor.typed.ActorRef<akka.pattern.StatusReply<Res>>,T>)`](#runAskWithStatus(akka.japi.function.Function)), but with the response class specified. |
	| `abstract void` | `[runOne](#runOne())()` | Send the first message in the selfInbox to the behavior and run it, recording `Effect`s. |
	| `abstract [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")>` | `[selfInbox](#selfInbox())()` | The self inbox contains messages the behavior sent to `context.self` |
	| `abstract void` | `[signal](#signal(akka.actor.typed.Signal))​([Signal](../../../typed/Signal.html "interface in akka.actor.typed") signal)` | Send the signal to the beheavior and record any `Effect`s |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BehaviorTestKit
		
		
		
		```
		public BehaviorTestKit()
		```

	- ### Method Detail
	
	
	
		- #### applicationTestConfig
		
		
		
		```
		public static com.typesafe.config.Config applicationTestConfig()
		```
		
		JAVA API
		- #### create
		
		
		
		```
		public static <T> [BehaviorTestKit](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")<T> create​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior,
		                                            java.lang.String name,
		                                            com.typesafe.config.Config config)
		```
		
		JAVA API
		- #### create
		
		
		
		```
		public static <T> [BehaviorTestKit](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")<T> create​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior,
		                                            java.lang.String name)
		```
		
		JAVA API
		- #### create
		
		
		
		```
		public static <T> [BehaviorTestKit](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")<T> create​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior)
		```
		
		JAVA API
		- #### runAsk
		
		
		
		```
		public abstract <Res> [ReplyInbox](ReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")<Res> runAsk​([Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> messageFactory)
		```
		
		Constructs a message using the provided 'messageFactory' to inject a single\-use "reply to"
		 [`ActorRef`](../../../typed/ActorRef.html "interface in akka.actor.typed"), and sends the constructed message to the behavior, recording any `Effect`s.
		 
		 The returned [`ReplyInbox`](ReplyInbox.html "interface in akka.actor.testkit.typed.javadsl") allows the message sent to the "reply to" `ActorRef` to be asserted on.
		- #### runAsk
		
		
		
		```
		public <Res> [ReplyInbox](ReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")<Res> runAsk​(java.lang.Class<Res> responseClass,
		                                    [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<Res>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> messageFactory)
		```
		
		The same as [`<Res>runAsk(akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,T>)`](#runAsk(akka.japi.function.Function)), but with the response class specified. This improves type inference in Java
		 when asserting on the reply in the same statement as the `runAsk` as in:
		 
		`testkit.runAsk(Done.class, DoSomethingCommand::new).expectReply(Done.getInstance());` 
		
		
		
		 If explicitly saving the [`ReplyInbox`](ReplyInbox.html "interface in akka.actor.testkit.typed.javadsl") in a variable, the version without the class may be preferred.
		- #### runAskWithStatus
		
		
		
		```
		public abstract <Res> [StatusReplyInbox](StatusReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")<Res> runAskWithStatus​([Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> messageFactory)
		```
		
		The same as [`<Res>runAsk(akka.japi.function.Function<akka.actor.typed.ActorRef<Res>,T>)`](#runAsk(akka.japi.function.Function)) but only for requests that result in a response of type [`StatusReply`](../../../../pattern/StatusReply.html "class in akka.pattern").
		- #### runAskWithStatus
		
		
		
		```
		public <Res> [StatusReplyInbox](StatusReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")<Res> runAskWithStatus​(java.lang.Class<Res> responseClass,
		                                                    [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../../pattern/StatusReply.html "class in akka.pattern")<Res>>,​[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> messageFactory)
		```
		
		The same as [`<Res>runAskWithStatus(akka.japi.function.Function<akka.actor.typed.ActorRef<akka.pattern.StatusReply<Res>>,T>)`](#runAskWithStatus(akka.japi.function.Function)), but with the response class specified. This improves type inference in
		 Java when asserting on the reply in the same statement as the `runAskWithStatus` as in:
		 
		`testkit.runAskWithStatus(Done.class, DoSomethingWithStatusCommand::new).expectValue(Done.getInstance());` 
		
		
		
		 If explicitly saving the [`StatusReplyInbox`](StatusReplyInbox.html "interface in akka.actor.testkit.typed.javadsl") in a variable, the version without the class may be preferred.
		- #### getEffect
		
		
		
		```
		public abstract [Effect](../Effect.html "class in akka.actor.testkit.typed") getEffect()
		```
		
		Requests the oldest `Effect` or `akka.actor.testkit.typed.javadsl.Effects.noEffects` if no effects
		 have taken place. The effect is consumed, subsequent calls won't
		 will not include this effect.
		- #### childInbox
		
		
		
		```
		public abstract <U> [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<U> childInbox​(java.lang.String name)
		```
		
		Get the child inbox for the child with the given name, or fail if there is no child with the given name
		 spawned
		- #### childInbox
		
		
		
		```
		public abstract <U> [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<U> childInbox​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> child)
		```
		
		Get the child inbox for the child with the given name, or fail if there is no child with the given name
		 spawned
		- #### childTestKit
		
		
		
		```
		public abstract <U> [BehaviorTestKit](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")<U> childTestKit​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> child)
		```
		
		Get the [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed") testkit for the given child [`ActorRef`](../../../typed/ActorRef.html "interface in akka.actor.typed").
		- #### selfInbox
		
		
		
		```
		public abstract [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> selfInbox()
		```
		
		The self inbox contains messages the behavior sent to `context.self`
		- #### getRef
		
		
		
		```
		public [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> getRef()
		```
		
		The self reference of the actor living inside this testkit.
		- #### getAllEffects
		
		
		
		```
		public abstract java.util.List<[Effect](../Effect.html "class in akka.actor.testkit.typed")> getAllEffects()
		```
		
		Requests all the effects. The effects are consumed, subsequent calls will only
		 see new effects.
		- #### hasEffects
		
		
		
		```
		public abstract boolean hasEffects()
		```
		
		Returns if there have been any effects.
		- #### expectEffect
		
		
		
		```
		public abstract void expectEffect​([Effect](../Effect.html "class in akka.actor.testkit.typed") expectedEffect)
		```
		
		Asserts that the oldest effect is the expectedEffect. Removing it from
		 further assertions.
		- #### expectEffectClass
		
		
		
		```
		public abstract <U extends [Effect](../Effect.html "class in akka.actor.testkit.typed")> U expectEffectClass​(java.lang.Class<U> effectClass)
		```
		
		Asserts that the oldest effect is an instance of of class T. Consumes and returns the concrete effect for
		 further direct assertions.
		- #### currentBehavior
		
		
		
		```
		public abstract [Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> currentBehavior()
		```
		
		The current behavior, can change any time `run` is called
		- #### returnedBehavior
		
		
		
		```
		public abstract [Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<[T](BehaviorTestKit.html "type parameter in BehaviorTestKit")> returnedBehavior()
		```
		
		Returns the current behavior as it was returned from processing the previous message.
		 For example if `Behaviors.unhandled` is returned it will be kept here, but not in
		 [`currentBehavior()`](#currentBehavior()).
		- #### isAlive
		
		
		
		```
		public abstract boolean isAlive()
		```
		
		Is the current behavior alive or stopped
		- #### run
		
		
		
		```
		public abstract void run​([T](BehaviorTestKit.html "type parameter in BehaviorTestKit") message)
		```
		
		Send the message to the behavior and record any `Effect`s
		- #### runOne
		
		
		
		```
		public abstract void runOne()
		```
		
		Send the first message in the selfInbox to the behavior and run it, recording `Effect`s.
		- #### signal
		
		
		
		```
		public abstract void signal​([Signal](../../../typed/Signal.html "interface in akka.actor.typed") signal)
		```
		
		Send the signal to the beheavior and record any `Effect`s
		- #### getAllLogEntries
		
		
		
		```
		public abstract java.util.List<[CapturedLogEvent](../CapturedLogEvent.html "class in akka.actor.testkit.typed")> getAllLogEntries()
		```
		
		Returns all the `CapturedLogEvent` issued by this behavior(s)
		- #### clearLog
		
		
		
		```
		public abstract void clearLog()
		```
		
		Clear the log entries
		- #### receptionistInbox
		
		
		
		```
		public abstract [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<[Receptionist.Command](../../../typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")> receptionistInbox()
		```
		
		The receptionist inbox contains messages sent to `system.receptionist`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/CapturedLogEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/ReplyInbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/StatusReplyInbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestInbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html)*