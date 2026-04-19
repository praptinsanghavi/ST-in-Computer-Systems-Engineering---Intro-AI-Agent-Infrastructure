---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorSelection.html
title: ExplicitlyAskableActorSelection
---

# ExplicitlyAskableActorSelection

## Content

Package [akka.pattern](package-summary.html)
## Class ExplicitlyAskableActorSelection

- java.lang.Object
- - scala.AnyVal
	- - akka.pattern.ExplicitlyAskableActorSelection

- ---

```
public final class ExplicitlyAskableActorSelection
extends scala.AnyVal
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExplicitlyAskableActorSelection](#%3Cinit%3E(akka.actor.ActorSelection))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSel)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<java.lang.Object>` | `[$qmark](#$qmark(scala.Function1,akka.util.Timeout,akka.actor.ActorRef))​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[$qmark$default$3](#$qmark$default$3(scala.Function1))​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)` |  |
	| `static [ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[$qmark$default$3$extension](#$qmark$default$3$extension(akka.pattern.ExplicitlyAskableActorSelection,scala.Function1))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[$qmark$extension](#$qmark$extension(akka.pattern.ExplicitlyAskableActorSelection,scala.Function1,akka.util.Timeout,akka.actor.ActorRef))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorSelection](../actor/ActorSelection.html "class in akka.actor")` | `[actorSel](#actorSel())()` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(scala.Function1,akka.util.Timeout,akka.actor.ActorRef))​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ask$default$3](#ask$default$3(scala.Function1))​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)` |  |
	| `static [ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ask$default$3$extension](#ask$default$3$extension(akka.pattern.ExplicitlyAskableActorSelection,scala.Function1))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[ask$extension](#ask$extension(akka.pattern.ExplicitlyAskableActorSelection,scala.Function1,akka.util.Timeout,akka.actor.ActorRef))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static boolean` | `[equals$extension](#equals$extension(akka.pattern.ExplicitlyAskableActorSelection,java.lang.Object))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[hashCode$extension](#hashCode$extension(akka.pattern.ExplicitlyAskableActorSelection))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[internalAsk$extension](#internalAsk$extension(akka.pattern.ExplicitlyAskableActorSelection,scala.Function1,akka.util.Timeout,akka.actor.ActorRef))​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ExplicitlyAskableActorSelection
		
		
		
		```
		public ExplicitlyAskableActorSelection​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSel)
		```

	- ### Method Detail
	
	
	
		- #### ask$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> ask$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                                                            scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,
		                                                                            [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                            [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### ask$default$3$extension
		
		
		
		```
		public static final [ActorRef](../actor/ActorRef.html "class in akka.actor") ask$default$3$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                                     scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)
		```
		- #### $qmark$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> $qmark$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                                                               scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,
		                                                                               [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                               [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### internalAsk$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> internalAsk$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                                                                    scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> messageFactory,
		                                                                                    [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                                    [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### $qmark$default$3$extension
		
		
		
		```
		public static final [ActorRef](../actor/ActorRef.html "class in akka.actor") $qmark$default$3$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                                        scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)
		```
		- #### hashCode$extension
		
		
		
		```
		public static final int hashCode$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this)
		```
		- #### equals$extension
		
		
		
		```
		public static final boolean equals$extension​([ExplicitlyAskableActorSelection](ExplicitlyAskableActorSelection.html "class in akka.pattern") $this,
		                                             java.lang.Object x$1)
		```
		- #### actorSel
		
		
		
		```
		public [ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSel()
		```
		- #### ask
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> ask​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,
		                                                     [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                     [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### ask$default$3
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") ask$default$3​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)
		```
		- #### $qmark
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> $qmark​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message,
		                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                        [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### $qmark$default$3
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") $qmark$default$3​(scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.Object> message)
		```
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorSelection.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorSelection.html](https://doc.akka.io/japi/akka/current/akka/pattern/ExplicitlyAskableActorSelection.html)*