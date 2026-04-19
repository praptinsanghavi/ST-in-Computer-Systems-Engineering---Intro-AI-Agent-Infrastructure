---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestActorRef$.html
title: TestActorRef$
---

# TestActorRef$

## Content

Package [akka.testkit](package-summary.html)
## Class TestActorRef$

- java.lang.Object
- - akka.testkit.TestActorRef$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class TestActorRef$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.testkit.TestActorRef$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestActorRef$](TestActorRef$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestActorRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.ActorRef,java.lang.String,scala.reflect.ClassTag,akka.actor.ActorSystem))​([ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  java.lang.String name,  scala.reflect.ClassTag<T> t,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.ActorRef,scala.reflect.ClassTag,akka.actor.ActorSystem))​([ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  scala.reflect.ClassTag<T> t,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.Props,akka.actor.ActorRef,akka.actor.ActorSystem))​([Props](../actor/Props.html "class in akka.actor") props,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.Props,akka.actor.ActorRef,java.lang.String,akka.actor.ActorSystem))​([Props](../actor/Props.html "class in akka.actor") props,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  java.lang.String name,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.Props,akka.actor.ActorSystem))​([Props](../actor/Props.html "class in akka.actor") props,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(akka.actor.Props,java.lang.String,akka.actor.ActorSystem))​([Props](../actor/Props.html "class in akka.actor") props,  java.lang.String name,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(java.lang.String,scala.reflect.ClassTag,akka.actor.ActorSystem))​(java.lang.String name,  scala.reflect.ClassTag<T> t,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(scala.Function0,java.lang.String,scala.reflect.ClassTag,akka.actor.ActorSystem))​(scala.Function0<T> factory,  java.lang.String name,  scala.reflect.ClassTag<T> evidence$2,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(scala.Function0,scala.reflect.ClassTag,akka.actor.ActorSystem))​(scala.Function0<T> factory,  scala.reflect.ClassTag<T> evidence$1,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[apply](#apply(scala.reflect.ClassTag,akka.actor.ActorSystem))​(scala.reflect.ClassTag<T> t,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[create](#create(akka.actor.ActorSystem,akka.actor.Props))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [Props](../actor/Props.html "class in akka.actor") props)` | Java API: create a TestActorRef in the given system for the given props,  with a random name. |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[create](#create(akka.actor.ActorSystem,akka.actor.Props,akka.actor.ActorRef))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [Props](../actor/Props.html "class in akka.actor") props,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor)` | Java API: create a TestActorRef in the given system for the given props,  with the given supervisor and a random name. |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[create](#create(akka.actor.ActorSystem,akka.actor.Props,akka.actor.ActorRef,java.lang.String))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [Props](../actor/Props.html "class in akka.actor") props,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  java.lang.String name)` | Java API: create a TestActorRef in the given system for the given props,  with the given supervisor and name. |
	| `<T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestActorRef](TestActorRef.html "class in akka.testkit")<T>` | `[create](#create(akka.actor.ActorSystem,akka.actor.Props,java.lang.String))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [Props](../actor/Props.html "class in akka.actor") props,  java.lang.String name)` | Java API: create a TestActorRef in the given system for the given props,  with the given name. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestActorRef$](TestActorRef$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestActorRef$
		
		
		
		```
		public TestActorRef$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​(scala.Function0<T> factory,
		                                               scala.reflect.ClassTag<T> evidence$1,
		                                               [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​(scala.Function0<T> factory,
		                                               java.lang.String name,
		                                               scala.reflect.ClassTag<T> evidence$2,
		                                               [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([Props](../actor/Props.html "class in akka.actor") props,
		                                               [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([Props](../actor/Props.html "class in akka.actor") props,
		                                               java.lang.String name,
		                                               [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([Props](../actor/Props.html "class in akka.actor") props,
		                                               [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                               [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([Props](../actor/Props.html "class in akka.actor") props,
		                                               [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                               java.lang.String name,
		                                               [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​(scala.reflect.ClassTag<T> t,
		                                               [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​(java.lang.String name,
		                                               scala.reflect.ClassTag<T> t,
		                                               [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                               scala.reflect.ClassTag<T> t,
		                                               [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                               java.lang.String name,
		                                               scala.reflect.ClassTag<T> t,
		                                               [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### create
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                [Props](../actor/Props.html "class in akka.actor") props,
		                                                [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                                java.lang.String name)
		```
		
		Java API: create a TestActorRef in the given system for the given props,
		 with the given supervisor and name.
		- #### create
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                [Props](../actor/Props.html "class in akka.actor") props,
		                                                [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor)
		```
		
		Java API: create a TestActorRef in the given system for the given props,
		 with the given supervisor and a random name.
		- #### create
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                [Props](../actor/Props.html "class in akka.actor") props,
		                                                java.lang.String name)
		```
		
		Java API: create a TestActorRef in the given system for the given props,
		 with the given name.
		- #### create
		
		
		
		```
		public <T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestActorRef](TestActorRef.html "class in akka.testkit")<T> create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                [Props](../actor/Props.html "class in akka.actor") props)
		```
		
		Java API: create a TestActorRef in the given system for the given props,
		 with a random name.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestActorRef$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestActorRef.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestActorRef$.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestActorRef$.html)*