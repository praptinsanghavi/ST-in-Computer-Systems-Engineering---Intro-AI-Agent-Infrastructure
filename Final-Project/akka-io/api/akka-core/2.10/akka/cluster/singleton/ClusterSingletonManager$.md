---
description: Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManager$.html
title: Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager
---

# Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager

> **Summary:** Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](index.html)Definition Classes[cluster](../index.html)
- [ClusterSingletonManager](ClusterSingletonManager.html "Manages singleton actor instance among all cluster nodes or a group of nodes tagged with a specific role.")
- [ClusterSingletonManagerIsStuck](ClusterSingletonManagerIsStuck.html "Thrown when a consistent state can't be determined within the defined retry limits.")
- [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)
- [ClusterSingletonMessage](ClusterSingletonMessage.html "Marker trait for remote messages with special serializer.")
- [ClusterSingletonProxy](ClusterSingletonProxy.html "The ClusterSingletonProxy works together with the akka.cluster.singleton.ClusterSingletonManager to provide a distributed proxy to the singleton actor.")
- [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html)
[o](ClusterSingletonManager.html "See companion class")[akka](../../index.html).[cluster](../index.html).[singleton](index.html)

# [ClusterSingletonManager](ClusterSingletonManager.html "See companion class")[**](../../../akka/cluster/singleton/ClusterSingletonManager$.html "Permalink")

### Companion [class ClusterSingletonManager](ClusterSingletonManager.html "See companion class")

#### object ClusterSingletonManager

Source[ClusterSingletonManager.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/scala/akka/cluster/singleton/ClusterSingletonManager.scala#L177)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSingletonManager
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$Data.html "Permalink") sealed  trait [Data](ClusterSingletonManager$$Data.html "INTERNAL API public due to the with FSM type parameters") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API
public due to the `with FSM` type parameters
2. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html "Permalink") sealed  trait [State](ClusterSingletonManager$$State.html "INTERNAL API public due to the with FSM type parameters") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API
public due to the `with FSM` type parameters
### Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#props(singletonProps:akka.actor.Props,terminationMessage:Any,settings:akka.cluster.singleton.ClusterSingletonManagerSettings):akka.actor.Props "Permalink")  def props(singletonProps: [Props](../../actor/Props.html), terminationMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), settings: [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)): [Props](../../actor/Props.html)Scala API: Factory method for `ClusterSingletonManager` [akka.actor.Props](../../actor/Props.html).
15. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$$Data.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$$State.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$.html)*