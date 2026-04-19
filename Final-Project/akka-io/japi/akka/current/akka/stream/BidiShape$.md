---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:46:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/BidiShape$.html
title: BidiShape$
---

# BidiShape$

## Content

Package [akka.stream](package-summary.html)
## Class BidiShape$

- java.lang.Object
- - akka.stream.BidiShape$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class BidiShape$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.BidiShape$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BidiShape$](BidiShape$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BidiShape$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<In1,​Out1,​In2,​Out2>[BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2>` | `[apply](#apply(akka.stream.Inlet,akka.stream.Outlet,akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<In1> in1,  [Outlet](Outlet.html "class in akka.stream")<Out1> out1,  [Inlet](Inlet.html "class in akka.stream")<In2> in2,  [Outlet](Outlet.html "class in akka.stream")<Out2> out2)` |  |
	| `<I1,​O1,​I2,​O2>[BidiShape](BidiShape.html "class in akka.stream")<I1,​O1,​I2,​O2>` | `[fromFlows](#fromFlows(akka.stream.FlowShape,akka.stream.FlowShape))​([FlowShape](FlowShape.html "class in akka.stream")<I1,​O1> top,  [FlowShape](FlowShape.html "class in akka.stream")<I2,​O2> bottom)` |  |
	| `<In1,​Out1,​In2,​Out2>[BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2>` | `[of](#of(akka.stream.Inlet,akka.stream.Outlet,akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<In1> in1,  [Outlet](Outlet.html "class in akka.stream")<Out1> out1,  [Inlet](Inlet.html "class in akka.stream")<In2> in2,  [Outlet](Outlet.html "class in akka.stream")<Out2> out2)` | Java API |
	| `<In1,​Out1,​In2,​Out2>scala.Option<scala.Tuple4<[Inlet](Inlet.html "class in akka.stream")<In1>,​[Outlet](Outlet.html "class in akka.stream")<Out1>,​[Inlet](Inlet.html "class in akka.stream")<In2>,​[Outlet](Outlet.html "class in akka.stream")<Out2>>>` | `[unapply](#unapply(akka.stream.BidiShape))​([BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BidiShape$](BidiShape$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BidiShape$
		
		
		
		```
		public BidiShape$()
		```

	- ### Method Detail
	
	
	
		- #### fromFlows
		
		
		
		```
		public <I1,​O1,​I2,​O2> [BidiShape](BidiShape.html "class in akka.stream")<I1,​O1,​I2,​O2> fromFlows​([FlowShape](FlowShape.html "class in akka.stream")<I1,​O1> top,
		                                                                                          [FlowShape](FlowShape.html "class in akka.stream")<I2,​O2> bottom)
		```
		- #### of
		
		
		
		```
		public <In1,​Out1,​In2,​Out2> [BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2> of​([Inlet](Inlet.html "class in akka.stream")<In1> in1,
		                                                                                               [Outlet](Outlet.html "class in akka.stream")<Out1> out1,
		                                                                                               [Inlet](Inlet.html "class in akka.stream")<In2> in2,
		                                                                                               [Outlet](Outlet.html "class in akka.stream")<Out2> out2)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public <In1,​Out1,​In2,​Out2> [BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2> apply​([Inlet](Inlet.html "class in akka.stream")<In1> in1,
		                                                                                                  [Outlet](Outlet.html "class in akka.stream")<Out1> out1,
		                                                                                                  [Inlet](Inlet.html "class in akka.stream")<In2> in2,
		                                                                                                  [Outlet](Outlet.html "class in akka.stream")<Out2> out2)
		```
		- #### unapply
		
		
		
		```
		public <In1,​Out1,​In2,​Out2> scala.Option<scala.Tuple4<[Inlet](Inlet.html "class in akka.stream")<In1>,​[Outlet](Outlet.html "class in akka.stream")<Out1>,​[Inlet](Inlet.html "class in akka.stream")<In2>,​[Outlet](Outlet.html "class in akka.stream")<Out2>>> unapply​([BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/BidiShape$.html
- https://doc.akka.io/japi/akka/current/akka/stream/BidiShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/BidiShape$.html](https://doc.akka.io/japi/akka/current/akka/stream/BidiShape$.html)*