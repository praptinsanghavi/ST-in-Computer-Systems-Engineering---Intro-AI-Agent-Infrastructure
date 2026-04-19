---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:58:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/CapturedLogEvent$.html
title: CapturedLogEvent$
---

# CapturedLogEvent$

## Content

Package [akka.actor.testkit.typed](package-summary.html)
## Class CapturedLogEvent$

- java.lang.Object
- - akka.actor.testkit.typed.CapturedLogEvent$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class CapturedLogEvent$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.testkit.typed.CapturedLogEvent$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CapturedLogEvent$](CapturedLogEvent$.html "class in akka.actor.testkit.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CapturedLogEvent$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CapturedLogEvent](CapturedLogEvent.html "class in akka.actor.testkit.typed")` | `[apply](#apply(org.slf4j.event.Level,java.lang.String))​(org.slf4j.event.Level level,  java.lang.String message)` |  |
	| `scala.Option<scala.Tuple4<org.slf4j.event.Level,​java.lang.String,​scala.Option<java.lang.Throwable>,​scala.Option<org.slf4j.Marker>>>` | `[unapply](#unapply(akka.actor.testkit.typed.CapturedLogEvent))​([CapturedLogEvent](CapturedLogEvent.html "class in akka.actor.testkit.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CapturedLogEvent$](CapturedLogEvent$.html "class in akka.actor.testkit.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CapturedLogEvent$
		
		
		
		```
		public CapturedLogEvent$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [CapturedLogEvent](CapturedLogEvent.html "class in akka.actor.testkit.typed") apply​(org.slf4j.event.Level level,
		                              java.lang.String message)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<org.slf4j.event.Level,​java.lang.String,​scala.Option<java.lang.Throwable>,​scala.Option<org.slf4j.Marker>>> unapply​([CapturedLogEvent](CapturedLogEvent.html "class in akka.actor.testkit.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/CapturedLogEvent$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/CapturedLogEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/CapturedLogEvent$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/CapturedLogEvent$.html)*