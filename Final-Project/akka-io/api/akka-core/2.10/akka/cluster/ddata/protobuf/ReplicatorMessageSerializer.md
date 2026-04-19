---
description: Akka 2.10.17 - akka.cluster.ddata.protobuf.ReplicatorMessageSerializer
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
title: Akka 2.10.17 - akka.cluster.ddata.protobuf.ReplicatorMessageSerializer
---

# Akka 2.10.17 - akka.cluster.ddata.protobuf.ReplicatorMessageSerializer

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.protobuf.ReplicatorMessageSerializer

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
- ReplicatorMessageSerializer
- [SerializationSupport](SerializationSupport.html "Some useful serialization helper methods.")
c[akka](../../../index.html).[cluster](../../index.html).[ddata](../index.html).[protobuf](index.html)

# ReplicatorMessageSerializer[**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html "Permalink")

### 

#### class ReplicatorMessageSerializer extends [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html) with [SerializationSupport](SerializationSupport.html) with [BaseSerializer](../../../serialization/BaseSerializer.html)

Protobuf serializer of ReplicatorMessage messages.

Source[ReplicatorMessageSerializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.scala#L151)Linear Supertypes[BaseSerializer](../../../serialization/BaseSerializer.html), [SerializationSupport](SerializationSupport.html), [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html), [Serializer](../../../serialization/Serializer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicatorMessageSerializer
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

1. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#<init>(system:akka.actor.ExtendedActorSystem):akka.cluster.ddata.protobuf.ReplicatorMessageSerializer "Permalink")  new ReplicatorMessageSerializer(system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReplicatorMessageSerializer toany2stringadd\[ReplicatorMessageSerializer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReplicatorMessageSerializer, B)ImplicitThis member is added by an implicit conversion from ReplicatorMessageSerializer toArrowAssoc\[ReplicatorMessageSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#ChangedManifest:String "Permalink")  val ChangedManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
7. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#DataEnvelopeManifest:String "Permalink")  val DataEnvelopeManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
8. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#DeltaNackManifest:String "Permalink")  val DeltaNackManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
9. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#DeltaPropagationManifest:String "Permalink")  val DeltaPropagationManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
10. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#DurableDataEnvelopeManifest:String "Permalink")  val DurableDataEnvelopeManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
11. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#GetFailureManifest:String "Permalink")  val GetFailureManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
12. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#GetManifest:String "Permalink")  val GetManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
13. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#GetSuccessManifest:String "Permalink")  val GetSuccessManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
14. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#GossipManifest:String "Permalink")  val GossipManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
15. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#NotFoundManifest:String "Permalink")  val NotFoundManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
16. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#ReadManifest:String "Permalink")  val ReadManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
17. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#ReadResultManifest:String "Permalink")  val ReadResultManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
18. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#SerializationIdentifiers:String("akka.actor.serialization-identifiers") "Permalink") final  val SerializationIdentifiers: String("akka.actor.serialization\-identifiers")Configuration namespace of serialization identifiers in the `reference.conf`.

Configuration namespace of serialization identifiers in the `reference.conf`.

Each serializer implementation must have an entry in the following format:
`akka.actor.serialization-identifiers."FQCN" = ID`
where `FQCN` is fully qualified class name of the serializer implementation
and `ID` is globally unique serializer identifier number.

Definition Classes[BaseSerializer](../../../serialization/BaseSerializer.html)
19. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#StatusManifest:String "Permalink")  val StatusManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
20. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#SubscribeManifest:String "Permalink")  val SubscribeManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
21. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#UnsubscribeManifest:String "Permalink")  val UnsubscribeManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
22. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#WriteAckManifest:String "Permalink")  val WriteAckManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
23. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#WriteManifest:String "Permalink")  val WriteManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
24. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#WriteNackManifest:String "Permalink")  val WriteNackManifest: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
25. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#addressFromProto(address:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address):akka.actor.Address "Permalink")  def addressFromProto(address: Address): [Address](../../../actor/Address.html)Definition Classes[SerializationSupport](SerializationSupport.html)
26. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#addressProtocol:String "Permalink")  def addressProtocol: StringDefinition Classes[SerializationSupport](SerializationSupport.html)
27. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#addressToProto(address:akka.actor.Address):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.Address.Builder "Permalink")  def addressToProto(address: [Address](../../../actor/Address.html)): BuilderDefinition Classes[SerializationSupport](SerializationSupport.html)
28. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
29. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#compress(msg:akka.protobufv3.internal.MessageLite):Array[Byte] "Permalink")  def compress(msg: MessageLite): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition Classes[SerializationSupport](SerializationSupport.html)
31. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#decompress(bytes:Array[Byte]):Array[Byte] "Permalink")  def decompress(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition Classes[SerializationSupport](SerializationSupport.html)
32. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReplicatorMessageSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatorMessageSerializerImplicitThis member is added by an implicit conversion from ReplicatorMessageSerializer toEnsuring\[ReplicatorMessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
33. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReplicatorMessageSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorMessageSerializerImplicitThis member is added by an implicit conversion from ReplicatorMessageSerializer toEnsuring\[ReplicatorMessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
34. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatorMessageSerializerImplicitThis member is added by an implicit conversion from ReplicatorMessageSerializer toEnsuring\[ReplicatorMessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
35. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatorMessageSerializerImplicitThis member is added by an implicit conversion from ReplicatorMessageSerializer toEnsuring\[ReplicatorMessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
36. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
37. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
38. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#fromBinary(bytes:Array[Byte],manifest:String):AnyRef "Permalink")  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: String): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint.

Produces an object from an array of bytes, with an optional type\-hint.

It's recommended to throw `java.io.NotSerializableException` in `fromBinary`
if the manifest is unknown. This makes it possible to introduce new message
types and send them to nodes that don't know about them. This is typically
needed when performing rolling upgrades, i.e. running a cluster with mixed
versions for while. `NotSerializableException` is treated as a transient
problem in the TCP based remoting layer. The problem will be logged
and message is dropped. Other exceptions will tear down the TCP connection
because it can be an indication of corrupt bytes from the underlying transport.

Definition ClassesReplicatorMessageSerializer → [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html)
39. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Class\[\_]]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Definition Classes[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html) → [Serializer](../../../serialization/Serializer.html)
40. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#fromBinary(bytes:Array[Byte],clazz:Class[_]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: Class\[\_]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize with type hint

Java API: deserialize with type hint

Definition Classes[Serializer](../../../serialization/Serializer.html)Annotations@throws(classOf\[NotSerializableException])
41. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#fromBinary(bytes:Array[Byte]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize without type hint

Java API: deserialize without type hint

Definition Classes[Serializer](../../../serialization/Serializer.html)
42. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
43. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
44. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#identifier:Int "Permalink")  val identifier: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Globally unique serialization identifier configured in the `reference.conf`.

Globally unique serialization identifier configured in the `reference.conf`.

See Serializer.identifier.

Definition Classes[BaseSerializer](../../../serialization/BaseSerializer.html) → [Serializer](../../../serialization/Serializer.html)
45. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#includeManifest:Boolean "Permalink") final  def includeManifest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether this serializer needs a manifest in the fromBinary method

Returns whether this serializer needs a manifest in the fromBinary method

Definition Classes[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html) → [Serializer](../../../serialization/Serializer.html)
46. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
47. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#manifest(obj:AnyRef):String "Permalink")  def manifest(obj: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): StringReturn the manifest (type hint) that will be provided in the fromBinary method.

Return the manifest (type hint) that will be provided in the fromBinary method.
Use `""` if manifest is not needed.

Definition ClassesReplicatorMessageSerializer → [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html)
48. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
49. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
50. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
51. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#otherMessageFromBinary(bytes:Array[Byte]):AnyRef "Permalink")  def otherMessageFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[SerializationSupport](SerializationSupport.html)
52. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#otherMessageFromProto(other:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage):AnyRef "Permalink")  def otherMessageFromProto(other: OtherMessage): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[SerializationSupport](SerializationSupport.html)
53. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#otherMessageToProto(msg:Any):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage "Permalink")  def otherMessageToProto(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OtherMessageDefinition Classes[SerializationSupport](SerializationSupport.html)
54. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#resolveActorRef(path:String):akka.actor.ActorRef "Permalink")  def resolveActorRef(path: String): [ActorRef](../../../actor/ActorRef.html)Definition Classes[SerializationSupport](SerializationSupport.html)
55. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#serialization:akka.serialization.Serialization "Permalink")  def serialization: [Serialization](../../../serialization/Serialization.html)Definition Classes[SerializationSupport](SerializationSupport.html)
56. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
57. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html) Actor system which is required by most serializer implementations.

 Actor system which is required by most serializer implementations.

Definition ClassesReplicatorMessageSerializer → [BaseSerializer](../../../serialization/BaseSerializer.html) → [SerializationSupport](SerializationSupport.html)
58. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#toBinary(obj:AnyRef):Array[Byte] "Permalink")  def toBinary(obj: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Serializes the given object into an Array of Byte.

Serializes the given object into an Array of Byte.

Note that the array must not be mutated by the serializer after it has been returned.

Definition ClassesReplicatorMessageSerializer → [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html) → [Serializer](../../../serialization/Serializer.html)
59. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
60. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#transportInformation:akka.serialization.Serialization.Information "Permalink")  def transportInformation: [Information](../../../serialization/Serialization$$Information.html)Definition Classes[SerializationSupport](SerializationSupport.html)
61. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#uniqueAddressFromProto(uniqueAddress:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress):akka.cluster.UniqueAddress "Permalink")  def uniqueAddressFromProto(uniqueAddress: msg.ReplicatorMessages.UniqueAddress): [UniqueAddress](../../UniqueAddress.html)Definition Classes[SerializationSupport](SerializationSupport.html)
62. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#uniqueAddressToProto(uniqueAddress:akka.cluster.UniqueAddress):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.UniqueAddress.Builder "Permalink")  def uniqueAddressToProto(uniqueAddress: [UniqueAddress](../../UniqueAddress.html)): BuilderDefinition Classes[SerializationSupport](SerializationSupport.html)
63. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#versionVectorFromBinary(bytes:Array[Byte]):akka.cluster.ddata.VersionVector "Permalink")  def versionVectorFromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [VersionVector](../VersionVector.html)Definition Classes[SerializationSupport](SerializationSupport.html)
64. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#versionVectorFromProto(versionVector:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector):akka.cluster.ddata.VersionVector "Permalink")  def versionVectorFromProto(versionVector: msg.ReplicatorMessages.VersionVector): [VersionVector](../VersionVector.html)Definition Classes[SerializationSupport](SerializationSupport.html)
65. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#versionVectorToProto(versionVector:akka.cluster.ddata.VersionVector):akka.cluster.ddata.protobuf.msg.ReplicatorMessages.VersionVector "Permalink")  def versionVectorToProto(versionVector: [VersionVector](../VersionVector.html)): msg.ReplicatorMessages.VersionVectorDefinition Classes[SerializationSupport](SerializationSupport.html)
66. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
67. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
68. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReplicatorMessageSerializer toStringFormat\[ReplicatorMessageSerializer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReplicatorMessageSerializer, B)ImplicitThis member is added by an implicit conversion from ReplicatorMessageSerializer toArrowAssoc\[ReplicatorMessageSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BaseSerializer](../../../serialization/BaseSerializer.html)

### Inherited from [SerializationSupport](SerializationSupport.html)

### Inherited from [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html)

### Inherited from [Serializer](../../../serialization/Serializer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReplicatorMessageSerializer to any2stringadd\[ReplicatorMessageSerializer]

### Inherited by implicit conversion StringFormat fromReplicatorMessageSerializer to StringFormat\[ReplicatorMessageSerializer]

### Inherited by implicit conversion Ensuring fromReplicatorMessageSerializer to Ensuring\[ReplicatorMessageSerializer]

### Inherited by implicit conversion ArrowAssoc fromReplicatorMessageSerializer to ArrowAssoc\[ReplicatorMessageSerializer]

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
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serialization$$Information.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serialization.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html)*