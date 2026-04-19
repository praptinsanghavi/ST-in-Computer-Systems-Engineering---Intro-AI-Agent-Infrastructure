---
description: Akka 2.10.17 - akka.stream.snapshot.ConnectionSnapshot
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:00:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/snapshot/ConnectionSnapshot$.html
title: Akka 2.10.17 - akka.stream.snapshot.ConnectionSnapshot
---

# Akka 2.10.17 - akka.stream.snapshot.ConnectionSnapshot

> **Summary:** Akka 2.10.17 - akka.stream.snapshot.ConnectionSnapshot

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/snapshot/index.html "Permalink")  package [snapshot](index.html)Definition Classes[stream](../index.html)
- [ConnectionSnapshot](ConnectionSnapshot.html "Not for user extension")
- [HideImpl](HideImpl.html "INTERNAL API")
- [InterpreterSnapshot](InterpreterSnapshot.html "A snapshot of one interpreter - contains a set of logics running in the same underlying actor.")
- [LogicSnapshot](LogicSnapshot.html "Not for user extension")
- [MaterializerState](MaterializerState$.html "Debug utility to dump the running streams of a materializers in a structure describing the graph layout and \"waits-on\" relationships.")
- [RunningInterpreter](RunningInterpreter.html "A stream interpreter that is running/has been started")
- [StreamSnapshot](StreamSnapshot.html "A snapshot of one running stream")
- [UninitializedInterpreter](UninitializedInterpreter.html "A stream interpreter that was not yet initialized when the snapshot was taken")
[o](ConnectionSnapshot.html "See companion trait")[akka](../../index.html).[stream](../index.html).[snapshot](index.html)

# [ConnectionSnapshot](ConnectionSnapshot.html "See companion trait")[**](../../../akka/stream/snapshot/ConnectionSnapshot$.html "Permalink")

### Companion [trait ConnectionSnapshot](ConnectionSnapshot.html "See companion trait")

#### object ConnectionSnapshot

Source[MaterializerState.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/snapshot/MaterializerState.scala#L149)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConnectionSnapshot
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/stream/snapshot/ConnectionSnapshot$$ConnectionState.html "Permalink") sealed  trait [ConnectionState](ConnectionSnapshot$$ConnectionState.html "Not for user extension") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/stream/snapshot/ConnectionSnapshot$$Closed$.html "Permalink")  case object [Closed](ConnectionSnapshot$$Closed$.html) extends [ConnectionState](ConnectionSnapshot$$ConnectionState.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
20. [**](../../../akka/stream/snapshot/ConnectionSnapshot$$ShouldPull$.html "Permalink")  case object [ShouldPull](ConnectionSnapshot$$ShouldPull$.html) extends [ConnectionState](ConnectionSnapshot$$ConnectionState.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
21. [**](../../../akka/stream/snapshot/ConnectionSnapshot$$ShouldPush$.html "Permalink")  case object [ShouldPush](ConnectionSnapshot$$ShouldPush$.html) extends [ConnectionState](ConnectionSnapshot$$ConnectionState.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../../akka/stream/snapshot/ConnectionSnapshot$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/ConnectionSnapshot$$Closed$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/ConnectionSnapshot$$ConnectionState.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/ConnectionSnapshot$$ShouldPull$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/ConnectionSnapshot$$ShouldPush$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/ConnectionSnapshot$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/ConnectionSnapshot.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/HideImpl.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/InterpreterSnapshot.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/LogicSnapshot.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/MaterializerState$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/RunningInterpreter.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/StreamSnapshot.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/UninitializedInterpreter.html
- https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/ConnectionSnapshot$.html](https://doc.akka.io/api/akka/2.10/akka/stream/snapshot/ConnectionSnapshot$.html)*