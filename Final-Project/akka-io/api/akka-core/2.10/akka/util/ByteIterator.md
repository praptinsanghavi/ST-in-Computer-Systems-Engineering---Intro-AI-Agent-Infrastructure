---
description: Akka 2.10.17 - akka.util.ByteIterator
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:31:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/ByteIterator.html
title: Akka 2.10.17 - akka.util.ByteIterator
---

# Akka 2.10.17 - akka.util.ByteIterator

> **Summary:** Akka 2.10.17 - akka.util.ByteIterator

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](index.html)Definition Classes[akka](../index.html)
- [BoundedBlockingQueue](BoundedBlockingQueue.html "BoundedBlockingQueue wraps any Queue and turns the result into a BlockingQueue with a limited capacity.")
- [BoxedType](BoxedType$.html)
- ByteIterator
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
[c](ByteIterator$.html "See companion object")[akka](../index.html).[util](index.html)

# [ByteIterator](ByteIterator$.html "See companion object")[**](../../akka/util/ByteIterator.html "Permalink")

### Companion [object ByteIterator](ByteIterator$.html "See companion object")

#### abstract  class ByteIterator extends [BufferedIterator](https://www.scala-lang.org/api/2.13.17/scala/collection/BufferedIterator.html#scala.collection.BufferedIterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

An iterator over a ByteString.

