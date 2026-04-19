---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:17:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/InetAddressDnsProvider.html
title: InetAddressDnsProvider
---

# InetAddressDnsProvider

## Content

Package [akka.io](package-summary.html)
## Class InetAddressDnsProvider

- java.lang.Object
- - akka.io.InetAddressDnsProvider

- All Implemented Interfaces:
`[DnsProvider](DnsProvider.html "interface in akka.io")`

---

```
public class InetAddressDnsProvider
extends java.lang.Object
implements [DnsProvider](DnsProvider.html "interface in akka.io")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InetAddressDnsProvider](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Class<[InetAddressDnsResolver](InetAddressDnsResolver.html "class in akka.io")>` | `[actorClass](#actorClass())()` | DNS resolver actor. |
	| `[Dns](Dns.html "class in akka.io")` | `[cache](#cache())()` | Cache implementation that can be accessed via Dns(system) to avoid asks to the resolver actors. |
	| `java.lang.Class<[SimpleDnsManager](SimpleDnsManager.html "class in akka.io")>` | `[managerClass](#managerClass())()` | DNS manager class. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### InetAddressDnsProvider
		
		
		
		```
		public InetAddressDnsProvider()
		```

	- ### Method Detail
	
	
	
		- #### actorClass
		
		
		
		```
		public java.lang.Class<[InetAddressDnsResolver](InetAddressDnsResolver.html "class in akka.io")> actorClass()
		```
		
		Description copied from interface: `[DnsProvider](DnsProvider.html#actorClass())`
		DNS resolver actor. Should respond to [`DnsProtocol.Resolve`](dns/DnsProtocol.Resolve.html "class in akka.io.dns") with
		 [`DnsProtocol.Resolved`](dns/DnsProtocol.Resolved.html "class in akka.io.dns")
		
		Specified by:
		`[actorClass](DnsProvider.html#actorClass())` in interface `[DnsProvider](DnsProvider.html "interface in akka.io")`
		- #### cache
		
		
		
		```
		public [Dns](Dns.html "class in akka.io") cache()
		```
		
		Description copied from interface: `[DnsProvider](DnsProvider.html#cache())`
		Cache implementation that can be accessed via Dns(system) to avoid asks to the resolver actors.
		 It is not recommended to override the default SimpleDnsCache
		
		Specified by:
		`[cache](DnsProvider.html#cache())` in interface `[DnsProvider](DnsProvider.html "interface in akka.io")`
		- #### managerClass
		
		
		
		```
		public java.lang.Class<[SimpleDnsManager](SimpleDnsManager.html "class in akka.io")> managerClass()
		```
		
		Description copied from interface: `[DnsProvider](DnsProvider.html#managerClass())`
		DNS manager class. Is responsible for creating resolvers and doing any cache cleanup.
		 The DNS extension will create one of these Actors. It should have a ctr that accepts
		 a [`DnsExt`](DnsExt.html "class in akka.io")
		
		Specified by:
		`[managerClass](DnsProvider.html#managerClass())` in interface `[DnsProvider](DnsProvider.html "interface in akka.io")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/Dns.html
- https://doc.akka.io/japi/akka/current/akka/io/DnsExt.html
- https://doc.akka.io/japi/akka/current/akka/io/DnsProvider.html
- https://doc.akka.io/japi/akka/current/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/japi/akka/current/akka/io/SimpleDnsManager.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Resolve.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Resolved.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/InetAddressDnsProvider.html](https://doc.akka.io/japi/akka/current/akka/io/InetAddressDnsProvider.html)*