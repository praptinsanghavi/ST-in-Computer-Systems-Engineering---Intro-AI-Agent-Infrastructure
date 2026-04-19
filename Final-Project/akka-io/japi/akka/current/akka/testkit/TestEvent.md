---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestEvent.UnMute$.html
title: TestEvent.UnMute$
---

# TestEvent.UnMute$

## Content

Package [akka.testkit](package-summary.html)
## Class TestEvent.UnMute$

- java.lang.Object
- - akka.testkit.TestEvent.UnMute$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing interface:
[TestEvent](TestEvent.html "interface in akka.testkit")

---

```
public static class TestEvent.UnMute$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.testkit.TestEvent.UnMute$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestEvent.UnMute$](TestEvent.UnMute$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnMute$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestEvent.UnMute](TestEvent.UnMute.html "class in akka.testkit")` | `[apply](#apply(akka.testkit.EventFilter,scala.collection.immutable.Seq))​([EventFilter](EventFilter.html "class in akka.testkit") filter,  scala.collection.immutable.Seq<[EventFilter](EventFilter.html "class in akka.testkit")> filters)` |  |
	| `[TestEvent.UnMute](TestEvent.UnMute.html "class in akka.testkit")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[EventFilter](EventFilter.html "class in akka.testkit")> filters)` |  |
	| `scala.Option<scala.collection.immutable.Seq<[EventFilter](EventFilter.html "class in akka.testkit")>>` | `[unapply](#unapply(akka.testkit.TestEvent.UnMute))​([TestEvent.UnMute](TestEvent.UnMute.html "class in akka.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestEvent.UnMute$](TestEvent.UnMute$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UnMute$
		
		
		
		```
		public UnMute$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [TestEvent.UnMute](TestEvent.UnMute.html "class in akka.testkit") apply​([EventFilter](EventFilter.html "class in akka.testkit") filter,
		                              scala.collection.immutable.Seq<[EventFilter](EventFilter.html "class in akka.testkit")> filters)
		```
		- #### apply
		
		
		
		```
		public [TestEvent.UnMute](TestEvent.UnMute.html "class in akka.testkit") apply​(scala.collection.immutable.Seq<[EventFilter](EventFilter.html "class in akka.testkit")> filters)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Seq<[EventFilter](EventFilter.html "class in akka.testkit")>> unapply​([TestEvent.UnMute](TestEvent.UnMute.html "class in akka.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/testkit/EventFilter.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestEvent.UnMute$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestEvent.UnMute.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestEvent.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestEvent.UnMute$.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestEvent.UnMute$.html)*