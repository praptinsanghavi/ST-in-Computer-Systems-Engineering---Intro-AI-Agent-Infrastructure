---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorSelection.html
title: AskableActorSelection
---

# AskableActorSelection

## Content

Package [akka.pattern](package-summary.html)
## Class AskableActorSelection

- java.lang.Object
- - scala.AnyVal
	- - akka.pattern.AskableActorSelection

- ---

```
public final class AskableActorSelection
extends scala.AnyVal
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AskableActorSelection](#%3Cinit%3E(akka.actor.ActorSelection))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSel)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected scala.concurrent.Future<java.lang.Object>` | `[$qmark](#$qmark(java.lang.Object,akka.util.Timeout))​(java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | INTERNAL API: for binary compatibility |
	| `scala.concurrent.Future<java.lang.Object>` | `[$qmark](#$qmark(java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​(java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[$qmark$default$3](#$qmark$default$3(java.lang.Object))​(java.lang.Object message)` |  |
	| `static [ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[$qmark$default$3$extension](#$qmark$default$3$extension(akka.pattern.AskableActorSelection,java.lang.Object))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[$qmark$extension](#$qmark$extension(akka.pattern.AskableActorSelection,java.lang.Object,akka.util.Timeout))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[$qmark$extension](#$qmark$extension(akka.pattern.AskableActorSelection,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorSelection](../actor/ActorSelection.html "class in akka.actor")` | `[actorSel](#actorSel())()` |  |
	| `protected scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(java.lang.Object,akka.util.Timeout))​(java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` | INTERNAL API: for binary compatibility |
	| `scala.concurrent.Future<java.lang.Object>` | `[ask](#ask(java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​(java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ask$default$3](#ask$default$3(java.lang.Object))​(java.lang.Object message)` |  |
	| `static [ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ask$default$3$extension](#ask$default$3$extension(akka.pattern.AskableActorSelection,java.lang.Object))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[ask$extension](#ask$extension(akka.pattern.AskableActorSelection,java.lang.Object,akka.util.Timeout))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[ask$extension](#ask$extension(akka.pattern.AskableActorSelection,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static boolean` | `[equals$extension](#equals$extension(akka.pattern.AskableActorSelection,java.lang.Object))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[hashCode$extension](#hashCode$extension(akka.pattern.AskableActorSelection))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this)` |  |
	| `static scala.concurrent.Future<java.lang.Object>` | `[internalAsk$extension](#internalAsk$extension(akka.pattern.AskableActorSelection,java.lang.Object,akka.util.Timeout,akka.actor.ActorRef))​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,  java.lang.Object message,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AskableActorSelection
		
		
		
		```
		public AskableActorSelection​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSel)
		```

	- ### Method Detail
	
	
	
		- #### ask$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> ask$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                                            java.lang.Object message,
		                                                                            [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		- #### ask$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> ask$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                                            java.lang.Object message,
		                                                                            [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                            [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### ask$default$3$extension
		
		
		
		```
		public static final [ActorRef](../actor/ActorRef.html "class in akka.actor") ask$default$3$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                     java.lang.Object message)
		```
		- #### $qmark$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> $qmark$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                                               java.lang.Object message,
		                                                                               [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		- #### $qmark$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> $qmark$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                                               java.lang.Object message,
		                                                                               [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                               [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### internalAsk$extension
		
		
		
		```
		public static final scala.concurrent.Future<java.lang.Object> internalAsk$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                                                    java.lang.Object message,
		                                                                                    [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                                                                    [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		- #### $qmark$default$3$extension
		
		
		
		```
		public static final [ActorRef](../actor/ActorRef.html "class in akka.actor") $qmark$default$3$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                                        java.lang.Object message)
		```
		- #### hashCode$extension
		
		
		
		```
		public static final int hashCode$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this)
		```
		- #### equals$extension
		
		
		
		```
		public static final boolean equals$extension​([AskableActorSelection](AskableActorSelection.html "class in akka.pattern") $this,
		                                             java.lang.Object x$1)
		```
		- #### actorSel
		
		
		
		```
		public [ActorSelection](../actor/ActorSelection.html "class in akka.actor") actorSel()
		```
		- #### ask
		
		
		
		```
		protected scala.concurrent.Future<java.lang.Object> ask​(java.lang.Object message,
		                                                        [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		INTERNAL API: for binary compatibility
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
		- #### $qmark
		
		
		
		```
		protected scala.concurrent.Future<java.lang.Object> $qmark​(java.lang.Object message,
		                                                           [Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		INTERNAL API: for binary compatibility
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
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorSelection.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorSelection.html](https://doc.akka.io/japi/akka/current/akka/pattern/AskableActorSelection.html)*