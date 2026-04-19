---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip$.html
title: Gzip$
---

# Gzip$

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class Gzip$

- java.lang.Object
- - [akka.http.scaladsl.coding.Gzip](Gzip.html "class in akka.http.scaladsl.coding")
	- - akka.http.scaladsl.coding.Gzip$

- All Implemented Interfaces:
`[Coder](Coder.html "interface in akka.http.scaladsl.coding")`, `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`, `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`, `[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")`

---

```
public class Gzip$
extends [Gzip](Gzip.html "class in akka.http.scaladsl.coding")
```

Deprecated.
Actual implementation of Gzip is internal API, use Coders.Gzip instead. Since 10\.2\.0\.

An encoder and decoder for the HTTP 'gzip' encoding.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Gzip$](Gzip$.html "class in akka.http.scaladsl.coding")` | `[MODULE$](#MODULE$)` | Deprecated. Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Gzip$](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Gzip](Gzip.html "class in akka.http.scaladsl.coding")` | `[apply](#apply(scala.Function1))​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)` | Deprecated. |
	
	
		- ### Methods inherited from class akka.http.scaladsl.coding.[Gzip](Gzip.html "class in akka.http.scaladsl.coding")
		
		
		`[decode](Gzip.html#decode(akka.util.ByteString,akka.stream.Materializer)), [decodeData](Gzip.html#decodeData(T,akka.http.scaladsl.coding.DataMapper)), [decodeMessage](Gzip.html#decodeMessage(akka.http.scaladsl.model.HttpMessage)), [decoderFlow](Gzip.html#decoderFlow()), [encode](Gzip.html#encode(akka.util.ByteString)), [encodeAsync](Gzip.html#encodeAsync(akka.util.ByteString,akka.stream.Materializer)), [encodeData](Gzip.html#encodeData(T,akka.http.scaladsl.coding.DataMapper)), [encodeMessage](Gzip.html#encodeMessage(akka.http.scaladsl.model.HttpMessage)), [encoderFlow](Gzip.html#encoderFlow()), [encoding](Gzip.html#encoding()), [maxBytesPerChunk](Gzip.html#maxBytesPerChunk()), [messageFilter](Gzip.html#messageFilter()), [newCompressor](Gzip.html#newCompressor()), [newDecompressorStage](Gzip.html#newDecompressorStage(int)), [newEncodeTransformer](Gzip.html#newEncodeTransformer()), [withLevel](Gzip.html#withLevel(int)), [withMaxBytesPerChunk](Gzip.html#withMaxBytesPerChunk(int))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.coding.[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[decode](Decoder.html#decode(akka.util.ByteString,akka.stream.Materializer)), [decodeData](Decoder.html#decodeData(T,akka.http.scaladsl.coding.DataMapper)), [decodeMessage](Decoder.html#decodeMessage(akka.http.scaladsl.model.HttpMessage))`
		- ### Methods inherited from interface akka.http.scaladsl.coding.[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[encode](Encoder.html#encode(akka.util.ByteString)), [encodeAsync](Encoder.html#encodeAsync(akka.util.ByteString,akka.stream.Materializer)), [encodeData](Encoder.html#encodeData(T,akka.http.scaladsl.coding.DataMapper)), [encodeMessage](Encoder.html#encodeMessage(akka.http.scaladsl.model.HttpMessage)), [encoderFlow](Encoder.html#encoderFlow()), [newEncodeTransformer](Encoder.html#newEncodeTransformer()), [singleUseEncoderFlow](Encoder.html#singleUseEncoderFlow())`
		- ### Methods inherited from interface akka.http.scaladsl.coding.[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[decoderFlow](StreamDecoder.html#decoderFlow()), [maxBytesPerChunk](StreamDecoder.html#maxBytesPerChunk()), [withMaxBytesPerChunk](StreamDecoder.html#withMaxBytesPerChunk(int))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Gzip$](Gzip$.html "class in akka.http.scaladsl.coding") MODULE$
		```
		
		Deprecated.
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Gzip$
		
		
		
		```
		public Gzip$()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Gzip](Gzip.html "class in akka.http.scaladsl.coding") apply​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter)
		```
		
		Deprecated.
		
		Overrides:
		`[apply](Gzip.html#apply(scala.Function1))` in class `[Gzip](Gzip.html "class in akka.http.scaladsl.coding")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip$.html)*