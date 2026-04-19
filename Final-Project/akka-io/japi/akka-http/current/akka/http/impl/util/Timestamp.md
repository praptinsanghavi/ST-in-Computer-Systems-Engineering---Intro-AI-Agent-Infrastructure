---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Timestamp.Ordering$.html
title: Timestamp.Ordering$
---

# Timestamp.Ordering$

## Content

Package [akka.http.impl.util](package-summary.html)
## Class Timestamp.Ordering$

- java.lang.Object
- - akka.http.impl.util.Timestamp.Ordering$

- All Implemented Interfaces:
`java.io.Serializable`, `java.util.Comparator<[Timestamp](Timestamp.html "class in akka.http.impl.util")>`, `scala.math.Equiv<[Timestamp](Timestamp.html "class in akka.http.impl.util")>`, `scala.math.Ordering<[Timestamp](Timestamp.html "class in akka.http.impl.util")>`, `scala.math.PartialOrdering<[Timestamp](Timestamp.html "class in akka.http.impl.util")>`

Enclosing class:
[Timestamp](Timestamp.html "class in akka.http.impl.util")

---

```
public static class Timestamp.Ordering$
extends java.lang.Object
implements scala.math.Ordering<[Timestamp](Timestamp.html "class in akka.http.impl.util")>
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.util.Timestamp.Ordering$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.math.Equiv
		
		
		`scala.math.Equiv.DeprecatedDoubleEquiv$, scala.math.Equiv.DeprecatedFloatEquiv$`
		- ### Nested classes/interfaces inherited from interface scala.math.Ordering
		
		
		`scala.math.Ordering.BigDecimal$, scala.math.Ordering.BigDecimalOrdering, scala.math.Ordering.BigInt$, scala.math.Ordering.BigIntOrdering, scala.math.Ordering.Boolean$, scala.math.Ordering.BooleanOrdering, scala.math.Ordering.Byte$, scala.math.Ordering.ByteOrdering, scala.math.Ordering.CachedReverse<T extends java.lang.Object>, scala.math.Ordering.Char$, scala.math.Ordering.CharOrdering, scala.math.Ordering.DeprecatedDoubleOrdering$, scala.math.Ordering.DeprecatedFloatOrdering$, scala.math.Ordering.Double$, scala.math.Ordering.ExtraImplicits, scala.math.Ordering.Float$, scala.math.Ordering.Implicits$, scala.math.Ordering.Int$, scala.math.Ordering.IntOrdering, scala.math.Ordering.Long$, scala.math.Ordering.LongOrdering, scala.math.Ordering.OptionOrdering<T extends java.lang.Object>, scala.math.Ordering.OrderingOps, scala.math.Ordering.Short$, scala.math.Ordering.ShortOrdering, scala.math.Ordering.String$, scala.math.Ordering.StringOrdering, scala.math.Ordering.Symbol$, scala.math.Ordering.SymbolOrdering, scala.math.Ordering.Unit$, scala.math.Ordering.UnitOrdering`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Timestamp.Ordering$](Timestamp.Ordering$.html "class in akka.http.impl.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Ordering$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[compare](#compare(akka.http.impl.util.Timestamp,akka.http.impl.util.Timestamp))​([Timestamp](Timestamp.html "class in akka.http.impl.util") x,  [Timestamp](Timestamp.html "class in akka.http.impl.util") y)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface java.util.Comparator
		
		
		`equals, reversed, thenComparing, thenComparing, thenComparing, thenComparingDouble, thenComparingInt, thenComparingLong`
		- ### Methods inherited from interface scala.math.Ordering
		
		
		`equiv, gt, gteq, isReverseOf, lt, lteq, max, min, mkOrderingOps, on, orElse, orElseBy, reverse, tryCompare`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Timestamp.Ordering$](Timestamp.Ordering$.html "class in akka.http.impl.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Ordering$
		
		
		
		```
		public Ordering$()
		```

	- ### Method Detail
	
	
	
		- #### compare
		
		
		
		```
		public int compare​([Timestamp](Timestamp.html "class in akka.http.impl.util") x,
		                   [Timestamp](Timestamp.html "class in akka.http.impl.util") y)
		```
		
		
		Specified by:
		`compare` in interface `java.util.Comparator<[Timestamp](Timestamp.html "class in akka.http.impl.util")>`
		Specified by:
		`compare` in interface `scala.math.Ordering<[Timestamp](Timestamp.html "class in akka.http.impl.util")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Timestamp.Ordering$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Timestamp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Timestamp.Ordering$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Timestamp.Ordering$.html)*