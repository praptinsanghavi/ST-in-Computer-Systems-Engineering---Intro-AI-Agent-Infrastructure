---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/LineParser.html
title: LineParser
---

# LineParser

## Content

Package [akka.http.scaladsl.unmarshalling.sse](package-summary.html)
## Class LineParser

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<akka.util.ByteString,​java.lang.String\>\>
		- - akka.http.scaladsl.unmarshalling.sse.LineParser

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<akka.util.ByteString,​java.lang.String>,​akka.NotUsed>`

---

```
public final class LineParser
extends akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​java.lang.String>>
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LineParser](#%3Cinit%3E(int))​(int maxLineSize)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static byte` | `[CR](#CR())()` |  |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes attributes)` |  |
	| `static byte` | `[LF](#LF())()` |  |
	| `akka.stream.FlowShape<akka.util.ByteString,​java.lang.String>` | `[shape](#shape())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, initialAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LineParser
		
		
		
		```
		public LineParser​(int maxLineSize)
		```

	- ### Method Detail
	
	
	
		- #### CR
		
		
		
		```
		public static byte CR()
		```
		- #### LF
		
		
		
		```
		public static byte LF()
		```
		- #### shape
		
		
		
		```
		public akka.stream.FlowShape<akka.util.ByteString,​java.lang.String> shape()
		```
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes attributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​java.lang.String>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/LineParser.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/sse/LineParser.html)*