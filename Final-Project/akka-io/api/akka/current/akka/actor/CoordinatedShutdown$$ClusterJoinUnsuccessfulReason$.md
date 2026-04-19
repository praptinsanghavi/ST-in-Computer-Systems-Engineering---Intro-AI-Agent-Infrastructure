---
description: Akka 2.10.17 - akka.actor.CoordinatedShutdown.ClusterJoinUnsuccessfulReason
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:21:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html
title: Akka 2.10.17 - akka.actor.CoordinatedShutdown.ClusterJoinUnsuccessfulReason
---

# Akka 2.10.17 - akka.actor.CoordinatedShutdown.ClusterJoinUnsuccessfulReason

> **Summary:** Akka 2.10.17 - akka.actor.CoordinatedShutdown.ClusterJoinUnsuccessfulReason

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/CoordinatedShutdown$.html "Permalink")  object [CoordinatedShutdown](CoordinatedShutdown$.html) extends [ExtensionId](ExtensionId.html)\[[CoordinatedShutdown](CoordinatedShutdown.html)] with [ExtensionIdProvider](ExtensionIdProvider.html)Definition Classes[actor](index.html)
- [ActorSystemTerminateReason](CoordinatedShutdown$$ActorSystemTerminateReason$.html "Scala API: The shutdown was initiated by ActorSystem.terminate.")
- [ClusterDowningReason](CoordinatedShutdown$$ClusterDowningReason$.html "Scala API: The shutdown was initiated by Cluster downing.")
- ClusterJoinUnsuccessfulReason
- [ClusterLeavingReason](CoordinatedShutdown$$ClusterLeavingReason$.html "Scala API: The shutdown was initiated by Cluster leaving.")
- [IncompatibleConfigurationDetectedReason](CoordinatedShutdown$$IncompatibleConfigurationDetectedReason$.html "Scala API: The shutdown was initiated by a configuration clash within the existing cluster and the joining node")
- [JvmExitReason](CoordinatedShutdown$$JvmExitReason$.html "Scala API: The shutdown was initiated by a JVM shutdown hook, e.g.")
- [Reason](CoordinatedShutdown$$Reason.html "Reason for the shutdown, which can be used by tasks in case they need to do different things depending on what caused the shutdown.")
- [UnknownReason](CoordinatedShutdown$$UnknownReason$.html "Scala API: The reason for the shutdown was unknown.")
o[akka](../index.html).[actor](index.html).[CoordinatedShutdown](CoordinatedShutdown$.html)

# ClusterJoinUnsuccessfulReason[**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html "Permalink")

### 

#### case object ClusterJoinUnsuccessfulReason extends [Reason](CoordinatedShutdown$$Reason.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Scala API: The shutdown was initiated by a failure to join a seed node.

Source[CoordinatedShutdown.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/CoordinatedShutdown.scala#L152)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Reason](CoordinatedShutdown$$Reason.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterJoinUnsuccessfulReason
2. Serializable
3. Product
4. Equals
5. Reason
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
10. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
14. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
15. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Reason](CoordinatedShutdown$$Reason.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown$$ActorSystemTerminateReason$.html
- https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown$$ClusterDowningReason$.html
- https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html
- https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown$$ClusterLeavingReason$.html
- https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown$$IncompatibleConfigurationDetectedReason$.html
- https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown$$JvmExitReason$.html
- https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown$$Reason.html
- https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown$$UnknownReason$.html
- https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown$.html
- https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html](https://doc.akka.io/api/akka/current/akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html)*