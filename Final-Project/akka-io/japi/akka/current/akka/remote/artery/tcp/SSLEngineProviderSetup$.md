---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProviderSetup$.html
title: SSLEngineProviderSetup$
---

# SSLEngineProviderSetup$

## Content

Package [akka.remote.artery.tcp](package-summary.html)
## Class SSLEngineProviderSetup$

- java.lang.Object
- - akka.remote.artery.tcp.SSLEngineProviderSetup$

- ---

```
public class SSLEngineProviderSetup$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SSLEngineProviderSetup$](SSLEngineProviderSetup$.html "class in akka.remote.artery.tcp")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SSLEngineProviderSetup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SSLEngineProviderSetup](SSLEngineProviderSetup.html "class in akka.remote.artery.tcp")` | `[apply](#apply(scala.Function1))​(scala.Function1<[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor"),​[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")> sslEngineProvider)` | Scala API: factory for defining a `SSLEngineProvider` that is passed in when ActorSystem  is created rather than creating one from configured class name. |
	| `[SSLEngineProviderSetup](SSLEngineProviderSetup.html "class in akka.remote.artery.tcp")` | `[create](#create(java.util.function.Function))​(java.util.function.Function<[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor"),​[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")> sslEngineProvider)` | Java API: factory for defining a `SSLEngineProvider` that is passed in when ActorSystem  is created rather than creating one from configured class name. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SSLEngineProviderSetup$](SSLEngineProviderSetup$.html "class in akka.remote.artery.tcp") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SSLEngineProviderSetup$
		
		
		
		```
		public SSLEngineProviderSetup$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [SSLEngineProviderSetup](SSLEngineProviderSetup.html "class in akka.remote.artery.tcp") apply​(scala.Function1<[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor"),​[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")> sslEngineProvider)
		```
		
		Scala API: factory for defining a `SSLEngineProvider` that is passed in when ActorSystem
		 is created rather than creating one from configured class name.
		- #### create
		
		
		
		```
		public [SSLEngineProviderSetup](SSLEngineProviderSetup.html "class in akka.remote.artery.tcp") create​(java.util.function.Function<[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor"),​[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")> sslEngineProvider)
		```
		
		Java API: factory for defining a `SSLEngineProvider` that is passed in when ActorSystem
		 is created rather than creating one from configured class name.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProvider.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProviderSetup$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProviderSetup.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProviderSetup$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProviderSetup$.html)*