---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.common.NameReceptacle
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:44:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameReceptacle.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.common.NameReceptacle
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.common.NameReceptacle

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.common.NameReceptacle

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
- NameReceptacle
- [NameUnmarshallerReceptacle](NameUnmarshallerReceptacle.html)
- [RepeatedValueReceptacle](RepeatedValueReceptacle.html)
- [RepeatedValueUnmarshallerReceptacle](RepeatedValueUnmarshallerReceptacle.html)
- [RequiredValueReceptacle](RequiredValueReceptacle.html)
- [RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html)
- [SSLContextFactory](SSLContextFactory$.html)
- [StrictForm](StrictForm.html "Read-only abstraction on top of application/x-www-form-urlencoded and multipart form data, allowing joint unmarshalling access to either kind, **if** you supply both, a akka.http.scaladsl.unmarshalling.FromStringUnmarshaller as well as a akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller for the target type T.")
- [ToNameReceptacleEnhancements](ToNameReceptacleEnhancements$.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[common](index.html)

# NameReceptacle[**](../../../../akka/http/scaladsl/common/NameReceptacle.html "Permalink")

### 

#### class NameReceptacle\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[NameReceptacle.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/common/NameReceptacle.scala#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NameReceptacle
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
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#<init>(name:String):akka.http.scaladsl.common.NameReceptacle[T] "Permalink")  new NameReceptacle(name: String)
### Value Members

1. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#![B](requiredValue:B):akka.http.scaladsl.common.RequiredValueReceptacle[B] "Permalink")  def !\[B](requiredValue: B): [RequiredValueReceptacle](RequiredValueReceptacle.html)\[B]Require the given value and extract nothing.

Require the given value and extract nothing.
Reject if it is missing or has a different value.
Symbolic alias for [requiredValue](#requiredValue[B](requiredValue:B):akka.http.scaladsl.common.RequiredValueReceptacle[B]).
2. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#*:akka.http.scaladsl.common.RepeatedValueReceptacle[T] "Permalink")  def \*: [RepeatedValueReceptacle](RepeatedValueReceptacle.html)\[T]Extract multiple occurrences as `Iterable[String]`.

Extract multiple occurrences as `Iterable[String]`.
Symbolic alias for [repeated](#repeated:akka.http.scaladsl.common.RepeatedValueReceptacle[T]).
5. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NameReceptacle\[T] toany2stringadd\[NameReceptacle\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
6. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NameReceptacle\[T], B)ImplicitThis member is added by an implicit conversion from NameReceptacle\[T] toArrowAssoc\[NameReceptacle\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
7. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#?[B](default:B):akka.http.scaladsl.common.NameDefaultReceptacle[B] "Permalink")  def ?\[B](default: B): [NameDefaultReceptacle](NameDefaultReceptacle.html)\[B]Extract the optional value as `String`, if it is missing use the given default value.

Extract the optional value as `String`, if it is missing use the given default value.
Symbolic alias for [withDefault](#withDefault[B](default:B):akka.http.scaladsl.common.NameDefaultReceptacle[B]).
9. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#?:akka.http.scaladsl.common.NameOptionReceptacle[T] "Permalink")  def ?: [NameOptionReceptacle](NameOptionReceptacle.html)\[T]Extract the optional value as `Option[String]`.

Extract the optional value as `Option[String]`.
Symbolic alias for [optional](#optional:akka.http.scaladsl.common.NameOptionReceptacle[T]).
10. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#as[B](unmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[T,B])(implicitfsu:akka.http.scaladsl.unmarshalling.FromStringUnmarshaller[T]):akka.http.scaladsl.common.NameUnmarshallerReceptacle[B] "Permalink")  def as\[B](unmarshaller: [Unmarshaller](../unmarshalling/Unmarshaller.html)\[T, B])(implicit fsu: [FromStringUnmarshaller](../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])\[T]): [NameUnmarshallerReceptacle](NameUnmarshallerReceptacle.html)\[B]Extract the value as the specified type with the given [akka.http.scaladsl.unmarshalling.Unmarshaller](../unmarshalling/Unmarshaller.html).
11. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#as[B]:akka.http.scaladsl.common.NameReceptacle[B] "Permalink")  def as\[B]: NameReceptacle\[B]Extract the value as the specified type.

Extract the value as the specified type.
You need a matching [akka.http.scaladsl.unmarshalling.Unmarshaller](../unmarshalling/Unmarshaller.html) in scope for that to work.
12. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NameReceptacle\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NameReceptacle\[T]ImplicitThis member is added by an implicit conversion from NameReceptacle\[T] toEnsuring\[NameReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NameReceptacle\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NameReceptacle\[T]ImplicitThis member is added by an implicit conversion from NameReceptacle\[T] toEnsuring\[NameReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NameReceptacle\[T]ImplicitThis member is added by an implicit conversion from NameReceptacle\[T] toEnsuring\[NameReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NameReceptacle\[T]ImplicitThis member is added by an implicit conversion from NameReceptacle\[T] toEnsuring\[NameReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#name:String "Permalink")  val name: String
24. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#optional:akka.http.scaladsl.common.NameOptionReceptacle[T] "Permalink")  def optional: [NameOptionReceptacle](NameOptionReceptacle.html)\[T]Extract the optional value as `Option[String]`.
28. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#repeated:akka.http.scaladsl.common.RepeatedValueReceptacle[T] "Permalink")  def repeated: [RepeatedValueReceptacle](RepeatedValueReceptacle.html)\[T]Extract multiple occurrences as `Iterable[String]`.
29. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#requiredValue[B](requiredValue:B):akka.http.scaladsl.common.RequiredValueReceptacle[B] "Permalink")  def requiredValue\[B](requiredValue: B): [RequiredValueReceptacle](RequiredValueReceptacle.html)\[B]Require the given value and extract nothing.

Require the given value and extract nothing.
Reject if it is missing or has a different value.
30. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#withDefault[B](default:B):akka.http.scaladsl.common.NameDefaultReceptacle[B] "Permalink")  def withDefault\[B](default: B): [NameDefaultReceptacle](NameDefaultReceptacle.html)\[B]Extract the optional value as `String`, if it is missing use the given default value.
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NameReceptacle\[T] toStringFormat\[NameReceptacle\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/common/NameReceptacle.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NameReceptacle\[T], B)ImplicitThis member is added by an implicit conversion from NameReceptacle\[T] toArrowAssoc\[NameReceptacle\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNameReceptacle\[T] to any2stringadd\[NameReceptacle\[T]]

### Inherited by implicit conversion StringFormat fromNameReceptacle\[T] to StringFormat\[NameReceptacle\[T]]

### Inherited by implicit conversion Ensuring fromNameReceptacle\[T] to Ensuring\[NameReceptacle\[T]]

### Inherited by implicit conversion ArrowAssoc fromNameReceptacle\[T] to ArrowAssoc\[NameReceptacle\[T]]

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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/StrictForm$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/StrictForm.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/ToNameReceptacleEnhancements$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameReceptacle.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameReceptacle.html)*