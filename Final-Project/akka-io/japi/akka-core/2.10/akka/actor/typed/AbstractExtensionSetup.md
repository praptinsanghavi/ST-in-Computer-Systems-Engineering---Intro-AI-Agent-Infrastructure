---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/AbstractExtensionSetup.html
title: AbstractExtensionSetup
---

# AbstractExtensionSetup

## Content

Package [akka.actor.typed](package-summary.html)
## Class AbstractExtensionSetup\<T extends [Extension](Extension.html "interface in akka.actor.typed")\>

- java.lang.Object
- - [akka.actor.setup.Setup](../setup/Setup.html "class in akka.actor.setup")
	- - [akka.actor.typed.ExtensionSetup](ExtensionSetup.html "class in akka.actor.typed")\<T\>
		- - akka.actor.typed.AbstractExtensionSetup\<T\>

- ---

```
public abstract class AbstractExtensionSetup<T extends [Extension](Extension.html "interface in akka.actor.typed")>
extends [ExtensionSetup](ExtensionSetup.html "class in akka.actor.typed")<T>
```

Scala 2\.11 API: Each extension typically provide a concrete `ExtensionSetup` that can be used in
 [`ActorSystemSetup`](../setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") to replace the default
 implementation of the extension. Intended for tests that need to replace
 extension with stub/mock implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractExtensionSetup](#%3Cinit%3E(akka.actor.typed.ExtensionId,scala.Function1))​([ExtensionId](ExtensionId.html "class in akka.actor.typed")<[T](AbstractExtensionSetup.html "type parameter in AbstractExtensionSetup")> extId,  scala.Function1<[ActorSystem](ActorSystem.html "class in akka.actor.typed")<?>,​[T](AbstractExtensionSetup.html "type parameter in AbstractExtensionSetup")> createExtension)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionSetup](ExtensionSetup.html "class in akka.actor.typed")
		
		
		`[createExtension](ExtensionSetup.html#createExtension()), [extId](ExtensionSetup.html#extId())`
		- ### Methods inherited from class akka.actor.setup.[Setup](../setup/Setup.html "class in akka.actor.setup")
		
		
		`[and](../setup/Setup.html#and(akka.actor.setup.Setup))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AbstractExtensionSetup
		
		
		
		```
		public AbstractExtensionSetup​([ExtensionId](ExtensionId.html "class in akka.actor.typed")<[T](AbstractExtensionSetup.html "type parameter in AbstractExtensionSetup")> extId,
		                              scala.Function1<[ActorSystem](ActorSystem.html "class in akka.actor.typed")<?>,​[T](AbstractExtensionSetup.html "type parameter in AbstractExtensionSetup")> createExtension)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/AbstractExtensionSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/AbstractExtensionSetup.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/AbstractExtensionSetup.html)*