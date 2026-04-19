---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorRef.html
title: AskableActorRef
---

# AskableActorRef

## Content

Package [akka.pattern](package-summary.html)
## Class AskableActorRef

- java.lang.Object
- - scala.AnyVal
	- - akka.pattern.AskableActorRef

- ---

```
public final class AskableActorRef
extends scala.AnyVal
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AskableActorRef](#%3Cinit%3E(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected scala.concurrent.Future<java.lang.Object>` | `[$qmark](#$qmark(java.lang.Object,akka.util.Timeout))​(java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[$qmark](#$qmark(java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​(java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[$qmark$default$3](#$qmark$default$3(java.lang.Object))​(java.lang.Object message)` |  |
	| `static [ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[$qmark$default$3$extension](#$qmark$default$3$extension(akka.pattern.AskableActorRef,java.lang.Object))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message)` | INTERNAL API: for binary compatibility |
	| `static scala.concurrent.Future<java.lang.Object>` | `[$qmark$extension](#$qmark$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | INTERNAL API: for binary compatibility |
	| `static scala.concurrent.Future<java.lang.Object>` | `[$qmark$extension](#$qmark$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[actorRef](#actorRef())()` |  |
	| `protected scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(java.lang.Object,akka.util.Timeout))​(java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​(java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ask$default$3](#ask$default$3(java.lang.Object))​(java.lang.Object message)` |  |
	| `static [ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ask$default$3$extension](#ask$default$3$extension(akka.pattern.AskableActorRef,java.lang.Object))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[ask$extension](#ask$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | INTERNAL API: for binary compatibility |
	| `static scala.concurrent.Future<java.lang.Object>` | `[ask$extension](#ask$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[askWithStatus](#askWithStatus(java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​(java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[askWithStatus$default$3](#askWithStatus$default$3(java.lang.Object))​(java.lang.Object message)` |  |
	| `static [ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[askWithStatus$default$3$extension](#askWithStatus$default$3$extension(akka.pattern.AskableActorRef,java.lang.Object))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[askWithStatus$extension](#askWithStatus$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static boolean` | `[equals$extension](#equals$extension(akka.pattern.AskableActorRef,java.lang.Object))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[hashCode$extension](#hashCode$extension(akka.pattern.AskableActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[internalAsk$extension](#internalAsk$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` | INTERNAL API: for binary compatibility |
	| `static [ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[internalAskWithStatus$default$3$extension](#internalAskWithStatus$default$3$extension(akka.pattern.AskableActorRef,java.lang.Object))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[internalAskWithStatus$extension](#internalAskWithStatus$extension(akka.pattern.AskableActorRef,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` | INTERNAL API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AskableActorRef
		
		
		
		```
		public AskableActorRef​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)
		```

	- ### Method Detail
	
	
	
		- #### ask$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> ask$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                            java.lang.Object message,
		                                                                            [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		INTERNAL API: for binary compatibility
		- #### ask$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> ask$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                            java.lang.Object message,
		                                                                            [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                            [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### ask$default$3$extension
		
		
		
		```
		public static final [ActorRef](../actor/ActorRef.html "class in akka.actor") ask$default$3$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                     java.lang.Object message)
		```
		- #### askWithStatus$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> askWithStatus$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                                      java.lang.Object message,
		                                                                                      [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                                      [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### askWithStatus$default$3$extension
		
		
		
		```
		public static final [ActorRef](../actor/ActorRef.html "class in akka.actor") askWithStatus$default$3$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                               java.lang.Object message)
		```
		- #### internalAskWithStatus$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> internalAskWithStatus$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                                              java.lang.Object message,
		                                                                                              [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                                              [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		INTERNAL API
		- #### $qmark$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> $qmark$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                               java.lang.Object message,
		                                                                               [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		INTERNAL API: for binary compatibility
		- #### $qmark$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> $qmark$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                               java.lang.Object message,
		                                                                               [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                               [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### internalAsk$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> internalAsk$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                                    java.lang.Object message,
		                                                                                    [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                                    [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		INTERNAL API: for binary compatibility
		- #### internalAskWithStatus$default$3$extension
		
		
		
		```
		public static final [ActorRef](../actor/ActorRef.html "class in akka.actor") internalAskWithStatus$default$3$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                                       java.lang.Object message)
		```
		- #### $qmark$default$3$extension
		
		
		
		```
		public static final [ActorRef](../actor/ActorRef.html "class in akka.actor") $qmark$default$3$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                                        java.lang.Object message)
		```
		
		INTERNAL API: for binary compatibility
		- #### hashCode$extension
		
		
		
		```
		public static final int hashCode$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this)
		```
		- #### equals$extension
		
		
		
		```
		public static final boolean equals$extension​([AskableActorRef](AskableActorRef.html "class in akka.pattern") $this,
		                                             java.lang.Object x$1)
		```
		- #### actorRef
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef()
		```
		- #### ask
		
		
		
		```
		protected scala.concurrent.Future<java.lang.Object> ask​(java.lang.Object message,
		                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		- #### ask
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> ask​(java.lang.Object message,
		                                                     [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                     [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### ask$default$3
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") ask$default$3​(java.lang.Object message)
		```
		- #### askWithStatus
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> askWithStatus​(java.lang.Object message,
		                                                               [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                               [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### askWithStatus$default$3
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") askWithStatus$default$3​(java.lang.Object message)
		```
		- #### $qmark
		
		
		
		```
		protected scala.concurrent.Future<java.lang.Object> $qmark​(java.lang.Object message,
		                                                           [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		- #### $qmark
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> $qmark​(java.lang.Object message,
		                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                        [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### $qmark$default$3
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") $qmark$default$3​(java.lang.Object message)
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
- https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorRef.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorRef.html](https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorRef.html)*