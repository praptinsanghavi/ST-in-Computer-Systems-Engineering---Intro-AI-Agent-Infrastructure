---
description: Akka 2.10.17 - akka.util.TypedMultiMap
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/TypedMultiMap.html
title: Akka 2.10.17 - akka.util.TypedMultiMap
---

# Akka 2.10.17 - akka.util.TypedMultiMap

> **Summary:** Akka 2.10.17 - akka.util.TypedMultiMap

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
- [StablePriorityBlockingQueue](StablePriorityBlockingQueue.html "StablePriorityBlockingQueue is a blocking priority queue that preserves order for elements of equal priority.")
- [StablePriorityQueue](StablePriorityQueue.html "StablePriorityQueue is a priority queue that preserves order for elements of equal priority.")
- [Subclassification](Subclassification.html "Typeclass which describes a classification hierarchy.")
- [Switch](Switch.html "An atomic switch that can be either on or off")
- [Timeout](Timeout.html)
- TypedMultiMap
- [UUIDComparator](UUIDComparator.html "Scala implementation of UUIDComparator in https://github.com/cowtowncoder/java-uuid-generator Apache License 2.0.")
- [Unsafe](Unsafe.html "INTERNAL API")
- [Version](Version.html "Comparable version information.")
- [WallClock](WallClock.html "A time source.")
[c](TypedMultiMap$.html "See companion object")[akka](../index.html).[util](index.html)

# [TypedMultiMap](TypedMultiMap$.html "See companion object")[**](../../akka/util/TypedMultiMap.html "Permalink")

### Companion [object TypedMultiMap](TypedMultiMap$.html "See companion object")

#### class TypedMultiMap\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), K\[\_ \<: T]] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

An immutable multi\-map that expresses the value type as a type function of the key
type. Create it with a type constructor that expresses the relationship:

```
trait Key { type Type = T }
case class MyValue[T](...)

// type function from Key to MyValue
type KV[K <: Key] = MyValue[K#Type]

val map = TypedMultiMap.empty[Key, KV]

// a plain Int => String map would use this function:
type plain[K <: Int] = String

// a map T => T would use this function:
type identity[T <: AnyRef] = T
```
Caveat: using keys which take type parameters does not work due to conflicts
with the existential interpretation of `Key[_]`. A workaround is to define
a key type like above and provide a subtype that provides its type parameter
as type member `Type`.

