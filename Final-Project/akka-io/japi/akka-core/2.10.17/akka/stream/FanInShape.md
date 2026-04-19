---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:26:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanInShape.Ports$.html
title: FanInShape.Ports$
---

# FanInShape.Ports$

## Content

Package [akka.stream](package-summary.html)
## Class FanInShape.Ports$

- java.lang.Object
- - akka.stream.FanInShape.Ports$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[FanInShape](FanInShape.html "class in akka.stream")\<[O](FanInShape.html "type parameter in FanInShape")\>

---

```
public static class FanInShape.Ports$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.FanInShape.Ports$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FanInShape.Ports$](FanInShape.Ports$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Ports$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<O> [FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")<O>` | `[apply](#apply(akka.stream.Outlet,scala.collection.immutable.Seq))​([Outlet](Outlet.html "class in akka.stream")<O> outlet,  scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<O> scala.Option<scala.Tuple2<[Outlet](Outlet.html "class in akka.stream")<O>,​scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>>>` | `[unapply](#unapply(akka.stream.FanInShape.Ports))​([FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")<O> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FanInShape.Ports$](FanInShape.Ports$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Ports$
		
		
		
		```
		public Ports$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <O> [FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")<O> apply​([Outlet](Outlet.html "class in akka.stream")<O> outlet,
		                                     scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets)
		```
		- #### unapply
		
		
		
		```
		public <O> scala.Option<scala.Tuple2<[Outlet](Outlet.html "class in akka.stream")<O>,​scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>>> unapply​([FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")<O> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanInShape.Ports$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanInShape.Ports.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanInShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanInShape.Ports$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanInShape.Ports$.html)*