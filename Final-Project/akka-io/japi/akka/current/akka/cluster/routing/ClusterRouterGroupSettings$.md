---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterGroupSettings$.html
title: ClusterRouterGroupSettings$
---

# ClusterRouterGroupSettings$

## Content

Package [akka.cluster.routing](package-summary.html)
## Class ClusterRouterGroupSettings$

- java.lang.Object
- - akka.cluster.routing.ClusterRouterGroupSettings$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ClusterRouterGroupSettings$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.routing.ClusterRouterGroupSettings$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterRouterGroupSettings$](ClusterRouterGroupSettings$.html "class in akka.cluster.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterRouterGroupSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing")` | `[apply](#apply(int,scala.collection.immutable.Seq,boolean,java.lang.String...))​(int totalInstances,  scala.collection.immutable.Seq<java.lang.String> routeesPaths,  boolean allowLocalRoutees,  java.lang.String... useRoles)` |  |
	| `[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing")` | `[apply](#apply(int,scala.collection.immutable.Seq,boolean,scala.collection.immutable.Seq))​(int totalInstances,  scala.collection.immutable.Seq<java.lang.String> routeesPaths,  boolean allowLocalRoutees,  scala.collection.immutable.Seq<java.lang.String> useRoles)` |  |
	| `[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing")` | `[apply](#apply(int,scala.collection.immutable.Seq,boolean,scala.collection.immutable.Set))​(int totalInstances,  scala.collection.immutable.Seq<java.lang.String> routeesPaths,  boolean allowLocalRoutees,  scala.collection.immutable.Set<java.lang.String> useRoles)` |  |
	| `[ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing")` | `[fromConfig](#fromConfig(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `scala.Option<scala.Tuple4<java.lang.Object,​scala.collection.immutable.Seq<java.lang.String>,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>>` | `[unapply](#unapply(akka.cluster.routing.ClusterRouterGroupSettings))​([ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterRouterGroupSettings$](ClusterRouterGroupSettings$.html "class in akka.cluster.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterRouterGroupSettings$
		
		
		
		```
		public ClusterRouterGroupSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") apply​(int totalInstances,
		                                        scala.collection.immutable.Seq<java.lang.String> routeesPaths,
		                                        boolean allowLocalRoutees,
		                                        java.lang.String... useRoles)
		```
		- #### apply
		
		
		
		```
		public [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") apply​(int totalInstances,
		                                        scala.collection.immutable.Seq<java.lang.String> routeesPaths,
		                                        boolean allowLocalRoutees,
		                                        scala.collection.immutable.Seq<java.lang.String> useRoles)
		```
		- #### fromConfig
		
		
		
		```
		public [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") fromConfig​(com.typesafe.config.Config config)
		```
		- #### apply
		
		
		
		```
		public [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") apply​(int totalInstances,
		                                        scala.collection.immutable.Seq<java.lang.String> routeesPaths,
		                                        boolean allowLocalRoutees,
		                                        scala.collection.immutable.Set<java.lang.String> useRoles)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Object,​scala.collection.immutable.Seq<java.lang.String>,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>> unapply​([ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "class in akka.cluster.routing") settings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterGroupSettings$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterGroupSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterGroupSettings$.html](https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterGroupSettings$.html)*