Source[TypedMultiMap.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/TypedMultiMap.scala#L32)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TypedMultiMap
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

1. [**](../../akka/util/TypedMultiMap.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/TypedMultiMap.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/TypedMultiMap.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TypedMultiMap\[T, K] toany2stringadd\[TypedMultiMap\[T, K]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/TypedMultiMap.html#++(other:akka.util.TypedMultiMap[T,K]):akka.util.TypedMultiMap[T,K] "Permalink")  def \+\+(other: TypedMultiMap\[T, K]): TypedMultiMap\[T, K]Add all entries from the other map, overwriting existing entries.

Add all entries from the other map, overwriting existing entries.

FIXME: should it merge, instead?
5. [**](../../akka/util/TypedMultiMap.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TypedMultiMap\[T, K], B)ImplicitThis member is added by an implicit conversion from TypedMultiMap\[T, K] toArrowAssoc\[TypedMultiMap\[T, K]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../akka/util/TypedMultiMap.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../akka/util/TypedMultiMap.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/util/TypedMultiMap.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/util/TypedMultiMap.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TypedMultiMap\[T, K]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TypedMultiMap\[T, K]ImplicitThis member is added by an implicit conversion from TypedMultiMap\[T, K] toEnsuring\[TypedMultiMap\[T, K]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/util/TypedMultiMap.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TypedMultiMap\[T, K]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TypedMultiMap\[T, K]ImplicitThis member is added by an implicit conversion from TypedMultiMap\[T, K] toEnsuring\[TypedMultiMap\[T, K]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/util/TypedMultiMap.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TypedMultiMap\[T, K]ImplicitThis member is added by an implicit conversion from TypedMultiMap\[T, K] toEnsuring\[TypedMultiMap\[T, K]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/util/TypedMultiMap.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TypedMultiMap\[T, K]ImplicitThis member is added by an implicit conversion from TypedMultiMap\[T, K] toEnsuring\[TypedMultiMap\[T, K]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/util/TypedMultiMap.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/util/TypedMultiMap.html#equals(other:Any):Boolean "Permalink")  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesTypedMultiMap → AnyRef → Any
15. [**](../../akka/util/TypedMultiMap.html#get(key:T):Set[K[key.type]] "Permalink")  def get(key: T): Set\[K\[key.type]]Obtain all mappings for the given key.
16. [**](../../akka/util/TypedMultiMap.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/util/TypedMultiMap.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesTypedMultiMap → AnyRef → Any
18. [**](../../akka/util/TypedMultiMap.html#inserted(key:T)(value:K[key.type]):akka.util.TypedMultiMap[T,K] "Permalink")  def inserted(key: T)(value: K\[key.type]): TypedMultiMap\[T, K]Return a map that has the given value added to the mappings for the given key.
19. [**](../../akka/util/TypedMultiMap.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../akka/util/TypedMultiMap.html#keyRemoved(key:T):akka.util.TypedMultiMap[T,K] "Permalink")  def keyRemoved(key: T): TypedMultiMap\[T, K]Return a map that has all mappings for the given key removed.
21. [**](../../akka/util/TypedMultiMap.html#keySet:Set[T] "Permalink")  def keySet: Set\[T]Return the set of keys which are mapped to non\-empty value sets.
22. [**](../../akka/util/TypedMultiMap.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../akka/util/TypedMultiMap.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/util/TypedMultiMap.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/util/TypedMultiMap.html#removed(key:T)(value:K[key.type]):akka.util.TypedMultiMap[T,K] "Permalink")  def removed(key: T)(value: K\[key.type]): TypedMultiMap\[T, K]Return a map that has the given mapping from the given key removed.
26. [**](../../akka/util/TypedMultiMap.html#setAll(key:T)(values:Set[K[key.type]]):akka.util.TypedMultiMap[T,K] "Permalink")  def setAll(key: T)(values: Set\[K\[key.type]]): TypedMultiMap\[T, K]
27. [**](../../akka/util/TypedMultiMap.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../akka/util/TypedMultiMap.html#toString():String "Permalink")  def toString(): StringDefinition ClassesTypedMultiMap → AnyRef → Any
29. [**](../../akka/util/TypedMultiMap.html#valueRemoved(value:Any):akka.util.TypedMultiMap[T,K] "Permalink")  def valueRemoved(value: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TypedMultiMap\[T, K]Return a map that has the given value removed from all keys.
30. [**](../../akka/util/TypedMultiMap.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../akka/util/TypedMultiMap.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../akka/util/TypedMultiMap.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/TypedMultiMap.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/TypedMultiMap.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TypedMultiMap\[T, K] toStringFormat\[TypedMultiMap\[T, K]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/TypedMultiMap.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TypedMultiMap\[T, K], B)ImplicitThis member is added by an implicit conversion from TypedMultiMap\[T, K] toArrowAssoc\[TypedMultiMap\[T, K]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTypedMultiMap\[T, K] to any2stringadd\[TypedMultiMap\[T, K]]

### Inherited by implicit conversion StringFormat fromTypedMultiMap\[T, K] to StringFormat\[TypedMultiMap\[T, K]]

### Inherited by implicit conversion Ensuring fromTypedMultiMap\[T, K] to Ensuring\[TypedMultiMap\[T, K]]

### Inherited by implicit conversion ArrowAssoc fromTypedMultiMap\[T, K] to ArrowAssoc\[TypedMultiMap\[T, K]]

### Ungrouped

## Related Pages (Internal Links)

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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/util/TypedMultiMap.html](https://doc.akka.io/api/akka-core/2.10.17/akka/util/TypedMultiMap.html)*