---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate$.html
title: Deflate$
---

# Deflate$

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class Deflate$

- java.lang.Object
- - [akka.http.scaladsl.coding.Deflate](Deflate.html "class in akka.http.scaladsl.coding")
	- - akka.http.scaladsl.coding.Deflate$

- All Implemented Interfaces:
`[Coder](Coder.html "interface in akka.http.scaladsl.coding")`, `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`, `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`, `[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")`

---

```
public class Deflate$
extends [Deflate](Deflate.html "class in akka.http.scaladsl.coding")
```

Deprecated.
Actual implementation of Deflate is internal API, use Coders.Deflate instead. Since 10\.2\.0\.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Deflate$](Deflate$.html "class in akka.http.scaladsl.coding")` | `[MODULE$](#MODULE$)` | Deprecated. Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Deflate$](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.http.scaladsl.coding.[Deflate](Deflate.html "class in akka.http.scaladsl.coding")
		
		
		`[decode](Deflate.html#decode(akka.util.ByteString,akka.stream.Materializer)), [decodeData](Deflate.html#decodeData(T,akka.http.scaladsl.coding.DataMapper)), [decodeMessage](Deflate.html#decodeMessage(akka.http.scaladsl.model.HttpMessage)), [decoderFlow](Deflate.html#decoderFlow()), [encode](Deflate.html#encode(akka.util.ByteString)), [encodeAsync](Deflate.html#encodeAsync(akka.util.ByteString,akka.stream.Materializer)), [encodeData](Deflate.html#encodeData(T,akka.http.scaladsl.coding.DataMapper)), [encodeMessage](Deflate.html#encodeMessage(akka.http.scaladsl.model.HttpMessage)), [encoderFlow](Deflate.html#encoderFlow()), [encoding](Deflate.html#encoding()), [maxBytesPerChunk](Deflate.html#maxBytesPerChunk()), [messageFilter](Deflate.html#messageFilter()), [newCompressor](Deflate.html#newCompressor()), [newDecompressorStage](Deflate.html#newDecompressorStage(int)), [newEncodeTransformer](Deflate.html#newEncodeTransformer()), [withLevel](Deflate.html#withLevel(int)), [withMaxBytesPerChunk](Deflate.html#withMaxBytesPerChunk(int))`
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
		public static final [Deflate$](Deflate$.html "class in akka.http.scaladsl.coding") MODULE$
		```
		
		Deprecated.
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Deflate$
		
		
		
		```
		public Deflate$()
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate$.html)*