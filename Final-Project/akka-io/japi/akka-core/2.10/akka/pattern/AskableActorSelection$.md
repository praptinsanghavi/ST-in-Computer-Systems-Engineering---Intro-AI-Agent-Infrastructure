---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:58:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskableActorSelection$.html
title: AskableActorSelection$
---

# AskableActorSelection$

## Content

Package [akka.pattern](package-summary.html)
## Class AskableActorSelection$

- java.lang.Object
- - akka.pattern.AskableActorSelection$

- ---

```
public class AskableActorSelection$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AskableActorSelection$](AskableActorSelection$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AskableActorSelection$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[$qmark$default$3$extension](#$qmark$default$3$extension(akka.pattern.AskableActorSelection,java.lang.Object))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[$qmark$extension](#$qmark$extension(akka.pattern.AskableActorSelection,java.lang.Object,akka.util.Timeout))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[$qmark$extension](#$qmark$extension(akka.pattern.AskableActorSelection,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ask$default$3$extension](#ask$default$3$extension(akka.pattern.AskableActorSelection,java.lang.Object))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask$extension](#ask$extension(akka.pattern.AskableActorSelection,java.lang.Object,akka.util.Timeout))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask$extension](#ask$extension(akka.pattern.AskableActorSelection,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `boolean` | `[equals$extension](#equals$extension(akka.pattern.AskableActorSelection,java.lang.Object))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode$extension](#hashCode$extension(akka.pattern.AskableActorSelection))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[internalAsk$extension](#internalAsk$extension(akka.pattern.AskableActorSelection,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AskableActorSelection$](AskableActorSelection$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AskableActorSelection$
		
		
		
		```
		public AskableActorSelection$()
		```

	- ### Method Detail
	
	
	
		- #### ask$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> ask$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                                     java.lang.Object message,
		                                                                     [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		- #### ask$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> ask$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                                     java.lang.Object message,
		                                                                     [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                     [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### ask$default$3$extension
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") ask$default$3$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                              java.lang.Object message)
		```
		- #### $qmark$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> $qmark$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                                        java.lang.Object message,
		                                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		- #### $qmark$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> $qmark$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                                        java.lang.Object message,
		                                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                        [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### internalAsk$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> internalAsk$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                                             java.lang.Object message,
		                                                                             [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                             [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### $qmark$default$3$extension
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") $qmark$default$3$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                 java.lang.Object message)
		```
		- #### hashCode$extension
		
		
		
		```
		public final int hashCode$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this)
		```
		- #### equals$extension
		
		
		
		```
		public final boolean equals$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                      java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskableActorSelection$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskableActorSelection$.html](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskableActorSelection$.html)*