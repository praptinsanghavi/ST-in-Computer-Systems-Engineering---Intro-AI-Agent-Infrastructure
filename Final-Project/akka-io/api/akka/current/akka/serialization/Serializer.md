---
description: Akka 2.10.17 - akka.serialization.Serializer
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:43:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/Serializer.html
title: Akka 2.10.17 - akka.serialization.Serializer
---

# Akka 2.10.17 - akka.serialization.Serializer

> **Summary:** Akka 2.10.17 - akka.serialization.Serializer

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/jackson/index.html "Permalink")  package [jackson](jackson/index.html)Definition Classes[serialization](index.html)
- [AsyncSerializer](AsyncSerializer.html "Serializer that supports async serialization.")
- [AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html "Scala API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls and blocks.")
- [AsyncSerializerWithStringManifestCS](AsyncSerializerWithStringManifestCS.html "Java API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls and blocks.")
- [BaseSerializer](BaseSerializer.html "Base serializer trait with serialization identifiers configuration contract, when globally unique serialization identifier is configured in the reference.conf.")
- [ByteArraySerializer](ByteArraySerializer.html "This is a special Serializer that Serializes and deserializes byte arrays only, (just returns the byte array unchanged/uncopied)")
- [ByteBufferSerializer](ByteBufferSerializer.html "Serializer between an object and a ByteBuffer representing that object.")
- [DisabledJavaSerializer](DisabledJavaSerializer.html "This Serializer is used when akka.actor.java-serialization = off")
- [JSerializer](JSerializer.html "Java API for creating a Serializer: make sure to include a constructor which takes exactly one argument of type akka.actor.ExtendedActorSystem, because that is the preferred constructor which will be invoked when reflectively instantiating the JSerializer (also possible with empty constructor).")
- [JavaSerializer](JavaSerializer.html "This Serializer uses standard Java Serialization")
- [NullSerializer](NullSerializer.html "This is a special Serializer that Serializes and deserializes nulls only")
- [Serialization](Serialization.html "Serialization module.")
- [SerializationExtension](SerializationExtension$.html "SerializationExtension is an Akka Extension to interact with the Serialization that is built into Akka")
- [SerializationSetup](SerializationSetup.html "Setup for the serialization subsystem, constructor is *Internal API*, use factories in SerializationSetup")
- Serializer
- [SerializerDetails](SerializerDetails.html "Constructor is internal API: Use the factories SerializerDetails#create or SerializerDetails#apply to construct")
- [SerializerWithStringManifest](SerializerWithStringManifest.html "A Serializer represents a bimap between an object and an array of bytes representing that object.")
- [Serializers](Serializers$.html)
t[akka](../index.html).[serialization](index.html)

# Serializer[**](../../akka/serialization/Serializer.html "Permalink")

### 

#### trait Serializer extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A Serializer represents a bimap between an object and an array of bytes representing that object.

Serializers are loaded using reflection during [akka.actor.ActorSystem](../actor/ActorSystem.html)
start\-up, where constructors are tried in order:

- taking exactly one argument of type [akka.actor.ExtendedActorSystem](../actor/ExtendedActorSystem.html);
this should be the preferred one because all reflective loading of classes
during deserialization should use ExtendedActorSystem.dynamicAccess (see
[akka.actor.DynamicAccess](../actor/DynamicAccess.html))
- taking exactly one argument of type [akka.actor.ActorSystem](../actor/ActorSystem.html)
- taking exactly one argument of type [akka.actor.ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)
- without arguments
- taking two arguments of type [akka.actor.ExtendedActorSystem](../actor/ExtendedActorSystem.html) and `String` where the second `String` argument is the binding name
- taking two arguments of type [akka.actor.ActorSystem](../actor/ActorSystem.html) and `String` where the second `String` argument is the binding name
- taking two arguments of type [akka.actor.ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html) and `String` where the second `String` argument is the binding name

**Be sure to always use the** [akka.actor.DynamicAccess](../actor/DynamicAccess.html) **for loading classes!** This is necessary to
avoid strange match errors and inequalities which arise from different class loaders loading
the same class.

