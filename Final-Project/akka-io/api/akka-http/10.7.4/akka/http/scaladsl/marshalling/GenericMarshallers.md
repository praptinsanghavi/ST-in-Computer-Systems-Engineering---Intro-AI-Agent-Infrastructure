---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.GenericMarshallers
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:06:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.GenericMarshallers
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.GenericMarshallers

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.GenericMarshallers

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
- GenericMarshallers
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
[t](GenericMarshallers$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[marshalling](index.html)

# [GenericMarshallers](GenericMarshallers$.html "See companion object")[**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html "Permalink")

### Companion [object GenericMarshallers](GenericMarshallers$.html "See companion object")

#### trait GenericMarshallers extends [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)

Source[GenericMarshallers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/GenericMarshallers.scala#L12)Linear Supertypes[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[GenericMarshallers](GenericMarshallers$.html), [Marshaller](Marshaller$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GenericMarshallers
2. LowPriorityToResponseMarshallerImplicits
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
### Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from GenericMarshallers toany2stringadd\[GenericMarshallers] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (GenericMarshallers, B)ImplicitThis member is added by an implicit conversion from GenericMarshallers toArrowAssoc\[GenericMarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#eitherMarshaller[A1,A2,B](implicitm1:akka.http.scaladsl.marshalling.Marshaller[A1,B],implicitm2:akka.http.scaladsl.marshalling.Marshaller[A2,B]):akka.http.scaladsl.marshalling.Marshaller[Either[A1,A2],B] "Permalink") implicit  def eitherMarshaller\[A1, A2, B](implicit m1: [Marshaller](Marshaller.html)\[A1, B], m2: [Marshaller](Marshaller.html)\[A2, B]): [Marshaller](Marshaller.html)\[Either\[A1, A2], B]
9. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (GenericMarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GenericMarshallersImplicitThis member is added by an implicit conversion from GenericMarshallers toEnsuring\[GenericMarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (GenericMarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GenericMarshallersImplicitThis member is added by an implicit conversion from GenericMarshallers toEnsuring\[GenericMarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GenericMarshallersImplicitThis member is added by an implicit conversion from GenericMarshallers toEnsuring\[GenericMarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GenericMarshallersImplicitThis member is added by an implicit conversion from GenericMarshallers toEnsuring\[GenericMarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#fromEntityStreamingSupportAndEntityMarshaller[T,M](implicits:akka.http.scaladsl.common.EntityStreamingSupport,implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T],implicittag:scala.reflect.ClassTag[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[akka.stream.scaladsl.Source[T,M]] "Permalink") implicit  def fromEntityStreamingSupportAndEntityMarshaller\[T, M](implicit s: [EntityStreamingSupport](../common/EntityStreamingSupport.html), m: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T], tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[T, M]]Definition Classes[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
16. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#futureMarshaller[A,B](implicitm:akka.http.scaladsl.marshalling.Marshaller[A,B]):akka.http.scaladsl.marshalling.Marshaller[scala.concurrent.Future[A],B] "Permalink") implicit  def futureMarshaller\[A, B](implicit m: [Marshaller](Marshaller.html)\[A, B]): [Marshaller](Marshaller.html)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[A], B]
17. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#liftMarshaller[T](implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[T] "Permalink") implicit  def liftMarshaller\[T](implicit m: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]Definition Classes[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
21. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#liftMarshallerConversion[T](m:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[T] "Permalink") implicit  def liftMarshallerConversion\[T](m: [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]Definition Classes[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)
22. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#optionMarshaller[A,B](implicitm:akka.http.scaladsl.marshalling.Marshaller[A,B],implicitempty:akka.http.scaladsl.marshalling.EmptyValue[B]):akka.http.scaladsl.marshalling.Marshaller[Option[A],B] "Permalink") implicit  def optionMarshaller\[A, B](implicit m: [Marshaller](Marshaller.html)\[A, B], empty: [EmptyValue](EmptyValue.html)\[B]): [Marshaller](Marshaller.html)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A], B]
26. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#throwableMarshaller[T]:akka.http.scaladsl.marshalling.Marshaller[Throwable,T] "Permalink") implicit  def throwableMarshaller\[T]: [Marshaller](Marshaller.html)\[Throwable, T]
28. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#tryMarshaller[A,B](implicitm:akka.http.scaladsl.marshalling.Marshaller[A,B]):akka.http.scaladsl.marshalling.Marshaller[scala.util.Try[A],B] "Permalink") implicit  def tryMarshaller\[A, B](implicit m: [Marshaller](Marshaller.html)\[A, B]): [Marshaller](Marshaller.html)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[A], B]
30. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from GenericMarshallers toStringFormat\[GenericMarshallers] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/marshalling/GenericMarshallers.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (GenericMarshallers, B)ImplicitThis member is added by an implicit conversion from GenericMarshallers toArrowAssoc\[GenericMarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromGenericMarshallers to any2stringadd\[GenericMarshallers]

### Inherited by implicit conversion StringFormat fromGenericMarshallers to StringFormat\[GenericMarshallers]

### Inherited by implicit conversion Ensuring fromGenericMarshallers to Ensuring\[GenericMarshallers]

### Inherited by implicit conversion ArrowAssoc fromGenericMarshallers to ArrowAssoc\[GenericMarshallers]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/ContentTypeOverrider$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/ContentTypeOverrider.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/EmptyValue$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/EmptyValue.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/GenericMarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/GenericMarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/LowPriorityToResponseMarshallerImplicits.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshal$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshal.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshalling$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshalling.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/MultipartMarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/MultipartMarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/NoStrictlyCompatibleElementMarshallingAvailableException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/ToResponseMarshallable$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/GenericMarshallers.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/GenericMarshallers.html)*