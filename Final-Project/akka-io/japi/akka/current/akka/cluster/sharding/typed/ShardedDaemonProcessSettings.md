---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
title: ShardedDaemonProcessSettings
---

# ShardedDaemonProcessSettings

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ShardedDaemonProcessSettings

- java.lang.Object
- - akka.cluster.sharding.typed.ShardedDaemonProcessSettings

- ---

```
public final class ShardedDaemonProcessSettings
extends java.lang.Object
```

Not for user constructions, use factory methods to instantiate.

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Scala API: Create default settings for system |
	| `static [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: Create default settings for system |
	| `static [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[fromConfig](#fromConfig(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Load settings from a specific config location. |
	| `int` | `[keepAliveFromNumberOfNodes](#keepAliveFromNumberOfNodes())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[keepAliveInterval](#keepAliveInterval())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[keepAliveThrottleInterval](#keepAliveThrottleInterval())()` |  |
	| `scala.Option<java.lang.String>` | `[role](#role())()` |  |
	| `scala.Option<[ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed")>` | `[shardingSettings](#shardingSettings())()` |  |
	| `[ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[withKeepAliveFromNumberOfNodes](#withKeepAliveFromNumberOfNodes(int))​(int keepAliveFromNumberOfNodes)` | Keep alive messages from this number of nodes. |
	| `[ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[withKeepAliveInterval](#withKeepAliveInterval(java.time.Duration))​(java.time.Duration keepAliveInterval)` | Java API: The interval each parent of the sharded set is pinged from each node in the cluster. |
	| `[ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[withKeepAliveInterval](#withKeepAliveInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration keepAliveInterval)` | Scala API: The interval each parent of the sharded set is pinged from each node in the cluster. |
	| `[ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[withKeepAliveThrottleInterval](#withKeepAliveThrottleInterval(java.time.Duration))​(java.time.Duration keepAliveThrottleInterval)` | Java API: Keep alive messages are sent with this delay between each message. |
	| `[ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[withKeepAliveThrottleInterval](#withKeepAliveThrottleInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration keepAliveThrottleInterval)` | Scala API: Keep alive messages are sent with this delay between each message. |
	| `[ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[withRole](#withRole(java.lang.String))​(java.lang.String role)` | Specifies that the ShardedDaemonProcess should run on nodes with a specific role. |
	| `[ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed")` | `[withShardingSettings](#withShardingSettings(akka.cluster.sharding.typed.ClusterShardingSettings))​([ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed") shardingSettings)` | Specify sharding settings that should be used for the sharded daemon process instead of loading from config. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") apply​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Scala API: Create default settings for system
		- #### create
		
		
		
		```
		public static [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") create​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API: Create default settings for system
		- #### fromConfig
		
		
		
		```
		public static [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") fromConfig​(com.typesafe.config.Config config)
		```
		
		Load settings from a specific config location.
		- #### keepAliveInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration keepAliveInterval()
		```
		- #### shardingSettings
		
		
		
		```
		public scala.Option<[ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed")> shardingSettings()
		```
		- #### role
		
		
		
		```
		public scala.Option<java.lang.String> role()
		```
		- #### keepAliveFromNumberOfNodes
		
		
		
		```
		public int keepAliveFromNumberOfNodes()
		```
		- #### keepAliveThrottleInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration keepAliveThrottleInterval()
		```
		- #### withKeepAliveInterval
		
		
		
		```
		public [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") withKeepAliveInterval​(scala.concurrent.duration.FiniteDuration keepAliveInterval)
		```
		
		Scala API: The interval each parent of the sharded set is pinged from each node in the cluster.
		 
		 Note: How the sharded set is kept alive may change in the future meaning this setting may go away.
		- #### withKeepAliveInterval
		
		
		
		```
		public [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") withKeepAliveInterval​(java.time.Duration keepAliveInterval)
		```
		
		Java API: The interval each parent of the sharded set is pinged from each node in the cluster.
		 
		 Note: How the sharded set is kept alive may change in the future meaning this setting may go away.
		- #### withShardingSettings
		
		
		
		```
		public [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") withShardingSettings​([ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed") shardingSettings)
		```
		
		Specify sharding settings that should be used for the sharded daemon process instead of loading from config.
		 Some settings can not be changed (remember\-entitites and related settings, passivation, number\-of\-shards),
		 changing those settings will be ignored.
		- #### withRole
		
		
		
		```
		public [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") withRole​(java.lang.String role)
		```
		
		Specifies that the ShardedDaemonProcess should run on nodes with a specific role.
		 If the role is not specified all nodes in the cluster are used. If the given role does
		 not match the role of the current node the the ShardedDaemonProcess will not be started.
		- #### withKeepAliveFromNumberOfNodes
		
		
		
		```
		public [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") withKeepAliveFromNumberOfNodes​(int keepAliveFromNumberOfNodes)
		```
		
		Keep alive messages from this number of nodes.
		- #### withKeepAliveThrottleInterval
		
		
		
		```
		public [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") withKeepAliveThrottleInterval​(scala.concurrent.duration.FiniteDuration keepAliveThrottleInterval)
		```
		
		Scala API: Keep alive messages are sent with this delay between each message.
		- #### withKeepAliveThrottleInterval
		
		
		
		```
		public [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") withKeepAliveThrottleInterval​(java.time.Duration keepAliveThrottleInterval)
		```
		
		Java API: Keep alive messages are sent with this delay between each message.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html)*