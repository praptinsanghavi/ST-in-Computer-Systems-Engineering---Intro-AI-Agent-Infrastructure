---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Tcp.ServerBinding.html
title: Tcp.ServerBinding
---

# Tcp.ServerBinding

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Tcp.ServerBinding

- java.lang.Object
- - akka.stream.javadsl.Tcp.ServerBinding

- Enclosing class:
[Tcp](Tcp.html "class in akka.stream.javadsl")

---

```
public static final class Tcp.ServerBinding
extends java.lang.Object
```

Represents a prospective TCP server binding.
 
 Not indented for user construction

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.net.InetSocketAddress` | `[localAddress](#localAddress())()` | The local address of the endpoint bound by the materialization of the `connections` [`Source`](Source.html "class in akka.stream.javadsl"). |
	| `java.util.concurrent.CompletionStage<scala.runtime.BoxedUnit>` | `[unbind](#unbind())()` | Asynchronously triggers the unbinding of the port that was bound by the materialization of the `connections` [`Source`](Source.html "class in akka.stream.javadsl"). |
	| `java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>` | `[whenUnbound](#whenUnbound())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### localAddress
		
		
		
		```
		public java.net.InetSocketAddress localAddress()
		```
		
		The local address of the endpoint bound by the materialization of the `connections` [`Source`](Source.html "class in akka.stream.javadsl").
		- #### unbind
		
		
		
		```
		public java.util.concurrent.CompletionStage<scala.runtime.BoxedUnit> unbind()
		```
		
		Asynchronously triggers the unbinding of the port that was bound by the materialization of the `connections`
		[`Source`](Source.html "class in akka.stream.javadsl").
		 
		 The produced `CompletionStage` is fulfilled when the unbinding has been completed.
		- #### whenUnbound
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")> whenUnbound()
		```
		
		
		Returns:
		A completion operator that is completed when manually unbound, or failed if the server fails

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Tcp.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Tcp.ServerBinding.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Tcp.ServerBinding.html)*