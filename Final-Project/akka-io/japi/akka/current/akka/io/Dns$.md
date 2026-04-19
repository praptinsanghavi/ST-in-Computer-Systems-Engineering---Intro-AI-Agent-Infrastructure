---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:16:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/Dns$.html
title: Dns$
---

# Dns$

## Content

Package [akka.io](package-summary.html)
## Class Dns$

- java.lang.Object
- - akka.io.Dns$

- All Implemented Interfaces:
`[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[DnsExt](DnsExt.html "class in akka.io")>`, `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class Dns$
extends java.lang.Object
implements [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[DnsExt](DnsExt.html "class in akka.io")>, [ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Dns$](Dns$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Dns$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns")>` | `[cached](#cached(akka.io.dns.DnsProtocol.Resolve,akka.actor.ActorSystem))​([DnsProtocol.Resolve](dns/DnsProtocol.Resolve.html "class in akka.io.dns") name,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Lookup if a DNS resolved is cached. |
	| `scala.Option<[Dns.Resolved](Dns.Resolved.html "class in akka.io")>` | `[cached](#cached(java.lang.String,akka.actor.ActorSystem))​(java.lang.String name,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. use cached(DnsProtocol.Resolve). |
	| `[DnsExt](DnsExt.html "class in akka.io")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[DnsExt](DnsExt.html "class in akka.io")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Java API: retrieve the Udp extension for the given system. |
	| `[DnsExt](DnsExt.html "class in akka.io")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[Dns$](Dns$.html "class in akka.io")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	| `scala.Option<[DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns")>` | `[resolve](#resolve(akka.io.dns.DnsProtocol.Resolve,akka.actor.ActorSystem,akka.actor.ActorRef))​([DnsProtocol.Resolve](dns/DnsProtocol.Resolve.html "class in akka.io.dns") name,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` | If an entry is cached return it immediately. |
	| `scala.Option<[Dns.Resolved](Dns.Resolved.html "class in akka.io")>` | `[resolve](#resolve(java.lang.String,akka.actor.ActorSystem,akka.actor.ActorRef))​(java.lang.String name,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` | Deprecated. use resolve(DnsProtocol.Resolve). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Dns$](Dns$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Dns$
		
		
		
		```
		public Dns$()
		```

	- ### Method Detail
	
	
	
		- #### cached
		
		
		
		```
		public scala.Option<[Dns.Resolved](Dns.Resolved.html "class in akka.io")> cached​(java.lang.String name,
		                                         [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		use cached(DnsProtocol.Resolve). Since 2\.6\.0\.
		
		Lookup if a DNS resolved is cached. The exact behavior of caching will depend on
		 the akka.actor.io.dns.resolver that is configured.
		- #### resolve
		
		
		
		```
		public scala.Option<[Dns.Resolved](Dns.Resolved.html "class in akka.io")> resolve​(java.lang.String name,
		                                          [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                          [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		Deprecated.
		use resolve(DnsProtocol.Resolve). Since 2\.6\.0\.
		
		If an entry is cached return it immediately. If it is not then
		 trigger a resolve and return None.
		- #### cached
		
		
		
		```
		public scala.Option<[DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns")> cached​([DnsProtocol.Resolve](dns/DnsProtocol.Resolve.html "class in akka.io.dns") name,
		                                                 [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Lookup if a DNS resolved is cached. The exact behavior of caching will depend on
		 the akka.actor.io.dns.resolver that is configured.
		- #### resolve
		
		
		
		```
		public scala.Option<[DnsProtocol.Resolved](dns/DnsProtocol.Resolved.html "class in akka.io.dns")> resolve​([DnsProtocol.Resolve](dns/DnsProtocol.Resolve.html "class in akka.io.dns") name,
		                                                  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                                  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		If an entry is cached return it immediately. If it is not then
		 trigger a resolve and return None.
		- #### lookup
		
		
		
		```
		public [Dns$](Dns$.html "class in akka.io") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [DnsExt](DnsExt.html "class in akka.io") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[DnsExt](DnsExt.html "class in akka.io")>`
		- #### get
		
		
		
		```
		public [DnsExt](DnsExt.html "class in akka.io") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API: retrieve the Udp extension for the given system.
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[DnsExt](DnsExt.html "class in akka.io")>`
		- #### get
		
		
		
		```
		public [DnsExt](DnsExt.html "class in akka.io") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[DnsExt](DnsExt.html "class in akka.io")>`

## Code Examples

### Example 1: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka/current/akka/io/Dns$.html
- https://doc.akka.io/japi/akka/current/akka/io/Dns.Resolved.html
- https://doc.akka.io/japi/akka/current/akka/io/DnsExt.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Resolve.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/DnsProtocol.Resolved.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/Dns$.html](https://doc.akka.io/japi/akka/current/akka/io/Dns$.html)*