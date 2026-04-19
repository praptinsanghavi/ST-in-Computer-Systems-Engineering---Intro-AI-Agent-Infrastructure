---
description: Akka gRPC 2.5.10 - akka.grpc.scaladsl.headers.Message - Encoding
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Message$minusEncoding.html
title: Akka gRPC 2.5.10 - akka.grpc.scaladsl.headers.Message-Encoding
---

# Akka gRPC 2.5.10 - akka.grpc.scaladsl.headers.Message-Encoding

> **Summary:** Akka gRPC 2.5.10 - akka.grpc.scaladsl.headers.Message - Encoding

## Content

Akka gRPC2\.5\.10 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/grpc/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../akka/grpc/scaladsl/headers/index.html "Permalink")  package [headers](index.html)Definition Classes[scaladsl](../index.html)
- [Message\-Accept\-Encoding](Message$minusAccept$minusEncoding.html)
- Message\-Encoding
- [Status](Status.html)
- [Status\-Message](Status$minusMessage.html)
[c](Message$minusEncoding$.html "See companion object")[akka](../../../index.html).[grpc](../../index.html).[scaladsl](../index.html).[headers](index.html)

# [Message\-Encoding](Message$minusEncoding$.html "See companion object")[**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html "Permalink")

### Companion [object Message\-Encoding](Message$minusEncoding$.html "See companion object")

#### final  class Message\-Encoding extends ModeledCustomHeader\[Message\-Encoding]

Annotations@ApiMayChange() Source[headers.scala](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/scala/akka/grpc/scaladsl/headers/headers.scala#L44)Linear SupertypesModeledCustomHeader\[Message\-Encoding], CustomHeader, CustomHeader, HttpHeader, ToStringRenderable, Renderable, HttpHeader, AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Message\-Encoding
2. ModeledCustomHeader
3. CustomHeader
4. CustomHeader
5. HttpHeader
6. ToStringRenderable
7. Renderable
8. HttpHeader
9. AnyRef
10. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#<init>(encoding:String):akka.grpc.scaladsl.headers.Message-Encoding "Permalink")  new Message\-Encoding(encoding: String)
### Value Members

1. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#companion:akka.grpc.scaladsl.headers.Message-Encoding.type "Permalink")  val companion: [Message\-Encoding](Message$minusEncoding$.html).typeDefinition ClassesMessage\-Encoding → ModeledCustomHeader
7. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
9. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#is(nameInLowerCase:String):Boolean "Permalink")  def is(nameInLowerCase: String): BooleanDefinition ClassesHttpHeader → HttpHeader
12. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
13. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#isNot(nameInLowerCase:String):Boolean "Permalink")  def isNot(nameInLowerCase: String): BooleanDefinition ClassesHttpHeader → HttpHeader
14. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#lowercaseName():String "Permalink") final  def lowercaseName(): StringDefinition ClassesModeledCustomHeader → CustomHeader → HttpHeader → HttpHeader
15. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#name():String "Permalink") final  def name(): StringDefinition ClassesModeledCustomHeader → CustomHeader → HttpHeader → HttpHeader
16. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
17. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@native()
18. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@native()
19. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink") final  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesCustomHeader → Renderable
20. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#renderInRequests():Boolean "Permalink")  def renderInRequests(): BooleanDefinition ClassesMessage\-Encoding → HttpHeader
21. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#renderInResponses():Boolean "Permalink")  def renderInResponses(): BooleanDefinition ClassesMessage\-Encoding → HttpHeader
22. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
24. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#unsafeToString:String "Permalink")  def unsafeToString: StringDefinition ClassesHttpHeader
25. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#value():String "Permalink")  def value(): StringDefinition ClassesMessage\-Encoding → CustomHeader → HttpHeader → HttpHeader
26. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../akka/grpc/scaladsl/headers/Message$minusEncoding.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from ModeledCustomHeader\[Message\-Encoding]

### Inherited from CustomHeader

### Inherited from CustomHeader

### Inherited from HttpHeader

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from HttpHeader

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
*Source: [https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Message$minusEncoding.html](https://doc.akka.io/api/akka-grpc/current/akka/grpc/scaladsl/headers/Message$minusEncoding.html)*