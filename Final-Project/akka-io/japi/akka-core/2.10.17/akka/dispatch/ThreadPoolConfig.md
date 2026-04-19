---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfig.html
title: ThreadPoolConfig
---

# ThreadPoolConfig

## Content

Package [akka.dispatch](package-summary.html)
## Class ThreadPoolConfig

- java.lang.Object
- - akka.dispatch.ThreadPoolConfig

- All Implemented Interfaces:
`[ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ThreadPoolConfig
extends java.lang.Object
implements [ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.ThreadPoolConfig)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[ThreadPoolConfig.ThreadPoolExecutorServiceFactory](ThreadPoolConfig.ThreadPoolExecutorServiceFactory.html "class in akka.dispatch")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThreadPoolConfig](#%3Cinit%3E(boolean,int,int,scala.concurrent.duration.Duration,scala.Function0,java.util.concurrent.RejectedExecutionHandler))​(boolean allowCorePoolTimeout,  int corePoolSize,  int maxPoolSize,  scala.concurrent.duration.Duration threadTimeout,  scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory,  java.util.concurrent.RejectedExecutionHandler rejectionPolicy)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` | A small configuration DSL to create ThreadPoolExecutors that can be provided as an ExecutorServiceFactoryProvider to Dispatcher |
	| `static int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static int` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static scala.concurrent.duration.Duration` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `static java.util.concurrent.RejectedExecutionHandler` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `boolean` | `[allowCorePoolTimeout](#allowCorePoolTimeout())()` |  |
	| `static [ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")` | `[apply](#apply(boolean,int,int,scala.concurrent.duration.Duration,scala.Function0,java.util.concurrent.RejectedExecutionHandler))​(boolean allowCorePoolTimeout,  int corePoolSize,  int maxPoolSize,  scala.concurrent.duration.Duration threadTimeout,  scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory,  java.util.concurrent.RejectedExecutionHandler rejectionPolicy)` | A small configuration DSL to create ThreadPoolExecutors that can be provided as an ExecutorServiceFactoryProvider to Dispatcher |
	| `static boolean` | `[apply$default$1](#apply$default$1())()` |  |
	| `static int` | `[apply$default$2](#apply$default$2())()` |  |
	| `static int` | `[apply$default$3](#apply$default$3())()` |  |
	| `static scala.concurrent.duration.Duration` | `[apply$default$4](#apply$default$4())()` |  |
	| `static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[apply$default$5](#apply$default$5())()` |  |
	| `static java.util.concurrent.RejectedExecutionHandler` | `[apply$default$6](#apply$default$6())()` |  |
	| `static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[arrayBlockingQueue](#arrayBlockingQueue(int,boolean))​(int capacity,  boolean fair)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")` | `[copy](#copy(boolean,int,int,scala.concurrent.duration.Duration,scala.Function0,java.util.concurrent.RejectedExecutionHandler))​(boolean allowCorePoolTimeout,  int corePoolSize,  int maxPoolSize,  scala.concurrent.duration.Duration threadTimeout,  scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory,  java.util.concurrent.RejectedExecutionHandler rejectionPolicy)` |  |
	| `boolean` | `[copy$default$1](#copy$default$1())()` |  |
	| `int` | `[copy$default$2](#copy$default$2())()` |  |
	| `int` | `[copy$default$3](#copy$default$3())()` |  |
	| `scala.concurrent.duration.Duration` | `[copy$default$4](#copy$default$4())()` |  |
	| `scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[copy$default$5](#copy$default$5())()` |  |
	| `java.util.concurrent.RejectedExecutionHandler` | `[copy$default$6](#copy$default$6())()` |  |
	| `int` | `[corePoolSize](#corePoolSize())()` |  |
	| `[ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch")` | `[createExecutorServiceFactory](#createExecutorServiceFactory(java.lang.String,java.util.concurrent.ThreadFactory))​(java.lang.String id,  java.util.concurrent.ThreadFactory threadFactory)` |  |
	| `static boolean` | `[defaultAllowCoreThreadTimeout](#defaultAllowCoreThreadTimeout())()` |  |
	| `static int` | `[defaultCorePoolSize](#defaultCorePoolSize())()` |  |
	| `static int` | `[defaultMaxPoolSize](#defaultMaxPoolSize())()` |  |
	| `static java.util.concurrent.RejectedExecutionHandler` | `[defaultRejectionPolicy](#defaultRejectionPolicy())()` |  |
	| `static scala.concurrent.duration.Duration` | `[defaultTimeout](#defaultTimeout())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[linkedBlockingQueue](#linkedBlockingQueue())()` |  |
	| `static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[linkedBlockingQueue](#linkedBlockingQueue(int))​(int capacity)` |  |
	| `int` | `[maxPoolSize](#maxPoolSize())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[queueFactory](#queueFactory())()` |  |
	| `java.util.concurrent.RejectedExecutionHandler` | `[rejectionPolicy](#rejectionPolicy())()` |  |
	| `static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[reusableQueue](#reusableQueue(java.util.concurrent.BlockingQueue))​(java.util.concurrent.BlockingQueue<java.lang.Runnable> queue)` |  |
	| `static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[reusableQueue](#reusableQueue(scala.Function0))​(scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory)` |  |
	| `static int` | `[scaledPoolSize](#scaledPoolSize(int,double,int))​(int floor,  double multiplier,  int ceiling)` |  |
	| `static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>` | `[synchronousQueue](#synchronousQueue(boolean))​(boolean fair)` |  |
	| `scala.concurrent.duration.Duration` | `[threadTimeout](#threadTimeout())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple6<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>,​java.util.concurrent.RejectedExecutionHandler>>` | `[unapply](#unapply(akka.dispatch.ThreadPoolConfig))​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ThreadPoolConfig
		
		
		
		```
		public ThreadPoolConfig​(boolean allowCorePoolTimeout,
		                        int corePoolSize,
		                        int maxPoolSize,
		                        scala.concurrent.duration.Duration threadTimeout,
		                        scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory,
		                        java.util.concurrent.RejectedExecutionHandler rejectionPolicy)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static boolean $lessinit$greater$default$1()
		```
		
		A small configuration DSL to create ThreadPoolExecutors that can be provided as an ExecutorServiceFactoryProvider to Dispatcher
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static int $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static int $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public static scala.concurrent.duration.Duration $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public static java.util.concurrent.RejectedExecutionHandler $lessinit$greater$default$6()
		```
		- #### defaultAllowCoreThreadTimeout
		
		
		
		```
		public static boolean defaultAllowCoreThreadTimeout()
		```
		- #### defaultCorePoolSize
		
		
		
		```
		public static int defaultCorePoolSize()
		```
		- #### defaultMaxPoolSize
		
		
		
		```
		public static int defaultMaxPoolSize()
		```
		- #### defaultTimeout
		
		
		
		```
		public static scala.concurrent.duration.Duration defaultTimeout()
		```
		- #### defaultRejectionPolicy
		
		
		
		```
		public static java.util.concurrent.RejectedExecutionHandler defaultRejectionPolicy()
		```
		- #### scaledPoolSize
		
		
		
		```
		public static int scaledPoolSize​(int floor,
		                                 double multiplier,
		                                 int ceiling)
		```
		- #### arrayBlockingQueue
		
		
		
		```
		public static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> arrayBlockingQueue​(int capacity,
		                                                                                                         boolean fair)
		```
		- #### synchronousQueue
		
		
		
		```
		public static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> synchronousQueue​(boolean fair)
		```
		- #### linkedBlockingQueue
		
		
		
		```
		public static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> linkedBlockingQueue()
		```
		- #### linkedBlockingQueue
		
		
		
		```
		public static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> linkedBlockingQueue​(int capacity)
		```
		- #### reusableQueue
		
		
		
		```
		public static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> reusableQueue​(java.util.concurrent.BlockingQueue<java.lang.Runnable> queue)
		```
		- #### reusableQueue
		
		
		
		```
		public static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> reusableQueue​(scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory)
		```
		- #### apply
		
		
		
		```
		public static [ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") apply​(boolean allowCorePoolTimeout,
		                                     int corePoolSize,
		                                     int maxPoolSize,
		                                     scala.concurrent.duration.Duration threadTimeout,
		                                     scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory,
		                                     java.util.concurrent.RejectedExecutionHandler rejectionPolicy)
		```
		
		A small configuration DSL to create ThreadPoolExecutors that can be provided as an ExecutorServiceFactoryProvider to Dispatcher
		- #### apply$default$1
		
		
		
		```
		public static boolean apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public static int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static int apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public static scala.concurrent.duration.Duration apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public static scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public static java.util.concurrent.RejectedExecutionHandler apply$default$6()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple6<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.concurrent.duration.Duration,​scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>>,​java.util.concurrent.RejectedExecutionHandler>> unapply​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") x$0)
		```
		- #### allowCorePoolTimeout
		
		
		
		```
		public boolean allowCorePoolTimeout()
		```
		- #### corePoolSize
		
		
		
		```
		public int corePoolSize()
		```
		- #### maxPoolSize
		
		
		
		```
		public int maxPoolSize()
		```
		- #### threadTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration threadTimeout()
		```
		- #### queueFactory
		
		
		
		```
		public scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory()
		```
		- #### rejectionPolicy
		
		
		
		```
		public java.util.concurrent.RejectedExecutionHandler rejectionPolicy()
		```
		- #### createExecutorServiceFactory
		
		
		
		```
		public [ExecutorServiceFactory](ExecutorServiceFactory.html "interface in akka.dispatch") createExecutorServiceFactory​(java.lang.String id,
		                                                           java.util.concurrent.ThreadFactory threadFactory)
		```
		
		
		Specified by:
		`[createExecutorServiceFactory](ExecutorServiceFactoryProvider.html#createExecutorServiceFactory(java.lang.String,java.util.concurrent.ThreadFactory))` in interface `[ExecutorServiceFactoryProvider](ExecutorServiceFactoryProvider.html "interface in akka.dispatch")`
		- #### copy
		
		
		
		```
		public [ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") copy​(boolean allowCorePoolTimeout,
		                             int corePoolSize,
		                             int maxPoolSize,
		                             scala.concurrent.duration.Duration threadTimeout,
		                             scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> queueFactory,
		                             java.util.concurrent.RejectedExecutionHandler rejectionPolicy)
		```
		- #### copy$default$1
		
		
		
		```
		public boolean copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public int copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public int copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public scala.concurrent.duration.Duration copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public java.util.concurrent.RejectedExecutionHandler copy$default$6()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ExecutorServiceFactoryProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfig.ThreadPoolExecutorServiceFactory.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfig.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfig.html)*