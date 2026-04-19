---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes.HttpFailure
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:28:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCodes$$HttpFailure.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes.HttpFailure
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes.HttpFailure

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes.HttpFailure

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/StatusCodes$.html "Permalink")  object [StatusCodes](StatusCodes$.html) extends ObjectRegistry\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [StatusCode](StatusCode.html)]Definition Classes[model](index.html)
- [ClientError](StatusCodes$$ClientError.html)
- [CustomStatusCode](StatusCodes$$CustomStatusCode.html)
- HttpFailure
- [HttpSuccess](StatusCodes$$HttpSuccess.html)
- [Informational](StatusCodes$$Informational.html)
- [Redirection](StatusCodes$$Redirection.html)
- [ServerError](StatusCodes$$ServerError.html)
- [Success](StatusCodes$$Success.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[StatusCodes](StatusCodes$.html)

# HttpFailure[**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html "Permalink")

### 

#### sealed abstract  class HttpFailure extends [StatusCode](StatusCode.html)

Attributesprotected Source[StatusCode.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/StatusCode.scala#L37)Linear Supertypes[StatusCode](StatusCode.html), LazyValueBytesRenderable, Renderable, [javadsl.model.StatusCode](../../javadsl/model/StatusCode.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ClientError](StatusCodes$$ClientError.html), [ServerError](StatusCodes$$ServerError.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpFailure
2. StatusCode
3. LazyValueBytesRenderable
4. Renderable
5. StatusCode
6. AnyRef
7. Any
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

1. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#defaultMessage():String "Permalink") abstract  def defaultMessage(): StringReturns the default message to be included as the content of an Http response
with this status\-code.

Returns the default message to be included as the content of an Http response
with this status\-code.

Definition Classes[StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
2. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#intValue():Int "Permalink") abstract  def intValue(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the numeric code of this status code.

Returns the numeric code of this status code.

Definition Classes[StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
3. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#reason():String "Permalink") abstract  def reason(): StringReturns the reason message for this status code.

Returns the reason message for this status code.

Definition Classes[StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HttpFailure toany2stringadd\[HttpFailure] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HttpFailure, B)ImplicitThis member is added by an implicit conversion from HttpFailure toArrowAssoc\[HttpFailure] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#allowsEntity():Boolean "Permalink")  def allowsEntity(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if a response with this status\-code is allowed to be accompanied with
a non\-empty entity.

Returns if a response with this status\-code is allowed to be accompanied with
a non\-empty entity.

Definition ClassesHttpFailure → [StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
7. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HttpFailure) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpFailureImplicitThis member is added by an implicit conversion from HttpFailure toEnsuring\[HttpFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HttpFailure) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpFailureImplicitThis member is added by an implicit conversion from HttpFailure toEnsuring\[HttpFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpFailureImplicitThis member is added by an implicit conversion from HttpFailure toEnsuring\[HttpFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpFailureImplicitThis member is added by an implicit conversion from HttpFailure toEnsuring\[HttpFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#isFailure():Boolean "Permalink")  def isFailure(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if the status\-code represents failure.

Returns if the status\-code represents failure.

Definition ClassesHttpFailure → [StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
18. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#isRedirection():Boolean "Permalink")  def isRedirection(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if the status\-code is a redirection status code.

Returns if the status\-code is a redirection status code.

Definition ClassesHttpFailure → [StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
20. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#isSuccess():Boolean "Permalink")  def isSuccess(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if the status\-code represents success.

Returns if the status\-code represents success.

Definition ClassesHttpFailure → [StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
21. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesLazyValueBytesRenderable → Renderable
25. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#toString():String "Permalink")  def toString(): StringDefinition ClassesLazyValueBytesRenderable → AnyRef → Any
27. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#value:String "Permalink")  def value: StringDefinition Classes[StatusCode](StatusCode.html) → LazyValueBytesRenderable
28. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HttpFailure toStringFormat\[HttpFailure] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/StatusCodes$$HttpFailure.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HttpFailure, B)ImplicitThis member is added by an implicit conversion from HttpFailure toArrowAssoc\[HttpFailure] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [StatusCode](StatusCode.html)

### Inherited from LazyValueBytesRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.StatusCode](../../javadsl/model/StatusCode.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttpFailure to any2stringadd\[HttpFailure]

### Inherited by implicit conversion StringFormat fromHttpFailure to StringFormat\[HttpFailure]

### Inherited by implicit conversion Ensuring fromHttpFailure to Ensuring\[HttpFailure]

### Inherited by implicit conversion ArrowAssoc fromHttpFailure to ArrowAssoc\[HttpFailure]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$ClientError.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$CustomStatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$HttpFailure.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$HttpSuccess.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$Informational.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$Redirection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$ServerError.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$Success.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$HttpFailure.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$HttpFailure.html)*