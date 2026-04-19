---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/TestKitSettings.html
title: TestKitSettings
---

# TestKitSettings

## Content

Package [akka.actor.testkit.typed](package-summary.html)
## Class TestKitSettings

- java.lang.Object
- - akka.actor.testkit.typed.TestKitSettings

- ---

```
public final class TestKitSettings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestKitSettings](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Reads configuration settings from `akka.actor.testkit.typed` section. |
	| `static [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Reads configuration settings from given `Config` that  must have the same layout as the `akka.actor.testkit.typed` section. |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `static [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: Reads configuration settings from `akka.actor.testkit.typed` section. |
	| `static [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Reads configuration settings from given `Config` that  must have the same layout as the `akka.actor.testkit.typed` section. |
	| `scala.concurrent.duration.FiniteDuration` | `[DefaultActorSystemShutdownTimeout](#DefaultActorSystemShutdownTimeout())()` | Dilated with \`TestTimeFactor\`. |
	| `[Timeout](../../../util/Timeout.html "class in akka.util")` | `[DefaultTimeout](#DefaultTimeout())()` | Dilated with \`TestTimeFactor\`. |
	| `java.time.Duration` | `[dilated](#dilated(java.time.Duration))​(java.time.Duration duration)` | Java API: Scale the `duration` with the configured `TestTimeFactor` |
	| `scala.concurrent.duration.FiniteDuration` | `[dilated](#dilated(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration duration)` | Scala API: Scale the `duration` with the configured `TestTimeFactor` |
	| `scala.concurrent.duration.FiniteDuration` | `[ExpectNoMessageDefaultTimeout](#ExpectNoMessageDefaultTimeout())()` | Dilated with \`TestTimeFactor\`. |
	| `scala.concurrent.duration.FiniteDuration` | `[FilterLeeway](#FilterLeeway())()` | Dilated with \`TestTimeFactor\`. |
	| `scala.concurrent.duration.FiniteDuration` | `[SingleExpectDefaultTimeout](#SingleExpectDefaultTimeout())()` | Dilated with \`TestTimeFactor\`. |
	| `double` | `[TestTimeFactor](#TestTimeFactor())()` |  |
	| `boolean` | `[ThrowOnShutdownTimeout](#ThrowOnShutdownTimeout())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestKitSettings
		
		
		
		```
		public TestKitSettings​(com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed") apply​([ActorSystem](../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Reads configuration settings from `akka.actor.testkit.typed` section.
		- #### apply
		
		
		
		```
		public static [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed") apply​(com.typesafe.config.Config config)
		```
		
		Reads configuration settings from given `Config` that
		 must have the same layout as the `akka.actor.testkit.typed` section.
		- #### create
		
		
		
		```
		public static [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed") create​([ActorSystem](../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API: Reads configuration settings from `akka.actor.testkit.typed` section.
		- #### create
		
		
		
		```
		public static [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed") create​(com.typesafe.config.Config config)
		```
		
		Reads configuration settings from given `Config` that
		 must have the same layout as the `akka.actor.testkit.typed` section.
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		- #### TestTimeFactor
		
		
		
		```
		public double TestTimeFactor()
		```
		- #### SingleExpectDefaultTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration SingleExpectDefaultTimeout()
		```
		
		Dilated with \`TestTimeFactor\`.
		- #### ExpectNoMessageDefaultTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration ExpectNoMessageDefaultTimeout()
		```
		
		Dilated with \`TestTimeFactor\`.
		- #### DefaultTimeout
		
		
		
		```
		public [Timeout](../../../util/Timeout.html "class in akka.util") DefaultTimeout()
		```
		
		Dilated with \`TestTimeFactor\`.
		- #### DefaultActorSystemShutdownTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration DefaultActorSystemShutdownTimeout()
		```
		
		Dilated with \`TestTimeFactor\`.
		- #### ThrowOnShutdownTimeout
		
		
		
		```
		public boolean ThrowOnShutdownTimeout()
		```
		- #### FilterLeeway
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration FilterLeeway()
		```
		
		Dilated with \`TestTimeFactor\`.
		- #### dilated
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration dilated​(scala.concurrent.duration.FiniteDuration duration)
		```
		
		Scala API: Scale the `duration` with the configured `TestTimeFactor`
		- #### dilated
		
		
		
		```
		public java.time.Duration dilated​(java.time.Duration duration)
		```
		
		Java API: Scale the `duration` with the configured `TestTimeFactor`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/TestKitSettings.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/TestKitSettings.html)*