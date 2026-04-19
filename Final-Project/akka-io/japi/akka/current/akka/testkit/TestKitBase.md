---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestKitBase.html
title: TestKitBase
---

# TestKitBase

## Content

Package [akka.testkit](package-summary.html)
## Interface TestKitBase

- All Known Implementing Classes:
`[JavaJournalPerfSpec](../persistence/japi/journal/JavaJournalPerfSpec.html "class in akka.persistence.japi.journal")`, `[JavaJournalSpec](../persistence/japi/journal/JavaJournalSpec.html "class in akka.persistence.japi.journal")`, `[JavaSnapshotStoreSpec](../persistence/japi/snapshot/JavaSnapshotStoreSpec.html "class in akka.persistence.japi.snapshot")`, `[JournalPerfSpec](../persistence/journal/JournalPerfSpec.html "class in akka.persistence.journal")`, `[JournalSpec](../persistence/journal/JournalSpec.html "class in akka.persistence.journal")`, `[MultiNodeSpec](../remote/testkit/MultiNodeSpec.html "class in akka.remote.testkit")`, `[PluginSpec](../persistence/PluginSpec.html "class in akka.persistence")`, `[SnapshotStoreSpec](../persistence/snapshot/SnapshotStoreSpec.html "class in akka.persistence.snapshot")`, `[TestKit](TestKit.html "class in akka.testkit")`, `[TestProbe](TestProbe.html "class in akka.testkit")`

---

```
public interface TestKitBase
```

