---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.client.TransformerAux
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:44:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerAux$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.client.TransformerAux
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.client.TransformerAux

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.client.TransformerAux

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](index.html)Definition Classes[scaladsl](../index.html)
- [RequestBuilding](RequestBuilding.html)
- [TransformerAux](TransformerAux.html)
- [TransformerPipelineSupport](TransformerPipelineSupport.html)
[o](TransformerAux.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[client](index.html)

# [TransformerAux](TransformerAux.html "See companion trait")[**](../../../../akka/http/scaladsl/client/TransformerAux$.html "Permalink")

### Companion [trait TransformerAux](TransformerAux.html "See companion trait")

#### object TransformerAux

Source[TransformerPipelineSupport.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/client/TransformerPipelineSupport.scala#L37)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TransformerAux
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#aux1[A,B,C]:akka.http.scaladsl.client.TransformerAux[A,B,B,C,C] "Permalink") implicit  def aux1\[A, B, C]: [TransformerAux](TransformerAux.html)\[A, B, B, C, C]
6. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#aux2[A,B,C](implicitec:scala.concurrent.ExecutionContext):akka.http.scaladsl.client.TransformerAux[A,scala.concurrent.Future[B],B,C,scala.concurrent.Future[C]] "Permalink") implicit  def aux2\[A, B, C](implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [TransformerAux](TransformerAux.html)\[A, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B], B, C, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[C]]
7. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#aux3[A,B,C](implicitec:scala.concurrent.ExecutionContext):akka.http.scaladsl.client.TransformerAux[A,scala.concurrent.Future[B],B,scala.concurrent.Future[C],scala.concurrent.Future[C]] "Permalink") implicit  def aux3\[A, B, C](implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [TransformerAux](TransformerAux.html)\[A, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B], B, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[C], [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[C]]
8. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/client/TransformerAux$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/RequestBuilding.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerAux$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerAux.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerPipelineSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerAux$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/TransformerAux$.html)*