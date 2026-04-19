---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:15:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/DnsExt.html
title: DnsExt
---

# DnsExt

## Content

Package [akka.io](package-summary.html)
## Class DnsExt

- java.lang.Object
- - akka.io.DnsExt

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`, `[IO.Extension](IO.Extension.html "interface in akka.io")`

---

```
public class DnsExt
extends java.lang.Object
implements [IO.Extension](IO.Extension.html "interface in akka.io")
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[DnsExt.Settings](DnsExt.Settings.html "class in akka.io")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DnsExt](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | INTERNAL API |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Dns](Dns.html "class in akka.io")` | `[cache](#cache())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[getResolver](#getResolver())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[manager](#manager())()` |  |
	| `[DnsProvider](DnsProvider.html "interface in akka.io")` | `[provider](#provider())()` |  |
	| `[DnsExt.Settings](DnsExt.Settings.html "class in akka.io")` | `[Settings](#Settings())()` |  |
	| `[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DnsExt
		
		
		
		```
		public DnsExt​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		INTERNAL API
		 
		 Use IO(DNS) or Dns(system). Do not instantiate directly
		 
		
		
		 For binary compat as DnsExt constructor didn't used to have internal API on

	- ### Method Detail
	
	
	
		- #### Settings
		
		
		
		```
		public [DnsExt.Settings](DnsExt.Settings.html "class in akka.io") Settings()
		```
		- #### cache
		
		
		
		```
		public [Dns](Dns.html "class in akka.io") cache()
		```
		- #### getResolver
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") getResolver()
		```
		- #### manager
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") manager()
		```
		
		
		Specified by:
		`[manager](IO.Extension.html#manager())` in interface `[IO.Extension](IO.Extension.html "interface in akka.io")`
		- #### provider
		
		
		
		```
		public [DnsProvider](DnsProvider.html "interface in akka.io") provider()
		```
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Dns.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/DnsExt.Settings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/DnsProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/IO.Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/DnsExt.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/DnsExt.html)*