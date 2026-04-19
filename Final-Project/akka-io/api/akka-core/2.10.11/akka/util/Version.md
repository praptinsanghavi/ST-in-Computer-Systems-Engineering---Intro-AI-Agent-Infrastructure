---
description: Akka 2.10.11 - akka.util.Version
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:39:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/Version.html
title: Akka 2.10.11 - akka.util.Version
---

# Akka 2.10.11 - akka.util.Version

> **Summary:** Akka 2.10.11 - akka.util.Version

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
- Version
- [WallClock](WallClock.html "A time source.")
[c](Version$.html "See companion object")[akka](../index.html).[util](index.html)

# [Version](Version$.html "See companion object")[**](../../akka/util/Version.html "Permalink")

### Companion [object Version](Version$.html "See companion object")

#### final  class Version extends [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[Version]

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

Source[Version.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/util/Version.scala#L36)Linear Supertypes[Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[Version], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Version
2. Comparable
3. AnyRef
4. Any
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

1. [**](../../akka/util/Version.html#<init>(version:String):akka.util.Version "Permalink")  new Version(version: String)
### Value Members

1. [**](../../akka/util/Version.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/Version.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/Version.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Version toany2stringadd\[Version] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/Version.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Version, B)ImplicitThis member is added by an implicit conversion from Version toArrowAssoc\[Version] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/Version.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/Version.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/util/Version.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/util/Version.html#compareTo(other:akka.util.Version):Int "Permalink")  def compareTo(other: Version): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesVersion → Comparable
9. [**](../../akka/util/Version.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Version) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): VersionImplicitThis member is added by an implicit conversion from Version toEnsuring\[Version] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/util/Version.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Version) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): VersionImplicitThis member is added by an implicit conversion from Version toEnsuring\[Version] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/util/Version.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): VersionImplicitThis member is added by an implicit conversion from Version toEnsuring\[Version] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/util/Version.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): VersionImplicitThis member is added by an implicit conversion from Version toEnsuring\[Version] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/util/Version.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/util/Version.html#equals(o:Any):Boolean "Permalink")  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesVersion → AnyRef → Any
15. [**](../../akka/util/Version.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/util/Version.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesVersion → AnyRef → Any
17. [**](../../akka/util/Version.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/util/Version.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/util/Version.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/util/Version.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/util/Version.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/util/Version.html#toString():String "Permalink")  def toString(): StringDefinition ClassesVersion → AnyRef → Any
23. [**](../../akka/util/Version.html#version:String "Permalink")  val version: String
24. [**](../../akka/util/Version.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/util/Version.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/util/Version.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/Version.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/Version.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Version toStringFormat\[Version] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/Version.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Version, B)ImplicitThis member is added by an implicit conversion from Version toArrowAssoc\[Version] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[Version]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromVersion to any2stringadd\[Version]

### Inherited by implicit conversion StringFormat fromVersion to StringFormat\[Version]

### Inherited by implicit conversion Ensuring fromVersion to Ensuring\[Version]

### Inherited by implicit conversion ArrowAssoc fromVersion to ArrowAssoc\[Version]

### Ungrouped

## Related Pages (Internal Links)

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
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/util/Version.html](https://doc.akka.io/api/akka-core/2.10.11/akka/util/Version.html)*