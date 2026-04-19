---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToRequestMarshallers
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:45:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToRequestMarshallers
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToRequestMarshallers

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.PredefinedToRequestMarshallers

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[marshalling](index.html)
- [ContentTypeOverrider](ContentTypeOverrider.html)
- [EmptyValue](EmptyValue.html)
- [GenericMarshallers](GenericMarshallers.html)
- [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
- [Marshal](Marshal.html)
- [Marshaller](Marshaller.html)
- [Marshalling](Marshalling.html "Describes one possible option for marshalling a given value.")
- [MultipartMarshallers](MultipartMarshallers.html)
- [NoStrictlyCompatibleElementMarshallingAvailableException](NoStrictlyCompatibleElementMarshallingAvailableException.html)
- [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
- [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
- [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
- [ToResponseMarshallable](ToResponseMarshallable.html "Something that can later be marshalled into a response")
[o](PredefinedToRequestMarshallers.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[marshalling](index.html)

# [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html "See companion trait")[**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html "Permalink")

### Companion [trait PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html "See companion trait")

#### object PredefinedToRequestMarshallers extends [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)

Source[PredefinedToRequestMarshallers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.scala#L28)Linear Supertypes[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PredefinedToRequestMarshallers
2. PredefinedToRequestMarshallers
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#fromMethodAndUriAndHeadersAndValue[T](implicitmt:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):PredefinedToRequestMarshallers.this.TRM[(akka.http.scaladsl.model.HttpMethod,akka.http.scaladsl.model.Uri,Seq[akka.http.scaladsl.model.HttpHeader],T)] "Permalink") implicit  def fromMethodAndUriAndHeadersAndValue\[T](implicit mt: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): TRM\[([HttpMethod](../model/HttpMethod.html), [Uri](../model/Uri.html), [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../model/HttpHeader.html)], T)]Definition Classes[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
9. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#fromMethodAndUriAndValue[S,T](implicitmt:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):PredefinedToRequestMarshallers.this.TRM[(akka.http.scaladsl.model.HttpMethod,akka.http.scaladsl.model.Uri,T)] "Permalink") implicit  def fromMethodAndUriAndValue\[S, T](implicit mt: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): TRM\[([HttpMethod](../model/HttpMethod.html), [Uri](../model/Uri.html), T)]Definition Classes[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
10. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#fromRequest:PredefinedToRequestMarshallers.this.TRM[akka.http.scaladsl.model.HttpRequest] "Permalink") implicit  val fromRequest: TRM\[[HttpRequest](../model/HttpRequest.html)]Definition Classes[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
11. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#fromUri:PredefinedToRequestMarshallers.this.TRM[akka.http.scaladsl.model.Uri] "Permalink") implicit  def fromUri: TRM\[[Uri](../model/Uri.html)]Definition Classes[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
12. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/ContentTypeOverrider$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/ContentTypeOverrider.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/EmptyValue$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/EmptyValue.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/LowPriorityToResponseMarshallerImplicits.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshal$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshal.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshalling$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/NoStrictlyCompatibleElementMarshallingAvailableException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/ToResponseMarshallable$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/sse/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html)*