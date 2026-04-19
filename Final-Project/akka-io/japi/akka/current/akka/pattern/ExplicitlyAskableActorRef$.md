---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorRef$.html
title: ExplicitlyAskableActorRef$
---

# ExplicitlyAskableActorRef$

## Content

Package [akka.pattern](package-summary.html)
## Class ExplicitlyAskableActorRef$

- java.lang.Object
- - akka.pattern.ExplicitlyAskableActorRef$

- ---

```
public class ExplicitlyAskableActorRef$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ExplicitlyAskableActorRef$](ExplicitlyAskableActorRef$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExplicitlyAskableActorRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[$qmark$default$3$extension](#$qmark$default$3$extension(akka.pattern.ExplicitlyAskableActorRef,scala.Function1))​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[$qmark$extension](#$qmark$extension(akka.pattern.ExplicitlyAskableActorRef,scala.Function1,akka.util.Timeout,akka.actor.ActorRef))​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ask$default$3$extension](#ask$default$3$extension(akka.pattern.ExplicitlyAskableActorRef,scala.Function1))​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask$extension](#ask$extension(akka.pattern.ExplicitlyAskableActorRef,scala.Function1,akka.util.Timeout,akka.actor.ActorRef))​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `boolean` | `[equals$extension](#equals$extension(akka.pattern.ExplicitlyAskableActorRef,java.lang.Object))​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode$extension](#hashCode$extension(akka.pattern.ExplicitlyAskableActorRef))​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[internalAsk$extension](#internalAsk$extension(akka.pattern.ExplicitlyAskableActorRef,scala.Function1,akka.util.Timeout,akka.actor.ActorRef))​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ExplicitlyAskableActorRef$](ExplicitlyAskableActorRef$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ExplicitlyAskableActorRef$
		
		
		
		```
		public ExplicitlyAskableActorRef$()
		```

	- ### Method Detail
	
	
	
		- #### ask$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> ask$extension​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,
		                                                                     scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,
		                                                                     [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                     [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### ask$default$3$extension
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") ask$default$3$extension​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,
		                                              scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)
		```
		- #### $qmark$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> $qmark$extension​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,
		                                                                        scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,
		                                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                        [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### internalAsk$extension
		
		
		
		```
		public final scala.concurrent.Future<java.lang.Object> internalAsk$extension​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,
		                                                                             scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
		                                                                             [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                             [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### $qmark$default$3$extension
		
		
		
		```
		public final [ActorRef](../actor/ActorRef.html "class in akka.actor") $qmark$default$3$extension​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,
		                                                 scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)
		```
		- #### hashCode$extension
		
		
		
		```
		public final int hashCode$extension​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this)
		```
		- #### equals$extension
		
		
		
		```
		public final boolean equals$extension​([ExplicitlyAskableActorRef](ExplicitlyAskableActorRef.html "class in akka.pattern") $this,
		                                      java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorRef$.html
- https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorRef$.html](https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorRef$.html)*