---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:50:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/javadsl/TestKit.html
title: TestKit
---

# TestKit

## Content

Package [akka.testkit.javadsl](package-summary.html)
## Class TestKit

- java.lang.Object
- - akka.testkit.javadsl.TestKit

- ---

```
public class TestKit
extends java.lang.Object
```

Java API: Test kit for testing actors. Inheriting from this class enables
 reception of replies from actors, which are queued by an internal actor and
 can be examined using the `expectMsg...` methods. Assertions and
 bounds concerning timing are available in the form of `Within`
 blocks.
 
 Beware of two points:
 

 \- the ActorSystem passed into the constructor needs to be shutdown,
 otherwise thread pools and memory will be leaked \- this trait is not
 thread\-safe (only one actor with one queue, one stack of `Within`
 blocks); take care not to run tests within a single test class instance in
 parallel.
 

 \- It should be noted that for CI servers and the like all maximum Durations
 are scaled using the `dilated` method, which uses the
 TestKitExtension.Settings.TestTimeFactor settable via akka.conf entry
 "akka.test.timefactor".

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestKit](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<A> A` | `[awaitAssert](#awaitAssert(java.time.Duration,java.time.Duration,java.util.function.Supplier))​(java.time.Duration max,  java.time.Duration interval,  java.util.function.Supplier<A> a)` | Evaluate the given assert every `interval` until it does not throw an exception. |
	| `<A> A` | `[awaitAssert](#awaitAssert(java.time.Duration,java.util.function.Supplier))​(java.time.Duration max,  java.util.function.Supplier<A> a)` | Evaluate the given assert every `interval` until it does not throw an exception and return the  result. |
	| `<A> A` | `[awaitAssert](#awaitAssert(java.util.function.Supplier))​(java.util.function.Supplier<A> a)` | Evaluate the given assert every `interval` until it does not throw an exception and return the  result. |
	| `void` | `[awaitCond](#awaitCond(java.time.Duration,java.time.Duration,java.lang.String,java.util.function.Supplier))​(java.time.Duration max,  java.time.Duration interval,  java.lang.String message,  java.util.function.Supplier<java.lang.Object> p)` | Await until the given condition evaluates to `true` or the timeout  expires, whichever comes first. |
	| `void` | `[awaitCond](#awaitCond(java.time.Duration,java.time.Duration,java.util.function.Supplier))​(java.time.Duration max,  java.time.Duration interval,  java.util.function.Supplier<java.lang.Object> p)` | Await until the given condition evaluates to `true` or the timeout  expires, whichever comes first. |
	| `void` | `[awaitCond](#awaitCond(java.time.Duration,java.util.function.Supplier))​(java.time.Duration max,  java.util.function.Supplier<java.lang.Object> p)` | Await until the given condition evaluates to `true` or the timeout  expires, whichever comes first. |
	| `void` | `[awaitCond](#awaitCond(java.util.function.Supplier))​(java.util.function.Supplier<java.lang.Object> p)` | Await until the given condition evaluates to `true` or the timeout  expires, whichever comes first. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[childActorOf](#childActorOf(akka.actor.Props))​([Props](../../actor/Props.html "class in akka.actor") props)` | Spawns an actor as a child of this test actor with an auto\-generated name and stopping supervisor strategy, returning the child's ActorRef. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[childActorOf](#childActorOf(akka.actor.Props,akka.actor.SupervisorStrategy))​([Props](../../actor/Props.html "class in akka.actor") props,  [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy)` | Spawns an actor as a child of this test actor with an auto\-generated name, and returns the child's ActorRef. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[childActorOf](#childActorOf(akka.actor.Props,java.lang.String))​([Props](../../actor/Props.html "class in akka.actor") props,  java.lang.String name)` | Spawns an actor as a child of this test actor with a stopping supervisor strategy, and returns the child's ActorRef. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[childActorOf](#childActorOf(akka.actor.Props,java.lang.String,akka.actor.SupervisorStrategy))​([Props](../../actor/Props.html "class in akka.actor") props,  java.lang.String name,  [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy)` | Spawns an actor as a child of this test actor, and returns the child's ActorRef. |
	| `java.time.Duration` | `[dilated](#dilated(java.time.Duration))​(java.time.Duration duration)` | Java timeouts (durations) during tests with the configured |
	| `scala.concurrent.duration.FiniteDuration` | `[duration](#duration(java.lang.String))​(java.lang.String s)` |  |
	| `<T> T` | `[expectMsg](#expectMsg(java.time.Duration,T))​(java.time.Duration max,  T obj)` | Receive one message from the test actor and assert that it equals the  given object. |
	| `<T> T` | `[expectMsg](#expectMsg(java.time.Duration,T,java.lang.String))​(java.time.Duration max,  T obj,  java.lang.String hint)` | Receive one message from the test actor and assert that it equals the  given object. |
	| `<T> T` | `[expectMsg](#expectMsg(T))​(T obj)` | Same as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor. |
	| `<T> java.util.List<T>` | `[expectMsgAllOf](#expectMsgAllOf(java.lang.Object...))​(java.lang.Object... objs)` | Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor. |
	| `<T> java.util.List<T>` | `[expectMsgAllOf](#expectMsgAllOf(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<T> objs)` | Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor. |
	| `<T> java.util.List<T>` | `[expectMsgAllOfWithin](#expectMsgAllOfWithin(java.time.Duration,java.lang.Object...))​(java.time.Duration max,  java.lang.Object... objs)` | Receive a number of messages from the test actor matching the given  number of objects and assert that for each given object one is received  which equals it and vice versa. |
	| `<T> java.util.List<T>` | `[expectMsgAllOfWithin](#expectMsgAllOfWithin(java.time.Duration,scala.collection.immutable.Seq))​(java.time.Duration max,  scala.collection.immutable.Seq<T> objs)` | Receive a number of messages from the test actor matching the given  number of objects and assert that for each given object one is received  which equals it and vice versa. |
	| `<T> T` | `[expectMsgAnyClassOf](#expectMsgAnyClassOf(java.lang.Class...))​(java.lang.Class<?>... objs)` | Same as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor. |
	| `<T> T` | `[expectMsgAnyClassOf](#expectMsgAnyClassOf(java.time.Duration,java.lang.Class...))​(java.time.Duration max,  java.lang.Class<?>... objs)` | Receive one message from the test actor and assert that it conforms to  one of the given classes. |
	| `<T> T` | `[expectMsgAnyClassOf](#expectMsgAnyClassOf(java.time.Duration,scala.collection.immutable.Seq))​(java.time.Duration max,  scala.collection.immutable.Seq<java.lang.Class<?>> objs)` | Receive one message from the test actor and assert that it conforms to  one of the given classes. |
	| `<T> T` | `[expectMsgAnyClassOf](#expectMsgAnyClassOf(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Class<?>> objs)` | Same as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor. |
	| `<T> T` | `[expectMsgAnyOf](#expectMsgAnyOf(T,java.lang.Object...))​(T first,  java.lang.Object... objs)` | Same as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor. |
	| `<T> T` | `[expectMsgAnyOf](#expectMsgAnyOf(T,scala.collection.immutable.Seq))​(T first,  scala.collection.immutable.Seq<T> objs)` | Same as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor. |
	| `<T> T` | `[expectMsgAnyOfWithin](#expectMsgAnyOfWithin(java.time.Duration,java.lang.Object...))​(java.time.Duration max,  java.lang.Object... objs)` | Receive one message from the test actor and assert that it equals one of  the given objects. |
	| `<T> T` | `[expectMsgAnyOfWithin](#expectMsgAnyOfWithin(java.time.Duration,scala.collection.immutable.Seq))​(java.time.Duration max,  scala.collection.immutable.Seq<T> objs)` | Receive one message from the test actor and assert that it equals one of  the given objects. |
	| `<T> T` | `[expectMsgClass](#expectMsgClass(java.lang.Class))​(java.lang.Class<T> c)` | Same as `expectMsgClass(remainingOrDefault, c)`, but correctly treating the timeFactor. |
	| `<T> T` | `[expectMsgClass](#expectMsgClass(java.time.Duration,java.lang.Class))​(java.time.Duration max,  java.lang.Class<T> c)` | Receive one message from the test actor and assert that it conforms to  the given class. |
	| `<T> T` | `[expectMsgEquals](#expectMsgEquals(java.time.Duration,T))​(java.time.Duration max,  T obj)` | Receive one message from the test actor and assert that it equals the given  object. |
	| `<T> T` | `[expectMsgEquals](#expectMsgEquals(T))​(T obj)` | Same as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor. |
	| `<T> T` | `[expectMsgPF](#expectMsgPF(java.lang.String,java.util.function.Function))​(java.lang.String hint,  java.util.function.Function<java.lang.Object,​T> f)` | Receive one message from the test actor and assert that the given  partial function accepts it. |
	| `<T> T` | `[expectMsgPF](#expectMsgPF(java.time.Duration,java.lang.String,java.util.function.Function))​(java.time.Duration max,  java.lang.String hint,  java.util.function.Function<java.lang.Object,​T> f)` | Receive one message from the test actor and assert that the given  partial function accepts it. |
	| `<T> T` | `[expectMsgPF](#expectMsgPF(scala.concurrent.duration.Duration,java.lang.String,java.util.function.Function))​(scala.concurrent.duration.Duration max,  java.lang.String hint,  java.util.function.Function<java.lang.Object,​T> f)` | Deprecated. Use the overloaded one which accepts java.time.Duration instead. |
	| `void` | `[expectNoMessage](#expectNoMessage())()` | Assert that no message is received. |
	| `void` | `[expectNoMessage](#expectNoMessage(java.time.Duration))​(java.time.Duration max)` | Assert that no message is received for the specified time. |
	| `[Terminated](../../actor/Terminated.html "class in akka.actor")` | `[expectTerminated](#expectTerminated(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") target)` | Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef. |
	| `[Terminated](../../actor/Terminated.html "class in akka.actor")` | `[expectTerminated](#expectTerminated(java.time.Duration,akka.actor.ActorRef))​(java.time.Duration max,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") target)` | Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef. |
	| `[Terminated](../../actor/Terminated.html "class in akka.actor")` | `[expectTerminated](#expectTerminated(scala.concurrent.duration.Duration,akka.actor.ActorRef))​(scala.concurrent.duration.Duration max,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") target)` | Deprecated. Use the overloaded one which accepts java.time.Duration instead. |
	| `java.lang.Object` | `[fishForMessage](#fishForMessage(java.time.Duration,java.lang.String,java.util.function.Function))​(java.time.Duration max,  java.lang.String hint,  java.util.function.Function<java.lang.Object,​java.lang.Object> f)` | Hybrid of expectMsgPF and receiveWhile: receive messages while the  partial function matches and returns false. |
	| `java.lang.Object` | `[fishForMessage](#fishForMessage(scala.concurrent.duration.Duration,java.lang.String,java.util.function.Function))​(scala.concurrent.duration.Duration max,  java.lang.String hint,  java.util.function.Function<java.lang.Object,​java.lang.Object> f)` | Deprecated. Use the overloaded one which accepts java.time.Duration instead. |
	| `<T> T` | `[fishForSpecificMessage](#fishForSpecificMessage(java.time.Duration,java.lang.String,java.util.function.Function))​(java.time.Duration max,  java.lang.String hint,  java.util.function.Function<java.lang.Object,​T> f)` | Same as `fishForMessage`, but gets a different partial function and returns properly typed message. |
	| `<T> T` | `[fishForSpecificMessage](#fishForSpecificMessage(scala.concurrent.duration.Duration,java.lang.String,java.util.function.Function))​(scala.concurrent.duration.Duration max,  java.lang.String hint,  java.util.function.Function<java.lang.Object,​T> f)` | Deprecated. Use the overloaded one which accepts java.time.Duration instead. |
	| `void` | `[forward](#forward(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actor)` | Forward this message as if in the TestActor's receive method with self.forward. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[getLastSender](#getLastSender())()` | Get the last sender of the TestProbe |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[getRef](#getRef())()` | Shorthand to get the testActor. |
	| `java.time.Duration` | `[getRemaining](#getRemaining())()` | Obtain time remaining for execution of the innermost enclosing `within`  block or throw an `AssertionError` if no `within` block surrounds this  call. |
	| `java.time.Duration` | `[getRemainingOr](#getRemainingOr(java.time.Duration))​(java.time.Duration duration)` | Obtain time remaining for execution of the innermost enclosing `within`  block or missing that it returns the given duration. |
	| `java.time.Duration` | `[getRemainingOrDefault](#getRemainingOrDefault())()` | Obtain time remaining for execution of the innermost enclosing `within`  block or missing that it returns the properly dilated default for this  case from settings (key "akka.test.single\-expect\-default"). |
	| `[ActorSystem](../../actor/ActorSystem.html "class in akka.actor")` | `[getSystem](#getSystem())()` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[getTestActor](#getTestActor())()` | ActorRef of the test actor. |
	| `void` | `[ignoreMsg](#ignoreMsg(java.util.function.Function))​(java.util.function.Function<java.lang.Object,​java.lang.Object> pf)` | Ignore all messages in the test actor for which the given partial  function returns true. |
	| `void` | `[ignoreNoMsg](#ignoreNoMsg())()` | Stop ignoring messages in the test actor. |
	| `boolean` | `[msgAvailable](#msgAvailable())()` | Query queue status. |
	| `java.util.List<java.lang.Object>` | `[receiveN](#receiveN(int))​(int n)` | Same as `receiveN(n, remaining)` but correctly taking into account  Duration.timeFactor. |
	| `java.util.List<java.lang.Object>` | `[receiveN](#receiveN(int,java.time.Duration))​(int n,  java.time.Duration max)` | Receive N messages in a row before the given deadline. |
	| `java.lang.Object` | `[receiveOne](#receiveOne(java.time.Duration))​(java.time.Duration max)` | Receive one message from the internal queue of the TestActor. |
	| `<T> java.util.List<T>` | `[receiveWhile](#receiveWhile(java.time.Duration,java.time.Duration,int,java.util.function.Function))​(java.time.Duration max,  java.time.Duration idle,  int messages,  java.util.function.Function<java.lang.Object,​T> f)` | Receive a series of messages until one does not match the given partial  function or the idle timeout is met (disabled by default) or the overall  maximum duration is elapsed or expected messages count is reached. |
	| `<T> java.util.List<T>` | `[receiveWhile](#receiveWhile(java.time.Duration,java.util.function.Function))​(java.time.Duration max,  java.util.function.Function<java.lang.Object,​T> f)` |  |
	| `void` | `[reply](#reply(java.lang.Object))​(java.lang.Object msg)` | Send message to the sender of the last dequeued message. |
	| `void` | `[send](#send(akka.actor.ActorRef,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actor,  java.lang.Object msg)` | Send message to an actor while using the probe's TestActor as the sender. |
	| `void` | `[setAutoPilot](#setAutoPilot(akka.testkit.TestActor.AutoPilot))​([TestActor.AutoPilot](../TestActor.AutoPilot.html "class in akka.testkit") pilot)` | Install an AutoPilot to drive the testActor: the AutoPilot will be run  for each received message and can be used to send or forward messages,  etc. |
	| `static void` | `[shutdownActorSystem](#shutdownActorSystem(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem)` | Shut down an actor system and wait for termination. |
	| `static void` | `[shutdownActorSystem](#shutdownActorSystem(akka.actor.ActorSystem,boolean))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,  boolean verifySystemShutdown)` | Shut down an actor system and wait for termination. |
	| `static void` | `[shutdownActorSystem](#shutdownActorSystem(akka.actor.ActorSystem,scala.concurrent.duration.Duration))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,  scala.concurrent.duration.Duration duration)` | Shut down an actor system and wait for termination. |
	| `static void` | `[shutdownActorSystem](#shutdownActorSystem(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,  scala.concurrent.duration.Duration duration,  boolean verifySystemShutdown)` | Shut down an actor system and wait for termination. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[unwatch](#unwatch(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` | Have the testActor stop watching someone (i.e. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[watch](#watch(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` | Have the testActor watch someone (i.e. |
	| `<T> T` | `[within](#within(java.time.Duration,java.time.Duration,java.util.function.Supplier))​(java.time.Duration min,  java.time.Duration max,  java.util.function.Supplier<T> f)` | Execute code block while bounding its execution time between `min` and  `max`. |
	| `<T> T` | `[within](#within(java.time.Duration,java.util.function.Supplier))​(java.time.Duration max,  java.util.function.Supplier<T> f)` | Execute code block while bounding its execution time between `min` and  `max`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestKit
		
		
		
		```
		public TestKit​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### shutdownActorSystem
		
		
		
		```
		public static void shutdownActorSystem​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,
		                                       scala.concurrent.duration.Duration duration,
		                                       boolean verifySystemShutdown)
		```
		
		Shut down an actor system and wait for termination.
		 On failure debug output will be logged about the remaining actors in the system.
		 
		 If verifySystemShutdown is true, then an exception will be thrown on failure.
		- #### shutdownActorSystem
		
		
		
		```
		public static void shutdownActorSystem​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem)
		```
		
		Shut down an actor system and wait for termination.
		 On failure debug output will be logged about the remaining actors in the system.
		- #### shutdownActorSystem
		
		
		
		```
		public static void shutdownActorSystem​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,
		                                       scala.concurrent.duration.Duration duration)
		```
		
		Shut down an actor system and wait for termination.
		 On failure debug output will be logged about the remaining actors in the system.
		- #### shutdownActorSystem
		
		
		
		```
		public static void shutdownActorSystem​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") actorSystem,
		                                       boolean verifySystemShutdown)
		```
		
		Shut down an actor system and wait for termination.
		 On failure debug output will be logged about the remaining actors in the system.
		 
		 If verifySystemShutdown is true, then an exception will be thrown on failure.
		- #### expectMsgAnyOf
		
		
		
		```
		public <T> T expectMsgAnyOf​(T first,
		                            java.lang.Object... objs)
		```
		
		Same as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.
		- #### expectMsgAnyOfWithin
		
		
		
		```
		public <T> T expectMsgAnyOfWithin​(java.time.Duration max,
		                                  java.lang.Object... objs)
		```
		
		Receive one message from the test actor and assert that it equals one of
		 the given objects. Wait time is bounded by the given duration, with an
		 AssertionFailure being thrown in case of timeout.
		- #### expectMsgAllOf
		
		
		
		```
		public <T> java.util.List<T> expectMsgAllOf​(java.lang.Object... objs)
		```
		
		Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.
		- #### expectMsgAllOfWithin
		
		
		
		```
		public <T> java.util.List<T> expectMsgAllOfWithin​(java.time.Duration max,
		                                                  java.lang.Object... objs)
		```
		
		Receive a number of messages from the test actor matching the given
		 number of objects and assert that for each given object one is received
		 which equals it and vice versa. This construct is useful when the order in
		 which the objects are received is not fixed. Wait time is bounded by the
		 given duration, with an AssertionFailure being thrown in case of timeout.
		- #### expectMsgAnyClassOf
		
		
		
		```
		public <T> T expectMsgAnyClassOf​(java.lang.Class<?>... objs)
		```
		
		Same as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.
		- #### expectMsgAnyClassOf
		
		
		
		```
		public <T> T expectMsgAnyClassOf​(java.time.Duration max,
		                                 java.lang.Class<?>... objs)
		```
		
		Receive one message from the test actor and assert that it conforms to
		 one of the given classes. Wait time is bounded by the given duration,
		 with an AssertionFailure being thrown in case of timeout.
		- #### getTestActor
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") getTestActor()
		```
		
		ActorRef of the test actor. Access is provided to enable e.g. registration
		 as message target.
		- #### getRef
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") getRef()
		```
		
		Shorthand to get the testActor.
		- #### getSystem
		
		
		
		```
		public [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") getSystem()
		```
		- #### duration
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration duration​(java.lang.String s)
		```
		- #### dilated
		
		
		
		```
		public java.time.Duration dilated​(java.time.Duration duration)
		```
		
		Java timeouts (durations) during tests with the configured
		- #### msgAvailable
		
		
		
		```
		public boolean msgAvailable()
		```
		
		Query queue status.
		- #### getLastSender
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") getLastSender()
		```
		
		Get the last sender of the TestProbe
		- #### send
		
		
		
		```
		public void send​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actor,
		                 java.lang.Object msg)
		```
		
		Send message to an actor while using the probe's TestActor as the sender.
		 Replies will be available for inspection with all of TestKit's assertion
		 methods.
		- #### forward
		
		
		
		```
		public void forward​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actor)
		```
		
		Forward this message as if in the TestActor's receive method with self.forward.
		- #### reply
		
		
		
		```
		public void reply​(java.lang.Object msg)
		```
		
		Send message to the sender of the last dequeued message.
		- #### watch
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") watch​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		Have the testActor watch someone (i.e. `context.watch(...)`).
		- #### unwatch
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") unwatch​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		Have the testActor stop watching someone (i.e. `context.unwatch(...)`).
		- #### ignoreMsg
		
		
		
		```
		public void ignoreMsg​(java.util.function.Function<java.lang.Object,​java.lang.Object> pf)
		```
		
		Ignore all messages in the test actor for which the given partial
		 function returns true.
		- #### ignoreNoMsg
		
		
		
		```
		public void ignoreNoMsg()
		```
		
		Stop ignoring messages in the test actor.
		- #### setAutoPilot
		
		
		
		```
		public void setAutoPilot​([TestActor.AutoPilot](../TestActor.AutoPilot.html "class in akka.testkit") pilot)
		```
		
		Install an AutoPilot to drive the testActor: the AutoPilot will be run
		 for each received message and can be used to send or forward messages,
		 etc. Each invocation must return the AutoPilot for the next round.
		- #### getRemaining
		
		
		
		```
		public java.time.Duration getRemaining()
		```
		
		Obtain time remaining for execution of the innermost enclosing `within`
		 block or throw an `AssertionError` if no `within` block surrounds this
		 call.
		- #### getRemainingOr
		
		
		
		```
		public java.time.Duration getRemainingOr​(java.time.Duration duration)
		```
		
		Obtain time remaining for execution of the innermost enclosing `within`
		 block or missing that it returns the given duration.
		- #### getRemainingOrDefault
		
		
		
		```
		public java.time.Duration getRemainingOrDefault()
		```
		
		Obtain time remaining for execution of the innermost enclosing `within`
		 block or missing that it returns the properly dilated default for this
		 case from settings (key "akka.test.single\-expect\-default").
		- #### within
		
		
		
		```
		public <T> T within​(java.time.Duration min,
		                    java.time.Duration max,
		                    java.util.function.Supplier<T> f)
		```
		
		Execute code block while bounding its execution time between `min` and
		 `max`. `within` blocks may be nested. All methods in this trait which
		 take maximum wait times are available in a version which implicitly uses
		 the remaining time governed by the innermost enclosing `within` block.
		 
		 Note that the timeout is scaled using Duration.dilated, which uses the
		 configuration entry "akka.test.timefactor", while the min Duration is not.
		 
		
		
		
		
		
		```
		
		
		  within(java.time.Duration.ofMillis(50), () -> {
		    test.tell("ping");
		    return expectMsgClass(String.class);
		  });
		
		 
		```
		- #### within
		
		
		
		```
		public <T> T within​(java.time.Duration max,
		                    java.util.function.Supplier<T> f)
		```
		
		Execute code block while bounding its execution time between `min` and
		 `max`. `within` blocks may be nested. All methods in this trait which
		 take maximum wait times are available in a version which implicitly uses
		 the remaining time governed by the innermost enclosing `within` block.
		 
		 Note that the timeout is scaled using Duration.dilated, which uses the
		 configuration entry "akka.test.timefactor", while the min Duration is not.
		 
		
		
		
		
		
		```
		
		
		  within(java.time.Duration.ofMillis(50), () -> {
		    test.tell("ping");
		    return expectMsgClass(String.class);
		  });
		
		 
		```
		- #### awaitCond
		
		
		
		```
		public void awaitCond​(java.util.function.Supplier<java.lang.Object> p)
		```
		
		Await until the given condition evaluates to `true` or the timeout
		 expires, whichever comes first.
		 
		 If no timeout is given, take it from the innermost enclosing `within`
		 block.
		 
		
		
		 Note that the timeout is scaled using Duration.dilated,
		 which uses the configuration entry "akka.test.timefactor".
		- #### awaitCond
		
		
		
		```
		public void awaitCond​(java.time.Duration max,
		                      java.util.function.Supplier<java.lang.Object> p)
		```
		
		Await until the given condition evaluates to `true` or the timeout
		 expires, whichever comes first.
		 
		 If no timeout is given, take it from the innermost enclosing `within`
		 block.
		 
		
		
		 Note that the timeout is scaled using Duration.dilated,
		 which uses the configuration entry "akka.test.timefactor".
		- #### awaitCond
		
		
		
		```
		public void awaitCond​(java.time.Duration max,
		                      java.time.Duration interval,
		                      java.util.function.Supplier<java.lang.Object> p)
		```
		
		Await until the given condition evaluates to `true` or the timeout
		 expires, whichever comes first.
		 
		 If no timeout is given, take it from the innermost enclosing `within`
		 block.
		 
		
		
		 Note that the timeout is scaled using Duration.dilated,
		 which uses the configuration entry "akka.test.timefactor".
		- #### awaitCond
		
		
		
		```
		public void awaitCond​(java.time.Duration max,
		                      java.time.Duration interval,
		                      java.lang.String message,
		                      java.util.function.Supplier<java.lang.Object> p)
		```
		
		Await until the given condition evaluates to `true` or the timeout
		 expires, whichever comes first.
		 
		 If no timeout is given, take it from the innermost enclosing `within`
		 block.
		 
		
		
		 Note that the timeout is scaled using Duration.dilated,
		 which uses the configuration entry "akka.test.timefactor".
		- #### awaitAssert
		
		
		
		```
		public <A> A awaitAssert​(java.util.function.Supplier<A> a)
		```
		
		Evaluate the given assert every `interval` until it does not throw an exception and return the
		 result.
		 
		 If the `max` timeout expires the last exception is thrown.
		 
		
		
		 If no timeout is given, take it from the innermost enclosing `within`
		 block.
		 
		
		
		 Note that the timeout is scaled using Duration.dilated,
		 which uses the configuration entry "akka.test.timefactor".
		- #### awaitAssert
		
		
		
		```
		public <A> A awaitAssert​(java.time.Duration max,
		                         java.util.function.Supplier<A> a)
		```
		
		Evaluate the given assert every `interval` until it does not throw an exception and return the
		 result.
		 
		 If the `max` timeout expires the last exception is thrown.
		 
		
		
		 If no timeout is given, take it from the innermost enclosing `within`
		 block.
		 
		
		
		 Note that the timeout is scaled using Duration.dilated,
		 which uses the configuration entry "akka.test.timefactor".
		- #### awaitAssert
		
		
		
		```
		public <A> A awaitAssert​(java.time.Duration max,
		                         java.time.Duration interval,
		                         java.util.function.Supplier<A> a)
		```
		
		Evaluate the given assert every `interval` until it does not throw an exception.
		 If the `max` timeout expires the last exception is thrown.
		 
		 Note that the timeout is scaled using Duration.dilated,
		 which uses the configuration entry "akka.test.timefactor".
		 
		
		
		
		Returns:
		an arbitrary value that would be returned from awaitAssert if successful, if not interested in such value you can return null.
		- #### expectMsgEquals
		
		
		
		```
		public <T> T expectMsgEquals​(T obj)
		```
		
		Same as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor.
		- #### expectMsgEquals
		
		
		
		```
		public <T> T expectMsgEquals​(java.time.Duration max,
		                             T obj)
		```
		
		Receive one message from the test actor and assert that it equals the given
		 object. Wait time is bounded by the given duration, with an
		 AssertionFailure being thrown in case of timeout.
		 
		
		Returns:
		the received object
		- #### expectMsg
		
		
		
		```
		public <T> T expectMsg​(T obj)
		```
		
		Same as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor.
		- #### expectMsg
		
		
		
		```
		public <T> T expectMsg​(java.time.Duration max,
		                       T obj)
		```
		
		Receive one message from the test actor and assert that it equals the
		 given object. Wait time is bounded by the given duration, with an
		 AssertionFailure being thrown in case of timeout.
		- #### expectMsg
		
		
		
		```
		public <T> T expectMsg​(java.time.Duration max,
		                       T obj,
		                       java.lang.String hint)
		```
		
		Receive one message from the test actor and assert that it equals the
		 given object. Wait time is bounded by the given duration, with an
		 AssertionFailure being thrown in case of timeout.
		- #### expectMsgPF
		
		
		
		```
		public <T> T expectMsgPF​(java.lang.String hint,
		                         java.util.function.Function<java.lang.Object,​T> f)
		```
		
		Receive one message from the test actor and assert that the given
		 partial function accepts it. Wait time is bounded by the given duration,
		 with an AssertionFailure being thrown in case of timeout.
		 
		 Use this variant to implement more complicated or conditional
		 processing.
		- #### expectMsgPF
		
		
		
		```
		public <T> T expectMsgPF​(scala.concurrent.duration.Duration max,
		                         java.lang.String hint,
		                         java.util.function.Function<java.lang.Object,​T> f)
		```
		
		Deprecated.
		Use the overloaded one which accepts java.time.Duration instead. Since 2\.6\.0\.
		
		Receive one message from the test actor and assert that the given
		 partial function accepts it. Wait time is bounded by the given duration,
		 with an AssertionFailure being thrown in case of timeout.
		 
		 Use this variant to implement more complicated or conditional
		 processing.
		- #### expectMsgPF
		
		
		
		```
		public <T> T expectMsgPF​(java.time.Duration max,
		                         java.lang.String hint,
		                         java.util.function.Function<java.lang.Object,​T> f)
		```
		
		Receive one message from the test actor and assert that the given
		 partial function accepts it. Wait time is bounded by the given duration,
		 with an AssertionFailure being thrown in case of timeout.
		 
		 Use this variant to implement more complicated or conditional
		 processing.
		- #### expectMsgClass
		
		
		
		```
		public <T> T expectMsgClass​(java.lang.Class<T> c)
		```
		
		Same as `expectMsgClass(remainingOrDefault, c)`, but correctly treating the timeFactor.
		- #### expectMsgClass
		
		
		
		```
		public <T> T expectMsgClass​(java.time.Duration max,
		                            java.lang.Class<T> c)
		```
		
		Receive one message from the test actor and assert that it conforms to
		 the given class. Wait time is bounded by the given duration, with an
		 AssertionFailure being thrown in case of timeout.
		- #### expectMsgAnyOf
		
		
		
		```
		public <T> T expectMsgAnyOf​(T first,
		                            scala.collection.immutable.Seq<T> objs)
		```
		
		Same as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.
		- #### expectMsgAnyOfWithin
		
		
		
		```
		public <T> T expectMsgAnyOfWithin​(java.time.Duration max,
		                                  scala.collection.immutable.Seq<T> objs)
		```
		
		Receive one message from the test actor and assert that it equals one of
		 the given objects. Wait time is bounded by the given duration, with an
		 AssertionFailure being thrown in case of timeout.
		- #### expectMsgAllOf
		
		
		
		```
		public <T> java.util.List<T> expectMsgAllOf​(scala.collection.immutable.Seq<T> objs)
		```
		
		Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.
		- #### expectMsgAllOfWithin
		
		
		
		```
		public <T> java.util.List<T> expectMsgAllOfWithin​(java.time.Duration max,
		                                                  scala.collection.immutable.Seq<T> objs)
		```
		
		Receive a number of messages from the test actor matching the given
		 number of objects and assert that for each given object one is received
		 which equals it and vice versa. This construct is useful when the order in
		 which the objects are received is not fixed. Wait time is bounded by the
		 given duration, with an AssertionFailure being thrown in case of timeout.
		- #### expectMsgAnyClassOf
		
		
		
		```
		public <T> T expectMsgAnyClassOf​(scala.collection.immutable.Seq<java.lang.Class<?>> objs)
		```
		
		Same as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.
		- #### expectMsgAnyClassOf
		
		
		
		```
		public <T> T expectMsgAnyClassOf​(java.time.Duration max,
		                                 scala.collection.immutable.Seq<java.lang.Class<?>> objs)
		```
		
		Receive one message from the test actor and assert that it conforms to
		 one of the given classes. Wait time is bounded by the given duration,
		 with an AssertionFailure being thrown in case of timeout.
		- #### expectNoMessage
		
		
		
		```
		public void expectNoMessage()
		```
		
		Assert that no message is received. Waits for the default period configured as
		 `akka.actor.testkit.expect-no-message-default`.
		 That timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
		- #### expectNoMessage
		
		
		
		```
		public void expectNoMessage​(java.time.Duration max)
		```
		
		Assert that no message is received for the specified time.
		 Supplied value is not dilated.
		- #### expectTerminated
		
		
		
		```
		public [Terminated](../../actor/Terminated.html "class in akka.actor") expectTerminated​(scala.concurrent.duration.Duration max,
		                                   [ActorRef](../../actor/ActorRef.html "class in akka.actor") target)
		```
		
		Deprecated.
		Use the overloaded one which accepts java.time.Duration instead. Since 2\.6\.0\.
		
		Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.
		 Before calling this method, you have to `watch` the target actor ref.
		 Wait time is bounded by the given duration, with an AssertionFailure being thrown in case of timeout.
		 
		
		Parameters:
		`max` \- wait no more than max time, otherwise throw AssertionFailure
		`target` \- the actor ref expected to be Terminated
		Returns:
		the received Terminated message
		- #### expectTerminated
		
		
		
		```
		public [Terminated](../../actor/Terminated.html "class in akka.actor") expectTerminated​(java.time.Duration max,
		                                   [ActorRef](../../actor/ActorRef.html "class in akka.actor") target)
		```
		
		Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.
		 Before calling this method, you have to `watch` the target actor ref.
		 Wait time is bounded by the given duration, with an AssertionFailure being thrown in case of timeout.
		 
		
		Parameters:
		`max` \- wait no more than max time, otherwise throw AssertionFailure
		`target` \- the actor ref expected to be Terminated
		Returns:
		the received Terminated message
		- #### expectTerminated
		
		
		
		```
		public [Terminated](../../actor/Terminated.html "class in akka.actor") expectTerminated​([ActorRef](../../actor/ActorRef.html "class in akka.actor") target)
		```
		
		Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.
		 Before calling this method, you have to `watch` the target actor ref.
		 Wait time is bounded by the given duration, with an AssertionFailure being thrown in case of timeout.
		 
		
		Parameters:
		`target` \- the actor ref expected to be Terminated
		Returns:
		the received Terminated message
		- #### fishForMessage
		
		
		
		```
		public java.lang.Object fishForMessage​(scala.concurrent.duration.Duration max,
		                                       java.lang.String hint,
		                                       java.util.function.Function<java.lang.Object,​java.lang.Object> f)
		```
		
		Deprecated.
		Use the overloaded one which accepts java.time.Duration instead. Since 2\.6\.0\.
		
		Hybrid of expectMsgPF and receiveWhile: receive messages while the
		 partial function matches and returns false. Use it to ignore certain
		 messages while waiting for a specific message.
		 
		
		Returns:
		the last received message, i.e. the first one for which the
		 partial function returned true
		- #### fishForMessage
		
		
		
		```
		public java.lang.Object fishForMessage​(java.time.Duration max,
		                                       java.lang.String hint,
		                                       java.util.function.Function<java.lang.Object,​java.lang.Object> f)
		```
		
		Hybrid of expectMsgPF and receiveWhile: receive messages while the
		 partial function matches and returns false. Use it to ignore certain
		 messages while waiting for a specific message.
		 
		
		Returns:
		the last received message, i.e. the first one for which the
		 partial function returned true
		- #### fishForSpecificMessage
		
		
		
		```
		public <T> T fishForSpecificMessage​(scala.concurrent.duration.Duration max,
		                                    java.lang.String hint,
		                                    java.util.function.Function<java.lang.Object,​T> f)
		```
		
		Deprecated.
		Use the overloaded one which accepts java.time.Duration instead. Since 2\.6\.0\.
		
		Same as `fishForMessage`, but gets a different partial function and returns properly typed message.
		- #### fishForSpecificMessage
		
		
		
		```
		public <T> T fishForSpecificMessage​(java.time.Duration max,
		                                    java.lang.String hint,
		                                    java.util.function.Function<java.lang.Object,​T> f)
		```
		
		Same as `fishForMessage`, but gets a different partial function and returns properly typed message.
		- #### receiveN
		
		
		
		```
		public java.util.List<java.lang.Object> receiveN​(int n)
		```
		
		Same as `receiveN(n, remaining)` but correctly taking into account
		 Duration.timeFactor.
		- #### receiveN
		
		
		
		```
		public java.util.List<java.lang.Object> receiveN​(int n,
		                                                 java.time.Duration max)
		```
		
		Receive N messages in a row before the given deadline.
		- #### receiveOne
		
		
		
		```
		public java.lang.Object receiveOne​(java.time.Duration max)
		```
		
		Receive one message from the internal queue of the TestActor. If the given
		 duration is zero, the queue is polled (non\-blocking).
		 
		 This method does NOT automatically scale its Duration parameter!
		- #### receiveWhile
		
		
		
		```
		public <T> java.util.List<T> receiveWhile​(java.time.Duration max,
		                                          java.time.Duration idle,
		                                          int messages,
		                                          java.util.function.Function<java.lang.Object,​T> f)
		```
		
		Receive a series of messages until one does not match the given partial
		 function or the idle timeout is met (disabled by default) or the overall
		 maximum duration is elapsed or expected messages count is reached.
		 Returns the sequence of messages.
		 
		 Note that it is not an error to hit the `max` duration in this case.
		 
		
		
		 One possible use of this method is for testing whether messages of
		 certain characteristics are generated at a certain rate:
		- #### receiveWhile
		
		
		
		```
		public <T> java.util.List<T> receiveWhile​(java.time.Duration max,
		                                          java.util.function.Function<java.lang.Object,​T> f)
		```
		- #### childActorOf
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") childActorOf​([Props](../../actor/Props.html "class in akka.actor") props,
		                             java.lang.String name,
		                             [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy)
		```
		
		Spawns an actor as a child of this test actor, and returns the child's ActorRef.
		- #### childActorOf
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") childActorOf​([Props](../../actor/Props.html "class in akka.actor") props,
		                             [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy)
		```
		
		Spawns an actor as a child of this test actor with an auto\-generated name, and returns the child's ActorRef.
		- #### childActorOf
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") childActorOf​([Props](../../actor/Props.html "class in akka.actor") props,
		                             java.lang.String name)
		```
		
		Spawns an actor as a child of this test actor with a stopping supervisor strategy, and returns the child's ActorRef.
		- #### childActorOf
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") childActorOf​([Props](../../actor/Props.html "class in akka.actor") props)
		```
		
		Spawns an actor as a child of this test actor with an auto\-generated name and stopping supervisor strategy, returning the child's ActorRef.

## Code Examples

### Example 1: within

```text
within(java.time.Duration.ofMillis(50), () -> {
    test.tell("ping");
    return expectMsgClass(String.class);
  });
```

### Example 2: within

```text
within(java.time.Duration.ofMillis(50), () -> {
    test.tell("ping");
    return expectMsgClass(String.class);
  });
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActor.AutoPilot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/javadsl/TestKit.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/javadsl/TestKit.html)*