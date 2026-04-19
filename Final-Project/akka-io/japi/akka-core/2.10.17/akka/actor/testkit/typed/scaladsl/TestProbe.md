---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestProbe.html
title: TestProbe
---

# TestProbe

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Interface TestProbe\<M\>

- All Superinterfaces:
`[RecipientRef](../../../typed/RecipientRef.html "interface in akka.actor.typed")<M>`

---

```
public interface TestProbe<M>
extends [RecipientRef](../../../typed/RecipientRef.html "interface in akka.actor.typed")<M>
```

Create instances through the factories in the [`TestProbe`](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl") companion.
 
 A test probe is essentially a queryable mailbox which can be used in place of an actor and the received
 messages can then be asserted
 

 Not for user extension

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.typed.[RecipientRef](../../../typed/RecipientRef.html "interface in akka.actor.typed")
		
		
		`[RecipientRef.RecipientRefOps](../../../typed/RecipientRef.RecipientRefOps.html "class in akka.actor.typed")<[T](../../../typed/RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")>, [RecipientRef.RecipientRefOps$](../../../typed/RecipientRef.RecipientRefOps$.html "class in akka.actor.typed")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[TestProbe](../javadsl/TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[M](TestProbe.html "type parameter in TestProbe")>` | `[asJava](#asJava())()` | INTERNAL API |
	| `<A> A` | `[awaitAssert](#awaitAssert(scala.Function0))​(scala.Function0<A> a)` | Evaluate the given assert every 100 ms until it does not throw an exception and return the  result. |
	| `<A> A` | `[awaitAssert](#awaitAssert(scala.Function0,scala.concurrent.duration.FiniteDuration))​(scala.Function0<A> a,  scala.concurrent.duration.FiniteDuration max)` | Evaluate the given assert every 100 ms until it does not throw an exception and return the  result. |
	| `<A> A` | `[awaitAssert](#awaitAssert(scala.Function0,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(scala.Function0<A> a,  scala.concurrent.duration.FiniteDuration max,  scala.concurrent.duration.FiniteDuration interval)` | Evaluate the given assert every `interval` until it does not throw an exception and return the  result. |
	| `<T extends [M](TestProbe.html "type parameter in TestProbe")>T` | `[expectMessage](#expectMessage(scala.concurrent.duration.FiniteDuration,java.lang.String,T))​(scala.concurrent.duration.FiniteDuration max,  java.lang.String hint,  T obj)` | Receive one message from the test actor and assert that it equals the  given object. |
	| `<T extends [M](TestProbe.html "type parameter in TestProbe")>T` | `[expectMessage](#expectMessage(scala.concurrent.duration.FiniteDuration,T))​(scala.concurrent.duration.FiniteDuration max,  T obj)` | Receive one message from the test actor and assert that it equals the  given object. |
	| `<T extends [M](TestProbe.html "type parameter in TestProbe")>T` | `[expectMessage](#expectMessage(T))​(T obj)` | Same as `expectMessage(remainingOrDefault, obj)`, but using the default timeout as deadline. |
	| `<T extends [M](TestProbe.html "type parameter in TestProbe")>T` | `[expectMessageType](#expectMessageType(scala.concurrent.duration.FiniteDuration,scala.reflect.ClassTag))​(scala.concurrent.duration.FiniteDuration max,  scala.reflect.ClassTag<T> t)` | Expect a message of type T to arrive within `max` or fail. |
	| `<T extends [M](TestProbe.html "type parameter in TestProbe")>T` | `[expectMessageType](#expectMessageType(scala.reflect.ClassTag))​(scala.reflect.ClassTag<T> t)` | Same as `expectMessageType[T](remainingOrDefault)`, but using the default timeout as deadline. |
	| `void` | `[expectNoMessage](#expectNoMessage())()` | Assert that no message is received. |
	| `void` | `[expectNoMessage](#expectNoMessage(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration max)` | Assert that no message is received for the specified time. |
	| `<U> void` | `[expectTerminated](#expectTerminated(akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> actorRef)` | Expect the given actor to be stopped or stop within the default timeout. |
	| `<U> void` | `[expectTerminated](#expectTerminated(akka.actor.typed.ActorRef,scala.concurrent.duration.FiniteDuration))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> actorRef,  scala.concurrent.duration.FiniteDuration max)` | Expect the given actor to be stopped or stop within the given timeout or  throw an `AssertionError`. |
	| `scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")>` | `[fishForMessage](#fishForMessage(scala.concurrent.duration.FiniteDuration,java.lang.String,scala.Function1))​(scala.concurrent.duration.FiniteDuration max,  java.lang.String hint,  scala.Function1<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)` | Allows for flexible matching of multiple messages within a timeout, the fisher function is fed each incoming  message, and returns one of the following effects to decide on what happens next: |
	| `scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")>` | `[fishForMessage](#fishForMessage(scala.concurrent.duration.FiniteDuration,scala.Function1))​(scala.concurrent.duration.FiniteDuration max,  scala.Function1<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)` | Same as the other `fishForMessage` but with no hint |
	| `scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")>` | `[fishForMessagePF](#fishForMessagePF(scala.concurrent.duration.FiniteDuration,java.lang.String,scala.PartialFunction))​(scala.concurrent.duration.FiniteDuration max,  java.lang.String hint,  scala.PartialFunction<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)` | Same as `fishForMessage` but accepting a partial function and failing for non\-matches |
	| `scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")>` | `[fishForMessagePF](#fishForMessagePF(scala.concurrent.duration.FiniteDuration,scala.PartialFunction))​(scala.concurrent.duration.FiniteDuration max,  scala.PartialFunction<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)` | Same as `fishForMessage` but with no hint, accepting a partial function and failing for non\-matches |
	| `[M](TestProbe.html "type parameter in TestProbe")` | `[receiveMessage](#receiveMessage())()` | Receive one message of type `M` within the default timeout as deadline. |
	| `[M](TestProbe.html "type parameter in TestProbe")` | `[receiveMessage](#receiveMessage(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration max)` | Receive one message of type `M`. |
	| `scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")>` | `[receiveMessages](#receiveMessages(int))​(int n)` | Same as `receiveMessages(n, remaining)` but using the default timeout as deadline. |
	| `scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")>` | `[receiveMessages](#receiveMessages(int,scala.concurrent.duration.FiniteDuration))​(int n,  scala.concurrent.duration.FiniteDuration max)` | Receive `n` messages in a row before the given deadline. |
	| `[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[M](TestProbe.html "type parameter in TestProbe")>` | `[ref](#ref())()` | ActorRef for this TestProbe |
	| `scala.concurrent.duration.FiniteDuration` | `[remaining](#remaining())()` | Obtain time remaining for execution of the innermost enclosing `within`  block or throw an `AssertionError` if no `within` block surrounds this  call. |
	| `scala.concurrent.duration.FiniteDuration` | `[remainingOr](#remainingOr(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration duration)` | Obtain time remaining for execution of the innermost enclosing `within`  block or missing that it returns the given duration. |
	| `scala.concurrent.duration.FiniteDuration` | `[remainingOrDefault](#remainingOrDefault())()` | Obtain time remaining for execution of the innermost enclosing `within`  block or missing that it returns the properly dilated default for this  case from settings (key "akka.actor.testkit.typed.single\-expect\-default"). |
	| `[TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed")` | `[settings](#settings())()` |  |
	| `void` | `[stop](#stop())()` | Stops the `TestProbe.ref`, which is useful when testing watch and termination. |
	| `<T> T` | `[within](#within(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0))​(scala.concurrent.duration.FiniteDuration min,  scala.concurrent.duration.FiniteDuration max,  scala.Function0<T> f)` | Execute code block while bounding its execution time between `min` and  `max`. |
	| `<T> T` | `[within](#within(scala.concurrent.duration.FiniteDuration,scala.Function0))​(scala.concurrent.duration.FiniteDuration max,  scala.Function0<T> f)` | Same as calling `within(0 seconds, max)(f)`. |
	
	
		- ### Methods inherited from interface akka.actor.typed.[RecipientRef](../../../typed/RecipientRef.html "interface in akka.actor.typed")
		
		
		`[tell](../../../typed/RecipientRef.html#tell(T))`

- - ### Method Detail
	
	
	
		- #### settings
		
		
		
		```
		[TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings()
		```
		- #### ref
		
		
		
		```
		[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[M](TestProbe.html "type parameter in TestProbe")> ref()
		```
		
		ActorRef for this TestProbe
		- #### remainingOrDefault
		
		
		
		```
		scala.concurrent.duration.FiniteDuration remainingOrDefault()
		```
		
		Obtain time remaining for execution of the innermost enclosing `within`
		 block or missing that it returns the properly dilated default for this
		 case from settings (key "akka.actor.testkit.typed.single\-expect\-default").
		- #### remaining
		
		
		
		```
		scala.concurrent.duration.FiniteDuration remaining()
		```
		
		Obtain time remaining for execution of the innermost enclosing `within`
		 block or throw an `AssertionError` if no `within` block surrounds this
		 call.
		- #### remainingOr
		
		
		
		```
		scala.concurrent.duration.FiniteDuration remainingOr​(scala.concurrent.duration.FiniteDuration duration)
		```
		
		Obtain time remaining for execution of the innermost enclosing `within`
		 block or missing that it returns the given duration.
		- #### within
		
		
		
		```
		<T> T within​(scala.concurrent.duration.FiniteDuration min,
		             scala.concurrent.duration.FiniteDuration max,
		             scala.Function0<T> f)
		```
		
		Execute code block while bounding its execution time between `min` and
		 `max`. `within` blocks may be nested. All methods in this trait which
		 take maximum wait times are available in a version which implicitly uses
		 the remaining time governed by the innermost enclosing `within` block.
		 
		 Note that the max timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor",
		 while the min Duration is not.
		 
		
		
		
		
		
		```
		
		 val ret = within(50 millis) {
		   test ! Ping
		   expectMessageType[Pong]
		 }
		 
		```
		- #### within
		
		
		
		```
		<T> T within​(scala.concurrent.duration.FiniteDuration max,
		             scala.Function0<T> f)
		```
		
		Same as calling `within(0 seconds, max)(f)`.
		- #### expectMessage
		
		
		
		```
		<T extends [M](TestProbe.html "type parameter in TestProbe")> T expectMessage​(T obj)
		```
		
		Same as `expectMessage(remainingOrDefault, obj)`, but using the default timeout as deadline.
		- #### expectMessage
		
		
		
		```
		<T extends [M](TestProbe.html "type parameter in TestProbe")> T expectMessage​(scala.concurrent.duration.FiniteDuration max,
		                              T obj)
		```
		
		Receive one message from the test actor and assert that it equals the
		 given object. Wait time is bounded by the given duration, with an
		 `AssertionError` being thrown in case of timeout.
		 
		
		Returns:
		the received object
		- #### expectMessage
		
		
		
		```
		<T extends [M](TestProbe.html "type parameter in TestProbe")> T expectMessage​(scala.concurrent.duration.FiniteDuration max,
		                              java.lang.String hint,
		                              T obj)
		```
		
		Receive one message from the test actor and assert that it equals the
		 given object. Wait time is bounded by the given duration, with an
		 `AssertionError` being thrown in case of timeout.
		 
		
		Returns:
		the received object
		- #### expectNoMessage
		
		
		
		```
		void expectNoMessage​(scala.concurrent.duration.FiniteDuration max)
		```
		
		Assert that no message is received for the specified time.
		 Supplied value is not dilated.
		- #### expectNoMessage
		
		
		
		```
		void expectNoMessage()
		```
		
		Assert that no message is received. Waits for the default period configured as `akka.actor.testkit.typed.expect-no-message-default`.
		 That timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		- #### expectMessageType
		
		
		
		```
		<T extends [M](TestProbe.html "type parameter in TestProbe")> T expectMessageType​(scala.reflect.ClassTag<T> t)
		```
		
		Same as `expectMessageType[T](remainingOrDefault)`, but using the default timeout as deadline.
		- #### expectMessageType
		
		
		
		```
		<T extends [M](TestProbe.html "type parameter in TestProbe")> T expectMessageType​(scala.concurrent.duration.FiniteDuration max,
		                                  scala.reflect.ClassTag<T> t)
		```
		
		Expect a message of type T to arrive within `max` or fail. `max` is dilated.
		- #### receiveMessage
		
		
		
		```
		[M](TestProbe.html "type parameter in TestProbe") receiveMessage()
		```
		
		Receive one message of type `M` within the default timeout as deadline.
		- #### receiveMessage
		
		
		
		```
		[M](TestProbe.html "type parameter in TestProbe") receiveMessage​(scala.concurrent.duration.FiniteDuration max)
		```
		
		Receive one message of type `M`. Wait time is bounded by the `max` duration,
		 with an `AssertionError` raised in case of timeout.
		- #### receiveMessages
		
		
		
		```
		scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")> receiveMessages​(int n)
		```
		
		Same as `receiveMessages(n, remaining)` but using the default timeout as deadline.
		- #### receiveMessages
		
		
		
		```
		scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")> receiveMessages​(int n,
		                                                  scala.concurrent.duration.FiniteDuration max)
		```
		
		Receive `n` messages in a row before the given deadline.
		 
		 Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		- #### fishForMessage
		
		
		
		```
		scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")> fishForMessage​(scala.concurrent.duration.FiniteDuration max,
		                                                 java.lang.String hint,
		                                                 scala.Function1<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)
		```
		
		Allows for flexible matching of multiple messages within a timeout, the fisher function is fed each incoming
		 message, and returns one of the following effects to decide on what happens next:
		 
		 \* {@link FishingOutcomes.continue} \- continue with the next message given that the timeout has not been reached
		 \* `FishingOutcomes.continueAndIgnore` \- continue and do not save the message in the returned list
		 \* `FishingOutcomes.complete` \- successfully complete and return the message
		 \* `FishingOutcomes.fail` \- fail the test with a custom message
		 
		
		
		 Additionally failures includes the list of messages consumed.
		 If the `fisher` function throws a match error the error
		 is decorated with some fishing details and the test is failed (making it convenient to use this method with a
		 partial function).
		 
		
		
		
		Parameters:
		`max` \- Max total time without the fisher function returning `CompleteFishing` before failing.
		 The timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		Returns:
		The messages accepted in the order they arrived
		- #### fishForMessagePF
		
		
		
		```
		scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")> fishForMessagePF​(scala.concurrent.duration.FiniteDuration max,
		                                                   java.lang.String hint,
		                                                   scala.PartialFunction<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)
		```
		
		Same as `fishForMessage` but accepting a partial function and failing for non\-matches
		- #### fishForMessage
		
		
		
		```
		scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")> fishForMessage​(scala.concurrent.duration.FiniteDuration max,
		                                                 scala.Function1<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)
		```
		
		Same as the other `fishForMessage` but with no hint
		- #### fishForMessagePF
		
		
		
		```
		scala.collection.immutable.Seq<[M](TestProbe.html "type parameter in TestProbe")> fishForMessagePF​(scala.concurrent.duration.FiniteDuration max,
		                                                   scala.PartialFunction<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)
		```
		
		Same as `fishForMessage` but with no hint, accepting a partial function and failing for non\-matches
		- #### expectTerminated
		
		
		
		```
		<U> void expectTerminated​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> actorRef,
		                          scala.concurrent.duration.FiniteDuration max)
		```
		
		Expect the given actor to be stopped or stop within the given timeout or
		 throw an `AssertionError`.
		- #### expectTerminated
		
		
		
		```
		<U> void expectTerminated​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> actorRef)
		```
		
		Expect the given actor to be stopped or stop within the default timeout.
		- #### awaitAssert
		
		
		
		```
		<A> A awaitAssert​(scala.Function0<A> a,
		                  scala.concurrent.duration.FiniteDuration max,
		                  scala.concurrent.duration.FiniteDuration interval)
		```
		
		Evaluate the given assert every `interval` until it does not throw an exception and return the
		 result.
		 
		 If the `max` timeout expires the last exception is thrown.
		 
		
		
		 Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		- #### awaitAssert
		
		
		
		```
		<A> A awaitAssert​(scala.Function0<A> a,
		                  scala.concurrent.duration.FiniteDuration max)
		```
		
		Evaluate the given assert every 100 ms until it does not throw an exception and return the
		 result.
		 
		 If the `max` timeout expires the last exception is thrown.
		- #### awaitAssert
		
		
		
		```
		<A> A awaitAssert​(scala.Function0<A> a)
		```
		
		Evaluate the given assert every 100 ms until it does not throw an exception and return the
		 result.
		 
		 If the default timeout expires the last exception is thrown.
		- #### stop
		
		
		
		```
		void stop()
		```
		
		Stops the `TestProbe.ref`, which is useful when testing watch and termination.
		- #### asJava
		
		
		
		```
		[TestProbe](../javadsl/TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[M](TestProbe.html "type parameter in TestProbe")> asJava()
		```
		
		INTERNAL API

## Code Examples

### Example 1: within

```text
val ret = within(50 millis) {
   test ! Ping
   expectMessageType[Pong]
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/FishingOutcome.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestProbe.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/TestProbe.html)*