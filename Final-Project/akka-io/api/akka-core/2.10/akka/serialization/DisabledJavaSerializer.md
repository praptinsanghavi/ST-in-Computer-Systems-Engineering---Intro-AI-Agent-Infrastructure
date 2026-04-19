---
description: Akka 2.10.17 - akka.serialization.DisabledJavaSerializer
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:23:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/DisabledJavaSerializer.html
title: Akka 2.10.17 - akka.serialization.DisabledJavaSerializer
---

# Akka 2.10.17 - akka.serialization.DisabledJavaSerializer

> **Summary:** Akka 2.10.17 - akka.serialization.DisabledJavaSerializer

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
- DisabledJavaSerializer
- [JSerializer](JSerializer.html "Java API for creating a Serializer: make sure to include a constructor which takes exactly one argument of type akka.actor.ExtendedActorSystem, because that is the preferred constructor which will be invoked when reflectively instantiating the JSerializer (also possible with empty constructor).")
- [JavaSerializer](JavaSerializer.html "This Serializer uses standard Java Serialization")
- [NullSerializer](NullSerializer.html "This is a special Serializer that Serializes and deserializes nulls only")
- [Serialization](Serialization.html "Serialization module.")
- [SerializationExtension](SerializationExtension$.html "SerializationExtension is an Akka Extension to interact with the Serialization that is built into Akka")
- [SerializationSetup](SerializationSetup.html "Setup for the serialization subsystem, constructor is *Internal API*, use factories in SerializationSetup")
- [Serializer](Serializer.html "A Serializer represents a bimap between an object and an array of bytes representing that object.")
- [SerializerDetails](SerializerDetails.html "Constructor is internal API: Use the factories SerializerDetails#create or SerializerDetails#apply to construct")
- [SerializerWithStringManifest](SerializerWithStringManifest.html "A Serializer represents a bimap between an object and an array of bytes representing that object.")
- [Serializers](Serializers$.html)
[c](DisabledJavaSerializer$.html "See companion object")[akka](../index.html).[serialization](index.html)

# [DisabledJavaSerializer](DisabledJavaSerializer$.html "See companion object")[**](../../akka/serialization/DisabledJavaSerializer.html "Permalink")

### Companion [object DisabledJavaSerializer](DisabledJavaSerializer$.html "See companion object")

#### final  case class DisabledJavaSerializer(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)) extends [Serializer](Serializer.html) with [ByteBufferSerializer](ByteBufferSerializer.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

This Serializer is used when `akka.actor.java-serialization = off`

