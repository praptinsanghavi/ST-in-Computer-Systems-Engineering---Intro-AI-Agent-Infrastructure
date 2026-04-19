---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/MonitorableThreadFactory$.html
title: MonitorableThreadFactory$
---

# MonitorableThreadFactory$

## Content

Package [akka.dispatch](package-summary.html)
## Class MonitorableThreadFactory$

- java.lang.Object
- - akka.dispatch.MonitorableThreadFactory$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class MonitorableThreadFactory$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.MonitorableThreadFactory$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MonitorableThreadFactory$](MonitorableThreadFactory$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MonitorableThreadFactory$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Thread.UncaughtExceptionHandler` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `java.util.concurrent.atomic.AtomicLong` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `[MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch")` | `[apply](#apply(java.lang.String,boolean,scala.Option,java.lang.Thread.UncaughtExceptionHandler,java.util.concurrent.atomic.AtomicLong))​(java.lang.String name,  boolean daemonic,  scala.Option<java.lang.ClassLoader> contextClassLoader,  java.lang.Thread.UncaughtExceptionHandler exceptionHandler,  java.util.concurrent.atomic.AtomicLong counter)` |  |
	| `java.lang.Thread.UncaughtExceptionHandler` | `[apply$default$4](#apply$default$4())()` |  |
	| `java.util.concurrent.atomic.AtomicLong` | `[apply$default$5](#apply$default$5())()` |  |
	| `java.lang.Thread.UncaughtExceptionHandler` | `[doNothing](#doNothing())()` |  |
	| `scala.Option<scala.Tuple5<java.lang.String,​java.lang.Object,​scala.Option<java.lang.ClassLoader>,​java.lang.Thread.UncaughtExceptionHandler,​java.util.concurrent.atomic.AtomicLong>>` | `[unapply](#unapply(akka.dispatch.MonitorableThreadFactory))​([MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MonitorableThreadFactory$](MonitorableThreadFactory$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MonitorableThreadFactory$
		
		
		
		```
		public MonitorableThreadFactory$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$4
		
		
		
		```
		public java.lang.Thread.UncaughtExceptionHandler $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public java.util.concurrent.atomic.AtomicLong $lessinit$greater$default$5()
		```
		- #### doNothing
		
		
		
		```
		public java.lang.Thread.UncaughtExceptionHandler doNothing()
		```
		- #### apply
		
		
		
		```
		public [MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch") apply​(java.lang.String name,
		                                      boolean daemonic,
		                                      scala.Option<java.lang.ClassLoader> contextClassLoader,
		                                      java.lang.Thread.UncaughtExceptionHandler exceptionHandler,
		                                      java.util.concurrent.atomic.AtomicLong counter)
		```
		- #### apply$default$4
		
		
		
		```
		public java.lang.Thread.UncaughtExceptionHandler apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public java.util.concurrent.atomic.AtomicLong apply$default$5()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple5<java.lang.String,​java.lang.Object,​scala.Option<java.lang.ClassLoader>,​java.lang.Thread.UncaughtExceptionHandler,​java.util.concurrent.atomic.AtomicLong>> unapply​([MonitorableThreadFactory](MonitorableThreadFactory.html "class in akka.dispatch") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/MonitorableThreadFactory$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MonitorableThreadFactory.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/MonitorableThreadFactory$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/MonitorableThreadFactory$.html)*