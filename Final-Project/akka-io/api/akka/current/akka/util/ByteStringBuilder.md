---
description: Akka 2.10.17 - akka.util.ByteStringBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:47:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/ByteStringBuilder.html
title: Akka 2.10.17 - akka.util.ByteStringBuilder
---

# Akka 2.10.17 - akka.util.ByteStringBuilder

> **Summary:** Akka 2.10.17 - akka.util.ByteStringBuilder

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](index.html)Definition Classes[akka](../index.html)
- [BoundedBlockingQueue](BoundedBlockingQueue.html "BoundedBlockingQueue wraps any Queue and turns the result into a BlockingQueue with a limited capacity.")
- [BoxedType](BoxedType$.html)
- [ByteIterator](ByteIterator.html "An iterator over a ByteString.")
- [ByteString](ByteString.html "A rope-like immutable data structure containing bytes.")
- ByteStringBuilder
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
c[akka](../index.html).[util](index.html)

# ByteStringBuilder[**](../../akka/util/ByteStringBuilder.html "Permalink")

### 

#### final  class ByteStringBuilder extends [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [ByteString](ByteString.html)]

A mutable builder for efficiently creating a [akka.util.ByteString](ByteString.html).

The created ByteString is not automatically compacted.

Self TypeByteStringBuilderSource[ByteString.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala-2.13/akka/util/ByteString.scala#L1073)Linear Supertypes[Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [ByteString](ByteString.html)], [Growable](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Growable.html#scala.collection.mutable.Growable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [Clearable](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Clearable.html#scala.collection.mutable.Clearable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ByteStringBuilder
2. Builder
3. Growable
4. Clearable
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

1. [**](../../akka/util/ByteStringBuilder.html#<init>():akka.util.ByteStringBuilder "Permalink")  new ByteStringBuilder()
### Value Members

1. [**](../../akka/util/ByteStringBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/ByteStringBuilder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/ByteStringBuilder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ByteStringBuilder toany2stringadd\[ByteStringBuilder] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/ByteStringBuilder.html#++=(bytes:akka.util.ByteString):ByteStringBuilder.this.type "Permalink")  def \+\+\=(bytes: [ByteString](ByteString.html)): ByteStringBuilder.this.type
5. [**](../../akka/util/ByteStringBuilder.html#++=(elems:scala.collection.IterableOnce[A]):Growable.this.type "Permalink") final  def \+\+\=(elems: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): ByteStringBuilder.this.typeDefinition ClassesGrowableAnnotations@inline()
6. [**](../../akka/util/ByteStringBuilder.html#+=(elem:A):Growable.this.type "Permalink") final  def \+\=(elem: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): ByteStringBuilder.this.typeDefinition ClassesGrowableAnnotations@inline()
7. [**](../../akka/util/ByteStringBuilder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ByteStringBuilder, B)ImplicitThis member is added by an implicit conversion from ByteStringBuilder toArrowAssoc\[ByteStringBuilder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
8. [**](../../akka/util/ByteStringBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../akka/util/ByteStringBuilder.html#addAll(xs:IterableOnce[Byte]):ByteStringBuilder.this.type "Permalink")  def addAll(xs: IterableOnce\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): ByteStringBuilder.this.typeDefinition ClassesByteStringBuilder → Growable
10. [**](../../akka/util/ByteStringBuilder.html#addAll(bytes:akka.util.ByteString):ByteStringBuilder.this.type "Permalink")  def addAll(bytes: [ByteString](ByteString.html)): ByteStringBuilder.this.type
11. [**](../../akka/util/ByteStringBuilder.html#addOne(elem:Byte):ByteStringBuilder.this.type "Permalink")  def addOne(elem: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): ByteStringBuilder.this.typeDefinition ClassesByteStringBuilder → Growable
12. [**](../../akka/util/ByteStringBuilder.html#append(bs:akka.util.ByteString):ByteStringBuilder.this.type "Permalink")  def append(bs: [ByteString](ByteString.html)): ByteStringBuilder.this.typeJava API: append a ByteString to this builder.
13. [**](../../akka/util/ByteStringBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
14. [**](../../akka/util/ByteStringBuilder.html#asOutputStream:java.io.OutputStream "Permalink")  def asOutputStream: [OutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)Directly wraps this ByteStringBuilder in an OutputStream.

Directly wraps this ByteStringBuilder in an OutputStream. Write
operations on the stream are forwarded to the builder.
15. [**](../../akka/util/ByteStringBuilder.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesByteStringBuilder → Builder → Clearable
16. [**](../../akka/util/ByteStringBuilder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/util/ByteStringBuilder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ByteStringBuilder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ByteStringBuilderImplicitThis member is added by an implicit conversion from ByteStringBuilder toEnsuring\[ByteStringBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/util/ByteStringBuilder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ByteStringBuilder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteStringBuilderImplicitThis member is added by an implicit conversion from ByteStringBuilder toEnsuring\[ByteStringBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/util/ByteStringBuilder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ByteStringBuilderImplicitThis member is added by an implicit conversion from ByteStringBuilder toEnsuring\[ByteStringBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../akka/util/ByteStringBuilder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ByteStringBuilderImplicitThis member is added by an implicit conversion from ByteStringBuilder toEnsuring\[ByteStringBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../akka/util/ByteStringBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/util/ByteStringBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
23. [**](../../akka/util/ByteStringBuilder.html#fillArray(len:Int)(fill:(Array[Byte],Int)=>Unit):ByteStringBuilder.this.type "Permalink")  def fillArray(len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(fill: ([Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): ByteStringBuilder.this.typeAttributesprotected
24. [**](../../akka/util/ByteStringBuilder.html#fillByteBuffer(len:Int,byteOrder:java.nio.ByteOrder)(fill:java.nio.ByteBuffer=>Unit):ByteStringBuilder.this.type "Permalink") final  def fillByteBuffer(len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder))(fill: ([ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): ByteStringBuilder.this.typeAttributesprotected Annotations@inline()
25. [**](../../akka/util/ByteStringBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/util/ByteStringBuilder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/util/ByteStringBuilder.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Tests whether this ByteStringBuilder is empty.
28. [**](../../akka/util/ByteStringBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../akka/util/ByteStringBuilder.html#knownSize:Int "Permalink")  def knownSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesGrowable
30. [**](../../akka/util/ByteStringBuilder.html#length:Int "Permalink")  def length: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
31. [**](../../akka/util/ByteStringBuilder.html#mapResult[NewTo](f:To=>NewTo):scala.collection.mutable.Builder[A,NewTo] "Permalink")  def mapResult\[NewTo](f: ([ByteString](ByteString.html)) \=\> NewTo): [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), NewTo]Definition ClassesBuilder
32. [**](../../akka/util/ByteStringBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
33. [**](../../akka/util/ByteStringBuilder.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Tests whether this ByteStringBuilder is not empty.
34. [**](../../akka/util/ByteStringBuilder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../akka/util/ByteStringBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../akka/util/ByteStringBuilder.html#putByte(x:Byte):ByteStringBuilder.this.type "Permalink")  def putByte(x: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)): ByteStringBuilder.this.typeAdd a single Byte to this builder.
37. [**](../../akka/util/ByteStringBuilder.html#putBytes(array:Array[Byte],start:Int,len:Int):ByteStringBuilder.this.type "Permalink")  def putBytes(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ByteStringBuilder.this.typeAdd a number of Bytes from an array to this builder.
38. [**](../../akka/util/ByteStringBuilder.html#putBytes(array:Array[Byte]):ByteStringBuilder.this.type "Permalink")  def putBytes(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): ByteStringBuilder.this.typeAdd a number of Bytes from an array to this builder.
39. [**](../../akka/util/ByteStringBuilder.html#putDouble(x:Double)(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putDouble(x: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a single Double to this builder.
40. [**](../../akka/util/ByteStringBuilder.html#putDoubles(array:Array[Double],start:Int,len:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putDoubles(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a number of Doubles from an array to this builder.
41. [**](../../akka/util/ByteStringBuilder.html#putDoubles(array:Array[Double])(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putDoubles(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a number of Doubles from an array to this builder.
42. [**](../../akka/util/ByteStringBuilder.html#putFloat(x:Float)(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putFloat(x: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a single Float to this builder.
43. [**](../../akka/util/ByteStringBuilder.html#putFloats(array:Array[Float],start:Int,len:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putFloats(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a number of Floats from an array to this builder.
44. [**](../../akka/util/ByteStringBuilder.html#putFloats(array:Array[Float])(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putFloats(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a number of Floats from an array to this builder.
45. [**](../../akka/util/ByteStringBuilder.html#putInt(x:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putInt(x: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a single Int to this builder.
46. [**](../../akka/util/ByteStringBuilder.html#putInts(array:Array[Int],start:Int,len:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putInts(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a number of Ints from an array to this builder.
47. [**](../../akka/util/ByteStringBuilder.html#putInts(array:Array[Int])(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putInts(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a number of Ints from an array to this builder.
48. [**](../../akka/util/ByteStringBuilder.html#putLong(x:Long)(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putLong(x: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a single Long to this builder.
49. [**](../../akka/util/ByteStringBuilder.html#putLongPart(x:Long,n:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putLongPart(x: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd the `n` least significant bytes of the given Long to this builder.
50. [**](../../akka/util/ByteStringBuilder.html#putLongs(array:Array[Long],start:Int,len:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putLongs(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a number of Longs from an array to this builder.
51. [**](../../akka/util/ByteStringBuilder.html#putLongs(array:Array[Long])(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putLongs(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a number of Longs from an array to this builder.
52. [**](../../akka/util/ByteStringBuilder.html#putShort(x:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putShort(x: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a single Short to this builder.
53. [**](../../akka/util/ByteStringBuilder.html#putShorts(array:Array[Short],start:Int,len:Int)(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putShorts(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)], start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a number of Shorts from an array to this builder.
54. [**](../../akka/util/ByteStringBuilder.html#putShorts(array:Array[Short])(implicitbyteOrder:java.nio.ByteOrder):ByteStringBuilder.this.type "Permalink")  def putShorts(array: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)])(implicit byteOrder: [ByteOrder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteOrder.html#java.nio.ByteOrder)): ByteStringBuilder.this.typeAdd a number of Shorts from an array to this builder.
55. [**](../../akka/util/ByteStringBuilder.html#result():akka.util.ByteString "Permalink")  def result(): [ByteString](ByteString.html)Definition ClassesByteStringBuilder → Builder
56. [**](../../akka/util/ByteStringBuilder.html#sizeHint(len:Int):Unit "Permalink")  def sizeHint(len: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesByteStringBuilder → Builder
57. [**](../../akka/util/ByteStringBuilder.html#sizeHint(coll:scala.collection.IterableOnce[_],delta:Int):Unit "Permalink") final  def sizeHint(coll: [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[\_], delta: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesBuilder
58. [**](../../akka/util/ByteStringBuilder.html#sizeHintBounded(size:Int,boundingColl:Iterable[_]):Unit "Permalink") final  def sizeHintBounded(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), boundingColl: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterable.html#scala.collection.Iterable)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesBuilder
59. [**](../../akka/util/ByteStringBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
60. [**](../../akka/util/ByteStringBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
61. [**](../../akka/util/ByteStringBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
62. [**](../../akka/util/ByteStringBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
63. [**](../../akka/util/ByteStringBuilder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/ByteStringBuilder.html#+=(elem1:A,elem2:A,elems:A*):Growable.this.type "Permalink") final  def \+\=(elem1: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), elem2: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), elems: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)\*): ByteStringBuilder.this.typeDefinition ClassesGrowableAnnotations@deprecated @inline() Deprecated*(Since version 2\.13\.0\)* Use `++=` aka `addAll` instead of varargs `+=`; infix operations with an operand of multiple args will be deprecated
2. [**](../../akka/util/ByteStringBuilder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../akka/util/ByteStringBuilder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ByteStringBuilder toStringFormat\[ByteStringBuilder] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../akka/util/ByteStringBuilder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ByteStringBuilder, B)ImplicitThis member is added by an implicit conversion from ByteStringBuilder toArrowAssoc\[ByteStringBuilder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [ByteString](ByteString.html)]

### Inherited from [Growable](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Growable.html#scala.collection.mutable.Growable)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]

### Inherited from [Clearable](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Clearable.html#scala.collection.mutable.Clearable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromByteStringBuilder to any2stringadd\[ByteStringBuilder]

### Inherited by implicit conversion StringFormat fromByteStringBuilder to StringFormat\[ByteStringBuilder]

### Inherited by implicit conversion Ensuring fromByteStringBuilder to Ensuring\[ByteStringBuilder]

### Inherited by implicit conversion ArrowAssoc fromByteStringBuilder to ArrowAssoc\[ByteStringBuilder]

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
*Source: [https://doc.akka.io/api/akka/current/akka/util/ByteStringBuilder.html](https://doc.akka.io/api/akka/current/akka/util/ByteStringBuilder.html)*