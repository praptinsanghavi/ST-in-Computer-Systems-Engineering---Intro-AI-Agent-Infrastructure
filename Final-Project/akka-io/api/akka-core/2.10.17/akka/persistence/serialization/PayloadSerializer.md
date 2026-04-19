---
description: Akka 2.10.17 - akka.persistence.serialization.PayloadSerializer
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:47:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/serialization/PayloadSerializer.html
title: Akka 2.10.17 - akka.persistence.serialization.PayloadSerializer
---

# Akka 2.10.17 - akka.persistence.serialization.PayloadSerializer

> **Summary:** Akka 2.10.17 - akka.persistence.serialization.PayloadSerializer

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/serialization/index.html "Permalink")  package [serialization](index.html)Definition Classes[persistence](../index.html)
- [Message](Message.html "Marker trait for all protobuf-serializable messages in akka.persistence.")
- [MessageFormats](MessageFormats.html)
- [MessageSerializer](MessageSerializer.html "Protobuf serializer for akka.persistence.PersistentRepr, akka.persistence.AtLeastOnceDelivery and akka.persistence.fsm.PersistentFSM.StateChangeEvent messages.")
- PayloadSerializer
- [Snapshot](Snapshot.html "Wrapper for snapshot data.")
- [SnapshotSerializer](SnapshotSerializer.html "Snapshot serializer.")
c[akka](../../index.html).[persistence](../index.html).[serialization](index.html)

# PayloadSerializer[**](../../../akka/persistence/serialization/PayloadSerializer.html "Permalink")

### 

#### final  class PayloadSerializer extends [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html) with [BaseSerializer](../../serialization/BaseSerializer.html)

INTERNAL API

