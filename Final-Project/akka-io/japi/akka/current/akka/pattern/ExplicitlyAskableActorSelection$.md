---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorSelection$.html
title: ExplicitlyAskableActorSelection$
---

# ExplicitlyAskableActorSelection$

## Content

Package [akka.pattern](package-summary.html)
## Class ExplicitlyAskableActorSelection$

- java.lang.Object
- - akka.pattern.ExplicitlyAskableActorSelection$

- ---

```
public class ExplicitlyAskableActorSelection$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ExplicitlyAskableActorSelection$](ExplicitlyAskableActorSelection$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExplicitlyAskableActorSelection$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[$qmark$default$3$extension](#$qmark$default$3$extension(akka.pattern.ExplicitlyAskableActorSelection,scala.Function1))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[$qmark$extension](#$qmark$extension(akka.pattern.ExplicitlyAskableActorSelection,scala.Function1,akka.util.Timeout,akka.actor.ActorRef))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ask$default$3$extension](#ask$default$3$extension(akka.pattern.ExplicitlyAskableActorSelection,scala.Function1))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask$extension](#ask$extension(akka.pattern.ExplicitlyAskableActorSelection,scala.Function1,akka.util.Timeout,akka.actor.ActorRef))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `boolean` | `[equals$extension](#equals$extension(akka.pattern.ExplicitlyAskableActorSelection,java.lang.Object))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode$extension](#hashCode$extension(akka.pattern.ExplicitlyAskableActorSelection))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[internalAsk$extension](#internalAsk$extension(akka.pattern.ExplicitlyAskableActorSelection,scala.Function1,akka.util.Timeout,akka.actor.ActorRef))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ExplicitlyAskableActorSelection$](ExplicitlyAskableActorSelection$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ExplicitlyAskableActorSelection$
		
		
		
		```
		public ExplicitlyAskableActorSelection$()
		```

	- ### Method Detail
	
	
	
		- #### ask$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> ask$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                                                     scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,
		                                                                     [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                     [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### ask$default$3$extension
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") ask$default$3$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                              scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)
		```
		- #### $qmark$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> $qmark$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                                                        scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,
		                                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                        [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### internalAsk$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> internalAsk$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                                                             scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
		                                                                             [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                             [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### $qmark$default$3$extension
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") $qmark$default$3$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                                 scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)
		```
		- #### hashCode$extension
		
		
		
		```
		public final int hashCode$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this)
		```
		- #### equals$extension
		
		
		
		```
		public final boolean equals$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                      java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorSelection$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorSelection$.html](https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorSelection$.html)*