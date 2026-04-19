---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:58:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/internal/LoggingTestKitImpl$.html
title: LoggingTestKitImpl$
---

# LoggingTestKitImpl$

## Content

Package [akka.actor.testkit.typed.internal](package-summary.html)
## Class LoggingTestKitImpl$

- java.lang.Object
- - akka.actor.testkit.typed.internal.LoggingTestKitImpl$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class LoggingTestKitImpl$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.testkit.typed.internal.LoggingTestKitImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LoggingTestKitImpl$](LoggingTestKitImpl$.html "class in akka.actor.testkit.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingTestKitImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.testkit.typed.internal.LoggingTestKitImpl` | `[apply](#apply(int,scala.Option,scala.Option,scala.Option,scala.Option,scala.Option,scala.Option,scala.collection.immutable.Map,boolean,scala.Option))​(int occurrences,  scala.Option<org.slf4j.event.Level> logLevel,  scala.Option<java.lang.String> loggerName,  scala.Option<java.lang.String> source,  scala.Option<java.lang.String> messageContains,  scala.Option<scala.util.matching.Regex> messageRegex,  scala.Option<java.lang.Class<? extends java.lang.Throwable>> cause,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> mdc,  boolean checkExcess,  scala.Option<scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object>> custom)` | INTERNAL API |
	| `akka.actor.testkit.typed.internal.LoggingTestKitImpl` | `[empty](#empty())()` |  |
	| `scala.Option<scala.Tuple10<java.lang.Object,​scala.Option<org.slf4j.event.Level>,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​scala.Option<scala.util.matching.Regex>,​scala.Option<java.lang.Class<? extends java.lang.Throwable>>,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>,​java.lang.Object,​scala.Option<scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object>>>>` | `[unapply](#unapply(akka.actor.testkit.typed.internal.LoggingTestKitImpl))​(akka.actor.testkit.typed.internal.LoggingTestKitImpl x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LoggingTestKitImpl$](LoggingTestKitImpl$.html "class in akka.actor.testkit.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LoggingTestKitImpl$
		
		
		
		```
		public LoggingTestKitImpl$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public akka.actor.testkit.typed.internal.LoggingTestKitImpl empty()
		```
		- #### apply
		
		
		
		```
		public akka.actor.testkit.typed.internal.LoggingTestKitImpl apply​(int occurrences,
		                                                                  scala.Option<org.slf4j.event.Level> logLevel,
		                                                                  scala.Option<java.lang.String> loggerName,
		                                                                  scala.Option<java.lang.String> source,
		                                                                  scala.Option<java.lang.String> messageContains,
		                                                                  scala.Option<scala.util.matching.Regex> messageRegex,
		                                                                  scala.Option<java.lang.Class<? extends java.lang.Throwable>> cause,
		                                                                  scala.collection.immutable.Map<java.lang.String,​java.lang.String> mdc,
		                                                                  boolean checkExcess,
		                                                                  scala.Option<scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object>> custom)
		```
		
		INTERNAL API
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple10<java.lang.Object,​scala.Option<org.slf4j.event.Level>,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​scala.Option<java.lang.String>,​scala.Option<scala.util.matching.Regex>,​scala.Option<java.lang.Class<? extends java.lang.Throwable>>,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>,​java.lang.Object,​scala.Option<scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object>>>> unapply​(akka.actor.testkit.typed.internal.LoggingTestKitImpl x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/LoggingEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/internal/LoggingTestKitImpl$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/internal/LoggingTestKitImpl$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/internal/LoggingTestKitImpl$.html)*