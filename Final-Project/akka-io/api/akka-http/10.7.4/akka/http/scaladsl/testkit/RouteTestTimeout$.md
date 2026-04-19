---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.RouteTestTimeout
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:07:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTestTimeout$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.RouteTestTimeout
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.RouteTestTimeout

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.RouteTestTimeout

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
- [WSTestRequestBuilding](WSTestRequestBuilding.html)
[o](RouteTestTimeout.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[testkit](index.html)

# [RouteTestTimeout](RouteTestTimeout.html "See companion class")[**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html "Permalink")

### Companion [class RouteTestTimeout](RouteTestTimeout.html "See companion class")

#### object RouteTestTimeout extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[RouteTestTimeout.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-testkit/src/main/scala/akka/http/scaladsl/testkit/RouteTestTimeout.scala#L13)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RouteTestTimeout
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#default(implicitsystem:akka.actor.ActorSystem):akka.http.scaladsl.testkit.RouteTestTimeout "Permalink") implicit  def default(implicit system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [RouteTestTimeout](RouteTestTimeout.html)
7. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/testkit/RouteTestTimeout$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/MarshallingTestUtils.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTestResultComponent.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTestTimeout$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTestTimeout.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/ScalatestUtils.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2FrameworkInterface$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2RouteTest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2Utils.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/TestFrameworkInterface$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/TestFrameworkInterface.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/WSProbe$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/WSProbe.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/WSTestRequestBuilding$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/WSTestRequestBuilding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTestTimeout$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/RouteTestTimeout$.html)*