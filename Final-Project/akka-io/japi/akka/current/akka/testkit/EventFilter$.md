---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:48:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/testkit/EventFilter$.html
title: EventFilter$
---

# EventFilter$

## Content

Package [akka.testkit](package-summary.html)
## Class EventFilter$

- java.lang.Object
- - akka.testkit.EventFilter$

- ---

```
public class EventFilter$
extends java.lang.Object
```

Facilities for selectively filtering out expected events from logging so
 that you can keep your test run\&rsquo;s console output clean and do not miss real
 error messages.
 
 '''Also have a look at the `akka.testkit` package object\&rsquo;s `filterEvents` and
 `filterException` methods.'''
 

 The source filters do accept `Class[_]` arguments, matching any
 object which is an instance of the given class, e.g.
 

```

 EventFilter.info(source = classOf[MyActor]) // will match Info events from any MyActor instance
 
```

 The message object will be converted to a string before matching (`"null"` if it is `null`).

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventFilter$](EventFilter$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventFilter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A extends java.lang.Throwable>[EventFilter](EventFilter.html "class in akka.testkit")` | `[apply](#apply(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,scala.reflect.ClassTag))​(java.lang.String message,  java.lang.String source,  java.lang.String start,  java.lang.String pattern,  int occurrences,  scala.reflect.ClassTag<A> evidence$1)` | Create a filter for Error events. |
	| `<A extends java.lang.Throwable>java.lang.String` | `[apply$default$1](#apply$default$1())()` |  |
	| `<A extends java.lang.Throwable>java.lang.String` | `[apply$default$2](#apply$default$2())()` |  |
	| `<A extends java.lang.Throwable>java.lang.String` | `[apply$default$3](#apply$default$3())()` |  |
	| `<A extends java.lang.Throwable>java.lang.String` | `[apply$default$4](#apply$default$4())()` |  |
	| `<A extends java.lang.Throwable>int` | `[apply$default$5](#apply$default$5())()` |  |
	| `[EventFilter](EventFilter.html "class in akka.testkit")` | `[custom](#custom(scala.PartialFunction,int))​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,  int occurrences)` | Create a custom event filter. |
	| `int` | `[custom$default$2](#custom$default$2())()` |  |
	| `[EventFilter](EventFilter.html "class in akka.testkit")` | `[debug](#debug(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int))​(java.lang.String message,  java.lang.String source,  java.lang.String start,  java.lang.String pattern,  int occurrences)` | Create a filter for Debug events. |
	| `java.lang.String` | `[debug$default$1](#debug$default$1())()` |  |
	| `java.lang.String` | `[debug$default$2](#debug$default$2())()` |  |
	| `java.lang.String` | `[debug$default$3](#debug$default$3())()` |  |
	| `java.lang.String` | `[debug$default$4](#debug$default$4())()` |  |
	| `int` | `[debug$default$5](#debug$default$5())()` |  |
	| `[EventFilter](EventFilter.html "class in akka.testkit")` | `[error](#error(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int))​(java.lang.String message,  java.lang.String source,  java.lang.String start,  java.lang.String pattern,  int occurrences)` | Create a filter for Error events. |
	| `java.lang.String` | `[error$default$1](#error$default$1())()` |  |
	| `java.lang.String` | `[error$default$2](#error$default$2())()` |  |
	| `java.lang.String` | `[error$default$3](#error$default$3())()` |  |
	| `java.lang.String` | `[error$default$4](#error$default$4())()` |  |
	| `int` | `[error$default$5](#error$default$5())()` |  |
	| `[EventFilter](EventFilter.html "class in akka.testkit")` | `[info](#info(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int))​(java.lang.String message,  java.lang.String source,  java.lang.String start,  java.lang.String pattern,  int occurrences)` | Create a filter for Info events. |
	| `java.lang.String` | `[info$default$1](#info$default$1())()` |  |
	| `java.lang.String` | `[info$default$2](#info$default$2())()` |  |
	| `java.lang.String` | `[info$default$3](#info$default$3())()` |  |
	| `java.lang.String` | `[info$default$4](#info$default$4())()` |  |
	| `int` | `[info$default$5](#info$default$5())()` |  |
	| `[EventFilter](EventFilter.html "class in akka.testkit")` | `[warning](#warning(java.lang.String,java.lang.String,java.lang.String,java.lang.String,int))​(java.lang.String message,  java.lang.String source,  java.lang.String start,  java.lang.String pattern,  int occurrences)` | Create a filter for Warning events. |
	| `java.lang.String` | `[warning$default$1](#warning$default$1())()` |  |
	| `java.lang.String` | `[warning$default$2](#warning$default$2())()` |  |
	| `java.lang.String` | `[warning$default$3](#warning$default$3())()` |  |
	| `java.lang.String` | `[warning$default$4](#warning$default$4())()` |  |
	| `int` | `[warning$default$5](#warning$default$5())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventFilter$](EventFilter$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventFilter$
		
		
		
		```
		public EventFilter$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A extends java.lang.Throwable> [EventFilter](EventFilter.html "class in akka.testkit") apply​(java.lang.String message,
		                                                         java.lang.String source,
		                                                         java.lang.String start,
		                                                         java.lang.String pattern,
		                                                         int occurrences,
		                                                         scala.reflect.ClassTag<A> evidence$1)
		```
		
		Create a filter for Error events. Give up to one of `start` and `pattern`:
		 
		
		
		
		```
		
		 EventFilter[MyException]()                                         // filter only on exception type
		 EventFilter[MyException]("message")                                // filter on exactly matching message
		 EventFilter[MyException](source = obj)                             // filter on event source
		 EventFilter[MyException](start = "Expected")                       // filter on start of message
		 EventFilter[MyException](source = obj, pattern = "weird.*message") // filter on pattern and message
		 
		```
		
		
		 ''Please note that filtering on the `source` being
		 `null` does NOT work (passing `null` disables the
		 source filter).''
		- #### apply$default$1
		
		
		
		```
		public <A extends java.lang.Throwable> java.lang.String apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public <A extends java.lang.Throwable> java.lang.String apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public <A extends java.lang.Throwable> java.lang.String apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public <A extends java.lang.Throwable> java.lang.String apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public <A extends java.lang.Throwable> int apply$default$5()
		```
		- #### error
		
		
		
		```
		public [EventFilter](EventFilter.html "class in akka.testkit") error​(java.lang.String message,
		                         java.lang.String source,
		                         java.lang.String start,
		                         java.lang.String pattern,
		                         int occurrences)
		```
		
		Create a filter for Error events. See apply() for more details.
		- #### error$default$1
		
		
		
		```
		public java.lang.String error$default$1()
		```
		- #### error$default$2
		
		
		
		```
		public java.lang.String error$default$2()
		```
		- #### error$default$3
		
		
		
		```
		public java.lang.String error$default$3()
		```
		- #### error$default$4
		
		
		
		```
		public java.lang.String error$default$4()
		```
		- #### error$default$5
		
		
		
		```
		public int error$default$5()
		```
		- #### warning
		
		
		
		```
		public [EventFilter](EventFilter.html "class in akka.testkit") warning​(java.lang.String message,
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
		public java.lang.String warning$default$1()
		```
		- #### warning$default$2
		
		
		
		```
		public java.lang.String warning$default$2()
		```
		- #### warning$default$3
		
		
		
		```
		public java.lang.String warning$default$3()
		```
		- #### warning$default$4
		
		
		
		```
		public java.lang.String warning$default$4()
		```
		- #### warning$default$5
		
		
		
		```
		public int warning$default$5()
		```
		- #### info
		
		
		
		```
		public [EventFilter](EventFilter.html "class in akka.testkit") info​(java.lang.String message,
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
		public java.lang.String info$default$1()
		```
		- #### info$default$2
		
		
		
		```
		public java.lang.String info$default$2()
		```
		- #### info$default$3
		
		
		
		```
		public java.lang.String info$default$3()
		```
		- #### info$default$4
		
		
		
		```
		public java.lang.String info$default$4()
		```
		- #### info$default$5
		
		
		
		```
		public int info$default$5()
		```
		- #### debug
		
		
		
		```
		public [EventFilter](EventFilter.html "class in akka.testkit") debug​(java.lang.String message,
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
		public java.lang.String debug$default$1()
		```
		- #### debug$default$2
		
		
		
		```
		public java.lang.String debug$default$2()
		```
		- #### debug$default$3
		
		
		
		```
		public java.lang.String debug$default$3()
		```
		- #### debug$default$4
		
		
		
		```
		public java.lang.String debug$default$4()
		```
		- #### debug$default$5
		
		
		
		```
		public int debug$default$5()
		```
		- #### custom
		
		
		
		```
		public [EventFilter](EventFilter.html "class in akka.testkit") custom​(scala.PartialFunction<[Logging.LogEvent](../event/Logging.LogEvent.html "interface in akka.event"),​java.lang.Object> test,
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
		public int custom$default$2()
		```

## Code Examples

### Example 1: Class EventFilter$

```text
EventFilter.info(source = classOf[MyActor]) // will match Info events from any MyActor instance
```

### Example 2: apply

```text
EventFilter[MyException]()                                         // filter only on exception type
 EventFilter[MyException]("message")                                // filter on exactly matching message
 EventFilter[MyException](source = obj)                             // filter on event source
 EventFilter[MyException](start = "Expected")                       // filter on start of message
 EventFilter[MyException](source = obj, pattern = "weird.*message") // filter on pattern and message
```

### Example 3: warning

```text
EventFilter.warning()                                         // filter only on warning event
 EventFilter.warning(source = obj)                             // filter on event source
 EventFilter.warning(start = "Expected")                       // filter on start of message
 EventFilter.warning(source = obj, pattern = "weird.*message") // filter on pattern and message
```

### Example 4: info

```text
EventFilter.info()                                         // filter only on info event
 EventFilter.info(source = obj)                             // filter on event source
 EventFilter.info(start = "Expected")                       // filter on start of message
 EventFilter.info(source = obj, pattern = "weird.*message") // filter on pattern and message
```

### Example 5: debug

```text
EventFilter.debug()                                         // filter only on debug type
 EventFilter.debug(source = obj)                             // filter on event source
 EventFilter.debug(start = "Expected")                       // filter on start of message
 EventFilter.debug(source = obj, pattern = "weird.*message") // filter on pattern and message
```

### Example 6: custom

```text
EventFilter.custom {
   case Warning(ref, "my warning") if ref == actor || ref == null => true
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/Logging.LogEvent.html
- https://doc.akka.io/japi/akka/current/akka/testkit/EventFilter$.html
- https://doc.akka.io/japi/akka/current/akka/testkit/EventFilter.html
- https://doc.akka.io/japi/akka/current/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/testkit/EventFilter$.html](https://doc.akka.io/japi/akka/current/akka/testkit/EventFilter$.html)*