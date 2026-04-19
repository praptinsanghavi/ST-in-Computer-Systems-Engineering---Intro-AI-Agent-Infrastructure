---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.coding.StreamDecoder
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:05:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/StreamDecoder.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.coding.StreamDecoder
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.coding.StreamDecoder

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.coding.StreamDecoder

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
- StreamDecoder
t[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[coding](index.html)

# StreamDecoder[**](../../../../akka/http/scaladsl/coding/StreamDecoder.html "Permalink")

### 

#### trait StreamDecoder extends [Decoder](Decoder.html)

Internal API

A decoder that is implemented in terms of a Stage

Self TypeStreamDecoderAnnotations@InternalApi() @deprecated Deprecated*(Since version 10\.2\.0\)* StreamDecoder is internal API and will be moved or removed in the future

Source[Decoder.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/coding/Decoder.scala#L48)Linear Supertypes[Decoder](Decoder.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Deflate](Deflate.html), [Deflate](Deflate$.html), [Gzip](Gzip.html), [Gzip](Gzip$.html), [NoCoding](NoCoding$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StreamDecoder
2. Decoder
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#encoding:akka.http.scaladsl.model.headers.HttpEncoding "Permalink") abstract  def encoding: [HttpEncoding](../model/headers/HttpEncoding.html)Definition Classes[Decoder](Decoder.html)
2. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#newDecompressorStage(maxBytesPerChunk:Int):()=>akka.stream.stage.GraphStage[akka.stream.FlowShape[akka.util.ByteString,akka.util.ByteString]] "Permalink") abstract  def newDecompressorStage(maxBytesPerChunk: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): () \=\> [GraphStage](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/stage/GraphStage.html#akka.stream.stage.GraphStage)\[[FlowShape](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html#akka.stream.FlowShape)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]]Attributesprotected
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StreamDecoder toany2stringadd\[StreamDecoder] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StreamDecoder, B)ImplicitThis member is added by an implicit conversion from StreamDecoder toArrowAssoc\[StreamDecoder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#decode(input:akka.util.ByteString)(implicitmat:akka.stream.Materializer):scala.concurrent.Future[akka.util.ByteString] "Permalink")  def decode(input: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString))(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]Definition Classes[Decoder](Decoder.html)
9. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#decodeData[T](t:T)(implicitmapper:akka.http.scaladsl.coding.DataMapper[T]):T "Permalink")  def decodeData\[T](t: T)(implicit mapper: [DataMapper](DataMapper.html)\[T]): TDefinition Classes[Decoder](Decoder.html)
10. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#decodeMessage(message:akka.http.scaladsl.model.HttpMessage):message.Self "Permalink")  def decodeMessage(message: [HttpMessage](../model/HttpMessage.html)): [Self](../model/HttpMessage.html#Self<:akka.http.scaladsl.model.HttpMessage{typeSelf=HttpMessage.this.Self})Definition Classes[Decoder](Decoder.html)
11. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#decoderFlow:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "Permalink")  def decoderFlow: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Definition ClassesStreamDecoder → [Decoder](Decoder.html)
12. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StreamDecoder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StreamDecoderImplicitThis member is added by an implicit conversion from StreamDecoder toEnsuring\[StreamDecoder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StreamDecoder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StreamDecoderImplicitThis member is added by an implicit conversion from StreamDecoder toEnsuring\[StreamDecoder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StreamDecoderImplicitThis member is added by an implicit conversion from StreamDecoder toEnsuring\[StreamDecoder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StreamDecoderImplicitThis member is added by an implicit conversion from StreamDecoder toEnsuring\[StreamDecoder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#maxBytesPerChunk:Int "Permalink")  def maxBytesPerChunk: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesStreamDecoder → [Decoder](Decoder.html)
22. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#withMaxBytesPerChunk(newMaxBytesPerChunk:Int):akka.http.scaladsl.coding.Decoder "Permalink")  def withMaxBytesPerChunk(newMaxBytesPerChunk: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Decoder](Decoder.html)Definition ClassesStreamDecoder → [Decoder](Decoder.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StreamDecoder toStringFormat\[StreamDecoder] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/coding/StreamDecoder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StreamDecoder, B)ImplicitThis member is added by an implicit conversion from StreamDecoder toArrowAssoc\[StreamDecoder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Decoder](Decoder.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStreamDecoder to any2stringadd\[StreamDecoder]

### Inherited by implicit conversion StringFormat fromStreamDecoder to StringFormat\[StreamDecoder]

### Inherited by implicit conversion Ensuring fromStreamDecoder to Ensuring\[StreamDecoder]

### Inherited by implicit conversion ArrowAssoc fromStreamDecoder to ArrowAssoc\[StreamDecoder]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/stage/GraphStage.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/StreamDecoder.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/StreamDecoder.html)*