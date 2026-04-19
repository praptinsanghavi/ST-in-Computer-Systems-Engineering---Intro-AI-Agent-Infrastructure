---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestFSMRef$.html
title: TestFSMRef$
---

# TestFSMRef$

## Content

Package [akka.testkit](package-summary.html)
## Class TestFSMRef$

- java.lang.Object
- - akka.testkit.TestFSMRef$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class TestFSMRef$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.testkit.TestFSMRef$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestFSMRef$](TestFSMRef$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestFSMRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T>` | `[apply](#apply(scala.Function0,akka.actor.ActorRef,java.lang.String,scala.reflect.ClassTag,scala.$less$colon$less,akka.actor.ActorSystem))​(scala.Function0<T> factory,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  java.lang.String name,  scala.reflect.ClassTag<T> evidence$3,  scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T>` | `[apply](#apply(scala.Function0,akka.actor.ActorRef,scala.reflect.ClassTag,scala.$less$colon$less,akka.actor.ActorSystem))​(scala.Function0<T> factory,  [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,  scala.reflect.ClassTag<T> evidence$4,  scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T>` | `[apply](#apply(scala.Function0,java.lang.String,scala.reflect.ClassTag,scala.$less$colon$less,akka.actor.ActorSystem))​(scala.Function0<T> factory,  java.lang.String name,  scala.reflect.ClassTag<T> evidence$2,  scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `<S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")>[TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T>` | `[apply](#apply(scala.Function0,scala.reflect.ClassTag,scala.$less$colon$less,akka.actor.ActorSystem))​(scala.Function0<T> factory,  scala.reflect.ClassTag<T> evidence$1,  scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestFSMRef$](TestFSMRef$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestFSMRef$
		
		
		
		```
		public TestFSMRef$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T> apply​(scala.Function0<T> factory,
		                                                                             scala.reflect.ClassTag<T> evidence$1,
		                                                                             scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,
		                                                                             [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T> apply​(scala.Function0<T> factory,
		                                                                             java.lang.String name,
		                                                                             scala.reflect.ClassTag<T> evidence$2,
		                                                                             scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,
		                                                                             [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T> apply​(scala.Function0<T> factory,
		                                                                             [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                                                             java.lang.String name,
		                                                                             scala.reflect.ClassTag<T> evidence$3,
		                                                                             scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,
		                                                                             [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public <S,​D,​T extends [Actor](../actor/Actor.html "interface in akka.actor")> [TestFSMRef](TestFSMRef.html "class in akka.testkit")<S,​D,​T> apply​(scala.Function0<T> factory,
		                                                                             [ActorRef](../actor/ActorRef.html "class in akka.actor") supervisor,
		                                                                             scala.reflect.ClassTag<T> evidence$4,
		                                                                             scala.$less$colon$less<T,​[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>> ev,
		                                                                             [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestFSMRef$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestFSMRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestFSMRef$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestFSMRef$.html)*