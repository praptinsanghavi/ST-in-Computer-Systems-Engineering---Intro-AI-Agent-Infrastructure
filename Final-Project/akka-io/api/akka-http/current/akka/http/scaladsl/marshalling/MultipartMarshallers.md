---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.MultipartMarshallers
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:45:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.MultipartMarshallers
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.MultipartMarshallers

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.MultipartMarshallers

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
- MultipartMarshallers
- [NoStrictlyCompatibleElementMarshallingAvailableException](NoStrictlyCompatibleElementMarshallingAvailableException.html)
- [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
- [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
- [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
- [ToResponseMarshallable](ToResponseMarshallable.html "Something that can later be marshalled into a response")
[t](MultipartMarshallers$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[marshalling](index.html)

# [MultipartMarshallers](MultipartMarshallers$.html "See companion object")[**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html "Permalink")

### Companion [object MultipartMarshallers](MultipartMarshallers$.html "See companion object")

#### trait MultipartMarshallers extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[MultipartMarshallers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/MultipartMarshallers.scala#L14)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Marshaller](Marshaller$.html), [MultipartMarshallers](MultipartMarshallers$.html), [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html), [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MultipartMarshallers
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

1. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MultipartMarshallers toany2stringadd\[MultipartMarshallers] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MultipartMarshallers, B)ImplicitThis member is added by an implicit conversion from MultipartMarshallers toArrowAssoc\[MultipartMarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MultipartMarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MultipartMarshallersImplicitThis member is added by an implicit conversion from MultipartMarshallers toEnsuring\[MultipartMarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MultipartMarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MultipartMarshallersImplicitThis member is added by an implicit conversion from MultipartMarshallers toEnsuring\[MultipartMarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MultipartMarshallersImplicitThis member is added by an implicit conversion from MultipartMarshallers toEnsuring\[MultipartMarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MultipartMarshallersImplicitThis member is added by an implicit conversion from MultipartMarshallers toEnsuring\[MultipartMarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#multipartBoundaryLength:Int "Permalink")  def multipartBoundaryLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)The length of randomly generated multipart boundaries (before base64 encoding).

The length of randomly generated multipart boundaries (before base64 encoding). Can be overridden
to configure.

Attributesprotected
18. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#multipartBoundaryRandom:java.util.Random "Permalink")  def multipartBoundaryRandom: [Random](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html#java.util.Random)The random instance that is used to create multipart boundaries.

The random instance that is used to create multipart boundaries. This can be overridden (e.g. in tests) to
choose how a boundary is created.

Attributesprotected
19. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#multipartMarshaller[T<:akka.http.scaladsl.model.Multipart](implicitlog:akka.event.LoggingAdapter):akka.http.scaladsl.marshalling.ToEntityMarshaller[T] "Permalink") implicit  def multipartMarshaller\[T \<: [Multipart](../model/Multipart.html)](implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [DefaultNoLogging](../../../index.html)): [ToEntityMarshaller](index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]
20. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#randomBoundary():String "Permalink")  def randomBoundary(): StringThe method used to create boundaries in `multipartMarshaller`.

The method used to create boundaries in `multipartMarshaller`. Can be overridden to create custom boundaries.

Attributesprotected
24. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MultipartMarshallers toStringFormat\[MultipartMarshallers] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/marshalling/MultipartMarshallers.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MultipartMarshallers, B)ImplicitThis member is added by an implicit conversion from MultipartMarshallers toArrowAssoc\[MultipartMarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMultipartMarshallers to any2stringadd\[MultipartMarshallers]

### Inherited by implicit conversion StringFormat fromMultipartMarshallers to StringFormat\[MultipartMarshallers]

### Inherited by implicit conversion Ensuring fromMultipartMarshallers to Ensuring\[MultipartMarshallers]

### Inherited by implicit conversion ArrowAssoc fromMultipartMarshallers to ArrowAssoc\[MultipartMarshallers]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html)*