---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorTags$.html
title: BehaviorTags$
---

# BehaviorTags$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class BehaviorTags$

- java.lang.Object
- - akka.actor.typed.internal.BehaviorTags$

- ---

```
public class BehaviorTags$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BehaviorTags$](BehaviorTags$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BehaviorTags$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[DeferredBehavior](#DeferredBehavior())()` |  |
	| `int` | `[EmptyBehavior](#EmptyBehavior())()` |  |
	| `int` | `[ExtensibleBehavior](#ExtensibleBehavior())()` |  |
	| `int` | `[FailedBehavior](#FailedBehavior())()` |  |
	| `int` | `[IgnoreBehavior](#IgnoreBehavior())()` |  |
	| `int` | `[SameBehavior](#SameBehavior())()` |  |
	| `int` | `[StoppedBehavior](#StoppedBehavior())()` |  |
	| `int` | `[UnhandledBehavior](#UnhandledBehavior())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BehaviorTags$](BehaviorTags$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BehaviorTags$
		
		
		
		```
		public BehaviorTags$()
		```

	- ### Method Detail
	
	
	
		- #### ExtensibleBehavior
		
		
		
		```
		public final int ExtensibleBehavior()
		```
		- #### EmptyBehavior
		
		
		
		```
		public final int EmptyBehavior()
		```
		- #### IgnoreBehavior
		
		
		
		```
		public final int IgnoreBehavior()
		```
		- #### UnhandledBehavior
		
		
		
		```
		public final int UnhandledBehavior()
		```
		- #### DeferredBehavior
		
		
		
		```
		public final int DeferredBehavior()
		```
		- #### SameBehavior
		
		
		
		```
		public final int SameBehavior()
		```
		- #### FailedBehavior
		
		
		
		```
		public final int FailedBehavior()
		```
		- #### StoppedBehavior
		
		
		
		```
		public final int StoppedBehavior()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorTags$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorTags$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorTags$.html)*