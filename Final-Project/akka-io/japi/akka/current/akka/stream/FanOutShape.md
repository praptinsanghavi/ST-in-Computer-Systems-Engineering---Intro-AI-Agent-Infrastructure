---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:46:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Ports$.html
title: FanOutShape.Ports$
---

# FanOutShape.Ports$

## Content

Package [akka.stream](package-summary.html)
## Class FanOutShape.Ports$

- java.lang.Object
- - akka.stream.FanOutShape.Ports$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[FanOutShape](FanOutShape.html "class in akka.stream")\<[I](FanOutShape.html "type parameter in FanOutShape")\>

---

```
public static class FanOutShape.Ports$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.FanOutShape.Ports$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FanOutShape.Ports$](FanOutShape.Ports$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Ports$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<I> [FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<I>` | `[apply](#apply(akka.stream.Inlet,scala.collection.immutable.Seq))​([Inlet](Inlet.html "class in akka.stream")<I> inlet,  scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<I> scala.Option<scala.Tuple2<[Inlet](Inlet.html "class in akka.stream")<I>,​scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>>>` | `[unapply](#unapply(akka.stream.FanOutShape.Ports))​([FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<I> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FanOutShape.Ports$](FanOutShape.Ports$.html "class in akka.stream") MODULE$
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
		public <I> [FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<I> apply​([Inlet](Inlet.html "class in akka.stream")<I> inlet,
		                                      scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)
		```
		- #### unapply
		
		
		
		```
		public <I> scala.Option<scala.Tuple2<[Inlet](Inlet.html "class in akka.stream")<I>,​scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>>> unapply​([FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<I> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Ports$.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Ports.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Ports$.html](https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Ports$.html)*