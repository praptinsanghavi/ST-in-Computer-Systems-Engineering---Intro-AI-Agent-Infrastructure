---
description: Akka 2.10.17 - akka.cluster.ddata.protobuf.AbstractSerializationSupport
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:37:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html
title: Akka 2.10.17 - akka.cluster.ddata.protobuf.AbstractSerializationSupport
---

# Akka 2.10.17 - akka.cluster.ddata.protobuf.AbstractSerializationSupport

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.protobuf.AbstractSerializationSupport

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/ddata/protobuf/index.html "Permalink")  package [protobuf](index.html)Definition Classes[ddata](../index.html)
- [**](../../../../akka/cluster/ddata/protobuf/msg/index.html "Permalink")  package [msg](msg/index.html)Definition Classes[protobuf](index.html)
- AbstractSerializationSupport
- [OtherMessageComparator](OtherMessageComparator$.html)
- [ReplicatedDataSerializer](ReplicatedDataSerializer.html "Protobuf serializer of ReplicatedData.")
- [ReplicatorMessageSerializer](ReplicatorMessageSerializer.html "Protobuf serializer of ReplicatorMessage messages.")
- [SerializationSupport](SerializationSupport.html "Some useful serialization helper methods.")
c[akka](../../../index.html).[cluster](../../index.html).[ddata](../index.html).[protobuf](index.html)

# AbstractSerializationSupport[**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html "Permalink")

### 

#### abstract  class AbstractSerializationSupport extends [JSerializer](../../../serialization/JSerializer.html) with [SerializationSupport](SerializationSupport.html)

Java API

