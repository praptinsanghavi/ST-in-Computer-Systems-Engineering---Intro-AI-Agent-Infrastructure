---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.common.NameUnmarshallerReceptacle
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:05:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.common.NameUnmarshallerReceptacle
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.common.NameUnmarshallerReceptacle

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.common.NameUnmarshallerReceptacle

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
- NameUnmarshallerReceptacle
- [RepeatedValueReceptacle](RepeatedValueReceptacle.html)
- [RepeatedValueUnmarshallerReceptacle](RepeatedValueUnmarshallerReceptacle.html)
- [RequiredValueReceptacle](RequiredValueReceptacle.html)
- [RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html)
- [SSLContextFactory](SSLContextFactory$.html)
- [StrictForm](StrictForm.html "Read-only abstraction on top of application/x-www-form-urlencoded and multipart form data, allowing joint unmarshalling access to either kind, **if** you supply both, a akka.http.scaladsl.unmarshalling.FromStringUnmarshaller as well as a akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller for the target type T.")
- [ToNameReceptacleEnhancements](ToNameReceptacleEnhancements$.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[common](index.html)

# NameUnmarshallerReceptacle[**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html "Permalink")

### 

#### class NameUnmarshallerReceptacle\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[NameReceptacle.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/common/NameReceptacle.scala#L76)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NameUnmarshallerReceptacle
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

1. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#<init>(name:String,um:akka.http.scaladsl.unmarshalling.FromStringUnmarshaller[T]):akka.http.scaladsl.common.NameUnmarshallerReceptacle[T] "Permalink")  new NameUnmarshallerReceptacle(name: String, um: [FromStringUnmarshaller](../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])\[T])
### Value Members

1. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#!(requiredValue:T):akka.http.scaladsl.common.RequiredValueUnmarshallerReceptacle[T] "Permalink")  def !(requiredValue: T): [RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html)\[T]Require the given value and extract nothing.

Require the given value and extract nothing.
Reject if it is missing or has a different value.
Symbolic alias for [requiredValue](#requiredValue(requiredValue:T):akka.http.scaladsl.common.RequiredValueUnmarshallerReceptacle[T]).
2. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#*:akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle[T] "Permalink")  def \*: [RepeatedValueUnmarshallerReceptacle](RepeatedValueUnmarshallerReceptacle.html)\[T]Extract multiple occurrences as `Iterable[String]`.

Extract multiple occurrences as `Iterable[String]`.
Symbolic alias for [repeated](#repeated:akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle[T]).
5. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NameUnmarshallerReceptacle\[T] toany2stringadd\[NameUnmarshallerReceptacle\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
6. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NameUnmarshallerReceptacle\[T], B)ImplicitThis member is added by an implicit conversion from NameUnmarshallerReceptacle\[T] toArrowAssoc\[NameUnmarshallerReceptacle\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
7. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#?(default:T):akka.http.scaladsl.common.NameDefaultUnmarshallerReceptacle[T] "Permalink")  def ?(default: T): [NameDefaultUnmarshallerReceptacle](NameDefaultUnmarshallerReceptacle.html)\[T]Extract the optional value as `T`, if it is missing use the given default value.

Extract the optional value as `T`, if it is missing use the given default value.
Symbolic alias for [withDefault](#withDefault(default:T):akka.http.scaladsl.common.NameDefaultUnmarshallerReceptacle[T]).
9. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#?:akka.http.scaladsl.common.NameOptionUnmarshallerReceptacle[T] "Permalink")  def ?: [NameOptionUnmarshallerReceptacle](NameOptionUnmarshallerReceptacle.html)\[T]Extract the optional value as `Option[T]`.

Extract the optional value as `Option[T]`.
Symbolic alias for [optional](#optional:akka.http.scaladsl.common.NameOptionUnmarshallerReceptacle[T]).
10. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#as[B](implicitunmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[T,B]):akka.http.scaladsl.common.NameUnmarshallerReceptacle[B] "Permalink")  def as\[B](implicit unmarshaller: [Unmarshaller](../unmarshalling/Unmarshaller.html)\[T, B]): NameUnmarshallerReceptacle\[B]Extract the value as the specified type.

Extract the value as the specified type.
You need a matching [akka.http.scaladsl.unmarshalling.Unmarshaller](../unmarshalling/Unmarshaller.html) in scope for that to work.
11. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NameUnmarshallerReceptacle\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NameUnmarshallerReceptacle\[T]ImplicitThis member is added by an implicit conversion from NameUnmarshallerReceptacle\[T] toEnsuring\[NameUnmarshallerReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NameUnmarshallerReceptacle\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NameUnmarshallerReceptacle\[T]ImplicitThis member is added by an implicit conversion from NameUnmarshallerReceptacle\[T] toEnsuring\[NameUnmarshallerReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NameUnmarshallerReceptacle\[T]ImplicitThis member is added by an implicit conversion from NameUnmarshallerReceptacle\[T] toEnsuring\[NameUnmarshallerReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NameUnmarshallerReceptacle\[T]ImplicitThis member is added by an implicit conversion from NameUnmarshallerReceptacle\[T] toEnsuring\[NameUnmarshallerReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#name:String "Permalink")  val name: String
23. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#optional:akka.http.scaladsl.common.NameOptionUnmarshallerReceptacle[T] "Permalink")  def optional: [NameOptionUnmarshallerReceptacle](NameOptionUnmarshallerReceptacle.html)\[T]Extract the optional value as `Option[T]`.

Extract the optional value as `Option[T]`.
Symbolic alias for [optional](#optional:akka.http.scaladsl.common.NameOptionUnmarshallerReceptacle[T]).
27. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#repeated:akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle[T] "Permalink")  def repeated: [RepeatedValueUnmarshallerReceptacle](RepeatedValueUnmarshallerReceptacle.html)\[T]Extract multiple occurrences as `Iterable[String]`.
28. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#requiredValue(requiredValue:T):akka.http.scaladsl.common.RequiredValueUnmarshallerReceptacle[T] "Permalink")  def requiredValue(requiredValue: T): [RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html)\[T]Require the given value and extract nothing.

Require the given value and extract nothing.
Reject if it is missing or has a different value.
29. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#um:akka.http.scaladsl.unmarshalling.FromStringUnmarshaller[T] "Permalink")  val um: [FromStringUnmarshaller](../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])\[T]
32. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#withDefault(default:T):akka.http.scaladsl.common.NameDefaultUnmarshallerReceptacle[T] "Permalink")  def withDefault(default: T): [NameDefaultUnmarshallerReceptacle](NameDefaultUnmarshallerReceptacle.html)\[T]Extract the optional value as `T`, if it is missing use the given default value.
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NameUnmarshallerReceptacle\[T] toStringFormat\[NameUnmarshallerReceptacle\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/common/NameUnmarshallerReceptacle.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NameUnmarshallerReceptacle\[T], B)ImplicitThis member is added by an implicit conversion from NameUnmarshallerReceptacle\[T] toArrowAssoc\[NameUnmarshallerReceptacle\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNameUnmarshallerReceptacle\[T] to any2stringadd\[NameUnmarshallerReceptacle\[T]]

### Inherited by implicit conversion StringFormat fromNameUnmarshallerReceptacle\[T] to StringFormat\[NameUnmarshallerReceptacle\[T]]

### Inherited by implicit conversion Ensuring fromNameUnmarshallerReceptacle\[T] to Ensuring\[NameUnmarshallerReceptacle\[T]]

### Inherited by implicit conversion ArrowAssoc fromNameUnmarshallerReceptacle\[T] to ArrowAssoc\[NameUnmarshallerReceptacle\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/EntityStreamingSupport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/JsonEntityStreamingSupport.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/SSLContextFactory$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/StrictForm$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/StrictForm.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/ToNameReceptacleEnhancements$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html)*