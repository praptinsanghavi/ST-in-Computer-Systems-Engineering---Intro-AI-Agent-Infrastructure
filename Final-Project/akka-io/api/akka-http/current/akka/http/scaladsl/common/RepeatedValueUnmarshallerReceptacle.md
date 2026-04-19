---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:44:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle

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
- RepeatedValueUnmarshallerReceptacle
- [RequiredValueReceptacle](RequiredValueReceptacle.html)
- [RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html)
- [SSLContextFactory](SSLContextFactory$.html)
- [StrictForm](StrictForm.html "Read-only abstraction on top of application/x-www-form-urlencoded and multipart form data, allowing joint unmarshalling access to either kind, **if** you supply both, a akka.http.scaladsl.unmarshalling.FromStringUnmarshaller as well as a akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller for the target type T.")
- [ToNameReceptacleEnhancements](ToNameReceptacleEnhancements$.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[common](index.html)

# RepeatedValueUnmarshallerReceptacle[**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html "Permalink")

### 

#### class RepeatedValueUnmarshallerReceptacle\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[NameReceptacle.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/common/NameReceptacle.scala#L146)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RepeatedValueUnmarshallerReceptacle
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

1. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#<init>(name:String,um:akka.http.scaladsl.unmarshalling.FromStringUnmarshaller[T]):akka.http.scaladsl.common.RepeatedValueUnmarshallerReceptacle[T] "Permalink")  new RepeatedValueUnmarshallerReceptacle(name: String, um: [FromStringUnmarshaller](../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])\[T])
### Value Members

1. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RepeatedValueUnmarshallerReceptacle\[T] toany2stringadd\[RepeatedValueUnmarshallerReceptacle\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RepeatedValueUnmarshallerReceptacle\[T], B)ImplicitThis member is added by an implicit conversion from RepeatedValueUnmarshallerReceptacle\[T] toArrowAssoc\[RepeatedValueUnmarshallerReceptacle\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RepeatedValueUnmarshallerReceptacle\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RepeatedValueUnmarshallerReceptacle\[T]ImplicitThis member is added by an implicit conversion from RepeatedValueUnmarshallerReceptacle\[T] toEnsuring\[RepeatedValueUnmarshallerReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RepeatedValueUnmarshallerReceptacle\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RepeatedValueUnmarshallerReceptacle\[T]ImplicitThis member is added by an implicit conversion from RepeatedValueUnmarshallerReceptacle\[T] toEnsuring\[RepeatedValueUnmarshallerReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RepeatedValueUnmarshallerReceptacle\[T]ImplicitThis member is added by an implicit conversion from RepeatedValueUnmarshallerReceptacle\[T] toEnsuring\[RepeatedValueUnmarshallerReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RepeatedValueUnmarshallerReceptacle\[T]ImplicitThis member is added by an implicit conversion from RepeatedValueUnmarshallerReceptacle\[T] toEnsuring\[RepeatedValueUnmarshallerReceptacle\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#name:String "Permalink")  val name: String
18. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#um:akka.http.scaladsl.unmarshalling.FromStringUnmarshaller[T] "Permalink")  val um: [FromStringUnmarshaller](../unmarshalling/index.html#FromStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[String,T])\[T]
24. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RepeatedValueUnmarshallerReceptacle\[T] toStringFormat\[RepeatedValueUnmarshallerReceptacle\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RepeatedValueUnmarshallerReceptacle\[T], B)ImplicitThis member is added by an implicit conversion from RepeatedValueUnmarshallerReceptacle\[T] toArrowAssoc\[RepeatedValueUnmarshallerReceptacle\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRepeatedValueUnmarshallerReceptacle\[T] to any2stringadd\[RepeatedValueUnmarshallerReceptacle\[T]]

### Inherited by implicit conversion StringFormat fromRepeatedValueUnmarshallerReceptacle\[T] to StringFormat\[RepeatedValueUnmarshallerReceptacle\[T]]

### Inherited by implicit conversion Ensuring fromRepeatedValueUnmarshallerReceptacle\[T] to Ensuring\[RepeatedValueUnmarshallerReceptacle\[T]]

### Inherited by implicit conversion ArrowAssoc fromRepeatedValueUnmarshallerReceptacle\[T] to ArrowAssoc\[RepeatedValueUnmarshallerReceptacle\[T]]

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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html)*