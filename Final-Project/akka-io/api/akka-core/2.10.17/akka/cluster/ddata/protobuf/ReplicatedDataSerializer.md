---
description: Akka 2.10.17 - akka.cluster.ddata.protobuf.ReplicatedDataSerializer
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:21:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
title: Akka 2.10.17 - akka.cluster.ddata.protobuf.ReplicatedDataSerializer
---

# Akka 2.10.17 - akka.cluster.ddata.protobuf.ReplicatedDataSerializer

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.protobuf.ReplicatedDataSerializer

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
- ReplicatedDataSerializer
- [ReplicatorMessageSerializer](ReplicatorMessageSerializer.html "Protobuf serializer of ReplicatorMessage messages.")
- [SerializationSupport](SerializationSupport.html "Some useful serialization helper methods.")
c[akka](../../../index.html).[cluster](../../index.html).[ddata](../index.html).[protobuf](index.html)

# ReplicatedDataSerializer[**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html "Permalink")

### 

#### class ReplicatedDataSerializer extends [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html) with [SerializationSupport](SerializationSupport.html) with [BaseSerializer](../../../serialization/BaseSerializer.html)

Protobuf serializer of ReplicatedData.

Source[ReplicatedDataSerializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.scala#L258)Linear Supertypes[BaseSerializer](../../../serialization/BaseSerializer.html), [SerializationSupport](SerializationSupport.html), [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html), [Serializer](../../../serialization/Serializer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicatedDataSerializer
2. BaseSerializer
3. SerializationSupport
4. SerializerWithStringManifest
5. Serializer
6. AnyRef
7. Any
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

1. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#<init>(system:akka.actor.ExtendedActorSystem):akka.cluster.ddata.protobuf.ReplicatedDataSerializer "Permalink")  new ReplicatedDataSerializer(system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReplicatedDataSerializer toany2stringadd\[ReplicatedDataSerializer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReplicatedDataSerializer, B)ImplicitThis member is added by an implicit conversion from ReplicatedDataSerializer toArrowAssoc\[ReplicatedDataSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#SerializationIdentifiers:String("akka.actor.serialization-identifiers") "Permalink") final  val SerializationIdentifiers: String("akka.actor.serialization\-identifiers")Configuration namespace of serialization identifiers in the `reference.conf`.

Configuration namespace of serialization identifiers in the `reference.conf`.

Each serializer implementation must have an entry in the following format:
`akka.actor.serialization-identifiers."FQCN" = ID`
where `FQCN` is fully qualified class name of the serializer implementation
and `ID` is globally unique serializer identifier number.

Definition Classes[BaseSerializer](../../../serialization/BaseSerializer.html)
7. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#addressFromProto(address:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address):akka.actor.Address "Permalink")  def addressFromProto(address: Address): [Address](../../../actor/Address.html)Definition Classes[SerializationSupport](SerializationSupport.html)
8. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#addressProtocol:String "Permalink")  def addressProtocol: StringDefinition Classes[SerializationSupport](SerializationSupport.html)
9. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#addressToProto(address:akka.actor.Address):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address.Builder "Permalink")  def addressToProto(address: [Address](../../../actor/Address.html)): BuilderDefinition Classes[SerializationSupport](SerializationSupport.html)
10. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#compress(msg:akka.protobufv3.internal.MessageLite):Array[Byte] "Permalink")  def compress(msg: MessageLite): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition Classes[SerializationSupport](SerializationSupport.html)
13. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#decompress(bytes:Array[Byte]):Array[Byte] "Permalink")  def decompress(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition Classes[SerializationSupport](SerializationSupport.html)
14. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReplicatedDataSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatedDataSerializerImplicitThis member is added by an implicit conversion from ReplicatedDataSerializer toEnsuring\[ReplicatedDataSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReplicatedDataSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatedDataSerializerImplicitThis member is added by an implicit conversion from ReplicatedDataSerializer toEnsuring\[ReplicatedDataSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatedDataSerializerImplicitThis member is added by an implicit conversion from ReplicatedDataSerializer toEnsuring\[ReplicatedDataSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatedDataSerializerImplicitThis member is added by an implicit conversion from ReplicatedDataSerializer toEnsuring\[ReplicatedDataSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#flagFromBinary(bytes:Array[Byte]):akka.cluster.ddata.Flag "Permalink")  def flagFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Flag](../Flag.html)
21. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#flagFromProto(flag:akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.Flag):akka.cluster.ddata.Flag "Permalink")  def flagFromProto(flag: msg.ReplicatedDataMessages.Flag): [Flag](../Flag.html)
22. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#flagToProto(flag:akka.cluster.ddata.Flag):akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.Flag "Permalink")  def flagToProto(flag: [Flag](../Flag.html)): msg.ReplicatedDataMessages.Flag
23. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#fromBinary(bytes:Array[Byte],manifest:String):AnyRef "Permalink")  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: String): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint.

Produces an object from an array of bytes, with an optional type\-hint.

It's recommended to throw `java.io.NotSerializableException` in `fromBinary`
if the manifest is unknown. This makes it possible to introduce new message
types and send them to nodes that don't know about them. This is typically
needed when performing rolling upgrades, i.e. running a cluster with mixed
versions for while. `NotSerializableException` is treated as a transient
problem in the TCP based remoting layer. The problem will be logged
and message is dropped. Other exceptions will tear down the TCP connection
because it can be an indication of corrupt bytes from the underlying transport.

Definition ClassesReplicatedDataSerializer → [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html)
24. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Class\[\_]]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Definition Classes[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html) → [Serializer](../../../serialization/Serializer.html)
25. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#fromBinary(bytes:Array[Byte],clazz:Class[_]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: Class\[\_]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize with type hint

Java API: deserialize with type hint

Definition Classes[Serializer](../../../serialization/Serializer.html)Annotations@throws(classOf\[NotSerializableException])
26. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#fromBinary(bytes:Array[Byte]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize without type hint

Java API: deserialize without type hint

Definition Classes[Serializer](../../../serialization/Serializer.html)
27. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#gcounterFromBinary(bytes:Array[Byte]):akka.cluster.ddata.GCounter "Permalink")  def gcounterFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [GCounter](../GCounter.html)
28. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#gcounterFromProto(gcounter:akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter):akka.cluster.ddata.GCounter "Permalink")  def gcounterFromProto(gcounter: msg.ReplicatedDataMessages.GCounter): [GCounter](../GCounter.html)
29. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#gcounterToProto(gcounter:akka.cluster.ddata.GCounter):akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GCounter "Permalink")  def gcounterToProto(gcounter: [GCounter](../GCounter.html)): msg.ReplicatedDataMessages.GCounter
30. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#gsetFromBinary(bytes:Array[Byte]):akka.cluster.ddata.GSet[_] "Permalink")  def gsetFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [GSet](../GSet.html)\[\_]
32. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#gsetFromProto(gset:akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GSet):akka.cluster.ddata.GSet[Any] "Permalink")  def gsetFromProto(gset: msg.ReplicatedDataMessages.GSet): [GSet](../GSet.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
33. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#gsetToProto(gset:akka.cluster.ddata.GSet[_]):akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.GSet "Permalink")  def gsetToProto(gset: [GSet](../GSet.html)\[\_]): msg.ReplicatedDataMessages.GSet
34. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#identifier:Int "Permalink")  val identifier: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Globally unique serialization identifier configured in the `reference.conf`.

Globally unique serialization identifier configured in the `reference.conf`.

See Serializer.identifier.

Definition Classes[BaseSerializer](../../../serialization/BaseSerializer.html) → [Serializer](../../../serialization/Serializer.html)
36. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#includeManifest:Boolean "Permalink") final  def includeManifest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether this serializer needs a manifest in the fromBinary method

Returns whether this serializer needs a manifest in the fromBinary method

Definition Classes[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html) → [Serializer](../../../serialization/Serializer.html)
37. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
38. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#keyIdFromBinary(bytes:Array[Byte]):String "Permalink")  def keyIdFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): String
39. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#keyIdToBinary(id:String):Array[Byte] "Permalink")  def keyIdToBinary(id: String): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]
40. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#lwwRegisterFromBinary(bytes:Array[Byte]):akka.cluster.ddata.LWWRegister[Any] "Permalink")  def lwwRegisterFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [LWWRegister](../LWWRegister.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
41. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#lwwRegisterFromProto(lwwRegister:akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.LWWRegister):akka.cluster.ddata.LWWRegister[Any] "Permalink")  def lwwRegisterFromProto(lwwRegister: msg.ReplicatedDataMessages.LWWRegister): [LWWRegister](../LWWRegister.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
42. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#lwwRegisterToProto(lwwRegister:akka.cluster.ddata.LWWRegister[_]):akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.LWWRegister "Permalink")  def lwwRegisterToProto(lwwRegister: [LWWRegister](../LWWRegister.html)\[\_]): msg.ReplicatedDataMessages.LWWRegister
43. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#lwwmapFromBinary(bytes:Array[Byte]):akka.cluster.ddata.LWWMap[Any,Any] "Permalink")  def lwwmapFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [LWWMap](../LWWMap.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
44. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#lwwmapFromProto(lwwmap:akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.LWWMap):akka.cluster.ddata.LWWMap[Any,Any] "Permalink")  def lwwmapFromProto(lwwmap: msg.ReplicatedDataMessages.LWWMap): [LWWMap](../LWWMap.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
45. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#lwwmapToProto(lwwmap:akka.cluster.ddata.LWWMap[_,_]):akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.LWWMap "Permalink")  def lwwmapToProto(lwwmap: [LWWMap](../LWWMap.html)\[\_, \_]): msg.ReplicatedDataMessages.LWWMap
46. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#manifest(obj:AnyRef):String "Permalink")  def manifest(obj: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): StringReturn the manifest (type hint) that will be provided in the fromBinary method.

Return the manifest (type hint) that will be provided in the fromBinary method.
Use `""` if manifest is not needed.

Definition ClassesReplicatedDataSerializer → [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html)
47. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#mapTypeFromProto[PEntry<:akka.protobufv3.internal.GeneratedMessageV3,A<:akka.protobufv3.internal.GeneratedMessageV3,B<:akka.cluster.ddata.ReplicatedData](input:java.util.List[PEntry],valueCreator:A=>B)(impliciteh:akka.cluster.ddata.protobuf.ReplicatedDataSerializer.ProtoMapEntryReader[PEntry,A]):Map[Any,B] "Permalink")  def mapTypeFromProto\[PEntry \<: GeneratedMessageV3, A \<: GeneratedMessageV3, B \<: [ReplicatedData](../ReplicatedData.html)](input: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[PEntry], valueCreator: (A) \=\> B)(implicit eh: ProtoMapEntryReader\[PEntry, A]): Map\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), B]
48. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#multimapFromBinary(bytes:Array[Byte]):akka.cluster.ddata.ORMultiMap[Any,Any] "Permalink")  def multimapFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [ORMultiMap](../ORMultiMap.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
49. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#multimapFromProto(multimap:akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMultiMap):akka.cluster.ddata.ORMultiMap[Any,Any] "Permalink")  def multimapFromProto(multimap: msg.ReplicatedDataMessages.ORMultiMap): [ORMultiMap](../ORMultiMap.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
50. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#multimapToProto(multimap:akka.cluster.ddata.ORMultiMap[_,_]):akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMultiMap "Permalink")  def multimapToProto(multimap: [ORMultiMap](../ORMultiMap.html)\[\_, \_]): msg.ReplicatedDataMessages.ORMultiMap
51. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
52. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
53. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
54. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#ormapFromBinary(bytes:Array[Byte]):akka.cluster.ddata.ORMap[Any,akka.cluster.ddata.ReplicatedData] "Permalink")  def ormapFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [ORMap](../ORMap.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [ReplicatedData](../ReplicatedData.html)]
55. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#ormapFromProto(ormap:akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap):akka.cluster.ddata.ORMap[Any,akka.cluster.ddata.ReplicatedData] "Permalink")  def ormapFromProto(ormap: msg.ReplicatedDataMessages.ORMap): [ORMap](../ORMap.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [ReplicatedData](../ReplicatedData.html)]
56. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#ormapToProto(ormap:akka.cluster.ddata.ORMap[_,_]):akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORMap "Permalink")  def ormapToProto(ormap: [ORMap](../ORMap.html)\[\_, \_]): msg.ReplicatedDataMessages.ORMap
57. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#orsetFromBinary(bytes:Array[Byte]):akka.cluster.ddata.ORSet[Any] "Permalink")  def orsetFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [ORSet](../ORSet.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
58. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#orsetFromProto(orset:akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet):akka.cluster.ddata.ORSet[Any] "Permalink")  def orsetFromProto(orset: msg.ReplicatedDataMessages.ORSet): [ORSet](../ORSet.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
59. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#orsetToProto(orset:akka.cluster.ddata.ORSet[_]):akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSet "Permalink")  def orsetToProto(orset: [ORSet](../ORSet.html)\[\_]): msg.ReplicatedDataMessages.ORSet
60. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#otherMessageFromBinary(bytes:Array[Byte]):AnyRef "Permalink")  def otherMessageFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[SerializationSupport](SerializationSupport.html)
61. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#otherMessageFromProto(other:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage):AnyRef "Permalink")  def otherMessageFromProto(other: OtherMessage): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[SerializationSupport](SerializationSupport.html)
62. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#otherMessageToProto(msg:Any):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage "Permalink")  def otherMessageToProto(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OtherMessageDefinition Classes[SerializationSupport](SerializationSupport.html)
63. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#pncounterFromBinary(bytes:Array[Byte]):akka.cluster.ddata.PNCounter "Permalink")  def pncounterFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [PNCounter](../PNCounter.html)
64. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#pncounterFromProto(pncounter:akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounter):akka.cluster.ddata.PNCounter "Permalink")  def pncounterFromProto(pncounter: msg.ReplicatedDataMessages.PNCounter): [PNCounter](../PNCounter.html)
65. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#pncounterToProto(pncounter:akka.cluster.ddata.PNCounter):akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounter "Permalink")  def pncounterToProto(pncounter: [PNCounter](../PNCounter.html)): msg.ReplicatedDataMessages.PNCounter
66. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#pncountermapFromBinary(bytes:Array[Byte]):akka.cluster.ddata.PNCounterMap[_] "Permalink")  def pncountermapFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [PNCounterMap](../PNCounterMap.html)\[\_]
67. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#pncountermapFromProto(pncountermap:akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounterMap):akka.cluster.ddata.PNCounterMap[_] "Permalink")  def pncountermapFromProto(pncountermap: msg.ReplicatedDataMessages.PNCounterMap): [PNCounterMap](../PNCounterMap.html)\[\_]
68. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#pncountermapToProto(pncountermap:akka.cluster.ddata.PNCounterMap[_]):akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.PNCounterMap "Permalink")  def pncountermapToProto(pncountermap: [PNCounterMap](../PNCounterMap.html)\[\_]): msg.ReplicatedDataMessages.PNCounterMap
69. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#resolveActorRef(path:String):akka.actor.ActorRef "Permalink")  def resolveActorRef(path: String): [ActorRef](../../../actor/ActorRef.html)Definition Classes[SerializationSupport](SerializationSupport.html)
70. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#serialization:akka.serialization.Serialization "Permalink")  def serialization: [Serialization](../../../serialization/Serialization.html)Definition Classes[SerializationSupport](SerializationSupport.html)
71. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#singleKeyEntryFromProto[PEntry<:akka.protobufv3.internal.GeneratedMessageV3,A<:akka.protobufv3.internal.GeneratedMessageV3](entryOption:Option[PEntry])(impliciteh:akka.cluster.ddata.protobuf.ReplicatedDataSerializer.ProtoMapEntryReader[PEntry,A]):Any "Permalink")  def singleKeyEntryFromProto\[PEntry \<: GeneratedMessageV3, A \<: GeneratedMessageV3](entryOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[PEntry])(implicit eh: ProtoMapEntryReader\[PEntry, A]): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)
72. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#singleMapEntryFromProto[PEntry<:akka.protobufv3.internal.GeneratedMessageV3,A<:akka.protobufv3.internal.GeneratedMessageV3,B<:akka.cluster.ddata.ReplicatedData](input:java.util.List[PEntry],valueCreator:A=>B)(impliciteh:akka.cluster.ddata.protobuf.ReplicatedDataSerializer.ProtoMapEntryReader[PEntry,A]):Map[Any,B] "Permalink")  def singleMapEntryFromProto\[PEntry \<: GeneratedMessageV3, A \<: GeneratedMessageV3, B \<: [ReplicatedData](../ReplicatedData.html)](input: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[PEntry], valueCreator: (A) \=\> B)(implicit eh: ProtoMapEntryReader\[PEntry, A]): Map\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), B]
73. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
74. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html) Actor system which is required by most serializer implementations.

 Actor system which is required by most serializer implementations.

Definition ClassesReplicatedDataSerializer → [BaseSerializer](../../../serialization/BaseSerializer.html) → [SerializationSupport](SerializationSupport.html)
75. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#toBinary(obj:AnyRef):Array[Byte] "Permalink")  def toBinary(obj: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Serializes the given object into an Array of Byte.

Serializes the given object into an Array of Byte.

Note that the array must not be mutated by the serializer after it has been returned.

Definition ClassesReplicatedDataSerializer → [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html) → [Serializer](../../../serialization/Serializer.html)
76. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
77. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#transportInformation:akka.serialization.Serialization.Information "Permalink")  def transportInformation: [Information](../../../serialization/Serialization$$Information.html)Definition Classes[SerializationSupport](SerializationSupport.html)
78. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#uniqueAddressFromProto(uniqueAddress:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress):akka.cluster.UniqueAddress "Permalink")  def uniqueAddressFromProto(uniqueAddress: msg.ReplicatorMessages.UniqueAddress): [UniqueAddress](../../UniqueAddress.html)Definition Classes[SerializationSupport](SerializationSupport.html)
79. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#uniqueAddressToProto(uniqueAddress:akka.cluster.UniqueAddress):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress.Builder "Permalink")  def uniqueAddressToProto(uniqueAddress: [UniqueAddress](../../UniqueAddress.html)): BuilderDefinition Classes[SerializationSupport](SerializationSupport.html)
80. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#versionVectorFromBinary(bytes:Array[Byte]):akka.cluster.ddata.VersionVector "Permalink")  def versionVectorFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [VersionVector](../VersionVector.html)Definition Classes[SerializationSupport](SerializationSupport.html)
81. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#versionVectorFromProto(versionVector:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector):akka.cluster.ddata.VersionVector "Permalink")  def versionVectorFromProto(versionVector: msg.ReplicatorMessages.VersionVector): [VersionVector](../VersionVector.html)Definition Classes[SerializationSupport](SerializationSupport.html)
82. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#versionVectorToProto(versionVector:akka.cluster.ddata.VersionVector):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector "Permalink")  def versionVectorToProto(versionVector: [VersionVector](../VersionVector.html)): msg.ReplicatorMessages.VersionVectorDefinition Classes[SerializationSupport](SerializationSupport.html)
83. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
84. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
85. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReplicatedDataSerializer toStringFormat\[ReplicatedDataSerializer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReplicatedDataSerializer, B)ImplicitThis member is added by an implicit conversion from ReplicatedDataSerializer toArrowAssoc\[ReplicatedDataSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BaseSerializer](../../../serialization/BaseSerializer.html)

### Inherited from [SerializationSupport](SerializationSupport.html)

### Inherited from [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html)

### Inherited from [Serializer](../../../serialization/Serializer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReplicatedDataSerializer to any2stringadd\[ReplicatedDataSerializer]

### Inherited by implicit conversion StringFormat fromReplicatedDataSerializer to StringFormat\[ReplicatedDataSerializer]

### Inherited by implicit conversion Ensuring fromReplicatedDataSerializer to Ensuring\[ReplicatedDataSerializer]

### Inherited by implicit conversion ArrowAssoc fromReplicatedDataSerializer to ArrowAssoc\[ReplicatedDataSerializer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/Flag.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/GSet.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/PNCounter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/PNCounterMap.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/VersionVector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/protobuf/OtherMessageComparator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/protobuf/SerializationSupport.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/protobuf/msg/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/Serialization$$Information.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/Serialization.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html)*