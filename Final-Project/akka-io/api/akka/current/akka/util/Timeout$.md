---
description: Akka 2.10.17 - akka.util.Timeout
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/Timeout$.html
title: Akka 2.10.17 - akka.util.Timeout
---

# Akka 2.10.17 - akka.util.Timeout

> **Summary:** Akka 2.10.17 - akka.util.Timeout

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
[o](Timeout.html "See companion class")[akka](../index.html).[util](index.html)

# [Timeout](Timeout.html "See companion class")[**](../../akka/util/Timeout$.html "Permalink")

### Companion [class Timeout](Timeout.html "See companion class")

#### object Timeout extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

A Timeout is a wrapper on top of Duration to be more specific about what the duration means.

Source[Timeout.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/Timeout.scala#L25)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Timeout
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/util/Timeout$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/Timeout$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/Timeout$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/util/Timeout$.html#apply(length:Long,unit:java.util.concurrent.TimeUnit):akka.util.Timeout "Permalink")  def apply(length: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), unit: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Timeout](Timeout.html)Construct a Timeout from the given time unit and factor.
5. [**](../../akka/util/Timeout$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/util/Timeout$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/util/Timeout$.html#create(duration:java.time.Duration):akka.util.Timeout "Permalink")  def create(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Timeout](Timeout.html)Create a Timeout from java.time.Duration.
8. [**](../../akka/util/Timeout$.html#durationToTimeout(duration:scala.concurrent.duration.FiniteDuration):akka.util.Timeout "Permalink") implicit  def durationToTimeout(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Timeout](Timeout.html)
9. [**](../../akka/util/Timeout$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/util/Timeout$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../akka/util/Timeout$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/util/Timeout$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/util/Timeout$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../akka/util/Timeout$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/util/Timeout$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/util/Timeout$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/util/Timeout$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../akka/util/Timeout$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../akka/util/Timeout$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../akka/util/Timeout$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../akka/util/Timeout$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/util/Timeout$.html#zero:akka.util.Timeout "Permalink")  val zero: [Timeout](Timeout.html)A timeout with zero duration, will cause most requests to always timeout.
### Deprecated Value Members

1. [**](../../akka/util/Timeout$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

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
*Source: [https://doc.akka.io/api/akka/current/akka/util/Timeout$.html](https://doc.akka.io/api/akka/current/akka/util/Timeout$.html)*