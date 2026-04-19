---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/FutureRef$.html
title: FutureRef$
---

# FutureRef$

## Content

Package [akka.pattern](package-summary.html)
## Class FutureRef$

- java.lang.Object
- - akka.pattern.FutureRef$

- ---

```
public class FutureRef$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FutureRef$](FutureRef$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FutureRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[FutureRef](FutureRef.html "interface in akka.pattern")<java.lang.Object>` | `[apply](#apply(akka.actor.ActorSystem,akka.util.Timeout))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | Constructs a new FutureRef which will be completed with the first message sent to it. |
	| `[FutureRef](FutureRef.html "interface in akka.pattern")<java.lang.Object>` | `[apply](#apply(akka.util.Timeout,akka.actor.ActorSystem))​([Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Constructs a new PromiseRef which will be completed with the first message sent to it. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FutureRef$](FutureRef$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FutureRef$
		
		
		
		```
		public FutureRef$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [FutureRef](FutureRef.html "interface in akka.pattern")<java.lang.Object> apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                         [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		Constructs a new FutureRef which will be completed with the first message sent to it.
		 
		
		
		
		```
		
		 // enables transparent use of FutureRef as ActorRef and Future
		 import FutureRef.Implicits._
		
		 val futureRef = FutureRef(system, 5.seconds)
		 futureRef ! "message"
		 futureRef.onComplete(println)  // prints "message"
		 
		```
		- #### apply
		
		
		
		```
		public [FutureRef](FutureRef.html "interface in akka.pattern")<java.lang.Object> apply​([Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                         [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Constructs a new PromiseRef which will be completed with the first message sent to it.
		 
		
		
		
		```
		
		 // enables transparent use of FutureRef as ActorRef and Promise
		 import FutureRef.Implicits._
		
		 // requires an implicit ActorSystem in scope
		 val futureRef = FutureRef(5.seconds)
		 futureRef ! "message"
		 futureRef.onComplete(println)  // prints "message"
		 
		```

## Code Examples

### Example 1: apply

```text
// enables transparent use of FutureRef as ActorRef and Future
 import FutureRef.Implicits._

 val futureRef = FutureRef(system, 5.seconds)
 futureRef ! "message"
 futureRef.onComplete(println)  // prints "message"
```

### Example 2: apply

```text
// enables transparent use of FutureRef as ActorRef and Promise
 import FutureRef.Implicits._

 // requires an implicit ActorSystem in scope
 val futureRef = FutureRef(5.seconds)
 futureRef ! "message"
 futureRef.onComplete(println)  // prints "message"
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/FutureRef$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/FutureRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/FutureRef$.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/FutureRef$.html)*