---
description: Akka 2.10.17 - akka.util.Helpers
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:00:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/Helpers$.html
title: Akka 2.10.17 - akka.util.Helpers
---

# Akka 2.10.17 - akka.util.Helpers

> **Summary:** Akka 2.10.17 - akka.util.Helpers

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
- Helpers
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

# Helpers[**](../../akka/util/Helpers$.html "Permalink")

### 

#### object Helpers

Source[Helpers.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/Helpers.scala#L20)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Helpers
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/util/Helpers$$Requiring.html "Permalink") implicit final  class [Requiring](Helpers$$Requiring.html "Implicit class providing requiring methods.")\[A] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Implicit class providing `requiring` methods.

Implicit class providing `requiring` methods. This class is based on
`Predef.ensuring` in the Scala standard library. The difference is that
this class's methods throw `IllegalArgumentException`s rather than
`AssertionError`s.

An example adapted from `Predef`'s documentation:

```
import akka.util.Helpers.Requiring

def addNaturals(nats: List[Int]): Int = {
  require(nats forall (_ >= 0), "List contains negative numbers")
  nats.foldLeft(0)(_ + _)
} requiring(_ >= 0)
```
Annotations@inline()
### Value Members

1. [**](../../akka/util/Helpers$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/Helpers$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/Helpers$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/util/Helpers$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/util/Helpers$.html#base64(l:Long,sb:StringBuilder):String "Permalink")  def base64(l: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), sb: [StringBuilder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html#java.lang.StringBuilder) \= new java.lang.StringBuilder("$")): StringAnnotations@tailrec()
6. [**](../../akka/util/Helpers$.html#base64chars:String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789+~") "Permalink") final  val base64chars: String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\+\~")
7. [**](../../akka/util/Helpers$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/util/Helpers$.html#compareIdentityHash(a:AnyRef,b:AnyRef):Int "Permalink")  def compareIdentityHash(a: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), b: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
9. [**](../../akka/util/Helpers$.html#currentTimeMillisToUTCString(timestamp:Long):String "Permalink")  def currentTimeMillisToUTCString(timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): StringConverts a "currentTimeMillis"\-obtained timestamp accordingly:

Converts a "currentTimeMillis"\-obtained timestamp accordingly:

```
"$hours%02d:$minutes%02d:$seconds%02d.$ms%03dUTC"
```
timestampa "currentTimeMillis"\-obtained timestamp

returnsthe formatted timestamp
10. [**](../../akka/util/Helpers$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../akka/util/Helpers$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../akka/util/Helpers$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/util/Helpers$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/util/Helpers$.html#identityHashComparator[T<:AnyRef](comp:java.util.Comparator[T]):java.util.Comparator[T] "Permalink")  def identityHashComparator\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](comp: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[T]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[T]Create a comparator which will efficiently use `System.identityHashCode`,
unless that happens to be the same for two non\-equals objects, in which
case the supplied “real” comparator is used; the comparator must be
consistent with equals, otherwise it would not be an enhancement over
the identityHashCode.
15. [**](../../akka/util/Helpers$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/util/Helpers$.html#isWindows:Boolean "Permalink")  val isWindows: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
17. [**](../../akka/util/Helpers$.html#makePattern(s:String):java.util.regex.Pattern "Permalink")  def makePattern(s: String): [Pattern](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#java.util.regex.Pattern)
18. [**](../../akka/util/Helpers$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/util/Helpers$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/util/Helpers$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/util/Helpers$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/util/Helpers$.html#timestamp(time:Long):String "Permalink")  def timestamp(time: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): String
23. [**](../../akka/util/Helpers$.html#toRootLowerCase(s:String):String "Permalink")  def toRootLowerCase(s: String): String
24. [**](../../akka/util/Helpers$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../akka/util/Helpers$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../akka/util/Helpers$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../akka/util/Helpers$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/Helpers$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/api/akka/2.10/akka/util/BoxedType$.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteIterator$.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteIterator.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteString$.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteStringBuilder.html
- https://doc.akka.io/api/akka/2.10/akka/util/ClassLoaderObjectInputStream.html
- https://doc.akka.io/api/akka/2.10/akka/util/CompactByteString$.html
- https://doc.akka.io/api/akka/2.10/akka/util/CompactByteString.html
- https://doc.akka.io/api/akka/2.10/akka/util/ConcurrentMultiMap.html
- https://doc.akka.io/api/akka/2.10/akka/util/HashCode$.html
- https://doc.akka.io/api/akka/2.10/akka/util/Helpers$$Requiring.html
- https://doc.akka.io/api/akka/2.10/akka/util/Helpers$.html
- https://doc.akka.io/api/akka/2.10/akka/util/Index.html
- https://doc.akka.io/api/akka/2.10/akka/util/LineNumbers$.html
- https://doc.akka.io/api/akka/2.10/akka/util/ManifestInfo$.html
- https://doc.akka.io/api/akka/2.10/akka/util/ManifestInfo.html
- https://doc.akka.io/api/akka/2.10/akka/util/MessageBuffer$.html
- https://doc.akka.io/api/akka/2.10/akka/util/MessageBuffer.html
- https://doc.akka.io/api/akka/2.10/akka/util/MessageBufferMap.html
- https://doc.akka.io/api/akka/2.10/akka/util/NanoTimeTokenBucket.html
- https://doc.akka.io/api/akka/2.10/akka/util/PriorityQueueStabilizer$.html
- https://doc.akka.io/api/akka/2.10/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/api/akka/2.10/akka/util/ReentrantGuard.html
- https://doc.akka.io/api/akka/2.10/akka/util/StablePriorityBlockingQueue.html
- https://doc.akka.io/api/akka/2.10/akka/util/StablePriorityQueue.html
- https://doc.akka.io/api/akka/2.10/akka/util/Subclassification.html
- https://doc.akka.io/api/akka/2.10/akka/util/Switch.html
- https://doc.akka.io/api/akka/2.10/akka/util/Timeout$.html
- https://doc.akka.io/api/akka/2.10/akka/util/Timeout.html
- https://doc.akka.io/api/akka/2.10/akka/util/TypedMultiMap$.html
- https://doc.akka.io/api/akka/2.10/akka/util/TypedMultiMap.html
- https://doc.akka.io/api/akka/2.10/akka/util/UUIDComparator$.html
- https://doc.akka.io/api/akka/2.10/akka/util/UUIDComparator.html
- https://doc.akka.io/api/akka/2.10/akka/util/Unsafe.html
- https://doc.akka.io/api/akka/2.10/akka/util/Version$.html
- https://doc.akka.io/api/akka/2.10/akka/util/Version.html
- https://doc.akka.io/api/akka/2.10/akka/util/WallClock$.html
- https://doc.akka.io/api/akka/2.10/akka/util/WallClock.html
- https://doc.akka.io/api/akka/2.10/akka/util/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/util/Helpers$.html](https://doc.akka.io/api/akka/2.10/akka/util/Helpers$.html)*