---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding.html
title: NoCoding
---

# NoCoding

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class NoCoding

- java.lang.Object
- - akka.http.scaladsl.coding.NoCoding

- ---

```
public class NoCoding
extends java.lang.Object
```

Deprecated.
Actual implementation of NoCoding is internal API, use Coders.NoCoding instead. Since 10\.2\.0\.

An encoder and decoder for the HTTP 'identity' encoding.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoCoding](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static scala.concurrent.Future<akka.util.ByteString>` | `[decode](#decode(akka.util.ByteString,akka.stream.Materializer))​(akka.util.ByteString input,  akka.stream.Materializer mat)` | Deprecated. |
	| `static <T> T` | `[decodeData](#decodeData(T,akka.http.scaladsl.coding.DataMapper))​(T t,  [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)` | Deprecated. |
	| `static akka.http.scaladsl.coding.Decoder.message` | `[decodeMessage](#decodeMessage(akka.http.scaladsl.model.HttpMessage))​([HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model") message)` | Deprecated. |
	| `static akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[decoderFlow](#decoderFlow())()` | Deprecated. |
	| `static akka.util.ByteString` | `[encode](#encode(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. |
	| `static scala.concurrent.Future<akka.util.ByteString>` | `[encodeAsync](#encodeAsync(akka.util.ByteString,akka.stream.Materializer))​(akka.util.ByteString input,  akka.stream.Materializer mat)` | Deprecated. |
	| `static <T> T` | `[encodeData](#encodeData(T,akka.http.scaladsl.coding.DataMapper))​(T t,  [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)` | Deprecated. |
	| `static akka.http.scaladsl.coding.Encoder.message` | `[encodeMessage](#encodeMessage(akka.http.scaladsl.model.HttpMessage))​([HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model") message)` | Deprecated. |
	| `static akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[encoderFlow](#encoderFlow())()` | Deprecated. |
	| `static [HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[encoding](#encoding())()` | Deprecated. |
	| `static int` | `[maxBytesPerChunk](#maxBytesPerChunk())()` | Deprecated. |
	| `static scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object>` | `[messageFilter](#messageFilter())()` | Deprecated. |
	| `static [NoCodingCompressor$](NoCodingCompressor$.html "class in akka.http.scaladsl.coding")` | `[newCompressor](#newCompressor())()` | Deprecated. |
	| `static scala.Function0<akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>>` | `[newDecompressorStage](#newDecompressorStage(int))​(int maxBytesPerChunk)` | Deprecated. |
	| `static akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>` | `[newEncodeTransformer](#newEncodeTransformer())()` | Deprecated. |
	| `static [Decoder](Decoder.html "interface in akka.http.scaladsl.coding")` | `[withMaxBytesPerChunk](#withMaxBytesPerChunk(int))​(int newMaxBytesPerChunk)` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NoCoding
		
		
		
		```
		public NoCoding()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### encoding
		
		
		
		```
		public static [HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding()
		```
		
		Deprecated.
		- #### encodeData
		
		
		
		```
		public static <T> T encodeData​(T t,
		                               [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)
		```
		
		Deprecated.
		- #### decodeData
		
		
		
		```
		public static <T> T decodeData​(T t,
		                               [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)
		```
		
		Deprecated.
		- #### messageFilter
		
		
		
		```
		public static scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter()
		```
		
		Deprecated.
		- #### newCompressor
		
		
		
		```
		public static [NoCodingCompressor$](NoCodingCompressor$.html "class in akka.http.scaladsl.coding") newCompressor()
		```
		
		Deprecated.
		- #### newDecompressorStage
		
		
		
		```
		public static scala.Function0<akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>> newDecompressorStage​(int maxBytesPerChunk)
		```
		
		Deprecated.
		- #### encodeMessage
		
		
		
		```
		public static akka.http.scaladsl.coding.Encoder.message encodeMessage​([HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model") message)
		```
		
		Deprecated.
		- #### encoderFlow
		
		
		
		```
		public static akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> encoderFlow()
		```
		
		Deprecated.
		- #### encode
		
		
		
		```
		public static akka.util.ByteString encode​(akka.util.ByteString input)
		```
		
		Deprecated.
		- #### encodeAsync
		
		
		
		```
		public static scala.concurrent.Future<akka.util.ByteString> encodeAsync​(akka.util.ByteString input,
		                                                                        akka.stream.Materializer mat)
		```
		
		Deprecated.
		- #### newEncodeTransformer
		
		
		
		```
		public static akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>> newEncodeTransformer()
		```
		
		Deprecated.
		- #### decodeMessage
		
		
		
		```
		public static akka.http.scaladsl.coding.Decoder.message decodeMessage​([HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model") message)
		```
		
		Deprecated.
		- #### decode
		
		
		
		```
		public static scala.concurrent.Future<akka.util.ByteString> decode​(akka.util.ByteString input,
		                                                                   akka.stream.Materializer mat)
		```
		
		Deprecated.
		- #### maxBytesPerChunk
		
		
		
		```
		public static int maxBytesPerChunk()
		```
		
		Deprecated.
		- #### withMaxBytesPerChunk
		
		
		
		```
		public static [Decoder](Decoder.html "interface in akka.http.scaladsl.coding") withMaxBytesPerChunk​(int newMaxBytesPerChunk)
		```
		
		Deprecated.
		- #### decoderFlow
		
		
		
		```
		public static akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> decoderFlow()
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding.html)*