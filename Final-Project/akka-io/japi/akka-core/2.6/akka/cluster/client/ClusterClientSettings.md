---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html
title: ClusterClientSettings
---

# ClusterClientSettings

## Content

Package [akka.cluster.client](package-summary.html)
## Class ClusterClientSettings

- java.lang.Object
- - akka.cluster.client.ClusterClientSettings

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

---

```
public final class ClusterClientSettings
extends java.lang.Object
implements [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

Deprecated.
Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc. Since 2\.6\.0\.

param: initialContacts Actor paths of the `ClusterReceptionist` actors on
 the servers (cluster nodes) that the client will try to contact initially.
 It is mandatory to specify at least one initial contact. The path of the
 default receptionist is
 "akka://system@hostname:port/system/receptionist"
 param: establishingGetContactsInterval Interval at which the client retries
 to establish contact with one of ClusterReceptionist on the servers (cluster nodes)
 param: refreshContactsInterval Interval at which the client will ask the
 `ClusterReceptionist` for new contact points to be used for next reconnect.
 param: heartbeatInterval How often failure detection heartbeat messages for detection
 of failed connections should be sent.
 param: acceptableHeartbeatPause Number of potentially lost/delayed heartbeats that will
 be accepted before considering it to be an anomaly. The ClusterClient is using the
 [`DeadlineFailureDetector`](../../remote/DeadlineFailureDetector.html "class in akka.remote"), which will trigger if there are no heartbeats
 within the duration `heartbeatInterval + acceptableHeartbeatPause`.
 param: bufferSize If connection to the receptionist is not established the client
 will buffer this number of messages and deliver them the connection is established.
 When the buffer is full old messages will be dropped when new messages are sent via the
 client. Use 0 to disable buffering, i.e. messages will be dropped immediately if the
 location of the receptionist is unavailable.
 param: reconnectTimeout If the connection to the receptionist is lost and cannot
 be re\-established within this duration the cluster client will be stopped. This makes it possible
 to watch it from another actor and possibly acquire a new list of initialContacts from some
 external service registry

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterClientSettings](#%3Cinit%3E(scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int))​(scala.collection.immutable.Set<[ActorPath](../../actor/ActorPath.html "interface in akka.actor")> initialContacts,  scala.concurrent.duration.FiniteDuration establishingGetContactsInterval,  scala.concurrent.duration.FiniteDuration refreshContactsInterval,  scala.concurrent.duration.FiniteDuration heartbeatInterval,  scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,  int bufferSize)` | Deprecated. For binary/source compatibility |
	| `[ClusterClientSettings](#%3Cinit%3E(scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,scala.Option))​(scala.collection.immutable.Set<[ActorPath](../../actor/ActorPath.html "interface in akka.actor")> initialContacts,  scala.concurrent.duration.FiniteDuration establishingGetContactsInterval,  scala.concurrent.duration.FiniteDuration refreshContactsInterval,  scala.concurrent.duration.FiniteDuration heartbeatInterval,  scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,  int bufferSize,  scala.Option<scala.concurrent.duration.FiniteDuration> reconnectTimeout)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[acceptableHeartbeatPause](#acceptableHeartbeatPause())()` | Deprecated. |
	| `static [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Create settings from the default configuration  `akka.cluster.client`. |
	| `static [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Create settings from a configuration with the same layout as  the default configuration `akka.cluster.client`. |
	| `int` | `[bufferSize](#bufferSize())()` | Deprecated. |
	| `static [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Java API: Create settings from the default configuration  `akka.cluster.client`. |
	| `static [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Java API: Create settings from a configuration with the same layout as  the default configuration `akka.cluster.client`. |
	| `scala.concurrent.duration.FiniteDuration` | `[establishingGetContactsInterval](#establishingGetContactsInterval())()` | Deprecated. |
	| `scala.concurrent.duration.FiniteDuration` | `[heartbeatInterval](#heartbeatInterval())()` | Deprecated. |
	| `scala.collection.immutable.Set<[ActorPath](../../actor/ActorPath.html "interface in akka.actor")>` | `[initialContacts](#initialContacts())()` | Deprecated. |
	| `scala.Option<scala.concurrent.duration.FiniteDuration>` | `[reconnectTimeout](#reconnectTimeout())()` | Deprecated. |
	| `scala.concurrent.duration.FiniteDuration` | `[refreshContactsInterval](#refreshContactsInterval())()` | Deprecated. |
	| `[ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client")` | `[withBufferSize](#withBufferSize(int))​(int bufferSize)` | Deprecated. |
	| `[ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client")` | `[withEstablishingGetContactsInterval](#withEstablishingGetContactsInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration establishingGetContactsInterval)` | Deprecated. |
	| `[ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client")` | `[withHeartbeat](#withHeartbeat(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration heartbeatInterval,  scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause)` | Deprecated. |
	| `[ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client")` | `[withInitialContacts](#withInitialContacts(java.util.Set))​(java.util.Set<[ActorPath](../../actor/ActorPath.html "interface in akka.actor")> initialContacts)` | Deprecated. Java API |
	| `[ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client")` | `[withInitialContacts](#withInitialContacts(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorPath](../../actor/ActorPath.html "interface in akka.actor")> initialContacts)` | Deprecated. Scala API |
	| `[ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client")` | `[withReconnectTimeout](#withReconnectTimeout(scala.Option))​(scala.Option<scala.concurrent.duration.FiniteDuration> reconnectTimeout)` | Deprecated. |
	| `[ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client")` | `[withRefreshContactsInterval](#withRefreshContactsInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration refreshContactsInterval)` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterClientSettings
		
		
		
		```
		public ClusterClientSettings​(scala.collection.immutable.Set<[ActorPath](../../actor/ActorPath.html "interface in akka.actor")> initialContacts,
		                             scala.concurrent.duration.FiniteDuration establishingGetContactsInterval,
		                             scala.concurrent.duration.FiniteDuration refreshContactsInterval,
		                             scala.concurrent.duration.FiniteDuration heartbeatInterval,
		                             scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,
		                             int bufferSize,
		                             scala.Option<scala.concurrent.duration.FiniteDuration> reconnectTimeout)
		```
		
		Deprecated.
		- #### ClusterClientSettings
		
		
		
		```
		public ClusterClientSettings​(scala.collection.immutable.Set<[ActorPath](../../actor/ActorPath.html "interface in akka.actor")> initialContacts,
		                             scala.concurrent.duration.FiniteDuration establishingGetContactsInterval,
		                             scala.concurrent.duration.FiniteDuration refreshContactsInterval,
		                             scala.concurrent.duration.FiniteDuration heartbeatInterval,
		                             scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,
		                             int bufferSize)
		```
		
		Deprecated.
		For binary/source compatibility

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Create settings from the default configuration
		 `akka.cluster.client`.
		- #### apply
		
		
		
		```
		public static [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") apply​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.client`.
		- #### create
		
		
		
		```
		public static [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") create​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Java API: Create settings from the default configuration
		 `akka.cluster.client`.
		- #### create
		
		
		
		```
		public static [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") create​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Java API: Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.client`.
		- #### initialContacts
		
		
		
		```
		public scala.collection.immutable.Set<[ActorPath](../../actor/ActorPath.html "interface in akka.actor")> initialContacts()
		```
		
		Deprecated.
		- #### establishingGetContactsInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration establishingGetContactsInterval()
		```
		
		Deprecated.
		- #### refreshContactsInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration refreshContactsInterval()
		```
		
		Deprecated.
		- #### heartbeatInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration heartbeatInterval()
		```
		
		Deprecated.
		- #### acceptableHeartbeatPause
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause()
		```
		
		Deprecated.
		- #### bufferSize
		
		
		
		```
		public int bufferSize()
		```
		
		Deprecated.
		- #### reconnectTimeout
		
		
		
		```
		public scala.Option<scala.concurrent.duration.FiniteDuration> reconnectTimeout()
		```
		
		Deprecated.
		- #### withInitialContacts
		
		
		
		```
		public [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") withInitialContacts​(scala.collection.immutable.Set<[ActorPath](../../actor/ActorPath.html "interface in akka.actor")> initialContacts)
		```
		
		Deprecated.
		Scala API
		- #### withInitialContacts
		
		
		
		```
		public [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") withInitialContacts​(java.util.Set<[ActorPath](../../actor/ActorPath.html "interface in akka.actor")> initialContacts)
		```
		
		Deprecated.
		Java API
		- #### withEstablishingGetContactsInterval
		
		
		
		```
		public [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") withEstablishingGetContactsInterval​(scala.concurrent.duration.FiniteDuration establishingGetContactsInterval)
		```
		
		Deprecated.
		- #### withRefreshContactsInterval
		
		
		
		```
		public [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") withRefreshContactsInterval​(scala.concurrent.duration.FiniteDuration refreshContactsInterval)
		```
		
		Deprecated.
		- #### withHeartbeat
		
		
		
		```
		public [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") withHeartbeat​(scala.concurrent.duration.FiniteDuration heartbeatInterval,
		                                           scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause)
		```
		
		Deprecated.
		- #### withBufferSize
		
		
		
		```
		public [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") withBufferSize​(int bufferSize)
		```
		
		Deprecated.
		- #### withReconnectTimeout
		
		
		
		```
		public [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") withReconnectTimeout​(scala.Option<scala.concurrent.duration.FiniteDuration> reconnectTimeout)
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/DeadlineFailureDetector.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html)*