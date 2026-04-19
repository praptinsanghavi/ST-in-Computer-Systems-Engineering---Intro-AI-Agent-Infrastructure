---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:39:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterGroup$.html
title: ClusterRouterGroup$
---

# ClusterRouterGroup$

## Content

Package [akka.cluster.routing](package-summary.html)
## Class ClusterRouterGroup$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[Group](../../routing/Group.html "interface in akka.routing"),​[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing"),​[ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing")\>
	- - akka.cluster.routing.ClusterRouterGroup$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[Group](../../routing/Group.html "interface in akka.routing"),​[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing"),​[ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing")>`

---

```
public class ClusterRouterGroup$
extends scala.runtime.AbstractFunction2<[Group](../../routing/Group.html "interface in akka.routing"),​[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing"),​[ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.routing.ClusterRouterGroup$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterRouterGroup$](ClusterRouterGroup$.html "class in akka.cluster.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterRouterGroup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing")` | `[apply](#apply(akka.routing.Group,akka.cluster.routing.ClusterRouterGroupSettings))​([Group](../../routing/Group.html "interface in akka.routing") local,  [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") settings)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[Group](../../routing/Group.html "interface in akka.routing"),​[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing")>>` | `[unapply](#unapply(akka.cluster.routing.ClusterRouterGroup))​([ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterRouterGroup$](ClusterRouterGroup$.html "class in akka.cluster.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterRouterGroup$
		
		
		
		```
		public ClusterRouterGroup$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[Group](../../routing/Group.html "interface in akka.routing"),​[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing"),​[ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[Group](../../routing/Group.html "interface in akka.routing"),​[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing"),​[ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing")>`
		- #### apply
		
		
		
		```
		public [ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing") apply​([Group](../../routing/Group.html "interface in akka.routing") local,
		                                [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") settings)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[Group](../../routing/Group.html "interface in akka.routing"),​[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing"),​[ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[Group](../../routing/Group.html "interface in akka.routing"),​[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing")>> unapply​([ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterGroup$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterGroup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterGroupSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Group.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterGroup$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterGroup$.html)*