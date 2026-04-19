---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/FutureRef.html
title: FutureRef
---

# FutureRef

## Content

Package [akka.pattern](package-summary.html)
## Interface FutureRef\<T\>

- ---

```
public interface FutureRef<T>
```

A combination of a Future and an ActorRef associated with it, which points
 to an actor performing a task which will eventually resolve the Future.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[T](FutureRef.html "type parameter in FutureRef")>` | `[future](#future())()` | Future associated with this FutureRef. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ref](#ref())()` | ActorRef associated with this FutureRef. |

- - ### Method Detail
	
	
	
		- #### ref
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") ref()
		```
		
		ActorRef associated with this FutureRef.
		- #### future
		
		
		
		```
		scala.concurrent.Future<[T](FutureRef.html "type parameter in FutureRef")> future()
		```
		
		Future associated with this FutureRef.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/FutureRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/FutureRef.html](https://doc.akka.io/japi/akka/current/akka/pattern/FutureRef.html)*