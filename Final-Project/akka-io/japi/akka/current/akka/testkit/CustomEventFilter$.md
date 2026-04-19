---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/CustomEventFilter$.html
title: CustomEventFilter$
---

# CustomEventFilter$

## Content

Package [akka.testkit](package-summary.html)
## Class CustomEventFilter$

- java.lang.Object
- - akka.testkit.CustomEventFilter$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class CustomEventFilter$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.testkit.CustomEventFilter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CustomEventFilter$](CustomEventFilter$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CustomEventFilter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CustomEventFilter](CustomEventFilter.html "class in akka.testkit")` | `[apply](#apply(scala.PartialFunction,int))​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,  int occurrences)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object>>` | `[unapply](#unapply(akka.testkit.CustomEventFilter))​([CustomEventFilter](CustomEventFilter.html "class in akka.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CustomEventFilter$](CustomEventFilter$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CustomEventFilter$
		
		
		
		```
		public CustomEventFilter$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public [CustomEventFilter](CustomEventFilter.html "class in akka.testkit") apply​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,
		                               int occurrences)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object>> unapply​([CustomEventFilter](CustomEventFilter.html "class in akka.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/Logging.LogEvent.html
- https://doc.akka.io/japi/akka/current/akka/testkit/CustomEventFilter$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/CustomEventFilter$.html](https://doc.akka.io/japi/akka/current/akka/testkit/CustomEventFilter$.html)*