---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:51:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JavaFlowSupport.Source.html
title: JavaFlowSupport.Source
---

# JavaFlowSupport.Source

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class JavaFlowSupport.Source

- java.lang.Object
- - akka.stream.javadsl.JavaFlowSupport.Source

- Enclosing class:
[JavaFlowSupport](JavaFlowSupport.html "class in akka.stream.javadsl")

---

```
public static final class JavaFlowSupport.Source
extends java.lang.Object
```

{@link akka.stream.javadsl.Flow]] factories operating with `java.util.concurrent.Flow.*` interfaces.

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.Flow.Subscriber<T>>` | `[asSubscriber](#asSubscriber())()` | Creates a `Source` that is materialized as a `Flow.Subscriber`. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromPublisher](#fromPublisher(java.util.concurrent.Flow.Publisher))​(java.util.concurrent.Flow.Publisher<T> publisher)` | Helper to create `Source` from `Flow.Publisher`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### fromPublisher
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromPublisher​(java.util.concurrent.Flow.Publisher<T> publisher)
		```
		
		Helper to create `Source` from `Flow.Publisher`.
		
		 Construct a transformation starting with given publisher. The transformation steps are
		 executed by a series of `Flow.Processor` instances that mediate
		 the flow of elements downstream and the propagation of back\-pressure upstream.
		
		 
		
		See also `Source.fromPublisher` if wanting to integrate with `Publisher` instead (which carries the same semantics, however existed
		 before RS's inclusion in Java 9\).
		- #### asSubscriber
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.Flow.Subscriber<T>> asSubscriber()
		```
		
		Creates a `Source` that is materialized as a `Flow.Subscriber`.
		
		 See also `Source.asSubscriber` if wanting to integrate with `Subscriber` instead (which carries the same semantics, however existed
		 before RS's inclusion in Java 9\).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JavaFlowSupport.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JavaFlowSupport.Source.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JavaFlowSupport.Source.html)*