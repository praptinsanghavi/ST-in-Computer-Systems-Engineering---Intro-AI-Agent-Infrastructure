---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/TupleOps$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps

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
[o](TupleOps.html "See companion class")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[util](index.html)

# [TupleOps](TupleOps.html "See companion class")[**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html "Permalink")

### Companion [class TupleOps](TupleOps.html "See companion class")

#### object TupleOps

Source[TupleOps.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/util/TupleOps.scala#L26)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TupleOps
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$AppendOne.html "Permalink")  trait [AppendOne](TupleOps$$AppendOne.html)\[P, S] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$FoldLeft.html "Permalink")  trait [FoldLeft](TupleOps$$FoldLeft.html)\[In, T, Op] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html "Permalink")  trait [Join](TupleOps$$Join.html)\[P, S] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#JoinAux[P,S,O]=akka.http.scaladsl.server.util.TupleOps.Join[P,S]{typeOut=O} "Permalink")  type JoinAux\[P, S, O] \= [Join](TupleOps$$Join.html)\[P, S] { type Out \= O }
5. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$LowLevelJoinImplicits.html "Permalink") sealed abstract  class [LowLevelJoinImplicits](TupleOps$$LowLevelJoinImplicits.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#enhanceTuple[T](tuple:T)(implicitevidence$1:akka.http.scaladsl.server.util.Tuple[T]):akka.http.scaladsl.server.util.TupleOps[T] "Permalink") implicit  def enhanceTuple\[T](tuple: T)(implicit arg0: [Tuple](Tuple.html)\[T]): [TupleOps](TupleOps.html)\[T]
7. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$AppendOne$.html "Permalink")  object [AppendOne](TupleOps$$AppendOne$.html) extends TupleAppendOneInstances
21. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$FoldLeft$.html "Permalink")  object [FoldLeft](TupleOps$$FoldLeft$.html) extends TupleFoldInstances
22. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join$.html "Permalink")  object [Join](TupleOps$$Join$.html) extends [LowLevelJoinImplicits](TupleOps$$LowLevelJoinImplicits.html)
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$AppendOne$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$AppendOne.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$FoldLeft$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$FoldLeft.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$Join$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$Join.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$LowLevelJoinImplicits.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$.html)*