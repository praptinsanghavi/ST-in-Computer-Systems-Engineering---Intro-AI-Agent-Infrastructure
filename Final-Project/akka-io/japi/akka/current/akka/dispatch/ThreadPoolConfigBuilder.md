---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/ThreadPoolConfigBuilder.html
title: ThreadPoolConfigBuilder
---

# ThreadPoolConfigBuilder

## Content

Package [akka.dispatch](package-summary.html)
## Class ThreadPoolConfigBuilder

- java.lang.Object
- - akka.dispatch.ThreadPoolConfigBuilder

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ThreadPoolConfigBuilder
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

A DSL to configure and create a MessageDispatcher with a ThreadPoolExecutor

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.ThreadPoolConfigBuilder)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThreadPoolConfigBuilder](#%3Cinit%3E(akka.dispatch.ThreadPoolConfig))​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[apply](#apply(akka.dispatch.ThreadPoolConfig))​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") config)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")` | `[config](#config())()` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[configure](#configure(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<scala.Option<scala.Function1<[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch"),​[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")>>> fs)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[copy](#copy(akka.dispatch.ThreadPoolConfig))​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") config)` |  |
	| `[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[setAllowCoreThreadTimeout](#setAllowCoreThreadTimeout(boolean))​(boolean allow)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[setCorePoolSize](#setCorePoolSize(int))​(int size)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[setCorePoolSizeFromFactor](#setCorePoolSizeFromFactor(int,double,int))​(int min,  double multiplier,  int max)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[setFixedPoolSize](#setFixedPoolSize(int))​(int size)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[setKeepAliveTime](#setKeepAliveTime(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration time)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[setKeepAliveTimeInMillis](#setKeepAliveTimeInMillis(long))​(long time)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[setMaxPoolSize](#setMaxPoolSize(int))​(int size)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[setMaxPoolSizeFromFactor](#setMaxPoolSizeFromFactor(int,double,int))​(int min,  double multiplier,  int max)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[setQueueFactory](#setQueueFactory(scala.Function0))​(scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> newQueueFactory)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")>` | `[unapply](#unapply(akka.dispatch.ThreadPoolConfigBuilder))​([ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") x$0)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[withNewThreadPoolWithArrayBlockingQueueWithCapacityAndFairness](#withNewThreadPoolWithArrayBlockingQueueWithCapacityAndFairness(int,boolean))​(int capacity,  boolean fair)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[withNewThreadPoolWithCustomBlockingQueue](#withNewThreadPoolWithCustomBlockingQueue(java.util.concurrent.BlockingQueue))​(java.util.concurrent.BlockingQueue<java.lang.Runnable> queue)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[withNewThreadPoolWithCustomBlockingQueue](#withNewThreadPoolWithCustomBlockingQueue(scala.Function0))​(scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> newQueueFactory)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[withNewThreadPoolWithLinkedBlockingQueueWithCapacity](#withNewThreadPoolWithLinkedBlockingQueueWithCapacity(int))​(int capacity)` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[withNewThreadPoolWithLinkedBlockingQueueWithUnboundedCapacity](#withNewThreadPoolWithLinkedBlockingQueueWithUnboundedCapacity())()` |  |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[withNewThreadPoolWithSynchronousQueueWithFairness](#withNewThreadPoolWithSynchronousQueueWithFairness(boolean))​(boolean fair)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ThreadPoolConfigBuilder
		
		
		
		```
		public ThreadPoolConfigBuilder​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") config)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") apply​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") config)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")> unapply​([ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") x$0)
		```
		- #### config
		
		
		
		```
		public [ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") config()
		```
		- #### withNewThreadPoolWithCustomBlockingQueue
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") withNewThreadPoolWithCustomBlockingQueue​(scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> newQueueFactory)
		```
		- #### withNewThreadPoolWithCustomBlockingQueue
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") withNewThreadPoolWithCustomBlockingQueue​(java.util.concurrent.BlockingQueue<java.lang.Runnable> queue)
		```
		- #### withNewThreadPoolWithLinkedBlockingQueueWithUnboundedCapacity
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") withNewThreadPoolWithLinkedBlockingQueueWithUnboundedCapacity()
		```
		- #### withNewThreadPoolWithLinkedBlockingQueueWithCapacity
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") withNewThreadPoolWithLinkedBlockingQueueWithCapacity​(int capacity)
		```
		- #### withNewThreadPoolWithSynchronousQueueWithFairness
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") withNewThreadPoolWithSynchronousQueueWithFairness​(boolean fair)
		```
		- #### withNewThreadPoolWithArrayBlockingQueueWithCapacityAndFairness
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") withNewThreadPoolWithArrayBlockingQueueWithCapacityAndFairness​(int capacity,
		                                                                                              boolean fair)
		```
		- #### setFixedPoolSize
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") setFixedPoolSize​(int size)
		```
		- #### setCorePoolSize
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") setCorePoolSize​(int size)
		```
		- #### setMaxPoolSize
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") setMaxPoolSize​(int size)
		```
		- #### setCorePoolSizeFromFactor
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") setCorePoolSizeFromFactor​(int min,
		                                                         double multiplier,
		                                                         int max)
		```
		- #### setMaxPoolSizeFromFactor
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") setMaxPoolSizeFromFactor​(int min,
		                                                        double multiplier,
		                                                        int max)
		```
		- #### setKeepAliveTimeInMillis
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") setKeepAliveTimeInMillis​(long time)
		```
		- #### setKeepAliveTime
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") setKeepAliveTime​(scala.concurrent.duration.Duration time)
		```
		- #### setAllowCoreThreadTimeout
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") setAllowCoreThreadTimeout​(boolean allow)
		```
		- #### setQueueFactory
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") setQueueFactory​(scala.Function0<java.util.concurrent.BlockingQueue<java.lang.Runnable>> newQueueFactory)
		```
		- #### configure
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") configure​(scala.collection.immutable.Seq<scala.Option<scala.Function1<[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch"),​[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")>>> fs)
		```
		- #### copy
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") copy​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") config)
		```
		- #### copy$default$1
		
		
		
		```
		public [ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/dispatch/ThreadPoolConfig.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ThreadPoolConfigBuilder.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/ThreadPoolConfigBuilder.html](https://doc.akka.io/japi/akka/current/akka/dispatch/ThreadPoolConfigBuilder.html)*