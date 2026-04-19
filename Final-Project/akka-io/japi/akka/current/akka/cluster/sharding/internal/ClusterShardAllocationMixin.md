---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering$.html
title: ClusterShardAllocationMixin.ShardSuitabilityOrdering$
---

# ClusterShardAllocationMixin.ShardSuitabilityOrdering$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class ClusterShardAllocationMixin.ShardSuitabilityOrdering$

- java.lang.Object
- - [akka.cluster.sharding.internal.ClusterShardAllocationMixin.ShardSuitabilityOrdering](ClusterShardAllocationMixin.ShardSuitabilityOrdering.html "class in akka.cluster.sharding.internal")
	- - akka.cluster.sharding.internal.ClusterShardAllocationMixin.ShardSuitabilityOrdering$

- All Implemented Interfaces:
`java.io.Serializable`, `java.util.Comparator<[ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")>`, `scala.math.Equiv<[ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")>`, `scala.math.Ordering<[ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")>`, `scala.math.PartialOrdering<[ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")>`

Enclosing interface:
[ClusterShardAllocationMixin](ClusterShardAllocationMixin.html "interface in akka.cluster.sharding.internal")

---

```
public static class ClusterShardAllocationMixin.ShardSuitabilityOrdering$
extends [ClusterShardAllocationMixin.ShardSuitabilityOrdering](ClusterShardAllocationMixin.ShardSuitabilityOrdering.html "class in akka.cluster.sharding.internal")
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.sharding.internal.ClusterShardAllocationMixin.ShardSuitabilityOrdering$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.math.Equiv
		
		
		`scala.math.Equiv.DeprecatedDoubleEquiv$, scala.math.Equiv.DeprecatedFloatEquiv$`
		- ### Nested classes/interfaces inherited from interface scala.math.Ordering
		
		
		`scala.math.Ordering.BigDecimal$, scala.math.Ordering.BigDecimalOrdering, scala.math.Ordering.BigInt$, scala.math.Ordering.BigIntOrdering, scala.math.Ordering.Boolean$, scala.math.Ordering.BooleanOrdering, scala.math.Ordering.Byte$, scala.math.Ordering.ByteOrdering, scala.math.Ordering.CachedReverse<T extends java.lang.Object>, scala.math.Ordering.Char$, scala.math.Ordering.CharOrdering, scala.math.Ordering.DeprecatedDoubleOrdering$, scala.math.Ordering.DeprecatedFloatOrdering$, scala.math.Ordering.Double$, scala.math.Ordering.ExtraImplicits, scala.math.Ordering.Float$, scala.math.Ordering.Implicits$, scala.math.Ordering.Int$, scala.math.Ordering.IntOrdering, scala.math.Ordering.Long$, scala.math.Ordering.LongOrdering, scala.math.Ordering.OptionOrdering<T extends java.lang.Object>, scala.math.Ordering.OrderingOps, scala.math.Ordering.Short$, scala.math.Ordering.ShortOrdering, scala.math.Ordering.String$, scala.math.Ordering.StringOrdering, scala.math.Ordering.Symbol$, scala.math.Ordering.SymbolOrdering, scala.math.Ordering.Unit$, scala.math.Ordering.UnitOrdering`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterShardAllocationMixin.ShardSuitabilityOrdering$](ClusterShardAllocationMixin.ShardSuitabilityOrdering$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardSuitabilityOrdering$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.cluster.sharding.internal.[ClusterShardAllocationMixin.ShardSuitabilityOrdering](ClusterShardAllocationMixin.ShardSuitabilityOrdering.html "class in akka.cluster.sharding.internal")
		
		
		`[compare](ClusterShardAllocationMixin.ShardSuitabilityOrdering.html#compare(akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry,akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface java.util.Comparator
		
		
		`equals, reversed, thenComparing, thenComparing, thenComparing, thenComparingDouble, thenComparingInt, thenComparingLong`
		- ### Methods inherited from interface scala.math.Ordering
		
		
		`equiv, gt, gteq, isReverseOf, lt, lteq, max, min, mkOrderingOps, on, orElse, orElseBy, reverse, tryCompare`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterShardAllocationMixin.ShardSuitabilityOrdering$](ClusterShardAllocationMixin.ShardSuitabilityOrdering$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardSuitabilityOrdering$
		
		
		
		```
		public ShardSuitabilityOrdering$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering$.html)*