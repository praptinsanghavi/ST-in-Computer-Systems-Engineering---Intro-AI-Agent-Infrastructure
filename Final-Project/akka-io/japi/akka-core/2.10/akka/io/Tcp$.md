---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp$.html
title: Tcp$
---

# Tcp$

## Content

Package [akka.io](package-summary.html)
## Class Tcp$

- java.lang.Object
- - akka.io.Tcp$

- All Implemented Interfaces:
`[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[TcpExt](TcpExt.html "class in akka.io")>`, `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class Tcp$
extends java.lang.Object
implements [ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[TcpExt](TcpExt.html "class in akka.io")>, [ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")
```

TCP Extension for Akka\&rsquo;s IO layer.
 
 For a full description of the design and philosophy behind this IO
 implementation please refer to [the Akka online documentation](https://akka.io/docs/).
 

 In order to open an outbound connection send a [`Tcp.Connect`](Tcp.Connect.html "class in akka.io") message
 to the [`TcpExt.manager()`](TcpExt.html#manager()).
 

 In order to start listening for inbound connections send a [`Tcp.Bind`](Tcp.Bind.html "class in akka.io")
 message to the [`TcpExt.manager()`](TcpExt.html#manager()).
 

 The Java API for generating TCP commands is available at [`TcpMessage`](TcpMessage.html "class in akka.io").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Tcp$](Tcp$.html "class in akka.io")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tcp$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TcpExt](TcpExt.html "class in akka.io")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[TcpExt](TcpExt.html "class in akka.io")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Java API: retrieve the Tcp extension for the given system. |
	| `[TcpExt](TcpExt.html "class in akka.io")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[Tcp$](Tcp$.html "class in akka.io")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Tcp$](Tcp$.html "class in akka.io") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Tcp$
		
		
		
		```
		public Tcp$()
		```

	- ### Method Detail
	
	
	
		- #### lookup
		
		
		
		```
		public [Tcp$](Tcp$.html "class in akka.io") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [TcpExt](TcpExt.html "class in akka.io") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[TcpExt](TcpExt.html "class in akka.io")>`
		- #### get
		
		
		
		```
		public [TcpExt](TcpExt.html "class in akka.io") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API: retrieve the Tcp extension for the given system.
		
		Specified by:
		`[get](../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[TcpExt](TcpExt.html "class in akka.io")>`
		- #### get
		
		
		
		```
		public [TcpExt](TcpExt.html "class in akka.io") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
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
		`[get](../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../actor/ExtensionId.html "interface in akka.actor")<[TcpExt](TcpExt.html "class in akka.io")>`

## Code Examples

### Example 1: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Bind.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Connect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpExt.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp$.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp$.html)*