---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:07:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterPool$.html
title: ClusterRouterPool$
---

# ClusterRouterPool$

## Content

Package [akka.cluster.routing](package-summary.html)
## Class ClusterRouterPool$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[Pool](../../routing/Pool.html "interface in akka.routing"),​[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing"),​[ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing")\>
	- - akka.cluster.routing.ClusterRouterPool$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[Pool](../../routing/Pool.html "interface in akka.routing"),​[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing"),​[ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing")>`

---

```
public class ClusterRouterPool$
extends scala.runtime.AbstractFunction2<[Pool](../../routing/Pool.html "interface in akka.routing"),​[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing"),​[ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.routing.ClusterRouterPool$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterRouterPool$](ClusterRouterPool$.html "class in akka.cluster.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterRouterPool$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing")` | `[apply](#apply(akka.routing.Pool,akka.cluster.routing.ClusterRouterPoolSettings))​([Pool](../../routing/Pool.html "interface in akka.routing") local,  [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[Pool](../../routing/Pool.html "interface in akka.routing"),​[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")>>` | `[unapply](#unapply(akka.cluster.routing.ClusterRouterPool))​([ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterRouterPool$](ClusterRouterPool$.html "class in akka.cluster.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterRouterPool$
		
		
		
		```
		public ClusterRouterPool$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[Pool](../../routing/Pool.html "interface in akka.routing"),​[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing"),​[ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[Pool](../../routing/Pool.html "interface in akka.routing"),​[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing"),​[ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing")>`
		- #### apply
		
		
		
		```
		public [ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing") apply​([Pool](../../routing/Pool.html "interface in akka.routing") local,
		                               [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[Pool](../../routing/Pool.html "interface in akka.routing"),​[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing"),​[ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[Pool](../../routing/Pool.html "interface in akka.routing"),​[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")>> unapply​([ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterPool$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterPool.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterPoolSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/routing/Pool.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterPool$.html](https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterPool$.html)*