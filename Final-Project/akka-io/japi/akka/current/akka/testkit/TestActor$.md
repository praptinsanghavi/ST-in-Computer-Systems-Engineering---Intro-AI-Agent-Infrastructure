---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestActor$.html
title: TestActor$
---

# TestActor$

## Content

Package [akka.testkit](package-summary.html)
## Class TestActor$

- java.lang.Object
- - akka.testkit.TestActor$

- ---

```
public class TestActor$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestActor$](TestActor$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestActor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<java.lang.Object,​java.lang.Object>` | `[FALSE](#FALSE())()` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props(java.util.concurrent.BlockingDeque))​(java.util.concurrent.BlockingDeque<[TestActor.Message](TestActor.Message.html "interface in akka.testkit")> queue)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestActor$](TestActor$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestActor$
		
		
		
		```
		public TestActor$()
		```

	- ### Method Detail
	
	
	
		- #### FALSE
		
		
		
		```
		public scala.Function1<java.lang.Object,​java.lang.Object> FALSE()
		```
		- #### props
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") props​(java.util.concurrent.BlockingDeque<[TestActor.Message](TestActor.Message.html "interface in akka.testkit")> queue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestActor$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestActor.Message.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestActor$.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestActor$.html)*