---
description: Akka 2.10.17 - akka.cluster.ddata.protobuf.OtherMessageComparator
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:40:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/protobuf/OtherMessageComparator$.html
title: Akka 2.10.17 - akka.cluster.ddata.protobuf.OtherMessageComparator
---

# Akka 2.10.17 - akka.cluster.ddata.protobuf.OtherMessageComparator

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.protobuf.OtherMessageComparator

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/ddata/protobuf/index.html "Permalink")  package [protobuf](index.html)Definition Classes[ddata](../index.html)
- [**](../../../../akka/cluster/ddata/protobuf/msg/index.html "Permalink")  package [msg](msg/index.html)Definition Classes[protobuf](index.html)
- [AbstractSerializationSupport](AbstractSerializationSupport.html "Java API")
- OtherMessageComparator
- [ReplicatedDataSerializer](ReplicatedDataSerializer.html "Protobuf serializer of ReplicatedData.")
- [ReplicatorMessageSerializer](ReplicatorMessageSerializer.html "Protobuf serializer of ReplicatorMessage messages.")
- [SerializationSupport](SerializationSupport.html "Some useful serialization helper methods.")
o[akka](../../../index.html).[cluster](../../index.html).[ddata](../index.html).[protobuf](index.html)

# OtherMessageComparator[**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html "Permalink")

### 

#### object OtherMessageComparator extends [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[OtherMessage]

Source[ReplicatedDataSerializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.scala#L985)Linear Supertypes[Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[OtherMessage], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. OtherMessageComparator
2. Comparator
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#compare(a:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage,b:akka.cluster.ddata.protobuf.msg.ReplicatorMessages.OtherMessage):Int "Permalink")  def compare(a: OtherMessage, b: OtherMessage): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesOtherMessageComparator → Comparator
7. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#reversed():java.util.Comparator[T] "Permalink")  def reversed(): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[OtherMessage]Definition ClassesComparator
16. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#thenComparing[U<:Comparable[_>:U]](x$1:java.util.function.Function[_>:T,_<:U]):java.util.Comparator[T] "Permalink")  def thenComparing\[U \<: [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[\_ \>: U \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]](arg0: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[\_ \>: OtherMessage \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), \_ \<: U]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[OtherMessage]Definition ClassesComparator
18. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#thenComparing[U](x$1:java.util.function.Function[_>:T,_<:U],x$2:java.util.Comparator[_>:U]):java.util.Comparator[T] "Permalink")  def thenComparing\[U \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[\_ \>: OtherMessage \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), \_ \<: U], arg1: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[\_ \>: U \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[OtherMessage]Definition ClassesComparator
19. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#thenComparing(x$1:java.util.Comparator[_>:T]):java.util.Comparator[T] "Permalink")  def thenComparing(arg0: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[\_ \>: OtherMessage \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[OtherMessage]Definition ClassesComparator
20. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#thenComparingDouble(x$1:java.util.function.ToDoubleFunction[_>:T]):java.util.Comparator[T] "Permalink")  def thenComparingDouble(arg0: [ToDoubleFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/ToDoubleFunction.html#java.util.function.ToDoubleFunction)\[\_ \>: OtherMessage \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[OtherMessage]Definition ClassesComparator
21. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#thenComparingInt(x$1:java.util.function.ToIntFunction[_>:T]):java.util.Comparator[T] "Permalink")  def thenComparingInt(arg0: [ToIntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/ToIntFunction.html#java.util.function.ToIntFunction)\[\_ \>: OtherMessage \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[OtherMessage]Definition ClassesComparator
22. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#thenComparingLong(x$1:java.util.function.ToLongFunction[_>:T]):java.util.Comparator[T] "Permalink")  def thenComparingLong(arg0: [ToLongFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/ToLongFunction.html#java.util.function.ToLongFunction)\[\_ \>: OtherMessage \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[OtherMessage]Definition ClassesComparator
23. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/ddata/protobuf/OtherMessageComparator$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[OtherMessage]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/AbstractSerializationSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/OtherMessageComparator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatedDataSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/SerializationSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/msg/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/OtherMessageComparator$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/protobuf/OtherMessageComparator$.html)*