---
description: Akka 2.10.17 - akka.remote.testconductor.TestConductorExt.Settings
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testconductor/TestConductorExt$Settings$.html
title: Akka 2.10.17 - akka.remote.testconductor.TestConductorExt.Settings
---

# Akka 2.10.17 - akka.remote.testconductor.TestConductorExt.Settings

> **Summary:** Akka 2.10.17 - akka.remote.testconductor.TestConductorExt.Settings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/testconductor/TestConductorExt.html "Permalink")  class [TestConductorExt](TestConductorExt.html "This binds together the akka.remote.testconductor.Conductor and akka.remote.testconductor.Player roles inside an Akka akka.actor.Extension.") extends [Extension](../../actor/Extension.html) with [Conductor](Conductor.html) with [Player](Player.html)This binds together the [akka.remote.testconductor.Conductor](Conductor.html) and
[akka.remote.testconductor.Player](Player.html) roles inside an Akka
[akka.actor.Extension](../../actor/Extension.html).

This binds together the [akka.remote.testconductor.Conductor](Conductor.html) and
[akka.remote.testconductor.Player](Player.html) roles inside an Akka
[akka.actor.Extension](../../actor/Extension.html). Please follow the aforementioned links for
more information.

###### Note

This extension requires the `akka.actor.provider`
to be a akka.remote.RemoteActorRefProvider.

To use `blackhole`, `passThrough`, and `throttle` you must activate the
failure injector and throttler transport adapters by specifying `testTransport(on = true)`
in your MultiNodeConfig.

Definition Classes[testconductor](index.html)
- Settings
o[akka](../../index.html).[remote](../index.html).[testconductor](index.html).[TestConductorExt](TestConductorExt.html)

# Settings[**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html "Permalink")

### 

#### object Settings

Source[Extension.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-multi-node-testkit/src/main/scala/akka/remote/testconductor/Extension.scala#L58)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Settings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#BarrierTimeout:akka.util.Timeout "Permalink") implicit  val BarrierTimeout: [Timeout](../../util/Timeout.html)
5. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#ClientReconnects:Int "Permalink")  val ClientReconnects: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
6. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#ClientSocketWorkerPoolSize:Int "Permalink")  val ClientSocketWorkerPoolSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
7. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#ConnectTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val ConnectTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
8. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#PacketSplitThreshold:scala.concurrent.duration.FiniteDuration "Permalink")  val PacketSplitThreshold: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
9. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#QueryTimeout:akka.util.Timeout "Permalink") implicit  val QueryTimeout: [Timeout](../../util/Timeout.html)
10. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#ReconnectBackoff:scala.concurrent.duration.FiniteDuration "Permalink")  val ReconnectBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
11. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#ServerSocketWorkerPoolSize:Int "Permalink")  val ServerSocketWorkerPoolSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
12. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#config:com.typesafe.config.Config "Permalink")  val config: Config
15. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testconductor/TestConductorExt$Settings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/Player.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/TestConductorExt$Settings$.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka/current/akka/util/Timeout.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/testconductor/TestConductorExt$Settings$.html](https://doc.akka.io/api/akka/current/akka/remote/testconductor/TestConductorExt$Settings$.html)*