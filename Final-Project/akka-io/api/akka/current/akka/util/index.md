---
description: Akka 2.10.17 - akka.util.Index
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:47:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/Index.html
title: Akka 2.10.17 - akka.util.Index
---

# Akka 2.10.17 - akka.util.Index

> **Summary:** Akka 2.10.17 - akka.util.Index

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
- Index
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

# Index[**](../../akka/util/Index.html "Permalink")

### 

#### class Index\[K, V] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

An implementation of a ConcurrentMultiMap
Adds/remove is serialized over the specified key
Reads are fully concurrent \<\-\- el\-cheapo

Source[Index.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/Index.scala#L19)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ConcurrentMultiMap](ConcurrentMultiMap.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Index
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

1. [**](../../akka/util/Index.html#<init>(mapSize:Int,cmp:(V,V)=>Int):akka.util.Index[K,V] "Permalink")  new Index(mapSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), cmp: (V, V) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
2. [**](../../akka/util/Index.html#<init>(mapSize:Int,valueComparator:java.util.Comparator[V]):akka.util.Index[K,V] "Permalink")  new Index(mapSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), valueComparator: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[V])
### Value Members

1. [**](../../akka/util/Index.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/Index.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/Index.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Index\[K, V] toany2stringadd\[Index\[K, V]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/Index.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Index\[K, V], B)ImplicitThis member is added by an implicit conversion from Index\[K, V] toArrowAssoc\[Index\[K, V]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/Index.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/Index.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/util/Index.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Removes all keys and all values
8. [**](../../akka/util/Index.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/util/Index.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Index\[K, V]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Index\[K, V]ImplicitThis member is added by an implicit conversion from Index\[K, V] toEnsuring\[Index\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/util/Index.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Index\[K, V]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Index\[K, V]ImplicitThis member is added by an implicit conversion from Index\[K, V] toEnsuring\[Index\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/util/Index.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Index\[K, V]ImplicitThis member is added by an implicit conversion from Index\[K, V] toEnsuring\[Index\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/util/Index.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Index\[K, V]ImplicitThis member is added by an implicit conversion from Index\[K, V] toEnsuring\[Index\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/util/Index.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/util/Index.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/util/Index.html#findValue(key:K)(f:V=>Boolean):Option[V] "Permalink")  def findValue(key: K)(f: (V) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[V]returnsSome(value) for the first matching value where the supplied function returns true for the given key,
if no matches it returns None
16. [**](../../akka/util/Index.html#foreach(fun:(K,V)=>Unit):Unit "Permalink")  def foreach(fun: (K, V) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Applies the supplied function to all keys and their values
17. [**](../../akka/util/Index.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/util/Index.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/util/Index.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)returnstrue if the underlying containers is empty, may report false negatives when the last remove is underway
20. [**](../../akka/util/Index.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/util/Index.html#keys:Iterable[K] "Permalink")  def keys: Iterable\[K]Returns the key set.
22. [**](../../akka/util/Index.html#mapSize:Int "Permalink")  val mapSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
23. [**](../../akka/util/Index.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../akka/util/Index.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/util/Index.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/util/Index.html#put(key:K,value:V):Boolean "Permalink")  def put(key: K, value: V): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Associates the value of type V with the key of type K

Associates the value of type V with the key of type K

returnstrue if the value didn't exist for the key previously, and false otherwise
27. [**](../../akka/util/Index.html#remove(key:K):Option[Iterable[V]] "Permalink")  def remove(key: K): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Iterable\[V]]Disassociates all the values for the specified key

Disassociates all the values for the specified key

returnsNone if the key wasn't associated at all, or Some(scala.Iterable\[V]) if it was associated
28. [**](../../akka/util/Index.html#remove(key:K,value:V):Boolean "Permalink")  def remove(key: K, value: V): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Disassociates the value of type V from the key of type K

Disassociates the value of type V from the key of type K

returnstrue if the value was disassociated from the key and false if it wasn't previously associated with the key
29. [**](../../akka/util/Index.html#removeValue(value:V):Unit "Permalink")  def removeValue(value: V): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Removes the specified value from all keys
30. [**](../../akka/util/Index.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../akka/util/Index.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../akka/util/Index.html#valueComparator:java.util.Comparator[V] "Permalink")  val valueComparator: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[V]
33. [**](../../akka/util/Index.html#valueIterator(key:K):Iterator[V] "Permalink")  def valueIterator(key: K): Iterator\[V]Returns an Iterator of V containing the values for the supplied key, or an empty iterator if the key doesn't exist
34. [**](../../akka/util/Index.html#values:Set[V] "Permalink")  def values: Set\[V]Returns the union of all value sets.
35. [**](../../akka/util/Index.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../akka/util/Index.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../akka/util/Index.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/Index.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/Index.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Index\[K, V] toStringFormat\[Index\[K, V]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/Index.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Index\[K, V], B)ImplicitThis member is added by an implicit conversion from Index\[K, V] toArrowAssoc\[Index\[K, V]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromIndex\[K, V] to any2stringadd\[Index\[K, V]]

### Inherited by implicit conversion StringFormat fromIndex\[K, V] to StringFormat\[Index\[K, V]]

### Inherited by implicit conversion Ensuring fromIndex\[K, V] to Ensuring\[Index\[K, V]]

### Inherited by implicit conversion ArrowAssoc fromIndex\[K, V] to ArrowAssoc\[Index\[K, V]]

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
*Source: [https://doc.akka.io/api/akka/current/akka/util/Index.html](https://doc.akka.io/api/akka/current/akka/util/Index.html)*