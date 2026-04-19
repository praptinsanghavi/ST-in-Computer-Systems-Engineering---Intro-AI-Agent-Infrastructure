---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
title: Coder
---

# Coder

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Interface Coder

- All Superinterfaces:
`[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")`, `[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")`

All Known Implementing Classes:
`[Deflate](Deflate.html "class in akka.http.scaladsl.coding")`, `[Deflate$](Deflate$.html "class in akka.http.scaladsl.coding")`, `[Gzip](Gzip.html "class in akka.http.scaladsl.coding")`, `[Gzip$](Gzip$.html "class in akka.http.scaladsl.coding")`, `[NoCoding$](NoCoding$.html "class in akka.http.scaladsl.coding")`

---

```
public interface Coder
extends [Encoder](Encoder.html "interface in akka.http.scaladsl.coding"), [Decoder](Decoder.html "interface in akka.http.scaladsl.coding")
```

Marker trait for A combined Encoder and Decoder

- - ### Method Summary
	
	
		- ### Methods inherited from interface akka.http.scaladsl.coding.[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[decode](Decoder.html#decode(akka.util.ByteString,akka.stream.Materializer)), [decodeData](Decoder.html#decodeData(T,akka.http.scaladsl.coding.DataMapper)), [decodeMessage](Decoder.html#decodeMessage(akka.http.scaladsl.model.HttpMessage)), [decoderFlow](Decoder.html#decoderFlow()), [encoding](Decoder.html#encoding()), [maxBytesPerChunk](Decoder.html#maxBytesPerChunk()), [withMaxBytesPerChunk](Decoder.html#withMaxBytesPerChunk(int))`
		- ### Methods inherited from interface akka.http.scaladsl.coding.[Encoder](Encoder.html "interface in akka.http.scaladsl.coding")
		
		
		`[encode](Encoder.html#encode(akka.util.ByteString)), [encodeAsync](Encoder.html#encodeAsync(akka.util.ByteString,akka.stream.Materializer)), [encodeData](Encoder.html#encodeData(T,akka.http.scaladsl.coding.DataMapper)), [encodeMessage](Encoder.html#encodeMessage(akka.http.scaladsl.model.HttpMessage)), [encoderFlow](Encoder.html#encoderFlow()), [encoding](Encoder.html#encoding()), [messageFilter](Encoder.html#messageFilter()), [newCompressor](Encoder.html#newCompressor()), [newEncodeTransformer](Encoder.html#newEncodeTransformer()), [singleUseEncoderFlow](Encoder.html#singleUseEncoderFlow())`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html)*