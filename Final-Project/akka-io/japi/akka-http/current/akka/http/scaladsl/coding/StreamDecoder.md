---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html
title: StreamDecoder
---

# StreamDecoder

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Interface StreamDecoder

- All Superinterfaces:
`[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`

All Known Implementing Classes:
`[Deflate](Deflate.html "class in akka.http.scaladsl.coding")`, `[Deflate$](Deflate$.html "class in akka.http.scaladsl.coding")`, `[Gzip](Gzip.html "class in akka.http.scaladsl.coding")`, `[Gzip$](Gzip$.html "class in akka.http.scaladsl.coding")`, `[NoCoding$](NoCoding$.html "class in akka.http.scaladsl.coding")`

---

```
public interface StreamDecoder
extends [Decoder](Decoder.html "interface in akka.http.scaladsl.coding")
```

Deprecated.
StreamDecoder is internal API and will be moved or removed in the future. Since 10\.2\.0\.

Internal API
 
 A decoder that is implemented in terms of a `Stage`

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[decoderFlow](#decoderFlow())()` | Deprecated. |
	| `int` | `[maxBytesPerChunk](#maxBytesPerChunk())()` | Deprecated. |
	| `scala.Function0<akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>>` | `[newDecompressorStage](#newDecompressorStage(int))​(int maxBytesPerChunk)` | Deprecated. |
	| `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")` | `[withMaxBytesPerChunk](#withMaxBytesPerChunk(int))​(int newMaxBytesPerChunk)` | Deprecated. |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.coding.[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[decode](Decoder.html#decode(akka.util.ByteString,akka.stream.Materializer)), [decodeData](Decoder.html#decodeData(T,akka.http.scaladsl.coding.DataMapper)), [decodeMessage](Decoder.html#decodeMessage(akka.http.scaladsl.model.HttpMessage)), [encoding](Decoder.html#encoding())`

- - ### Method Detail
	
	
	
		- #### decoderFlow
		
		
		
		```
		akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> decoderFlow()
		```
		
		Deprecated.
		
		Specified by:
		`[decoderFlow](Decoder.html#decoderFlow())` in interface `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`
		- #### maxBytesPerChunk
		
		
		
		```
		int maxBytesPerChunk()
		```
		
		Deprecated.
		
		Specified by:
		`[maxBytesPerChunk](Decoder.html#maxBytesPerChunk())` in interface `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`
		- #### newDecompressorStage
		
		
		
		```
		scala.Function0<akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>> newDecompressorStage​(int maxBytesPerChunk)
		```
		
		Deprecated.
		- #### withMaxBytesPerChunk
		
		
		
		```
		[Decoder](Decoder.html "interface in akka.http.scaladsl.coding") withMaxBytesPerChunk​(int newMaxBytesPerChunk)
		```
		
		Deprecated.
		
		Specified by:
		`[withMaxBytesPerChunk](Decoder.html#withMaxBytesPerChunk(int))` in interface `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html)*