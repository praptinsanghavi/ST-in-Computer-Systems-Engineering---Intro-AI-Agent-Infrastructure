---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/PromiseRef.html
title: PromiseRef
---

# PromiseRef

## Content

Package [akka.pattern](package-summary.html)
## Interface PromiseRef\<T\>

- ---

```
public interface PromiseRef<T>
```

A combination of a Promise and an ActorRef associated with it, which points
 to an actor performing a task which will eventually resolve the Promise.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[T](PromiseRef.html "type parameter in PromiseRef")>` | `[future](#future())()` | Future containing the value of the Promise associated with this PromiseRef. |
	| `scala.concurrent.Promise<[T](PromiseRef.html "type parameter in PromiseRef")>` | `[promise](#promise())()` | Promise associated with this PromiseRef. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ref](#ref())()` | ActorRef associated with this PromiseRef. |
	| `[FutureRef](FutureRef.html "interface in akka.pattern")<[T](PromiseRef.html "type parameter in PromiseRef")>` | `[toFutureRef](#toFutureRef())()` | Converts this PromiseRef to FutureRef, effectively narrowing it's API. |

- - ### Method Detail
	
	
	
		- #### ref
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") ref()
		```
		
		ActorRef associated with this PromiseRef.
		- #### promise
		
		
		
		```
		scala.concurrent.Promise<[T](PromiseRef.html "type parameter in PromiseRef")> promise()
		```
		
		Promise associated with this PromiseRef.
		- #### future
		
		
		
		```
		scala.concurrent.Future<[T](PromiseRef.html "type parameter in PromiseRef")> future()
		```
		
		Future containing the value of the Promise associated with this PromiseRef.
		- #### toFutureRef
		
		
		
		```
		[FutureRef](FutureRef.html "interface in akka.pattern")<[T](PromiseRef.html "type parameter in PromiseRef")> toFutureRef()
		```
		
		Converts this PromiseRef to FutureRef, effectively narrowing it's API.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/FutureRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/PromiseRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/PromiseRef.html](https://doc.akka.io/japi/akka/current/akka/pattern/PromiseRef.html)*