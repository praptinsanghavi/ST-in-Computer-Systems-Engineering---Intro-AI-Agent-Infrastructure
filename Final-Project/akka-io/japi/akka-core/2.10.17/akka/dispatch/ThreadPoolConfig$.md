---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfig$.html
title: ThreadPoolConfig$
---

# ThreadPoolConfig$

## Content

Package [akka.dispatch](package-summary.html)
## Class ThreadPoolConfig$

- java.lang.Object
- - akka.dispatch.ThreadPoolConfig$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ThreadPoolConfig$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.ThreadPoolConfig$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ThreadPoolConfig$](ThreadPoolConfig$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThreadPoolConfig$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` | A small configuration DSL to create ThreadPoolExecutors that can be provided as an ExecutorServiceFactoryProvider to Dispatcher |
	| `int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `int` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `scala.concurrent.duration.Duration` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `java.util.concurrent.RejectedExecutionHandler` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")` | `[apply](#apply(boolean,int,int,scala.concurrent.duration.Duration,scala.Function0,java.util.concurrent.RejectedExecutionHandler))​(boolean allowCorePoolTimeout,  int corePoolSize,  int maxPoolSize,  scala.concurrent.duration.Duration threadTimeout,  scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory,  java.util.concurrent.RejectedExecutionHandler rejectionPolicy)` | A small configuration DSL to create ThreadPoolExecutors that can be provided as an ExecutorServiceFactoryProvider to Dispatcher |
	| `boolean` | `[apply$default$1](#apply$default$1())()` |  |
	| `int` | `[apply$default$2](#apply$default$2())()` |  |
	| `int` | `[apply$default$3](#apply$default$3())()` |  |
	| `scala.concurrent.duration.Duration` | `[apply$default$4](#apply$default$4())()` |  |
	| `scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[apply$default$5](#apply$default$5())()` |  |
	| `java.util.concurrent.RejectedExecutionHandler` | `[apply$default$6](#apply$default$6())()` |  |
	| `scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[arrayBlockingQueue](#arrayBlockingQueue(int,boolean))​(int capacity,  boolean fair)` |  |
	| `boolean` | `[defaultAllowCoreThreadTimeout](#defaultAllowCoreThreadTimeout())()` |  |
	| `int` | `[defaultCorePoolSize](#defaultCorePoolSize())()` |  |
	| `int` | `[defaultMaxPoolSize](#defaultMaxPoolSize())()` |  |
	| `java.util.concurrent.RejectedExecutionHandler` | `[defaultRejectionPolicy](#defaultRejectionPolicy())()` |  |
	| `scala.concurrent.duration.Duration` | `[defaultTimeout](#defaultTimeout())()` |  |
	| `scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[linkedBlockingQueue](#linkedBlockingQueue())()` |  |
	| `scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[linkedBlockingQueue](#linkedBlockingQueue(int))​(int capacity)` |  |
	| `scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[reusableQueue](#reusableQueue(java.util.concurrent.BlockingQueue))​(java.util.concurrent.BlockingQueue<java.lang.Runnable> queue)` |  |
	| `scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[reusableQueue](#reusableQueue(scala.Function0))​(scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory)` |  |
	| `int` | `[scaledPoolSize](#scaledPoolSize(int,double,int))​(int floor,  double multiplier,  int ceiling)` |  |
	| `scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[synchronousQueue](#synchronousQueue(boolean))​(boolean fair)` |  |
	| `scala.Option<scala.Tuple6<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>,​java.util.concurrent.RejectedExecutionHandler>>` | `[unapply](#unapply(akka.dispatch.ThreadPoolConfig))​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ThreadPoolConfig$](ThreadPoolConfig$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ThreadPoolConfig$
		
		
		
		```
		public ThreadPoolConfig$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public boolean $lessinit$greater$default$1()
		```
		
		A small configuration DSL to create ThreadPoolExecutors that can be provided as an ExecutorServiceFactoryProvider to Dispatcher
		- #### $lessinit$greater$default$2
		
		
		
		```
		public int $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public int $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public scala.concurrent.duration.Duration $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public java.util.concurrent.RejectedExecutionHandler $lessinit$greater$default$6()
		```
		- #### defaultAllowCoreThreadTimeout
		
		
		
		```
		public boolean defaultAllowCoreThreadTimeout()
		```
		- #### defaultCorePoolSize
		
		
		
		```
		public int defaultCorePoolSize()
		```
		- #### defaultMaxPoolSize
		
		
		
		```
		public int defaultMaxPoolSize()
		```
		- #### defaultTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration defaultTimeout()
		```
		- #### defaultRejectionPolicy
		
		
		
		```
		public java.util.concurrent.RejectedExecutionHandler defaultRejectionPolicy()
		```
		- #### scaledPoolSize
		
		
		
		```
		public int scaledPoolSize​(int floor,
		                          double multiplier,
		                          int ceiling)
		```
		- #### arrayBlockingQueue
		
		
		
		```
		public scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> arrayBlockingQueue​(int capacity,
		                                                                                                  boolean fair)
		```
		- #### synchronousQueue
		
		
		
		```
		public scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> synchronousQueue​(boolean fair)
		```
		- #### linkedBlockingQueue
		
		
		
		```
		public scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> linkedBlockingQueue()
		```
		- #### linkedBlockingQueue
		
		
		
		```
		public scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> linkedBlockingQueue​(int capacity)
		```
		- #### reusableQueue
		
		
		
		```
		public scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> reusableQueue​(java.util.concurrent.BlockingQueue<java.lang.Runnable> queue)
		```
		- #### reusableQueue
		
		
		
		```
		public scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> reusableQueue​(scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory)
		```
		- #### apply
		
		
		
		```
		public [ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") apply​(boolean allowCorePoolTimeout,
		                              int corePoolSize,
		                              int maxPoolSize,
		                              scala.concurrent.duration.Duration threadTimeout,
		                              scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory,
		                              java.util.concurrent.RejectedExecutionHandler rejectionPolicy)
		```
		
		A small configuration DSL to create ThreadPoolExecutors that can be provided as an ExecutorServiceFactoryProvider to Dispatcher
		- #### apply$default$1
		
		
		
		```
		public boolean apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public int apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public scala.concurrent.duration.Duration apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public java.util.concurrent.RejectedExecutionHandler apply$default$6()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple6<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>,​java.util.concurrent.RejectedExecutionHandler>> unapply​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfig$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfig$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfig$.html)*