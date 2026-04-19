---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:51:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/CrossDcHeartbeatingState$.html
title: CrossDcHeartbeatingState$
---

# CrossDcHeartbeatingState$

## Content

Package [akka.cluster](package-summary.html)
## Class CrossDcHeartbeatingState$

- java.lang.Object
- - akka.cluster.CrossDcHeartbeatingState$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class CrossDcHeartbeatingState$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.CrossDcHeartbeatingState$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CrossDcHeartbeatingState$](CrossDcHeartbeatingState$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CrossDcHeartbeatingState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.CrossDcHeartbeatingState` | `[apply](#apply(java.lang.String,akka.remote.FailureDetectorRegistry,int,scala.collection.immutable.Map))​(java.lang.String selfDataCenter,  [FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> failureDetector,  int nrOfMonitoredNodesPerDc,  scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")>> state)` |  |
	| `boolean` | `[atLeastInUpState](#atLeastInUpState(akka.cluster.Member))​([Member](Member.html "class in akka.cluster") m)` |  |
	| `akka.cluster.CrossDcHeartbeatingState` | `[init](#init(java.lang.String,akka.remote.FailureDetectorRegistry,int,scala.collection.immutable.SortedSet))​(java.lang.String selfDataCenter,  [FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> crossDcFailureDetector,  int nrOfMonitoredNodesPerDc,  scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")> members)` |  |
	| `scala.Option<scala.Tuple4<java.lang.String,​[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")>,​java.lang.Object,​scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")>>>>` | `[unapply](#unapply(akka.cluster.CrossDcHeartbeatingState))​(akka.cluster.CrossDcHeartbeatingState x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CrossDcHeartbeatingState$](CrossDcHeartbeatingState$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CrossDcHeartbeatingState$
		
		
		
		```
		public CrossDcHeartbeatingState$()
		```

	- ### Method Detail
	
	
	
		- #### atLeastInUpState
		
		
		
		```
		public boolean atLeastInUpState​([Member](Member.html "class in akka.cluster") m)
		```
		- #### init
		
		
		
		```
		public akka.cluster.CrossDcHeartbeatingState init​(java.lang.String selfDataCenter,
		                                                  [FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> crossDcFailureDetector,
		                                                  int nrOfMonitoredNodesPerDc,
		                                                  scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")> members)
		```
		- #### apply
		
		
		
		```
		public akka.cluster.CrossDcHeartbeatingState apply​(java.lang.String selfDataCenter,
		                                                   [FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> failureDetector,
		                                                   int nrOfMonitoredNodesPerDc,
		                                                   scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")>> state)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.String,​[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")>,​java.lang.Object,​scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")>>>> unapply​(akka.cluster.CrossDcHeartbeatingState x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/CrossDcHeartbeatingState$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/CrossDcHeartbeatingState$.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/CrossDcHeartbeatingState$.html)*