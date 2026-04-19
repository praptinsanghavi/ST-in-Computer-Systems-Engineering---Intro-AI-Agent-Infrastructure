---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/OtherMessageComparator.html
title: OtherMessageComparator
---

# OtherMessageComparator

## Content

Package [akka.cluster.ddata.protobuf](package-summary.html)
## Class OtherMessageComparator

- java.lang.Object
- - akka.cluster.ddata.protobuf.OtherMessageComparator

- ---

```
public class OtherMessageComparator
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OtherMessageComparator](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static int` | `[compare](#compare(akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage,akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage))​([ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") a,  [ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") b)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static java.util.Comparator<T>` | `[reversed](#reversed())()` |  |
	| `static java.util.Comparator<T>` | `[thenComparing](#thenComparing(java.util.Comparator))​(java.util.Comparator<? super T> x$1)` |  |
	| `static <U extends java.lang.Comparable<? super U>>java.util.Comparator<T>` | `[thenComparing](#thenComparing(java.util.function.Function))​(java.util.function.Function<? super T,​? extends U> x$1)` |  |
	| `static <U> java.util.Comparator<T>` | `[thenComparing](#thenComparing(java.util.function.Function,java.util.Comparator))​(java.util.function.Function<? super T,​? extends U> x$1,  java.util.Comparator<? super U> x$2)` |  |
	| `static java.util.Comparator<T>` | `[thenComparingDouble](#thenComparingDouble(java.util.function.ToDoubleFunction))​(java.util.function.ToDoubleFunction<? super T> x$1)` |  |
	| `static java.util.Comparator<T>` | `[thenComparingInt](#thenComparingInt(java.util.function.ToIntFunction))​(java.util.function.ToIntFunction<? super T> x$1)` |  |
	| `static java.util.Comparator<T>` | `[thenComparingLong](#thenComparingLong(java.util.function.ToLongFunction))​(java.util.function.ToLongFunction<? super T> x$1)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### OtherMessageComparator
		
		
		
		```
		public OtherMessageComparator()
		```

	- ### Method Detail
	
	
	
		- #### compare
		
		
		
		```
		public static int compare​([ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") a,
		                          [ReplicatorMessages.OtherMessage](msg/ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") b)
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object x$1)
		```
		- #### reversed
		
		
		
		```
		public static java.util.Comparator<T> reversed()
		```
		- #### thenComparing
		
		
		
		```
		public static java.util.Comparator<T> thenComparing​(java.util.Comparator<? super T> x$1)
		```
		- #### thenComparing
		
		
		
		```
		public static <U> java.util.Comparator<T> thenComparing​(java.util.function.Function<? super T,​? extends U> x$1,
		                                                        java.util.Comparator<? super U> x$2)
		```
		- #### thenComparing
		
		
		
		```
		public static <U extends java.lang.Comparable<? super U>> java.util.Comparator<T> thenComparing​(java.util.function.Function<? super T,​? extends U> x$1)
		```
		- #### thenComparingInt
		
		
		
		```
		public static java.util.Comparator<T> thenComparingInt​(java.util.function.ToIntFunction<? super T> x$1)
		```
		- #### thenComparingLong
		
		
		
		```
		public static java.util.Comparator<T> thenComparingLong​(java.util.function.ToLongFunction<? super T> x$1)
		```
		- #### thenComparingDouble
		
		
		
		```
		public static java.util.Comparator<T> thenComparingDouble​(java.util.function.ToDoubleFunction<? super T> x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/OtherMessageComparator.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/protobuf/OtherMessageComparator.html)*