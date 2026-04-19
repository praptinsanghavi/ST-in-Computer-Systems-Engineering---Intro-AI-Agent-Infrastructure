---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/SimpleDnsCache.html
title: SimpleDnsCache
---

# SimpleDnsCache

## Content

Package [akka.io](package-summary.html)
## Class SimpleDnsCache

- java.lang.Object
- - [akka.io.Dns](Dns.html "class in akka.io")
	- - akka.io.SimpleDnsCache

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[PeriodicCacheCleanup](PeriodicCacheCleanup.html "interface in akka.io")`

---

```
public class SimpleDnsCache
extends [Dns](Dns.html "class in akka.io")
implements [PeriodicCacheCleanup](PeriodicCacheCleanup.html "interface in akka.io"), [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[SimpleDnsCache.CacheEntry$](SimpleDnsCache.CacheEntry$.html "class in akka.io")` |  |
	
	
		- ### Nested classes/interfaces inherited from class akka.io.[Dns](Dns.html "class in akka.io")
		
		
		`[Dns.Command](Dns.Command.html "interface in akka.io"), [Dns.Resolve](Dns.Resolve.html "class in akka.io"), [Dns.Resolve$](Dns.Resolve$.html "class in akka.io"), [Dns.Resolved](Dns.Resolved.html "class in akka.io"), [Dns.Resolved$](Dns.Resolved$.html "class in akka.io")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SimpleDnsCache](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns")>` | `[cached](#cached(akka.io.dns.DnsProtocol.Resolve))​([DnsProtocol.Resolve](dns/DnsProtocol.Resolve.html "class in akka.io.dns") request)` |  |
	| `scala.Option<[Dns.Resolved](Dns.Resolved.html "class in akka.io")>` | `[cached](#cached(java.lang.String))​(java.lang.String name)` | Gets any IPv4 and IPv6 cached entries. |
	| `void` | `[cleanup](#cleanup())()` |  |
	| `protected long` | `[clock](#clock())()` |  |
	
	
		- ### Methods inherited from class akka.io.[Dns](Dns.html "class in akka.io")
		
		
		`[apply](Dns.html#apply(akka.actor.ActorSystem)), [apply](Dns.html#apply(akka.actor.ClassicActorSystemProvider)), [createExtension](Dns.html#createExtension(akka.actor.ExtendedActorSystem)), [equals](Dns.html#equals(java.lang.Object)), [get](Dns.html#get(akka.actor.ActorSystem)), [get](Dns.html#get(akka.actor.ClassicActorSystemProvider)), [hashCode](Dns.html#hashCode()), [lookup](Dns.html#lookup()), [resolve](Dns.html#resolve(akka.io.dns.DnsProtocol.Resolve,akka.actor.ActorSystem,akka.actor.ActorRef)), [resolve](Dns.html#resolve(java.lang.String,akka.actor.ActorSystem,akka.actor.ActorRef))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SimpleDnsCache
		
		
		
		```
		public SimpleDnsCache()
		```

	- ### Method Detail
	
	
	
		- #### cached
		
		
		
		```
		public scala.Option<[Dns.Resolved](Dns.Resolved.html "class in akka.io")> cached​(java.lang.String name)
		```
		
		Gets any IPv4 and IPv6 cached entries.
		 To get Srv or just one type use DnsProtocol
		 
		 This method is deprecated and involves a copy from the new protocol to
		 remain compatible
		
		
		
		Overrides:
		`[cached](Dns.html#cached(java.lang.String))` in class `[Dns](Dns.html "class in akka.io")`
		- #### cached
		
		
		
		```
		public scala.Option<[DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns")> cached​([DnsProtocol.Resolve](dns/DnsProtocol.Resolve.html "class in akka.io.dns") request)
		```
		
		
		Overrides:
		`[cached](Dns.html#cached(akka.io.dns.DnsProtocol.Resolve))` in class `[Dns](Dns.html "class in akka.io")`
		- #### clock
		
		
		
		```
		protected long clock()
		```
		- #### cleanup
		
		
		
		```
		public final void cleanup()
		```
		
		
		Specified by:
		`[cleanup](PeriodicCacheCleanup.html#cleanup())` in interface `[PeriodicCacheCleanup](PeriodicCacheCleanup.html "interface in akka.io")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.Resolve$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.Resolve.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.Resolved$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.Resolved.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/PeriodicCacheCleanup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/SimpleDnsCache.CacheEntry$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolve.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolved.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/SimpleDnsCache.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/SimpleDnsCache.html)*