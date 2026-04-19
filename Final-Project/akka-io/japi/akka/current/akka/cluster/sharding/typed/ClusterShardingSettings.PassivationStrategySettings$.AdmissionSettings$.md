---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:10:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings.html
title: ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings
---

# ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings

- java.lang.Object
- - akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings

- Enclosing class:
[ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.html "class in akka.cluster.sharding.typed")

---

```
public static final class ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WindowSettings](#%3Cinit%3E(double,double,double,scala.Option,scala.Option))​(double initialProportion,  double minimumProportion,  double maximumProportion,  scala.Option<akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.OptimizerSettings> optimizer,  scala.Option<akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.PolicySettings> policy)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `double` | `[initialProportion](#initialProportion())()` |  |
	| `double` | `[maximumProportion](#maximumProportion())()` |  |
	| `double` | `[minimumProportion](#minimumProportion())()` |  |
	| `scala.Option<akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.OptimizerSettings>` | `[optimizer](#optimizer())()` |  |
	| `scala.Option<akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.PolicySettings>` | `[policy](#policy())()` |  |
	| `akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings` | `[withInitialProportion](#withInitialProportion(double))​(double proportion)` |  |
	| `akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings` | `[withMaximumProportion](#withMaximumProportion(double))​(double proportion)` |  |
	| `akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings` | `[withMinimumProportion](#withMinimumProportion(double))​(double proportion)` |  |
	| `akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings` | `[withOptimizer](#withOptimizer(akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.OptimizerSettings))​(akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.OptimizerSettings settings)` |  |
	| `akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings` | `[withPolicy](#withPolicy(akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.PolicySettings))​(akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.PolicySettings settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### WindowSettings
		
		
		
		```
		public WindowSettings​(double initialProportion,
		                      double minimumProportion,
		                      double maximumProportion,
		                      scala.Option<akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.OptimizerSettings> optimizer,
		                      scala.Option<akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.PolicySettings> policy)
		```

	- ### Method Detail
	
	
	
		- #### initialProportion
		
		
		
		```
		public double initialProportion()
		```
		- #### minimumProportion
		
		
		
		```
		public double minimumProportion()
		```
		- #### maximumProportion
		
		
		
		```
		public double maximumProportion()
		```
		- #### optimizer
		
		
		
		```
		public scala.Option<akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.OptimizerSettings> optimizer()
		```
		- #### policy
		
		
		
		```
		public scala.Option<akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.PolicySettings> policy()
		```
		- #### withInitialProportion
		
		
		
		```
		public akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings withInitialProportion​(double proportion)
		```
		- #### withMinimumProportion
		
		
		
		```
		public akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings withMinimumProportion​(double proportion)
		```
		- #### withMaximumProportion
		
		
		
		```
		public akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings withMaximumProportion​(double proportion)
		```
		- #### withOptimizer
		
		
		
		```
		public akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings withOptimizer​(akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.OptimizerSettings settings)
		```
		- #### withPolicy
		
		
		
		```
		public akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.AdmissionSettings.WindowSettings withPolicy​(akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.PolicySettings settings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings.html)*