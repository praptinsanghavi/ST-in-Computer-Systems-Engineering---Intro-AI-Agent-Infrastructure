---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestKit.html
title: TestKit
---

# TestKit

## Content

Package [akka.testkit](package-summary.html)
## Class TestKit

- java.lang.Object
- - akka.testkit.TestKit

- All Implemented Interfaces:
`[TestKitBase](TestKitBase.html "interface in akka.testkit")`

Direct Known Subclasses:
`[MultiNodeSpec](../remote/testkit/MultiNodeSpec.html "class in akka.remote.testkit")`, `[TestProbe](TestProbe.html "class in akka.testkit")`

---

```
public class TestKit
extends java.lang.Object
implements [TestKitBase](TestKitBase.html "interface in akka.testkit")
```

Test kit for testing actors. Inheriting from this class enables reception of
 replies from actors, which are queued by an internal actor and can be
 examined using the `expectMsg...` methods. Assertions and bounds concerning
 timing are available in the form of `within` blocks.
 

```

 class Test extends TestKit(ActorSystem()) {
   try {

     val test = system.actorOf(Props[SomeActor])

       within (1.second) {
         test ! SomeWork
         expectMsg(Result1) // bounded to 1 second
         expectMsg(Result2) // bounded to the remainder of the 1 second
       }

     } finally {
       system.terminate()
     }

   } finally {
     system.terminate()
   }
 }
 
```

 Beware of two points:
 

 \- the ActorSystem passed into the constructor needs to be shutdown,
 otherwise thread pools and memory will be leaked
 \- this class is not thread\-safe (only one actor with one queue, one stack
 of `within` blocks); it is expected that the code is executed from a
 constructor as shown above, which makes this a non\-issue, otherwise take
 care not to run tests within a single test class instance in parallel.
 

 It should be noted that for CI servers and the like all maximum Durations
 are scaled using their Duration.dilated method, which uses the
 TestKitExtension.Settings.TestTimeFactor settable via akka.conf entry "akka.test.timefactor".
 

