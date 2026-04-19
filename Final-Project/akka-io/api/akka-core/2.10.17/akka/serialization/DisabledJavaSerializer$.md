---
description: Akka 2.10.17 - akka.serialization.DisabledJavaSerializer
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:08:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/DisabledJavaSerializer$.html
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
- [DisabledJavaSerializer](DisabledJavaSerializer.html "This Serializer is used when akka.actor.java-serialization = off")
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
[o](DisabledJavaSerializer.html "See companion class")[akka](../index.html).[serialization](index.html)

# [DisabledJavaSerializer](DisabledJavaSerializer.html "See companion class")[**](../../akka/serialization/DisabledJavaSerializer$.html "Permalink")

### Companion [class DisabledJavaSerializer](DisabledJavaSerializer.html "See companion class")

#### object DisabledJavaSerializer extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[Serializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/serialization/Serializer.scala#L415)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DisabledJavaSerializer
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/serialization/DisabledJavaSerializer$$JavaSerializationException.html "Permalink") final  class [JavaSerializationException](DisabledJavaSerializer$$JavaSerializationException.html) extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)
### Value Members

1. [**](../../akka/serialization/DisabledJavaSerializer$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/serialization/DisabledJavaSerializer$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/serialization/DisabledJavaSerializer$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/serialization/DisabledJavaSerializer$.html#IllegalDeserialization:akka.serialization.DisabledJavaSerializer.JavaSerializationException "Permalink") final  val IllegalDeserialization: [JavaSerializationException](DisabledJavaSerializer$$JavaSerializationException.html)
5. [**](../../akka/serialization/DisabledJavaSerializer$.html#IllegalSerialization:akka.serialization.DisabledJavaSerializer.JavaSerializationException "Permalink") final  val IllegalSerialization: [JavaSerializationException](DisabledJavaSerializer$$JavaSerializationException.html)
6. [**](../../akka/serialization/DisabledJavaSerializer$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/serialization/DisabledJavaSerializer$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/serialization/DisabledJavaSerializer$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../akka/serialization/DisabledJavaSerializer$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/serialization/DisabledJavaSerializer$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/serialization/DisabledJavaSerializer$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/serialization/DisabledJavaSerializer$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../akka/serialization/DisabledJavaSerializer$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/serialization/DisabledJavaSerializer$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/serialization/DisabledJavaSerializer$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/serialization/DisabledJavaSerializer$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../akka/serialization/DisabledJavaSerializer$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../akka/serialization/DisabledJavaSerializer$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../akka/serialization/DisabledJavaSerializer$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../akka/serialization/DisabledJavaSerializer$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/serialization/DisabledJavaSerializer$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/AsyncSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/AsyncSerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/AsyncSerializerWithStringManifestCS.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/BaseSerializer$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/BaseSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/ByteArraySerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/ByteBufferSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/DisabledJavaSerializer$$JavaSerializationException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/DisabledJavaSerializer$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/DisabledJavaSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/JSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/JavaSerializer$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/JavaSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/NullSerializer$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/NullSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/Serialization$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/Serialization.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/SerializationExtension$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/SerializationSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/SerializationSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/SerializerDetails$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/SerializerDetails.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/SerializerWithStringManifest.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/Serializers$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/DisabledJavaSerializer$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/DisabledJavaSerializer$.html)*