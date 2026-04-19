---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Encoder.html
title: Utf8Encoder
---

# Utf8Encoder

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class Utf8Encoder

- java.lang.Object
- - akka.http.impl.engine.ws.Utf8Encoder

- ---

```
public class Utf8Encoder
extends java.lang.Object
```

A utf16 (\= Java char) to utf8 encoder.
 
 INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Utf8Encoder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.stream.Graph<S,​M>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​(akka.stream.Attributes attr)` |  |
	| `static akka.stream.Graph<S,​M>` | `[async](#async())()` |  |
	| `static akka.stream.Graph<S,​M>` | `[async](#async(java.lang.String))​(java.lang.String dispatcher)` |  |
	| `static akka.stream.Graph<S,​M>` | `[async](#async(java.lang.String,int))​(java.lang.String dispatcher,  int inputBufferSize)` |  |
	| `static akka.stream.Outlet<akka.util.ByteString>` | `[byteStringOut](#byteStringOut())()` |  |
	| `static akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `static scala.Tuple2<akka.stream.stage.GraphStageLogic,​akka.NotUsed>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `static scala.Tuple2<akka.stream.stage.GraphStageLogic,​M>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes,akka.stream.Materializer))​(akka.stream.Attributes inheritedAttributes,  akka.stream.Materializer materializer)` |  |
	| `static akka.stream.Attributes` | `[getAttributes](#getAttributes())()` |  |
	| `static akka.stream.Attributes` | `[initialAttributes](#initialAttributes())()` |  |
	| `static long` | `[lowerNBitsSet](#lowerNBitsSet(int))​(int n)` |  |
	| `static akka.stream.Graph<S,​M>` | `[named](#named(java.lang.String))​(java.lang.String name)` |  |
	| `static akka.stream.FlowShape<java.lang.String,​akka.util.ByteString>` | `[shape](#shape())()` |  |
	| `static akka.stream.Inlet<java.lang.String>` | `[stringIn](#stringIn())()` |  |
	| `static int` | `[SurrogateHighMask](#SurrogateHighMask())()` |  |
	| `static int` | `[SurrogateLowMask](#SurrogateLowMask())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static akka.stream.impl.TraversalBuilder` | `[traversalBuilder](#traversalBuilder())()` |  |
	| `static long` | `[Utf8OneByteLimit](#Utf8OneByteLimit())()` |  |
	| `static long` | `[Utf8ThreeByteLimit](#Utf8ThreeByteLimit())()` |  |
	| `static long` | `[Utf8TwoByteLimit](#Utf8TwoByteLimit())()` |  |
	| `static akka.stream.Graph<S,​M>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​(akka.stream.Attributes attr)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Utf8Encoder
		
		
		
		```
		public Utf8Encoder()
		```

	- ### Method Detail
	
	
	
		- #### SurrogateHighMask
		
		
		
		```
		public static int SurrogateHighMask()
		```
		- #### SurrogateLowMask
		
		
		
		```
		public static int SurrogateLowMask()
		```
		- #### Utf8OneByteLimit
		
		
		
		```
		public static long Utf8OneByteLimit()
		```
		- #### Utf8TwoByteLimit
		
		
		
		```
		public static long Utf8TwoByteLimit()
		```
		- #### Utf8ThreeByteLimit
		
		
		
		```
		public static long Utf8ThreeByteLimit()
		```
		- #### lowerNBitsSet
		
		
		
		```
		public static long lowerNBitsSet​(int n)
		```
		- #### stringIn
		
		
		
		```
		public static akka.stream.Inlet<java.lang.String> stringIn()
		```
		- #### byteStringOut
		
		
		
		```
		public static akka.stream.Outlet<akka.util.ByteString> byteStringOut()
		```
		- #### shape
		
		
		
		```
		public static akka.stream.FlowShape<java.lang.String,​akka.util.ByteString> shape()
		```
		- #### initialAttributes
		
		
		
		```
		public static akka.stream.Attributes initialAttributes()
		```
		- #### createLogic
		
		
		
		```
		public static akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### named
		
		
		
		```
		public static akka.stream.Graph<S,​M> named​(java.lang.String name)
		```
		- #### async
		
		
		
		```
		public static akka.stream.Graph<S,​M> async()
		```
		- #### async
		
		
		
		```
		public static akka.stream.Graph<S,​M> async​(java.lang.String dispatcher)
		```
		- #### async
		
		
		
		```
		public static akka.stream.Graph<S,​M> async​(java.lang.String dispatcher,
		                                                 int inputBufferSize)
		```
		- #### addAttributes
		
		
		
		```
		public static akka.stream.Graph<S,​M> addAttributes​(akka.stream.Attributes attr)
		```
		- #### getAttributes
		
		
		
		```
		public static akka.stream.Attributes getAttributes()
		```
		- #### createLogicAndMaterializedValue
		
		
		
		```
		public static scala.Tuple2<akka.stream.stage.GraphStageLogic,​M> createLogicAndMaterializedValue​(akka.stream.Attributes inheritedAttributes,
		                                                                                                      akka.stream.Materializer materializer)
		```
		- #### traversalBuilder
		
		
		
		```
		public static final akka.stream.impl.TraversalBuilder traversalBuilder()
		```
		- #### withAttributes
		
		
		
		```
		public static final akka.stream.Graph<S,​M> withAttributes​(akka.stream.Attributes attr)
		```
		- #### createLogicAndMaterializedValue
		
		
		
		```
		public static final scala.Tuple2<akka.stream.stage.GraphStageLogic,​akka.NotUsed> createLogicAndMaterializedValue​(akka.stream.Attributes inheritedAttributes)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Encoder.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Encoder.html)*