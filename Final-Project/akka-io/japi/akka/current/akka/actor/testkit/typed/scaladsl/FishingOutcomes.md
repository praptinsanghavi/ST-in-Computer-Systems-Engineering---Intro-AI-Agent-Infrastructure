---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/FishingOutcomes.html
title: FishingOutcomes
---

# FishingOutcomes

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Class FishingOutcomes

- java.lang.Object
- - akka.actor.testkit.typed.scaladsl.FishingOutcomes

- ---

```
public class FishingOutcomes
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FishingOutcomes](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")` | `[complete](#complete())()` | Complete fishing and return all messages up until this |
	| `static [FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")` | `[continueAndIgnore](#continueAndIgnore())()` | Consume this message, but do not collect it into the result, and continue with the next message |
	| `static [FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed")` | `[fail](#fail(java.lang.String))​(java.lang.String message)` | Fail fishing with a custom error message |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FishingOutcomes
		
		
		
		```
		public FishingOutcomes()
		```

	- ### Method Detail
	
	
	
		- #### complete
		
		
		
		```
		public static [FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed") complete()
		```
		
		Complete fishing and return all messages up until this
		- #### continueAndIgnore
		
		
		
		```
		public static [FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed") continueAndIgnore()
		```
		
		Consume this message, but do not collect it into the result, and continue with the next message
		- #### fail
		
		
		
		```
		public static [FishingOutcome](../FishingOutcome.html "interface in akka.actor.testkit.typed") fail​(java.lang.String message)
		```
		
		Fail fishing with a custom error message

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/FishingOutcome.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/FishingOutcomes.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/FishingOutcomes.html)*