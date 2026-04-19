---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/RuntimePluginConfig.html
title: RuntimePluginConfig
---

# RuntimePluginConfig

## Content

Package [akka.persistence](package-summary.html)
## Interface RuntimePluginConfig

- ---

```
public interface RuntimePluginConfig
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `com.typesafe.config.Config` | `[journalPluginConfig](#journalPluginConfig())()` | Additional configuration of the journal plugin servicing this persistent actor. |
	| `com.typesafe.config.Config` | `[snapshotPluginConfig](#snapshotPluginConfig())()` | Additional configuration of the snapshot plugin servicing this persistent actor. |

- - ### Method Detail
	
	
	
		- #### journalPluginConfig
		
		
		
		```
		com.typesafe.config.Config journalPluginConfig()
		```
		
		Additional configuration of the journal plugin servicing this persistent actor.
		 When empty, the whole configuration of the journal plugin will be taken from the `Config` loaded into the
		 `ActorSystem`.
		 When configured, the journal plugin configuration will be taken from this `Config` merged with the `Config`
		 loaded into the `ActorSystem`.
		 
		
		Returns:
		an additional configuration used to configure the journal plugin.
		- #### snapshotPluginConfig
		
		
		
		```
		com.typesafe.config.Config snapshotPluginConfig()
		```
		
		Additional configuration of the snapshot plugin servicing this persistent actor.
		 When empty, the whole configuration of the snapshot plugin will be taken from the `Config` loaded into the
		 `ActorSystem`.
		 When configured, the snapshot plugin configuration will be taken from this `Config` merged with the `Config`
		 loaded into the `ActorSystem`.
		 
		
		Returns:
		an additional configuration used to configure the snapshot plugin.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/RuntimePluginConfig.html](https://doc.akka.io/japi/akka/current/akka/persistence/RuntimePluginConfig.html)*