---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:39:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef

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
[o](FormFieldDirectives$$FieldDef.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html).[FormFieldDirectives](FormFieldDirectives$.html)

# [FieldDef](FormFieldDirectives$$FieldDef.html "See companion trait")[**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html "Permalink")

### Companion [trait FieldDef](FormFieldDirectives$$FieldDef.html "See companion trait")

#### object FieldDef

Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use new `formFields` overloads with FieldSpec parameters. Kept for binary compatibility

Source[FormFieldDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/FormFieldDirectives.scala#L218)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FieldDef
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#FSFFOU[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[Option[akka.http.scaladsl.common.StrictForm.Field],T] "Permalink")  type FSFFOU\[T] \= [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Field](../../common/StrictForm$$Field.html)], T]
2. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#SFU=akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.common.StrictForm] "Permalink")  type SFU \= [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[[HttpEntity](../../model/HttpEntity.html), [StrictForm](../../common/StrictForm.html)]
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#extractField[A,B](f:A=>akka.http.scaladsl.server.Directive1[B]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[A,(B,)] "Permalink")  def extractField\[A, B](f: (A) \=\> [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[B]): [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[A, (B)]Attributesprotected
9. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#fieldDef[A,B](f:A=>akka.http.scaladsl.server.Directive[B]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[A,B] "Permalink")  def fieldDef\[A, B](f: (A) \=\> [Directive](../Directive.html)\[B]): [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[A, B]Attributesprotected
10. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forNDR[T](implicitfu:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef.FSFFOU[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[akka.http.scaladsl.common.NameDefaultReceptacle[T],(T,)] "Permalink")  def forNDR\[T](implicit fu: [FSFFOU](#FSFFOU[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[Option[akka.http.scaladsl.common.StrictForm.Field],T])\[T]): [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[[NameDefaultReceptacle](../../common/NameDefaultReceptacle.html)\[T], (T)]
11. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forNDUR[T]:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[akka.http.scaladsl.common.NameDefaultUnmarshallerReceptacle[T],(T,)] "Permalink")  def forNDUR\[T]: [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[[NameDefaultUnmarshallerReceptacle](../../common/NameDefaultUnmarshallerReceptacle.html)\[T], (T)]
12. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forNOR[T](implicitfu:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef.FSFFOU[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[akka.http.scaladsl.common.NameOptionReceptacle[T],(Option[T],)] "Permalink")  def forNOR\[T](implicit fu: [FSFFOU](#FSFFOU[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[Option[akka.http.scaladsl.common.StrictForm.Field],T])\[T]): [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[[NameOptionReceptacle](../../common/NameOptionReceptacle.html)\[T], ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T])]
13. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forNOUR[T]:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[akka.http.scaladsl.common.NameOptionUnmarshallerReceptacle[T],(Option[T],)] "Permalink")  def forNOUR\[T]: [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[[NameOptionUnmarshallerReceptacle](../../common/NameOptionUnmarshallerReceptacle.html)\[T], ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T])]
14. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forNR[T](implicitfu:akka.http.scaladsl.unmarshalling.FromStrictFormFieldUnmarshaller[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[akka.http.scaladsl.common.NameReceptacle[T],(T,)] "Permalink")  def forNR\[T](implicit fu: [FromStrictFormFieldUnmarshaller](../../unmarshalling/index.html#FromStrictFormFieldUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.common.StrictForm.Field,T])\[T]): [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[[NameReceptacle](../../common/NameReceptacle.html)\[T], (T)]
15. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forNUR[T]:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[akka.http.scaladsl.common.NameUnmarshallerReceptacle[T],(T,)] "Permalink")  def forNUR\[T]: [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[[NameUnmarshallerReceptacle](../../common/NameUnmarshallerReceptacle.html)\[T], (T)]
16. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forRVDR[T]:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[akka.http.scaladsl.common.RequiredValueUnmarshallerReceptacle[T],Unit] "Permalink")  def forRVDR\[T]: [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[[RequiredValueUnmarshallerReceptacle](../../common/RequiredValueUnmarshallerReceptacle.html)\[T], [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]
17. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forRVR[T](implicitfu:akka.http.scaladsl.unmarshalling.FromStrictFormFieldUnmarshaller[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[akka.http.scaladsl.common.RequiredValueReceptacle[T],Unit] "Permalink")  def forRVR\[T](implicit fu: [FromStrictFormFieldUnmarshaller](../../unmarshalling/index.html#FromStrictFormFieldUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.common.StrictForm.Field,T])\[T]): [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[[RequiredValueReceptacle](../../common/RequiredValueReceptacle.html)\[T], [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]
18. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forRepVDR[T]:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle[T],(Iterable[T],)] "Permalink")  def forRepVDR\[T]: [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[[RepeatedValueUnmarshallerReceptacle](../../common/RepeatedValueUnmarshallerReceptacle.html)\[T], (Iterable\[T])]
19. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forRepVR[T](implicitfu:akka.http.scaladsl.unmarshalling.FromStrictFormFieldUnmarshaller[T]):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[akka.http.scaladsl.common.RepeatedValueReceptacle[T],(Iterable[T],)] "Permalink")  def forRepVR\[T](implicit fu: [FromStrictFormFieldUnmarshaller](../../unmarshalling/index.html#FromStrictFormFieldUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.common.StrictForm.Field,T])\[T]): [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[[RepeatedValueReceptacle](../../common/RepeatedValueReceptacle.html)\[T], (Iterable\[T])]
20. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forString:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[String,(String,)] "Permalink")  def forString: [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[String, (String)]
21. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forSymbol:akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[Symbol,(String,)] "Permalink")  def forSymbol: [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[[Symbol](https://www.scala-lang.org/api/2.13.17/scala/Symbol.html#scala.Symbol), (String)]
22. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#forTuple[T,O](implicitfold:akka.http.scaladsl.server.util.TupleOps.FoldLeft[akka.http.scaladsl.server.Directive0,T,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef.ConvertFieldDefAndConcatenate.type]{typeOut=akka.http.scaladsl.server.Directive[O]}):akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDefAux[T,O] "Permalink")  def forTuple\[T, O](implicit fold: [FoldLeft](../util/TupleOps$$FoldLeft.html)\[[Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit]), T, [ConvertFieldDefAndConcatenate](FormFieldDirectives$$FieldDef$$ConvertFieldDefAndConcatenate$.html).type] { type Out \= akka.http.scaladsl.server.Directive\[O] }): [FieldDefAux](FormFieldDirectives$.html#FieldDefAux[A,B]=akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef[A]{typeU=B})\[T, O]
23. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$$ConvertFieldDefAndConcatenate$.html "Permalink")  object [ConvertFieldDefAndConcatenate](FormFieldDirectives$$FieldDef$$ConvertFieldDefAndConcatenate$.html) extends [BinaryPolyFunc](../util/BinaryPolyFunc.html)
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/StrictForm.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$$ConvertFieldDefAndConcatenate$.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$FoldLeft.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html)*