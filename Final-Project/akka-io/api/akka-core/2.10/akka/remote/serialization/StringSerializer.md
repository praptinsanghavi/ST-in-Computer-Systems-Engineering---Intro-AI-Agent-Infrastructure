---
description: Akka 2.10.17 - akka.remote.serialization.StringSerializer
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/serialization/StringSerializer.html
title: Akka 2.10.17 - akka.remote.serialization.StringSerializer
---

# Akka 2.10.17 - akka.remote.serialization.StringSerializer

> **Summary:** Akka 2.10.17 - akka.remote.serialization.StringSerializer

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
- StringSerializer
- [SystemMessageSerializer](SystemMessageSerializer.html)
- [ThrowableNotSerializableException](ThrowableNotSerializableException.html "Use as replacement for an original exception when it can't be serialized or deserialized.")
c[akka](../../index.html).[remote](../index.html).[serialization](index.html)

# StringSerializer[**](../../../akka/remote/serialization/StringSerializer.html "Permalink")

### 

#### class StringSerializer extends [BaseSerializer](../../serialization/BaseSerializer.html) with [ByteBufferSerializer](../../serialization/ByteBufferSerializer.html)

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Moved to akka.serialization.StringSerializer in akka\-actor

Source[PrimitiveSerializers.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/serialization/PrimitiveSerializers.scala#L40)Linear Supertypes[ByteBufferSerializer](../../serialization/ByteBufferSerializer.html), [BaseSerializer](../../serialization/BaseSerializer.html), [Serializer](../../serialization/Serializer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StringSerializer
2. ByteBufferSerializer
3. BaseSerializer
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

1. [**](../../../akka/remote/serialization/StringSerializer.html#<init>(system:akka.actor.ExtendedActorSystem):akka.remote.serialization.StringSerializer "Permalink")  new StringSerializer(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/remote/serialization/StringSerializer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/serialization/StringSerializer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/serialization/StringSerializer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StringSerializer toany2stringadd\[StringSerializer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/serialization/StringSerializer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StringSerializer, B)ImplicitThis member is added by an implicit conversion from StringSerializer toArrowAssoc\[StringSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/serialization/StringSerializer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/serialization/StringSerializer.html#SerializationIdentifiers:String("akka.actor.serialization-identifiers") "Permalink") final  val SerializationIdentifiers: String("akka.actor.serialization\-identifiers")Configuration namespace of serialization identifiers in the `reference.conf`.

Configuration namespace of serialization identifiers in the `reference.conf`.

Each serializer implementation must have an entry in the following format:
`akka.actor.serialization-identifiers."FQCN" = ID`
where `FQCN` is fully qualified class name of the serializer implementation
and `ID` is globally unique serializer identifier number.

Definition Classes[BaseSerializer](../../serialization/BaseSerializer.html)
7. [**](../../../akka/remote/serialization/StringSerializer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/remote/serialization/StringSerializer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/remote/serialization/StringSerializer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StringSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StringSerializerImplicitThis member is added by an implicit conversion from StringSerializer toEnsuring\[StringSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/remote/serialization/StringSerializer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StringSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StringSerializerImplicitThis member is added by an implicit conversion from StringSerializer toEnsuring\[StringSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/remote/serialization/StringSerializer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StringSerializerImplicitThis member is added by an implicit conversion from StringSerializer toEnsuring\[StringSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/remote/serialization/StringSerializer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StringSerializerImplicitThis member is added by an implicit conversion from StringSerializer toEnsuring\[StringSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/remote/serialization/StringSerializer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/remote/serialization/StringSerializer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/remote/serialization/StringSerializer.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):AnyRef "Permalink")  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Class\[\_]]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Definition ClassesStringSerializer → [Serializer](../../serialization/Serializer.html)
16. [**](../../../akka/remote/serialization/StringSerializer.html#fromBinary(buf:java.nio.ByteBuffer,manifest:String):AnyRef "Permalink")  def fromBinary(buf: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer), manifest: String): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from a `ByteBuffer`, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from a `ByteBuffer`, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Definition ClassesStringSerializer → [ByteBufferSerializer](../../serialization/ByteBufferSerializer.html)
17. [**](../../../akka/remote/serialization/StringSerializer.html#fromBinary(bytes:Array[Byte],clazz:Class[_]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: Class\[\_]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize with type hint

Java API: deserialize with type hint

Definition Classes[Serializer](../../serialization/Serializer.html)Annotations@throws(classOf\[NotSerializableException])
18. [**](../../../akka/remote/serialization/StringSerializer.html#fromBinary(bytes:Array[Byte]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize without type hint

Java API: deserialize without type hint

Definition Classes[Serializer](../../serialization/Serializer.html)
19. [**](../../../akka/remote/serialization/StringSerializer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/remote/serialization/StringSerializer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/remote/serialization/StringSerializer.html#identifier:Int "Permalink")  val identifier: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Globally unique serialization identifier configured in the `reference.conf`.

Globally unique serialization identifier configured in the `reference.conf`.

See Serializer.identifier.

Definition ClassesStringSerializer → [BaseSerializer](../../serialization/BaseSerializer.html) → [Serializer](../../serialization/Serializer.html)
22. [**](../../../akka/remote/serialization/StringSerializer.html#includeManifest:Boolean "Permalink")  def includeManifest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether this serializer needs a manifest in the fromBinary method

Returns whether this serializer needs a manifest in the fromBinary method

Definition ClassesStringSerializer → [Serializer](../../serialization/Serializer.html)
23. [**](../../../akka/remote/serialization/StringSerializer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../akka/remote/serialization/StringSerializer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../akka/remote/serialization/StringSerializer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/remote/serialization/StringSerializer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/remote/serialization/StringSerializer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../akka/remote/serialization/StringSerializer.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html) Actor system which is required by most serializer implementations.

 Actor system which is required by most serializer implementations.

Definition ClassesStringSerializer → [BaseSerializer](../../serialization/BaseSerializer.html)
29. [**](../../../akka/remote/serialization/StringSerializer.html#toBinary(o:AnyRef):Array[Byte] "Permalink")  def toBinary(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Serializes the given object into an Array of Byte.

Serializes the given object into an Array of Byte.

Note that the array must not be mutated by the serializer after it has been returned.

Definition ClassesStringSerializer → [Serializer](../../serialization/Serializer.html)
30. [**](../../../akka/remote/serialization/StringSerializer.html#toBinary(o:AnyRef,buf:java.nio.ByteBuffer):Unit "Permalink")  def toBinary(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), buf: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Serializes the given object into the `ByteBuffer`.

Serializes the given object into the `ByteBuffer`.

Definition ClassesStringSerializer → [ByteBufferSerializer](../../serialization/ByteBufferSerializer.html)
31. [**](../../../akka/remote/serialization/StringSerializer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../akka/remote/serialization/StringSerializer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../akka/remote/serialization/StringSerializer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../akka/remote/serialization/StringSerializer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/serialization/StringSerializer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/serialization/StringSerializer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StringSerializer toStringFormat\[StringSerializer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/serialization/StringSerializer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StringSerializer, B)ImplicitThis member is added by an implicit conversion from StringSerializer toArrowAssoc\[StringSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ByteBufferSerializer](../../serialization/ByteBufferSerializer.html)

### Inherited from [BaseSerializer](../../serialization/BaseSerializer.html)

### Inherited from [Serializer](../../serialization/Serializer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStringSerializer to any2stringadd\[StringSerializer]

### Inherited by implicit conversion StringFormat fromStringSerializer to StringFormat\[StringSerializer]

### Inherited by implicit conversion Ensuring fromStringSerializer to Ensuring\[StringSerializer]

### Inherited by implicit conversion ArrowAssoc fromStringSerializer to ArrowAssoc\[StringSerializer]

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/ByteBufferSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/StringSerializer.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/StringSerializer.html)*