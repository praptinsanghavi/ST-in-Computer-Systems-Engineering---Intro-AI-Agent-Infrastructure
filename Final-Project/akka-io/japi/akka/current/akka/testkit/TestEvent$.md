---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/TestEvent$.html
title: TestEvent$
---

# TestEvent$

## Content

Package [akka.testkit](package-summary.html)
## Class TestEvent$

- java.lang.Object
- - akka.testkit.TestEvent$

- ---

```
public class TestEvent$
extends java.lang.Object
```

Implementation helpers of the EventFilter facilities: send `Mute`
 to the TestEventFilter to install a filter, and `UnMute` to
 uninstall it.
 
 You should always prefer the filter methods in the package object
 (see `akka.testkit` `filterEvents` and `filterException`) or on the
 EventFilter implementations.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestEvent$](TestEvent$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestEvent$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestEvent$](TestEvent$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestEvent$
		
		
		
		```
		public TestEvent$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/testkit/TestEvent$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/TestEvent$.html](https://doc.akka.io/japi/akka/current/akka/testkit/TestEvent$.html)*