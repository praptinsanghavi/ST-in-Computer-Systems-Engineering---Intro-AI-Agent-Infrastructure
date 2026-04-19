---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$.html "Permalink")  object [ParameterDirectives](ParameterDirectives$.html) extends [ParameterDirectives](ParameterDirectives.html)Definition Classes[directives](index.html)
- [ParamDef](ParameterDirectives$$ParamDef.html)
- [ParamMagnet](ParameterDirectives$$ParamMagnet.html)
- [ParamSpec](ParameterDirectives$$ParamSpec.html)
[o](ParameterDirectives$$ParamDef.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html).[ParameterDirectives](ParameterDirectives$.html)

# [ParamDef](ParameterDirectives$$ParamDef.html "See companion trait")[**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html "Permalink")

### Companion [trait ParamDef](ParameterDirectives$$ParamDef.html "See companion trait")

#### object ParamDef

Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use new `parameters` overloads with ParamSpec parameters. Kept for binary compatibility

Source[ParameterDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/ParameterDirectives.scala#L133)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ParamDef
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#extractParameter[A,B](f:A=>akka.http.scaladsl.server.Directive1[B]):akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[A,akka.http.scaladsl.server.Directive1[B]] "Permalink")  def extractParameter\[A, B](f: (A) \=\> [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[B]): [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[A, [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[B]]
9. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forNDR[T](implicitfsou:akka.http.scaladsl.server.directives.ParameterDirectives.Impl.FSOU[T]):akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[akka.http.scaladsl.common.NameDefaultReceptacle[T],akka.http.scaladsl.server.Directive1[T]] "Permalink")  def forNDR\[T](implicit fsou: FSOU\[T]): [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[[NameDefaultReceptacle](../../common/NameDefaultReceptacle.html)\[T], [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]]
10. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forNDUR[T]:akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[akka.http.scaladsl.common.NameDefaultUnmarshallerReceptacle[T],akka.http.scaladsl.server.Directive1[T]] "Permalink")  def forNDUR\[T]: [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[[NameDefaultUnmarshallerReceptacle](../../common/NameDefaultUnmarshallerReceptacle.html)\[T], [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]]
11. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forNOR[T](implicitfsou:akka.http.scaladsl.server.directives.ParameterDirectives.Impl.FSOU[T]):akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[akka.http.scaladsl.common.NameOptionReceptacle[T],akka.http.scaladsl.server.Directive1[Option[T]]] "Permalink")  def forNOR\[T](implicit fsou: FSOU\[T]): [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[[NameOptionReceptacle](../../common/NameOptionReceptacle.html)\[T], [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]]
12. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forNOUR[T]:akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[akka.http.scaladsl.common.NameOptionUnmarshallerReceptacle[T],akka.http.scaladsl.server.Directive1[Option[T]]] "Permalink")  def forNOUR\[T]: [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[[NameOptionUnmarshallerReceptacle](../../common/NameOptionUnmarshallerReceptacle.html)\[T], [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]]
13. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forNR[T](implicitfsu:akka.http.scaladsl.unmarshalling.FromStringUnmarshaller[T]):akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[akka.http.scaladsl.common.NameReceptacle[T],akka.http.scaladsl.server.Directive1[T]] "Permalink")  def forNR\[T](implicit fsu: [FromStringUnmarshaller](../../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])\[T]): [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[[NameReceptacle](../../common/NameReceptacle.html)\[T], [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]]
14. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forNUR[T]:akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[akka.http.scaladsl.common.NameUnmarshallerReceptacle[T],akka.http.scaladsl.server.Directive1[T]] "Permalink")  def forNUR\[T]: [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[[NameUnmarshallerReceptacle](../../common/NameUnmarshallerReceptacle.html)\[T], [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]]
15. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forRVDR[T]:akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[akka.http.scaladsl.common.RequiredValueUnmarshallerReceptacle[T],akka.http.scaladsl.server.Directive0] "Permalink")  def forRVDR\[T]: [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[[RequiredValueUnmarshallerReceptacle](../../common/RequiredValueUnmarshallerReceptacle.html)\[T], [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])]
16. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forRVR[T](implicitfsu:akka.http.scaladsl.unmarshalling.FromStringUnmarshaller[T]):akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[akka.http.scaladsl.common.RequiredValueReceptacle[T],akka.http.scaladsl.server.Directive0] "Permalink")  def forRVR\[T](implicit fsu: [FromStringUnmarshaller](../../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])\[T]): [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[[RequiredValueReceptacle](../../common/RequiredValueReceptacle.html)\[T], [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])]
17. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forRepVDR[T]:akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle[T],akka.http.scaladsl.server.Directive1[Iterable[T]]] "Permalink")  def forRepVDR\[T]: [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[[RepeatedValueUnmarshallerReceptacle](../../common/RepeatedValueUnmarshallerReceptacle.html)\[T], [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[Iterable\[T]]]
18. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forRepVR[T](implicitfsu:akka.http.scaladsl.unmarshalling.FromStringUnmarshaller[T]):akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[akka.http.scaladsl.common.RepeatedValueReceptacle[T],akka.http.scaladsl.server.Directive1[Iterable[T]]] "Permalink")  def forRepVR\[T](implicit fsu: [FromStringUnmarshaller](../../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])\[T]): [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[[RepeatedValueReceptacle](../../common/RepeatedValueReceptacle.html)\[T], [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[Iterable\[T]]]
19. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forString(implicitfsu:akka.http.scaladsl.unmarshalling.FromStringUnmarshaller[String]):akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[String,akka.http.scaladsl.server.Directive1[String]] "Permalink")  def forString(implicit fsu: [FromStringUnmarshaller](../../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])\[String]): [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[String, [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[String]]
20. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#forSymbol(implicitfsu:akka.http.scaladsl.unmarshalling.FromStringUnmarshaller[String]):akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[Symbol,akka.http.scaladsl.server.Directive1[String]] "Permalink")  def forSymbol(implicit fsu: [FromStringUnmarshaller](../../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])\[String]): [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[[Symbol](https://www.scala-lang.org/api/2.13.17/scala/Symbol.html#scala.Symbol), [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[String]]
21. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#paramDef[A,B](f:A=>B):akka.http.scaladsl.server.directives.ParameterDirectives.ParamDefAux[A,B] "Permalink")  def paramDef\[A, B](f: (A) \=\> B): [ParamDefAux](ParameterDirectives$.html#ParamDefAux[T,U]=akka.http.scaladsl.server.directives.ParameterDirectives.ParamDef[T]{typeOut=U})\[A, B]
28. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$$ConvertParamDefAndConcatenate$.html "Permalink")  object [ConvertParamDefAndConcatenate](ParameterDirectives$$ParamDef$$ConvertParamDefAndConcatenate$.html) extends [BinaryPolyFunc](../util/BinaryPolyFunc.html)
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$$ConvertParamDefAndConcatenate$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$$ParamMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$$ParamMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$$ParamSpec$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$$ParamSpec.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$.html)*