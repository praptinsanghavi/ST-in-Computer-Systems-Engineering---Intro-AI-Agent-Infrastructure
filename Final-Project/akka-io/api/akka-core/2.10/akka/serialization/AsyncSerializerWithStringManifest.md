---
description: Akka 2.10.17 - akka.serialization.AsyncSerializerWithStringManifest
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:23:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/AsyncSerializerWithStringManifest.html
title: Akka 2.10.17 - akka.serialization.AsyncSerializerWithStringManifest
---

# Akka 2.10.17 - akka.serialization.AsyncSerializerWithStringManifest

> **Summary:** Akka 2.10.17 - akka.serialization.AsyncSerializerWithStringManifest

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/jackson/index.html "Permalink")  package [jackson](jackson/index.html)Definition Classes[serialization](index.html)
- [AsyncSerializer](AsyncSerializer.html "Serializer that supports async serialization.")
- AsyncSerializerWithStringManifest
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
c[akka](../index.html).[serialization](index.html)

# AsyncSerializerWithStringManifest[**](../../akka/serialization/AsyncSerializerWithStringManifest.html "Permalink")

### 

#### abstract  class AsyncSerializerWithStringManifest extends [SerializerWithStringManifest](SerializerWithStringManifest.html) with [AsyncSerializer](AsyncSerializer.html)

Scala API: Async serializer with string manifest that delegates synchronous calls to the asynchronous calls
and blocks.

