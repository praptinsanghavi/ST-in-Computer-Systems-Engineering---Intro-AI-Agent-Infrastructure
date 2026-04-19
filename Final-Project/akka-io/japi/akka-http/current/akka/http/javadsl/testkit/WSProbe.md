---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSProbe.html
title: WSProbe
---

# WSProbe

## Content

Package [akka.http.javadsl.testkit](package-summary.html)
## Class WSProbe

- java.lang.Object
- - akka.http.javadsl.testkit.WSProbe

- ---

```
public class WSProbe
extends java.lang.Object
```

A WSProbe is a probe that implements a `Flow[Message, Message, Unit]` for testing
 websocket code.
 
 Requesting elements is handled automatically.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WSProbe](#%3Cinit%3E(akka.http.scaladsl.testkit.WSProbe))​([WSProbe](../../scaladsl/testkit/WSProbe.html "interface in akka.http.scaladsl.testkit") delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [WSProbe](WSProbe.html "class in akka.http.javadsl.testkit")` | `[create](#create(akka.actor.ActorSystem,akka.stream.Materializer))​(akka.actor.ActorSystem system,  akka.stream.Materializer materializer)` |  |
	| `static [WSProbe](WSProbe.html "class in akka.http.javadsl.testkit")` | `[create](#create(akka.actor.ActorSystem,akka.stream.Materializer,int,long))​(akka.actor.ActorSystem system,  akka.stream.Materializer materializer,  int maxChunks,  long maxChunkCollectionMills)` | Creates a WSProbe to use in tests against websocket handlers. |
	| `void` | `[expectCompletion](#expectCompletion())()` | Expect completion on the input side of the flow. |
	| `[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws")` | `[expectMessage](#expectMessage())()` | Expect a message on the input side of the flow. |
	| `void` | `[expectMessage](#expectMessage(akka.util.ByteString))​(akka.util.ByteString bytes)` | Expect a binary message on the input side of the flow and compares its payload with the given one. |
	| `void` | `[expectMessage](#expectMessage(java.lang.String))​(java.lang.String text)` | Expect a text message on the input side of the flow and compares its payload with the given one. |
	| `void` | `[expectNoMessage](#expectNoMessage())()` | Expect no message on the input side of the flow. |
	| `void` | `[expectNoMessage](#expectNoMessage(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration max)` | Expect no message on the input side of the flow for the given maximum duration. |
	| `akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​akka.NotUsed>` | `[flow](#flow())()` |  |
	| `void` | `[sendCompletion](#sendCompletion())()` | Complete the output side of the flow. |
	| `void` | `[sendMessage](#sendMessage(akka.http.javadsl.model.ws.Message))​([Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws") message)` | Send the given messages out of the flow. |
	| `void` | `[sendMessage](#sendMessage(akka.util.ByteString))​(akka.util.ByteString bytes)` | Send a binary message containing the given bytes out of the flow. |
	| `void` | `[sendMessage](#sendMessage(java.lang.String))​(java.lang.String text)` | Send a text message containing the given string out of the flow. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### WSProbe
		
		
		
		```
		public WSProbe​([WSProbe](../../scaladsl/testkit/WSProbe.html "interface in akka.http.scaladsl.testkit") delegate)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [WSProbe](WSProbe.html "class in akka.http.javadsl.testkit") create​(akka.actor.ActorSystem system,
		                             akka.stream.Materializer materializer)
		```
		- #### create
		
		
		
		```
		public static [WSProbe](WSProbe.html "class in akka.http.javadsl.testkit") create​(akka.actor.ActorSystem system,
		                             akka.stream.Materializer materializer,
		                             int maxChunks,
		                             long maxChunkCollectionMills)
		```
		
		Creates a WSProbe to use in tests against websocket handlers.
		 
		
		Parameters:
		`maxChunks` \- The maximum number of chunks to collect for streamed messages.
		`maxChunkCollectionMills` \- The maximum time in milliseconds to collect chunks for streamed messages.
		`system` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### flow
		
		
		
		```
		public akka.stream.javadsl.Flow<[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws"),​akka.NotUsed> flow()
		```
		- #### sendMessage
		
		
		
		```
		public void sendMessage​([Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws") message)
		```
		
		Send the given messages out of the flow.
		
		Parameters:
		`message` \- (undocumented)
		- #### sendMessage
		
		
		
		```
		public void sendMessage​(java.lang.String text)
		```
		
		Send a text message containing the given string out of the flow.
		
		Parameters:
		`text` \- (undocumented)
		- #### sendMessage
		
		
		
		```
		public void sendMessage​(akka.util.ByteString bytes)
		```
		
		Send a binary message containing the given bytes out of the flow.
		
		Parameters:
		`bytes` \- (undocumented)
		- #### sendCompletion
		
		
		
		```
		public void sendCompletion()
		```
		
		Complete the output side of the flow.
		- #### expectMessage
		
		
		
		```
		public [Message](../model/ws/Message.html "class in akka.http.javadsl.model.ws") expectMessage()
		```
		
		Expect a message on the input side of the flow.
		
		Returns:
		(undocumented)
		- #### expectMessage
		
		
		
		```
		public void expectMessage​(java.lang.String text)
		```
		
		Expect a text message on the input side of the flow and compares its payload with the given one.
		 If the received message is streamed its contents are collected and then asserted against the given
		 String.
		
		Parameters:
		`text` \- (undocumented)
		- #### expectMessage
		
		
		
		```
		public void expectMessage​(akka.util.ByteString bytes)
		```
		
		Expect a binary message on the input side of the flow and compares its payload with the given one.
		 If the received message is streamed its contents are collected and then asserted against the given
		 ByteString.
		
		Parameters:
		`bytes` \- (undocumented)
		- #### expectNoMessage
		
		
		
		```
		public void expectNoMessage()
		```
		
		Expect no message on the input side of the flow.
		- #### expectNoMessage
		
		
		
		```
		public void expectNoMessage​(scala.concurrent.duration.FiniteDuration max)
		```
		
		Expect no message on the input side of the flow for the given maximum duration.
		
		Parameters:
		`max` \- (undocumented)
		- #### expectCompletion
		
		
		
		```
		public void expectCompletion()
		```
		
		Expect completion on the input side of the flow.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSProbe.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSProbe.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSProbe.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSProbe.html)*