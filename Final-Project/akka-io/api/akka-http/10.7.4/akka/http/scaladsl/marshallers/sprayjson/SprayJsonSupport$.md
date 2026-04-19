---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/index.html "Permalink")  package [sprayjson](index.html)Definition Classes[marshallers](../index.html)
- [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html)
- [SprayJsonEntityStreamingSupport](SprayJsonEntityStreamingSupport$.html "Entity streaming support, implemented using spray-json.")
- [SprayJsonSupport](SprayJsonSupport.html "A trait providing automatic to and from JSON marshalling/unmarshalling using an in-scope *spray-json* protocol.")
[o](SprayJsonSupport.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[marshallers](../index.html).[sprayjson](index.html)

# [SprayJsonSupport](SprayJsonSupport.html "See companion trait")[**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html "Permalink")

### Companion [trait SprayJsonSupport](SprayJsonSupport.html "See companion trait")

#### object SprayJsonSupport extends [SprayJsonSupport](SprayJsonSupport.html)

Source[SprayJsonSupport.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-marshallers-scala/akka-http-spray-json/src/main/scala/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.scala#L71)Linear Supertypes[SprayJsonSupport](SprayJsonSupport.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SprayJsonSupport
2. SprayJsonSupport
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#sprayJsValueByteStringUnmarshaller[T]:akka.http.scaladsl.unmarshalling.FromByteStringUnmarshaller[spray.json.JsValue] "Permalink") implicit  def sprayJsValueByteStringUnmarshaller\[T]: [FromByteStringUnmarshaller](../../unmarshalling/index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T])\[[JsValue](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsValue.html#spray.json.JsValue)]Definition Classes[SprayJsonSupport](SprayJsonSupport.html)
15. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#sprayJsValueMarshaller(implicitprinter:spray.json.JsonPrinter):akka.http.scaladsl.marshalling.ToEntityMarshaller[spray.json.JsValue] "Permalink") implicit  def sprayJsValueMarshaller(implicit printer: [JsonPrinter](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsonPrinter.html#spray.json.JsonPrinter) \= CompactPrinter): [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[JsValue](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsValue.html#spray.json.JsValue)]Definition Classes[SprayJsonSupport](SprayJsonSupport.html)
16. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#sprayJsValueUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[spray.json.JsValue] "Permalink") implicit  def sprayJsValueUnmarshaller: [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[JsValue](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsValue.html#spray.json.JsValue)]Definition Classes[SprayJsonSupport](SprayJsonSupport.html)
17. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#sprayJsonByteStringUnmarshaller[T](implicitreader:spray.json.RootJsonReader[T]):akka.http.scaladsl.unmarshalling.FromByteStringUnmarshaller[T] "Permalink") implicit  def sprayJsonByteStringUnmarshaller\[T](implicit reader: [RootJsonReader](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonReader.html#spray.json.RootJsonReader)\[T]): [FromByteStringUnmarshaller](../../unmarshalling/index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T])\[T]Definition Classes[SprayJsonSupport](SprayJsonSupport.html)
18. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#sprayJsonMarshaller[T](implicitwriter:spray.json.RootJsonWriter[T],implicitprinter:spray.json.JsonPrinter):akka.http.scaladsl.marshalling.ToEntityMarshaller[T] "Permalink") implicit  def sprayJsonMarshaller\[T](implicit writer: [RootJsonWriter](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonWriter.html#spray.json.RootJsonWriter)\[T], printer: [JsonPrinter](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsonPrinter.html#spray.json.JsonPrinter) \= CompactPrinter): [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]Definition Classes[SprayJsonSupport](SprayJsonSupport.html)
19. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#sprayJsonMarshallerConverter[T](writer:spray.json.RootJsonWriter[T])(implicitprinter:spray.json.JsonPrinter):akka.http.scaladsl.marshalling.ToEntityMarshaller[T] "Permalink") implicit  def sprayJsonMarshallerConverter\[T](writer: [RootJsonWriter](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonWriter.html#spray.json.RootJsonWriter)\[T])(implicit printer: [JsonPrinter](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsonPrinter.html#spray.json.JsonPrinter) \= CompactPrinter): [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]Definition Classes[SprayJsonSupport](SprayJsonSupport.html)
20. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#sprayJsonSourceReader[T](implicitreader:spray.json.RootJsonReader[T],implicitsupport:akka.http.scaladsl.common.EntityStreamingSupport):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.stream.scaladsl.Source[T,akka.NotUsed]] "Permalink") implicit  def sprayJsonSourceReader\[T](implicit reader: [RootJsonReader](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonReader.html#spray.json.RootJsonReader)\[T], support: [EntityStreamingSupport](../../common/EntityStreamingSupport.html)): [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[T, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]]Definition Classes[SprayJsonSupport](SprayJsonSupport.html)
21. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#sprayJsonUnmarshaller[T](implicitreader:spray.json.RootJsonReader[T]):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T] "Permalink") implicit  def sprayJsonUnmarshaller\[T](implicit reader: [RootJsonReader](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonReader.html#spray.json.RootJsonReader)\[T]): [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T]Definition Classes[SprayJsonSupport](SprayJsonSupport.html)
22. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#sprayJsonUnmarshallerConverter[T](reader:spray.json.RootJsonReader[T]):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T] "Permalink") implicit  def sprayJsonUnmarshallerConverter\[T](reader: [RootJsonReader](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonReader.html#spray.json.RootJsonReader)\[T]): [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T]Definition Classes[SprayJsonSupport](SprayJsonSupport.html)
23. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [SprayJsonSupport](SprayJsonSupport.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/JsonEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonEntityStreamingSupport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html)*