---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder.html
title: Encoder
---

# Encoder

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Interface Encoder

- All Known Subinterfaces:
`[Coder](Coder.html "interface in akka.http.scaladsl.coding")`

All Known Implementing Classes:
`[Deflate](Deflate.html "class in akka.http.scaladsl.coding")`, `[Deflate$](Deflate$.html "class in akka.http.scaladsl.coding")`, `[Gzip](Gzip.html "class in akka.http.scaladsl.coding")`, `[Gzip$](Gzip$.html "class in akka.http.scaladsl.coding")`, `[NoCoding$](NoCoding$.html "class in akka.http.scaladsl.coding")`

---

```
public interface Encoder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `akka.util.ByteString` | `[encode](#encode(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. synchronous compression with \`encode\` is not supported in the future any more, use \`encodeAsync\` instead. |
	| `scala.concurrent.Future<akka.util.ByteString>` | `[encodeAsync](#encodeAsync(akka.util.ByteString,akka.stream.Materializer))​(akka.util.ByteString input,  akka.stream.Materializer mat)` |  |
	| `<T> T` | `[encodeData](#encodeData(T,akka.http.scaladsl.coding.DataMapper))​(T t,  [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)` |  |
	| `akka.http.scaladsl.coding.Encoder.message` | `[encodeMessage](#encodeMessage(akka.http.scaladsl.model.HttpMessage))​([HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model") message)` |  |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[encoderFlow](#encoderFlow())()` |  |
	| `[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[encoding](#encoding())()` |  |
	| `scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object>` | `[messageFilter](#messageFilter())()` |  |
	| `[Compressor](Compressor.html "class in akka.http.scaladsl.coding")` | `[newCompressor](#newCompressor())()` | Deprecated. newCompressor is internal API. |
	| `akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>` | `[newEncodeTransformer](#newEncodeTransformer())()` | Deprecated. newEncodeTransformer is internal API. |
	| `akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>` | `[singleUseEncoderFlow](#singleUseEncoderFlow())()` |  |

- - ### Method Detail
	
	
	
		- #### encoding
		
		
		
		```
		[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding()
		```
		- #### messageFilter
		
		
		
		```
		scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter()
		```
		- #### encodeMessage
		
		
		
		```
		akka.http.scaladsl.coding.Encoder.message encodeMessage​([HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model") message)
		```
		- #### encodeData
		
		
		
		```
		<T> T encodeData​(T t,
		                 [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapper)
		```
		- #### encoderFlow
		
		
		
		```
		akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> encoderFlow()
		```
		- #### encode
		
		
		
		```
		akka.util.ByteString encode​(akka.util.ByteString input)
		```
		
		Deprecated.
		synchronous compression with \`encode\` is not supported in the future any more, use \`encodeAsync\` instead. Since 10\.2\.0\.
		- #### encodeAsync
		
		
		
		```
		scala.concurrent.Future<akka.util.ByteString> encodeAsync​(akka.util.ByteString input,
		                                                          akka.stream.Materializer mat)
		```
		- #### newCompressor
		
		
		
		```
		[Compressor](Compressor.html "class in akka.http.scaladsl.coding") newCompressor()
		```
		
		Deprecated.
		newCompressor is internal API. Since 10\.2\.0\.
		- #### newEncodeTransformer
		
		
		
		```
		akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>> newEncodeTransformer()
		```
		
		Deprecated.
		newEncodeTransformer is internal API. Since 10\.2\.0\.
		- #### singleUseEncoderFlow
		
		
		
		```
		akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>> singleUseEncoderFlow()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Compressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder.html)*