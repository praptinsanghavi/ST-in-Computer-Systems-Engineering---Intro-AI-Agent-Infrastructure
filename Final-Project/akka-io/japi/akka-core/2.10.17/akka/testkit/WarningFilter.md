---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/WarningFilter.html
title: WarningFilter
---

# WarningFilter

## Content

Package [akka.testkit](package-summary.html)
## Class WarningFilter

- java.lang.Object
- - [akka.testkit.EventFilter](EventFilter.html "class in akka.testkit")
	- - akka.testkit.WarningFilter

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class WarningFilter
extends [EventFilter](EventFilter.html "class in akka.testkit")
implements scala.Product, java.io.Serializable
```

Filter which matches Warning events, if they satisfy the given criteria:
 
	- `source`, if given, applies a filter on the event\&rsquo;s origin
	- `message` applies a filter on the event\&rsquo;s message (either with String.startsWith or Regex.findFirstIn().isDefined)
 If you want to match all Warning events, the most efficient is to use `Left("")`.

See Also:
[Serialized Form](../../serialized-form.html#akka.testkit.WarningFilter)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WarningFilter](#%3Cinit%3E(java.lang.String,java.lang.String,boolean,boolean,int))​(java.lang.String source,  java.lang.String message,  boolean pattern,  boolean complete,  int occurrences)` | Java API: create a WarningFilter |
	| `[WarningFilter](#%3Cinit%3E(scala.Option,scala.util.Either,boolean,int))​(scala.Option<java.lang.String> source,  scala.util.Either<java.lang.String,​scala.util.matching.Regex> message,  boolean complete,  int occurrences)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [WarningFilter](WarningFilter.html "class in akka.testkit")` | `[apply](#apply(scala.Option,scala.util.Either,boolean,int))​(scala.Option<java.lang.String> source,  scala.util.Either<java.lang.String,​scala.util.matching.Regex> message,  boolean complete,  int occurrences)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `boolean` | `[complete](#complete())()` |  |
	| `[WarningFilter](WarningFilter.html "class in akka.testkit")` | `[copy](#copy(scala.Option,scala.util.Either,boolean,int))​(scala.Option<java.lang.String> source,  scala.util.Either<java.lang.String,​scala.util.matching.Regex> message,  boolean complete,  int occurrences)` |  |
	| `scala.Option<java.lang.String>` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.util.Either<java.lang.String,​scala.util.matching.Regex>` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[copy$default$3](#copy$default$3())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[matches](#matches(akka.event.Logging.LogEvent))​([Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event") event)` | This method decides whether to filter the event (`true`) or not  (`false`). |
	| `scala.util.Either<java.lang.String,​scala.util.matching.Regex>` | `[message](#message())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Option<java.lang.String>` | `[source](#source())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<scala.Option<java.lang.String>,​scala.util.Either<java.lang.String,​scala.util.matching.Regex>,​java.lang.Object>>` | `[unapply](#unapply(akka.testkit.WarningFilter))​([WarningFilter](WarningFilter.html "class in akka.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class akka.testkit.[EventFilter](EventFilter.html "class in akka.testkit")
		
		
		`[apply](EventFilter.html#apply(akka.event.Logging.LogEvent)), [apply$default$1](EventFilter.html#apply$default$1()), [apply$default$2](EventFilter.html#apply$default$2()), [apply$default$3](EventFilter.html#apply$default$3()), [apply$default$4](EventFilter.html#apply$default$4()), [apply$default$5](EventFilter.html#apply$default$5()), [assertDone](EventFilter.html#assertDone(scala.concurrent.duration.Duration)), [awaitDone](EventFilter.html#awaitDone(scala.concurrent.duration.Duration)), [custom](EventFilter.html#custom(scala.PartialFunction,int)), [custom$default$2](EventFilter.html#custom$default$2()), [debug](EventFilter.html#debug(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)), [debug$default$1](EventFilter.html#debug$default$1()), [debug$default$2](EventFilter.html#debug$default$2()), [debug$default$3](EventFilter.html#debug$default$3()), [debug$default$4](EventFilter.html#debug$default$4()), [debug$default$5](EventFilter.html#debug$default$5()), [doMatch](EventFilter.html#doMatch(java.lang.String,java.lang.Object)), [error](EventFilter.html#error(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)), [error$default$1](EventFilter.html#error$default$1()), [error$default$2](EventFilter.html#error$default$2()), [error$default$3](EventFilter.html#error$default$3()), [error$default$4](EventFilter.html#error$default$4()), [error$default$5](EventFilter.html#error$default$5()), [info](EventFilter.html#info(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)), [info$default$1](EventFilter.html#info$default$1()), [info$default$2](EventFilter.html#info$default$2()), [info$default$3](EventFilter.html#info$default$3()), [info$default$4](EventFilter.html#info$default$4()), [info$default$5](EventFilter.html#info$default$5()), [intercept](EventFilter.html#intercept(scala.Function0,akka.actor.ActorSystem)), [warning](EventFilter.html#warning(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)), [warning$default$1](EventFilter.html#warning$default$1()), [warning$default$2](EventFilter.html#warning$default$2()), [warning$default$3](EventFilter.html#warning$default$3()), [warning$default$4](EventFilter.html#warning$default$4()), [warning$default$5](EventFilter.html#warning$default$5())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### WarningFilter
		
		
		
		```
		public WarningFilter​(scala.Option<java.lang.String> source,
		                     scala.util.Either<java.lang.String,​scala.util.matching.Regex> message,
		                     boolean complete,
		                     int occurrences)
		```
		- #### WarningFilter
		
		
		
		```
		public WarningFilter​(java.lang.String source,
		                     java.lang.String message,
		                     boolean pattern,
		                     boolean complete,
		                     int occurrences)
		```
		
		Java API: create a WarningFilter
		 
		
		Parameters:
		`source` \- apply this filter only to events from the given source; do not filter on source if this is given as `null`
		`message` \- apply this filter only to events whose message matches; do not filter on message if this is given as `null`
		`pattern` \- if `false`, the message string must start with the given
		 string, otherwise the `message` argument is treated as
		 regular expression which is matched against the message (may match only
		 a substring to filter)
		`complete` \- whether the event\&rsquo;s message must match the given message string or pattern completely

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [WarningFilter](WarningFilter.html "class in akka.testkit") apply​(scala.Option<java.lang.String> source,
		                                  scala.util.Either<java.lang.String,​scala.util.matching.Regex> message,
		                                  boolean complete,
		                                  int occurrences)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<scala.Option<java.lang.String>,​scala.util.Either<java.lang.String,​scala.util.matching.Regex>,​java.lang.Object>> unapply​([WarningFilter](WarningFilter.html "class in akka.testkit") x$0)
		```
		- #### source
		
		
		
		```
		public scala.Option<java.lang.String> source()
		```
		
		
		Overrides:
		`[source](EventFilter.html#source())` in class `[EventFilter](EventFilter.html "class in akka.testkit")`
		- #### message
		
		
		
		```
		public scala.util.Either<java.lang.String,​scala.util.matching.Regex> message()
		```
		
		
		Overrides:
		`[message](EventFilter.html#message())` in class `[EventFilter](EventFilter.html "class in akka.testkit")`
		- #### complete
		
		
		
		```
		public boolean complete()
		```
		
		
		Overrides:
		`[complete](EventFilter.html#complete())` in class `[EventFilter](EventFilter.html "class in akka.testkit")`
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
		public [WarningFilter](WarningFilter.html "class in akka.testkit") copy​(scala.Option<java.lang.String> source,
		                          scala.util.Either<java.lang.String,​scala.util.matching.Regex> message,
		                          boolean complete,
		                          int occurrences)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.Option<java.lang.String> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.util.Either<java.lang.String,​scala.util.matching.Regex> copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public boolean copy$default$3()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/EventFilter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/WarningFilter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/WarningFilter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/WarningFilter.html)*