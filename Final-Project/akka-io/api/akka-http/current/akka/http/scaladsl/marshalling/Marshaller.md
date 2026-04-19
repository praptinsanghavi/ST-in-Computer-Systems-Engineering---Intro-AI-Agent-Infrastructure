---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.Marshaller
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:45:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.Marshaller
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.Marshaller

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.Marshaller

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
- Marshaller
- [Marshalling](Marshalling.html "Describes one possible option for marshalling a given value.")
- [MultipartMarshallers](MultipartMarshallers.html)
- [NoStrictlyCompatibleElementMarshallingAvailableException](NoStrictlyCompatibleElementMarshallingAvailableException.html)
- [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html)
- [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html)
- [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html)
- [ToResponseMarshallable](ToResponseMarshallable.html "Something that can later be marshalled into a response")
[c](Marshaller$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[marshalling](index.html)

# [Marshaller](Marshaller$.html "See companion object")[**](../../../../akka/http/scaladsl/marshalling/Marshaller.html "Permalink")

### Companion [object Marshaller](Marshaller$.html "See companion object")

#### sealed abstract  class Marshaller\[\-A, \+B] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[Marshaller.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/Marshaller.scala#L14)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Marshaller
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
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#apply(value:A)(implicitec:scala.concurrent.ExecutionContext):scala.concurrent.Future[List[akka.http.scaladsl.marshalling.Marshalling[B]]] "Permalink") abstract  def apply(value: A)(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[List\[[Marshalling](Marshalling.html)\[B]]]
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Marshaller\[A, B] toany2stringadd\[Marshaller\[A, B]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Marshaller\[A, B], B)ImplicitThis member is added by an implicit conversion from Marshaller\[A, B] toArrowAssoc\[Marshaller\[A, B]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if B is a subclass of MessageEntity (B \<: [MessageEntity](../model/index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)).Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#compose[C](f:C=>A):akka.http.scaladsl.marshalling.Marshaller[C,B] "Permalink")  def compose\[C](f: (C) \=\> A): Marshaller\[C, B]
9. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#composeWithEC[C](f:scala.concurrent.ExecutionContext=>(C=>A)):akka.http.scaladsl.marshalling.Marshaller[C,B] "Permalink")  def composeWithEC\[C](f: ([ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)) \=\> (C) \=\> A): Marshaller\[C, B]
10. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Marshaller\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Marshaller\[A, B]ImplicitThis member is added by an implicit conversion from Marshaller\[A, B] toEnsuring\[Marshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Marshaller\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Marshaller\[A, B]ImplicitThis member is added by an implicit conversion from Marshaller\[A, B] toEnsuring\[Marshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Marshaller\[A, B]ImplicitThis member is added by an implicit conversion from Marshaller\[A, B] toEnsuring\[Marshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Marshaller\[A, B]ImplicitThis member is added by an implicit conversion from Marshaller\[A, B] toEnsuring\[Marshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#map[C](f:B=>C):akka.http.scaladsl.marshalling.Marshaller[A,C] "Permalink")  def map\[C](f: (B) \=\> C): Marshaller\[A, C]
20. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#wrap[C,D>:B](newMediaType:akka.http.scaladsl.model.MediaType)(f:C=>A)(implicitmto:akka.http.scaladsl.marshalling.ContentTypeOverrider[D]):akka.http.scaladsl.marshalling.Marshaller[C,D] "Permalink")  def wrap\[C, D \>: B](newMediaType: [MediaType](../model/MediaType.html))(f: (C) \=\> A)(implicit mto: [ContentTypeOverrider](ContentTypeOverrider.html)\[D]): Marshaller\[C, D]Reuses this Marshaller's logic to produce a new Marshaller from another type `C` which overrides
the [akka.http.scaladsl.model.MediaType](../model/MediaType.html) of the marshalling result with the given one.

Reuses this Marshaller's logic to produce a new Marshaller from another type `C` which overrides
the [akka.http.scaladsl.model.MediaType](../model/MediaType.html) of the marshalling result with the given one.
Note that not all wrappings are legal. f the underlying [akka.http.scaladsl.model.MediaType](../model/MediaType.html) has constraints with regard to the
charsets it allows the new [akka.http.scaladsl.model.MediaType](../model/MediaType.html) must be compatible, since akka\-http will never recode entities.
If the wrapping is illegal the [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) produced by the resulting marshaller will contain a RuntimeException.
29. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#wrapWithEC[C,D>:B](newMediaType:akka.http.scaladsl.model.MediaType)(f:scala.concurrent.ExecutionContext=>(C=>A))(implicitcto:akka.http.scaladsl.marshalling.ContentTypeOverrider[D]):akka.http.scaladsl.marshalling.Marshaller[C,D] "Permalink")  def wrapWithEC\[C, D \>: B](newMediaType: [MediaType](../model/MediaType.html))(f: ([ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)) \=\> (C) \=\> A)(implicit cto: [ContentTypeOverrider](ContentTypeOverrider.html)\[D]): Marshaller\[C, D]Reuses this Marshaller's logic to produce a new Marshaller from another type `C` which overrides
the [akka.http.scaladsl.model.MediaType](../model/MediaType.html) of the marshalling result with the given one.

Reuses this Marshaller's logic to produce a new Marshaller from another type `C` which overrides
the [akka.http.scaladsl.model.MediaType](../model/MediaType.html) of the marshalling result with the given one.
Note that not all wrappings are legal. f the underlying [akka.http.scaladsl.model.MediaType](../model/MediaType.html) has constraints with regard to the
charsets it allows the new [akka.http.scaladsl.model.MediaType](../model/MediaType.html) must be compatible, since akka\-http will never recode entities.
If the wrapping is illegal the [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) produced by the resulting marshaller will contain a RuntimeException.
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Marshaller\[A, B] toStringFormat\[Marshaller\[A, B]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/marshalling/Marshaller.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Marshaller\[A, B], B)ImplicitThis member is added by an implicit conversion from Marshaller\[A, B] toArrowAssoc\[Marshaller\[A, B]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if B is a subclass of MessageEntity (B \<: [MessageEntity](../model/index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)).Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMarshaller\[A, B] to any2stringadd\[Marshaller\[A, B]]

### Inherited by implicit conversion StringFormat fromMarshaller\[A, B] to StringFormat\[Marshaller\[A, B]]

### Inherited by implicit conversion Ensuring fromMarshaller\[A, B] to Ensuring\[Marshaller\[A, B]]

### Inherited by implicit conversion ArrowAssoc fromMarshaller\[A, B] to ArrowAssoc\[Marshaller\[A, B]]

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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html)*