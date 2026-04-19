---
description: Akka 2.10.11 - akka.util.MessageBuffer
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:38:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/MessageBuffer.html
title: Akka 2.10.11 - akka.util.MessageBuffer
---

# Akka 2.10.11 - akka.util.MessageBuffer

> **Summary:** Akka 2.10.11 - akka.util.MessageBuffer

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
- MessageBuffer
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
[c](MessageBuffer$.html "See companion object")[akka](../index.html).[util](index.html)

# [MessageBuffer](MessageBuffer$.html "See companion object")[**](../../akka/util/MessageBuffer.html "Permalink")

### Companion [object MessageBuffer](MessageBuffer$.html "See companion object")

#### final  class MessageBuffer extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A non thread safe mutable message buffer that can be used to buffer messages inside actors.

Source[MessageBuffer.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/util/MessageBuffer.scala#L14)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MessageBuffer
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/util/MessageBuffer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/MessageBuffer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/MessageBuffer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MessageBuffer toany2stringadd\[MessageBuffer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/MessageBuffer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MessageBuffer, B)ImplicitThis member is added by an implicit conversion from MessageBuffer toArrowAssoc\[MessageBuffer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/MessageBuffer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/MessageBuffer.html#append(message:Any,ref:akka.actor.ActorRef):akka.util.MessageBuffer "Permalink")  def append(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), ref: [ActorRef](../actor/ActorRef.html)): MessageBufferAdd one element to the end of the message buffer.

Add one element to the end of the message buffer.

messagethe message to buffer

refthe actor to buffer

returnsthis message buffer
7. [**](../../akka/util/MessageBuffer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/util/MessageBuffer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/util/MessageBuffer.html#dropHead():Unit "Permalink")  def dropHead(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Remove the first element of the message buffer.
10. [**](../../akka/util/MessageBuffer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MessageBuffer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageBufferImplicitThis member is added by an implicit conversion from MessageBuffer toEnsuring\[MessageBuffer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/util/MessageBuffer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MessageBuffer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageBufferImplicitThis member is added by an implicit conversion from MessageBuffer toEnsuring\[MessageBuffer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/util/MessageBuffer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageBufferImplicitThis member is added by an implicit conversion from MessageBuffer toEnsuring\[MessageBuffer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/util/MessageBuffer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageBufferImplicitThis member is added by an implicit conversion from MessageBuffer toEnsuring\[MessageBuffer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/util/MessageBuffer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/util/MessageBuffer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../akka/util/MessageBuffer.html#forEach(f:akka.japi.function.Procedure2[Any,akka.actor.ActorRef]):Unit "Permalink")  def forEach(f: [Procedure2](../japi/function/Procedure2.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [ActorRef](../actor/ActorRef.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API

Java API

Iterate over all elements of the buffer and apply a function to each element.

fthe function to apply to each element
17. [**](../../akka/util/MessageBuffer.html#foreach(f:(Any,akka.actor.ActorRef)=>Unit):Unit "Permalink")  def foreach(f: ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [ActorRef](../actor/ActorRef.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Iterate over all elements of the buffer and apply a function to each element.

Iterate over all elements of the buffer and apply a function to each element.

fthe function to apply to each element
18. [**](../../akka/util/MessageBuffer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/util/MessageBuffer.html#getHead():akka.japi.Pair[Any,akka.actor.ActorRef] "Permalink")  def getHead(): [Pair](../japi/Pair.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [ActorRef](../actor/ActorRef.html)]Java API

Java API

Return the first element of the message buffer.

returnsthe first element or an element containing null if the buffer is empty
20. [**](../../akka/util/MessageBuffer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/util/MessageBuffer.html#head():(Any,akka.actor.ActorRef) "Permalink")  def head(): ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [ActorRef](../actor/ActorRef.html))Return the first element of the message buffer.

Return the first element of the message buffer.

returnsthe first element or an element containing null if the buffer is empty
22. [**](../../akka/util/MessageBuffer.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Check if the message buffer is empty.

Check if the message buffer is empty.

returnsif the buffer is empty
23. [**](../../akka/util/MessageBuffer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../akka/util/MessageBuffer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../akka/util/MessageBuffer.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Check if the message buffer is not empty.

Check if the message buffer is not empty.

returnsif the buffer is not empty
26. [**](../../akka/util/MessageBuffer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/util/MessageBuffer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/util/MessageBuffer.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)How many elements are in the message buffer.

How many elements are in the message buffer.

returnsthe number of elements in the message buffer
29. [**](../../akka/util/MessageBuffer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../akka/util/MessageBuffer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../akka/util/MessageBuffer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/util/MessageBuffer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../akka/util/MessageBuffer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/MessageBuffer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/MessageBuffer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MessageBuffer toStringFormat\[MessageBuffer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/MessageBuffer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MessageBuffer, B)ImplicitThis member is added by an implicit conversion from MessageBuffer toArrowAssoc\[MessageBuffer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMessageBuffer to any2stringadd\[MessageBuffer]

### Inherited by implicit conversion StringFormat fromMessageBuffer to StringFormat\[MessageBuffer]

### Inherited by implicit conversion Ensuring fromMessageBuffer to Ensuring\[MessageBuffer]

### Inherited by implicit conversion ArrowAssoc fromMessageBuffer to ArrowAssoc\[MessageBuffer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Procedure2.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/util/MessageBuffer.html](https://doc.akka.io/api/akka-core/2.10.11/akka/util/MessageBuffer.html)*