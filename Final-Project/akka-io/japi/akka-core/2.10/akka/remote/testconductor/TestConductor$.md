---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductor$.html
title: TestConductor$
---

# TestConductor$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class TestConductor$

- java.lang.Object
- - akka.remote.testconductor.TestConductor$

- All Implemented Interfaces:
`[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")>`, `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class TestConductor$
extends java.lang.Object
implements [ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")>, [ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

Access to the [`TestConductorExt`](TestConductorExt.html "class in akka.remote.testconductor") extension:
 

```

 val tc = TestConductor(system)
 tc.startController(numPlayers)
 // OR
 tc.startClient(conductorPort)
 
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestConductor$](TestConductor$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestConductor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")` | `[apply](#apply(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") ctx)` |  |
	| `[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Java API: retrieve the TestConductor extension for the given system. |
	| `[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[TestConductor$](TestConductor$.html "class in akka.remote.testconductor")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestConductor$](TestConductor$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestConductor$
		
		
		
		```
		public TestConductor$()
		```

	- ### Method Detail
	
	
	
		- #### lookup
		
		
		
		```
		public [TestConductor$](TestConductor$.html "class in akka.remote.testconductor") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")>`
		- #### get
		
		
		
		```
		public [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API: retrieve the TestConductor extension for the given system.
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")>`
		- #### get
		
		
		
		```
		public [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")>`
		- #### apply
		
		
		
		```
		public [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor") apply​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") ctx)
		```

## Code Examples

### Example 1: Class TestConductor$

```text
val tc = TestConductor(system)
 tc.startController(numPlayers)
 // OR
 tc.startClient(conductorPort)
```

### Example 2: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductor$.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductor$.html)*