---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/ActorClassificationUnsubscriber$.html
title: ActorClassificationUnsubscriber$
---

# ActorClassificationUnsubscriber$

## Content

Package [akka.event](package-summary.html)
## Class ActorClassificationUnsubscriber$

- java.lang.Object
- - akka.event.ActorClassificationUnsubscriber$

- ---

```
public class ActorClassificationUnsubscriber$
extends java.lang.Object
```

INTERNAL API
 
 Provides factory for `ActorClassificationUnsubscriber` actors with \*\*unique names\*\*.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorClassificationUnsubscriber$](ActorClassificationUnsubscriber$.html "class in akka.event")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorClassificationUnsubscriber$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[start](#start(akka.actor.ActorSystem,java.lang.String,scala.Function1,boolean))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  java.lang.String busName,  scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> unsubscribe,  boolean debug)` |  |
	| `boolean` | `[start$default$4](#start$default$4())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorClassificationUnsubscriber$](ActorClassificationUnsubscriber$.html "class in akka.event") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorClassificationUnsubscriber$
		
		
		
		```
		public ActorClassificationUnsubscriber$()
		```

	- ### Method Detail
	
	
	
		- #### start
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") start​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                      java.lang.String busName,
		                      scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> unsubscribe,
		                      boolean debug)
		```
		- #### start$default$4
		
		
		
		```
		public boolean start$default$4()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/event/ActorClassificationUnsubscriber$.html
- https://doc.akka.io/japi/akka/current/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/ActorClassificationUnsubscriber$.html](https://doc.akka.io/japi/akka/current/akka/event/ActorClassificationUnsubscriber$.html)*