---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/JavaFlowSupport.Source$.html
title: JavaFlowSupport.Source$
---

# JavaFlowSupport.Source$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class JavaFlowSupport.Source$

- java.lang.Object
- - akka.stream.scaladsl.JavaFlowSupport.Source$

- Enclosing class:
[JavaFlowSupport](JavaFlowSupport.html "class in akka.stream.scaladsl")

---

```
public static class JavaFlowSupport.Source$
extends java.lang.Object
```

[`Source`](Source.html "class in akka.stream.scaladsl") factories operating with `java.util.concurrent.Flow.*` interfaces.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JavaFlowSupport.Source$](JavaFlowSupport.Source$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Source$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​java.util.concurrent.Flow.Subscriber<T>>` | `[asSubscriber](#asSubscriber())()` | Creates a `Source` that is materialized as a `Flow.Subscriber` |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromPublisher](#fromPublisher(java.util.concurrent.Flow.Publisher))​(java.util.concurrent.Flow.Publisher<T> publisher)` | Helper to create [`Source`](Source.html "class in akka.stream.scaladsl") from `Flow.Publisher`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JavaFlowSupport.Source$](JavaFlowSupport.Source$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Source$
		
		
		
		```
		public Source$()
		```

	- ### Method Detail
	
	
	
		- #### fromPublisher
		
		
		
		```
		public final <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromPublisher​(java.util.concurrent.Flow.Publisher<T> publisher)
		```
		
		Helper to create [`Source`](Source.html "class in akka.stream.scaladsl") from `Flow.Publisher`.
		 
		 Construct a transformation starting with given publisher. The transformation steps
		 are executed by a series of `Flow.Processor` instances
		 that mediate the flow of elements downstream and the propagation of
		 back\-pressure upstream.
		 
		
		
		
		See Also:
		`also if wanting to integrate with instead
		 (which carries the same semantics, however existed before RS's inclusion in Java 9).`
		- #### asSubscriber
		
		
		
		```
		public final <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​java.util.concurrent.Flow.Subscriber<T>> asSubscriber()
		```
		
		Creates a `Source` that is materialized as a `Flow.Subscriber`
		
		
		See Also:
		`also if wanting to integrate with instead
		 (which carries the same semantics, however existed before RS's inclusion in Java 9).`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/JavaFlowSupport.Source$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/JavaFlowSupport.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/JavaFlowSupport.Source$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/JavaFlowSupport.Source$.html)*