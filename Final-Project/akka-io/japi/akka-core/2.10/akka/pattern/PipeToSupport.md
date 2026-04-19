---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:48:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/PipeToSupport.PipeableFuture.html
title: PipeToSupport.PipeableFuture
---

# PipeToSupport.PipeableFuture

## Content

Package [akka.pattern](package-summary.html)
## Class PipeToSupport.PipeableFuture\<T\>

- java.lang.Object
- - akka.pattern.PipeToSupport.PipeableFuture\<T\>

- Enclosing interface:
[PipeToSupport](PipeToSupport.html "interface in akka.pattern")

---

```
public static final class PipeToSupport.PipeableFuture<T>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PipeableFuture](#%3Cinit%3E(scala.concurrent.Future,scala.concurrent.ExecutionContext))​(scala.concurrent.Future<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")> future,  scala.concurrent.ExecutionContext executionContext)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")>` | `[future](#future())()` |  |
	| `scala.concurrent.Future<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")>` | `[pipeTo](#pipeTo(akka.actor.ActorRef,akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") recipient,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[pipeTo$default$2](#pipeTo$default$2(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") recipient)` |  |
	| `scala.concurrent.Future<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")>` | `[pipeToSelection](#pipeToSelection(akka.actor.ActorSelection,akka.actor.ActorRef))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") recipient,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[pipeToSelection$default$2](#pipeToSelection$default$2(akka.actor.ActorSelection))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") recipient)` |  |
	| `[PipeToSupport.PipeableFuture](PipeToSupport.PipeableFuture.html "class in akka.pattern")<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")>` | `[to](#to(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") recipient)` |  |
	| `[PipeToSupport.PipeableFuture](PipeToSupport.PipeableFuture.html "class in akka.pattern")<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")>` | `[to](#to(akka.actor.ActorRef,akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") recipient,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[PipeToSupport.PipeableFuture](PipeToSupport.PipeableFuture.html "class in akka.pattern")<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")>` | `[to](#to(akka.actor.ActorSelection))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") recipient)` |  |
	| `[PipeToSupport.PipeableFuture](PipeToSupport.PipeableFuture.html "class in akka.pattern")<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")>` | `[to](#to(akka.actor.ActorSelection,akka.actor.ActorRef))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") recipient,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PipeableFuture
		
		
		
		```
		public PipeableFuture​(scala.concurrent.Future<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")> future,
		                      scala.concurrent.ExecutionContext executionContext)
		```

	- ### Method Detail
	
	
	
		- #### future
		
		
		
		```
		public scala.concurrent.Future<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")> future()
		```
		- #### pipeTo
		
		
		
		```
		public scala.concurrent.Future<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")> pipeTo​([ActorRef](../actor/ActorRef.html "class in akka.actor") recipient,
		                                         [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### pipeTo$default$2
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") pipeTo$default$2​([ActorRef](../actor/ActorRef.html "class in akka.actor") recipient)
		```
		- #### pipeToSelection
		
		
		
		```
		public scala.concurrent.Future<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")> pipeToSelection​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") recipient,
		                                                  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### pipeToSelection$default$2
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") pipeToSelection$default$2​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") recipient)
		```
		- #### to
		
		
		
		```
		public [PipeToSupport.PipeableFuture](PipeToSupport.PipeableFuture.html "class in akka.pattern")<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")> to​([ActorRef](../actor/ActorRef.html "class in akka.actor") recipient)
		```
		- #### to
		
		
		
		```
		public [PipeToSupport.PipeableFuture](PipeToSupport.PipeableFuture.html "class in akka.pattern")<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")> to​([ActorRef](../actor/ActorRef.html "class in akka.actor") recipient,
		                                          [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### to
		
		
		
		```
		public [PipeToSupport.PipeableFuture](PipeToSupport.PipeableFuture.html "class in akka.pattern")<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")> to​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") recipient)
		```
		- #### to
		
		
		
		```
		public [PipeToSupport.PipeableFuture](PipeToSupport.PipeableFuture.html "class in akka.pattern")<[T](PipeToSupport.PipeableFuture.html "type parameter in PipeToSupport.PipeableFuture")> to​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") recipient,
		                                          [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/PipeToSupport.PipeableFuture.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/PipeToSupport.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/PipeToSupport.PipeableFuture.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/PipeToSupport.PipeableFuture.html)*