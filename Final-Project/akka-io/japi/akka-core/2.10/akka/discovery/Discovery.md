---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/discovery/Discovery.html
title: Discovery
---

# Discovery

## Content

Package [akka.discovery](package-summary.html)
## Class Discovery

- java.lang.Object
- - akka.discovery.Discovery

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public final class Discovery
extends java.lang.Object
implements [Extension](../actor/Extension.html "interface in akka.actor")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Discovery](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Discovery](Discovery.html "class in akka.discovery")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [Discovery](Discovery.html "class in akka.discovery")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `[ServiceDiscovery](ServiceDiscovery.html "class in akka.discovery")` | `[discovery](#discovery())()` | Default [`ServiceDiscovery`](ServiceDiscovery.html "class in akka.discovery") as configured in `akka.discovery.method`. |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [Discovery](Discovery.html "class in akka.discovery")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [Discovery](Discovery.html "class in akka.discovery")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `[ServiceDiscovery](ServiceDiscovery.html "class in akka.discovery")` | `[loadServiceDiscovery](#loadServiceDiscovery(java.lang.String))​(java.lang.String method)` | Create a [`ServiceDiscovery`](ServiceDiscovery.html "class in akka.discovery") from configuration property. |
	| `static [Discovery$](Discovery$.html "class in akka.discovery")` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Discovery
		
		
		
		```
		public Discovery​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Discovery](Discovery.html "class in akka.discovery") apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [Discovery$](Discovery$.html "class in akka.discovery") lookup()
		```
		- #### get
		
		
		
		```
		public static [Discovery](Discovery.html "class in akka.discovery") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [Discovery](Discovery.html "class in akka.discovery") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### createExtension
		
		
		
		```
		public static [Discovery](Discovery.html "class in akka.discovery") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### discovery
		
		
		
		```
		public [ServiceDiscovery](ServiceDiscovery.html "class in akka.discovery") discovery()
		                           throws java.lang.IllegalArgumentException
		```
		
		Default [`ServiceDiscovery`](ServiceDiscovery.html "class in akka.discovery") as configured in `akka.discovery.method`.
		
		Throws:
		`java.lang.IllegalArgumentException`
		- #### loadServiceDiscovery
		
		
		
		```
		public [ServiceDiscovery](ServiceDiscovery.html "class in akka.discovery") loadServiceDiscovery​(java.lang.String method)
		```
		
		Create a [`ServiceDiscovery`](ServiceDiscovery.html "class in akka.discovery") from configuration property.
		 The given `method` parameter is used to find configuration property
		 "akka.discovery.\[method].class".
		 
		 The `ServiceDiscovery` instance for a given `method` will be created
		 once and subsequent requests for the same `method` will return the same instance.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/discovery/Discovery$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/discovery/Discovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/discovery/ServiceDiscovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/discovery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/discovery/Discovery.html](https://doc.akka.io/japi/akka-core/2.10/akka/discovery/Discovery.html)*