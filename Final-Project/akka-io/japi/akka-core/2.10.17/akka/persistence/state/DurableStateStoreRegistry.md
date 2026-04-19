---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:15:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry.html
title: DurableStateStoreRegistry
---

# DurableStateStoreRegistry

## Content

Package [akka.persistence.state](package-summary.html)
## Class DurableStateStoreRegistry

- java.lang.Object
- - akka.persistence.PersistencePlugin\<[DurableStateStore](scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")\<?\>,​[DurableStateStore](javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")\<?\>,​[DurableStateStoreProvider](DurableStateStoreProvider.html "interface in akka.persistence.state")\>
	- - akka.persistence.state.DurableStateStoreRegistry

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public class DurableStateStoreRegistry
extends akka.persistence.PersistencePlugin<[DurableStateStore](scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")<?>,​[DurableStateStore](javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<?>,​[DurableStateStoreProvider](DurableStateStoreProvider.html "interface in akka.persistence.state")>
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.persistence.PersistencePlugin
		
		
		`akka.persistence.PersistencePlugin.PluginHolder<ScalaDsl extends java.lang.Object,​JavaDsl extends java.lang.Object>, akka.persistence.PersistencePlugin.PluginHolder$`

	- ### Field Summary
	
	
		- ### Fields inherited from class akka.persistence.PersistencePlugin
		
		
		`akka$persistence$PersistencePlugin$$ev, akka$persistence$PersistencePlugin$$system`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DurableStateStoreRegistry](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `<T extends [DurableStateStore](scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")<?>>T` | `[durableStateStoreFor](#durableStateStoreFor(java.lang.String))​(java.lang.String pluginId)` | Scala API: Returns the [`DurableStateStore`](scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl") specified by the given  configuration entry. |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `<T extends [DurableStateStore](javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<?>>T` | `[getDurableStateStoreFor](#getDurableStateStoreFor(java.lang.Class,java.lang.String))​(java.lang.Class<T> clazz,  java.lang.String pluginId)` | Java API: Returns the [`DurableStateStore`](javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl") specified by the given  configuration entry. |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [DurableStateStoreRegistry$](DurableStateStoreRegistry$.html "class in akka.persistence.state")` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.PersistencePlugin
		
		
		`akka$persistence$PersistencePlugin$$createPlugin, akka$persistence$PersistencePlugin$$instantiate$1, pluginFor`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DurableStateStoreRegistry
		
		
		
		```
		public DurableStateStoreRegistry​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### createExtension
		
		
		
		```
		public static [DurableStateStoreRegistry](DurableStateStoreRegistry.html "class in akka.persistence.state") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [DurableStateStoreRegistry$](DurableStateStoreRegistry$.html "class in akka.persistence.state") lookup()
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
		- #### durableStateStoreFor
		
		
		
		```
		public final <T extends [DurableStateStore](scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl")<?>> T durableStateStoreFor​(java.lang.String pluginId)
		```
		
		Scala API: Returns the [`DurableStateStore`](scaladsl/DurableStateStore.html "interface in akka.persistence.state.scaladsl") specified by the given
		 configuration entry.
		- #### getDurableStateStoreFor
		
		
		
		```
		public final <T extends [DurableStateStore](javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl")<?>> T getDurableStateStoreFor​(java.lang.Class<T> clazz,
		                                                                        java.lang.String pluginId)
		```
		
		Java API: Returns the [`DurableStateStore`](javadsl/DurableStateStore.html "interface in akka.persistence.state.javadsl") specified by the given
		 configuration entry.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/scaladsl/DurableStateStore.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry.html)*