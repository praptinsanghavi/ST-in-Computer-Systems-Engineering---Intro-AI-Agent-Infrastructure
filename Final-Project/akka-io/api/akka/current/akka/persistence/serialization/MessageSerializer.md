---
description: Akka 2.10.17 - akka.persistence.serialization.MessageSerializer
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:55:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/serialization/MessageSerializer.html
title: Akka 2.10.17 - akka.persistence.serialization.MessageSerializer
---

# Akka 2.10.17 - akka.persistence.serialization.MessageSerializer

> **Summary:** Akka 2.10.17 - akka.persistence.serialization.MessageSerializer

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/serialization/index.html "Permalink")  package [serialization](index.html)Definition Classes[persistence](../index.html)
- [Message](Message.html "Marker trait for all protobuf-serializable messages in akka.persistence.")
- [MessageFormats](MessageFormats.html)
- MessageSerializer
- [PayloadSerializer](PayloadSerializer.html "INTERNAL API")
- [Snapshot](Snapshot.html "Wrapper for snapshot data.")
- [SnapshotSerializer](SnapshotSerializer.html "Snapshot serializer.")
c[akka](../../index.html).[persistence](../index.html).[serialization](index.html)

# MessageSerializer[**](../../../akka/persistence/serialization/MessageSerializer.html "Permalink")

### 

#### class MessageSerializer extends [BaseSerializer](../../serialization/BaseSerializer.html)

Protobuf serializer for [akka.persistence.PersistentRepr](../PersistentRepr.html), [akka.persistence.AtLeastOnceDelivery](../AtLeastOnceDelivery.html) and [akka.persistence.fsm.PersistentFSM.StateChangeEvent](../fsm/PersistentFSM$$StateChangeEvent.html) messages.

