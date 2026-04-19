---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:18:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowShape$.html
title: FlowShape$
---

# FlowShape$

## Content

Package [akka.stream](package-summary.html)
## Class FlowShape$

- java.lang.Object
- - akka.stream.FlowShape$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class FlowShape$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.FlowShape$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FlowShape$](FlowShape$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlowShape$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<I,​O>[FlowShape](FlowShape.html "class in akka.stream")<I,​O>` | `[apply](#apply(akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<I> in,  [Outlet](Outlet.html "class in akka.stream")<O> out)` |  |
	| `<I,​O>[FlowShape](FlowShape.html "class in akka.stream")<I,​O>` | `[of](#of(akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<I> inlet,  [Outlet](Outlet.html "class in akka.stream")<O> outlet)` | Java API |
	| `<I,​O>scala.Option<scala.Tuple2<[Inlet](Inlet.html "class in akka.stream")<I>,​[Outlet](Outlet.html "class in akka.stream")<O>>>` | `[unapply](#unapply(akka.stream.FlowShape))​([FlowShape](FlowShape.html "class in akka.stream")<I,​O> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FlowShape$](FlowShape$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FlowShape$
		
		
		
		```
		public FlowShape$()
		```

	- ### Method Detail
	
	
	
		- #### of
		
		
		
		```
		public <I,​O> [FlowShape](FlowShape.html "class in akka.stream")<I,​O> of​([Inlet](Inlet.html "class in akka.stream")<I> inlet,
		                                           [Outlet](Outlet.html "class in akka.stream")<O> outlet)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public <I,​O> [FlowShape](FlowShape.html "class in akka.stream")<I,​O> apply​([Inlet](Inlet.html "class in akka.stream")<I> in,
		                                              [Outlet](Outlet.html "class in akka.stream")<O> out)
		```
		- #### unapply
		
		
		
		```
		public <I,​O> scala.Option<scala.Tuple2<[Inlet](Inlet.html "class in akka.stream")<I>,​[Outlet](Outlet.html "class in akka.stream")<O>>> unapply​([FlowShape](FlowShape.html "class in akka.stream")<I,​O> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowShape$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowShape$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowShape$.html)*