Annotations@[InternalApi](../../annotation/InternalApi.html)() Source[PayloadSerializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/serialization/PayloadSerializer.scala#L24)Linear Supertypes[BaseSerializer](../../serialization/BaseSerializer.html), [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html), [Serializer](../../serialization/Serializer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PayloadSerializer
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

1. [**](../../../akka/persistence/serialization/PayloadSerializer.html#<init>(system:akka.actor.ExtendedActorSystem):akka.persistence.serialization.PayloadSerializer "Permalink")  new PayloadSerializer(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/persistence/serialization/PayloadSerializer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/serialization/PayloadSerializer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/serialization/PayloadSerializer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PayloadSerializer toany2stringadd\[PayloadSerializer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/serialization/PayloadSerializer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PayloadSerializer, B)ImplicitThis member is added by an implicit conversion from PayloadSerializer toArrowAssoc\[PayloadSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/serialization/PayloadSerializer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/serialization/PayloadSerializer.html#SerializationIdentifiers:String("akka.actor.serialization-identifiers") "Permalink") final  val SerializationIdentifiers: String("akka.actor.serialization\-identifiers")Configuration namespace of serialization identifiers in the `reference.conf`.

Configuration namespace of serialization identifiers in the `reference.conf`.

Each serializer implementation must have an entry in the following format:
`akka.actor.serialization-identifiers."FQCN" = ID`
where `FQCN` is fully qualified class name of the serializer implementation
and `ID` is globally unique serializer identifier number.

Definition Classes[BaseSerializer](../../serialization/BaseSerializer.html)
7. [**](../../../akka/persistence/serialization/PayloadSerializer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/persistence/serialization/PayloadSerializer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/persistence/serialization/PayloadSerializer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PayloadSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PayloadSerializerImplicitThis member is added by an implicit conversion from PayloadSerializer toEnsuring\[PayloadSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/serialization/PayloadSerializer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PayloadSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PayloadSerializerImplicitThis member is added by an implicit conversion from PayloadSerializer toEnsuring\[PayloadSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/serialization/PayloadSerializer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PayloadSerializerImplicitThis member is added by an implicit conversion from PayloadSerializer toEnsuring\[PayloadSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/serialization/PayloadSerializer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PayloadSerializerImplicitThis member is added by an implicit conversion from PayloadSerializer toEnsuring\[PayloadSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/persistence/serialization/PayloadSerializer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/persistence/serialization/PayloadSerializer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/persistence/serialization/PayloadSerializer.html#fromBinary(bytes:Array[Byte],manifest:String):AnyRef "Permalink")  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: String): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint.

Produces an object from an array of bytes, with an optional type\-hint.

It's recommended to throw `java.io.NotSerializableException` in `fromBinary`
if the manifest is unknown. This makes it possible to introduce new message
types and send them to nodes that don't know about them. This is typically
needed when performing rolling upgrades, i.e. running a cluster with mixed
versions for while. `NotSerializableException` is treated as a transient
problem in the TCP based remoting layer. The problem will be logged
and message is dropped. Other exceptions will tear down the TCP connection
because it can be an indication of corrupt bytes from the underlying transport.

Definition ClassesPayloadSerializer → [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html)
16. [**](../../../akka/persistence/serialization/PayloadSerializer.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Class\[\_]]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Definition Classes[SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html) → [Serializer](../../serialization/Serializer.html)
17. [**](../../../akka/persistence/serialization/PayloadSerializer.html#fromBinary(bytes:Array[Byte],clazz:Class[_]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: Class\[\_]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize with type hint

Java API: deserialize with type hint

Definition Classes[Serializer](../../serialization/Serializer.html)Annotations@throws(classOf\[NotSerializableException])
18. [**](../../../akka/persistence/serialization/PayloadSerializer.html#fromBinary(bytes:Array[Byte]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize without type hint

Java API: deserialize without type hint

Definition Classes[Serializer](../../serialization/Serializer.html)
19. [**](../../../akka/persistence/serialization/PayloadSerializer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/serialization/PayloadSerializer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/persistence/serialization/PayloadSerializer.html#identifier:Int "Permalink")  val identifier: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Globally unique serialization identifier configured in the `reference.conf`.

Globally unique serialization identifier configured in the `reference.conf`.

See Serializer.identifier.

Definition Classes[BaseSerializer](../../serialization/BaseSerializer.html) → [Serializer](../../serialization/Serializer.html)
22. [**](../../../akka/persistence/serialization/PayloadSerializer.html#includeManifest:Boolean "Permalink") final  def includeManifest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether this serializer needs a manifest in the fromBinary method

Returns whether this serializer needs a manifest in the fromBinary method

Definition Classes[SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html) → [Serializer](../../serialization/Serializer.html)
23. [**](../../../akka/persistence/serialization/PayloadSerializer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../akka/persistence/serialization/PayloadSerializer.html#manifest(o:AnyRef):String "Permalink")  def manifest(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): StringReturn the manifest (type hint) that will be provided in the fromBinary method.

Return the manifest (type hint) that will be provided in the fromBinary method.
Use `""` if manifest is not needed.

Definition ClassesPayloadSerializer → [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html)
25. [**](../../../akka/persistence/serialization/PayloadSerializer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/persistence/serialization/PayloadSerializer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/persistence/serialization/PayloadSerializer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/persistence/serialization/PayloadSerializer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../akka/persistence/serialization/PayloadSerializer.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html) Actor system which is required by most serializer implementations.

 Actor system which is required by most serializer implementations.

Definition ClassesPayloadSerializer → [BaseSerializer](../../serialization/BaseSerializer.html)
30. [**](../../../akka/persistence/serialization/PayloadSerializer.html#toBinary(o:AnyRef):Array[Byte] "Permalink")  def toBinary(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Serializes the given object into an Array of Byte.

Serializes the given object into an Array of Byte.

Note that the array must not be mutated by the serializer after it has been returned.

Definition ClassesPayloadSerializer → [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html) → [Serializer](../../serialization/Serializer.html)
31. [**](../../../akka/persistence/serialization/PayloadSerializer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../akka/persistence/serialization/PayloadSerializer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../akka/persistence/serialization/PayloadSerializer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../akka/persistence/serialization/PayloadSerializer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/serialization/PayloadSerializer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/serialization/PayloadSerializer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PayloadSerializer toStringFormat\[PayloadSerializer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/serialization/PayloadSerializer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PayloadSerializer, B)ImplicitThis member is added by an implicit conversion from PayloadSerializer toArrowAssoc\[PayloadSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BaseSerializer](../../serialization/BaseSerializer.html)

### Inherited from [SerializerWithStringManifest](../../serialization/SerializerWithStringManifest.html)

### Inherited from [Serializer](../../serialization/Serializer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPayloadSerializer to any2stringadd\[PayloadSerializer]

### Inherited by implicit conversion StringFormat fromPayloadSerializer to StringFormat\[PayloadSerializer]

### Inherited by implicit conversion Ensuring fromPayloadSerializer to Ensuring\[PayloadSerializer]

### Inherited by implicit conversion ArrowAssoc fromPayloadSerializer to ArrowAssoc\[PayloadSerializer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/serialization/Message.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/serialization/MessageFormats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/serialization/MessageSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/serialization/PayloadSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/serialization/Snapshot.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/serialization/SnapshotSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/serialization/PayloadSerializer.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/serialization/PayloadSerializer.html)*