Since:
1\.1

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestKit](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") _system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[awaitCond](#awaitCond(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,boolean))​(scala.Function0<java.lang.Object> p,  scala.concurrent.duration.Duration max,  scala.concurrent.duration.Duration interval,  boolean noThrow)` | Await until the given condition evaluates to `true` or the timeout  expires, whichever comes first. |
	| `static scala.concurrent.duration.Duration` | `[awaitCond$default$3](#awaitCond$default$3())()` |  |
	| `static boolean` | `[awaitCond$default$4](#awaitCond$default$4())()` |  |
	| `static scala.concurrent.duration.Duration` | `[now](#now())()` | Obtain current timestamp as Duration for relative measurements (using System.nanoTime). |
	| `static void` | `[shutdownActorSystem](#shutdownActorSystem(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") actorSystem,  scala.concurrent.duration.Duration duration,  boolean verifySystemShutdown)` | Shut down an actor system and wait for termination. |
	| `static scala.concurrent.duration.Duration` | `[shutdownActorSystem$default$2](#shutdownActorSystem$default$2())()` |  |
	| `static boolean` | `[shutdownActorSystem$default$3](#shutdownActorSystem$default$3())()` |  |
	| `[ActorSystem](../actor/ActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[testActor](#testActor())()` | ActorRef of the test actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.testkit.[TestKitBase](TestKitBase.html "interface in akka.testkit")
		
		
		`[assertForDuration](TestKitBase.html#assertForDuration(scala.Function0,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.Duration)), [assertForDuration$default$3](TestKitBase.html#assertForDuration$default$3()), [awaitAssert](TestKitBase.html#awaitAssert(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration)), [awaitAssert$default$2](TestKitBase.html#awaitAssert$default$2()), [awaitAssert$default$3](TestKitBase.html#awaitAssert$default$3()), [awaitCond](TestKitBase.html#awaitCond(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,java.lang.String)), [awaitCond$default$2](TestKitBase.html#awaitCond$default$2()), [awaitCond$default$3](TestKitBase.html#awaitCond$default$3()), [awaitCond$default$4](TestKitBase.html#awaitCond$default$4()), [checkMissingAndUnexpected](TestKitBase.html#checkMissingAndUnexpected(scala.collection.immutable.Seq,scala.collection.immutable.Seq,java.lang.String,java.lang.String)), [childActorOf](TestKitBase.html#childActorOf(akka.actor.Props)), [childActorOf](TestKitBase.html#childActorOf(akka.actor.Props,akka.actor.SupervisorStrategy)), [childActorOf](TestKitBase.html#childActorOf(akka.actor.Props,java.lang.String)), [childActorOf](TestKitBase.html#childActorOf(akka.actor.Props,java.lang.String,akka.actor.SupervisorStrategy)), [end_$eq](TestKitBase.html#end_$eq(scala.concurrent.duration.Duration)), [expectMsg](TestKitBase.html#expectMsg(scala.concurrent.duration.FiniteDuration,java.lang.String,T)), [expectMsg](TestKitBase.html#expectMsg(scala.concurrent.duration.FiniteDuration,T)), [expectMsg](TestKitBase.html#expectMsg(T)), [expectMsg_internal](TestKitBase.html#expectMsg_internal(scala.concurrent.duration.Duration,T,scala.Option)), [expectMsg_internal$default$3](TestKitBase.html#expectMsg_internal$default$3()), [expectMsgAllClassOf](TestKitBase.html#expectMsgAllClassOf(scala.collection.immutable.Seq)), [expectMsgAllClassOf](TestKitBase.html#expectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllConformingOf](TestKitBase.html#expectMsgAllConformingOf(scala.collection.immutable.Seq)), [expectMsgAllConformingOf](TestKitBase.html#expectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllOf](TestKitBase.html#expectMsgAllOf(scala.collection.immutable.Seq)), [expectMsgAllOf](TestKitBase.html#expectMsgAllOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllOf_internal](TestKitBase.html#expectMsgAllOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyClassOf](TestKitBase.html#expectMsgAnyClassOf(scala.collection.immutable.Seq)), [expectMsgAnyClassOf](TestKitBase.html#expectMsgAnyClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyClassOf_internal](TestKitBase.html#expectMsgAnyClassOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyOf](TestKitBase.html#expectMsgAnyOf(scala.collection.immutable.Seq)), [expectMsgAnyOf](TestKitBase.html#expectMsgAnyOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyOf_internal](TestKitBase.html#expectMsgAnyOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgClass](TestKitBase.html#expectMsgClass(java.lang.Class)), [expectMsgClass](TestKitBase.html#expectMsgClass(scala.concurrent.duration.FiniteDuration,java.lang.Class)), [expectMsgClass_internal](TestKitBase.html#expectMsgClass_internal(scala.concurrent.duration.FiniteDuration,java.lang.Class)), [expectMsgPF](TestKitBase.html#expectMsgPF(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [expectMsgPF$default$1](TestKitBase.html#expectMsgPF$default$1()), [expectMsgPF$default$2](TestKitBase.html#expectMsgPF$default$2()), [expectMsgType](TestKitBase.html#expectMsgType(scala.concurrent.duration.FiniteDuration,scala.reflect.ClassTag)), [expectMsgType](TestKitBase.html#expectMsgType(scala.reflect.ClassTag)), [expectNoMessage](TestKitBase.html#expectNoMessage()), [expectNoMessage](TestKitBase.html#expectNoMessage(scala.concurrent.duration.FiniteDuration)), [expectNoMsg_internal](TestKitBase.html#expectNoMsg_internal(scala.concurrent.duration.FiniteDuration)), [expectTerminated](TestKitBase.html#expectTerminated(akka.actor.ActorRef,scala.concurrent.duration.Duration)), [expectTerminated$default$2](TestKitBase.html#expectTerminated$default$2()), [fishForMessage](TestKitBase.html#fishForMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [fishForMessage$default$1](TestKitBase.html#fishForMessage$default$1()), [fishForMessage$default$2](TestKitBase.html#fishForMessage$default$2()), [fishForSpecificMessage](TestKitBase.html#fishForSpecificMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [fishForSpecificMessage$default$1](TestKitBase.html#fishForSpecificMessage$default$1()), [fishForSpecificMessage$default$2](TestKitBase.html#fishForSpecificMessage$default$2()), [format](TestKitBase.html#format(java.util.concurrent.TimeUnit,scala.concurrent.duration.Duration)), [ignoreMsg](TestKitBase.html#ignoreMsg(scala.PartialFunction)), [ignoreNoMsg](TestKitBase.html#ignoreNoMsg()), [internalExpectMsgAllClassOf](TestKitBase.html#internalExpectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [internalExpectMsgAllConformingOf](TestKitBase.html#internalExpectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [lastSender](TestKitBase.html#lastSender()), [lastWasNoMsg_$eq](TestKitBase.html#lastWasNoMsg_$eq(boolean)), [msgAvailable](TestKitBase.html#msgAvailable()), [now](TestKitBase.html#now()), [receiveN](TestKitBase.html#receiveN(int)), [receiveN](TestKitBase.html#receiveN(int,scala.concurrent.duration.FiniteDuration)), [receiveN_internal](TestKitBase.html#receiveN_internal(int,scala.concurrent.duration.Duration)), [receiveOne](TestKitBase.html#receiveOne(scala.concurrent.duration.Duration)), [receiveWhile](TestKitBase.html#receiveWhile(scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,int,scala.PartialFunction)), [receiveWhile$default$1](TestKitBase.html#receiveWhile$default$1()), [receiveWhile$default$2](TestKitBase.html#receiveWhile$default$2()), [receiveWhile$default$3](TestKitBase.html#receiveWhile$default$3()), [remaining](TestKitBase.html#remaining()), [remainingOr](TestKitBase.html#remainingOr(scala.concurrent.duration.FiniteDuration)), [remainingOrDefault](TestKitBase.html#remainingOrDefault()), [remainingOrDilated](TestKitBase.html#remainingOrDilated(scala.concurrent.duration.Duration)), [setAutoPilot](TestKitBase.html#setAutoPilot(akka.testkit.TestActor.AutoPilot)), [shutdown](TestKitBase.html#shutdown(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean)), [shutdown$default$1](TestKitBase.html#shutdown$default$1()), [shutdown$default$2](TestKitBase.html#shutdown$default$2()), [shutdown$default$3](TestKitBase.html#shutdown$default$3()), [testActorName](TestKitBase.html#testActorName()), [testKitSettings](TestKitBase.html#testKitSettings()), [unwatch](TestKitBase.html#unwatch(akka.actor.ActorRef)), [watch](TestKitBase.html#watch(akka.actor.ActorRef)), [within](TestKitBase.html#within(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0)), [within](TestKitBase.html#within(scala.concurrent.duration.FiniteDuration,scala.Function0))`

- - ### Constructor Detail
	
	
	
		- #### TestKit
		
		
		
		```
		public TestKit​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") _system)
		```

	- ### Method Detail
	
	
	
		- #### awaitCond
		
		
		
		```
		public static boolean awaitCond​(scala.Function0<java.lang.Object> p,
		                                scala.concurrent.duration.Duration max,
		                                scala.concurrent.duration.Duration interval,
		                                boolean noThrow)
		```
		
		Await until the given condition evaluates to `true` or the timeout
		 expires, whichever comes first.
		- #### awaitCond$default$3
		
		
		
		```
		public static scala.concurrent.duration.Duration awaitCond$default$3()
		```
		- #### awaitCond$default$4
		
		
		
		```
		public static boolean awaitCond$default$4()
		```
		- #### now
		
		
		
		```
		public static scala.concurrent.duration.Duration now()
		```
		
		Obtain current timestamp as Duration for relative measurements (using System.nanoTime).
		- #### shutdownActorSystem
		
		
		
		```
		public static void shutdownActorSystem​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") actorSystem,
		                                       scala.concurrent.duration.Duration duration,
		                                       boolean verifySystemShutdown)
		```
		
		Shut down an actor system and wait for termination.
		 On failure debug output will be logged about the remaining actors in the system.
		 
		 The `duration` is dilated by the timefactor.
		 
		
		
		 If verifySystemShutdown is true, then an exception will be thrown on failure.
		- #### shutdownActorSystem$default$2
		
		
		
		```
		public static scala.concurrent.duration.Duration shutdownActorSystem$default$2()
		```
		- #### shutdownActorSystem$default$3
		
		
		
		```
		public static boolean shutdownActorSystem$default$3()
		```
		- #### testActor
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") testActor()
		```
		
		Description copied from interface: `[TestKitBase](TestKitBase.html#testActor())`
		ActorRef of the test actor. Access is provided to enable e.g.
		 registration as message target.
		
		Specified by:
		`[testActor](TestKitBase.html#testActor())` in interface `[TestKitBase](TestKitBase.html "interface in akka.testkit")`
		- #### system
		
		
		
		```
		public [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system()
		```
		
		
		Specified by:
		`[system](TestKitBase.html#system())` in interface `[TestKitBase](TestKitBase.html "interface in akka.testkit")`

## Code Examples

### Example 1: Class TestKit

```text
class Test extends TestKit(ActorSystem()) {
   try {

     val test = system.actorOf(Props[SomeActor])

       within (1.second) {
         test ! SomeWork
         expectMsg(Result1) // bounded to 1 second
         expectMsg(Result2) // bounded to the remainder of the 1 second
       }

     } finally {
       system.terminate()
     }

   } finally {
     system.terminate()
   }
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestKitBase.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestKit.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestKit.html)*