---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:03:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer$.html
title: Materializer$
---

# Materializer$

## Content

Package [akka.stream](package-summary.html)
## Class Materializer$

- java.lang.Object
- - akka.stream.Materializer$

- ---

```
public class Materializer$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Materializer$](Materializer$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Materializer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Materializer](Materializer.html "class in akka.stream")` | `[apply](#apply(akka.actor.ClassicActorContextProvider))​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider)` | Scala API: Create a materializer whose lifecycle will be tied to the one of the passed actor context. |
	| `[Materializer](Materializer.html "class in akka.stream")` | `[apply](#apply(akka.actor.ClassicActorContextProvider,akka.stream.Attributes))​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider,  [Attributes](Attributes.html "class in akka.stream") defaultAttributes)` | Scala API: Create a materializer whose lifecycle will be tied to the one of the passed actor context. |
	| `[Materializer](Materializer.html "class in akka.stream")` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Scala API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped. |
	| `[Materializer](Materializer.html "class in akka.stream")` | `[apply](#apply(akka.actor.ClassicActorSystemProvider,akka.stream.Attributes))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider,  [Attributes](Attributes.html "class in akka.stream") defaultAttributes)` | Scala API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped. |
	| `[Materializer](Materializer.html "class in akka.stream")` | `[createMaterializer](#createMaterializer(akka.actor.ClassicActorContextProvider))​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider)` | Java API: Create a materializer whose lifecycle will be tied to the one of the passed actor context. |
	| `[Materializer](Materializer.html "class in akka.stream")` | `[createMaterializer](#createMaterializer(akka.actor.ClassicActorContextProvider,akka.stream.Attributes))​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider,  [Attributes](Attributes.html "class in akka.stream") defaultAttributes)` | Java API: Create a materializer whose lifecycle will be tied to the one of the passed actor context. |
	| `[Materializer](Materializer.html "class in akka.stream")` | `[createMaterializer](#createMaterializer(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Java API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped. |
	| `[Materializer](Materializer.html "class in akka.stream")` | `[createMaterializer](#createMaterializer(akka.actor.ClassicActorSystemProvider,akka.stream.Attributes))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider,  [Attributes](Attributes.html "class in akka.stream") defaultAttributes)` | Java API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped. |
	| `[Materializer](Materializer.html "class in akka.stream")` | `[matFromSystem](#matFromSystem(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") provider)` | Implicitly provides the system wide materializer from a classic or typed `ActorSystem` |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Materializer$](Materializer$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Materializer$
		
		
		
		```
		public Materializer$()
		```

	- ### Method Detail
	
	
	
		- #### matFromSystem
		
		
		
		```
		public [Materializer](Materializer.html "class in akka.stream") matFromSystem​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") provider)
		```
		
		Implicitly provides the system wide materializer from a classic or typed `ActorSystem`
		- #### apply
		
		
		
		```
		public [Materializer](Materializer.html "class in akka.stream") apply​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider)
		```
		
		Scala API: Create a materializer whose lifecycle will be tied to the one of the passed actor context.
		 When the actor stops the materializer will stop and all streams created with it will be failed with an `AbruptTerminationExeption`
		
		 You can pass either a classic actor context or a typed actor context.
		- #### createMaterializer
		
		
		
		```
		public [Materializer](Materializer.html "class in akka.stream") createMaterializer​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider)
		```
		
		Java API: Create a materializer whose lifecycle will be tied to the one of the passed actor context.
		 When the actor stops the materializer will stop and all streams created with it will be failed with an `AbruptTerminationExeption`
		
		 You can pass either a classic actor context or a typed actor context.
		- #### apply
		
		
		
		```
		public [Materializer](Materializer.html "class in akka.stream") apply​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider,
		                          [Attributes](Attributes.html "class in akka.stream") defaultAttributes)
		```
		
		Scala API: Create a materializer whose lifecycle will be tied to the one of the passed actor context.
		 When the actor stops the materializer will stop and all streams created with it will be failed with an `AbruptTerminationExeption`
		
		 You can pass either a classic actor context or a typed actor context.
		- #### createMaterializer
		
		
		
		```
		public [Materializer](Materializer.html "class in akka.stream") createMaterializer​([ClassicActorContextProvider](../actor/ClassicActorContextProvider.html "interface in akka.actor") contextProvider,
		                                       [Attributes](Attributes.html "class in akka.stream") defaultAttributes)
		```
		
		Java API: Create a materializer whose lifecycle will be tied to the one of the passed actor context.
		 When the actor stops the materializer will stop and all streams created with it will be failed with an `AbruptTerminationExeption`
		
		 You can pass either a classic actor context or a typed actor context.
		- #### apply
		
		
		
		```
		public [Materializer](Materializer.html "class in akka.stream") apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Scala API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped.
		 
		 \*Note\* prefer using the default [`SystemMaterializer`](SystemMaterializer.html "class in akka.stream") that is implicitly available if you have an implicit
		 `ActorSystem` in scope. Only create new system level materializers if you have specific
		 needs or want to test abrupt termination of a custom graph stage. If you want to tie the lifecycle
		 of the materializer to an actor, use the factory that takes an `ActorContext` instead.
		- #### createMaterializer
		
		
		
		```
		public [Materializer](Materializer.html "class in akka.stream") createMaterializer​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Java API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped.
		 
		 \*Note\* prefer using the default [`SystemMaterializer`](SystemMaterializer.html "class in akka.stream") by passing the `ActorSystem` to the various `run`
		 methods on the streams. Only create new system level materializers if you have specific
		 needs or want to test abrupt termination of a custom graph stage. If you want to tie the
		 lifecycle of the materializer to an actor, use the factory that takes an `ActorContext` instead.
		- #### apply
		
		
		
		```
		public [Materializer](Materializer.html "class in akka.stream") apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider,
		                          [Attributes](Attributes.html "class in akka.stream") defaultAttributes)
		```
		
		Scala API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped.
		 
		 It is generally advised to limit the number of system level materializers created.
		- #### createMaterializer
		
		
		
		```
		public [Materializer](Materializer.html "class in akka.stream") createMaterializer​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider,
		                                       [Attributes](Attributes.html "class in akka.stream") defaultAttributes)
		```
		
		Java API: Create a new materializer that will stay alive as long as the system does or until it is explicitly stopped.
		 
		 It is generally advised to limit the number of system level materializers created.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SystemMaterializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer$.html)*