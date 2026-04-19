---
description: Akka 2.10.17 - akka.util.ReentrantGuard
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/ReentrantGuard.html
title: Akka 2.10.17 - akka.util.ReentrantGuard
---

# Akka 2.10.17 - akka.util.ReentrantGuard

> **Summary:** Akka 2.10.17 - akka.util.ReentrantGuard

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
- ReentrantGuard
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

# ReentrantGuard[**](../../akka/util/ReentrantGuard.html "Permalink")

### 

#### final  class ReentrantGuard extends [ReentrantLock](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/ReentrantLock.html#java.util.concurrent.locks.ReentrantLock)

Source[LockUtil.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/LockUtil.scala#L10)Linear Supertypes[ReentrantLock](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/ReentrantLock.html#java.util.concurrent.locks.ReentrantLock), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Lock](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/Lock.html#java.util.concurrent.locks.Lock), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReentrantGuard
2. ReentrantLock
3. Serializable
4. Lock
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

1. [**](../../akka/util/ReentrantGuard.html#<init>():akka.util.ReentrantGuard "Permalink")  new ReentrantGuard()
### Value Members

1. [**](../../akka/util/ReentrantGuard.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/ReentrantGuard.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/ReentrantGuard.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReentrantGuard toany2stringadd\[ReentrantGuard] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/ReentrantGuard.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReentrantGuard, B)ImplicitThis member is added by an implicit conversion from ReentrantGuard toArrowAssoc\[ReentrantGuard] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/ReentrantGuard.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/ReentrantGuard.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/util/ReentrantGuard.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/util/ReentrantGuard.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReentrantGuard) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReentrantGuardImplicitThis member is added by an implicit conversion from ReentrantGuard toEnsuring\[ReentrantGuard] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/util/ReentrantGuard.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReentrantGuard) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReentrantGuardImplicitThis member is added by an implicit conversion from ReentrantGuard toEnsuring\[ReentrantGuard] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/util/ReentrantGuard.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReentrantGuardImplicitThis member is added by an implicit conversion from ReentrantGuard toEnsuring\[ReentrantGuard] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/util/ReentrantGuard.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReentrantGuardImplicitThis member is added by an implicit conversion from ReentrantGuard toEnsuring\[ReentrantGuard] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/util/ReentrantGuard.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/util/ReentrantGuard.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/util/ReentrantGuard.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/util/ReentrantGuard.html#getHoldCount():Int "Permalink")  def getHoldCount(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesReentrantLock
16. [**](../../akka/util/ReentrantGuard.html#getOwner():Thread "Permalink")  def getOwner(): [Thread](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Thread.html#java.lang.Thread)Attributesprotected\[locks] Definition ClassesReentrantLock
17. [**](../../akka/util/ReentrantGuard.html#getQueueLength():Int "Permalink") final  def getQueueLength(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesReentrantLock
18. [**](../../akka/util/ReentrantGuard.html#getQueuedThreads():java.util.Collection[Thread] "Permalink")  def getQueuedThreads(): [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[Thread](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Thread.html#java.lang.Thread)]Attributesprotected\[locks] Definition ClassesReentrantLock
19. [**](../../akka/util/ReentrantGuard.html#getWaitQueueLength(x$1:java.util.concurrent.locks.Condition):Int "Permalink")  def getWaitQueueLength(arg0: [Condition](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/Condition.html#java.util.concurrent.locks.Condition)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesReentrantLock
20. [**](../../akka/util/ReentrantGuard.html#getWaitingThreads(x$1:java.util.concurrent.locks.Condition):java.util.Collection[Thread] "Permalink")  def getWaitingThreads(arg0: [Condition](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/Condition.html#java.util.concurrent.locks.Condition)): [Collection](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[Thread](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Thread.html#java.lang.Thread)]Attributesprotected\[locks] Definition ClassesReentrantLock
21. [**](../../akka/util/ReentrantGuard.html#hasQueuedThread(x$1:Thread):Boolean "Permalink") final  def hasQueuedThread(arg0: [Thread](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Thread.html#java.lang.Thread)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesReentrantLock
22. [**](../../akka/util/ReentrantGuard.html#hasQueuedThreads():Boolean "Permalink") final  def hasQueuedThreads(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesReentrantLock
23. [**](../../akka/util/ReentrantGuard.html#hasWaiters(x$1:java.util.concurrent.locks.Condition):Boolean "Permalink")  def hasWaiters(arg0: [Condition](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/Condition.html#java.util.concurrent.locks.Condition)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesReentrantLock
24. [**](../../akka/util/ReentrantGuard.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/util/ReentrantGuard.html#isFair():Boolean "Permalink") final  def isFair(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesReentrantLock
26. [**](../../akka/util/ReentrantGuard.html#isHeldByCurrentThread():Boolean "Permalink")  def isHeldByCurrentThread(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesReentrantLock
27. [**](../../akka/util/ReentrantGuard.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../akka/util/ReentrantGuard.html#isLocked():Boolean "Permalink")  def isLocked(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesReentrantLock
29. [**](../../akka/util/ReentrantGuard.html#lock():Unit "Permalink")  def lock(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesReentrantLock → Lock
30. [**](../../akka/util/ReentrantGuard.html#lockInterruptibly():Unit "Permalink")  def lockInterruptibly(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesReentrantLock → LockAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../akka/util/ReentrantGuard.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../akka/util/ReentrantGuard.html#newCondition():java.util.concurrent.locks.Condition "Permalink")  def newCondition(): [Condition](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/Condition.html#java.util.concurrent.locks.Condition)Definition ClassesReentrantLock → Lock
33. [**](../../akka/util/ReentrantGuard.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../akka/util/ReentrantGuard.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../akka/util/ReentrantGuard.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../akka/util/ReentrantGuard.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesReentrantLock → AnyRef → Any
37. [**](../../akka/util/ReentrantGuard.html#tryLock(x$1:Long,x$2:java.util.concurrent.TimeUnit):Boolean "Permalink")  def tryLock(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesReentrantLock → LockAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../akka/util/ReentrantGuard.html#tryLock():Boolean "Permalink")  def tryLock(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesReentrantLock → Lock
39. [**](../../akka/util/ReentrantGuard.html#unlock():Unit "Permalink")  def unlock(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesReentrantLock → Lock
40. [**](../../akka/util/ReentrantGuard.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../akka/util/ReentrantGuard.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
42. [**](../../akka/util/ReentrantGuard.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
43. [**](../../akka/util/ReentrantGuard.html#withGuard[T](body:=>T):T "Permalink") final  def withGuard\[T](body: \=\> T): TAnnotations@inline()
### Deprecated Value Members

1. [**](../../akka/util/ReentrantGuard.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/ReentrantGuard.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReentrantGuard toStringFormat\[ReentrantGuard] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/ReentrantGuard.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReentrantGuard, B)ImplicitThis member is added by an implicit conversion from ReentrantGuard toArrowAssoc\[ReentrantGuard] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ReentrantLock](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/ReentrantLock.html#java.util.concurrent.locks.ReentrantLock)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Lock](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/Lock.html#java.util.concurrent.locks.Lock)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReentrantGuard to any2stringadd\[ReentrantGuard]

### Inherited by implicit conversion StringFormat fromReentrantGuard to StringFormat\[ReentrantGuard]

### Inherited by implicit conversion Ensuring fromReentrantGuard to Ensuring\[ReentrantGuard]

### Inherited by implicit conversion ArrowAssoc fromReentrantGuard to ArrowAssoc\[ReentrantGuard]

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
*Source: [https://doc.akka.io/api/akka/current/akka/util/ReentrantGuard.html](https://doc.akka.io/api/akka/current/akka/util/ReentrantGuard.html)*