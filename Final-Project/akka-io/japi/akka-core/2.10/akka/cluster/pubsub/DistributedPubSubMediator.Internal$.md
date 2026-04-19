---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:05:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TerminateRequest.html
title: DistributedPubSubMediator.Internal$.TerminateRequest
---

# DistributedPubSubMediator.Internal$.TerminateRequest

## Content

Package [akka.cluster.pubsub](package-summary.html)
## Class DistributedPubSubMediator.Internal$.TerminateRequest

- java.lang.Object
- - akka.cluster.pubsub.DistributedPubSubMediator.Internal$.TerminateRequest

- Enclosing class:
[DistributedPubSubMediator.Internal$](DistributedPubSubMediator.Internal$.html "class in akka.cluster.pubsub")

---

```
public class DistributedPubSubMediator.Internal$.TerminateRequest
extends java.lang.Object
```

Sent from parent to child actor to signalize that messages are being buffered. When received by child actor
 if no [`DistributedPubSubMediator.Subscribe`](DistributedPubSubMediator.Subscribe.html "class in akka.cluster.pubsub") message has been received after sending [`DistributedPubSubMediator.Internal$.NoMoreSubscribers`](DistributedPubSubMediator.Internal$.NoMoreSubscribers.html "class in akka.cluster.pubsub") message child actor will stop itself.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TerminateRequest](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TerminateRequest
		
		
		
		```
		public TerminateRequest()
		```

	- ### Method Detail
	
	
	
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### hashCode
		
		
		
		```
		public static int hashCode()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.NoMoreSubscribers.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Subscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TerminateRequest.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TerminateRequest.html)*