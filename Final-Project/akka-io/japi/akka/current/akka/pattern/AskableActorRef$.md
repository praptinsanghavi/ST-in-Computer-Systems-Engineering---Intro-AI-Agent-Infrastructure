---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorRef$.html
title: AskableActorRef$
---

# AskableActorRef$

## Content

Package [akka.pattern](package-summary.html)
## Class AskableActorRef$

- java.lang.Object
- - akka.pattern.AskableActorRef$

- ---

```
public class AskableActorRef$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AskableActorRef$](AskableActorRef$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AskableActorRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[$qmark$default$3$extension](#$qmark$default$3$extension(akka.pattern.AskableActorRef,java.lang.Object))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message)` | INTERNAL API: for binary compatibility |
	| `scala.concurrent.Future<java.lang.Object>` | `[$qmark$extension](#$qmark$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | INTERNAL API: for binary compatibility |
	| `scala.concurrent.Future<java.lang.Object>` | `[$qmark$extension](#$qmark$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ask$default$3$extension](#ask$default$3$extension(akka.pattern.AskableActorRef,java.lang.Object))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask$extension](#ask$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | INTERNAL API: for binary compatibility |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask$extension](#ask$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[askWithStatus$default$3$extension](#askWithStatus$default$3$extension(akka.pattern.AskableActorRef,java.lang.Object))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[askWithStatus$extension](#askWithStatus$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `boolean` | `[equals$extension](#equals$extension(akka.pattern.AskableActorRef,java.lang.Object))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode$extension](#hashCode$extension(akka.pattern.AskableActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[internalAsk$extension](#internalAsk$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` | INTERNAL API: for binary compatibility |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[internalAskWithStatus$default$3$extension](#internalAskWithStatus$default$3$extension(akka.pattern.AskableActorRef,java.lang.Object))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[internalAskWithStatus$extension](#internalAskWithStatus$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` | INTERNAL API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AskableActorRef$](AskableActorRef$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AskableActorRef$
		
		
		
		```
		public AskableActorRef$()
		```

	- ### Method Detail
	
	
	
		- #### ask$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> ask$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                     java.lang.Object message,
		                                                                     [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		INTERNAL API: for binary compatibility
		- #### ask$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> ask$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                     java.lang.Object message,
		                                                                     [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                     [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### ask$default$3$extension
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") ask$default$3$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                              java.lang.Object message)
		```
		- #### askWithStatus$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> askWithStatus$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                               java.lang.Object message,
		                                                                               [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                               [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### askWithStatus$default$3$extension
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") askWithStatus$default$3$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                        java.lang.Object message)
		```
		- #### internalAskWithStatus$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> internalAskWithStatus$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                                       java.lang.Object message,
		                                                                                       [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                                       [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		INTERNAL API
		- #### $qmark$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> $qmark$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                        java.lang.Object message,
		                                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		INTERNAL API: for binary compatibility
		- #### $qmark$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> $qmark$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                        java.lang.Object message,
		                                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                        [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### internalAsk$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> internalAsk$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                             java.lang.Object message,
		                                                                             [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                             [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		INTERNAL API: for binary compatibility
		- #### internalAskWithStatus$default$3$extension
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") internalAskWithStatus$default$3$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                java.lang.Object message)
		```
		- #### $qmark$default$3$extension
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") $qmark$default$3$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                 java.lang.Object message)
		```
		
		INTERNAL API: for binary compatibility
		- #### hashCode$extension
		
		
		
		```
		public final int hashCode$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this)
		```
		- #### equals$extension
		
		
		
		```
		public final boolean equals$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                      java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorRef$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorRef$.html](https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorRef$.html)*