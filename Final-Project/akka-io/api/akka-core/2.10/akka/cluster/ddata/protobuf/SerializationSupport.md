---
description: Akka 2.10.17 - akka.cluster.ddata.protobuf.SerializationSupport
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:40:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/protobuf/SerializationSupport.html
title: Akka 2.10.17 - akka.cluster.ddata.protobuf.SerializationSupport
---

# Akka 2.10.17 - akka.cluster.ddata.protobuf.SerializationSupport

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.protobuf.SerializationSupport

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/ddata/protobuf/index.html "Permalink")  package [protobuf](index.html)Definition Classes[ddata](../index.html)
- [**](../../../../akka/cluster/ddata/protobuf/msg/index.html "Permalink")  package [msg](msg/index.html)Definition Classes[protobuf](index.html)
- [AbstractSerializationSupport](AbstractSerializationSupport.html "Java API")
- [OtherMessageComparator](OtherMessageComparator$.html)
- [ReplicatedDataSerializer](ReplicatedDataSerializer.html "Protobuf serializer of ReplicatedData.")
- [ReplicatorMessageSerializer](ReplicatorMessageSerializer.html "Protobuf serializer of ReplicatorMessage messages.")
- SerializationSupport
t[akka](../../../index.html).[cluster](../../index.html).[ddata](../index.html).[protobuf](index.html)

# SerializationSupport[**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html "Permalink")

### 

#### trait SerializationSupport extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Some useful serialization helper methods.

Source[SerializationSupport.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/protobuf/SerializationSupport.scala#L30)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AbstractSerializationSupport](AbstractSerializationSupport.html), [ReplicatedDataSerializer](ReplicatedDataSerializer.html), [ReplicatorMessageSerializer](ReplicatorMessageSerializer.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SerializationSupport
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
### Abstract Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#system:akka.actor.ExtendedActorSystem "Permalink") abstract  def system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html)
### Concrete Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SerializationSupport toany2stringadd\[SerializationSupport] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SerializationSupport, B)ImplicitThis member is added by an implicit conversion from SerializationSupport toArrowAssoc\[SerializationSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#addressFromProto(address:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address):akka.actor.Address "Permalink")  def addressFromProto(address: Address): [Address](../../../actor/Address.html)
7. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#addressProtocol:String "Permalink")  def addressProtocol: String
8. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#addressToProto(address:akka.actor.Address):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address.Builder "Permalink")  def addressToProto(address: [Address](../../../actor/Address.html)): Builder
9. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#compress(msg:akka.protobufv3.internal.MessageLite):Array[Byte] "Permalink")  def compress(msg: MessageLite): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]
12. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#decompress(bytes:Array[Byte]):Array[Byte] "Permalink")  def decompress(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]
13. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SerializationSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SerializationSupportImplicitThis member is added by an implicit conversion from SerializationSupport toEnsuring\[SerializationSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SerializationSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SerializationSupportImplicitThis member is added by an implicit conversion from SerializationSupport toEnsuring\[SerializationSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SerializationSupportImplicitThis member is added by an implicit conversion from SerializationSupport toEnsuring\[SerializationSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SerializationSupportImplicitThis member is added by an implicit conversion from SerializationSupport toEnsuring\[SerializationSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#otherMessageFromBinary(bytes:Array[Byte]):AnyRef "Permalink")  def otherMessageFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
26. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#otherMessageFromProto(other:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage):AnyRef "Permalink")  def otherMessageFromProto(other: OtherMessage): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
27. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#otherMessageToProto(msg:Any):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage "Permalink")  def otherMessageToProto(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OtherMessage
28. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#resolveActorRef(path:String):akka.actor.ActorRef "Permalink")  def resolveActorRef(path: String): [ActorRef](../../../actor/ActorRef.html)
29. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#serialization:akka.serialization.Serialization "Permalink")  def serialization: [Serialization](../../../serialization/Serialization.html)
30. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#transportInformation:akka.serialization.Serialization.Information "Permalink")  def transportInformation: [Information](../../../serialization/Serialization$$Information.html)
33. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#uniqueAddressFromProto(uniqueAddress:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress):akka.cluster.UniqueAddress "Permalink")  def uniqueAddressFromProto(uniqueAddress: msg.ReplicatorMessages.UniqueAddress): [UniqueAddress](../../UniqueAddress.html)
34. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#uniqueAddressToProto(uniqueAddress:akka.cluster.UniqueAddress):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress.Builder "Permalink")  def uniqueAddressToProto(uniqueAddress: [UniqueAddress](../../UniqueAddress.html)): Builder
35. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#versionVectorFromBinary(bytes:Array[Byte]):akka.cluster.ddata.VersionVector "Permalink")  def versionVectorFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [VersionVector](../VersionVector.html)
36. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#versionVectorFromProto(versionVector:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector):akka.cluster.ddata.VersionVector "Permalink")  def versionVectorFromProto(versionVector: msg.ReplicatorMessages.VersionVector): [VersionVector](../VersionVector.html)
37. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#versionVectorToProto(versionVector:akka.cluster.ddata.VersionVector):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector "Permalink")  def versionVectorToProto(versionVector: [VersionVector](../VersionVector.html)): msg.ReplicatorMessages.VersionVector
38. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
40. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SerializationSupport toStringFormat\[SerializationSupport] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/ddata/protobuf/SerializationSupport.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SerializationSupport, B)ImplicitThis member is added by an implicit conversion from SerializationSupport toArrowAssoc\[SerializationSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSerializationSupport to any2stringadd\[SerializationSupport]

### Inherited by implicit conversion StringFormat fromSerializationSupport to StringFormat\[SerializationSupport]

### Inherited by implicit conversion Ensuring fromSerializationSupport to Ensuring\[SerializationSupport]

### Inherited by implicit conversion ArrowAssoc fromSerializationSupport to ArrowAssoc\[SerializationSupport]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/VersionVector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/OtherMessageComparator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/SerializationSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/msg/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serialization$$Information.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serialization.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/SerializationSupport.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/SerializationSupport.html)*