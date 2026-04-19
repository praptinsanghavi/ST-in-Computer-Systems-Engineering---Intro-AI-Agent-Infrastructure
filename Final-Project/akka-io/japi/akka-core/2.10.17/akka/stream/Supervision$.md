---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:29:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Supervision$.html
title: Supervision$
---

# Supervision$

## Content

Package [akka.stream](package-summary.html)
## Class Supervision$

- java.lang.Object
- - akka.stream.Supervision$

- ---

```
public class Supervision$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Supervision$](Supervision$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Supervision$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Function](../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")>` | `[getRestartingDecider](#getRestartingDecider())()` | Java API: Decider function that returns [`restart()`](#restart()) for all exceptions. |
	| `[Function](../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")>` | `[getResumingDecider](#getResumingDecider())()` | Java API: Decider function that returns [`resume()`](#resume()) for all exceptions. |
	| `[Function](../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")>` | `[getStoppingDecider](#getStoppingDecider())()` | Java API: Decider function that returns [`stop()`](#stop()) for all exceptions. |
	| `[Supervision.Restart$](Supervision.Restart$.html "class in akka.stream")` | `[restart](#restart())()` | Java API: The element is dropped and the stream continues after restarting the operator  if application code for processing an element throws an exception. |
	| `scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")>` | `[restartingDecider](#restartingDecider())()` | Scala API: `Decider` that returns `Restart` for all exceptions. |
	| `[Supervision.Resume$](Supervision.Resume$.html "class in akka.stream")` | `[resume](#resume())()` | Java API: The element is dropped and the stream continues if application code for processing  an element throws an exception. |
	| `scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")>` | `[resumingDecider](#resumingDecider())()` | Scala API: `Decider` that returns `Resume` for all exceptions. |
	| `[Supervision.Stop$](Supervision.Stop$.html "class in akka.stream")` | `[stop](#stop())()` | Java API: The stream will be completed with failure if application code for processing an element  throws an exception. |
	| `scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")>` | `[stoppingDecider](#stoppingDecider())()` | Scala API: `Decider` that returns `Stop` for all exceptions. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Supervision$](Supervision$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Supervision$
		
		
		
		```
		public Supervision$()
		```

	- ### Method Detail
	
	
	
		- #### stop
		
		
		
		```
		public [Supervision.Stop$](Supervision.Stop$.html "class in akka.stream") stop()
		```
		
		Java API: The stream will be completed with failure if application code for processing an element
		 throws an exception.
		- #### resume
		
		
		
		```
		public [Supervision.Resume$](Supervision.Resume$.html "class in akka.stream") resume()
		```
		
		Java API: The element is dropped and the stream continues if application code for processing
		 an element throws an exception.
		- #### restart
		
		
		
		```
		public [Supervision.Restart$](Supervision.Restart$.html "class in akka.stream") restart()
		```
		
		Java API: The element is dropped and the stream continues after restarting the operator
		 if application code for processing an element throws an exception.
		 Restarting an operator means that any accumulated state is cleared. This is typically
		 performed by creating a new instance of the operator.
		- #### stoppingDecider
		
		
		
		```
		public scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> stoppingDecider()
		```
		
		Scala API: `Decider` that returns `Stop` for all exceptions.
		- #### getStoppingDecider
		
		
		
		```
		public [Function](../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> getStoppingDecider()
		```
		
		Java API: Decider function that returns [`stop()`](#stop()) for all exceptions.
		- #### resumingDecider
		
		
		
		```
		public scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> resumingDecider()
		```
		
		Scala API: `Decider` that returns `Resume` for all exceptions.
		- #### getResumingDecider
		
		
		
		```
		public [Function](../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> getResumingDecider()
		```
		
		Java API: Decider function that returns [`resume()`](#resume()) for all exceptions.
		- #### restartingDecider
		
		
		
		```
		public scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> restartingDecider()
		```
		
		Scala API: `Decider` that returns `Restart` for all exceptions.
		- #### getRestartingDecider
		
		
		
		```
		public [Function](../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> getRestartingDecider()
		```
		
		Java API: Decider function that returns [`restart()`](#restart()) for all exceptions.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Supervision$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Supervision.Directive.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Supervision.Restart$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Supervision.Resume$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Supervision.Stop$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Supervision$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Supervision$.html)*