---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:01:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/MaterializationContext$.html
title: MaterializationContext$
---

# MaterializationContext$

## Content

Package [akka.stream](package-summary.html)
## Class MaterializationContext$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[Materializer](Materializer.html "class in akka.stream"),​[Attributes](Attributes.html "class in akka.stream"),​java.lang.String,​akka.stream.MaterializationContext\>
	- - akka.stream.MaterializationContext$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[Materializer](Materializer.html "class in akka.stream"),​[Attributes](Attributes.html "class in akka.stream"),​java.lang.String,​akka.stream.MaterializationContext>`

---

```
public class MaterializationContext$
extends scala.runtime.AbstractFunction3<[Materializer](Materializer.html "class in akka.stream"),​[Attributes](Attributes.html "class in akka.stream"),​java.lang.String,​akka.stream.MaterializationContext>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.MaterializationContext$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MaterializationContext$](MaterializationContext$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MaterializationContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.MaterializationContext` | `[apply](#apply(akka.stream.Materializer,akka.stream.Attributes,java.lang.String))​([Materializer](Materializer.html "class in akka.stream") materializer,  [Attributes](Attributes.html "class in akka.stream") effectiveAttributes,  java.lang.String islandName)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[Materializer](Materializer.html "class in akka.stream"),​[Attributes](Attributes.html "class in akka.stream"),​java.lang.String>>` | `[unapply](#unapply(akka.stream.MaterializationContext))​(akka.stream.MaterializationContext x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MaterializationContext$](MaterializationContext$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MaterializationContext$
		
		
		
		```
		public MaterializationContext$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[Materializer](Materializer.html "class in akka.stream"),​[Attributes](Attributes.html "class in akka.stream"),​java.lang.String,​akka.stream.MaterializationContext>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[Materializer](Materializer.html "class in akka.stream"),​[Attributes](Attributes.html "class in akka.stream"),​java.lang.String,​akka.stream.MaterializationContext>`
		- #### apply
		
		
		
		```
		public akka.stream.MaterializationContext apply​([Materializer](Materializer.html "class in akka.stream") materializer,
		                                                [Attributes](Attributes.html "class in akka.stream") effectiveAttributes,
		                                                java.lang.String islandName)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[Materializer](Materializer.html "class in akka.stream"),​[Attributes](Attributes.html "class in akka.stream"),​java.lang.String,​akka.stream.MaterializationContext>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[Materializer](Materializer.html "class in akka.stream"),​[Attributes](Attributes.html "class in akka.stream"),​java.lang.String>> unapply​(akka.stream.MaterializationContext x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/MaterializationContext$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/MaterializationContext$.html](https://doc.akka.io/japi/akka-core/current/akka/stream/MaterializationContext$.html)*