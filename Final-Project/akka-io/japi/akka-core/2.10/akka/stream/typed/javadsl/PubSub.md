---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:39:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/PubSub.html
title: PubSub
---

# PubSub

## Content

Package [akka.stream.typed.javadsl](package-summary.html)
## Class PubSub

- java.lang.Object
- - akka.stream.typed.javadsl.PubSub

- ---

```
public class PubSub
extends java.lang.Object
```

Sources and sinks to integrate [`Topic`](../../../actor/typed/pubsub/Topic.html "class in akka.actor.typed.pubsub") with streams allowing for local or distributed
 publishing and subscribing of elements through a stream.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PubSub](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[sink](#sink(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Topic.Command](../../../actor/typed/pubsub/Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> topicActor)` | Create a sink that will publish each message to the given topic. |
	| `static <T> [Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../../NotUsed.html "class in akka")>` | `[source](#source(akka.actor.typed.ActorRef,int,akka.stream.OverflowStrategy))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Topic.Command](../../../actor/typed/pubsub/Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> topicActor,  int bufferSize,  [OverflowStrategy](../../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Create a source that will subscribe to a topic and stream messages published to the topic. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PubSub
		
		
		
		```
		public PubSub()
		```

	- ### Method Detail
	
	
	
		- #### source
		
		
		
		```
		public static <T> [Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../../NotUsed.html "class in akka")> source​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Topic.Command](../../../actor/typed/pubsub/Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> topicActor,
		                                                 int bufferSize,
		                                                 [OverflowStrategy](../../OverflowStrategy.html "class in akka.stream") overflowStrategy)
		```
		
		Create a source that will subscribe to a topic and stream messages published to the topic. Can be materialized
		 multiple times, each materialized stream will contain messages published after it was started.
		 
		 Note that it is not possible to propagate the backpressure from the running stream to the pub sub topic,
		 if the stream is backpressuring published messages are buffered up to a limit and if the limit is hit
		 the configurable `OverflowStrategy` decides what happens. It is not possible to use the `Backpressure`
		 strategy.
		 
		
		
		
		Parameters:
		`topicActor` \- The actor ref for an `akka.actor.typed.pubsub.Topic` actor representing a specific topic.
		`bufferSize` \- The maximum number of messages to buffer if the stream applies backpressure
		`overflowStrategy` \- Strategy to use once the buffer is full.
		- #### sink
		
		
		
		```
		public static <T> [Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../../NotUsed.html "class in akka")> sink​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Topic.Command](../../../actor/typed/pubsub/Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> topicActor)
		```
		
		Create a sink that will publish each message to the given topic. Note that there is no backpressure
		 from the topic, so care must be taken to not publish messages at a higher rate than that can be handled
		 by subscribers. If the topic does not have any subscribers when a message is published the message is
		 sent to dead letters.
		 
		
		Parameters:
		`topicActor` \- The actor ref for an `akka.actor.typed.pubsub.Topic` actor representing a specific topic.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/PubSub.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/PubSub.html)*