Source[SerializationSupport.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/protobuf/SerializationSupport.scala#L179)Linear Supertypes[SerializationSupport](SerializationSupport.html), [JSerializer](../../../serialization/JSerializer.html), [Serializer](../../../serialization/Serializer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AbstractSerializationSupport
2. SerializationSupport
3. JSerializer
4. Serializer
5. AnyRef
6. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#<init>():akka.cluster.ddata.protobuf.AbstractSerializationSupport "Permalink")  new AbstractSerializationSupport()
### Abstract Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#fromBinaryJava(bytes:Array[Byte],manifest:Class[_]):AnyRef "Permalink") abstract  def fromBinaryJava(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: Class\[\_]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This method must be implemented, manifest may be null.

This method must be implemented, manifest may be null.

Attributesprotected Definition Classes[JSerializer](../../../serialization/JSerializer.html)
2. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#identifier:Int "Permalink") abstract  def identifier: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Completely unique value to identify this implementation of Serializer, used to optimize network traffic.

Completely unique value to identify this implementation of Serializer, used to optimize network traffic.
Values from 0 to 40 are reserved for Akka internal usage.

Definition Classes[Serializer](../../../serialization/Serializer.html)
3. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#includeManifest:Boolean "Permalink") abstract  def includeManifest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether this serializer needs a manifest in the fromBinary method

Returns whether this serializer needs a manifest in the fromBinary method

Definition Classes[Serializer](../../../serialization/Serializer.html)
4. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#system:akka.actor.ExtendedActorSystem "Permalink") abstract  def system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html)Definition Classes[SerializationSupport](SerializationSupport.html)
5. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#toBinary(o:AnyRef):Array[Byte] "Permalink") abstract  def toBinary(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Serializes the given object into an Array of Byte.

Serializes the given object into an Array of Byte.

Note that the array must not be mutated by the serializer after it has been returned.

Definition Classes[Serializer](../../../serialization/Serializer.html)
### Concrete Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AbstractSerializationSupport toany2stringadd\[AbstractSerializationSupport] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AbstractSerializationSupport, B)ImplicitThis member is added by an implicit conversion from AbstractSerializationSupport toArrowAssoc\[AbstractSerializationSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#addressFromProto(address:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address):akka.actor.Address "Permalink")  def addressFromProto(address: Address): [Address](../../../actor/Address.html)Definition Classes[SerializationSupport](SerializationSupport.html)
7. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#addressProtocol:String "Permalink")  def addressProtocol: StringDefinition Classes[SerializationSupport](SerializationSupport.html)
8. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#addressToProto(address:akka.actor.Address):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address.Builder "Permalink")  def addressToProto(address: [Address](../../../actor/Address.html)): BuilderDefinition Classes[SerializationSupport](SerializationSupport.html)
9. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#compress(msg:akka.protobufv3.internal.MessageLite):Array[Byte] "Permalink")  def compress(msg: MessageLite): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition Classes[SerializationSupport](SerializationSupport.html)
12. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#decompress(bytes:Array[Byte]):Array[Byte] "Permalink")  def decompress(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition Classes[SerializationSupport](SerializationSupport.html)
13. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AbstractSerializationSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractSerializationSupportImplicitThis member is added by an implicit conversion from AbstractSerializationSupport toEnsuring\[AbstractSerializationSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AbstractSerializationSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractSerializationSupportImplicitThis member is added by an implicit conversion from AbstractSerializationSupport toEnsuring\[AbstractSerializationSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AbstractSerializationSupportImplicitThis member is added by an implicit conversion from AbstractSerializationSupport toEnsuring\[AbstractSerializationSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AbstractSerializationSupportImplicitThis member is added by an implicit conversion from AbstractSerializationSupport toEnsuring\[AbstractSerializationSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Class\[\_]]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Definition Classes[JSerializer](../../../serialization/JSerializer.html) → [Serializer](../../../serialization/Serializer.html)Annotations@throws(classOf\[NotSerializableException])
20. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#fromBinary(bytes:Array[Byte],clazz:Class[_]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: Class\[\_]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize with type hint

Java API: deserialize with type hint

Definition Classes[Serializer](../../../serialization/Serializer.html)Annotations@throws(classOf\[NotSerializableException])
21. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#fromBinary(bytes:Array[Byte]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize without type hint

Java API: deserialize without type hint

Definition Classes[Serializer](../../../serialization/Serializer.html)
22. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#otherMessageFromBinary(bytes:Array[Byte]):AnyRef "Permalink")  def otherMessageFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[SerializationSupport](SerializationSupport.html)
29. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#otherMessageFromProto(other:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage):AnyRef "Permalink")  def otherMessageFromProto(other: OtherMessage): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[SerializationSupport](SerializationSupport.html)
30. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#otherMessageToProto(msg:Any):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage "Permalink")  def otherMessageToProto(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OtherMessageDefinition Classes[SerializationSupport](SerializationSupport.html)
31. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#resolveActorRef(path:String):akka.actor.ActorRef "Permalink")  def resolveActorRef(path: String): [ActorRef](../../../actor/ActorRef.html)Definition Classes[SerializationSupport](SerializationSupport.html)
32. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#serialization:akka.serialization.Serialization "Permalink")  def serialization: [Serialization](../../../serialization/Serialization.html)Definition Classes[SerializationSupport](SerializationSupport.html)
33. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
35. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#transportInformation:akka.serialization.Serialization.Information "Permalink")  def transportInformation: [Information](../../../serialization/Serialization$$Information.html)Definition Classes[SerializationSupport](SerializationSupport.html)
36. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#uniqueAddressFromProto(uniqueAddress:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress):akka.cluster.UniqueAddress "Permalink")  def uniqueAddressFromProto(uniqueAddress: msg.ReplicatorMessages.UniqueAddress): [UniqueAddress](../../UniqueAddress.html)Definition Classes[SerializationSupport](SerializationSupport.html)
37. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#uniqueAddressToProto(uniqueAddress:akka.cluster.UniqueAddress):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress.Builder "Permalink")  def uniqueAddressToProto(uniqueAddress: [UniqueAddress](../../UniqueAddress.html)): BuilderDefinition Classes[SerializationSupport](SerializationSupport.html)
38. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#versionVectorFromBinary(bytes:Array[Byte]):akka.cluster.ddata.VersionVector "Permalink")  def versionVectorFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [VersionVector](../VersionVector.html)Definition Classes[SerializationSupport](SerializationSupport.html)
39. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#versionVectorFromProto(versionVector:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector):akka.cluster.ddata.VersionVector "Permalink")  def versionVectorFromProto(versionVector: msg.ReplicatorMessages.VersionVector): [VersionVector](../VersionVector.html)Definition Classes[SerializationSupport](SerializationSupport.html)
40. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#versionVectorToProto(versionVector:akka.cluster.ddata.VersionVector):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector "Permalink")  def versionVectorToProto(versionVector: [VersionVector](../VersionVector.html)): msg.ReplicatorMessages.VersionVectorDefinition Classes[SerializationSupport](SerializationSupport.html)
41. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
43. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AbstractSerializationSupport toStringFormat\[AbstractSerializationSupport] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/ddata/protobuf/AbstractSerializationSupport.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AbstractSerializationSupport, B)ImplicitThis member is added by an implicit conversion from AbstractSerializationSupport toArrowAssoc\[AbstractSerializationSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [SerializationSupport](SerializationSupport.html)

### Inherited from [JSerializer](../../../serialization/JSerializer.html)

### Inherited from [Serializer](../../../serialization/Serializer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAbstractSerializationSupport to any2stringadd\[AbstractSerializationSupport]

### Inherited by implicit conversion StringFormat fromAbstractSerializationSupport to StringFormat\[AbstractSerializationSupport]

### Inherited by implicit conversion Ensuring fromAbstractSerializationSupport to Ensuring\[AbstractSerializationSupport]

### Inherited by implicit conversion ArrowAssoc fromAbstractSerializationSupport to ArrowAssoc\[AbstractSerializationSupport]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/VersionVector.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/OtherMessageComparator$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/SerializationSupport.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/msg/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/serialization/JSerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/Serialization$$Information.html
- https://doc.akka.io/api/akka/current/akka/serialization/Serialization.html
- https://doc.akka.io/api/akka/current/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html)*