---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.WSTestRequestBuilding
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:12:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.WSTestRequestBuilding
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.WSTestRequestBuilding

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.WSTestRequestBuilding

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[scaladsl](../index.html)
- [MarshallingTestUtils](MarshallingTestUtils.html)
- [RouteTest](RouteTest.html)
- [RouteTestResultComponent](RouteTestResultComponent.html)
- [RouteTestTimeout](RouteTestTimeout.html)
- [ScalatestRouteTest](ScalatestRouteTest.html)
- [ScalatestUtils](ScalatestUtils.html)
- [Specs2FrameworkInterface](Specs2FrameworkInterface$.html)
- [Specs2RouteTest](Specs2RouteTest.html)
- [Specs2Utils](Specs2Utils.html)
- [TestFrameworkInterface](TestFrameworkInterface.html)
- [WSProbe](WSProbe.html "A WSProbe is a probe that implements a Flow[Message, Message, Unit] for testing websocket code.")
- WSTestRequestBuilding
[t](WSTestRequestBuilding$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[testkit](index.html)

# [WSTestRequestBuilding](WSTestRequestBuilding$.html "See companion object")[**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html "Permalink")

### Companion [object WSTestRequestBuilding](WSTestRequestBuilding$.html "See companion object")

#### trait WSTestRequestBuilding extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[WSTestRequestBuilding.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-testkit/src/main/scala/akka/http/scaladsl/testkit/WSTestRequestBuilding.scala#L19)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[RouteTest](RouteTest.html), [ScalatestRouteTest](ScalatestRouteTest.html), [Specs2RouteTest](Specs2RouteTest.html), [WSTestRequestBuilding](WSTestRequestBuilding$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WSTestRequestBuilding
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

1. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WSTestRequestBuilding toany2stringadd\[WSTestRequestBuilding] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WSTestRequestBuilding, B)ImplicitThis member is added by an implicit conversion from WSTestRequestBuilding toArrowAssoc\[WSTestRequestBuilding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#WS(uri:akka.http.scaladsl.model.Uri,clientSideHandler:akka.stream.scaladsl.Flow[akka.http.scaladsl.model.ws.Message,akka.http.scaladsl.model.ws.Message,Any],subprotocols:Seq[String])(implicitmaterializer:akka.stream.Materializer):akka.http.scaladsl.model.HttpRequest "Permalink")  def WS(uri: [Uri](../model/Uri.html), clientSideHandler: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[Message](../model/ws/Message.html), [Message](../model/ws/Message.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], subprotocols: Seq\[String] \= Nil)(implicit materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [HttpRequest](../model/HttpRequest.html)Annotations@nowarn()
7. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WSTestRequestBuilding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WSTestRequestBuildingImplicitThis member is added by an implicit conversion from WSTestRequestBuilding toEnsuring\[WSTestRequestBuilding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WSTestRequestBuilding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WSTestRequestBuildingImplicitThis member is added by an implicit conversion from WSTestRequestBuilding toEnsuring\[WSTestRequestBuilding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WSTestRequestBuildingImplicitThis member is added by an implicit conversion from WSTestRequestBuilding toEnsuring\[WSTestRequestBuilding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WSTestRequestBuildingImplicitThis member is added by an implicit conversion from WSTestRequestBuilding toEnsuring\[WSTestRequestBuilding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WSTestRequestBuilding toStringFormat\[WSTestRequestBuilding] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/testkit/WSTestRequestBuilding.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WSTestRequestBuilding, B)ImplicitThis member is added by an implicit conversion from WSTestRequestBuilding toArrowAssoc\[WSTestRequestBuilding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromWSTestRequestBuilding to any2stringadd\[WSTestRequestBuilding]

### Inherited by implicit conversion StringFormat fromWSTestRequestBuilding to StringFormat\[WSTestRequestBuilding]

### Inherited by implicit conversion Ensuring fromWSTestRequestBuilding to Ensuring\[WSTestRequestBuilding]

### Inherited by implicit conversion ArrowAssoc fromWSTestRequestBuilding to ArrowAssoc\[WSTestRequestBuilding]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/MarshallingTestUtils.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTest$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTestResultComponent.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTestTimeout$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTestTimeout.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/ScalatestUtils.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2FrameworkInterface$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2RouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2Utils.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSProbe$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSProbe.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding.html)*