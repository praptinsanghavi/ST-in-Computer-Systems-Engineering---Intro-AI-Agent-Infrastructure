---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/GraphDSL$.html
title: GraphDSL$
---

# GraphDSL$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class GraphDSL$

- java.lang.Object
- - akka.stream.scaladsl.GraphDSL$

- All Implemented Interfaces:
`[GraphApply](GraphApply.html "interface in akka.stream.scaladsl")`

---

```
public class GraphDSL$
extends java.lang.Object
implements [GraphApply](GraphApply.html "interface in akka.stream.scaladsl")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GraphDSL$](GraphDSL$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GraphDSL$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<S extends [Shape](../Shape.html "class in akka.stream"),​IS extends [Shape](../Shape.html "class in akka.stream"),​Mat>[Graph](../Graph.html "interface in akka.stream")<S,​scala.collection.immutable.Seq<Mat>>` | `[create](#create(scala.collection.immutable.Seq,scala.Function1))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<IS,​Mat>> graphs,  scala.Function1<akka.stream.scaladsl.GraphDSL.Builder<scala.collection.immutable.Seq<Mat>>,​scala.Function1<scala.collection.immutable.Seq<IS>,​S>> buildBlock)` | Creates a new `Graph` by importing the given graph list `graphs` and passing their `Shape`s  along with the `GraphDSL.Builder` to the given create function. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.scaladsl.[GraphApply](GraphApply.html "interface in akka.stream.scaladsl")
		
		
		`[create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function22,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function21,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function20,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function19,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function18,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function17,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function16,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function15,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function14,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function13,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function12,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function11,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function10,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function9,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function8,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function7,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function6,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function5,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function4,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function3,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,akka.stream.Graph,scala.Function2,scala.Function1)), [create](GraphApply.html#create(akka.stream.Graph,scala.Function1)), [create](GraphApply.html#create(scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function22,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function21,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function20,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function19,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function18,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function17,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function16,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function15,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function14,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function13,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function12,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function11,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function10,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function9,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function8,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function7,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function6,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function5,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function4,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,akka.stream.Graph,scala.Function3,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,akka.stream.Graph,scala.Function2,scala.Function1)), [createGraph](GraphApply.html#createGraph(akka.stream.Graph,scala.Function1)), [createGraph](GraphApply.html#createGraph(S,akka.stream.scaladsl.GraphDSL.Builder))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GraphDSL$](GraphDSL$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GraphDSL$
		
		
		
		```
		public GraphDSL$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <S extends [Shape](../Shape.html "class in akka.stream"),​IS extends [Shape](../Shape.html "class in akka.stream"),​Mat> [Graph](../Graph.html "interface in akka.stream")<S,​scala.collection.immutable.Seq<Mat>> create​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<IS,​Mat>> graphs,
		                                                                                                                    scala.Function1<akka.stream.scaladsl.GraphDSL.Builder<scala.collection.immutable.Seq<Mat>>,​scala.Function1<scala.collection.immutable.Seq<IS>,​S>> buildBlock)
		```
		
		Creates a new `Graph` by importing the given graph list `graphs` and passing their `Shape`s
		 along with the `GraphDSL.Builder` to the given create function.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/GraphApply.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/GraphDSL$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/GraphDSL$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/GraphDSL$.html)*