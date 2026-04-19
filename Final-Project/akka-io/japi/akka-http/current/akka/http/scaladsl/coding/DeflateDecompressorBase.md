---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressorBase.html
title: DeflateDecompressorBase
---

# DeflateDecompressorBase

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class DeflateDecompressorBase

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<akka.util.ByteString,​T\>\>
		- - akka.stream.impl.io.ByteStringParser\<akka.util.ByteString\>
			- - akka.http.scaladsl.coding.DeflateDecompressorBase

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>,​akka.NotUsed>`

Direct Known Subclasses:
`[DeflateDecompressor](DeflateDecompressor.html "class in akka.http.scaladsl.coding")`, `[GzipDecompressor](GzipDecompressor.html "class in akka.http.scaladsl.coding")`

---

```
public abstract class DeflateDecompressorBase
extends akka.stream.impl.io.ByteStringParser<akka.util.ByteString>
```

Internal API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[DeflateDecompressorBase.Inflate](DeflateDecompressorBase.Inflate.html "class in akka.http.scaladsl.coding")` |  |
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.impl.io.ByteStringParser
		
		
		`akka.stream.impl.io.ByteStringParser.ByteReader, akka.stream.impl.io.ByteStringParser.FinishedParser$, akka.stream.impl.io.ByteStringParser.ParseResult<T extends java.lang.Object>, akka.stream.impl.io.ByteStringParser.ParseResult$, akka.stream.impl.io.ByteStringParser.ParseStep<T extends java.lang.Object>, akka.stream.impl.io.ByteStringParser.ParsingException, akka.stream.impl.io.ByteStringParser.ParsingLogic`
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeflateDecompressorBase](#%3Cinit%3E(int))​(int maxBytesPerChunk)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.stream.impl.io.ByteStringParser
		
		
		`akka$stream$impl$io$ByteStringParser$$bytesIn, akka$stream$impl$io$ByteStringParser$$objOut, CompactionThreshold, initialAttributes, NeedMoreData, shape`
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogic, createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeflateDecompressorBase
		
		
		
		```
		public DeflateDecompressorBase​(int maxBytesPerChunk)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressorBase.Inflate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/GzipDecompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressorBase.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressorBase.html)*