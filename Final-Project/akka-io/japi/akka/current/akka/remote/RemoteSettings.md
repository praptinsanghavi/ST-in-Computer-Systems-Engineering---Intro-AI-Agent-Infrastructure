---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/RemoteSettings.html
title: RemoteSettings
---

# RemoteSettings

## Content

Package [akka.remote](package-summary.html)
## Class RemoteSettings

- java.lang.Object
- - akka.remote.RemoteSettings

- ---

```
public final class RemoteSettings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteSettings](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.artery.ArterySettings` | `[Artery](#Artery())()` |  |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[configureDispatcher](#configureDispatcher(akka.actor.Props))​([Props](../actor/Props.html "class in akka.actor") props)` |  |
	| `boolean` | `[UseUnsafeRemoteFeaturesWithoutCluster](#UseUnsafeRemoteFeaturesWithoutCluster())()` |  |
	| `boolean` | `[WarnAboutDirectUse](#WarnAboutDirectUse())()` |  |
	| `boolean` | `[WarnUnsafeWatchWithoutCluster](#WarnUnsafeWatchWithoutCluster())()` |  |
	| `com.typesafe.config.Config` | `[WatchFailureDetectorConfig](#WatchFailureDetectorConfig())()` |  |
	| `java.lang.String` | `[WatchFailureDetectorImplementationClass](#WatchFailureDetectorImplementationClass())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[WatchHeartbeatExpectedResponseAfter](#WatchHeartbeatExpectedResponseAfter())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[WatchHeartBeatInterval](#WatchHeartBeatInterval())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[WatchUnreachableReaperInterval](#WatchUnreachableReaperInterval())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RemoteSettings
		
		
		
		```
		public RemoteSettings​(com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### Artery
		
		
		
		```
		public akka.remote.artery.ArterySettings Artery()
		```
		- #### UseUnsafeRemoteFeaturesWithoutCluster
		
		
		
		```
		public boolean UseUnsafeRemoteFeaturesWithoutCluster()
		```
		- #### WarnAboutDirectUse
		
		
		
		```
		public boolean WarnAboutDirectUse()
		```
		- #### WarnUnsafeWatchWithoutCluster
		
		
		
		```
		public boolean WarnUnsafeWatchWithoutCluster()
		```
		- #### WatchFailureDetectorConfig
		
		
		
		```
		public com.typesafe.config.Config WatchFailureDetectorConfig()
		```
		- #### WatchFailureDetectorImplementationClass
		
		
		
		```
		public java.lang.String WatchFailureDetectorImplementationClass()
		```
		- #### WatchHeartBeatInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration WatchHeartBeatInterval()
		```
		- #### WatchHeartbeatExpectedResponseAfter
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration WatchHeartbeatExpectedResponseAfter()
		```
		- #### WatchUnreachableReaperInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration WatchUnreachableReaperInterval()
		```
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		- #### configureDispatcher
		
		
		
		```
		public [Props](../actor/Props.html "class in akka.actor") configureDispatcher​([Props](../actor/Props.html "class in akka.actor") props)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/RemoteSettings.html](https://doc.akka.io/japi/akka/current/akka/remote/RemoteSettings.html)*