---
description: Akka 2.10.17 - akka.util
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:48:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/index.html
title: Akka 2.10.17 - akka.util
---

# Akka 2.10.17 - akka.util

> **Summary:** Akka 2.10.17 - akka.util

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](../dispatch/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](../event/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](../io/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](../pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](../persistence/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package utilDefinition Classes[akka](../index.html)
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
- [TypedMultiMap](TypedMultiMap.html "An immutable multi-map that expresses the value type as a type function of the key type.")
- [UUIDComparator](UUIDComparator.html "Scala implementation of UUIDComparator in https://github.com/cowtowncoder/java-uuid-generator Apache License 2.0.")
- [Unsafe](Unsafe.html "INTERNAL API")
- [Version](Version.html "Comparable version information.")
- [WallClock](WallClock.html "A time source.")
p[akka](../index.html)

# util[**](../../akka/util/index.html "Permalink")

#### package util

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/util/BoundedBlockingQueue.html "Permalink")  class [BoundedBlockingQueue](BoundedBlockingQueue.html "BoundedBlockingQueue wraps any Queue and turns the result into a BlockingQueue with a limited capacity.")\[E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)] extends [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E] with [BlockingQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/BlockingQueue.html#java.util.concurrent.BlockingQueue)\[E]BoundedBlockingQueue wraps any Queue and turns the result into a BlockingQueue with a limited capacity.
2. [**](../../akka/util/ByteIterator.html "Permalink") abstract  class [ByteIterator](ByteIterator.html "An iterator over a ByteString.") extends [BufferedIterator](https://www.scala-lang.org/api/2.13.17/scala/collection/BufferedIterator.html#scala.collection.BufferedIterator)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]An iterator over a ByteString.
3. [**](../../akka/util/ByteString.html "Permalink") sealed abstract  class [ByteString](ByteString.html "A rope-like immutable data structure containing bytes.") extends [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)] with [IndexedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeqOps.html#scala.collection.immutable.IndexedSeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq), [ByteString](ByteString.html)] with [StrictOptimizedSeqOps](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/StrictOptimizedSeqOps.html#scala.collection.immutable.StrictOptimizedSeqOps)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq), [ByteString](ByteString.html)]A rope\-like immutable data structure containing bytes.

A rope\-like immutable data structure containing bytes.
The goal of this structure is to reduce copying of arrays
when concatenating and slicing sequences of bytes,
and also providing a thread safe way of working with bytes.

TODO: Add performance characteristics
4. [**](../../akka/util/ByteStringBuilder.html "Permalink") final  class [ByteStringBuilder](ByteStringBuilder.html "A mutable builder for efficiently creating a akka.util.ByteString.") extends [Builder](https://www.scala-lang.org/api/2.13.17/scala/collection/mutable/Builder.html#scala.collection.mutable.Builder)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte), [ByteString](ByteString.html)]A mutable builder for efficiently creating a [akka.util.ByteString](ByteString.html).

A mutable builder for efficiently creating a [akka.util.ByteString](ByteString.html).

The created ByteString is not automatically compacted.
5. [**](../../akka/util/ClassLoaderObjectInputStream.html "Permalink")  class [ClassLoaderObjectInputStream](ClassLoaderObjectInputStream.html "ClassLoaderObjectInputStream tries to utilize the provided ClassLoader to load Classes and falls back to ObjectInputStreams resolver.") extends [ObjectInputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectInputStream.html#java.io.ObjectInputStream)ClassLoaderObjectInputStream tries to utilize the provided ClassLoader to load Classes and falls
back to ObjectInputStreams resolver.
6. [**](../../akka/util/CompactByteString.html "Permalink") sealed abstract  class [CompactByteString](CompactByteString.html "A compact ByteString.") extends [ByteString](ByteString.html) with SerializableA compact ByteString.

A compact ByteString.

The ByteString is guarantied to be contiguous in memory and to use only
as much memory as required for its contents.
7. [**](../../akka/util/ConcurrentMultiMap.html "Permalink")  class [ConcurrentMultiMap](ConcurrentMultiMap.html "An implementation of a ConcurrentMultiMap Adds/remove is serialized over the specified key Reads are fully concurrent <-- el-cheapo")\[K, V] extends [Index](Index.html)\[K, V]An implementation of a ConcurrentMultiMap
Adds/remove is serialized over the specified key
Reads are fully concurrent \<\-\- el\-cheapo
8. [**](../../akka/util/Index.html "Permalink")  class [Index](Index.html "An implementation of a ConcurrentMultiMap Adds/remove is serialized over the specified key Reads are fully concurrent <-- el-cheapo")\[K, V] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An implementation of a ConcurrentMultiMap
Adds/remove is serialized over the specified key
Reads are fully concurrent \<\-\- el\-cheapo
9. [**](../../akka/util/ManifestInfo.html "Permalink") final  class [ManifestInfo](ManifestInfo.html "Utility that extracts ManifestInfo#Version information from META-INF/MANIFEST.MF in jar files on the classpath.") extends [Extension](../actor/Extension.html)Utility that extracts [ManifestInfo\#Version](ManifestInfo$$Version.html) information from META\-INF/MANIFEST.MF in jar files on the classpath.

Utility that extracts [ManifestInfo\#Version](ManifestInfo$$Version.html) information from META\-INF/MANIFEST.MF in jar files on the classpath.
Note that versions can only be found in ordinary jar files, for example not in "fat jars' assembled from
many jar files.
10. [**](../../akka/util/MessageBuffer.html "Permalink") final  class [MessageBuffer](MessageBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A non thread safe mutable message buffer that can be used to buffer messages inside actors.
11. [**](../../akka/util/MessageBufferMap.html "Permalink") final  class [MessageBufferMap](MessageBufferMap.html "A non thread safe mutable message buffer map that can be used to buffer messages inside actors.")\[I] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A non thread safe mutable message buffer map that can be used to buffer messages inside actors.

A non thread safe mutable message buffer map that can be used to buffer messages inside actors.

I(Id type)
12. [**](../../akka/util/NanoTimeTokenBucket.html "Permalink") final  class [NanoTimeTokenBucket](NanoTimeTokenBucket.html "Default implementation of TokenBucket that uses System.nanoTime as the time source.") extends TokenBucketDefault implementation of TokenBucket that uses `System.nanoTime` as the time source.
13. [**](../../akka/util/PriorityQueueStabilizer.html "Permalink")  trait [PriorityQueueStabilizer](PriorityQueueStabilizer.html "PriorityQueueStabilizer wraps a priority queue so that it respects FIFO for elements of equal priority.")\[E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)] extends [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E]PriorityQueueStabilizer wraps a priority queue so that it respects FIFO for elements of equal priority.
14. [**](../../akka/util/ReentrantGuard.html "Permalink") final  class [ReentrantGuard](ReentrantGuard.html) extends [ReentrantLock](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/ReentrantLock.html#java.util.concurrent.locks.ReentrantLock)
15. [**](../../akka/util/StablePriorityBlockingQueue.html "Permalink")  class [StablePriorityBlockingQueue](StablePriorityBlockingQueue.html "StablePriorityBlockingQueue is a blocking priority queue that preserves order for elements of equal priority.")\[E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)] extends [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E] with [PriorityQueueStabilizer](PriorityQueueStabilizer.html)\[E]StablePriorityBlockingQueue is a blocking priority queue that preserves order for elements of equal priority.
16. [**](../../akka/util/StablePriorityQueue.html "Permalink")  class [StablePriorityQueue](StablePriorityQueue.html "StablePriorityQueue is a priority queue that preserves order for elements of equal priority.")\[E \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)] extends [AbstractQueue](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/AbstractQueue.html#java.util.AbstractQueue)\[E] with [PriorityQueueStabilizer](PriorityQueueStabilizer.html)\[E]StablePriorityQueue is a priority queue that preserves order for elements of equal priority.
17. [**](../../akka/util/Subclassification.html "Permalink")  trait [Subclassification](Subclassification.html "Typeclass which describes a classification hierarchy.")\[K] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Typeclass which describes a classification hierarchy.

Typeclass which describes a classification hierarchy. Observe the contract between `isEqual` and `isSubclass`!
18. [**](../../akka/util/Switch.html "Permalink")  class [Switch](Switch.html "An atomic switch that can be either on or off") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An atomic switch that can be either on or off
19. [**](../../akka/util/Timeout.html "Permalink")  case class [Timeout](Timeout.html)(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
20. [**](../../akka/util/TypedMultiMap.html "Permalink")  class [TypedMultiMap](TypedMultiMap.html "An immutable multi-map that expresses the value type as a type function of the key type.")\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), K\[\_ \<: T]] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An immutable multi\-map that expresses the value type as a type function of the key
type.

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
21. [**](../../akka/util/UUIDComparator.html "Permalink")  class [UUIDComparator](UUIDComparator.html "Scala implementation of UUIDComparator in https://github.com/cowtowncoder/java-uuid-generator Apache License 2.0.") extends [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID)]Scala implementation of UUIDComparator in
https://github.com/cowtowncoder/java\-uuid\-generator
Apache License 2\.0\.
22. [**](../../akka/util/Unsafe.html "Permalink") final  class [Unsafe](Unsafe.html "INTERNAL API") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API

INTERNAL API

Annotations@[InternalApi](../annotation/InternalApi.html)()
23. [**](../../akka/util/Version.html "Permalink") final  class [Version](Version.html "Comparable version information.") extends [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[[Version](Version.html)]Comparable version information.

Comparable version information.

The typical convention is to use 3 digit version numbers `major.minor.patch`,
but 1 or two digits are also supported.

If no `.` is used it is interpreted as a single digit version number or as
plain alphanumeric if it couldn't be parsed as a number.

It may also have a qualifier at the end for 2 or 3 digit version numbers such as "1\.2\-RC1".
For 1 digit with qualifier, 1\-RC1, it is interpreted as plain alphanumeric.

It has support for https://github.com/dwijnand/sbt\-dynver format with `+` or
`-` separator. The number of commits from the tag is handled as a numeric part.
For example `1.0.0+3-73475dce26` is less than `1.0.0+10-ed316bd024` (3 \< 10\).
24. [**](../../akka/util/WallClock.html "Permalink")  trait [WallClock](WallClock.html "A time source.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A time source.

A time source.

Annotations@[ApiMayChange](../annotation/ApiMayChange.html)()
### Value Members

1. [**](../../akka/util/BoxedType$.html "Permalink")  object [BoxedType](BoxedType$.html)
2. [**](../../akka/util/ByteIterator$.html "Permalink")  object [ByteIterator](ByteIterator$.html)
3. [**](../../akka/util/ByteString$.html "Permalink")  object [ByteString](ByteString$.html)
4. [**](../../akka/util/CompactByteString$.html "Permalink")  object [CompactByteString](CompactByteString$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
5. [**](../../akka/util/HashCode$.html "Permalink")  object [HashCode](HashCode$.html "Set of methods which allow easy implementation of hashCode.")Set of methods which allow easy implementation of `hashCode`.

Set of methods which allow easy implementation of `hashCode`.

Example:

```

 override def hashCode: Int = {
   var result = HashCode.SEED
   //collect the contributions of various fields
   result = HashCode.hash(result, fPrimitive)
   result = HashCode.hash(result, fObject)
   result = HashCode.hash(result, fArray)
   result
 }

```
6. [**](../../akka/util/Helpers$.html "Permalink")  object [Helpers](Helpers$.html)
7. [**](../../akka/util/LineNumbers$.html "Permalink")  object [LineNumbers](LineNumbers$.html "This is a minimized byte-code parser that concentrates exclusively on line numbers and source file extraction.")This is a minimized byte\-code parser that concentrates exclusively on line
numbers and source file extraction.

This is a minimized byte\-code parser that concentrates exclusively on line
numbers and source file extraction. It works for all normal classes up to
format 52:0 (JDK8\), and it also works for Lambdas that are Serializable. The
latter restriction is due to the fact that the proxy object generated by
LambdaMetafactory otherwise contains no information about which method backs
this particular lambda (and there might be multiple defined within a single
class).
8. [**](../../akka/util/ManifestInfo$.html "Permalink")  object [ManifestInfo](ManifestInfo$.html "Akka extension that extracts ManifestInfo.Version information from META-INF/MANIFEST.MF in jar files on the classpath of the ClassLoader of the ActorSystem.") extends [ExtensionId](../actor/ExtensionId.html)\[[ManifestInfo](ManifestInfo.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)Akka extension that extracts [ManifestInfo.Version](ManifestInfo$$Version.html) information from META\-INF/MANIFEST.MF in jar files
on the classpath of the `ClassLoader` of the `ActorSystem`.
9. [**](../../akka/util/MessageBuffer$.html "Permalink")  object [MessageBuffer](MessageBuffer$.html)
10. [**](../../akka/util/PriorityQueueStabilizer$.html "Permalink")  object [PriorityQueueStabilizer](PriorityQueueStabilizer$.html)
11. [**](../../akka/util/Timeout$.html "Permalink")  object [Timeout](Timeout$.html "A Timeout is a wrapper on top of Duration to be more specific about what the duration means.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)A Timeout is a wrapper on top of Duration to be more specific about what the duration means.
12. [**](../../akka/util/TypedMultiMap$.html "Permalink")  object [TypedMultiMap](TypedMultiMap$.html)
13. [**](../../akka/util/UUIDComparator$.html "Permalink")  object [UUIDComparator](UUIDComparator$.html)
14. [**](../../akka/util/Version$.html "Permalink")  object [Version](Version$.html)
15. [**](../../akka/util/WallClock$.html "Permalink")  object [WallClock](WallClock$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/current/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/current/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/current/akka/event/index.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/io/index.html
- https://doc.akka.io/api/akka-core/current/akka/japi/index.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/current/akka/pki/index.html
- https://doc.akka.io/api/akka-core/current/akka/remote/index.html
- https://doc.akka.io/api/akka-core/current/akka/routing/index.html
- https://doc.akka.io/api/akka-core/current/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/current/akka/stream/index.html
- https://doc.akka.io/api/akka-core/current/akka/testkit/index.html
- https://doc.akka.io/api/akka-core/current/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/api/akka-core/current/akka/util/BoxedType$.html
- https://doc.akka.io/api/akka-core/current/akka/util/ByteIterator$.html
- https://doc.akka.io/api/akka-core/current/akka/util/ByteIterator.html
- https://doc.akka.io/api/akka-core/current/akka/util/ByteString$.html
- https://doc.akka.io/api/akka-core/current/akka/util/ByteString.html
- https://doc.akka.io/api/akka-core/current/akka/util/ByteStringBuilder.html
- https://doc.akka.io/api/akka-core/current/akka/util/ClassLoaderObjectInputStream.html
- https://doc.akka.io/api/akka-core/current/akka/util/CompactByteString$.html
- https://doc.akka.io/api/akka-core/current/akka/util/CompactByteString.html
- https://doc.akka.io/api/akka-core/current/akka/util/ConcurrentMultiMap.html
- https://doc.akka.io/api/akka-core/current/akka/util/HashCode$.html
- https://doc.akka.io/api/akka-core/current/akka/util/Helpers$.html
- https://doc.akka.io/api/akka-core/current/akka/util/Index.html
- https://doc.akka.io/api/akka-core/current/akka/util/LineNumbers$.html
- https://doc.akka.io/api/akka-core/current/akka/util/ManifestInfo$$Version.html
- https://doc.akka.io/api/akka-core/current/akka/util/ManifestInfo$.html
- https://doc.akka.io/api/akka-core/current/akka/util/ManifestInfo.html
- https://doc.akka.io/api/akka-core/current/akka/util/MessageBuffer$.html
- https://doc.akka.io/api/akka-core/current/akka/util/MessageBuffer.html
- https://doc.akka.io/api/akka-core/current/akka/util/MessageBufferMap.html
- https://doc.akka.io/api/akka-core/current/akka/util/NanoTimeTokenBucket.html
- https://doc.akka.io/api/akka-core/current/akka/util/PriorityQueueStabilizer$.html
- https://doc.akka.io/api/akka-core/current/akka/util/PriorityQueueStabilizer.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/util/index.html](https://doc.akka.io/api/akka-core/current/akka/util/index.html)*