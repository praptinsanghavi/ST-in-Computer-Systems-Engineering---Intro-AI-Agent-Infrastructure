---
description: Akka 2.10.17 - akka.cluster.metrics.StandardMetrics.Cpu
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/StandardMetrics$$Cpu.html
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
- Cpu
- [HeapMemory](StandardMetrics$$HeapMemory.html "The amount of used and committed memory will always be <= max if max is defined.")
[c](StandardMetrics$$Cpu$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[metrics](index.html).[StandardMetrics](StandardMetrics$.html)

# [Cpu](StandardMetrics$$Cpu$.html "See companion object")[**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html "Permalink")

### Companion [object Cpu](StandardMetrics$$Cpu$.html "See companion object")

#### final  case class Cpu(address: [Address](../../actor/Address.html), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), systemLoadAverage: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], cpuCombined: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], cpuStolen: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], processors: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

address[akka.actor.Address](../../actor/Address.html) of the node the metrics are gathered at

timestampthe time of sampling, in milliseconds since midnight, January 1, 1970 UTC

systemLoadAverageOS\-specific average load on the CPUs in the system, for the past 1 minute,
 The system is possibly nearing a bottleneck if the system load average is nearing number of cpus/cores.

cpuCombinedcombined CPU sum of User \+ Sys \+ Nice \+ Wait, in percentage (\[0\.0 \- 1\.0]. This
 metric can describe the amount of time the CPU spent executing code during n\-interval and how
 much more it could theoretically.

cpuStolenstolen CPU time, in percentage (\[0\.0 \- 1\.0].

processorsthe number of available processors

Annotations@SerialVersionUID() Source[Metric.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/main/scala/akka/cluster/metrics/Metric.scala#L219)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Cpu
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
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

1. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#<init>(address:akka.actor.Address,timestamp:Long,systemLoadAverage:Option[Double],cpuCombined:Option[Double],cpuStolen:Option[Double],processors:Int):akka.cluster.metrics.StandardMetrics.Cpu "Permalink")  new Cpu(address: [Address](../../actor/Address.html), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), systemLoadAverage: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], cpuCombined: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], cpuStolen: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)], processors: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))address[akka.actor.Address](../../actor/Address.html) of the node the metrics are gathered at

timestampthe time of sampling, in milliseconds since midnight, January 1, 1970 UTC

systemLoadAverageOS\-specific average load on the CPUs in the system, for the past 1 minute,
 The system is possibly nearing a bottleneck if the system load average is nearing number of cpus/cores.

cpuCombinedcombined CPU sum of User \+ Sys \+ Nice \+ Wait, in percentage (\[0\.0 \- 1\.0]. This
 metric can describe the amount of time the CPU spent executing code during n\-interval and how
 much more it could theoretically.

cpuStolenstolen CPU time, in percentage (\[0\.0 \- 1\.0].

processorsthe number of available processors
### Value Members

1. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Cpu toany2stringadd\[Cpu] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Cpu, B)ImplicitThis member is added by an implicit conversion from Cpu toArrowAssoc\[Cpu] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#address:akka.actor.Address "Permalink")  val address: [Address](../../actor/Address.html)
7. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#cpuCombined:Option[Double] "Permalink")  val cpuCombined: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)]
10. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#cpuStolen:Option[Double] "Permalink")  val cpuStolen: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)]
11. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Cpu) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CpuImplicitThis member is added by an implicit conversion from Cpu toEnsuring\[Cpu] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Cpu) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CpuImplicitThis member is added by an implicit conversion from Cpu toEnsuring\[Cpu] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CpuImplicitThis member is added by an implicit conversion from Cpu toEnsuring\[Cpu] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CpuImplicitThis member is added by an implicit conversion from Cpu toEnsuring\[Cpu] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#processors:Int "Permalink")  val processors: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
22. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#systemLoadAverage:Option[Double] "Permalink")  val systemLoadAverage: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)]
25. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#timestamp:Long "Permalink")  val timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
26. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Cpu toStringFormat\[Cpu] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/metrics/StandardMetrics$$Cpu.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Cpu, B)ImplicitThis member is added by an implicit conversion from Cpu toArrowAssoc\[Cpu] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCpu to any2stringadd\[Cpu]

### Inherited by implicit conversion StringFormat fromCpu to StringFormat\[Cpu]

### Inherited by implicit conversion Ensuring fromCpu to Ensuring\[Cpu]

### Inherited by implicit conversion ArrowAssoc fromCpu to ArrowAssoc\[Cpu]

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
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$Cpu.html](https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$Cpu.html)*