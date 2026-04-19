---
description: Akka 2.10.17 - akka.serialization.ByteBufferSerializer
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:48:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/ByteBufferSerializer.html
title: Akka 2.10.17 - akka.serialization.ByteBufferSerializer
---

# Akka 2.10.17 - akka.serialization.ByteBufferSerializer

> **Summary:** Akka 2.10.17 - akka.serialization.ByteBufferSerializer

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
- ByteBufferSerializer
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
t[akka](../index.html).[serialization](index.html)

# ByteBufferSerializer[**](../../akka/serialization/ByteBufferSerializer.html "Permalink")

### 

#### trait ByteBufferSerializer extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Serializer between an object and a `ByteBuffer` representing that object.

Implementations should typically extend [SerializerWithStringManifest](SerializerWithStringManifest.html) and
in addition to the `ByteBuffer` based `toBinary` and `fromBinary` methods also
implement the array based `toBinary` and `fromBinary` methods. The array based
methods will be used when `ByteBuffer` is not used, e.g. in Akka Persistence.

Note that the array based methods can for example be implemented by delegation
like this:

```
 // you need to know the maximum size in bytes of the serialized messages
 val pool = new akka.io.DirectByteBufferPool(defaultBufferSize = 1024 * 1024, maxPoolEntries = 10)

// Implement this method for compatibility with `SerializerWithStringManifest`.
override def toBinary(o: AnyRef): Array[Byte] = {
  val buf = pool.acquire()
  try {
    toBinary(o, buf)
    buf.flip()
    val bytes = new Array[Byte](buf.remaining)
    buf.get(bytes)
    bytes
  } finally {
    pool.release(buf)
  }
}

// Implement this method for compatibility with `SerializerWithStringManifest`.
override def fromBinary(bytes: Array[Byte], manifest: String): AnyRef =
  fromBinary(ByteBuffer.wrap(bytes), manifest)
```
Source[Serializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/serialization/Serializer.scala#L214)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ByteArraySerializer](ByteArraySerializer.html), [DisabledJavaSerializer](DisabledJavaSerializer.html), [ByteStringSerializer](../remote/serialization/ByteStringSerializer.html), [IntSerializer](../remote/serialization/IntSerializer.html), [LongSerializer](../remote/serialization/LongSerializer.html), [StringSerializer](../remote/serialization/StringSerializer.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ByteBufferSerializer
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

1. [**](../../akka/serialization/ByteBufferSerializer.html#fromBinary(buf:java.nio.ByteBuffer,manifest:String):AnyRef "Permalink") abstract  def fromBinary(buf: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer), manifest: String): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from a `ByteBuffer`, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from a `ByteBuffer`, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Annotations@throws(classOf\[NotSerializableException])
2. [**](../../akka/serialization/ByteBufferSerializer.html#toBinary(o:AnyRef,buf:java.nio.ByteBuffer):Unit "Permalink") abstract  def toBinary(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), buf: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Serializes the given object into the `ByteBuffer`.
### Concrete Value Members

1. [**](../../akka/serialization/ByteBufferSerializer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/serialization/ByteBufferSerializer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/serialization/ByteBufferSerializer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ByteBufferSerializer toany2stringadd\[ByteBufferSerializer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/serialization/ByteBufferSerializer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ByteBufferSerializer, B)ImplicitThis member is added by an implicit conversion from ByteBufferSerializer toArrowAssoc\[ByteBufferSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/serialization/ByteBufferSerializer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/serialization/ByteBufferSerializer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/serialization/ByteBufferSerializer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/serialization/ByteBufferSerializer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ByteBufferSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ByteBufferSerializerImplicitThis member is added by an implicit conversion from ByteBufferSerializer toEnsuring\[ByteBufferSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/serialization/ByteBufferSerializer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ByteBufferSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteBufferSerializerImplicitThis member is added by an implicit conversion from ByteBufferSerializer toEnsuring\[ByteBufferSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/serialization/ByteBufferSerializer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ByteBufferSerializerImplicitThis member is added by an implicit conversion from ByteBufferSerializer toEnsuring\[ByteBufferSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/serialization/ByteBufferSerializer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteBufferSerializerImplicitThis member is added by an implicit conversion from ByteBufferSerializer toEnsuring\[ByteBufferSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/serialization/ByteBufferSerializer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/serialization/ByteBufferSerializer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/serialization/ByteBufferSerializer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/serialization/ByteBufferSerializer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/serialization/ByteBufferSerializer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/serialization/ByteBufferSerializer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/serialization/ByteBufferSerializer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/serialization/ByteBufferSerializer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/serialization/ByteBufferSerializer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/serialization/ByteBufferSerializer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/serialization/ByteBufferSerializer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/serialization/ByteBufferSerializer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/serialization/ByteBufferSerializer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/serialization/ByteBufferSerializer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/serialization/ByteBufferSerializer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ByteBufferSerializer toStringFormat\[ByteBufferSerializer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/serialization/ByteBufferSerializer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ByteBufferSerializer, B)ImplicitThis member is added by an implicit conversion from ByteBufferSerializer toArrowAssoc\[ByteBufferSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromByteBufferSerializer to any2stringadd\[ByteBufferSerializer]

### Inherited by implicit conversion StringFormat fromByteBufferSerializer to StringFormat\[ByteBufferSerializer]

### Inherited by implicit conversion Ensuring fromByteBufferSerializer to Ensuring\[ByteBufferSerializer]

### Inherited by implicit conversion ArrowAssoc fromByteBufferSerializer to ArrowAssoc\[ByteBufferSerializer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/ByteStringSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/IntSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/LongSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/StringSerializer.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/serialization/ByteBufferSerializer.html](https://doc.akka.io/api/akka-core/2.10/akka/serialization/ByteBufferSerializer.html)*