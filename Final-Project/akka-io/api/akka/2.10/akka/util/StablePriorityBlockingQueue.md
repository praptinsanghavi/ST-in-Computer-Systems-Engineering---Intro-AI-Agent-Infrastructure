---
description: Akka 2.10.17 - akka.util.StablePriorityBlockingQueue
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:00:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/StablePriorityBlockingQueue.html
title: Akka 2.10.17 - akka.util.StablePriorityBlockingQueue
---

# Akka 2.10.17 - akka.util.StablePriorityBlockingQueue

> **Summary:** Akka 2.10.17 - akka.util.StablePriorityBlockingQueue

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
- StablePriorityBlockingQueue
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

# StablePriorityBlockingQueue[**](../../akka/util/StablePriorityBlockingQueue.html "Permalink")

### 

#### class StablePriorityBlockingQueue\[E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)] extends [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E] with [PriorityQueueStabilizer](PriorityQueueStabilizer.html)\[E]

StablePriorityBlockingQueue is a blocking priority queue that preserves order for elements of equal priority.

Source[StablePriorityQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/StablePriorityQueue.scala#L74)Linear Supertypes[PriorityQueueStabilizer](PriorityQueueStabilizer.html)\[E], [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E], [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[E], [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[E], [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[E], [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[E], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[MessageQueue](../dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StablePriorityBlockingQueue
2. PriorityQueueStabilizer
3. AbstractQueue
4. Queue
5. AbstractCollection
6. Collection
7. Iterable
8. AnyRef
9. Any
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

1. [**](../../akka/util/StablePriorityBlockingQueue.html#<init>(capacity:Int,cmp:java.util.Comparator[E]):akka.util.StablePriorityBlockingQueue[E] "Permalink")  new StablePriorityBlockingQueue(capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cmp: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[E])capacity\- the initial capacity of this Queue, needs to be \> 0\.

cmp\- Comparator for comparing Queue elements
### Value Members

1. [**](../../akka/util/StablePriorityBlockingQueue.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/StablePriorityBlockingQueue.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/StablePriorityBlockingQueue.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StablePriorityBlockingQueue\[E] toany2stringadd\[StablePriorityBlockingQueue\[E]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/StablePriorityBlockingQueue.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StablePriorityBlockingQueue\[E], B)ImplicitThis member is added by an implicit conversion from StablePriorityBlockingQueue\[E] toArrowAssoc\[StablePriorityBlockingQueue\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/StablePriorityBlockingQueue.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/StablePriorityBlockingQueue.html#add(x$1:E):Boolean "Permalink")  def add(arg0: E): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractQueue → Queue → AbstractCollection → Collection
7. [**](../../akka/util/StablePriorityBlockingQueue.html#addAll(x$1:java.util.Collection[_<:E]):Boolean "Permalink")  def addAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: E]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractQueue → AbstractCollection → Collection
8. [**](../../akka/util/StablePriorityBlockingQueue.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/util/StablePriorityBlockingQueue.html#backingQueue:java.util.concurrent.PriorityBlockingQueue[akka.util.PriorityQueueStabilizer.WrappedElement[E]] "Permalink")  val backingQueue: [PriorityBlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/PriorityBlockingQueue.html#java.util.concurrent.PriorityBlockingQueue)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]]Definition ClassesStablePriorityBlockingQueue → [PriorityQueueStabilizer](PriorityQueueStabilizer.html)
10. [**](../../akka/util/StablePriorityBlockingQueue.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAbstractQueue → AbstractCollection → Collection
11. [**](../../akka/util/StablePriorityBlockingQueue.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/util/StablePriorityBlockingQueue.html#contains(x$1:Object):Boolean "Permalink")  def contains(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
13. [**](../../akka/util/StablePriorityBlockingQueue.html#containsAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def containsAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
14. [**](../../akka/util/StablePriorityBlockingQueue.html#element():E "Permalink")  def element(): EDefinition ClassesAbstractQueue → Queue
15. [**](../../akka/util/StablePriorityBlockingQueue.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StablePriorityBlockingQueue\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StablePriorityBlockingQueue\[E]ImplicitThis member is added by an implicit conversion from StablePriorityBlockingQueue\[E] toEnsuring\[StablePriorityBlockingQueue\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/util/StablePriorityBlockingQueue.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StablePriorityBlockingQueue\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StablePriorityBlockingQueue\[E]ImplicitThis member is added by an implicit conversion from StablePriorityBlockingQueue\[E] toEnsuring\[StablePriorityBlockingQueue\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/util/StablePriorityBlockingQueue.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StablePriorityBlockingQueue\[E]ImplicitThis member is added by an implicit conversion from StablePriorityBlockingQueue\[E] toEnsuring\[StablePriorityBlockingQueue\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/util/StablePriorityBlockingQueue.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StablePriorityBlockingQueue\[E]ImplicitThis member is added by an implicit conversion from StablePriorityBlockingQueue\[E] toEnsuring\[StablePriorityBlockingQueue\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/util/StablePriorityBlockingQueue.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/util/StablePriorityBlockingQueue.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../akka/util/StablePriorityBlockingQueue.html#forEach(x$1:java.util.function.Consumer[_>:T]):Unit "Permalink")  def forEach(arg0: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[\_ \>: E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesIterable
22. [**](../../akka/util/StablePriorityBlockingQueue.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/util/StablePriorityBlockingQueue.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/util/StablePriorityBlockingQueue.html#isEmpty():Boolean "Permalink")  def isEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
25. [**](../../akka/util/StablePriorityBlockingQueue.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../akka/util/StablePriorityBlockingQueue.html#iterator():java.util.Iterator[E] "Permalink")  def iterator(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[E]Definition Classes[PriorityQueueStabilizer](PriorityQueueStabilizer.html) → AbstractCollection → Collection → Iterable
27. [**](../../akka/util/StablePriorityBlockingQueue.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../akka/util/StablePriorityBlockingQueue.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../akka/util/StablePriorityBlockingQueue.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../akka/util/StablePriorityBlockingQueue.html#offer(e:E):Boolean "Permalink")  def offer(e: E): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[PriorityQueueStabilizer](PriorityQueueStabilizer.html) → Queue
31. [**](../../akka/util/StablePriorityBlockingQueue.html#parallelStream():java.util.stream.Stream[E] "Permalink")  def parallelStream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[E]Definition ClassesCollection
32. [**](../../akka/util/StablePriorityBlockingQueue.html#peek():E "Permalink")  def peek(): EDefinition Classes[PriorityQueueStabilizer](PriorityQueueStabilizer.html) → Queue
33. [**](../../akka/util/StablePriorityBlockingQueue.html#poll():E "Permalink")  def poll(): EDefinition Classes[PriorityQueueStabilizer](PriorityQueueStabilizer.html) → Queue
34. [**](../../akka/util/StablePriorityBlockingQueue.html#remove():E "Permalink")  def remove(): EDefinition ClassesAbstractQueue → Queue
35. [**](../../akka/util/StablePriorityBlockingQueue.html#remove(x$1:Object):Boolean "Permalink")  def remove(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
36. [**](../../akka/util/StablePriorityBlockingQueue.html#removeAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def removeAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
37. [**](../../akka/util/StablePriorityBlockingQueue.html#removeIf(x$1:java.util.function.Predicate[_>:E]):Boolean "Permalink")  def removeIf(arg0: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[\_ \>: E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesCollection
38. [**](../../akka/util/StablePriorityBlockingQueue.html#retainAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def retainAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
39. [**](../../akka/util/StablePriorityBlockingQueue.html#seqNum:java.util.concurrent.atomic.AtomicLong "Permalink")  val seqNum: [AtomicLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/AtomicLong.html#java.util.concurrent.atomic.AtomicLong)Definition Classes[PriorityQueueStabilizer](PriorityQueueStabilizer.html)
40. [**](../../akka/util/StablePriorityBlockingQueue.html#size():Int "Permalink")  def size(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[PriorityQueueStabilizer](PriorityQueueStabilizer.html) → AbstractCollection → Collection
41. [**](../../akka/util/StablePriorityBlockingQueue.html#spliterator():java.util.Spliterator[E] "Permalink")  def spliterator(): [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[E]Definition ClassesCollection → Iterable
42. [**](../../akka/util/StablePriorityBlockingQueue.html#stream():java.util.stream.Stream[E] "Permalink")  def stream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[E]Definition ClassesCollection
43. [**](../../akka/util/StablePriorityBlockingQueue.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
44. [**](../../akka/util/StablePriorityBlockingQueue.html#toArray[T](x$1:Array[TwithObject]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesAbstractCollection → Collection
45. [**](../../akka/util/StablePriorityBlockingQueue.html#toArray():Array[Object] "Permalink")  def toArray(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAbstractCollection → Collection
46. [**](../../akka/util/StablePriorityBlockingQueue.html#toArray[T](x$1:java.util.function.IntFunction[Array[TwithObject]]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesCollection
47. [**](../../akka/util/StablePriorityBlockingQueue.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAbstractCollection → AnyRef → Any
48. [**](../../akka/util/StablePriorityBlockingQueue.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
49. [**](../../akka/util/StablePriorityBlockingQueue.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
50. [**](../../akka/util/StablePriorityBlockingQueue.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/StablePriorityBlockingQueue.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/StablePriorityBlockingQueue.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StablePriorityBlockingQueue\[E] toStringFormat\[StablePriorityBlockingQueue\[E]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/StablePriorityBlockingQueue.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StablePriorityBlockingQueue\[E], B)ImplicitThis member is added by an implicit conversion from StablePriorityBlockingQueue\[E] toArrowAssoc\[StablePriorityBlockingQueue\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [PriorityQueueStabilizer](PriorityQueueStabilizer.html)\[E]

### Inherited from [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E]

### Inherited from [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[E]

### Inherited from [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[E]

### Inherited from [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[E]

### Inherited from [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[E]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStablePriorityBlockingQueue\[E] to any2stringadd\[StablePriorityBlockingQueue\[E]]

### Inherited by implicit conversion StringFormat fromStablePriorityBlockingQueue\[E] to StringFormat\[StablePriorityBlockingQueue\[E]]

### Inherited by implicit conversion Ensuring fromStablePriorityBlockingQueue\[E] to Ensuring\[StablePriorityBlockingQueue\[E]]

### Inherited by implicit conversion ArrowAssoc fromStablePriorityBlockingQueue\[E] to ArrowAssoc\[StablePriorityBlockingQueue\[E]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html
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
- https://doc.akka.io/api/akka/2.10/akka/util/Helpers$.html
- https://doc.akka.io/api/akka/2.10/akka/util/Index.html
- https://doc.akka.io/api/akka/2.10/akka/util/LineNumbers$.html
- https://doc.akka.io/api/akka/2.10/akka/util/ManifestInfo$.html
- https://doc.akka.io/api/akka/2.10/akka/util/ManifestInfo.html
- https://doc.akka.io/api/akka/2.10/akka/util/MessageBuffer$.html
- https://doc.akka.io/api/akka/2.10/akka/util/MessageBuffer.html
- https://doc.akka.io/api/akka/2.10/akka/util/MessageBufferMap.html
- https://doc.akka.io/api/akka/2.10/akka/util/NanoTimeTokenBucket.html
- https://doc.akka.io/api/akka/2.10/akka/util/PriorityQueueStabilizer$$WrappedElement.html
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
*Source: [https://doc.akka.io/api/akka/2.10/akka/util/StablePriorityBlockingQueue.html](https://doc.akka.io/api/akka/2.10/akka/util/StablePriorityBlockingQueue.html)*