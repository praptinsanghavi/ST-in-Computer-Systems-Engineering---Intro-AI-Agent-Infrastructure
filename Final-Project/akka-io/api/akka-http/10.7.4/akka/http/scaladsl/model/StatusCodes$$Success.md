---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes.Success
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:28:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCodes$$Success.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes.Success
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes.Success

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.StatusCodes.Success

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
- [HttpFailure](StatusCodes$$HttpFailure.html)
- [HttpSuccess](StatusCodes$$HttpSuccess.html)
- [Informational](StatusCodes$$Informational.html)
- [Redirection](StatusCodes$$Redirection.html)
- [ServerError](StatusCodes$$ServerError.html)
- Success
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[StatusCodes](StatusCodes$.html)

# Success[**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html "Permalink")

### 

#### final  case class Success extends [HttpSuccess](StatusCodes$$HttpSuccess.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[StatusCode.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/StatusCode.scala#L51)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [HttpSuccess](StatusCodes$$HttpSuccess.html), [StatusCode](StatusCode.html), LazyValueBytesRenderable, Renderable, [javadsl.model.StatusCode](../../javadsl/model/StatusCode.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Success
2. Serializable
3. Product
4. Equals
5. HttpSuccess
6. StatusCode
7. LazyValueBytesRenderable
8. Renderable
9. StatusCode
10. AnyRef
11. Any
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

1. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Success toany2stringadd\[Success] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Success, B)ImplicitThis member is added by an implicit conversion from Success toArrowAssoc\[Success] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#allowsEntity:Boolean "Permalink")  val allowsEntity: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if a response with this status\-code is allowed to be accompanied with
a non\-empty entity.

Returns if a response with this status\-code is allowed to be accompanied with
a non\-empty entity.

Definition ClassesSuccess → [StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
7. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#defaultMessage:String "Permalink")  val defaultMessage: StringReturns the default message to be included as the content of an Http response
with this status\-code.

Returns the default message to be included as the content of an Http response
with this status\-code.

Definition ClassesSuccess → [StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
10. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Success) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SuccessImplicitThis member is added by an implicit conversion from Success toEnsuring\[Success] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Success) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SuccessImplicitThis member is added by an implicit conversion from Success toEnsuring\[Success] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SuccessImplicitThis member is added by an implicit conversion from Success toEnsuring\[Success] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SuccessImplicitThis member is added by an implicit conversion from Success toEnsuring\[Success] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#intValue:Int "Permalink")  val intValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the numeric code of this status code.

Returns the numeric code of this status code.

Definition ClassesSuccess → [StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
17. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#isFailure():Boolean "Permalink")  def isFailure(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if the status\-code represents failure.

Returns if the status\-code represents failure.

Definition Classes[HttpSuccess](StatusCodes$$HttpSuccess.html) → [StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
18. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#isRedirection():Boolean "Permalink")  def isRedirection(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if the status\-code is a redirection status code.

Returns if the status\-code is a redirection status code.

Definition ClassesSuccess → [StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
20. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#isSuccess():Boolean "Permalink")  def isSuccess(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns if the status\-code represents success.

Returns if the status\-code represents success.

Definition Classes[HttpSuccess](StatusCodes$$HttpSuccess.html) → [StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
21. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
25. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#reason:String "Permalink")  val reason: StringReturns the reason message for this status code.

Returns the reason message for this status code.

Definition ClassesSuccess → [StatusCode](StatusCode.html) → [StatusCode](../../javadsl/model/StatusCode.html)
26. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesLazyValueBytesRenderable → Renderable
27. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#toString():String "Permalink")  def toString(): StringDefinition ClassesLazyValueBytesRenderable → AnyRef → Any
29. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#value:String "Permalink")  def value: StringDefinition Classes[StatusCode](StatusCode.html) → LazyValueBytesRenderable
30. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Success toStringFormat\[Success] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/StatusCodes$$Success.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Success, B)ImplicitThis member is added by an implicit conversion from Success toArrowAssoc\[Success] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [HttpSuccess](StatusCodes$$HttpSuccess.html)

### Inherited from [StatusCode](StatusCode.html)

### Inherited from LazyValueBytesRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.StatusCode](../../javadsl/model/StatusCode.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSuccess to any2stringadd\[Success]

### Inherited by implicit conversion StringFormat fromSuccess to StringFormat\[Success]

### Inherited by implicit conversion Ensuring fromSuccess to Ensuring\[Success]

### Inherited by implicit conversion ArrowAssoc fromSuccess to ArrowAssoc\[Success]

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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$Success.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$Success.html)*