Source[ByteIterator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala-2.13/akka/util/ByteIterator.scala#L420)Linear Supertypes[BufferedIterator](https://www.scala-lang.org/api/2.13.17/scala/collection/BufferedIterator.html#scala.collection.BufferedIterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [IterableOnceOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceOps.html#scala.collection.IterableOnceOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator), [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]], [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ByteArrayIterator](ByteIterator$$ByteArrayIterator.html), [MultiByteArrayIterator](ByteIterator$$MultiByteArrayIterator.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ByteIterator
2. BufferedIterator
3. Iterator
4. IterableOnceOps
5. IterableOnce
6. AnyRef
7. Any
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
### Instance Constructors

1. [**](../../akka/util/ByteIterator.html#<init>():akka.util.ByteIterator "Permalink")  new ByteIterator()
### Type Members

1. [**](../../akka/util/ByteIterator.html#GroupedIterator[B>:A]extendsAbstractIterator[Seq[B]] "Permalink")  class GroupedIterator\[B \>: A] extends [AbstractIterator](https://www.scala-lang.org/api/2.13.17/scala/collection/AbstractIterator.html#scala.collection.AbstractIterator)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[B]]Definition ClassesIterator
### Abstract Value Members

1. [**](../../akka/util/ByteIterator.html#asInputStream:java.io.InputStream "Permalink") abstract  def asInputStream: [InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)Directly wraps this ByteIterator in an InputStream without copying.

Directly wraps this ByteIterator in an InputStream without copying.
Read and skip operations on the stream will advance the iterator
accordingly.
2. [**](../../akka/util/ByteIterator.html#clear():Unit "Permalink") abstract  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected
3. [**](../../akka/util/ByteIterator.html#copyToBuffer(buffer:java.nio.ByteBuffer):Int "Permalink") abstract  def copyToBuffer(buffer: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)For performance sensitive code, call take() directly on ByteString (it's optimised there)
4. [**](../../akka/util/ByteIterator.html#getBytes(xs:Array[Byte],offset:Int,n:Int):ByteIterator.this.type "Permalink") abstract  def getBytes(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ByteIterator.this.typeGet a specific number of Bytes from this iterator.

Get a specific number of Bytes from this iterator. In contrast to
copyToArray, this method will fail if length \< n or if (xs.length \- offset) \< n.
5. [**](../../akka/util/ByteIterator.html#getDoubles(xs:Array[Double],offset:Int,n:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink") abstract  def getDoubles(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteIterator.this.typeGet a number of Doubles from this iterator.
6. [**](../../akka/util/ByteIterator.html#getFloats(xs:Array[Float],offset:Int,n:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink") abstract  def getFloats(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteIterator.this.typeGet a number of Floats from this iterator.
7. [**](../../akka/util/ByteIterator.html#getInts(xs:Array[Int],offset:Int,n:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink") abstract  def getInts(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteIterator.this.typeGet a number of Ints from this iterator.
8. [**](../../akka/util/ByteIterator.html#getLongs(xs:Array[Long],offset:Int,n:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink") abstract  def getLongs(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteIterator.this.typeGet a number of Longs from this iterator.
9. [**](../../akka/util/ByteIterator.html#getShorts(xs:Array[Short],offset:Int,n:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink") abstract  def getShorts(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)], offset: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteIterator.this.typeGet a number of Shorts from this iterator.
10. [**](../../akka/util/ByteIterator.html#hasNext:Boolean "Permalink") abstract  def hasNext: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterator
11. [**](../../akka/util/ByteIterator.html#head:Byte "Permalink") abstract  def head: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesByteIterator → BufferedIterator
12. [**](../../akka/util/ByteIterator.html#len:Int "Permalink") abstract  def len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
13. [**](../../akka/util/ByteIterator.html#next():Byte "Permalink") abstract  def next(): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesByteIterator → Iterator
14. [**](../../akka/util/ByteIterator.html#toByteString:akka.util.ByteString "Permalink") abstract  def toByteString: [ByteString](ByteString.html)
### Concrete Value Members

1. [**](../../akka/util/ByteIterator.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/ByteIterator.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/ByteIterator.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ByteIterator toany2stringadd\[ByteIterator] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/ByteIterator.html#++(that:IterableOnce[Byte]):akka.util.ByteIterator "Permalink")  def \+\+(that: IterableOnce\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): ByteIterator
5. [**](../../akka/util/ByteIterator.html#++[B>:A](xs:=>scala.collection.IterableOnce[B]):Iterator[B] "Permalink") final  def \+\+\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](xs: \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIteratorAnnotations@inline()
6. [**](../../akka/util/ByteIterator.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ByteIterator, B)ImplicitThis member is added by an implicit conversion from ByteIterator toArrowAssoc\[ByteIterator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
7. [**](../../akka/util/ByteIterator.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/util/ByteIterator.html#addString(b:StringBuilder):b.type "Permalink") final  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder)): b.typeDefinition ClassesIterableOnceOpsAnnotations@inline()
9. [**](../../akka/util/ByteIterator.html#addString(b:StringBuilder,sep:String):b.type "Permalink") final  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder), sep: String): b.typeDefinition ClassesIterableOnceOpsAnnotations@inline()
10. [**](../../akka/util/ByteIterator.html#addString(b:StringBuilder,start:String,sep:String,end:String):b.type "Permalink")  def addString(b: [StringBuilder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/StringBuilder.html#scala.collection.mutable.StringBuilder), start: String, sep: String, end: String): b.typeDefinition ClassesIterableOnceOps
11. [**](../../akka/util/ByteIterator.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/util/ByteIterator.html#buffered:BufferedIterator.this.type "Permalink")  def buffered: ByteIterator.this.typeDefinition ClassesBufferedIterator → Iterator
13. [**](../../akka/util/ByteIterator.html#clone():akka.util.ByteIterator "Permalink")  def clone(): ByteIteratorDefinition ClassesByteIterator → AnyRef
14. [**](../../akka/util/ByteIterator.html#collect[B](pf:PartialFunction[A,B]):Iterator[B] "Permalink")  def collect\[B](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator → IterableOnceOps
15. [**](../../akka/util/ByteIterator.html#collectFirst[B](pf:PartialFunction[A,B]):Option[B] "Permalink")  def collectFirst\[B](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
16. [**](../../akka/util/ByteIterator.html#concat[B>:A](xs:=>scala.collection.IterableOnce[B]):Iterator[B] "Permalink")  def concat\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](xs: \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator
17. [**](../../akka/util/ByteIterator.html#contains(elem:Any):Boolean "Permalink")  def contains(elem: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterator
18. [**](../../akka/util/ByteIterator.html#copyToArray[B>:A](dest:Array[B],start:Int,n:Int):Int "Permalink")  def copyToArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](dest: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOps
19. [**](../../akka/util/ByteIterator.html#copyToArray[B>:A](dest:Array[B],start:Int):Int "Permalink")  def copyToArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](dest: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOpsAnnotations@deprecatedOverriding()
20. [**](../../akka/util/ByteIterator.html#copyToArray[B>:A](dest:Array[B]):Int "Permalink")  def copyToArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](dest: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOpsAnnotations@deprecatedOverriding()
21. [**](../../akka/util/ByteIterator.html#corresponds[B](that:scala.collection.IterableOnce[B])(p:(A,B)=>Boolean):Boolean "Permalink")  def corresponds\[B](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B])(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
22. [**](../../akka/util/ByteIterator.html#count(p:A=>Boolean):Int "Permalink")  def count(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOps
23. [**](../../akka/util/ByteIterator.html#distinct:Iterator[A] "Permalink")  def distinct: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator
24. [**](../../akka/util/ByteIterator.html#distinctBy[B](f:A=>B):Iterator[A] "Permalink")  def distinctBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator
25. [**](../../akka/util/ByteIterator.html#drop(n:Int):ByteIterator.this.type "Permalink")  def drop(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ByteIterator.this.typeDefinition ClassesByteIterator → Iterator → IterableOnceOps
26. [**](../../akka/util/ByteIterator.html#dropWhile(p:Byte=>Boolean):ByteIterator.this.type "Permalink")  def dropWhile(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteIterator.this.typeDefinition ClassesByteIterator → Iterator → IterableOnceOps
27. [**](../../akka/util/ByteIterator.html#duplicate:(akka.util.ByteIterator,akka.util.ByteIterator) "Permalink")  def duplicate: (ByteIterator, ByteIterator)Definition ClassesByteIterator → Iterator
28. [**](../../akka/util/ByteIterator.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ByteIterator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ByteIteratorImplicitThis member is added by an implicit conversion from ByteIterator toEnsuring\[ByteIterator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
29. [**](../../akka/util/ByteIterator.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ByteIterator) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteIteratorImplicitThis member is added by an implicit conversion from ByteIterator toEnsuring\[ByteIterator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
30. [**](../../akka/util/ByteIterator.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ByteIteratorImplicitThis member is added by an implicit conversion from ByteIterator toEnsuring\[ByteIterator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
31. [**](../../akka/util/ByteIterator.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteIteratorImplicitThis member is added by an implicit conversion from ByteIterator toEnsuring\[ByteIterator] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
32. [**](../../akka/util/ByteIterator.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
33. [**](../../akka/util/ByteIterator.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
34. [**](../../akka/util/ByteIterator.html#exists(p:A=>Boolean):Boolean "Permalink")  def exists(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
35. [**](../../akka/util/ByteIterator.html#filter(p:A=>Boolean):Iterator[A] "Permalink")  def filter(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator → IterableOnceOps
36. [**](../../akka/util/ByteIterator.html#filterNot(p:A=>Boolean):Iterator[A] "Permalink")  def filterNot(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator → IterableOnceOps
37. [**](../../akka/util/ByteIterator.html#find(p:A=>Boolean):Option[A] "Permalink")  def find(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
38. [**](../../akka/util/ByteIterator.html#flatMap[B](f:A=>scala.collection.IterableOnce[B]):Iterator[B] "Permalink")  def flatMap\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator → IterableOnceOps
39. [**](../../akka/util/ByteIterator.html#flatten[B](implicitev:A=>scala.collection.IterableOnce[B]):Iterator[B] "Permalink")  def flatten\[B](implicit ev: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator → IterableOnceOps
40. [**](../../akka/util/ByteIterator.html#fold[A1>:A](z:A1)(op:(A1,A1)=>A1):A1 "Permalink")  def fold\[A1 \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](z: A1)(op: (A1, A1) \=\> A1): A1Definition ClassesIterableOnceOps
41. [**](../../akka/util/ByteIterator.html#foldLeft[B](z:B)(op:(B,Byte)=>B):B "Permalink")  def foldLeft\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BDefinition ClassesByteIterator → IterableOnceOps
42. [**](../../akka/util/ByteIterator.html#foldRight[B](z:B)(op:(A,B)=>B):B "Permalink")  def foldRight\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BDefinition ClassesIterableOnceOps
43. [**](../../akka/util/ByteIterator.html#forall(p:A=>Boolean):Boolean "Permalink")  def forall(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
44. [**](../../akka/util/ByteIterator.html#foreach[U](f:Byte=>U):Unit "Permalink")  def foreach\[U](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> U): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesByteIterator → IterableOnceOps
45. [**](../../akka/util/ByteIterator.html#getByte:Byte "Permalink")  def getByte: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Get a single Byte from this iterator.

Get a single Byte from this iterator. Identical to next().
46. [**](../../akka/util/ByteIterator.html#getByteString(n:Int):akka.util.ByteString "Permalink")  def getByteString(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ByteString](ByteString.html)Get a ByteString with specific number of Bytes from this iterator.

Get a ByteString with specific number of Bytes from this iterator. In contrast to
copyToArray, this method will fail if this.len \< n.
47. [**](../../akka/util/ByteIterator.html#getBytes(n:Int):Array[Byte] "Permalink")  def getBytes(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Get a specific number of Bytes from this iterator.

Get a specific number of Bytes from this iterator. In contrast to
copyToArray, this method will fail if this.len \< n.
48. [**](../../akka/util/ByteIterator.html#getBytes(xs:Array[Byte]):ByteIterator.this.type "Permalink")  def getBytes(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): ByteIterator.this.typeGet a specific number of Bytes from this iterator.

Get a specific number of Bytes from this iterator. In contrast to
copyToArray, this method will fail if this.len \< xs.length.
49. [**](../../akka/util/ByteIterator.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
50. [**](../../akka/util/ByteIterator.html#getDouble(implicitbyteOrder:java.nio.ByteOrder):Double "Permalink")  def getDouble(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
51. [**](../../akka/util/ByteIterator.html#getDoubles(xs:Array[Double])(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink")  def getDoubles(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteIterator.this.typeGet a number of Doubles from this iterator.
52. [**](../../akka/util/ByteIterator.html#getFloat(implicitbyteOrder:java.nio.ByteOrder):Float "Permalink")  def getFloat(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)
53. [**](../../akka/util/ByteIterator.html#getFloats(xs:Array[Float])(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink")  def getFloats(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteIterator.this.typeGet a number of Floats from this iterator.
54. [**](../../akka/util/ByteIterator.html#getInt(implicitbyteOrder:java.nio.ByteOrder):Int "Permalink")  def getInt(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Get a single Int from this iterator.
55. [**](../../akka/util/ByteIterator.html#getInts(xs:Array[Int])(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink")  def getInts(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteIterator.this.typeGet a number of Ints from this iterator.
56. [**](../../akka/util/ByteIterator.html#getLong(implicitbyteOrder:java.nio.ByteOrder):Long "Permalink")  def getLong(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Get a single Long from this iterator.
57. [**](../../akka/util/ByteIterator.html#getLongPart(n:Int)(implicitbyteOrder:java.nio.ByteOrder):Long "Permalink")  def getLongPart(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Get a Long from this iterator where only the least significant `n`
bytes were encoded.
58. [**](../../akka/util/ByteIterator.html#getLongs(xs:Array[Long])(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink")  def getLongs(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteIterator.this.typeGet a number of Longs from this iterator.
59. [**](../../akka/util/ByteIterator.html#getShort(implicitbyteOrder:java.nio.ByteOrder):Short "Permalink")  def getShort(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)Get a single Short from this iterator.
60. [**](../../akka/util/ByteIterator.html#getShorts(xs:Array[Short])(implicitbyteOrder:java.nio.ByteOrder):ByteIterator.this.type "Permalink")  def getShorts(xs: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteIterator.this.typeGet a number of Shorts from this iterator.
61. [**](../../akka/util/ByteIterator.html#grouped[B>:A](size:Int):Iterator.this.GroupedIterator[B] "Permalink")  def grouped\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [GroupedIterator](#GroupedIterator[B>:A]extendsAbstractIterator[Seq[B]])\[B]Definition ClassesIterator
62. [**](../../akka/util/ByteIterator.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
63. [**](../../akka/util/ByteIterator.html#headOption:Option[A] "Permalink")  def headOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesBufferedIterator
64. [**](../../akka/util/ByteIterator.html#indexOf[B>:Byte](elem:B,from:Int):Int "Permalink")  def indexOf\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B, from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesByteIterator → Iterator
65. [**](../../akka/util/ByteIterator.html#indexOf[B>:Byte](elem:B):Int "Permalink")  def indexOf\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](elem: B): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesByteIterator → Iterator
66. [**](../../akka/util/ByteIterator.html#indexOf(elem:Byte,from:Int):Int "Permalink")  def indexOf(elem: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
67. [**](../../akka/util/ByteIterator.html#indexOf(elem:Byte):Int "Permalink")  def indexOf(elem: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
68. [**](../../akka/util/ByteIterator.html#indexWhere(p:Byte=>Boolean,from:Int):Int "Permalink")  def indexWhere(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesByteIterator → Iterator
69. [**](../../akka/util/ByteIterator.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterator → IterableOnceOpsAnnotations@deprecatedOverriding()
70. [**](../../akka/util/ByteIterator.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
71. [**](../../akka/util/ByteIterator.html#isTraversableAgain:Boolean "Permalink")  def isTraversableAgain: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOps
72. [**](../../akka/util/ByteIterator.html#iterator:Iterator[A] "Permalink") final  def iterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator → IterableOnceAnnotations@inline()
73. [**](../../akka/util/ByteIterator.html#knownSize:Int "Permalink")  def knownSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnce
74. [**](../../akka/util/ByteIterator.html#length:Int "Permalink") final  def length: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIteratorAnnotations@inline()
75. [**](../../akka/util/ByteIterator.html#map[B](f:A=>B):Iterator[B] "Permalink")  def map\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator → IterableOnceOps
76. [**](../../akka/util/ByteIterator.html#max[B>:A](implicitord:scala.math.Ordering[B]):A "Permalink")  def max\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
77. [**](../../akka/util/ByteIterator.html#maxBy[B](f:A=>B)(implicitord:scala.math.Ordering[B]):A "Permalink")  def maxBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
78. [**](../../akka/util/ByteIterator.html#maxByOption[B](f:A=>B)(implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def maxByOption\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
79. [**](../../akka/util/ByteIterator.html#maxOption[B>:A](implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def maxOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
80. [**](../../akka/util/ByteIterator.html#min[B>:A](implicitord:scala.math.Ordering[B]):A "Permalink")  def min\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
81. [**](../../akka/util/ByteIterator.html#minBy[B](f:A=>B)(implicitord:scala.math.Ordering[B]):A "Permalink")  def minBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesIterableOnceOps
82. [**](../../akka/util/ByteIterator.html#minByOption[B](f:A=>B)(implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def minByOption\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
83. [**](../../akka/util/ByteIterator.html#minOption[B>:A](implicitord:scala.math.Ordering[B]):Option[A] "Permalink")  def minOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
84. [**](../../akka/util/ByteIterator.html#mkString:String "Permalink") final  def mkString: StringDefinition ClassesIterableOnceOpsAnnotations@inline()
85. [**](../../akka/util/ByteIterator.html#mkString(sep:String):String "Permalink") final  def mkString(sep: String): StringDefinition ClassesIterableOnceOpsAnnotations@inline()
86. [**](../../akka/util/ByteIterator.html#mkString(start:String,sep:String,end:String):String "Permalink") final  def mkString(start: String, sep: String, end: String): StringDefinition ClassesIterableOnceOps
87. [**](../../akka/util/ByteIterator.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
88. [**](../../akka/util/ByteIterator.html#nextOption():Option[A] "Permalink")  def nextOption(): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator
89. [**](../../akka/util/ByteIterator.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterableOnceOpsAnnotations@deprecatedOverriding()
90. [**](../../akka/util/ByteIterator.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
91. [**](../../akka/util/ByteIterator.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
92. [**](../../akka/util/ByteIterator.html#padTo[B>:A](len:Int,elem:B):Iterator[B] "Permalink")  def padTo\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), elem: B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator
93. [**](../../akka/util/ByteIterator.html#partition(p:A=>Boolean):(Iterator[A],Iterator[A]) "Permalink")  def partition(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ([Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)])Definition ClassesIterator
94. [**](../../akka/util/ByteIterator.html#patch[B>:A](from:Int,patchElems:Iterator[B],replaced:Int):Iterator[B] "Permalink")  def patch\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), patchElems: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B], replaced: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator
95. [**](../../akka/util/ByteIterator.html#product[B>:A](implicitnum:scala.math.Numeric[B]):B "Permalink")  def product\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[B]): BDefinition ClassesIterableOnceOps
96. [**](../../akka/util/ByteIterator.html#reduce[B>:A](op:(B,B)=>B):B "Permalink")  def reduce\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, B) \=\> B): BDefinition ClassesIterableOnceOps
97. [**](../../akka/util/ByteIterator.html#reduceLeft[B>:A](op:(B,A)=>B):B "Permalink")  def reduceLeft\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BDefinition ClassesIterableOnceOps
98. [**](../../akka/util/ByteIterator.html#reduceLeftOption[B>:A](op:(B,A)=>B):Option[B] "Permalink")  def reduceLeftOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
99. [**](../../akka/util/ByteIterator.html#reduceOption[B>:A](op:(B,B)=>B):Option[B] "Permalink")  def reduceOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: (B, B) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
100. [**](../../akka/util/ByteIterator.html#reduceRight[B>:A](op:(A,B)=>B):B "Permalink")  def reduceRight\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BDefinition ClassesIterableOnceOps
101. [**](../../akka/util/ByteIterator.html#reduceRightOption[B>:A](op:(A,B)=>B):Option[B] "Permalink")  def reduceRightOption\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]Definition ClassesIterableOnceOps
102. [**](../../akka/util/ByteIterator.html#reversed:Iterable[A] "Permalink")  def reversed: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Attributesprotected Definition ClassesIterableOnceOps
103. [**](../../akka/util/ByteIterator.html#sameElements[B>:A](that:scala.collection.IterableOnce[B]):Boolean "Permalink")  def sameElements\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterator
104. [**](../../akka/util/ByteIterator.html#scanLeft[B](z:B)(op:(B,A)=>B):Iterator[B] "Permalink")  def scanLeft\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIterator → IterableOnceOps
105. [**](../../akka/util/ByteIterator.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesIterableOnceOps
106. [**](../../akka/util/ByteIterator.html#slice(from:Int,until:Int):ByteIterator.this.type "Permalink")  def slice(from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), until: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ByteIterator.this.typeDefinition ClassesByteIterator → Iterator → IterableOnceOps
107. [**](../../akka/util/ByteIterator.html#sliceIterator(from:Int,until:Int):Iterator[A] "Permalink")  def sliceIterator(from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), until: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Attributesprotected Definition ClassesIterator
108. [**](../../akka/util/ByteIterator.html#sliding[B>:A](size:Int,step:Int):Iterator.this.GroupedIterator[B] "Permalink")  def sliding\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), step: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [GroupedIterator](#GroupedIterator[B>:A]extendsAbstractIterator[Seq[B]])\[B]Definition ClassesIterator
109. [**](../../akka/util/ByteIterator.html#span(p:Byte=>Boolean):(akka.util.ByteIterator,akka.util.ByteIterator) "Permalink")  def span(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): (ByteIterator, ByteIterator)Definition ClassesByteIterator → Iterator → IterableOnceOps
110. [**](../../akka/util/ByteIterator.html#splitAt(n:Int):(C,C) "Permalink")  def splitAt(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ([Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)])Definition ClassesIterableOnceOps
111. [**](../../akka/util/ByteIterator.html#stepper[S<:scala.collection.Stepper[_]](implicitshape:scala.collection.StepperShape[A,S]):S "Permalink")  def stepper\[S \<: [Stepper](https://www.scala-lang.org/api/2.13.17/scala/collection/Stepper.html#scala.collection.Stepper)\[\_]](implicit shape: StepperShape\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), S]): SDefinition ClassesIterableOnce
112. [**](../../akka/util/ByteIterator.html#sum[B>:A](implicitnum:scala.math.Numeric[B]):B "Permalink")  def sum\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[B]): BDefinition ClassesIterableOnceOps
113. [**](../../akka/util/ByteIterator.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
114. [**](../../akka/util/ByteIterator.html#take(n:Int):ByteIterator.this.type "Permalink")  def take(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ByteIterator.this.typeDefinition ClassesByteIterator → Iterator → IterableOnceOps
115. [**](../../akka/util/ByteIterator.html#takeWhile(p:Byte=>Boolean):ByteIterator.this.type "Permalink")  def takeWhile(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteIterator.this.typeDefinition ClassesByteIterator → Iterator → IterableOnceOps
116. [**](../../akka/util/ByteIterator.html#tapEach[U](f:A=>U):Iterator[A] "Permalink")  def tapEach\[U](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> U): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator → IterableOnceOps
117. [**](../../akka/util/ByteIterator.html#to[C1](factory:scala.collection.Factory[A,C1]):C1 "Permalink")  def to\[C1](factory: [Factory](https://www.scala-lang.org/api/2.13.17/scala/collection/Factory.html#scala.collection.Factory)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), C1]): C1Definition ClassesIterableOnceOps
118. [**](../../akka/util/ByteIterator.html#toArray[B>:Byte](implicitarg0:scala.reflect.ClassTag[B]):Array[B] "Permalink")  def toArray\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[B]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]Definition ClassesByteIterator → IterableOnceOps
119. [**](../../akka/util/ByteIterator.html#toBuffer[B>:A]:scala.collection.mutable.Buffer[B] "Permalink") final  def toBuffer\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]Definition ClassesIterableOnceOpsAnnotations@inline()
120. [**](../../akka/util/ByteIterator.html#toIndexedSeq:IndexedSeq[A] "Permalink")  def toIndexedSeq: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
121. [**](../../akka/util/ByteIterator.html#toList:List[A] "Permalink")  def toList: [List](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#scala.collection.immutable.List)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
122. [**](../../akka/util/ByteIterator.html#toMap[K,V](implicitev:A<:<(K,V)):scala.collection.immutable.Map[K,V] "Permalink")  def toMap\[K, V](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), (K, V)]): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, V]Definition ClassesIterableOnceOps
123. [**](../../akka/util/ByteIterator.html#toSeq:akka.util.ByteString "Permalink")  def toSeq: [ByteString](ByteString.html)Definition ClassesByteIterator → IterableOnceOps
124. [**](../../akka/util/ByteIterator.html#toSet[B>:A]:scala.collection.immutable.Set[B] "Permalink")  def toSet\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[B]Definition ClassesIterableOnceOps
125. [**](../../akka/util/ByteIterator.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesIterator → AnyRef → Any
126. [**](../../akka/util/ByteIterator.html#toVector:scala.collection.immutable.Vector[A] "Permalink")  def toVector: [Vector](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Vector.html#scala.collection.immutable.Vector)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOps
127. [**](../../akka/util/ByteIterator.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
128. [**](../../akka/util/ByteIterator.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
129. [**](../../akka/util/ByteIterator.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
130. [**](../../akka/util/ByteIterator.html#withFilter(p:A=>Boolean):Iterator[A] "Permalink")  def withFilter(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterator
131. [**](../../akka/util/ByteIterator.html#zip[B](that:scala.collection.IterableOnce[B]):Iterator[(A,B)] "Permalink")  def zip\[B](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B)]Definition ClassesIterator
132. [**](../../akka/util/ByteIterator.html#zipAll[A1>:A,B](that:scala.collection.IterableOnce[B],thisElem:A1,thatElem:B):Iterator[(A1,B)] "Permalink")  def zipAll\[A1 \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B], thisElem: A1, thatElem: B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[(A1, B)]Definition ClassesIterator
133. [**](../../akka/util/ByteIterator.html#zipWithIndex:Iterator[(A,Int)] "Permalink")  def zipWithIndex: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))]Definition ClassesIterator → IterableOnceOps
### Deprecated Value Members

1. [**](../../akka/util/ByteIterator.html#/:[B](z:B)(op:(B,A)=>B):B "Permalink")  def /:\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte])./:(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldLeft instead
2. [**](../../akka/util/ByteIterator.html#/:[B](z:B)(op:(B,A)=>B):B "Permalink") final  def /:\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use foldLeft instead of /:
3. [**](../../akka/util/ByteIterator.html#:\[B](z:B)(op:(A,B)=>B):B "Permalink")  def :\\\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).:\(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldRight instead
4. [**](../../akka/util/ByteIterator.html#:\[B](z:B)(op:(A,B)=>B):B "Permalink") final  def :\\\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use foldRight instead of :\\
5. [**](../../akka/util/ByteIterator.html#aggregate[B](z:=>B)(seqop:(B,A)=>B,combop:(B,B)=>B):B "Permalink")  def aggregate\[B](z: \=\> B)(seqop: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B, combop: (B, B) \=\> B): BDefinition ClassesIterableOnceOpsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* For sequential collections, prefer `foldLeft(z)(seqop)`. For parallel collections, use `ParIterableLike#aggregate`.
6. [**](../../akka/util/ByteIterator.html#collectFirst[B](f:PartialFunction[A,B]):Option[B] "Permalink")  def collectFirst\[B](f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).collectFirst(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.collectFirst(...) instead
7. [**](../../akka/util/ByteIterator.html#copyToBuffer(dest:scala.collection.mutable.Buffer[A]):Unit "Permalink")  def copyToBuffer(dest: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).copyToBuffer(dest)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.copyToBuffer(...) instead
8. [**](../../akka/util/ByteIterator.html#copyToBuffer[B>:A](dest:scala.collection.mutable.Buffer[B]):Unit "Permalink") final  def copyToBuffer\[B \>: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)](dest: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use `dest ++= coll` instead
9. [**](../../akka/util/ByteIterator.html#count(f:A=>Boolean):Int "Permalink")  def count(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).count(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.count(...) instead
10. [**](../../akka/util/ByteIterator.html#exists(f:A=>Boolean):Boolean "Permalink")  def exists(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).exists(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.exists(...) instead
11. [**](../../akka/util/ByteIterator.html#filter(f:A=>Boolean):Iterator[A] "Permalink")  def filter(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).filter(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.filter(...) instead
12. [**](../../akka/util/ByteIterator.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
13. [**](../../akka/util/ByteIterator.html#find(p:A=>Boolean):Option[A] "Permalink")  def find(p: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).find(p)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.find instead
14. [**](../../akka/util/ByteIterator.html#flatMap[B](f:A=>scala.collection.IterableOnce[B]):scala.collection.IterableOnce[B] "Permalink")  def flatMap\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).flatMap(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.flatMap instead or consider requiring an Iterable
15. [**](../../akka/util/ByteIterator.html#fold[A1>:A](z:A1)(op:(A1,A1)=>A1):A1 "Permalink")  def fold\[A1 \>: A](z: A1)(op: (A1, A1) \=\> A1): A1ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).fold(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.fold instead
16. [**](../../akka/util/ByteIterator.html#foldLeft[B](z:B)(op:(B,A)=>B):B "Permalink")  def foldLeft\[B](z: B)(op: (B, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): BImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).foldLeft(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldLeft instead
17. [**](../../akka/util/ByteIterator.html#foldRight[B](z:B)(op:(A,B)=>B):B "Permalink")  def foldRight\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): BImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).foldRight(z)(op)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foldRight instead
18. [**](../../akka/util/ByteIterator.html#forall(f:A=>Boolean):Boolean "Permalink")  def forall(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).forall(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.forall(...) instead
19. [**](../../akka/util/ByteIterator.html#foreach[U](f:A=>U):Unit "Permalink")  def foreach\[U](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> U): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).foreach(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.foreach(...) instead
20. [**](../../akka/util/ByteIterator.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ByteIterator toStringFormat\[ByteIterator] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
21. [**](../../akka/util/ByteIterator.html#hasDefiniteSize:Boolean "Permalink") final  def hasDefiniteSize: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIterator → IterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* hasDefiniteSize on Iterator is the same as isEmpty
22. [**](../../akka/util/ByteIterator.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).isEmpty
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.isEmpty instead
23. [**](../../akka/util/ByteIterator.html#map[B](f:A=>B):scala.collection.IterableOnce[B] "Permalink")  def map\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B): [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).map(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.map instead or consider requiring an Iterable
24. [**](../../akka/util/ByteIterator.html#max(implicitord:scala.math.Ordering[A]):A "Permalink")  def max(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).max(ord)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.max instead
25. [**](../../akka/util/ByteIterator.html#maxBy[B](f:A=>B)(implicitcmp:scala.math.Ordering[B]):A "Permalink")  def maxBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit cmp: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).maxBy(f)(cmp)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.maxBy(...) instead
26. [**](../../akka/util/ByteIterator.html#min(implicitord:scala.math.Ordering[A]):A "Permalink")  def min(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).min(ord)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.min instead
27. [**](../../akka/util/ByteIterator.html#minBy[B](f:A=>B)(implicitcmp:scala.math.Ordering[B]):A "Permalink")  def minBy\[B](f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> B)(implicit cmp: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[B]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).minBy(f)(cmp)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.minBy(...) instead
28. [**](../../akka/util/ByteIterator.html#mkString:String "Permalink")  def mkString: StringImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).mkString
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
29. [**](../../akka/util/ByteIterator.html#mkString(sep:String):String "Permalink")  def mkString(sep: String): StringImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).mkString(sep)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
30. [**](../../akka/util/ByteIterator.html#mkString(start:String,sep:String,end:String):String "Permalink")  def mkString(start: String, sep: String, end: String): StringImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).mkString(start, sep, end)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.mkString instead
31. [**](../../akka/util/ByteIterator.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).nonEmpty
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.nonEmpty instead
32. [**](../../akka/util/ByteIterator.html#product(implicitnum:scala.math.Numeric[A]):A "Permalink")  def product(implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).product(num)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.product instead
33. [**](../../akka/util/ByteIterator.html#reduce(f:(A,A)=>A):A "Permalink")  def reduce(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).reduce(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduce(...) instead
34. [**](../../akka/util/ByteIterator.html#reduceLeft(f:(A,A)=>A):A "Permalink")  def reduceLeft(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).reduceLeft(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceLeft(...) instead
35. [**](../../akka/util/ByteIterator.html#reduceLeftOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceLeftOption(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).reduceLeftOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceLeftOption(...) instead
36. [**](../../akka/util/ByteIterator.html#reduceOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceOption(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).reduceOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceOption(...) instead
37. [**](../../akka/util/ByteIterator.html#reduceRight(f:(A,A)=>A):A "Permalink")  def reduceRight(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).reduceRight(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceRight(...) instead
38. [**](../../akka/util/ByteIterator.html#reduceRightOption(f:(A,A)=>A):Option[A] "Permalink")  def reduceRightOption(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).reduceRightOption(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.reduceRightOption(...) instead
39. [**](../../akka/util/ByteIterator.html#sameElements[B>:A](that:scala.collection.IterableOnce[B]):Boolean "Permalink")  def sameElements\[B \>: A](that: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[B]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).sameElements(that)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.sameElements instead
40. [**](../../akka/util/ByteIterator.html#scanRight[B](z:B)(op:(A,B)=>B):Iterator[B] "Permalink")  def scanRight\[B](z: B)(op: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), B) \=\> B): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[B]Definition ClassesIteratorAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Call scanRight on an Iterable instead.
41. [**](../../akka/util/ByteIterator.html#seq:Iterator.this.type "Permalink")  def seq: ByteIterator.this.typeDefinition ClassesIteratorAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Iterator.seq always returns the iterator itself
42. [**](../../akka/util/ByteIterator.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).size
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.size instead
43. [**](../../akka/util/ByteIterator.html#sum(implicitnum:scala.math.Numeric[A]):A "Permalink")  def sum(implicit num: [Numeric](https://www.scala-lang.org/api/2.13.17/scala/math/Numeric.html#scala.math.Numeric)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).sum(num)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.sum instead
44. [**](../../akka/util/ByteIterator.html#to[C1](factory:scala.collection.Factory[A,C1]):C1 "Permalink")  def to\[C1](factory: [Factory](https://www.scala-lang.org/api/2.13.17/scala/collection/Factory.html#scala.collection.Factory)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), C1]): C1ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).to(factory)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(factory) instead
45. [**](../../akka/util/ByteIterator.html#toArray[B>:A](implicitevidence$1:scala.reflect.ClassTag[B]):Array[B] "Permalink")  def toArray\[B \>: A](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[B]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[B]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).toArray(arg0)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.toArray
46. [**](../../akka/util/ByteIterator.html#toBuffer[B>:A]:scala.collection.mutable.Buffer[B] "Permalink")  def toBuffer\[B \>: A]: [Buffer](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Buffer.html#scala.collection.mutable.Buffer)\[B]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).toBuffer
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(ArrayBuffer) instead
47. [**](../../akka/util/ByteIterator.html#toIndexedSeq:scala.collection.IndexedSeq[A] "Permalink")  def toIndexedSeq: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/IndexedSeq.html#scala.collection.IndexedSeq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).toIndexedSeq
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.toIndexedSeq instead
48. [**](../../akka/util/ByteIterator.html#toIterable:Iterable[A] "Permalink") final  def toIterable: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Iterable) instead
49. [**](../../akka/util/ByteIterator.html#toIterator:Iterator[A] "Permalink")  def toIterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).toIterator
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator instead
50. [**](../../akka/util/ByteIterator.html#toIterator:Iterator[A] "Permalink") final  def toIterator: [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator instead of .toIterator
51. [**](../../akka/util/ByteIterator.html#toList:List[A] "Permalink")  def toList: [List](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#scala.collection.immutable.List)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).toList
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(List) instead
52. [**](../../akka/util/ByteIterator.html#toMap[K,V](implicitev:A<:<(K,V)):scala.collection.immutable.Map[K,V] "Permalink")  def toMap\[K, V](implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), (K, V)]): [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Map.html#scala.collection.immutable.Map)\[K, V]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).toMap(ev)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Map) instead
53. [**](../../akka/util/ByteIterator.html#toSeq:Seq[A] "Permalink")  def toSeq: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).toSeq
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Seq) instead
54. [**](../../akka/util/ByteIterator.html#toSet[B>:A]:scala.collection.immutable.Set[B] "Permalink")  def toSet\[B \>: A]: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[B]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).toSet
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Set) instead
55. [**](../../akka/util/ByteIterator.html#toStream:scala.collection.immutable.Stream[A] "Permalink")  def toStream: [Stream](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Stream.html#scala.collection.immutable.Stream)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).toStream
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(LazyList) instead
56. [**](../../akka/util/ByteIterator.html#toStream:scala.collection.immutable.Stream[A] "Permalink") final  def toStream: [Stream](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Stream.html#scala.collection.immutable.Stream)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesIterableOnceOpsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .to(LazyList) instead of .toStream
57. [**](../../akka/util/ByteIterator.html#toTraversable:scala.collection.Traversable[A] "Permalink") final  def toTraversable: Traversable\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Iterable) instead
58. [**](../../akka/util/ByteIterator.html#toVector:scala.collection.immutable.Vector[A] "Permalink")  def toVector: [Vector](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Vector.html#scala.collection.immutable.Vector)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).toVector
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use .iterator.to(Vector) instead
59. [**](../../akka/util/ByteIterator.html#withFilter(f:A=>Boolean):Iterator[A] "Permalink")  def withFilter(f: ([Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]ImplicitThis member is added by an implicit conversion from ByteIterator to[IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] performed by method iterableOnceExtensionMethods in scala.collection.IterableOnce.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(byteIterator: IterableOnceExtensionMethods[Byte]).withFilter(f)
```
Definition ClassesIterableOnceExtensionMethodsAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use .iterator.withFilter(...) instead
60. [**](../../akka/util/ByteIterator.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ByteIterator, B)ImplicitThis member is added by an implicit conversion from ByteIterator toArrowAssoc\[ByteIterator] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BufferedIterator](https://www.scala-lang.org/api/2.13.17/scala/collection/BufferedIterator.html#scala.collection.BufferedIterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [IterableOnceOps](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceOps.html#scala.collection.IterableOnceOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator), [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]]

### Inherited from [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion iterableOnceExtensionMethods fromByteIterator to [IterableOnceExtensionMethods](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnceExtensionMethods.html#scala.collection.IterableOnceExtensionMethods)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited by implicit conversion any2stringadd fromByteIterator to any2stringadd\[ByteIterator]

### Inherited by implicit conversion StringFormat fromByteIterator to StringFormat\[ByteIterator]

### Inherited by implicit conversion Ensuring fromByteIterator to Ensuring\[ByteIterator]

### Inherited by implicit conversion ArrowAssoc fromByteIterator to ArrowAssoc\[ByteIterator]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/BoxedType$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator$$ByteArrayIterator.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator$$MultiByteArrayIterator.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator.html](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteIterator.html)*