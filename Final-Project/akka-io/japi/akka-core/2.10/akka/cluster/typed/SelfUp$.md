---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:07:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/SelfUp$.html
title: SelfUp$
---

# SelfUp$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class SelfUp$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster"),​[SelfUp](SelfUp.html "class in akka.cluster.typed")\>
	- - akka.cluster.typed.SelfUp$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster"),​[SelfUp](SelfUp.html "class in akka.cluster.typed")>`

---

```
public class SelfUp$
extends scala.runtime.AbstractFunction1<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster"),​[SelfUp](SelfUp.html "class in akka.cluster.typed")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.SelfUp$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SelfUp$](SelfUp$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SelfUp$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SelfUp](SelfUp.html "class in akka.cluster.typed")` | `[apply](#apply(akka.cluster.ClusterEvent.CurrentClusterState))​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") currentClusterState)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>` | `[unapply](#unapply(akka.cluster.typed.SelfUp))​([SelfUp](SelfUp.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SelfUp$](SelfUp$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SelfUp$
		
		
		
		```
		public SelfUp$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster"),​[SelfUp](SelfUp.html "class in akka.cluster.typed")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster"),​[SelfUp](SelfUp.html "class in akka.cluster.typed")>`
		- #### apply
		
		
		
		```
		public [SelfUp](SelfUp.html "class in akka.cluster.typed") apply​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") currentClusterState)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster"),​[SelfUp](SelfUp.html "class in akka.cluster.typed")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> unapply​([SelfUp](SelfUp.html "class in akka.cluster.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/SelfUp$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/SelfUp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/SelfUp$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/SelfUp$.html)*