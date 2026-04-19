---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:05:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings$.html
title: ClusterRouterPoolSettings$
---

# ClusterRouterPoolSettings$

## Content

Package [akka.cluster.routing](package-summary.html)
## Class ClusterRouterPoolSettings$

- java.lang.Object
- - akka.cluster.routing.ClusterRouterPoolSettings$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ClusterRouterPoolSettings$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.routing.ClusterRouterPoolSettings$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterRouterPoolSettings$](ClusterRouterPoolSettings$.html "class in akka.cluster.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterRouterPoolSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[apply](#apply(int,int,boolean,java.lang.String...))​(int totalInstances,  int maxInstancesPerNode,  boolean allowLocalRoutees,  java.lang.String... useRoles)` |  |
	| `[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[apply](#apply(int,int,boolean,scala.collection.immutable.Seq))​(int totalInstances,  int maxInstancesPerNode,  boolean allowLocalRoutees,  scala.collection.immutable.Seq<java.lang.String> useRoles)` |  |
	| `[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[apply](#apply(int,int,boolean,scala.collection.immutable.Set))​(int totalInstances,  int maxInstancesPerNode,  boolean allowLocalRoutees,  scala.collection.immutable.Set<java.lang.String> useRoles)` |  |
	| `[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[fromConfig](#fromConfig(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>>` | `[unapply](#unapply(akka.cluster.routing.ClusterRouterPoolSettings))​([ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterRouterPoolSettings$](ClusterRouterPoolSettings$.html "class in akka.cluster.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterRouterPoolSettings$
		
		
		
		```
		public ClusterRouterPoolSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") apply​(int totalInstances,
		                                       int maxInstancesPerNode,
		                                       boolean allowLocalRoutees,
		                                       java.lang.String... useRoles)
		```
		- #### apply
		
		
		
		```
		public [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") apply​(int totalInstances,
		                                       int maxInstancesPerNode,
		                                       boolean allowLocalRoutees,
		                                       scala.collection.immutable.Set<java.lang.String> useRoles)
		```
		- #### apply
		
		
		
		```
		public [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") apply​(int totalInstances,
		                                       int maxInstancesPerNode,
		                                       boolean allowLocalRoutees,
		                                       scala.collection.immutable.Seq<java.lang.String> useRoles)
		```
		- #### fromConfig
		
		
		
		```
		public [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") fromConfig​(com.typesafe.config.Config config)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>> unapply​([ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings$.html)*