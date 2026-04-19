---
description: Akka gRPC 2.5.10 - akka.grpc.internal.AkkaHttpClientUtils.ResponsePromise
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html
title: Akka gRPC 2.5.10 - akka.grpc.internal.AkkaHttpClientUtils.ResponsePromise
---

# Akka gRPC 2.5.10 - akka.grpc.internal.AkkaHttpClientUtils.ResponsePromise

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.internal.AkkaHttpClientUtils.ResponsePromise

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/grpc/index.html "Permalink")  package [grpc](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/grpc/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[grpc](../index.html)
- [**](../../../akka/grpc/internal/AkkaHttpClientUtils$.html "Permalink")  object [AkkaHttpClientUtils](AkkaHttpClientUtils$.html "INTERNAL API")INTERNAL API

INTERNAL API

Definition Classes[internal](index.html)Annotations@InternalApi()
- ResponsePromise
[c](AkkaHttpClientUtils$$ResponsePromise$.html "See companion object")[akka](../../index.html).[grpc](../index.html).[internal](index.html).[AkkaHttpClientUtils](AkkaHttpClientUtils$.html)

# [ResponsePromise](AkkaHttpClientUtils$$ResponsePromise$.html "See companion object")[**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html "Permalink")

### Companion [object ResponsePromise](AkkaHttpClientUtils$$ResponsePromise$.html "See companion object")

#### case class ResponsePromise(promise: Promise\[HttpResponse]) extends RequestResponseAssociation with Product with Serializable

Source[AkkaHttpClientUtils.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/internal/AkkaHttpClientUtils.scala#L368)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), Product, Equals, RequestResponseAssociation, RequestResponseAssociation, AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ResponsePromise
2. Serializable
3. Product
4. Equals
5. RequestResponseAssociation
6. RequestResponseAssociation
7. AnyRef
8. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#<init>(promise:scala.concurrent.Promise[akka.http.scaladsl.model.HttpResponse]):akka.grpc.internal.AkkaHttpClientUtils.ResponsePromise "Permalink")  new ResponsePromise(promise: Promise\[HttpResponse])
### Value Members

1. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
8. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
9. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
10. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
11. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
12. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
13. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#promise:scala.concurrent.Promise[akka.http.scaladsl.model.HttpResponse] "Permalink")  val promise: Promise\[HttpResponse]
14. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
16. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from Product

### Inherited from Equals

### Inherited from RequestResponseAssociation

### Inherited from RequestResponseAssociation

### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AkkaHttpClientUtils$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/internal/AkkaHttpClientUtils$$ResponsePromise.html)*