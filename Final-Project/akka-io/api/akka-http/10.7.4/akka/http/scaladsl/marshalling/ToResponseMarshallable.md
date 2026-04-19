---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.ToResponseMarshallable
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:10:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.ToResponseMarshallable
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.ToResponseMarshallable

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.ToResponseMarshallable

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
- ToResponseMarshallable
[t](ToResponseMarshallable$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[marshalling](index.html)

# [ToResponseMarshallable](ToResponseMarshallable$.html "See companion object")[**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html "Permalink")

### Companion [object ToResponseMarshallable](ToResponseMarshallable$.html "See companion object")

#### trait ToResponseMarshallable extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Something that can later be marshalled into a response

Source[ToResponseMarshallable.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/ToResponseMarshallable.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ToResponseMarshallable
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
### Type Members

1. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#T "Permalink") abstract  type T
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#marshaller:akka.http.scaladsl.marshalling.ToResponseMarshaller[ToResponseMarshallable.this.T] "Permalink") implicit abstract  def marshaller: [ToResponseMarshaller](index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[[T](#T)]
2. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#value:ToResponseMarshallable.this.T "Permalink") abstract  def value: [T](#T)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ToResponseMarshallable toany2stringadd\[ToResponseMarshallable] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ToResponseMarshallable, B)ImplicitThis member is added by an implicit conversion from ToResponseMarshallable toArrowAssoc\[ToResponseMarshallable] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#apply(request:akka.http.scaladsl.model.HttpRequest)(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse] "Permalink")  def apply(request: [HttpRequest](../model/HttpRequest.html))(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](../model/HttpResponse.html)]
7. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ToResponseMarshallable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ToResponseMarshallableImplicitThis member is added by an implicit conversion from ToResponseMarshallable toEnsuring\[ToResponseMarshallable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ToResponseMarshallable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ToResponseMarshallableImplicitThis member is added by an implicit conversion from ToResponseMarshallable toEnsuring\[ToResponseMarshallable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ToResponseMarshallableImplicitThis member is added by an implicit conversion from ToResponseMarshallable toEnsuring\[ToResponseMarshallable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ToResponseMarshallableImplicitThis member is added by an implicit conversion from ToResponseMarshallable toEnsuring\[ToResponseMarshallable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ToResponseMarshallable toStringFormat\[ToResponseMarshallable] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/marshalling/ToResponseMarshallable.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ToResponseMarshallable, B)ImplicitThis member is added by an implicit conversion from ToResponseMarshallable toArrowAssoc\[ToResponseMarshallable] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromToResponseMarshallable to any2stringadd\[ToResponseMarshallable]

### Inherited by implicit conversion StringFormat fromToResponseMarshallable to StringFormat\[ToResponseMarshallable]

### Inherited by implicit conversion Ensuring fromToResponseMarshallable to Ensuring\[ToResponseMarshallable]

### Inherited by implicit conversion ArrowAssoc fromToResponseMarshallable to ArrowAssoc\[ToResponseMarshallable]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/ToResponseMarshallable.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/ToResponseMarshallable.html)*