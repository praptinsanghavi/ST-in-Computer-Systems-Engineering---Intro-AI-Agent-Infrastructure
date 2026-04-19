---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.coding
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:04:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.coding
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.coding

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.coding

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](../client/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/coding/index.html "Permalink")  package codingDefinition Classes[scaladsl](../index.html)
- [Coder](Coder.html "Marker trait for A combined Encoder and Decoder")
- [Coders](Coders$.html)
- [Compressor](Compressor.html "A stateful object representing ongoing compression.")
- [DataMapper](DataMapper.html "An abstraction to transform data bytes of HttpMessages or HttpEntities")
- [Decoder](Decoder.html)
- [Deflate](Deflate.html)
- [DeflateCompressor](DeflateCompressor.html "Internal API")
- [Encoder](Encoder.html)
- [Gzip](Gzip.html)
- [NoCoding](NoCoding$.html "An encoder and decoder for the HTTP 'identity' encoding.")
- [NoCodingCompressor](NoCodingCompressor$.html "Internal API")
- [StreamDecoder](StreamDecoder.html "Internal API")
- [**](../../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](../common/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[scaladsl](../index.html)
p[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html)

# coding[**](../../../../akka/http/scaladsl/coding/index.html "Permalink")

#### package coding

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/coding/Coder.html "Permalink")  trait [Coder](Coder.html "Marker trait for A combined Encoder and Decoder") extends [Encoder](Encoder.html) with [Decoder](Decoder.html)Marker trait for A combined Encoder and Decoder
2. [**](../../../../akka/http/scaladsl/coding/DataMapper.html "Permalink") sealed  trait [DataMapper](DataMapper.html "An abstraction to transform data bytes of HttpMessages or HttpEntities")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An abstraction to transform data bytes of HttpMessages or HttpEntities
3. [**](../../../../akka/http/scaladsl/coding/Decoder.html "Permalink")  trait [Decoder](Decoder.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../akka/http/scaladsl/coding/Encoder.html "Permalink")  trait [Encoder](Encoder.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Deprecated Type Members

1. [**](../../../../akka/http/scaladsl/coding/Compressor.html "Permalink") abstract  class [Compressor](Compressor.html "A stateful object representing ongoing compression.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A stateful object representing ongoing compression.

A stateful object representing ongoing compression.

Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* Compressor is internal API and will be moved or removed in the future.
2. [**](../../../../akka/http/scaladsl/coding/Deflate.html "Permalink")  class [Deflate](Deflate.html) extends [Coder](Coder.html) with [StreamDecoder](StreamDecoder.html)Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* Actual implementation of Deflate is internal API, use Coders.Deflate instead
3. [**](../../../../akka/http/scaladsl/coding/DeflateCompressor.html "Permalink")  class [DeflateCompressor](DeflateCompressor.html "Internal API") extends [Compressor](Compressor.html)Internal API

Internal API

Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* DeflateCompressor is internal API and will be moved or removed in the future
4. [**](../../../../akka/http/scaladsl/coding/Gzip.html "Permalink")  class [Gzip](Gzip.html) extends [Coder](Coder.html) with [StreamDecoder](StreamDecoder.html)Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* Actual implementation of Gzip is internal, use Coders.Gzip instead
5. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html "Permalink")  trait [StreamDecoder](StreamDecoder.html "Internal API") extends [Decoder](Decoder.html)Internal API

Internal API

A decoder that is implemented in terms of a Stage

Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* StreamDecoder is internal API and will be moved or removed in the future
### Value Members

1. [**](../../../../akka/http/scaladsl/coding/Coders$.html "Permalink")  object [Coders](Coders$.html)Annotations@nowarn()
2. [**](../../../../akka/http/scaladsl/coding/DataMapper$.html "Permalink")  object [DataMapper](DataMapper$.html)
3. [**](../../../../akka/http/scaladsl/coding/Decoder$.html "Permalink")  object [Decoder](Decoder$.html)
4. [**](../../../../akka/http/scaladsl/coding/Encoder$.html "Permalink")  object [Encoder](Encoder$.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/coding/Deflate$.html "Permalink")  object [Deflate](Deflate$.html) extends [Deflate](Deflate.html)Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* Actual implementation of Deflate is internal API, use Coders.Deflate instead
2. [**](../../../../akka/http/scaladsl/coding/Gzip$.html "Permalink")  object [Gzip](Gzip$.html "An encoder and decoder for the HTTP 'gzip' encoding.") extends [Gzip](Gzip.html)An encoder and decoder for the HTTP 'gzip' encoding.

An encoder and decoder for the HTTP 'gzip' encoding.

Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* Actual implementation of Gzip is internal API, use Coders.Gzip instead
3. [**](../../../../akka/http/scaladsl/coding/NoCoding$.html "Permalink")  object [NoCoding](NoCoding$.html "An encoder and decoder for the HTTP 'identity' encoding.") extends [Coder](Coder.html) with [StreamDecoder](StreamDecoder.html)An encoder and decoder for the HTTP 'identity' encoding.

An encoder and decoder for the HTTP 'identity' encoding.

Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* Actual implementation of NoCoding is internal API, use Coders.NoCoding instead
4. [**](../../../../akka/http/scaladsl/coding/NoCodingCompressor$.html "Permalink")  object [NoCodingCompressor](NoCodingCompressor$.html "Internal API") extends [Compressor](Compressor.html)Internal API

Internal API

Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* NoCodingCompressor is internal API and will be moved or removed in the future
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Coders$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Compressor.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/DataMapper$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/DataMapper.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Decoder$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Deflate$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Deflate.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/DeflateCompressor.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Encoder$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Gzip$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Gzip.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/NoCoding$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/NoCodingCompressor$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/StreamDecoder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/index.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/index.html)*