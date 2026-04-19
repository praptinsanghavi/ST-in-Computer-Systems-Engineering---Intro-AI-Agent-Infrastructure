---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.html
title: Dns
---

# Dns

## Content

Package [akka.io](package-summary.html)
## Class Dns

- java.lang.Object
- - akka.io.Dns

- Direct Known Subclasses:
`[SimpleDnsCache](SimpleDnsCache.html "class in akka.io")`

---

```
public abstract class Dns
extends java.lang.Object
```

Not for user extension.
 
 This used to be a supported extension point but will be removed in future versions of Akka.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[Dns.Command](Dns.Command.html "interface in akka.io")` |  |
	| `static class` | `[Dns.Resolve](Dns.Resolve.html "class in akka.io")` | Deprecated. Use cached(DnsProtocol.Resolve). |
	| `static class` | `[Dns.Resolve$](Dns.Resolve$.html "class in akka.io")` |  |
	| `static class` | `[Dns.Resolved](Dns.Resolved.html "class in akka.io")` | Deprecated. Use cached(DnsProtocol.Resolved). |
	| `static class` | `[Dns.Resolved$](Dns.Resolved$.html "class in akka.io")` | Deprecated. Use cached(DnsProtocol.Resolved). |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Dns](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `scala.Option<[DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns")>` | `[cached](#cached(akka.io.dns.DnsProtocol.Resolve))​([DnsProtocol.Resolve](dns/DnsProtocol.Resolve.html "class in akka.io.dns") request)` |  |
	| `scala.Option<[Dns.Resolved](Dns.Resolved.html "class in akka.io")>` | `[cached](#cached(java.lang.String))​(java.lang.String name)` | Deprecated. Use cached(DnsProtocol.Resolve). |
	| `static [DnsExt](DnsExt.html "class in akka.io")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [DnsExt](DnsExt.html "class in akka.io")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Java API: retrieve the Udp extension for the given system. |
	| `static [DnsExt](DnsExt.html "class in akka.io")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [Dns$](Dns$.html "class in akka.io")` | `[lookup](#lookup())()` |  |
	| `scala.Option<[DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns")>` | `[resolve](#resolve(akka.io.dns.DnsProtocol.Resolve,akka.actor.ActorSystem,akka.actor.ActorRef))​([DnsProtocol.Resolve](dns/DnsProtocol.Resolve.html "class in akka.io.dns") request,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	| `scala.Option<[Dns.Resolved](Dns.Resolved.html "class in akka.io")>` | `[resolve](#resolve(java.lang.String,akka.actor.ActorSystem,akka.actor.ActorRef))​(java.lang.String name,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` | Deprecated. Use resolve(DnsProtocol.Resolve). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Dns
		
		
		
		```
		public Dns()
		```

	- ### Method Detail
	
	
	
		- #### lookup
		
		
		
		```
		public static [Dns$](Dns$.html "class in akka.io") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [DnsExt](DnsExt.html "class in akka.io") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [DnsExt](DnsExt.html "class in akka.io") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API: retrieve the Udp extension for the given system.
		- #### get
		
		
		
		```
		public static [DnsExt](DnsExt.html "class in akka.io") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### cached
		
		
		
		```
		public scala.Option<[Dns.Resolved](Dns.Resolved.html "class in akka.io")> cached​(java.lang.String name)
		```
		
		Deprecated.
		Use cached(DnsProtocol.Resolve). Since 2\.6\.0\.
		
		Lookup if a DNS resolved is cached. The exact behavior of caching will depend on
		 the akka.actor.io.dns.resolver that is configured.
		- #### resolve
		
		
		
		```
		public scala.Option<[Dns.Resolved](Dns.Resolved.html "class in akka.io")> resolve​(java.lang.String name,
		                                          [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                          [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		Deprecated.
		Use resolve(DnsProtocol.Resolve). Since 2\.6\.0\.
		
		If an entry is cached return it immediately. If it is not then
		 trigger a resolve and return None.
		- #### cached
		
		
		
		```
		public scala.Option<[DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns")> cached​([DnsProtocol.Resolve](dns/DnsProtocol.Resolve.html "class in akka.io.dns") request)
		```
		- #### resolve
		
		
		
		```
		public scala.Option<[DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns")> resolve​([DnsProtocol.Resolve](dns/DnsProtocol.Resolve.html "class in akka.io.dns") request,
		                                                  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.Resolve$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.Resolve.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.Resolved$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.Resolved.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/DnsExt.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/SimpleDnsCache.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolve.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/DnsProtocol.Resolved.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/Dns.html)*