---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/TestAppender$.html
title: TestAppender$
---

# TestAppender$

## Content

Package [akka.actor.testkit.typed.internal](package-summary.html)
## Class TestAppender$

- java.lang.Object
- - akka.actor.testkit.typed.internal.TestAppender$

- ---

```
public class TestAppender$
extends java.lang.Object
```

INTERNAL API
 
 The `TestAppender` emits the logging events to the registered `LoggingTestKitImpl`, which
 are added and removed to the appender dynamically from tests.
 

`TestAppender` is currently requiring Logback as SLF4J implementation.
 Similar can probably be implemented with other backends, such as Log4j2\.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestAppender$](TestAppender$.html "class in akka.actor.testkit.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestAppender$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[addFilter](#addFilter(java.lang.String,akka.actor.testkit.typed.internal.LoggingTestKitImpl))​(java.lang.String loggerName,  akka.actor.testkit.typed.internal.LoggingTestKitImpl filter)` |  |
	| `void` | `[removeFilter](#removeFilter(java.lang.String,akka.actor.testkit.typed.internal.LoggingTestKitImpl))​(java.lang.String loggerName,  akka.actor.testkit.typed.internal.LoggingTestKitImpl filter)` |  |
	| `void` | `[setupTestAppender](#setupTestAppender(java.lang.String))​(java.lang.String loggerName)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestAppender$](TestAppender$.html "class in akka.actor.testkit.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestAppender$
		
		
		
		```
		public TestAppender$()
		```

	- ### Method Detail
	
	
	
		- #### setupTestAppender
		
		
		
		```
		public void setupTestAppender​(java.lang.String loggerName)
		```
		- #### addFilter
		
		
		
		```
		public void addFilter​(java.lang.String loggerName,
		                      akka.actor.testkit.typed.internal.LoggingTestKitImpl filter)
		```
		- #### removeFilter
		
		
		
		```
		public void removeFilter​(java.lang.String loggerName,
		                         akka.actor.testkit.typed.internal.LoggingTestKitImpl filter)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/TestAppender$.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/TestAppender$.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/TestAppender$.html)*