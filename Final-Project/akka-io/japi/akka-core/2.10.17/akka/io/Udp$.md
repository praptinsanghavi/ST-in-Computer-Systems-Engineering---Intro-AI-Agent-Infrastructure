---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:16:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Udp$.html
title: Udp$
---

# Udp$

## Content

Package [akka.io](package-summary.html)
## Class Udp$

- java.lang.Object
- - akka.io.Udp$

- All Implemented Interfaces:
`[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[UdpExt](UdpExt.html "class in akka.io")>`, `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class Udp$
extends java.lang.Object
implements [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[UdpExt](UdpExt.html "class in akka.io")>, [ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")
```

UDP Extension for Akka\&rsquo;s IO layer.
 
 This extension implements the connectionless UDP protocol without
 calling `connect` on the underlying sockets, i.e. without restricting
 from whom data can be received. For \&ldquo;connected\&rdquo; UDP mode see [`UdpConnected`](UdpConnected.html "class in akka.io").
 

 For a full description of the design and philosophy behind this IO
 implementation please refer to [the Akka online documentation](https://akka.io/docs/).
 

 The Java API for generating UDP commands is available at [`UdpMessage`](UdpMessage.html "class in akka.io").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Udp$](Udp$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Udp$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[UdpExt](UdpExt.html "class in akka.io")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[UdpExt](UdpExt.html "class in akka.io")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Java API: retrieve the Udp extension for the given system. |
	| `[UdpExt](UdpExt.html "class in akka.io")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[Udp$](Udp$.html "class in akka.io")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Udp$](Udp$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Udp$
		
		
		
		```
		public Udp$()
		```

	- ### Method Detail
	
	
	
		- #### lookup
		
		
		
		```
		public [Udp$](Udp$.html "class in akka.io") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [UdpExt](UdpExt.html "class in akka.io") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[UdpExt](UdpExt.html "class in akka.io")>`
		- #### get
		
		
		
		```
		public [UdpExt](UdpExt.html "class in akka.io") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API: retrieve the Udp extension for the given system.
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[UdpExt](UdpExt.html "class in akka.io")>`
		- #### get
		
		
		
		```
		public [UdpExt](UdpExt.html "class in akka.io") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
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
		`[get](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[UdpExt](UdpExt.html "class in akka.io")>`

## Code Examples

### Example 1: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Udp$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpConnected.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpExt.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Udp$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Udp$.html)*