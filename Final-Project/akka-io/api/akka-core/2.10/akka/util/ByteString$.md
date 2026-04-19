---
description: Akka 2.10.17 - akka.util.ByteString
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:31:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/ByteString$.html
title: Akka 2.10.17 - akka.util.ByteString
---

# Akka 2.10.17 - akka.util.ByteString

> **Summary:** Akka 2.10.17 - akka.util.ByteString

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](index.html)Definition Classes[akka](../index.html)
- [BoundedBlockingQueue](BoundedBlockingQueue.html "BoundedBlockingQueue wraps any Queue and turns the result into a BlockingQueue with a limited capacity.")
- [BoxedType](BoxedType$.html)
- [ByteIterator](ByteIterator.html "An iterator over a ByteString.")
- [ByteString](ByteString.html "A rope-like immutable data structure containing bytes.")
- [ByteStringBuilder](ByteStringBuilder.html "A mutable builder for efficiently creating a akka.util.ByteString.")
- [ClassLoaderObjectInputStream](ClassLoaderObjectInputStream.html "ClassLoaderObjectInputStream tries to utilize the provided ClassLoader to load Classes and falls back to ObjectInputStreams resolver.")
- [CompactByteString](CompactByteString.html "A compact ByteString.")
- [ConcurrentMultiMap](ConcurrentMultiMap.html "An implementation of a ConcurrentMultiMap Adds/remove is serialized over the specified key Reads are fully concurrent <-- el-cheapo")
- [HashCode](HashCode$.html "Set of methods which allow easy implementation of hashCode.")
- [Helpers](Helpers$.html)
- [Index](Index.html "An implementation of a ConcurrentMultiMap Adds/remove is serialized over the specified key Reads are fully concurrent <-- el-cheapo")
- [LineNumbers](LineNumbers$.html "This is a minimized byte-code parser that concentrates exclusively on line numbers and source file extraction.")
- [ManifestInfo](ManifestInfo.html "Utility that extracts ManifestInfo#Version information from META-INF/MANIFEST.MF in jar files on the classpath.")
- [MessageBuffer](MessageBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors.")
- [MessageBufferMap](MessageBufferMap.html "A non thread safe mutable message buffer map that can be used to buffer messages inside actors.")
- [NanoTimeTokenBucket](NanoTimeTokenBucket.html "Default implementation of TokenBucket that uses System.nanoTime as the time source.")
- [PriorityQueueStabilizer](PriorityQueueStabilizer.html "PriorityQueueStabilizer wraps a priority queue so that it respects FIFO for elements of equal priority.")
- [ReentrantGuard](ReentrantGuard.html)
- [StablePriorityBlockingQueue](StablePriorityBlockingQueue.html "StablePriorityBlockingQueue is a blocking priority queue that preserves order for elements of equal priority.")
- [StablePriorityQueue](StablePriorityQueue.html "StablePriorityQueue is a priority queue that preserves order for elements of equal priority.")
- [Subclassification](Subclassification.html "Typeclass which describes a classification hierarchy.")
- [Switch](Switch.html "An atomic switch that can be either on or off")
- [Timeout](Timeout.html)
- [TypedMultiMap](TypedMultiMap.html "An immutable multi-map that expresses the value type as a type function of the key type.")
- [UUIDComparator](UUIDComparator.html "Scala implementation of UUIDComparator in https://github.com/cowtowncoder/java-uuid-generator Apache License 2.0.")
- [Unsafe](Unsafe.html "INTERNAL API")
- [Version](Version.html "Comparable version information.")
- [WallClock](WallClock.html "A time source.")
[o](ByteString.html "See companion class")[akka](../index.html).[util](index.html)

# [ByteString](ByteString.html "See companion class")[**](../../akka/util/ByteString$.html "Permalink")

### Companion [class ByteString](ByteString.html "See companion class")

#### object ByteString

Source[ByteString.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala-2.13/akka/util/ByteString.scala#L21)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ByteString
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/util/ByteString$$ByteString1.html "Permalink") final  class [ByteString1](ByteString$$ByteString1.html "An unfragmented ByteString.") extends [ByteString](ByteString.html) with SerializableAn unfragmented ByteString.
2. [**](../../akka/util/ByteString$$ByteString1C.html "Permalink") final  class [ByteString1C](ByteString$$ByteString1C.html "A compact (unsliced) and unfragmented ByteString, implementation of ByteString1C.") extends [CompactByteString](CompactByteString.html)A compact (unsliced) and unfragmented ByteString, implementation of ByteString1C.

A compact (unsliced) and unfragmented ByteString, implementation of ByteString1C.

Annotations@SerialVersionUID()
3. [**](../../akka/util/ByteString$$ByteStrings.html "Permalink") final  class [ByteStrings](ByteString$$ByteStrings.html "A ByteString with 2 or more fragments.") extends [ByteString](ByteString.html) with SerializableA ByteString with 2 or more fragments.
### Value Members

1. [**](../../akka/util/ByteString$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/ByteString$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/ByteString$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/util/ByteString$.html#UTF_8:String "Permalink")  val UTF\_8: StringStandard "UTF\-8" charset
5. [**](../../akka/util/ByteString$.html#apply(string:String,charset:java.nio.charset.Charset):akka.util.ByteString "Permalink")  def apply(string: String, charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset)): [ByteString](ByteString.html)Creates a new ByteString by encoding a String with a charset.
6. [**](../../akka/util/ByteString$.html#apply(string:String,charset:String):akka.util.ByteString "Permalink")  def apply(string: String, charset: String): [ByteString](ByteString.html)Creates a new ByteString by encoding a String with a charset.
7. [**](../../akka/util/ByteString$.html#apply(string:String):akka.util.ByteString "Permalink")  def apply(string: String): [ByteString](ByteString.html)Creates a new ByteString by encoding a String as UTF\-8\.
8. [**](../../akka/util/ByteString$.html#apply(bytes:java.nio.ByteBuffer):akka.util.ByteString "Permalink")  def apply(bytes: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)): [ByteString](ByteString.html)Creates a new ByteString by copying bytes from a ByteBuffer.
9. [**](../../akka/util/ByteString$.html#apply[T](bytes:T*)(implicitnum:Integral[T]):akka.util.ByteString "Permalink")  def apply\[T](bytes: T\*)(implicit num: Integral\[T]): [ByteString](ByteString.html)Creates a new ByteString by converting from integral numbers to bytes.
10. [**](../../akka/util/ByteString$.html#apply(bytes:IterableOnce[Byte]):akka.util.ByteString "Permalink")  def apply(bytes: IterableOnce\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [ByteString](ByteString.html)Creates a new ByteString by iterating over bytes.
11. [**](../../akka/util/ByteString$.html#apply(bytes:Byte*):akka.util.ByteString "Permalink")  def apply(bytes: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)\*): [ByteString](ByteString.html)Creates a new ByteString by copying bytes.
12. [**](../../akka/util/ByteString$.html#apply(bytes:Array[Byte]):akka.util.ByteString "Permalink")  def apply(bytes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [ByteString](ByteString.html)Creates a new ByteString by copying a byte array.
13. [**](../../akka/util/ByteString$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
14. [**](../../akka/util/ByteString$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/util/ByteString$.html#createBuilder:akka.util.ByteStringBuilder "Permalink")  def createBuilder: [ByteStringBuilder](ByteStringBuilder.html)Java API
16. [**](../../akka/util/ByteString$.html#empty:akka.util.ByteString "Permalink")  val empty: [ByteString](ByteString.html)
17. [**](../../akka/util/ByteString$.html#emptyByteString:akka.util.ByteString "Permalink")  def emptyByteString: [ByteString](ByteString.html)Java API
18. [**](../../akka/util/ByteString$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/util/ByteString$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/util/ByteString$.html#fromArray(array:Array[Byte],offset:Int,length:Int):akka.util.ByteString "Permalink")  def fromArray(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), length: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ByteString](ByteString.html)Creates a new ByteString by copying length bytes starting at offset from
an Array.
21. [**](../../akka/util/ByteString$.html#fromArray(array:Array[Byte]):akka.util.ByteString "Permalink")  def fromArray(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [ByteString](ByteString.html)Creates a new ByteString by copying a byte array.
22. [**](../../akka/util/ByteString$.html#fromArrayUnsafe(array:Array[Byte],offset:Int,length:Int):akka.util.ByteString "Permalink")  def fromArrayUnsafe(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), length: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ByteString](ByteString.html)Unsafe API: Use only in situations you are completely confident that this is what
you need, and that you understand the implications documented below.

Unsafe API: Use only in situations you are completely confident that this is what
you need, and that you understand the implications documented below.

Creates a ByteString without copying the passed in byte array, unlike other factory
methods defined on ByteString. This method of creating a ByteString saves one array
copy and allocation and therefore can lead to better performance, however it also means
that one MUST NOT modify the passed in array, or unexpected immutable data structure
contract\-breaking behavior will manifest itself.

This API is intended for users who have obtained an byte array from some other API, and
want wrap it into an ByteArray, and from there on only use that reference (the ByteString)
to operate on the wrapped data. For all other intents and purposes, please use the usual
apply and create methods \- which provide the immutability guarantees by copying the array.
23. [**](../../akka/util/ByteString$.html#fromArrayUnsafe(array:Array[Byte]):akka.util.ByteString "Permalink")  def fromArrayUnsafe(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [ByteString](ByteString.html)Unsafe API: Use only in situations you are completely confident that this is what
you need, and that you understand the implications documented below.

Unsafe API: Use only in situations you are completely confident that this is what
you need, and that you understand the implications documented below.

Creates a ByteString without copying the passed in byte array, unlike other factory
methods defined on ByteString. This method of creating a ByteString saves one array
copy and allocation and therefore can lead to better performance, however it also means
that one MUST NOT modify the passed in array, or unexpected immutable data structure
contract\-breaking behavior will manifest itself.

This API is intended for users who have obtained an byte array from some other API, and
want wrap it into an ByteArray, and from there on only use that reference (the ByteString)
to operate on the wrapped data. For all other intents and purposes, please use the usual
apply and create methods \- which provide the immutability guarantees by copying the array.
24. [**](../../akka/util/ByteString$.html#fromByteBuffer(buffer:java.nio.ByteBuffer):akka.util.ByteString "Permalink")  def fromByteBuffer(buffer: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)): [ByteString](ByteString.html)Creates a new ByteString by copying bytes out of a ByteBuffer.
25. [**](../../akka/util/ByteString$.html#fromInts(array:Int*):akka.util.ByteString "Permalink")  def fromInts(array: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)\*): [ByteString](ByteString.html)JAVA API
Creates a new ByteString by copying an int array by converting from integral numbers to bytes.

JAVA API
Creates a new ByteString by copying an int array by converting from integral numbers to bytes.

Annotations@varargs()
26. [**](../../akka/util/ByteString$.html#fromString(string:String,charset:java.nio.charset.Charset):akka.util.ByteString "Permalink")  def fromString(string: String, charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset)): [ByteString](ByteString.html)Creates a new ByteString which will contain the representation of the given String in the given charset
27. [**](../../akka/util/ByteString$.html#fromString(string:String,charset:String):akka.util.ByteString "Permalink")  def fromString(string: String, charset: String): [ByteString](ByteString.html)Creates a new ByteString which will contain the representation of the given String in the given charset
28. [**](../../akka/util/ByteString$.html#fromString(string:String):akka.util.ByteString "Permalink")  def fromString(string: String): [ByteString](ByteString.html)Creates a new ByteString which will contain the UTF\-8 representation of the given String
29. [**](../../akka/util/ByteString$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../akka/util/ByteString$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../akka/util/ByteString$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
32. [**](../../akka/util/ByteString$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
33. [**](../../akka/util/ByteString$.html#newBuilder:akka.util.ByteStringBuilder "Permalink")  def newBuilder: [ByteStringBuilder](ByteStringBuilder.html)
34. [**](../../akka/util/ByteString$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../akka/util/ByteString$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../akka/util/ByteString$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../akka/util/ByteString$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
38. [**](../../akka/util/ByteString$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../akka/util/ByteString$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
40. [**](../../akka/util/ByteString$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/ByteString$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/BoxedType$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString$$ByteString1.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString$$ByteString1C.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString$$ByteStrings.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteStringBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ClassLoaderObjectInputStream.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/CompactByteString$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/CompactByteString.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ConcurrentMultiMap.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/HashCode$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Helpers$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/LineNumbers$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ManifestInfo$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ManifestInfo.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/MessageBuffer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/MessageBuffer.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/MessageBufferMap.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/NanoTimeTokenBucket.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/PriorityQueueStabilizer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ReentrantGuard.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/StablePriorityBlockingQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/StablePriorityQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Subclassification.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Switch.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Timeout$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/TypedMultiMap$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/TypedMultiMap.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/UUIDComparator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/UUIDComparator.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Unsafe.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Version$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Version.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/WallClock$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/WallClock.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString$.html](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString$.html)*