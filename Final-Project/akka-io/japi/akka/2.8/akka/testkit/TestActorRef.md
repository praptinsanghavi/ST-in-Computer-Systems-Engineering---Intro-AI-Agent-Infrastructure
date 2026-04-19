---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/testkit/TestActorRef.html
title: TestActorRef
---

# TestActorRef

## Content

Package [akka.testkit](package-summary.html)
## Class TestActorRef\<T extends [Actor](../actor/Actor.html "interface in akka.actor")\>

- java.lang.Object
- - akka.actor.LocalActorRef
	- - akka.testkit.TestActorRef\<T\>

- Direct Known Subclasses:
`[TestFSMRef](TestFSMRef.html "class in akka.testkit")`

---

```
public class TestActorRef<T extends [Actor](../actor/Actor.html "interface in akka.actor")>
extends akka.actor.LocalActorRef
```

This special ActorRef is exclusively for use during unit testing in a single\-threaded environment. Therefore, it
 overrides the dispatcher to CallingThreadDispatcher and sets the receiveTimeout to None. Otherwise,
 it acts just like a normal ActorRef. You may retrieve a reference to the underlying actor to test internal logic.
 

Since:
1\.1

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestActorRef](#%3Cinit%3E(akka.actor.ActorSystem,akka.actor.Props,akka.actor.ActorRef,java.lang.String))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") _system,  [Props](../actor/Props.html "class in akka.actor") _props,  [ActorRef](../actor/ActorRef.html "class in akka.actor") _supervisor,  java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.ActorRef,java.lang.String,scala.reflect.ClassTag,akka.actor.ActorSystem))​([ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  java.lang.String name,  scala.reflect.ClassTag<T> t,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.ActorRef,scala.reflect.ClassTag,akka.actor.ActorSystem))​([ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  scala.reflect.ClassTag<T> t,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.Props,akka.actor.ActorRef,akka.actor.ActorSystem))​([Props](../actor/Props.html "class in akka.actor") props,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.Props,akka.actor.ActorRef,java.lang.String,akka.actor.ActorSystem))​([Props](../actor/Props.html "class in akka.actor") props,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  java.lang.String name,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.Props,akka.actor.ActorSystem))​([Props](../actor/Props.html "class in akka.actor") props,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.Props,java.lang.String,akka.actor.ActorSystem))​([Props](../actor/Props.html "class in akka.actor") props,  java.lang.String name,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(java.lang.String,scala.reflect.ClassTag,akka.actor.ActorSystem))​(java.lang.String name,  scala.reflect.ClassTag<T> t,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(scala.Function0,java.lang.String,scala.reflect.ClassTag,akka.actor.ActorSystem))​(scala.Function0<T> factory,  java.lang.String name,  scala.reflect.ClassTag<T> evidence$2,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(scala.Function0,scala.reflect.ClassTag,akka.actor.ActorSystem))​(scala.Function0<T> factory,  scala.reflect.ClassTag<T> evidence$1,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(scala.reflect.ClassTag,akka.actor.ActorSystem))​(scala.reflect.ClassTag<T> t,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[create](#create(akka.actor.ActorSystem,akka.actor.Props))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [Props](../actor/Props.html "class in akka.actor") props)` | Java API: create a TestActorRef in the given system for the given props,  with a random name. |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[create](#create(akka.actor.ActorSystem,akka.actor.Props,akka.actor.ActorRef))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [Props](../actor/Props.html "class in akka.actor") props,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor)` | Java API: create a TestActorRef in the given system for the given props,  with the given supervisor and a random name. |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[create](#create(akka.actor.ActorSystem,akka.actor.Props,akka.actor.ActorRef,java.lang.String))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [Props](../actor/Props.html "class in akka.actor") props,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  java.lang.String name)` | Java API: create a TestActorRef in the given system for the given props,  with the given supervisor and name. |
	| `static <T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[create](#create(akka.actor.ActorSystem,akka.actor.Props,java.lang.String))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [Props](../actor/Props.html "class in akka.actor") props,  java.lang.String name)` | Java API: create a TestActorRef in the given system for the given props,  with the given name. |
	| `[MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch")` | `[dispatcher](#dispatcher())()` |  |
	| `protected akka.actor.ActorCell` | `[newActorCell](#newActorCell(akka.actor.ActorSystemImpl,akka.actor.InternalActorRef,akka.actor.Props,akka.dispatch.MessageDispatcher,akka.actor.InternalActorRef))​(akka.actor.ActorSystemImpl system,  akka.actor.InternalActorRef ref,  [Props](../actor/Props.html "class in akka.actor") props,  [MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch") dispatcher,  akka.actor.InternalActorRef supervisor)` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props())()` |  |
	| `void` | `[receive](#receive(java.lang.Object))​(java.lang.Object o)` | Directly inject messages into actor receive behavior. |
	| `void` | `[receive](#receive(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object o,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` | Directly inject messages into actor receive behavior. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[T](TestActorRef.html "type parameter in TestActorRef")` | `[underlyingActor](#underlyingActor())()` | Retrieve reference to the underlying actor, where the static type matches the factory used inside the  constructor. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[unwatch](#unwatch(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subject)` | Unregisters this actor from being a death monitor of the provided ActorRef  This means that this actor will not get a Terminated()\-message when the provided actor  is permanently terminated. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[watch](#watch(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subject)` | Registers this actor to be a death monitor of the provided ActorRef  This means that this actor will get a Terminated()\-message when the provided actor  is permanently terminated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestActorRef
		
		
		
		```
		public TestActorRef​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") _system,
		                    [Props](../actor/Props.html "class in akka.actor") _props,
		                    [ActorRef](../actor/ActorRef.html "class in akka.actor") _supervisor,
		                    java.lang.String name)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​(scala.Function0<T> factory,
		                                                      scala.reflect.ClassTag<T> evidence$1,
		                                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​(scala.Function0<T> factory,
		                                                      java.lang.String name,
		                                                      scala.reflect.ClassTag<T> evidence$2,
		                                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([Props](../actor/Props.html "class in akka.actor") props,
		                                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([Props](../actor/Props.html "class in akka.actor") props,
		                                                      java.lang.String name,
		                                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([Props](../actor/Props.html "class in akka.actor") props,
		                                                      [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([Props](../actor/Props.html "class in akka.actor") props,
		                                                      [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                                      java.lang.String name,
		                                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​(scala.reflect.ClassTag<T> t,
		                                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​(java.lang.String name,
		                                                      scala.reflect.ClassTag<T> t,
		                                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                                      scala.reflect.ClassTag<T> t,
		                                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                                      java.lang.String name,
		                                                      scala.reflect.ClassTag<T> t,
		                                                      [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### create
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                       [Props](../actor/Props.html "class in akka.actor") props,
		                                                       [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                                       java.lang.String name)
		```
		
		Java API: create a TestActorRef in the given system for the given props,
		 with the given supervisor and name.
		- #### create
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                       [Props](../actor/Props.html "class in akka.actor") props,
		                                                       [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor)
		```
		
		Java API: create a TestActorRef in the given system for the given props,
		 with the given supervisor and a random name.
		- #### create
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                       [Props](../actor/Props.html "class in akka.actor") props,
		                                                       java.lang.String name)
		```
		
		Java API: create a TestActorRef in the given system for the given props,
		 with the given name.
		- #### create
		
		
		
		```
		public static <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                       [Props](../actor/Props.html "class in akka.actor") props)
		```
		
		Java API: create a TestActorRef in the given system for the given props,
		 with a random name.
		- #### props
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") props()
		```
		- #### dispatcher
		
		
		
		```
		public [MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch") dispatcher()
		```
		- #### newActorCell
		
		
		
		```
		protected akka.actor.ActorCell newActorCell​(akka.actor.ActorSystemImpl system,
		                                            akka.actor.InternalActorRef ref,
		                                            [Props](../actor/Props.html "class in akka.actor") props,
		                                            [MessageDispatcher](../dispatch/MessageDispatcher.html "class in akka.dispatch") dispatcher,
		                                            akka.actor.InternalActorRef supervisor)
		```
		- #### receive
		
		
		
		```
		public void receive​(java.lang.Object o)
		```
		
		Directly inject messages into actor receive behavior. Any exceptions
		 thrown will be available to you, while still being able to use
		 become/unbecome.
		- #### receive
		
		
		
		```
		public void receive​(java.lang.Object o,
		                    [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		Directly inject messages into actor receive behavior. Any exceptions
		 thrown will be available to you, while still being able to use
		 become/unbecome.
		- #### underlyingActor
		
		
		
		```
		public [T](TestActorRef.html "type parameter in TestActorRef") underlyingActor()
		```
		
		Retrieve reference to the underlying actor, where the static type matches the factory used inside the
		 constructor. Beware that this reference is discarded by the ActorRef upon restarting the actor (should this
		 reference be linked to a supervisor). The old Actor may of course still be used in post\-mortem assertions.
		- #### watch
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") watch​([ActorRef](../actor/ActorRef.html "class in akka.actor") subject)
		```
		
		Registers this actor to be a death monitor of the provided ActorRef
		 This means that this actor will get a Terminated()\-message when the provided actor
		 is permanently terminated.
		 
		
		Returns:
		the same ActorRef that is provided to it, to allow for cleaner invocations
		- #### unwatch
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") unwatch​([ActorRef](../actor/ActorRef.html "class in akka.actor") subject)
		```
		
		Unregisters this actor from being a death monitor of the provided ActorRef
		 This means that this actor will not get a Terminated()\-message when the provided actor
		 is permanently terminated.
		 
		
		Returns:
		the same ActorRef that is provided to it, to allow for cleaner invocations
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Props.html
- https://doc.akka.io/japi/akka/2.8/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka/2.8/akka/testkit/TestActorRef.html
- https://doc.akka.io/japi/akka/2.8/akka/testkit/TestFSMRef.html
- https://doc.akka.io/japi/akka/2.8/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/testkit/TestActorRef.html](https://doc.akka.io/japi/akka/2.8/akka/testkit/TestActorRef.html)*