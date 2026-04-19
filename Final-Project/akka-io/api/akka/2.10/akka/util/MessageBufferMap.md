---
description: Akka 2.10.17 - akka.util.MessageBufferMap
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:00:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/MessageBufferMap.html
title: Akka 2.10.17 - akka.util.MessageBufferMap
---

# Akka 2.10.17 - akka.util.MessageBufferMap

> **Summary:** Akka 2.10.17 - akka.util.MessageBufferMap

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
- MessageBufferMap
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

# MessageBufferMap[**](../../akka/util/MessageBufferMap.html "Permalink")

### 

#### final  class MessageBufferMap\[I] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A non thread safe mutable message buffer map that can be used to buffer messages inside actors.

I(Id type)

Source[MessageBuffer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/MessageBuffer.scala#L173)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MessageBufferMap
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
### Instance Constructors

1. [**](../../akka/util/MessageBufferMap.html#<init>():akka.util.MessageBufferMap[I] "Permalink")  new MessageBufferMap()
### Value Members

1. [**](../../akka/util/MessageBufferMap.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/MessageBufferMap.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/MessageBufferMap.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MessageBufferMap\[I] toany2stringadd\[MessageBufferMap\[I]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/MessageBufferMap.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MessageBufferMap\[I], B)ImplicitThis member is added by an implicit conversion from MessageBufferMap\[I] toArrowAssoc\[MessageBufferMap\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/MessageBufferMap.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/MessageBufferMap.html#add(id:I):Unit "Permalink")  def add(id: I): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Add an id to the buffer map
7. [**](../../akka/util/MessageBufferMap.html#append(id:I,message:Any,ref:akka.actor.ActorRef):Unit "Permalink")  def append(id: I, message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), ref: [ActorRef](../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Append an element to the buffer for an id.

Append an element to the buffer for an id.

idthe id to add the element to

messagethe message to buffer

refthe actor to buffer
8. [**](../../akka/util/MessageBufferMap.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/util/MessageBufferMap.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/util/MessageBufferMap.html#contains(id:I):Boolean "Permalink")  def contains(id: I): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Check if the buffer map contains an id.

Check if the buffer map contains an id.

idthe id to check for

returnsif the buffer contains the given id
11. [**](../../akka/util/MessageBufferMap.html#drop(id:I,reason:String,deadLetters:akka.actor.ActorRef):Int "Permalink")  def drop(id: I, reason: String, deadLetters: [ActorRef](../actor/ActorRef.html)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Remove the buffer for an id, but publish a [akka.actor.Dropped](../actor/Dropped.html) for each dropped buffered message

Remove the buffer for an id, but publish a [akka.actor.Dropped](../actor/Dropped.html) for each dropped buffered message

returnshow many buffered messages were dropped
12. [**](../../akka/util/MessageBufferMap.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MessageBufferMap\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageBufferMap\[I]ImplicitThis member is added by an implicit conversion from MessageBufferMap\[I] toEnsuring\[MessageBufferMap\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/util/MessageBufferMap.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MessageBufferMap\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageBufferMap\[I]ImplicitThis member is added by an implicit conversion from MessageBufferMap\[I] toEnsuring\[MessageBufferMap\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/util/MessageBufferMap.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageBufferMap\[I]ImplicitThis member is added by an implicit conversion from MessageBufferMap\[I] toEnsuring\[MessageBufferMap\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/util/MessageBufferMap.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageBufferMap\[I]ImplicitThis member is added by an implicit conversion from MessageBufferMap\[I] toEnsuring\[MessageBufferMap\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/util/MessageBufferMap.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/util/MessageBufferMap.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../akka/util/MessageBufferMap.html#forEach(f:akka.japi.function.Procedure2[I,akka.util.MessageBuffer]):Unit "Permalink")  def forEach(f: [Procedure2](../japi/function/Procedure2.html)\[I, [MessageBuffer](MessageBuffer.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API

Java API

Iterate over all elements of the buffer map and apply a function to each element.

fthe function to apply to each element
19. [**](../../akka/util/MessageBufferMap.html#foreach(f:(I,akka.util.MessageBuffer)=>Unit):Unit "Permalink")  def foreach(f: (I, [MessageBuffer](MessageBuffer.html)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Iterate over all elements of the buffer map and apply a function to each element.

Iterate over all elements of the buffer map and apply a function to each element.

fthe function to apply to each element
20. [**](../../akka/util/MessageBufferMap.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/util/MessageBufferMap.html#getOrEmpty(id:I):akka.util.MessageBuffer "Permalink")  def getOrEmpty(id: I): [MessageBuffer](MessageBuffer.html)Get the message buffer for an id, or an empty buffer if the id doesn't exist in the map.

Get the message buffer for an id, or an empty buffer if the id doesn't exist in the map.

idthe id to get the message buffer for

returnsthe message buffer for the given id or an empty buffer if the id doesn't exist
22. [**](../../akka/util/MessageBufferMap.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/util/MessageBufferMap.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Check if the buffer map is empty.

Check if the buffer map is empty.

returnsif the buffer map is empty
24. [**](../../akka/util/MessageBufferMap.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/util/MessageBufferMap.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../akka/util/MessageBufferMap.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Check if the buffer map is not empty.

Check if the buffer map is not empty.

returnsif the buffer map is not empty
27. [**](../../akka/util/MessageBufferMap.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/util/MessageBufferMap.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../akka/util/MessageBufferMap.html#remove(id:I):Unit "Permalink")  def remove(id: I): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Remove the buffer for an id.

Remove the buffer for an id.

idthe id to remove the buffer for
30. [**](../../akka/util/MessageBufferMap.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)How many ids are in the buffer map.

How many ids are in the buffer map.

returnsthe number of ids in the buffer map
31. [**](../../akka/util/MessageBufferMap.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../akka/util/MessageBufferMap.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
33. [**](../../akka/util/MessageBufferMap.html#totalSize:Int "Permalink")  def totalSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)How many elements are in the buffers in the buffer map.

How many elements are in the buffers in the buffer map.

returnsthe number of elements in the buffers in the buffer map
34. [**](../../akka/util/MessageBufferMap.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../akka/util/MessageBufferMap.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../akka/util/MessageBufferMap.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/MessageBufferMap.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/MessageBufferMap.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MessageBufferMap\[I] toStringFormat\[MessageBufferMap\[I]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/MessageBufferMap.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MessageBufferMap\[I], B)ImplicitThis member is added by an implicit conversion from MessageBufferMap\[I] toArrowAssoc\[MessageBufferMap\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMessageBufferMap\[I] to any2stringadd\[MessageBufferMap\[I]]

### Inherited by implicit conversion StringFormat fromMessageBufferMap\[I] to StringFormat\[MessageBufferMap\[I]]

### Inherited by implicit conversion Ensuring fromMessageBufferMap\[I] to Ensuring\[MessageBufferMap\[I]]

### Inherited by implicit conversion ArrowAssoc fromMessageBufferMap\[I] to ArrowAssoc\[MessageBufferMap\[I]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Dropped.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/japi/function/Procedure2.html
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
*Source: [https://doc.akka.io/api/akka/2.10/akka/util/MessageBufferMap.html](https://doc.akka.io/api/akka/2.10/akka/util/MessageBufferMap.html)*