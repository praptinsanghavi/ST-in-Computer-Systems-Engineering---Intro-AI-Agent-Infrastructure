---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.StreamState.html
title: Http2StreamHandling.StreamState
---

# Http2StreamHandling.StreamState

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2StreamHandling.StreamState

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2StreamHandling.StreamState

- Direct Known Subclasses:
`[Http2StreamHandling.Closed$](Http2StreamHandling.Closed$.html "class in akka.http.impl.engine.http2")`, `[Http2StreamHandling.HalfClosedLocalWaitingForPeerStream](Http2StreamHandling.HalfClosedLocalWaitingForPeerStream.html "class in akka.http.impl.engine.http2")`, `[Http2StreamHandling.HalfClosedRemoteSendingData](Http2StreamHandling.HalfClosedRemoteSendingData.html "class in akka.http.impl.engine.http2")`, `[Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream](Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream.html "class in akka.http.impl.engine.http2")`, `[Http2StreamHandling.Idle$](Http2StreamHandling.Idle$.html "class in akka.http.impl.engine.http2")`, `[Http2StreamHandling.OpenSendingData](Http2StreamHandling.OpenSendingData.html "class in akka.http.impl.engine.http2")`, `[Http2StreamHandling.ReceivingData](Http2StreamHandling.ReceivingData.html "class in akka.http.impl.engine.http2")`

Enclosing interface:
[Http2StreamHandling](Http2StreamHandling.html "interface in akka.http.impl.engine.http2")

---

```
public abstract static class Http2StreamHandling.StreamState
extends java.lang.Object
```