Source[MessageSerializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/serialization/MessageSerializer.scala#L31)Linear Supertypes[BaseSerializer](../../serialization/BaseSerializer.html), [Serializer](../../serialization/Serializer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MessageSerializer
2. BaseSerializer
3. Serializer
4. AnyRef
5. Any
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

1. [**](../../../akka/persistence/serialization/MessageSerializer.html#<init>(system:akka.actor.ExtendedActorSystem):akka.persistence.serialization.MessageSerializer "Permalink")  new MessageSerializer(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/persistence/serialization/MessageSerializer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/serialization/MessageSerializer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/serialization/MessageSerializer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MessageSerializer toany2stringadd\[MessageSerializer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/serialization/MessageSerializer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MessageSerializer, B)ImplicitThis member is added by an implicit conversion from MessageSerializer toArrowAssoc\[MessageSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/serialization/MessageSerializer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/serialization/MessageSerializer.html#AtLeastOnceDeliverySnapshotClass:Class[akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot] "Permalink")  val AtLeastOnceDeliverySnapshotClass: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[[AtLeastOnceDeliverySnapshot](../AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html)]
7. [**](../../../akka/persistence/serialization/MessageSerializer.html#AtomicWriteClass:Class[akka.persistence.AtomicWrite] "Permalink")  val AtomicWriteClass: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[[AtomicWrite](../AtomicWrite.html)]
8. [**](../../../akka/persistence/serialization/MessageSerializer.html#PersistentFSMSnapshotClass:Class[akka.persistence.fsm.PersistentFSM.PersistentFSMSnapshot[Any]] "Permalink")  val PersistentFSMSnapshotClass: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[PersistentFSMSnapshot\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]
9. [**](../../../akka/persistence/serialization/MessageSerializer.html#PersistentImplClass:Class[akka.persistence.PersistentImpl] "Permalink")  val PersistentImplClass: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[PersistentImpl]
10. [**](../../../akka/persistence/serialization/MessageSerializer.html#PersistentReprClass:Class[akka.persistence.PersistentRepr] "Permalink")  val PersistentReprClass: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[[PersistentRepr](../PersistentRepr.html)]
11. [**](../../../akka/persistence/serialization/MessageSerializer.html#PersistentStateChangeEventClass:Class[akka.persistence.fsm.PersistentFSM.StateChangeEvent] "Permalink")  val PersistentStateChangeEventClass: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[[StateChangeEvent](../fsm/PersistentFSM$$StateChangeEvent.html)]
12. [**](../../../akka/persistence/serialization/MessageSerializer.html#SerializationIdentifiers:String("akka.actor.serialization-identifiers") "Permalink") final  val SerializationIdentifiers: String("akka.actor.serialization\-identifiers")Configuration namespace of serialization identifiers in the `reference.conf`.

Configuration namespace of serialization identifiers in the `reference.conf`.

Each serializer implementation must have an entry in the following format:
`akka.actor.serialization-identifiers."FQCN" = ID`
where `FQCN` is fully qualified class name of the serializer implementation
and `ID` is globally unique serializer identifier number.

Definition Classes[BaseSerializer](../../serialization/BaseSerializer.html)
13. [**](../../../akka/persistence/serialization/MessageSerializer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
14. [**](../../../akka/persistence/serialization/MessageSerializer.html#atLeastOnceDeliverySnapshot(atLeastOnceDeliverySnapshot:akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot):akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot "Permalink")  def atLeastOnceDeliverySnapshot(atLeastOnceDeliverySnapshot: AtLeastOnceDeliverySnapshot): [AtLeastOnceDeliverySnapshot](../AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html)
15. [**](../../../akka/persistence/serialization/MessageSerializer.html#atLeastOnceDeliverySnapshotBuilder(snap:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot):akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot.Builder "Permalink")  def atLeastOnceDeliverySnapshotBuilder(snap: [AtLeastOnceDeliverySnapshot](../AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html)): Builder
16. [**](../../../akka/persistence/serialization/MessageSerializer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/persistence/serialization/MessageSerializer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MessageSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageSerializerImplicitThis member is added by an implicit conversion from MessageSerializer toEnsuring\[MessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/persistence/serialization/MessageSerializer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MessageSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageSerializerImplicitThis member is added by an implicit conversion from MessageSerializer toEnsuring\[MessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/persistence/serialization/MessageSerializer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageSerializerImplicitThis member is added by an implicit conversion from MessageSerializer toEnsuring\[MessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../akka/persistence/serialization/MessageSerializer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageSerializerImplicitThis member is added by an implicit conversion from MessageSerializer toEnsuring\[MessageSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../akka/persistence/serialization/MessageSerializer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/persistence/serialization/MessageSerializer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
23. [**](../../../akka/persistence/serialization/MessageSerializer.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):akka.persistence.serialization.Message "Permalink")  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Class\[\_]]): [Message](Message.html)Deserializes persistent messages.

Deserializes persistent messages. Delegates deserialization of a persistent
message's payload to a matching `akka.serialization.Serializer`.

Definition ClassesMessageSerializer → [Serializer](../../serialization/Serializer.html)
24. [**](../../../akka/persistence/serialization/MessageSerializer.html#fromBinary(bytes:Array[Byte],clazz:Class[_]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: Class\[\_]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize with type hint

Java API: deserialize with type hint

Definition Classes[Serializer](../../serialization/Serializer.html)Annotations@throws(classOf\[NotSerializableException])
25. [**](../../../akka/persistence/serialization/MessageSerializer.html#fromBinary(bytes:Array[Byte]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize without type hint

Java API: deserialize without type hint

Definition Classes[Serializer](../../serialization/Serializer.html)
26. [**](../../../akka/persistence/serialization/MessageSerializer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/persistence/serialization/MessageSerializer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/persistence/serialization/MessageSerializer.html#identifier:Int "Permalink")  val identifier: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Globally unique serialization identifier configured in the `reference.conf`.

Globally unique serialization identifier configured in the `reference.conf`.

See Serializer.identifier.

Definition Classes[BaseSerializer](../../serialization/BaseSerializer.html) → [Serializer](../../serialization/Serializer.html)
29. [**](../../../akka/persistence/serialization/MessageSerializer.html#includeManifest:Boolean "Permalink")  val includeManifest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether this serializer needs a manifest in the fromBinary method

Returns whether this serializer needs a manifest in the fromBinary method

Definition ClassesMessageSerializer → [Serializer](../../serialization/Serializer.html)
30. [**](../../../akka/persistence/serialization/MessageSerializer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
31. [**](../../../akka/persistence/serialization/MessageSerializer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../../akka/persistence/serialization/MessageSerializer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../akka/persistence/serialization/MessageSerializer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../../akka/persistence/serialization/MessageSerializer.html#persistentFSMSnapshot(persistentFSMSnapshot:akka.persistence.serialization.MessageFormats.PersistentFSMSnapshot):akka.persistence.fsm.PersistentFSM.PersistentFSMSnapshot[Any] "Permalink")  def persistentFSMSnapshot(persistentFSMSnapshot: PersistentFSMSnapshot): PersistentFSMSnapshot\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
35. [**](../../../akka/persistence/serialization/MessageSerializer.html#stateChange(persistentStateChange:akka.persistence.serialization.MessageFormats.PersistentStateChangeEvent):akka.persistence.fsm.PersistentFSM.StateChangeEvent "Permalink")  def stateChange(persistentStateChange: PersistentStateChangeEvent): [StateChangeEvent](../fsm/PersistentFSM$$StateChangeEvent.html)
36. [**](../../../akka/persistence/serialization/MessageSerializer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../../akka/persistence/serialization/MessageSerializer.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html) Actor system which is required by most serializer implementations.

 Actor system which is required by most serializer implementations.

Definition ClassesMessageSerializer → [BaseSerializer](../../serialization/BaseSerializer.html)
38. [**](../../../akka/persistence/serialization/MessageSerializer.html#toBinary(o:AnyRef):Array[Byte] "Permalink")  def toBinary(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Serializes persistent messages.

Serializes persistent messages. Delegates serialization of a persistent
message's payload to a matching `akka.serialization.Serializer`.

Definition ClassesMessageSerializer → [Serializer](../../serialization/Serializer.html)
39. [**](../../../akka/persistence/serialization/MessageSerializer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
40. [**](../../../akka/persistence/serialization/MessageSerializer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../../akka/persistence/serialization/MessageSerializer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
42. [**](../../../akka/persistence/serialization/MessageSerializer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/serialization/MessageSerializer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/serialization/MessageSerializer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MessageSerializer toStringFormat\[MessageSerializer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/serialization/MessageSerializer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MessageSerializer, B)ImplicitThis member is added by an implicit conversion from MessageSerializer toArrowAssoc\[MessageSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BaseSerializer](../../serialization/BaseSerializer.html)

### Inherited from [Serializer](../../serialization/Serializer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMessageSerializer to any2stringadd\[MessageSerializer]

### Inherited by implicit conversion StringFormat fromMessageSerializer to StringFormat\[MessageSerializer]

### Inherited by implicit conversion Ensuring fromMessageSerializer to Ensuring\[MessageSerializer]

### Inherited by implicit conversion ArrowAssoc fromMessageSerializer to ArrowAssoc\[MessageSerializer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtomicWrite.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka/current/akka/persistence/fsm/PersistentFSM$$StateChangeEvent.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/Message.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/MessageFormats.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/MessageSerializer.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/PayloadSerializer.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/Snapshot.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/SnapshotSerializer.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/serialization/MessageSerializer.html](https://doc.akka.io/api/akka/current/akka/persistence/serialization/MessageSerializer.html)*