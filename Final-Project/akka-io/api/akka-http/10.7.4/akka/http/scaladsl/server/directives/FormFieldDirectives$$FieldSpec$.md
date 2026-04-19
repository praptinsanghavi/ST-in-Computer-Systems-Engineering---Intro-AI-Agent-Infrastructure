---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$.html "Permalink")  object [FormFieldDirectives](FormFieldDirectives$.html) extends [FormFieldDirectives](FormFieldDirectives.html)Definition Classes[directives](index.html)
- [FieldDef](FormFieldDirectives$$FieldDef.html)
- [FieldMagnet](FormFieldDirectives$$FieldMagnet.html)
- [FieldSpec](FormFieldDirectives$$FieldSpec.html)
[o](FormFieldDirectives$$FieldSpec.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html).[FormFieldDirectives](FormFieldDirectives$.html)

# [FieldSpec](FormFieldDirectives$$FieldSpec.html "See companion trait")[**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html "Permalink")

### Companion [trait FieldSpec](FormFieldDirectives$$FieldSpec.html "See companion trait")

#### object FieldSpec

Source[FormFieldDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/FormFieldDirectives.scala#L144)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FieldSpec
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T} "Permalink")  type Aux\[T] \= [FieldSpec](FormFieldDirectives$$FieldSpec.html) { type Out \= T }
2. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#FSFFOU[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[Option[akka.http.scaladsl.common.StrictForm.Field],T] "Permalink")  type FSFFOU\[T] \= [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Field](../../common/StrictForm$$Field.html)], T]
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#apply[T](directive:akka.http.scaladsl.server.Directive1[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[T] "Permalink")  def apply\[T](directive: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[T]
5. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forNDR[T](r:akka.http.scaladsl.common.NameDefaultReceptacle[T])(implicitfu:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.FSFFOU[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[T] "Permalink") implicit  def forNDR\[T](r: [NameDefaultReceptacle](../../common/NameDefaultReceptacle.html)\[T])(implicit fu: [FSFFOU](#FSFFOU[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[Option[akka.http.scaladsl.common.StrictForm.Field],T])\[T]): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[T]
10. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forNDUR[T](r:akka.http.scaladsl.common.NameDefaultUnmarshallerReceptacle[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[T] "Permalink") implicit  def forNDUR\[T](r: [NameDefaultUnmarshallerReceptacle](../../common/NameDefaultUnmarshallerReceptacle.html)\[T]): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[T]
11. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forNOR[T](r:akka.http.scaladsl.common.NameOptionReceptacle[T])(implicitfu:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.FSFFOU[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[Option[T]] "Permalink") implicit  def forNOR\[T](r: [NameOptionReceptacle](../../common/NameOptionReceptacle.html)\[T])(implicit fu: [FSFFOU](#FSFFOU[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[Option[akka.http.scaladsl.common.StrictForm.Field],T])\[T]): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]
12. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forNOUR[T](r:akka.http.scaladsl.common.NameOptionUnmarshallerReceptacle[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[Option[T]] "Permalink") implicit  def forNOUR\[T](r: [NameOptionUnmarshallerReceptacle](../../common/NameOptionUnmarshallerReceptacle.html)\[T]): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]
13. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forNR[T](r:akka.http.scaladsl.common.NameReceptacle[T])(implicitfu:akka.http.scaladsl.unmarshalling.FromStrictFormFieldUnmarshaller[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[T] "Permalink") implicit  def forNR\[T](r: [NameReceptacle](../../common/NameReceptacle.html)\[T])(implicit fu: [FromStrictFormFieldUnmarshaller](../../unmarshalling/index.html#FromStrictFormFieldUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.common.StrictForm.Field,T])\[T]): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[T]
14. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forNUR[T](r:akka.http.scaladsl.common.NameUnmarshallerReceptacle[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[T] "Permalink") implicit  def forNUR\[T](r: [NameUnmarshallerReceptacle](../../common/NameUnmarshallerReceptacle.html)\[T]): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[T]
15. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forRVDR[T](r:akka.http.scaladsl.common.RequiredValueUnmarshallerReceptacle[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[Unit] "Permalink") implicit  def forRVDR\[T](r: [RequiredValueUnmarshallerReceptacle](../../common/RequiredValueUnmarshallerReceptacle.html)\[T]): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]
16. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forRVR[T](r:akka.http.scaladsl.common.RequiredValueReceptacle[T])(implicitfu:akka.http.scaladsl.unmarshalling.FromStrictFormFieldUnmarshaller[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[Unit] "Permalink") implicit  def forRVR\[T](r: [RequiredValueReceptacle](../../common/RequiredValueReceptacle.html)\[T])(implicit fu: [FromStrictFormFieldUnmarshaller](../../unmarshalling/index.html#FromStrictFormFieldUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.common.StrictForm.Field,T])\[T]): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]
17. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forRepVDR[T](r:akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[Iterable[T]] "Permalink") implicit  def forRepVDR\[T](r: [RepeatedValueUnmarshallerReceptacle](../../common/RepeatedValueUnmarshallerReceptacle.html)\[T]): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[Iterable\[T]]
18. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forRepVR[T](r:akka.http.scaladsl.common.RepeatedValueReceptacle[T])(implicitfu:akka.http.scaladsl.unmarshalling.FromStrictFormFieldUnmarshaller[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[Iterable[T]] "Permalink") implicit  def forRepVR\[T](r: [RepeatedValueReceptacle](../../common/RepeatedValueReceptacle.html)\[T])(implicit fu: [FromStrictFormFieldUnmarshaller](../../unmarshalling/index.html#FromStrictFormFieldUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.common.StrictForm.Field,T])\[T]): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[Iterable\[T]]
19. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forString(fieldName:String):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[String] "Permalink") implicit  def forString(fieldName: String): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[String]
20. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#forSymbol(symbol:Symbol):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec.Aux[String] "Permalink") implicit  def forSymbol(symbol: [Symbol](https://www.scala-lang.org/api/2.13.17/scala/Symbol.html#scala.Symbol)): [Aux](#Aux[T]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec{typeOut=T})\[String]
21. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameDefaultReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameDefaultUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameOptionUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/RepeatedValueReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/RequiredValueReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/RequiredValueUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/StrictForm$$Field.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html)*