States roughly correspond to states as given in https://http2\.github.io/http2\-spec/\#StreamStates.
 
 Substates were introduced to also track the state of our user\-side
 

 States:
 \* Idle \| server \| client \<\- Idle, initial state, usually not tracked explicitly
 \* OpenReceivingDataFirst \| server \<\- Open, got (request) HEADERS but didn't send (response) HEADERS yet
 \* OpenSendingData \| client \<\- Open, sent (request) HEADERS but didn't receive (response) HEADERS yet
 \* Open \| server \| client \<\- Open, bidirectional, both sides sent HEADERS
 \* HalfClosedLocalWaitingForPeerStream \| client \<\- HalfClosedLocal, our stream side done, waiting for peer HEADERS
 \* HalfClosedLocal \| server \| client \<\- HalfClosedLocal, all HEADERS sent, sent our endStream \= true, receiving DATA from peer
 \* HalfClosedRemoteWaitingForOutgoingStream \| server \<\- HalfClosedRemote, waiting for our HEADERS from user
 \* HalfClosedRemoteSendingData \| server \| client \<\- HalfClosedRemote, sent our HEADERS, now sending out DATA
 \* Closed \| server \| client \<\- Closed, final state, not tracked explicitly
 

 Server states:
 \* Idle \-\> OpenReceivingDataFirst: on receiving request HEADERS with endStream \= false
 \* Idle \-\> HalfClosedRemoteWaitingForOutgoingStream: on receiving HEADERS with endStream \= true
 \* OpenReceivingDataFirst \-\> HalfClosedRemoteWaitingForOutgoingStream: after receiving endStream
 \* OpenReceivingDataFirst \-\> Open: after user provided response before request was fully streamed in
 \* HalfClosedRemoteWaitingForOutgoingStream \-\> HalfClosedRemoteSendingData: we sent response HEADERS with endStream \= false
 \* HalfClosedRemoteWaitingForOutgoingStream \-\> Closed: we sent response HEADERS with endStream \= true
 \* HalfClosedRemoteSendingData \-\> Closed: we sent DATA with endStream \= true
 \* Open \-\> HalfClosedRemoteSendingData: on receiving request DATA with endStream \= true
 \* Open \-\> HalfClosedLocal: on receiving response DATA with endStream \= true before request has been fully received (uncommon)
 \* HalfClosedLocal \-\> Closed: on receiving request DATA with endStream \= true
 

 Client states:
 \* Idle \-\> OpenSendingData: on sending out (request) HEADERS with endStream \= false
 \* Idle \-\> HalfClosedLocalWaitingForPeerStream: on sending out (request) HEADERS with endStream \= true
 \* OpenSendingData \-\> HalfClosedLocalWaitingForPeerStream: on sending out DATA with endStream \= true
 \* OpenSendingData \-\> Open: on receiving response HEADERS before request DATA was fully sent out
 \* HalfClosedLocalWaitingForPeerStream \-\> HalfClosedLocal: on receiving response HEADERS with endStream \= false
 \* HalfClosedLocalWaitingForPeerStream \-\> Closed: on receiving response HEADERS with endStream \= true
 \* HalfClosedLocal \-\> Closed: on receiving response DATA with endStream \= true
 \* Open \-\> HalfClosedLocal: on sending out request DATA with endStream \= true
 \* Open \-\> HalfClosedRemoteSendingData: on receiving response DATA with endStream \= true before request has been fully sent out (uncommon)
 \* HalfClosedRemoteSendingData \-\> Closed: on sending out request DATA with endStream \= true

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamState](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")` | `[dispatchStream](#dispatchStream(int,akka.http.impl.engine.http2.FrameEvent.ParsedHeadersFrame,akka.util.ByteString,scala.collection.immutable.Map,scala.Function1))​(int streamId,  [FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") headers,  akka.util.ByteString initialData,  scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes,  scala.Function1<[Http2StreamHandling.IncomingStreamBuffer](Http2StreamHandling.IncomingStreamBuffer.html "class in akka.http.impl.engine.http2"),​[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")> nextStateStream)` |  |
	| `protected [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")` | `[expectIncomingStream](#expectIncomingStream(akka.http.impl.engine.http2.FrameEvent.StreamFrameEvent,akka.http.impl.engine.http2.Http2StreamHandling.StreamState,scala.Function1,scala.collection.immutable.Map))​([FrameEvent.StreamFrameEvent](FrameEvent.StreamFrameEvent.html "interface in akka.http.impl.engine.http2") event,  [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") nextStateEmpty,  scala.Function1<[Http2StreamHandling.IncomingStreamBuffer](Http2StreamHandling.IncomingStreamBuffer.html "class in akka.http.impl.engine.http2"),​[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")> nextStateStream,  scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)` |  |
	| `abstract [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")` | `[handle](#handle(akka.http.impl.engine.http2.FrameEvent.StreamFrameEvent))​([FrameEvent.StreamFrameEvent](FrameEvent.StreamFrameEvent.html "interface in akka.http.impl.engine.http2") event)` |  |
	| `[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")` | `[handleOutgoingCreated](#handleOutgoingCreated(akka.http.impl.engine.http2.Http2StreamHandling.OutStream,scala.collection.immutable.Map))​([Http2StreamHandling.OutStream](Http2StreamHandling.OutStream.html "interface in akka.http.impl.engine.http2") outStream,  scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)` | Called when we receive a user\-created stream (that is open for more data) |
	| `[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")` | `[handleOutgoingCreatedAndFinished](#handleOutgoingCreatedAndFinished(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)` | Called when we receive a user\-created stream that is already closed |
	| `[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")` | `[handleOutgoingEnded](#handleOutgoingEnded())()` |  |
	| `[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")` | `[handleOutgoingFailed](#handleOutgoingFailed(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")` | `[incomingStreamPulled](#incomingStreamPulled())()` |  |
	| `scala.Tuple2<[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2"),​[PullFrameResult](PullFrameResult.html "class in akka.http.impl.engine.http2")>` | `[pullNextFrame](#pullNextFrame(int))​(int maxSize)` |  |
	| `[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")` | `[receivedUnexpectedFrame](#receivedUnexpectedFrame(akka.http.impl.engine.http2.FrameEvent.StreamFrameEvent))​([FrameEvent.StreamFrameEvent](FrameEvent.StreamFrameEvent.html "interface in akka.http.impl.engine.http2") e)` |  |
	| `void` | `[shutdown](#shutdown())()` | Called to cleanup any state when the connection is torn down |
	| `java.lang.String` | `[stateName](#stateName())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StreamState
		
		
		
		```
		public StreamState()
		```

	- ### Method Detail
	
	
	
		- #### dispatchStream
		
		
		
		```
		protected [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") dispatchStream​(int streamId,
		                                                         [FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") headers,
		                                                         akka.util.ByteString initialData,
		                                                         scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes,
		                                                         scala.Function1<[Http2StreamHandling.IncomingStreamBuffer](Http2StreamHandling.IncomingStreamBuffer.html "class in akka.http.impl.engine.http2"),​[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")> nextStateStream)
		```
		- #### expectIncomingStream
		
		
		
		```
		protected [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") expectIncomingStream​([FrameEvent.StreamFrameEvent](FrameEvent.StreamFrameEvent.html "interface in akka.http.impl.engine.http2") event,
		                                                               [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") nextStateEmpty,
		                                                               scala.Function1<[Http2StreamHandling.IncomingStreamBuffer](Http2StreamHandling.IncomingStreamBuffer.html "class in akka.http.impl.engine.http2"),​[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2")> nextStateStream,
		                                                               scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)
		```
		- #### handle
		
		
		
		```
		public abstract [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") handle​([FrameEvent.StreamFrameEvent](FrameEvent.StreamFrameEvent.html "interface in akka.http.impl.engine.http2") event)
		```
		- #### handleOutgoingCreated
		
		
		
		```
		public [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") handleOutgoingCreated​([Http2StreamHandling.OutStream](Http2StreamHandling.OutStream.html "interface in akka.http.impl.engine.http2") outStream,
		                                                             scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)
		```
		
		Called when we receive a user\-created stream (that is open for more data)
		- #### handleOutgoingCreatedAndFinished
		
		
		
		```
		public [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") handleOutgoingCreatedAndFinished​(scala.collection.immutable.Map<[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<?>,​java.lang.Object> correlationAttributes)
		```
		
		Called when we receive a user\-created stream that is already closed
		- #### handleOutgoingEnded
		
		
		
		```
		public [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") handleOutgoingEnded()
		```
		- #### handleOutgoingFailed
		
		
		
		```
		public [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") handleOutgoingFailed​(java.lang.Throwable cause)
		```
		- #### incomingStreamPulled
		
		
		
		```
		public [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") incomingStreamPulled()
		```
		- #### pullNextFrame
		
		
		
		```
		public scala.Tuple2<[Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2"),​[PullFrameResult](PullFrameResult.html "class in akka.http.impl.engine.http2")> pullNextFrame​(int maxSize)
		```
		- #### receivedUnexpectedFrame
		
		
		
		```
		public [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") receivedUnexpectedFrame​([FrameEvent.StreamFrameEvent](FrameEvent.StreamFrameEvent.html "interface in akka.http.impl.engine.http2") e)
		```
		- #### shutdown
		
		
		
		```
		public void shutdown()
		```
		
		Called to cleanup any state when the connection is torn down
		- #### stateName
		
		
		
		```
		public java.lang.String stateName()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.StreamFrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.Closed$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedLocalWaitingForPeerStream.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedRemoteSendingData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.Idle$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.IncomingStreamBuffer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.OpenSendingData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.OutStream.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.ReceivingData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.StreamState.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/PullFrameResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.StreamState.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2StreamHandling.StreamState.html)*