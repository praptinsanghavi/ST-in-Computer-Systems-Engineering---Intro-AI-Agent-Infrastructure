---
description: Akka 2.10.17 - akka.util.HashCode
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:47:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/HashCode$.html
title: Akka 2.10.17 - akka.util.HashCode
---

# Akka 2.10.17 - akka.util.HashCode

> **Summary:** Akka 2.10.17 - akka.util.HashCode

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
- HashCode
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
o[akka](../index.html).[util](index.html)

# HashCode[**](../../akka/util/HashCode$.html "Permalink")

### 

#### object HashCode

Set of methods which allow easy implementation of `hashCode`.

Example:

```

 override def hashCode: Int = {
   var result = HashCode.SEED
   //collect the contributions of various fields
   result = HashCode.hash(result, fPrimitive)
   result = HashCode.hash(result, fObject)
   result = HashCode.hash(result, fArray)
   result
 }

```

Source[HashCode.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/HashCode.scala#L25)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HashCode
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/util/HashCode$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/HashCode$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/HashCode$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/util/HashCode$.html#SEED:Int "Permalink")  val SEED: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
5. [**](../../akka/util/HashCode$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/util/HashCode$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/util/HashCode$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../akka/util/HashCode$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../akka/util/HashCode$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/util/HashCode$.html#hash(seed:Int,value:Double):Int "Permalink")  def hash(seed: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), value: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
11. [**](../../akka/util/HashCode$.html#hash(seed:Int,value:Float):Int "Permalink")  def hash(seed: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), value: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
12. [**](../../akka/util/HashCode$.html#hash(seed:Int,value:Long):Int "Permalink")  def hash(seed: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), value: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
13. [**](../../akka/util/HashCode$.html#hash(seed:Int,value:Int):Int "Permalink")  def hash(seed: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), value: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
14. [**](../../akka/util/HashCode$.html#hash(seed:Int,value:Char):Int "Permalink")  def hash(seed: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), value: [Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
15. [**](../../akka/util/HashCode$.html#hash(seed:Int,value:Boolean):Int "Permalink")  def hash(seed: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), value: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
16. [**](../../akka/util/HashCode$.html#hash(seed:Int,any:Any):Int "Permalink")  def hash(seed: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), any: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
17. [**](../../akka/util/HashCode$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/util/HashCode$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/util/HashCode$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/util/HashCode$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/util/HashCode$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/util/HashCode$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/util/HashCode$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../akka/util/HashCode$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/util/HashCode$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/util/HashCode$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/HashCode$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/api/akka/current/akka/util/BoxedType$.html
- https://doc.akka.io/api/akka/current/akka/util/ByteIterator$.html
- https://doc.akka.io/api/akka/current/akka/util/ByteIterator.html
- https://doc.akka.io/api/akka/current/akka/util/ByteString$.html
- https://doc.akka.io/api/akka/current/akka/util/ByteString.html
- https://doc.akka.io/api/akka/current/akka/util/ByteStringBuilder.html
- https://doc.akka.io/api/akka/current/akka/util/ClassLoaderObjectInputStream.html
- https://doc.akka.io/api/akka/current/akka/util/CompactByteString$.html
- https://doc.akka.io/api/akka/current/akka/util/CompactByteString.html
- https://doc.akka.io/api/akka/current/akka/util/ConcurrentMultiMap.html
- https://doc.akka.io/api/akka/current/akka/util/HashCode$.html
- https://doc.akka.io/api/akka/current/akka/util/Helpers$.html
- https://doc.akka.io/api/akka/current/akka/util/Index.html
- https://doc.akka.io/api/akka/current/akka/util/LineNumbers$.html
- https://doc.akka.io/api/akka/current/akka/util/ManifestInfo$.html
- https://doc.akka.io/api/akka/current/akka/util/ManifestInfo.html
- https://doc.akka.io/api/akka/current/akka/util/MessageBuffer$.html
- https://doc.akka.io/api/akka/current/akka/util/MessageBuffer.html
- https://doc.akka.io/api/akka/current/akka/util/MessageBufferMap.html
- https://doc.akka.io/api/akka/current/akka/util/NanoTimeTokenBucket.html
- https://doc.akka.io/api/akka/current/akka/util/PriorityQueueStabilizer$.html
- https://doc.akka.io/api/akka/current/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/api/akka/current/akka/util/ReentrantGuard.html
- https://doc.akka.io/api/akka/current/akka/util/StablePriorityBlockingQueue.html
- https://doc.akka.io/api/akka/current/akka/util/StablePriorityQueue.html
- https://doc.akka.io/api/akka/current/akka/util/Subclassification.html
- https://doc.akka.io/api/akka/current/akka/util/Switch.html
- https://doc.akka.io/api/akka/current/akka/util/Timeout$.html
- https://doc.akka.io/api/akka/current/akka/util/Timeout.html
- https://doc.akka.io/api/akka/current/akka/util/TypedMultiMap$.html
- https://doc.akka.io/api/akka/current/akka/util/TypedMultiMap.html
- https://doc.akka.io/api/akka/current/akka/util/UUIDComparator$.html
- https://doc.akka.io/api/akka/current/akka/util/UUIDComparator.html
- https://doc.akka.io/api/akka/current/akka/util/Unsafe.html
- https://doc.akka.io/api/akka/current/akka/util/Version$.html
- https://doc.akka.io/api/akka/current/akka/util/Version.html
- https://doc.akka.io/api/akka/current/akka/util/WallClock$.html
- https://doc.akka.io/api/akka/current/akka/util/WallClock.html
- https://doc.akka.io/api/akka/current/akka/util/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/util/HashCode$.html](https://doc.akka.io/api/akka/current/akka/util/HashCode$.html)*