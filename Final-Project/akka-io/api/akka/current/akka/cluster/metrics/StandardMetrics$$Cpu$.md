---
description: Akka 2.10.17 - akka.cluster.metrics.StandardMetrics.Cpu
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/StandardMetrics$$Cpu$.html
title: Akka 2.10.17 - akka.cluster.metrics.StandardMetrics.Cpu
---

# Akka 2.10.17 - akka.cluster.metrics.StandardMetrics.Cpu

> **Summary:** Akka 2.10.17 - akka.cluster.metrics.StandardMetrics.Cpu

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/StandardMetrics$.html "Permalink")  object [StandardMetrics](StandardMetrics$.html "Definitions of the built-in standard metrics.")Definitions of the built\-in standard metrics.

Definitions of the built\-in standard metrics.

The following extractors and data structures makes it easy to consume the
[NodeMetrics](NodeMetrics.html) in for example load balancers.

Definition Classes[metrics](index.html)
- [Cpu](StandardMetrics$$Cpu.html)
- [HeapMemory](StandardMetrics$$HeapMemory.html "The amount of used and committed memory will always be <= max if max is defined.")
[o](StandardMetrics$$Cpu.html "See companion class")[akka](../../index.html).[cluster](../index.html).[metrics](index.html).[StandardMetrics](StandardMetrics$.html)

# [Cpu](StandardMetrics$$Cpu.html "See companion class")[**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html "Permalink")

### Companion [class Cpu](StandardMetrics$$Cpu.html "See companion class")

#### object Cpu extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[Metric.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/main/scala/akka/cluster/metrics/Metric.scala#L174)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Cpu
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#unapply(nodeMetrics:akka.cluster.metrics.NodeMetrics):Option[(akka.actor.Address,Long,Option[Double],Option[Double],Option[Double],Int)] "Permalink")  def unapply(nodeMetrics: [NodeMetrics](NodeMetrics.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[([Address](../../actor/Address.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))]Given a NodeMetrics it returns the Cpu data if the nodeMetrics contains
necessary cpu metrics.

Given a NodeMetrics it returns the Cpu data if the nodeMetrics contains
necessary cpu metrics.

returnsif possible a tuple matching the Cpu constructor parameters
17. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$Cpu$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$Cpu.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$HeapMemory$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$HeapMemory.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$Cpu$.html](https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$Cpu$.html)*