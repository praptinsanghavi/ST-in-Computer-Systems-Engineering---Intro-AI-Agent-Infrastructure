---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:25:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventHandler.html
title: EventHandler
---

# EventHandler

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Interface EventHandler\<State,​Event\>

- ---

```
public interface EventHandler<State,​Event>
```

FunctionalInterface for reacting on events having been persisted
 
 Used with [`EventHandlerBuilder`](EventHandlerBuilder.html "class in akka.persistence.typed.javadsl") to setup the behavior of a [`EventSourcedBehavior`](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[State](EventHandler.html "type parameter in EventHandler")` | `[apply](#apply(State,Event))​([State](EventHandler.html "type parameter in EventHandler") state,  [Event](EventHandler.html "type parameter in EventHandler") event)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[State](EventHandler.html "type parameter in EventHandler") apply​([State](EventHandler.html "type parameter in EventHandler") state,
		            [Event](EventHandler.html "type parameter in EventHandler") event)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventHandler.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventHandlerBuilder.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventHandler.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/EventHandler.html)*