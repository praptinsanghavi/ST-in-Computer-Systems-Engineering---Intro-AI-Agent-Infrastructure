---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestFSMRef.html
title: TestFSMRef
---

# TestFSMRef

## Content

Package [akka.testkit](package-summary.html)
## Class TestFSMRef\<S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")\>

- java.lang.Object
- - akka.actor.LocalActorRef
	- - [akka.testkit.TestActorRef](TestActorRef.html "class in akka.testkit")\<T\>
		- - akka.testkit.TestFSMRef\<S,​D,​T\>

- ---

```
public class TestFSMRef<S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")>
extends [TestActorRef](TestActorRef.html "class in akka.testkit")<T>
```

This is a specialized form of the TestActorRef with support for querying and
 setting the state of a FSM. Use a LoggingFSM with this class if you also
 need to inspect event traces.
 

```

 val fsm = TestFSMRef(new Actor with LoggingFSM[Int, Null] {
     override def logDepth = 12
     startWith(1, null)
     when(1) {
       case Event("hello", _) => goto(2)
     }
     when(2) {
       case Event("world", _) => goto(1)
     }
   })
 assert (fsm.stateName == 1)
 fsm ! "hallo"
 assert (fsm.stateName == 2)
 assert (fsm.underlyingActor.getLog == IndexedSeq(FSMLogEntry(1, null, "hallo")))
 
```

