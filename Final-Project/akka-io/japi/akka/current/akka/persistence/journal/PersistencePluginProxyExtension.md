---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/PersistencePluginProxyExtension.html
title: PersistencePluginProxyExtension
---

# PersistencePluginProxyExtension

## Content

Package [akka.persistence.journal](package-summary.html)
## Class PersistencePluginProxyExtension

- java.lang.Object
- - akka.persistence.journal.PersistencePluginProxyExtension

- ---

```
public class PersistencePluginProxyExtension
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistencePluginProxyExtension](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../../actor/Extension.html "interface in akka.actor")>` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistencePluginProxyExtension
		
		
		
		```
		public PersistencePluginProxyExtension()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public static [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<? extends [Extension](../../actor/Extension.html "interface in akka.actor")> lookup()
		```
		- #### get
		
		
		
		```
		public static [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/PersistencePluginProxyExtension.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/PersistencePluginProxyExtension.html)*