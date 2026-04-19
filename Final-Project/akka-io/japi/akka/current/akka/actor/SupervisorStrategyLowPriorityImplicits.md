---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategyLowPriorityImplicits.html
title: SupervisorStrategyLowPriorityImplicits
---

# SupervisorStrategyLowPriorityImplicits

## Content

Package [akka.actor](package-summary.html)
## Interface SupervisorStrategyLowPriorityImplicits

- All Known Implementing Classes:
`[SupervisorStrategy$](SupervisorStrategy$.html "class in akka.actor")`

---

```
public interface SupervisorStrategyLowPriorityImplicits
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[seqCauseDirective2Decider](#seqCauseDirective2Decider(scala.collection.Iterable))​(scala.collection.Iterable<scala.Tuple2<java.lang.Class<? extends java.lang.Throwable>,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>> trapExit)` | Implicit conversion from `Seq` of Cause\-Directive pairs to a `Decider`. |

- - ### Method Detail
	
	
	
		- #### seqCauseDirective2Decider
		
		
		
		```
		scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")> seqCauseDirective2Decider​(scala.collection.Iterable<scala.Tuple2<java.lang.Class<? extends java.lang.Throwable>,​[SupervisorStrategy.Directive](SupervisorStrategy.Directive.html "interface in akka.actor")>> trapExit)
		```
		
		Implicit conversion from `Seq` of Cause\-Directive pairs to a `Decider`. See makeDecider(causeDirective).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Directive.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategyLowPriorityImplicits.html](https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategyLowPriorityImplicits.html)*