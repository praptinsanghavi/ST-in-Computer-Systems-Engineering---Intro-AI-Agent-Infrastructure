---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
title: Decoder
---

# Decoder

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Interface Decoder

- All Known Subinterfaces:
`[Coder](Coder.html "interface in akka.http.scaladsl.coding")`, `[StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding")`

All Known Implementing Classes:
`[Deflate](Deflate.html "class in akka.http.scaladsl.coding")`, `[Deflate$](Deflate$.html "class in akka.http.scaladsl.coding")`, `[Gzip](Gzip.html "class in akka.http.scaladsl.coding")`, `[Gzip$](Gzip$.html "class in akka.http.scaladsl.coding")`, `[NoCoding$](NoCoding$.html "class in akka.http.scaladsl.coding")`

---

```
public interface Decoder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<akka.util.ByteString>` | `[decode](#decode(akka.util.ByteString,akka.stream.Materializer))​(akka.util.ByteString input,  akka.stream.Materializer mat)` |  |
	| `<T> T` | `[decodeData](#decodeData(T,akka.http.scaladsl.coding.DataMapper))​(T t,  [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)` |  |
	| `akka.http.scaladsl.coding.Decoder.message` | `[decodeMessage](#decodeMessage(akka.http.scaladsl.model.HttpMessage))​([HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model") message)` |  |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[decoderFlow](#decoderFlow())()` |  |
	| `[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[encoding](#encoding())()` |  |
	| `int` | `[maxBytesPerChunk](#maxBytesPerChunk())()` |  |
	| `[Decoder](Decoder.html "interface in akka.http.scaladsl.coding")` | `[withMaxBytesPerChunk](#withMaxBytesPerChunk(int))​(int maxBytesPerChunk)` |  |

- - ### Method Detail
	
	
	
		- #### encoding
		
		
		
		```
		[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding()
		```
		- #### decodeMessage
		
		
		
		```
		akka.http.scaladsl.coding.Decoder.message decodeMessage​([HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model") message)
		```
		- #### decodeData
		
		
		
		```
		<T> T decodeData​(T t,
		                 [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)
		```
		- #### maxBytesPerChunk
		
		
		
		```
		int maxBytesPerChunk()
		```
		- #### withMaxBytesPerChunk
		
		
		
		```
		[Decoder](Decoder.html "interface in akka.http.scaladsl.coding") withMaxBytesPerChunk​(int maxBytesPerChunk)
		```
		- #### decoderFlow
		
		
		
		```
		akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> decoderFlow()
		```
		- #### decode
		
		
		
		```
		scala.concurrent.Future<akka.util.ByteString> decode​(akka.util.ByteString input,
		                                                     akka.stream.Materializer mat)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html)*