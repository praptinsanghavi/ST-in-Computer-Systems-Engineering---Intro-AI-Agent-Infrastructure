---
description: Akka 2.10.17 - akka.util.CompactByteString
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:23:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/CompactByteString.html
title: Akka 2.10.17 - akka.util.CompactByteString
---

# Akka 2.10.17 - akka.util.CompactByteString

> **Summary:** Akka 2.10.17 - akka.util.CompactByteString

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
- CompactByteString
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
[c](CompactByteString$.html "See companion object")[akka](../index.html).[util](index.html)

# [CompactByteString](CompactByteString$.html "See companion object")[**](../../akka/util/CompactByteString.html "Permalink")

### Companion [object CompactByteString](CompactByteString$.html "See companion object")

#### sealed abstract  class CompactByteString extends [ByteString](ByteString.html) with Serializable

A compact ByteString.

The ByteString is guarantied to be contiguous in memory and to use only
as much memory as required for its contents.

Source[ByteString.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala-2.13/akka/util/ByteString.scala#L1063)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [ByteString](ByteString.html), [StrictOptimizedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/StrictOptimizedSeqOps.html#scala.collection.immutable.StrictOptimizedSeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq), [ByteString](ByteString.html)], [StrictOptimizedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/StrictOptimizedSeqOps.html#scala.collection.StrictOptimizedSeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq), [ByteString](ByteString.html)], [StrictOptimizedIterableOps](https://www.scala-lang.org/api/2.13.17/scala/collection/StrictOptimizedIterableOps.html#scala.collection.StrictOptimizedIterableOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq), [ByteString](ByteString.html)], [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [IndexedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeqOps.html#scala.collection.immutable.IndexedSeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq), [ByteString](ByteString.html)], [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/IndexedSeq.html#scala.collection.IndexedSeq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [IndexedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IndexedSeqOps.html#scala.collection.IndexedSeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_], [ByteString](ByteString.html)], [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [SeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SeqOps.html#scala.collection.immutable.SeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_], [ByteString](ByteString.html)], [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [SeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/SeqOps.html#scala.collection.SeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_], [ByteString](ByteString.html)], [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [IterableFactoryDefaults](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableFactoryDefaults.html#scala.collection.IterableFactoryDefaults)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[x][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[x]], [IterableOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOps.html#scala.collection.IterableOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_], [ByteString](ByteString.html)], [IterableOnceOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceOps.html#scala.collection.IterableOnceOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_], [ByteString](ByteString.html)], [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ByteString1C](ByteString$$ByteString1C.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CompactByteString
2. Serializable
3. ByteString
4. StrictOptimizedSeqOps
5. StrictOptimizedSeqOps
6. StrictOptimizedIterableOps
7. IndexedSeq
8. IndexedSeqOps
9. IndexedSeq
10. IndexedSeqOps
11. Seq
12. SeqOps
13. Seq
14. Equals
15. SeqOps
16. PartialFunction
17. Function1
18. Iterable
19. Iterable
20. IterableFactoryDefaults
21. IterableOps
22. IterableOnceOps
23. IterableOnce
24. AnyRef
25. Any
Implicitly  
1. by iterableOnceExtensionMethods
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../akka/util/CompactByteString.html#++(that:akka.util.ByteString):akka.util.ByteString "Permalink") abstract  def \+\+(that: [ByteString](ByteString.html)): [ByteString](ByteString.html)Efficiently concatenate another ByteString.

Efficiently concatenate another ByteString.

Definition Classes[ByteString](ByteString.html)
2. [**](../../akka/util/CompactByteString.html#apply(idx:Int):Byte "Permalink") abstract  def apply(idx: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition Classes[ByteString](ByteString.html) → SeqOps → Function1
3. [**](../../akka/util/CompactByteString.html#asByteBuffer:java.nio.ByteBuffer "Permalink") abstract  def asByteBuffer: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)Returns a read\-only ByteBuffer that directly wraps this ByteString
if it is not fragmented.

Returns a read\-only ByteBuffer that directly wraps this ByteString
if it is not fragmented.

Definition Classes[ByteString](ByteString.html)
4. [**](../../akka/util/CompactByteString.html#asByteBuffers:scala.collection.immutable.Iterable[java.nio.ByteBuffer] "Permalink") abstract  def asByteBuffers: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[[ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)]Scala API: Returns an immutable Iterable of read\-only ByteBuffers that directly wraps this ByteStrings
all fragments.

Scala API: Returns an immutable Iterable of read\-only ByteBuffers that directly wraps this ByteStrings
all fragments. Will always have at least one entry.

Definition Classes[ByteString](ByteString.html)
5. [**](../../akka/util/CompactByteString.html#copyToBuffer(buffer:java.nio.ByteBuffer):Int "Permalink") abstract  def copyToBuffer(buffer: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Copy as many bytes as possible to a ByteBuffer, starting from it's
current position.

Copy as many bytes as possible to a ByteBuffer, starting from it's
current position. This method will not overflow the buffer.

buffera ByteBuffer to copy bytes to

returnsthe number of bytes actually copied

Definition Classes[ByteString](ByteString.html)
6. [**](../../akka/util/CompactByteString.html#decodeBase64:akka.util.ByteString "Permalink") abstract  def decodeBase64: [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html)
7. [**](../../akka/util/CompactByteString.html#decodeString(charset:java.nio.charset.Charset):String "Permalink") abstract  def decodeString(charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html#java.nio.charset.Charset)): StringDecodes this ByteString using a charset to produce a String.

Decodes this ByteString using a charset to produce a String.
Avoids Charset.forName lookup in String internals, thus is preferable to `decodeString(charset: String)`.

Definition Classes[ByteString](ByteString.html)
8. [**](../../akka/util/CompactByteString.html#decodeString(charset:String):String "Permalink") abstract  def decodeString(charset: String): StringDecodes this ByteString using a charset to produce a String.

Decodes this ByteString using a charset to produce a String.
If you have a Charset instance available, use `decodeString(charset: java.nio.charset.Charset` instead.

Definition Classes[ByteString](ByteString.html)
9. [**](../../akka/util/CompactByteString.html#encodeBase64:akka.util.ByteString "Permalink") abstract  def encodeBase64: [ByteString](ByteString.html)Returns a ByteString which is the Base64 representation of this ByteString

Returns a ByteString which is the Base64 representation of this ByteString

Definition Classes[ByteString](ByteString.html)
10. [**](../../akka/util/CompactByteString.html#length:Int "Permalink") abstract  def length: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
### Concrete Value Members

1. [**](../../akka/util/CompactByteString.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/CompactByteString.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/CompactByteString.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CompactByteString toany2stringadd\[CompactByteString] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/CompactByteString.html#++[B>:A](suffix:scala.collection.IterableOnce[B]):CC[B] "Permalink") final  def \+\+\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](suffix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesIterableOpsAnnotations@inline()
5. [**](../../akka/util/CompactByteString.html#++:[B>:A](prefix:scala.collection.IterableOnce[B]):CC[B] "Permalink") final  def \+\+:\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](prefix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesSeqOps → IterableOpsAnnotations@inline()
6. [**](../../akka/util/CompactByteString.html#+:[B>:A](elem:B):CC[B] "Permalink") final  def \+:\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesSeqOpsAnnotations@inline()
7. [**](../../akka/util/CompactByteString.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CompactByteString, B)ImplicitThis member is added by an implicit conversion from CompactByteString toArrowAssoc\[CompactByteString] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
8. [**](../../akka/util/CompactByteString.html#:+[B>:A](elem:B):CC[B] "Permalink") final  def :\+\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesSeqOpsAnnotations@inline()
9. [**](../../akka/util/CompactByteString.html#:++[B>:A](suffix:scala.collection.IterableOnce[B]):CC[B] "Permalink") final  def :\+\+\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](suffix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesSeqOpsAnnotations@inline()
10. [**](../../akka/util/CompactByteString.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../akka/util/CompactByteString.html#addString(b:StringBuilder):b.type "Permalink") final  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder)): b.typeDefinition ClassesIterableOnceOpsAnnotations@inline()
12. [**](../../akka/util/CompactByteString.html#addString(b:StringBuilder,sep:String):b.type "Permalink") final  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder), sep: String): b.typeDefinition ClassesIterableOnceOpsAnnotations@inline()
13. [**](../../akka/util/CompactByteString.html#addString(b:StringBuilder,start:String,sep:String,end:String):b.type "Permalink")  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder), start: String, sep: String, end: String): b.typeDefinition ClassesIterableOnceOps
14. [**](../../akka/util/CompactByteString.html#andThen[C](k:PartialFunction[B,C]):PartialFunction[A,C] "Permalink")  def andThen\[C](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), C]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), C]Definition ClassesPartialFunction
15. [**](../../akka/util/CompactByteString.html#andThen[C](k:B=>C):PartialFunction[A,C] "Permalink")  def andThen\[C](k: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> C): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), C]Definition ClassesPartialFunction → Function1
16. [**](../../akka/util/CompactByteString.html#appended[B>:A](elem:B):CC[B] "Permalink")  def appended\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
17. [**](../../akka/util/CompactByteString.html#appendedAll[B>:A](suffix:scala.collection.IterableOnce[B]):CC[B] "Permalink")  def appendedAll\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](suffix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
18. [**](../../akka/util/CompactByteString.html#applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1 "Permalink")  def applyOrElse\[A1 \<: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), B1 \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](x: A1, default: (A1) \=\> B1): B1Definition ClassesPartialFunction
19. [**](../../akka/util/CompactByteString.html#applyPreferredMaxLength:Int "Permalink")  def applyPreferredMaxLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Attributesprotected Definition ClassesIndexedSeq
20. [**](../../akka/util/CompactByteString.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
21. [**](../../akka/util/CompactByteString.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIndexedSeq → Seq → Equals
22. [**](../../akka/util/CompactByteString.html#className:String "Permalink") final  def className: StringDefinition Classes[ByteString](ByteString.html) → Iterable
23. [**](../../akka/util/CompactByteString.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/util/CompactByteString.html#coll:Iterable.this.type "Permalink") final  def coll: CompactByteString.this.typeAttributesprotected Definition ClassesIterable → IterableOps
25. [**](../../akka/util/CompactByteString.html#collect[B](pf:PartialFunction[A,B]):CC[B] "Permalink")  def collect\[B](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
26. [**](../../akka/util/CompactByteString.html#collectFirst[B](pf:PartialFunction[A,B]):Option[B] "Permalink")  def collectFirst\[B](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
27. [**](../../akka/util/CompactByteString.html#combinations(n:Int):Iterator[C] "Permalink")  def combinations(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[ByteString](ByteString.html)]Definition ClassesSeqOps
28. [**](../../akka/util/CompactByteString.html#compact:CompactByteString.this.type "Permalink")  def compact: CompactByteString.this.typeCreate a new ByteString with all contents compacted into a single,
full byte array.

Create a new ByteString with all contents compacted into a single,
full byte array.
If isCompact returns true, compact is an O(1\) operation, but
might return a different object with an optimized implementation.

Definition ClassesCompactByteString → [ByteString](ByteString.html)
29. [**](../../akka/util/CompactByteString.html#compose[R](k:PartialFunction[R,A]):PartialFunction[R,B] "Permalink")  def compose\[R](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesPartialFunction
30. [**](../../akka/util/CompactByteString.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): (A) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesFunction1Annotations@unspecialized()
31. [**](../../akka/util/CompactByteString.html#concat(that:akka.util.ByteString):akka.util.ByteString "Permalink")  def concat(that: [ByteString](ByteString.html)): [ByteString](ByteString.html)Java API: efficiently concatenate another ByteString.

Java API: efficiently concatenate another ByteString.

Definition Classes[ByteString](ByteString.html)
32. [**](../../akka/util/CompactByteString.html#concat[B>:A](suffix:scala.collection.IterableOnce[B]):CC[B] "Permalink") final  def concat\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](suffix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesSeqOps → IterableOpsAnnotations@inline()
33. [**](../../akka/util/CompactByteString.html#contains[A1>:A](elem:A1):Boolean "Permalink")  def contains\[A1 \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: A1): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeqOps
34. [**](../../akka/util/CompactByteString.html#containsSlice[B>:A](that:scala.collection.Seq[B]):Boolean "Permalink")  def containsSlice\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeqOps
35. [**](../../akka/util/CompactByteString.html#copyToArray[B>:Byte](xs:Array[B],start:Int,len:Int):Int "Permalink")  def copyToArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ByteString](ByteString.html) → IterableOnceOps
36. [**](../../akka/util/CompactByteString.html#copyToArray[B>:Byte](xs:Array[B],start:Int):Int "Permalink") final  def copyToArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ByteString](ByteString.html) → IterableOnceOpsAnnotations@nowarn()
37. [**](../../akka/util/CompactByteString.html#copyToArray[B>:A](dest:Array[B]):Int "Permalink")  def copyToArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](dest: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOpsAnnotations@deprecatedOverriding()
38. [**](../../akka/util/CompactByteString.html#corresponds[B](that:scala.collection.Seq[B])(p:(A,B)=>Boolean):Boolean "Permalink")  def corresponds\[B](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B])(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeqOps
39. [**](../../akka/util/CompactByteString.html#corresponds[B](that:scala.collection.IterableOnce[B])(p:(A,B)=>Boolean):Boolean "Permalink")  def corresponds\[B](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B])(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
40. [**](../../akka/util/CompactByteString.html#count(p:A=>Boolean):Int "Permalink")  def count(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOps
41. [**](../../akka/util/CompactByteString.html#diff[B>:A](that:scala.collection.Seq[B]):C "Permalink")  def diff\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [ByteString](ByteString.html)Definition ClassesStrictOptimizedSeqOps → SeqOps
42. [**](../../akka/util/CompactByteString.html#distinct:C "Permalink")  def distinct: [ByteString](ByteString.html)Definition ClassesSeqOps
43. [**](../../akka/util/CompactByteString.html#distinctBy[B](f:A=>B):C "Permalink")  def distinctBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [ByteString](ByteString.html)Definition ClassesStrictOptimizedSeqOps → StrictOptimizedSeqOps → SeqOps
44. [**](../../akka/util/CompactByteString.html#drop(n:Int):akka.util.ByteString "Permalink")  def drop(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html) → IndexedSeqOps → IterableOps → IterableOnceOps
45. [**](../../akka/util/CompactByteString.html#dropRight(n:Int):akka.util.ByteString "Permalink")  def dropRight(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html) → StrictOptimizedIterableOps → IndexedSeqOps → IterableOps
46. [**](../../akka/util/CompactByteString.html#dropWhile(p:Byte=>Boolean):akka.util.ByteString "Permalink")  def dropWhile(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html) → IterableOps → IterableOnceOps
47. [**](../../akka/util/CompactByteString.html#elementWise:PartialFunction.ElementWiseExtractor[A,B] "Permalink")  def elementWise: ElementWiseExtractor\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesPartialFunction
48. [**](../../akka/util/CompactByteString.html#empty:akka.util.ByteString "Permalink")  def empty: [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html) → IterableFactoryDefaults → IterableOps
49. [**](../../akka/util/CompactByteString.html#endsWith[B>:A](that:Iterable[B]):Boolean "Permalink")  def endsWith\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeqOps
50. [**](../../akka/util/CompactByteString.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CompactByteString) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CompactByteStringImplicitThis member is added by an implicit conversion from CompactByteString toEnsuring\[CompactByteString] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
51. [**](../../akka/util/CompactByteString.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CompactByteString) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CompactByteStringImplicitThis member is added by an implicit conversion from CompactByteString toEnsuring\[CompactByteString] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
52. [**](../../akka/util/CompactByteString.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CompactByteStringImplicitThis member is added by an implicit conversion from CompactByteString toEnsuring\[CompactByteString] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
53. [**](../../akka/util/CompactByteString.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CompactByteStringImplicitThis member is added by an implicit conversion from CompactByteString toEnsuring\[CompactByteString] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
54. [**](../../akka/util/CompactByteString.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
55. [**](../../akka/util/CompactByteString.html#equals(o:Any):Boolean "Permalink")  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeq → Equals → AnyRef → Any
56. [**](../../akka/util/CompactByteString.html#exists(p:A=>Boolean):Boolean "Permalink")  def exists(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
57. [**](../../akka/util/CompactByteString.html#filter(pred:A=>Boolean):C "Permalink")  def filter(pred: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [ByteString](ByteString.html)Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
58. [**](../../akka/util/CompactByteString.html#filterImpl(pred:A=>Boolean,isFlipped:Boolean):C "Permalink")  def filterImpl(pred: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), isFlipped: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [ByteString](ByteString.html)Attributesprotected\[[collection](https://www.scala-lang.org/api/2.13.17/scala/collection/index.html#scala.collection)] Definition ClassesStrictOptimizedIterableOps
59. [**](../../akka/util/CompactByteString.html#filterNot(pred:A=>Boolean):C "Permalink")  def filterNot(pred: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [ByteString](ByteString.html)Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
60. [**](../../akka/util/CompactByteString.html#find(p:A=>Boolean):Option[A] "Permalink")  def find(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
61. [**](../../akka/util/CompactByteString.html#findLast(p:A=>Boolean):Option[A] "Permalink")  def findLast(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesSeqOps
62. [**](../../akka/util/CompactByteString.html#flatMap[B](f:A=>scala.collection.IterableOnce[B]):CC[B] "Permalink")  def flatMap\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
63. [**](../../akka/util/CompactByteString.html#flatten[B](implicittoIterableOnce:A=>scala.collection.IterableOnce[B]):CC[B] "Permalink")  def flatten\[B](implicit toIterableOnce: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
64. [**](../../akka/util/CompactByteString.html#fold[A1>:A](z:A1)(op:(A1,A1)=>A1):A1 "Permalink")  def fold\[A1 \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](z: A1)(op: (A1, A1) \=\> A1): A1Definition ClassesIterableOnceOps
65. [**](../../akka/util/CompactByteString.html#foldLeft[B](z:B)(op:(B,A)=>B):B "Permalink")  def foldLeft\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BDefinition ClassesIterableOnceOps
66. [**](../../akka/util/CompactByteString.html#foldRight[B](z:B)(op:(A,B)=>B):B "Permalink")  def foldRight\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BDefinition ClassesIndexedSeqOps → IterableOnceOps
67. [**](../../akka/util/CompactByteString.html#forall(p:A=>Boolean):Boolean "Permalink")  def forall(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
68. [**](../../akka/util/CompactByteString.html#foreach[U](f:Byte=>U):Unit "Permalink")  def foreach\[U](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> U): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ByteString](ByteString.html) → IterableOnceOps
69. [**](../../akka/util/CompactByteString.html#fromSpecific(coll:IterableOnce[Byte]):akka.util.ByteString "Permalink")  def fromSpecific(coll: IterableOnce\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [ByteString](ByteString.html)Attributesprotected Definition Classes[ByteString](ByteString.html) → IterableFactoryDefaults → IterableOps
70. [**](../../akka/util/CompactByteString.html#getByteBuffers():Iterable[java.nio.ByteBuffer] "Permalink")  def getByteBuffers(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)]Java API: Returns an Iterable of read\-only ByteBuffers that directly wraps this ByteStrings
all fragments.

Java API: Returns an Iterable of read\-only ByteBuffers that directly wraps this ByteStrings
all fragments. Will always have at least one entry.

Definition Classes[ByteString](ByteString.html)
71. [**](../../akka/util/CompactByteString.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
72. [**](../../akka/util/CompactByteString.html#groupBy[K](f:A=>K):scala.collection.immutable.Map[K,C] "Permalink")  def groupBy\[K](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> K): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, [ByteString](ByteString.html)]Definition ClassesIterableOps
73. [**](../../akka/util/CompactByteString.html#groupMap[K,B](key:A=>K)(f:A=>B):scala.collection.immutable.Map[K,CC[B]] "Permalink")  def groupMap\[K, B](key: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> K)(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]]Definition ClassesIterableOps
74. [**](../../akka/util/CompactByteString.html#groupMapReduce[K,B](key:A=>K)(f:A=>B)(reduce:(B,B)=>B):scala.collection.immutable.Map[K,B] "Permalink")  def groupMapReduce\[K, B](key: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> K)(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(reduce: (B, B) \=\> B): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, B]Definition ClassesIterableOps
75. [**](../../akka/util/CompactByteString.html#grouped(size:Int):Iterator[akka.util.ByteString] "Permalink")  def grouped(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Iterator\[[ByteString](ByteString.html)]Definition Classes[ByteString](ByteString.html) → IterableOps
76. [**](../../akka/util/CompactByteString.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeq → AnyRef → Any
77. [**](../../akka/util/CompactByteString.html#head:Byte "Permalink")  def head: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition Classes[ByteString](ByteString.html) → IndexedSeqOps → IterableOps
78. [**](../../akka/util/CompactByteString.html#headOption:Option[A] "Permalink")  def headOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIndexedSeqOps → IterableOps
79. [**](../../akka/util/CompactByteString.html#indexOf[B>:Byte](elem:B,from:Int):Int "Permalink")  def indexOf\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B, from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ByteString](ByteString.html) → SeqOps
80. [**](../../akka/util/CompactByteString.html#indexOf[B>:A](elem:B):Int "Permalink")  def indexOf\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecatedOverriding()
81. [**](../../akka/util/CompactByteString.html#indexOfSlice[B>:A](that:scala.collection.Seq[B]):Int "Permalink")  def indexOfSlice\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecatedOverriding()
82. [**](../../akka/util/CompactByteString.html#indexOfSlice[B>:A](that:scala.collection.Seq[B],from:Int):Int "Permalink")  def indexOfSlice\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B], from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
83. [**](../../akka/util/CompactByteString.html#indexWhere(p:Byte=>Boolean,from:Int):Int "Permalink")  def indexWhere(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ByteString](ByteString.html) → SeqOps
84. [**](../../akka/util/CompactByteString.html#indexWhere(p:A=>Boolean):Int "Permalink")  def indexWhere(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecatedOverriding()
85. [**](../../akka/util/CompactByteString.html#indices:scala.collection.immutable.Range "Permalink")  def indices: [Range](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Range.html#scala.collection.immutable.Range)Definition ClassesSeqOps
86. [**](../../akka/util/CompactByteString.html#init:akka.util.ByteString "Permalink")  def init: [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html) → IterableOps
87. [**](../../akka/util/CompactByteString.html#inits:Iterator[C] "Permalink")  def inits: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[ByteString](ByteString.html)]Definition ClassesIterableOps
88. [**](../../akka/util/CompactByteString.html#intersect[B>:A](that:scala.collection.Seq[B]):C "Permalink")  def intersect\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [ByteString](ByteString.html)Definition ClassesStrictOptimizedSeqOps → SeqOps
89. [**](../../akka/util/CompactByteString.html#isCompact:Boolean "Permalink")  def isCompact: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Check whether this ByteString is compact in memory.

Check whether this ByteString is compact in memory.
If the ByteString is compact, it might, however, not be represented
by an object that takes full advantage of that fact. Use compact to
get such an object.

Definition ClassesCompactByteString → [ByteString](ByteString.html)
90. [**](../../akka/util/CompactByteString.html#isDefinedAt(idx:Int):Boolean "Permalink")  def isDefinedAt(idx: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeqOps
91. [**](../../akka/util/CompactByteString.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ByteString](ByteString.html) → SeqOps → IterableOnceOps
92. [**](../../akka/util/CompactByteString.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
93. [**](../../akka/util/CompactByteString.html#isTraversableAgain:Boolean "Permalink")  def isTraversableAgain: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOps → IterableOnceOps
94. [**](../../akka/util/CompactByteString.html#iterableFactory:scala.collection.SeqFactory[IndexedSeq] "Permalink")  def iterableFactory: [SeqFactory](https://www.scala-lang.org/api/2.13.17/scala/collection/SeqFactory.html#scala.collection.SeqFactory)\[[IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)]Definition ClassesIndexedSeq → IndexedSeq → Seq → Seq → Iterable → Iterable → IterableOps
95. [**](../../akka/util/CompactByteString.html#iterator:akka.util.ByteIterator "Permalink")  def iterator: [ByteIterator](ByteIterator.html)Definition Classes[ByteString](ByteString.html) → IndexedSeqOps → IterableOnce
96. [**](../../akka/util/CompactByteString.html#knownSize:Int "Permalink")  def knownSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIndexedSeqOps → IterableOnce
97. [**](../../akka/util/CompactByteString.html#last:Byte "Permalink")  def last: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition Classes[ByteString](ByteString.html) → IndexedSeqOps → IterableOps
98. [**](../../akka/util/CompactByteString.html#lastIndexOf[B>:A](elem:B,end:Int):Int "Permalink")  def lastIndexOf\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B, end: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
99. [**](../../akka/util/CompactByteString.html#lastIndexOfSlice[B>:A](that:scala.collection.Seq[B]):Int "Permalink")  def lastIndexOfSlice\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecatedOverriding()
100. [**](../../akka/util/CompactByteString.html#lastIndexOfSlice[B>:A](that:scala.collection.Seq[B],end:Int):Int "Permalink")  def lastIndexOfSlice\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B], end: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
101. [**](../../akka/util/CompactByteString.html#lastIndexWhere(p:A=>Boolean):Int "Permalink")  def lastIndexWhere(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecatedOverriding()
102. [**](../../akka/util/CompactByteString.html#lastIndexWhere(p:A=>Boolean,end:Int):Int "Permalink")  def lastIndexWhere(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), end: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
103. [**](../../akka/util/CompactByteString.html#lastOption:Option[A] "Permalink")  def lastOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOps
104. [**](../../akka/util/CompactByteString.html#lazyZip[B](that:Iterable[B]):scala.collection.LazyZip2[A,B,Iterable.this.type] "Permalink")  def lazyZip\[B](that: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[B]): LazyZip2\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B, CompactByteString.this.type]Definition ClassesIterable
105. [**](../../akka/util/CompactByteString.html#lengthCompare(that:Iterable[_]):Int "Permalink") final  def lengthCompare(that: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[\_]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIndexedSeqOps → SeqOps
106. [**](../../akka/util/CompactByteString.html#lengthCompare(len:Int):Int "Permalink") final  def lengthCompare(len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIndexedSeqOps → SeqOps
107. [**](../../akka/util/CompactByteString.html#lengthIs:scala.collection.IterableOps.SizeCompareOps "Permalink") final  def lengthIs: SizeCompareOpsDefinition ClassesSeqOpsAnnotations@inline()
108. [**](../../akka/util/CompactByteString.html#lift:A=>Option[B] "Permalink")  def lift: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesPartialFunction
109. [**](../../akka/util/CompactByteString.html#map[A](f:Byte=>Byte):akka.util.ByteString "Permalink")  def map\[A](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html)
110. [**](../../akka/util/CompactByteString.html#map[B](f:A=>B):CC[B] "Permalink")  def map\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
111. [**](../../akka/util/CompactByteString.html#mapI(f:Byte=>Int):akka.util.ByteString "Permalink") final  def mapI(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ByteString](ByteString.html)map method that will automatically cast Int back into Byte.

map method that will automatically cast Int back into Byte.

Definition Classes[ByteString](ByteString.html)
112. [**](../../akka/util/CompactByteString.html#max[B>:A](implicitord:scala.math.Ordering[B]):A "Permalink")  def max\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
113. [**](../../akka/util/CompactByteString.html#maxBy[B](f:A=>B)(implicitord:scala.math.Ordering[B]):A "Permalink")  def maxBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
114. [**](../../akka/util/CompactByteString.html#maxByOption[B](f:A=>B)(implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def maxByOption\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
115. [**](../../akka/util/CompactByteString.html#maxOption[B>:A](implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def maxOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
116. [**](../../akka/util/CompactByteString.html#min[B>:A](implicitord:scala.math.Ordering[B]):A "Permalink")  def min\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
117. [**](../../akka/util/CompactByteString.html#minBy[B](f:A=>B)(implicitord:scala.math.Ordering[B]):A "Permalink")  def minBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
118. [**](../../akka/util/CompactByteString.html#minByOption[B](f:A=>B)(implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def minByOption\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
119. [**](../../akka/util/CompactByteString.html#minOption[B>:A](implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def minOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
120. [**](../../akka/util/CompactByteString.html#mkString:String "Permalink") final  def mkString: StringDefinition ClassesIterableOnceOpsAnnotations@inline()
121. [**](../../akka/util/CompactByteString.html#mkString(sep:String):String "Permalink") final  def mkString(sep: String): StringDefinition ClassesIterableOnceOpsAnnotations@inline()
122. [**](../../akka/util/CompactByteString.html#mkString(start:String,sep:String,end:String):String "Permalink") final  def mkString(start: String, sep: String, end: String): StringDefinition ClassesIterableOnceOps
123. [**](../../akka/util/CompactByteString.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
124. [**](../../akka/util/CompactByteString.html#newSpecificBuilder:scala.collection.mutable.Builder[Byte,akka.util.ByteString] "Permalink")  def newSpecificBuilder: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [ByteString](ByteString.html)]Attributesprotected Definition Classes[ByteString](ByteString.html) → IterableFactoryDefaults → IterableOps
125. [**](../../akka/util/CompactByteString.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOpsAnnotations@deprecatedOverriding()
126. [**](../../akka/util/CompactByteString.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
127. [**](../../akka/util/CompactByteString.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
128. [**](../../akka/util/CompactByteString.html#occCounts[B](sq:scala.collection.Seq[B]):scala.collection.mutable.Map[B,Int] "Permalink")  def occCounts\[B](sq: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Map.html#scala.collection.mutable.Map)\[B, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]Attributesprotected\[[collection](https://www.scala-lang.org/api/2.13.17/scala/collection/index.html#scala.collection)] Definition ClassesSeqOps
129. [**](../../akka/util/CompactByteString.html#orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1] "Permalink")  def orElse\[A1 \<: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), B1 \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]Definition ClassesPartialFunction
130. [**](../../akka/util/CompactByteString.html#padTo[B>:A](len:Int,elem:B):CC[B] "Permalink")  def padTo\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), elem: B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
131. [**](../../akka/util/CompactByteString.html#partition(p:A=>Boolean):(C,C) "Permalink")  def partition(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ([ByteString](ByteString.html), [ByteString](ByteString.html))Definition ClassesStrictOptimizedIterableOps → IterableOps
132. [**](../../akka/util/CompactByteString.html#partitionMap[A1,A2](f:A=>Either[A1,A2]):(CC[A1],CC[A2]) "Permalink")  def partitionMap\[A1, A2](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> Either\[A1, A2]): ([IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[A1], [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[A2])Definition ClassesStrictOptimizedIterableOps → IterableOps
133. [**](../../akka/util/CompactByteString.html#patch[B>:A](from:Int,other:scala.collection.IterableOnce[B],replaced:Int):CC[B] "Permalink")  def patch\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), other: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B], replaced: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
134. [**](../../akka/util/CompactByteString.html#permutations:Iterator[C] "Permalink")  def permutations: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[ByteString](ByteString.html)]Definition ClassesSeqOps
135. [**](../../akka/util/CompactByteString.html#prepended[B>:A](elem:B):CC[B] "Permalink")  def prepended\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
136. [**](../../akka/util/CompactByteString.html#prependedAll[B>:A](prefix:scala.collection.IterableOnce[B]):CC[B] "Permalink")  def prependedAll\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](prefix: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
137. [**](../../akka/util/CompactByteString.html#product[B>:A](implicitnum:scala.math.Numeric[B]):B "Permalink")  def product\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[B]): BDefinition ClassesIterableOnceOps
138. [**](../../akka/util/CompactByteString.html#reduce[B>:A](op:(B,B)=>B):B "Permalink")  def reduce\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, B) \=\> B): BDefinition ClassesIterableOnceOps
139. [**](../../akka/util/CompactByteString.html#reduceLeft[B>:A](op:(B,A)=>B):B "Permalink")  def reduceLeft\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BDefinition ClassesIterableOnceOps
140. [**](../../akka/util/CompactByteString.html#reduceLeftOption[B>:A](op:(B,A)=>B):Option[B] "Permalink")  def reduceLeftOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
141. [**](../../akka/util/CompactByteString.html#reduceOption[B>:A](op:(B,B)=>B):Option[B] "Permalink")  def reduceOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, B) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
142. [**](../../akka/util/CompactByteString.html#reduceRight[B>:A](op:(A,B)=>B):B "Permalink")  def reduceRight\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BDefinition ClassesIterableOnceOps
143. [**](../../akka/util/CompactByteString.html#reduceRightOption[B>:A](op:(A,B)=>B):Option[B] "Permalink")  def reduceRightOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
144. [**](../../akka/util/CompactByteString.html#reverse:C "Permalink")  def reverse: [ByteString](ByteString.html)Definition ClassesIndexedSeqOps → SeqOps
145. [**](../../akka/util/CompactByteString.html#reverseIterator:Iterator[A] "Permalink")  def reverseIterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIndexedSeqOps → SeqOps
146. [**](../../akka/util/CompactByteString.html#reversed:Iterable[A] "Permalink")  def reversed: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Attributesprotected Definition ClassesIndexedSeqOps → IterableOnceOps
147. [**](../../akka/util/CompactByteString.html#runWith[U](action:B=>U):A=>Boolean "Permalink")  def runWith\[U](action: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> U): ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPartialFunction
148. [**](../../akka/util/CompactByteString.html#sameElements[B>:A](o:scala.collection.IterableOnce[B]):Boolean "Permalink")  def sameElements\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](o: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIndexedSeq → SeqOps
149. [**](../../akka/util/CompactByteString.html#scan[B>:A](z:B)(op:(B,B)=>B):CC[B] "Permalink")  def scan\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](z: B)(op: (B, B) \=\> B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesIterableOps
150. [**](../../akka/util/CompactByteString.html#scanLeft[B](z:B)(op:(B,A)=>B):CC[B] "Permalink")  def scanLeft\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
151. [**](../../akka/util/CompactByteString.html#scanRight[B](z:B)(op:(A,B)=>B):CC[B] "Permalink")  def scanRight\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesIterableOps
152. [**](../../akka/util/CompactByteString.html#search[B>:A](elem:B,from:Int,to:Int)(implicitord:scala.math.Ordering[B]):collection.Searching.SearchResult "Permalink")  def search\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B, from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), to: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): SearchResultDefinition ClassesIndexedSeqOps → SeqOps
153. [**](../../akka/util/CompactByteString.html#search[B>:A](elem:B)(implicitord:scala.math.Ordering[B]):collection.Searching.SearchResult "Permalink")  def search\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): SearchResultDefinition ClassesIndexedSeqOps → SeqOps
154. [**](../../akka/util/CompactByteString.html#segmentLength(p:A=>Boolean,from:Int):Int "Permalink")  def segmentLength(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
155. [**](../../akka/util/CompactByteString.html#segmentLength(p:A=>Boolean):Int "Permalink") final  def segmentLength(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps
156. [**](../../akka/util/CompactByteString.html#size:Int "Permalink") final  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps → IterableOnceOps
157. [**](../../akka/util/CompactByteString.html#sizeCompare(that:Iterable[_]):Int "Permalink") final  def sizeCompare(that: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[\_]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps → IterableOps
158. [**](../../akka/util/CompactByteString.html#sizeCompare(otherSize:Int):Int "Permalink") final  def sizeCompare(otherSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOps → IterableOps
159. [**](../../akka/util/CompactByteString.html#sizeIs:scala.collection.IterableOps.SizeCompareOps "Permalink") final  def sizeIs: SizeCompareOpsDefinition ClassesIterableOpsAnnotations@inline()
160. [**](../../akka/util/CompactByteString.html#slice(from:Int,until:Int):akka.util.ByteString "Permalink")  def slice(from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), until: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html) → IndexedSeqOps → IndexedSeqOps → IterableOps → IterableOnceOps
161. [**](../../akka/util/CompactByteString.html#sliding(size:Int,step:Int):Iterator[C] "Permalink")  def sliding(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), step: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[ByteString](ByteString.html)]Definition ClassesIndexedSeqOps → IterableOps
162. [**](../../akka/util/CompactByteString.html#sliding(size:Int):Iterator[C] "Permalink")  def sliding(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[ByteString](ByteString.html)]Definition ClassesIterableOps
163. [**](../../akka/util/CompactByteString.html#sortBy[B](f:A=>B)(implicitord:Ordering[B]):C "Permalink")  def sortBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: Ordering\[B]): [ByteString](ByteString.html)Definition ClassesSeqOps
164. [**](../../akka/util/CompactByteString.html#sortWith(lt:(A,A)=>Boolean):C "Permalink")  def sortWith(lt: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [ByteString](ByteString.html)Definition ClassesSeqOps
165. [**](../../akka/util/CompactByteString.html#sorted[B>:A](implicitord:Ordering[B]):C "Permalink")  def sorted\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: Ordering\[B]): [ByteString](ByteString.html)Definition ClassesStrictOptimizedSeqOps → SeqOps
166. [**](../../akka/util/CompactByteString.html#span(p:Byte=>Boolean):(akka.util.ByteString,akka.util.ByteString) "Permalink")  def span(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ([ByteString](ByteString.html), [ByteString](ByteString.html))Definition Classes[ByteString](ByteString.html) → StrictOptimizedIterableOps → IterableOps → IterableOnceOps
167. [**](../../akka/util/CompactByteString.html#splitAt(n:Int):(akka.util.ByteString,akka.util.ByteString) "Permalink")  def splitAt(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ([ByteString](ByteString.html), [ByteString](ByteString.html))Definition Classes[ByteString](ByteString.html) → IterableOps → IterableOnceOps
168. [**](../../akka/util/CompactByteString.html#startsWith[B>:A](that:scala.collection.IterableOnce[B],offset:Int):Boolean "Permalink")  def startsWith\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSeqOps
169. [**](../../akka/util/CompactByteString.html#stepper[S<:scala.collection.Stepper[_]](implicitshape:scala.collection.StepperShape[A,S]):Swithcollection.Stepper.EfficientSplit "Permalink")  def stepper\[S \<: [Stepper](https://www.scala-lang.org/api/2.13.17/scala/collection/Stepper.html#scala.collection.Stepper)\[\_]](implicit shape: StepperShape\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), S]): S with EfficientSplitDefinition ClassesIndexedSeqOps → IterableOnce
170. [**](../../akka/util/CompactByteString.html#strictOptimizedCollect[B,C2](b:scala.collection.mutable.Builder[B,C2],pf:PartialFunction[A,B]):C2 "Permalink") final  def strictOptimizedCollect\[B, C2](b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[B, C2], pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B]): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
171. [**](../../akka/util/CompactByteString.html#strictOptimizedConcat[B>:A,C2](that:scala.collection.IterableOnce[B],b:scala.collection.mutable.Builder[B,C2]):C2 "Permalink") final  def strictOptimizedConcat\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), C2](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B], b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[B, C2]): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
172. [**](../../akka/util/CompactByteString.html#strictOptimizedFlatMap[B,C2](b:scala.collection.mutable.Builder[B,C2],f:A=>scala.collection.IterableOnce[B]):C2 "Permalink") final  def strictOptimizedFlatMap\[B, C2](b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[B, C2], f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
173. [**](../../akka/util/CompactByteString.html#strictOptimizedFlatten[B,C2](b:scala.collection.mutable.Builder[B,C2])(implicittoIterableOnce:A=>scala.collection.IterableOnce[B]):C2 "Permalink") final  def strictOptimizedFlatten\[B, C2](b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[B, C2])(implicit toIterableOnce: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
174. [**](../../akka/util/CompactByteString.html#strictOptimizedMap[B,C2](b:scala.collection.mutable.Builder[B,C2],f:A=>B):C2 "Permalink") final  def strictOptimizedMap\[B, C2](b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[B, C2], f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
175. [**](../../akka/util/CompactByteString.html#strictOptimizedZip[B,C2](that:scala.collection.IterableOnce[B],b:scala.collection.mutable.Builder[(A,B),C2]):C2 "Permalink") final  def strictOptimizedZip\[B, C2](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B], b: [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B), C2]): C2Attributesprotected\[this] Definition ClassesStrictOptimizedIterableOpsAnnotations@inline()
176. [**](../../akka/util/CompactByteString.html#stringPrefix:String "Permalink")  def stringPrefix: StringAttributesprotected\[this] Definition ClassesIndexedSeq → Seq → Iterable
177. [**](../../akka/util/CompactByteString.html#sum[B>:A](implicitnum:scala.math.Numeric[B]):B "Permalink")  def sum\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[B]): BDefinition ClassesIterableOnceOps
178. [**](../../akka/util/CompactByteString.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
179. [**](../../akka/util/CompactByteString.html#tail:akka.util.ByteString "Permalink")  def tail: [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html) → IterableOps
180. [**](../../akka/util/CompactByteString.html#tails:Iterator[C] "Permalink")  def tails: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[ByteString](ByteString.html)]Definition ClassesIterableOps
181. [**](../../akka/util/CompactByteString.html#take(n:Int):akka.util.ByteString "Permalink")  def take(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html) → IndexedSeqOps → IterableOps → IterableOnceOps
182. [**](../../akka/util/CompactByteString.html#takeRight(n:Int):akka.util.ByteString "Permalink")  def takeRight(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html) → StrictOptimizedIterableOps → IndexedSeqOps → IterableOps
183. [**](../../akka/util/CompactByteString.html#takeWhile(p:Byte=>Boolean):akka.util.ByteString "Permalink")  def takeWhile(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [ByteString](ByteString.html)Definition Classes[ByteString](ByteString.html) → IterableOps → IterableOnceOps
184. [**](../../akka/util/CompactByteString.html#tapEach[U](f:A=>U):C "Permalink")  def tapEach\[U](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> U): [ByteString](ByteString.html)Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
185. [**](../../akka/util/CompactByteString.html#to[C1](factory:scala.collection.Factory[A,C1]):C1 "Permalink")  def to\[C1](factory: [Factory](https://www.scala-lang.org/api/2.13.17/scala/collection/Factory.html#scala.collection.Factory)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), C1]): C1Definition ClassesIterableOnceOps
186. [**](../../akka/util/CompactByteString.html#toArray[B>:Byte](implicitarg0:scala.reflect.ClassTag[B]):Array[B] "Permalink") final  def toArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[B]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]Definition Classes[ByteString](ByteString.html) → IterableOnceOps
187. [**](../../akka/util/CompactByteString.html#toArray():Array[Byte] "Permalink")  def toArray(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Java API: copy this ByteString into a fresh byte array

Java API: copy this ByteString into a fresh byte array

returnsthis ByteString copied into a byte array

Attributesprotected\[[ByteString](ByteString.html)] Definition Classes[ByteString](ByteString.html)
188. [**](../../akka/util/CompactByteString.html#toArrayUnsafe():Array[Byte] "Permalink")  def toArrayUnsafe(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Unsafe API: Use only in situations you are completely confident that this is what
you need, and that you understand the implications documented below.

Unsafe API: Use only in situations you are completely confident that this is what
you need, and that you understand the implications documented below.

If the ByteString is backed by a single array it is returned without any copy. If it is backed by a rope
of multiple ByteString instances a new array will be allocated and the contents will be copied
into it before returning it.

This method of exposing the bytes of a ByteString can save one array
copy and allocation in the happy path scenario which can lead to better performance,
however it also means that one MUST NOT modify the returned array, or unexpected
immutable data structure contract\-breaking behavior will manifest itself.

This API is intended for users who need to pass the byte array to some other API, which will
only read the bytes and never mutate then. For all other intents and purposes, please use the usual
toArray method \- which provide the immutability guarantees by copying the backing array.

Definition Classes[ByteString](ByteString.html)
189. [**](../../akka/util/CompactByteString.html#toBuffer[B>:A]:scala.collection.mutable.Buffer[B] "Permalink") final  def toBuffer\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]Definition ClassesIterableOnceOpsAnnotations@inline()
190. [**](../../akka/util/CompactByteString.html#toByteBuffer:java.nio.ByteBuffer "Permalink")  def toByteBuffer: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)Creates a new ByteBuffer with a copy of all bytes contained in this
ByteString.

Creates a new ByteBuffer with a copy of all bytes contained in this
ByteString.

Definition Classes[ByteString](ByteString.html)
191. [**](../../akka/util/CompactByteString.html#toIndexedSeq:IndexedSeq[A] "Permalink") final  def toIndexedSeq: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIndexedSeq → IterableOnceOps
192. [**](../../akka/util/CompactByteString.html#toList:List[A] "Permalink")  def toList: [List](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#scala.collection.immutable.List)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
193. [**](../../akka/util/CompactByteString.html#toMap[K,V](implicitev:A<:<(K,V)):scala.collection.immutable.Map[K,V] "Permalink")  def toMap\[K, V](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), (K, V)]): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, V]Definition ClassesIterableOnceOps
194. [**](../../akka/util/CompactByteString.html#toSeq:Seq.this.type "Permalink") final  def toSeq: CompactByteString.this.typeDefinition ClassesSeq → IterableOnceOps
195. [**](../../akka/util/CompactByteString.html#toSet[B>:A]:scala.collection.immutable.Set[B] "Permalink")  def toSet\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[B]Definition ClassesIterableOnceOps
196. [**](../../akka/util/CompactByteString.html#toString():String "Permalink")  def toString(): StringDefinition Classes[ByteString](ByteString.html) → Seq → Function1 → Iterable → AnyRef → Any
197. [**](../../akka/util/CompactByteString.html#toVector:scala.collection.immutable.Vector[A] "Permalink")  def toVector: [Vector](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Vector.html#scala.collection.immutable.Vector)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
198. [**](../../akka/util/CompactByteString.html#transpose[B](implicitasIterable:A=>Iterable[B]):CC[CC[B]@scala.annotation.unchecked.uncheckedVariance] "Permalink")  def transpose\[B](implicit asIterable: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]]Definition ClassesIterableOps
199. [**](../../akka/util/CompactByteString.html#unapply(a:A):Option[B] "Permalink")  def unapply(a: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesPartialFunction
200. [**](../../akka/util/CompactByteString.html#unzip[A1,A2](implicitasPair:A=>(A1,A2)):(CC[A1],CC[A2]) "Permalink")  def unzip\[A1, A2](implicit asPair: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> (A1, A2)): ([IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[A1], [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[A2])Definition ClassesStrictOptimizedIterableOps → IterableOps
201. [**](../../akka/util/CompactByteString.html#unzip3[A1,A2,A3](implicitasTriple:A=>(A1,A2,A3)):(CC[A1],CC[A2],CC[A3]) "Permalink")  def unzip3\[A1, A2, A3](implicit asTriple: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> (A1, A2, A3)): ([IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[A1], [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[A2], [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[A3])Definition ClassesStrictOptimizedIterableOps → IterableOps
202. [**](../../akka/util/CompactByteString.html#updated[B>:A](index:Int,elem:B):CC[B] "Permalink")  def updated\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](index: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), elem: B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesStrictOptimizedSeqOps → SeqOps
203. [**](../../akka/util/CompactByteString.html#utf8String:String "Permalink") final  def utf8String: StringDecodes this ByteString as a UTF\-8 encoded String.

Decodes this ByteString as a UTF\-8 encoded String.

Definition Classes[ByteString](ByteString.html)
204. [**](../../akka/util/CompactByteString.html#view:scala.collection.IndexedSeqView[A] "Permalink")  def view: IndexedSeqView\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIndexedSeqOps → SeqOps → IterableOps
205. [**](../../akka/util/CompactByteString.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
206. [**](../../akka/util/CompactByteString.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
207. [**](../../akka/util/CompactByteString.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
208. [**](../../akka/util/CompactByteString.html#withFilter(p:A=>Boolean):scala.collection.WithFilter[A,CC] "Permalink")  def withFilter(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [WithFilter](https://www.scala-lang.org/api/2.13.17/scala/collection/WithFilter.html#scala.collection.WithFilter)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_]]Definition ClassesIterableOps
209. [**](../../akka/util/CompactByteString.html#zip[B](that:scala.collection.IterableOnce[B]):CC[(A@scala.annotation.unchecked.uncheckedVariance,B)] "Permalink")  def zip\[B](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B)]Definition ClassesStrictOptimizedIterableOps → IterableOps
210. [**](../../akka/util/CompactByteString.html#zipAll[A1>:A,B](that:Iterable[B],thisElem:A1,thatElem:B):CC[(A1,B)] "Permalink")  def zipAll\[A1 \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B](that: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[B], thisElem: A1, thatElem: B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[(A1, B)]Definition ClassesIterableOps
211. [**](../../akka/util/CompactByteString.html#zipWithIndex:CC[(A@scala.annotation.unchecked.uncheckedVariance,Int)] "Permalink")  def zipWithIndex: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))]Definition ClassesStrictOptimizedIterableOps → IterableOps → IterableOnceOps
### Deprecated Value Members

1. [**](../../akka/util/CompactByteString.html#/:[B](z:B)(op:(B,A)=>B):B "Permalink")  def /:\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte])./:(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldLeft instead
2. [**](../../akka/util/CompactByteString.html#/:[B](z:B)(op:(B,A)=>B):B "Permalink") final  def /:\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use foldLeft instead of /:
3. [**](../../akka/util/CompactByteString.html#:\[B](z:B)(op:(A,B)=>B):B "Permalink")  def :\\\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).:\(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldRight instead
4. [**](../../akka/util/CompactByteString.html#:\[B](z:B)(op:(A,B)=>B):B "Permalink") final  def :\\\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use foldRight instead of :\\
5. [**](../../akka/util/CompactByteString.html#aggregate[B](z:=>B)(seqop:(B,A)=>B,combop:(B,B)=>B):B "Permalink")  def aggregate\[B](z: \=\> B)(seqop: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B, combop: (B, B) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* For sequential collections, prefer `foldLeft(z)(seqop)`. For parallel collections, use `ParIterableLike#aggregate`.
6. [**](../../akka/util/CompactByteString.html#collectFirst[B](f:PartialFunction[A,B]):Option[B] "Permalink")  def collectFirst\[B](f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).collectFirst(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.collectFirst(...) instead
7. [**](../../akka/util/CompactByteString.html#companion:scala.collection.IterableFactory[CC] "Permalink")  def companion: [IterableFactory](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableFactory.html#scala.collection.IterableFactory)\[\[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_]]Definition ClassesIterableOpsAnnotations@deprecated @deprecatedOverriding() @inline() Deprecated*(Since version 2\.13\.0\)* Use iterableFactory instead
8. [**](../../akka/util/CompactByteString.html#copyToBuffer(dest:scala.collection.mutable.Buffer[A]):Unit "Permalink")  def copyToBuffer(dest: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).copyToBuffer(dest)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.copyToBuffer(...) instead
9. [**](../../akka/util/CompactByteString.html#copyToBuffer[B>:A](dest:scala.collection.mutable.Buffer[B]):Unit "Permalink") final  def copyToBuffer\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](dest: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use `dest ++= coll` instead
10. [**](../../akka/util/CompactByteString.html#count(f:A=>Boolean):Int "Permalink")  def count(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).count(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.count(...) instead
11. [**](../../akka/util/CompactByteString.html#exists(f:A=>Boolean):Boolean "Permalink")  def exists(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).exists(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.exists(...) instead
12. [**](../../akka/util/CompactByteString.html#filter(f:A=>Boolean):Iterator[A] "Permalink")  def filter(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).filter(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.filter(...) instead
13. [**](../../akka/util/CompactByteString.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
14. [**](../../akka/util/CompactByteString.html#find(p:A=>Boolean):Option[A] "Permalink")  def find(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).find(p)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.find instead
15. [**](../../akka/util/CompactByteString.html#flatMap[B](f:A=>scala.collection.IterableOnce[B]):scala.collection.IterableOnce[B] "Permalink")  def flatMap\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).flatMap(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.flatMap instead or consider requiring an Iterable
16. [**](../../akka/util/CompactByteString.html#fold[A1>:A](z:A1)(op:(A1,A1)=>A1):A1 "Permalink")  def fold\[A1 \>: A](z: A1)(op: (A1, A1) \=\> A1): A1ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).fold(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.fold instead
17. [**](../../akka/util/CompactByteString.html#foldLeft[B](z:B)(op:(B,A)=>B):B "Permalink")  def foldLeft\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).foldLeft(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldLeft instead
18. [**](../../akka/util/CompactByteString.html#foldRight[B](z:B)(op:(A,B)=>B):B "Permalink")  def foldRight\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).foldRight(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldRight instead
19. [**](../../akka/util/CompactByteString.html#forall(f:A=>Boolean):Boolean "Permalink")  def forall(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).forall(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.forall(...) instead
20. [**](../../akka/util/CompactByteString.html#foreach[U](f:A=>U):Unit "Permalink")  def foreach\[U](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> U): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).foreach(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foreach(...) instead
21. [**](../../akka/util/CompactByteString.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CompactByteString toStringFormat\[CompactByteString] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
22. [**](../../akka/util/CompactByteString.html#hasDefiniteSize:Boolean "Permalink")  def hasDefiniteSize: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Check .knownSize instead of .hasDefiniteSize for more actionable information (see scaladoc for details)
23. [**](../../akka/util/CompactByteString.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).isEmpty
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.isEmpty instead
24. [**](../../akka/util/CompactByteString.html#map[B](f:A=>B):scala.collection.IterableOnce[B] "Permalink")  def map\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).map(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.map instead or consider requiring an Iterable
25. [**](../../akka/util/CompactByteString.html#max(implicitord:scala.math.Ordering[A]):A "Permalink")  def max(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).max(ord)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.max instead
26. [**](../../akka/util/CompactByteString.html#maxBy[B](f:A=>B)(implicitcmp:scala.math.Ordering[B]):A "Permalink")  def maxBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit cmp: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).maxBy(f)(cmp)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.maxBy(...) instead
27. [**](../../akka/util/CompactByteString.html#min(implicitord:scala.math.Ordering[A]):A "Permalink")  def min(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).min(ord)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.min instead
28. [**](../../akka/util/CompactByteString.html#minBy[B](f:A=>B)(implicitcmp:scala.math.Ordering[B]):A "Permalink")  def minBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit cmp: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).minBy(f)(cmp)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.minBy(...) instead
29. [**](../../akka/util/CompactByteString.html#mkString:String "Permalink")  def mkString: StringImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).mkString
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
30. [**](../../akka/util/CompactByteString.html#mkString(sep:String):String "Permalink")  def mkString(sep: String): StringImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).mkString(sep)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
31. [**](../../akka/util/CompactByteString.html#mkString(start:String,sep:String,end:String):String "Permalink")  def mkString(start: String, sep: String, end: String): StringImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).mkString(start, sep, end)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
32. [**](../../akka/util/CompactByteString.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).nonEmpty
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.nonEmpty instead
33. [**](../../akka/util/CompactByteString.html#prefixLength(p:A=>Boolean):Int "Permalink") final  def prefixLength(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSeqOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use segmentLength instead of prefixLength
34. [**](../../akka/util/CompactByteString.html#product(implicitnum:scala.math.Numeric[A]):A "Permalink")  def product(implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).product(num)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.product instead
35. [**](../../akka/util/CompactByteString.html#reduce(f:(A,A)=>A):A "Permalink")  def reduce(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).reduce(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduce(...) instead
36. [**](../../akka/util/CompactByteString.html#reduceLeft(f:(A,A)=>A):A "Permalink")  def reduceLeft(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).reduceLeft(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceLeft(...) instead
37. [**](../../akka/util/CompactByteString.html#reduceLeftOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceLeftOption(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).reduceLeftOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceLeftOption(...) instead
38. [**](../../akka/util/CompactByteString.html#reduceOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceOption(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).reduceOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceOption(...) instead
39. [**](../../akka/util/CompactByteString.html#reduceRight(f:(A,A)=>A):A "Permalink")  def reduceRight(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).reduceRight(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceRight(...) instead
40. [**](../../akka/util/CompactByteString.html#reduceRightOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceRightOption(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).reduceRightOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceRightOption(...) instead
41. [**](../../akka/util/CompactByteString.html#repr:C "Permalink") final  def repr: [ByteString](ByteString.html)Definition ClassesIterableOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use coll instead of repr in a collection implementation, use the collection value itself from the outside
42. [**](../../akka/util/CompactByteString.html#reverseMap[B](f:A=>B):CC[B] "Permalink")  def reverseMap\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesSeqOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .reverseIterator.map(f).to(...) instead of .reverseMap(f)
43. [**](../../akka/util/CompactByteString.html#sameElements[B>:A](that:scala.collection.IterableOnce[B]):Boolean "Permalink")  def sameElements\[B \>: A](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).sameElements(that)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.sameElements instead
44. [**](../../akka/util/CompactByteString.html#seq:Iterable.this.type "Permalink")  def seq: CompactByteString.this.typeDefinition ClassesIterableAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Iterable.seq always returns the iterable itself
45. [**](../../akka/util/CompactByteString.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).size
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.size instead
46. [**](../../akka/util/CompactByteString.html#sum(implicitnum:scala.math.Numeric[A]):A "Permalink")  def sum(implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).sum(num)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.sum instead
47. [**](../../akka/util/CompactByteString.html#to[C1](factory:scala.collection.Factory[A,C1]):C1 "Permalink")  def to\[C1](factory: [Factory](https://www.scala-lang.org/api/2.13.17/scala/collection/Factory.html#scala.collection.Factory)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), C1]): C1ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).to(factory)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(factory) instead
48. [**](../../akka/util/CompactByteString.html#toArray[B>:A](implicitevidence$1:scala.reflect.ClassTag[B]):Array[B] "Permalink")  def toArray\[B \>: A](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[B]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toArray(arg0)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.toArray
49. [**](../../akka/util/CompactByteString.html#toBuffer[B>:A]:scala.collection.mutable.Buffer[B] "Permalink")  def toBuffer\[B \>: A]: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toBuffer
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(ArrayBuffer) instead
50. [**](../../akka/util/CompactByteString.html#toIndexedSeq:scala.collection.IndexedSeq[A] "Permalink")  def toIndexedSeq: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/IndexedSeq.html#scala.collection.IndexedSeq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toIndexedSeq
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.toIndexedSeq instead
51. [**](../../akka/util/CompactByteString.html#toIterable:Iterable[A] "Permalink") final  def toIterable: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toIterable
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Iterable) instead
52. [**](../../akka/util/CompactByteString.html#toIterable:Iterable.this.type "Permalink") final  def toIterable: CompactByteString.this.typeDefinition ClassesIterable → IterableOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.7\)* toIterable is internal and will be made protected; its name is similar to `toList` or `toSeq`, but it doesn't copy non\-immutable collections
53. [**](../../akka/util/CompactByteString.html#toIterator:Iterator[A] "Permalink")  def toIterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toIterator
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator instead
54. [**](../../akka/util/CompactByteString.html#toIterator:Iterator[A] "Permalink") final  def toIterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator instead of .toIterator
55. [**](../../akka/util/CompactByteString.html#toList:List[A] "Permalink")  def toList: [List](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#scala.collection.immutable.List)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toList
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(List) instead
56. [**](../../akka/util/CompactByteString.html#toMap[K,V](implicitev:A<:<(K,V)):scala.collection.immutable.Map[K,V] "Permalink")  def toMap\[K, V](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), (K, V)]): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, V]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toMap(ev)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Map) instead
57. [**](../../akka/util/CompactByteString.html#toSeq:Seq[A] "Permalink")  def toSeq: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toSeq
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Seq) instead
58. [**](../../akka/util/CompactByteString.html#toSet[B>:A]:scala.collection.immutable.Set[B] "Permalink")  def toSet\[B \>: A]: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[B]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toSet
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Set) instead
59. [**](../../akka/util/CompactByteString.html#toStream:scala.collection.immutable.Stream[A] "Permalink")  def toStream: [Stream](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Stream.html#scala.collection.immutable.Stream)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toStream
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(LazyList) instead
60. [**](../../akka/util/CompactByteString.html#toStream:scala.collection.immutable.Stream[A] "Permalink") final  def toStream: [Stream](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Stream.html#scala.collection.immutable.Stream)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .to(LazyList) instead of .toStream
61. [**](../../akka/util/CompactByteString.html#toTraversable:scala.collection.Traversable[A] "Permalink") final  def toTraversable: Traversable\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toTraversable
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Iterable) instead
62. [**](../../akka/util/CompactByteString.html#toTraversable:scala.collection.Traversable[A] "Permalink") final  def toTraversable: Traversable\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* toTraversable is internal and will be made protected; its name is similar to `toList` or `toSeq`, but it doesn't copy non\-immutable collections
63. [**](../../akka/util/CompactByteString.html#toVector:scala.collection.immutable.Vector[A] "Permalink")  def toVector: [Vector](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Vector.html#scala.collection.immutable.Vector)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).toVector
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Vector) instead
64. [**](../../akka/util/CompactByteString.html#union[B>:A](that:scala.collection.Seq[B]):CC[B] "Permalink") final  def union\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[B]): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[B]Definition ClassesSeqOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use `concat` instead
65. [**](../../akka/util/CompactByteString.html#view(from:Int,until:Int):scala.collection.IndexedSeqView[A] "Permalink")  def view(from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), until: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): IndexedSeqView\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIndexedSeqOps → IterableOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .view.slice(from, until) instead of .view(from, until)
66. [**](../../akka/util/CompactByteString.html#withFilter(f:A=>Boolean):Iterator[A] "Permalink")  def withFilter(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from CompactByteString to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(compactByteString: IterableOnceExtensionMethods[Byte]).withFilter(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.withFilter(...) instead
67. [**](../../akka/util/CompactByteString.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CompactByteString, B)ImplicitThis member is added by an implicit conversion from CompactByteString toArrowAssoc\[CompactByteString] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [ByteString](ByteString.html)

### Inherited from [StrictOptimizedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/StrictOptimizedSeqOps.html#scala.collection.immutable.StrictOptimizedSeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq), [ByteString](ByteString.html)]

### Inherited from [StrictOptimizedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/StrictOptimizedSeqOps.html#scala.collection.StrictOptimizedSeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq), [ByteString](ByteString.html)]

### Inherited from [StrictOptimizedIterableOps](https://www.scala-lang.org/api/2.13.17/scala/collection/StrictOptimizedIterableOps.html#scala.collection.StrictOptimizedIterableOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq), [ByteString](ByteString.html)]

### Inherited from [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [IndexedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeqOps.html#scala.collection.immutable.IndexedSeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq), [ByteString](ByteString.html)]

### Inherited from [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/IndexedSeq.html#scala.collection.IndexedSeq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [IndexedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IndexedSeqOps.html#scala.collection.IndexedSeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_], [ByteString](ByteString.html)]

### Inherited from [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [SeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/SeqOps.html#scala.collection.immutable.SeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_], [ByteString](ByteString.html)]

### Inherited from [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/Seq.html#scala.collection.Seq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [SeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/SeqOps.html#scala.collection.SeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_], [ByteString](ByteString.html)]

### Inherited from [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)

### Inherited from [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [IterableFactoryDefaults](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableFactoryDefaults.html#scala.collection.IterableFactoryDefaults)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[x][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[x]]

### Inherited from [IterableOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOps.html#scala.collection.IterableOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_], [ByteString](ByteString.html)]

### Inherited from [IterableOnceOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceOps.html#scala.collection.IterableOnceOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), \[\_][IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[\_], [ByteString](ByteString.html)]

### Inherited from [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion iterableOnceExtensionMethods fromCompactByteString to [IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited by implicit conversion any2stringadd fromCompactByteString to any2stringadd\[CompactByteString]

### Inherited by implicit conversion StringFormat fromCompactByteString to StringFormat\[CompactByteString]

### Inherited by implicit conversion Ensuring fromCompactByteString to Ensuring\[CompactByteString]

### Inherited by implicit conversion ArrowAssoc fromCompactByteString to ArrowAssoc\[CompactByteString]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/BoxedType$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ByteIterator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ByteIterator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ByteString$$ByteString1C.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ByteString$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ByteString.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ByteStringBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ClassLoaderObjectInputStream.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/CompactByteString$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/CompactByteString.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ConcurrentMultiMap.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/HashCode$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Helpers$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/LineNumbers$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ManifestInfo$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ManifestInfo.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/MessageBuffer$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/MessageBuffer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/MessageBufferMap.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/NanoTimeTokenBucket.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/PriorityQueueStabilizer$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ReentrantGuard.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/StablePriorityBlockingQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/StablePriorityQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Subclassification.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Switch.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Timeout$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/TypedMultiMap$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/TypedMultiMap.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/UUIDComparator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/UUIDComparator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Unsafe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Version$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Version.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/WallClock$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/WallClock.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/util/CompactByteString.html](https://doc.akka.io/api/akka-core/2.10.17/akka/util/CompactByteString.html)*