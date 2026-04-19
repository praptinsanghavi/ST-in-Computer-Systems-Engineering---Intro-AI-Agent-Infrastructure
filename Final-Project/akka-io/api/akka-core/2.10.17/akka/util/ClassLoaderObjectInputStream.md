---
description: Akka 2.10.17 - akka.util.ClassLoaderObjectInputStream
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:23:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/ClassLoaderObjectInputStream.html
title: Akka 2.10.17 - akka.util.ClassLoaderObjectInputStream
---

# Akka 2.10.17 - akka.util.ClassLoaderObjectInputStream

> **Summary:** Akka 2.10.17 - akka.util.ClassLoaderObjectInputStream

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
- ClassLoaderObjectInputStream
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

# ClassLoaderObjectInputStream[**](../../akka/util/ClassLoaderObjectInputStream.html "Permalink")

### 

#### class ClassLoaderObjectInputStream extends [ObjectInputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectInputStream.html#java.io.ObjectInputStream)

ClassLoaderObjectInputStream tries to utilize the provided ClassLoader to load Classes and falls
back to ObjectInputStreams resolver.

Source[ClassLoaderObjectInputStream.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/ClassLoaderObjectInputStream.scala#L16)Linear Supertypes[ObjectInputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectInputStream.html#java.io.ObjectInputStream), [ObjectStreamConstants](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectStreamConstants.html#java.io.ObjectStreamConstants), [ObjectInput](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectInput.html#java.io.ObjectInput), [DataInput](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/DataInput.html#java.io.DataInput), [InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html#java.io.InputStream), [Closeable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Closeable.html#java.io.Closeable), [AutoCloseable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/AutoCloseable.html#java.lang.AutoCloseable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClassLoaderObjectInputStream
2. ObjectInputStream
3. ObjectStreamConstants
4. ObjectInput
5. DataInput
6. InputStream
7. Closeable
8. AutoCloseable
9. AnyRef
10. Any
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

1. [**](../../akka/util/ClassLoaderObjectInputStream.html#<init>(classLoader:ClassLoader,is:java.io.InputStream):akka.util.ClassLoaderObjectInputStream "Permalink")  new ClassLoaderObjectInputStream(classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader), is: [InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html#java.io.InputStream))classLoader\- the ClassLoader which is to be used primarily

is\- the InputStream that is wrapped
### Value Members

1. [**](../../akka/util/ClassLoaderObjectInputStream.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/ClassLoaderObjectInputStream.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/ClassLoaderObjectInputStream.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClassLoaderObjectInputStream toany2stringadd\[ClassLoaderObjectInputStream] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/ClassLoaderObjectInputStream.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClassLoaderObjectInputStream, B)ImplicitThis member is added by an implicit conversion from ClassLoaderObjectInputStream toArrowAssoc\[ClassLoaderObjectInputStream] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/ClassLoaderObjectInputStream.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/ClassLoaderObjectInputStream.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/util/ClassLoaderObjectInputStream.html#available():Int "Permalink")  def available(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesObjectInputStream → ObjectInput → InputStreamAnnotations@throws(classOf\[java.io.IOException])
8. [**](../../akka/util/ClassLoaderObjectInputStream.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/util/ClassLoaderObjectInputStream.html#close():Unit "Permalink")  def close(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesObjectInputStream → ObjectInput → InputStream → Closeable → AutoCloseableAnnotations@throws(classOf\[java.io.IOException])
10. [**](../../akka/util/ClassLoaderObjectInputStream.html#defaultReadObject():Unit "Permalink")  def defaultReadObject(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesObjectInputStreamAnnotations@throws(classOf\[java.io.IOException]) @throws(classOf\[java.lang.ClassNotFoundException])
11. [**](../../akka/util/ClassLoaderObjectInputStream.html#enableResolveObject(x$1:Boolean):Boolean "Permalink")  def enableResolveObject(arg0: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected\[java.io] Definition ClassesObjectInputStreamAnnotations@throws(classOf\[java.lang.SecurityException])
12. [**](../../akka/util/ClassLoaderObjectInputStream.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClassLoaderObjectInputStream) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClassLoaderObjectInputStreamImplicitThis member is added by an implicit conversion from ClassLoaderObjectInputStream toEnsuring\[ClassLoaderObjectInputStream] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/util/ClassLoaderObjectInputStream.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClassLoaderObjectInputStream) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClassLoaderObjectInputStreamImplicitThis member is added by an implicit conversion from ClassLoaderObjectInputStream toEnsuring\[ClassLoaderObjectInputStream] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/util/ClassLoaderObjectInputStream.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClassLoaderObjectInputStreamImplicitThis member is added by an implicit conversion from ClassLoaderObjectInputStream toEnsuring\[ClassLoaderObjectInputStream] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/util/ClassLoaderObjectInputStream.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClassLoaderObjectInputStreamImplicitThis member is added by an implicit conversion from ClassLoaderObjectInputStream toEnsuring\[ClassLoaderObjectInputStream] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/util/ClassLoaderObjectInputStream.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/util/ClassLoaderObjectInputStream.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../akka/util/ClassLoaderObjectInputStream.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/util/ClassLoaderObjectInputStream.html#getObjectInputFilter():java.io.ObjectInputFilter "Permalink") final  def getObjectInputFilter(): [ObjectInputFilter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectInputFilter.html#java.io.ObjectInputFilter)Definition ClassesObjectInputStream
20. [**](../../akka/util/ClassLoaderObjectInputStream.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/util/ClassLoaderObjectInputStream.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../akka/util/ClassLoaderObjectInputStream.html#mark(x$1:Int):Unit "Permalink")  def mark(arg0: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesInputStream
23. [**](../../akka/util/ClassLoaderObjectInputStream.html#markSupported():Boolean "Permalink")  def markSupported(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesInputStream
24. [**](../../akka/util/ClassLoaderObjectInputStream.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../akka/util/ClassLoaderObjectInputStream.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/util/ClassLoaderObjectInputStream.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/util/ClassLoaderObjectInputStream.html#read(x$1:Array[Byte],x$2:Int,x$3:Int):Int "Permalink")  def read(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), arg2: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesObjectInputStream → ObjectInput → InputStreamAnnotations@throws(classOf\[java.io.IOException])
28. [**](../../akka/util/ClassLoaderObjectInputStream.html#read():Int "Permalink")  def read(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesObjectInputStream → ObjectInput → InputStreamAnnotations@throws(classOf\[java.io.IOException])
29. [**](../../akka/util/ClassLoaderObjectInputStream.html#read(x$1:Array[Byte]):Int "Permalink")  def read(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesInputStreamAnnotations@throws(classOf\[java.io.IOException])
30. [**](../../akka/util/ClassLoaderObjectInputStream.html#readAllBytes():Array[Byte] "Permalink")  def readAllBytes(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesInputStreamAnnotations@throws(classOf\[java.io.IOException])
31. [**](../../akka/util/ClassLoaderObjectInputStream.html#readBoolean():Boolean "Permalink")  def readBoolean(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
32. [**](../../akka/util/ClassLoaderObjectInputStream.html#readByte():Byte "Permalink")  def readByte(): [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
33. [**](../../akka/util/ClassLoaderObjectInputStream.html#readChar():Char "Permalink")  def readChar(): [Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
34. [**](../../akka/util/ClassLoaderObjectInputStream.html#readClassDescriptor():java.io.ObjectStreamClass "Permalink")  def readClassDescriptor(): [ObjectStreamClass](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectStreamClass.html#java.io.ObjectStreamClass)Attributesprotected\[java.io] Definition ClassesObjectInputStreamAnnotations@throws(classOf\[java.io.IOException]) @throws(classOf\[java.lang.ClassNotFoundException])
35. [**](../../akka/util/ClassLoaderObjectInputStream.html#readDouble():Double "Permalink")  def readDouble(): [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
36. [**](../../akka/util/ClassLoaderObjectInputStream.html#readFields():java.io.ObjectInputStream.GetField "Permalink")  def readFields(): GetFieldDefinition ClassesObjectInputStreamAnnotations@throws(classOf\[java.io.IOException]) @throws(classOf\[java.lang.ClassNotFoundException])
37. [**](../../akka/util/ClassLoaderObjectInputStream.html#readFloat():Float "Permalink")  def readFloat(): [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
38. [**](../../akka/util/ClassLoaderObjectInputStream.html#readFully(x$1:Array[Byte],x$2:Int,x$3:Int):Unit "Permalink")  def readFully(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), arg2: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
39. [**](../../akka/util/ClassLoaderObjectInputStream.html#readFully(x$1:Array[Byte]):Unit "Permalink")  def readFully(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
40. [**](../../akka/util/ClassLoaderObjectInputStream.html#readInt():Int "Permalink")  def readInt(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
41. [**](../../akka/util/ClassLoaderObjectInputStream.html#readLong():Long "Permalink")  def readLong(): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
42. [**](../../akka/util/ClassLoaderObjectInputStream.html#readNBytes(x$1:Array[Byte],x$2:Int,x$3:Int):Int "Permalink")  def readNBytes(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)], arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), arg2: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesInputStreamAnnotations@throws(classOf\[java.io.IOException])
43. [**](../../akka/util/ClassLoaderObjectInputStream.html#readNBytes(x$1:Int):Array[Byte] "Permalink")  def readNBytes(arg0: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition ClassesInputStreamAnnotations@throws(classOf\[java.io.IOException])
44. [**](../../akka/util/ClassLoaderObjectInputStream.html#readObject():Object "Permalink") final  def readObject(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesObjectInputStream → ObjectInputAnnotations@throws(classOf\[java.io.IOException]) @throws(classOf\[java.lang.ClassNotFoundException])
45. [**](../../akka/util/ClassLoaderObjectInputStream.html#readObjectOverride():Object "Permalink")  def readObjectOverride(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[java.io] Definition ClassesObjectInputStreamAnnotations@throws(classOf\[java.io.IOException]) @throws(classOf\[java.lang.ClassNotFoundException])
46. [**](../../akka/util/ClassLoaderObjectInputStream.html#readShort():Short "Permalink")  def readShort(): [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
47. [**](../../akka/util/ClassLoaderObjectInputStream.html#readStreamHeader():Unit "Permalink")  def readStreamHeader(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[java.io] Definition ClassesObjectInputStreamAnnotations@throws(classOf\[java.io.IOException]) @throws(classOf\[java.io.StreamCorruptedException])
48. [**](../../akka/util/ClassLoaderObjectInputStream.html#readUTF():String "Permalink")  def readUTF(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
49. [**](../../akka/util/ClassLoaderObjectInputStream.html#readUnshared():Object "Permalink")  def readUnshared(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesObjectInputStreamAnnotations@throws(classOf\[java.io.IOException]) @throws(classOf\[java.lang.ClassNotFoundException])
50. [**](../../akka/util/ClassLoaderObjectInputStream.html#readUnsignedByte():Int "Permalink")  def readUnsignedByte(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
51. [**](../../akka/util/ClassLoaderObjectInputStream.html#readUnsignedShort():Int "Permalink")  def readUnsignedShort(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
52. [**](../../akka/util/ClassLoaderObjectInputStream.html#registerValidation(x$1:java.io.ObjectInputValidation,x$2:Int):Unit "Permalink")  def registerValidation(arg0: [ObjectInputValidation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectInputValidation.html#java.io.ObjectInputValidation), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesObjectInputStreamAnnotations@throws(classOf\[java.io.NotActiveException]) @throws(classOf\[java.io.InvalidObjectException])
53. [**](../../akka/util/ClassLoaderObjectInputStream.html#reset():Unit "Permalink")  def reset(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesInputStreamAnnotations@throws(classOf\[java.io.IOException])
54. [**](../../akka/util/ClassLoaderObjectInputStream.html#resolveClass(objectStreamClass:java.io.ObjectStreamClass):Class[_] "Permalink")  def resolveClass(objectStreamClass: [ObjectStreamClass](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectStreamClass.html#java.io.ObjectStreamClass)): Class\[\_]Attributesprotected Definition ClassesClassLoaderObjectInputStream → ObjectInputStream
55. [**](../../akka/util/ClassLoaderObjectInputStream.html#resolveObject(x$1:Object):Object "Permalink")  def resolveObject(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[java.io] Definition ClassesObjectInputStreamAnnotations@throws(classOf\[java.io.IOException])
56. [**](../../akka/util/ClassLoaderObjectInputStream.html#resolveProxyClass(x$1:Array[String]):Class[_] "Permalink")  def resolveProxyClass(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Attributesprotected\[java.io] Definition ClassesObjectInputStreamAnnotations@throws(classOf\[java.io.IOException]) @throws(classOf\[java.lang.ClassNotFoundException])
57. [**](../../akka/util/ClassLoaderObjectInputStream.html#setObjectInputFilter(x$1:java.io.ObjectInputFilter):Unit "Permalink") final  def setObjectInputFilter(arg0: [ObjectInputFilter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectInputFilter.html#java.io.ObjectInputFilter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesObjectInputStream
58. [**](../../akka/util/ClassLoaderObjectInputStream.html#skip(x$1:Long):Long "Permalink")  def skip(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition ClassesInputStreamAnnotations@throws(classOf\[java.io.IOException])
59. [**](../../akka/util/ClassLoaderObjectInputStream.html#skipBytes(x$1:Int):Int "Permalink")  def skipBytes(arg0: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException])
60. [**](../../akka/util/ClassLoaderObjectInputStream.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
61. [**](../../akka/util/ClassLoaderObjectInputStream.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
62. [**](../../akka/util/ClassLoaderObjectInputStream.html#transferTo(x$1:java.io.OutputStream):Long "Permalink")  def transferTo(arg0: [OutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition ClassesInputStreamAnnotations@throws(classOf\[java.io.IOException])
63. [**](../../akka/util/ClassLoaderObjectInputStream.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
64. [**](../../akka/util/ClassLoaderObjectInputStream.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
65. [**](../../akka/util/ClassLoaderObjectInputStream.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/ClassLoaderObjectInputStream.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/ClassLoaderObjectInputStream.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClassLoaderObjectInputStream toStringFormat\[ClassLoaderObjectInputStream] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/ClassLoaderObjectInputStream.html#readLine():String "Permalink")  def readLine(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesObjectInputStream → DataInputAnnotations@throws(classOf\[java.io.IOException]) @Deprecated Deprecated
4. [**](../../akka/util/ClassLoaderObjectInputStream.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClassLoaderObjectInputStream, B)ImplicitThis member is added by an implicit conversion from ClassLoaderObjectInputStream toArrowAssoc\[ClassLoaderObjectInputStream] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ObjectInputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectInputStream.html#java.io.ObjectInputStream)

### Inherited from [ObjectStreamConstants](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectStreamConstants.html#java.io.ObjectStreamConstants)

### Inherited from [ObjectInput](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectInput.html#java.io.ObjectInput)

### Inherited from [DataInput](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/DataInput.html#java.io.DataInput)

### Inherited from [InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)

### Inherited from [Closeable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Closeable.html#java.io.Closeable)

### Inherited from [AutoCloseable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/AutoCloseable.html#java.lang.AutoCloseable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClassLoaderObjectInputStream to any2stringadd\[ClassLoaderObjectInputStream]

### Inherited by implicit conversion StringFormat fromClassLoaderObjectInputStream to StringFormat\[ClassLoaderObjectInputStream]

### Inherited by implicit conversion Ensuring fromClassLoaderObjectInputStream to Ensuring\[ClassLoaderObjectInputStream]

### Inherited by implicit conversion ArrowAssoc fromClassLoaderObjectInputStream to ArrowAssoc\[ClassLoaderObjectInputStream]

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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/util/ClassLoaderObjectInputStream.html](https://doc.akka.io/api/akka-core/2.10.17/akka/util/ClassLoaderObjectInputStream.html)*