---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html
title: PersistencePluginProxyExtensionImpl
---

# PersistencePluginProxyExtensionImpl

## Content

Package [akka.persistence.journal](package-summary.html)
## Class PersistencePluginProxyExtensionImpl

- java.lang.Object
- - akka.persistence.journal.PersistencePluginProxyExtensionImpl

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public class PersistencePluginProxyExtensionImpl
extends java.lang.Object
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

PersistencePluginProxyExtensionImpl is an `Extension` that enables initialization of the `PersistencePluginProxy`
 via configuration, without requiring any code changes or the creation of any actors.
 param: system The actor system to initialize the extension for

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistencePluginProxyExtensionImpl](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistencePluginProxyExtensionImpl
		
		
		
		```
		public PersistencePluginProxyExtensionImpl​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html)*