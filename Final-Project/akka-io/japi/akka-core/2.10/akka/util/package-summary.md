---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:13:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/util/package-summary.html
title: akka.util
---

# akka.util

## Content

# Package akka.util

- Interface Summary 
| Interface | Description |
| [ByteString.Companion](ByteString.Companion.html "interface in akka.util") |  |
| --- | --- |
| [Clock](Clock.html "interface in akka.util") | INTERNAL API |
| [LineNumbers.Result](LineNumbers.Result.html "interface in akka.util") |  |
| [PriorityQueueStabilizer](PriorityQueueStabilizer.html "interface in akka.util")\<E\> | PriorityQueueStabilizer wraps a priority queue so that it respects FIFO for elements of equal priority. |
| [Subclassification](Subclassification.html "interface in akka.util")\<K\> | Typeclass which describes a classification hierarchy. |
| [WallClock](WallClock.html "interface in akka.util") | A time source. |
- Class Summary 
| Class | Description |
| [Base62](Base62.html "class in akka.util") | Base62 encoder/decoder. |
| --- | --- |
| [Base62$](Base62$.html "class in akka.util") | Base62 encoder/decoder. |
| [BoundedBlockingQueue](BoundedBlockingQueue.html "class in akka.util")\<E\> | BoundedBlockingQueue wraps any Queue and turns the result into a BlockingQueue with a limited capacity. |
| [BoxedType](BoxedType.html "class in akka.util") |  |
| [BoxedType$](BoxedType$.html "class in akka.util") |  |
| [ByteIterator](ByteIterator.html "class in akka.util") | An iterator over a ByteString. |
| [ByteIterator.ByteArrayIterator](ByteIterator.ByteArrayIterator.html "class in akka.util") |  |
| [ByteIterator.ByteArrayIterator$](ByteIterator.ByteArrayIterator$.html "class in akka.util") |  |
| [ByteIterator.MultiByteArrayIterator](ByteIterator.MultiByteArrayIterator.html "class in akka.util") |  |
| [ByteIterator.MultiByteArrayIterator$](ByteIterator.MultiByteArrayIterator$.html "class in akka.util") |  |
| [ByteIterator$](ByteIterator$.html "class in akka.util") |  |
| [ByteString](ByteString.html "class in akka.util") | A rope\-like immutable data structure containing bytes. |
| [ByteString.ByteString1](ByteString.ByteString1.html "class in akka.util") | An unfragmented ByteString. |
| [ByteString.ByteString1$](ByteString.ByteString1$.html "class in akka.util") | INTERNAL API: ByteString backed by exactly one array, with start / end markers |
| [ByteString.ByteString1C](ByteString.ByteString1C.html "class in akka.util") | A compact (unsliced) and unfragmented ByteString, implementation of ByteString1C. |
| [ByteString.ByteString1C$](ByteString.ByteString1C$.html "class in akka.util") |  |
| [ByteString.ByteStrings](ByteString.ByteStrings.html "class in akka.util") | A ByteString with 2 or more fragments. |
| [ByteString.ByteStrings$](ByteString.ByteStrings$.html "class in akka.util") |  |
| [ByteString.Companion$](ByteString.Companion$.html "class in akka.util") |  |
| [ByteString$](ByteString$.html "class in akka.util") |  |
| [ByteStringBuilder](ByteStringBuilder.html "class in akka.util") | A mutable builder for efficiently creating a [`ByteString`](ByteString.html "class in akka.util"). |
| [ClassLoaderObjectInputStream](ClassLoaderObjectInputStream.html "class in akka.util") | ClassLoaderObjectInputStream tries to utilize the provided ClassLoader to load Classes and falls  back to ObjectInputStreams resolver. |
| [Clock$](Clock$.html "class in akka.util") | INTERNAL API |
| [Collections](Collections.html "class in akka.util") | INTERNAL API |
| [Collections.EmptyImmutableSeq$](Collections.EmptyImmutableSeq$.html "class in akka.util") |  |
| [Collections.PartialImmutableValuesIterable](Collections.PartialImmutableValuesIterable.html "class in akka.util")\<From,​To\> |  |
| [Collections$](Collections$.html "class in akka.util") | INTERNAL API |
| [CompactByteString](CompactByteString.html "class in akka.util") | A compact ByteString. |
| [CompactByteString$](CompactByteString$.html "class in akka.util") |  |
| [ConcurrentMultiMap](ConcurrentMultiMap.html "class in akka.util")\<K,​V\> | An implementation of a ConcurrentMultiMap  Adds/remove is serialized over the specified key  Reads are fully concurrent \<\-\- el\-cheapo |
| [ConstantFun](ConstantFun.html "class in akka.util") | INTERNAL API |
| [ConstantFun$](ConstantFun$.html "class in akka.util") | INTERNAL API |
| [ErrorMessages](ErrorMessages.html "class in akka.util") | INTERNAL API |
| [ErrorMessages$](ErrorMessages$.html "class in akka.util") | INTERNAL API |
| [FastFrequencySketch$](FastFrequencySketch$.html "class in akka.util") | INTERNAL API |
| [FrequencyList$](FrequencyList$.html "class in akka.util") | INTERNAL API |
| [FrequencySketch$](FrequencySketch$.html "class in akka.util") | INTERNAL API |
| [FrequencySketchUtil](FrequencySketchUtil.html "class in akka.util") | INTERNAL API |
| [FrequencySketchUtil$](FrequencySketchUtil$.html "class in akka.util") | INTERNAL API |
| [HashCode](HashCode.html "class in akka.util") | Set of methods which allow easy implementation of `hashCode`. |
| [HashCode$](HashCode$.html "class in akka.util") | Set of methods which allow easy implementation of `hashCode`. |
| [Helpers](Helpers.html "class in akka.util") |  |
| [Helpers.ConfigOps$](Helpers.ConfigOps$.html "class in akka.util") |  |
| [Helpers.Requiring](Helpers.Requiring.html "class in akka.util")\<A\> | Implicit class providing `requiring` methods. |
| [Helpers.Requiring$](Helpers.Requiring$.html "class in akka.util") |  |
| [Helpers$](Helpers$.html "class in akka.util") |  |
| [ImmutableIntMap$](ImmutableIntMap$.html "class in akka.util") | INTERNAL API |
| [Index](Index.html "class in akka.util")\<K,​V\> | An implementation of a ConcurrentMultiMap  Adds/remove is serialized over the specified key  Reads are fully concurrent \<\-\- el\-cheapo |
| [JavaVersion](JavaVersion.html "class in akka.util") | INTERNAL API |
| [JavaVersion$](JavaVersion$.html "class in akka.util") | INTERNAL API |
| [LineNumbers](LineNumbers.html "class in akka.util") | This is a minimized byte\-code parser that concentrates exclusively on line  numbers and source file extraction. |
| [LineNumbers.NoSourceInfo$](LineNumbers.NoSourceInfo$.html "class in akka.util") |  |
| [LineNumbers.SourceFile](LineNumbers.SourceFile.html "class in akka.util") |  |
| [LineNumbers.SourceFile$](LineNumbers.SourceFile$.html "class in akka.util") |  |
| [LineNumbers.SourceFileLines](LineNumbers.SourceFileLines.html "class in akka.util") |  |
| [LineNumbers.SourceFileLines$](LineNumbers.SourceFileLines$.html "class in akka.util") |  |
| [LineNumbers.UnknownSourceFormat](LineNumbers.UnknownSourceFormat.html "class in akka.util") |  |
| [LineNumbers.UnknownSourceFormat$](LineNumbers.UnknownSourceFormat$.html "class in akka.util") |  |
| [LineNumbers$](LineNumbers$.html "class in akka.util") | This is a minimized byte\-code parser that concentrates exclusively on line  numbers and source file extraction. |
| [ManifestInfo](ManifestInfo.html "class in akka.util") | Utility that extracts `ManifestInfo#Version` information from META\-INF/MANIFEST.MF in jar files on the classpath. |
| [ManifestInfo.Version](ManifestInfo.Version.html "class in akka.util") | Comparable version information |
| [ManifestInfo$](ManifestInfo$.html "class in akka.util") | Akka extension that extracts [`ManifestInfo.Version`](ManifestInfo.Version.html "class in akka.util") information from META\-INF/MANIFEST.MF in jar files  on the classpath of the `ClassLoader` of the `ActorSystem`. |
| [MessageBuffer](MessageBuffer.html "class in akka.util") | A non thread safe mutable message buffer that can be used to buffer messages inside actors. |
| [MessageBuffer$](MessageBuffer$.html "class in akka.util") |  |
| [MessageBufferMap](MessageBufferMap.html "class in akka.util")\<I\> | A non thread safe mutable message buffer map that can be used to buffer messages inside actors. |
| [NanoTimeTokenBucket](NanoTimeTokenBucket.html "class in akka.util") | Default implementation of `TokenBucket` that uses `System.nanoTime` as the time source. |
| [OptionVal$](OptionVal$.html "class in akka.util") | INTERNAL API |
| [PrettyByteString](PrettyByteString.html "class in akka.util") | INTERNAL API: ByteString pretty printer, based on Johanes Rudolph's implementation from:  https://github.com/jrudolph/akka/commit/c889dddf37c8635c365a79a391eb18a709f36773\#diff\-947cbf07996eeb823cb9850cc2e81126R19 |
| [PrettyByteString.asPretty](PrettyByteString.asPretty.html "class in akka.util") |  |
| [PrettyByteString$](PrettyByteString$.html "class in akka.util") | INTERNAL API: ByteString pretty printer, based on Johanes Rudolph's implementation from:  https://github.com/jrudolph/akka/commit/c889dddf37c8635c365a79a391eb18a709f36773\#diff\-947cbf07996eeb823cb9850cc2e81126R19 |
| [PrettyDuration](PrettyDuration.html "class in akka.util") | INTERNAL API |
| [PrettyDuration.PrettyPrintableDuration](PrettyDuration.PrettyPrintableDuration.html "class in akka.util") |  |
| [PrettyDuration.PrettyPrintableDuration$](PrettyDuration.PrettyPrintableDuration$.html "class in akka.util") |  |
| [PrettyDuration$](PrettyDuration$.html "class in akka.util") | INTERNAL API |
| [PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")\<E\> |  |
| [PriorityQueueStabilizer.WrappedElementComparator](PriorityQueueStabilizer.WrappedElementComparator.html "class in akka.util")\<E\> |  |
| [PriorityQueueStabilizer$](PriorityQueueStabilizer$.html "class in akka.util") |  |
| [RecencyList$](RecencyList$.html "class in akka.util") | INTERNAL API |
| [ReentrantGuard](ReentrantGuard.html "class in akka.util") |  |
| [Reflect](Reflect.html "class in akka.util") | Collection of internal reflection utilities which may or may not be  available (most services specific to HotSpot, but fails gracefully). |
| [Reflect$](Reflect$.html "class in akka.util") | Collection of internal reflection utilities which may or may not be  available (most services specific to HotSpot, but fails gracefully). |
| [SegmentedRecencyList$](SegmentedRecencyList$.html "class in akka.util") | INTERNAL API |
| [SerializedSuspendableExecutionContext$](SerializedSuspendableExecutionContext$.html "class in akka.util") |  |
| [StablePriorityBlockingQueue](StablePriorityBlockingQueue.html "class in akka.util")\<E\> | StablePriorityBlockingQueue is a blocking priority queue that preserves order for elements of equal priority. |
| [StablePriorityQueue](StablePriorityQueue.html "class in akka.util")\<E\> | StablePriorityQueue is a priority queue that preserves order for elements of equal priority. |
| [SubclassifiedIndex$](SubclassifiedIndex$.html "class in akka.util") |  |
| [Switch](Switch.html "class in akka.util") | An atomic switch that can be either on or off |
| [Switch$](Switch$.html "class in akka.util") |  |
| [Timeout](Timeout.html "class in akka.util") |  |
| [Timeout$](Timeout$.html "class in akka.util") | A Timeout is a wrapper on top of Duration to be more specific about what the duration means. |
| [TopologicalSort](TopologicalSort.html "class in akka.util") | INTERNAL API |
| [TopologicalSort$](TopologicalSort$.html "class in akka.util") | INTERNAL API |
| [TypedMultiMap](TypedMultiMap.html "class in akka.util")\<T,​K\> | An immutable multi\-map that expresses the value type as a type function of the key  type. |
| [TypedMultiMap$](TypedMultiMap$.html "class in akka.util") |  |
| [Unsafe](Unsafe.html "class in akka.util") | INTERNAL API |
| [UUIDComparator](UUIDComparator.html "class in akka.util") | Scala implementation of UUIDComparator in  https://github.com/cowtowncoder/java\-uuid\-generator  Apache License 2\.0\. |
| [UUIDComparator$](UUIDComparator$.html "class in akka.util") |  |
| [Version](Version.html "class in akka.util") | Comparable version information. |
| [Version$](Version$.html "class in akka.util") |  |
| [WallClock$](WallClock$.html "class in akka.util") |  |
| [WildcardIndex$](WildcardIndex$.html "class in akka.util") |  |
| [WildcardTree$](WildcardTree$.html "class in akka.util") | INTERNAL API |
- Exception Summary 
| Exception | Description |
| [Base62\.Base62EncodingException](Base62.Base62EncodingException.html "class in akka.util") |  |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/util/Base62$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Base62.Base62EncodingException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Base62.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/BoxedType$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/BoxedType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.ByteArrayIterator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.ByteArrayIterator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.MultiByteArrayIterator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.MultiByteArrayIterator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteIterator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.ByteString1$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.ByteString1.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.ByteString1C$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.ByteString1C.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.ByteStrings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.ByteStrings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.Companion$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.Companion.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteStringBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ClassLoaderObjectInputStream.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Clock$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Clock.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Collections$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Collections.EmptyImmutableSeq$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Collections.PartialImmutableValuesIterable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Collections.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/CompactByteString$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/CompactByteString.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ConcurrentMultiMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ConstantFun$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ConstantFun.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ErrorMessages$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ErrorMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/FastFrequencySketch$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/FrequencyList$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/FrequencySketch$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/FrequencySketchUtil$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/FrequencySketchUtil.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/HashCode$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/HashCode.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Helpers$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Helpers.ConfigOps$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Helpers.Requiring$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Helpers.Requiring.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Helpers.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ImmutableIntMap$.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/util/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/util/package-summary.html)*