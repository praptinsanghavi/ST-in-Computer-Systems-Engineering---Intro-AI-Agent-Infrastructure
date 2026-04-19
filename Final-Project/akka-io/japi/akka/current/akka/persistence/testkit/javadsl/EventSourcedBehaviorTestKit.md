---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.RestartResult.html
title: EventSourcedBehaviorTestKit.RestartResult
---

# EventSourcedBehaviorTestKit.RestartResult

## Content

Package [akka.persistence.testkit.javadsl](package-summary.html)
## Class EventSourcedBehaviorTestKit.RestartResult\<State\>

- java.lang.Object
- - akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.RestartResult\<State\>

- Enclosing class:
[EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "class in akka.persistence.testkit.javadsl")\<[Command](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[Event](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit"),​[State](EventSourcedBehaviorTestKit.html "type parameter in EventSourcedBehaviorTestKit")\>

---

```
public static final class EventSourcedBehaviorTestKit.RestartResult<State>
extends java.lang.Object
```

The result of restarting the behavior.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartResult](#%3Cinit%3E(akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.RestartResult))​([EventSourcedBehaviorTestKit.RestartResult](../scaladsl/EventSourcedBehaviorTestKit.RestartResult.html "interface in akka.persistence.testkit.scaladsl")<[State](EventSourcedBehaviorTestKit.RestartResult.html "type parameter in EventSourcedBehaviorTestKit.RestartResult")> delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[State](EventSourcedBehaviorTestKit.RestartResult.html "type parameter in EventSourcedBehaviorTestKit.RestartResult")` | `[state](#state())()` | The state after recovery. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RestartResult
		
		
		
		```
		public RestartResult​([EventSourcedBehaviorTestKit.RestartResult](../scaladsl/EventSourcedBehaviorTestKit.RestartResult.html "interface in akka.persistence.testkit.scaladsl")<[State](EventSourcedBehaviorTestKit.RestartResult.html "type parameter in EventSourcedBehaviorTestKit.RestartResult")> delegate)
		```

	- ### Method Detail
	
	
	
		- #### state
		
		
		
		```
		public [State](EventSourcedBehaviorTestKit.RestartResult.html "type parameter in EventSourcedBehaviorTestKit.RestartResult") state()
		```
		
		The state after recovery.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.RestartResult.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.RestartResult.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.RestartResult.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.RestartResult.html)*