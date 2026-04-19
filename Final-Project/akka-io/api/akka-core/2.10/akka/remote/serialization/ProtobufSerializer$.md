---
description: Akka 2.10.17 - akka.remote.serialization.ProtobufSerializer
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/serialization/ProtobufSerializer$.html
title: Akka 2.10.17 - akka.remote.serialization.ProtobufSerializer
---

# Akka 2.10.17 - akka.remote.serialization.ProtobufSerializer

> **Summary:** Akka 2.10.17 - akka.remote.serialization.ProtobufSerializer

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/serialization/index.html "Permalink")  package [serialization](index.html)Definition Classes[remote](../index.html)
- [ByteStringSerializer](ByteStringSerializer.html)
- [IntSerializer](IntSerializer.html)
- [LongSerializer](LongSerializer.html)
- [MessageContainerSerializer](MessageContainerSerializer.html)
- [MiscMessageSerializer](MiscMessageSerializer.html)
- [ProtobufSerializer](ProtobufSerializer.html "This Serializer serializes akka.protobufv3.internal.GeneratedMessageV3 and com.google.protobuf.Message It is using reflection to find the parseFrom and toByteArray methods to avoid dependency to com.google.protobuf.")
- [StringSerializer](StringSerializer.html)
- [SystemMessageSerializer](SystemMessageSerializer.html)
- [ThrowableNotSerializableException](ThrowableNotSerializableException.html "Use as replacement for an original exception when it can't be serialized or deserialized.")
[o](ProtobufSerializer.html "See companion class")[akka](../../index.html).[remote](../index.html).[serialization](index.html)

# [ProtobufSerializer](ProtobufSerializer.html "See companion class")[**](../../../akka/remote/serialization/ProtobufSerializer$.html "Permalink")

### Companion [class ProtobufSerializer](ProtobufSerializer.html "See companion class")

#### object ProtobufSerializer

Source[ProtobufSerializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/serialization/ProtobufSerializer.scala#L20)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ProtobufSerializer
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/serialization/ProtobufSerializer$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#deserializeActorRef(system:akka.actor.ExtendedActorSystem,refProtocol:akka.remote.WireFormats.ActorRefData):akka.actor.ActorRef "Permalink")  def deserializeActorRef(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html), refProtocol: ActorRefData): [ActorRef](../../actor/ActorRef.html)Helper to materialize (lookup) an [akka.actor.ActorRef](../../actor/ActorRef.html)
from Akka's protobuf representation in the supplied
[akka.actor.ActorSystem](../../actor/ActorSystem.html).
7. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#serializeActorRef(ref:akka.actor.ActorRef):akka.remote.WireFormats.ActorRefData "Permalink")  def serializeActorRef(ref: [ActorRef](../../actor/ActorRef.html)): ActorRefDataHelper to serialize an [akka.actor.ActorRef](../../actor/ActorRef.html) to Akka's
protobuf representation.
16. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/serialization/ProtobufSerializer$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/ByteStringSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/IntSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/LongSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/MessageContainerSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/MiscMessageSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/ProtobufSerializer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/ProtobufSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/StringSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/SystemMessageSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/ThrowableNotSerializableException.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/ProtobufSerializer$.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/ProtobufSerializer$.html)*