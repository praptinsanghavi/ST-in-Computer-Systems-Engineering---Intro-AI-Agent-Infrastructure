---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.PredefinedFromStringUnmarshallers
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.PredefinedFromStringUnmarshallers
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.PredefinedFromStringUnmarshallers

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.PredefinedFromStringUnmarshallers

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[unmarshalling](index.html)
- [GenericUnmarshallers](GenericUnmarshallers.html)
- [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
- [MultipartUnmarshallers](MultipartUnmarshallers.html "Provides akka.http.scaladsl.model.Multipart marshallers.")
- [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
- [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
- [Unmarshal](Unmarshal.html)
- [Unmarshaller](Unmarshaller.html)
[o](PredefinedFromStringUnmarshallers.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[unmarshalling](index.html)

# [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "See companion trait")[**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html "Permalink")

### Companion [trait PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "See companion trait")

#### object PredefinedFromStringUnmarshallers extends [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)

Source[PredefinedFromStringUnmarshallers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.scala#L91)Linear Supertypes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PredefinedFromStringUnmarshallers
2. PredefinedFromStringUnmarshallers
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#CsvSeq[T](implicitunmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,T]):akka.http.scaladsl.unmarshalling.Unmarshaller[String,Seq[T]] "Permalink") implicit  def CsvSeq\[T](implicit unmarshaller: [Unmarshaller](Unmarshaller.html)\[String, T]): [Unmarshaller](Unmarshaller.html)\[String, [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
5. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#HexByte:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Byte] "Permalink")  val HexByte: [Unmarshaller](Unmarshaller.html)\[String, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
6. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#HexInt:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Int] "Permalink")  val HexInt: [Unmarshaller](Unmarshaller.html)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
7. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#HexLong:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Long] "Permalink")  val HexLong: [Unmarshaller](Unmarshaller.html)\[String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
8. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#HexShort:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Short] "Permalink")  val HexShort: [Unmarshaller](Unmarshaller.html)\[String, [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
9. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#_fromStringUnmarshallerFromByteStringUnmarshaller[T](implicitbsum:akka.http.scaladsl.unmarshalling.FromByteStringUnmarshaller[T]):akka.http.scaladsl.unmarshalling.Unmarshaller[String,T] "Permalink") implicit  def \_fromStringUnmarshallerFromByteStringUnmarshaller\[T](implicit bsum: [FromByteStringUnmarshaller](index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T])\[T]): [Unmarshaller](Unmarshaller.html)\[String, T]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
10. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#booleanFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Boolean] "Permalink") implicit  val booleanFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
12. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#byteFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Byte] "Permalink") implicit  val byteFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
13. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#doubleFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Double] "Permalink") implicit  val doubleFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
15. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#floatFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Float] "Permalink") implicit  val floatFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
18. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#intFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Int] "Permalink") implicit  val intFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
21. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#longFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Long] "Permalink") implicit  val longFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
23. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#shortFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Short] "Permalink") implicit  val shortFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
27. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#uuidFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,java.util.UUID] "Permalink") implicit  val uuidFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
30. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshal$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshal.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html)*