Since:
1\.2

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestFSMRef](#%3Cinit%3E(akka.actor.ActorSystem,akka.actor.Props,akka.actor.ActorRef,java.lang.String,scala.$less$colon$less))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [Props](../actor/Props.html "class in akka.actor") props,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  java.lang.String name,  scala.$less$colon$less<[T](TestFSMRef.html "type parameter in TestFSMRef"),​[FSM](../actor/FSM.html "interface in akka.actor")<[S](TestFSMRef.html "type parameter in TestFSMRef"),​[D](TestFSMRef.html "type parameter in TestFSMRef")>> ev)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T>` | `[apply](#apply(scala.Function0,akka.actor.ActorRef,java.lang.String,scala.reflect.ClassTag,scala.$less$colon$less,akka.actor.ActorSystem))​(scala.Function0<T> factory,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  java.lang.String name,  scala.reflect.ClassTag<T> evidence$3,  scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T>` | `[apply](#apply(scala.Function0,akka.actor.ActorRef,scala.reflect.ClassTag,scala.$less$colon$less,akka.actor.ActorSystem))​(scala.Function0<T> factory,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  scala.reflect.ClassTag<T> evidence$4,  scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T>` | `[apply](#apply(scala.Function0,java.lang.String,scala.reflect.ClassTag,scala.$less$colon$less,akka.actor.ActorSystem))​(scala.Function0<T> factory,  java.lang.String name,  scala.reflect.ClassTag<T> evidence$2,  scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T>` | `[apply](#apply(scala.Function0,scala.reflect.ClassTag,scala.$less$colon$less,akka.actor.ActorSystem))​(scala.Function0<T> factory,  scala.reflect.ClassTag<T> evidence$1,  scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `void` | `[cancelTimer](#cancelTimer(java.lang.String))​(java.lang.String name)` | Proxy for [`FSM.cancelTimer(java.lang.String)`](../actor/FSM.html#cancelTimer(java.lang.String)). |
	| `boolean` | `[isStateTimerActive](#isStateTimerActive())()` | Proxy for [`FSM.isStateTimerActive()`](../actor/FSM.html#isStateTimerActive()). |
	| `boolean` | `[isTimerActive](#isTimerActive(java.lang.String))​(java.lang.String name)` | Proxy for [`FSM.isStateTimerActive()`](../actor/FSM.html#isStateTimerActive()). |
	| `void` | `[setState](#setState(S,D,scala.concurrent.duration.FiniteDuration,scala.Option))​([S](TestFSMRef.html "type parameter in TestFSMRef") stateName,  [D](TestFSMRef.html "type parameter in TestFSMRef") stateData,  scala.concurrent.duration.FiniteDuration timeout,  scala.Option<[FSM.Reason](../actor/FSM.Reason.html "interface in akka.actor")> stopReason)` | Change FSM state; any value left out defaults to the current FSM state  (timeout defaults to None). |
	| `[S](TestFSMRef.html "type parameter in TestFSMRef")` | `[setState$default$1](#setState$default$1())()` |  |
	| `[D](TestFSMRef.html "type parameter in TestFSMRef")` | `[setState$default$2](#setState$default$2())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[setState$default$3](#setState$default$3())()` |  |
	| `scala.Option<[FSM.Reason](../actor/FSM.Reason.html "interface in akka.actor")>` | `[setState$default$4](#setState$default$4())()` |  |
	| `void` | `[setTimer](#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,boolean))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration timeout,  boolean repeat)` | Deprecated. Use startTimerWithFixedDelay or startTimerAtFixedRate instead. |
	| `boolean` | `[setTimer$default$4](#setTimer$default$4())()` |  |
	| `void` | `[startSingleTimer](#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration delay)` | Proxy for [`FSM.startSingleTimer(java.lang.String, java.lang.Object, scala.concurrent.duration.FiniteDuration)`](../actor/FSM.html#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)). |
	| `void` | `[startTimerAtFixedRate](#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration interval)` | Proxy for [`FSM.startTimerAtFixedRate(java.lang.String, java.lang.Object, scala.concurrent.duration.FiniteDuration)`](../actor/FSM.html#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)). |
	| `void` | `[startTimerWithFixedDelay](#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration delay)` | Proxy for [`FSM.startTimerWithFixedDelay(java.lang.String, java.lang.Object, scala.concurrent.duration.FiniteDuration)`](../actor/FSM.html#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)). |
	| `[D](TestFSMRef.html "type parameter in TestFSMRef")` | `[stateData](#stateData())()` | Get current state data of this FSM. |
	| `[S](TestFSMRef.html "type parameter in TestFSMRef")` | `[stateName](#stateName())()` | Get current state name of this FSM. |
	
	
		- ### Methods inherited from class akka.testkit.[TestActorRef](TestActorRef.html "class in akka.testkit")
		
		
		`[apply](TestActorRef.html#apply(akka.actor.ActorRef,java.lang.String,scala.reflect.ClassTag,akka.actor.ActorSystem)), [apply](TestActorRef.html#apply(akka.actor.ActorRef,scala.reflect.ClassTag,akka.actor.ActorSystem)), [apply](TestActorRef.html#apply(akka.actor.Props,akka.actor.ActorRef,akka.actor.ActorSystem)), [apply](TestActorRef.html#apply(akka.actor.Props,akka.actor.ActorRef,java.lang.String,akka.actor.ActorSystem)), [apply](TestActorRef.html#apply(akka.actor.Props,akka.actor.ActorSystem)), [apply](TestActorRef.html#apply(akka.actor.Props,java.lang.String,akka.actor.ActorSystem)), [apply](TestActorRef.html#apply(java.lang.String,scala.reflect.ClassTag,akka.actor.ActorSystem)), [apply](TestActorRef.html#apply(scala.Function0,java.lang.String,scala.reflect.ClassTag,akka.actor.ActorSystem)), [apply](TestActorRef.html#apply(scala.Function0,scala.reflect.ClassTag,akka.actor.ActorSystem)), [apply](TestActorRef.html#apply(scala.reflect.ClassTag,akka.actor.ActorSystem)), [create](TestActorRef.html#create(akka.actor.ActorSystem,akka.actor.Props)), [create](TestActorRef.html#create(akka.actor.ActorSystem,akka.actor.Props,akka.actor.ActorRef)), [create](TestActorRef.html#create(akka.actor.ActorSystem,akka.actor.Props,akka.actor.ActorRef,java.lang.String)), [create](TestActorRef.html#create(akka.actor.ActorSystem,akka.actor.Props,java.lang.String)), [dispatcher](TestActorRef.html#dispatcher()), [newActorCell](TestActorRef.html#newActorCell(akka.actor.ActorSystemImpl,akka.actor.InternalActorRef,akka.actor.Props,akka.dispatch.MessageDispatcher,akka.actor.InternalActorRef)), [props](TestActorRef.html#props()), [receive](TestActorRef.html#receive(java.lang.Object)), [receive](TestActorRef.html#receive(java.lang.Object,akka.actor.ActorRef)), [toString](TestActorRef.html#toString()), [underlyingActor](TestActorRef.html#underlyingActor()), [unwatch](TestActorRef.html#unwatch(akka.actor.ActorRef)), [watch](TestActorRef.html#watch(akka.actor.ActorRef))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestFSMRef
		
		
		
		```
		public TestFSMRef​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                  [Props](../actor/Props.html "class in akka.actor") props,
		                  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                  java.lang.String name,
		                  scala.$less$colon$less<[T](TestFSMRef.html "type parameter in TestFSMRef"),​[FSM](../actor/FSM.html "interface in akka.actor")<[S](TestFSMRef.html "type parameter in TestFSMRef"),​[D](TestFSMRef.html "type parameter in TestFSMRef")>> ev)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T> apply​(scala.Function0<T> factory,
		                                                                                    scala.reflect.ClassTag<T> evidence$1,
		                                                                                    scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,
		                                                                                    [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T> apply​(scala.Function0<T> factory,
		                                                                                    java.lang.String name,
		                                                                                    scala.reflect.ClassTag<T> evidence$2,
		                                                                                    scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,
		                                                                                    [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T> apply​(scala.Function0<T> factory,
		                                                                                    [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                                                                    java.lang.String name,
		                                                                                    scala.reflect.ClassTag<T> evidence$3,
		                                                                                    scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,
		                                                                                    [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T> apply​(scala.Function0<T> factory,
		                                                                                    [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                                                                    scala.reflect.ClassTag<T> evidence$4,
		                                                                                    scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,
		                                                                                    [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### stateName
		
		
		
		```
		public [S](TestFSMRef.html "type parameter in TestFSMRef") stateName()
		```
		
		Get current state name of this FSM.
		- #### stateData
		
		
		
		```
		public [D](TestFSMRef.html "type parameter in TestFSMRef") stateData()
		```
		
		Get current state data of this FSM.
		- #### setState
		
		
		
		```
		public void setState​([S](TestFSMRef.html "type parameter in TestFSMRef") stateName,
		                     [D](TestFSMRef.html "type parameter in TestFSMRef") stateData,
		                     scala.concurrent.duration.FiniteDuration timeout,
		                     scala.Option<[FSM.Reason](../actor/FSM.Reason.html "interface in akka.actor")> stopReason)
		```
		
		Change FSM state; any value left out defaults to the current FSM state
		 (timeout defaults to None). This method is directly equivalent to a
		 corresponding transition initiated from within the FSM, including timeout
		 and stop handling.
		- #### setState$default$1
		
		
		
		```
		public [S](TestFSMRef.html "type parameter in TestFSMRef") setState$default$1()
		```
		- #### setState$default$2
		
		
		
		```
		public [D](TestFSMRef.html "type parameter in TestFSMRef") setState$default$2()
		```
		- #### setState$default$3
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration setState$default$3()
		```
		- #### setState$default$4
		
		
		
		```
		public scala.Option<[FSM.Reason](../actor/FSM.Reason.html "interface in akka.actor")> setState$default$4()
		```
		- #### startTimerWithFixedDelay
		
		
		
		```
		public void startTimerWithFixedDelay​(java.lang.String name,
		                                     java.lang.Object msg,
		                                     scala.concurrent.duration.FiniteDuration delay)
		```
		
		Proxy for [`FSM.startTimerWithFixedDelay(java.lang.String, java.lang.Object, scala.concurrent.duration.FiniteDuration)`](../actor/FSM.html#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)).
		- #### startTimerAtFixedRate
		
		
		
		```
		public void startTimerAtFixedRate​(java.lang.String name,
		                                  java.lang.Object msg,
		                                  scala.concurrent.duration.FiniteDuration interval)
		```
		
		Proxy for [`FSM.startTimerAtFixedRate(java.lang.String, java.lang.Object, scala.concurrent.duration.FiniteDuration)`](../actor/FSM.html#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)).
		- #### startSingleTimer
		
		
		
		```
		public void startSingleTimer​(java.lang.String name,
		                             java.lang.Object msg,
		                             scala.concurrent.duration.FiniteDuration delay)
		```
		
		Proxy for [`FSM.startSingleTimer(java.lang.String, java.lang.Object, scala.concurrent.duration.FiniteDuration)`](../actor/FSM.html#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)).
		- #### setTimer
		
		
		
		```
		public void setTimer​(java.lang.String name,
		                     java.lang.Object msg,
		                     scala.concurrent.duration.FiniteDuration timeout,
		                     boolean repeat)
		```
		
		Deprecated.
		Use startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Proxy for [`FSM.setTimer(java.lang.String, java.lang.Object, scala.concurrent.duration.FiniteDuration, boolean)`](../actor/FSM.html#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,boolean)).
		- #### setTimer$default$4
		
		
		
		```
		public boolean setTimer$default$4()
		```
		- #### cancelTimer
		
		
		
		```
		public void cancelTimer​(java.lang.String name)
		```
		
		Proxy for [`FSM.cancelTimer(java.lang.String)`](../actor/FSM.html#cancelTimer(java.lang.String)).
		- #### isTimerActive
		
		
		
		```
		public boolean isTimerActive​(java.lang.String name)
		```
		
		Proxy for [`FSM.isStateTimerActive()`](../actor/FSM.html#isStateTimerActive()).
		- #### isStateTimerActive
		
		
		
		```
		public boolean isStateTimerActive()
		```
		
		Proxy for [`FSM.isStateTimerActive()`](../actor/FSM.html#isStateTimerActive()).

## Code Examples

### Example 1: Class TestFSMRef<S,​D,​T extendsActor>

```text
val fsm = TestFSMRef(new Actor with LoggingFSM[Int, Null] {
     override def logDepth = 12
     startWith(1, null)
     when(1) {
       case Event("hello", _) =&gt; goto(2)
     }
     when(2) {
       case Event("world", _) =&gt; goto(1)
     }
   })
 assert (fsm.stateName == 1)
 fsm ! "hallo"
 assert (fsm.stateName == 2)
 assert (fsm.underlyingActor.getLog == IndexedSeq(FSMLogEntry(1, null, "hallo")))
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Reason.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestActorRef.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestFSMRef.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestFSMRef.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestFSMRef.html)*