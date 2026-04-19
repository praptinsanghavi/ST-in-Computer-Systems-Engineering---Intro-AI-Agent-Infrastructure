---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:08:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MonitorableThreadFactory.html
title: MonitorableThreadFactory
---

# MonitorableThreadFactory

## Content

Package [akka.dispatch](package-summary.html)
## Class MonitorableThreadFactory

- java.lang.Object
- - akka.dispatch.MonitorableThreadFactory

- All Implemented Interfaces:
`java.io.Serializable`, `java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory`, `java.util.concurrent.ThreadFactory`, `scala.Equals`, `scala.Product`

---

```
public final class MonitorableThreadFactory
extends java.lang.Object
implements java.util.concurrent.ThreadFactory, java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.MonitorableThreadFactory)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MonitorableThreadFactory](#%3Cinit%3E(java.lang.String,boolean,scala.Option,java.lang.Thread.UncaughtExceptionHandler,java.util.concurrent.atomic.AtomicLong))​(java.lang.String name,  boolean daemonic,  scala.Option<java.lang.ClassLoader> contextClassLoader,  java.lang.Thread.UncaughtExceptionHandler exceptionHandler,  java.util.concurrent.atomic.AtomicLong counter)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.Thread.UncaughtExceptionHandler` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `static java.util.concurrent.atomic.AtomicLong` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `static [MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch")` | `[apply](#apply(java.lang.String,boolean,scala.Option,java.lang.Thread.UncaughtExceptionHandler,java.util.concurrent.atomic.AtomicLong))​(java.lang.String name,  boolean daemonic,  scala.Option<java.lang.ClassLoader> contextClassLoader,  java.lang.Thread.UncaughtExceptionHandler exceptionHandler,  java.util.concurrent.atomic.AtomicLong counter)` |  |
	| `static java.lang.Thread.UncaughtExceptionHandler` | `[apply$default$4](#apply$default$4())()` |  |
	| `static java.util.concurrent.atomic.AtomicLong` | `[apply$default$5](#apply$default$5())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.Option<java.lang.ClassLoader>` | `[contextClassLoader](#contextClassLoader())()` |  |
	| `[MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch")` | `[copy](#copy(java.lang.String,boolean,scala.Option,java.lang.Thread.UncaughtExceptionHandler,java.util.concurrent.atomic.AtomicLong))​(java.lang.String name,  boolean daemonic,  scala.Option<java.lang.ClassLoader> contextClassLoader,  java.lang.Thread.UncaughtExceptionHandler exceptionHandler,  java.util.concurrent.atomic.AtomicLong counter)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.Option<java.lang.ClassLoader>` | `[copy$default$3](#copy$default$3())()` |  |
	| `java.lang.Thread.UncaughtExceptionHandler` | `[copy$default$4](#copy$default$4())()` |  |
	| `java.util.concurrent.atomic.AtomicLong` | `[copy$default$5](#copy$default$5())()` |  |
	| `protected java.util.concurrent.atomic.AtomicLong` | `[counter](#counter())()` |  |
	| `java.util.concurrent.atomic.AtomicLong` | `[counter$access$4](#counter$access$4())()` |  |
	| `boolean` | `[daemonic](#daemonic())()` |  |
	| `static java.lang.Thread.UncaughtExceptionHandler` | `[doNothing](#doNothing())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Thread.UncaughtExceptionHandler` | `[exceptionHandler](#exceptionHandler())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `java.lang.Thread` | `[newThread](#newThread(java.lang.Runnable))​(java.lang.Runnable runnable)` |  |
	| `java.util.concurrent.ForkJoinWorkerThread` | `[newThread](#newThread(java.util.concurrent.ForkJoinPool))​(java.util.concurrent.ForkJoinPool pool)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple5<java.lang.String,​java.lang.Object,​scala.Option<java.lang.ClassLoader>,​java.lang.Thread.UncaughtExceptionHandler,​java.util.concurrent.atomic.AtomicLong>>` | `[unapply](#unapply(akka.dispatch.MonitorableThreadFactory))​([MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch") x$0)` |  |
	| `protected <T extends java.lang.Thread>T` | `[wire](#wire(T))​(T t)` |  |
	| `[MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch")` | `[withName](#withName(java.lang.String))​(java.lang.String newName)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### MonitorableThreadFactory
		
		
		
		```
		public MonitorableThreadFactory​(java.lang.String name,
		                                boolean daemonic,
		                                scala.Option<java.lang.ClassLoader> contextClassLoader,
		                                java.lang.Thread.UncaughtExceptionHandler exceptionHandler,
		                                java.util.concurrent.atomic.AtomicLong counter)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$4
		
		
		
		```
		public static java.lang.Thread.UncaughtExceptionHandler $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public static java.util.concurrent.atomic.AtomicLong $lessinit$greater$default$5()
		```
		- #### doNothing
		
		
		
		```
		public static java.lang.Thread.UncaughtExceptionHandler doNothing()
		```
		- #### apply
		
		
		
		```
		public static [MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch") apply​(java.lang.String name,
		                                             boolean daemonic,
		                                             scala.Option<java.lang.ClassLoader> contextClassLoader,
		                                             java.lang.Thread.UncaughtExceptionHandler exceptionHandler,
		                                             java.util.concurrent.atomic.AtomicLong counter)
		```
		- #### apply$default$4
		
		
		
		```
		public static java.lang.Thread.UncaughtExceptionHandler apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public static java.util.concurrent.atomic.AtomicLong apply$default$5()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple5<java.lang.String,​java.lang.Object,​scala.Option<java.lang.ClassLoader>,​java.lang.Thread.UncaughtExceptionHandler,​java.util.concurrent.atomic.AtomicLong>> unapply​([MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch") x$0)
		```
		- #### counter$access$4
		
		
		
		```
		public java.util.concurrent.atomic.AtomicLong counter$access$4()
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### daemonic
		
		
		
		```
		public boolean daemonic()
		```
		- #### contextClassLoader
		
		
		
		```
		public scala.Option<java.lang.ClassLoader> contextClassLoader()
		```
		- #### exceptionHandler
		
		
		
		```
		public java.lang.Thread.UncaughtExceptionHandler exceptionHandler()
		```
		- #### counter
		
		
		
		```
		protected java.util.concurrent.atomic.AtomicLong counter()
		```
		- #### newThread
		
		
		
		```
		public java.util.concurrent.ForkJoinWorkerThread newThread​(java.util.concurrent.ForkJoinPool pool)
		```
		
		
		Specified by:
		`newThread` in interface `java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory`
		- #### newThread
		
		
		
		```
		public java.lang.Thread newThread​(java.lang.Runnable runnable)
		```
		
		
		Specified by:
		`newThread` in interface `java.util.concurrent.ThreadFactory`
		- #### withName
		
		
		
		```
		public [MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch") withName​(java.lang.String newName)
		```
		- #### wire
		
		
		
		```
		protected <T extends java.lang.Thread> T wire​(T t)
		```
		- #### copy
		
		
		
		```
		public [MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch") copy​(java.lang.String name,
		                                     boolean daemonic,
		                                     scala.Option<java.lang.ClassLoader> contextClassLoader,
		                                     java.lang.Thread.UncaughtExceptionHandler exceptionHandler,
		                                     java.util.concurrent.atomic.AtomicLong counter)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public boolean copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public scala.Option<java.lang.ClassLoader> copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public java.lang.Thread.UncaughtExceptionHandler copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public java.util.concurrent.atomic.AtomicLong copy$default$5()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MonitorableThreadFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MonitorableThreadFactory.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MonitorableThreadFactory.html)*