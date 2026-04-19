---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.common.StrictForm
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:44:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/StrictForm.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.common.StrictForm
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.common.StrictForm

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.common.StrictForm

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](index.html)Definition Classes[scaladsl](../index.html)
- [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html)
- [EntityStreamingSupport](EntityStreamingSupport.html "Entity streaming support trait allowing rendering and receiving incoming Source[T, _] from HTTP entities.")
- [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html)
- [NameDefaultReceptacle](NameDefaultReceptacle.html)
- [NameDefaultUnmarshallerReceptacle](NameDefaultUnmarshallerReceptacle.html)
- [NameOptionReceptacle](NameOptionReceptacle.html)
- [NameOptionUnmarshallerReceptacle](NameOptionUnmarshallerReceptacle.html)
- [NameReceptacle](NameReceptacle.html)
- [NameUnmarshallerReceptacle](NameUnmarshallerReceptacle.html)
- [RepeatedValueReceptacle](RepeatedValueReceptacle.html)
- [RepeatedValueUnmarshallerReceptacle](RepeatedValueUnmarshallerReceptacle.html)
- [RequiredValueReceptacle](RequiredValueReceptacle.html)
- [RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html)
- [SSLContextFactory](SSLContextFactory$.html)
- StrictForm
- [ToNameReceptacleEnhancements](ToNameReceptacleEnhancements$.html)
[c](StrictForm$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[common](index.html)

# [StrictForm](StrictForm$.html "See companion object")[**](../../../../akka/http/scaladsl/common/StrictForm.html "Permalink")

### Companion [object StrictForm](StrictForm$.html "See companion object")

#### sealed abstract  class StrictForm extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Read\-only abstraction on top of `application/x-www-form-urlencoded` and multipart form data,
allowing joint unmarshalling access to either kind, \*\*if\*\* you supply both, a [akka.http.scaladsl.unmarshalling.FromStringUnmarshaller](../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])
as well as a [akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T]) for the target type `T`.
Note: In order to allow for random access to the field values streamed multipart form data are strictified!
Don't use this abstraction on potentially unbounded forms (e.g. large file uploads).

If you only need to consume one type of form (`application/x-www-form-urlencoded` \*or\* multipart) then
simply unmarshal directly to the respective form abstraction ([akka.http.scaladsl.model.FormData](../model/FormData.html) or [akka.http.scaladsl.model.Multipart.FormData](../model/Multipart$$FormData.html))
rather than going through StrictForm.

Simple usage example:

```
val strictFormFuture = Unmarshal(entity).to[StrictForm]
val fooFieldUnmarshalled: Future[T] =
  strictFormFuture flatMap { form =>
    Unmarshal(form field "foo").to[T]
  }
```
Source[StrictForm.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/common/StrictForm.scala#L39)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StrictForm
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

1. [**](../../../../akka/http/scaladsl/common/StrictForm.html#fields:Seq[(String,akka.http.scaladsl.common.StrictForm.Field)] "Permalink") abstract  def fields: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(String, [Field](StrictForm$$Field.html))]
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/common/StrictForm.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/common/StrictForm.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/common/StrictForm.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StrictForm toany2stringadd\[StrictForm] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/common/StrictForm.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StrictForm, B)ImplicitThis member is added by an implicit conversion from StrictForm toArrowAssoc\[StrictForm] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/common/StrictForm.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/common/StrictForm.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/common/StrictForm.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/common/StrictForm.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StrictForm) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrictFormImplicitThis member is added by an implicit conversion from StrictForm toEnsuring\[StrictForm] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/common/StrictForm.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StrictForm) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrictFormImplicitThis member is added by an implicit conversion from StrictForm toEnsuring\[StrictForm] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/common/StrictForm.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrictFormImplicitThis member is added by an implicit conversion from StrictForm toEnsuring\[StrictForm] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/common/StrictForm.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrictFormImplicitThis member is added by an implicit conversion from StrictForm toEnsuring\[StrictForm] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/common/StrictForm.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/common/StrictForm.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/common/StrictForm.html#field(name:String):Option[akka.http.scaladsl.common.StrictForm.Field] "Permalink")  def field(name: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Field](StrictForm$$Field.html)]
15. [**](../../../../akka/http/scaladsl/common/StrictForm.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/common/StrictForm.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/common/StrictForm.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/common/StrictForm.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/common/StrictForm.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/common/StrictForm.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/common/StrictForm.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/common/StrictForm.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/http/scaladsl/common/StrictForm.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/http/scaladsl/common/StrictForm.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/http/scaladsl/common/StrictForm.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/common/StrictForm.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/common/StrictForm.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StrictForm toStringFormat\[StrictForm] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/common/StrictForm.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StrictForm, B)ImplicitThis member is added by an implicit conversion from StrictForm toArrowAssoc\[StrictForm] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStrictForm to any2stringadd\[StrictForm]

### Inherited by implicit conversion StringFormat fromStrictForm to StringFormat\[StrictForm]

### Inherited by implicit conversion Ensuring fromStrictForm to Ensuring\[StrictForm]

### Inherited by implicit conversion ArrowAssoc fromStrictForm to ArrowAssoc\[StrictForm]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/JsonEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameDefaultReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameDefaultUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameOptionUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/RepeatedValueReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/RequiredValueReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/RequiredValueUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/SSLContextFactory$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/StrictForm$$Field.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/StrictForm$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/StrictForm.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/ToNameReceptacleEnhancements$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart$$FormData.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/StrictForm.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/StrictForm.html)*