---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.PredefinedFromStringUnmarshallers
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
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
- PredefinedFromStringUnmarshallers
- [Unmarshal](Unmarshal.html)
- [Unmarshaller](Unmarshaller.html)
[t](PredefinedFromStringUnmarshallers$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[unmarshalling](index.html)

# [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers$.html "See companion object")[**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "Permalink")

### Companion [object PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers$.html "See companion object")

#### trait PredefinedFromStringUnmarshallers extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[PredefinedFromStringUnmarshallers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.scala#L13)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers$.html), [Unmarshaller](Unmarshaller$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PredefinedFromStringUnmarshallers
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

1. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PredefinedFromStringUnmarshallers toany2stringadd\[PredefinedFromStringUnmarshallers] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PredefinedFromStringUnmarshallers, B)ImplicitThis member is added by an implicit conversion from PredefinedFromStringUnmarshallers toArrowAssoc\[PredefinedFromStringUnmarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#CsvSeq[T](implicitunmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,T]):akka.http.scaladsl.unmarshalling.Unmarshaller[String,Seq[T]] "Permalink") implicit  def CsvSeq\[T](implicit unmarshaller: [Unmarshaller](Unmarshaller.html)\[String, T]): [Unmarshaller](Unmarshaller.html)\[String, [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]]
7. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#HexByte:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Byte] "Permalink")  val HexByte: [Unmarshaller](Unmarshaller.html)\[String, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]
8. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#HexInt:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Int] "Permalink")  val HexInt: [Unmarshaller](Unmarshaller.html)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
9. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#HexLong:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Long] "Permalink")  val HexLong: [Unmarshaller](Unmarshaller.html)\[String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]
10. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#HexShort:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Short] "Permalink")  val HexShort: [Unmarshaller](Unmarshaller.html)\[String, [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)]
11. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#_fromStringUnmarshallerFromByteStringUnmarshaller[T](implicitbsum:akka.http.scaladsl.unmarshalling.FromByteStringUnmarshaller[T]):akka.http.scaladsl.unmarshalling.Unmarshaller[String,T] "Permalink") implicit  def \_fromStringUnmarshallerFromByteStringUnmarshaller\[T](implicit bsum: [FromByteStringUnmarshaller](index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T])\[T]): [Unmarshaller](Unmarshaller.html)\[String, T]
12. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#booleanFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Boolean] "Permalink") implicit  val booleanFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]
14. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#byteFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Byte] "Permalink") implicit  val byteFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]
15. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#doubleFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Double] "Permalink") implicit  val doubleFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)]
17. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PredefinedFromStringUnmarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PredefinedFromStringUnmarshallersImplicitThis member is added by an implicit conversion from PredefinedFromStringUnmarshallers toEnsuring\[PredefinedFromStringUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PredefinedFromStringUnmarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PredefinedFromStringUnmarshallersImplicitThis member is added by an implicit conversion from PredefinedFromStringUnmarshallers toEnsuring\[PredefinedFromStringUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PredefinedFromStringUnmarshallersImplicitThis member is added by an implicit conversion from PredefinedFromStringUnmarshallers toEnsuring\[PredefinedFromStringUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PredefinedFromStringUnmarshallersImplicitThis member is added by an implicit conversion from PredefinedFromStringUnmarshallers toEnsuring\[PredefinedFromStringUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
23. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#floatFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Float] "Permalink") implicit  val floatFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)]
24. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#intFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Int] "Permalink") implicit  val intFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
27. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#longFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Long] "Permalink") implicit  val longFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]
29. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
30. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#shortFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Short] "Permalink") implicit  val shortFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)]
33. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
35. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#uuidFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,java.util.UUID] "Permalink") implicit  val uuidFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID)]
36. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
38. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PredefinedFromStringUnmarshallers toStringFormat\[PredefinedFromStringUnmarshallers] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PredefinedFromStringUnmarshallers, B)ImplicitThis member is added by an implicit conversion from PredefinedFromStringUnmarshallers toArrowAssoc\[PredefinedFromStringUnmarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPredefinedFromStringUnmarshallers to any2stringadd\[PredefinedFromStringUnmarshallers]

### Inherited by implicit conversion StringFormat fromPredefinedFromStringUnmarshallers to StringFormat\[PredefinedFromStringUnmarshallers]

### Inherited by implicit conversion Ensuring fromPredefinedFromStringUnmarshallers to Ensuring\[PredefinedFromStringUnmarshallers]

### Inherited by implicit conversion ArrowAssoc fromPredefinedFromStringUnmarshallers to ArrowAssoc\[PredefinedFromStringUnmarshallers]

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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html)*