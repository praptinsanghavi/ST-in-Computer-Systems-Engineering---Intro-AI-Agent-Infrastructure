---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.coding.Gzip
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:45:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Gzip$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.coding.Gzip
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.coding.Gzip

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.coding.Gzip

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](index.html)Definition Classes[scaladsl](../index.html)
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
[o](Gzip.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[coding](index.html)

# [Gzip](Gzip.html "See companion class")[**](../../../../akka/http/scaladsl/coding/Gzip$.html "Permalink")

### Companion [class Gzip](Gzip.html "See companion class")

#### object Gzip extends [Gzip](Gzip.html)

An encoder and decoder for the HTTP 'gzip' encoding.

Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* Actual implementation of Gzip is internal API, use Coders.Gzip instead

Source[Gzip.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/coding/Gzip.scala#L31)Linear Supertypes[Gzip](Gzip.html), [StreamDecoder](StreamDecoder.html), [Coder](Coder.html), [Decoder](Decoder.html), [Encoder](Encoder.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Gzip
2. Gzip
3. StreamDecoder
4. Coder
5. Decoder
6. Encoder
7. AnyRef
8. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/coding/Gzip$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#apply(messageFilter:akka.http.scaladsl.model.HttpMessage=>Boolean):akka.http.scaladsl.coding.Gzip "Permalink")  def apply(messageFilter: ([HttpMessage](../model/HttpMessage.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Gzip](Gzip.html)
5. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#decode(input:akka.util.ByteString)(implicitmat:akka.stream.Materializer):scala.concurrent.Future[akka.util.ByteString] "Permalink")  def decode(input: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString))(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]Definition Classes[Decoder](Decoder.html)
8. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#decodeData[T](t:T)(implicitmapper:akka.http.scaladsl.coding.DataMapper[T]):T "Permalink")  def decodeData\[T](t: T)(implicit mapper: [DataMapper](DataMapper.html)\[T]): TDefinition Classes[Decoder](Decoder.html)
9. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#decodeMessage(message:akka.http.scaladsl.model.HttpMessage):message.Self "Permalink")  def decodeMessage(message: [HttpMessage](../model/HttpMessage.html)): [Self](../model/HttpMessage.html#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Definition Classes[Decoder](Decoder.html)
10. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#decoderFlow:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "Permalink")  def decoderFlow: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Definition Classes[StreamDecoder](StreamDecoder.html) → [Decoder](Decoder.html)
11. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#encodeAsync(input:akka.util.ByteString)(implicitmat:akka.stream.Materializer):scala.concurrent.Future[akka.util.ByteString] "Permalink")  def encodeAsync(input: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString))(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]Definition Classes[Encoder](Encoder.html)
12. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#encodeData[T](t:T)(implicitmapper:akka.http.scaladsl.coding.DataMapper[T]):T "Permalink")  def encodeData\[T](t: T)(implicit mapper: [DataMapper](DataMapper.html)\[T]): TDefinition Classes[Encoder](Encoder.html)
13. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#encodeMessage(message:akka.http.scaladsl.model.HttpMessage):message.Self "Permalink")  def encodeMessage(message: [HttpMessage](../model/HttpMessage.html)): [Self](../model/HttpMessage.html#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Definition Classes[Encoder](Encoder.html)
14. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#encoderFlow:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "Permalink")  def encoderFlow: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Definition Classes[Encoder](Encoder.html)
15. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#encoding:akka.http.scaladsl.model.headers.HttpEncoding "Permalink")  val encoding: [HttpEncoding](../model/headers/HttpEncoding.html)Definition Classes[Gzip](Gzip.html) → [Decoder](Decoder.html) → [Encoder](Encoder.html)
16. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#maxBytesPerChunk:Int "Permalink")  def maxBytesPerChunk: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[StreamDecoder](StreamDecoder.html) → [Decoder](Decoder.html)
22. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#messageFilter:akka.http.scaladsl.model.HttpMessage=>Boolean "Permalink")  val messageFilter: ([HttpMessage](../model/HttpMessage.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Gzip](Gzip.html) → [Encoder](Encoder.html)
23. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#newCompressor:akka.http.scaladsl.coding.GzipCompressor "Permalink")  def newCompressor: GzipCompressorDefinition Classes[Gzip](Gzip.html) → [Encoder](Encoder.html)
25. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#newDecompressorStage(maxBytesPerChunk:Int):()=>akka.http.scaladsl.coding.GzipDecompressor "Permalink")  def newDecompressorStage(maxBytesPerChunk: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): () \=\> GzipDecompressorDefinition Classes[Gzip](Gzip.html) → [StreamDecoder](StreamDecoder.html)
26. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#withMaxBytesPerChunk(newMaxBytesPerChunk:Int):akka.http.scaladsl.coding.Decoder "Permalink")  def withMaxBytesPerChunk(newMaxBytesPerChunk: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Decoder](Decoder.html)Definition Classes[StreamDecoder](StreamDecoder.html) → [Decoder](Decoder.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#encode(input:akka.util.ByteString):akka.util.ByteString "Permalink")  def encode(input: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)Definition Classes[Encoder](Encoder.html)Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* synchronous compression with `encode` is not supported in the future any more, use `encodeAsync` instead
2. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#newEncodeTransformer():akka.stream.stage.GraphStage[akka.stream.FlowShape[akka.util.ByteString,akka.util.ByteString]] "Permalink")  def newEncodeTransformer(): [GraphStage](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/stage/GraphStage.html#akka.stream.stage.GraphStage)\[[FlowShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html#akka.stream.FlowShape)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]]Definition Classes[Encoder](Encoder.html)Annotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* newEncodeTransformer is internal API
4. [**](../../../../akka/http/scaladsl/coding/Gzip$.html#withLevel(level:Int):akka.http.scaladsl.coding.Gzip "Permalink")  def withLevel(level: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Gzip](Gzip.html)Definition Classes[Gzip](Gzip.html)Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use Coders.Gzip(compressionLevel \= ...) instead
### Inherited from [Gzip](Gzip.html)

### Inherited from [StreamDecoder](StreamDecoder.html)

### Inherited from [Coder](Coder.html)

### Inherited from [Decoder](Decoder.html)

### Inherited from [Encoder](Encoder.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/stage/GraphStage.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Coders$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Compressor.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/DataMapper$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/DataMapper.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Decoder$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Decoder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Deflate$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Deflate.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Encoder$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Encoder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Gzip$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Gzip.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/NoCoding$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/NoCodingCompressor$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Gzip$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/Gzip$.html)*