---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:33:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/BoundAddressesExtension.html
title: BoundAddressesExtension
---

# BoundAddressesExtension

## Content

Package [akka.remote](package-summary.html)
## Class BoundAddressesExtension

- java.lang.Object
- - akka.remote.BoundAddressesExtension

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public class BoundAddressesExtension
extends java.lang.Object
implements [Extension](../actor/Extension.html "interface in akka.actor")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BoundAddressesExtension](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Set<[Address](../actor/Address.html "class in akka.actor")>>` | `[boundAddresses](#boundAddresses())()` | Returns a mapping from a protocol to a set of bound addresses. |
	| `static [BoundAddressesExtension](BoundAddressesExtension.html "class in akka.remote")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [BoundAddressesExtension](BoundAddressesExtension.html "class in akka.remote")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [BoundAddressesExtension](BoundAddressesExtension.html "class in akka.remote")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [BoundAddressesExtension$](BoundAddressesExtension$.html "class in akka.remote")` | `[lookup](#lookup())()` |  |
	| `[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BoundAddressesExtension
		
		
		
		```
		public BoundAddressesExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [BoundAddressesExtension](BoundAddressesExtension.html "class in akka.remote") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [BoundAddressesExtension](BoundAddressesExtension.html "class in akka.remote") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [BoundAddressesExtension$](BoundAddressesExtension$.html "class in akka.remote") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [BoundAddressesExtension](BoundAddressesExtension.html "class in akka.remote") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
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
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		- #### boundAddresses
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Set<[Address](../actor/Address.html "class in akka.actor")>> boundAddresses()
		```
		
		Returns a mapping from a protocol to a set of bound addresses.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/remote/BoundAddressesExtension$.html
- https://doc.akka.io/japi/akka/current/akka/remote/BoundAddressesExtension.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/BoundAddressesExtension.html](https://doc.akka.io/japi/akka/current/akka/remote/BoundAddressesExtension.html)*