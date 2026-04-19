---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSubscriber$.html
title: TestSubscriber$
---

# TestSubscriber$

## Content

Package [akka.stream.testkit](package-summary.html)
## Class TestSubscriber$

- java.lang.Object
- - akka.stream.testkit.TestSubscriber$

- ---

```
public class TestSubscriber$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestSubscriber$](TestSubscriber$.html "class in akka.stream.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestSubscriber$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [TestSubscriber.ManualProbe](TestSubscriber.ManualProbe.html "class in akka.stream.testkit")<T>` | `[manualProbe](#manualProbe(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Probe that implements `Subscriber` interface. |
	| `<T> [TestSubscriber.Probe](TestSubscriber.Probe.html "class in akka.stream.testkit")<T>` | `[probe](#probe(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestSubscriber$](TestSubscriber$.html "class in akka.stream.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestSubscriber$
		
		
		
		```
		public TestSubscriber$()
		```

	- ### Method Detail
	
	
	
		- #### manualProbe
		
		
		
		```
		public <T> [TestSubscriber.ManualProbe](TestSubscriber.ManualProbe.html "class in akka.stream.testkit")<T> manualProbe​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Probe that implements `Subscriber` interface.
		- #### probe
		
		
		
		```
		public <T> [TestSubscriber.Probe](TestSubscriber.Probe.html "class in akka.stream.testkit")<T> probe​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSubscriber$.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSubscriber.ManualProbe.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSubscriber.Probe.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSubscriber$.html](https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSubscriber$.html)*