Implementation trait behind the [`TestKit`](TestKit.html "class in akka.testkit") class: you may use
 this if inheriting from a concrete class is not possible.
 
 This trait requires the concrete class mixing it in to provide an
 [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") which is available before this traits\&rsquo;s
 constructor is run. The recommended way is this:
 

```

 class MyTest extends TestKitBase {
   implicit lazy val system = ActorSystem() // may add arguments here
   ...
 }
 
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<A> A` | `[assertForDuration](#assertForDuration(scala.Function0,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.Duration))​(scala.Function0<A> a,  scala.concurrent.duration.FiniteDuration max,  scala.concurrent.duration.Duration interval)` | Evaluate the given assert every `interval` until exception is thrown or `max` timeout is expired. |
	| `<A> scala.concurrent.duration.Duration` | `[assertForDuration$default$3](#assertForDuration$default$3())()` |  |
	| `<A> A` | `[awaitAssert](#awaitAssert(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration))​(scala.Function0<A> a,  scala.concurrent.duration.Duration max,  scala.concurrent.duration.Duration interval)` | Evaluate the given assert every `interval` until it does not throw an exception and return the  result. |
	| `<A> scala.concurrent.duration.Duration` | `[awaitAssert$default$2](#awaitAssert$default$2())()` |  |
	| `<A> scala.concurrent.duration.Duration` | `[awaitAssert$default$3](#awaitAssert$default$3())()` |  |
	| `void` | `[awaitCond](#awaitCond(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,java.lang.String))​(scala.Function0<java.lang.Object> p,  scala.concurrent.duration.Duration max,  scala.concurrent.duration.Duration interval,  java.lang.String message)` | Await until the given condition evaluates to `true` or the timeout  expires, whichever comes first. |
	| `scala.concurrent.duration.Duration` | `[awaitCond$default$2](#awaitCond$default$2())()` |  |
	| `scala.concurrent.duration.Duration` | `[awaitCond$default$3](#awaitCond$default$3())()` |  |
	| `java.lang.String` | `[awaitCond$default$4](#awaitCond$default$4())()` |  |
	| `void` | `[checkMissingAndUnexpected](#checkMissingAndUnexpected(scala.collection.immutable.Seq,scala.collection.immutable.Seq,java.lang.String,java.lang.String))​(scala.collection.immutable.Seq<java.lang.Object> missing,  scala.collection.immutable.Seq<java.lang.Object> unexpected,  java.lang.String missingMessage,  java.lang.String unexpectedMessage)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[childActorOf](#childActorOf(akka.actor.Props))​([Props](../actor/Props.html "class in akka.actor") props)` | Spawns an actor as a child of this test actor with an auto\-generated name and stopping supervisor strategy, returning the child's ActorRef. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[childActorOf](#childActorOf(akka.actor.Props,akka.actor.SupervisorStrategy))​([Props](../actor/Props.html "class in akka.actor") props,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy)` | Spawns an actor as a child of this test actor with an auto\-generated name, and returns the child's ActorRef. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[childActorOf](#childActorOf(akka.actor.Props,java.lang.String))​([Props](../actor/Props.html "class in akka.actor") props,  java.lang.String name)` | Spawns an actor as a child of this test actor with a stopping supervisor strategy, and returns the child's ActorRef. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[childActorOf](#childActorOf(akka.actor.Props,java.lang.String,akka.actor.SupervisorStrategy))​([Props](../actor/Props.html "class in akka.actor") props,  java.lang.String name,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy)` | Spawns an actor as a child of this test actor, and returns the child's ActorRef. |
	| `void` | `[end_$eq](#end_$eq(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration x$1)` |  |
	| `<T> T` | `[expectMsg](#expectMsg(scala.concurrent.duration.FiniteDuration,java.lang.String,T))​(scala.concurrent.duration.FiniteDuration max,  java.lang.String hint,  T obj)` | Receive one message from the test actor and assert that it equals the  given object. |
	| `<T> T` | `[expectMsg](#expectMsg(scala.concurrent.duration.FiniteDuration,T))​(scala.concurrent.duration.FiniteDuration max,  T obj)` | Receive one message from the test actor and assert that it equals the  given object. |
	| `<T> T` | `[expectMsg](#expectMsg(T))​(T obj)` | Same as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor. |
	| `<T> T` | `[expectMsg_internal](#expectMsg_internal(scala.concurrent.duration.Duration,T,scala.Option))​(scala.concurrent.duration.Duration max,  T obj,  scala.Option<java.lang.String> hint)` |  |
	| `<T> scala.Option<java.lang.String>` | `[expectMsg_internal$default$3](#expectMsg_internal$default$3())()` |  |
	| `<T> scala.collection.immutable.Seq<T>` | `[expectMsgAllClassOf](#expectMsgAllClassOf(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)` | Same as `expectMsgAllClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor. |
	| `<T> scala.collection.immutable.Seq<T>` | `[expectMsgAllClassOf](#expectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration max,  scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)` | Receive a number of messages from the test actor matching the given  number of classes and assert that for each given class one is received  which is of that class (equality, not conformance). |
	| `<T> scala.collection.immutable.Seq<T>` | `[expectMsgAllConformingOf](#expectMsgAllConformingOf(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)` | Same as `expectMsgAllConformingOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor. |
	| `<T> scala.collection.immutable.Seq<T>` | `[expectMsgAllConformingOf](#expectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration max,  scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)` | Receive a number of messages from the test actor matching the given  number of classes and assert that for each given class one is received  which conforms to that class (and vice versa). |
	| `<T> scala.collection.immutable.Seq<T>` | `[expectMsgAllOf](#expectMsgAllOf(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<T> obj)` | Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor. |
	| `<T> scala.collection.immutable.Seq<T>` | `[expectMsgAllOf](#expectMsgAllOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration max,  scala.collection.immutable.Seq<T> obj)` | Receive a number of messages from the test actor matching the given  number of objects and assert that for each given object one is received  which equals it and vice versa. |
	| `<T> scala.collection.immutable.Seq<T>` | `[expectMsgAllOf_internal](#expectMsgAllOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration max,  scala.collection.immutable.Seq<T> obj)` |  |
	| `<C> C` | `[expectMsgAnyClassOf](#expectMsgAnyClassOf(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Class<? extends C>> obj)` | Same as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor. |
	| `<C> C` | `[expectMsgAnyClassOf](#expectMsgAnyClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration max,  scala.collection.immutable.Seq<java.lang.Class<? extends C>> obj)` | Receive one message from the test actor and assert that it conforms to  one of the given classes. |
	| `<C> C` | `[expectMsgAnyClassOf_internal](#expectMsgAnyClassOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration max,  scala.collection.immutable.Seq<java.lang.Class<? extends C>> obj)` |  |
	| `<T> T` | `[expectMsgAnyOf](#expectMsgAnyOf(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<T> obj)` | Same as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor. |
	| `<T> T` | `[expectMsgAnyOf](#expectMsgAnyOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration max,  scala.collection.immutable.Seq<T> obj)` | Receive one message from the test actor and assert that it equals one of  the given objects. |
	| `<T> T` | `[expectMsgAnyOf_internal](#expectMsgAnyOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration max,  scala.collection.immutable.Seq<T> obj)` |  |
	| `<C> C` | `[expectMsgClass](#expectMsgClass(java.lang.Class))​(java.lang.Class<C> c)` | Same as `expectMsgClass(remainingOrDefault, c)`, but correctly treating the timeFactor. |
	| `<C> C` | `[expectMsgClass](#expectMsgClass(scala.concurrent.duration.FiniteDuration,java.lang.Class))​(scala.concurrent.duration.FiniteDuration max,  java.lang.Class<C> c)` | Receive one message from the test actor and assert that it conforms to  the given class. |
	| `<C> C` | `[expectMsgClass_internal](#expectMsgClass_internal(scala.concurrent.duration.FiniteDuration,java.lang.Class))​(scala.concurrent.duration.FiniteDuration max,  java.lang.Class<C> c)` |  |
	| `<T> T` | `[expectMsgPF](#expectMsgPF(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction))​(scala.concurrent.duration.Duration max,  java.lang.String hint,  scala.PartialFunction<java.lang.Object,​T> f)` | Receive one message from the test actor and assert that the given  partial function accepts it. |
	| `<T> scala.concurrent.duration.Duration` | `[expectMsgPF$default$1](#expectMsgPF$default$1())()` |  |
	| `<T> java.lang.String` | `[expectMsgPF$default$2](#expectMsgPF$default$2())()` |  |
	| `<T> T` | `[expectMsgType](#expectMsgType(scala.concurrent.duration.FiniteDuration,scala.reflect.ClassTag))​(scala.concurrent.duration.FiniteDuration max,  scala.reflect.ClassTag<T> t)` | Receive one message from the test actor and assert that it conforms to the  given type (after erasure). |
	| `<T> T` | `[expectMsgType](#expectMsgType(scala.reflect.ClassTag))​(scala.reflect.ClassTag<T> t)` | Same as `expectMsgType[T](remainingOrDefault)`, but correctly treating the timeFactor. |
	| `void` | `[expectNoMessage](#expectNoMessage())()` | Assert that no message is received. |
	| `void` | `[expectNoMessage](#expectNoMessage(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration max)` | Assert that no message is received for the specified time. |
	| `void` | `[expectNoMsg_internal](#expectNoMsg_internal(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration max)` |  |
	| `[Terminated](../actor/Terminated.html "class in akka.actor")` | `[expectTerminated](#expectTerminated(akka.actor.ActorRef,scala.concurrent.duration.Duration))​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,  scala.concurrent.duration.Duration max)` | Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef. |
	| `scala.concurrent.duration.Duration` | `[expectTerminated$default$2](#expectTerminated$default$2())()` |  |
	| `java.lang.Object` | `[fishForMessage](#fishForMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction))​(scala.concurrent.duration.Duration max,  java.lang.String hint,  scala.PartialFunction<java.lang.Object,​java.lang.Object> f)` | Hybrid of expectMsgPF and receiveWhile: receive messages while the  partial function matches and returns false. |
	| `scala.concurrent.duration.Duration` | `[fishForMessage$default$1](#fishForMessage$default$1())()` |  |
	| `java.lang.String` | `[fishForMessage$default$2](#fishForMessage$default$2())()` |  |
	| `<T> T` | `[fishForSpecificMessage](#fishForSpecificMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction))​(scala.concurrent.duration.Duration max,  java.lang.String hint,  scala.PartialFunction<java.lang.Object,​T> f)` | Waits for specific message that partial function matches while ignoring all other messages coming in the meantime. |
	| `<T> scala.concurrent.duration.Duration` | `[fishForSpecificMessage$default$1](#fishForSpecificMessage$default$1())()` |  |
	| `<T> java.lang.String` | `[fishForSpecificMessage$default$2](#fishForSpecificMessage$default$2())()` |  |
	| `java.lang.String` | `[format](#format(java.util.concurrent.TimeUnit,scala.concurrent.duration.Duration))​(java.util.concurrent.TimeUnit u,  scala.concurrent.duration.Duration d)` |  |
	| `void` | `[ignoreMsg](#ignoreMsg(scala.PartialFunction))​(scala.PartialFunction<java.lang.Object,​java.lang.Object> f)` | Ignore all messages in the test actor for which the given partial  function returns true. |
	| `void` | `[ignoreNoMsg](#ignoreNoMsg())()` | Stop ignoring messages in the test actor. |
	| `<T> scala.collection.immutable.Seq<T>` | `[internalExpectMsgAllClassOf](#internalExpectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration max,  scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)` |  |
	| `<T> scala.collection.immutable.Seq<T>` | `[internalExpectMsgAllConformingOf](#internalExpectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration max,  scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)` |  |
	| `[TestActor.Message](TestActor.Message.html "interface in akka.testkit")` | `[lastMessage](#lastMessage())()` |  |
	| `void` | `[lastMessage_$eq](#lastMessage_$eq(akka.testkit.TestActor.Message))​([TestActor.Message](TestActor.Message.html "interface in akka.testkit") x$1)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[lastSender](#lastSender())()` |  |
	| `void` | `[lastWasNoMsg_$eq](#lastWasNoMsg_$eq(boolean))​(boolean x$1)` |  |
	| `boolean` | `[msgAvailable](#msgAvailable())()` | Query queue status. |
	| `scala.concurrent.duration.FiniteDuration` | `[now](#now())()` | Obtain current time (`System.nanoTime`) as Duration. |
	| `scala.collection.immutable.Seq<java.lang.Object>` | `[receiveN](#receiveN(int))​(int n)` | Same as `receiveN(n, remaining)` but correctly taking into account  Duration.timeFactor. |
	| `scala.collection.immutable.Seq<java.lang.Object>` | `[receiveN](#receiveN(int,scala.concurrent.duration.FiniteDuration))​(int n,  scala.concurrent.duration.FiniteDuration max)` | Receive N messages in a row before the given deadline. |
	| `scala.collection.immutable.Seq<java.lang.Object>` | `[receiveN_internal](#receiveN_internal(int,scala.concurrent.duration.Duration))​(int n,  scala.concurrent.duration.Duration max)` |  |
	| `java.lang.Object` | `[receiveOne](#receiveOne(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration max)` | Receive one message from the internal queue of the TestActor. |
	| `<T> scala.collection.immutable.Seq<T>` | `[receiveWhile](#receiveWhile(scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,int,scala.PartialFunction))​(scala.concurrent.duration.Duration max,  scala.concurrent.duration.Duration idle,  int messages,  scala.PartialFunction<java.lang.Object,​T> f)` | Receive a series of messages until one does not match the given partial  function or the idle timeout is met (disabled by default) or the overall  maximum duration is elapsed or expected messages count is reached. |
	| `<T> scala.concurrent.duration.Duration` | `[receiveWhile$default$1](#receiveWhile$default$1())()` |  |
	| `<T> scala.concurrent.duration.Duration` | `[receiveWhile$default$2](#receiveWhile$default$2())()` |  |
	| `<T> int` | `[receiveWhile$default$3](#receiveWhile$default$3())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[remaining](#remaining())()` | Obtain time remaining for execution of the innermost enclosing `within`  block or throw an `AssertionError` if no `within` block surrounds this  call. |
	| `scala.concurrent.duration.FiniteDuration` | `[remainingOr](#remainingOr(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration duration)` | Obtain time remaining for execution of the innermost enclosing `within`  block or missing that it returns the given duration. |
	| `scala.concurrent.duration.FiniteDuration` | `[remainingOrDefault](#remainingOrDefault())()` | Obtain time remaining for execution of the innermost enclosing `within`  block or missing that it returns the properly dilated default for this  case from settings (key "akka.test.single\-expect\-default"). |
	| `scala.concurrent.duration.FiniteDuration` | `[remainingOrDilated](#remainingOrDilated(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration max)` |  |
	| `void` | `[setAutoPilot](#setAutoPilot(akka.testkit.TestActor.AutoPilot))​([TestActor.AutoPilot](TestActor.AutoPilot.html "class in akka.testkit") pilot)` | Install an AutoPilot to drive the testActor: the AutoPilot will be run  for each received message and can be used to send or forward messages,  etc. |
	| `void` | `[shutdown](#shutdown(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") actorSystem,  scala.concurrent.duration.Duration duration,  boolean verifySystemShutdown)` | Shut down an actor system and wait for termination. |
	| `[ActorSystem](../actor/ActorSystem.html "class in akka.actor")` | `[shutdown$default$1](#shutdown$default$1())()` |  |
	| `scala.concurrent.duration.Duration` | `[shutdown$default$2](#shutdown$default$2())()` |  |
	| `boolean` | `[shutdown$default$3](#shutdown$default$3())()` |  |
	| `[ActorSystem](../actor/ActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[testActor](#testActor())()` | ActorRef of the test actor. |
	| `java.lang.String` | `[testActorName](#testActorName())()` | Defines the testActor name. |
	| `[TestKitSettings](TestKitSettings.html "class in akka.testkit")` | `[testKitSettings](#testKitSettings())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[unwatch](#unwatch(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` | Have the testActor stop watching someone (i.e. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[watch](#watch(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` | Have the testActor watch someone (i.e. |
	| `<T> T` | `[within](#within(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0))​(scala.concurrent.duration.FiniteDuration min,  scala.concurrent.duration.FiniteDuration max,  scala.Function0<T> f)` | Execute code block while bounding its execution time between `min` and  `max`. |
	| `<T> T` | `[within](#within(scala.concurrent.duration.FiniteDuration,scala.Function0))​(scala.concurrent.duration.FiniteDuration max,  scala.Function0<T> f)` | Same as calling `within(0 seconds, max)(f)`. |

- - ### Method Detail
	
	
	
		- #### assertForDuration
		
		
		
		```
		<A> A assertForDuration​(scala.Function0<A> a,
		                        scala.concurrent.duration.FiniteDuration max,
		                        scala.concurrent.duration.Duration interval)
		```
		
		Evaluate the given assert every `interval` until exception is thrown or `max` timeout is expired.
		 
		 Returns the result of last evaluation of the assertion.
		 
		
		
		 If no timeout is given, take it from the innermost enclosing `within`
		 block.
		 
		
		
		 Note that the timeout is scaled using Duration.dilated,
		 which uses the configuration entry "akka.test.timefactor".
		- #### assertForDuration$default$3
		
		
		
		```
		<A> scala.concurrent.duration.Duration assertForDuration$default$3()
		```
		- #### awaitAssert
		
		
		
		```
		<A> A awaitAssert​(scala.Function0<A> a,
		                  scala.concurrent.duration.Duration max,
		                  scala.concurrent.duration.Duration interval)
		```
		
		Evaluate the given assert every `interval` until it does not throw an exception and return the
		 result.
		 
		 If the `max` timeout expires the last exception is thrown.
		 
		
		
		 If no timeout is given, take it from the innermost enclosing `within`
		 block.
		 
		
		
		 Note that the timeout is scaled using Duration.dilated,
		 which uses the configuration entry "akka.test.timefactor".
		- #### awaitAssert$default$2
		
		
		
		```
		<A> scala.concurrent.duration.Duration awaitAssert$default$2()
		```
		- #### awaitAssert$default$3
		
		
		
		```
		<A> scala.concurrent.duration.Duration awaitAssert$default$3()
		```
		- #### awaitCond
		
		
		
		```
		void awaitCond​(scala.Function0<java.lang.Object> p,
		               scala.concurrent.duration.Duration max,
		               scala.concurrent.duration.Duration interval,
		               java.lang.String message)
		```
		
		Await until the given condition evaluates to `true` or the timeout
		 expires, whichever comes first.
		 
		 If no timeout is given, take it from the innermost enclosing `within`
		 block.
		 
		
		
		 Note that the timeout is scaled using Duration.dilated,
		 which uses the configuration entry "akka.test.timefactor".
		- #### awaitCond$default$2
		
		
		
		```
		scala.concurrent.duration.Duration awaitCond$default$2()
		```
		- #### awaitCond$default$3
		
		
		
		```
		scala.concurrent.duration.Duration awaitCond$default$3()
		```
		- #### awaitCond$default$4
		
		
		
		```
		java.lang.String awaitCond$default$4()
		```
		- #### checkMissingAndUnexpected
		
		
		
		```
		void checkMissingAndUnexpected​(scala.collection.immutable.Seq<java.lang.Object> missing,
		                               scala.collection.immutable.Seq<java.lang.Object> unexpected,
		                               java.lang.String missingMessage,
		                               java.lang.String unexpectedMessage)
		```
		- #### childActorOf
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") childActorOf​([Props](../actor/Props.html "class in akka.actor") props,
		                      java.lang.String name,
		                      [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy)
		```
		
		Spawns an actor as a child of this test actor, and returns the child's ActorRef.
		
		Parameters:
		`props` \- Props to create the child actor
		`name` \- Actor name for the child actor
		`supervisorStrategy` \- Strategy should decide what to do with failures in the actor.
		- #### childActorOf
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") childActorOf​([Props](../actor/Props.html "class in akka.actor") props,
		                      [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy)
		```
		
		Spawns an actor as a child of this test actor with an auto\-generated name, and returns the child's ActorRef.
		
		Parameters:
		`props` \- Props to create the child actor
		`supervisorStrategy` \- Strategy should decide what to do with failures in the actor.
		- #### childActorOf
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") childActorOf​([Props](../actor/Props.html "class in akka.actor") props,
		                      java.lang.String name)
		```
		
		Spawns an actor as a child of this test actor with a stopping supervisor strategy, and returns the child's ActorRef.
		
		Parameters:
		`props` \- Props to create the child actor
		`name` \- Actor name for the child actor
		- #### childActorOf
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") childActorOf​([Props](../actor/Props.html "class in akka.actor") props)
		```
		
		Spawns an actor as a child of this test actor with an auto\-generated name and stopping supervisor strategy, returning the child's ActorRef.
		
		Parameters:
		`props` \- Props to create the child actor
		- #### end\_$eq
		
		
		
		```
		void end_$eq​(scala.concurrent.duration.Duration x$1)
		```
		- #### expectMsg
		
		
		
		```
		<T> T expectMsg​(T obj)
		```
		
		Same as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor.
		- #### expectMsg
		
		
		
		```
		<T> T expectMsg​(scala.concurrent.duration.FiniteDuration max,
		                T obj)
		```
		
		Receive one message from the test actor and assert that it equals the
		 given object. Wait time is bounded by the given duration, with an
		 AssertionFailure being thrown in case of timeout.
		 
		
		Returns:
		the received object
		- #### expectMsg
		
		
		
		```
		<T> T expectMsg​(scala.concurrent.duration.FiniteDuration max,
		                java.lang.String hint,
		                T obj)
		```
		
		Receive one message from the test actor and assert that it equals the
		 given object. Wait time is bounded by the given duration, with an
		 AssertionFailure being thrown in case of timeout.
		 
		
		Returns:
		the received object
		- #### expectMsgAllClassOf
		
		
		
		```
		<T> scala.collection.immutable.Seq<T> expectMsgAllClassOf​(scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)
		```
		
		Same as `expectMsgAllClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.
		- #### expectMsgAllClassOf
		
		
		
		```
		<T> scala.collection.immutable.Seq<T> expectMsgAllClassOf​(scala.concurrent.duration.FiniteDuration max,
		                                                          scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)
		```
		
		Receive a number of messages from the test actor matching the given
		 number of classes and assert that for each given class one is received
		 which is of that class (equality, not conformance). This construct is
		 useful when the order in which the objects are received is not fixed.
		 Wait time is bounded by the given duration, with an AssertionFailure
		 being thrown in case of timeout.
		- #### expectMsgAllConformingOf
		
		
		
		```
		<T> scala.collection.immutable.Seq<T> expectMsgAllConformingOf​(scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)
		```
		
		Same as `expectMsgAllConformingOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.
		- #### expectMsgAllConformingOf
		
		
		
		```
		<T> scala.collection.immutable.Seq<T> expectMsgAllConformingOf​(scala.concurrent.duration.FiniteDuration max,
		                                                               scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)
		```
		
		Receive a number of messages from the test actor matching the given
		 number of classes and assert that for each given class one is received
		 which conforms to that class (and vice versa). This construct is useful
		 when the order in which the objects are received is not fixed. Wait time
		 is bounded by the given duration, with an AssertionFailure being thrown in
		 case of timeout.
		 
		 Beware that one object may satisfy all given class constraints, which
		 may be counter\-intuitive.
		- #### expectMsgAllOf
		
		
		
		```
		<T> scala.collection.immutable.Seq<T> expectMsgAllOf​(scala.collection.immutable.Seq<T> obj)
		```
		
		Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.
		- #### expectMsgAllOf
		
		
		
		```
		<T> scala.collection.immutable.Seq<T> expectMsgAllOf​(scala.concurrent.duration.FiniteDuration max,
		                                                     scala.collection.immutable.Seq<T> obj)
		```
		
		Receive a number of messages from the test actor matching the given
		 number of objects and assert that for each given object one is received
		 which equals it and vice versa. This construct is useful when the order in
		 which the objects are received is not fixed. Wait time is bounded by the
		 given duration, with an AssertionFailure being thrown in case of timeout.
		 
		
		
		
		```
		
		   dispatcher ! SomeWork1()
		   dispatcher ! SomeWork2()
		   expectMsgAllOf(1 second, Result1(), Result2())
		 
		```
		- #### expectMsgAllOf\_internal
		
		
		
		```
		<T> scala.collection.immutable.Seq<T> expectMsgAllOf_internal​(scala.concurrent.duration.FiniteDuration max,
		                                                              scala.collection.immutable.Seq<T> obj)
		```
		- #### expectMsgAnyClassOf
		
		
		
		```
		<C> C expectMsgAnyClassOf​(scala.collection.immutable.Seq<java.lang.Class<? extends C>> obj)
		```
		
		Same as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.
		- #### expectMsgAnyClassOf
		
		
		
		```
		<C> C expectMsgAnyClassOf​(scala.concurrent.duration.FiniteDuration max,
		                          scala.collection.immutable.Seq<java.lang.Class<? extends C>> obj)
		```
		
		Receive one message from the test actor and assert that it conforms to
		 one of the given classes. Wait time is bounded by the given duration,
		 with an AssertionFailure being thrown in case of timeout.
		 
		
		Returns:
		the received object
		- #### expectMsgAnyClassOf\_internal
		
		
		
		```
		<C> C expectMsgAnyClassOf_internal​(scala.concurrent.duration.FiniteDuration max,
		                                   scala.collection.immutable.Seq<java.lang.Class<? extends C>> obj)
		```
		- #### expectMsgAnyOf
		
		
		
		```
		<T> T expectMsgAnyOf​(scala.collection.immutable.Seq<T> obj)
		```
		
		Same as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.
		- #### expectMsgAnyOf
		
		
		
		```
		<T> T expectMsgAnyOf​(scala.concurrent.duration.FiniteDuration max,
		                     scala.collection.immutable.Seq<T> obj)
		```
		
		Receive one message from the test actor and assert that it equals one of
		 the given objects. Wait time is bounded by the given duration, with an
		 AssertionFailure being thrown in case of timeout.
		 
		
		Returns:
		the received object
		- #### expectMsgAnyOf\_internal
		
		
		
		```
		<T> T expectMsgAnyOf_internal​(scala.concurrent.duration.FiniteDuration max,
		                              scala.collection.immutable.Seq<T> obj)
		```
		- #### expectMsgClass
		
		
		
		```
		<C> C expectMsgClass​(java.lang.Class<C> c)
		```
		
		Same as `expectMsgClass(remainingOrDefault, c)`, but correctly treating the timeFactor.
		- #### expectMsgClass
		
		
		
		```
		<C> C expectMsgClass​(scala.concurrent.duration.FiniteDuration max,
		                     java.lang.Class<C> c)
		```
		
		Receive one message from the test actor and assert that it conforms to
		 the given class. Wait time is bounded by the given duration, with an
		 AssertionFailure being thrown in case of timeout.
		 
		
		Returns:
		the received object
		- #### expectMsgClass\_internal
		
		
		
		```
		<C> C expectMsgClass_internal​(scala.concurrent.duration.FiniteDuration max,
		                              java.lang.Class<C> c)
		```
		- #### expectMsgPF
		
		
		
		```
		<T> T expectMsgPF​(scala.concurrent.duration.Duration max,
		                  java.lang.String hint,
		                  scala.PartialFunction<java.lang.Object,​T> f)
		```
		
		Receive one message from the test actor and assert that the given
		 partial function accepts it. Wait time is bounded by the given duration,
		 with an AssertionFailure being thrown in case of timeout.
		 
		 Use this variant to implement more complicated or conditional
		 processing.
		 
		
		
		
		Returns:
		the received object as transformed by the partial function
		- #### expectMsgPF$default$1
		
		
		
		```
		<T> scala.concurrent.duration.Duration expectMsgPF$default$1()
		```
		- #### expectMsgPF$default$2
		
		
		
		```
		<T> java.lang.String expectMsgPF$default$2()
		```
		- #### expectMsgType
		
		
		
		```
		<T> T expectMsgType​(scala.reflect.ClassTag<T> t)
		```
		
		Same as `expectMsgType[T](remainingOrDefault)`, but correctly treating the timeFactor.
		- #### expectMsgType
		
		
		
		```
		<T> T expectMsgType​(scala.concurrent.duration.FiniteDuration max,
		                    scala.reflect.ClassTag<T> t)
		```
		
		Receive one message from the test actor and assert that it conforms to the
		 given type (after erasure). Wait time is bounded by the given duration,
		 with an AssertionFailure being thrown in case of timeout.
		 
		
		Returns:
		the received object
		- #### expectMsg\_internal
		
		
		
		```
		<T> T expectMsg_internal​(scala.concurrent.duration.Duration max,
		                         T obj,
		                         scala.Option<java.lang.String> hint)
		```
		- #### expectMsg\_internal$default$3
		
		
		
		```
		<T> scala.Option<java.lang.String> expectMsg_internal$default$3()
		```
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
		
		Assert that no message is received. Waits for the default period configured as
		 `akka.test.expect-no-message-default`.
		 That timeout is scaled using the configuration entry "akka.test.timefactor".
		- #### expectNoMsg\_internal
		
		
		
		```
		void expectNoMsg_internal​(scala.concurrent.duration.FiniteDuration max)
		```
		- #### expectTerminated
		
		
		
		```
		[Terminated](../actor/Terminated.html "class in akka.actor") expectTerminated​([ActorRef](../actor/ActorRef.html "class in akka.actor") target,
		                            scala.concurrent.duration.Duration max)
		```
		
		Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.
		 Before calling this method, you have to `watch` the target actor ref.
		 Wait time is bounded by the given duration, with an AssertionFailure being thrown in case of timeout.
		 
		
		Parameters:
		`target` \- the actor ref expected to be Terminated
		`max` \- wait no more than max time, otherwise throw AssertionFailure
		Returns:
		the received Terminated message
		- #### expectTerminated$default$2
		
		
		
		```
		scala.concurrent.duration.Duration expectTerminated$default$2()
		```
		- #### fishForMessage
		
		
		
		```
		java.lang.Object fishForMessage​(scala.concurrent.duration.Duration max,
		                                java.lang.String hint,
		                                scala.PartialFunction<java.lang.Object,​java.lang.Object> f)
		```
		
		Hybrid of expectMsgPF and receiveWhile: receive messages while the
		 partial function matches and returns false. Use it to ignore certain
		 messages while waiting for a specific message.
		 
		
		Returns:
		the last received message, i.e. the first one for which the
		 partial function returned true
		- #### fishForMessage$default$1
		
		
		
		```
		scala.concurrent.duration.Duration fishForMessage$default$1()
		```
		- #### fishForMessage$default$2
		
		
		
		```
		java.lang.String fishForMessage$default$2()
		```
		- #### fishForSpecificMessage
		
		
		
		```
		<T> T fishForSpecificMessage​(scala.concurrent.duration.Duration max,
		                             java.lang.String hint,
		                             scala.PartialFunction<java.lang.Object,​T> f)
		```
		
		Waits for specific message that partial function matches while ignoring all other messages coming in the meantime.
		 Use it to ignore any number of messages while waiting for a specific one.
		 
		
		Returns:
		result of applying partial function to the last received message,
		 i.e. the first one for which the partial function is defined
		- #### fishForSpecificMessage$default$1
		
		
		
		```
		<T> scala.concurrent.duration.Duration fishForSpecificMessage$default$1()
		```
		- #### fishForSpecificMessage$default$2
		
		
		
		```
		<T> java.lang.String fishForSpecificMessage$default$2()
		```
		- #### format
		
		
		
		```
		java.lang.String format​(java.util.concurrent.TimeUnit u,
		                        scala.concurrent.duration.Duration d)
		```
		- #### ignoreMsg
		
		
		
		```
		void ignoreMsg​(scala.PartialFunction<java.lang.Object,​java.lang.Object> f)
		```
		
		Ignore all messages in the test actor for which the given partial
		 function returns true.
		- #### ignoreNoMsg
		
		
		
		```
		void ignoreNoMsg()
		```
		
		Stop ignoring messages in the test actor.
		- #### internalExpectMsgAllClassOf
		
		
		
		```
		<T> scala.collection.immutable.Seq<T> internalExpectMsgAllClassOf​(scala.concurrent.duration.FiniteDuration max,
		                                                                  scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)
		```
		- #### internalExpectMsgAllConformingOf
		
		
		
		```
		<T> scala.collection.immutable.Seq<T> internalExpectMsgAllConformingOf​(scala.concurrent.duration.FiniteDuration max,
		                                                                       scala.collection.immutable.Seq<java.lang.Class<? extends T>> obj)
		```
		- #### lastMessage
		
		
		
		```
		[TestActor.Message](TestActor.Message.html "interface in akka.testkit") lastMessage()
		```
		- #### lastMessage\_$eq
		
		
		
		```
		void lastMessage_$eq​([TestActor.Message](TestActor.Message.html "interface in akka.testkit") x$1)
		```
		- #### lastSender
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") lastSender()
		```
		- #### lastWasNoMsg\_$eq
		
		
		
		```
		void lastWasNoMsg_$eq​(boolean x$1)
		```
		- #### msgAvailable
		
		
		
		```
		boolean msgAvailable()
		```
		
		Query queue status.
		- #### now
		
		
		
		```
		scala.concurrent.duration.FiniteDuration now()
		```
		
		Obtain current time (`System.nanoTime`) as Duration.
		- #### receiveN
		
		
		
		```
		scala.collection.immutable.Seq<java.lang.Object> receiveN​(int n)
		```
		
		Same as `receiveN(n, remaining)` but correctly taking into account
		 Duration.timeFactor.
		- #### receiveN
		
		
		
		```
		scala.collection.immutable.Seq<java.lang.Object> receiveN​(int n,
		                                                          scala.concurrent.duration.FiniteDuration max)
		```
		
		Receive N messages in a row before the given deadline.
		- #### receiveN\_internal
		
		
		
		```
		scala.collection.immutable.Seq<java.lang.Object> receiveN_internal​(int n,
		                                                                   scala.concurrent.duration.Duration max)
		```
		- #### receiveOne
		
		
		
		```
		java.lang.Object receiveOne​(scala.concurrent.duration.Duration max)
		```
		
		Receive one message from the internal queue of the TestActor. If the given
		 duration is zero, the queue is polled (non\-blocking).
		 
		 This method does NOT automatically scale its Duration parameter!
		- #### receiveWhile
		
		
		
		```
		<T> scala.collection.immutable.Seq<T> receiveWhile​(scala.concurrent.duration.Duration max,
		                                                   scala.concurrent.duration.Duration idle,
		                                                   int messages,
		                                                   scala.PartialFunction<java.lang.Object,​T> f)
		```
		
		Receive a series of messages until one does not match the given partial
		 function or the idle timeout is met (disabled by default) or the overall
		 maximum duration is elapsed or expected messages count is reached.
		 Returns the sequence of messages.
		 
		 Note that it is not an error to hit the `max` duration in this case.
		 
		
		
		 One possible use of this method is for testing whether messages of
		 certain characteristics are generated at a certain rate:
		 
		
		
		
		
		
		```
		
		 test ! ScheduleTicks(100 millis)
		 val series = receiveWhile(750 millis) {
		     case Tick(count) => count
		 }
		 assert(series == (1 to 7).toList)
		 
		```
		- #### receiveWhile$default$1
		
		
		
		```
		<T> scala.concurrent.duration.Duration receiveWhile$default$1()
		```
		- #### receiveWhile$default$2
		
		
		
		```
		<T> scala.concurrent.duration.Duration receiveWhile$default$2()
		```
		- #### receiveWhile$default$3
		
		
		
		```
		<T> int receiveWhile$default$3()
		```
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
		- #### remainingOrDefault
		
		
		
		```
		scala.concurrent.duration.FiniteDuration remainingOrDefault()
		```
		
		Obtain time remaining for execution of the innermost enclosing `within`
		 block or missing that it returns the properly dilated default for this
		 case from settings (key "akka.test.single\-expect\-default").
		- #### remainingOrDilated
		
		
		
		```
		scala.concurrent.duration.FiniteDuration remainingOrDilated​(scala.concurrent.duration.Duration max)
		```
		- #### setAutoPilot
		
		
		
		```
		void setAutoPilot​([TestActor.AutoPilot](TestActor.AutoPilot.html "class in akka.testkit") pilot)
		```
		
		Install an AutoPilot to drive the testActor: the AutoPilot will be run
		 for each received message and can be used to send or forward messages,
		 etc. Each invocation must return the AutoPilot for the next round.
		- #### shutdown
		
		
		
		```
		void shutdown​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") actorSystem,
		              scala.concurrent.duration.Duration duration,
		              boolean verifySystemShutdown)
		```
		
		Shut down an actor system and wait for termination.
		 On failure debug output will be logged about the remaining actors in the system.
		 
		 If verifySystemShutdown is true, then an exception will be thrown on failure.
		- #### shutdown$default$1
		
		
		
		```
		[ActorSystem](../actor/ActorSystem.html "class in akka.actor") shutdown$default$1()
		```
		- #### shutdown$default$2
		
		
		
		```
		scala.concurrent.duration.Duration shutdown$default$2()
		```
		- #### shutdown$default$3
		
		
		
		```
		boolean shutdown$default$3()
		```
		- #### system
		
		
		
		```
		[ActorSystem](../actor/ActorSystem.html "class in akka.actor") system()
		```
		- #### testActor
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") testActor()
		```
		
		ActorRef of the test actor. Access is provided to enable e.g.
		 registration as message target.
		- #### testActorName
		
		
		
		```
		java.lang.String testActorName()
		```
		
		Defines the testActor name.
		- #### testKitSettings
		
		
		
		```
		[TestKitSettings](TestKitSettings.html "class in akka.testkit") testKitSettings()
		```
		- #### unwatch
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") unwatch​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		Have the testActor stop watching someone (i.e. `context.unwatch(...)`).
		- #### watch
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") watch​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		Have the testActor watch someone (i.e. `context.watch(...)`).
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
		 
		 Note that the timeout is scaled using Duration.dilated, which uses the
		 configuration entry "akka.test.timefactor", while the min Duration is not.
		 
		
		
		
		
		
		```
		
		 val ret = within(50 millis) {
		   test ! "ping"
		   expectMsgClass(classOf[String])
		 }
		 
		```
		- #### within
		
		
		
		```
		<T> T within​(scala.concurrent.duration.FiniteDuration max,
		             scala.Function0<T> f)
		```
		
		Same as calling `within(0 seconds, max)(f)`.

## Code Examples

### Example 1: Interface TestKitBase

```text
class MyTest extends TestKitBase {
   implicit lazy val system = ActorSystem() // may add arguments here
   ...
 }
```

### Example 2: receiveWhile

```text
test ! ScheduleTicks(100 millis)
 val series = receiveWhile(750 millis) {
     case Tick(count) => count
 }
 assert(series == (1 to 7).toList)
```

### Example 3: within

```text
val ret = within(50 millis) {
   test ! "ping"
   expectMsgClass(classOf[String])
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PluginSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/japi/journal/JavaJournalPerfSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/japi/journal/JavaJournalSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/japi/snapshot/JavaSnapshotStoreSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/snapshot/SnapshotStoreSpec.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestActor.AutoPilot.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestActor.Message.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestKit.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestKitSettings.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestProbe.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestKitBase.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestKitBase.html)*