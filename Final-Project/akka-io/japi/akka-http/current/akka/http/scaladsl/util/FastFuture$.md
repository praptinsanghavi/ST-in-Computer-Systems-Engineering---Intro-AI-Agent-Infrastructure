---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/util/FastFuture$.html
title: FastFuture$
---

# FastFuture$

## Content

Package [akka.http.scaladsl.util](package-summary.html)
## Class FastFuture$

- java.lang.Object
- - akka.http.scaladsl.util.FastFuture$

- ---

```
public class FastFuture$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FastFuture$](FastFuture$.html "class in akka.http.scaladsl.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FastFuture$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.concurrent.Future<T>` | `[apply](#apply(scala.util.Try))​(scala.util.Try<T> value)` |  |
	| `scala.Function1<java.lang.Throwable,​scala.concurrent.Future<scala.runtime.Nothing$>>` | `[failed](#failed())()` |  |
	| `<T,​M extends scala.collection.IterableOnce<java.lang.Object>>scala.concurrent.Future<M>` | `[sequence](#sequence(M,scala.collection.BuildFrom,scala.concurrent.ExecutionContext))​(M in,  scala.collection.BuildFrom<M,​T,​M> cbf,  scala.concurrent.ExecutionContext executor)` |  |
	| `<T> scala.Function1<T,​scala.concurrent.Future<T>>` | `[successful](#successful())()` |  |
	| `<A,​B,​M extends scala.collection.IterableOnce<java.lang.Object>>scala.concurrent.Future<M>` | `[traverse](#traverse(M,scala.Function1,scala.collection.BuildFrom,scala.concurrent.ExecutionContext))​(M in,  scala.Function1<A,​scala.concurrent.Future<B>> fn,  scala.collection.BuildFrom<M,​B,​M> cbf,  scala.concurrent.ExecutionContext executor)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FastFuture$](FastFuture$.html "class in akka.http.scaladsl.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FastFuture$
		
		
		
		```
		public FastFuture$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> scala.concurrent.Future<T> apply​(scala.util.Try<T> value)
		```
		- #### successful
		
		
		
		```
		public <T> scala.Function1<T,​scala.concurrent.Future<T>> successful()
		```
		- #### failed
		
		
		
		```
		public scala.Function1<java.lang.Throwable,​scala.concurrent.Future<scala.runtime.Nothing$>> failed()
		```
		- #### sequence
		
		
		
		```
		public <T,​M extends scala.collection.IterableOnce<java.lang.Object>> scala.concurrent.Future<M> sequence​(M in,
		                                                                                                               scala.collection.BuildFrom<M,​T,​M> cbf,
		                                                                                                               scala.concurrent.ExecutionContext executor)
		```
		- #### traverse
		
		
		
		```
		public <A,​B,​M extends scala.collection.IterableOnce<java.lang.Object>> scala.concurrent.Future<M> traverse​(M in,
		                                                                                                                       scala.Function1<A,​scala.concurrent.Future<B>> fn,
		                                                                                                                       scala.collection.BuildFrom<M,​B,​M> cbf,
		                                                                                                                       scala.concurrent.ExecutionContext executor)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/util/FastFuture$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/util/FastFuture$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/util/FastFuture$.html)*