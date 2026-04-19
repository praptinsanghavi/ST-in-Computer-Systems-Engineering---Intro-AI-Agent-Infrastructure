---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html
title: ClusterSingletonProxySettings
---

# ClusterSingletonProxySettings

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonProxySettings

- java.lang.Object
- - akka.cluster.singleton.ClusterSingletonProxySettings

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

---

```
public final class ClusterSingletonProxySettings
extends java.lang.Object
implements [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

param: singletonName The actor name of the singleton actor that is started by the [`ClusterSingletonManager`](ClusterSingletonManager.html "class in akka.cluster.singleton").
 param: role The role of the cluster nodes where the singleton can be deployed. Corresponding to the `role`
 used by the `ClusterSingletonManager`. If the role is not specified it's a singleton among all
 nodes in the cluster, and the `ClusterSingletonManager` must then also be configured in
 same way.
 param: dataCenter The data center of the cluster nodes where the singleton is running. If None then the same data center as current node.
 param: singletonIdentificationInterval Interval at which the proxy will try to resolve the singleton instance.
 param: bufferSize If the location of the singleton is unknown the proxy will buffer this number of messages
 and deliver them when the singleton is identified. When the buffer is full old messages will be dropped
 when new messages are sent viea the proxy. Use 0 to disable buffering, i.e. messages will be dropped
 immediately if the location of the singleton is unknown.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonProxySettings](#%3Cinit%3E(java.lang.String,scala.Option,scala.concurrent.duration.FiniteDuration,int))​(java.lang.String singletonName,  scala.Option<java.lang.String> role,  scala.concurrent.duration.FiniteDuration singletonIdentificationInterval,  int bufferSize)` |  |
	| `[ClusterSingletonProxySettings](#%3Cinit%3E(java.lang.String,scala.Option,scala.Option,scala.concurrent.duration.FiniteDuration,int))​(java.lang.String singletonName,  scala.Option<java.lang.String> role,  scala.Option<java.lang.String> dataCenter,  scala.concurrent.duration.FiniteDuration singletonIdentificationInterval,  int bufferSize)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Create settings from the default configuration  `akka.cluster.singleton-proxy`. |
	| `static [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a configuration with the same layout as  the default configuration `akka.cluster.singleton-proxy`. |
	| `int` | `[bufferSize](#bufferSize())()` |  |
	| `static [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Java API: Create settings from the default configuration  `akka.cluster.singleton-proxy`. |
	| `static [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Create settings from a configuration with the same layout as  the default configuration `akka.cluster.singleton-proxy`. |
	| `scala.Option<java.lang.String>` | `[dataCenter](#dataCenter())()` | Deprecated. Use Akka Distributed Cluster instead. |
	| `scala.Option<java.lang.String>` | `[role](#role())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[singletonIdentificationInterval](#singletonIdentificationInterval())()` |  |
	| `java.lang.String` | `[singletonName](#singletonName())()` |  |
	| `[ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[withBufferSize](#withBufferSize(int))​(int bufferSize)` |  |
	| `[ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[withDataCenter](#withDataCenter(java.lang.String))​(java.lang.String dataCenter)` | Deprecated. Use Akka Distributed Cluster instead. |
	| `[ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[withDataCenter](#withDataCenter(scala.Option))​(scala.Option<java.lang.String> dataCenter)` | Deprecated. Use Akka Distributed Cluster instead. |
	| `[ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[withRole](#withRole(java.lang.String))​(java.lang.String role)` |  |
	| `[ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[withRole](#withRole(scala.Option))​(scala.Option<java.lang.String> role)` |  |
	| `[ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[withSingletonIdentificationInterval](#withSingletonIdentificationInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration singletonIdentificationInterval)` |  |
	| `[ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton")` | `[withSingletonName](#withSingletonName(java.lang.String))​(java.lang.String name)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterSingletonProxySettings
		
		
		
		```
		public ClusterSingletonProxySettings​(java.lang.String singletonName,
		                                     scala.Option<java.lang.String> role,
		                                     scala.Option<java.lang.String> dataCenter,
		                                     scala.concurrent.duration.FiniteDuration singletonIdentificationInterval,
		                                     int bufferSize)
		```
		- #### ClusterSingletonProxySettings
		
		
		
		```
		public ClusterSingletonProxySettings​(java.lang.String singletonName,
		                                     scala.Option<java.lang.String> role,
		                                     scala.concurrent.duration.FiniteDuration singletonIdentificationInterval,
		                                     int bufferSize)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Create settings from the default configuration
		 `akka.cluster.singleton-proxy`.
		- #### apply
		
		
		
		```
		public static [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") apply​(com.typesafe.config.Config config)
		```
		
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.singleton-proxy`.
		- #### create
		
		
		
		```
		public static [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") create​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API: Create settings from the default configuration
		 `akka.cluster.singleton-proxy`.
		- #### create
		
		
		
		```
		public static [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") create​(com.typesafe.config.Config config)
		```
		
		Java API: Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.singleton-proxy`.
		- #### singletonName
		
		
		
		```
		public java.lang.String singletonName()
		```
		- #### role
		
		
		
		```
		public scala.Option<java.lang.String> role()
		```
		- #### dataCenter
		
		
		
		```
		public scala.Option<java.lang.String> dataCenter()
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		- #### singletonIdentificationInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration singletonIdentificationInterval()
		```
		- #### bufferSize
		
		
		
		```
		public int bufferSize()
		```
		- #### withSingletonName
		
		
		
		```
		public [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") withSingletonName​(java.lang.String name)
		```
		- #### withRole
		
		
		
		```
		public [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") withRole​(java.lang.String role)
		```
		- #### withRole
		
		
		
		```
		public [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") withRole​(scala.Option<java.lang.String> role)
		```
		- #### withDataCenter
		
		
		
		```
		public [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") withDataCenter​(java.lang.String dataCenter)
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		- #### withDataCenter
		
		
		
		```
		public [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") withDataCenter​(scala.Option<java.lang.String> dataCenter)
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		- #### withSingletonIdentificationInterval
		
		
		
		```
		public [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") withSingletonIdentificationInterval​(scala.concurrent.duration.FiniteDuration singletonIdentificationInterval)
		```
		- #### withBufferSize
		
		
		
		```
		public [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") withBufferSize​(int bufferSize)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html)*