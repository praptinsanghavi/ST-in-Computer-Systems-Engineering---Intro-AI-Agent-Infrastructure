---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:17:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.html
title: TestActor
---

# TestActor

## Content

Package [akka.testkit](package-summary.html)
## Class TestActor

- java.lang.Object
- - akka.testkit.TestActor

- All Implemented Interfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`

---

```
public class TestActor
extends java.lang.Object
implements [Actor](../actor/Actor.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[TestActor.AutoPilot](TestActor.AutoPilot.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.KeepRunning$](TestActor.KeepRunning$.html "class in akka.testkit")` |  |
	| `static interface` | `[TestActor.Message](TestActor.Message.html "interface in akka.testkit")` |  |
	| `static class` | `[TestActor.NoAutoPilot$](TestActor.NoAutoPilot$.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.NullMessage$](TestActor.NullMessage$.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.RealMessage](TestActor.RealMessage.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.RealMessage$](TestActor.RealMessage$.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.SetAutoPilot](TestActor.SetAutoPilot.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.SetAutoPilot$](TestActor.SetAutoPilot$.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.SetIgnore](TestActor.SetIgnore.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.SetIgnore$](TestActor.SetIgnore$.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.Spawn](TestActor.Spawn.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.Spawn$](TestActor.Spawn$.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.UnWatch](TestActor.UnWatch.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.UnWatch$](TestActor.UnWatch$.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.Watch](TestActor.Watch.html "class in akka.testkit")` |  |
	| `static class` | `[TestActor.Watch$](TestActor.Watch$.html "class in akka.testkit")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestActor](#%3Cinit%3E(java.util.concurrent.BlockingDeque))​(java.util.concurrent.BlockingDeque<[TestActor.Message](TestActor.Message.html "interface in akka.testkit")> queue)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `[TestActor.AutoPilot](TestActor.AutoPilot.html "class in akka.testkit")` | `[autopilot](#autopilot())()` |  |
	| `void` | `[autopilot_$eq](#autopilot_$eq(akka.testkit.TestActor.AutoPilot))​([TestActor.AutoPilot](TestActor.AutoPilot.html "class in akka.testkit") x$1)` |  |
	| `[ActorContext](../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `static scala.Function1<java.lang.Object,​java.lang.Object>` | `[FALSE](#FALSE())()` |  |
	| `scala.Option<scala.PartialFunction<java.lang.Object,​java.lang.Object>>` | `[ignore](#ignore())()` |  |
	| `void` | `[ignore_$eq](#ignore_$eq(scala.Option))​(scala.Option<scala.PartialFunction<java.lang.Object,​java.lang.Object>> x$1)` |  |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `static [Props](../actor/Props.html "class in akka.actor")` | `[props](#props(java.util.concurrent.BlockingDeque))​(java.util.concurrent.BlockingDeque<[TestActor.Message](TestActor.Message.html "interface in akka.testkit")> queue)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	| `akka.testkit.TestActor.DelegatingSupervisorStrategy` | `[supervisorStrategy](#supervisorStrategy())()` | User overridable definition the strategy to use for supervising  child actors. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../actor/Actor.html#aroundPreStart()), [aroundReceive](../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../actor/Actor.html#preStart()), [sender](../actor/Actor.html#sender()), [unhandled](../actor/Actor.html#unhandled(java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### TestActor
		
		
		
		```
		public TestActor​(java.util.concurrent.BlockingDeque<[TestActor.Message](TestActor.Message.html "interface in akka.testkit")> queue)
		```

	- ### Method Detail
	
	
	
		- #### FALSE
		
		
		
		```
		public static scala.Function1<java.lang.Object,​java.lang.Object> FALSE()
		```
		- #### props
		
		
		
		```
		public static [Props](../actor/Props.html "class in akka.actor") props​(java.util.concurrent.BlockingDeque<[TestActor.Message](TestActor.Message.html "interface in akka.testkit")> queue)
		```
		- #### context
		
		
		
		```
		public [ActorContext](../actor/ActorContext.html "interface in akka.actor") context()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](../actor/Actor.html#context())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### self
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../actor/Actor.html#self())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](../actor/ActorRef.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### supervisorStrategy
		
		
		
		```
		public akka.testkit.TestActor.DelegatingSupervisorStrategy supervisorStrategy()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#supervisorStrategy())`
		User overridable definition the strategy to use for supervising
		 child actors.
		
		Specified by:
		`[supervisorStrategy](../actor/Actor.html#supervisorStrategy())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### ignore
		
		
		
		```
		public scala.Option<scala.PartialFunction<java.lang.Object,​java.lang.Object>> ignore()
		```
		- #### ignore\_$eq
		
		
		
		```
		public void ignore_$eq​(scala.Option<scala.PartialFunction<java.lang.Object,​java.lang.Object>> x$1)
		```
		- #### autopilot
		
		
		
		```
		public [TestActor.AutoPilot](TestActor.AutoPilot.html "class in akka.testkit") autopilot()
		```
		- #### autopilot\_$eq
		
		
		
		```
		public void autopilot_$eq​([TestActor.AutoPilot](TestActor.AutoPilot.html "class in akka.testkit") x$1)
		```
		- #### receive
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../actor/Actor.html#receive())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### postStop
		
		
		
		```
		public void postStop()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#postStop())`
		User overridable callback.
		 
		 Is called asynchronously after 'actor.stop()' is invoked.
		 Empty default implementation.
		
		Specified by:
		`[postStop](../actor/Actor.html#postStop())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.AutoPilot.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.KeepRunning$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.Message.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.NoAutoPilot$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.NullMessage$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.RealMessage$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.RealMessage.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.SetAutoPilot$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.SetAutoPilot.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.SetIgnore$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.SetIgnore.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.Spawn$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.Spawn.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.UnWatch$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.UnWatch.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.Watch$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.Watch.html
- https://doc.akka.io/japi/akka-core/2.6/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.html](https://doc.akka.io/japi/akka-core/2.6/akka/testkit/TestActor.html)*