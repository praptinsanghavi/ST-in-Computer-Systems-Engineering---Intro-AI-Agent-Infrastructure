---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Encoder$.html
title: Utf8Encoder$
---

# Utf8Encoder$

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class Utf8Encoder$

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<java.lang.String,​akka.util.ByteString\>\>
		- - akka.http.impl.engine.ws.Utf8Encoder$

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<java.lang.String,​akka.util.ByteString>,​akka.NotUsed>`

---

```
public class Utf8Encoder$
extends akka.stream.stage.GraphStage<akka.stream.FlowShape<java.lang.String,​akka.util.ByteString>>
```

A utf16 (\= Java char) to utf8 encoder.
 
 INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Utf8Encoder$](Utf8Encoder$.html "class in akka.http.impl.engine.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Utf8Encoder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.Outlet<akka.util.ByteString>` | `[byteStringOut](#byteStringOut())()` |  |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `akka.stream.Attributes` | `[initialAttributes](#initialAttributes())()` |  |
	| `long` | `[lowerNBitsSet](#lowerNBitsSet(int))​(int n)` |  |
	| `akka.stream.FlowShape<java.lang.String,​akka.util.ByteString>` | `[shape](#shape())()` |  |
	| `akka.stream.Inlet<java.lang.String>` | `[stringIn](#stringIn())()` |  |
	| `int` | `[SurrogateHighMask](#SurrogateHighMask())()` |  |
	| `int` | `[SurrogateLowMask](#SurrogateLowMask())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `long` | `[Utf8OneByteLimit](#Utf8OneByteLimit())()` |  |
	| `long` | `[Utf8ThreeByteLimit](#Utf8ThreeByteLimit())()` |  |
	| `long` | `[Utf8TwoByteLimit](#Utf8TwoByteLimit())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Utf8Encoder$](Utf8Encoder$.html "class in akka.http.impl.engine.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Utf8Encoder$
		
		
		
		```
		public Utf8Encoder$()
		```

	- ### Method Detail
	
	
	
		- #### SurrogateHighMask
		
		
		
		```
		public int SurrogateHighMask()
		```
		- #### SurrogateLowMask
		
		
		
		```
		public int SurrogateLowMask()
		```
		- #### Utf8OneByteLimit
		
		
		
		```
		public long Utf8OneByteLimit()
		```
		- #### Utf8TwoByteLimit
		
		
		
		```
		public long Utf8TwoByteLimit()
		```
		- #### Utf8ThreeByteLimit
		
		
		
		```
		public long Utf8ThreeByteLimit()
		```
		- #### lowerNBitsSet
		
		
		
		```
		public long lowerNBitsSet​(int n)
		```
		- #### stringIn
		
		
		
		```
		public akka.stream.Inlet<java.lang.String> stringIn()
		```
		- #### byteStringOut
		
		
		
		```
		public akka.stream.Outlet<akka.util.ByteString> byteStringOut()
		```
		- #### shape
		
		
		
		```
		public akka.stream.FlowShape<java.lang.String,​akka.util.ByteString> shape()
		```
		- #### initialAttributes
		
		
		
		```
		public akka.stream.Attributes initialAttributes()
		```
		
		
		Overrides:
		`initialAttributes` in class `akka.stream.stage.GraphStageWithMaterializedValue<akka.stream.FlowShape<java.lang.String,​akka.util.ByteString>,​akka.NotUsed>`
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<java.lang.String,​akka.util.ByteString>>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Encoder$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Encoder$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Encoder$.html)*