Source[AsyncSerializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/serialization/AsyncSerializer.scala#L42)Linear Supertypes[AsyncSerializer](AsyncSerializer.html), [SerializerWithStringManifest](SerializerWithStringManifest.html), [Serializer](Serializer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AsyncSerializerWithStringManifestCS](AsyncSerializerWithStringManifestCS.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AsyncSerializerWithStringManifest
2. AsyncSerializer
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

1. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#<init>(system:akka.actor.ExtendedActorSystem):akka.serialization.AsyncSerializerWithStringManifest "Permalink")  new AsyncSerializerWithStringManifest(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html))
### Abstract Value Members

1. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#fromBinaryAsync(bytes:Array[Byte],manifest:String):scala.concurrent.Future[AnyRef] "Permalink") abstract  def fromBinaryAsync(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Produces an object from an array of bytes, with an optional type\-hint.

Produces an object from an array of bytes, with an optional type\-hint.

Definition Classes[AsyncSerializer](AsyncSerializer.html)
2. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#identifier:Int "Permalink") abstract  def identifier: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Completely unique value to identify this implementation of Serializer, used to optimize network traffic.

Completely unique value to identify this implementation of Serializer, used to optimize network traffic.
Values from 0 to 40 are reserved for Akka internal usage.

Definition Classes[SerializerWithStringManifest](SerializerWithStringManifest.html) → [Serializer](Serializer.html)
3. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#manifest(o:AnyRef):String "Permalink") abstract  def manifest(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): StringReturn the manifest (type hint) that will be provided in the fromBinary method.

Return the manifest (type hint) that will be provided in the fromBinary method.
Use `""` if manifest is not needed.

Definition Classes[SerializerWithStringManifest](SerializerWithStringManifest.html)
4. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#toBinaryAsync(o:AnyRef):scala.concurrent.Future[Array[Byte]] "Permalink") abstract  def toBinaryAsync(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]]Serializes the given object into an Array of Byte.

Serializes the given object into an Array of Byte.

Note that the array must not be mutated by the serializer after it has been used to complete the returned `Future`.

Definition Classes[AsyncSerializer](AsyncSerializer.html)
### Concrete Value Members

1. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AsyncSerializerWithStringManifest toany2stringadd\[AsyncSerializerWithStringManifest] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AsyncSerializerWithStringManifest, B)ImplicitThis member is added by an implicit conversion from AsyncSerializerWithStringManifest toArrowAssoc\[AsyncSerializerWithStringManifest] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AsyncSerializerWithStringManifest) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AsyncSerializerWithStringManifestImplicitThis member is added by an implicit conversion from AsyncSerializerWithStringManifest toEnsuring\[AsyncSerializerWithStringManifest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AsyncSerializerWithStringManifest) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AsyncSerializerWithStringManifestImplicitThis member is added by an implicit conversion from AsyncSerializerWithStringManifest toEnsuring\[AsyncSerializerWithStringManifest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AsyncSerializerWithStringManifestImplicitThis member is added by an implicit conversion from AsyncSerializerWithStringManifest toEnsuring\[AsyncSerializerWithStringManifest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AsyncSerializerWithStringManifestImplicitThis member is added by an implicit conversion from AsyncSerializerWithStringManifest toEnsuring\[AsyncSerializerWithStringManifest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#fromBinary(bytes:Array[Byte],manifest:String):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: String): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint.

Produces an object from an array of bytes, with an optional type\-hint.

It's recommended to throw `java.io.NotSerializableException` in `fromBinary`
if the manifest is unknown. This makes it possible to introduce new message
types and send them to nodes that don't know about them. This is typically
needed when performing rolling upgrades, i.e. running a cluster with mixed
versions for while. `NotSerializableException` is treated as a transient
problem in the TCP based remoting layer. The problem will be logged
and message is dropped. Other exceptions will tear down the TCP connection
because it can be an indication of corrupt bytes from the underlying transport.

Definition ClassesAsyncSerializerWithStringManifest → [SerializerWithStringManifest](SerializerWithStringManifest.html)
15. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#fromBinary(bytes:Array[Byte],manifest:Option[Class[_]]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], manifest: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Class\[\_]]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Produces an object from an array of bytes, with an optional type\-hint;
the class should be loaded using ActorSystem.dynamicAccess.

Definition Classes[SerializerWithStringManifest](SerializerWithStringManifest.html) → [Serializer](Serializer.html)
16. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#fromBinary(bytes:Array[Byte],clazz:Class[_]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], clazz: Class\[\_]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize with type hint

Java API: deserialize with type hint

Definition Classes[Serializer](Serializer.html)Annotations@throws(classOf\[NotSerializableException])
17. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#fromBinary(bytes:Array[Byte]):AnyRef "Permalink") final  def fromBinary(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: deserialize without type hint

Java API: deserialize without type hint

Definition Classes[Serializer](Serializer.html)
18. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#includeManifest:Boolean "Permalink") final  def includeManifest: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns whether this serializer needs a manifest in the fromBinary method

Returns whether this serializer needs a manifest in the fromBinary method

Definition Classes[SerializerWithStringManifest](SerializerWithStringManifest.html) → [Serializer](Serializer.html)
21. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#toBinary(o:AnyRef):Array[Byte] "Permalink") final  def toBinary(o: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Serializes the given object into an Array of Byte.

Serializes the given object into an Array of Byte.

Note that the array must not be mutated by the serializer after it has been returned.

Definition ClassesAsyncSerializerWithStringManifest → [SerializerWithStringManifest](SerializerWithStringManifest.html) → [Serializer](Serializer.html)
27. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AsyncSerializerWithStringManifest toStringFormat\[AsyncSerializerWithStringManifest] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/serialization/AsyncSerializerWithStringManifest.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AsyncSerializerWithStringManifest, B)ImplicitThis member is added by an implicit conversion from AsyncSerializerWithStringManifest toArrowAssoc\[AsyncSerializerWithStringManifest] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AsyncSerializer](AsyncSerializer.html)

### Inherited from [SerializerWithStringManifest](SerializerWithStringManifest.html)

### Inherited from [Serializer](Serializer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAsyncSerializerWithStringManifest to any2stringadd\[AsyncSerializerWithStringManifest]

### Inherited by implicit conversion StringFormat fromAsyncSerializerWithStringManifest to StringFormat\[AsyncSerializerWithStringManifest]

### Inherited by implicit conversion Ensuring fromAsyncSerializerWithStringManifest to Ensuring\[AsyncSerializerWithStringManifest]

### Inherited by implicit conversion ArrowAssoc fromAsyncSerializerWithStringManifest to ArrowAssoc\[AsyncSerializerWithStringManifest]

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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifest.html](https://doc.akka.io/api/akka-core/2.10/akka/serialization/AsyncSerializerWithStringManifest.html)*