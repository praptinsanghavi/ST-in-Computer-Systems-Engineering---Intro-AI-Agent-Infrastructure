---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/LeaseProvider.html
title: LeaseProvider
---

# LeaseProvider

## Content

Package [akka.coordination.lease.scaladsl](package-summary.html)
## Class LeaseProvider

- java.lang.Object
- - akka.coordination.lease.scaladsl.LeaseProvider

- All Implemented Interfaces:
`[Extension](../../../actor/Extension.html "interface in akka.actor")`

---

```
public final class LeaseProvider
extends java.lang.Object
implements [Extension](../../../actor/Extension.html "interface in akka.actor")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LeaseProvider](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `[Lease](Lease.html "class in akka.coordination.lease.scaladsl")` | `[getLease](#getLease(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String leaseName,  java.lang.String configPath,  java.lang.String ownerName)` | The configuration define at `configPath` must have a property `lease-class` that defines  the fully qualified class name of the Lease implementation. |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [LeaseProvider$](LeaseProvider$.html "class in akka.coordination.lease.scaladsl")` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LeaseProvider
		
		
		
		```
		public LeaseProvider​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl") get​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl") get​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [LeaseProvider$](LeaseProvider$.html "class in akka.coordination.lease.scaladsl") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [LeaseProvider](LeaseProvider.html "class in akka.coordination.lease.scaladsl") createExtension​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### getLease
		
		
		
		```
		public [Lease](Lease.html "class in akka.coordination.lease.scaladsl") getLease​(java.lang.String leaseName,
		                      java.lang.String configPath,
		                      java.lang.String ownerName)
		```
		
		The configuration define at `configPath` must have a property `lease-class` that defines
		 the fully qualified class name of the Lease implementation.
		 The class must implement [`Lease`](Lease.html "class in akka.coordination.lease.scaladsl") and have constructor with [`LeaseSettings`](../LeaseSettings.html "class in akka.coordination.lease") parameter and
		 optionally ActorSystem parameter.
		 
		
		Parameters:
		`leaseName` \- the name of the lease resource
		`configPath` \- the path of configuration for the lease
		`ownerName` \- the owner that will `acquire` the lease, e.g. hostname and port of the ActorSystem

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/LeaseSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/Lease.html
- https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/LeaseProvider$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/LeaseProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/LeaseProvider.html](https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/scaladsl/LeaseProvider.html)*