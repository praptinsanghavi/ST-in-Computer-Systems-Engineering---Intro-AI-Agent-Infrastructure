---
description: Akka 2.10.11 - akka.util.PriorityQueueStabilizer
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:38:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/PriorityQueueStabilizer.html
title: Akka 2.10.11 - akka.util.PriorityQueueStabilizer
---

# Akka 2.10.11 - akka.util.PriorityQueueStabilizer

> **Summary:** Akka 2.10.11 - akka.util.PriorityQueueStabilizer

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
- [NanoTimeTokenBucket](NanoTimeTokenBucket.html "Default implementation of TokenBucket that uses System.nanoTime as the time source.")
- PriorityQueueStabilizer
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
[t](PriorityQueueStabilizer$.html "See companion object")[akka](../index.html).[util](index.html)

# [PriorityQueueStabilizer](PriorityQueueStabilizer$.html "See companion object")[**](../../akka/util/PriorityQueueStabilizer.html "Permalink")

### Companion [object PriorityQueueStabilizer](PriorityQueueStabilizer$.html "See companion object")

#### trait PriorityQueueStabilizer\[E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)] extends [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E]

PriorityQueueStabilizer wraps a priority queue so that it respects FIFO for elements of equal priority.

Source[StablePriorityQueue.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/util/StablePriorityQueue.scala#L14)Linear Supertypes[AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E], [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[E], [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[E], [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[E], [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[E], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[MessageQueue](../dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html), [StablePriorityBlockingQueue](StablePriorityBlockingQueue.html), [StablePriorityQueue](StablePriorityQueue.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PriorityQueueStabilizer
2. AbstractQueue
3. Queue
4. AbstractCollection
5. Collection
6. Iterable
7. AnyRef
8. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../akka/util/PriorityQueueStabilizer.html#backingQueue:java.util.AbstractQueue[akka.util.PriorityQueueStabilizer.WrappedElement[E]] "Permalink") abstract  val backingQueue: [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]]
### Concrete Value Members

1. [**](../../akka/util/PriorityQueueStabilizer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/PriorityQueueStabilizer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/PriorityQueueStabilizer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PriorityQueueStabilizer\[E] toany2stringadd\[PriorityQueueStabilizer\[E]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/PriorityQueueStabilizer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PriorityQueueStabilizer\[E], B)ImplicitThis member is added by an implicit conversion from PriorityQueueStabilizer\[E] toArrowAssoc\[PriorityQueueStabilizer\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/PriorityQueueStabilizer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/PriorityQueueStabilizer.html#add(x$1:E):Boolean "Permalink")  def add(arg0: E): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractQueue → Queue → AbstractCollection → Collection
7. [**](../../akka/util/PriorityQueueStabilizer.html#addAll(x$1:java.util.Collection[_<:E]):Boolean "Permalink")  def addAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: E]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractQueue → AbstractCollection → Collection
8. [**](../../akka/util/PriorityQueueStabilizer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/util/PriorityQueueStabilizer.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAbstractQueue → AbstractCollection → Collection
10. [**](../../akka/util/PriorityQueueStabilizer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/util/PriorityQueueStabilizer.html#contains(x$1:Object):Boolean "Permalink")  def contains(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
12. [**](../../akka/util/PriorityQueueStabilizer.html#containsAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def containsAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
13. [**](../../akka/util/PriorityQueueStabilizer.html#element():E "Permalink")  def element(): EDefinition ClassesAbstractQueue → Queue
14. [**](../../akka/util/PriorityQueueStabilizer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PriorityQueueStabilizer\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PriorityQueueStabilizer\[E]ImplicitThis member is added by an implicit conversion from PriorityQueueStabilizer\[E] toEnsuring\[PriorityQueueStabilizer\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/util/PriorityQueueStabilizer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PriorityQueueStabilizer\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PriorityQueueStabilizer\[E]ImplicitThis member is added by an implicit conversion from PriorityQueueStabilizer\[E] toEnsuring\[PriorityQueueStabilizer\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/util/PriorityQueueStabilizer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PriorityQueueStabilizer\[E]ImplicitThis member is added by an implicit conversion from PriorityQueueStabilizer\[E] toEnsuring\[PriorityQueueStabilizer\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/util/PriorityQueueStabilizer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PriorityQueueStabilizer\[E]ImplicitThis member is added by an implicit conversion from PriorityQueueStabilizer\[E] toEnsuring\[PriorityQueueStabilizer\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/util/PriorityQueueStabilizer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/util/PriorityQueueStabilizer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/util/PriorityQueueStabilizer.html#forEach(x$1:java.util.function.Consumer[_>:T]):Unit "Permalink")  def forEach(arg0: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[\_ \>: E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesIterable
21. [**](../../akka/util/PriorityQueueStabilizer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/util/PriorityQueueStabilizer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/util/PriorityQueueStabilizer.html#isEmpty():Boolean "Permalink")  def isEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
24. [**](../../akka/util/PriorityQueueStabilizer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/util/PriorityQueueStabilizer.html#iterator():java.util.Iterator[E] "Permalink")  def iterator(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[E]Definition ClassesPriorityQueueStabilizer → AbstractCollection → Collection → Iterable
26. [**](../../akka/util/PriorityQueueStabilizer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../akka/util/PriorityQueueStabilizer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/util/PriorityQueueStabilizer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../akka/util/PriorityQueueStabilizer.html#offer(e:E):Boolean "Permalink")  def offer(e: E): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPriorityQueueStabilizer → Queue
30. [**](../../akka/util/PriorityQueueStabilizer.html#parallelStream():java.util.stream.Stream[E] "Permalink")  def parallelStream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[E]Definition ClassesCollection
31. [**](../../akka/util/PriorityQueueStabilizer.html#peek():E "Permalink")  def peek(): EDefinition ClassesPriorityQueueStabilizer → Queue
32. [**](../../akka/util/PriorityQueueStabilizer.html#poll():E "Permalink")  def poll(): EDefinition ClassesPriorityQueueStabilizer → Queue
33. [**](../../akka/util/PriorityQueueStabilizer.html#remove():E "Permalink")  def remove(): EDefinition ClassesAbstractQueue → Queue
34. [**](../../akka/util/PriorityQueueStabilizer.html#remove(x$1:Object):Boolean "Permalink")  def remove(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
35. [**](../../akka/util/PriorityQueueStabilizer.html#removeAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def removeAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
36. [**](../../akka/util/PriorityQueueStabilizer.html#removeIf(x$1:java.util.function.Predicate[_>:E]):Boolean "Permalink")  def removeIf(arg0: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[\_ \>: E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesCollection
37. [**](../../akka/util/PriorityQueueStabilizer.html#retainAll(x$1:java.util.Collection[_]):Boolean "Permalink")  def retainAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractCollection → Collection
38. [**](../../akka/util/PriorityQueueStabilizer.html#seqNum:java.util.concurrent.atomic.AtomicLong "Permalink")  val seqNum: [AtomicLong](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/AtomicLong.html#java.util.concurrent.atomic.AtomicLong)
39. [**](../../akka/util/PriorityQueueStabilizer.html#size():Int "Permalink")  def size(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesPriorityQueueStabilizer → AbstractCollection → Collection
40. [**](../../akka/util/PriorityQueueStabilizer.html#spliterator():java.util.Spliterator[E] "Permalink")  def spliterator(): [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[E]Definition ClassesCollection → Iterable
41. [**](../../akka/util/PriorityQueueStabilizer.html#stream():java.util.stream.Stream[E] "Permalink")  def stream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[E]Definition ClassesCollection
42. [**](../../akka/util/PriorityQueueStabilizer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
43. [**](../../akka/util/PriorityQueueStabilizer.html#toArray[T](x$1:Array[TwithObject]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesAbstractCollection → Collection
44. [**](../../akka/util/PriorityQueueStabilizer.html#toArray():Array[Object] "Permalink")  def toArray(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAbstractCollection → Collection
45. [**](../../akka/util/PriorityQueueStabilizer.html#toArray[T](x$1:java.util.function.IntFunction[Array[TwithObject]]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesCollection
46. [**](../../akka/util/PriorityQueueStabilizer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAbstractCollection → AnyRef → Any
47. [**](../../akka/util/PriorityQueueStabilizer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
48. [**](../../akka/util/PriorityQueueStabilizer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
49. [**](../../akka/util/PriorityQueueStabilizer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/PriorityQueueStabilizer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/PriorityQueueStabilizer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PriorityQueueStabilizer\[E] toStringFormat\[PriorityQueueStabilizer\[E]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/PriorityQueueStabilizer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PriorityQueueStabilizer\[E], B)ImplicitThis member is added by an implicit conversion from PriorityQueueStabilizer\[E] toArrowAssoc\[PriorityQueueStabilizer\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E]

### Inherited from [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[E]

### Inherited from [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[E]

### Inherited from [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[E]

### Inherited from [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[E]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPriorityQueueStabilizer\[E] to any2stringadd\[PriorityQueueStabilizer\[E]]

### Inherited by implicit conversion StringFormat fromPriorityQueueStabilizer\[E] to StringFormat\[PriorityQueueStabilizer\[E]]

### Inherited by implicit conversion Ensuring fromPriorityQueueStabilizer\[E] to Ensuring\[PriorityQueueStabilizer\[E]]

### Inherited by implicit conversion ArrowAssoc fromPriorityQueueStabilizer\[E] to ArrowAssoc\[PriorityQueueStabilizer\[E]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/dispatch/UnboundedStablePriorityMailbox$$MessageQueue.html
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
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/PriorityQueueStabilizer$$WrappedElement.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/util/PriorityQueueStabilizer.html](https://doc.akka.io/api/akka-core/2.10.11/akka/util/PriorityQueueStabilizer.html)*