---
description: Akka gRPC 2.5.10 - akka.grpc.scaladsl.headers.Status
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Status$.html
title: Akka gRPC 2.5.10 - akka.grpc.scaladsl.headers.Status
---

# Akka gRPC 2.5.10 - akka.grpc.scaladsl.headers.Status

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.scaladsl.headers.Status

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../akka/grpc/scaladsl/headers/index.html "Permalink")  package [headers](index.html)Definition Classes[scaladsl](../index.html)
- [Message\-Accept\-Encoding](Message$minusAccept$minusEncoding.html)
- [Message\-Encoding](Message$minusEncoding.html)
- [Status](Status.html)
- [Status\-Message](Status$minusMessage.html)
[o](Status.html "See companion class")[akka](../../../index.html).[grpc](../../index.html).[scaladsl](../index.html).[headers](index.html)

# [Status](Status.html "See companion class")[**](../../../../akka/grpc/scaladsl/headers/Status$.html "Permalink")

### Companion [class Status](Status.html "See companion class")

#### object Status extends ModeledCustomHeaderCompanion\[[Status](Status.html)]

Source[headers.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/scaladsl/headers/headers.scala#L76)Linear SupertypesModeledCustomHeaderCompanion\[[Status](Status.html)], AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Status
2. ModeledCustomHeaderCompanion
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../akka/grpc/scaladsl/headers/Status$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#apply(value:String):H "Permalink")  def apply(value: String): [Status](Status.html)Definition ClassesModeledCustomHeaderCompanion
5. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
9. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#findIn(headers:Seq[akka.http.scaladsl.model.HttpHeader]):Option[Int] "Permalink")  def findIn(headers: Seq\[HttpHeader]): Option\[Int]
10. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#implicitlyLocatableCompanion:akka.http.scaladsl.model.headers.ModeledCustomHeaderCompanion[H] "Permalink") implicit final  val implicitlyLocatableCompanion: ModeledCustomHeaderCompanion\[[Status](Status.html)]Definition ClassesModeledCustomHeaderCompanion
13. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
14. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#lowercaseName:String "Permalink")  val lowercaseName: StringDefinition ClassesStatus → ModeledCustomHeaderCompanion
15. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#name:String "Permalink")  val name: [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesStatus → ModeledCustomHeaderCompanion
16. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
17. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
18. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
19. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#parse(value:String):scala.util.Try[akka.grpc.scaladsl.headers.Status] "Permalink")  def parse(value: String): Try\[[Status](Status.html)]Definition ClassesStatus → ModeledCustomHeaderCompanion
20. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#unapply(h:akka.http.scaladsl.model.HttpHeader):Option[String] "Permalink")  def unapply(h: HttpHeader): Option\[String]Definition ClassesModeledCustomHeaderCompanion
23. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../akka/grpc/scaladsl/headers/Status$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from ModeledCustomHeaderCompanion\[[Status](Status.html)]

### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-grpc/current/akka/grpc/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Message$minusAccept$minusEncoding$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Message$minusAccept$minusEncoding.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Message$minusEncoding$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Message$minusEncoding.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Status$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Status$minusMessage$.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Status$minusMessage.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Status.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/index.html
- https://doc.akka.io/api/akka-grpc/current/akka/index.html
- https://doc.akka.io/api/akka-grpc/current/index.html

---
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Status$.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Status$.html)*