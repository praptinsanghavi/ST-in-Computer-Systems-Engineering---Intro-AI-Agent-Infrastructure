---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html
title: Graph.GraphMapMatVal
---

# Graph.GraphMapMatVal

## Content

Package [akka.stream](package-summary.html)
## Class Graph.GraphMapMatVal\<S extends [Shape](Shape.html "class in akka.stream"),​M\>

- java.lang.Object
- - akka.stream.Graph.GraphMapMatVal\<S,​M\>

- Enclosing interface:
[Graph](Graph.html "interface in akka.stream")\<[S](Graph.html "type parameter in Graph") extends [Shape](Shape.html "class in akka.stream"),​[M](Graph.html "type parameter in Graph")\>

---

```
public static final class Graph.GraphMapMatVal<S extends [Shape](Shape.html "class in akka.stream"),​M>
extends java.lang.Object
```

Scala API, see https://github.com/akka/akka\-core/issues/28501 for discussion why this can't be an instance method on class Graph.
 param: self the graph whose materialized value will be mapped

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GraphMapMatVal](#%3Cinit%3E(akka.stream.Graph))​([Graph](Graph.html "interface in akka.stream")<[S](Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal"),​[M](Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")> self)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<M2> [Graph](Graph.html "interface in akka.stream")<[S](Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal"),​M2>` | `[mapMaterializedValue](#mapMaterializedValue(scala.Function1))​(scala.Function1<[M](Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal"),​M2> f)` | Transform the materialized value of this Graph, leaving all other properties as they were. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### GraphMapMatVal
		
		
		
		```
		public GraphMapMatVal​([Graph](Graph.html "interface in akka.stream")<[S](Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal"),​[M](Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")> self)
		```

	- ### Method Detail
	
	
	
		- #### mapMaterializedValue
		
		
		
		```
		public <M2> [Graph](Graph.html "interface in akka.stream")<[S](Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal"),​M2> mapMaterializedValue​(scala.Function1<[M](Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal"),​M2> f)
		```
		
		Transform the materialized value of this Graph, leaving all other properties as they were.
		 
		
		Parameters:
		`f` \- function to map the graph's materialized value

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html)*