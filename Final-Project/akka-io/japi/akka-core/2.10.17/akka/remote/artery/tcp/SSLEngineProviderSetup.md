---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:29:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProviderSetup.html
title: SSLEngineProviderSetup
---

# SSLEngineProviderSetup

## Content

Package [akka.remote.artery.tcp](package-summary.html)
## Class SSLEngineProviderSetup

- java.lang.Object
- - [akka.actor.setup.Setup](../../../actor/setup/Setup.html "class in akka.actor.setup")
	- - akka.remote.artery.tcp.SSLEngineProviderSetup

- ---

```
public class SSLEngineProviderSetup
extends [Setup](../../../actor/setup/Setup.html "class in akka.actor.setup")
```

Setup for defining a `SSLEngineProvider` that is passed in when ActorSystem
 is created rather than creating one from configured class name. That is useful
 when the SSLEngineProvider implementation require other external constructor parameters
 or is created before the ActorSystem is created.
 
 Constructor is \*Internal API\*, use factories in [`SSLEngineProviderSetup`](SSLEngineProviderSetup.html "class in akka.remote.artery.tcp")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SSLEngineProviderSetup](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SSLEngineProviderSetup](SSLEngineProviderSetup.html "class in akka.remote.artery.tcp")` | `[apply](#apply(scala.Function1))​(scala.Function1<[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor"),​[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")> sslEngineProvider)` | Scala API: factory for defining a `SSLEngineProvider` that is passed in when ActorSystem  is created rather than creating one from configured class name. |
	| `static [SSLEngineProviderSetup](SSLEngineProviderSetup.html "class in akka.remote.artery.tcp")` | `[create](#create(java.util.function.Function))​(java.util.function.Function<[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor"),​[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")> sslEngineProvider)` | Java API: factory for defining a `SSLEngineProvider` that is passed in when ActorSystem  is created rather than creating one from configured class name. |
	| `scala.Function1<[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor"),​[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")>` | `[sslEngineProvider](#sslEngineProvider())()` |  |
	
	
		- ### Methods inherited from class akka.actor.setup.[Setup](../../../actor/setup/Setup.html "class in akka.actor.setup")
		
		
		`[and](../../../actor/setup/Setup.html#and(akka.actor.setup.Setup))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SSLEngineProviderSetup
		
		
		
		```
		public SSLEngineProviderSetup()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SSLEngineProviderSetup](SSLEngineProviderSetup.html "class in akka.remote.artery.tcp") apply​(scala.Function1<[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor"),​[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")> sslEngineProvider)
		```
		
		Scala API: factory for defining a `SSLEngineProvider` that is passed in when ActorSystem
		 is created rather than creating one from configured class name.
		- #### create
		
		
		
		```
		public static [SSLEngineProviderSetup](SSLEngineProviderSetup.html "class in akka.remote.artery.tcp") create​(java.util.function.Function<[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor"),​[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")> sslEngineProvider)
		```
		
		Java API: factory for defining a `SSLEngineProvider` that is passed in when ActorSystem
		 is created rather than creating one from configured class name.
		- #### sslEngineProvider
		
		
		
		```
		public scala.Function1<[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor"),​[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")> sslEngineProvider()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProviderSetup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/tcp/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProviderSetup.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProviderSetup.html)*