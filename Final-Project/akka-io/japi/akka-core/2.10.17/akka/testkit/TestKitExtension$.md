---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:16:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestKitExtension$.html
title: TestKitExtension$
---

# TestKitExtension$

## Content

Package [akka.testkit](package-summary.html)
## Class TestKitExtension$

- java.lang.Object
- - akka.testkit.TestKitExtension$

- All Implemented Interfaces:
`[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[TestKitSettings](TestKitSettings.html "class in akka.testkit")>`

---

```
public class TestKitExtension$
extends java.lang.Object
implements [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[TestKitSettings](TestKitSettings.html "class in akka.testkit")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestKitExtension$](TestKitExtension$.html "class in akka.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestKitExtension$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestKitSettings](TestKitSettings.html "class in akka.testkit")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[TestKitSettings](TestKitSettings.html "class in akka.testkit")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[TestKitSettings](TestKitSettings.html "class in akka.testkit")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestKitExtension$](TestKitExtension$.html "class in akka.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestKitExtension$
		
		
		
		```
		public TestKitExtension$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [TestKitSettings](TestKitSettings.html "class in akka.testkit") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#get(akka.actor.ActorSystem))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[TestKitSettings](TestKitSettings.html "class in akka.testkit")>`
		- #### get
		
		
		
		```
		public [TestKitSettings](TestKitSettings.html "class in akka.testkit") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[TestKitSettings](TestKitSettings.html "class in akka.testkit")>`
		- #### createExtension
		
		
		
		```
		public [TestKitSettings](TestKitSettings.html "class in akka.testkit") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[TestKitSettings](TestKitSettings.html "class in akka.testkit")>`

## Code Examples

### Example 1: get

```text
override def get(system: ActorSystem): TheExtension = super.get(system)
```

### Example 2: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestKitExtension$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestKitSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestKitExtension$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestKitExtension$.html)*