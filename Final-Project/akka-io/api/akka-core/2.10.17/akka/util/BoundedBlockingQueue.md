---
description: Akka 2.10.17 - akka.util.BoundedBlockingQueue
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:23:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/BoundedBlockingQueue.html
title: Akka 2.10.17 - akka.util.BoundedBlockingQueue
---

# Akka 2.10.17 - akka.util.BoundedBlockingQueue

> **Summary:** Akka 2.10.17 - akka.util.BoundedBlockingQueue

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](index.html)Definition Classes[akka](../index.html)
- BoundedBlockingQueue
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
c[akka](../index.html).[util](index.html)

# BoundedBlockingQueue[**](../../akka/util/BoundedBlockingQueue.html "Permalink")

### 

#### class BoundedBlockingQueue\[E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)] extends [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E] with [BlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/BlockingQueue.html#java.util.concurrent.BlockingQueue)\[E]

BoundedBlockingQueue wraps any Queue and turns the result into a BlockingQueue with a limited capacity.

Source[BoundedBlockingQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/BoundedBlockingQueue.scala#L18)Linear Supertypes[BlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/BlockingQueue.html#java.util.concurrent.BlockingQueue)\[E], [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E], [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[E], [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[E], [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[E], [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[E], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[MessageQueue](../dispatch/BoundedPriorityMailbox$$MessageQueue.html), [MessageQueue](../dispatch/BoundedStablePriorityMailbox$$MessageQueue.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BoundedBlockingQueue
2. BlockingQueue
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

1. [**](../../akka/util/BoundedBlockingQueue.html#<init>(maxCapacity:Int,backing:java.util.Queue[E]):akka.util.BoundedBlockingQueue[E] "Permalink")  new BoundedBlockingQueue(maxCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), backing: [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[E])maxCapacity\- the maximum capacity of this Queue, needs to be \> 0

backing\- the backing Queue
### Value Members

1. [**](../../akka/util/BoundedBlockingQueue.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/BoundedBlockingQueue.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/BoundedBlockingQueue.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BoundedBlockingQueue\[E] toany2stringadd\[BoundedBlockingQueue\[E]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/BoundedBlockingQueue.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BoundedBlockingQueue\[E], B)ImplicitThis member is added by an implicit conversion from BoundedBlockingQueue\[E] toArrowAssoc\[BoundedBlockingQueue\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/BoundedBlockingQueue.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/BoundedBlockingQueue.html#add(x$1:E):Boolean "Permalink")  def add(arg0: E): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractQueue → Queue → AbstractCollection → Collection
7. [**](../../akka/util/BoundedBlockingQueue.html#addAll(x$1:java.util.Collection[_<:E]):Boolean "Permalink")  def addAll(arg0: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \<: E]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAbstractQueue → AbstractCollection → Collection
8. [**](../../akka/util/BoundedBlockingQueue.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/util/BoundedBlockingQueue.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesBoundedBlockingQueue → AbstractQueue → AbstractCollection → Collection
10. [**](../../akka/util/BoundedBlockingQueue.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/util/BoundedBlockingQueue.html#contains(e:AnyRef):Boolean "Permalink")  def contains(e: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBoundedBlockingQueue → BlockingQueue → AbstractCollection → Collection
12. [**](../../akka/util/BoundedBlockingQueue.html#containsAll(c:java.util.Collection[_]):Boolean "Permalink")  def containsAll(c: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBoundedBlockingQueue → AbstractCollection → Collection
13. [**](../../akka/util/BoundedBlockingQueue.html#createLock():java.util.concurrent.locks.ReentrantLock "Permalink")  def createLock(): [ReentrantLock](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/ReentrantLock.html#java.util.concurrent.locks.ReentrantLock)Attributesprotected
14. [**](../../akka/util/BoundedBlockingQueue.html#createNotEmptyCondition():java.util.concurrent.locks.Condition "Permalink")  def createNotEmptyCondition(): [Condition](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/Condition.html#java.util.concurrent.locks.Condition)Attributesprotected
15. [**](../../akka/util/BoundedBlockingQueue.html#createNotFullCondition():java.util.concurrent.locks.Condition "Permalink")  def createNotFullCondition(): [Condition](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/Condition.html#java.util.concurrent.locks.Condition)Attributesprotected
16. [**](../../akka/util/BoundedBlockingQueue.html#drainTo(c:java.util.Collection[_>:E],maxElements:Int):Int "Permalink")  def drainTo(c: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \>: E], maxElements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesBoundedBlockingQueue → BlockingQueue
17. [**](../../akka/util/BoundedBlockingQueue.html#drainTo(c:java.util.Collection[_>:E]):Int "Permalink")  def drainTo(c: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_ \>: E]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesBoundedBlockingQueue → BlockingQueue
18. [**](../../akka/util/BoundedBlockingQueue.html#element():E "Permalink")  def element(): EDefinition ClassesAbstractQueue → Queue
19. [**](../../akka/util/BoundedBlockingQueue.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BoundedBlockingQueue\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BoundedBlockingQueue\[E]ImplicitThis member is added by an implicit conversion from BoundedBlockingQueue\[E] toEnsuring\[BoundedBlockingQueue\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../akka/util/BoundedBlockingQueue.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BoundedBlockingQueue\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BoundedBlockingQueue\[E]ImplicitThis member is added by an implicit conversion from BoundedBlockingQueue\[E] toEnsuring\[BoundedBlockingQueue\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../akka/util/BoundedBlockingQueue.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BoundedBlockingQueue\[E]ImplicitThis member is added by an implicit conversion from BoundedBlockingQueue\[E] toEnsuring\[BoundedBlockingQueue\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../akka/util/BoundedBlockingQueue.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BoundedBlockingQueue\[E]ImplicitThis member is added by an implicit conversion from BoundedBlockingQueue\[E] toEnsuring\[BoundedBlockingQueue\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../akka/util/BoundedBlockingQueue.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/util/BoundedBlockingQueue.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
25. [**](../../akka/util/BoundedBlockingQueue.html#forEach(x$1:java.util.function.Consumer[_>:T]):Unit "Permalink")  def forEach(arg0: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[\_ \>: E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesIterable
26. [**](../../akka/util/BoundedBlockingQueue.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/util/BoundedBlockingQueue.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/util/BoundedBlockingQueue.html#isEmpty():Boolean "Permalink")  def isEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBoundedBlockingQueue → AbstractCollection → Collection
29. [**](../../akka/util/BoundedBlockingQueue.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
30. [**](../../akka/util/BoundedBlockingQueue.html#iterator():java.util.Iterator[E] "Permalink")  def iterator(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[E]Definition ClassesBoundedBlockingQueue → AbstractCollection → Collection → Iterable
31. [**](../../akka/util/BoundedBlockingQueue.html#lock:java.util.concurrent.locks.ReentrantLock "Permalink")  val lock: [ReentrantLock](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/ReentrantLock.html#java.util.concurrent.locks.ReentrantLock)Attributesprotected
32. [**](../../akka/util/BoundedBlockingQueue.html#maxCapacity:Int "Permalink")  val maxCapacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
33. [**](../../akka/util/BoundedBlockingQueue.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
34. [**](../../akka/util/BoundedBlockingQueue.html#notEmpty:java.util.concurrent.locks.Condition "Permalink")  val notEmpty: [Condition](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/Condition.html#java.util.concurrent.locks.Condition)Attributesprotected
35. [**](../../akka/util/BoundedBlockingQueue.html#notFull:java.util.concurrent.locks.Condition "Permalink")  val notFull: [Condition](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/Condition.html#java.util.concurrent.locks.Condition)Attributesprotected
36. [**](../../akka/util/BoundedBlockingQueue.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../akka/util/BoundedBlockingQueue.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../akka/util/BoundedBlockingQueue.html#offer(e:E,timeout:Long,unit:java.util.concurrent.TimeUnit):Boolean "Permalink")  def offer(e: E, timeout: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), unit: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBoundedBlockingQueue → BlockingQueue
39. [**](../../akka/util/BoundedBlockingQueue.html#offer(e:E):Boolean "Permalink")  def offer(e: E): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBoundedBlockingQueue → BlockingQueue → Queue
40. [**](../../akka/util/BoundedBlockingQueue.html#parallelStream():java.util.stream.Stream[E] "Permalink")  def parallelStream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[E]Definition ClassesCollection
41. [**](../../akka/util/BoundedBlockingQueue.html#peek():E "Permalink")  def peek(): EDefinition ClassesBoundedBlockingQueue → Queue
42. [**](../../akka/util/BoundedBlockingQueue.html#poll():E "Permalink")  def poll(): EDefinition ClassesBoundedBlockingQueue → Queue
43. [**](../../akka/util/BoundedBlockingQueue.html#poll(timeout:Long,unit:java.util.concurrent.TimeUnit):E "Permalink")  def poll(timeout: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), unit: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): EDefinition ClassesBoundedBlockingQueue → BlockingQueue
44. [**](../../akka/util/BoundedBlockingQueue.html#put(e:E):Unit "Permalink")  def put(e: E): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesBoundedBlockingQueue → BlockingQueue
45. [**](../../akka/util/BoundedBlockingQueue.html#remainingCapacity():Int "Permalink")  def remainingCapacity(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesBoundedBlockingQueue → BlockingQueue
46. [**](../../akka/util/BoundedBlockingQueue.html#remove(e:AnyRef):Boolean "Permalink")  def remove(e: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBoundedBlockingQueue → BlockingQueue → AbstractCollection → Collection
47. [**](../../akka/util/BoundedBlockingQueue.html#remove():E "Permalink")  def remove(): EDefinition ClassesAbstractQueue → Queue
48. [**](../../akka/util/BoundedBlockingQueue.html#removeAll(c:java.util.Collection[_]):Boolean "Permalink")  def removeAll(c: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBoundedBlockingQueue → AbstractCollection → Collection
49. [**](../../akka/util/BoundedBlockingQueue.html#removeIf(x$1:java.util.function.Predicate[_>:E]):Boolean "Permalink")  def removeIf(arg0: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[\_ \>: E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesCollection
50. [**](../../akka/util/BoundedBlockingQueue.html#retainAll(c:java.util.Collection[_]):Boolean "Permalink")  def retainAll(c: [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[\_]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBoundedBlockingQueue → AbstractCollection → Collection
51. [**](../../akka/util/BoundedBlockingQueue.html#size():Int "Permalink")  def size(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesBoundedBlockingQueue → AbstractCollection → Collection
52. [**](../../akka/util/BoundedBlockingQueue.html#spliterator():java.util.Spliterator[E] "Permalink")  def spliterator(): [Spliterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Spliterator.html#java.util.Spliterator)\[E]Definition ClassesCollection → Iterable
53. [**](../../akka/util/BoundedBlockingQueue.html#stream():java.util.stream.Stream[E] "Permalink")  def stream(): [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[E]Definition ClassesCollection
54. [**](../../akka/util/BoundedBlockingQueue.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
55. [**](../../akka/util/BoundedBlockingQueue.html#take():E "Permalink")  def take(): EDefinition ClassesBoundedBlockingQueue → BlockingQueue
56. [**](../../akka/util/BoundedBlockingQueue.html#toArray[X](a:Array[XwithAnyRef]):Array[XwithObject] "Permalink")  def toArray\[X](a: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[X]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[X]Definition ClassesBoundedBlockingQueue → AbstractCollection → Collection
57. [**](../../akka/util/BoundedBlockingQueue.html#toArray():Array[AnyRef] "Permalink")  def toArray(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesBoundedBlockingQueue → AbstractCollection → Collection
58. [**](../../akka/util/BoundedBlockingQueue.html#toArray[T](x$1:java.util.function.IntFunction[Array[TwithObject]]):Array[TwithObject] "Permalink")  def toArray\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [IntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/IntFunction.html#java.util.function.IntFunction)\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]]): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]Definition ClassesCollection
59. [**](../../akka/util/BoundedBlockingQueue.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAbstractCollection → AnyRef → Any
60. [**](../../akka/util/BoundedBlockingQueue.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
61. [**](../../akka/util/BoundedBlockingQueue.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
62. [**](../../akka/util/BoundedBlockingQueue.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/BoundedBlockingQueue.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/BoundedBlockingQueue.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BoundedBlockingQueue\[E] toStringFormat\[BoundedBlockingQueue\[E]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/BoundedBlockingQueue.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BoundedBlockingQueue\[E], B)ImplicitThis member is added by an implicit conversion from BoundedBlockingQueue\[E] toArrowAssoc\[BoundedBlockingQueue\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/BlockingQueue.html#java.util.concurrent.BlockingQueue)\[E]

### Inherited from [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E]

### Inherited from [Queue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html#java.util.Queue)\[E]

### Inherited from [AbstractCollection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractCollection.html#java.util.AbstractCollection)\[E]

### Inherited from [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[E]

### Inherited from [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[E]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBoundedBlockingQueue\[E] to any2stringadd\[BoundedBlockingQueue\[E]]

### Inherited by implicit conversion StringFormat fromBoundedBlockingQueue\[E] to StringFormat\[BoundedBlockingQueue\[E]]

### Inherited by implicit conversion Ensuring fromBoundedBlockingQueue\[E] to Ensuring\[BoundedBlockingQueue\[E]]

### Inherited by implicit conversion ArrowAssoc fromBoundedBlockingQueue\[E] to ArrowAssoc\[BoundedBlockingQueue\[E]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedPriorityMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/dispatch/BoundedStablePriorityMailbox$$MessageQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/BoxedType$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ByteIterator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ByteIterator.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/util/BoundedBlockingQueue.html](https://doc.akka.io/api/akka-core/2.10.17/akka/util/BoundedBlockingQueue.html)*