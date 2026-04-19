---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
title: akka.http.scaladsl.coding
---

# akka.http.scaladsl.coding

## Content

# Package akka.http.scaladsl.coding

- Interface Summary 
| Interface | Description |
| [Coder](Coder.html "interface in akka.http.scaladsl.coding") | Marker trait for A combined Encoder and Decoder |
| --- | --- |
| [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")\<T\> | An abstraction to transform data bytes of HttpMessages or HttpEntities |
| [Decoder](Decoder.html "interface in akka.http.scaladsl.coding") |  |
| [Encoder](Encoder.html "interface in akka.http.scaladsl.coding") |  |
| [StreamDecoder](StreamDecoder.html "interface in akka.http.scaladsl.coding") | Deprecated. StreamDecoder is internal API and will be moved or removed in the future. |
- Class Summary 
| Class | Description |
| [Coders](Coders.html "class in akka.http.scaladsl.coding") |  |
| --- | --- |
| [Coders$](Coders$.html "class in akka.http.scaladsl.coding") |  |
| [Compressor](Compressor.html "class in akka.http.scaladsl.coding") | Deprecated. Compressor is internal API and will be moved or removed in the future. |
| [DataMapper$](DataMapper$.html "class in akka.http.scaladsl.coding") |  |
| [Decoder$](Decoder$.html "class in akka.http.scaladsl.coding") |  |
| [Deflate](Deflate.html "class in akka.http.scaladsl.coding") | Deprecated. Actual implementation of Deflate is internal API, use Coders.Deflate instead. |
| [Deflate$](Deflate$.html "class in akka.http.scaladsl.coding") | Deprecated. Actual implementation of Deflate is internal API, use Coders.Deflate instead. |
| [DeflateCompressor](DeflateCompressor.html "class in akka.http.scaladsl.coding") | Deprecated. DeflateCompressor is internal API and will be moved or removed in the future. |
| [DeflateCompressor$](DeflateCompressor$.html "class in akka.http.scaladsl.coding") | Internal API |
| [DeflateDecompressor](DeflateDecompressor.html "class in akka.http.scaladsl.coding") | Internal API |
| [DeflateDecompressor$](DeflateDecompressor$.html "class in akka.http.scaladsl.coding") |  |
| [DeflateDecompressorBase](DeflateDecompressorBase.html "class in akka.http.scaladsl.coding") | Internal API |
| [DeflateDecompressorBase$](DeflateDecompressorBase$.html "class in akka.http.scaladsl.coding") |  |
| [Encoder$](Encoder$.html "class in akka.http.scaladsl.coding") |  |
| [Gzip](Gzip.html "class in akka.http.scaladsl.coding") | Deprecated. Actual implementation of Gzip is internal, use Coders.Gzip instead. |
| [Gzip$](Gzip$.html "class in akka.http.scaladsl.coding") | Deprecated. Actual implementation of Gzip is internal API, use Coders.Gzip instead. |
| [GzipCompressor](GzipCompressor.html "class in akka.http.scaladsl.coding") | Internal API |
| [GzipCompressor$](GzipCompressor$.html "class in akka.http.scaladsl.coding") | Internal API |
| [GzipDecompressor](GzipDecompressor.html "class in akka.http.scaladsl.coding") | Internal API |
| [GzipDecompressor$](GzipDecompressor$.html "class in akka.http.scaladsl.coding") | INTERNAL API |
| [NoCoding](NoCoding.html "class in akka.http.scaladsl.coding") | Deprecated. Actual implementation of NoCoding is internal API, use Coders.NoCoding instead. |
| [NoCoding$](NoCoding$.html "class in akka.http.scaladsl.coding") | Deprecated. Actual implementation of NoCoding is internal API, use Coders.NoCoding instead. |
| [NoCodingCompressor](NoCodingCompressor.html "class in akka.http.scaladsl.coding") | Deprecated. NoCodingCompressor is internal API and will be moved or removed in the future. |
| [NoCodingCompressor$](NoCodingCompressor$.html "class in akka.http.scaladsl.coding") | Deprecated. NoCodingCompressor is internal API and will be moved or removed in the future. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coders$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coders.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Compressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Deflate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressorBase$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateDecompressorBase.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Gzip.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/GzipCompressor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/GzipCompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/GzipDecompressor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/GzipDecompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html)*