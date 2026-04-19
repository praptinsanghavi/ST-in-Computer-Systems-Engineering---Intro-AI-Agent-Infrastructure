---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/JavaFlowSupport.Sink.html
title: JavaFlowSupport.Sink
---

# JavaFlowSupport.Sink

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class JavaFlowSupport.Sink

- java.lang.Object
- - akka.stream.javadsl.JavaFlowSupport.Sink

- Enclosing class:
[JavaFlowSupport](JavaFlowSupport.html "class in akka.stream.javadsl")

---

```
public static final class JavaFlowSupport.Sink
extends java.lang.Object
```

[`Sink`](Sink.html "class in akka.stream.javadsl") factories operating with `java.util.concurrent.Flow.*`
 interfaces.

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.Flow.Publisher<T>>` | `[asPublisher](#asPublisher(akka.stream.javadsl.AsPublisher))​([AsPublisher](AsPublisher.html "enum in akka.stream.javadsl") fanout)` | A \`Sink\` that materializes into a `Flow.Publisher`. |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromSubscriber](#fromSubscriber(java.util.concurrent.Flow.Subscriber))​(java.util.concurrent.Flow.Subscriber<T> s)` | Helper to create \<\> from \<\>. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### asPublisher
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.Flow.Publisher<T>> asPublisher​([AsPublisher](AsPublisher.html "enum in akka.stream.javadsl") fanout)
		```
		
		A \`Sink\` that materializes into a `Flow.Publisher`.
		
		 If `fanout` is `WITH_FANOUT`, the materialized `Publisher` will support
		 multiple `Subscriber`s and the size of the `inputBuffer` configured for this
		 operator becomes the maximum number of elements that the fastest `Flow.Subscriber` can be ahead of the slowest one before slowing the
		 processing down due to back pressure.
		
		 
		
		If `fanout` is `WITHOUT_FANOUT` then the materialized `Publisher` will
		 only support a single `Subscriber` and reject any additional `Subscriber`s.
		- #### fromSubscriber
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromSubscriber​(java.util.concurrent.Flow.Subscriber<T> s)
		```
		
		Helper to create \<\> from \<\>.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/JavaFlowSupport.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/JavaFlowSupport.Sink.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/JavaFlowSupport.Sink.html)*