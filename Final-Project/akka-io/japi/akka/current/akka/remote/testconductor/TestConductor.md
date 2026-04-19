---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:37:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductor.html
title: TestConductor
---

# TestConductor

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class TestConductor

- java.lang.Object
- - akka.remote.testconductor.TestConductor

- ---

```
public class TestConductor
extends java.lang.Object
```

Access to the [`TestConductorExt`](TestConductorExt.html "class in akka.remote.testconductor") extension:
 

```

 val tc = TestConductor(system)
 tc.startController(numPlayers)
 // OR
 tc.startClient(conductorPort)
 
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestConductor](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")` | `[apply](#apply(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") ctx)` |  |
	| `static [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Java API: retrieve the TestConductor extension for the given system. |
	| `static [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [TestConductor$](TestConductor$.html "class in akka.remote.testconductor")` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestConductor
		
		
		
		```
		public TestConductor()
		```

	- ### Method Detail
	
	
	
		- #### lookup
		
		
		
		```
		public static [TestConductor$](TestConductor$.html "class in akka.remote.testconductor") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API: retrieve the TestConductor extension for the given system.
		- #### get
		
		
		
		```
		public static [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor") apply​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") ctx)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```

## Code Examples

### Example 1: Class TestConductor

```text
val tc = TestConductor(system)
 tc.startController(numPlayers)
 // OR
 tc.startClient(conductorPort)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductor.html](https://doc.akka.io/japi/akka/current/akka/remote/testconductor/TestConductor.html)*