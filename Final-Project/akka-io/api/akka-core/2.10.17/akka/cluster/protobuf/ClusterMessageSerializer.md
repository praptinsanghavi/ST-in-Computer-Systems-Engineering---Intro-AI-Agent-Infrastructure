---
description: Akka 2.10.17 - akka.cluster.protobuf.ClusterMessageSerializer
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:22:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/protobuf/ClusterMessageSerializer.html
title: Akka 2.10.17 - akka.cluster.protobuf.ClusterMessageSerializer
---

# Akka 2.10.17 - akka.cluster.protobuf.ClusterMessageSerializer

> **Summary:** Akka 2.10.17 - akka.cluster.protobuf.ClusterMessageSerializer

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/protobuf/msg/index.html "Permalink")  package [msg](msg/index.html)Definition Classes[protobuf](index.html)
- ClusterMessageSerializer
c[akka](../../index.html).[cluster](../index.html).[protobuf](index.html)

# ClusterMessageSerializer[**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html "Permalink")

### 

#### final  class ClusterMessageSerializer extends [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html) with [BaseSerializer](../../serialization/BaseSerializer.html)

Protobuf serializer of cluster messages.

Source[ClusterMessageSerializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/protobuf/ClusterMessageSerializer.scala#L72)Linear Supertypes[BaseSerializer](../../serialization/BaseSerializer.html), [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html), [Serializer](../../serialization/Serializer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterMessageSerializer
2. BaseSerializer
3. SerializerWithStringManifest
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

1. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#<init>(system:akka.actor.ExtendedActorSystem):akka.cluster.protobuf.ClusterMessageSerializer "Permalink")  new ClusterMessageSerializer(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterMessageSerializer toany2stringadd\[ClusterMessageSerializer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterMessageSerializer, B)ImplicitThis member is added by an implicit conversion from ClusterMessageSerializer toArrowAssoc\[ClusterMessageSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#SerializationIdentifiers:String("akka.actor.serialization-identifiers") "Permalink") final  val SerializationIdentifiers: String("akka.actor.serialization\-identifiers")Configuration namespace of serialization identifiers in the `reference.conf`.

Configuration namespace of serialization identifiers in the `reference.conf`.

Each serializer implementation must have an entry in the following format:
`akka.actor.serialization-identifiers."FQCN" = ID`
where `FQCN` is fully qualified class name of the serializer implementation
and `ID` is globally unique serializer identifier number.

Definition Classes[BaseSerializer](../../serialization/BaseSerializer.html)
7. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#compress(msg:akka.protobufv3.internal.MessageLite):Array[Byte] "Permalink")  def compress(msg: MessageLite): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]
10. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#decompress(bytes:Array[Byte]):Array[Byte] "Permalink")  def decompress(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]
11. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#deserializeClusterRouterPool(bytes:Array[Byte]):akka.cluster.routing.ClusterRouterPool "Permalink")  def deserializeClusterRouterPool(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [ClusterRouterPool](../routing/ClusterRouterPool.html)
12. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#deserializeHeartBeat(bytes:Array[Byte]):akka.cluster.ClusterHeartbeatSender.Heartbeat "Permalink")  def deserializeHeartBeat(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): Heartbeat
13. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#deserializeHeartBeatResponse(bytes:Array[Byte]):akka.cluster.ClusterHeartbeatSender.HeartbeatRsp "Permalink")  def deserializeHeartBeatResponse(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): HeartbeatRsp
14. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterMessageSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterMessageSerializerImplicitThis member is added by an implicit conversion from ClusterMessageSerializer toEnsuring\[ClusterMessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterMessageSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterMessageSerializerImplicitThis member is added by an implicit conversion from ClusterMessageSerializer toEnsuring\[ClusterMessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterMessageSerializerImplicitThis member is added by an implicit conversion from ClusterMessageSerializer toEnsuring\[ClusterMessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterMessageSerializerImplicitThis member is added by an implicit conversion from ClusterMessageSerializer toEnsuring\[ClusterMessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#fromBinary(bytes:Array[Byte],manifest:String):AnyRef "Permalink")  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: String): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint.

Produces an object from an array of bytes, with an optional type\-hint.

It's recommended to throw `java.io.NotSerializableException` in `fromBinary`
if the manifest is unknown. This makes it possible to introduce new message
types and send them to nodes that don't know about them. This is typically
needed when performing rolling upgrades, i.e. running a cluster with mixed
versions for while. `NotSerializableException` is treated as a transient
problem in the TCP based remoting layer. The problem will be logged
and message is dropped. Other exceptions will tear down the TCP connection
because it can be an indication of corrupt bytes from the underlying transport.

Definition ClassesClusterMessageSerializer → [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html)
21. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Class\[\_]]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Definition Classes[SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html) → [Serializer](../../serialization/Serializer.html)
22. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#fromBinary(bytes:Array[Byte],clazz:Class[_]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: Class\[\_]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize with type hint

Java API: deserialize with type hint

Definition Classes[Serializer](../../serialization/Serializer.html)Annotations@throws(classOf\[NotSerializableException])
23. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#fromBinary(bytes:Array[Byte]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize without type hint

Java API: deserialize without type hint

Definition Classes[Serializer](../../serialization/Serializer.html)
24. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#identifier:Int "Permalink")  val identifier: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Globally unique serialization identifier configured in the `reference.conf`.

Globally unique serialization identifier configured in the `reference.conf`.

See Serializer.identifier.

Definition Classes[BaseSerializer](../../serialization/BaseSerializer.html) → [Serializer](../../serialization/Serializer.html)
27. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#includeManifest:Boolean "Permalink") final  def includeManifest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether this serializer needs a manifest in the fromBinary method

Returns whether this serializer needs a manifest in the fromBinary method

Definition Classes[SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html) → [Serializer](../../serialization/Serializer.html)
28. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#manifest(o:AnyRef):String "Permalink")  def manifest(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): StringReturn the manifest (type hint) that will be provided in the fromBinary method.

Return the manifest (type hint) that will be provided in the fromBinary method.
Use `""` if manifest is not needed.

Definition ClassesClusterMessageSerializer → [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html)
30. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html) Actor system which is required by most serializer implementations.

 Actor system which is required by most serializer implementations.

Definition ClassesClusterMessageSerializer → [BaseSerializer](../../serialization/BaseSerializer.html)
35. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#toBinary(obj:AnyRef):Array[Byte] "Permalink")  def toBinary(obj: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Serializes the given object into an Array of Byte.

Serializes the given object into an Array of Byte.

Note that the array must not be mutated by the serializer after it has been returned.

Definition ClassesClusterMessageSerializer → [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html) → [Serializer](../../serialization/Serializer.html)
36. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
37. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterMessageSerializer toStringFormat\[ClusterMessageSerializer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/protobuf/ClusterMessageSerializer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterMessageSerializer, B)ImplicitThis member is added by an implicit conversion from ClusterMessageSerializer toArrowAssoc\[ClusterMessageSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BaseSerializer](../../serialization/BaseSerializer.html)

### Inherited from [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html)

### Inherited from [Serializer](../../serialization/Serializer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterMessageSerializer to any2stringadd\[ClusterMessageSerializer]

### Inherited by implicit conversion StringFormat fromClusterMessageSerializer to StringFormat\[ClusterMessageSerializer]

### Inherited by implicit conversion Ensuring fromClusterMessageSerializer to Ensuring\[ClusterMessageSerializer]

### Inherited by implicit conversion ArrowAssoc fromClusterMessageSerializer to ArrowAssoc\[ClusterMessageSerializer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/protobuf/ClusterMessageSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/protobuf/msg/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/routing/ClusterRouterPool.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/protobuf/ClusterMessageSerializer.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/protobuf/ClusterMessageSerializer.html)*