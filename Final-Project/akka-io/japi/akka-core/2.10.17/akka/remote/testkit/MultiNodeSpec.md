---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec.html
title: MultiNodeSpec
---

# MultiNodeSpec

## Content

Package [akka.remote.testkit](package-summary.html)
## Class MultiNodeSpec

- java.lang.Object
- - [akka.testkit.TestKit](../../testkit/TestKit.html "class in akka.testkit")
	- - akka.remote.testkit.MultiNodeSpec

- All Implemented Interfaces:
`[MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "interface in akka.remote.testkit")`, `[TestKitBase](../../testkit/TestKitBase.html "interface in akka.testkit")`

---

```
public abstract class MultiNodeSpec
extends [TestKit](../../testkit/TestKit.html "class in akka.testkit")
implements [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "interface in akka.remote.testkit")
```

Note: To be able to run tests with everything ignored or excluded by tags
 you must not use `testconductor`, or helper methods that use `testconductor`,
 from the constructor of your test class. Otherwise the controller node might
 be shutdown before other nodes have completed and you will see errors like:
 `AskTimeoutException: sending to terminated ref breaks promises`. Using lazy
 val is fine.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[MultiNodeSpec.AwaitHelper](MultiNodeSpec.AwaitHelper.html "class in akka.remote.testkit")<[T](MultiNodeSpec.AwaitHelper.html "type parameter in MultiNodeSpec.AwaitHelper")>` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MultiNodeSpec](#%3Cinit%3E(akka.remote.testconductor.RoleName,akka.actor.ActorSystem,scala.collection.immutable.Seq,scala.Function1))​([RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor") myself,  [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") _system,  scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")> _roles,  scala.Function1<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor"),​scala.collection.immutable.Seq<java.lang.String>> deployments)` |  |
	| `[MultiNodeSpec](#%3Cinit%3E(akka.remote.testkit.MultiNodeConfig))​([MultiNodeConfig](MultiNodeConfig.html "class in akka.remote.testkit") config)` |  |
	| `[MultiNodeSpec](#%3Cinit%3E(akka.remote.testkit.MultiNodeConfig,scala.Function1))​([MultiNodeConfig](MultiNodeConfig.html "class in akka.remote.testkit") config,  scala.Function1<com.typesafe.config.Config,​[ActorSystem](../../actor/ActorSystem.html "class in akka.actor")> actorSystemCreator)` | Constructor for using arbitrary logic to create the actor system used in  the multi node spec (the `Config` passed to the creator must be used in  the created actor system for the multi node tests to work) |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[afterTermination](#afterTermination())()` | Override this method to do something when the whole test is terminating. |
	| `protected void` | `[atStartup](#atStartup())()` | Override this method to do something when the whole test is starting up. |
	| `protected void` | `[attachConductor](#attachConductor(akka.remote.testconductor.TestConductorExt))​([TestConductorExt](../testconductor/TestConductorExt.html "class in akka.remote.testconductor") tc)` |  |
	| `<T> [MultiNodeSpec.AwaitHelper](MultiNodeSpec.AwaitHelper.html "class in akka.remote.testkit")<T>` | `[awaitHelper](#awaitHelper(scala.concurrent.Awaitable))​(scala.concurrent.Awaitable<T> w)` | Enrich `.await()` onto all Awaitables, using remaining duration from the innermost  enclosing `within` block or QueryTimeout. |
	| `static com.typesafe.config.Config` | `[configureNextPortIfFixed](#configureNextPortIfFixed(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `void` | `[enterBarrier](#enterBarrier(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> name)` | Enter the named barriers in the order given. |
	| `void` | `[enterBarrier](#enterBarrier(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq))​(scala.concurrent.duration.FiniteDuration max,  scala.collection.immutable.Seq<java.lang.String> name)` | Enter the named barriers in the order given. |
	| `abstract int` | `[initialParticipants](#initialParticipants())()` | TO BE DEFINED BY USER: Defines the number of participants required for starting the test. |
	| `protected void` | `[injectDeployments](#injectDeployments(akka.actor.ActorSystem,akka.remote.testconductor.RoleName))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") sys,  [RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor") role)` |  |
	| `boolean` | `[isNode](#isNode(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")> nodes)` | Verify that the running node matches one of the given nodes |
	| `[LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event")` | `[log](#log())()` |  |
	| `static int` | `[maxNodes](#maxNodes())()` | Number of nodes node taking part in this test. |
	| `void` | `[multiNodeSpecAfterAll](#multiNodeSpecAfterAll())()` | Call this after the all test cases have run. |
	| `void` | `[multiNodeSpecBeforeAll](#multiNodeSpecBeforeAll())()` | Call this before the start of the test run. |
	| `void` | `[muteDeadLetters](#muteDeadLetters(scala.collection.immutable.Seq,akka.actor.ActorSystem))​(scala.collection.immutable.Seq<java.lang.Class<?>> messageClasses,  [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") sys)` |  |
	| `[ActorSystem](../../actor/ActorSystem.html "class in akka.actor")` | `[muteDeadLetters$default$2](#muteDeadLetters$default$2(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Class<?>> messageClasses)` |  |
	| `protected [Address](../../actor/Address.html "class in akka.actor")` | `[myAddress](#myAddress())()` |  |
	| `[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")` | `[myself](#myself())()` |  |
	| `[ActorPath](../../actor/ActorPath.html "interface in akka.actor")` | `[node](#node(akka.remote.testconductor.RoleName))​([RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor") role)` | Query the controller for the transport address of the given node (by role name) and  return that as an ActorPath for easy composition: |
	| `scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")>` | `[roles](#roles())()` | All registered roles |
	| `void` | `[runOn](#runOn(scala.collection.immutable.Seq,scala.Function0))​(scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")> nodes,  scala.Function0<scala.runtime.BoxedUnit> thunk)` | Execute the given block of code only on the given nodes (names according  to the `roleMap`). |
	| `static java.lang.Integer` | `[selfIndex](#selfIndex())()` | Index of this node in the roles sequence. |
	| `static java.lang.String` | `[selfName](#selfName())()` | Name (or IP address; must be resolvable using InetAddress.getByName)  of the host this node is running on. |
	| `static int` | `[selfPort](#selfPort())()` | Port number of this node. |
	| `static java.lang.String` | `[serverName](#serverName())()` | Name (or IP address; must be resolvable using InetAddress.getByName)  of the host that the server node is running on. |
	| `static int` | `[serverPort](#serverPort())()` | Port number of the node that's running the server system. |
	| `scala.concurrent.duration.FiniteDuration` | `[shutdownTimeout](#shutdownTimeout())()` |  |
	| `protected [ActorSystem](../../actor/ActorSystem.html "class in akka.actor")` | `[startNewSystem](#startNewSystem())()` | This method starts a new ActorSystem with the same configuration as the  previous one on the current node, including deployments. |
	| `static int` | `[tcpPort](#tcpPort())()` | TCP Port number to be used when running tests on TCP. |
	| `[TestConductorExt](../testconductor/TestConductorExt.html "class in akka.remote.testconductor")` | `[testConductor](#testConductor())()` | Access to the barriers, failure injection, etc. |
	| `void` | `[testConductor_$eq](#testConductor_$eq(akka.remote.testconductor.TestConductorExt))​([TestConductorExt](../testconductor/TestConductorExt.html "class in akka.remote.testconductor") x$1)` |  |
	| `static scala.Option<java.lang.Object>` | `[udpPort](#udpPort())()` | UDP Port number to be used when running tests on UDP. |
	| `boolean` | `[verifySystemShutdown](#verifySystemShutdown())()` | Override this and return `true` to assert that the  shutdown of the `ActorSystem` was done properly. |
	
	
		- ### Methods inherited from class akka.testkit.[TestKit](../../testkit/TestKit.html "class in akka.testkit")
		
		
		`[awaitCond](../../testkit/TestKit.html#awaitCond(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,boolean)), [awaitCond$default$3](../../testkit/TestKit.html#awaitCond$default$3()), [awaitCond$default$4](../../testkit/TestKit.html#awaitCond$default$4()), [now](../../testkit/TestKit.html#now()), [shutdownActorSystem](../../testkit/TestKit.html#shutdownActorSystem(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean)), [shutdownActorSystem$default$2](../../testkit/TestKit.html#shutdownActorSystem$default$2()), [shutdownActorSystem$default$3](../../testkit/TestKit.html#shutdownActorSystem$default$3()), [system](../../testkit/TestKit.html#system()), [testActor](../../testkit/TestKit.html#testActor())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.testkit.[TestKitBase](../../testkit/TestKitBase.html "interface in akka.testkit")
		
		
		`[assertForDuration](../../testkit/TestKitBase.html#assertForDuration(scala.Function0,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.Duration)), [assertForDuration$default$3](../../testkit/TestKitBase.html#assertForDuration$default$3()), [awaitAssert](../../testkit/TestKitBase.html#awaitAssert(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration)), [awaitAssert$default$2](../../testkit/TestKitBase.html#awaitAssert$default$2()), [awaitAssert$default$3](../../testkit/TestKitBase.html#awaitAssert$default$3()), [awaitCond](../../testkit/TestKitBase.html#awaitCond(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,java.lang.String)), [awaitCond$default$2](../../testkit/TestKitBase.html#awaitCond$default$2()), [awaitCond$default$3](../../testkit/TestKitBase.html#awaitCond$default$3()), [awaitCond$default$4](../../testkit/TestKitBase.html#awaitCond$default$4()), [checkMissingAndUnexpected](../../testkit/TestKitBase.html#checkMissingAndUnexpected(scala.collection.immutable.Seq,scala.collection.immutable.Seq,java.lang.String,java.lang.String)), [childActorOf](../../testkit/TestKitBase.html#childActorOf(akka.actor.Props)), [childActorOf](../../testkit/TestKitBase.html#childActorOf(akka.actor.Props,akka.actor.SupervisorStrategy)), [childActorOf](../../testkit/TestKitBase.html#childActorOf(akka.actor.Props,java.lang.String)), [childActorOf](../../testkit/TestKitBase.html#childActorOf(akka.actor.Props,java.lang.String,akka.actor.SupervisorStrategy)), [end_$eq](../../testkit/TestKitBase.html#end_$eq(scala.concurrent.duration.Duration)), [expectMsg](../../testkit/TestKitBase.html#expectMsg(scala.concurrent.duration.FiniteDuration,java.lang.String,T)), [expectMsg](../../testkit/TestKitBase.html#expectMsg(scala.concurrent.duration.FiniteDuration,T)), [expectMsg](../../testkit/TestKitBase.html#expectMsg(T)), [expectMsg_internal](../../testkit/TestKitBase.html#expectMsg_internal(scala.concurrent.duration.Duration,T,scala.Option)), [expectMsg_internal$default$3](../../testkit/TestKitBase.html#expectMsg_internal$default$3()), [expectMsgAllClassOf](../../testkit/TestKitBase.html#expectMsgAllClassOf(scala.collection.immutable.Seq)), [expectMsgAllClassOf](../../testkit/TestKitBase.html#expectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllConformingOf](../../testkit/TestKitBase.html#expectMsgAllConformingOf(scala.collection.immutable.Seq)), [expectMsgAllConformingOf](../../testkit/TestKitBase.html#expectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllOf](../../testkit/TestKitBase.html#expectMsgAllOf(scala.collection.immutable.Seq)), [expectMsgAllOf](../../testkit/TestKitBase.html#expectMsgAllOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllOf_internal](../../testkit/TestKitBase.html#expectMsgAllOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyClassOf](../../testkit/TestKitBase.html#expectMsgAnyClassOf(scala.collection.immutable.Seq)), [expectMsgAnyClassOf](../../testkit/TestKitBase.html#expectMsgAnyClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyClassOf_internal](../../testkit/TestKitBase.html#expectMsgAnyClassOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyOf](../../testkit/TestKitBase.html#expectMsgAnyOf(scala.collection.immutable.Seq)), [expectMsgAnyOf](../../testkit/TestKitBase.html#expectMsgAnyOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyOf_internal](../../testkit/TestKitBase.html#expectMsgAnyOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgClass](../../testkit/TestKitBase.html#expectMsgClass(java.lang.Class)), [expectMsgClass](../../testkit/TestKitBase.html#expectMsgClass(scala.concurrent.duration.FiniteDuration,java.lang.Class)), [expectMsgClass_internal](../../testkit/TestKitBase.html#expectMsgClass_internal(scala.concurrent.duration.FiniteDuration,java.lang.Class)), [expectMsgPF](../../testkit/TestKitBase.html#expectMsgPF(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [expectMsgPF$default$1](../../testkit/TestKitBase.html#expectMsgPF$default$1()), [expectMsgPF$default$2](../../testkit/TestKitBase.html#expectMsgPF$default$2()), [expectMsgType](../../testkit/TestKitBase.html#expectMsgType(scala.concurrent.duration.FiniteDuration,scala.reflect.ClassTag)), [expectMsgType](../../testkit/TestKitBase.html#expectMsgType(scala.reflect.ClassTag)), [expectNoMessage](../../testkit/TestKitBase.html#expectNoMessage()), [expectNoMessage](../../testkit/TestKitBase.html#expectNoMessage(scala.concurrent.duration.FiniteDuration)), [expectNoMsg_internal](../../testkit/TestKitBase.html#expectNoMsg_internal(scala.concurrent.duration.FiniteDuration)), [expectTerminated](../../testkit/TestKitBase.html#expectTerminated(akka.actor.ActorRef,scala.concurrent.duration.Duration)), [expectTerminated$default$2](../../testkit/TestKitBase.html#expectTerminated$default$2()), [fishForMessage](../../testkit/TestKitBase.html#fishForMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [fishForMessage$default$1](../../testkit/TestKitBase.html#fishForMessage$default$1()), [fishForMessage$default$2](../../testkit/TestKitBase.html#fishForMessage$default$2()), [fishForSpecificMessage](../../testkit/TestKitBase.html#fishForSpecificMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [fishForSpecificMessage$default$1](../../testkit/TestKitBase.html#fishForSpecificMessage$default$1()), [fishForSpecificMessage$default$2](../../testkit/TestKitBase.html#fishForSpecificMessage$default$2()), [format](../../testkit/TestKitBase.html#format(java.util.concurrent.TimeUnit,scala.concurrent.duration.Duration)), [ignoreMsg](../../testkit/TestKitBase.html#ignoreMsg(scala.PartialFunction)), [ignoreNoMsg](../../testkit/TestKitBase.html#ignoreNoMsg()), [internalExpectMsgAllClassOf](../../testkit/TestKitBase.html#internalExpectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [internalExpectMsgAllConformingOf](../../testkit/TestKitBase.html#internalExpectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [lastSender](../../testkit/TestKitBase.html#lastSender()), [lastWasNoMsg_$eq](../../testkit/TestKitBase.html#lastWasNoMsg_$eq(boolean)), [msgAvailable](../../testkit/TestKitBase.html#msgAvailable()), [now](../../testkit/TestKitBase.html#now()), [receiveN](../../testkit/TestKitBase.html#receiveN(int)), [receiveN](../../testkit/TestKitBase.html#receiveN(int,scala.concurrent.duration.FiniteDuration)), [receiveN_internal](../../testkit/TestKitBase.html#receiveN_internal(int,scala.concurrent.duration.Duration)), [receiveOne](../../testkit/TestKitBase.html#receiveOne(scala.concurrent.duration.Duration)), [receiveWhile](../../testkit/TestKitBase.html#receiveWhile(scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,int,scala.PartialFunction)), [receiveWhile$default$1](../../testkit/TestKitBase.html#receiveWhile$default$1()), [receiveWhile$default$2](../../testkit/TestKitBase.html#receiveWhile$default$2()), [receiveWhile$default$3](../../testkit/TestKitBase.html#receiveWhile$default$3()), [remaining](../../testkit/TestKitBase.html#remaining()), [remainingOr](../../testkit/TestKitBase.html#remainingOr(scala.concurrent.duration.FiniteDuration)), [remainingOrDefault](../../testkit/TestKitBase.html#remainingOrDefault()), [remainingOrDilated](../../testkit/TestKitBase.html#remainingOrDilated(scala.concurrent.duration.Duration)), [setAutoPilot](../../testkit/TestKitBase.html#setAutoPilot(akka.testkit.TestActor.AutoPilot)), [shutdown](../../testkit/TestKitBase.html#shutdown(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean)), [shutdown$default$1](../../testkit/TestKitBase.html#shutdown$default$1()), [shutdown$default$2](../../testkit/TestKitBase.html#shutdown$default$2()), [shutdown$default$3](../../testkit/TestKitBase.html#shutdown$default$3()), [testActorName](../../testkit/TestKitBase.html#testActorName()), [testKitSettings](../../testkit/TestKitBase.html#testKitSettings()), [unwatch](../../testkit/TestKitBase.html#unwatch(akka.actor.ActorRef)), [watch](../../testkit/TestKitBase.html#watch(akka.actor.ActorRef)), [within](../../testkit/TestKitBase.html#within(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0)), [within](../../testkit/TestKitBase.html#within(scala.concurrent.duration.FiniteDuration,scala.Function0))`

- - ### Constructor Detail
	
	
	
		- #### MultiNodeSpec
		
		
		
		```
		public MultiNodeSpec​([RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor") myself,
		                     [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") _system,
		                     scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")> _roles,
		                     scala.Function1<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor"),​scala.collection.immutable.Seq<java.lang.String>> deployments)
		```
		- #### MultiNodeSpec
		
		
		
		```
		public MultiNodeSpec​([MultiNodeConfig](MultiNodeConfig.html "class in akka.remote.testkit") config,
		                     scala.Function1<com.typesafe.config.Config,​[ActorSystem](../../actor/ActorSystem.html "class in akka.actor")> actorSystemCreator)
		```
		
		Constructor for using arbitrary logic to create the actor system used in
		 the multi node spec (the `Config` passed to the creator must be used in
		 the created actor system for the multi node tests to work)
		- #### MultiNodeSpec
		
		
		
		```
		public MultiNodeSpec​([MultiNodeConfig](MultiNodeConfig.html "class in akka.remote.testkit") config)
		```

	- ### Method Detail
	
	
	
		- #### maxNodes
		
		
		
		```
		public static int maxNodes()
		```
		
		Number of nodes node taking part in this test.
		 
		
		
		
		```
		
		 -Dmultinode.max-nodes=4
		 
		```
		- #### selfName
		
		
		
		```
		public static java.lang.String selfName()
		```
		
		Name (or IP address; must be resolvable using InetAddress.getByName)
		 of the host this node is running on.
		 
		
		
		
		```
		
		 -Dmultinode.host=host.example.com
		 
		```
		
		
		 InetAddress.getLocalHost.getHostAddress is used if empty or "localhost"
		 is defined as system property "multinode.host".
		- #### tcpPort
		
		
		
		```
		public static int tcpPort()
		```
		
		TCP Port number to be used when running tests on TCP. 0 means a random port.
		 
		
		
		
		```
		
		 -Dmultinode.port=0
		 
		```
		- #### udpPort
		
		
		
		```
		public static scala.Option<java.lang.Object> udpPort()
		```
		
		UDP Port number to be used when running tests on UDP. 0 means a random port.
		 
		
		
		
		```
		
		 -Dmultinode.udp.port=0
		 
		```
		- #### selfPort
		
		
		
		```
		public static int selfPort()
		```
		
		Port number of this node.
		 
		 This is defined in function of property `multinode.protocol`.
		 If set to 'udp', udpPort will be used. If unset or any other value, it will default to tcpPort.
		- #### serverName
		
		
		
		```
		public static java.lang.String serverName()
		```
		
		Name (or IP address; must be resolvable using InetAddress.getByName)
		 of the host that the server node is running on.
		 
		
		
		
		```
		
		 -Dmultinode.server-host=server.example.com
		 
		```
		- #### serverPort
		
		
		
		```
		public static int serverPort()
		```
		
		Port number of the node that's running the server system. Defaults to 4711\.
		 
		
		
		
		```
		
		 -Dmultinode.server-port=4711
		 
		```
		- #### selfIndex
		
		
		
		```
		public static java.lang.Integer selfIndex()
		```
		
		Index of this node in the roles sequence. The TestConductor
		 is started in \&ldquo;controller\&rdquo; mode on selfIndex 0, i.e. there you can inject
		 failures and shutdown other nodes etc.
		 
		
		
		
		```
		
		 -Dmultinode.index=0
		 
		```
		- #### configureNextPortIfFixed
		
		
		
		```
		public static com.typesafe.config.Config configureNextPortIfFixed​(com.typesafe.config.Config config)
		```
		- #### myself
		
		
		
		```
		public [RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor") myself()
		```
		- #### log
		
		
		
		```
		public [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log()
		```
		- #### awaitHelper
		
		
		
		```
		public <T> [MultiNodeSpec.AwaitHelper](MultiNodeSpec.AwaitHelper.html "class in akka.remote.testkit")<T> awaitHelper​(scala.concurrent.Awaitable<T> w)
		```
		
		Enrich `.await()` onto all Awaitables, using remaining duration from the innermost
		 enclosing `within` block or QueryTimeout.
		- #### multiNodeSpecBeforeAll
		
		
		
		```
		public final void multiNodeSpecBeforeAll()
		```
		
		Description copied from interface: `[MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html#multiNodeSpecBeforeAll())`
		Call this before the start of the test run. NOT before every test case.
		
		Specified by:
		`[multiNodeSpecBeforeAll](MultiNodeSpecCallbacks.html#multiNodeSpecBeforeAll())` in interface `[MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "interface in akka.remote.testkit")`
		- #### multiNodeSpecAfterAll
		
		
		
		```
		public final void multiNodeSpecAfterAll()
		```
		
		Description copied from interface: `[MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html#multiNodeSpecAfterAll())`
		Call this after the all test cases have run. NOT after every test case.
		
		Specified by:
		`[multiNodeSpecAfterAll](MultiNodeSpecCallbacks.html#multiNodeSpecAfterAll())` in interface `[MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "interface in akka.remote.testkit")`
		- #### shutdownTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration shutdownTimeout()
		```
		- #### verifySystemShutdown
		
		
		
		```
		public boolean verifySystemShutdown()
		```
		
		Override this and return `true` to assert that the
		 shutdown of the `ActorSystem` was done properly.
		- #### atStartup
		
		
		
		```
		protected void atStartup()
		```
		
		Override this method to do something when the whole test is starting up.
		- #### afterTermination
		
		
		
		```
		protected void afterTermination()
		```
		
		Override this method to do something when the whole test is terminating.
		- #### roles
		
		
		
		```
		public scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")> roles()
		```
		
		All registered roles
		- #### initialParticipants
		
		
		
		```
		public abstract int initialParticipants()
		```
		
		TO BE DEFINED BY USER: Defines the number of participants required for starting the test. This
		 might not be equals to the number of nodes available to the test.
		 
		 Must be a `def`:
		 
		
		
		```
		
		 def initialParticipants = 5
		 
		```
		- #### testConductor
		
		
		
		```
		public [TestConductorExt](../testconductor/TestConductorExt.html "class in akka.remote.testconductor") testConductor()
		```
		
		Access to the barriers, failure injection, etc. The extension will have
		 been started either in Conductor or Player mode when the constructor of
		 MultiNodeSpec finishes, i.e. do not call the start\*() methods yourself!
		- #### testConductor\_$eq
		
		
		
		```
		public void testConductor_$eq​([TestConductorExt](../testconductor/TestConductorExt.html "class in akka.remote.testconductor") x$1)
		```
		- #### runOn
		
		
		
		```
		public void runOn​(scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")> nodes,
		                  scala.Function0<scala.runtime.BoxedUnit> thunk)
		```
		
		Execute the given block of code only on the given nodes (names according
		 to the `roleMap`).
		- #### isNode
		
		
		
		```
		public boolean isNode​(scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")> nodes)
		```
		
		Verify that the running node matches one of the given nodes
		- #### enterBarrier
		
		
		
		```
		public void enterBarrier​(scala.collection.immutable.Seq<java.lang.String> name)
		```
		
		Enter the named barriers in the order given. Use the remaining duration from
		 the innermost enclosing `within` block or the default `BarrierTimeout`.
		- #### enterBarrier
		
		
		
		```
		public void enterBarrier​(scala.concurrent.duration.FiniteDuration max,
		                         scala.collection.immutable.Seq<java.lang.String> name)
		```
		
		Enter the named barriers in the order given. Use the remaining duration from
		 the innermost enclosing `within` block or the passed `max` timeout.
		 
		 Note that the `max` timeout is scaled using Duration.dilated,
		 which uses the configuration entry "akka.test.timefactor".
		- #### node
		
		
		
		```
		public [ActorPath](../../actor/ActorPath.html "interface in akka.actor") node​([RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor") role)
		```
		
		Query the controller for the transport address of the given node (by role name) and
		 return that as an ActorPath for easy composition:
		 
		
		
		
		```
		
		 val serviceA = system.actorSelection(node("master") / "user" / "serviceA")
		 
		```
		- #### muteDeadLetters
		
		
		
		```
		public void muteDeadLetters​(scala.collection.immutable.Seq<java.lang.Class<?>> messageClasses,
		                            [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") sys)
		```
		- #### muteDeadLetters$default$2
		
		
		
		```
		public [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") muteDeadLetters$default$2​(scala.collection.immutable.Seq<java.lang.Class<?>> messageClasses)
		```
		- #### attachConductor
		
		
		
		```
		protected void attachConductor​([TestConductorExt](../testconductor/TestConductorExt.html "class in akka.remote.testconductor") tc)
		```
		- #### injectDeployments
		
		
		
		```
		protected void injectDeployments​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") sys,
		                                 [RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor") role)
		```
		- #### myAddress
		
		
		
		```
		protected [Address](../../actor/Address.html "class in akka.actor") myAddress()
		```
		- #### startNewSystem
		
		
		
		```
		protected [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") startNewSystem()
		```
		
		This method starts a new ActorSystem with the same configuration as the
		 previous one on the current node, including deployments. It also creates
		 a new TestConductor client and registers itself with the conductor so
		 that it is possible to use barriers etc. normally after this method has
		 been called.
		 
		 NOTICE: you MUST start a new system before trying to enter a barrier or
		 otherwise using the TestConductor after having terminated this node\&rsquo;s
		 system.

## Code Examples

### Example 1: maxNodes

```text
-Dmultinode.max-nodes=4
```

### Example 2: selfName

```text
-Dmultinode.host=host.example.com
```

### Example 3: tcpPort

```text
-Dmultinode.port=0
```

### Example 4: udpPort

```text
-Dmultinode.udp.port=0
```

### Example 5: serverName

```text
-Dmultinode.server-host=server.example.com
```

### Example 6: serverPort

```text
-Dmultinode.server-port=4711
```

### Example 7: selfIndex

```text
-Dmultinode.index=0
```

### Example 8: initialParticipants

```text
def initialParticipants = 5
```

### Example 9: node

```text
val serviceA = system.actorSelection(node("master") / "user" / "serviceA")
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec.AwaitHelper.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpecCallbacks.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestKit.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestKitBase.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec.html)*