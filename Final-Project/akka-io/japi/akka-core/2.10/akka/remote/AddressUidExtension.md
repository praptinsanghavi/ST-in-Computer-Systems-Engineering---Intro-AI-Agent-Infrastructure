---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/AddressUidExtension.html
title: AddressUidExtension
---

# AddressUidExtension

## Content

Package [akka.remote](package-summary.html)
## Class AddressUidExtension

- java.lang.Object
- - akka.remote.AddressUidExtension

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public class AddressUidExtension
extends java.lang.Object
implements [Extension](../actor/Extension.html "interface in akka.actor")
```

Deprecated.
Use ExtendedActorSystem.uid instead. Since 2\.8\.0\.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AddressUidExtension](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Deprecated. |
	| `static [AddressUidExtension](AddressUidExtension.html "class in akka.remote")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Deprecated. |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` | Deprecated. |
	| `static [AddressUidExtension](AddressUidExtension.html "class in akka.remote")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. |
	| `static [AddressUidExtension](AddressUidExtension.html "class in akka.remote")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Deprecated. |
	| `static int` | `[hashCode](#hashCode())()` | Deprecated. |
	| `long` | `[longAddressUid](#longAddressUid())()` | Deprecated. |
	| `static [AddressUidExtension$](AddressUidExtension$.html "class in akka.remote")` | `[lookup](#lookup())()` | Deprecated. |
	| `[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AddressUidExtension
		
		
		
		```
		public AddressUidExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [AddressUidExtension](AddressUidExtension.html "class in akka.remote") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		- #### get
		
		
		
		```
		public static [AddressUidExtension](AddressUidExtension.html "class in akka.remote") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Deprecated.
		- #### lookup
		
		
		
		```
		public static [AddressUidExtension$](AddressUidExtension$.html "class in akka.remote") lookup()
		```
		
		Deprecated.
		- #### createExtension
		
		
		
		```
		public static [AddressUidExtension](AddressUidExtension.html "class in akka.remote") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Deprecated.
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		
		Deprecated.
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		
		Deprecated.
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		
		Deprecated.
		- #### longAddressUid
		
		
		
		```
		public long longAddressUid()
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/AddressUidExtension$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/AddressUidExtension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/AddressUidExtension.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/AddressUidExtension.html)*