---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/PerGroupingBuffer.html
title: PerGroupingBuffer
---

# PerGroupingBuffer

## Content

Package [akka.cluster.pubsub](package-summary.html)
## Interface PerGroupingBuffer

- All Known Implementing Classes:
`[DistributedPubSubMediator](DistributedPubSubMediator.html "class in akka.cluster.pubsub")`, `[DistributedPubSubMediator.Internal$.Topic](DistributedPubSubMediator.Internal$.Topic.html "class in akka.cluster.pubsub")`

---

```
public interface PerGroupingBuffer
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[bufferOr](#bufferOr(java.lang.String,java.lang.Object,akka.actor.ActorRef,scala.Function0))​(java.lang.String grouping,  java.lang.Object message,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") originalSender,  scala.Function0<scala.runtime.BoxedUnit> action)` |  |
	| `void` | `[forwardMessages](#forwardMessages(akka.util.MessageBuffer,akka.actor.ActorRef))​([MessageBuffer](../../util/MessageBuffer.html "class in akka.util") messages,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient)` |  |
	| `void` | `[forwardMessages](#forwardMessages(java.lang.String,akka.actor.ActorRef))​(java.lang.String grouping,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient)` |  |
	| `void` | `[initializeGrouping](#initializeGrouping(java.lang.String))​(java.lang.String grouping)` |  |
	| `void` | `[recreateAndForwardMessagesIfNeeded](#recreateAndForwardMessagesIfNeeded(java.lang.String,scala.Function0))​(java.lang.String grouping,  scala.Function0<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> recipient)` |  |

- - ### Method Detail
	
	
	
		- #### bufferOr
		
		
		
		```
		void bufferOr​(java.lang.String grouping,
		              java.lang.Object message,
		              [ActorRef](../../actor/ActorRef.html "class in akka.actor") originalSender,
		              scala.Function0<scala.runtime.BoxedUnit> action)
		```
		- #### forwardMessages
		
		
		
		```
		void forwardMessages​(java.lang.String grouping,
		                     [ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient)
		```
		- #### forwardMessages
		
		
		
		```
		void forwardMessages​([MessageBuffer](../../util/MessageBuffer.html "class in akka.util") messages,
		                     [ActorRef](../../actor/ActorRef.html "class in akka.actor") recipient)
		```
		- #### initializeGrouping
		
		
		
		```
		void initializeGrouping​(java.lang.String grouping)
		```
		- #### recreateAndForwardMessagesIfNeeded
		
		
		
		```
		void recreateAndForwardMessagesIfNeeded​(java.lang.String grouping,
		                                        scala.Function0<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> recipient)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Topic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/MessageBuffer.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/PerGroupingBuffer.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/PerGroupingBuffer.html)*