Source[Serializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/serialization/Serializer.scala#L46)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ServiceKeySerializer](../actor/typed/internal/receptionist/ServiceKeySerializer.html), [AbstractSerializationSupport](../cluster/ddata/protobuf/AbstractSerializationSupport.html), [ReplicatedDataSerializer](../cluster/ddata/protobuf/ReplicatedDataSerializer.html), [ReplicatorMessageSerializer](../cluster/ddata/protobuf/ReplicatorMessageSerializer.html), [MessageSerializer](../cluster/metrics/protobuf/MessageSerializer.html), [ClusterMessageSerializer](../cluster/protobuf/ClusterMessageSerializer.html), [TestSerializer](../persistence/TestSerializer.html), [MessageSerializer](../persistence/serialization/MessageSerializer.html), [PayloadSerializer](../persistence/serialization/PayloadSerializer.html), [SnapshotSerializer](../persistence/serialization/SnapshotSerializer.html), [MessageContainerSerializer](../remote/serialization/MessageContainerSerializer.html), [MiscMessageSerializer](../remote/serialization/MiscMessageSerializer.html), [ProtobufSerializer](../remote/serialization/ProtobufSerializer.html), [SystemMessageSerializer](../remote/serialization/SystemMessageSerializer.html), [AsyncSerializerWithStringManifest](AsyncSerializerWithStringManifest.html), [AsyncSerializerWithStringManifestCS](AsyncSerializerWithStringManifestCS.html), [BaseSerializer](BaseSerializer.html), [ByteArraySerializer](ByteArraySerializer.html), [DisabledJavaSerializer](DisabledJavaSerializer.html), [JSerializer](JSerializer.html), [JavaSerializer](JavaSerializer.html), [NullSerializer](NullSerializer.html), [NullSerializer](NullSerializer$.html), [SerializerWithStringManifest](SerializerWithStringManifest.html), [TestJavaSerializer](../testkit/TestJavaSerializer.html), [ByteStringSerializer](../remote/serialization/ByteStringSerializer.html), [IntSerializer](../remote/serialization/IntSerializer.html), [LongSerializer](../remote/serialization/LongSerializer.html), [StringSerializer](../remote/serialization/StringSerializer.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Serializer
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

1. [**](../../akka/serialization/Serializer.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):AnyRef "Permalink") abstract  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Class\[\_]]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Annotations@throws(classOf\[NotSerializableException])
2. [**](../../akka/serialization/Serializer.html#identifier:Int "Permalink") abstract  def identifier: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Completely unique value to identify this implementation of Serializer, used to optimize network traffic.

Completely unique value to identify this implementation of Serializer, used to optimize network traffic.
Values from 0 to 40 are reserved for Akka internal usage.
3. [**](../../akka/serialization/Serializer.html#includeManifest:Boolean "Permalink") abstract  def includeManifest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether this serializer needs a manifest in the fromBinary method
4. [**](../../akka/serialization/Serializer.html#toBinary(o:AnyRef):Array[Byte] "Permalink") abstract  def toBinary(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Serializes the given object into an Array of Byte.

Serializes the given object into an Array of Byte.

Note that the array must not be mutated by the serializer after it has been returned.
### Concrete Value Members

1. [**](../../akka/serialization/Serializer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/serialization/Serializer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/serialization/Serializer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Serializer toany2stringadd\[Serializer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/serialization/Serializer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Serializer, B)ImplicitThis member is added by an implicit conversion from Serializer toArrowAssoc\[Serializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/serialization/Serializer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/serialization/Serializer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/serialization/Serializer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/serialization/Serializer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Serializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SerializerImplicitThis member is added by an implicit conversion from Serializer toEnsuring\[Serializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/serialization/Serializer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Serializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SerializerImplicitThis member is added by an implicit conversion from Serializer toEnsuring\[Serializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/serialization/Serializer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SerializerImplicitThis member is added by an implicit conversion from Serializer toEnsuring\[Serializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/serialization/Serializer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SerializerImplicitThis member is added by an implicit conversion from Serializer toEnsuring\[Serializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/serialization/Serializer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/serialization/Serializer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/serialization/Serializer.html#fromBinary(bytes:Array[Byte],clazz:Class[_]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: Class\[\_]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize with type hint

Java API: deserialize with type hint

Annotations@throws(classOf\[NotSerializableException])
15. [**](../../akka/serialization/Serializer.html#fromBinary(bytes:Array[Byte]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize without type hint
16. [**](../../akka/serialization/Serializer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/serialization/Serializer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/serialization/Serializer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/serialization/Serializer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/serialization/Serializer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/serialization/Serializer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/serialization/Serializer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/serialization/Serializer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../akka/serialization/Serializer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/serialization/Serializer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/serialization/Serializer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/serialization/Serializer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/serialization/Serializer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Serializer toStringFormat\[Serializer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/serialization/Serializer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Serializer, B)ImplicitThis member is added by an implicit conversion from Serializer toArrowAssoc\[Serializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSerializer to any2stringadd\[Serializer]

### Inherited by implicit conversion StringFormat fromSerializer to StringFormat\[Serializer]

### Inherited by implicit conversion Ensuring fromSerializer to Ensuring\[Serializer]

### Inherited by implicit conversion ArrowAssoc fromSerializer to ArrowAssoc\[Serializer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/DynamicAccess.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/internal/receptionist/ServiceKeySerializer.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/protobuf/MessageSerializer.html
- https://doc.akka.io/api/akka/current/akka/cluster/protobuf/ClusterMessageSerializer.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/TestSerializer.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/MessageSerializer.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/PayloadSerializer.html
- https://doc.akka.io/api/akka/current/akka/persistence/serialization/SnapshotSerializer.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/ByteStringSerializer.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/IntSerializer.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/LongSerializer.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/MessageContainerSerializer.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/MiscMessageSerializer.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/ProtobufSerializer.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/StringSerializer.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/SystemMessageSerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/AsyncSerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/AsyncSerializerWithStringManifest.html
- https://doc.akka.io/api/akka/current/akka/serialization/AsyncSerializerWithStringManifestCS.html
- https://doc.akka.io/api/akka/current/akka/serialization/BaseSerializer$.html
- https://doc.akka.io/api/akka/current/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/ByteArraySerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/ByteBufferSerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/DisabledJavaSerializer$.html
- https://doc.akka.io/api/akka/current/akka/serialization/DisabledJavaSerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/JSerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/JavaSerializer$.html
- https://doc.akka.io/api/akka/current/akka/serialization/JavaSerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/NullSerializer$.html
- https://doc.akka.io/api/akka/current/akka/serialization/NullSerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/Serialization$.html
- https://doc.akka.io/api/akka/current/akka/serialization/Serialization.html
- https://doc.akka.io/api/akka/current/akka/serialization/SerializationExtension$.html
- https://doc.akka.io/api/akka/current/akka/serialization/SerializationSetup$.html
- https://doc.akka.io/api/akka/current/akka/serialization/SerializationSetup.html
- https://doc.akka.io/api/akka/current/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/SerializerDetails$.html
- https://doc.akka.io/api/akka/current/akka/serialization/SerializerDetails.html
- https://doc.akka.io/api/akka/current/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/api/akka/current/akka/serialization/Serializers$.html
- https://doc.akka.io/api/akka/current/akka/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestJavaSerializer.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/serialization/Serializer.html](https://doc.akka.io/api/akka/current/akka/serialization/Serializer.html)*