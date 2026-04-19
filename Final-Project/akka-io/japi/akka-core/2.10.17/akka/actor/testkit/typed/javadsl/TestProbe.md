---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestProbe.html
title: TestProbe
---

# TestProbe

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Class TestProbe\<M\>

- java.lang.Object
- - akka.actor.testkit.typed.javadsl.TestProbe\<M\>

- All Implemented Interfaces:
`[RecipientRef](../../../typed/RecipientRef.html "interface in akka.actor.typed")<M>`

---

```
public abstract class TestProbe<M>
extends java.lang.Object
implements [RecipientRef](../../../typed/RecipientRef.html "interface in akka.actor.typed")<M>
```

Java API: \* Create instances through the `create` factories in the [`TestProbe`](TestProbe.html "class in akka.actor.testkit.typed.javadsl") companion
 or via [`ActorTestKit.createTestProbe()`](ActorTestKit.html#createTestProbe()).
 
 A test probe is essentially a queryable mailbox which can be used in place of an actor and the received
 messages can then be asserted etc.
 

 Not for user extension

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.typed.[RecipientRef](../../../typed/RecipientRef.html "interface in akka.actor.typed")
		
		
		`[RecipientRef.RecipientRefOps](../../../typed/RecipientRef.RecipientRefOps.html "class in akka.actor.typed")<[T](../../../typed/RecipientRef.RecipientRefOps.html "type parameter in RecipientRef.RecipientRefOps")>, [RecipientRef.RecipientRefOps$](../../../typed/RecipientRef.RecipientRefOps$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestProbe](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract <A> A` | `[awaitAssert](#awaitAssert(akka.japi.function.Creator))​([Creator](../../../../japi/function/Creator.html "interface in akka.japi.function")<A> creator)` | Evaluate the given assert every 100 milliseconds until it does not throw an exception and return the  result. |
	| `abstract <A> A` | `[awaitAssert](#awaitAssert(java.time.Duration,akka.japi.function.Creator))​(java.time.Duration max,  [Creator](../../../../japi/function/Creator.html "interface in akka.japi.function")<A> creator)` | Evaluate the given assert every 100 milliseconds until it does not throw an exception and return the  result. |
	| `abstract <A> A` | `[awaitAssert](#awaitAssert(java.time.Duration,java.time.Duration,akka.japi.function.Creator))​(java.time.Duration max,  java.time.Duration interval,  [Creator](../../../../japi/function/Creator.html "interface in akka.japi.function")<A> creator)` | Evaluate the given assert every `interval` until it does not throw an exception and return the  result. |
	| `static <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[create](#create(java.lang.Class,akka.actor.typed.ActorSystem))​(java.lang.Class<M> clazz,  [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[create](#create(java.lang.String,akka.actor.typed.ActorSystem))​(java.lang.String name,  [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[create](#create(java.lang.String,java.lang.Class,akka.actor.typed.ActorSystem))​(java.lang.String name,  java.lang.Class<M> clazz,  [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `abstract <T extends [M](TestProbe.html "type parameter in TestProbe")>T` | `[expectMessage](#expectMessage(java.time.Duration,java.lang.String,T))​(java.time.Duration max,  java.lang.String hint,  T obj)` | Receive one message from the test actor and assert that it equals the  given object. |
	| `abstract <T extends [M](TestProbe.html "type parameter in TestProbe")>T` | `[expectMessage](#expectMessage(java.time.Duration,T))​(java.time.Duration max,  T obj)` | Receive one message from the test actor and assert that it equals the  given object. |
	| `abstract <T extends [M](TestProbe.html "type parameter in TestProbe")>T` | `[expectMessage](#expectMessage(T))​(T obj)` | Same as `expectMessage(remainingOrDefault, obj)`, but using the  default timeout as deadline. |
	| `abstract <T extends [M](TestProbe.html "type parameter in TestProbe")>T` | `[expectMessageClass](#expectMessageClass(java.lang.Class))​(java.lang.Class<T> clazz)` | Same as `expectMessageType(clazz, remainingOrDefault)`,but using the  default timeout as deadline. |
	| `abstract <T extends [M](TestProbe.html "type parameter in TestProbe")>T` | `[expectMessageClass](#expectMessageClass(java.lang.Class,java.time.Duration))​(java.lang.Class<T> clazz,  java.time.Duration max)` | Wait for a message of type M and return it when it arrives, or fail if the `max` timeout is hit. |
	| `abstract void` | `[expectNoMessage](#expectNoMessage())()` | Assert that no message is received. |
	| `abstract void` | `[expectNoMessage](#expectNoMessage(java.time.Duration))​(java.time.Duration max)` | Assert that no message is received for the specified time. |
	| `abstract <U> void` | `[expectTerminated](#expectTerminated(akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> actorRef)` | Expect the given actor to be stopped or stop within the default timeout. |
	| `abstract <U> void` | `[expectTerminated](#expectTerminated(akka.actor.typed.ActorRef,java.time.Duration))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> actorRef,  java.time.Duration max)` | Expect the given actor to be stopped or stop within the given timeout or  throw an `AssertionError`. |
	| `abstract java.util.List<[M](TestProbe.html "type parameter in TestProbe")>` | `[fishForMessage](#fishForMessage(java.time.Duration,java.lang.String,java.util.function.Function))​(java.time.Duration max,  java.lang.String hint,  java.util.function.Function<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)` | Same as the other `fishForMessage` but includes the provided hint in all error messages |
	| `abstract java.util.List<[M](TestProbe.html "type parameter in TestProbe")>` | `[fishForMessage](#fishForMessage(java.time.Duration,java.util.function.Function))​(java.time.Duration max,  java.util.function.Function<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)` | Java API: Allows for flexible matching of multiple messages within a timeout, the fisher function is fed each incoming  message, and returns one of the following effects to decide on what happens next: |
	| `[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[M](TestProbe.html "type parameter in TestProbe")>` | `[getRef](#getRef())()` | ActorRef for this TestProbe |
	| `abstract java.time.Duration` | `[getRemaining](#getRemaining())()` | Obtain time remaining for execution of the innermost enclosing `within`  block or throw an `AssertionError` if no `within` block surrounds this  call. |
	| `abstract java.time.Duration` | `[getRemainingOr](#getRemainingOr(java.time.Duration))​(java.time.Duration duration)` | Obtain time remaining for execution of the innermost enclosing `within`  block or missing that it returns the given duration. |
	| `abstract java.time.Duration` | `[getRemainingOrDefault](#getRemainingOrDefault())()` | Obtain time remaining for execution of the innermost enclosing `within`  block or missing that it returns the properly dilated default for this  case from settings (key "akka.actor.testkit.typed.single\-expect\-default"). |
	| `abstract [M](TestProbe.html "type parameter in TestProbe")` | `[receiveMessage](#receiveMessage())()` | Receive one message of type `M` within the default timeout as deadline. |
	| `abstract [M](TestProbe.html "type parameter in TestProbe")` | `[receiveMessage](#receiveMessage(java.time.Duration))​(java.time.Duration max)` | Receive one message of type `M`. |
	| `abstract java.util.List<[M](TestProbe.html "type parameter in TestProbe")>` | `[receiveSeveralMessages](#receiveSeveralMessages(int))​(int n)` | Same as `receiveSeveralMessages(n, remaining)` but using the default timeout as deadline. |
	| `abstract java.util.List<[M](TestProbe.html "type parameter in TestProbe")>` | `[receiveSeveralMessages](#receiveSeveralMessages(int,java.time.Duration))​(int n,  java.time.Duration max)` | Receive `n` messages in a row before the given deadline. |
	| `abstract [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[M](TestProbe.html "type parameter in TestProbe")>` | `[ref](#ref())()` | ActorRef for this TestProbe |
	| `protected abstract [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed")` | `[settings](#settings())()` |  |
	| `abstract void` | `[stop](#stop())()` | Stops the `TestProbe.getRef`, which is useful when testing watch and termination. |
	| `abstract <T> T` | `[within](#within(java.time.Duration,java.time.Duration,java.util.function.Supplier))​(java.time.Duration min,  java.time.Duration max,  java.util.function.Supplier<T> f)` | Execute code block while bounding its execution time between `min` and  `max`. |
	| `abstract <T> T` | `[within](#within(java.time.Duration,java.util.function.Supplier))​(java.time.Duration max,  java.util.function.Supplier<T> f)` | Same as calling `within(0 seconds, max)(f)`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.typed.[RecipientRef](../../../typed/RecipientRef.html "interface in akka.actor.typed")
		
		
		`[tell](../../../typed/RecipientRef.html#tell(T))`

- - ### Constructor Detail
	
	
	
		- #### TestProbe
		
		
		
		```
		public TestProbe()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> create​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### create
		
		
		
		```
		public static <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> create​(java.lang.Class<M> clazz,
		                                      [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### create
		
		
		
		```
		public static <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> create​(java.lang.String name,
		                                      [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### create
		
		
		
		```
		public static <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> create​(java.lang.String name,
		                                      java.lang.Class<M> clazz,
		                                      [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### settings
		
		
		
		```
		protected abstract [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings()
		```
		- #### ref
		
		
		
		```
		public abstract [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[M](TestProbe.html "type parameter in TestProbe")> ref()
		```
		
		ActorRef for this TestProbe
		- #### getRef
		
		
		
		```
		public [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[M](TestProbe.html "type parameter in TestProbe")> getRef()
		```
		
		ActorRef for this TestProbe
		- #### getRemainingOrDefault
		
		
		
		```
		public abstract java.time.Duration getRemainingOrDefault()
		```
		
		Obtain time remaining for execution of the innermost enclosing `within`
		 block or missing that it returns the properly dilated default for this
		 case from settings (key "akka.actor.testkit.typed.single\-expect\-default").
		- #### getRemaining
		
		
		
		```
		public abstract java.time.Duration getRemaining()
		```
		
		Obtain time remaining for execution of the innermost enclosing `within`
		 block or throw an `AssertionError` if no `within` block surrounds this
		 call.
		- #### getRemainingOr
		
		
		
		```
		public abstract java.time.Duration getRemainingOr​(java.time.Duration duration)
		```
		
		Obtain time remaining for execution of the innermost enclosing `within`
		 block or missing that it returns the given duration.
		- #### within
		
		
		
		```
		public abstract <T> T within​(java.time.Duration min,
		                             java.time.Duration max,
		                             java.util.function.Supplier<T> f)
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
		public abstract <T> T within​(java.time.Duration max,
		                             java.util.function.Supplier<T> f)
		```
		
		Same as calling `within(0 seconds, max)(f)`.
		- #### expectMessage
		
		
		
		```
		public abstract <T extends [M](TestProbe.html "type parameter in TestProbe")> T expectMessage​(T obj)
		```
		
		Same as `expectMessage(remainingOrDefault, obj)`, but using the
		 default timeout as deadline.
		- #### expectMessage
		
		
		
		```
		public abstract <T extends [M](TestProbe.html "type parameter in TestProbe")> T expectMessage​(java.time.Duration max,
		                                              T obj)
		```
		
		Receive one message from the test actor and assert that it equals the
		 given object. Wait time is bounded by the given duration, with an
		 `AssertionError` being thrown in case of timeout.
		 
		
		Returns:
		the received object
		- #### expectMessage
		
		
		
		```
		public abstract <T extends [M](TestProbe.html "type parameter in TestProbe")> T expectMessage​(java.time.Duration max,
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
		public abstract void expectNoMessage​(java.time.Duration max)
		```
		
		Assert that no message is received for the specified time.
		 Supplied value is not dilated.
		- #### expectNoMessage
		
		
		
		```
		public abstract void expectNoMessage()
		```
		
		Assert that no message is received. Waits for the default period configured as `akka.actor.testkit.typed.expect-no-message-default`.
		 That timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		- #### expectMessageClass
		
		
		
		```
		public abstract <T extends [M](TestProbe.html "type parameter in TestProbe")> T expectMessageClass​(java.lang.Class<T> clazz)
		```
		
		Same as `expectMessageType(clazz, remainingOrDefault)`,but using the
		 default timeout as deadline.
		- #### expectMessageClass
		
		
		
		```
		public abstract <T extends [M](TestProbe.html "type parameter in TestProbe")> T expectMessageClass​(java.lang.Class<T> clazz,
		                                                   java.time.Duration max)
		```
		
		Wait for a message of type M and return it when it arrives, or fail if the `max` timeout is hit.
		 
		 Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		- #### receiveMessage
		
		
		
		```
		public abstract [M](TestProbe.html "type parameter in TestProbe") receiveMessage()
		```
		
		Receive one message of type `M` within the default timeout as deadline.
		- #### receiveMessage
		
		
		
		```
		public abstract [M](TestProbe.html "type parameter in TestProbe") receiveMessage​(java.time.Duration max)
		```
		
		Receive one message of type `M`. Wait time is bounded by the `max` duration,
		 with an `AssertionError` raised in case of timeout.
		- #### receiveSeveralMessages
		
		
		
		```
		public abstract java.util.List<[M](TestProbe.html "type parameter in TestProbe")> receiveSeveralMessages​(int n)
		```
		
		Same as `receiveSeveralMessages(n, remaining)` but using the default timeout as deadline.
		- #### receiveSeveralMessages
		
		
		
		```
		public abstract java.util.List<[M](TestProbe.html "type parameter in TestProbe")> receiveSeveralMessages​(int n,
		                                                         java.time.Duration max)
		```
		
		Receive `n` messages in a row before the given deadline.
		 
		 Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		- #### fishForMessage
		
		
		
		```
		public abstract java.util.List<[M](TestProbe.html "type parameter in TestProbe")> fishForMessage​(java.time.Duration max,
		                                                 java.util.function.Function<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)
		```
		
		Java API: Allows for flexible matching of multiple messages within a timeout, the fisher function is fed each incoming
		 message, and returns one of the following effects to decide on what happens next:
		 
		 \* `FishingOutcomes.continueAndCollect` \- continue with the next message given that the timeout has not been reached
		 \* `FishingOutcomes.complete` \- successfully complete and return the message
		 \* `FishingOutcomes.fail` \- fail the test with a custom message
		 
		
		
		 Additionally failures includes the list of messages consumed. If a message of type `M` but not of type `T` is
		 received this will also fail the test, additionally if the `fisher` function throws a match error the error
		 is decorated with some fishing details and the test is failed (making it convenient to use this method with a
		 partial function).
		 
		
		
		
		Parameters:
		`max` \- Max total time without the fisher function returning `CompleteFishing` before failing.
		 The timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		Returns:
		The messages accepted in the order they arrived
		- #### fishForMessage
		
		
		
		```
		public abstract java.util.List<[M](TestProbe.html "type parameter in TestProbe")> fishForMessage​(java.time.Duration max,
		                                                 java.lang.String hint,
		                                                 java.util.function.Function<[M](TestProbe.html "type parameter in TestProbe"),​[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")> fisher)
		```
		
		Same as the other `fishForMessage` but includes the provided hint in all error messages
		- #### expectTerminated
		
		
		
		```
		public abstract <U> void expectTerminated​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> actorRef,
		                                          java.time.Duration max)
		```
		
		Expect the given actor to be stopped or stop within the given timeout or
		 throw an `AssertionError`.
		 
		 Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		- #### expectTerminated
		
		
		
		```
		public abstract <U> void expectTerminated​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<U> actorRef)
		```
		
		Expect the given actor to be stopped or stop within the default timeout.
		- #### awaitAssert
		
		
		
		```
		public abstract <A> A awaitAssert​(java.time.Duration max,
		                                  java.time.Duration interval,
		                                  [Creator](../../../../japi/function/Creator.html "interface in akka.japi.function")<A> creator)
		```
		
		Evaluate the given assert every `interval` until it does not throw an exception and return the
		 result.
		 
		 If the `max` timeout expires the last exception is thrown.
		 
		
		
		 Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		- #### awaitAssert
		
		
		
		```
		public abstract <A> A awaitAssert​(java.time.Duration max,
		                                  [Creator](../../../../japi/function/Creator.html "interface in akka.japi.function")<A> creator)
		```
		
		Evaluate the given assert every 100 milliseconds until it does not throw an exception and return the
		 result.
		 
		 If the `max` timeout expires the last exception is thrown.
		 
		
		
		 Note that the timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		- #### awaitAssert
		
		
		
		```
		public abstract <A> A awaitAssert​([Creator](../../../../japi/function/Creator.html "interface in akka.japi.function")<A> creator)
		```
		
		Evaluate the given assert every 100 milliseconds until it does not throw an exception and return the
		 result. A max time is taken it from the innermost enclosing `within` block.
		- #### stop
		
		
		
		```
		public abstract void stop()
		```
		
		Stops the `TestProbe.getRef`, which is useful when testing watch and termination.

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
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/ActorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.RecipientRefOps.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Creator.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestProbe.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/TestProbe.html)*