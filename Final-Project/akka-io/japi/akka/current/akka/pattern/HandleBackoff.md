---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/HandleBackoff.html
title: HandleBackoff
---

# HandleBackoff

## Content

Package [akka.pattern](package-summary.html)
## Interface HandleBackoff

- ---

```
public interface HandleBackoff
```

INTERNAL API
 
 Implements basic backoff handling for `internal.BackoffOnRestartSupervisor` and `internal.BackoffOnStopSupervisor`.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[child](#child())()` |  |
	| `void` | `[child_$eq](#child_$eq(scala.Option))​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `java.lang.String` | `[childName](#childName())()` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[childProps](#childProps())()` |  |
	| `boolean` | `[finalStopMessageReceived](#finalStopMessageReceived())()` |  |
	| `void` | `[finalStopMessageReceived_$eq](#finalStopMessageReceived_$eq(boolean))​(boolean x$1)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[handleBackoff](#handleBackoff())()` |  |
	| `void` | `[handleMessageToChild](#handleMessageToChild(java.lang.Object))​(java.lang.Object m)` |  |
	| `void` | `[preStart](#preStart())()` |  |
	| `[BackoffReset](BackoffReset.html "interface in akka.pattern")` | `[reset](#reset())()` |  |
	| `int` | `[restartCount](#restartCount())()` |  |
	| `void` | `[restartCount_$eq](#restartCount_$eq(int))​(int x$1)` |  |
	| `void` | `[startChild](#startChild())()` |  |

- - ### Method Detail
	
	
	
		- #### child
		
		
		
		```
		scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> child()
		```
		- #### childName
		
		
		
		```
		java.lang.String childName()
		```
		- #### childProps
		
		
		
		```
		[Props](../actor/Props.html "class in akka.actor") childProps()
		```
		- #### child\_$eq
		
		
		
		```
		void child_$eq​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		- #### finalStopMessageReceived
		
		
		
		```
		boolean finalStopMessageReceived()
		```
		- #### finalStopMessageReceived\_$eq
		
		
		
		```
		void finalStopMessageReceived_$eq​(boolean x$1)
		```
		- #### handleBackoff
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> handleBackoff()
		```
		- #### handleMessageToChild
		
		
		
		```
		void handleMessageToChild​(java.lang.Object m)
		```
		- #### preStart
		
		
		
		```
		void preStart()
		```
		- #### reset
		
		
		
		```
		[BackoffReset](BackoffReset.html "interface in akka.pattern") reset()
		```
		- #### restartCount
		
		
		
		```
		int restartCount()
		```
		- #### restartCount\_$eq
		
		
		
		```
		void restartCount_$eq​(int x$1)
		```
		- #### startChild
		
		
		
		```
		void startChild()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffReset.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/HandleBackoff.html](https://doc.akka.io/japi/akka/current/akka/pattern/HandleBackoff.html)*