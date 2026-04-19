---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html
title: FishingOutcomes$
---

# FishingOutcomes$

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Class FishingOutcomes$

- java.lang.Object
- - akka.actor.testkit.typed.scaladsl.FishingOutcomes$

- ---

```
public class FishingOutcomes$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FishingOutcomes$](FishingOutcomes$.html "class in akka.actor.testkit.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FishingOutcomes$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")` | `[complete](#complete())()` | Complete fishing and return all messages up until this |
	| `[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")` | `[continueAndIgnore](#continueAndIgnore())()` | Consume this message, but do not collect it into the result, and continue with the next message |
	| `[FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")` | `[fail](#fail(java.lang.String))​(java.lang.String message)` | Fail fishing with a custom error message |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FishingOutcomes$](FishingOutcomes$.html "class in akka.actor.testkit.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FishingOutcomes$
		
		
		
		```
		public FishingOutcomes$()
		```

	- ### Method Detail
	
	
	
		- #### complete
		
		
		
		```
		public [FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed") complete()
		```
		
		Complete fishing and return all messages up until this
		- #### continueAndIgnore
		
		
		
		```
		public [FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed") continueAndIgnore()
		```
		
		Consume this message, but do not collect it into the result, and continue with the next message
		- #### fail
		
		
		
		```
		public [FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed") fail​(java.lang.String message)
		```
		
		Fail fishing with a custom error message

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/FishingOutcome.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html)*