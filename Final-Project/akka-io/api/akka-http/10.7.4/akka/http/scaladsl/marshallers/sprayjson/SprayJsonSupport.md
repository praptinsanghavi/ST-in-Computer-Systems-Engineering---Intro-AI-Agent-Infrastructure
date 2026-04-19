---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:06:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html
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
- SprayJsonSupport
[t](SprayJsonSupport$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[marshallers](../index.html).[sprayjson](index.html)

# [SprayJsonSupport](SprayJsonSupport$.html "See companion object")[**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html "Permalink")

### Companion [object SprayJsonSupport](SprayJsonSupport$.html "See companion object")

#### trait SprayJsonSupport extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A trait providing automatic to and from JSON marshalling/unmarshalling using an in\-scope \*spray\-json\* protocol.

Source[SprayJsonSupport.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-marshallers-scala/akka-http-spray-json/src/main/scala/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.scala#L26)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[SprayJsonSupport](SprayJsonSupport$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SprayJsonSupport
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SprayJsonSupport toany2stringadd\[SprayJsonSupport] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SprayJsonSupport, B)ImplicitThis member is added by an implicit conversion from SprayJsonSupport toArrowAssoc\[SprayJsonSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SprayJsonSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SprayJsonSupportImplicitThis member is added by an implicit conversion from SprayJsonSupport toEnsuring\[SprayJsonSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SprayJsonSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SprayJsonSupportImplicitThis member is added by an implicit conversion from SprayJsonSupport toEnsuring\[SprayJsonSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SprayJsonSupportImplicitThis member is added by an implicit conversion from SprayJsonSupport toEnsuring\[SprayJsonSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SprayJsonSupportImplicitThis member is added by an implicit conversion from SprayJsonSupport toEnsuring\[SprayJsonSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#sprayJsValueByteStringUnmarshaller[T]:akka.http.scaladsl.unmarshalling.FromByteStringUnmarshaller[spray.json.JsValue] "Permalink") implicit  def sprayJsValueByteStringUnmarshaller\[T]: [FromByteStringUnmarshaller](../../unmarshalling/index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T])\[[JsValue](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsValue.html#spray.json.JsValue)]
21. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#sprayJsValueMarshaller(implicitprinter:spray.json.JsonPrinter):akka.http.scaladsl.marshalling.ToEntityMarshaller[spray.json.JsValue] "Permalink") implicit  def sprayJsValueMarshaller(implicit printer: [JsonPrinter](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsonPrinter.html#spray.json.JsonPrinter) \= CompactPrinter): [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[JsValue](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsValue.html#spray.json.JsValue)]
22. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#sprayJsValueUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[spray.json.JsValue] "Permalink") implicit  def sprayJsValueUnmarshaller: [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[JsValue](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsValue.html#spray.json.JsValue)]
23. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#sprayJsonByteStringUnmarshaller[T](implicitreader:spray.json.RootJsonReader[T]):akka.http.scaladsl.unmarshalling.FromByteStringUnmarshaller[T] "Permalink") implicit  def sprayJsonByteStringUnmarshaller\[T](implicit reader: [RootJsonReader](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonReader.html#spray.json.RootJsonReader)\[T]): [FromByteStringUnmarshaller](../../unmarshalling/index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T])\[T]
24. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#sprayJsonMarshaller[T](implicitwriter:spray.json.RootJsonWriter[T],implicitprinter:spray.json.JsonPrinter):akka.http.scaladsl.marshalling.ToEntityMarshaller[T] "Permalink") implicit  def sprayJsonMarshaller\[T](implicit writer: [RootJsonWriter](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonWriter.html#spray.json.RootJsonWriter)\[T], printer: [JsonPrinter](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsonPrinter.html#spray.json.JsonPrinter) \= CompactPrinter): [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]
25. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#sprayJsonMarshallerConverter[T](writer:spray.json.RootJsonWriter[T])(implicitprinter:spray.json.JsonPrinter):akka.http.scaladsl.marshalling.ToEntityMarshaller[T] "Permalink") implicit  def sprayJsonMarshallerConverter\[T](writer: [RootJsonWriter](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonWriter.html#spray.json.RootJsonWriter)\[T])(implicit printer: [JsonPrinter](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/JsonPrinter.html#spray.json.JsonPrinter) \= CompactPrinter): [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]
26. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#sprayJsonSourceReader[T](implicitreader:spray.json.RootJsonReader[T],implicitsupport:akka.http.scaladsl.common.EntityStreamingSupport):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.stream.scaladsl.Source[T,akka.NotUsed]] "Permalink") implicit  def sprayJsonSourceReader\[T](implicit reader: [RootJsonReader](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonReader.html#spray.json.RootJsonReader)\[T], support: [EntityStreamingSupport](../../common/EntityStreamingSupport.html)): [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[T, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]]
27. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#sprayJsonUnmarshaller[T](implicitreader:spray.json.RootJsonReader[T]):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T] "Permalink") implicit  def sprayJsonUnmarshaller\[T](implicit reader: [RootJsonReader](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonReader.html#spray.json.RootJsonReader)\[T]): [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T]
28. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#sprayJsonUnmarshallerConverter[T](reader:spray.json.RootJsonReader[T]):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T] "Permalink") implicit  def sprayJsonUnmarshallerConverter\[T](reader: [RootJsonReader](https://javadoc.io/page/io.spray/spray-json_2.13/1.3.6/spray/json/RootJsonReader.html#spray.json.RootJsonReader)\[T]): [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T]
29. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SprayJsonSupport toStringFormat\[SprayJsonSupport] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SprayJsonSupport, B)ImplicitThis member is added by an implicit conversion from SprayJsonSupport toArrowAssoc\[SprayJsonSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSprayJsonSupport to any2stringadd\[SprayJsonSupport]

### Inherited by implicit conversion StringFormat fromSprayJsonSupport to StringFormat\[SprayJsonSupport]

### Inherited by implicit conversion Ensuring fromSprayJsonSupport to Ensuring\[SprayJsonSupport]

### Inherited by implicit conversion ArrowAssoc fromSprayJsonSupport to ArrowAssoc\[SprayJsonSupport]

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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html)*