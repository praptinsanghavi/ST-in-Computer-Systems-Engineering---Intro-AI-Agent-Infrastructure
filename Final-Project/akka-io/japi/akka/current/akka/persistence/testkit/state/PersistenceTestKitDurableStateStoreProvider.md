---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html
title: PersistenceTestKitDurableStateStoreProvider
---

# PersistenceTestKitDurableStateStoreProvider

## Content

Package [akka.persistence.testkit.state](package-summary.html)
## Class PersistenceTestKitDurableStateStoreProvider

- java.lang.Object
- - akka.persistence.testkit.state.PersistenceTestKitDurableStateStoreProvider

- All Implemented Interfaces:
`[DurableStateStoreProvider](../../state/DurableStateStoreProvider.html "interface in akka.persistence.state")`

---

```
public class PersistenceTestKitDurableStateStoreProvider
extends java.lang.Object
implements [DurableStateStoreProvider](../../state/DurableStateStoreProvider.html "interface in akka.persistence.state")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceTestKitDurableStateStoreProvider](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DurableStateStore](../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<java.lang.Object>` | `[javadslDurableStateStore](#javadslDurableStateStore())()` | The `DurableStateStore` implementation for the Java API. |
	| `[DurableStateStore](../../state/scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")<java.lang.Object>` | `[scaladslDurableStateStore](#scaladslDurableStateStore())()` | The `DurableStateStore` implementation for the Scala API. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistenceTestKitDurableStateStoreProvider
		
		
		
		```
		public PersistenceTestKitDurableStateStoreProvider​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### javadslDurableStateStore
		
		
		
		```
		public [DurableStateStore](../../state/javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<java.lang.Object> javadslDurableStateStore()
		```
		
		Description copied from interface: `[DurableStateStoreProvider](../../state/DurableStateStoreProvider.html#javadslDurableStateStore())`
		The `DurableStateStore` implementation for the Java API.
		 This corresponds to the instance that is returned by [`DurableStateStoreRegistry.getDurableStateStoreFor(java.lang.Class<T>, java.lang.String)`](../../state/DurableStateStoreRegistry.html#getDurableStateStoreFor(java.lang.Class,java.lang.String)).
		
		Specified by:
		`[javadslDurableStateStore](../../state/DurableStateStoreProvider.html#javadslDurableStateStore())` in interface `[DurableStateStoreProvider](../../state/DurableStateStoreProvider.html "interface in akka.persistence.state")`
		- #### scaladslDurableStateStore
		
		
		
		```
		public [DurableStateStore](../../state/scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")<java.lang.Object> scaladslDurableStateStore()
		```
		
		Description copied from interface: `[DurableStateStoreProvider](../../state/DurableStateStoreProvider.html#scaladslDurableStateStore())`
		The `DurableStateStore` implementation for the Scala API.
		 This corresponds to the instance that is returned by [`DurableStateStoreRegistry.durableStateStoreFor(java.lang.String)`](../../state/DurableStateStoreRegistry.html#durableStateStoreFor(java.lang.String)).
		
		Specified by:
		`[scaladslDurableStateStore](../../state/DurableStateStoreProvider.html#scaladslDurableStateStore())` in interface `[DurableStateStoreProvider](../../state/DurableStateStoreProvider.html "interface in akka.persistence.state")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/DurableStateStoreProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/DurableStateStoreRegistry.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/PersistenceTestKitDurableStateStoreProvider.html)*