Source[Serializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/serialization/Serializer.scala#L370)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [ByteBufferSerializer](ByteBufferSerializer.html), [Serializer](Serializer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DisabledJavaSerializer
2. Serializable
3. Product
4. Equals
5. ByteBufferSerializer
6. Serializer
7. AnyRef
8. Any
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

1. [**](../../akka/serialization/DisabledJavaSerializer.html#<init>(system:akka.actor.ExtendedActorSystem):akka.serialization.DisabledJavaSerializer "Permalink")  new DisabledJavaSerializer(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../akka/serialization/DisabledJavaSerializer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/serialization/DisabledJavaSerializer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/serialization/DisabledJavaSerializer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DisabledJavaSerializer toany2stringadd\[DisabledJavaSerializer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/serialization/DisabledJavaSerializer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DisabledJavaSerializer, B)ImplicitThis member is added by an implicit conversion from DisabledJavaSerializer toArrowAssoc\[DisabledJavaSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/serialization/DisabledJavaSerializer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/serialization/DisabledJavaSerializer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/serialization/DisabledJavaSerializer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/serialization/DisabledJavaSerializer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DisabledJavaSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DisabledJavaSerializerImplicitThis member is added by an implicit conversion from DisabledJavaSerializer toEnsuring\[DisabledJavaSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/serialization/DisabledJavaSerializer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DisabledJavaSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DisabledJavaSerializerImplicitThis member is added by an implicit conversion from DisabledJavaSerializer toEnsuring\[DisabledJavaSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/serialization/DisabledJavaSerializer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DisabledJavaSerializerImplicitThis member is added by an implicit conversion from DisabledJavaSerializer toEnsuring\[DisabledJavaSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/serialization/DisabledJavaSerializer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DisabledJavaSerializerImplicitThis member is added by an implicit conversion from DisabledJavaSerializer toEnsuring\[DisabledJavaSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/serialization/DisabledJavaSerializer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/serialization/DisabledJavaSerializer.html#fromBinary(buf:java.nio.ByteBuffer,manifest:String):AnyRef "Permalink")  def fromBinary(buf: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer), manifest: String): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from a `ByteBuffer`, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from a `ByteBuffer`, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Definition ClassesDisabledJavaSerializer → [ByteBufferSerializer](ByteBufferSerializer.html)Annotations@throws(classOf\[NotSerializableException])
14. [**](../../akka/serialization/DisabledJavaSerializer.html#fromBinary(bytes:Array[Byte],clazz:Option[Class[_]]):AnyRef "Permalink")  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Class\[\_]]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Definition ClassesDisabledJavaSerializer → [Serializer](Serializer.html)Annotations@throws(classOf\[NotSerializableException])
15. [**](../../akka/serialization/DisabledJavaSerializer.html#fromBinary(bytes:Array[Byte],clazz:Class[_]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: Class\[\_]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize with type hint

Java API: deserialize with type hint

Definition Classes[Serializer](Serializer.html)Annotations@throws(classOf\[NotSerializableException])
16. [**](../../akka/serialization/DisabledJavaSerializer.html#fromBinary(bytes:Array[Byte]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize without type hint

Java API: deserialize without type hint

Definition Classes[Serializer](Serializer.html)
17. [**](../../akka/serialization/DisabledJavaSerializer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/serialization/DisabledJavaSerializer.html#identifier:Int "Permalink")  val identifier: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Completely unique value to identify this implementation of Serializer, used to optimize network traffic.

Completely unique value to identify this implementation of Serializer, used to optimize network traffic.
Values from 0 to 40 are reserved for Akka internal usage.

Definition ClassesDisabledJavaSerializer → [Serializer](Serializer.html)
19. [**](../../akka/serialization/DisabledJavaSerializer.html#includeManifest:Boolean "Permalink")  def includeManifest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether this serializer needs a manifest in the fromBinary method

Returns whether this serializer needs a manifest in the fromBinary method

Definition ClassesDisabledJavaSerializer → [Serializer](Serializer.html)
20. [**](../../akka/serialization/DisabledJavaSerializer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/serialization/DisabledJavaSerializer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/serialization/DisabledJavaSerializer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/serialization/DisabledJavaSerializer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/serialization/DisabledJavaSerializer.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
25. [**](../../akka/serialization/DisabledJavaSerializer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/serialization/DisabledJavaSerializer.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)
27. [**](../../akka/serialization/DisabledJavaSerializer.html#toBinary(o:AnyRef):Array[Byte] "Permalink")  def toBinary(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Serializes the given object into an Array of Byte.

Serializes the given object into an Array of Byte.

Note that the array must not be mutated by the serializer after it has been returned.

Definition ClassesDisabledJavaSerializer → [Serializer](Serializer.html)
28. [**](../../akka/serialization/DisabledJavaSerializer.html#toBinary(o:AnyRef,buf:java.nio.ByteBuffer):Unit "Permalink")  def toBinary(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), buf: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Serializes the given object into the `ByteBuffer`.

Serializes the given object into the `ByteBuffer`.

Definition ClassesDisabledJavaSerializer → [ByteBufferSerializer](ByteBufferSerializer.html)
29. [**](../../akka/serialization/DisabledJavaSerializer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../akka/serialization/DisabledJavaSerializer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../akka/serialization/DisabledJavaSerializer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/serialization/DisabledJavaSerializer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/serialization/DisabledJavaSerializer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DisabledJavaSerializer toStringFormat\[DisabledJavaSerializer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/serialization/DisabledJavaSerializer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DisabledJavaSerializer, B)ImplicitThis member is added by an implicit conversion from DisabledJavaSerializer toArrowAssoc\[DisabledJavaSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [ByteBufferSerializer](ByteBufferSerializer.html)

### Inherited from [Serializer](Serializer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDisabledJavaSerializer to any2stringadd\[DisabledJavaSerializer]

### Inherited by implicit conversion StringFormat fromDisabledJavaSerializer to StringFormat\[DisabledJavaSerializer]

### Inherited by implicit conversion Ensuring fromDisabledJavaSerializer to Ensuring\[DisabledJavaSerializer]

### Inherited by implicit conversion ArrowAssoc fromDisabledJavaSerializer to ArrowAssoc\[DisabledJavaSerializer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/AsyncSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifestCS.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/BaseSerializer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/ByteArraySerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/ByteBufferSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/DisabledJavaSerializer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/DisabledJavaSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/JSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/JavaSerializer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/JavaSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/NullSerializer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/NullSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serialization$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serialization.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializationExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializationSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializationSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializerDetails$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializerDetails.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serializers$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/serialization/DisabledJavaSerializer.html](https://doc.akka.io/api/akka-core/2.10/akka/serialization/DisabledJavaSerializer.html)*