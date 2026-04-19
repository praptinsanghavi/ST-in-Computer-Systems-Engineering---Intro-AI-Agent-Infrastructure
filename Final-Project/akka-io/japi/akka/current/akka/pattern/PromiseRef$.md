---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/PromiseRef$.html
title: PromiseRef$
---

# PromiseRef$

## Content

Package [akka.pattern](package-summary.html)
## Class PromiseRef$

- java.lang.Object
- - akka.pattern.PromiseRef$

- ---

```
public class PromiseRef$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PromiseRef$](PromiseRef$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PromiseRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PromiseRef](PromiseRef.html "interface in akka.pattern")<java.lang.Object>` | `[apply](#apply(akka.actor.ActorSystem,akka.util.Timeout))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | Constructs a new PromiseRef which will be completed with the first message sent to it. |
	| `[PromiseRef](PromiseRef.html "interface in akka.pattern")<java.lang.Object>` | `[apply](#apply(akka.util.Timeout,akka.actor.ActorSystem))​([Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Constructs a new PromiseRef which will be completed with the first message sent to it. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PromiseRef$](PromiseRef$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PromiseRef$
		
		
		
		```
		public PromiseRef$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [PromiseRef](PromiseRef.html "interface in akka.pattern")<java.lang.Object> apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                          [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		Constructs a new PromiseRef which will be completed with the first message sent to it.
		 
		
		
		
		```
		
		 // enables transparent use of PromiseRef as ActorRef and Promise
		 import PromiseRef.Implicits._
		
		 val promiseRef = PromiseRef(system, 5.seconds)
		 promiseRef ! "message"
		 promiseRef.onComplete(println)  // prints "message"
		 
		```
		- #### apply
		
		
		
		```
		public [PromiseRef](PromiseRef.html "interface in akka.pattern")<java.lang.Object> apply​([Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                          [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Constructs a new PromiseRef which will be completed with the first message sent to it.
		 
		
		
		
		```
		
		 // enables transparent use of PromiseRef as ActorRef and Promise
		 import PromiseRef.Implicits._
		
		 // requires an implicit ActorSystem in scope
		 val promiseRef = PromiseRef(5.seconds)
		 promiseRef ! "message"
		 promiseRef.future.onComplete(println)  // prints "message"
		 
		```

## Code Examples

### Example 1: apply

```text
// enables transparent use of PromiseRef as ActorRef and Promise
 import PromiseRef.Implicits._

 val promiseRef = PromiseRef(system, 5.seconds)
 promiseRef ! "message"
 promiseRef.onComplete(println)  // prints "message"
```

### Example 2: apply

```text
// enables transparent use of PromiseRef as ActorRef and Promise
 import PromiseRef.Implicits._

 // requires an implicit ActorSystem in scope
 val promiseRef = PromiseRef(5.seconds)
 promiseRef ! "message"
 promiseRef.future.onComplete(println)  // prints "message"
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/pattern/PromiseRef$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/PromiseRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/PromiseRef$.html](https://doc.akka.io/japi/akka/current/akka/pattern/PromiseRef$.html)*