---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingleton.html
title: ClusterSingleton
---

# ClusterSingleton

## Content

Package [akka.cluster.typed](package-summary.html)
## Class ClusterSingleton

- java.lang.Object
- - akka.cluster.typed.ClusterSingleton

- All Implemented Interfaces:
`[Extension](../../actor/typed/Extension.html "interface in akka.actor.typed")`

---

```
public abstract class ClusterSingleton
extends java.lang.Object
implements [Extension](../../actor/typed/Extension.html "interface in akka.actor.typed")
```

This class is not intended for user extension other than for test purposes (e.g.
 stub implementation). More methods may be added in the future and that may break
 such implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingleton](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static [ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")<T>` | `[id](#id())()` |  |
	| `abstract <M> [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<M>` | `[init](#init(akka.cluster.typed.SingletonActor))​([SingletonActor](SingletonActor.html "class in akka.cluster.typed")<M> singleton)` | Start if needed and provide a proxy to a named singleton |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterSingleton
		
		
		
		```
		public ClusterSingleton()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public static [ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed") createExtension​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### get
		
		
		
		```
		public static [ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed") get​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API:
		- #### apply
		
		
		
		```
		public static final T apply​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### id
		
		
		
		```
		public static [ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")<T> id()
		```
		- #### init
		
		
		
		```
		public abstract <M> [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<M> init​([SingletonActor](SingletonActor.html "class in akka.cluster.typed")<M> singleton)
		```
		
		Start if needed and provide a proxy to a named singleton
		 
		 If there already is a manager running for the given `singletonName` on this node, no additional manager is started.
		 If there already is a proxy running for the given `singletonName` on this node, an `ActorRef` to that is returned.
		 
		
		
		
		Returns:
		A proxy actor that can be used to communicate with the singleton in the cluster

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/SingletonActor.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingleton.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingleton.html)*