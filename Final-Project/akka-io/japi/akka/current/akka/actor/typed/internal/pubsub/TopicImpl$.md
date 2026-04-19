---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/pubsub/TopicImpl$.html
title: TopicImpl$
---

# TopicImpl$

## Content

Package [akka.actor.typed.internal.pubsub](package-summary.html)
## Class TopicImpl$

- java.lang.Object
- - akka.actor.typed.internal.pubsub.TopicImpl$

- ---

```
public class TopicImpl$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TopicImpl$](TopicImpl$.html "class in akka.actor.typed.internal.pubsub")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TopicImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Behavior](../../Behavior.html "class in akka.actor.typed")<akka.actor.typed.internal.pubsub.TopicImpl.Command<T>>` | `[apply](#apply(java.lang.String,scala.Option,scala.reflect.ClassTag))​(java.lang.String topicName,  scala.Option<scala.concurrent.duration.FiniteDuration> ttl,  scala.reflect.ClassTag<T> classTag)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TopicImpl$](TopicImpl$.html "class in akka.actor.typed.internal.pubsub") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TopicImpl$
		
		
		
		```
		public TopicImpl$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Behavior](../../Behavior.html "class in akka.actor.typed")<akka.actor.typed.internal.pubsub.TopicImpl.Command<T>> apply​(java.lang.String topicName,
		                                                                                 scala.Option<scala.concurrent.duration.FiniteDuration> ttl,
		                                                                                 scala.reflect.ClassTag<T> classTag)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/pubsub/TopicImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/pubsub/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/pubsub/TopicImpl$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/pubsub/TopicImpl$.html)*