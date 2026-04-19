---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:29:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/UniformFanInShape$.html
title: UniformFanInShape$
---

# UniformFanInShape$

## Content

Package [akka.stream](package-summary.html)
## Class UniformFanInShape$

- java.lang.Object
- - akka.stream.UniformFanInShape$

- ---

```
public class UniformFanInShape$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UniformFanInShape$](UniformFanInShape$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UniformFanInShape$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<I,​O>[UniformFanInShape](UniformFanInShape.html "class in akka.stream")<I,​O>` | `[apply](#apply(akka.stream.Outlet,scala.collection.immutable.Seq))​([Outlet](Outlet.html "class in akka.stream")<O> outlet,  scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<I>> inlets)` |  |
	| `<I,​O>[UniformFanInShape](UniformFanInShape.html "class in akka.stream")<I,​O>` | `[create](#create(akka.stream.Outlet,java.util.List))​([Outlet](Outlet.html "class in akka.stream")<O> outlet,  java.util.List<[Inlet](Inlet.html "class in akka.stream")<I>> inlets)` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UniformFanInShape$](UniformFanInShape$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UniformFanInShape$
		
		
		
		```
		public UniformFanInShape$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <I,​O> [UniformFanInShape](UniformFanInShape.html "class in akka.stream")<I,​O> apply​([Outlet](Outlet.html "class in akka.stream")<O> outlet,
		                                                      scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<I>> inlets)
		```
		- #### create
		
		
		
		```
		public <I,​O> [UniformFanInShape](UniformFanInShape.html "class in akka.stream")<I,​O> create​([Outlet](Outlet.html "class in akka.stream")<O> outlet,
		                                                       java.util.List<[Inlet](Inlet.html "class in akka.stream")<I>> inlets)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/UniformFanInShape$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/UniformFanInShape$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/UniformFanInShape$.html)*