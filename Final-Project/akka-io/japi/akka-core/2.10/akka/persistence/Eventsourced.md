---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.State.html
title: Eventsourced.State
---

# Eventsourced.State

## Content

Package [akka.persistence](package-summary.html)
## Interface Eventsourced.State

- Enclosing interface:
[Eventsourced](Eventsourced.html "interface in akka.persistence")

---

```
public static interface Eventsourced.State
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[recoveryRunning](#recoveryRunning())()` |  |
	| `void` | `[stateReceive](#stateReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object message)` |  |

- - ### Method Detail
	
	
	
		- #### recoveryRunning
		
		
		
		```
		boolean recoveryRunning()
		```
		- #### stateReceive
		
		
		
		```
		void stateReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                  java.lang.Object message)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.State.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.State.html)*