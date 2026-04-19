---
description: Akka 2.10.17 - akka.remote.artery.TestManagementCommands
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/artery/TestManagementCommands$.html
title: Akka 2.10.17 - akka.remote.artery.TestManagementCommands
---

# Akka 2.10.17 - akka.remote.artery.TestManagementCommands

> **Summary:** Akka 2.10.17 - akka.remote.artery.TestManagementCommands

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/artery/index.html "Permalink")  package [artery](index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/artery/aeron/index.html "Permalink")  package [aeron](aeron/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/compress/index.html "Permalink")  package [compress](compress/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/jfr/index.html "Permalink")  package [jfr](jfr/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/tcp/index.html "Permalink")  package [tcp](tcp/index.html)Definition Classes[artery](index.html)
- [GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html)
- [QuarantinedEvent](QuarantinedEvent.html)
- [RemoteInstrument](RemoteInstrument.html "INTERNAL API")
- [RemotingFlightRecorder](RemotingFlightRecorder$.html "INTERNAL API")
- TestManagementCommands
- [ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html)
o[akka](../../index.html).[remote](../index.html).[artery](index.html)

# TestManagementCommands[**](../../../akka/remote/artery/TestManagementCommands$.html "Permalink")

### 

#### object TestManagementCommands

Source[TestStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/artery/TestStage.scala#L22)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestManagementCommands
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/remote/artery/TestManagementCommands$$FailInboundStreamOnce.html "Permalink") final  case class [FailInboundStreamOnce](TestManagementCommands$$FailInboundStreamOnce.html "INTERNAL API")(ex: Throwable) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableINTERNAL API

INTERNAL API

Annotations@SerialVersionUID()
### Value Members

1. [**](../../../akka/remote/artery/TestManagementCommands$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/artery/TestManagementCommands$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/artery/TestManagementCommands$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/remote/artery/TestManagementCommands$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/remote/artery/TestManagementCommands$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/remote/artery/TestManagementCommands$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/remote/artery/TestManagementCommands$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/remote/artery/TestManagementCommands$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/remote/artery/TestManagementCommands$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/remote/artery/TestManagementCommands$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/remote/artery/TestManagementCommands$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/remote/artery/TestManagementCommands$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/remote/artery/TestManagementCommands$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/remote/artery/TestManagementCommands$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/remote/artery/TestManagementCommands$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/remote/artery/TestManagementCommands$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/remote/artery/TestManagementCommands$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/remote/artery/TestManagementCommands$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/artery/TestManagementCommands$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/GracefulShutdownQuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/QuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/RemoteInstrument.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/RemotingFlightRecorder$.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/TestManagementCommands$$FailInboundStreamOnce.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/TestManagementCommands$.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/ThisActorSystemQuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/aeron/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/compress/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/jfr/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/artery/TestManagementCommands$.html](https://doc.akka.io/api/akka/current/akka/remote/artery/TestManagementCommands$.html)*