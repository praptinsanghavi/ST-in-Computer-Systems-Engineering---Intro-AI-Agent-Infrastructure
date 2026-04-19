---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html
title: MultiNodeConfig
---

# MultiNodeConfig

## Content

Package [akka.remote.testkit](package-summary.html)
## Class MultiNodeConfig

- java.lang.Object
- - akka.remote.testkit.MultiNodeConfig

- ---

```
public abstract class MultiNodeConfig
extends java.lang.Object
```

Configure the role names and participants of the test, including configuration settings.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MultiNodeConfig](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[commonConfig](#commonConfig(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Register a common base config for all test participants, if so desired. |
	| `com.typesafe.config.Config` | `[debugConfig](#debugConfig(boolean))​(boolean on)` | Include for verbose debug logging |
	| `void` | `[deployOn](#deployOn(akka.remote.testconductor.RoleName,java.lang.String))​([RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor") role,  java.lang.String deployment)` |  |
	| `void` | `[deployOnAll](#deployOnAll(java.lang.String))​(java.lang.String deployment)` |  |
	| `void` | `[nodeConfig](#nodeConfig(scala.collection.immutable.Seq,scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")> roles,  scala.collection.immutable.Seq<com.typesafe.config.Config> configs)` | Register a config override for a specific participant. |
	| `[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")` | `[role](#role(java.lang.String))​(java.lang.String name)` | Construct a RoleName and return it, to be used as an identifier in the  test. |
	| `void` | `[testTransport](#testTransport(boolean))​(boolean on)` | To be able to use `blackhole`, `passThrough`, and `throttle` you must  activate the failure injector and throttler transport adapters by  specifying `testTransport(on = true)` in your MultiNodeConfig. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MultiNodeConfig
		
		
		
		```
		public MultiNodeConfig()
		```

	- ### Method Detail
	
	
	
		- #### commonConfig
		
		
		
		```
		public void commonConfig​(com.typesafe.config.Config config)
		```
		
		Register a common base config for all test participants, if so desired.
		- #### debugConfig
		
		
		
		```
		public com.typesafe.config.Config debugConfig​(boolean on)
		```
		
		Include for verbose debug logging
		
		Parameters:
		`on` \- when `true` debug Config is returned, otherwise config with info logging
		- #### deployOn
		
		
		
		```
		public void deployOn​([RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor") role,
		                     java.lang.String deployment)
		```
		- #### deployOnAll
		
		
		
		```
		public void deployOnAll​(java.lang.String deployment)
		```
		- #### nodeConfig
		
		
		
		```
		public void nodeConfig​(scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")> roles,
		                       scala.collection.immutable.Seq<com.typesafe.config.Config> configs)
		```
		
		Register a config override for a specific participant.
		- #### role
		
		
		
		```
		public [RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor") role​(java.lang.String name)
		```
		
		Construct a RoleName and return it, to be used as an identifier in the
		 test. Registration of a role name creates a role which then needs to be
		 filled.
		- #### testTransport
		
		
		
		```
		public void testTransport​(boolean on)
		```
		
		To be able to use `blackhole`, `passThrough`, and `throttle` you must
		 activate the failure injector and throttler transport adapters by
		 specifying `testTransport(on = true)` in your MultiNodeConfig.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html)*