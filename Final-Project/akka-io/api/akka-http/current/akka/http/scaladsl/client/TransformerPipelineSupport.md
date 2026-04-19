---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.client.TransformerPipelineSupport
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:44:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.client.TransformerPipelineSupport
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.client.TransformerPipelineSupport

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.client.TransformerPipelineSupport

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](index.html)Definition Classes[scaladsl](../index.html)
- [RequestBuilding](RequestBuilding.html)
- [TransformerAux](TransformerAux.html)
- TransformerPipelineSupport
[t](TransformerPipelineSupport$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[client](index.html)

# [TransformerPipelineSupport](TransformerPipelineSupport$.html "See companion object")[**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html "Permalink")

### Companion [object TransformerPipelineSupport](TransformerPipelineSupport$.html "See companion object")

#### trait TransformerPipelineSupport extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[TransformerPipelineSupport.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/client/TransformerPipelineSupport.scala#L10)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[RequestBuilding](RequestBuilding.html), [RequestBuilding](RequestBuilding$.html), [TransformerPipelineSupport](TransformerPipelineSupport$.html), [RouteTest](../testkit/RouteTest.html), [ScalatestRouteTest](../testkit/ScalatestRouteTest.html), [Specs2RouteTest](../testkit/Specs2RouteTest.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TransformerPipelineSupport
2. AnyRef
3. Any
Implicitly  
1. by WithTransformation
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformation.html "Permalink") implicit  class [WithTransformation](TransformerPipelineSupport$WithTransformation.html)\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformerConcatenation.html "Permalink") implicit  class [WithTransformerConcatenation](TransformerPipelineSupport$WithTransformerConcatenation.html)\[A, B] extends (A) \=\> B
### Value Members

1. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TransformerPipelineSupport toany2stringadd\[TransformerPipelineSupport] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TransformerPipelineSupport, B)ImplicitThis member is added by an implicit conversion from TransformerPipelineSupport toArrowAssoc\[TransformerPipelineSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TransformerPipelineSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TransformerPipelineSupportImplicitThis member is added by an implicit conversion from TransformerPipelineSupport toEnsuring\[TransformerPipelineSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TransformerPipelineSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TransformerPipelineSupportImplicitThis member is added by an implicit conversion from TransformerPipelineSupport toEnsuring\[TransformerPipelineSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TransformerPipelineSupportImplicitThis member is added by an implicit conversion from TransformerPipelineSupport toEnsuring\[TransformerPipelineSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TransformerPipelineSupportImplicitThis member is added by an implicit conversion from TransformerPipelineSupport toEnsuring\[TransformerPipelineSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#logValue[T](logFun:T=>Unit):T=>T "Permalink")  def logValue\[T](logFun: (T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): (T) \=\> T
18. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#logValue[T](log:akka.event.LoggingAdapter,level:akka.event.Logging.LogLevel):T=>T "Permalink")  def logValue\[T](log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), level: LogLevel \= [Logging.DebugLevel](../../../index.html)): (T) \=\> T
19. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#~>[B](f:A=>B):B "Permalink")  def \~\>\[B](f: (TransformerPipelineSupport) \=\> B): BImplicitThis member is added by an implicit conversion from TransformerPipelineSupport to[TransformerPipelineSupport.WithTransformation](TransformerPipelineSupport$.html#WithTransformation[A]extendsAnyRef)\[TransformerPipelineSupport] performed by method WithTransformation in akka.http.scaladsl.client.TransformerPipelineSupport.Definition Classes[WithTransformation](TransformerPipelineSupport$WithTransformation.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TransformerPipelineSupport toStringFormat\[TransformerPipelineSupport] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/client/TransformerPipelineSupport.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TransformerPipelineSupport, B)ImplicitThis member is added by an implicit conversion from TransformerPipelineSupport toArrowAssoc\[TransformerPipelineSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion WithTransformation fromTransformerPipelineSupport to [TransformerPipelineSupport.WithTransformation](TransformerPipelineSupport$.html#WithTransformation[A]extendsAnyRef)\[TransformerPipelineSupport]

### Inherited by implicit conversion any2stringadd fromTransformerPipelineSupport to any2stringadd\[TransformerPipelineSupport]

### Inherited by implicit conversion StringFormat fromTransformerPipelineSupport to StringFormat\[TransformerPipelineSupport]

### Inherited by implicit conversion Ensuring fromTransformerPipelineSupport to Ensuring\[TransformerPipelineSupport]

### Inherited by implicit conversion ArrowAssoc fromTransformerPipelineSupport to ArrowAssoc\[TransformerPipelineSupport]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerAux$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerAux.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformation.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport$WithTransformerConcatenation.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2RouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.html)*