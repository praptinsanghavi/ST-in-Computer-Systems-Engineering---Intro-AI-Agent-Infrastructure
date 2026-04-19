---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.ApplyConverter
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/ApplyConverter$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.ApplyConverter
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.ApplyConverter

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.ApplyConverter

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package [util](index.html)Definition Classes[server](../index.html)
- [ApplyConverter](ApplyConverter.html "ApplyConverter allows generic conversion of functions of type (T1, T2, ...) => Route to (TupleX(T1, T2, ...)) => Route.")
- [BinaryPolyFunc](BinaryPolyFunc.html "Allows the definition of binary poly-functions (e.g.")
- [ClassMagnet](ClassMagnet.html "A magnet that wraps a ClassTag")
- [ConstructFromTuple](ConstructFromTuple.html "Constructor for instances of type R which can be created from a tuple of type T.")
- [Tuple](Tuple.html "Phantom type providing implicit evidence that a given type is a Tuple or Unit.")
- [TupleOps](TupleOps.html)
- [Tupler](Tupler.html "Provides a way to convert a value into an Tuple.")
[o](ApplyConverter.html "See companion class")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[util](index.html)

# [ApplyConverter](ApplyConverter.html "See companion class")[**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html "Permalink")

### Companion [class ApplyConverter](ApplyConverter.html "See companion class")

#### object ApplyConverter extends ApplyConverterInstances

Source[ApplyConverter.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/util/ApplyConverter.scala#L18)Linear SupertypesApplyConverterInstances, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ApplyConverter
2. ApplyConverterInstances
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac1[T1]:akka.http.scaladsl.server.util.ApplyConverter[(T1,)]{typeIn=T1=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac1\[T1]: [ApplyConverter](ApplyConverter.html)\[(T1)] { type In \= T1 \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
10. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac10\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
11. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
12. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac12\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
13. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
14. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac14\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
15. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac15\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
16. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac16\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
17. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac17\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
18. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac18\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
19. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac19\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
20. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac2[T1,T2]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2)]{typeIn=(T1,T2)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac2\[T1, T2]: [ApplyConverter](ApplyConverter.html)\[(T1, T2)] { type In \= (T1, T2\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
21. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac20\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
22. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac21\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
23. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac22\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
24. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac3[T1,T2,T3]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3)]{typeIn=(T1,T2,T3)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac3\[T1, T2, T3]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3)] { type In \= (T1, T2, T3\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
25. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac4[T1,T2,T3,T4]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4)]{typeIn=(T1,T2,T3,T4)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac4\[T1, T2, T3, T4]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4)] { type In \= (T1, T2, T3, T4\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
26. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac5[T1,T2,T3,T4,T5]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5)]{typeIn=(T1,T2,T3,T4,T5)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac5\[T1, T2, T3, T4, T5]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5)] { type In \= (T1, T2, T3, T4, T5\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
27. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac6[T1,T2,T3,T4,T5,T6]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6)]{typeIn=(T1,T2,T3,T4,T5,T6)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac6\[T1, T2, T3, T4, T5, T6]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6)] { type In \= (T1, T2, T3, T4, T5, T6\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
28. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac7[T1,T2,T3,T4,T5,T6,T7]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7)]{typeIn=(T1,T2,T3,T4,T5,T6,T7)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac7\[T1, T2, T3, T4, T5, T6, T7]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7)] { type In \= (T1, T2, T3, T4, T5, T6, T7\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
29. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac8[T1,T2,T3,T4,T5,T6,T7,T8]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac8\[T1, T2, T3, T4, T5, T6, T7, T8]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
30. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hac9[T1,T2,T3,T4,T5,T6,T7,T8,T9]:akka.http.scaladsl.server.util.ApplyConverter[(T1,T2,T3,T4,T5,T6,T7,T8,T9)]{typeIn=(T1,T2,T3,T4,T5,T6,T7,T8,T9)=>akka.http.scaladsl.server.Route} "Permalink") implicit  def hac9\[T1, T2, T3, T4, T5, T6, T7, T8, T9]: [ApplyConverter](ApplyConverter.html)\[(T1, T2, T3, T4, T5, T6, T7, T8, T9)] { type In \= (T1, T2, T3, T4, T5, T6, T7, T8, T9\) \=\> akka.http.scaladsl.server.Route }Definition ClassesApplyConverterInstances
31. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
33. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
34. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
38. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
40. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from ApplyConverterInstances

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ClassMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ClassMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ConstructFromTuple$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ConstructFromTuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter$.html)*