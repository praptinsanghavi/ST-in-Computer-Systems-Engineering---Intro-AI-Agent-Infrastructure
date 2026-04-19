---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:19:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/CustomEventFilter.html
title: CustomEventFilter
---

# CustomEventFilter

## Content

Package [akka.testkit](package-summary.html)
## Class CustomEventFilter

- java.lang.Object
- - [akka.testkit.EventFilter](EventFilter.html "class in akka.testkit")
	- - akka.testkit.CustomEventFilter

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class CustomEventFilter
extends [EventFilter](EventFilter.html "class in akka.testkit")
implements scala.Product, java.io.Serializable
```

Custom event filter when the others do not fit the bill.
 
 If the partial function is defined and returns true, filter the event.

See Also:
[Serialized Form](../../serialized-form.html#akka.testkit.CustomEventFilter)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CustomEventFilter](#%3Cinit%3E(scala.PartialFunction,int))​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,  int occurrences)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [CustomEventFilter](CustomEventFilter.html "class in akka.testkit")` | `[apply](#apply(scala.PartialFunction,int))​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,  int occurrences)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[CustomEventFilter](CustomEventFilter.html "class in akka.testkit")` | `[copy](#copy(scala.PartialFunction,int))​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,  int occurrences)` |  |
	| `scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[matches](#matches(akka.event.Logging.LogEvent))​([Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event") event)` | This method decides whether to filter the event (`true`) or not  (`false`). |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object>` | `[test](#test())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object>>` | `[unapply](#unapply(akka.testkit.CustomEventFilter))​([CustomEventFilter](CustomEventFilter.html "class in akka.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class akka.testkit.[EventFilter](EventFilter.html "class in akka.testkit")
		
		
		`[apply](EventFilter.html#apply(akka.event.Logging.LogEvent)), [apply$default$1](EventFilter.html#apply$default$1()), [apply$default$2](EventFilter.html#apply$default$2()), [apply$default$3](EventFilter.html#apply$default$3()), [apply$default$4](EventFilter.html#apply$default$4()), [apply$default$5](EventFilter.html#apply$default$5()), [assertDone](EventFilter.html#assertDone(scala.concurrent.duration.Duration)), [awaitDone](EventFilter.html#awaitDone(scala.concurrent.duration.Duration)), [complete](EventFilter.html#complete()), [custom](EventFilter.html#custom(scala.PartialFunction,int)), [custom$default$2](EventFilter.html#custom$default$2()), [debug](EventFilter.html#debug(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)), [debug$default$1](EventFilter.html#debug$default$1()), [debug$default$2](EventFilter.html#debug$default$2()), [debug$default$3](EventFilter.html#debug$default$3()), [debug$default$4](EventFilter.html#debug$default$4()), [debug$default$5](EventFilter.html#debug$default$5()), [doMatch](EventFilter.html#doMatch(java.lang.String,java.lang.Object)), [error](EventFilter.html#error(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)), [error$default$1](EventFilter.html#error$default$1()), [error$default$2](EventFilter.html#error$default$2()), [error$default$3](EventFilter.html#error$default$3()), [error$default$4](EventFilter.html#error$default$4()), [error$default$5](EventFilter.html#error$default$5()), [info](EventFilter.html#info(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)), [info$default$1](EventFilter.html#info$default$1()), [info$default$2](EventFilter.html#info$default$2()), [info$default$3](EventFilter.html#info$default$3()), [info$default$4](EventFilter.html#info$default$4()), [info$default$5](EventFilter.html#info$default$5()), [intercept](EventFilter.html#intercept(scala.Function0,akka.actor.ActorSystem)), [message](EventFilter.html#message()), [source](EventFilter.html#source()), [warning](EventFilter.html#warning(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)), [warning$default$1](EventFilter.html#warning$default$1()), [warning$default$2](EventFilter.html#warning$default$2()), [warning$default$3](EventFilter.html#warning$default$3()), [warning$default$4](EventFilter.html#warning$default$4()), [warning$default$5](EventFilter.html#warning$default$5())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### CustomEventFilter
		
		
		
		```
		public CustomEventFilter​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,
		                         int occurrences)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [CustomEventFilter](CustomEventFilter.html "class in akka.testkit") apply​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,
		                                      int occurrences)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object>> unapply​([CustomEventFilter](CustomEventFilter.html "class in akka.testkit") x$0)
		```
		- #### test
		
		
		
		```
		public scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test()
		```
		- #### matches
		
		
		
		```
		public boolean matches​([Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event") event)
		```
		
		Description copied from class: `[EventFilter](EventFilter.html#matches(akka.event.Logging.LogEvent))`
		This method decides whether to filter the event (`true`) or not
		 (`false`).
		
		Specified by:
		`[matches](EventFilter.html#matches(akka.event.Logging.LogEvent))` in class `[EventFilter](EventFilter.html "class in akka.testkit")`
		- #### copy
		
		
		
		```
		public [CustomEventFilter](CustomEventFilter.html "class in akka.testkit") copy​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,
		                              int occurrences)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> copy$default$1()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.LogEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/EventFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/CustomEventFilter.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/CustomEventFilter.html)*