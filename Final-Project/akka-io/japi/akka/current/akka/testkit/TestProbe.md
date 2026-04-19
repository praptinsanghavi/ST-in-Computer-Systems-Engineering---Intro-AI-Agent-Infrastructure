---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestProbe.html
title: TestProbe
---

# TestProbe

## Content

Package [akka.testkit](package-summary.html)
## Class TestProbe

- java.lang.Object
- - [akka.testkit.TestKit](TestKit.html "class in akka.testkit")
	- - akka.testkit.TestProbe

- All Implemented Interfaces:
`[TestKitBase](TestKitBase.html "interface in akka.testkit")`

---

```
public class TestProbe
extends [TestKit](TestKit.html "class in akka.testkit")
```

TestKit\-based probe which allows sending, reception and reply.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestProbe](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") _application)` |  |
	| `[TestProbe](#%3Cinit%3E(akka.actor.ActorSystem,java.lang.String))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") _application,  java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TestProbe](TestProbe.html "class in akka.testkit")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [TestProbe](TestProbe.html "class in akka.testkit")` | `[apply](#apply(java.lang.String,akka.actor.ActorSystem))​(java.lang.String name,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `void` | `[forward](#forward(akka.actor.ActorRef,java.lang.Object))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,  java.lang.Object msg)` | Forward this message as if in the TestActor's receive method with self.forward. |
	| `java.lang.Object` | `[forward$default$2](#forward$default$2())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ref](#ref())()` | Shorthand to get the testActor. |
	| `void` | `[reply](#reply(java.lang.Object))​(java.lang.Object msg)` | Send message to the sender of the last dequeued message. |
	| `void` | `[send](#send(akka.actor.ActorRef,java.lang.Object))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,  java.lang.Object msg)` | Send message to an actor while using the probe's TestActor as the sender. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[sender](#sender())()` | Get sender of last received message. |
	| `protected java.lang.String` | `[testActorName](#testActorName())()` | Defines the testActor name. |
	
	
		- ### Methods inherited from class akka.testkit.[TestKit](TestKit.html "class in akka.testkit")
		
		
		`[awaitCond](TestKit.html#awaitCond(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,boolean)), [awaitCond$default$3](TestKit.html#awaitCond$default$3()), [awaitCond$default$4](TestKit.html#awaitCond$default$4()), [now](TestKit.html#now()), [shutdownActorSystem](TestKit.html#shutdownActorSystem(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean)), [shutdownActorSystem$default$2](TestKit.html#shutdownActorSystem$default$2()), [shutdownActorSystem$default$3](TestKit.html#shutdownActorSystem$default$3()), [system](TestKit.html#system()), [testActor](TestKit.html#testActor())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.testkit.[TestKitBase](TestKitBase.html "interface in akka.testkit")
		
		
		`[assertForDuration](TestKitBase.html#assertForDuration(scala.Function0,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.Duration)), [assertForDuration$default$3](TestKitBase.html#assertForDuration$default$3()), [awaitAssert](TestKitBase.html#awaitAssert(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration)), [awaitAssert$default$2](TestKitBase.html#awaitAssert$default$2()), [awaitAssert$default$3](TestKitBase.html#awaitAssert$default$3()), [awaitCond](TestKitBase.html#awaitCond(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,java.lang.String)), [awaitCond$default$2](TestKitBase.html#awaitCond$default$2()), [awaitCond$default$3](TestKitBase.html#awaitCond$default$3()), [awaitCond$default$4](TestKitBase.html#awaitCond$default$4()), [checkMissingAndUnexpected](TestKitBase.html#checkMissingAndUnexpected(scala.collection.immutable.Seq,scala.collection.immutable.Seq,java.lang.String,java.lang.String)), [childActorOf](TestKitBase.html#childActorOf(akka.actor.Props)), [childActorOf](TestKitBase.html#childActorOf(akka.actor.Props,akka.actor.SupervisorStrategy)), [childActorOf](TestKitBase.html#childActorOf(akka.actor.Props,java.lang.String)), [childActorOf](TestKitBase.html#childActorOf(akka.actor.Props,java.lang.String,akka.actor.SupervisorStrategy)), [end_$eq](TestKitBase.html#end_$eq(scala.concurrent.duration.Duration)), [expectMsg](TestKitBase.html#expectMsg(scala.concurrent.duration.FiniteDuration,java.lang.String,T)), [expectMsg](TestKitBase.html#expectMsg(scala.concurrent.duration.FiniteDuration,T)), [expectMsg](TestKitBase.html#expectMsg(T)), [expectMsg_internal](TestKitBase.html#expectMsg_internal(scala.concurrent.duration.Duration,T,scala.Option)), [expectMsg_internal$default$3](TestKitBase.html#expectMsg_internal$default$3()), [expectMsgAllClassOf](TestKitBase.html#expectMsgAllClassOf(scala.collection.immutable.Seq)), [expectMsgAllClassOf](TestKitBase.html#expectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllConformingOf](TestKitBase.html#expectMsgAllConformingOf(scala.collection.immutable.Seq)), [expectMsgAllConformingOf](TestKitBase.html#expectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllOf](TestKitBase.html#expectMsgAllOf(scala.collection.immutable.Seq)), [expectMsgAllOf](TestKitBase.html#expectMsgAllOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllOf_internal](TestKitBase.html#expectMsgAllOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyClassOf](TestKitBase.html#expectMsgAnyClassOf(scala.collection.immutable.Seq)), [expectMsgAnyClassOf](TestKitBase.html#expectMsgAnyClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyClassOf_internal](TestKitBase.html#expectMsgAnyClassOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyOf](TestKitBase.html#expectMsgAnyOf(scala.collection.immutable.Seq)), [expectMsgAnyOf](TestKitBase.html#expectMsgAnyOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyOf_internal](TestKitBase.html#expectMsgAnyOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgClass](TestKitBase.html#expectMsgClass(java.lang.Class)), [expectMsgClass](TestKitBase.html#expectMsgClass(scala.concurrent.duration.FiniteDuration,java.lang.Class)), [expectMsgClass_internal](TestKitBase.html#expectMsgClass_internal(scala.concurrent.duration.FiniteDuration,java.lang.Class)), [expectMsgPF](TestKitBase.html#expectMsgPF(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [expectMsgPF$default$1](TestKitBase.html#expectMsgPF$default$1()), [expectMsgPF$default$2](TestKitBase.html#expectMsgPF$default$2()), [expectMsgType](TestKitBase.html#expectMsgType(scala.concurrent.duration.FiniteDuration,scala.reflect.ClassTag)), [expectMsgType](TestKitBase.html#expectMsgType(scala.reflect.ClassTag)), [expectNoMessage](TestKitBase.html#expectNoMessage()), [expectNoMessage](TestKitBase.html#expectNoMessage(scala.concurrent.duration.FiniteDuration)), [expectNoMsg_internal](TestKitBase.html#expectNoMsg_internal(scala.concurrent.duration.FiniteDuration)), [expectTerminated](TestKitBase.html#expectTerminated(akka.actor.ActorRef,scala.concurrent.duration.Duration)), [expectTerminated$default$2](TestKitBase.html#expectTerminated$default$2()), [fishForMessage](TestKitBase.html#fishForMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [fishForMessage$default$1](TestKitBase.html#fishForMessage$default$1()), [fishForMessage$default$2](TestKitBase.html#fishForMessage$default$2()), [fishForSpecificMessage](TestKitBase.html#fishForSpecificMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [fishForSpecificMessage$default$1](TestKitBase.html#fishForSpecificMessage$default$1()), [fishForSpecificMessage$default$2](TestKitBase.html#fishForSpecificMessage$default$2()), [format](TestKitBase.html#format(java.util.concurrent.TimeUnit,scala.concurrent.duration.Duration)), [ignoreMsg](TestKitBase.html#ignoreMsg(scala.PartialFunction)), [ignoreNoMsg](TestKitBase.html#ignoreNoMsg()), [internalExpectMsgAllClassOf](TestKitBase.html#internalExpectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [internalExpectMsgAllConformingOf](TestKitBase.html#internalExpectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [lastSender](TestKitBase.html#lastSender()), [lastWasNoMsg_$eq](TestKitBase.html#lastWasNoMsg_$eq(boolean)), [msgAvailable](TestKitBase.html#msgAvailable()), [now](TestKitBase.html#now()), [receiveN](TestKitBase.html#receiveN(int)), [receiveN](TestKitBase.html#receiveN(int,scala.concurrent.duration.FiniteDuration)), [receiveN_internal](TestKitBase.html#receiveN_internal(int,scala.concurrent.duration.Duration)), [receiveOne](TestKitBase.html#receiveOne(scala.concurrent.duration.Duration)), [receiveWhile](TestKitBase.html#receiveWhile(scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,int,scala.PartialFunction)), [receiveWhile$default$1](TestKitBase.html#receiveWhile$default$1()), [receiveWhile$default$2](TestKitBase.html#receiveWhile$default$2()), [receiveWhile$default$3](TestKitBase.html#receiveWhile$default$3()), [remaining](TestKitBase.html#remaining()), [remainingOr](TestKitBase.html#remainingOr(scala.concurrent.duration.FiniteDuration)), [remainingOrDefault](TestKitBase.html#remainingOrDefault()), [remainingOrDilated](TestKitBase.html#remainingOrDilated(scala.concurrent.duration.Duration)), [setAutoPilot](TestKitBase.html#setAutoPilot(akka.testkit.TestActor.AutoPilot)), [shutdown](TestKitBase.html#shutdown(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean)), [shutdown$default$1](TestKitBase.html#shutdown$default$1()), [shutdown$default$2](TestKitBase.html#shutdown$default$2()), [shutdown$default$3](TestKitBase.html#shutdown$default$3()), [testKitSettings](TestKitBase.html#testKitSettings()), [unwatch](TestKitBase.html#unwatch(akka.actor.ActorRef)), [watch](TestKitBase.html#watch(akka.actor.ActorRef)), [within](TestKitBase.html#within(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0)), [within](TestKitBase.html#within(scala.concurrent.duration.FiniteDuration,scala.Function0))`

- - ### Constructor Detail
	
	
	
		- #### TestProbe
		
		
		
		```
		public TestProbe​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") _application,
		                 java.lang.String name)
		```
		- #### TestProbe
		
		
		
		```
		public TestProbe​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") _application)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [TestProbe](TestProbe.html "class in akka.testkit") apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static [TestProbe](TestProbe.html "class in akka.testkit") apply​(java.lang.String name,
		                              [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### ref
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") ref()
		```
		
		Shorthand to get the testActor.
		- #### testActorName
		
		
		
		```
		protected java.lang.String testActorName()
		```
		
		Description copied from interface: `[TestKitBase](TestKitBase.html#testActorName())`
		Defines the testActor name.
		- #### send
		
		
		
		```
		public void send​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,
		                 java.lang.Object msg)
		```
		
		Send message to an actor while using the probe's TestActor as the sender.
		 Replies will be available for inspection with all of TestKit's assertion
		 methods.
		- #### forward
		
		
		
		```
		public void forward​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor,
		                    java.lang.Object msg)
		```
		
		Forward this message as if in the TestActor's receive method with self.forward.
		- #### forward$default$2
		
		
		
		```
		public java.lang.Object forward$default$2()
		```
		- #### sender
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") sender()
		```
		
		Get sender of last received message.
		- #### reply
		
		
		
		```
		public void reply​(java.lang.Object msg)
		```
		
		Send message to the sender of the last dequeued message.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestKit.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestKitBase.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestProbe.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestProbe.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestProbe.html)*