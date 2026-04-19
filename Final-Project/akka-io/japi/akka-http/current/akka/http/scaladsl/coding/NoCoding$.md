---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding$.html
title: NoCoding$
---

# NoCoding$

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class NoCoding$

- java.lang.Object
- - akka.http.scaladsl.coding.NoCoding$

- All Implemented Interfaces:
`[Coder](Coder.html "interface in akka.http.scaladsl.coding")`, `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`, `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`, `[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")`

---

```
public class NoCoding$
extends java.lang.Object
implements [Coder](Coder.html "interface in akka.http.scaladsl.coding"), [StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")
```

Deprecated.
Actual implementation of NoCoding is internal API, use Coders.NoCoding instead. Since 10\.2\.0\.

An encoder and decoder for the HTTP 'identity' encoding.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoCoding$](NoCoding$.html "class in akka.http.scaladsl.coding")` | `[MODULE$](#MODULE$)` | Deprecated. Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoCoding$](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<T> T` | `[decodeData](#decodeData(T,akka.http.scaladsl.coding.DataMapper))​(T t,  [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)` | Deprecated. |
	| `<T> T` | `[encodeData](#encodeData(T,akka.http.scaladsl.coding.DataMapper))​(T t,  [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)` | Deprecated. |
	| `[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[encoding](#encoding())()` | Deprecated. |
	| `scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object>` | `[messageFilter](#messageFilter())()` | Deprecated. |
	| `[NoCodingCompressor$](NoCodingCompressor$.html "class in akka.http.scaladsl.coding")` | `[newCompressor](#newCompressor())()` | Deprecated. |
	| `scala.Function0<akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>>` | `[newDecompressorStage](#newDecompressorStage(int))​(int maxBytesPerChunk)` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.coding.[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[decode](Decoder.html#decode(akka.util.ByteString,akka.stream.Materializer)), [decodeMessage](Decoder.html#decodeMessage(akka.http.scaladsl.model.HttpMessage))`
		- ### Methods inherited from interface akka.http.scaladsl.coding.[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[encode](Encoder.html#encode(akka.util.ByteString)), [encodeAsync](Encoder.html#encodeAsync(akka.util.ByteString,akka.stream.Materializer)), [encodeMessage](Encoder.html#encodeMessage(akka.http.scaladsl.model.HttpMessage)), [encoderFlow](Encoder.html#encoderFlow()), [newEncodeTransformer](Encoder.html#newEncodeTransformer()), [singleUseEncoderFlow](Encoder.html#singleUseEncoderFlow())`
		- ### Methods inherited from interface akka.http.scaladsl.coding.[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[decoderFlow](StreamDecoder.html#decoderFlow()), [maxBytesPerChunk](StreamDecoder.html#maxBytesPerChunk()), [withMaxBytesPerChunk](StreamDecoder.html#withMaxBytesPerChunk(int))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoCoding$](NoCoding$.html "class in akka.http.scaladsl.coding") MODULE$
		```
		
		Deprecated.
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoCoding$
		
		
		
		```
		public NoCoding$()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### encoding
		
		
		
		```
		public [HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding()
		```
		
		Deprecated.
		
		Specified by:
		`[encoding](Decoder.html#encoding())` in interface `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`
		Specified by:
		`[encoding](Encoder.html#encoding())` in interface `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`
		- #### encodeData
		
		
		
		```
		public <T> T encodeData​(T t,
		                        [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)
		```
		
		Deprecated.
		
		Specified by:
		`[encodeData](Encoder.html#encodeData(T,akka.http.scaladsl.coding.DataMapper))` in interface `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`
		- #### decodeData
		
		
		
		```
		public <T> T decodeData​(T t,
		                        [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)
		```
		
		Deprecated.
		
		Specified by:
		`[decodeData](Decoder.html#decodeData(T,akka.http.scaladsl.coding.DataMapper))` in interface `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`
		- #### messageFilter
		
		
		
		```
		public scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter()
		```
		
		Deprecated.
		
		Specified by:
		`[messageFilter](Encoder.html#messageFilter())` in interface `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`
		- #### newCompressor
		
		
		
		```
		public [NoCodingCompressor$](NoCodingCompressor$.html "class in akka.http.scaladsl.coding") newCompressor()
		```
		
		Deprecated.
		
		Specified by:
		`[newCompressor](Encoder.html#newCompressor())` in interface `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`
		- #### newDecompressorStage
		
		
		
		```
		public scala.Function0<akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>> newDecompressorStage​(int maxBytesPerChunk)
		```
		
		Deprecated.
		
		Specified by:
		`[newDecompressorStage](StreamDecoder.html#newDecompressorStage(int))` in interface `[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding$.html)*