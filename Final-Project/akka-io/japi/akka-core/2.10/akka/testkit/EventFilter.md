---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:19:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/EventFilter.html
title: EventFilter
---

# EventFilter

## Content

Package [akka.testkit](package-summary.html)
## Class EventFilter

- java.lang.Object
- - akka.testkit.EventFilter

- Direct Known Subclasses:
`[CustomEventFilter](CustomEventFilter.html "class in akka.testkit")`, `[DeadLettersFilter](DeadLettersFilter.html "class in akka.testkit")`, `[DebugFilter](DebugFilter.html "class in akka.testkit")`, `[ErrorFilter](ErrorFilter.html "class in akka.testkit")`, `[InfoFilter](InfoFilter.html "class in akka.testkit")`, `[WarningFilter](WarningFilter.html "class in akka.testkit")`

---

```
public abstract class EventFilter
extends java.lang.Object
```

Facilities for selectively filtering out expected events from logging so
 that you can keep your test run\&rsquo;s console output clean and do not miss real
 error messages.
 
 See the companion object for convenient factory methods.
 

 If the `occurrences` is set to Int.MaxValue, no tracking is done.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventFilter](#%3Cinit%3E(int))​(int occurrences)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[apply](#apply(akka.event.Logging.LogEvent))​([Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event") event)` |  |
	| `static <A extends java.lang.Throwable>java.lang.String` | `[apply$default$1](#apply$default$1())()` |  |
	| `static <A extends java.lang.Throwable>java.lang.String` | `[apply$default$2](#apply$default$2())()` |  |
	| `static <A extends java.lang.Throwable>java.lang.String` | `[apply$default$3](#apply$default$3())()` |  |
	| `static <A extends java.lang.Throwable>java.lang.String` | `[apply$default$4](#apply$default$4())()` |  |
	| `static <A extends java.lang.Throwable>int` | `[apply$default$5](#apply$default$5())()` |  |
	| `void` | `[assertDone](#assertDone(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration max)` | Assert that this filter has matched as often as requested by its  `occurrences` parameter specifies. |
	| `boolean` | `[awaitDone](#awaitDone(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration max)` |  |
	| `protected boolean` | `[complete](#complete())()` |  |
	| `static [EventFilter](EventFilter.html "class in akka.testkit")` | `[custom](#custom(scala.PartialFunction,int))​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,  int occurrences)` | Create a custom event filter. |
	| `static int` | `[custom$default$2](#custom$default$2())()` |  |
	| `static [EventFilter](EventFilter.html "class in akka.testkit")` | `[debug](#debug(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int))​(java.lang.String message,  java.lang.String source,  java.lang.String start,  java.lang.String pattern,  int occurrences)` | Create a filter for Debug events. |
	| `static java.lang.String` | `[debug$default$1](#debug$default$1())()` |  |
	| `static java.lang.String` | `[debug$default$2](#debug$default$2())()` |  |
	| `static java.lang.String` | `[debug$default$3](#debug$default$3())()` |  |
	| `static java.lang.String` | `[debug$default$4](#debug$default$4())()` |  |
	| `static int` | `[debug$default$5](#debug$default$5())()` |  |
	| `protected boolean` | `[doMatch](#doMatch(java.lang.String,java.lang.Object))​(java.lang.String src,  java.lang.Object msg)` | internal implementation helper, no guaranteed API |
	| `static [EventFilter](EventFilter.html "class in akka.testkit")` | `[error](#error(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int))​(java.lang.String message,  java.lang.String source,  java.lang.String start,  java.lang.String pattern,  int occurrences)` | Create a filter for Error events. |
	| `static java.lang.String` | `[error$default$1](#error$default$1())()` |  |
	| `static java.lang.String` | `[error$default$2](#error$default$2())()` |  |
	| `static java.lang.String` | `[error$default$3](#error$default$3())()` |  |
	| `static java.lang.String` | `[error$default$4](#error$default$4())()` |  |
	| `static int` | `[error$default$5](#error$default$5())()` |  |
	| `static [EventFilter](EventFilter.html "class in akka.testkit")` | `[info](#info(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int))​(java.lang.String message,  java.lang.String source,  java.lang.String start,  java.lang.String pattern,  int occurrences)` | Create a filter for Info events. |
	| `static java.lang.String` | `[info$default$1](#info$default$1())()` |  |
	| `static java.lang.String` | `[info$default$2](#info$default$2())()` |  |
	| `static java.lang.String` | `[info$default$3](#info$default$3())()` |  |
	| `static java.lang.String` | `[info$default$4](#info$default$4())()` |  |
	| `static int` | `[info$default$5](#info$default$5())()` |  |
	| `<T> T` | `[intercept](#intercept(scala.Function0,akka.actor.ActorSystem))​(scala.Function0<T> code,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Apply this filter while executing the given code block. |
	| `protected abstract boolean` | `[matches](#matches(akka.event.Logging.LogEvent))​([Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event") event)` | This method decides whether to filter the event (`true`) or not  (`false`). |
	| `protected scala.util.Either<java.lang.String,​scala.util.matching.Regex>` | `[message](#message())()` |  |
	| `protected scala.Option<java.lang.String>` | `[source](#source())()` |  |
	| `static [EventFilter](EventFilter.html "class in akka.testkit")` | `[warning](#warning(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int))​(java.lang.String message,  java.lang.String source,  java.lang.String start,  java.lang.String pattern,  int occurrences)` | Create a filter for Warning events. |
	| `static java.lang.String` | `[warning$default$1](#warning$default$1())()` |  |
	| `static java.lang.String` | `[warning$default$2](#warning$default$2())()` |  |
	| `static java.lang.String` | `[warning$default$3](#warning$default$3())()` |  |
	| `static java.lang.String` | `[warning$default$4](#warning$default$4())()` |  |
	| `static int` | `[warning$default$5](#warning$default$5())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventFilter
		
		
		
		```
		public EventFilter​(int occurrences)
		```

	- ### Method Detail
	
	
	
		- #### apply$default$1
		
		
		
		```
		public static <A extends java.lang.Throwable> java.lang.String apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public static <A extends java.lang.Throwable> java.lang.String apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static <A extends java.lang.Throwable> java.lang.String apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public static <A extends java.lang.Throwable> java.lang.String apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public static <A extends java.lang.Throwable> int apply$default$5()
		```
		- #### error
		
		
		
		```
		public static [EventFilter](EventFilter.html "class in akka.testkit") error​(java.lang.String message,
		                                java.lang.String source,
		                                java.lang.String start,
		                                java.lang.String pattern,
		                                int occurrences)
		```
		
		Create a filter for Error events. See apply() for more details.
		- #### error$default$1
		
		
		
		```
		public static java.lang.String error$default$1()
		```
		- #### error$default$2
		
		
		
		```
		public static java.lang.String error$default$2()
		```
		- #### error$default$3
		
		
		
		```
		public static java.lang.String error$default$3()
		```
		- #### error$default$4
		
		
		
		```
		public static java.lang.String error$default$4()
		```
		- #### error$default$5
		
		
		
		```
		public static int error$default$5()
		```
		- #### warning
		
		
		
		```
		public static [EventFilter](EventFilter.html "class in akka.testkit") warning​(java.lang.String message,
		                                  java.lang.String source,
		                                  java.lang.String start,
		                                  java.lang.String pattern,
		                                  int occurrences)
		```
		
		Create a filter for Warning events. Give up to one of `start` and `pattern`:
		 
		
		
		
		```
		
		 EventFilter.warning()                                         // filter only on warning event
		 EventFilter.warning(source = obj)                             // filter on event source
		 EventFilter.warning(start = "Expected")                       // filter on start of message
		 EventFilter.warning(source = obj, pattern = "weird.*message") // filter on pattern and message
		 
		```
		
		
		 ''Please note that filtering on the `source` being
		 `null` does NOT work (passing `null` disables the
		 source filter).''
		- #### warning$default$1
		
		
		
		```
		public static java.lang.String warning$default$1()
		```
		- #### warning$default$2
		
		
		
		```
		public static java.lang.String warning$default$2()
		```
		- #### warning$default$3
		
		
		
		```
		public static java.lang.String warning$default$3()
		```
		- #### warning$default$4
		
		
		
		```
		public static java.lang.String warning$default$4()
		```
		- #### warning$default$5
		
		
		
		```
		public static int warning$default$5()
		```
		- #### info
		
		
		
		```
		public static [EventFilter](EventFilter.html "class in akka.testkit") info​(java.lang.String message,
		                               java.lang.String source,
		                               java.lang.String start,
		                               java.lang.String pattern,
		                               int occurrences)
		```
		
		Create a filter for Info events. Give up to one of `start` and `pattern`:
		 
		
		
		
		```
		
		 EventFilter.info()                                         // filter only on info event
		 EventFilter.info(source = obj)                             // filter on event source
		 EventFilter.info(start = "Expected")                       // filter on start of message
		 EventFilter.info(source = obj, pattern = "weird.*message") // filter on pattern and message
		 
		```
		
		
		 ''Please note that filtering on the `source` being
		 `null` does NOT work (passing `null` disables the
		 source filter).''
		- #### info$default$1
		
		
		
		```
		public static java.lang.String info$default$1()
		```
		- #### info$default$2
		
		
		
		```
		public static java.lang.String info$default$2()
		```
		- #### info$default$3
		
		
		
		```
		public static java.lang.String info$default$3()
		```
		- #### info$default$4
		
		
		
		```
		public static java.lang.String info$default$4()
		```
		- #### info$default$5
		
		
		
		```
		public static int info$default$5()
		```
		- #### debug
		
		
		
		```
		public static [EventFilter](EventFilter.html "class in akka.testkit") debug​(java.lang.String message,
		                                java.lang.String source,
		                                java.lang.String start,
		                                java.lang.String pattern,
		                                int occurrences)
		```
		
		Create a filter for Debug events. Give up to one of `start` and `pattern`:
		 
		
		
		
		```
		
		 EventFilter.debug()                                         // filter only on debug type
		 EventFilter.debug(source = obj)                             // filter on event source
		 EventFilter.debug(start = "Expected")                       // filter on start of message
		 EventFilter.debug(source = obj, pattern = "weird.*message") // filter on pattern and message
		 
		```
		
		
		 ''Please note that filtering on the `source` being
		 `null` does NOT work (passing `null` disables the
		 source filter).''
		- #### debug$default$1
		
		
		
		```
		public static java.lang.String debug$default$1()
		```
		- #### debug$default$2
		
		
		
		```
		public static java.lang.String debug$default$2()
		```
		- #### debug$default$3
		
		
		
		```
		public static java.lang.String debug$default$3()
		```
		- #### debug$default$4
		
		
		
		```
		public static java.lang.String debug$default$4()
		```
		- #### debug$default$5
		
		
		
		```
		public static int debug$default$5()
		```
		- #### custom
		
		
		
		```
		public static [EventFilter](EventFilter.html "class in akka.testkit") custom​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,
		                                 int occurrences)
		```
		
		Create a custom event filter. The filter will affect those events for
		 which the supplied partial function is defined and returns
		 `true`.
		 
		
		
		
		```
		
		 EventFilter.custom {
		   case Warning(ref, "my warning") if ref == actor || ref == null => true
		 }
		 
		```
		- #### custom$default$2
		
		
		
		```
		public static int custom$default$2()
		```
		- #### matches
		
		
		
		```
		protected abstract boolean matches​([Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event") event)
		```
		
		This method decides whether to filter the event (`true`) or not
		 (`false`).
		- #### apply
		
		
		
		```
		public final boolean apply​([Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event") event)
		```
		- #### awaitDone
		
		
		
		```
		public boolean awaitDone​(scala.concurrent.duration.Duration max)
		```
		- #### assertDone
		
		
		
		```
		public void assertDone​(scala.concurrent.duration.Duration max)
		```
		
		Assert that this filter has matched as often as requested by its
		 `occurrences` parameter specifies.
		- #### intercept
		
		
		
		```
		public <T> T intercept​(scala.Function0<T> code,
		                       [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Apply this filter while executing the given code block. Care is taken to
		 remove the filter when the block is finished or aborted.
		- #### source
		
		
		
		```
		protected scala.Option<java.lang.String> source()
		```
		- #### message
		
		
		
		```
		protected scala.util.Either<java.lang.String,​scala.util.matching.Regex> message()
		```
		- #### complete
		
		
		
		```
		protected boolean complete()
		```
		- #### doMatch
		
		
		
		```
		protected boolean doMatch​(java.lang.String src,
		                          java.lang.Object msg)
		```
		
		internal implementation helper, no guaranteed API

## Code Examples

### Example 1: warning

```text
EventFilter.warning()                                         // filter only on warning event
 EventFilter.warning(source = obj)                             // filter on event source
 EventFilter.warning(start = "Expected")                       // filter on start of message
 EventFilter.warning(source = obj, pattern = "weird.*message") // filter on pattern and message
```

### Example 2: info

```text
EventFilter.info()                                         // filter only on info event
 EventFilter.info(source = obj)                             // filter on event source
 EventFilter.info(start = "Expected")                       // filter on start of message
 EventFilter.info(source = obj, pattern = "weird.*message") // filter on pattern and message
```

### Example 3: debug

```text
EventFilter.debug()                                         // filter only on debug type
 EventFilter.debug(source = obj)                             // filter on event source
 EventFilter.debug(start = "Expected")                       // filter on start of message
 EventFilter.debug(source = obj, pattern = "weird.*message") // filter on pattern and message
```

### Example 4: custom

```text
EventFilter.custom {
   case Warning(ref, "my warning") if ref == actor || ref == null => true
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.LogEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/CustomEventFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DeadLettersFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/DebugFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/ErrorFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/EventFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/InfoFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/WarningFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/EventFilter.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/EventFilter.html)*