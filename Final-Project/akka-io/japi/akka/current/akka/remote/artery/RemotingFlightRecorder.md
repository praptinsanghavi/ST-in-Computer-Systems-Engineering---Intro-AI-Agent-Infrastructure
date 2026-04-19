---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/RemotingFlightRecorder.html
title: RemotingFlightRecorder
---

# RemotingFlightRecorder

## Content

Package [akka.remote.artery](package-summary.html)
## Class RemotingFlightRecorder

- java.lang.Object
- - akka.remote.artery.RemotingFlightRecorder

- ---

```
public class RemotingFlightRecorder
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemotingFlightRecorder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[aeronSinkDelegateToTaskRunner](#aeronSinkDelegateToTaskRunner(long))​(long countBeforeDelegate)` |  |
	| `static void` | `[aeronSinkEnvelopeGrabbed](#aeronSinkEnvelopeGrabbed(int))​(int lastMessageSize)` |  |
	| `static void` | `[aeronSinkEnvelopeOffered](#aeronSinkEnvelopeOffered(int))​(int lastMessageSize)` |  |
	| `static void` | `[aeronSinkGaveUpEnvelope](#aeronSinkGaveUpEnvelope(java.lang.String))​(java.lang.String cause)` |  |
	| `static void` | `[aeronSinkPublicationClosed](#aeronSinkPublicationClosed(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `static void` | `[aeronSinkPublicationClosedUnexpectedly](#aeronSinkPublicationClosedUnexpectedly(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `static void` | `[aeronSinkReturnFromTaskRunner](#aeronSinkReturnFromTaskRunner(long))​(long nanosSinceTaskStartTime)` |  |
	| `static void` | `[aeronSinkStarted](#aeronSinkStarted(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `static void` | `[aeronSinkStopped](#aeronSinkStopped(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `static void` | `[aeronSinkTaskRunnerRemoved](#aeronSinkTaskRunnerRemoved(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `static void` | `[aeronSourceDelegateToTaskRunner](#aeronSourceDelegateToTaskRunner(long))​(long countBeforeDelegate)` |  |
	| `static void` | `[aeronSourceReceived](#aeronSourceReceived(int))​(int size)` |  |
	| `static void` | `[aeronSourceReturnFromTaskRunner](#aeronSourceReturnFromTaskRunner(long))​(long nanosSinceTaskStartTime)` |  |
	| `static void` | `[aeronSourceStarted](#aeronSourceStarted(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `static void` | `[aeronSourceStopped](#aeronSourceStopped(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |
	| `static void` | `[compressionActorRefAdvertisement](#compressionActorRefAdvertisement(long))​(long uid)` |  |
	| `static void` | `[compressionClassManifestAdvertisement](#compressionClassManifestAdvertisement(long))​(long uid)` |  |
	| `static void` | `[tcpInboundBound](#tcpInboundBound(java.lang.String,java.net.InetSocketAddress))​(java.lang.String bindHost,  java.net.InetSocketAddress address)` |  |
	| `static void` | `[tcpInboundConnected](#tcpInboundConnected(java.net.InetSocketAddress))​(java.net.InetSocketAddress remoteAddress)` |  |
	| `static void` | `[tcpInboundReceived](#tcpInboundReceived(int))​(int size)` |  |
	| `static void` | `[tcpInboundUnbound](#tcpInboundUnbound(akka.remote.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress)` |  |
	| `static void` | `[tcpOutboundConnected](#tcpOutboundConnected(akka.actor.Address,java.lang.String))​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,  java.lang.String streamName)` |  |
	| `static void` | `[tcpOutboundSent](#tcpOutboundSent(int))​(int size)` |  |
	| `static void` | `[transportAeronErrorLogStarted](#transportAeronErrorLogStarted())()` |  |
	| `static void` | `[transportAeronErrorLogTaskStopped](#transportAeronErrorLogTaskStopped())()` |  |
	| `static void` | `[transportKillSwitchPulled](#transportKillSwitchPulled())()` |  |
	| `static void` | `[transportMaterializerStarted](#transportMaterializerStarted())()` |  |
	| `static void` | `[transportMediaDriverStarted](#transportMediaDriverStarted(java.lang.String))​(java.lang.String directoryName)` |  |
	| `static void` | `[transportMediaFileDeleted](#transportMediaFileDeleted())()` |  |
	| `static void` | `[transportQuarantined](#transportQuarantined(akka.actor.Address,long))​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,  long uid)` |  |
	| `static void` | `[transportRemoveQuarantined](#transportRemoveQuarantined(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") remoteAddress)` |  |
	| `static void` | `[transportRestartInbound](#transportRestartInbound(akka.remote.UniqueAddress,java.lang.String))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") remoteAddress,  java.lang.String streamName)` |  |
	| `static void` | `[transportRestartOutbound](#transportRestartOutbound(akka.actor.Address,java.lang.String))​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,  java.lang.String streamName)` |  |
	| `static void` | `[transportSendQueueOverflow](#transportSendQueueOverflow(int))​(int queueIndex)` |  |
	| `static void` | `[transportStarted](#transportStarted())()` |  |
	| `static void` | `[transportStartupFinished](#transportStartupFinished())()` |  |
	| `static void` | `[transportStopIdleOutbound](#transportStopIdleOutbound(akka.actor.Address,int))​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,  int queueIndex)` |  |
	| `static void` | `[transportStopped](#transportStopped())()` |  |
	| `static void` | `[transportTaskRunnerStarted](#transportTaskRunnerStarted())()` |  |
	| `static void` | `[transportUniqueAddressSet](#transportUniqueAddressSet(akka.remote.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") uniqueAddress)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RemotingFlightRecorder
		
		
		
		```
		public RemotingFlightRecorder()
		```

	- ### Method Detail
	
	
	
		- #### transportMediaDriverStarted
		
		
		
		```
		public static void transportMediaDriverStarted​(java.lang.String directoryName)
		```
		- #### transportStarted
		
		
		
		```
		public static void transportStarted()
		```
		- #### transportAeronErrorLogStarted
		
		
		
		```
		public static void transportAeronErrorLogStarted()
		```
		- #### transportTaskRunnerStarted
		
		
		
		```
		public static void transportTaskRunnerStarted()
		```
		- #### transportUniqueAddressSet
		
		
		
		```
		public static void transportUniqueAddressSet​([UniqueAddress](../UniqueAddress.html "class in akka.remote") uniqueAddress)
		```
		- #### transportMaterializerStarted
		
		
		
		```
		public static void transportMaterializerStarted()
		```
		- #### transportStartupFinished
		
		
		
		```
		public static void transportStartupFinished()
		```
		- #### transportKillSwitchPulled
		
		
		
		```
		public static void transportKillSwitchPulled()
		```
		- #### transportStopped
		
		
		
		```
		public static void transportStopped()
		```
		- #### transportAeronErrorLogTaskStopped
		
		
		
		```
		public static void transportAeronErrorLogTaskStopped()
		```
		- #### transportMediaFileDeleted
		
		
		
		```
		public static void transportMediaFileDeleted()
		```
		- #### transportSendQueueOverflow
		
		
		
		```
		public static void transportSendQueueOverflow​(int queueIndex)
		```
		- #### transportStopIdleOutbound
		
		
		
		```
		public static void transportStopIdleOutbound​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,
		                                             int queueIndex)
		```
		- #### transportQuarantined
		
		
		
		```
		public static void transportQuarantined​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,
		                                        long uid)
		```
		- #### transportRemoveQuarantined
		
		
		
		```
		public static void transportRemoveQuarantined​([Address](../../actor/Address.html "class in akka.actor") remoteAddress)
		```
		- #### transportRestartOutbound
		
		
		
		```
		public static void transportRestartOutbound​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,
		                                            java.lang.String streamName)
		```
		- #### transportRestartInbound
		
		
		
		```
		public static void transportRestartInbound​([UniqueAddress](../UniqueAddress.html "class in akka.remote") remoteAddress,
		                                           java.lang.String streamName)
		```
		- #### aeronSinkStarted
		
		
		
		```
		public static void aeronSinkStarted​(java.lang.String channel,
		                                    int streamId)
		```
		- #### aeronSinkTaskRunnerRemoved
		
		
		
		```
		public static void aeronSinkTaskRunnerRemoved​(java.lang.String channel,
		                                              int streamId)
		```
		- #### aeronSinkPublicationClosed
		
		
		
		```
		public static void aeronSinkPublicationClosed​(java.lang.String channel,
		                                              int streamId)
		```
		- #### aeronSinkPublicationClosedUnexpectedly
		
		
		
		```
		public static void aeronSinkPublicationClosedUnexpectedly​(java.lang.String channel,
		                                                          int streamId)
		```
		- #### aeronSinkStopped
		
		
		
		```
		public static void aeronSinkStopped​(java.lang.String channel,
		                                    int streamId)
		```
		- #### aeronSinkEnvelopeGrabbed
		
		
		
		```
		public static void aeronSinkEnvelopeGrabbed​(int lastMessageSize)
		```
		- #### aeronSinkEnvelopeOffered
		
		
		
		```
		public static void aeronSinkEnvelopeOffered​(int lastMessageSize)
		```
		- #### aeronSinkGaveUpEnvelope
		
		
		
		```
		public static void aeronSinkGaveUpEnvelope​(java.lang.String cause)
		```
		- #### aeronSinkDelegateToTaskRunner
		
		
		
		```
		public static void aeronSinkDelegateToTaskRunner​(long countBeforeDelegate)
		```
		- #### aeronSinkReturnFromTaskRunner
		
		
		
		```
		public static void aeronSinkReturnFromTaskRunner​(long nanosSinceTaskStartTime)
		```
		- #### aeronSourceStarted
		
		
		
		```
		public static void aeronSourceStarted​(java.lang.String channel,
		                                      int streamId)
		```
		- #### aeronSourceStopped
		
		
		
		```
		public static void aeronSourceStopped​(java.lang.String channel,
		                                      int streamId)
		```
		- #### aeronSourceReceived
		
		
		
		```
		public static void aeronSourceReceived​(int size)
		```
		- #### aeronSourceDelegateToTaskRunner
		
		
		
		```
		public static void aeronSourceDelegateToTaskRunner​(long countBeforeDelegate)
		```
		- #### aeronSourceReturnFromTaskRunner
		
		
		
		```
		public static void aeronSourceReturnFromTaskRunner​(long nanosSinceTaskStartTime)
		```
		- #### compressionActorRefAdvertisement
		
		
		
		```
		public static void compressionActorRefAdvertisement​(long uid)
		```
		- #### compressionClassManifestAdvertisement
		
		
		
		```
		public static void compressionClassManifestAdvertisement​(long uid)
		```
		- #### tcpOutboundConnected
		
		
		
		```
		public static void tcpOutboundConnected​([Address](../../actor/Address.html "class in akka.actor") remoteAddress,
		                                        java.lang.String streamName)
		```
		- #### tcpOutboundSent
		
		
		
		```
		public static void tcpOutboundSent​(int size)
		```
		- #### tcpInboundBound
		
		
		
		```
		public static void tcpInboundBound​(java.lang.String bindHost,
		                                   java.net.InetSocketAddress address)
		```
		- #### tcpInboundUnbound
		
		
		
		```
		public static void tcpInboundUnbound​([UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress)
		```
		- #### tcpInboundConnected
		
		
		
		```
		public static void tcpInboundConnected​(java.net.InetSocketAddress remoteAddress)
		```
		- #### tcpInboundReceived
		
		
		
		```
		public static void tcpInboundReceived​(int size)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/RemotingFlightRecorder.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/RemotingFlightRecorder.html)*