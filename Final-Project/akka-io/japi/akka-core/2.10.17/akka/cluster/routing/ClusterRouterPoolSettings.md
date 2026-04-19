---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:39:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterPoolSettings.html
title: ClusterRouterPoolSettings
---

# ClusterRouterPoolSettings

## Content

Package [akka.cluster.routing](package-summary.html)
## Class ClusterRouterPoolSettings

- java.lang.Object
- - akka.cluster.routing.ClusterRouterPoolSettings

- All Implemented Interfaces:
`[ClusterRouterSettingsBase](ClusterRouterSettingsBase.html "interface in akka.cluster.routing")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ClusterRouterPoolSettings
extends java.lang.Object
implements scala.Product, java.io.Serializable, [ClusterRouterSettingsBase](ClusterRouterSettingsBase.html "interface in akka.cluster.routing")
```

`totalInstances` of cluster router must be \> 0
 `maxInstancesPerNode` of cluster router must be \> 0
 `maxInstancesPerNode` of cluster router must be 1 when routeesPath is defined

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.routing.ClusterRouterPoolSettings)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterRouterPoolSettings](#%3Cinit%3E(int,int,boolean,java.util.Set))​(int totalInstances,  int maxInstancesPerNode,  boolean allowLocalRoutees,  java.util.Set<java.lang.String> useRoles)` | Java API |
	| `[ClusterRouterPoolSettings](#%3Cinit%3E(int,int,boolean,scala.collection.immutable.Set))​(int totalInstances,  int maxInstancesPerNode,  boolean allowLocalRoutees,  scala.collection.immutable.Set<java.lang.String> useRoles)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[allowLocalRoutees](#allowLocalRoutees())()` |  |
	| `static [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[apply](#apply(int,int,boolean,java.lang.String...))​(int totalInstances,  int maxInstancesPerNode,  boolean allowLocalRoutees,  java.lang.String... useRoles)` |  |
	| `static [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[apply](#apply(int,int,boolean,scala.collection.immutable.Seq))​(int totalInstances,  int maxInstancesPerNode,  boolean allowLocalRoutees,  scala.collection.immutable.Seq<java.lang.String> useRoles)` |  |
	| `static [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[apply](#apply(int,int,boolean,scala.collection.immutable.Set))​(int totalInstances,  int maxInstancesPerNode,  boolean allowLocalRoutees,  scala.collection.immutable.Set<java.lang.String> useRoles)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object that)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `static [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[fromConfig](#fromConfig(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[maxInstancesPerNode](#maxInstancesPerNode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int n)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `int` | `[totalInstances](#totalInstances())()` |  |
	| `static scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>>` | `[unapply](#unapply(akka.cluster.routing.ClusterRouterPoolSettings))​([ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[useRoles](#useRoles())()` |  |
	| `[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[withUseRoles](#withUseRoles(java.lang.String...))​(java.lang.String... useRoles)` | Java API |
	| `[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[withUseRoles](#withUseRoles(java.util.Set))​(java.util.Set<java.lang.String> useRoles)` | Java API |
	| `[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[withUseRoles](#withUseRoles(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> useRoles)` |  |
	| `[ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing")` | `[withUseRoles](#withUseRoles(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> useRoles)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### ClusterRouterPoolSettings
		
		
		
		```
		public ClusterRouterPoolSettings​(int totalInstances,
		                                 int maxInstancesPerNode,
		                                 boolean allowLocalRoutees,
		                                 scala.collection.immutable.Set<java.lang.String> useRoles)
		```
		- #### ClusterRouterPoolSettings
		
		
		
		```
		public ClusterRouterPoolSettings​(int totalInstances,
		                                 int maxInstancesPerNode,
		                                 boolean allowLocalRoutees,
		                                 java.util.Set<java.lang.String> useRoles)
		```
		
		Java API

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") apply​(int totalInstances,
		                                              int maxInstancesPerNode,
		                                              boolean allowLocalRoutees,
		                                              java.lang.String... useRoles)
		```
		- #### apply
		
		
		
		```
		public static [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") apply​(int totalInstances,
		                                              int maxInstancesPerNode,
		                                              boolean allowLocalRoutees,
		                                              scala.collection.immutable.Set<java.lang.String> useRoles)
		```
		- #### apply
		
		
		
		```
		public static [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") apply​(int totalInstances,
		                                              int maxInstancesPerNode,
		                                              boolean allowLocalRoutees,
		                                              scala.collection.immutable.Seq<java.lang.String> useRoles)
		```
		- #### fromConfig
		
		
		
		```
		public static [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") fromConfig​(com.typesafe.config.Config config)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>> unapply​([ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") settings)
		```
		- #### withUseRoles
		
		
		
		```
		public [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") withUseRoles​(java.lang.String... useRoles)
		```
		
		Java API
		- #### totalInstances
		
		
		
		```
		public int totalInstances()
		```
		
		
		Specified by:
		`[totalInstances](ClusterRouterSettingsBase.html#totalInstances())` in interface `[ClusterRouterSettingsBase](ClusterRouterSettingsBase.html "interface in akka.cluster.routing")`
		- #### maxInstancesPerNode
		
		
		
		```
		public int maxInstancesPerNode()
		```
		- #### allowLocalRoutees
		
		
		
		```
		public boolean allowLocalRoutees()
		```
		
		
		Specified by:
		`[allowLocalRoutees](ClusterRouterSettingsBase.html#allowLocalRoutees())` in interface `[ClusterRouterSettingsBase](ClusterRouterSettingsBase.html "interface in akka.cluster.routing")`
		- #### useRoles
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> useRoles()
		```
		
		
		Specified by:
		`[useRoles](ClusterRouterSettingsBase.html#useRoles())` in interface `[ClusterRouterSettingsBase](ClusterRouterSettingsBase.html "interface in akka.cluster.routing")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object that)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int n)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### withUseRoles
		
		
		
		```
		public [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") withUseRoles​(scala.collection.immutable.Set<java.lang.String> useRoles)
		```
		- #### withUseRoles
		
		
		
		```
		public [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") withUseRoles​(scala.collection.immutable.Seq<java.lang.String> useRoles)
		```
		- #### withUseRoles
		
		
		
		```
		public [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "class in akka.cluster.routing") withUseRoles​(java.util.Set<java.lang.String> useRoles)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterPoolSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterSettingsBase.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterPoolSettings.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterPoolSettings.html)*