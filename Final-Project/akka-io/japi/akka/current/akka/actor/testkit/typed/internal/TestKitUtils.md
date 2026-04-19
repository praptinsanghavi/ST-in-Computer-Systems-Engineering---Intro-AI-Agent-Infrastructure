---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/TestKitUtils.html
title: TestKitUtils
---

# TestKitUtils

## Content

Package [akka.actor.testkit.typed.internal](package-summary.html)
## Class TestKitUtils

- java.lang.Object
- - akka.actor.testkit.typed.internal.TestKitUtils

- ---

```
public class TestKitUtils
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestKitUtils](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[scrubActorSystemName](#scrubActorSystemName(java.lang.String))​(java.lang.String name)` | Sanitize the `name` to be used as valid actor system name by  replacing invalid characters. |
	| `static void` | `[shutdown](#shutdown(akka.actor.typed.ActorSystem,scala.concurrent.duration.Duration,boolean))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,  scala.concurrent.duration.Duration timeout,  boolean throwIfShutdownTimesOut)` |  |
	| `static java.lang.String` | `[testNameFromCallStack](#testNameFromCallStack(java.lang.Class))​(java.lang.Class<?> classToStartFrom)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestKitUtils
		
		
		
		```
		public TestKitUtils()
		```

	- ### Method Detail
	
	
	
		- #### testNameFromCallStack
		
		
		
		```
		public static java.lang.String testNameFromCallStack​(java.lang.Class<?> classToStartFrom)
		```
		- #### scrubActorSystemName
		
		
		
		```
		public static java.lang.String scrubActorSystemName​(java.lang.String name)
		```
		
		Sanitize the `name` to be used as valid actor system name by
		 replacing invalid characters. `name` may for example be a fully qualified
		 class name and then the short class name will be used.
		- #### shutdown
		
		
		
		```
		public static void shutdown​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                            scala.concurrent.duration.Duration timeout,
		                            boolean throwIfShutdownTimesOut)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/TestKitUtils.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/TestKitUtils.html)*