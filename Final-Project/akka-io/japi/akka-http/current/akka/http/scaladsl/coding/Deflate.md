---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate.html
title: Deflate
---

# Deflate

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class Deflate

- java.lang.Object
- - akka.http.scaladsl.coding.Deflate

- All Implemented Interfaces:
`[Coder](Coder.html "interface in akka.http.scaladsl.coding")`, `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`, `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`, `[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")`

Direct Known Subclasses:
`[Deflate$](Deflate$.html "class in akka.http.scaladsl.coding")`

---

```
public class Deflate
extends java.lang.Object
implements [Coder](Coder.html "interface in akka.http.scaladsl.coding"), [StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")
```

Deprecated.
Actual implementation of Deflate is internal API, use Coders.Deflate instead. Since 10\.2\.0\.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Deflate](#%3Cinit%3E(int,scala.Function1))​(int compressionLevel,  scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)` | Deprecated. |
	| `[Deflate](#%3Cinit%3E(scala.Function1))​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
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
	| `[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[encoding](#encoding())()` | Deprecated. |
	| `static int` | `[maxBytesPerChunk](#maxBytesPerChunk())()` | Deprecated. |
	| `scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object>` | `[messageFilter](#messageFilter())()` | Deprecated. |
	| `[DeflateCompressor](DeflateCompressor.html "class in akka.http.scaladsl.coding")` | `[newCompressor](#newCompressor())()` | Deprecated. |
	| `scala.Function0<[DeflateDecompressor](DeflateDecompressor.html "class in akka.http.scaladsl.coding")>` | `[newDecompressorStage](#newDecompressorStage(int))​(int maxBytesPerChunk)` | Deprecated. |
	| `static akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>` | `[newEncodeTransformer](#newEncodeTransformer())()` | Deprecated. |
	| `[Deflate](Deflate.html "class in akka.http.scaladsl.coding")` | `[withLevel](#withLevel(int))​(int level)` | Deprecated. Use Coders.Deflate(compressionLevel \= ...) instead. |
	| `static [Decoder](Decoder.html "interface in akka.http.scaladsl.coding")` | `[withMaxBytesPerChunk](#withMaxBytesPerChunk(int))​(int newMaxBytesPerChunk)` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.coding.[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[decode](Decoder.html#decode(akka.util.ByteString,akka.stream.Materializer)), [decodeData](Decoder.html#decodeData(T,akka.http.scaladsl.coding.DataMapper)), [decodeMessage](Decoder.html#decodeMessage(akka.http.scaladsl.model.HttpMessage))`
		- ### Methods inherited from interface akka.http.scaladsl.coding.[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[encode](Encoder.html#encode(akka.util.ByteString)), [encodeAsync](Encoder.html#encodeAsync(akka.util.ByteString,akka.stream.Materializer)), [encodeData](Encoder.html#encodeData(T,akka.http.scaladsl.coding.DataMapper)), [encodeMessage](Encoder.html#encodeMessage(akka.http.scaladsl.model.HttpMessage)), [encoderFlow](Encoder.html#encoderFlow()), [newEncodeTransformer](Encoder.html#newEncodeTransformer()), [singleUseEncoderFlow](Encoder.html#singleUseEncoderFlow())`
		- ### Methods inherited from interface akka.http.scaladsl.coding.[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[decoderFlow](StreamDecoder.html#decoderFlow()), [maxBytesPerChunk](StreamDecoder.html#maxBytesPerChunk()), [withMaxBytesPerChunk](StreamDecoder.html#withMaxBytesPerChunk(int))`

- - ### Constructor Detail
	
	
	
		- #### Deflate
		
		
		
		```
		public Deflate​(int compressionLevel,
		               scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)
		```
		
		Deprecated.
		- #### Deflate
		
		
		
		```
		public Deflate​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### encodeMessage
		
		
		
		```
		public static akka.http.scaladsl.coding.Encoder.message encodeMessage​([HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model") message)
		```
		
		Deprecated.
		- #### encodeData
		
		
		
		```
		public static <T> T encodeData​(T t,
		                               [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)
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
		- #### decodeData
		
		
		
		```
		public static <T> T decodeData​(T t,
		                               [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)
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
		- #### messageFilter
		
		
		
		```
		public scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter()
		```
		
		Deprecated.
		
		Specified by:
		`[messageFilter](Encoder.html#messageFilter())` in interface `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`
		- #### encoding
		
		
		
		```
		public [HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding()
		```
		
		Deprecated.
		
		Specified by:
		`[encoding](Decoder.html#encoding())` in interface `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`
		Specified by:
		`[encoding](Encoder.html#encoding())` in interface `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`
		- #### newCompressor
		
		
		
		```
		public [DeflateCompressor](DeflateCompressor.html "class in akka.http.scaladsl.coding") newCompressor()
		```
		
		Deprecated.
		
		Specified by:
		`[newCompressor](Encoder.html#newCompressor())` in interface `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`
		- #### newDecompressorStage
		
		
		
		```
		public scala.Function0<[DeflateDecompressor](DeflateDecompressor.html "class in akka.http.scaladsl.coding")> newDecompressorStage​(int maxBytesPerChunk)
		```
		
		Deprecated.
		
		Specified by:
		`[newDecompressorStage](StreamDecoder.html#newDecompressorStage(int))` in interface `[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")`
		- #### withLevel
		
		
		
		```
		public [Deflate](Deflate.html "class in akka.http.scaladsl.coding") withLevel​(int level)
		```
		
		Deprecated.
		Use Coders.Deflate(compressionLevel \= ...) instead. Since 10\.2\.0\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate.html)*