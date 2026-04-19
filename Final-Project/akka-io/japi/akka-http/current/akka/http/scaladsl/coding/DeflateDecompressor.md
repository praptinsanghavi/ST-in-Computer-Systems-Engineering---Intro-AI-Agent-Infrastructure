---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressor.html
title: DeflateDecompressor
---

# DeflateDecompressor

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class DeflateDecompressor

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<akka.util.ByteString,​T\>\>
		- - akka.stream.impl.io.ByteStringParser\<akka.util.ByteString\>
			- - [akka.http.scaladsl.coding.DeflateDecompressorBase](DeflateDecompressorBase.html "class in akka.http.scaladsl.coding")
				- - akka.http.scaladsl.coding.DeflateDecompressor

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>,​akka.NotUsed>`

---

```
public class DeflateDecompressor
extends [DeflateDecompressorBase](DeflateDecompressorBase.html "class in akka.http.scaladsl.coding")
```

Internal API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.coding.[DeflateDecompressorBase](DeflateDecompressorBase.html "class in akka.http.scaladsl.coding")
		
		
		`[DeflateDecompressorBase.Inflate](DeflateDecompressorBase.Inflate.html "class in akka.http.scaladsl.coding")`
		- ### Nested classes/interfaces inherited from class akka.stream.impl.io.ByteStringParser
		
		
		`akka.stream.impl.io.ByteStringParser.ByteReader, akka.stream.impl.io.ByteStringParser.FinishedParser$, akka.stream.impl.io.ByteStringParser.ParseResult<T extends java.lang.Object>, akka.stream.impl.io.ByteStringParser.ParseResult$, akka.stream.impl.io.ByteStringParser.ParseStep<T extends java.lang.Object>, akka.stream.impl.io.ByteStringParser.ParsingException, akka.stream.impl.io.ByteStringParser.ParsingLogic`
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeflateDecompressor](#%3Cinit%3E(int))​(int maxBytesPerChunk)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.impl.io.ByteStringParser.ParsingLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes attr)` |  |
	
	
		- ### Methods inherited from class akka.stream.impl.io.ByteStringParser
		
		
		`akka$stream$impl$io$ByteStringParser$$bytesIn, akka$stream$impl$io$ByteStringParser$$objOut, CompactionThreshold, initialAttributes, NeedMoreData, shape`
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeflateDecompressor
		
		
		
		```
		public DeflateDecompressor​(int maxBytesPerChunk)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public akka.stream.impl.io.ByteStringParser.ParsingLogic createLogic​(akka.stream.Attributes attr)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressorBase.Inflate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressorBase.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressor.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressor.html)*