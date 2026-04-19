---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
title: UnpersistentBehavior
---

# UnpersistentBehavior

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Interface UnpersistentBehavior\<Command,​State\>

- All Known Implementing Classes:
`[UnpersistentBehavior.DurableState](UnpersistentBehavior.DurableState.html "class in akka.persistence.testkit.scaladsl")`, `[UnpersistentBehavior.EventSourced](UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl")`

---

```
public interface UnpersistentBehavior<Command,​State>
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[UnpersistentBehavior.DurableState](UnpersistentBehavior.DurableState.html "class in akka.persistence.testkit.scaladsl")<[Command](UnpersistentBehavior.DurableState.html "type parameter in UnpersistentBehavior.DurableState"),​[State](UnpersistentBehavior.DurableState.html "type parameter in UnpersistentBehavior.DurableState")>` |  |
	| `static class` | `[UnpersistentBehavior.DurableState$](UnpersistentBehavior.DurableState$.html "class in akka.persistence.testkit.scaladsl")` |  |
	| `static class` | `[UnpersistentBehavior.EventSourced](UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl")<[Command](UnpersistentBehavior.EventSourced.html "type parameter in UnpersistentBehavior.EventSourced"),​[Event](UnpersistentBehavior.EventSourced.html "type parameter in UnpersistentBehavior.EventSourced"),​[State](UnpersistentBehavior.EventSourced.html "type parameter in UnpersistentBehavior.EventSourced")>` |  |
	| `static class` | `[UnpersistentBehavior.EventSourced$](UnpersistentBehavior.EventSourced$.html "class in akka.persistence.testkit.scaladsl")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")>` | `[behavior](#behavior())()` |  |
	| `[BehaviorTestKit](../../../actor/testkit/typed/scaladsl/BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")<[Command](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")>` | `[behaviorTestKit](#behaviorTestKit())()` |  |
	| `[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<[State](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")>` | `[stateProbe](#stateProbe())()` |  |

- - ### Method Detail
	
	
	
		- #### behavior
		
		
		
		```
		[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Command](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")> behavior()
		```
		- #### behaviorTestKit
		
		
		
		```
		[BehaviorTestKit](../../../actor/testkit/typed/scaladsl/BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")<[Command](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")> behaviorTestKit()
		```
		- #### stateProbe
		
		
		
		```
		[PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")<[State](UnpersistentBehavior.html "type parameter in UnpersistentBehavior")> stateProbe()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.DurableState$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.DurableState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html)*