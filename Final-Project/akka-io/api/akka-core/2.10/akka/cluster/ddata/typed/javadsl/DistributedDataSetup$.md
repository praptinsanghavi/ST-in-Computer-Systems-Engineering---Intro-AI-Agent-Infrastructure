---
description: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.DistributedDataSetup
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:58:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.DistributedDataSetup
---

# Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.DistributedDataSetup

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.DistributedDataSetup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[ddata](../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.")
- [DistributedDataSetup](DistributedDataSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the DistributedData extension.")
- [Replicator](Replicator$.html)
- [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "When interacting with the Replicator from an actor this class provides convenient methods that adapts the response messages to the requesting actor's message protocol.")
- [ReplicatorSettings](ReplicatorSettings$.html)
[o](DistributedDataSetup.html "See companion class")[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[javadsl](index.html)

# [DistributedDataSetup](DistributedDataSetup.html "See companion class")[**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html "Permalink")

### Companion [class DistributedDataSetup](DistributedDataSetup.html "See companion class")

#### object DistributedDataSetup

Source[DistributedData.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/javadsl/DistributedData.scala#L101)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DistributedDataSetup
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#apply[T<:akka.actor.typed.Extension](createExtension:akka.actor.typed.ActorSystem[_]=>akka.cluster.ddata.typed.javadsl.DistributedData):akka.cluster.ddata.typed.javadsl.DistributedDataSetup "Permalink")  def apply\[T \<: [Extension](../../../../actor/typed/Extension.html)](createExtension: ([ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_]) \=\> [DistributedData](DistributedData.html)): [DistributedDataSetup](DistributedDataSetup.html)
5. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/ReplicatorSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedDataSetup$.html)*