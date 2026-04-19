---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:16:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/DnsProvider.html
title: DnsProvider
---

# DnsProvider

## Content

Package [akka.io](package-summary.html)
## Interface DnsProvider

- All Known Implementing Classes:
`[InetAddressDnsProvider](InetAddressDnsProvider.html "class in akka.io")`

---

```
public interface DnsProvider
```

Deprecated.
Overriding the DNS implementation will be removed in future versions of Akka. Since 2\.6\.0\.

Where as it is possible to plug in alternative DNS implementations it is not recommended.
 
 It is expected that this will be deprecated/removed in future Akka versions
 

 TODO make private and remove deprecated in 2\.7\.0

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Class<? extends [Actor](../actor/Actor.html "interface in akka.actor")>` | `[actorClass](#actorClass())()` | Deprecated. DNS resolver actor. |
	| `[Dns](Dns.html "class in akka.io")` | `[cache](#cache())()` | Deprecated. Cache implementation that can be accessed via Dns(system) to avoid asks to the resolver actors. |
	| `java.lang.Class<? extends [Actor](../actor/Actor.html "interface in akka.actor")>` | `[managerClass](#managerClass())()` | Deprecated. DNS manager class. |

- - ### Method Detail
	
	
	
		- #### actorClass
		
		
		
		```
		java.lang.Class<? extends [Actor](../actor/Actor.html "interface in akka.actor")> actorClass()
		```
		
		Deprecated.
		DNS resolver actor. Should respond to [`DnsProtocol.Resolve`](dns/DnsProtocol.Resolve.html "class in akka.io.dns") with
		 [`DnsProtocol.Resolved`](dns/DnsProtocol.Resolved.html "class in akka.io.dns")
		- #### cache
		
		
		
		```
		[Dns](Dns.html "class in akka.io") cache()
		```
		
		Deprecated.
		Cache implementation that can be accessed via Dns(system) to avoid asks to the resolver actors.
		 It is not recommended to override the default SimpleDnsCache
		- #### managerClass
		
		
		
		```
		java.lang.Class<? extends [Actor](../actor/Actor.html "interface in akka.actor")> managerClass()
		```
		
		Deprecated.
		DNS manager class. Is responsible for creating resolvers and doing any cache cleanup.
		 The DNS extension will create one of these Actors. It should have a ctr that accepts
		 a [`DnsExt`](DnsExt.html "class in akka.io")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/io/Dns.html
- https://doc.akka.io/japi/akka/current/akka/io/DnsExt.html
- https://doc.akka.io/japi/akka/current/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Resolve.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Resolved.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/DnsProvider.html](https://doc.akka.io/japi/akka/current/akka/io/DnsProvider.html)*