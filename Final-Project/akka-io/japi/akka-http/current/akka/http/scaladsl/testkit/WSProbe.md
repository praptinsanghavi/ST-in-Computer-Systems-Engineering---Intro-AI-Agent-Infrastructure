---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSProbe.html
title: WSProbe
---

# WSProbe

## Content

Package [akka.http.scaladsl.testkit](package-summary.html)
## Interface WSProbe

- ---

```
public interface WSProbe
```

A WSProbe is a probe that implements a `Flow[Message, Message, Unit]` for testing
 websocket code.
 
 Requesting elements is handled automatically.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[expectCompletion](#expectCompletion())()` | Expect completion on the input side of the flow. |
	| `[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws")` | `[expectMessage](#expectMessage())()` | Expect a message on the input side of the flow. |
	| `void` | `[expectMessage](#expectMessage(akka.util.ByteString))​(akka.util.ByteString bytes)` | Expect a binary message on the input side of the flow and compares its payload with the given one. |
	| `void` | `[expectMessage](#expectMessage(java.lang.String))​(java.lang.String text)` | Expect a text message on the input side of the flow and compares its payload with the given one. |
	| `void` | `[expectNoMessage](#expectNoMessage())()` | Expect no message on the input side of the flow. |
	| `void` | `[expectNoMessage](#expectNoMessage(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration max)` | Expect no message on the input side of the flow for the given maximum duration. |
	| `akka.stream.scaladsl.Flow<[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​akka.NotUsed>` | `[flow](#flow())()` |  |
	| `akka.stream.testkit.TestSubscriber.Probe<[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws")>` | `[inProbe](#inProbe())()` | The underlying probe for the ingoing side of this probe. |
	| `akka.stream.testkit.TestPublisher.Probe<[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws")>` | `[outProbe](#outProbe())()` | The underlying probe for the outgoing side of this probe. |
	| `void` | `[sendCompletion](#sendCompletion())()` | Complete the output side of the flow. |
	| `void` | `[sendMessage](#sendMessage(akka.http.scaladsl.model.ws.Message))​([Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws") message)` | Send the given messages out of the flow. |
	| `void` | `[sendMessage](#sendMessage(akka.util.ByteString))​(akka.util.ByteString bytes)` | Send a binary message containing the given bytes out of the flow. |
	| `void` | `[sendMessage](#sendMessage(java.lang.String))​(java.lang.String text)` | Send a text message containing the given string out of the flow. |

- - ### Method Detail
	
	
	
		- #### flow
		
		
		
		```
		akka.stream.scaladsl.Flow<[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​akka.NotUsed> flow()
		```
		- #### sendMessage
		
		
		
		```
		void sendMessage​([Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws") message)
		```
		
		Send the given messages out of the flow.
		
		Parameters:
		`message` \- (undocumented)
		- #### sendMessage
		
		
		
		```
		void sendMessage​(java.lang.String text)
		```
		
		Send a text message containing the given string out of the flow.
		
		Parameters:
		`text` \- (undocumented)
		- #### sendMessage
		
		
		
		```
		void sendMessage​(akka.util.ByteString bytes)
		```
		
		Send a binary message containing the given bytes out of the flow.
		
		Parameters:
		`bytes` \- (undocumented)
		- #### sendCompletion
		
		
		
		```
		void sendCompletion()
		```
		
		Complete the output side of the flow.
		- #### expectMessage
		
		
		
		```
		[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws") expectMessage()
		```
		
		Expect a message on the input side of the flow.
		
		Returns:
		(undocumented)
		- #### expectMessage
		
		
		
		```
		void expectMessage​(java.lang.String text)
		```
		
		Expect a text message on the input side of the flow and compares its payload with the given one.
		 If the received message is streamed its contents are collected and then asserted against the given
		 String.
		
		Parameters:
		`text` \- (undocumented)
		- #### expectMessage
		
		
		
		```
		void expectMessage​(akka.util.ByteString bytes)
		```
		
		Expect a binary message on the input side of the flow and compares its payload with the given one.
		 If the received message is streamed its contents are collected and then asserted against the given
		 ByteString.
		
		Parameters:
		`bytes` \- (undocumented)
		- #### expectNoMessage
		
		
		
		```
		void expectNoMessage()
		```
		
		Expect no message on the input side of the flow.
		- #### expectNoMessage
		
		
		
		```
		void expectNoMessage​(scala.concurrent.duration.FiniteDuration max)
		```
		
		Expect no message on the input side of the flow for the given maximum duration.
		
		Parameters:
		`max` \- (undocumented)
		- #### expectCompletion
		
		
		
		```
		void expectCompletion()
		```
		
		Expect completion on the input side of the flow.
		- #### inProbe
		
		
		
		```
		akka.stream.testkit.TestSubscriber.Probe<[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws")> inProbe()
		```
		
		The underlying probe for the ingoing side of this probe. Can be used if the methods
		 on WSProbe don't allow fine enough control over the message flow.
		
		Returns:
		(undocumented)
		- #### outProbe
		
		
		
		```
		akka.stream.testkit.TestPublisher.Probe<[Message](../model/ws/Message.html "interface in akka.http.scaladsl.model.ws")> outProbe()
		```
		
		The underlying probe for the outgoing side of this probe. Can be used if the methods
		 on WSProbe don't allow fine enough control over the message flow.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSProbe.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSProbe.html)*