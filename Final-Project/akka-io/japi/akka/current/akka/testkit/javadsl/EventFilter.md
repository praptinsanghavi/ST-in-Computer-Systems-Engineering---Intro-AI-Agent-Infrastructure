---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/javadsl/EventFilter.html
title: EventFilter
---

# EventFilter

## Content

Package [akka.testkit.javadsl](package-summary.html)
## Class EventFilter

- java.lang.Object
- - akka.testkit.javadsl.EventFilter

- ---

```
public class EventFilter
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventFilter](#%3Cinit%3E(java.lang.Class,akka.actor.ActorSystem))​(java.lang.Class<?> clazz,  [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EventFilter](EventFilter.html "class in akka.testkit.javadsl")` | `[from](#from(java.lang.String))​(java.lang.String source)` |  |
	| `<T> T` | `[intercept](#intercept(java.util.function.Supplier))​(java.util.function.Supplier<T> code)` |  |
	| `[EventFilter](EventFilter.html "class in akka.testkit.javadsl")` | `[matches](#matches(java.lang.String))​(java.lang.String regex)` |  |
	| `[EventFilter](EventFilter.html "class in akka.testkit.javadsl")` | `[message](#message(java.lang.String))​(java.lang.String msg)` |  |
	| `[EventFilter](EventFilter.html "class in akka.testkit.javadsl")` | `[occurrences](#occurrences(int))​(int number)` |  |
	| `[EventFilter](EventFilter.html "class in akka.testkit.javadsl")` | `[startsWith](#startsWith(java.lang.String))​(java.lang.String msg)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventFilter
		
		
		
		```
		public EventFilter​(java.lang.Class<?> clazz,
		                   [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### from
		
		
		
		```
		public [EventFilter](EventFilter.html "class in akka.testkit.javadsl") from​(java.lang.String source)
		```
		- #### intercept
		
		
		
		```
		public <T> T intercept​(java.util.function.Supplier<T> code)
		```
		- #### matches
		
		
		
		```
		public [EventFilter](EventFilter.html "class in akka.testkit.javadsl") matches​(java.lang.String regex)
		```
		- #### message
		
		
		
		```
		public [EventFilter](EventFilter.html "class in akka.testkit.javadsl") message​(java.lang.String msg)
		```
		- #### occurrences
		
		
		
		```
		public [EventFilter](EventFilter.html "class in akka.testkit.javadsl") occurrences​(int number)
		```
		- #### startsWith
		
		
		
		```
		public [EventFilter](EventFilter.html "class in akka.testkit.javadsl") startsWith​(java.lang.String msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/testkit/javadsl/EventFilter.html
- https://doc.akka.io/japi/akka/current/akka/testkit/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/javadsl/EventFilter.html](https://doc.akka.io/japi/akka/current/akka/testkit/javadsl/EventFilter.html)*