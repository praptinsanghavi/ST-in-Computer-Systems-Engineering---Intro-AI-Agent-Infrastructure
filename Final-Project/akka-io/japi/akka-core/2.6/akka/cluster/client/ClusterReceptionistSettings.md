---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html
title: ClusterReceptionistSettings
---

# ClusterReceptionistSettings

## Content

Package [akka.cluster.client](package-summary.html)
## Class ClusterReceptionistSettings

- java.lang.Object
- - akka.cluster.client.ClusterReceptionistSettings

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

---

```
public final class ClusterReceptionistSettings
extends java.lang.Object
implements [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

Deprecated.
Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc. Since 2\.6\.0\.

param: role Start the receptionist on members tagged with this role.
 All members are used if undefined.
 param: numberOfContacts The receptionist will send this number of contact points to the client
 param: responseTunnelReceiveTimeout The actor that tunnel response messages to the
 client will be stopped after this time of inactivity.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterReceptionistSettings](#%3Cinit%3E(scala.Option,int,scala.concurrent.duration.FiniteDuration))​(scala.Option<java.lang.String> role,  int numberOfContacts,  scala.concurrent.duration.FiniteDuration responseTunnelReceiveTimeout)` | Deprecated. |
	| `[ClusterReceptionistSettings](#%3Cinit%3E(scala.Option,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(scala.Option<java.lang.String> role,  int numberOfContacts,  scala.concurrent.duration.FiniteDuration responseTunnelReceiveTimeout,  scala.concurrent.duration.FiniteDuration heartbeatInterval,  scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,  scala.concurrent.duration.FiniteDuration failureDetectionInterval)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[acceptableHeartbeatPause](#acceptableHeartbeatPause())()` | Deprecated. |
	| `static [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Create settings from the default configuration  `akka.cluster.client.receptionist`. |
	| `static [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Create settings from a configuration with the same layout as  the default configuration `akka.cluster.client.receptionist`. |
	| `static [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Java API: Create settings from the default configuration  `akka.cluster.client.receptionist`. |
	| `static [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Java API: Create settings from a configuration with the same layout as  the default configuration `akka.cluster.client.receptionist`. |
	| `scala.concurrent.duration.FiniteDuration` | `[failureDetectionInterval](#failureDetectionInterval())()` | Deprecated. |
	| `scala.concurrent.duration.FiniteDuration` | `[heartbeatInterval](#heartbeatInterval())()` | Deprecated. |
	| `int` | `[numberOfContacts](#numberOfContacts())()` | Deprecated. |
	| `scala.concurrent.duration.FiniteDuration` | `[responseTunnelReceiveTimeout](#responseTunnelReceiveTimeout())()` | Deprecated. |
	| `scala.Option<java.lang.String>` | `[role](#role())()` | Deprecated. |
	| `[ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client")` | `[withHeartbeat](#withHeartbeat(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration heartbeatInterval,  scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,  scala.concurrent.duration.FiniteDuration failureDetectionInterval)` | Deprecated. |
	| `[ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client")` | `[withNumberOfContacts](#withNumberOfContacts(int))​(int numberOfContacts)` | Deprecated. |
	| `[ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client")` | `[withResponseTunnelReceiveTimeout](#withResponseTunnelReceiveTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration responseTunnelReceiveTimeout)` | Deprecated. |
	| `[ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client")` | `[withRole](#withRole(java.lang.String))​(java.lang.String role)` | Deprecated. |
	| `[ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client")` | `[withRole](#withRole(scala.Option))​(scala.Option<java.lang.String> role)` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterReceptionistSettings
		
		
		
		```
		public ClusterReceptionistSettings​(scala.Option<java.lang.String> role,
		                                   int numberOfContacts,
		                                   scala.concurrent.duration.FiniteDuration responseTunnelReceiveTimeout)
		```
		
		Deprecated.
		- #### ClusterReceptionistSettings
		
		
		
		```
		public ClusterReceptionistSettings​(scala.Option<java.lang.String> role,
		                                   int numberOfContacts,
		                                   scala.concurrent.duration.FiniteDuration responseTunnelReceiveTimeout,
		                                   scala.concurrent.duration.FiniteDuration heartbeatInterval,
		                                   scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,
		                                   scala.concurrent.duration.FiniteDuration failureDetectionInterval)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Create settings from the default configuration
		 `akka.cluster.client.receptionist`.
		- #### apply
		
		
		
		```
		public static [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client") apply​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.client.receptionist`.
		- #### create
		
		
		
		```
		public static [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client") create​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Java API: Create settings from the default configuration
		 `akka.cluster.client.receptionist`.
		- #### create
		
		
		
		```
		public static [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client") create​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Java API: Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.client.receptionist`.
		- #### role
		
		
		
		```
		public scala.Option<java.lang.String> role()
		```
		
		Deprecated.
		- #### numberOfContacts
		
		
		
		```
		public int numberOfContacts()
		```
		
		Deprecated.
		- #### responseTunnelReceiveTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration responseTunnelReceiveTimeout()
		```
		
		Deprecated.
		- #### withRole
		
		
		
		```
		public [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client") withRole​(java.lang.String role)
		```
		
		Deprecated.
		- #### withRole
		
		
		
		```
		public [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client") withRole​(scala.Option<java.lang.String> role)
		```
		
		Deprecated.
		- #### withNumberOfContacts
		
		
		
		```
		public [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client") withNumberOfContacts​(int numberOfContacts)
		```
		
		Deprecated.
		- #### withResponseTunnelReceiveTimeout
		
		
		
		```
		public [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client") withResponseTunnelReceiveTimeout​(scala.concurrent.duration.FiniteDuration responseTunnelReceiveTimeout)
		```
		
		Deprecated.
		- #### withHeartbeat
		
		
		
		```
		public [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client") withHeartbeat​(scala.concurrent.duration.FiniteDuration heartbeatInterval,
		                                                 scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,
		                                                 scala.concurrent.duration.FiniteDuration failureDetectionInterval)
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
		- #### failureDetectionInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration failureDetectionInterval()
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html)*