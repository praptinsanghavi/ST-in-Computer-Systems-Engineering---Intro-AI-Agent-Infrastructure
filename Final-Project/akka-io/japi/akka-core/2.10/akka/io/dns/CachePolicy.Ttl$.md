---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl$.TtlIsOrdered$.html
title: CachePolicy.Ttl$.TtlIsOrdered$
---

# CachePolicy.Ttl$.TtlIsOrdered$

## Content

Package [akka.io.dns](package-summary.html)
## Class CachePolicy.Ttl$.TtlIsOrdered$

- java.lang.Object
- - akka.io.dns.CachePolicy.Ttl$.TtlIsOrdered$

- All Implemented Interfaces:
`java.io.Serializable`, `java.util.Comparator<[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")>`, `scala.math.Equiv<[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")>`, `scala.math.Ordering<[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")>`, `scala.math.PartialOrdering<[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")>`

Enclosing class:
[CachePolicy.Ttl$](CachePolicy.Ttl$.html "class in akka.io.dns")

---

```
public static class CachePolicy.Ttl$.TtlIsOrdered$
extends java.lang.Object
implements scala.math.Ordering<[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")>
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.io.dns.CachePolicy.Ttl$.TtlIsOrdered$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.math.Equiv
		
		
		`scala.math.Equiv.DeprecatedDoubleEquiv$, scala.math.Equiv.DeprecatedFloatEquiv$`
		- ### Nested classes/interfaces inherited from interface scala.math.Ordering
		
		
		`scala.math.Ordering.BigDecimal$, scala.math.Ordering.BigDecimalOrdering, scala.math.Ordering.BigInt$, scala.math.Ordering.BigIntOrdering, scala.math.Ordering.Boolean$, scala.math.Ordering.BooleanOrdering, scala.math.Ordering.Byte$, scala.math.Ordering.ByteOrdering, scala.math.Ordering.CachedReverse<T extends java.lang.Object>, scala.math.Ordering.Char$, scala.math.Ordering.CharOrdering, scala.math.Ordering.DeprecatedDoubleOrdering$, scala.math.Ordering.DeprecatedFloatOrdering$, scala.math.Ordering.Double$, scala.math.Ordering.ExtraImplicits, scala.math.Ordering.Float$, scala.math.Ordering.Implicits$, scala.math.Ordering.Int$, scala.math.Ordering.IntOrdering, scala.math.Ordering.Long$, scala.math.Ordering.LongOrdering, scala.math.Ordering.OptionOrdering<T extends java.lang.Object>, scala.math.Ordering.OrderingOps, scala.math.Ordering.Short$, scala.math.Ordering.ShortOrdering, scala.math.Ordering.String$, scala.math.Ordering.StringOrdering, scala.math.Ordering.Symbol$, scala.math.Ordering.SymbolOrdering, scala.math.Ordering.Unit$, scala.math.Ordering.UnitOrdering`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CachePolicy.Ttl$.TtlIsOrdered$](CachePolicy.Ttl$.TtlIsOrdered$.html "class in akka.io.dns")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TtlIsOrdered$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[compare](#compare(akka.io.dns.CachePolicy.Ttl,akka.io.dns.CachePolicy.Ttl))​([CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") a,  [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") b)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface java.util.Comparator
		
		
		`equals, reversed, thenComparing, thenComparing, thenComparing, thenComparingDouble, thenComparingInt, thenComparingLong`
		- ### Methods inherited from interface scala.math.Ordering
		
		
		`equiv, gt, gteq, isReverseOf, lt, lteq, max, min, mkOrderingOps, on, orElse, orElseBy, reverse, tryCompare`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CachePolicy.Ttl$.TtlIsOrdered$](CachePolicy.Ttl$.TtlIsOrdered$.html "class in akka.io.dns") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TtlIsOrdered$
		
		
		
		```
		public TtlIsOrdered$()
		```

	- ### Method Detail
	
	
	
		- #### compare
		
		
		
		```
		public int compare​([CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") a,
		                   [CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns") b)
		```
		
		
		Specified by:
		`compare` in interface `java.util.Comparator<[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")>`
		Specified by:
		`compare` in interface `scala.math.Ordering<[CachePolicy.Ttl](CachePolicy.Ttl.html "class in akka.io.dns")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl$.TtlIsOrdered$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl$.TtlIsOrdered$.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/CachePolicy.Ttl$.TtlIsOrdered$.html)*