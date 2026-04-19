---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:52:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/MembershipState$.html
title: MembershipState$
---

# MembershipState$

## Content

Package [akka.cluster](package-summary.html)
## Class MembershipState$

- java.lang.Object
- - akka.cluster.MembershipState$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class MembershipState$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.MembershipState$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MembershipState$](MembershipState$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MembershipState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Set<[MemberStatus](MemberStatus.html "class in akka.cluster")>` | `[allowedToPrepareToShutdown](#allowedToPrepareToShutdown())()` |  |
	| `akka.cluster.MembershipState` | `[apply](#apply(akka.cluster.Gossip,akka.cluster.UniqueAddress,java.lang.String,int))​(akka.cluster.Gossip latestGossip,  [UniqueAddress](UniqueAddress.html "class in akka.cluster") selfUniqueAddress,  java.lang.String selfDc,  int crossDcConnections)` | INTERNAL API |
	| `scala.collection.immutable.Set<[MemberStatus](MemberStatus.html "class in akka.cluster")>` | `[convergenceSkipUnreachableWithMemberStatus](#convergenceSkipUnreachableWithMemberStatus())()` |  |
	| `scala.collection.immutable.Set<[MemberStatus](MemberStatus.html "class in akka.cluster")>` | `[prepareForShutdownStates](#prepareForShutdownStates())()` |  |
	| `scala.collection.immutable.Set<[MemberStatus](MemberStatus.html "class in akka.cluster")>` | `[removeUnreachableWithMemberStatus](#removeUnreachableWithMemberStatus())()` |  |
	| `scala.Option<scala.Tuple4<akka.cluster.Gossip,​[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.MembershipState))​(akka.cluster.MembershipState x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MembershipState$](MembershipState$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MembershipState$
		
		
		
		```
		public MembershipState$()
		```

	- ### Method Detail
	
	
	
		- #### convergenceSkipUnreachableWithMemberStatus
		
		
		
		```
		public scala.collection.immutable.Set<[MemberStatus](MemberStatus.html "class in akka.cluster")> convergenceSkipUnreachableWithMemberStatus()
		```
		- #### removeUnreachableWithMemberStatus
		
		
		
		```
		public scala.collection.immutable.Set<[MemberStatus](MemberStatus.html "class in akka.cluster")> removeUnreachableWithMemberStatus()
		```
		- #### allowedToPrepareToShutdown
		
		
		
		```
		public scala.collection.immutable.Set<[MemberStatus](MemberStatus.html "class in akka.cluster")> allowedToPrepareToShutdown()
		```
		- #### prepareForShutdownStates
		
		
		
		```
		public scala.collection.immutable.Set<[MemberStatus](MemberStatus.html "class in akka.cluster")> prepareForShutdownStates()
		```
		- #### apply
		
		
		
		```
		public akka.cluster.MembershipState apply​(akka.cluster.Gossip latestGossip,
		                                          [UniqueAddress](UniqueAddress.html "class in akka.cluster") selfUniqueAddress,
		                                          java.lang.String selfDc,
		                                          int crossDcConnections)
		```
		
		INTERNAL API
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<akka.cluster.Gossip,​[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.String,​java.lang.Object>> unapply​(akka.cluster.MembershipState x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/cluster/MemberStatus.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/MembershipState$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/MembershipState$.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/MembershipState$.html)*