---
description: Akka 2.10.11 - akka.util.NanoTimeTokenBucket
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:38:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/NanoTimeTokenBucket.html
title: Akka 2.10.11 - akka.util.NanoTimeTokenBucket
---

# Akka 2.10.11 - akka.util.NanoTimeTokenBucket

> **Summary:** Akka 2.10.11 - akka.util.NanoTimeTokenBucket

## Content

Akka2\.10\.11 \< Back****# Packages

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
- NanoTimeTokenBucket
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
c[akka](../index.html).[util](index.html)

# NanoTimeTokenBucket[**](../../akka/util/NanoTimeTokenBucket.html "Permalink")

### 

#### final  class NanoTimeTokenBucket extends TokenBucket

Default implementation of TokenBucket that uses `System.nanoTime` as the time source.

Source[TokenBucket.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/util/TokenBucket.scala#L93)Linear SupertypesTokenBucket, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NanoTimeTokenBucket
2. TokenBucket
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

1. [**](../../akka/util/NanoTimeTokenBucket.html#<init>(_cap:Long,_period:Long):akka.util.NanoTimeTokenBucket "Permalink")  new NanoTimeTokenBucket(\_cap: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), \_period: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))
### Value Members

1. [**](../../akka/util/NanoTimeTokenBucket.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/NanoTimeTokenBucket.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/NanoTimeTokenBucket.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NanoTimeTokenBucket toany2stringadd\[NanoTimeTokenBucket] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/NanoTimeTokenBucket.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NanoTimeTokenBucket, B)ImplicitThis member is added by an implicit conversion from NanoTimeTokenBucket toArrowAssoc\[NanoTimeTokenBucket] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/NanoTimeTokenBucket.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/NanoTimeTokenBucket.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/util/NanoTimeTokenBucket.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/util/NanoTimeTokenBucket.html#currentTime:Long "Permalink")  def currentTime: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)The current time in nanos.

The current time in nanos. The returned value is monotonic, might wrap over and has no relationship with wall\-clock.

returnsreturn the current time in nanos as a Long.

Definition ClassesNanoTimeTokenBucket → TokenBucket
9. [**](../../akka/util/NanoTimeTokenBucket.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NanoTimeTokenBucket) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NanoTimeTokenBucketImplicitThis member is added by an implicit conversion from NanoTimeTokenBucket toEnsuring\[NanoTimeTokenBucket] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/util/NanoTimeTokenBucket.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NanoTimeTokenBucket) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NanoTimeTokenBucketImplicitThis member is added by an implicit conversion from NanoTimeTokenBucket toEnsuring\[NanoTimeTokenBucket] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/util/NanoTimeTokenBucket.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NanoTimeTokenBucketImplicitThis member is added by an implicit conversion from NanoTimeTokenBucket toEnsuring\[NanoTimeTokenBucket] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/util/NanoTimeTokenBucket.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NanoTimeTokenBucketImplicitThis member is added by an implicit conversion from NanoTimeTokenBucket toEnsuring\[NanoTimeTokenBucket] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/util/NanoTimeTokenBucket.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/util/NanoTimeTokenBucket.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/util/NanoTimeTokenBucket.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/util/NanoTimeTokenBucket.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/util/NanoTimeTokenBucket.html#init():Unit "Permalink")  def init(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)This method must be called before the token bucket can be used.

This method must be called before the token bucket can be used.

Definition ClassesTokenBucket
18. [**](../../akka/util/NanoTimeTokenBucket.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/util/NanoTimeTokenBucket.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/util/NanoTimeTokenBucket.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/util/NanoTimeTokenBucket.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/util/NanoTimeTokenBucket.html#offer(cost:Long):Long "Permalink")  def offer(cost: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Call this (side\-effecting) method whenever an element should be passed through the token\-bucket.

Call this (side\-effecting) method whenever an element should be passed through the token\-bucket. This method
will return the number of nanoseconds the element needs to be delayed to conform with the token bucket parameters.
Returns zero if the element can be emitted immediately. The method does not handle overflow, if an element is to
be delayed longer in nanoseconds than what can be represented as a positive Long then an undefined value is returned.

If a non\-zero value is returned, it is the responsibility of the caller to not call this method before the
returned delay has been elapsed (but can be called later). This class does not check or protect against early
calls.

costHow many tokens the element costs. Can be larger than the capacity of the bucket.

Definition ClassesTokenBucket
23. [**](../../akka/util/NanoTimeTokenBucket.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../akka/util/NanoTimeTokenBucket.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../akka/util/NanoTimeTokenBucket.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../akka/util/NanoTimeTokenBucket.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../akka/util/NanoTimeTokenBucket.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/NanoTimeTokenBucket.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/NanoTimeTokenBucket.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NanoTimeTokenBucket toStringFormat\[NanoTimeTokenBucket] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/NanoTimeTokenBucket.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NanoTimeTokenBucket, B)ImplicitThis member is added by an implicit conversion from NanoTimeTokenBucket toArrowAssoc\[NanoTimeTokenBucket] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from TokenBucket

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNanoTimeTokenBucket to any2stringadd\[NanoTimeTokenBucket]

### Inherited by implicit conversion StringFormat fromNanoTimeTokenBucket to StringFormat\[NanoTimeTokenBucket]

### Inherited by implicit conversion Ensuring fromNanoTimeTokenBucket to Ensuring\[NanoTimeTokenBucket]

### Inherited by implicit conversion ArrowAssoc fromNanoTimeTokenBucket to ArrowAssoc\[NanoTimeTokenBucket]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/BoxedType$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteIterator$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteIterator.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteStringBuilder.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ClassLoaderObjectInputStream.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/CompactByteString$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/CompactByteString.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ConcurrentMultiMap.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/HashCode$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/Helpers$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/Index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/LineNumbers$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ManifestInfo$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ManifestInfo.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/MessageBuffer$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/MessageBuffer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/MessageBufferMap.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/NanoTimeTokenBucket.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/PriorityQueueStabilizer$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ReentrantGuard.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/StablePriorityBlockingQueue.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/StablePriorityQueue.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/Subclassification.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/Switch.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/Timeout$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/TypedMultiMap$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/TypedMultiMap.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/UUIDComparator$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/UUIDComparator.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/Unsafe.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/Version$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/Version.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/WallClock$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/WallClock.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/util/NanoTimeTokenBucket.html](https://doc.akka.io/api/akka-core/2.10.11/akka/util/NanoTimeTokenBucket.html)*