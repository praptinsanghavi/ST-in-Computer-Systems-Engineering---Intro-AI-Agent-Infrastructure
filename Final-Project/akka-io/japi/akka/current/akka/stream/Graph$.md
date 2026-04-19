---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/Graph$.html
title: Graph$
---

# Graph$

## Content

Package [akka.stream](package-summary.html)
## Class Graph$

- java.lang.Object
- - akka.stream.Graph$

- ---

```
public class Graph$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Graph$](Graph$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Graph$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<S extends [Shape](Shape.html "class in akka.stream"),​M>[Graph.GraphMapMatVal](Graph.GraphMapMatVal.html "class in akka.stream")<S,​M>` | `[GraphMapMatVal](#GraphMapMatVal(akka.stream.Graph))​([Graph](Graph.html "interface in akka.stream")<S,​M> self)` |  |
	| `<S extends [Shape](Shape.html "class in akka.stream"),​M1,​M2>[Graph](Graph.html "interface in akka.stream")<S,​M2>` | `[mapMaterializedValue](#mapMaterializedValue(akka.stream.Graph,scala.Function1))​([Graph](Graph.html "interface in akka.stream")<S,​M1> g,  scala.Function1<M1,​M2> f)` | Java API  Transform the materialized value of this Flow, leaving all other properties as they were. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Graph$](Graph$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Graph$
		
		
		
		```
		public Graph$()
		```

	- ### Method Detail
	
	
	
		- #### mapMaterializedValue
		
		
		
		```
		public <S extends [Shape](Shape.html "class in akka.stream"),​M1,​M2> [Graph](Graph.html "interface in akka.stream")<S,​M2> mapMaterializedValue​([Graph](Graph.html "interface in akka.stream")<S,​M1> g,
		                                                                                  scala.Function1<M1,​M2> f)
		```
		
		Java API
		 Transform the materialized value of this Flow, leaving all other properties as they were.
		 
		
		Parameters:
		`g` \- the graph being transformed
		`f` \- function to map the graph's materialized value
		Returns:
		a graph with same semantics as the given graph, except from the materialized value which is mapped using f.
		- #### GraphMapMatVal
		
		
		
		```
		public final <S extends [Shape](Shape.html "class in akka.stream"),​M> [Graph.GraphMapMatVal](Graph.GraphMapMatVal.html "class in akka.stream")<S,​M> GraphMapMatVal​([Graph](Graph.html "interface in akka.stream")<S,​M> self)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/Graph$.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/Graph$.html](https://doc.akka.io/japi/akka/current/akka/stream/Graph$.html)*