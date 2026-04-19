---
description: Akka 2.10.17 - akka.serialization.Serialization
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:43:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/Serialization.html
title: Akka 2.10.17 - akka.serialization.Serialization
---

# Akka 2.10.17 - akka.serialization.Serialization

> **Summary:** Akka 2.10.17 - akka.serialization.Serialization

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
- Serialization
- [SerializationExtension](SerializationExtension$.html "SerializationExtension is an Akka Extension to interact with the Serialization that is built into Akka")
- [SerializationSetup](SerializationSetup.html "Setup for the serialization subsystem, constructor is *Internal API*, use factories in SerializationSetup")
- [Serializer](Serializer.html "A Serializer represents a bimap between an object and an array of bytes representing that object.")
- [SerializerDetails](SerializerDetails.html "Constructor is internal API: Use the factories SerializerDetails#create or SerializerDetails#apply to construct")
- [SerializerWithStringManifest](SerializerWithStringManifest.html "A Serializer represents a bimap between an object and an array of bytes representing that object.")
- [Serializers](Serializers$.html)
[c](Serialization$.html "See companion object")[akka](../index.html).[serialization](index.html)

# [Serialization](Serialization$.html "See companion object")[**](../../akka/serialization/Serialization.html "Permalink")

### Companion [object Serialization](Serialization$.html "See companion object")

#### class Serialization extends [Extension](../actor/Extension.html)

Serialization module. Contains methods for serialization and deserialization as well as
locating a Serializer for a particular class as defined in the mapping in the configuration.

