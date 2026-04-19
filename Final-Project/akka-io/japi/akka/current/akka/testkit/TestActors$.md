---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestActors$.html
title: TestActors$
---

# TestActors$

## Content

Package [akka.testkit](package-summary.html)
## Class TestActors$

- java.lang.Object
- - akka.testkit.TestActors$

- ---

```
public class TestActors$
extends java.lang.Object
```

A collection of common actor patterns used in tests.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestActors$](TestActors$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestActors$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[blackholeProps](#blackholeProps())()` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[echoActorProps](#echoActorProps())()` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[forwardActorProps](#forwardActorProps(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestActors$](TestActors$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestActors$
		
		
		
		```
		public TestActors$()
		```

	- ### Method Detail
	
	
	
		- #### echoActorProps
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") echoActorProps()
		```
		- #### blackholeProps
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") blackholeProps()
		```
		- #### forwardActorProps
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") forwardActorProps​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestActors$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestActors$.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestActors$.html)*