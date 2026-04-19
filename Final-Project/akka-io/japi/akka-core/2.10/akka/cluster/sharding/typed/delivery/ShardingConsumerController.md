---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController.Settings.html
title: ShardingConsumerController.Settings
---

# ShardingConsumerController.Settings

## Content

Package [akka.cluster.sharding.typed.delivery](package-summary.html)
## Class ShardingConsumerController.Settings

- java.lang.Object
- - akka.cluster.sharding.typed.delivery.ShardingConsumerController.Settings

- Enclosing class:
[ShardingConsumerController](ShardingConsumerController.html "class in akka.cluster.sharding.typed.delivery")

---

```
public static final class ShardingConsumerController.Settings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Settings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[bufferSize](#bufferSize())()` |  |
	| `[ConsumerController.Settings](../../../../actor/typed/delivery/ConsumerController.Settings.html "class in akka.actor.typed.delivery")` | `[consumerControllerSettings](#consumerControllerSettings())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[ShardingConsumerController.Settings](ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery")` | `[withBufferSize](#withBufferSize(int))​(int newBufferSize)` |  |
	| `[ShardingConsumerController.Settings](ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery")` | `[withConsumerControllerSettings](#withConsumerControllerSettings(akka.actor.typed.delivery.ConsumerController.Settings))​([ConsumerController.Settings](../../../../actor/typed/delivery/ConsumerController.Settings.html "class in akka.actor.typed.delivery") newConsumerControllerSettings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Settings
		
		
		
		```
		public Settings()
		```

	- ### Method Detail
	
	
	
		- #### bufferSize
		
		
		
		```
		public int bufferSize()
		```
		- #### consumerControllerSettings
		
		
		
		```
		public [ConsumerController.Settings](../../../../actor/typed/delivery/ConsumerController.Settings.html "class in akka.actor.typed.delivery") consumerControllerSettings()
		```
		- #### withBufferSize
		
		
		
		```
		public [ShardingConsumerController.Settings](ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") withBufferSize​(int newBufferSize)
		```
		- #### withConsumerControllerSettings
		
		
		
		```
		public [ShardingConsumerController.Settings](ShardingConsumerController.Settings.html "class in akka.cluster.sharding.typed.delivery") withConsumerControllerSettings​([ConsumerController.Settings](../../../../actor/typed/delivery/ConsumerController.Settings.html "class in akka.actor.typed.delivery") newConsumerControllerSettings)
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ConsumerController.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController.Settings.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/delivery/ShardingConsumerController.Settings.html)*