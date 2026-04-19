---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/RemotingFlightRecorder$.html
title: RemotingFlightRecorder$
---

# RemotingFlightRecorder$

## Content

Package [akka.remote.artery](package-summary.html)
## Class RemotingFlightRecorder$

- java.lang.Object
- - akka.remote.artery.RemotingFlightRecorder$

- ---

```
public class RemotingFlightRecorder$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RemotingFlightRecorder$](RemotingFlightRecorder$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemotingFlightRecorder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[aeronSinkDelegateToTaskRunner](#aeronSinkDelegateToTaskRunner(long))​(long countBeforeDelegate)` |  |
	| `void` | `[aeronSinkEnvelopeGrabbed](#aeronSinkEnvelopeGrabbed(int))​(int lastMessageSize)` |  |
	| `void` | `[aeronSinkEnvelopeOffered](#aeronSinkEnvelopeOffered(int))​(int lastMessageSize)` |  |
	| `void` | `[aeronSinkGaveUpEnvelope](#aeronSinkGaveUpEnvelope(java.lang.String))​(java.lang.String cause)` |  |
	| `void` | `[aeronSinkPublicationClosed](#aeronSinkPublicationClosed(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `void` | `[aeronSinkPublicationClosedUnexpectedly](#aeronSinkPublicationClosedUnexpectedly(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `void` | `[aeronSinkReturnFromTaskRunner](#aeronSinkReturnFromTaskRunner(long))​(long nanosSinceTaskStartTime)` |  |
	| `void` | `[aeronSinkStarted](#aeronSinkStarted(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `void` | `[aeronSinkStopped](#aeronSinkStopped(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `void` | `[aeronSinkTaskRunnerRemoved](#aeronSinkTaskRunnerRemoved(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `void` | `[aeronSourceDelegateToTaskRunner](#aeronSourceDelegateToTaskRunner(long))​(long countBeforeDelegate)` |  |
	| `void` | `[aeronSourceReceived](#aeronSourceReceived(int))​(int size)` |  |
	| `void` | `[aeronSourceReturnFromTaskRunner](#aeronSourceReturnFromTaskRunner(long))​(long nanosSinceTaskStartTime)` |  |
	| `void` | `[aeronSourceStarted](#aeronSourceStarted(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `void` | `[aeronSourceStopped](#aeronSourceStopped(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `void` | `[compressionActorRefAdvertisement](#compressionActorRefAdvertisement(long))​(long uid)` |  |
	| `void` | `[compressionClassManifestAdvertisement](#compressionClassManifestAdvertisement(long))​(long uid)` |  |
	| `void` | `[tcpInboundBound](#tcpInboundBound(java.lang.String,java.net.InetSocketAddress))​(java.lang.String bindHost,  java.net.InetSocketAddress address)` |  |
	| `void` | `[tcpInboundConnected](#tcpInboundConnected(java.net.InetSocketAddress))​(java.net.InetSocketAddress remoteAddress)` |  |
	| `void` | `[tcpInboundReceived](#tcpInboundReceived(int))​(int size)` |  |
	| `void` | `[tcpInboundUnbound](#tcpInboundUnbound(akka.remote.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress)` |  |
	| `void` | `[tcpOutboundConnected](#tcpOutboundConnected(akka.actor.Address,java.lang.String))​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,  java.lang.String streamName)` |  |
	| `void` | `[tcpOutboundSent](#tcpOutboundSent(int))​(int size)` |  |
	| `void` | `[transportAeronErrorLogStarted](#transportAeronErrorLogStarted())()` |  |
	| `void` | `[transportAeronErrorLogTaskStopped](#transportAeronErrorLogTaskStopped())()` |  |
	| `void` | `[transportKillSwitchPulled](#transportKillSwitchPulled())()` |  |
	| `void` | `[transportMaterializerStarted](#transportMaterializerStarted())()` |  |
	| `void` | `[transportMediaDriverStarted](#transportMediaDriverStarted(java.lang.String))​(java.lang.String directoryName)` |  |
	| `void` | `[transportMediaFileDeleted](#transportMediaFileDeleted())()` |  |
	| `void` | `[transportQuarantined](#transportQuarantined(akka.actor.Address,long))​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,  long uid)` |  |
	| `void` | `[transportRemoveQuarantined](#transportRemoveQuarantined(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") remoteAddress)` |  |
	| `void` | `[transportRestartInbound](#transportRestartInbound(akka.remote.UniqueAddress,java.lang.String))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") remoteAddress,  java.lang.String streamName)` |  |
	| `void` | `[transportRestartOutbound](#transportRestartOutbound(akka.actor.Address,java.lang.String))​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,  java.lang.String streamName)` |  |
	| `void` | `[transportSendQueueOverflow](#transportSendQueueOverflow(int))​(int queueIndex)` |  |
	| `void` | `[transportStarted](#transportStarted())()` |  |
	| `void` | `[transportStartupFinished](#transportStartupFinished())()` |  |
	| `void` | `[transportStopIdleOutbound](#transportStopIdleOutbound(akka.actor.Address,int))​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,  int queueIndex)` |  |
	| `void` | `[transportStopped](#transportStopped())()` |  |
	| `void` | `[transportTaskRunnerStarted](#transportTaskRunnerStarted())()` |  |
	| `void` | `[transportUniqueAddressSet](#transportUniqueAddressSet(akka.remote.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") uniqueAddress)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RemotingFlightRecorder$](RemotingFlightRecorder$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RemotingFlightRecorder$
		
		
		
		```
		public RemotingFlightRecorder$()
		```

	- ### Method Detail
	
	
	
		- #### transportMediaDriverStarted
		
		
		
		```
		public void transportMediaDriverStarted​(java.lang.String directoryName)
		```
		- #### transportStarted
		
		
		
		```
		public void transportStarted()
		```
		- #### transportAeronErrorLogStarted
		
		
		
		```
		public void transportAeronErrorLogStarted()
		```
		- #### transportTaskRunnerStarted
		
		
		
		```
		public void transportTaskRunnerStarted()
		```
		- #### transportUniqueAddressSet
		
		
		
		```
		public void transportUniqueAddressSet​([UniqueAddress](../UniqueAddress.html "class in akka.remote") uniqueAddress)
		```
		- #### transportMaterializerStarted
		
		
		
		```
		public void transportMaterializerStarted()
		```
		- #### transportStartupFinished
		
		
		
		```
		public void transportStartupFinished()
		```
		- #### transportKillSwitchPulled
		
		
		
		```
		public void transportKillSwitchPulled()
		```
		- #### transportStopped
		
		
		
		```
		public void transportStopped()
		```
		- #### transportAeronErrorLogTaskStopped
		
		
		
		```
		public void transportAeronErrorLogTaskStopped()
		```
		- #### transportMediaFileDeleted
		
		
		
		```
		public void transportMediaFileDeleted()
		```
		- #### transportSendQueueOverflow
		
		
		
		```
		public void transportSendQueueOverflow​(int queueIndex)
		```
		- #### transportStopIdleOutbound
		
		
		
		```
		public void transportStopIdleOutbound​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,
		                                      int queueIndex)
		```
		- #### transportQuarantined
		
		
		
		```
		public void transportQuarantined​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,
		                                 long uid)
		```
		- #### transportRemoveQuarantined
		
		
		
		```
		public void transportRemoveQuarantined​([Address](../../actor/Address.html "class in akka.actor") remoteAddress)
		```
		- #### transportRestartOutbound
		
		
		
		```
		public void transportRestartOutbound​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,
		                                     java.lang.String streamName)
		```
		- #### transportRestartInbound
		
		
		
		```
		public void transportRestartInbound​([UniqueAddress](../UniqueAddress.html "class in akka.remote") remoteAddress,
		                                    java.lang.String streamName)
		```
		- #### aeronSinkStarted
		
		
		
		```
		public void aeronSinkStarted​(java.lang.String channel,
		                             int streamId)
		```
		- #### aeronSinkTaskRunnerRemoved
		
		
		
		```
		public void aeronSinkTaskRunnerRemoved​(java.lang.String channel,
		                                       int streamId)
		```
		- #### aeronSinkPublicationClosed
		
		
		
		```
		public void aeronSinkPublicationClosed​(java.lang.String channel,
		                                       int streamId)
		```
		- #### aeronSinkPublicationClosedUnexpectedly
		
		
		
		```
		public void aeronSinkPublicationClosedUnexpectedly​(java.lang.String channel,
		                                                   int streamId)
		```
		- #### aeronSinkStopped
		
		
		
		```
		public void aeronSinkStopped​(java.lang.String channel,
		                             int streamId)
		```
		- #### aeronSinkEnvelopeGrabbed
		
		
		
		```
		public void aeronSinkEnvelopeGrabbed​(int lastMessageSize)
		```
		- #### aeronSinkEnvelopeOffered
		
		
		
		```
		public void aeronSinkEnvelopeOffered​(int lastMessageSize)
		```
		- #### aeronSinkGaveUpEnvelope
		
		
		
		```
		public void aeronSinkGaveUpEnvelope​(java.lang.String cause)
		```
		- #### aeronSinkDelegateToTaskRunner
		
		
		
		```
		public void aeronSinkDelegateToTaskRunner​(long countBeforeDelegate)
		```
		- #### aeronSinkReturnFromTaskRunner
		
		
		
		```
		public void aeronSinkReturnFromTaskRunner​(long nanosSinceTaskStartTime)
		```
		- #### aeronSourceStarted
		
		
		
		```
		public void aeronSourceStarted​(java.lang.String channel,
		                               int streamId)
		```
		- #### aeronSourceStopped
		
		
		
		```
		public void aeronSourceStopped​(java.lang.String channel,
		                               int streamId)
		```
		- #### aeronSourceReceived
		
		
		
		```
		public void aeronSourceReceived​(int size)
		```
		- #### aeronSourceDelegateToTaskRunner
		
		
		
		```
		public void aeronSourceDelegateToTaskRunner​(long countBeforeDelegate)
		```
		- #### aeronSourceReturnFromTaskRunner
		
		
		
		```
		public void aeronSourceReturnFromTaskRunner​(long nanosSinceTaskStartTime)
		```
		- #### compressionActorRefAdvertisement
		
		
		
		```
		public void compressionActorRefAdvertisement​(long uid)
		```
		- #### compressionClassManifestAdvertisement
		
		
		
		```
		public void compressionClassManifestAdvertisement​(long uid)
		```
		- #### tcpOutboundConnected
		
		
		
		```
		public void tcpOutboundConnected​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,
		                                 java.lang.String streamName)
		```
		- #### tcpOutboundSent
		
		
		
		```
		public void tcpOutboundSent​(int size)
		```
		- #### tcpInboundBound
		
		
		
		```
		public void tcpInboundBound​(java.lang.String bindHost,
		                            java.net.InetSocketAddress address)
		```
		- #### tcpInboundUnbound
		
		
		
		```
		public void tcpInboundUnbound​([UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress)
		```
		- #### tcpInboundConnected
		
		
		
		```
		public void tcpInboundConnected​(java.net.InetSocketAddress remoteAddress)
		```
		- #### tcpInboundReceived
		
		
		
		```
		public void tcpInboundReceived​(int size)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/RemotingFlightRecorder$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/RemotingFlightRecorder$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/RemotingFlightRecorder$.html)*