Source[Serialization.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/serialization/Serialization.scala#L136)Linear Supertypes[Extension](../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Serialization
2. Extension
3. AnyRef
4. Any
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

1. [**](../../akka/serialization/Serialization.html#<init>(system:akka.actor.ExtendedActorSystem):akka.serialization.Serialization "Permalink")  new Serialization(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../akka/serialization/Serialization.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/serialization/Serialization.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/serialization/Serialization.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Serialization toany2stringadd\[Serialization] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/serialization/Serialization.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Serialization, B)ImplicitThis member is added by an implicit conversion from Serialization toArrowAssoc\[Serialization] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/serialization/Serialization.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/serialization/Serialization.html#AllowJavaSerialization:Boolean "Permalink")  val AllowJavaSerialization: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
7. [**](../../akka/serialization/Serialization.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/serialization/Serialization.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/serialization/Serialization.html#deserialize[T](bytes:Array[Byte],clazz:Class[T]):scala.util.Try[T] "Permalink")  def deserialize\[T](bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: Class\[T]): [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]Deserializes the given array of bytes using the specified type to look up what Serializer should be used.

Deserializes the given array of bytes using the specified type to look up what Serializer should be used.
Returns either the resulting object or an Exception if one was thrown.
10. [**](../../akka/serialization/Serialization.html#deserialize(bytes:Array[Byte],serializerId:Int,manifest:String):scala.util.Try[AnyRef] "Permalink")  def deserialize(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], serializerId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), manifest: String): [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Deserializes the given array of bytes using the specified serializer id,
using the optional type hint to the Serializer.

Deserializes the given array of bytes using the specified serializer id,
using the optional type hint to the Serializer.
Returns either the resulting object or an Exception if one was thrown.
11. [**](../../akka/serialization/Serialization.html#deserializeByteBuffer(buf:java.nio.ByteBuffer,serializerId:Int,manifest:String):AnyRef "Permalink")  def deserializeByteBuffer(buf: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer), serializerId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), manifest: String): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Deserializes the given ByteBuffer of bytes using the specified serializer id,
using the optional type hint to the Serializer.

Deserializes the given ByteBuffer of bytes using the specified serializer id,
using the optional type hint to the Serializer.
Returns either the resulting object or throws an exception if deserialization fails.

Annotations@throws(classOf\[NotSerializableException])
12. [**](../../akka/serialization/Serialization.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Serialization) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SerializationImplicitThis member is added by an implicit conversion from Serialization toEnsuring\[Serialization] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/serialization/Serialization.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Serialization) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SerializationImplicitThis member is added by an implicit conversion from Serialization toEnsuring\[Serialization] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/serialization/Serialization.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SerializationImplicitThis member is added by an implicit conversion from Serialization toEnsuring\[Serialization] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/serialization/Serialization.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SerializationImplicitThis member is added by an implicit conversion from Serialization toEnsuring\[Serialization] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/serialization/Serialization.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/serialization/Serialization.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../akka/serialization/Serialization.html#findSerializerFor(o:AnyRef):akka.serialization.Serializer "Permalink")  def findSerializerFor(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Serializer](Serializer.html)Returns the Serializer configured for the given object, returns the NullSerializer if it's null.

Returns the Serializer configured for the given object, returns the NullSerializer if it's null.

Throws akka.ConfigurationException if no `serialization-bindings` is configured for the
 class of the object.
19. [**](../../akka/serialization/Serialization.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/serialization/Serialization.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/serialization/Serialization.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../akka/serialization/Serialization.html#log:akka.event.LoggingAdapter "Permalink")  val log: [LoggingAdapter](../event/LoggingAdapter.html)
23. [**](../../akka/serialization/Serialization.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/serialization/Serialization.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/serialization/Serialization.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/serialization/Serialization.html#serialize(o:AnyRef):scala.util.Try[Array[Byte]] "Permalink")  def serialize(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]]Serializes the given AnyRef/java.lang.Object according to the Serialization configuration
to either an Array of Bytes or an Exception if one was thrown.
27. [**](../../akka/serialization/Serialization.html#serializerByIdentity:Map[Int,akka.serialization.Serializer] "Permalink")  val serializerByIdentity: Map\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [Serializer](Serializer.html)]Maps from a Serializer Identity (Int) to a Serializer instance (optimization)
28. [**](../../akka/serialization/Serialization.html#serializerFor(clazz:Class[_]):akka.serialization.Serializer "Permalink")  def serializerFor(clazz: Class\[\_]): [Serializer](Serializer.html)Returns the configured Serializer for the given Class.

Returns the configured Serializer for the given Class. The configured Serializer
is used if the configured class `isAssignableFrom` from the `clazz`, i.e.
the configured class is a super class or implemented interface. In case of
ambiguity it is primarily using the most specific configured class,
and secondly the entry configured first.

Throws java.io.NotSerializableException if no `serialization-bindings` is configured for the class.

Annotations@throws(classOf\[NotSerializableException])
29. [**](../../akka/serialization/Serialization.html#serializerOf(serializerFQN:String):scala.util.Try[akka.serialization.Serializer] "Permalink")  def serializerOf(serializerFQN: String): [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[Serializer](Serializer.html)]Tries to load the specified Serializer by the fully\-qualified name; the actual
loading is performed by the system’s [akka.actor.DynamicAccess](../actor/DynamicAccess.html).
30. [**](../../akka/serialization/Serialization.html#settings:akka.serialization.Serialization.Settings "Permalink")  val settings: [Settings](Serialization$$Settings.html)
31. [**](../../akka/serialization/Serialization.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../akka/serialization/Serialization.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)
33. [**](../../akka/serialization/Serialization.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
34. [**](../../akka/serialization/Serialization.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../akka/serialization/Serialization.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../akka/serialization/Serialization.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/serialization/Serialization.html#deserialize[T](bytes:Array[Byte],serializerId:Int,clazz:Option[Class[_<:T]]):scala.util.Try[T] "Permalink")  def deserialize\[T](bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], serializerId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), clazz: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Class\[\_ \<: T]]): [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]Deserializes the given array of bytes using the specified serializer id,
using the optional type hint to the Serializer.

Deserializes the given array of bytes using the specified serializer id,
using the optional type hint to the Serializer.
Returns either the resulting object or an Exception if one was thrown.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use deserialize that accepts the `manifest` as a class name.
2. [**](../../akka/serialization/Serialization.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../akka/serialization/Serialization.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Serialization toStringFormat\[Serialization] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../akka/serialization/Serialization.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Serialization, B)ImplicitThis member is added by an implicit conversion from Serialization toArrowAssoc\[Serialization] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSerialization to any2stringadd\[Serialization]

### Inherited by implicit conversion StringFormat fromSerialization to StringFormat\[Serialization]

### Inherited by implicit conversion Ensuring fromSerialization to Ensuring\[Serialization]

### Inherited by implicit conversion ArrowAssoc fromSerialization to ArrowAssoc\[Serialization]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/DynamicAccess.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka/current/akka/index.html
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
- https://doc.akka.io/api/akka/current/akka/serialization/Serialization$$Settings.html
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
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/serialization/Serialization.html](https://doc.akka.io/api/akka/current/akka/serialization/Serialization.html)*