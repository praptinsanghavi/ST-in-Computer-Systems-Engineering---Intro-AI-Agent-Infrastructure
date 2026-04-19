---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip.html
title: Gzip
---

# Gzip

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class Gzip

- java.lang.Object
- - akka.http.scaladsl.coding.Gzip

- All Implemented Interfaces:
`[Coder](Coder.html "interface in akka.http.scaladsl.coding")`, `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`, `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`, `[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")`

Direct Known Subclasses:
`[Gzip$](Gzip$.html "class in akka.http.scaladsl.coding")`

---

```
public class Gzip
extends java.lang.Object
implements [Coder](Coder.html "interface in akka.http.scaladsl.coding"), [StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")
```

Deprecated.
Actual implementation of Gzip is internal, use Coders.Gzip instead. Since 10\.2\.0\.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Gzip](#%3Cinit%3E(int,scala.Function1))​(int compressionLevel,  scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)` | Deprecated. |
	| `[Gzip](#%3Cinit%3E(scala.Function1))​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [Gzip](Gzip.html "class in akka.http.scaladsl.coding")` | `[apply](#apply(scala.Function1))​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)` | Deprecated. |
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
	| `[GzipCompressor](GzipCompressor.html "class in akka.http.scaladsl.coding")` | `[newCompressor](#newCompressor())()` | Deprecated. |
	| `scala.Function0<[GzipDecompressor](GzipDecompressor.html "class in akka.http.scaladsl.coding")>` | `[newDecompressorStage](#newDecompressorStage(int))​(int maxBytesPerChunk)` | Deprecated. |
	| `static akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>` | `[newEncodeTransformer](#newEncodeTransformer())()` | Deprecated. |
	| `[Gzip](Gzip.html "class in akka.http.scaladsl.coding")` | `[withLevel](#withLevel(int))​(int level)` | Deprecated. Use Coders.Gzip(compressionLevel \= ...) instead. |
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
	
	
	
		- #### Gzip
		
		
		
		```
		public Gzip​(int compressionLevel,
		            scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)
		```
		
		Deprecated.
		- #### Gzip
		
		
		
		```
		public Gzip​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Gzip](Gzip.html "class in akka.http.scaladsl.coding") apply​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)
		```
		
		Deprecated.
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
		public [GzipCompressor](GzipCompressor.html "class in akka.http.scaladsl.coding") newCompressor()
		```
		
		Deprecated.
		
		Specified by:
		`[newCompressor](Encoder.html#newCompressor())` in interface `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`
		- #### newDecompressorStage
		
		
		
		```
		public scala.Function0<[GzipDecompressor](GzipDecompressor.html "class in akka.http.scaladsl.coding")> newDecompressorStage​(int maxBytesPerChunk)
		```
		
		Deprecated.
		
		Specified by:
		`[newDecompressorStage](StreamDecoder.html#newDecompressorStage(int))` in interface `[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")`
		- #### withLevel
		
		
		
		```
		public [Gzip](Gzip.html "class in akka.http.scaladsl.coding") withLevel​(int level)
		```
		
		Deprecated.
		Use Coders.Gzip(compressionLevel \= ...) instead. Since 10\.2\.0\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/GzipCompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/GzipDecompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip.html)*