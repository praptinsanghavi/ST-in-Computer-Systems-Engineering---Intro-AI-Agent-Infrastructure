---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/IndirectActorProducer.html
title: IndirectActorProducer
---

# IndirectActorProducer

## Content

Package [akka.actor](package-summary.html)
## Interface IndirectActorProducer

- ---

```
public interface IndirectActorProducer
```

This interface defines a class of actor creation strategies deviating from
 the usual default of just reflectively instantiating the [`Actor`](Actor.html "interface in akka.actor")
 subclass. It can be used to allow a dependency injection framework to
 determine the actual actor class and how it shall be instantiated.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Class<? extends [Actor](Actor.html "interface in akka.actor")>` | `[actorClass](#actorClass())()` | This method is used by [`Props`](Props.html "class in akka.actor") to determine the type of actor which will  be created. |
	| `[Actor](Actor.html "interface in akka.actor")` | `[produce](#produce())()` | This factory method must produce a fresh actor instance upon each  invocation. |

- - ### Method Detail
	
	
	
		- #### produce
		
		
		
		```
		[Actor](Actor.html "interface in akka.actor") produce()
		```
		
		This factory method must produce a fresh actor instance upon each
		 invocation. **It is not permitted to return the same instance more than
		 once.**
		- #### actorClass
		
		
		
		```
		java.lang.Class<? extends [Actor](Actor.html "interface in akka.actor")> actorClass()
		```
		
		This method is used by [`Props`](Props.html "class in akka.actor") to determine the type of actor which will
		 be created. This means that an instance of this `IndirectActorProducer`
		 will be created in order to call this method during any call to
		 [`Props.actorClass()`](Props.html#actorClass()); it should be noted that such calls may
		 performed during actor set\-up before the actual actor\&rsquo;s instantiation, and
		 that the instance created for calling `actorClass` is not necessarily reused
		 later to produce the actor.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/IndirectActorProducer.html](https://doc.akka.io/japi/akka/current/akka/actor/IndirectActorProducer.html)*