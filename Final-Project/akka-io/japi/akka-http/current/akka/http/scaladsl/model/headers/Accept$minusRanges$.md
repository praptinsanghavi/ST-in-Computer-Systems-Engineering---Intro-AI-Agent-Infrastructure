---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusRanges$.html
title: Accept$minusRanges$
---

# Accept$minusRanges$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Accept$minusRanges$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Accept$minusRanges](Accept$minusRanges.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Accept$minusRanges$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Accept$minusRanges$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Accept$minusRanges](Accept$minusRanges.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Accept$minusRanges$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Accept$minusRanges$](Accept$minusRanges$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Accept$minusRanges$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Accept$minusRanges](Accept$minusRanges.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply())()` |  |
	| `[Accept$minusRanges](Accept$minusRanges.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.headers.RangeUnit,scala.collection.immutable.Seq))​([RangeUnit](RangeUnit.html "class in akka.http.scaladsl.model.headers") firstRangeUnit,  scala.collection.immutable.Seq<[RangeUnit](RangeUnit.html "class in akka.http.scaladsl.model.headers")> otherRangeUnits)` |  |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[RangeUnit](RangeUnit.html "class in akka.http.scaladsl.model.headers")>>` | `[rangeUnitsRenderer](#rangeUnitsRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Accept$minusRanges$](Accept$minusRanges$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Accept$minusRanges$
		
		
		
		```
		public Accept$minusRanges$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Accept$minusRanges](Accept$minusRanges.html "class in akka.http.scaladsl.model.headers") apply()
		```
		- #### apply
		
		
		
		```
		public [Accept$minusRanges](Accept$minusRanges.html "class in akka.http.scaladsl.model.headers") apply​([RangeUnit](RangeUnit.html "class in akka.http.scaladsl.model.headers") firstRangeUnit,
		                                scala.collection.immutable.Seq<[RangeUnit](RangeUnit.html "class in akka.http.scaladsl.model.headers")> otherRangeUnits)
		```
		- #### rangeUnitsRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[RangeUnit](RangeUnit.html "class in akka.http.scaladsl.model.headers")>> rangeUnitsRenderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusRanges$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RangeUnit.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusRanges$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Accept$minusRanges$.html)*